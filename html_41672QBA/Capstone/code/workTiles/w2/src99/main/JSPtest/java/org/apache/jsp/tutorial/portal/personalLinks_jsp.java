package org.apache.jsp.tutorial.portal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class personalLinks_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div align=\"center\"><font size=\"+1\"><b>\r\n<TABLE border=0 cellPadding=2 cellSpacing=0 width=190>\r\n  \r\n  <TR>\r\n    <TD class=spanhd>My Personal Links</TD></TR>\r\n  <TR>\r\n    <TD class=datagrey> \r\n      <LI><FONT color=#003366><U>Free Edgar</U></FONT> \r\n      <LI><FONT color=#003366><U>Raging Bull</U></FONT> \r\n      <LI><FONT color=#003366><U>The Motley Fool</U></FONT> \r\n      <LI><FONT color=#003366><U>The Street.com</U></FONT> <BR>&nbsp;</LI></TD></TR>\r\n  <TR>\r\n    <TD class=datagrey><IMG border=0 height=1 src=\"");
      out.print(request.getContextPath());
      out.write("/tutorial/images/clear.gif\" \r\n    width=190></TD></TR></TABLE>  </b></font></div>");
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
