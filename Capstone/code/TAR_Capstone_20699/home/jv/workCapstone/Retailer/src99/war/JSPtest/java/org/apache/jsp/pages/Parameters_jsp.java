package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class Parameters_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

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

      out.write('\n');
      out.write("\n\n\n\n<HR>\n<H1> Parameters </H1>\n<TABLE>\n<TR><TD BGCOLOR=AAAAAA ALIGN=CENTER>Parameter Name</TD>\n    <TD BGCOLOR=AAAAAA>Parameter Value</TD>\n</TR>\n\n");
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
