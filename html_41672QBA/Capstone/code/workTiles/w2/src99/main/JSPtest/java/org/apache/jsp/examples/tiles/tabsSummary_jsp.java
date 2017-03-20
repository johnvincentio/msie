package org.apache.jsp.examples.tiles;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tabsSummary_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div align=\"center\"><font size=\"+1\"><b>\r\n\r\n<TABLE border=\"0\" cellPadding=\"2\" cellSpacing=0 width=\"100%\" >\r\n  \r\n  <TR>\r\n    <TD class=spanhd>Tabs Layout</TD>\r\n  </TR>\r\n  <TR>\r\n    <TD class=\"datagrey\">\r\n\t<ul>\r\n\t  <li>You can easily build tabs by using predefined \"tabs layout\".</li>\r\n\t  <li>All you need to do is to specify which bodies you want to render in tabs.</li>\r\n\t  <li>You can also associate\r\n\t  name, icon and tooltip to tab index.</li>\r\n\t  <li>Using provided example, you can easily customize the tabs layout rendering.</li>\r\n\t</ul>\r\n\t</TD>\r\n  </TR>\r\n  <TR>\r\n    <td class=\"datalightblue\">\r\n\t<ul>\r\n\t  <li>Selected pages tabs\r\n      <BR><a href=\"");
      out.print(request.getContextPath());
      out.write("/examples/tabs.jsp\">Pages Tabs</a></li>\r\n\t  <li>View examples Summaries as tabs\r\n      <BR><a href=\"");
      out.print(request.getContextPath());
      out.write("/examples/summariesTabs.jsp\">Summaries Tabs</a></li>\r\n\t  <li></li>\r\n\t</ul>\r\n    </TD>\r\n  </TR>\r\n</table>\r\n</b></font></div>");
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
