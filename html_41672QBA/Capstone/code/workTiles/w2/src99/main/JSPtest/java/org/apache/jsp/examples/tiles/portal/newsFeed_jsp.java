package org.apache.jsp.examples.tiles.portal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newsFeed_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div align=\"center\"><font size=\"+1\"><b>\r\n<TABLE border=0 cellPadding=2 cellSpacing=0 width=300>\r\n  \r\n  <TR>\r\n    <TD class=spanhd colSpan=2>News Feed</TD></TR>\r\n  <TR>\r\n    <TD class=data><B>Business News</B> </TD></TR>\r\n  <TR>\r\n    <TD class=data> \r\n      <LI><FONT color=#003366><U>Top Fund Managers Make Their Calls On \r\n      Funds</U></FONT></LI></TD></TR>\r\n  <TR>\r\n    <TD class=data><B>World News</B></TD></TR>\r\n  <TR>\r\n    <TD class=data>\r\n      <LI><FONT color=#003366><U>China Democracy Crackdown</U></FONT> \r\n      <LI><FONT color=#003366><U>Pope Visits The U.S. In \r\n    May</U></FONT></LI></TD></TR>\r\n  <TR>\r\n    <TD class=data><B>General News</B></TD></TR>\r\n  <TR>\r\n    <TD class=data>\r\n      <LI><FONT color=#003366><U>Clinton Polls in Question As To \r\n      Accuracy</U></FONT> \r\n      <LI><FONT color=#003366><U>School Violence Erupts And Safety Questions Are \r\n      Raised</U></FONT></LI></TD></TR>\r\n  <TR>\r\n    <TD class=data><B>Sports</B></TD></TR>\r\n  <TR>\r\n    <TD class=data>\r\n      <LI><FONT color=#003366><U>Winners And Losers - NFL Season \r\n");
      out.write("      Wrap-Up</U></FONT> \r\n      <LI><FONT color=#003366><U>Ski Finals On The Wire For The Alpine \r\n      Championships</U></FONT></LI></TD></TR>\r\n  <TR>\r\n    <TD class=data><B>Health</B></TD></TR>\r\n  <TR>\r\n    <TD class=data>\r\n      <LI><FONT color=#003366><U>Tea - A Cup of Comfort</U></FONT> \r\n      <LI><FONT color=#003366><U>Relieve Stress The Natural Way: 10 Health \r\n      Tips</U></FONT> </LI></TD></TR>\r\n</TABLE>  </b></font></div>");
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
