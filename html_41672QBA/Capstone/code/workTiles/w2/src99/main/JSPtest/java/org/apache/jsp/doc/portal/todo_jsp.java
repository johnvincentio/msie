package org.apache.jsp.doc.portal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class todo_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<table  width=\"100%\">\r\n<tr>\r\n<th bgcolor=\"aqua\" colSpan=2><font size=\"+1\"><strong>To \r\n  Do</STRONG></FONT></TH></TR>\r\n  <TR>\r\n    <TD colSpan=2><FONT size=2><STRONG>Components Configuration \r\n      File</STRONG></FONT></TD></TR>\r\n  <TR>\r\n    <TD>\r\n      <UL>\r\n        <LI><FONT size=2>Add the \r\n        ability to have attribute value in tag body. This is already the case in \r\n        JSP pages, but not in Configuration file.</FONT> </LI></UL></TD>\r\n  <TR>\r\n    <TD colSpan=2><FONT size=2><STRONG>Reload</STRONG></FONT></TD></TR>\r\n  <TR>\r\n    <TD colSpan=2>\r\n      <UL>\r\n        <LI><FONT size=2>Be able to \r\n        reload definitions descriptions without restarting web container. This \r\n        can easily be done with an administration \r\n  page.</FONT></LI></UL></TD></TR></TABLE>");
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
