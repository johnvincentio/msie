package org.apache.jsp.test;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class testBasic_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/struts-tiles.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tiles_insert_template;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tiles_put_value_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tiles_put_value_type_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tiles_put_type_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tiles_definition_template_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tiles_insert_beanName;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_tiles_insert_template = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_tiles_put_value_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_tiles_put_value_type_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_tiles_put_type_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_tiles_definition_template_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_tiles_insert_beanName = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_tiles_insert_template.release();
    _jspx_tagPool_tiles_put_value_name.release();
    _jspx_tagPool_tiles_put_value_type_name.release();
    _jspx_tagPool_tiles_put_type_name.release();
    _jspx_tagPool_tiles_definition_template_id.release();
    _jspx_tagPool_tiles_insert_beanName.release();
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

      out.write("\r\n\r\n\r\n<hr>\r\n<strong>Basic template usage</strong>\r\n<br>\r\n");
      if (_jspx_meth_tiles_insert_0(_jspx_page_context))
        return;
      out.write("\r\n\r\n<hr>\r\n<strong>Specify attribute types</strong>\r\n<br>\r\n");
      if (_jspx_meth_tiles_insert_1(_jspx_page_context))
        return;
      out.write("\r\n\r\n<hr>\r\n<strong>Set attribute value with tag body</strong>\r\n<br>\r\n");
      if (_jspx_meth_tiles_insert_2(_jspx_page_context))
        return;
      out.write("\r\n\r\n<hr>\r\n<strong>Use of definition</strong>\r\n<br>\r\n");
      if (_jspx_meth_tiles_definition_0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_tiles_insert_3(_jspx_page_context))
        return;
      out.write("\r\n\r\n<hr>\r\n<strong>Use of definition, overload of parameters </strong>Title parameter\r\nfrom previous definition is overloaded\r\n<br>\r\n");
      if (_jspx_meth_tiles_insert_4(_jspx_page_context))
        return;
      out.write("\r\n\r\n<hr>\r\n<strong>Test ignore : body isn't defined </strong>(We use another layout)\r\n<br>\r\n");
      if (_jspx_meth_tiles_insert_5(_jspx_page_context))
        return;
      out.write("\r\n\r\n \r\n");
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
    org.apache.struts.taglib.tiles.InsertTag _jspx_th_tiles_insert_0 = (org.apache.struts.taglib.tiles.InsertTag) _jspx_tagPool_tiles_insert_template.get(org.apache.struts.taglib.tiles.InsertTag.class);
    _jspx_th_tiles_insert_0.setPageContext(_jspx_page_context);
    _jspx_th_tiles_insert_0.setParent(null);
    _jspx_th_tiles_insert_0.setTemplate("layout.jsp");
    int _jspx_eval_tiles_insert_0 = _jspx_th_tiles_insert_0.doStartTag();
    if (_jspx_eval_tiles_insert_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n  ");
        if (_jspx_meth_tiles_put_0(_jspx_th_tiles_insert_0, _jspx_page_context))
          return true;
        out.write("\r\n  ");
        if (_jspx_meth_tiles_put_1(_jspx_th_tiles_insert_0, _jspx_page_context))
          return true;
        out.write("\r\n  ");
        if (_jspx_meth_tiles_put_2(_jspx_th_tiles_insert_0, _jspx_page_context))
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
    _jspx_tagPool_tiles_insert_template.reuse(_jspx_th_tiles_insert_0);
    return false;
  }

  private boolean _jspx_meth_tiles_put_0(javax.servlet.jsp.tagext.JspTag _jspx_th_tiles_insert_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:put
    org.apache.struts.taglib.tiles.PutTag _jspx_th_tiles_put_0 = (org.apache.struts.taglib.tiles.PutTag) _jspx_tagPool_tiles_put_value_name.get(org.apache.struts.taglib.tiles.PutTag.class);
    _jspx_th_tiles_put_0.setPageContext(_jspx_page_context);
    _jspx_th_tiles_put_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_tiles_insert_0);
    _jspx_th_tiles_put_0.setName("title");
    _jspx_th_tiles_put_0.setValue("Test with default no types");
    int _jspx_eval_tiles_put_0 = _jspx_th_tiles_put_0.doStartTag();
    if (_jspx_th_tiles_put_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_put_value_name.reuse(_jspx_th_tiles_put_0);
    return false;
  }

  private boolean _jspx_meth_tiles_put_1(javax.servlet.jsp.tagext.JspTag _jspx_th_tiles_insert_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:put
    org.apache.struts.taglib.tiles.PutTag _jspx_th_tiles_put_1 = (org.apache.struts.taglib.tiles.PutTag) _jspx_tagPool_tiles_put_value_name.get(org.apache.struts.taglib.tiles.PutTag.class);
    _jspx_th_tiles_put_1.setPageContext(_jspx_page_context);
    _jspx_th_tiles_put_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_tiles_insert_0);
    _jspx_th_tiles_put_1.setName("header");
    _jspx_th_tiles_put_1.setValue("header.jsp");
    int _jspx_eval_tiles_put_1 = _jspx_th_tiles_put_1.doStartTag();
    if (_jspx_th_tiles_put_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_put_value_name.reuse(_jspx_th_tiles_put_1);
    return false;
  }

  private boolean _jspx_meth_tiles_put_2(javax.servlet.jsp.tagext.JspTag _jspx_th_tiles_insert_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:put
    org.apache.struts.taglib.tiles.PutTag _jspx_th_tiles_put_2 = (org.apache.struts.taglib.tiles.PutTag) _jspx_tagPool_tiles_put_value_name.get(org.apache.struts.taglib.tiles.PutTag.class);
    _jspx_th_tiles_put_2.setPageContext(_jspx_page_context);
    _jspx_th_tiles_put_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_tiles_insert_0);
    _jspx_th_tiles_put_2.setName("body");
    _jspx_th_tiles_put_2.setValue("body.jsp");
    int _jspx_eval_tiles_put_2 = _jspx_th_tiles_put_2.doStartTag();
    if (_jspx_th_tiles_put_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_put_value_name.reuse(_jspx_th_tiles_put_2);
    return false;
  }

  private boolean _jspx_meth_tiles_insert_1(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insert
    org.apache.struts.taglib.tiles.InsertTag _jspx_th_tiles_insert_1 = (org.apache.struts.taglib.tiles.InsertTag) _jspx_tagPool_tiles_insert_template.get(org.apache.struts.taglib.tiles.InsertTag.class);
    _jspx_th_tiles_insert_1.setPageContext(_jspx_page_context);
    _jspx_th_tiles_insert_1.setParent(null);
    _jspx_th_tiles_insert_1.setTemplate("layout.jsp");
    int _jspx_eval_tiles_insert_1 = _jspx_th_tiles_insert_1.doStartTag();
    if (_jspx_eval_tiles_insert_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n  ");
        if (_jspx_meth_tiles_put_3(_jspx_th_tiles_insert_1, _jspx_page_context))
          return true;
        out.write("\r\n  ");
        if (_jspx_meth_tiles_put_4(_jspx_th_tiles_insert_1, _jspx_page_context))
          return true;
        out.write("\r\n  ");
        if (_jspx_meth_tiles_put_5(_jspx_th_tiles_insert_1, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        int evalDoAfterBody = _jspx_th_tiles_insert_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_tiles_insert_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_insert_template.reuse(_jspx_th_tiles_insert_1);
    return false;
  }

  private boolean _jspx_meth_tiles_put_3(javax.servlet.jsp.tagext.JspTag _jspx_th_tiles_insert_1, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:put
    org.apache.struts.taglib.tiles.PutTag _jspx_th_tiles_put_3 = (org.apache.struts.taglib.tiles.PutTag) _jspx_tagPool_tiles_put_value_type_name.get(org.apache.struts.taglib.tiles.PutTag.class);
    _jspx_th_tiles_put_3.setPageContext(_jspx_page_context);
    _jspx_th_tiles_put_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_tiles_insert_1);
    _jspx_th_tiles_put_3.setName("title");
    _jspx_th_tiles_put_3.setValue("Test with specified types");
    _jspx_th_tiles_put_3.setType("string");
    int _jspx_eval_tiles_put_3 = _jspx_th_tiles_put_3.doStartTag();
    if (_jspx_th_tiles_put_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_put_value_type_name.reuse(_jspx_th_tiles_put_3);
    return false;
  }

  private boolean _jspx_meth_tiles_put_4(javax.servlet.jsp.tagext.JspTag _jspx_th_tiles_insert_1, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:put
    org.apache.struts.taglib.tiles.PutTag _jspx_th_tiles_put_4 = (org.apache.struts.taglib.tiles.PutTag) _jspx_tagPool_tiles_put_value_type_name.get(org.apache.struts.taglib.tiles.PutTag.class);
    _jspx_th_tiles_put_4.setPageContext(_jspx_page_context);
    _jspx_th_tiles_put_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_tiles_insert_1);
    _jspx_th_tiles_put_4.setName("header");
    _jspx_th_tiles_put_4.setValue("header.jsp");
    _jspx_th_tiles_put_4.setType("page");
    int _jspx_eval_tiles_put_4 = _jspx_th_tiles_put_4.doStartTag();
    if (_jspx_th_tiles_put_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_put_value_type_name.reuse(_jspx_th_tiles_put_4);
    return false;
  }

  private boolean _jspx_meth_tiles_put_5(javax.servlet.jsp.tagext.JspTag _jspx_th_tiles_insert_1, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:put
    org.apache.struts.taglib.tiles.PutTag _jspx_th_tiles_put_5 = (org.apache.struts.taglib.tiles.PutTag) _jspx_tagPool_tiles_put_value_type_name.get(org.apache.struts.taglib.tiles.PutTag.class);
    _jspx_th_tiles_put_5.setPageContext(_jspx_page_context);
    _jspx_th_tiles_put_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_tiles_insert_1);
    _jspx_th_tiles_put_5.setName("body");
    _jspx_th_tiles_put_5.setValue("body.jsp");
    _jspx_th_tiles_put_5.setType("page");
    int _jspx_eval_tiles_put_5 = _jspx_th_tiles_put_5.doStartTag();
    if (_jspx_th_tiles_put_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_put_value_type_name.reuse(_jspx_th_tiles_put_5);
    return false;
  }

  private boolean _jspx_meth_tiles_insert_2(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insert
    org.apache.struts.taglib.tiles.InsertTag _jspx_th_tiles_insert_2 = (org.apache.struts.taglib.tiles.InsertTag) _jspx_tagPool_tiles_insert_template.get(org.apache.struts.taglib.tiles.InsertTag.class);
    _jspx_th_tiles_insert_2.setPageContext(_jspx_page_context);
    _jspx_th_tiles_insert_2.setParent(null);
    _jspx_th_tiles_insert_2.setTemplate("layout.jsp");
    int _jspx_eval_tiles_insert_2 = _jspx_th_tiles_insert_2.doStartTag();
    if (_jspx_eval_tiles_insert_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n  ");
        if (_jspx_meth_tiles_put_6(_jspx_th_tiles_insert_2, _jspx_page_context))
          return true;
        out.write("\r\n  ");
        if (_jspx_meth_tiles_put_7(_jspx_th_tiles_insert_2, _jspx_page_context))
          return true;
        out.write("\r\n  ");
        if (_jspx_meth_tiles_put_8(_jspx_th_tiles_insert_2, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        int evalDoAfterBody = _jspx_th_tiles_insert_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_tiles_insert_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_insert_template.reuse(_jspx_th_tiles_insert_2);
    return false;
  }

  private boolean _jspx_meth_tiles_put_6(javax.servlet.jsp.tagext.JspTag _jspx_th_tiles_insert_2, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:put
    org.apache.struts.taglib.tiles.PutTag _jspx_th_tiles_put_6 = (org.apache.struts.taglib.tiles.PutTag) _jspx_tagPool_tiles_put_value_name.get(org.apache.struts.taglib.tiles.PutTag.class);
    _jspx_th_tiles_put_6.setPageContext(_jspx_page_context);
    _jspx_th_tiles_put_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_tiles_insert_2);
    _jspx_th_tiles_put_6.setName("title");
    _jspx_th_tiles_put_6.setValue("Test with a tag body");
    int _jspx_eval_tiles_put_6 = _jspx_th_tiles_put_6.doStartTag();
    if (_jspx_th_tiles_put_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_put_value_name.reuse(_jspx_th_tiles_put_6);
    return false;
  }

  private boolean _jspx_meth_tiles_put_7(javax.servlet.jsp.tagext.JspTag _jspx_th_tiles_insert_2, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:put
    org.apache.struts.taglib.tiles.PutTag _jspx_th_tiles_put_7 = (org.apache.struts.taglib.tiles.PutTag) _jspx_tagPool_tiles_put_type_name.get(org.apache.struts.taglib.tiles.PutTag.class);
    _jspx_th_tiles_put_7.setPageContext(_jspx_page_context);
    _jspx_th_tiles_put_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_tiles_insert_2);
    _jspx_th_tiles_put_7.setName("header");
    _jspx_th_tiles_put_7.setType("string");
    int _jspx_eval_tiles_put_7 = _jspx_th_tiles_put_7.doStartTag();
    if (_jspx_eval_tiles_put_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_tiles_put_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_tiles_put_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_tiles_put_7.doInitBody();
      }
      do {
        out.write("\r\n    <strong>This header is inserted as body of tag</strong>\r\n  ");
        int evalDoAfterBody = _jspx_th_tiles_put_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_tiles_put_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_tiles_put_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_put_type_name.reuse(_jspx_th_tiles_put_7);
    return false;
  }

  private boolean _jspx_meth_tiles_put_8(javax.servlet.jsp.tagext.JspTag _jspx_th_tiles_insert_2, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:put
    org.apache.struts.taglib.tiles.PutTag _jspx_th_tiles_put_8 = (org.apache.struts.taglib.tiles.PutTag) _jspx_tagPool_tiles_put_value_name.get(org.apache.struts.taglib.tiles.PutTag.class);
    _jspx_th_tiles_put_8.setPageContext(_jspx_page_context);
    _jspx_th_tiles_put_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_tiles_insert_2);
    _jspx_th_tiles_put_8.setName("body");
    _jspx_th_tiles_put_8.setValue("body.jsp");
    int _jspx_eval_tiles_put_8 = _jspx_th_tiles_put_8.doStartTag();
    if (_jspx_th_tiles_put_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_put_value_name.reuse(_jspx_th_tiles_put_8);
    return false;
  }

  private boolean _jspx_meth_tiles_definition_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:definition
    org.apache.struts.taglib.tiles.DefinitionTag _jspx_th_tiles_definition_0 = (org.apache.struts.taglib.tiles.DefinitionTag) _jspx_tagPool_tiles_definition_template_id.get(org.apache.struts.taglib.tiles.DefinitionTag.class);
    _jspx_th_tiles_definition_0.setPageContext(_jspx_page_context);
    _jspx_th_tiles_definition_0.setParent(null);
    _jspx_th_tiles_definition_0.setId("templateDefinition");
    _jspx_th_tiles_definition_0.setTemplate("layout.jsp");
    int _jspx_eval_tiles_definition_0 = _jspx_th_tiles_definition_0.doStartTag();
    if (_jspx_eval_tiles_definition_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n  ");
        if (_jspx_meth_tiles_put_9(_jspx_th_tiles_definition_0, _jspx_page_context))
          return true;
        out.write("\r\n  ");
        if (_jspx_meth_tiles_put_10(_jspx_th_tiles_definition_0, _jspx_page_context))
          return true;
        out.write("\r\n  ");
        if (_jspx_meth_tiles_put_11(_jspx_th_tiles_definition_0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        int evalDoAfterBody = _jspx_th_tiles_definition_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_tiles_definition_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_definition_template_id.reuse(_jspx_th_tiles_definition_0);
    return false;
  }

  private boolean _jspx_meth_tiles_put_9(javax.servlet.jsp.tagext.JspTag _jspx_th_tiles_definition_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:put
    org.apache.struts.taglib.tiles.PutTag _jspx_th_tiles_put_9 = (org.apache.struts.taglib.tiles.PutTag) _jspx_tagPool_tiles_put_value_name.get(org.apache.struts.taglib.tiles.PutTag.class);
    _jspx_th_tiles_put_9.setPageContext(_jspx_page_context);
    _jspx_th_tiles_put_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_tiles_definition_0);
    _jspx_th_tiles_put_9.setName("title");
    _jspx_th_tiles_put_9.setValue("Use of definition");
    int _jspx_eval_tiles_put_9 = _jspx_th_tiles_put_9.doStartTag();
    if (_jspx_th_tiles_put_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_put_value_name.reuse(_jspx_th_tiles_put_9);
    return false;
  }

  private boolean _jspx_meth_tiles_put_10(javax.servlet.jsp.tagext.JspTag _jspx_th_tiles_definition_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:put
    org.apache.struts.taglib.tiles.PutTag _jspx_th_tiles_put_10 = (org.apache.struts.taglib.tiles.PutTag) _jspx_tagPool_tiles_put_value_name.get(org.apache.struts.taglib.tiles.PutTag.class);
    _jspx_th_tiles_put_10.setPageContext(_jspx_page_context);
    _jspx_th_tiles_put_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_tiles_definition_0);
    _jspx_th_tiles_put_10.setName("header");
    _jspx_th_tiles_put_10.setValue("header.jsp");
    int _jspx_eval_tiles_put_10 = _jspx_th_tiles_put_10.doStartTag();
    if (_jspx_th_tiles_put_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_put_value_name.reuse(_jspx_th_tiles_put_10);
    return false;
  }

  private boolean _jspx_meth_tiles_put_11(javax.servlet.jsp.tagext.JspTag _jspx_th_tiles_definition_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:put
    org.apache.struts.taglib.tiles.PutTag _jspx_th_tiles_put_11 = (org.apache.struts.taglib.tiles.PutTag) _jspx_tagPool_tiles_put_value_name.get(org.apache.struts.taglib.tiles.PutTag.class);
    _jspx_th_tiles_put_11.setPageContext(_jspx_page_context);
    _jspx_th_tiles_put_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_tiles_definition_0);
    _jspx_th_tiles_put_11.setName("body");
    _jspx_th_tiles_put_11.setValue("body.jsp");
    int _jspx_eval_tiles_put_11 = _jspx_th_tiles_put_11.doStartTag();
    if (_jspx_th_tiles_put_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_put_value_name.reuse(_jspx_th_tiles_put_11);
    return false;
  }

  private boolean _jspx_meth_tiles_insert_3(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insert
    org.apache.struts.taglib.tiles.InsertTag _jspx_th_tiles_insert_3 = (org.apache.struts.taglib.tiles.InsertTag) _jspx_tagPool_tiles_insert_beanName.get(org.apache.struts.taglib.tiles.InsertTag.class);
    _jspx_th_tiles_insert_3.setPageContext(_jspx_page_context);
    _jspx_th_tiles_insert_3.setParent(null);
    _jspx_th_tiles_insert_3.setBeanName("templateDefinition");
    int _jspx_eval_tiles_insert_3 = _jspx_th_tiles_insert_3.doStartTag();
    if (_jspx_th_tiles_insert_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_insert_beanName.reuse(_jspx_th_tiles_insert_3);
    return false;
  }

  private boolean _jspx_meth_tiles_insert_4(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insert
    org.apache.struts.taglib.tiles.InsertTag _jspx_th_tiles_insert_4 = (org.apache.struts.taglib.tiles.InsertTag) _jspx_tagPool_tiles_insert_beanName.get(org.apache.struts.taglib.tiles.InsertTag.class);
    _jspx_th_tiles_insert_4.setPageContext(_jspx_page_context);
    _jspx_th_tiles_insert_4.setParent(null);
    _jspx_th_tiles_insert_4.setBeanName("templateDefinition");
    int _jspx_eval_tiles_insert_4 = _jspx_th_tiles_insert_4.doStartTag();
    if (_jspx_eval_tiles_insert_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n  ");
        if (_jspx_meth_tiles_put_12(_jspx_th_tiles_insert_4, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        int evalDoAfterBody = _jspx_th_tiles_insert_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_tiles_insert_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_insert_beanName.reuse(_jspx_th_tiles_insert_4);
    return false;
  }

  private boolean _jspx_meth_tiles_put_12(javax.servlet.jsp.tagext.JspTag _jspx_th_tiles_insert_4, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:put
    org.apache.struts.taglib.tiles.PutTag _jspx_th_tiles_put_12 = (org.apache.struts.taglib.tiles.PutTag) _jspx_tagPool_tiles_put_value_type_name.get(org.apache.struts.taglib.tiles.PutTag.class);
    _jspx_th_tiles_put_12.setPageContext(_jspx_page_context);
    _jspx_th_tiles_put_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_tiles_insert_4);
    _jspx_th_tiles_put_12.setName("title");
    _jspx_th_tiles_put_12.setValue("Use of definition, overload of parameters");
    _jspx_th_tiles_put_12.setType("string");
    int _jspx_eval_tiles_put_12 = _jspx_th_tiles_put_12.doStartTag();
    if (_jspx_th_tiles_put_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_put_value_type_name.reuse(_jspx_th_tiles_put_12);
    return false;
  }

  private boolean _jspx_meth_tiles_insert_5(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insert
    org.apache.struts.taglib.tiles.InsertTag _jspx_th_tiles_insert_5 = (org.apache.struts.taglib.tiles.InsertTag) _jspx_tagPool_tiles_insert_template.get(org.apache.struts.taglib.tiles.InsertTag.class);
    _jspx_th_tiles_insert_5.setPageContext(_jspx_page_context);
    _jspx_th_tiles_insert_5.setParent(null);
    _jspx_th_tiles_insert_5.setTemplate("layoutTestIgnore.jsp");
    int _jspx_eval_tiles_insert_5 = _jspx_th_tiles_insert_5.doStartTag();
    if (_jspx_eval_tiles_insert_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n  ");
        if (_jspx_meth_tiles_put_13(_jspx_th_tiles_insert_5, _jspx_page_context))
          return true;
        out.write("\r\n  ");
        if (_jspx_meth_tiles_put_14(_jspx_th_tiles_insert_5, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        int evalDoAfterBody = _jspx_th_tiles_insert_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_tiles_insert_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_insert_template.reuse(_jspx_th_tiles_insert_5);
    return false;
  }

  private boolean _jspx_meth_tiles_put_13(javax.servlet.jsp.tagext.JspTag _jspx_th_tiles_insert_5, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:put
    org.apache.struts.taglib.tiles.PutTag _jspx_th_tiles_put_13 = (org.apache.struts.taglib.tiles.PutTag) _jspx_tagPool_tiles_put_value_name.get(org.apache.struts.taglib.tiles.PutTag.class);
    _jspx_th_tiles_put_13.setPageContext(_jspx_page_context);
    _jspx_th_tiles_put_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_tiles_insert_5);
    _jspx_th_tiles_put_13.setName("title");
    _jspx_th_tiles_put_13.setValue("Test ignore : body isn't defined");
    int _jspx_eval_tiles_put_13 = _jspx_th_tiles_put_13.doStartTag();
    if (_jspx_th_tiles_put_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_put_value_name.reuse(_jspx_th_tiles_put_13);
    return false;
  }

  private boolean _jspx_meth_tiles_put_14(javax.servlet.jsp.tagext.JspTag _jspx_th_tiles_insert_5, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:put
    org.apache.struts.taglib.tiles.PutTag _jspx_th_tiles_put_14 = (org.apache.struts.taglib.tiles.PutTag) _jspx_tagPool_tiles_put_value_name.get(org.apache.struts.taglib.tiles.PutTag.class);
    _jspx_th_tiles_put_14.setPageContext(_jspx_page_context);
    _jspx_th_tiles_put_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_tiles_insert_5);
    _jspx_th_tiles_put_14.setName("header");
    _jspx_th_tiles_put_14.setValue("header.jsp");
    int _jspx_eval_tiles_put_14 = _jspx_th_tiles_put_14.doStartTag();
    if (_jspx_th_tiles_put_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_put_value_name.reuse(_jspx_th_tiles_put_14);
    return false;
  }
}
