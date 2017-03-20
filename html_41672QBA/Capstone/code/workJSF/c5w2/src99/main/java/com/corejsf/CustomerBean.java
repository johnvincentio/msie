package com.corejsf;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.jsp.jstl.sql.Result;
import javax.servlet.jsp.jstl.sql.ResultSupport;
import javax.sql.DataSource;

public class CustomerBean {
	private static final String DATABASE = "jvservlet/DataSource";
	private Connection m_conn;
	private DataSource m_datasource;
   
   public void open() throws SQLException, NamingException {
      if (m_conn != null) return;
/*
      Context ctx = new InitialContext();
      DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/mydb");
      m_conn = ds.getConnection();   
*/
		InitialContext ic = new InitialContext();
		Context envCtx = (Context) ic.lookup("java:comp/env");
		String str1 = (String) envCtx.lookup(DATABASE);
		m_datasource = (DataSource) ic.lookup(str1);
		m_conn = m_datasource.getConnection();
		m_conn.setAutoCommit(false);
   }

   public Result getAll() throws SQLException, NamingException {
      try {
         open();
         Statement stmt = m_conn.createStatement();        
         ResultSet result = stmt.executeQuery("SELECT * FROM Customers");
         return ResultSupport.toResult(result);
      } finally {
         close();
      }
   }
   
   public void close() throws SQLException {
      if (m_conn == null) return;
      m_conn.close();
      m_conn = null;
   }  
}

