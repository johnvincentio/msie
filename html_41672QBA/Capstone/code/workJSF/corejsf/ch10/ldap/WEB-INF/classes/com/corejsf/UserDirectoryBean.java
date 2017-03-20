package com.corejsf;

import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

public class UserDirectoryBean {
   private String url;
   private String managerDN;
   private String managerPW;

   public void setManagerDN(String newValue) { managerDN = newValue; }
   public void setManagerPassword(String newValue) { 
      managerPW = newValue; }
   public void setURL(String newValue) { url = newValue; }

   public DirContext getRootContext() throws NamingException {
      Hashtable env = new Hashtable();
      env.put(Context.SECURITY_PRINCIPAL, managerDN);
      env.put(Context.SECURITY_CREDENTIALS, managerPW);
      DirContext initial = new InitialDirContext(env);

      Object obj = initial.lookup(url);
      if (!(obj instanceof DirContext))
         throw new NamingException("No directory context");
      return (DirContext) obj;
   }
}
