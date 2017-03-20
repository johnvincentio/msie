
/*
	JVDatabase.java; Handles all database related tasks.

	More like abuse actually, but it is effective for now.
*/

package jvapp;

import java.sql.*;

public class JVDatabase {
	private Connection m_conn;
	private String m_strURL;
	private String m_strUser;
	private String m_strPwd;
	private boolean m_bIsConnected;

	public JVDatabase (String url, String user, String pwd) {
		m_strURL = url;
		m_strUser = user;
		m_strPwd = pwd;
		m_conn = null;
		m_bIsConnected = false;
	}

	private void makeConnection() throws SQLException {		// Connection
		Debug.println(">>> makeConnection");
		if (m_bIsConnected) return;
		m_conn = DriverManager.getConnection(m_strURL,m_strUser,m_strPwd);
		m_conn.setAutoCommit(false);
		m_bIsConnected = true;
		Debug.println("<<< makeConnection");
	}
	private void closeConnection() {			// Disconnect
		Debug.println(">>> closeConnection");
		try {
			if (m_bIsConnected) {
				m_conn.close();
				m_conn = null;
			}
		}
		catch (SQLException ex) {
			showSQLError("closeConnection error",ex);
		}
		m_bIsConnected = false;
		Debug.println("<<< closeConnection");
	}
	private void makeCommit() {			// Do a commit
		Debug.println(">>> makeCommit");
		try {
			if (m_bIsConnected) {
				m_conn.commit();
			}
		}
		catch (SQLException ex) {
			showSQLError("makeCommit error",ex);
			makeRollback();
		}
		Debug.println("<<< makeCommit");
	}
	private void makeRollback() {			// Do a rollback
		Debug.println(">>> makeRollback");
		try {
			if (m_bIsConnected) {
				m_conn.rollback();
			}
		}
		catch (SQLException ex) {
			showSQLError("makeRollback error",ex);
		}
		Debug.println("<<< makeRollback");
	}

// getUserid; return users.userid or -1 if user not found

	public int getUserid (String strUser, String strPassword) {
		Debug.println(">>> getUserid; user :"+strUser+": pwd :"+strPassword+":");
		int nReturn = -1;	// default to not found

		try {
			makeConnection();
			String strQuery = "select userid from users where email='"+strUser+
				"' and password='"+strPassword+"'";
			Debug.println("query :"+strQuery+":");
			Statement stmt = m_conn.createStatement();
			ResultSet rs = stmt.executeQuery(strQuery);
			while (rs.next()) {
				nReturn = rs.getInt(1);
			}
			closeConnection();
		}
		catch (SQLException ex) {
			showSQLError("getUserid error",ex);
			m_bIsConnected = false;
		}
		Debug.println("<<< getUserid; status "+nReturn);
		return nReturn;
	}

// getUserPassword; get password for a given username OR "" if user not found

	public String getUserPassword (String strUser) {
		Debug.println(">>> getUserPassword; user :"+strUser+":");
		String strReturn = "";	// default to not found

		try {
			makeConnection();
			String strQuery = "select password from users where email='"+strUser+"'";
			Debug.println("query :"+strQuery+":");
			Statement stmt = m_conn.createStatement();
			ResultSet rs = stmt.executeQuery(strQuery);
			while (rs.next()) {
				strReturn = rs.getString(1);
			}
			closeConnection();
		}
		catch (SQLException ex) {
			showSQLError("getUserPassword error",ex);
			m_bIsConnected = false;
		}
		Debug.println("<<< getUserPassword; password "+strReturn);
		return strReturn;
	}

// getUsercart; get items in cart for user index

