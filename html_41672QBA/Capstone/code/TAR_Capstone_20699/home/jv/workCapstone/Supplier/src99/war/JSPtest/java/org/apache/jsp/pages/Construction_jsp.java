package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class Construction_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(8);
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/struts-logic.tld");
    _jspx_dependants.add("/pages/includes/Header.jsp");
    _jspx_dependants.add("/pages/includes/ConstructionMenu.jsp");
    _jspx_dependants.add("/pages/includes/ConstructionBody.jsp");
    _jspx_dependants.add("/pages/includes/Footer.jsp");
    _jspx_dependants.add("/pages/Parameters.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_html_locale;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_message_key;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_base;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_img_page_border_align;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_link_page;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_html_locale = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_message_key = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_base = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_img_page_border_align = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_link_page = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_html_locale.release();
    _jspx_tagPool_bean_message_key.release();
    _jspx_tagPool_html_base.release();
    _jspx_tagPool_html_img_page_border_align.release();
    _jspx_tagPool_html_link_page.release();
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

      out.write("\n\n\n\n\n");
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
          out.write("\n</head>\n\n<body bgcolor=\"#ffffff\" text=\"#000000\" link=\"#023264\" alink=\"#023264\" vlink=\"#023264\">\n<table border=\"0\" width=\"100%\" cellspacing=\"5\">\n<tr>\n  <td colspan=\"2\">\n\t");
          out.write("<a href=\"http://bob.marlboro.edu/~jvincent\">\n");
          if (_jspx_meth_html_img_0(_jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\n</a>\n\n");
          out.write("\n\t</td>\n</tr>\n<tr>\n  <td width=\"140\" valign=\"top\">\n\t");
          out.write("\n<table>\n\t<tr>\n\t\t<th colspan=2>\n\t\t\t<div align=\"left\"><strong>Options</strong></div>\n\t\t</th>\n\t</tr>\n\t<tr>\n\t\t<td width=\"10\" valign=\"top\" ></td>\n\t\t<td valign=\"top\"  >\n\t\t\t<font size=\"-1\">\n\t\t\t\t");
          if (_jspx_meth_html_link_0(_jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\n\t\t\t</font>\n\t\t</td>\n\t</tr>\n</table>\n<br>\n\n");
          out.write("\n  </td>\n  <td valign=\"top\"  align=\"left\">\n\t");
          out.write("\n\n\n\n\n<table>\n\t<tr>\n\t\t<td valign=\"top\">\n\t\t\t");
          if (_jspx_meth_html_img_1(_jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\n\t\t</td>\n\t</tr>\n\t<tr>\n\t\t<td>Please call again....</td>\n\t</tr>\n</table>\n\n");
          out.write("\n  </td>\n</tr>\n<tr>\n  <td colspan=\"2\">\n    <hr>\n  </td>\n</tr>\n<tr>\n  <td colspan=\"2\">\n\t");
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
          out.write("\n  </td>\n</tr>\n</table>\n</body>\n");
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
    _jspx_th_bean_message_0.setKey("construction.title");
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

  private boolean _jspx_meth_html_img_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  html:img
    org.apache.struts.taglib.html.ImgTag _jspx_th_html_img_1 = (org.apache.struts.taglib.html.ImgTag) _jspx_tagPool_html_img_page_border_align.get(org.apache.struts.taglib.html.ImgTag.class);
    _jspx_th_html_img_1.setPageContext(_jspx_page_context);
    _jspx_th_html_img_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_html_img_1.setPage("/pages/images/construction.gif");
    _jspx_th_html_img_1.setAlign("left");
    _jspx_th_html_img_1.setBorder("0");
    int _jspx_eval_html_img_1 = _jspx_th_html_img_1.doStartTag();
    if (_jspx_th_html_img_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_img_page_border_align.reuse(_jspx_th_html_img_1);
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
