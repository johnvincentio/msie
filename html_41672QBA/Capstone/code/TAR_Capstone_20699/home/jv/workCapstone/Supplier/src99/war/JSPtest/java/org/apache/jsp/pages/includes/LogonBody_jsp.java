package org.apache.jsp.pages.includes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LogonBody_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n<center>\n<h1><bean:message key=\"logon.title\"/></h1>\n<html:errors/>\n\n<html:form action=\"/LogonSubmit\" focus=\"username\">\n\n<table border=\"0\">\n<tr>\n\t<th bgcolor=AAAAAA align=\"right\">\n\t\t<bean:message key=\"logon.username\"/></th>\n\t<td align=\"left\"><html:text property=\"username\"/></td>\n</tr>\n<tr>\n\t<th bgcolor=AAAAAA align=\"right\">\n\t\t<bean:message key=\"logon.password\"/></th>\n\t<td align=\"left\"><html:password property=\"password\"/></td>\n</tr>\n</table>\n\n<p>\n<html:submit><bean:message key=\"logon.submit\"/></html:submit>\n<html:reset><bean:message key=\"logon.reset\"/></html:reset>\n</p>\n\n</html:form>\n\n</center>\n\n");
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
