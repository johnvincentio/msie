package com.corejsf;

public class UserBean {
   private String name;
   private String password;

   // PROPERTY: name
   public String getName() { return name; }
   public void setName(String newValue) { name = newValue; }

   // PROPERTY: password
   public String getPassword() { return password.substring(0); }
   public void setPassword(String newValue) { password = newValue; }
}