	public JVCart getUserCart (int nUserid) {
		Debug.println(">>> getUserCart; userid "+nUserid);
		JVCart cart = new JVCart();
		try {
			makeConnection();
			StringBuffer buf = new StringBuffer();
			buf.append("select t.cartid, t.itemid, c.ds, i.sds, i.lds, t.quantity, i.price ");
			buf.append("from cart t, users u, catalog c, items i ");
			buf.append("where t.userid = ");
			buf.append(nUserid);
			buf.append(" and i.catalogid = c.catalogid ");
			buf.append(" and t.itemid = i.itemid and t.userid = u.userid");
			buf.append(" order by t.itemid");
			String strQuery = buf.toString();
			Debug.println("query :"+strQuery+":");
			Statement stmt = m_conn.createStatement();
			ResultSet rs = stmt.executeQuery(strQuery);
			while (rs.next()) {
				int nCartid = rs.getInt(1);
				int nItemid = rs.getInt(2);
				String strCatDs = rs.getString(3);
				String strSds = rs.getString(4);
				String strLds = rs.getString(5);
				int nQuantity = rs.getInt(6);
				double dPrice = rs.getDouble(7);
				Debug.println("before addItem");
				cart.addItem (
					new JVItem (nCartid, nItemid, strCatDs, strSds, strLds, 
									nQuantity, dPrice));
				Debug.println("survived addItem");
			}
			Debug.println("before closeConnection()");
			closeConnection();
		}
		catch (SQLException ex) {
			showSQLError("getUserCart error",ex);
			m_bIsConnected = false;
		}
		Debug.println("<<< getUserCart");
		return cart;
	}

// getCartItem; get a specific item from the cart

	public JVItem getCartItem (int nCartid) {
		Debug.println(">>> getCartItem; cartid "+nCartid);
		JVItem item = null;
		try {
			makeConnection();
			StringBuffer buf = new StringBuffer();
			buf.append("select t.itemid, c.ds, i.sds, i.lds, t.quantity, i.price ");
			buf.append("from cart t, users u, catalog c, items i ");
			buf.append("where t.cartid = ");
			buf.append(nCartid);
			buf.append(" and i.catalogid = c.catalogid ");
			buf.append(" and t.itemid = i.itemid and t.userid = u.userid");
			String strQuery = buf.toString();
			Debug.println("query :"+strQuery+":");
			Statement stmt = m_conn.createStatement();
			ResultSet rs = stmt.executeQuery(strQuery);
			while (rs.next()) {
				int nItemid = rs.getInt(1);
				String strCatDs = rs.getString(2);
				String strSds = rs.getString(3);
				String strLds = rs.getString(4);
				int nQuantity = rs.getInt(5);
				double dPrice = rs.getDouble(6);
				Debug.println("before new JVItem");
				item = new JVItem (nCartid, nItemid, strCatDs, strSds, strLds, 
									nQuantity, dPrice);
				Debug.println("survived new JVItem");
			}
			Debug.println("before closeConnection()");
			closeConnection();
		}
		catch (SQLException ex) {
			showSQLError("getCartItem error",ex);
			m_bIsConnected = false;
		}
		Debug.println("<<< getCartItem");
		return item;
	}

// removeCartItem; remove a specific item from the cart

	public void removeCartItem (int nCartid) {
		Debug.println(">>> removeCartItem; index "+nCartid);
		try {
			makeConnection();
			StringBuffer buf = new StringBuffer();
			buf.append("delete from cart where cartid=");
			buf.append(nCartid);
			String strUpdate = buf.toString();
			Debug.println("update :"+strUpdate+":");
			Statement stmt = m_conn.createStatement();
			stmt.executeUpdate(strUpdate);
			makeCommit();
			Debug.println("before closeConnection()");
			closeConnection();
		}
		catch (SQLException ex) {
			showSQLError("removeCartItem error",ex);
			m_bIsConnected = false;
		}
		Debug.println("<<< removeCartItem");
	}

// updateCartItem; update a specific item from the cart

	public void updateCartItem (int nCartid, int nQty) {
		Debug.println(">>> updateCartItem; cartid "+nCartid+" qty "+nQty);
		try {
			makeConnection();
			StringBuffer buf = new StringBuffer();
			buf.append("update cart set quantity=");
			buf.append(nQty);
			buf.append("  where cartid=");
			buf.append(nCartid);
			String strUpdate = buf.toString();
			Debug.println("update :"+strUpdate+":");
			Statement stmt = m_conn.createStatement();
			stmt.executeUpdate(strUpdate);
			makeCommit();
			Debug.println("before closeConnection()");
			closeConnection();
		}
		catch (SQLException ex) {
			showSQLError("updateCartItem error",ex);
			m_bIsConnected = false;
		}
		Debug.println("<<< updateCartItem");
	}

// addCartItem; add a specific item to the cart

