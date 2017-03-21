
/*
	JVDatabase.java; Handles all database related tasks.
					Connection pooling version.
*/

package jvejb2;

import jvcommon.*;

import java.sql.*;
import javax.sql.*;
import javax.naming.*;

public class JVDatabase {
	private Connection m_conn;
	private boolean m_bIsConnected;
	private static final String DATABASE = "dbservlet/DataSource";
	private DataSource m_datasource;

	public JVDatabase () {
		Debug.println("---JVDatabase constructor");
		m_conn = null;
		m_bIsConnected = false;
	}

	public void createDataSource() {
		Debug.println(">>> createDataSource");
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
		Debug.println("<<< createDataSource");
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

	public void removeDataSource() {
		Debug.println(">>> removeDataSource");
		closeConnection();
		m_datasource = null;
		Debug.println("<<< removeDataSource");
	}

	private void makeConnection() throws SQLException {		// Connection
		Debug.println(">>> makeConnection");
		if (m_bIsConnected) return;
		m_conn = m_datasource.getConnection();
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
			String strQuery = "select securityid from security where username='"
				+strUser+"' and password='"+strPassword+"'";
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
		Debug.println("<<< getUserid; Userid "+nReturn);
		return nReturn;
	}

// getUserRoles; get roles for user index

	public JVRoles getUserRoles (int nUserid) {
		Debug.println(">>> getUserRoles; userid "+nUserid);
		JVRoles roles = new JVRoles();
		try {
			makeConnection();
			StringBuffer buf = new StringBuffer();
			buf.append("select s.name, r.subsystemid, r.value");
			buf.append(" from subsystem s, role r, userrole ur");
			buf.append(" where s.subsystemid = r.subsystemid");
			buf.append(" and r.roleid = ur.roleid");
			buf.append(" and ur.usersid = ");
			buf.append(nUserid);
			buf.append(" order by r.subsystemid");
			String strQuery = buf.toString();
			Debug.println("query :"+strQuery+":");
			Statement stmt = m_conn.createStatement();
			ResultSet rs = stmt.executeQuery(strQuery);
			while (rs.next()) {
				String strName = rs.getString(1);
				int nSubsystemid = rs.getInt(2);
				int nValue = rs.getInt(3);
				Debug.println("before addRole");
				roles.addRole (
					new JVRole (strName, nSubsystemid, nValue));
				Debug.println("survived addRole");
			}
			Debug.println("before closeConnection()");
			closeConnection();
		}
		catch (SQLException ex) {
			showSQLError("getUserRoles error",ex);
			m_bIsConnected = false;
		}
		Debug.println("<<< getUserRoles");
		return roles;
	}

// getAlerts; get roles for user index

	public JVAlerts getAlerts (int nUserid) {
		Debug.println(">>> getAlerts; userid "+nUserid);
		JVAlerts alerts = new JVAlerts();
		try {
			makeConnection();
			StringBuffer buf = new StringBuffer();
			buf.append("select a.alertid, a.eventid, a.roleid,");
			buf.append(" a.alertlevel, a.alertnumber, a.description");
			buf.append(" from alert a, userrole ur");
			buf.append(" where a.roleid = ur.roleid and ur.usersid = ");
			buf.append(nUserid);
			buf.append(" order by a.alertid");
			String strQuery = buf.toString();
			Debug.println("query :"+strQuery+":");
			Statement stmt = m_conn.createStatement();
			ResultSet rs = stmt.executeQuery(strQuery);
			while (rs.next()) {
				int nAlertid = rs.getInt(1);
				int nEventid = rs.getInt(2);
				int nRoleid = rs.getInt(3);
				int nAlertlevel = rs.getInt(4);
				int nAlertnumber = rs.getInt(5);
				String strDs = rs.getString(6);
				Debug.println("before addAlert");
				alerts.addAlert (
					new JVAlert (nAlertid, nEventid, nRoleid, nAlertlevel,
							nAlertnumber, strDs));
				Debug.println("survived addAlert");
			}
			Debug.println("before closeConnection()");
			closeConnection();
		}
		catch (SQLException ex) {
			showSQLError("getAlerts error",ex);
			m_bIsConnected = false;
		}
		Debug.println("<<< getAlerts");
		return alerts;
	}

// getCollections; get collections

	public JVCollections getCollections() {
		Debug.println(">>> getCollections");
		JVCollections collections = new JVCollections();
		try {
			makeConnection();
			StringBuffer buf = new StringBuffer();
			buf.append("select collectionid, description");
			buf.append(" from collection order by collectionid");
			String strQuery = buf.toString();
			Debug.println("query :"+strQuery+":");
			Statement stmt = m_conn.createStatement();
			ResultSet rs = stmt.executeQuery(strQuery);
			while (rs.next()) {
				int nCollectionid = rs.getInt(1);
				String strDs = rs.getString(2);
				Debug.println("before addCollections");
				collections.addCollection (
					new JVCollection (nCollectionid, strDs));
				Debug.println("survived addCollection");
			}
			Debug.println("before closeConnection()");
			closeConnection();
		}
		catch (SQLException ex) {
			showSQLError("getCollections error",ex);
			m_bIsConnected = false;
		}
		Debug.println("<<< getCollections");
		return collections;
	}

// getCollections; get collections

	public JVCollections getCollections(int nId) {
		Debug.println(">>> getCollections; nId "+nId);
		JVCollections collections = new JVCollections();
		try {
			makeConnection();
			StringBuffer buf = new StringBuffer();
			buf.append("select collectionid, description");
			buf.append(" from collection where collectionid = ");
			buf.append(nId);
			String strQuery = buf.toString();
			Debug.println("query :"+strQuery+":");
			Statement stmt = m_conn.createStatement();
			ResultSet rs = stmt.executeQuery(strQuery);
			while (rs.next()) {
				int nCollectionid = rs.getInt(1);
				String strDs = rs.getString(2);
				Debug.println("before addCollections");
				collections.addCollection (
					new JVCollection (nCollectionid, strDs));
				Debug.println("survived addCollection");
			}
			Debug.println("before closeConnection()");
			closeConnection();
		}
		catch (SQLException ex) {
			showSQLError("getCollections error",ex);
			m_bIsConnected = false;
		}
		Debug.println("<<< getCollections");
		return collections;
	}

// getBarcodes; get barcodes for collection id

	public JVBarcodes getBarcodes (int nId) {
		Debug.println(">>> getBarcodes; collectionid "+nId);
		JVBarcodes barcodes = new JVBarcodes();
		try {
			makeConnection();
			StringBuffer buf = new StringBuffer();
			buf.append("select b.barcodeid, b.itemid, s.companyname,");
			buf.append(" b.imageurl, i.name, i.description");
			buf.append(" from barcode b, collectionlist cl,");
			buf.append(" item i, supplier s");
			buf.append(" where cl.barcodeid = b.barcodeid");
			buf.append(" and b.itemid = i.itemid");
			buf.append(" and b.supplierid = s.supplierid");
			buf.append(" and cl.collectionid = ");
			buf.append(nId);
			buf.append(" order by b.barcodeid");
			String strQuery = buf.toString();
			Debug.println("query :"+strQuery+":");
			Statement stmt = m_conn.createStatement();
			ResultSet rs = stmt.executeQuery(strQuery);
			while (rs.next()) {
				int nBarcodeid = rs.getInt(1);
				int nItemid = rs.getInt(2);
				String strCompany = rs.getString(3);
				String strImageurl = rs.getString(4);
				String strName = rs.getString(5);
				String strDs = rs.getString(6);
				Debug.println("before addBarcode");
				barcodes.addBarcode (
					new JVBarcode (nBarcodeid, nItemid, strCompany, strImageurl,
							strName, strDs));
				Debug.println("survived addBarcode");
			}
			Debug.println("before closeConnection()");
			closeConnection();
		}
		catch (SQLException ex) {
			showSQLError("getBarcodes error",ex);
			m_bIsConnected = false;
		}
		Debug.println("<<< getBarcodes");
		return barcodes;
	}

// getCharacteristics; get barcodes for collection id

	public JVCharacteristics getCharacteristics (int nId) {
		Debug.println(">>> getCharacteristics; itemid "+nId);
		JVCharacteristics characteristics = null;
		try {
			makeConnection();
			StringBuffer buf = new StringBuffer();
			buf.append("select name, description from item where itemid = ");
			buf.append(nId);
			String strQuery = buf.toString();
			Debug.println("query :"+strQuery+":");
			Statement stmt = m_conn.createStatement();
			ResultSet rs = stmt.executeQuery(strQuery);
			while (rs.next()) {
				String strName = rs.getString(1);
				String strDs = rs.getString(2);
				characteristics = new JVCharacteristics(nId, strName, strDs);
			}

			buf = new StringBuffer();
			buf.append("select c.name, o.name, o.value");
			buf.append(" from category c, options o, characteristic ch");
			buf.append(" where c.categoryid = o.categoryid");
			buf.append(" and ch.optionsid = o.optionsid");
			buf.append(" and ch.itemid = ");
			buf.append(nId);
			buf.append(" order by c.name, o.value");
			strQuery = buf.toString();
			Debug.println("query :"+strQuery+":");
			stmt = m_conn.createStatement();
			rs = stmt.executeQuery(strQuery);
			while (rs.next()) {
				String strCatname = rs.getString(1);
				String strOptname = rs.getString(2);
				String strOptvalue = rs.getString(3);
				characteristics.addCharacteristic (
					new JVCharacteristic (strCatname, strOptname, strOptvalue));
			}
			Debug.println("before closeConnection()");
			closeConnection();
		}
		catch (SQLException ex) {
			showSQLError("getCharacteristics error",ex);
			m_bIsConnected = false;
		}
		Debug.println("<<< getCharacteristics");
		return characteristics;
	}

// getUserPassword; get password for a given username OR "" if user not found

/*
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
*/

// getUsercart; get items in cart for user index

/*
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
*/

// getCartItem; get a specific item from the cart

/*
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
*/

// removeCartItem; remove a specific item from the cart

/*
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
*/

// updateCartItem; update a specific item from the cart

/*
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
*/

// addCartItem; add a specific item to the cart

/*
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
*/

// getCatalogNames; get names of all catalogs

/*
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
*/

// getCatalogItems; get items for a given catalog

/*
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
*/

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

