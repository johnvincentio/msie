package com.corejsf;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class UserBean {
   private String name;
   private String password;
   private boolean loggedIn;
   private Logger logger = Logger.getLogger("com.corejsf");

   public String getName() { return name; }
   public void setName(String newValue) { name = newValue; }

   public String getPassword() { return password; }
   public void setPassword(String newValue) { password = newValue; }

   public String login() {
      try {
         doLogin();
      }
      catch (SQLException ex) {
         logger.log(Level.SEVERE, "loginAction", ex);
         return "internalError";
      }
      catch (NamingException ex) {
         logger.log(Level.SEVERE, "loginAction", ex);
         return "internalError";
      }
      if (loggedIn)
         return "loginSuccess";
      else 
         return "loginFailure";
   }

   public String logout() { 
      loggedIn = false;
      return "login";
   }

   public void doLogin() throws SQLException, NamingException {  
      Context ctx = new InitialContext();
      if (ctx == null) throw new NamingException("No initial context");
      
      DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/mydb");
      if (ds == null) throw new NamingException("No data source");

      Connection conn = ds.getConnection();
      if (conn == null) throw new SQLException("No connection");

      try {
         PreparedStatement passwordQuery = conn.prepareStatement(
            "SELECT password from Users WHERE username = ?");

         passwordQuery.setString(1, name);
         
         ResultSet result = passwordQuery.executeQuery();

         if (!result.next()) return;
         String storedPassword = result.getString("password");                
         loggedIn = password.equals(storedPassword.trim());
      }
      finally {      
         conn.close();
      }
   }
}
