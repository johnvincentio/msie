package org.apache.jsp.tutorial.portal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class stocks_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div align=\"center\"><font size=\"+1\"><b>\r\n<TABLE border=0 cellPadding=2 cellSpacing=0 width=190>\r\n  \r\n  <TR bgColor=#ffffff>\r\n    <TD class=spanhd colSpan=2>Stewart's Hot Stocks</TD>\r\n    <TD class=spanhd>&nbsp;</TD></TR>\r\n  <TR>\r\n    <TD class=hdleft>Symbol</TD>\r\n    <TD class=hdleft>Price</TD>\r\n    <TD class=hdleft>Change</TD></TR>\r\n  <TR>\r\n    <TD class=datagrey><U><FONT color=#003366>AOL</FONT></U></TD>\r\n    <TD class=datagrey>104.25</TD>\r\n    <TD class=datagrey><FONT color=#cc0000>5.00</FONT></TD></TR>\r\n  <TR>\r\n    <TD class=datagrey colSpan=3><IMG height=1 src=\"");
      out.print(request.getContextPath());
      out.write("/tutorial/images/id_line.gif\" \r\n      width=190></TD></TR>\r\n  <TR>\r\n    <TD class=datagrey><FONT color=#003366><U>CSCO</U></FONT></TD>\r\n    <TD class=datagrey>73.75</TD>\r\n    <TD class=datagrey><FONT color=#008800>1.75</FONT></TD></TR>\r\n  <TR>\r\n    <TD class=datagrey colSpan=3><IMG height=1 src=\"");
      out.print(request.getContextPath());
      out.write("/tutorial/images/id_line.gif\" \r\n      width=190></TD></TR>\r\n  <TR>\r\n    <TD class=datagrey><FONT color=#003366><U>HD</U></FONT></TD>\r\n    <TD class=datagrey>68.62</TD>\r\n    <TD class=datagrey><FONT color=#008800>1.69</FONT></TD></TR>\r\n  <TR>\r\n    <TD class=datagrey colSpan=3><IMG height=1 src=\"");
      out.print(request.getContextPath());
      out.write("/tutorial/images/id_line.gif\" \r\n      width=190></TD></TR>\r\n  <TR>\r\n  <TR>\r\n    <TD class=datagrey><FONT color=#003366><U>SONE</U></FONT></TD>\r\n    <TD class=datagrey>38.88</TD>\r\n    <TD class=datagrey><FONT color=#008800>1.62</FONT></TD></TR>\r\n  <TR>\r\n    <TD class=datagrey colSpan=3><IMG height=1 src=\"");
      out.print(request.getContextPath());
      out.write("/tutorial/images/id_line.gif\" \r\n      width=190></TD></TR>\r\n  <TR>\r\n    <TD class=datagrey><FONT color=#003366><U>DJIA</U></FONT></TD>\r\n    <TD class=datagrey>10,302.13</TD>\r\n    <TD class=datagrey><FONT color=#008800>47.80</FONT></TD></TR>\r\n  <TR>\r\n    <TD class=datagrey colSpan=3><IMG height=1 src=\"");
      out.print(request.getContextPath());
      out.write("/tutorial/images/id_line.gif\" \r\n      width=190></TD></TR>\r\n  <TR>\r\n    <TD class=inputgrey colSpan=3>\r\n\t  <FORM \r\n      action=\"#\" method=\"get\">Quote: \r\n      <INPUT maxLength=5 size=4>&nbsp;<A \r\n      href=\"#\"><IMG alt=\"Get Quote\" \r\n      border=0 height=17 src=\"");
      out.print(request.getContextPath());
      out.write("/tutorial/images/input_vrm_gen_get.gif\" title=\"Get Quote\" \r\n      width=59></A> <BR>&nbsp; <BR>\r\n      <CENTER><FONT size=-2>[&nbsp;</FONT><FONT color=#003366 size=-2><A \r\n      href=\"#\">Symbol&nbsp;Search</A></FONT><FONT \r\n      size=-2>&nbsp;]</FONT>&nbsp;<FONT size=-2>[&nbsp;</FONT><FONT \r\n      color=#003366 size=-2><U>Edit&nbsp;Portfolio</U></FONT><FONT \r\n      size=-2>&nbsp;]</FONT></CENTER><BR></TD></TR></TABLE>  </b></font></div>");
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
