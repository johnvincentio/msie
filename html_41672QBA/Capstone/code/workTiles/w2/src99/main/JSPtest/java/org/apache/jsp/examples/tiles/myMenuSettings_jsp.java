package org.apache.jsp.examples.tiles;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class myMenuSettings_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(2);
    _jspx_dependants.add("/WEB-INF/struts-tiles.tld");
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tiles_importAttribute_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_property_multiple;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_options_property_labelProperty_collection;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_button_value_property_onclick;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_size_property_multiple;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_submit_value_property_onclick;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_tiles_importAttribute_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_select_property_multiple = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_options_property_labelProperty_collection = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_button_value_property_onclick = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_select_size_property_multiple = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_submit_value_property_onclick = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_tiles_importAttribute_name.release();
    _jspx_tagPool_html_form_action.release();
    _jspx_tagPool_html_select_property_multiple.release();
    _jspx_tagPool_html_options_property_labelProperty_collection.release();
    _jspx_tagPool_html_button_value_property_onclick.release();
    _jspx_tagPool_html_select_size_property_multiple.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n<script language=\"javaScript1.2\">\r\nfunction selectAll( )\r\n{\r\nfor( j=0; j<selectAll.arguments.length; j++ )\r\n  {\r\n  col1 = selectAll.arguments[j];\r\n  for(i=0; i<col1.options.length; i++ )\r\n    {\r\n\tcol1.options[ i ].selected = true;\r\n\t}\r\n  } // end loop\r\n  return true;\r\n}\r\n\r\nfunction move( col1, col2)\r\n{\r\n  toMove = col1.options[ col1.selectedIndex ];\r\n  opt = new Option( toMove.text, toMove.value, false, false );\r\n  col1.options[col1.selectedIndex ] = null;\r\n  col2.options[col2.length] = opt;\r\n  col2.selectedIndex = col2.length-1;\r\n  return true;\r\n}\r\n\r\nfunction remove( col1)\r\n{\r\n  col1.options[ col1.selectedIndex ] = null;\r\n  return true;\r\n}\r\n\r\nfunction up( col1 )\r\n{\r\n  index = col1.selectedIndex;\r\n  if( index <= 0 )\r\n    return true;\r\n\t\r\n  toMoveX = col1.options[ index -1 ];\r\n  toMoveY = col1.options[ index ];\r\n  optX = new Option( toMoveX.text, toMoveX.value, false, false );\r\n  optY = new Option( toMoveY.text, toMoveY.value, false, false );\r\n  col1.options[index] = optX;\r\n  col1.options[index-1] = optY;\r\n");
      out.write("  col1.selectedIndex = index-1;\r\n  return true;\r\n}\r\n\r\nfunction down( col1 )\r\n{\r\n  index = col1.selectedIndex;\r\n  if( index+1 >=  col1.options.length )\r\n    return true;\r\n\t\r\n  toMoveX = col1.options[ index ];\r\n  toMoveY = col1.options[ index + 1 ];\r\n  optX = new Option( toMoveX.text, toMoveX.value, false, false );\r\n  optY = new Option( toMoveY.text, toMoveY.value, false, false );\r\n  col1.options[index] = optY;\r\n  col1.options[index+1] = optX;\r\n  col1.selectedIndex = index+1;\r\n\r\n  return true;\r\n}\r\n\r\n</script>\r\n\r\n");
      if (_jspx_meth_tiles_importAttribute_0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_tiles_importAttribute_1(_jspx_page_context))
        return;
      out.write("\r\n\r\n");
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

  private boolean _jspx_meth_tiles_importAttribute_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:importAttribute
    org.apache.struts.taglib.tiles.ImportAttributeTag _jspx_th_tiles_importAttribute_0 = (org.apache.struts.taglib.tiles.ImportAttributeTag) _jspx_tagPool_tiles_importAttribute_name.get(org.apache.struts.taglib.tiles.ImportAttributeTag.class);
    _jspx_th_tiles_importAttribute_0.setPageContext(_jspx_page_context);
    _jspx_th_tiles_importAttribute_0.setParent(null);
    _jspx_th_tiles_importAttribute_0.setName("catalog");
    int _jspx_eval_tiles_importAttribute_0 = _jspx_th_tiles_importAttribute_0.doStartTag();
    if (_jspx_th_tiles_importAttribute_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_importAttribute_name.reuse(_jspx_th_tiles_importAttribute_0);
    return false;
  }

  private boolean _jspx_meth_tiles_importAttribute_1(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:importAttribute
    org.apache.struts.taglib.tiles.ImportAttributeTag _jspx_th_tiles_importAttribute_1 = (org.apache.struts.taglib.tiles.ImportAttributeTag) _jspx_tagPool_tiles_importAttribute_name.get(org.apache.struts.taglib.tiles.ImportAttributeTag.class);
    _jspx_th_tiles_importAttribute_1.setPageContext(_jspx_page_context);
    _jspx_th_tiles_importAttribute_1.setParent(null);
    _jspx_th_tiles_importAttribute_1.setName("userItems");
    int _jspx_eval_tiles_importAttribute_1 = _jspx_th_tiles_importAttribute_1.doStartTag();
    if (_jspx_th_tiles_importAttribute_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_importAttribute_name.reuse(_jspx_th_tiles_importAttribute_1);
    return false;
  }

  private boolean _jspx_meth_html_form_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_form_0.setPageContext(_jspx_page_context);
    _jspx_th_html_form_0.setParent(null);
    _jspx_th_html_form_0.setAction("/myMenuSettings.do");
    int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
    if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n \r\n\t  <ul>\r\n\t    <li>Choose an item from \"Items Choice\" colomn, and add it to \"my Items\" using the '>' button.</li>\r\n\t\t<li>You can also rearange your Menu by using appropriate buttons : '^', 'V' and 'delete'</li>\r\n\t\t<li>Validate your menu by clicking on 'validate' button. Load any page and check your menu !</li>\r\n\t  </ul>\r\n  <table align=\"center\">\r\n  <tr>\r\n    <td align=\"right\">\r\n\t  Items Choice\r\n\t  <br>\r\n\t  ");
        if (_jspx_meth_html_select_0(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\r\n\t</td>\r\n\t<td>\r\n\t  ");
        if (_jspx_meth_html_button_0(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\r\n\t</td>\r\n    <td align=\"left\">\r\n\t  My Items\r\n\t  <br>\r\n\t  ");
        if (_jspx_meth_html_select_1(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\r\n\t  <br>\r\n      <div align=\"center\">\t  \r\n\t  ");
        if (_jspx_meth_html_button_1(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\r\n\t  ");
        if (_jspx_meth_html_button_2(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\r\n\t  ");
        if (_jspx_meth_html_button_3(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("\r\n\t  <br>\r\n      ");
        if (_jspx_meth_html_submit_0(_jspx_th_html_form_0, _jspx_page_context))
          return true;
        out.write("</div>\r\n\t</td>\r\n  </tr>\r\n  </table> \r\n");
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
    _jspx_th_html_select_0.setProperty("selectedChoices");
    _jspx_th_html_select_0.setMultiple("true");
    int _jspx_eval_html_select_0 = _jspx_th_html_select_0.doStartTag();
    if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_select_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_select_0.doInitBody();
      }
      do {
        out.write("\r\n\t    ");
        if (_jspx_meth_html_options_0(_jspx_th_html_select_0, _jspx_page_context))
          return true;
        out.write("\r\n\t  ");
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
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_options_0 = (org.apache.struts.taglib.html.OptionsTag) _jspx_tagPool_html_options_property_labelProperty_collection.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_options_0.setPageContext(_jspx_page_context);
    _jspx_th_html_options_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_0);
    _jspx_th_html_options_0.setCollection("catalog");
    _jspx_th_html_options_0.setProperty("link");
    _jspx_th_html_options_0.setLabelProperty("value");
    int _jspx_eval_html_options_0 = _jspx_th_html_options_0.doStartTag();
    if (_jspx_th_html_options_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_options_property_labelProperty_collection.reuse(_jspx_th_html_options_0);
    return false;
  }

  private boolean _jspx_meth_html_button_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  html:button
    org.apache.struts.taglib.html.ButtonTag _jspx_th_html_button_0 = (org.apache.struts.taglib.html.ButtonTag) _jspx_tagPool_html_button_value_property_onclick.get(org.apache.struts.taglib.html.ButtonTag.class);
    _jspx_th_html_button_0.setPageContext(_jspx_page_context);
    _jspx_th_html_button_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_button_0.setProperty(">");
    _jspx_th_html_button_0.setValue(">");
    _jspx_th_html_button_0.setOnclick("move(selectedChoices,selected);return true;");
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
    _jspx_th_html_select_1.setProperty("selected");
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
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_options_1 = (org.apache.struts.taglib.html.OptionsTag) _jspx_tagPool_html_options_property_labelProperty_collection.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_options_1.setPageContext(_jspx_page_context);
    _jspx_th_html_options_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_1);
    _jspx_th_html_options_1.setCollection("userItems");
    _jspx_th_html_options_1.setProperty("link");
    _jspx_th_html_options_1.setLabelProperty("value");
    int _jspx_eval_html_options_1 = _jspx_th_html_options_1.doStartTag();
    if (_jspx_th_html_options_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_options_property_labelProperty_collection.reuse(_jspx_th_html_options_1);
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
    _jspx_th_html_button_1.setOnclick("up(selected);return true;");
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
    _jspx_th_html_button_2.setOnclick("remove(selected);return true;");
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
    _jspx_th_html_button_3.setOnclick("down(selected);return true;");
    int _jspx_eval_html_button_3 = _jspx_th_html_button_3.doStartTag();
    if (_jspx_th_html_button_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_button_value_property_onclick.reuse(_jspx_th_html_button_3);
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
    _jspx_th_html_submit_0.setOnclick("selectAll(selected);return true;");
    int _jspx_eval_html_submit_0 = _jspx_th_html_submit_0.doStartTag();
    if (_jspx_th_html_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_submit_value_property_onclick.reuse(_jspx_th_html_submit_0);
    return false;
  }
}
