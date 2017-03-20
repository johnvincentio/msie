package org.apache.jsp.pages.includes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Features_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<style type=\"text/css\">\r\nBODY\t{ margin: 0px; }\r\nFORM    { margin: 0px; }\r\n.normal\t{ font-family: Arial, Helvetica, Sans-Serif; font-size: 8pt; text-align: justify; }\r\n.genstr { font-family: Arial, Helvetica, Sans-Serif; font-size: 8pt; font-weight: bold; }\r\n.advert { font-family: Arial, Helvetica, Sans-Serif; font-size: 7.5pt; text-align: justify; }\r\n.submit { font-family: Arial, Helvetica, Sans-Serif; font-size: 8pt; text-align: center; }\r\n.larger\t{ font-family: Arial, Helvetica, Sans-Serif; font-size: 10pt; }\r\n</style>\r\n\r\n<table  width=\"100%\">\r\n<tr>\r\n<th bgcolor=\"aqua\"><font size=\"+1\"><strong>Services</strong></font></th></tr>\r\n<tr>\r\n<td>\r\n\r\n<div align=\"center\">\r\n<center>\r\n<font class=\"larger\">\r\n<i>\"Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...\"</i>\r\n<br />\r\n</font>\r\n</center>\r\n</div>\r\n\r\n<ul>\r\n<div id=\"lipsum\" class=\"normal\">\r\n<p>\r\n<li>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</li>\r\n<li>Integer in libero nec elit consectetuer posuere.</li>\r\n<li>Nullam id nulla posuere ante venenatis porttitor.</li>\r\n");
      out.write("<li>Vestibulum cursus pellentesque risus.</li>\r\n<li>Cras vestibulum neque a augue.</li>\r\n<li>Aenean tempus augue id enim.</li>\r\n</p>\r\n</ul>\r\n\r\n</td></tr>\r\n</table>\r\n\r\n\r\n\r\n");
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
