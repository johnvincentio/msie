package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class popup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_view;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_form;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_dataTable_var_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_column;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_outputLink_value_onclick;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_outputText_value;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_f_view = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_form = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_dataTable_var_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_column = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_outputLink_value_onclick = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_outputText_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_f_view.release();
    _jspx_tagPool_h_form.release();
    _jspx_tagPool_h_dataTable_var_value.release();
    _jspx_tagPool_h_column.release();
    _jspx_tagPool_h_outputLink_value_onclick.release();
    _jspx_tagPool_h_outputText_value.release();
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

      out.write("<html>\n   \n   \n\n   ");
      if (_jspx_meth_f_view_0(_jspx_page_context))
        return;
      out.write("\n</html>");
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
        out.write("\n      <head>                  \n         <script type=\"text/javascript\" language=\"JavaScript1.2\">\n            function doSave(value) {\n               var formId = window.openerFormId;\n               opener.document.forms[formId][formId + \":state\"].value = value;\n               window.close();\n            }               \n         </script>\n         <title>Select a state/province</title>\n      </head>\n      <body>\n         ");
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
      if (_jspx_meth_h_dataTable_0(_jspx_th_h_form_0, _jspx_page_context))
        return true;
      out.write("\n         ");
    }
    if (_jspx_th_h_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_h_form.reuse(_jspx_th_h_form_0);
    return false;
  }

  private boolean _jspx_meth_h_dataTable_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  h:dataTable
    com.sun.faces.taglib.html_basic.DataTableTag _jspx_th_h_dataTable_0 = (com.sun.faces.taglib.html_basic.DataTableTag) _jspx_tagPool_h_dataTable_var_value.get(com.sun.faces.taglib.html_basic.DataTableTag.class);
    _jspx_th_h_dataTable_0.setPageContext(_jspx_page_context);
    _jspx_th_h_dataTable_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_dataTable_0.setValue("#{bb.states[param.country]}");
    _jspx_th_h_dataTable_0.setVar("state");
    int _jspx_eval_h_dataTable_0 = _jspx_th_h_dataTable_0.doStartTag();
    if (_jspx_eval_h_dataTable_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n               ");
      if (_jspx_meth_h_column_0(_jspx_th_h_dataTable_0, _jspx_page_context))
        return true;
      out.write("\n            ");
    }
    if (_jspx_th_h_dataTable_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_h_dataTable_var_value.reuse(_jspx_th_h_dataTable_0);
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
      out.write("\n                  ");
      if (_jspx_meth_h_outputLink_0(_jspx_th_h_column_0, _jspx_page_context))
        return true;
      out.write("\n               ");
    }
    if (_jspx_th_h_column_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_h_column.reuse(_jspx_th_h_column_0);
    return false;
  }

  private boolean _jspx_meth_h_outputLink_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_column_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputLink
    com.sun.faces.taglib.html_basic.OutputLinkTag _jspx_th_h_outputLink_0 = (com.sun.faces.taglib.html_basic.OutputLinkTag) _jspx_tagPool_h_outputLink_value_onclick.get(com.sun.faces.taglib.html_basic.OutputLinkTag.class);
    _jspx_th_h_outputLink_0.setPageContext(_jspx_page_context);
    _jspx_th_h_outputLink_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_column_0);
    _jspx_th_h_outputLink_0.setValue("#");
    _jspx_th_h_outputLink_0.setOnclick("doSave('#{state}');");
    int _jspx_eval_h_outputLink_0 = _jspx_th_h_outputLink_0.doStartTag();
    if (_jspx_eval_h_outputLink_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_outputLink_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_outputLink_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_outputLink_0.doInitBody();
      }
      do {
        out.write("\n                     ");
        if (_jspx_meth_h_outputText_0(_jspx_th_h_outputLink_0, _jspx_page_context))
          return true;
        out.write("\n                  ");
        int evalDoAfterBody = _jspx_th_h_outputLink_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_outputLink_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_outputLink_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_h_outputLink_value_onclick.reuse(_jspx_th_h_outputLink_0);
    return false;
  }

  private boolean _jspx_meth_h_outputText_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_outputLink_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_0 = (com.sun.faces.taglib.html_basic.OutputTextTag) _jspx_tagPool_h_outputText_value.get(com.sun.faces.taglib.html_basic.OutputTextTag.class);
    _jspx_th_h_outputText_0.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_outputLink_0);
    _jspx_th_h_outputText_0.setValue("#{state}");
    int _jspx_eval_h_outputText_0 = _jspx_th_h_outputText_0.doStartTag();
    if (_jspx_th_h_outputText_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_h_outputText_value.reuse(_jspx_th_h_outputText_0);
    return false;
  }
}