	public void addCartItem (int nUserid, int nItemid, int nQty) {
		Debug.println(">>> addCartItem; userid "+nUserid+" itemid "+nItemid+" qty "+nQty);
		try {
			makeConnection();

			int nCartid = -1;
			int nQuantity = -1;
			StringBuffer buf = new StringBuffer();
			buf.append("select cartid, quantity from cart where userid=");
			buf.append(nUserid);
			buf.append(" and itemid=");
			buf.append(nItemid);
			String strQuery = buf.toString();
			Debug.println("query :"+strQuery+":");
			Statement stmt = m_conn.createStatement();
			ResultSet rs = stmt.executeQuery(strQuery);
			while (rs.next()) {
				nCartid = rs.getInt(1);
				nQuantity = rs.getInt(2);
			}

			if (nCartid < 0) {		// insert
				buf = new StringBuffer();
				buf.append("insert into cart (itemid,userid,quantity) values (");
				buf.append(nItemid); buf.append(",");
				buf.append(nUserid); buf.append(",");
				buf.append(nQty); buf.append(")");
			}
			else {
				nQuantity += nQty;
				buf = new StringBuffer();
				buf.append("update cart set quantity=");
				buf.append(nQuantity);
				buf.append("  where cartid=");
				buf.append(nCartid);
			}
			strQuery = buf.toString();
			Debug.println("Query :"+strQuery+":");
			stmt = m_conn.createStatement();
			stmt.executeUpdate(strQuery);
			makeCommit();
			Debug.println("before closeConnection()");
			closeConnection();
		}
		catch (SQLException ex) {
			showSQLError("addCartItem error",ex);
			m_bIsConnected = false;
		}
		Debug.println("<<< addCartItem");
	}

// getCatalogNames; get names of all catalogs

	public JVCatalogNames getCatalogNames () {
		Debug.println(">>> getCatalogNames");
		JVCatalogNames catalog = new JVCatalogNames();
		try {
			makeConnection();
			StringBuffer buf = new StringBuffer();
			buf.append("select catalogid, ds from catalog order by catalogid");
			String strQuery = buf.toString();
			Debug.println("query :"+strQuery+":");
			Statement stmt = m_conn.createStatement();
			ResultSet rs = stmt.executeQuery(strQuery);
			while (rs.next()) {
				int nCatalogid = rs.getInt(1);
				String strCatDs = rs.getString(2);
				Debug.println("before addItem");
				catalog.addItem (new JVCatalogName (nCatalogid, strCatDs));
				Debug.println("survived addItem");
			}
			Debug.println("before closeConnection()");
			closeConnection();
		}
		catch (SQLException ex) {
			showSQLError("getUserCart error",ex);
			m_bIsConnected = false;
		}
		Debug.println("<<< getCatalogNames");
		return catalog;
	}

// getCatalogItems; get items for a given catalog

	public JVCatalog getCatalogItems (int nCatalogId) {
		Debug.println(">>> getCatalogItems; id="+nCatalogId);
		JVCatalog catalog = new JVCatalog();
		try {
			makeConnection();
			StringBuffer buf = new StringBuffer();
			buf.append("select itemid,sds,lds,price from items");
			buf.append(" where catalogid=");
			buf.append(nCatalogId);
			buf.append(" order by itemid");
			String strQuery = buf.toString();
			Debug.println("query :"+strQuery+":");
			Statement stmt = m_conn.createStatement();
			ResultSet rs = stmt.executeQuery(strQuery);
			while (rs.next()) {
				int nItemid = rs.getInt(1);
				String strSds = rs.getString(2);
				String strLds = rs.getString(3);
				double dPrice = rs.getDouble(4);
				Debug.println("before addItem");
				catalog.addItem (new JVCatalogItem (nItemid,nCatalogId,strSds,strLds,dPrice));
				Debug.println("survived addItem");
			}
			Debug.println("before closeConnection()");
			closeConnection();
		}
		catch (SQLException ex) {
			showSQLError("getUserCart error",ex);
			m_bIsConnected = false;
		}
		Debug.println("<<< getCatalogItems");
		return catalog;
	}

// showSQLError; generic SQL Error handling

	private void showSQLError(String msg, SQLException ex) {
		Debug.println(msg);
		Debug.println("--- SQLException ---:");
		if (ex != null) {
			Debug.println("Message: "+ex.getMessage());
			Debug.println("SQL State: "+ex.getSQLState());
			Debug.println("Error Code: "+ex.getErrorCode());
		}
	}
}

