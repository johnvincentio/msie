
package jvapp;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class JVListener implements ServletContextListener {

	public void contextInitialized (ServletContextEvent evt) {
		Debug.setFile("/tmp/jv.txt",false);
		Debug.println("---init()");

		boolean bError = false;
		ServletContext ctx = evt.getServletContext();

		JVSetup jvsetup = JVSetup.getInstance();
		jvsetup.setSmtphost(ctx.getInitParameter("Smtphost"));
		jvsetup.setMessagefrom(ctx.getInitParameter("Messagefrom"));
		jvsetup.setFromuser(ctx.getInitParameter("Fromuser"));
		jvsetup.setFrompwd(ctx.getInitParameter("Frompwd"));
		jvsetup.setDriver(ctx.getInitParameter("Driver"));
		jvsetup.setUrl(ctx.getInitParameter("Url"));
		jvsetup.setUser(ctx.getInitParameter("User"));
		jvsetup.setPwd(ctx.getInitParameter("Password"));

		try {
			Debug.println("Load Database Driver");
			try {
				Class.forName(jvsetup.getDriver());
			} catch (java.lang.ClassNotFoundException e) {
				Debug.println("--- ClassNotFoundException ---:");
				Debug.println(e.getMessage());
				bError = true;
			}
		}
		catch (Exception ex) {
			Debug.println("--- Exception ---:");
			Debug.println(ex.getMessage());
			bError = true;
		}
		jvsetup.setError (bError);
	}

	public void contextDestroyed (ServletContextEvent evt) {
		Debug.println("--contextDestroyed()");
	}

}
