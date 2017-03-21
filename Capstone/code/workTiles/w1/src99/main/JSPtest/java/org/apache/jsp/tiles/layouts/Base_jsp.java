package org.apache.jsp.tiles.layouts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Base_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(4);
    _jspx_dependants.add("/WEB-INF/tags/struts-tiles.tld");
    _jspx_dependants.add("/WEB-INF/tags/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/tags/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/tags/struts-logic.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_html;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tiles_getAsString_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tiles_get_name;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_html = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_tiles_getAsString_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_tiles_get_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_html.release();
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

      out.write("\n\n\n\n\n");
      //  html:html
      org.apache.struts.taglib.html.HtmlTag _jspx_th_html_html_0 = (org.apache.struts.taglib.html.HtmlTag) _jspx_tagPool_html_html.get(org.apache.struts.taglib.html.HtmlTag.class);
      _jspx_th_html_html_0.setPageContext(_jspx_page_context);
      _jspx_th_html_html_0.setParent(null);
      int _jspx_eval_html_html_0 = _jspx_th_html_html_0.doStartTag();
      if (_jspx_eval_html_html_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n<head>\n\n\n\n<base href=\"http://");
          out.print(request.getServerName());
          out.write(':');
          out.write('\n');
          out.print( request.getServerPort());
          out.write('/');
          out.print(request.getContextPath());
          out.write("/\">\n\n\n<link rel=\"stylesheet\" type=\"text/css\" href=\"tiles/layouts/BaseStyle.css\">\n\n\n<title>");
          if (_jspx_meth_tiles_getAsString_0(_jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("</title>\n");
          if (_jspx_meth_tiles_get_0(_jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\n</head>\n\n<body>\n");
          if (_jspx_meth_tiles_get_1(_jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write('\n');
          if (_jspx_meth_tiles_get_2(_jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\n</body>\n\n");
          if (_jspx_meth_tiles_get_3(_jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write('\n');
          out.write('\n');
          int evalDoAfterBody = _jspx_th_html_html_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_html_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_html_html.reuse(_jspx_th_html_html_0);
      out.write('\n');
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

  private boolean _jspx_meth_tiles_getAsString_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:getAsString
    org.apache.struts.taglib.tiles.GetAttributeTag _jspx_th_tiles_getAsString_0 = (org.apache.struts.taglib.tiles.GetAttributeTag) _jspx_tagPool_tiles_getAsString_name.get(org.apache.struts.taglib.tiles.GetAttributeTag.class);
    _jspx_th_tiles_getAsString_0.setPageContext(_jspx_page_context);
    _jspx_th_tiles_getAsString_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_tiles_getAsString_0.setName("title");
    int _jspx_eval_tiles_getAsString_0 = _jspx_th_tiles_getAsString_0.doStartTag();
    if (_jspx_th_tiles_getAsString_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_getAsString_name.reuse(_jspx_th_tiles_getAsString_0);
    return false;
  }

  private boolean _jspx_meth_tiles_get_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:get
    org.apache.struts.taglib.tiles.GetTag _jspx_th_tiles_get_0 = (org.apache.struts.taglib.tiles.GetTag) _jspx_tagPool_tiles_get_name.get(org.apache.struts.taglib.tiles.GetTag.class);
    _jspx_th_tiles_get_0.setPageContext(_jspx_page_context);
    _jspx_th_tiles_get_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_tiles_get_0.setName("header");
    int _jspx_eval_tiles_get_0 = _jspx_th_tiles_get_0.doStartTag();
    if (_jspx_th_tiles_get_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_get_name.reuse(_jspx_th_tiles_get_0);
    return false;
  }

  private boolean _jspx_meth_tiles_get_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:get
    org.apache.struts.taglib.tiles.GetTag _jspx_th_tiles_get_1 = (org.apache.struts.taglib.tiles.GetTag) _jspx_tagPool_tiles_get_name.get(org.apache.struts.taglib.tiles.GetTag.class);
    _jspx_th_tiles_get_1.setPageContext(_jspx_page_context);
    _jspx_th_tiles_get_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_tiles_get_1.setName("menu");
    int _jspx_eval_tiles_get_1 = _jspx_th_tiles_get_1.doStartTag();
    if (_jspx_th_tiles_get_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_get_name.reuse(_jspx_th_tiles_get_1);
    return false;
  }

  private boolean _jspx_meth_tiles_get_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:get
    org.apache.struts.taglib.tiles.GetTag _jspx_th_tiles_get_2 = (org.apache.struts.taglib.tiles.GetTag) _jspx_tagPool_tiles_get_name.get(org.apache.struts.taglib.tiles.GetTag.class);
    _jspx_th_tiles_get_2.setPageContext(_jspx_page_context);
    _jspx_th_tiles_get_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_tiles_get_2.setName("body");
    int _jspx_eval_tiles_get_2 = _jspx_th_tiles_get_2.doStartTag();
    if (_jspx_th_tiles_get_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_get_name.reuse(_jspx_th_tiles_get_2);
    return false;
  }

  private boolean _jspx_meth_tiles_get_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:get
    org.apache.struts.taglib.tiles.GetTag _jspx_th_tiles_get_3 = (org.apache.struts.taglib.tiles.GetTag) _jspx_tagPool_tiles_get_name.get(org.apache.struts.taglib.tiles.GetTag.class);
    _jspx_th_tiles_get_3.setPageContext(_jspx_page_context);
    _jspx_th_tiles_get_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_tiles_get_3.setName("footer");
    int _jspx_eval_tiles_get_3 = _jspx_th_tiles_get_3.doStartTag();
    if (_jspx_th_tiles_get_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_get_name.reuse(_jspx_th_tiles_get_3);
    return false;
  }
}
