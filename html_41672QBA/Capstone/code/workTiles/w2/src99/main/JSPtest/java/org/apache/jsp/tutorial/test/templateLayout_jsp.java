package org.apache.jsp.tutorial.test;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class templateLayout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(2);
    _jspx_dependants.add("/WEB-INF/struts-tiles.tld");
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tiles_get_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tiles_insert_name_flush;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_tiles_get_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_tiles_insert_name_flush = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_tiles_get_name.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n<html>\r\n<head>\r\n    <title>");
      if (_jspx_meth_tiles_get_0(_jspx_page_context))
        return;
      out.write("</title>\r\n</head>\r\n\r\n<body>\r\n<TABLE width=\"100%\">\r\n  \r\n  <TR>\r\n    <TD colspan=\"2\">");
      if (_jspx_meth_tiles_get_1(_jspx_page_context))
        return;
      out.write("</TD></TR>\r\n  <TR>\r\n    <TD width=\"120\">");
      if (_jspx_meth_tiles_get_2(_jspx_page_context))
        return;
      out.write("</TD>\r\n    <TD>\r\n\t  **");
      if (_jspx_meth_tiles_insert_0(_jspx_page_context))
        return;
      out.write("**\r\n\t</TD></TR>\r\n  <TR>\r\n    <TD colspan=\"2\">");
      if (_jspx_meth_tiles_get_3(_jspx_page_context))
        return;
      out.write("</TD>\r\n  </TR>\r\n</TABLE>\r\n\r\n</body>\r\n</html>\r\n");
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

  private boolean _jspx_meth_tiles_get_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:get
    org.apache.struts.taglib.tiles.GetTag _jspx_th_tiles_get_0 = (org.apache.struts.taglib.tiles.GetTag) _jspx_tagPool_tiles_get_name.get(org.apache.struts.taglib.tiles.GetTag.class);
    _jspx_th_tiles_get_0.setPageContext(_jspx_page_context);
    _jspx_th_tiles_get_0.setParent(null);
    _jspx_th_tiles_get_0.setName("title");
    int _jspx_eval_tiles_get_0 = _jspx_th_tiles_get_0.doStartTag();
    if (_jspx_th_tiles_get_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_get_name.reuse(_jspx_th_tiles_get_0);
    return false;
  }

  private boolean _jspx_meth_tiles_get_1(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:get
    org.apache.struts.taglib.tiles.GetTag _jspx_th_tiles_get_1 = (org.apache.struts.taglib.tiles.GetTag) _jspx_tagPool_tiles_get_name.get(org.apache.struts.taglib.tiles.GetTag.class);
    _jspx_th_tiles_get_1.setPageContext(_jspx_page_context);
    _jspx_th_tiles_get_1.setParent(null);
    _jspx_th_tiles_get_1.setName("header");
    int _jspx_eval_tiles_get_1 = _jspx_th_tiles_get_1.doStartTag();
    if (_jspx_th_tiles_get_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_get_name.reuse(_jspx_th_tiles_get_1);
    return false;
  }

  private boolean _jspx_meth_tiles_get_2(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:get
    org.apache.struts.taglib.tiles.GetTag _jspx_th_tiles_get_2 = (org.apache.struts.taglib.tiles.GetTag) _jspx_tagPool_tiles_get_name.get(org.apache.struts.taglib.tiles.GetTag.class);
    _jspx_th_tiles_get_2.setPageContext(_jspx_page_context);
    _jspx_th_tiles_get_2.setParent(null);
    _jspx_th_tiles_get_2.setName("menu");
    int _jspx_eval_tiles_get_2 = _jspx_th_tiles_get_2.doStartTag();
    if (_jspx_th_tiles_get_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_get_name.reuse(_jspx_th_tiles_get_2);
    return false;
  }

  private boolean _jspx_meth_tiles_insert_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insert
    org.apache.struts.taglib.tiles.InsertTag _jspx_th_tiles_insert_0 = (org.apache.struts.taglib.tiles.InsertTag) _jspx_tagPool_tiles_insert_name_flush.get(org.apache.struts.taglib.tiles.InsertTag.class);
    _jspx_th_tiles_insert_0.setPageContext(_jspx_page_context);
    _jspx_th_tiles_insert_0.setParent(null);
    _jspx_th_tiles_insert_0.setName("body");
    _jspx_th_tiles_insert_0.setFlush(true);
    int _jspx_eval_tiles_insert_0 = _jspx_th_tiles_insert_0.doStartTag();
    if (_jspx_th_tiles_insert_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_insert_name_flush.reuse(_jspx_th_tiles_insert_0);
    return false;
  }

  private boolean _jspx_meth_tiles_get_3(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:get
    org.apache.struts.taglib.tiles.GetTag _jspx_th_tiles_get_3 = (org.apache.struts.taglib.tiles.GetTag) _jspx_tagPool_tiles_get_name.get(org.apache.struts.taglib.tiles.GetTag.class);
    _jspx_th_tiles_get_3.setPageContext(_jspx_page_context);
    _jspx_th_tiles_get_3.setParent(null);
    _jspx_th_tiles_get_3.setName("footer");
    int _jspx_eval_tiles_get_3 = _jspx_th_tiles_get_3.doStartTag();
    if (_jspx_th_tiles_get_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_get_name.reuse(_jspx_th_tiles_get_3);
    return false;
  }
}
