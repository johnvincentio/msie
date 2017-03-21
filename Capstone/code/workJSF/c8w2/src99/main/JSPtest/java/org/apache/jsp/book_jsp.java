package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class book_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_view;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_loadBundle_var_basename;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_outputText_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_form;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_panelGrid_styleClass_columns_columnClasses;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_facet_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_subview_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_import_url;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_verbatim;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_f_view = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_loadBundle_var_basename = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_outputText_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_form = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_panelGrid_styleClass_columns_columnClasses = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_facet_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_subview_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_import_url = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_verbatim = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_f_view.release();
    _jspx_tagPool_f_loadBundle_var_basename.release();
    _jspx_tagPool_h_outputText_value.release();
    _jspx_tagPool_h_form.release();
    _jspx_tagPool_h_panelGrid_styleClass_columns_columnClasses.release();
    _jspx_tagPool_f_facet_name.release();
    _jspx_tagPool_f_subview_id.release();
    _jspx_tagPool_c_import_url.release();
    _jspx_tagPool_f_verbatim.release();
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

      out.write("<html>\n   \n   \n   \n\n   ");
      if (_jspx_meth_f_view_0(_jspx_page_context))
        return;
      out.write("\n</html>\n");
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

  private boolean _jspx_meth_f_view_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  f:view
    com.sun.faces.taglib.jsf_core.ViewTag _jspx_th_f_view_0 = (com.sun.faces.taglib.jsf_core.ViewTag) _jspx_tagPool_f_view.get(com.sun.faces.taglib.jsf_core.ViewTag.class);
    _jspx_th_f_view_0.setPageContext(_jspx_page_context);
    _jspx_th_f_view_0.setParent(null);
    int _jspx_eval_f_view_0 = _jspx_th_f_view_0.doStartTag();
    if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_f_view_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_f_view_0.doInitBody();
      }
      do {
        out.write("\n\n      <head>               \n         <link href=\"styles.css\" rel=\"stylesheet\" type=\"text/css\"/>\n         ");
        if (_jspx_meth_f_loadBundle_0(_jspx_th_f_view_0, _jspx_page_context))
          return true;
        out.write("\n         <title>");
        if (_jspx_meth_h_outputText_0(_jspx_th_f_view_0, _jspx_page_context))
          return true;
        out.write("</title>\n      </head>\n\n      <body>\n         ");
        if (_jspx_meth_h_form_0(_jspx_th_f_view_0, _jspx_page_context))
          return true;
        out.write("\n      </body>\n   ");
        int evalDoAfterBody = _jspx_th_f_view_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_f_view_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_f_view.reuse(_jspx_th_f_view_0);
    return false;
  }

  private boolean _jspx_meth_f_loadBundle_0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_view_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  f:loadBundle
    com.sun.faces.taglib.jsf_core.LoadBundleTag _jspx_th_f_loadBundle_0 = (com.sun.faces.taglib.jsf_core.LoadBundleTag) _jspx_tagPool_f_loadBundle_var_basename.get(com.sun.faces.taglib.jsf_core.LoadBundleTag.class);
    _jspx_th_f_loadBundle_0.setPageContext(_jspx_page_context);
    _jspx_th_f_loadBundle_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_view_0);
    _jspx_th_f_loadBundle_0.setBasename("com.corejsf.messages");
    _jspx_th_f_loadBundle_0.setVar("msgs");
    int _jspx_eval_f_loadBundle_0 = _jspx_th_f_loadBundle_0.doStartTag();
    if (_jspx_th_f_loadBundle_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_f_loadBundle_var_basename.reuse(_jspx_th_f_loadBundle_0);
    return false;
  }

  private boolean _jspx_meth_h_outputText_0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_view_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_0 = (com.sun.faces.taglib.html_basic.OutputTextTag) _jspx_tagPool_h_outputText_value.get(com.sun.faces.taglib.html_basic.OutputTextTag.class);
    _jspx_th_h_outputText_0.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_view_0);
    _jspx_th_h_outputText_0.setValue("#{msgs.bookWindowTitle}");
    int _jspx_eval_h_outputText_0 = _jspx_th_h_outputText_0.doStartTag();
    if (_jspx_th_h_outputText_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_h_outputText_value.reuse(_jspx_th_h_outputText_0);
    return false;
  }

  private boolean _jspx_meth_h_form_0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_view_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  h:form
    com.sun.faces.taglib.html_basic.FormTag _jspx_th_h_form_0 = (com.sun.faces.taglib.html_basic.FormTag) _jspx_tagPool_h_form.get(com.sun.faces.taglib.html_basic.FormTag.class);
    _jspx_th_h_form_0.setPageContext(_jspx_page_context);
    _jspx_th_h_form_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_view_0);
    int _jspx_eval_h_form_0 = _jspx_th_h_form_0.doStartTag();
    if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n            ");
      if (_jspx_meth_h_panelGrid_0(_jspx_th_h_form_0, _jspx_page_context))
        return true;
      out.write("\n         ");
    }
    if (_jspx_th_h_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_h_form.reuse(_jspx_th_h_form_0);
    return false;
  }

  private boolean _jspx_meth_h_panelGrid_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  h:panelGrid
    com.sun.faces.taglib.html_basic.PanelGridTag _jspx_th_h_panelGrid_0 = (com.sun.faces.taglib.html_basic.PanelGridTag) _jspx_tagPool_h_panelGrid_styleClass_columns_columnClasses.get(com.sun.faces.taglib.html_basic.PanelGridTag.class);
    _jspx_th_h_panelGrid_0.setPageContext(_jspx_page_context);
    _jspx_th_h_panelGrid_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_panelGrid_0.setColumns("2");
    _jspx_th_h_panelGrid_0.setStyleClass("book");
    _jspx_th_h_panelGrid_0.setColumnClasses("menuColumn, chapterColumn");
    int _jspx_eval_h_panelGrid_0 = _jspx_th_h_panelGrid_0.doStartTag();
    if (_jspx_eval_h_panelGrid_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n               ");
      if (_jspx_meth_f_facet_0(_jspx_th_h_panelGrid_0, _jspx_page_context))
        return true;
      out.write("\n\n               ");
      if (_jspx_meth_f_subview_1(_jspx_th_h_panelGrid_0, _jspx_page_context))
        return true;
      out.write("\n\n               ");
      if (_jspx_meth_f_verbatim_0(_jspx_th_h_panelGrid_0, _jspx_page_context))
        return true;
      out.write("\n            ");
    }
    if (_jspx_th_h_panelGrid_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_h_panelGrid_styleClass_columns_columnClasses.reuse(_jspx_th_h_panelGrid_0);
    return false;
  }

  private boolean _jspx_meth_f_facet_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_panelGrid_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  f:facet
    javax.faces.webapp.FacetTag _jspx_th_f_facet_0 = (javax.faces.webapp.FacetTag) _jspx_tagPool_f_facet_name.get(javax.faces.webapp.FacetTag.class);
    _jspx_th_f_facet_0.setPageContext(_jspx_page_context);
    _jspx_th_f_facet_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_panelGrid_0);
    _jspx_th_f_facet_0.setName("header");
    int _jspx_eval_f_facet_0 = _jspx_th_f_facet_0.doStartTag();
    if (_jspx_eval_f_facet_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n                  ");
        if (_jspx_meth_f_subview_0(_jspx_th_f_facet_0, _jspx_page_context))
          return true;
        out.write("\n               ");
        int evalDoAfterBody = _jspx_th_f_facet_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_f_facet_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_f_facet_name.reuse(_jspx_th_f_facet_0);
    return false;
  }

  private boolean _jspx_meth_f_subview_0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_facet_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  f:subview
    com.sun.faces.taglib.jsf_core.SubviewTag _jspx_th_f_subview_0 = (com.sun.faces.taglib.jsf_core.SubviewTag) _jspx_tagPool_f_subview_id.get(com.sun.faces.taglib.jsf_core.SubviewTag.class);
    _jspx_th_f_subview_0.setPageContext(_jspx_page_context);
    _jspx_th_f_subview_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_facet_0);
    _jspx_th_f_subview_0.setId("header");
    int _jspx_eval_f_subview_0 = _jspx_th_f_subview_0.doStartTag();
    if (_jspx_eval_f_subview_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n                     ");
      if (_jspx_meth_c_import_0(_jspx_th_f_subview_0, _jspx_page_context))
        return true;
      out.write("\n                  ");
    }
    if (_jspx_th_f_subview_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_f_subview_id.reuse(_jspx_th_f_subview_0);
    return false;
  }

  private boolean _jspx_meth_c_import_0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_subview_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.el.core.ImportTag _jspx_th_c_import_0 = (org.apache.taglibs.standard.tag.el.core.ImportTag) _jspx_tagPool_c_import_url.get(org.apache.taglibs.standard.tag.el.core.ImportTag.class);
    _jspx_th_c_import_0.setPageContext(_jspx_page_context);
    _jspx_th_c_import_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_subview_0);
    _jspx_th_c_import_0.setUrl("/bookHeader.jsp");
    int[] _jspx_push_body_count_c_import_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_import_0 = _jspx_th_c_import_0.doStartTag();
      if (_jspx_th_c_import_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return true;
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_import_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_import_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_import_0.doFinally();
      _jspx_tagPool_c_import_url.reuse(_jspx_th_c_import_0);
    }
    return false;
  }

  private boolean _jspx_meth_f_subview_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_panelGrid_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  f:subview
    com.sun.faces.taglib.jsf_core.SubviewTag _jspx_th_f_subview_1 = (com.sun.faces.taglib.jsf_core.SubviewTag) _jspx_tagPool_f_subview_id.get(com.sun.faces.taglib.jsf_core.SubviewTag.class);
    _jspx_th_f_subview_1.setPageContext(_jspx_page_context);
    _jspx_th_f_subview_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_panelGrid_0);
    _jspx_th_f_subview_1.setId("menu");
    int _jspx_eval_f_subview_1 = _jspx_th_f_subview_1.doStartTag();
    if (_jspx_eval_f_subview_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n                  ");
      if (_jspx_meth_c_import_1(_jspx_th_f_subview_1, _jspx_page_context))
        return true;
      out.write("\n               ");
    }
    if (_jspx_th_f_subview_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_f_subview_id.reuse(_jspx_th_f_subview_1);
    return false;
  }

  private boolean _jspx_meth_c_import_1(javax.servlet.jsp.tagext.JspTag _jspx_th_f_subview_1, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.el.core.ImportTag _jspx_th_c_import_1 = (org.apache.taglibs.standard.tag.el.core.ImportTag) _jspx_tagPool_c_import_url.get(org.apache.taglibs.standard.tag.el.core.ImportTag.class);
    _jspx_th_c_import_1.setPageContext(_jspx_page_context);
    _jspx_th_c_import_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_subview_1);
    _jspx_th_c_import_1.setUrl("/bookMenu.jsp");
    int[] _jspx_push_body_count_c_import_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_import_1 = _jspx_th_c_import_1.doStartTag();
      if (_jspx_th_c_import_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return true;
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_import_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_import_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_import_1.doFinally();
      _jspx_tagPool_c_import_url.reuse(_jspx_th_c_import_1);
    }
    return false;
  }

  private boolean _jspx_meth_f_verbatim_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_panelGrid_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  f:verbatim
    com.sun.faces.taglib.jsf_core.VerbatimTag _jspx_th_f_verbatim_0 = (com.sun.faces.taglib.jsf_core.VerbatimTag) _jspx_tagPool_f_verbatim.get(com.sun.faces.taglib.jsf_core.VerbatimTag.class);
    _jspx_th_f_verbatim_0.setPageContext(_jspx_page_context);
    _jspx_th_f_verbatim_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_panelGrid_0);
    int _jspx_eval_f_verbatim_0 = _jspx_th_f_verbatim_0.doStartTag();
    if (_jspx_eval_f_verbatim_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_f_verbatim_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_f_verbatim_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_f_verbatim_0.doInitBody();
      }
      do {
        out.write("\n                  ");
        if (_jspx_meth_c_import_2(_jspx_th_f_verbatim_0, _jspx_page_context))
          return true;
        out.write("\n               ");
        int evalDoAfterBody = _jspx_th_f_verbatim_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_f_verbatim_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_f_verbatim_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_f_verbatim.reuse(_jspx_th_f_verbatim_0);
    return false;
  }

  private boolean _jspx_meth_c_import_2(javax.servlet.jsp.tagext.JspTag _jspx_th_f_verbatim_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.el.core.ImportTag _jspx_th_c_import_2 = (org.apache.taglibs.standard.tag.el.core.ImportTag) _jspx_tagPool_c_import_url.get(org.apache.taglibs.standard.tag.el.core.ImportTag.class);
    _jspx_th_c_import_2.setPageContext(_jspx_page_context);
    _jspx_th_c_import_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_verbatim_0);
    _jspx_th_c_import_2.setUrl("/bookContent.jsp");
    int[] _jspx_push_body_count_c_import_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_import_2 = _jspx_th_c_import_2.doStartTag();
      if (_jspx_th_c_import_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return true;
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_import_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_import_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_import_2.doFinally();
      _jspx_tagPool_c_import_url.reuse(_jspx_th_c_import_2);
    }
    return false;
  }
}
