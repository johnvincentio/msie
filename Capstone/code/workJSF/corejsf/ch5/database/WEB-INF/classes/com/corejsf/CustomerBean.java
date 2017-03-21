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
   private Connection conn;
   
   public void open() throws SQLException, NamingException {
      if (conn != null) return;
      Context ctx = new InitialContext();
      DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/mydb");
      conn = ds.getConnection();   
   }
   
   public Result getAll() throws SQLException, NamingException {
      try {
         open();
         Statement stmt = conn.createStatement();        
         ResultSet result = stmt.executeQuery("SELECT * FROM Customers");
         return ResultSupport.toResult(result);
      } finally {
         close();
      }
   }
   
   public void close() throws SQLException {
      if (conn == null) return;
      conn.close();
      conn = null;
   }  
}
