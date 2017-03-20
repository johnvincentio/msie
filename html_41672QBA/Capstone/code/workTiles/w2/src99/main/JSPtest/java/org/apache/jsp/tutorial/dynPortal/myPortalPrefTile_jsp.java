package org.apache.jsp.tutorial.dynPortal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class myPortalPrefTile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(2);
    _jspx_dependants.add("/WEB-INF/struts-tiles.tld");
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_property_multiple;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_options_property;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_button_value_property_onclick;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_size_property_multiple;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_options_property_labelProperty;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_submit_value_property_onclick;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_form_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_select_property_multiple = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_options_property = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_button_value_property_onclick = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_select_size_property_multiple = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_options_property_labelProperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_submit_value_property_onclick = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_form_action.release();
    _jspx_tagPool_html_select_property_multiple.release();
    _jspx_tagPool_html_options_property.release();
    _jspx_tagPool_html_button_value_property_onclick.release();
    _jspx_tagPool_html_select_size_property_multiple.release();
    _jspx_tagPool_html_options_property_labelProperty.release();
    _jspx_tagPool_html_submit_value_property_onclick.release();
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

      out.write("\r\n\r\n\r\n\r\n<script language=\"javaScript1.2\">\r\nfunction selectAll( )\r\n{\r\nfor( j=0; j<selectAll.arguments.length; j++ )\r\n  {\r\n  col1 = selectAll.arguments[j];\r\n  for(i=0; i<col1.options.length; i++ )\r\n    {\r\n\tcol1.options[ i ].selected = true;\r\n\t}\r\n  } // end loop\r\n  return true;\r\n}\r\n\r\nfunction move( col1, col2)\r\n{\r\n  toMove = col1.options[ col1.selectedIndex ];\r\n  opt = new Option( toMove.text, toMove.value, false, false );\r\n  col1.options[col1.selectedIndex ] = null;\r\n  col2.options[col2.length] = opt;\r\n  return true;\r\n}\r\n\r\nfunction remove( col1)\r\n{\r\n  col1.options[ col1.selectedIndex ] = null;\r\n  return true;\r\n}\r\n\r\nfunction up( col1 )\r\n{\r\n  index = col1.selectedIndex;\r\n  if( index <= 0 )\r\n    return true;\r\n\t\r\n  toMove = col1.options[ index ];\r\n  opt = new Option( toMove.text, toMove.value, false, false );\r\n  col1.options[index] = col1.options[index-1];\r\n  col1.options[index-1] = opt;\r\n  return true;\r\n}\r\n\r\nfunction down( col1 )\r\n{\r\n  index = col1.selectedIndex;\r\n  if( index+1 >=  col1.options.length )\r\n    return true;\r\n");
      out.write("\t\r\n  toMove = col1.options[ index ];\r\n  opt = new Option( toMove.text, toMove.value, false, false );\r\n  col1.options[index] = col1.options[index+1];\r\n  col1.options[index+1] = opt;\r\n  return true;\r\n}\r\n\r\n</script>\r\n\r\n\r\n");
      if (_jspx_meth_html_form_0(_jspx_page_context))
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

  private boolean _jspx_meth_html_form_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_form_0.setPageContext(_jspx_page_context);
    _jspx_th_html_form_0.setParent(null);
    _jspx_th_html_form_0.setAction("/actions/myPortalPrefs.do");
    int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
    if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n\r\n\r\n  \r\n  ");
        if (_jspx_meth_html_select_0(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\r\n\r\n  ");
        if (_jspx_meth_html_button_0(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\r\n  <br>\r\n  \r\n  <table>\r\n  <tr>\r\n    <td>\r\n\t  ");
        if (_jspx_meth_html_select_1(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\r\n\t</td>\r\n\t<td>\r\n\t  ");
        if (_jspx_meth_html_select_2(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\r\n\t</td>\r\n  </tr>\r\n  <tr>\r\n  <td align=\"center\">\r\n  ");
        if (_jspx_meth_html_button_1(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\r\n  ");
        if (_jspx_meth_html_button_2(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\r\n  ");
        if (_jspx_meth_html_button_3(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\r\n  ");
        if (_jspx_meth_html_button_4(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\r\n  </td>\r\n  <td align=\"center\">\r\n  ");
        if (_jspx_meth_html_button_5(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\r\n  ");
        if (_jspx_meth_html_button_6(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\r\n  ");
        if (_jspx_meth_html_button_7(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\r\n  ");
        if (_jspx_meth_html_button_8(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\r\n  </td>\r\n  </tr>\r\n  <tr>\r\n    <td colspan=\"2\"  align=\"center\">\r\n\t  \r\n      ");
        if (_jspx_meth_html_submit_0(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\r\n\t</td>\r\n  </tr>\r\n  </table>\r\n  \r\n  \r\n\r\n  \r\n");
        int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_form_action.reuse(_jspx_th_html_form_0);
    return false;
  }

  private boolean _jspx_meth_html_select_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_0 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_property_multiple.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_0.setPageContext(_jspx_page_context);
    _jspx_th_html_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_select_0.setProperty("remaining");
    _jspx_th_html_select_0.setMultiple("true");
    int _jspx_eval_html_select_0 = _jspx_th_html_select_0.doStartTag();
    if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_select_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_select_0.doInitBody();
      }
      do {
        out.write("\r\n    ");
        if (_jspx_meth_html_options_0(_jspx_th_html_select_0, _jspx_page_context))
          return true;
        out.write("\r\n  ");
        int evalDoAfterBody = _jspx_th_html_select_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_select_property_multiple.reuse(_jspx_th_html_select_0);
    return false;
  }

  private boolean _jspx_meth_html_options_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_options_0 = (org.apache.struts.taglib.html.OptionsTag) _jspx_tagPool_html_options_property.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_options_0.setPageContext(_jspx_page_context);
    _jspx_th_html_options_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_0);
    _jspx_th_html_options_0.setProperty("choices");
    int _jspx_eval_html_options_0 = _jspx_th_html_options_0.doStartTag();
    if (_jspx_th_html_options_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_options_property.reuse(_jspx_th_html_options_0);
    return false;
  }

  private boolean _jspx_meth_html_button_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  html:button
    org.apache.struts.taglib.html.ButtonTag _jspx_th_html_button_0 = (org.apache.struts.taglib.html.ButtonTag) _jspx_tagPool_html_button_value_property_onclick.get(org.apache.struts.taglib.html.ButtonTag.class);
    _jspx_th_html_button_0.setPageContext(_jspx_page_context);
    _jspx_th_html_button_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_button_0.setProperty("v");
    _jspx_th_html_button_0.setValue("v");
    _jspx_th_html_button_0.setOnclick("move(remaining,l0);return true;");
    int _jspx_eval_html_button_0 = _jspx_th_html_button_0.doStartTag();
    if (_jspx_th_html_button_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_button_value_property_onclick.reuse(_jspx_th_html_button_0);
    return false;
  }

  private boolean _jspx_meth_html_select_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_1 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_size_property_multiple.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_1.setPageContext(_jspx_page_context);
    _jspx_th_html_select_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_select_1.setProperty("l0");
    _jspx_th_html_select_1.setMultiple("true");
    _jspx_th_html_select_1.setSize("10");
    int _jspx_eval_html_select_1 = _jspx_th_html_select_1.doStartTag();
    if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_select_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_select_1.doInitBody();
      }
      do {
        out.write("\r\n\t    ");
        if (_jspx_meth_html_options_1(_jspx_th_html_select_1, _jspx_page_context))
          return true;
        out.write("\r\n\t  ");
        int evalDoAfterBody = _jspx_th_html_select_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_select_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_select_size_property_multiple.reuse(_jspx_th_html_select_1);
    return false;
  }

  private boolean _jspx_meth_html_options_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_1, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_options_1 = (org.apache.struts.taglib.html.OptionsTag) _jspx_tagPool_html_options_property_labelProperty.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_options_1.setPageContext(_jspx_page_context);
    _jspx_th_html_options_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_1);
    _jspx_th_html_options_1.setProperty("col[0]");
    _jspx_th_html_options_1.setLabelProperty("colLabels[0]");
    int _jspx_eval_html_options_1 = _jspx_th_html_options_1.doStartTag();
    if (_jspx_th_html_options_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_options_property_labelProperty.reuse(_jspx_th_html_options_1);
    return false;
  }

  private boolean _jspx_meth_html_select_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_2 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_size_property_multiple.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_2.setPageContext(_jspx_page_context);
    _jspx_th_html_select_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_select_2.setProperty("l1");
    _jspx_th_html_select_2.setMultiple("true");
    _jspx_th_html_select_2.setSize("10");
    int _jspx_eval_html_select_2 = _jspx_th_html_select_2.doStartTag();
    if (_jspx_eval_html_select_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_select_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_select_2.doInitBody();
      }
      do {
        out.write("\r\n\t    ");
        if (_jspx_meth_html_options_2(_jspx_th_html_select_2, _jspx_page_context))
          return true;
        out.write("\r\n\t  ");
        int evalDoAfterBody = _jspx_th_html_select_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_select_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_select_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_select_size_property_multiple.reuse(_jspx_th_html_select_2);
    return false;
  }

  private boolean _jspx_meth_html_options_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_2, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_options_2 = (org.apache.struts.taglib.html.OptionsTag) _jspx_tagPool_html_options_property_labelProperty.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_options_2.setPageContext(_jspx_page_context);
    _jspx_th_html_options_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_2);
    _jspx_th_html_options_2.setProperty("col[1]");
    _jspx_th_html_options_2.setLabelProperty("colLabels[1]");
    int _jspx_eval_html_options_2 = _jspx_th_html_options_2.doStartTag();
    if (_jspx_th_html_options_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_options_property_labelProperty.reuse(_jspx_th_html_options_2);
    return false;
  }

  private boolean _jspx_meth_html_button_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  html:button
    org.apache.struts.taglib.html.ButtonTag _jspx_th_html_button_1 = (org.apache.struts.taglib.html.ButtonTag) _jspx_tagPool_html_button_value_property_onclick.get(org.apache.struts.taglib.html.ButtonTag.class);
    _jspx_th_html_button_1.setPageContext(_jspx_page_context);
    _jspx_th_html_button_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_button_1.setProperty("right");
    _jspx_th_html_button_1.setValue("^");
    _jspx_th_html_button_1.setOnclick("up(l0);return true;");
    int _jspx_eval_html_button_1 = _jspx_th_html_button_1.doStartTag();
    if (_jspx_th_html_button_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_button_value_property_onclick.reuse(_jspx_th_html_button_1);
    return false;
  }

  private boolean _jspx_meth_html_button_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  html:button
    org.apache.struts.taglib.html.ButtonTag _jspx_th_html_button_2 = (org.apache.struts.taglib.html.ButtonTag) _jspx_tagPool_html_button_value_property_onclick.get(org.apache.struts.taglib.html.ButtonTag.class);
    _jspx_th_html_button_2.setPageContext(_jspx_page_context);
    _jspx_th_html_button_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_button_2.setProperty("right");
    _jspx_th_html_button_2.setValue("del");
    _jspx_th_html_button_2.setOnclick("remove(l0);return true;");
    int _jspx_eval_html_button_2 = _jspx_th_html_button_2.doStartTag();
    if (_jspx_th_html_button_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_button_value_property_onclick.reuse(_jspx_th_html_button_2);
    return false;
  }

  private boolean _jspx_meth_html_button_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  html:button
    org.apache.struts.taglib.html.ButtonTag _jspx_th_html_button_3 = (org.apache.struts.taglib.html.ButtonTag) _jspx_tagPool_html_button_value_property_onclick.get(org.apache.struts.taglib.html.ButtonTag.class);
    _jspx_th_html_button_3.setPageContext(_jspx_page_context);
    _jspx_th_html_button_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_button_3.setProperty("right");
    _jspx_th_html_button_3.setValue("v");
    _jspx_th_html_button_3.setOnclick("down(l0);return true;");
    int _jspx_eval_html_button_3 = _jspx_th_html_button_3.doStartTag();
    if (_jspx_th_html_button_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_button_value_property_onclick.reuse(_jspx_th_html_button_3);
    return false;
  }

  private boolean _jspx_meth_html_button_4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  html:button
    org.apache.struts.taglib.html.ButtonTag _jspx_th_html_button_4 = (org.apache.struts.taglib.html.ButtonTag) _jspx_tagPool_html_button_value_property_onclick.get(org.apache.struts.taglib.html.ButtonTag.class);
    _jspx_th_html_button_4.setPageContext(_jspx_page_context);
    _jspx_th_html_button_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_button_4.setProperty("left");
    _jspx_th_html_button_4.setValue(">");
    _jspx_th_html_button_4.setOnclick("move(l0,l1);return false;");
    int _jspx_eval_html_button_4 = _jspx_th_html_button_4.doStartTag();
    if (_jspx_th_html_button_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_button_value_property_onclick.reuse(_jspx_th_html_button_4);
    return false;
  }

  private boolean _jspx_meth_html_button_5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  html:button
    org.apache.struts.taglib.html.ButtonTag _jspx_th_html_button_5 = (org.apache.struts.taglib.html.ButtonTag) _jspx_tagPool_html_button_value_property_onclick.get(org.apache.struts.taglib.html.ButtonTag.class);
    _jspx_th_html_button_5.setPageContext(_jspx_page_context);
    _jspx_th_html_button_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_button_5.setProperty("right");
    _jspx_th_html_button_5.setValue("<");
    _jspx_th_html_button_5.setOnclick("move(l1,l0);return true;");
    int _jspx_eval_html_button_5 = _jspx_th_html_button_5.doStartTag();
    if (_jspx_th_html_button_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_button_value_property_onclick.reuse(_jspx_th_html_button_5);
    return false;
  }

  private boolean _jspx_meth_html_button_6(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  html:button
    org.apache.struts.taglib.html.ButtonTag _jspx_th_html_button_6 = (org.apache.struts.taglib.html.ButtonTag) _jspx_tagPool_html_button_value_property_onclick.get(org.apache.struts.taglib.html.ButtonTag.class);
    _jspx_th_html_button_6.setPageContext(_jspx_page_context);
    _jspx_th_html_button_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_button_6.setProperty("right");
    _jspx_th_html_button_6.setValue("^");
    _jspx_th_html_button_6.setOnclick("up(l1);return true;");
    int _jspx_eval_html_button_6 = _jspx_th_html_button_6.doStartTag();
    if (_jspx_th_html_button_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_button_value_property_onclick.reuse(_jspx_th_html_button_6);
    return false;
  }

  private boolean _jspx_meth_html_button_7(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  html:button
    org.apache.struts.taglib.html.ButtonTag _jspx_th_html_button_7 = (org.apache.struts.taglib.html.ButtonTag) _jspx_tagPool_html_button_value_property_onclick.get(org.apache.struts.taglib.html.ButtonTag.class);
    _jspx_th_html_button_7.setPageContext(_jspx_page_context);
    _jspx_th_html_button_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_button_7.setProperty("right");
    _jspx_th_html_button_7.setValue("del");
    _jspx_th_html_button_7.setOnclick("remove(l1);return true;");
    int _jspx_eval_html_button_7 = _jspx_th_html_button_7.doStartTag();
    if (_jspx_th_html_button_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_button_value_property_onclick.reuse(_jspx_th_html_button_7);
    return false;
  }

  private boolean _jspx_meth_html_button_8(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  html:button
    org.apache.struts.taglib.html.ButtonTag _jspx_th_html_button_8 = (org.apache.struts.taglib.html.ButtonTag) _jspx_tagPool_html_button_value_property_onclick.get(org.apache.struts.taglib.html.ButtonTag.class);
    _jspx_th_html_button_8.setPageContext(_jspx_page_context);
    _jspx_th_html_button_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_button_8.setProperty("right");
    _jspx_th_html_button_8.setValue("v");
    _jspx_th_html_button_8.setOnclick("down(l1);return true;");
    int _jspx_eval_html_button_8 = _jspx_th_html_button_8.doStartTag();
    if (_jspx_th_html_button_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_button_value_property_onclick.reuse(_jspx_th_html_button_8);
    return false;
  }

  private boolean _jspx_meth_html_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_submit_0 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_html_submit_value_property_onclick.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_html_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_submit_0.setProperty("validate");
    _jspx_th_html_submit_0.setValue("validate");
    _jspx_th_html_submit_0.setOnclick("selectAll(l0, l1);return true;");
    int _jspx_eval_html_submit_0 = _jspx_th_html_submit_0.doStartTag();
    if (_jspx_th_html_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_submit_value_property_onclick.reuse(_jspx_th_html_submit_0);
    return false;
  }
}
