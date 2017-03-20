package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bookMenu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_dataTable_var_value_styleClass_columnClasses;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_column;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_commandLink;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_outputText_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_param_value_name;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_h_dataTable_var_value_styleClass_columnClasses = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_column = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_commandLink = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_outputText_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_param_value_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_h_dataTable_var_value_styleClass_columnClasses.release();
    _jspx_tagPool_h_column.release();
    _jspx_tagPool_h_commandLink.release();
    _jspx_tagPool_h_outputText_value.release();
    _jspx_tagPool_f_param_value_name.release();
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

      out.write('\n');
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_h_dataTable_0(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_h_dataTable_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  h:dataTable
    com.sun.faces.taglib.html_basic.DataTableTag _jspx_th_h_dataTable_0 = (com.sun.faces.taglib.html_basic.DataTableTag) _jspx_tagPool_h_dataTable_var_value_styleClass_columnClasses.get(com.sun.faces.taglib.html_basic.DataTableTag.class);
    _jspx_th_h_dataTable_0.setPageContext(_jspx_page_context);
    _jspx_th_h_dataTable_0.setParent(null);
    _jspx_th_h_dataTable_0.setValue("#{book.chapterKeys}");
    _jspx_th_h_dataTable_0.setVar("chapterKey");
    _jspx_th_h_dataTable_0.setStyleClass("links");
    _jspx_th_h_dataTable_0.setColumnClasses("linksColumn");
    int _jspx_eval_h_dataTable_0 = _jspx_th_h_dataTable_0.doStartTag();
    if (_jspx_eval_h_dataTable_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n   ");
      if (_jspx_meth_h_column_0(_jspx_th_h_dataTable_0, _jspx_page_context))
        return true;
      out.write('\n');
    }
    if (_jspx_th_h_dataTable_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_h_dataTable_var_value_styleClass_columnClasses.reuse(_jspx_th_h_dataTable_0);
    return false;
  }

  private boolean _jspx_meth_h_column_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_dataTable_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  h:column
    com.sun.faces.taglib.html_basic.ColumnTag _jspx_th_h_column_0 = (com.sun.faces.taglib.html_basic.ColumnTag) _jspx_tagPool_h_column.get(com.sun.faces.taglib.html_basic.ColumnTag.class);
    _jspx_th_h_column_0.setPageContext(_jspx_page_context);
    _jspx_th_h_column_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_dataTable_0);
    int _jspx_eval_h_column_0 = _jspx_th_h_column_0.doStartTag();
    if (_jspx_eval_h_column_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n      ");
      if (_jspx_meth_h_commandLink_0(_jspx_th_h_column_0, _jspx_page_context))
        return true;
      out.write("\n   ");
    }
    if (_jspx_th_h_column_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_h_column.reuse(_jspx_th_h_column_0);
    return false;
  }

  private boolean _jspx_meth_h_commandLink_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  h:commandLink
    com.sun.faces.taglib.html_basic.CommandLinkTag _jspx_th_h_commandLink_0 = (com.sun.faces.taglib.html_basic.CommandLinkTag) _jspx_tagPool_h_commandLink.get(com.sun.faces.taglib.html_basic.CommandLinkTag.class);
    _jspx_th_h_commandLink_0.setPageContext(_jspx_page_context);
    _jspx_th_h_commandLink_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_0);
    int _jspx_eval_h_commandLink_0 = _jspx_th_h_commandLink_0.doStartTag();
    if (_jspx_eval_h_commandLink_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_commandLink_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_commandLink_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_commandLink_0.doInitBody();
      }
      do {
        out.write("\n         ");
        if (_jspx_meth_h_outputText_0(_jspx_th_h_commandLink_0, _jspx_page_context))
          return true;
        out.write("\n         ");
        if (_jspx_meth_f_param_0(_jspx_th_h_commandLink_0, _jspx_page_context))
          return true;
        out.write("\n      ");
        int evalDoAfterBody = _jspx_th_h_commandLink_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_commandLink_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_commandLink_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_h_commandLink.reuse(_jspx_th_h_commandLink_0);
    return false;
  }

  private boolean _jspx_meth_h_outputText_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_commandLink_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_0 = (com.sun.faces.taglib.html_basic.OutputTextTag) _jspx_tagPool_h_outputText_value.get(com.sun.faces.taglib.html_basic.OutputTextTag.class);
    _jspx_th_h_outputText_0.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_commandLink_0);
    _jspx_th_h_outputText_0.setValue("#{msgs[chapterKey]}");
    int _jspx_eval_h_outputText_0 = _jspx_th_h_outputText_0.doStartTag();
    if (_jspx_th_h_outputText_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_h_outputText_value.reuse(_jspx_th_h_outputText_0);
    return false;
  }

  private boolean _jspx_meth_f_param_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_commandLink_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  f:param
    com.sun.faces.taglib.jsf_core.ParameterTag _jspx_th_f_param_0 = (com.sun.faces.taglib.jsf_core.ParameterTag) _jspx_tagPool_f_param_value_name.get(com.sun.faces.taglib.jsf_core.ParameterTag.class);
    _jspx_th_f_param_0.setPageContext(_jspx_page_context);
    _jspx_th_f_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_commandLink_0);
    _jspx_th_f_param_0.setName("chapter");
    _jspx_th_f_param_0.setValue("#{chapterKey}");
    int _jspx_eval_f_param_0 = _jspx_th_f_param_0.doStartTag();
    if (_jspx_th_f_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_f_param_value_name.reuse(_jspx_th_f_param_0);
    return false;
  }
}
