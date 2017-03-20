package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jvapp.Debug;
import java.util.*;

public final class Main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(12);
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
    _jspx_dependants.add("/pages/includes/Header.jsp");
    _jspx_dependants.add("/pages/includes/MainMenu.jsp");
    _jspx_dependants.add("/pages/includes/MainBody.jsp");
    _jspx_dependants.add("/pages/includes/Picture.jsp");
    _jspx_dependants.add("/pages/includes/Welcome.jsp");
    _jspx_dependants.add("/pages/includes/Features.jsp");
    _jspx_dependants.add("/pages/includes/News.jsp");
    _jspx_dependants.add("/pages/includes/Comments.jsp");
    _jspx_dependants.add("/pages/includes/Footer.jsp");
    _jspx_dependants.add("/pages/Parameters.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_html_locale;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_message_key;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_img_page_border_align;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_link_page;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_html_locale = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_message_key = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_img_page_border_align = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_link_page = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_html_locale.release();
    _jspx_tagPool_bean_message_key.release();
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
          out.write("\n\t<HEAD>\n\t\t<title>");
          if (_jspx_meth_bean_message_0(_jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("</title>\n\t</HEAD>\n\n<body bgcolor=\"#ffffff\" text=\"#000000\" link=\"#023264\" alink=\"#023264\" vlink=\"#023264\">\n<table border=\"0\" width=\"100%\" cellspacing=\"5\">\n<tr>\n  <td colspan=\"2\">\n\t");
          out.write("<a href=\"http://bob.marlboro.edu/~jvincent\">\n");
          if (_jspx_meth_html_img_0(_jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\n</a>\n\n");
          out.write("\n\t</td>\n</tr>\n<tr>\n  <td width=\"140\" valign=\"top\">\n\t");
          out.write("\n<table>\n\t<tr>\n\t\t<th colspan=2>\n\t\t\t<div align=\"left\"><strong>Thames</strong></div>\n\t\t</th>\n\t</tr>\n\t<tr>\n\t\t<td width=\"10\" valign=\"top\" ></td>\n\t\t<td valign=\"top\"  >\n\t\t\t<font size=\"-1\">\n\t\t\t\t");
          if (_jspx_meth_html_link_0(_jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\n\t\t\t</font>\n\t\t</td>\n\t</tr>\n</table>\n<br>\n\n<table>\n\t<tr>\n\t\t<th colspan=2>\n\t\t\t<div align=\"left\"><strong>Examples</strong></div>\n\t\t</th>\n\t</tr>\n\t<tr>\n\t\t<td width=\"10\" valign=\"top\" ></td>\n\t\t<td valign=\"top\"  >\n\t\t\t<font size=\"-1\">\n\t\t\t\t");
          if (_jspx_meth_html_link_1(_jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\n\t\t\t</font>\n\t\t</td>\n\t</tr>\n\t<tr>\n\t\t<td width=\"10\" valign=\"top\" ></td>\n\t\t<td valign=\"top\"  >\n\t\t\t<font size=\"-1\">\n\t\t\t\t");
          if (_jspx_meth_html_link_2(_jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\n\t\t\t</font>\n\t\t</td>\n\t</tr>\n</table>\n<br>\n\n<table>\n\t<tr>\n\t\t<th colspan=2>\n\t\t\t<div align=\"left\"><strong>Testing Area</strong></div>\n\t\t</th>\n\t</tr>\n\t<tr>\n\t\t<td width=\"10\" valign=\"top\" ></td>\n\t\t<td valign=\"top\"  >\n\t\t\t<font size=\"-1\">\n\t\t\t\t");
          if (_jspx_meth_html_link_3(_jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\n\t\t\t</font>\n\t\t</td>\n\t</tr>\n\t<tr>\n\t\t<td width=\"10\" valign=\"top\" ></td>\n\t\t<td valign=\"top\"  >\n\t\t\t<font size=\"-1\">\n\t\t\t\t");
          if (_jspx_meth_html_link_4(_jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\n\t\t\t</font>\n\t\t</td>\n\t</tr>\n\t<tr>\n\t\t<td width=\"10\" valign=\"top\" ></td>\n\t\t<td valign=\"top\"  >\n\t\t\t<font size=\"-1\">\n\t\t\t\t");
          if (_jspx_meth_html_link_5(_jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\n\t\t\t</font>\n\t\t</td>\n\t</tr>\n\t<tr>\n\t\t<td width=\"10\" valign=\"top\" ></td>\n\t\t<td valign=\"top\"  >\n\t\t\t<font size=\"-1\">\n\t\t\t\t");
          if (_jspx_meth_html_link_6(_jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\n\t\t\t</font>\n\t\t</td>\n\t</tr>\n\t<tr>\n\t\t<td width=\"10\" valign=\"top\" ></td>\n\t\t<td valign=\"top\"  >\n\t\t\t<font size=\"-1\">\n\t\t\t\t");
          if (_jspx_meth_html_link_7(_jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\n\t\t\t</font>\n\t\t</td>\n\t</tr>\n</table>\n<br>\n\n\n\n");
          out.write("\n  </td>\n  <td valign=\"top\"  align=\"left\">\n\t");
          out.write("\n<table>\n\t<tr>\n\t\t<td valign=\"top\">\n\t\t\t");
          out.write("\r\n<table width=\"100%\">\r\n\t<tr>\r\n\t\t<td>\r\n\t\t\t");
          if (_jspx_meth_html_img_1(_jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\r\n\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td>Our hard-working associates</td>\r\n\t</tr>\r\n</table>\r\n\r\n");
          out.write("\n\t\t\t<br/>\n\t\t\t");
          out.write("<style type=\"text/css\">\r\nBODY\t{ margin: 0px; }\r\nFORM    { margin: 0px; }\r\n.normal\t{ font-family: Arial, Helvetica, Sans-Serif; font-size: 8pt; text-align: justify; }\r\n.genstr { font-family: Arial, Helvetica, Sans-Serif; font-size: 8pt; font-weight: bold; }\r\n.advert { font-family: Arial, Helvetica, Sans-Serif; font-size: 7.5pt; text-align: justify; }\r\n.submit { font-family: Arial, Helvetica, Sans-Serif; font-size: 8pt; text-align: center; }\r\n.larger\t{ font-family: Arial, Helvetica, Sans-Serif; font-size: 10pt; }\r\n</style>\r\n\r\n<table  width=\"100%\">\r\n<tr>\r\n<th bgcolor=\"aqua\"><font size=\"+1\"><strong>Welcome to Thames Distributors</strong></font></th></tr>\r\n<tr>\r\n<td>\r\n<div align=\"center\">\r\n<center>\r\n<font class=\"larger\">\r\n<i>\"Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...\"</i>\r\n<br />\r\n</font>\r\n</center></div>\r\n<ul>\r\n<div id=\"lipsum\" class=\"normal\">\r\n<p>\r\n<li>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</li>\r\n<li>Integer in libero nec elit consectetuer posuere.</li>\r\n");
          out.write("<li>Nullam id nulla posuere ante venenatis porttitor.</li>\r\n<li>Vestibulum cursus pellentesque risus.</li>\r\n<li>Cras vestibulum neque a augue.</li>\r\n<li>Aenean tempus augue id enim.</li>\r\n</p>\r\n<p>\r\n<li>Proin consequat ante a libero.</li>\r\n<li>Cras ut pede in sem facilisis commodo.</li>\r\n<li>Aenean in tortor quis quam commodo tincidunt.</li>\r\n</p>\r\n<p>\r\n<li>Sed fermentum vestibulum dui.</li>\r\n<li>Fusce consectetuer wisi et nulla.</li>\r\n<li>Maecenas molestie molestie felis.</li>\r\n<li>Maecenas iaculis nibh et libero.</li>\r\n</p>\r\n<p>\r\n<li>Donec viverra justo id pede.</li>\r\n<li>Morbi gravida bibendum nunc.</li>\r\n<li>Donec adipiscing fringilla enim.</li>\r\n<li>Aliquam iaculis ultricies nulla.</li>\r\n<li>Vivamus pulvinar congue mauris.</li>\r\n</p>\r\n<p>\r\n<li>Morbi eget tortor pharetra ligula dignissim bibendum.</li>\r\n<li>Nunc ac purus eu erat egestas convallis.</li>\r\n<li>Vestibulum molestie libero non nunc adipiscing rutrum.</li>\r\n<li>Nunc in ante vel lacus suscipit vestibulum.</li>\r\n</p>\r\n</ul>\r\n\r\n</td></tr>\r\n</table>\r\n");
          out.write("\r\n");
          out.write("\n\t\t\t<br/>\n\t\t\t");
          out.write("<style type=\"text/css\">\r\nBODY\t{ margin: 0px; }\r\nFORM    { margin: 0px; }\r\n.normal\t{ font-family: Arial, Helvetica, Sans-Serif; font-size: 8pt; text-align: justify; }\r\n.genstr { font-family: Arial, Helvetica, Sans-Serif; font-size: 8pt; font-weight: bold; }\r\n.advert { font-family: Arial, Helvetica, Sans-Serif; font-size: 7.5pt; text-align: justify; }\r\n.submit { font-family: Arial, Helvetica, Sans-Serif; font-size: 8pt; text-align: center; }\r\n.larger\t{ font-family: Arial, Helvetica, Sans-Serif; font-size: 10pt; }\r\n</style>\r\n\r\n<table  width=\"100%\">\r\n<tr>\r\n<th bgcolor=\"aqua\"><font size=\"+1\"><strong>Thames Services</strong></font></th></tr>\r\n<tr>\r\n<td>\r\n\r\n<div align=\"center\">\r\n<center>\r\n<font class=\"larger\">\r\n<i>\"Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...\"</i>\r\n<br />\r\n</font>\r\n</center>\r\n</div>\r\n\r\n<ul>\r\n<div id=\"lipsum\" class=\"normal\">\r\n<p>\r\n<li>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</li>\r\n<li>Integer in libero nec elit consectetuer posuere.</li>\r\n");
          out.write("<li>Nullam id nulla posuere ante venenatis porttitor.</li>\r\n<li>Vestibulum cursus pellentesque risus.</li>\r\n<li>Cras vestibulum neque a augue.</li>\r\n<li>Aenean tempus augue id enim.</li>\r\n</p>\r\n</ul>\r\n\r\n</td></tr>\r\n</table>\r\n\r\n\r\n\r\n");
          out.write("\n\t\t\t<br/>\n\t\t</td>\n\n\t\t<td valign=\"top\">\n\t\t\t");
          out.write("<table  width=\"100%\">\r\n<tr>\r\n<th bgcolor=\"aqua\"><font size=\"+1\"><strong>News</strong></font></th></tr>\r\n<tr>\r\n<td>\r\n      <p><FONT size=2>10 June 2004</FONT></P>\r\n      <P><STRONG><EM><FONT color=#ff0000>Nullam fringilla, lectus</FONT></EM></STRONG>\r\n\t  <br><FONT color=#000000 size=2>\r\nLorem ipsum dolor sit amet, consectetuer adipiscing elit. Sed ut mauris. Suspendisse nec diam ut ipsum blandit blandit. Donec non augue ut felis aliquam euismod. Quisque massa turpis, ultricies sed, bibendum eget, dictum nec, quam. Nunc vel leo at tellus pulvinar sollicitudin. Nullam fringilla, lectus ut fermentum ultricies, felis lorem tincidunt nunc, ultricies volutpat lacus justo sit amet urna. Vivamus scelerisque lobortis dolor. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Fusce at pede. Maecenas ante felis, ultricies eget, dapibus ut, commodo at, pede. In viverra. \r\n\t  </FONT></P>\r\n\t  \r\n      <p><FONT size=2>09 June 2004</FONT></P>\r\n      <P><STRONG><EM><FONT color=#ff0000>Vestibulum ante ipsum primis in faucibus</FONT></EM></STRONG>\r\n");
          out.write("\t  <br><FONT color=#000000 size=2>\r\nProin placerat lacus at ante. Fusce blandit viverra nisl. Nullam lacus felis, commodo luctus, condimentum vel, pellentesque eget, nisl. Praesent eleifend odio non nisl. Nulla in mauris. Nunc magna quam, mollis non, placerat euismod, vulputate sit amet, enim. Proin nulla mi, mattis nec, eleifend sed, mollis at, diam. Donec mollis. Quisque ultricies, massa eget rutrum malesuada, orci quam aliquam mi, ac viverra tortor tellus sit amet mauris. Donec quis nibh. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Cras vehicula mollis risus. Donec feugiat eros nec lacus. In hac habitasse platea dictumst. Praesent vitae dui. Quisque euismod nunc ac ante. Fusce a dui in justo bibendum porttitor. Maecenas hendrerit dolor vel quam. Maecenas pretium accumsan arcu. Nunc nunc. \r\n\t  </FONT></P>\r\n\t  \r\n\t  <p><FONT size=2>01 June 2004</FONT></P>\r\n      <P><STRONG><EM><FONT color=#ff0000>Duis condimentum tempus</FONT></EM></STRONG>\r\n\t  <br><FONT color=#000000 size=2>\r\n");
          out.write("Aenean dui risus, auctor a, sagittis sit amet, fringilla vel, lectus. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Morbi massa ante, feugiat quis, interdum quis, gravida id, est. Integer vel leo. Maecenas sodales interdum purus. Suspendisse aliquam blandit felis. Maecenas in nunc. Nunc quis elit quis augue pharetra vehicula. Vivamus mauris. Duis condimentum tempus arcu. Mauris egestas congue nisl. Etiam sit amet sapien non magna gravida vehicula. Duis accumsan venenatis elit. Sed porttitor est vitae augue. Aliquam gravida pulvinar augue. Mauris pretium aliquam pede. Vivamus vehicula laoreet elit. Praesent et ipsum. Pellentesque nunc.\r\n\t  </FONT></P>\r\n\r\n</td></tr></table>\r\n");
          out.write("\n\t\t\t<br/>\n\t\t\t");
          out.write("<table  width=\"100%\">\r\n<tr>\r\n<th bgcolor=\"aqua\"><font size=\"+1\"><strong>Give Your Feedback \r\n      !</STRONG></FONT></TH></TR>\r\n<tr>\r\n<td>\r\n      <P align=center>\r\n      <FONT size=2>\r\n\t  Feel free to give your feedback on this site !\r\n\t  <br>\r\n\t  If you have any idea to improve it, let me know ! \r\n      <br>Contact me at : \r\n      <br><A href=\"mailto:jv2351@hotpop.com\">jv2351@hotpop.com</A>\r\n      </FONT>\r\n\t  </P>\r\n</TD>\r\n</TR>\r\n</TABLE>");
          out.write("\n\t\t\t<br/>\n\t\t</td>\n\t</tr>\n</table>\n\n");
          out.write("\n  </td>\n</tr>\n<tr>\n  <td colspan=\"2\">\n    <hr>\n  </td>\n</tr>\n<tr>\n  <td colspan=\"2\">\n\t");
          out.write("\n<div align=\"center\">\n  <font color=\"#023264\" size=\"-1\">\n    <em>         Copyright &copy; 2003-2004, John Vincent Software MSIE </em>\n  </font>\n</div>\n\n");
          out.write("\n\n\n\n\n<HR>\n<H1> Parameters </H1>\n<TABLE>\n<TR><TD BGCOLOR=AAAAAA ALIGN=CENTER>Parameter Name</TD>\n    <TD BGCOLOR=AAAAAA>Parameter Value</TD>\n</TR>\n\n");
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
      out.write("\n\n\n\n");
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
        out.write("Thames Home");
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

  private boolean _jspx_meth_html_link_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_1 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_page.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_1.setPageContext(_jspx_page_context);
    _jspx_th_html_link_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_html_link_1.setPage("/pages/Main.jsp");
    int _jspx_eval_html_link_1 = _jspx_th_html_link_1.doStartTag();
    if (_jspx_eval_html_link_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_1.doInitBody();
      }
      do {
        out.write("Home(URL)");
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

  private boolean _jspx_meth_html_link_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_2 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_page.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_2.setPageContext(_jspx_page_context);
    _jspx_th_html_link_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_html_link_2.setPage("/Construction.do");
    int _jspx_eval_html_link_2 = _jspx_th_html_link_2.doStartTag();
    if (_jspx_eval_html_link_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_2.doInitBody();
      }
      do {
        out.write("Under Construction");
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
    _jspx_th_html_link_3.setPage("/Tab1.do");
    int _jspx_eval_html_link_3 = _jspx_th_html_link_3.doStartTag();
    if (_jspx_eval_html_link_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_3.doInitBody();
      }
      do {
        out.write("Tab 1 Test");
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
    _jspx_th_html_link_4.setPage("/SessionBean1.do");
    int _jspx_eval_html_link_4 = _jspx_th_html_link_4.doStartTag();
    if (_jspx_eval_html_link_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_4.doInitBody();
      }
      do {
        out.write("Session Bean 1 Test");
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
    _jspx_th_html_link_5.setPage("/Tab2.do?tabno=1");
    int _jspx_eval_html_link_5 = _jspx_th_html_link_5.doStartTag();
    if (_jspx_eval_html_link_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_5.doInitBody();
      }
      do {
        out.write("Tab 2 Test");
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
    _jspx_th_html_link_6.setPage("/Tab2.do?tabno=2");
    int _jspx_eval_html_link_6 = _jspx_th_html_link_6.doStartTag();
    if (_jspx_eval_html_link_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_6.doInitBody();
      }
      do {
        out.write("Tab 3 Test");
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
    _jspx_th_html_link_7.setPage("/Logon.do");
    int _jspx_eval_html_link_7 = _jspx_th_html_link_7.doStartTag();
    if (_jspx_eval_html_link_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_7.doInitBody();
      }
      do {
        out.write("Logon");
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

  private boolean _jspx_meth_html_img_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_html_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  html:img
    org.apache.struts.taglib.html.ImgTag _jspx_th_html_img_1 = (org.apache.struts.taglib.html.ImgTag) _jspx_tagPool_html_img_page_border_align.get(org.apache.struts.taglib.html.ImgTag.class);
    _jspx_th_html_img_1.setPageContext(_jspx_page_context);
    _jspx_th_html_img_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_html_0);
    _jspx_th_html_img_1.setPage("/pages/images/crystals.jpg");
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
