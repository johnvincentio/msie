package org.apache.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class viewSrcBody_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(3);
    _jspx_dependants.add("/WEB-INF/struts-tiles.tld");
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/struts-logic.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tiles_importAttribute;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_notPresent_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_present_parameter;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_parameter_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_present_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_define_type_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_resource_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_scope_name_filter;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_tiles_importAttribute = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_notPresent_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_present_parameter = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_parameter_name_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_present_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_define_type_name_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_resource_name_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_write_scope_name_filter = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_tiles_importAttribute.release();
    _jspx_tagPool_logic_notPresent_name.release();
    _jspx_tagPool_logic_present_parameter.release();
    _jspx_tagPool_bean_parameter_name_id.release();
    _jspx_tagPool_logic_present_name.release();
    _jspx_tagPool_bean_define_type_name_id.release();
    _jspx_tagPool_bean_resource_name_id.release();
    _jspx_tagPool_bean_write_scope_name_filter.release();
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
      			"/common/viewSrcBodyError.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n  \r\n   \r\n\r\n");
      if (_jspx_meth_tiles_importAttribute_0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");
      //  logic:notPresent
      org.apache.struts.taglib.logic.NotPresentTag _jspx_th_logic_notPresent_0 = (org.apache.struts.taglib.logic.NotPresentTag) _jspx_tagPool_logic_notPresent_name.get(org.apache.struts.taglib.logic.NotPresentTag.class);
      _jspx_th_logic_notPresent_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_notPresent_0.setParent(null);
      _jspx_th_logic_notPresent_0.setName("srcPath");
      int _jspx_eval_logic_notPresent_0 = _jspx_th_logic_notPresent_0.doStartTag();
      if (_jspx_eval_logic_notPresent_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n  ");
          //  logic:present
          org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_present_0 = (org.apache.struts.taglib.logic.PresentTag) _jspx_tagPool_logic_present_parameter.get(org.apache.struts.taglib.logic.PresentTag.class);
          _jspx_th_logic_present_0.setPageContext(_jspx_page_context);
          _jspx_th_logic_present_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notPresent_0);
          _jspx_th_logic_present_0.setParameter("src");
          int _jspx_eval_logic_present_0 = _jspx_th_logic_present_0.doStartTag();
          if (_jspx_eval_logic_present_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n  ");
              //  bean:parameter
              java.lang.String srcPath = null;
              org.apache.struts.taglib.bean.ParameterTag _jspx_th_bean_parameter_0 = (org.apache.struts.taglib.bean.ParameterTag) _jspx_tagPool_bean_parameter_name_id.get(org.apache.struts.taglib.bean.ParameterTag.class);
              _jspx_th_bean_parameter_0.setPageContext(_jspx_page_context);
              _jspx_th_bean_parameter_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_present_0);
              _jspx_th_bean_parameter_0.setId("srcPath");
              _jspx_th_bean_parameter_0.setName("src");
              int _jspx_eval_bean_parameter_0 = _jspx_th_bean_parameter_0.doStartTag();
              srcPath = (java.lang.String) _jspx_page_context.findAttribute("srcPath");
              if (_jspx_th_bean_parameter_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              srcPath = (java.lang.String) _jspx_page_context.findAttribute("srcPath");
              _jspx_tagPool_bean_parameter_name_id.reuse(_jspx_th_bean_parameter_0);
              out.write("\r\n  ");
              int evalDoAfterBody = _jspx_th_logic_present_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_present_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_logic_present_parameter.reuse(_jspx_th_logic_present_0);
          out.write("  \r\n");
          int evalDoAfterBody = _jspx_th_logic_notPresent_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_notPresent_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_notPresent_name.reuse(_jspx_th_logic_notPresent_0);
      out.write("\r\n     \r\n\r\n");
      //  logic:present
      org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_present_1 = (org.apache.struts.taglib.logic.PresentTag) _jspx_tagPool_logic_present_name.get(org.apache.struts.taglib.logic.PresentTag.class);
      _jspx_th_logic_present_1.setPageContext(_jspx_page_context);
      _jspx_th_logic_present_1.setParent(null);
      _jspx_th_logic_present_1.setName("srcPath");
      int _jspx_eval_logic_present_1 = _jspx_th_logic_present_1.doStartTag();
      if (_jspx_eval_logic_present_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\r');
          out.write('\n');
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_0 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_type_name_id.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_0.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_present_1);
          _jspx_th_bean_define_0.setId("srcPathVar");
          _jspx_th_bean_define_0.setName("srcPath");
          _jspx_th_bean_define_0.setType("java.lang.String");
          int _jspx_eval_bean_define_0 = _jspx_th_bean_define_0.doStartTag();
          if (_jspx_th_bean_define_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_bean_define_type_name_id.reuse(_jspx_th_bean_define_0);
          java.lang.String srcPathVar = null;
          srcPathVar = (java.lang.String) _jspx_page_context.findAttribute("srcPathVar");
          out.write('\r');
          out.write('\n');
          //  bean:resource
          java.lang.String src = null;
          org.apache.struts.taglib.bean.ResourceTag _jspx_th_bean_resource_0 = (org.apache.struts.taglib.bean.ResourceTag) _jspx_tagPool_bean_resource_name_id.get(org.apache.struts.taglib.bean.ResourceTag.class);
          _jspx_th_bean_resource_0.setPageContext(_jspx_page_context);
          _jspx_th_bean_resource_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_present_1);
          _jspx_th_bean_resource_0.setId("src");
          _jspx_th_bean_resource_0.setName(srcPathVar);
          int _jspx_eval_bean_resource_0 = _jspx_th_bean_resource_0.doStartTag();
          src = (java.lang.String) _jspx_page_context.findAttribute("src");
          if (_jspx_th_bean_resource_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          src = (java.lang.String) _jspx_page_context.findAttribute("src");
          _jspx_tagPool_bean_resource_name_id.reuse(_jspx_th_bean_resource_0);
          out.write("\r\n<strong>file '");
          out.print(srcPathVar);
          out.write("'</strong>\r\n<br>\r\n<pre>\r\n");
          if (_jspx_meth_bean_write_0(_jspx_th_logic_present_1, _jspx_page_context))
            return;
          out.write("\r\n</pre>\r\n<br>\r\n");
          int evalDoAfterBody = _jspx_th_logic_present_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_present_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_present_name.reuse(_jspx_th_logic_present_1);
      out.write("\r\n\r\n");
      if (_jspx_meth_logic_notPresent_1(_jspx_page_context))
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

  private boolean _jspx_meth_tiles_importAttribute_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:importAttribute
    org.apache.struts.taglib.tiles.ImportAttributeTag _jspx_th_tiles_importAttribute_0 = (org.apache.struts.taglib.tiles.ImportAttributeTag) _jspx_tagPool_tiles_importAttribute.get(org.apache.struts.taglib.tiles.ImportAttributeTag.class);
    _jspx_th_tiles_importAttribute_0.setPageContext(_jspx_page_context);
    _jspx_th_tiles_importAttribute_0.setParent(null);
    int _jspx_eval_tiles_importAttribute_0 = _jspx_th_tiles_importAttribute_0.doStartTag();
    if (_jspx_th_tiles_importAttribute_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_importAttribute.reuse(_jspx_th_tiles_importAttribute_0);
    return false;
  }

  private boolean _jspx_meth_bean_write_0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_present_1, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_0 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_scope_name_filter.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_0.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_present_1);
    _jspx_th_bean_write_0.setFilter(true);
    _jspx_th_bean_write_0.setName("src");
    _jspx_th_bean_write_0.setScope("page");
    int _jspx_eval_bean_write_0 = _jspx_th_bean_write_0.doStartTag();
    if (_jspx_th_bean_write_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_scope_name_filter.reuse(_jspx_th_bean_write_0);
    return false;
  }

  private boolean _jspx_meth_logic_notPresent_1(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  logic:notPresent
    org.apache.struts.taglib.logic.NotPresentTag _jspx_th_logic_notPresent_1 = (org.apache.struts.taglib.logic.NotPresentTag) _jspx_tagPool_logic_notPresent_name.get(org.apache.struts.taglib.logic.NotPresentTag.class);
    _jspx_th_logic_notPresent_1.setPageContext(_jspx_page_context);
    _jspx_th_logic_notPresent_1.setParent(null);
    _jspx_th_logic_notPresent_1.setName("srcPath");
    int _jspx_eval_logic_notPresent_1 = _jspx_th_logic_notPresent_1.doStartTag();
    if (_jspx_eval_logic_notPresent_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\nNo source specified !\r\n");
        int evalDoAfterBody = _jspx_th_logic_notPresent_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_notPresent_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_logic_notPresent_name.reuse(_jspx_th_logic_notPresent_1);
    return false;
  }
}
