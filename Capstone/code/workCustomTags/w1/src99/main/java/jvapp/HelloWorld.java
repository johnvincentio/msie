package jvapp;

import javax.servlet.*;
import javax.servlet.http.*;

public class HelloWorld extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, java.io.IOException {
		response.setContentType("text/html");
		response.getWriter().println("Hello World (your session id: "+
			request.getSession().getId()+ ")");
	}
}

