package org.apache.jsp.tutorial;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class frameset_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/struts-tiles.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tiles_getAsString_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tiles_get_name;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_tiles_getAsString_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_tiles_get_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_tiles_getAsString_name.release();
    _jspx_tagPool_tiles_get_name.release();
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

      out.write("\r\n\r\n\r\n\r\n<html>\r\n<head>\r\n    <title>");
      if (_jspx_meth_tiles_getAsString_0(_jspx_page_context))
        return;
      out.write("</title>\r\n</head>\r\n\r\n<body>\r\n<frameset rows=\"3\">\r\n  <frame src=\"");
      if (_jspx_meth_tiles_get_0(_jspx_page_context))
        return;
      out.write("\" name=\"header\" id=\"header\" scrolling=\"Auto\">\r\n  <frame src=\"");
      if (_jspx_meth_tiles_get_1(_jspx_page_context))
        return;
      out.write("\" name=\"body\" id=\"header\" scrolling=\"Auto\">\r\n  <frame src=\"");
      if (_jspx_meth_tiles_get_2(_jspx_page_context))
        return;
      out.write("\" name=\"footer\" id=\"header\" scrolling=\"Auto\">\r\n</frameset>\r\n</body>\r\n\r\n\r\n</html>\r\n");
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

  private boolean _jspx_meth_tiles_getAsString_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:getAsString
    org.apache.struts.taglib.tiles.GetAttributeTag _jspx_th_tiles_getAsString_0 = (org.apache.struts.taglib.tiles.GetAttributeTag) _jspx_tagPool_tiles_getAsString_name.get(org.apache.struts.taglib.tiles.GetAttributeTag.class);
    _jspx_th_tiles_getAsString_0.setPageContext(_jspx_page_context);
    _jspx_th_tiles_getAsString_0.setParent(null);
    _jspx_th_tiles_getAsString_0.setName("title");
    int _jspx_eval_tiles_getAsString_0 = _jspx_th_tiles_getAsString_0.doStartTag();
    if (_jspx_th_tiles_getAsString_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_getAsString_name.reuse(_jspx_th_tiles_getAsString_0);
    return false;
  }

  private boolean _jspx_meth_tiles_get_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:get
    org.apache.struts.taglib.tiles.GetTag _jspx_th_tiles_get_0 = (org.apache.struts.taglib.tiles.GetTag) _jspx_tagPool_tiles_get_name.get(org.apache.struts.taglib.tiles.GetTag.class);
    _jspx_th_tiles_get_0.setPageContext(_jspx_page_context);
    _jspx_th_tiles_get_0.setParent(null);
    _jspx_th_tiles_get_0.setName("header");
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
    _jspx_th_tiles_get_1.setName("body");
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
    _jspx_th_tiles_get_2.setName("footer");
    int _jspx_eval_tiles_get_2 = _jspx_th_tiles_get_2.doStartTag();
    if (_jspx_th_tiles_get_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_get_name.reuse(_jspx_th_tiles_get_2);
    return false;
  }
}
