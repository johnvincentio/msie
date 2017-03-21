package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_view;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_form;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_selectOneRadio_value_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_selectItem_itemValue_itemLabel;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_inputText_value_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_commandButton_value_onclick;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_commandButton_value_action;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_f_view = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_form = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_selectOneRadio_value_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_selectItem_itemValue_itemLabel = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_inputText_value_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_commandButton_value_onclick = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_commandButton_value_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_f_view.release();
    _jspx_tagPool_h_form.release();
    _jspx_tagPool_h_selectOneRadio_value_id.release();
    _jspx_tagPool_f_selectItem_itemValue_itemLabel.release();
    _jspx_tagPool_h_inputText_value_id.release();
    _jspx_tagPool_h_commandButton_value_onclick.release();
    _jspx_tagPool_h_commandButton_value_action.release();
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
        out.write("\n      <head>                  \n         <script language=\"JavaScript1.1\">\n            function doPopup(source) {\n               country = source.form[source.form.id + \":country\"];\n               for (var i = 0; i < country.length; i++) {\n                  if (country[i].checked) {\n                     popup = window.open(\"popup.faces?country=\" \n                        + country[i].value, \"popup\", \n                        \"height=300,width=200,toolbar=no,menubar=no,\"\n                        + \"scrollbars=yes\");               \n                     popup.openerFormId = source.form.id;\n                     popup.focus();\n                  }\n               }\n            }               \n      </script>\n         <title>A Simple Java Server Faces Application</title>\n      </head>\n      <body>\n         ");
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
      out.write("\n            <table>\n               <tr>\n                  <td>Country:</td>\n                  <td>\n                     ");
      if (_jspx_meth_h_selectOneRadio_0(_jspx_th_h_form_0, _jspx_page_context))
        return true;
      out.write("\n                  </td>\n               </tr>             \n               <tr>\n                  <td>State/Province:</td>\n                  <td>\n                     ");
      if (_jspx_meth_h_inputText_0(_jspx_th_h_form_0, _jspx_page_context))
        return true;
      out.write("\n                  </td>\n                  <td>\n                     ");
      if (_jspx_meth_h_commandButton_0(_jspx_th_h_form_0, _jspx_page_context))
        return true;
      out.write("\n                  </td>\n               </tr>\n            </table>\n            <p>\n               ");
      if (_jspx_meth_h_commandButton_1(_jspx_th_h_form_0, _jspx_page_context))
        return true;
      out.write("\n            </p>\n         ");
    }
    if (_jspx_th_h_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_h_form.reuse(_jspx_th_h_form_0);
    return false;
  }

  private boolean _jspx_meth_h_selectOneRadio_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  h:selectOneRadio
    com.sun.faces.taglib.html_basic.SelectOneRadioTag _jspx_th_h_selectOneRadio_0 = (com.sun.faces.taglib.html_basic.SelectOneRadioTag) _jspx_tagPool_h_selectOneRadio_value_id.get(com.sun.faces.taglib.html_basic.SelectOneRadioTag.class);
    _jspx_th_h_selectOneRadio_0.setPageContext(_jspx_page_context);
    _jspx_th_h_selectOneRadio_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_selectOneRadio_0.setId("country");
    _jspx_th_h_selectOneRadio_0.setValue("#{bb.country}");
    int _jspx_eval_h_selectOneRadio_0 = _jspx_th_h_selectOneRadio_0.doStartTag();
    if (_jspx_eval_h_selectOneRadio_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n                        ");
      if (_jspx_meth_f_selectItem_0(_jspx_th_h_selectOneRadio_0, _jspx_page_context))
        return true;
      out.write("\n                        ");
      if (_jspx_meth_f_selectItem_1(_jspx_th_h_selectOneRadio_0, _jspx_page_context))
        return true;
      out.write("\n                     ");
    }
    if (_jspx_th_h_selectOneRadio_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_h_selectOneRadio_value_id.reuse(_jspx_th_h_selectOneRadio_0);
    return false;
  }

  private boolean _jspx_meth_f_selectItem_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_selectOneRadio_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  f:selectItem
    com.sun.faces.taglib.jsf_core.SelectItemTag _jspx_th_f_selectItem_0 = (com.sun.faces.taglib.jsf_core.SelectItemTag) _jspx_tagPool_f_selectItem_itemValue_itemLabel.get(com.sun.faces.taglib.jsf_core.SelectItemTag.class);
    _jspx_th_f_selectItem_0.setPageContext(_jspx_page_context);
    _jspx_th_f_selectItem_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_selectOneRadio_0);
    _jspx_th_f_selectItem_0.setItemLabel("USA");
    _jspx_th_f_selectItem_0.setItemValue("USA");
    int _jspx_eval_f_selectItem_0 = _jspx_th_f_selectItem_0.doStartTag();
    if (_jspx_th_f_selectItem_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_f_selectItem_itemValue_itemLabel.reuse(_jspx_th_f_selectItem_0);
    return false;
  }

  private boolean _jspx_meth_f_selectItem_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_selectOneRadio_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  f:selectItem
    com.sun.faces.taglib.jsf_core.SelectItemTag _jspx_th_f_selectItem_1 = (com.sun.faces.taglib.jsf_core.SelectItemTag) _jspx_tagPool_f_selectItem_itemValue_itemLabel.get(com.sun.faces.taglib.jsf_core.SelectItemTag.class);
    _jspx_th_f_selectItem_1.setPageContext(_jspx_page_context);
    _jspx_th_f_selectItem_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_selectOneRadio_0);
    _jspx_th_f_selectItem_1.setItemLabel("Canada");
    _jspx_th_f_selectItem_1.setItemValue("Canada");
    int _jspx_eval_f_selectItem_1 = _jspx_th_f_selectItem_1.doStartTag();
    if (_jspx_th_f_selectItem_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_f_selectItem_itemValue_itemLabel.reuse(_jspx_th_f_selectItem_1);
    return false;
  }

  private boolean _jspx_meth_h_inputText_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  h:inputText
    com.sun.faces.taglib.html_basic.InputTextTag _jspx_th_h_inputText_0 = (com.sun.faces.taglib.html_basic.InputTextTag) _jspx_tagPool_h_inputText_value_id.get(com.sun.faces.taglib.html_basic.InputTextTag.class);
    _jspx_th_h_inputText_0.setPageContext(_jspx_page_context);
    _jspx_th_h_inputText_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_inputText_0.setId("state");
    _jspx_th_h_inputText_0.setValue("#{bb.state}");
    int _jspx_eval_h_inputText_0 = _jspx_th_h_inputText_0.doStartTag();
    if (_jspx_th_h_inputText_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_h_inputText_value_id.reuse(_jspx_th_h_inputText_0);
    return false;
  }

  private boolean _jspx_meth_h_commandButton_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  h:commandButton
    com.sun.faces.taglib.html_basic.CommandButtonTag _jspx_th_h_commandButton_0 = (com.sun.faces.taglib.html_basic.CommandButtonTag) _jspx_tagPool_h_commandButton_value_onclick.get(com.sun.faces.taglib.html_basic.CommandButtonTag.class);
    _jspx_th_h_commandButton_0.setPageContext(_jspx_page_context);
    _jspx_th_h_commandButton_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_commandButton_0.setValue("...");
    _jspx_th_h_commandButton_0.setOnclick("doPopup(this); return false;");
    int _jspx_eval_h_commandButton_0 = _jspx_th_h_commandButton_0.doStartTag();
    if (_jspx_th_h_commandButton_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_h_commandButton_value_onclick.reuse(_jspx_th_h_commandButton_0);
    return false;
  }

  private boolean _jspx_meth_h_commandButton_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  h:commandButton
    com.sun.faces.taglib.html_basic.CommandButtonTag _jspx_th_h_commandButton_1 = (com.sun.faces.taglib.html_basic.CommandButtonTag) _jspx_tagPool_h_commandButton_value_action.get(com.sun.faces.taglib.html_basic.CommandButtonTag.class);
    _jspx_th_h_commandButton_1.setPageContext(_jspx_page_context);
    _jspx_th_h_commandButton_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_commandButton_1.setValue("Next");
    _jspx_th_h_commandButton_1.setAction("next");
    int _jspx_eval_h_commandButton_1 = _jspx_th_h_commandButton_1.doStartTag();
    if (_jspx_th_h_commandButton_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_h_commandButton_value_action.reuse(_jspx_th_h_commandButton_1);
    return false;
  }
}
