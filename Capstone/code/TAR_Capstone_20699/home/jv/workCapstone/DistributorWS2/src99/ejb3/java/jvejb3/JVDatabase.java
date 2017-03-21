
/*
	JVDatabase.java; Handles all database related tasks.
					Connection pooling version.
*/

package jvejb3;

import jvcommon.*;

import java.util.*;
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

// addBarcodes; add Barcodes - uses PL/SQL

	public void addBarcodes (JVBarcodes barcodes) {
		JVBarcode barcode;
		Debug.println(">>> addBarcodes");
		try {
			makeConnection();
			StringBuffer buf = new StringBuffer();
			buf.append("begin WORKTMP_PKG.addNextWorktmp (?,?,?,?,?,?); end;");
			Debug.println("buf :"+buf+":");
			CallableStatement stmt = m_conn.prepareCall(buf.toString());
			Debug.println("survived prepareCall");

			Iterator iter = barcodes.getBarcodes();
			while (iter.hasNext()) {
				barcode = (JVBarcode) iter.next();
				stmt.setInt(1,barcode.getBarcodeid());
				stmt.setInt(2,barcode.getItemid());
				stmt.setString(3,barcode.getCompany());
				stmt.setString(4,barcode.getImageurl());
				stmt.setString(5,barcode.getName());
				stmt.setString(6,barcode.getDs());
				stmt.execute();
				Debug.println("survived execute");
			}
			makeCommit();
			Debug.println("before closeConnection()");
			closeConnection();
		}
		catch (SQLException ex) {
			showSQLError("addBarcodes error",ex);
			m_bIsConnected = false;
		}
		Debug.println("<<< addBarcodes");
	}
}

