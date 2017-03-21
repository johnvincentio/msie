
package jvapp;

import jvcommon.Debug;

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
		jvsetup.setError (bError);
	}

	public void contextDestroyed (ServletContextEvent evt) {
		Debug.println("--contextDestroyed()");
	}

}
