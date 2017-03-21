package org.apache.jsp.examples.tiles;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class myMenuSummary_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/struts-tiles.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tiles_insert_name_flush;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_tiles_insert_name_flush = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_tiles_insert_name_flush.release();
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

      out.write("\r\n\r\n<div align=\"center\"><font size=\"+1\"><b>\r\n\r\n<TABLE border=\"0\" cellPadding=\"2\" cellSpacing=0 width=\"100%\" >\r\n  \r\n  <TR>\r\n    <TD class=spanhd>User Customized Menu <br>(my Menu)</TD>\r\n  </TR>\r\n  <TR>\r\n    <TD class=\"datagrey\">\r\n\t<ul>\r\n\t  <li>It is possible to allow user to customize its own menu.</li>\r\n\t  <li>User menu settings are stored in user session as a list of menu entries.</li>\r\n\t  <li>The same layout as other menus is used, but the list is provided by an associated\r\n\t  \"controller\".</li>\r\n\t  <li>You also need to provide a page allowing user to choose and arrange its own menu entries.</li>\r\n\t  <li>You can use provided example, or improve it to meet your need.</li>\r\n\t</ul>\r\n\t</TD>\r\n  </TR>\r\n  <TR>\r\n    <td class=\"datalightblue\" >\r\n\t<ul>\r\n\t  <li>Edit user menu entries :\r\n        <BR><a href=\"");
      out.print(request.getContextPath());
      out.write("/examples/myMenuSettings.jsp\">my Menu</a></li>\r\n\t  <li>Actual user menu :\r\n        <BR>");
      if (_jspx_meth_tiles_insert_0(_jspx_page_context))
        return;
      out.write("</li>\r\n\t</ul>\r\n   </TD>\r\n  </TR>\r\n\r\n</TABLE>\r\n\r\n</b></font></div>\r\n");
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

  private boolean _jspx_meth_tiles_insert_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insert
    org.apache.struts.taglib.tiles.InsertTag _jspx_th_tiles_insert_0 = (org.apache.struts.taglib.tiles.InsertTag) _jspx_tagPool_tiles_insert_name_flush.get(org.apache.struts.taglib.tiles.InsertTag.class);
    _jspx_th_tiles_insert_0.setPageContext(_jspx_page_context);
    _jspx_th_tiles_insert_0.setParent(null);
    _jspx_th_tiles_insert_0.setName("examples.userMenu");
    _jspx_th_tiles_insert_0.setFlush(true);
    int _jspx_eval_tiles_insert_0 = _jspx_th_tiles_insert_0.doStartTag();
    if (_jspx_th_tiles_insert_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_insert_name_flush.reuse(_jspx_th_tiles_insert_0);
    return false;
  }
}
