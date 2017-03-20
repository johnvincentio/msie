package org.apache.jsp.pages.includes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MainMenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n<table>\n\t<tr>\n\t\t<th colspan=2>\n\t\t\t<div align=\"left\"><strong>Thames</strong></div>\n\t\t</th>\n\t</tr>\n\t<tr>\n\t\t<td width=\"10\" valign=\"top\" ></td>\n\t\t<td valign=\"top\"  >\n\t\t\t<font size=\"-1\">\n\t\t\t\t<html:link page=\"/Main.do\">Thames Home</html:link>\n\t\t\t</font>\n\t\t</td>\n\t</tr>\n</table>\n<br>\n\n<table>\n\t<tr>\n\t\t<th colspan=2>\n\t\t\t<div align=\"left\"><strong>Examples</strong></div>\n\t\t</th>\n\t</tr>\n\t<tr>\n\t\t<td width=\"10\" valign=\"top\" ></td>\n\t\t<td valign=\"top\"  >\n\t\t\t<font size=\"-1\">\n\t\t\t\t<html:link page=\"/pages/Main.jsp\">Home(URL)</html:link>\n\t\t\t</font>\n\t\t</td>\n\t</tr>\n\t<tr>\n\t\t<td width=\"10\" valign=\"top\" ></td>\n\t\t<td valign=\"top\"  >\n\t\t\t<font size=\"-1\">\n\t\t\t\t<html:link page=\"/Construction.do\">Under Construction</html:link>\n\t\t\t</font>\n\t\t</td>\n\t</tr>\n</table>\n<br>\n\n<table>\n\t<tr>\n\t\t<th colspan=2>\n\t\t\t<div align=\"left\"><strong>Testing Area</strong></div>\n\t\t</th>\n\t</tr>\n\t<tr>\n\t\t<td width=\"10\" valign=\"top\" ></td>\n\t\t<td valign=\"top\"  >\n\t\t\t<font size=\"-1\">\n\t\t\t\t<html:link page=\"/Tab1.do\">Tab 1 Test</html:link>\n\t\t\t</font>\n\t\t</td>\n\t</tr>\n\t<tr>\n\t\t<td width=\"10\" valign=\"top\" ></td>\n");
      out.write("\t\t<td valign=\"top\"  >\n\t\t\t<font size=\"-1\">\n\t\t\t\t<html:link page=\"/SessionBean1.do\">Session Bean 1 Test</html:link>\n\t\t\t</font>\n\t\t</td>\n\t</tr>\n\t<tr>\n\t\t<td width=\"10\" valign=\"top\" ></td>\n\t\t<td valign=\"top\"  >\n\t\t\t<font size=\"-1\">\n\t\t\t\t<html:link page=\"/ConverterBeanTest.do\">Converter Bean Test</html:link>\n\t\t\t</font>\n\t\t</td>\n\t</tr>\n\t<tr>\n\t\t<td width=\"10\" valign=\"top\" ></td>\n\t\t<td valign=\"top\"  >\n\t\t\t<font size=\"-1\">\n\t\t\t\t<html:link page=\"/Tab2.do?tabno=1\">Tab 2 Test</html:link>\n\t\t\t</font>\n\t\t</td>\n\t</tr>\n\t<tr>\n\t\t<td width=\"10\" valign=\"top\" ></td>\n\t\t<td valign=\"top\"  >\n\t\t\t<font size=\"-1\">\n\t\t\t\t<html:link page=\"/Tab2.do?tabno=2\">Tab 3 Test</html:link>\n\t\t\t</font>\n\t\t</td>\n\t</tr>\n\t<tr>\n\t\t<td width=\"10\" valign=\"top\" ></td>\n\t\t<td valign=\"top\"  >\n\t\t\t<font size=\"-1\">\n\t\t\t\t<html:link page=\"/Logon.do\">Logon</html:link>\n\t\t\t</font>\n\t\t</td>\n\t</tr>\n</table>\n<br>\n\n\n\n");
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
