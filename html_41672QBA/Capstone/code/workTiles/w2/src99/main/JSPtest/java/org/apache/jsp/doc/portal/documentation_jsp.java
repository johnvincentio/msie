package org.apache.jsp.doc.portal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class documentation_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<table  width=\"100%\">\r\n<tr>\r\n<th bgColor=#00ffff ><font size=\"+1\"><strong>Documentation</strong></font></th>\r\n</tr>\r\n  <TR>\r\n    <TD><div align=\"center\"><A href=\"");
      out.print(request.getContextPath());
      out.write("/doc/installation.jsp\"><FONT \r\n      size=2>Installation / Requirements</FONT>  \r\n      </A></div></TD></TR>\r\n  <TR>\r\n    <TD><A href=\"http://www.lifl.fr/~dumoulin/tiles/tilesAdvancedFeatures.pdf\"><P align=center><FONT \r\n    size=2>tilesAdvancedFeatures.pdf (draft)</FONT></A></P></TD></TR>\r\n  <TR>\r\n    <TD><A href=\"");
      out.print(request.getContextPath());
      out.write("/doc/tutorial.jsp\"><P align=center><FONT \r\n    size=2>Tutorial</FONT></A></P></TD></TR>\r\n  <TR>\r\n    <TD><div align=\"center\"><A href=\"");
      out.print(request.getContextPath());
      out.write("/api/index.html\"><FONT \r\n      size=2>API</FONT></A></div></TD></TR>\r\n  <TR>\r\n    <TD><A href=\"http://www.manning.com/husted/index.html\"><P align=center><FONT \r\n    size=2>Struts in Action (book)</FONT></A></P></TD></TR>\r\n  <TR>\r\n    <TD><A href=\"http://www-106.ibm.com/developerworks/java/library/j-strutstiles/?loc=j\"><P align=center><FONT \r\n    size=2>Struts and Tiles aid component-based development (article)</FONT></A></P></TD></TR>\r\n  <TR>\r\n    <TD><A href=\"http://www.javaworld.com/javaworld/jw-01-2002/jw-0104-tilestrut.html\"><P align=center><FONT \r\n    size=2> UI design with Tiles and Struts (article)</FONT></A></P></TD></TR>\r\n  <TR>\r\n    <TD><A href=\"http://www.amazon.com/exec/obidos/ASIN/0596003285/ref%3Dpd%5Fsims%5Fdp%5F%5F1/002-2697389-7971238\"><P align=center><FONT \r\n    size=2>Programming Jakarta Struts by Chuck Cavaness (book)</FONT></A></P></TD></TR>\r\n</table>\r\n");
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
