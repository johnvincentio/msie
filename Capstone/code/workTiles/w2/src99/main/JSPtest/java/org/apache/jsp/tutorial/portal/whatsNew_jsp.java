package org.apache.jsp.tutorial.portal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class whatsNew_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div align=\"center\"><font size=\"+1\"><b>\r\n<TABLE border=0 cellPadding=2 cellSpacing=0 width=190>\r\n  \r\n  <TR>\r\n    <TD class=spanhd>What's New</TD></TR>\r\n  <TR>\r\n    <TD class=datagrey><B>New Financial Calculators</B> <BR>Saving For A \r\n      College Education?\r\n\t  <BR>[&nbsp;<FONT color=#003366><U>More</U></FONT>&nbsp;]\r\n\t  <BR>&nbsp; <BR><B>Special Offer</B> \r\n      <BR>Get free real-time quotes for three months with a World Financial \r\n      brokerage account. [&nbsp;<FONT color=#003366><U>More</U></FONT>&nbsp;] \r\n      <BR>&nbsp; </TD></TR>\r\n  <TR>\r\n      <BR><IMG border=0 height=1 src=\"");
      out.print(request.getContextPath());
      out.write("/tutorial/images/clear.gif\" \r\nwidth=190></TD></TR></TABLE>  </b></font></div>");
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
