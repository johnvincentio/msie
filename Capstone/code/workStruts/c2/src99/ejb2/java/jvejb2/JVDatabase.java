
/*
	JVDatabase.java; Handles all database related tasks.

	More like abuse actually, but it is effective for now.
*/

package jvejb2;

import jvapp.*;

import java.util.*;
import java.sql.*;
import javax.sql.*;
import javax.naming.*;

public class JVDatabase {
	private Connection m_conn;
	private static final String DATABASE = "dbservlet/DataSource";
	private DataSource m_datasource;

	public JVDatabase () {
		Debug.setFile("/tmp/jv1.txt",false);
		m_conn = null;
	}

	private void makeConnection() throws SQLException {		// Connection
		Debug.println(">>> makeConnection");
		makeDataSource();
		m_conn = m_datasource.getConnection();
		m_conn.setAutoCommit(false);
		Debug.println("<<< makeConnection");
	}
	private void closeConnection() {			// Disconnect
		Debug.println(">>> closeConnection");
		try {
			m_conn.close();
			m_conn = null;
		}
		catch (SQLException ex) {
			showSQLError("closeConnection error",ex);
		}
		Debug.println("<<< closeConnection");
	}
	private void makeDataSource() {
		Debug.println(">>> makeDataSource");
/*
		testJNDI ("jdbc/JVServletDB", 0);
		testJNDI (DATABASE, 1);
		testJNDI ("jdbc/jdbc/JVServletDB", 0);
		testJNDI ("jdbc/JVServletDB", 0);
		testJNDI ("JVServletDB", 0);
		testJNDI ("jdbc/jdbc/JVServletDB", 1);
		testJNDI ("jdbc/JVServletDB", 1);
		testJNDI ("JVServletDB", 1);

		testJNDI ("jvservlet", 0);
		testJNDI ("jdbc/jvservlet", 0);
		testJNDI ("jdbc/jdbc/jvservlet", 0);
		testJNDI ("jdbc/jdbc/jdbc/jvservlet", 0);
		testJNDI ("jvservlet", 1);
		testJNDI ("jdbc/jvservlet", 1);
		testJNDI ("jdbc/jdbc/jvservlet", 1);
		testJNDI ("jdbc/jdbc/jdbc/jvservlet", 1);

		testJNDI ("java:comp/env/jdbc/JVServletDB",0);
		testJNDI ("java:comp/env/jdbc/JVServletDB",1);
*/

		try {
			InitialContext ic = new InitialContext();
			Context envCtx = (Context) ic.lookup("java:comp/env");
			String str1 = (String) envCtx.lookup(DATABASE);
			m_datasource = (DataSource) ic.lookup(str1);
		}
		catch (Exception ex) {
			Debug.println("Exception "+ex.getMessage());
		}
		Debug.println("<<< makeDataSource");
	}

// useful for when JNDI lookups are not working

	private void testJNDI (String jndiName, int cont) {
		DataSource lds;
		String str1;
		Debug.println(">>> testJNDI; "+jndiName+" context "+cont);
		try {
			InitialContext ic = new InitialContext();
			Debug.println("stage 1");
			if (cont == 0) {
				lds = (DataSource) ic.lookup(jndiName);
				Debug.println("stage 1a - All OK");
			}
			else {
				Context envCtx = (Context) ic.lookup("java:comp/env");
				Debug.println("stage 2");
				str1 = (String) envCtx.lookup(jndiName);
				Debug.println("stage 3");
				Debug.println("lookup :"+str1+":");
				Debug.println("stage 4 - All OK");
			}
		}
		catch (Exception ex) {
			Debug.println("Exception "+ex.getMessage());
		}
		Debug.println("<<< testJNDI");
	}

	private void makeCommit() {			// Do a commit
		Debug.println(">>> makeCommit");
		try {
			m_conn.commit();
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
			m_conn.rollback();
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
		}
		Debug.println("<<< getUserPassword; password "+strReturn);
		return strReturn;
	}

// getUsercart; get items in cart for user index

	public Collection getUserCart (int nUserid) {
		Debug.println(">>> getUserCart; userid "+nUserid);
		Collection collection = new ArrayList();
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
			collection.add(cart);
			Debug.println("before closeConnection()");
			closeConnection();
		}
		catch (SQLException ex) {
			showSQLError("getUserCart error",ex);
		}
		Debug.println("<<< getUserCart");
		return collection;
	}

// getCartItem; get a specific item from the cart

	public Collection getCartItem (int nCartid) {
		Debug.println(">>> getCartItem; cartid "+nCartid);
		Collection collection = new ArrayList();
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
			collection.add(item);
			Debug.println("before closeConnection()");
			closeConnection();
		}
		catch (SQLException ex) {
			showSQLError("getCartItem error",ex);
		}
		Debug.println("<<< getCartItem");
		return collection;
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
		}
		Debug.println("<<< addCartItem");
	}

// getCatalogNames; get names of all catalogs

	public Collection getCatalogNames () {
		Debug.println(">>> getCatalogNames");
		Collection collection = new ArrayList();
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
			collection.add(catalog);
			Debug.println("before closeConnection()");
			closeConnection();
		}
		catch (SQLException ex) {
			showSQLError("getUserCart error",ex);
		}
		Debug.println("<<< getCatalogNames");
		return collection;
	}

// getCatalogItems; get items for a given catalog

	public Collection getCatalogItems (int nCatalogId) {
		Debug.println(">>> getCatalogItems; id="+nCatalogId);
		Collection collection = new ArrayList();
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
			collection.add(catalog);
			Debug.println("before closeConnection()");
			closeConnection();
		}
		catch (SQLException ex) {
			showSQLError("getUserCart error",ex);
		}
		Debug.println("<<< getCatalogItems");
		return collection;
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

