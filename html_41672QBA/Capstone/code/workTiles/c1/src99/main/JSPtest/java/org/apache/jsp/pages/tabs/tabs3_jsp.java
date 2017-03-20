package org.apache.jsp.pages.tabs;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tabs3_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<style type=\"text/css\">\nBODY\t{ margin: 0px; }\nFORM    { margin: 0px; }\n.normal\t{ font-family: Arial, Helvetica, Sans-Serif; font-size: 8pt; text-align: justify; }\n.genstr { font-family: Arial, Helvetica, Sans-Serif; font-size: 8pt; font-weight: bold; }\n.advert { font-family: Arial, Helvetica, Sans-Serif; font-size: 7.5pt; text-align: justify; }\n.submit { font-family: Arial, Helvetica, Sans-Serif; font-size: 8pt; text-align: center; }\n.larger\t{ font-family: Arial, Helvetica, Sans-Serif; font-size: 10pt; }\n</style>\n\n<table  width=\"100%\">\n<tr>\n<th bgcolor=\"aqua\"><font size=\"+1\"><strong>Thames Tab3</strong></font></th></tr>\n<tr>\n<td>\n\n<div align=\"center\">\n<center>\n<font class=\"larger\">\n<i>\"Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...\"</i>\n<br />\n</font>\n</center>\n</div>\n\n<ul>\n<div id=\"lipsum\" class=\"normal\">\n<p>\n<li>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</li>\n<li>Integer in libero nec elit consectetuer posuere.</li>\n<li>Nullam id nulla posuere ante venenatis porttitor.</li>\n");
      out.write("<li>Vestibulum cursus pellentesque risus.</li>\n<li>Cras vestibulum neque a augue.</li>\n<li>Aenean tempus augue id enim.</li>\n</p>\n</ul>\n\n</td></tr>\n</table>\n\n\n");
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
