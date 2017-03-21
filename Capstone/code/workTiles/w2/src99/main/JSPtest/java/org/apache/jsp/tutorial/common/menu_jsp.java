package org.apache.jsp.tutorial.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/struts-tiles.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tiles_insert_page_flush;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tiles_putList_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tiles_add_value;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_tiles_insert_page_flush = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_tiles_putList_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_tiles_add_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_tiles_insert_page_flush.release();
    _jspx_tagPool_tiles_putList_name.release();
    _jspx_tagPool_tiles_add_value.release();
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

      out.write("\r\n\r\n");
      if (_jspx_meth_tiles_insert_0(_jspx_page_context))
        return;
      out.write('\r');
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

  private boolean _jspx_meth_tiles_insert_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insert
    org.apache.struts.taglib.tiles.InsertTag _jspx_th_tiles_insert_0 = (org.apache.struts.taglib.tiles.InsertTag) _jspx_tagPool_tiles_insert_page_flush.get(org.apache.struts.taglib.tiles.InsertTag.class);
    _jspx_th_tiles_insert_0.setPageContext(_jspx_page_context);
    _jspx_th_tiles_insert_0.setParent(null);
    _jspx_th_tiles_insert_0.setPage("/layout/vboxLayout.jsp");
    _jspx_th_tiles_insert_0.setFlush(true);
    int _jspx_eval_tiles_insert_0 = _jspx_th_tiles_insert_0.doStartTag();
    if (_jspx_eval_tiles_insert_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n  ");
        if (_jspx_meth_tiles_putList_0(_jspx_th_tiles_insert_0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        int evalDoAfterBody = _jspx_th_tiles_insert_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_tiles_insert_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_insert_page_flush.reuse(_jspx_th_tiles_insert_0);
    return false;
  }

  private boolean _jspx_meth_tiles_putList_0(javax.servlet.jsp.tagext.JspTag _jspx_th_tiles_insert_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:putList
    org.apache.struts.taglib.tiles.PutListTag _jspx_th_tiles_putList_0 = (org.apache.struts.taglib.tiles.PutListTag) _jspx_tagPool_tiles_putList_name.get(org.apache.struts.taglib.tiles.PutListTag.class);
    _jspx_th_tiles_putList_0.setPageContext(_jspx_page_context);
    _jspx_th_tiles_putList_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_tiles_insert_0);
    _jspx_th_tiles_putList_0.setName("componentsList");
    int _jspx_eval_tiles_putList_0 = _jspx_th_tiles_putList_0.doStartTag();
    if (_jspx_eval_tiles_putList_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n    ");
        if (_jspx_meth_tiles_add_0(_jspx_th_tiles_putList_0, _jspx_page_context))
          return true;
        out.write("\r\n    ");
        if (_jspx_meth_tiles_add_1(_jspx_th_tiles_putList_0, _jspx_page_context))
          return true;
        out.write("\r\n    ");
        if (_jspx_meth_tiles_add_2(_jspx_th_tiles_putList_0, _jspx_page_context))
          return true;
        out.write("\r\n  ");
        int evalDoAfterBody = _jspx_th_tiles_putList_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_tiles_putList_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_putList_name.reuse(_jspx_th_tiles_putList_0);
    return false;
  }

  private boolean _jspx_meth_tiles_add_0(javax.servlet.jsp.tagext.JspTag _jspx_th_tiles_putList_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:add
    org.apache.struts.taglib.tiles.AddTag _jspx_th_tiles_add_0 = (org.apache.struts.taglib.tiles.AddTag) _jspx_tagPool_tiles_add_value.get(org.apache.struts.taglib.tiles.AddTag.class);
    _jspx_th_tiles_add_0.setPageContext(_jspx_page_context);
    _jspx_th_tiles_add_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_tiles_putList_0);
    _jspx_th_tiles_add_0.setValue("/tutorial/common/menu/menuLogo.jsp");
    int _jspx_eval_tiles_add_0 = _jspx_th_tiles_add_0.doStartTag();
    if (_jspx_th_tiles_add_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_add_value.reuse(_jspx_th_tiles_add_0);
    return false;
  }

  private boolean _jspx_meth_tiles_add_1(javax.servlet.jsp.tagext.JspTag _jspx_th_tiles_putList_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:add
    org.apache.struts.taglib.tiles.AddTag _jspx_th_tiles_add_1 = (org.apache.struts.taglib.tiles.AddTag) _jspx_tagPool_tiles_add_value.get(org.apache.struts.taglib.tiles.AddTag.class);
    _jspx_th_tiles_add_1.setPageContext(_jspx_page_context);
    _jspx_th_tiles_add_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_tiles_putList_0);
    _jspx_th_tiles_add_1.setValue("/tutorial/common/menu/menuLinks.jsp");
    int _jspx_eval_tiles_add_1 = _jspx_th_tiles_add_1.doStartTag();
    if (_jspx_th_tiles_add_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_add_value.reuse(_jspx_th_tiles_add_1);
    return false;
  }

  private boolean _jspx_meth_tiles_add_2(javax.servlet.jsp.tagext.JspTag _jspx_th_tiles_putList_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:add
    org.apache.struts.taglib.tiles.AddTag _jspx_th_tiles_add_2 = (org.apache.struts.taglib.tiles.AddTag) _jspx_tagPool_tiles_add_value.get(org.apache.struts.taglib.tiles.AddTag.class);
    _jspx_th_tiles_add_2.setPageContext(_jspx_page_context);
    _jspx_th_tiles_add_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_tiles_putList_0);
    _jspx_th_tiles_add_2.setValue("/tutorial/common/menu/menuSrc.jsp");
    int _jspx_eval_tiles_add_2 = _jspx_th_tiles_add_2.doStartTag();
    if (_jspx_th_tiles_add_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_add_value.reuse(_jspx_th_tiles_add_2);
    return false;
  }
}
