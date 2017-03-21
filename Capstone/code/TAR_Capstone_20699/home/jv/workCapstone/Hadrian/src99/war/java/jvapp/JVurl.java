package jvapp;

import jvdebug.*;

import java.util.*;
import javax.servlet.http.HttpServletRequest;

public class JVurl {
	private HttpServletRequest m_req;

	public JVurl (HttpServletRequest req) {
		m_req = req;
	}

	public String getURL (String strTarget) {
		Debug.println (">>> getURL; target :"+strTarget+":");

		String strName = m_req.getServerName();
		Debug.println("servername :"+strName+":");

		int port = m_req.getServerPort();
		Debug.println("serverPort :"+port+":");
		String strPort = Integer.toString(port);
		Debug.println("serverPort :"+strPort+":");

		String strPath = m_req.getContextPath();
		Debug.println("contextpath :"+strPath+":");

		String strReturn = "http://" + strName + ":" +
			strPort + strPath + strTarget;

		Debug.println("<<< getURL; string :"+strReturn+":");
		return strReturn;
	}
}

