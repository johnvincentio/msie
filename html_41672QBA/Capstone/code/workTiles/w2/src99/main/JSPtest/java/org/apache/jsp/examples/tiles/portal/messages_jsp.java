package org.apache.jsp.examples.tiles.portal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class messages_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<DIV align=center><STRONG><FONT size=4>\r\n<TABLE border=0 cellPadding=2 cellSpacing=0 width=300>\r\n  \r\n  <TR>\r\n    <TD class=spanhd><B>Messages</B></TD></TR>\r\n  <TR>\r\n    <TD class=data>\r\n      <LI><FONT color=#003366><U>Your CD matures in one month!</U></FONT> \r\n      <LI><FONT color=#003366><U>Now Providing a Technology Mutual Fund</U></FONT> \r\n      <LI><FONT color=#003366><U>Children's Savings Account Program \r\n      Update</U></FONT> \r\n      <LI><FONT color=#003366><U>Small Business Program Offer</U></FONT> \r\n      <LI><FONT color=#003366><U>Financial Tip of the Day</U></FONT> \r\n      <LI><FONT color=#003366><U>Mortgage Rate Chart - See how we \r\n      compare!</U></FONT> \r\n      <LI><FONT color=#003366><U>Check out our 1-year and 6-month CD \r\n      rates</U></FONT> \r\n      <LI><FONT color=#003366><U>Auto Insurance Rates Lowered</U></FONT> \r\n      <BR>&nbsp;</LI></TD></TR></TABLE></FONT></STRONG></DIV>");
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
