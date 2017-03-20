package com.corejsf;

public class UserBean {
   private String name;
   private String password;
   private String aboutYourself;
   
   // PROPERTY: name
   public String getName() { return name; } 
   public void setName(String newValue) { name = newValue; }
   
   // PROPERTY: password
   public String getPassword() { return password; }
   public void setPassword(String newValue) { password = newValue; }
   
   // PROPERTY: aboutYourself
   public String getAboutYourself() { return aboutYourself; }
   public void setAboutYourself(String newValue) { aboutYourself = newValue; }
}
