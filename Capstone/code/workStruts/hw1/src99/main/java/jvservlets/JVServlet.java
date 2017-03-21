
package jvservlets;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

import jvutils.*;
import jvdata.*;
import jvbean.*;
import jvmail.SendMail;

public class JVServlet extends HttpServlet {
	private String m_strURL;	// oracle
	private String m_strUser;
	private String m_strPwd;
	private String m_strSmtphost;	// email
	private String m_strMessagefrom;
	private String m_strFromuser;
	private String m_strFrompwd;
	private boolean m_bError;
	private SendMail m_sendMail;

	public void doProcess(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
		Debug.println(">>> doProcess()");
//		showParams (req);
		JVParameters jvparams = new JVParameters(req.getParameterMap());
		jvparams.showParams("all params");
		int nActionValue = jvparams.getKeyValue("JVACTION",50);
		Debug.println("nActionValue "+nActionValue);

		HttpSession session = req.getSession();
		App app = (App) session.getAttribute("app");
		if (app == null) {
			app = new App(m_sendMail, m_strURL, m_strUser, m_strPwd);
			session.setAttribute("app",app);
		}
		String strForwardURL;
		try {
			switch (nActionValue) {
				case 50:		// from none, thus Login
					app.doLogin(req);
					break;
				case 100:		// from Login, thus check login
					app.doCheckLogin(req, jvparams);
					break;
				case 110:		// from Login, New User to Register
					app.doRegister(req, jvparams);
					break;
				case 170:		// from Register, check OK
					app.doCheckRegister(req, jvparams);
					break;
				case 200:		// View Catalog Names
					app.doCatalogNames(req, jvparams);
					break;
				case 210:		// View a Named Catalog
					app.doCatalog(req, jvparams);
					break;
				case 240:		// An Item to Cart
					app.doAddCartItem(req, jvparams);
					break;
				case 300:		// View Cart
					app.doCart(req, jvparams);
					break;
				case 320:		// Remove from Cart
					app.doRemoveFromCart(req, jvparams);
					break;
				case 350:		// Update Cart Item
					app.doUpdateCartItem(req, jvparams);
					break;
				case 400:		// View Checkout
					app.doViewCheckout(req, jvparams);
					break;
				case 450:		// Logout
					app.doLogout(req);
					break;
				case 0:			// general no use
				default:
					app.doError(req,"General Error",
						"Error has been found. Please try your request later");
					break;
			}
			strForwardURL = app.getForwardURL();
			app.showStatus("before forwarding");
		}
		catch (Exception ex) {
			strForwardURL = "Fatal.jsp";
		}
		RequestDispatcher dp = req.getRequestDispatcher(strForwardURL);
		dp.forward (req,resp);
		Debug.println("<<< doProcess()");
	}

	public void init() {
		m_bError = false;
		try {
			Debug.setFile("/tmp/jv.txt",false);
			Debug.println("---init()");
/*	from SendMail.java; this fails here too - Security Manager issue
			Debug.println("*** before System.getProperties()");
	        Properties tmpprops = System.getProperties(); // Get properties object
			Debug.println("*** after System.getProperties()");
*/

/*  does not work on WebLogic
			String path = getServletContext().getRealPath("app.properties");
			JVProperties props = new JVProperties(path);
			m_strSmtphost = props.getSmtpHost();	// setup email system
			m_strMessagefrom = props.getMessagefrom();
			m_strFromuser = props.getFromuser();
			m_strFrompwd = props.getFrompwd();
			Debug.println("Load Email System");
			m_sendMail = new SendMail (m_strSmtphost, "", m_strMessagefrom,
							m_strFromuser, m_strFrompwd);

			m_strURL = props.getURL();		// setup Oracle database
			m_strUser = props.getUser();
			m_strPwd = props.getPassword();
*/

			m_strSmtphost = getServletContext().getInitParameter("Smtphost");
			m_strMessagefrom = getServletContext().getInitParameter("Messagefrom");
			m_strFromuser = getServletContext().getInitParameter("Fromuser");
			m_strFrompwd = getServletContext().getInitParameter("Frompwd");
			Debug.println("Load Email System");
			m_sendMail = new SendMail (m_strSmtphost, "", m_strMessagefrom,
							m_strFromuser, m_strFrompwd);

			m_strURL = getServletContext().getInitParameter("Url");
			m_strUser = getServletContext().getInitParameter("User");
			m_strPwd = getServletContext().getInitParameter("Password");

			Debug.println("Load Database Driver");
			try {
				Class.forName(getServletContext().getInitParameter("Driver"));
			} catch (java.lang.ClassNotFoundException e) {
				Debug.println("--- ClassNotFoundException ---:");
				Debug.println(e.getMessage());
				m_bError = true;
			}
		}
		catch (Exception ex) {
			Debug.println("--- Exception ---:");
			Debug.println(ex.getMessage());
			m_bError = true;
		}
	}
	public void destroy() {
		Debug.println("---destroy()");
	}

	public void doGet(HttpServletRequest req,
		HttpServletResponse resp)
			throws ServletException, IOException {
		doProcess(req, resp);
	}
	public void doPost(HttpServletRequest req,
		HttpServletResponse resp)
			throws ServletException, IOException {
		doProcess(req, resp);
	}
/*
	private void showParams (HttpServletRequest req) {
		Debug.println (">>> showParams");
		Enumeration paramNames = req.getParameterNames();
		while (paramNames.hasMoreElements()) {
			String paramName = (String)paramNames.nextElement();
			Debug.println("Parameter :"+paramName+":");
			String[] paramValues = req.getParameterValues(paramName);
			if (paramValues.length == 1) {
				String paramValue = paramValues[0];
				if (paramValue.length() == 0)
					Debug.println(" no value");
				else
					Debug.println(" value :"+paramValue+":");
			}
			else {
				for(int i=0; i<paramValues.length; i++)
					Debug.println(" value :"+paramValues[i]+":");
			}
		}
		Debug.println ("<<< showParams");
	}
*/
}

