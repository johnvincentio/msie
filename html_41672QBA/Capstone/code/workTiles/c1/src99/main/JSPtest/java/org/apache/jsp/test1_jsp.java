package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jvapp.Debug;
import java.util.*;

public final class test1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/pages/Parameters.jsp");
  }

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n\n<html>\n\n<head>\n<title>testing jsp:include</title>\n</head>\n\n<body>\nbefore jsp_include\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/jv1.jsp", out, false);
      out.write("\nafter jsp_include\n<br>\n\n");

	String selectedName="/jv2.jsp";

      out.write("\n(1) before jsp_include\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, selectedName, out, false);
      out.write("\n(1) after jsp_include\n<br>\n\n");

	String jvName=request.getParameter("jvtest");
	Debug.println("jvName :"+jvName+":");

      out.write("\n(2) before jsp_include\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, jvName, out, false);
      out.write("\n(2) after jsp_include\n<br>\n\n\n</body>\n\n");
      out.write("\n\n\n\n\n<HR>\n<H1> Parameters </H1>\n<TABLE>\n<TR><TD BGCOLOR=AAAAAA ALIGN=CENTER>Parameter Name</TD>\n    <TD BGCOLOR=AAAAAA>Parameter Value</TD>\n</TR>\n\n");
 Enumeration itr1 = request.getParameterNames();
	while (itr1.hasMoreElements()) {
		String pName = (String) itr1.nextElement();
		String pValue = request.getParameter(pName); 
      out.write("\n\t\t<TR><TD BGCOLOR=DDDDDD>");
      out.print(pName);
      out.write("</TD>\n\t\t<TD BGCOLOR=DDDDDD>");
      out.print(pValue);
      out.write("</TD>\n\t\t</TR>\n");
 } 
      out.write("\t\t\n</TABLE>\n\n<HR>\n\n<H1> Attributes </H1>\n<TABLE>\n<TR><TD BGCOLOR=AAAAAA ALIGN=CENTER>Attribute Name</TD>\n</TR>\n\n");
 Enumeration itr2 = request.getAttributeNames();
	while (itr2.hasMoreElements()) {
		String pName = (String) itr2.nextElement(); 
      out.write("\n\t\t<TR><TD BGCOLOR=DDDDDD>");
      out.print(pName);
      out.write("</TD>\n\t\t</TR>\n");
 } 
      out.write("\t\t\n</TABLE>\n\n<HR>\n\n");
      out.write("\n\n</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
