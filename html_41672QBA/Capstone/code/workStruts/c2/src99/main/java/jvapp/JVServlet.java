
package jvapp;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class JVServlet extends HttpServlet {

	public void doProcess(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
	}

	public void destroy() {
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
}

