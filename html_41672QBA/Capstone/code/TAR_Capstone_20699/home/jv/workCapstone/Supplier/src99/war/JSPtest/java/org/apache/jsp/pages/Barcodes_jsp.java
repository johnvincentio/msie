package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jvcommon.Debug;
import jvcommon.Debug;
import jvapp.JVParameters;
import jvapp.JVAttributes;
import java.util.*;

public final class Barcodes_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(8);
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/struts-logic.tld");
    _jspx_dependants.add("/pages/includes/Header.jsp");
    _jspx_dependants.add("/pages/includes/MainMenu.jsp");
    _jspx_dependants.add("/pages/includes/Barcodes.jsp");
    _jspx_dependants.add("/pages/includes/Footer.jsp");
    _jspx_dependants.add("/pages/Parameters.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_html_locale;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_message_key;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_base;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_img_page_border_align;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_link_page;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_notPresent_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_present_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_errors;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_define_type_scope_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_iterate_type_property_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_define_property_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_value_property;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_img_src_border_align;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_submit_property;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_html_locale = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_message_key = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_base = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_img_page_border_align = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_link_page = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_notPresent_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_present_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_errors = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_define_type_scope_name_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_iterate_type_property_name_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_define_property_name_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_hidden_value_property = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_write_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_img_src_border_align = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_submit_property = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_html_locale.release();
    _jspx_tagPool_bean_message_key.release();
    _jspx_tagPool_html_base.release();
    _jspx_tagPool_html_img_page_border_align.release();
    _jspx_tagPool_html_link_page.release();
    _jspx_tagPool_logic_notPresent_name.release();
    _jspx_tagPool_logic_present_name.release();
    _jspx_tagPool_html_errors.release();
    _jspx_tagPool_bean_define_type_scope_name_id.release();
    _jspx_tagPool_logic_iterate_type_property_name_id.release();
    _jspx_tagPool_bean_define_property_name_id.release();
    _jspx_tagPool_html_form_action.release();
    _jspx_tagPool_html_hidden_value_property.release();
    _jspx_tagPool_bean_write_property_name.release();
    _jspx_tagPool_html_img_src_border_align.release();
    _jspx_tagPool_html_submit_property.release();
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

      out.write("\n\n\n\n\n\n\n");
      //  html:html
      org.apache.struts.taglib.html.HtmlTag _jspx_th_html_html_0 = (org.apache.struts.taglib.html.HtmlTag) _jspx_tagPool_html_html_locale.get(org.apache.struts.taglib.html.HtmlTag.class);
      _jspx_th_html_html_0.setPageContext(_jspx_page_context);
      _jspx_th_html_html_0.setParent(null);
      _jspx_th_html_html_0.setLocale(true);
      int _jspx_eval_html_html_0 = _jspx_th_html_html_0.doStartTag();
      if (_jspx_eval_html_html_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n<head>\n\t<title>");
          if (_jspx_meth_bean_message_0(_jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("</title>\n\t");
          if (_jspx_meth_html_base_0(_jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\n</head>\n\n<body bgcolor=\"#ffffff\" text=\"#000000\" link=\"#023264\" alink=\"#023264\" vlink=\"#023264\">\n<table border=\"0\" width=\"100%\" cellspacing=\"5\">\n\t<tr>\n\t\t<td colspan=\"2\">\n\t\t\t");
          out.write("<a href=\"http://bob.marlboro.edu/~jvincent\">\n");
          if (_jspx_meth_html_img_0(_jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\n</a>\n\n");
          out.write("\n\t\t</td>\n\t</tr>\n\t<tr>\n\t\t<td width=\"140\" valign=\"top\">\n\t\t\t");
          out.write("\n<table>\n\t<tr>\n\t\t<th colspan=2>\n\t\t\t<div align=\"left\"><strong>Options</strong></div>\n\t\t</th>\n\t</tr>\n\t<tr>\n\t\t<td width=\"10\" valign=\"top\" ></td>\n\t\t<td valign=\"top\"  >\n\t\t\t<font size=\"-1\">\n\t\t\t\t");
          if (_jspx_meth_html_link_0(_jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\n\t\t\t</font>\n\t\t</td>\n\t</tr>\n\t");
          //  logic:notPresent
          org.apache.struts.taglib.logic.NotPresentTag _jspx_th_logic_notPresent_0 = (org.apache.struts.taglib.logic.NotPresentTag) _jspx_tagPool_logic_notPresent_name.get(org.apache.struts.taglib.logic.NotPresentTag.class);
          _jspx_th_logic_notPresent_0.setPageContext(_jspx_page_context);
          _jspx_th_logic_notPresent_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
          _jspx_th_logic_notPresent_0.setName( jvapp.Constants.USER_INFO_KEY );
          int _jspx_eval_logic_notPresent_0 = _jspx_th_logic_notPresent_0.doStartTag();
          if (_jspx_eval_logic_notPresent_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n\t<tr>\n\t\t<td width=\"10\" valign=\"top\" ></td>\n\t\t<td valign=\"top\"  >\n\t\t\t<font size=\"-1\">\n\t\t\t\t");
              if (_jspx_meth_html_link_1(_jspx_th_logic_notPresent_0, _jspx_page_context))
                return;
              out.write("\n\t\t\t</font>\n\t\t</td>\n\t</tr>\n\t");
              int evalDoAfterBody = _jspx_th_logic_notPresent_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_notPresent_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_logic_notPresent_name.reuse(_jspx_th_logic_notPresent_0);
          out.write('\n');
          out.write('	');
          //  logic:present
          org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_present_0 = (org.apache.struts.taglib.logic.PresentTag) _jspx_tagPool_logic_present_name.get(org.apache.struts.taglib.logic.PresentTag.class);
          _jspx_th_logic_present_0.setPageContext(_jspx_page_context);
          _jspx_th_logic_present_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
          _jspx_th_logic_present_0.setName( jvapp.Constants.USER_INFO_KEY );
          int _jspx_eval_logic_present_0 = _jspx_th_logic_present_0.doStartTag();
          if (_jspx_eval_logic_present_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n\t<tr>\n\t\t<td width=\"10\" valign=\"top\" ></td>\n\t\t<td valign=\"top\"  >\n\t\t\t<font size=\"-1\">\n\t\t\t\t");
              if (_jspx_meth_html_link_2(_jspx_th_logic_present_0, _jspx_page_context))
                return;
              out.write("\n\t\t\t</font>\n\t\t</td>\n\t</tr>\n\t");
              int evalDoAfterBody = _jspx_th_logic_present_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_present_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_logic_present_name.reuse(_jspx_th_logic_present_0);
          out.write("\n</table>\n<br>\n\n<table>\n\t<tr>\n\t\t<th colspan=2>\n\t\t\t<div align=\"left\"><strong>Examples</strong></div>\n\t\t</th>\n\t</tr>\n\t<tr>\n\t\t<td width=\"10\" valign=\"top\" ></td>\n\t\t<td valign=\"top\"  >\n\t\t\t<font size=\"-1\">\n\t\t\t\t");
          if (_jspx_meth_html_link_3(_jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\n\t\t\t</font>\n\t\t</td>\n\t</tr>\n\t<tr>\n\t\t<td width=\"10\" valign=\"top\" ></td>\n\t\t<td valign=\"top\"  >\n\t\t\t<font size=\"-1\">\n\t\t\t\t");
          if (_jspx_meth_html_link_4(_jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\n\t\t\t</font>\n\t\t</td>\n\t</tr>\n</table>\n<br>\n\n<table>\n\t<tr>\n\t\t<th colspan=2>\n\t\t\t<div align=\"left\"><strong>Testing Area</strong></div>\n\t\t</th>\n\t</tr>\n\t<tr>\n\t\t<td width=\"10\" valign=\"top\" ></td>\n\t\t<td valign=\"top\"  >\n\t\t\t<font size=\"-1\">\n\t\t\t\t");
          if (_jspx_meth_html_link_5(_jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\n\t\t\t</font>\n\t\t</td>\n\t</tr>\n\t<tr>\n\t\t<td width=\"10\" valign=\"top\" ></td>\n\t\t<td valign=\"top\"  >\n\t\t\t<font size=\"-1\">\n\t\t\t\t");
          if (_jspx_meth_html_link_6(_jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\n\t\t\t</font>\n\t\t</td>\n\t</tr>\n\t<tr>\n\t\t<td width=\"10\" valign=\"top\" ></td>\n\t\t<td valign=\"top\"  >\n\t\t\t<font size=\"-1\">\n\t\t\t\t");
          if (_jspx_meth_html_link_7(_jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\n\t\t\t</font>\n\t\t</td>\n\t</tr>\n\t<tr>\n\t\t<td width=\"10\" valign=\"top\" ></td>\n\t\t<td valign=\"top\"  >\n\t\t\t<font size=\"-1\">\n\t\t\t\t");
          if (_jspx_meth_html_link_8(_jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\n\t\t\t</font>\n\t\t</td>\n\t</tr>\n\t<tr>\n\t\t<td width=\"10\" valign=\"top\" ></td>\n\t\t<td valign=\"top\"  >\n\t\t\t<font size=\"-1\">\n\t\t\t\t");
          if (_jspx_meth_html_link_9(_jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\n\t\t\t</font>\n\t\t</td>\n\t</tr>\n</table>\n<br>\n\n");
          out.write('\n');
          out.write('\n');
          out.write("\n\t\t</td>\n\t\t<td valign=\"top\"  align=\"left\">\n\t\t\t");
          out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
          if (_jspx_meth_html_errors_0(_jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\r\n\r\n");
          //  bean:define
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_0 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_type_scope_name_id.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_0.setPageContext(_jspx_page_context);
          _jspx_th_bean_define_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
          _jspx_th_bean_define_0.setId("jvBarcodes");
          _jspx_th_bean_define_0.setName( jvapp.Constants.BARCODES_INFO_KEY );
          _jspx_th_bean_define_0.setType("jvcommon.JVBarcodes");
          _jspx_th_bean_define_0.setScope("request");
          int _jspx_eval_bean_define_0 = _jspx_th_bean_define_0.doStartTag();
          if (_jspx_th_bean_define_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_bean_define_type_scope_name_id.reuse(_jspx_th_bean_define_0);
          jvcommon.JVBarcodes jvBarcodes = null;
          jvBarcodes = (jvcommon.JVBarcodes) _jspx_page_context.findAttribute("jvBarcodes");
          out.write("\r\n\r\n");

	Debug.println(">>> Barcodes.jsp");
	JVParameters params = new JVParameters(request.getParameterMap());
	params.showParams ("barcodes");
	JVAttributes attribs = new JVAttributes(request.getAttributeNames());
	attribs.showParams ("barcodes");

          out.write("\r\n\r\n<center>\r\n\r\n<table>\r\n<TR>\r\n\t<TD BGCOLOR=AAAAAA>");
          if (_jspx_meth_bean_message_1(_jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("</TD>\r\n\t<TD BGCOLOR=AAAAAA>");
          if (_jspx_meth_bean_message_2(_jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("</TD>\r\n\t<TD BGCOLOR=AAAAAA>");
          if (_jspx_meth_bean_message_3(_jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("</TD>\r\n    <TD BGCOLOR=AAAAAA>");
          if (_jspx_meth_bean_message_4(_jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("</TD>\r\n\t<TD BGCOLOR=AAAAAA>&nbsp;</TD>\t\t\t\r\n</TR>\r\n\r\n");
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_0 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_property_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_iterate_0.setPageContext(_jspx_page_context);
          _jspx_th_logic_iterate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
          _jspx_th_logic_iterate_0.setId("barcode");
          _jspx_th_logic_iterate_0.setType("jvcommon.JVBarcode");
          _jspx_th_logic_iterate_0.setName("jvBarcodes");
          _jspx_th_logic_iterate_0.setProperty("barcodes");
          int _jspx_eval_logic_iterate_0 = _jspx_th_logic_iterate_0.doStartTag();
          if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            jvcommon.JVBarcode barcode = null;
            if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_logic_iterate_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_logic_iterate_0.doInitBody();
            }
            barcode = (jvcommon.JVBarcode) _jspx_page_context.findAttribute("barcode");
            do {
              out.write('\r');
              out.write('\n');
              out.write('	');
              //  bean:define
              org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_1 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id.get(org.apache.struts.taglib.bean.DefineTag.class);
              _jspx_th_bean_define_1.setPageContext(_jspx_page_context);
              _jspx_th_bean_define_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
              _jspx_th_bean_define_1.setId("id");
              _jspx_th_bean_define_1.setName("barcode");
              _jspx_th_bean_define_1.setProperty("barcodeid");
              int _jspx_eval_bean_define_1 = _jspx_th_bean_define_1.doStartTag();
              if (_jspx_th_bean_define_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_bean_define_property_name_id.reuse(_jspx_th_bean_define_1);
              java.lang.Object id = null;
              id = (java.lang.Object) _jspx_page_context.findAttribute("id");
              out.write('\r');
              out.write('\n');
              out.write('	');
              //  bean:define
              org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_2 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id.get(org.apache.struts.taglib.bean.DefineTag.class);
              _jspx_th_bean_define_2.setPageContext(_jspx_page_context);
              _jspx_th_bean_define_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
              _jspx_th_bean_define_2.setId("id2");
              _jspx_th_bean_define_2.setName("barcode");
              _jspx_th_bean_define_2.setProperty("itemid");
              int _jspx_eval_bean_define_2 = _jspx_th_bean_define_2.doStartTag();
              if (_jspx_th_bean_define_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_bean_define_property_name_id.reuse(_jspx_th_bean_define_2);
              java.lang.Object id2 = null;
              id2 = (java.lang.Object) _jspx_page_context.findAttribute("id2");
              out.write("\r\n\t<tr>\r\n\t\t");
              //  html:form
              org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_action.get(org.apache.struts.taglib.html.FormTag.class);
              _jspx_th_html_form_0.setPageContext(_jspx_page_context);
              _jspx_th_html_form_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
              _jspx_th_html_form_0.setAction("/BarcodeDetails.do");
              int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
              if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n\t\t");
                  //  html:hidden
                  org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_0 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_property.get(org.apache.struts.taglib.html.HiddenTag.class);
                  _jspx_th_html_hidden_0.setPageContext(_jspx_page_context);
                  _jspx_th_html_hidden_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
                  _jspx_th_html_hidden_0.setProperty("barcode");
                  _jspx_th_html_hidden_0.setValue( String.valueOf(id) );
                  int _jspx_eval_html_hidden_0 = _jspx_th_html_hidden_0.doStartTag();
                  if (_jspx_th_html_hidden_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  _jspx_tagPool_html_hidden_value_property.reuse(_jspx_th_html_hidden_0);
                  out.write("\r\n\t\t");
                  //  html:hidden
                  org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_1 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_value_property.get(org.apache.struts.taglib.html.HiddenTag.class);
                  _jspx_th_html_hidden_1.setPageContext(_jspx_page_context);
                  _jspx_th_html_hidden_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
                  _jspx_th_html_hidden_1.setProperty("item");
                  _jspx_th_html_hidden_1.setValue( String.valueOf(id2) );
                  int _jspx_eval_html_hidden_1 = _jspx_th_html_hidden_1.doStartTag();
                  if (_jspx_th_html_hidden_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  _jspx_tagPool_html_hidden_value_property.reuse(_jspx_th_html_hidden_1);
                  out.write("\r\n\t\t<td>");
                  if (_jspx_meth_bean_write_0(_jspx_th_html_form_0, _jspx_page_context))
                    return;
                  out.write("</td>\r\n\t\t<td>");
                  if (_jspx_meth_bean_write_1(_jspx_th_html_form_0, _jspx_page_context))
                    return;
                  out.write("</td>\r\n\t\t<td>");
                  if (_jspx_meth_bean_write_2(_jspx_th_html_form_0, _jspx_page_context))
                    return;
                  out.write("</td>\r\n\t\t<td>\r\n\t\t\t");
                  //  html:img
                  org.apache.struts.taglib.html.ImgTag _jspx_th_html_img_1 = (org.apache.struts.taglib.html.ImgTag) _jspx_tagPool_html_img_src_border_align.get(org.apache.struts.taglib.html.ImgTag.class);
                  _jspx_th_html_img_1.setPageContext(_jspx_page_context);
                  _jspx_th_html_img_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
                  _jspx_th_html_img_1.setSrc(barcode.getImageurl());
                  _jspx_th_html_img_1.setAlign("left");
                  _jspx_th_html_img_1.setBorder("0");
                  int _jspx_eval_html_img_1 = _jspx_th_html_img_1.doStartTag();
                  if (_jspx_th_html_img_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  _jspx_tagPool_html_img_src_border_align.reuse(_jspx_th_html_img_1);
                  out.write("\r\n\t\t</td>\r\n\t\t<td>\r\n\t\t\t");
                  if (_jspx_meth_html_submit_0(_jspx_th_html_form_0, _jspx_page_context))
                    return;
                  out.write("\r\n\t\t</td>\t\r\n\t\t");
                  int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_html_form_action.reuse(_jspx_th_html_form_0);
              out.write("\r\n\t</tr>\r\n");
              int evalDoAfterBody = _jspx_th_logic_iterate_0.doAfterBody();
              barcode = (jvcommon.JVBarcode) _jspx_page_context.findAttribute("barcode");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_logic_iterate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_logic_iterate_type_property_name_id.reuse(_jspx_th_logic_iterate_0);
          out.write("\r\n\r\n</table>\r\n\r\n</center>\r\n\r\n");
          out.write("\n\t\t</td>\n\t</tr>\n\t<tr>\n\t\t<td colspan=\"2\">\n\t\t\t<hr>\n\t\t</td>\n\t</tr>\n\t<tr>\n\t\t<td colspan=\"2\">\n\t\t\t");
          out.write("\n<div align=\"center\">\n  <font color=\"#023264\" size=\"-1\">\n    <em>         Copyright &copy; 2003-2004, John Vincent MSIE </em>\n  </font>\n</div>\n\n");
          out.write('\n');
          out.write("\n\n\n\n<HR>\n<H1> Parameters </H1>\n<TABLE>\n<TR><TD BGCOLOR=AAAAAA ALIGN=CENTER>Parameter Name</TD>\n    <TD BGCOLOR=AAAAAA>Parameter Value</TD>\n</TR>\n\n");
 Enumeration itr1 = request.getParameterNames();
	while (itr1.hasMoreElements()) {
		String pName = (String) itr1.nextElement();
		String pValue = request.getParameter(pName); 
          out.write("\n\t\t<TR><TD BGCOLOR=DDDDDD>");
          out.print(pName);
          out.write("</TD>\n\t\t<TD BGCOLOR=DDDDDD>");
          out.print(pValue);
          out.write("</TD>\n\t\t</TR>\n");
 } 
          out.write("\t\t\n</TABLE>\n\n<HR>\n\n<H1> Attributes </H1>\n<TABLE>\n<TR><TD BGCOLOR=AAAAAA ALIGN=CENTER>Attribute Name</TD>\n</TR>\n\n");
 Enumeration itr2 = request.getAttributeNames();
	while (itr2.hasMoreElements()) {
		String pName = (String) itr2.nextElement(); 
          out.write("\n\t\t<TR><TD BGCOLOR=DDDDDD>");
          out.print(pName);
          out.write("</TD>\n\t\t</TR>\n");
 } 
          out.write("\t\t\n</TABLE>\n\n<HR>\n\n");
          out.write('\n');
          out.write('\n');
          if (_jspx_meth_html_img_2(_jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write('\n');
          out.write("\n\t\t</td>\n\t</tr>\n</table>\n\n</body>\n\n");
          int evalDoAfterBody = _jspx_th_html_html_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_html_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_html_html_locale.reuse(_jspx_th_html_html_0);
      out.write('\n');
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

  private boolean _jspx_meth_bean_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_0 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_0.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_bean_message_0.setKey("main.title");
    int _jspx_eval_bean_message_0 = _jspx_th_bean_message_0.doStartTag();
    if (_jspx_th_bean_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_message_key.reuse(_jspx_th_bean_message_0);
    return false;
  }

  private boolean _jspx_meth_html_base_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  html:base
    org.apache.struts.taglib.html.BaseTag _jspx_th_html_base_0 = (org.apache.struts.taglib.html.BaseTag) _jspx_tagPool_html_base.get(org.apache.struts.taglib.html.BaseTag.class);
    _jspx_th_html_base_0.setPageContext(_jspx_page_context);
    _jspx_th_html_base_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    int _jspx_eval_html_base_0 = _jspx_th_html_base_0.doStartTag();
    if (_jspx_th_html_base_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_base.reuse(_jspx_th_html_base_0);
    return false;
  }

  private boolean _jspx_meth_html_img_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  html:img
    org.apache.struts.taglib.html.ImgTag _jspx_th_html_img_0 = (org.apache.struts.taglib.html.ImgTag) _jspx_tagPool_html_img_page_border_align.get(org.apache.struts.taglib.html.ImgTag.class);
    _jspx_th_html_img_0.setPageContext(_jspx_page_context);
    _jspx_th_html_img_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_html_img_0.setPage("/pages/images/jv.jpg");
    _jspx_th_html_img_0.setAlign("left");
    _jspx_th_html_img_0.setBorder("0");
    int _jspx_eval_html_img_0 = _jspx_th_html_img_0.doStartTag();
    if (_jspx_th_html_img_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_img_page_border_align.reuse(_jspx_th_html_img_0);
    return false;
  }

  private boolean _jspx_meth_html_link_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_0 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_page.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_0.setPageContext(_jspx_page_context);
    _jspx_th_html_link_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_html_link_0.setPage("/Main.do");
    int _jspx_eval_html_link_0 = _jspx_th_html_link_0.doStartTag();
    if (_jspx_eval_html_link_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_0.doInitBody();
      }
      do {
        out.write("Home");
        int evalDoAfterBody = _jspx_th_html_link_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_page.reuse(_jspx_th_html_link_0);
    return false;
  }

  private boolean _jspx_meth_html_link_1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notPresent_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_1 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_page.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_1.setPageContext(_jspx_page_context);
    _jspx_th_html_link_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notPresent_0);
    _jspx_th_html_link_1.setPage("/Logon.do");
    int _jspx_eval_html_link_1 = _jspx_th_html_link_1.doStartTag();
    if (_jspx_eval_html_link_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_1.doInitBody();
      }
      do {
        out.write("Logon");
        int evalDoAfterBody = _jspx_th_html_link_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_page.reuse(_jspx_th_html_link_1);
    return false;
  }

  private boolean _jspx_meth_html_link_2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_present_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_2 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_page.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_2.setPageContext(_jspx_page_context);
    _jspx_th_html_link_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_present_0);
    _jspx_th_html_link_2.setPage("/Logoff.do");
    int _jspx_eval_html_link_2 = _jspx_th_html_link_2.doStartTag();
    if (_jspx_eval_html_link_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_2.doInitBody();
      }
      do {
        out.write("Logoff");
        int evalDoAfterBody = _jspx_th_html_link_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_page.reuse(_jspx_th_html_link_2);
    return false;
  }

  private boolean _jspx_meth_html_link_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_3 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_page.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_3.setPageContext(_jspx_page_context);
    _jspx_th_html_link_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_html_link_3.setPage("/pages/Main.jsp");
    int _jspx_eval_html_link_3 = _jspx_th_html_link_3.doStartTag();
    if (_jspx_eval_html_link_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_3.doInitBody();
      }
      do {
        out.write("Home(URL)");
        int evalDoAfterBody = _jspx_th_html_link_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_page.reuse(_jspx_th_html_link_3);
    return false;
  }

  private boolean _jspx_meth_html_link_4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_4 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_page.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_4.setPageContext(_jspx_page_context);
    _jspx_th_html_link_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_html_link_4.setPage("/Construction.do");
    int _jspx_eval_html_link_4 = _jspx_th_html_link_4.doStartTag();
    if (_jspx_eval_html_link_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_4.doInitBody();
      }
      do {
        out.write("Under Construction");
        int evalDoAfterBody = _jspx_th_html_link_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_page.reuse(_jspx_th_html_link_4);
    return false;
  }

  private boolean _jspx_meth_html_link_5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_5 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_page.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_5.setPageContext(_jspx_page_context);
    _jspx_th_html_link_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_html_link_5.setPage("/Tab1.do");
    int _jspx_eval_html_link_5 = _jspx_th_html_link_5.doStartTag();
    if (_jspx_eval_html_link_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_5.doInitBody();
      }
      do {
        out.write("Tab 1 Test");
        int evalDoAfterBody = _jspx_th_html_link_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_page.reuse(_jspx_th_html_link_5);
    return false;
  }

  private boolean _jspx_meth_html_link_6(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_6 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_page.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_6.setPageContext(_jspx_page_context);
    _jspx_th_html_link_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_html_link_6.setPage("/SessionBean1.do");
    int _jspx_eval_html_link_6 = _jspx_th_html_link_6.doStartTag();
    if (_jspx_eval_html_link_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_6.doInitBody();
      }
      do {
        out.write("Session Bean 1 Test");
        int evalDoAfterBody = _jspx_th_html_link_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_page.reuse(_jspx_th_html_link_6);
    return false;
  }

  private boolean _jspx_meth_html_link_7(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_7 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_page.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_7.setPageContext(_jspx_page_context);
    _jspx_th_html_link_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_html_link_7.setPage("/ConverterBeanTest.do");
    int _jspx_eval_html_link_7 = _jspx_th_html_link_7.doStartTag();
    if (_jspx_eval_html_link_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_7.doInitBody();
      }
      do {
        out.write("Converter Bean Test");
        int evalDoAfterBody = _jspx_th_html_link_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_page.reuse(_jspx_th_html_link_7);
    return false;
  }

  private boolean _jspx_meth_html_link_8(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_8 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_page.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_8.setPageContext(_jspx_page_context);
    _jspx_th_html_link_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_html_link_8.setPage("/Tab2.do?tabno=1");
    int _jspx_eval_html_link_8 = _jspx_th_html_link_8.doStartTag();
    if (_jspx_eval_html_link_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_8.doInitBody();
      }
      do {
        out.write("Tab 2 Test");
        int evalDoAfterBody = _jspx_th_html_link_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_page.reuse(_jspx_th_html_link_8);
    return false;
  }

  private boolean _jspx_meth_html_link_9(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_9 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_page.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_9.setPageContext(_jspx_page_context);
    _jspx_th_html_link_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_html_link_9.setPage("/Tab2.do?tabno=2");
    int _jspx_eval_html_link_9 = _jspx_th_html_link_9.doStartTag();
    if (_jspx_eval_html_link_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_9.doInitBody();
      }
      do {
        out.write("Tab 3 Test");
        int evalDoAfterBody = _jspx_th_html_link_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_link_page.reuse(_jspx_th_html_link_9);
    return false;
  }

  private boolean _jspx_meth_html_errors_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_0 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_0.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    int _jspx_eval_html_errors_0 = _jspx_th_html_errors_0.doStartTag();
    if (_jspx_th_html_errors_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_errors.reuse(_jspx_th_html_errors_0);
    return false;
  }

  private boolean _jspx_meth_bean_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_1 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_1.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_bean_message_1.setKey("barcodes.hd1");
    int _jspx_eval_bean_message_1 = _jspx_th_bean_message_1.doStartTag();
    if (_jspx_th_bean_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_message_key.reuse(_jspx_th_bean_message_1);
    return false;
  }

  private boolean _jspx_meth_bean_message_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_2 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_2.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_bean_message_2.setKey("barcodes.hd2");
    int _jspx_eval_bean_message_2 = _jspx_th_bean_message_2.doStartTag();
    if (_jspx_th_bean_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_message_key.reuse(_jspx_th_bean_message_2);
    return false;
  }

  private boolean _jspx_meth_bean_message_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_3 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_3.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_bean_message_3.setKey("barcodes.hd3");
    int _jspx_eval_bean_message_3 = _jspx_th_bean_message_3.doStartTag();
    if (_jspx_th_bean_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_message_key.reuse(_jspx_th_bean_message_3);
    return false;
  }

  private boolean _jspx_meth_bean_message_4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_4 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_4.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_bean_message_4.setKey("barcodes.hd4");
    int _jspx_eval_bean_message_4 = _jspx_th_bean_message_4.doStartTag();
    if (_jspx_th_bean_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_message_key.reuse(_jspx_th_bean_message_4);
    return false;
  }

  private boolean _jspx_meth_bean_write_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_0 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_0.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_write_0.setName("barcode");
    _jspx_th_bean_write_0.setProperty("barcodeid");
    int _jspx_eval_bean_write_0 = _jspx_th_bean_write_0.doStartTag();
    if (_jspx_th_bean_write_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name.reuse(_jspx_th_bean_write_0);
    return false;
  }

  private boolean _jspx_meth_bean_write_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_1 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_1.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_write_1.setName("barcode");
    _jspx_th_bean_write_1.setProperty("name");
    int _jspx_eval_bean_write_1 = _jspx_th_bean_write_1.doStartTag();
    if (_jspx_th_bean_write_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name.reuse(_jspx_th_bean_write_1);
    return false;
  }

  private boolean _jspx_meth_bean_write_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_2 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_2.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_bean_write_2.setName("barcode");
    _jspx_th_bean_write_2.setProperty("company");
    int _jspx_eval_bean_write_2 = _jspx_th_bean_write_2.doStartTag();
    if (_jspx_th_bean_write_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name.reuse(_jspx_th_bean_write_2);
    return false;
  }

  private boolean _jspx_meth_html_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_submit_0 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_html_submit_property.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_html_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_0);
    _jspx_th_html_submit_0.setProperty("DETAILS");
    int _jspx_eval_html_submit_0 = _jspx_th_html_submit_0.doStartTag();
    if (_jspx_eval_html_submit_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_submit_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_submit_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_submit_0.doInitBody();
      }
      do {
        out.write("\r\n\t\t\t\t");
        if (_jspx_meth_bean_message_5(_jspx_th_html_submit_0, _jspx_page_context))
          return true;
        out.write("\r\n\t\t\t");
        int evalDoAfterBody = _jspx_th_html_submit_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_submit_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_submit_property.reuse(_jspx_th_html_submit_0);
    return false;
  }

  private boolean _jspx_meth_bean_message_5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_submit_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_5 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_5.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_submit_0);
    _jspx_th_bean_message_5.setKey("barcodes.submit.details");
    int _jspx_eval_bean_message_5 = _jspx_th_bean_message_5.doStartTag();
    if (_jspx_th_bean_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_message_key.reuse(_jspx_th_bean_message_5);
    return false;
  }

  private boolean _jspx_meth_html_img_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  html:img
    org.apache.struts.taglib.html.ImgTag _jspx_th_html_img_2 = (org.apache.struts.taglib.html.ImgTag) _jspx_tagPool_html_img_page_border_align.get(org.apache.struts.taglib.html.ImgTag.class);
    _jspx_th_html_img_2.setPageContext(_jspx_page_context);
    _jspx_th_html_img_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_html_img_2.setPage("/pages/images/struts-power.gif");
    _jspx_th_html_img_2.setAlign("right");
    _jspx_th_html_img_2.setBorder("0");
    int _jspx_eval_html_img_2 = _jspx_th_html_img_2.doStartTag();
    if (_jspx_th_html_img_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_img_page_border_align.reuse(_jspx_th_html_img_2);
    return false;
  }
}
