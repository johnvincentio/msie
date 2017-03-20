package org.apache.jsp.templates;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jvcommon.Debug;

public final class MainMenu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(3);
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/struts-logic.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_define_type_scope_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_define_type_scope_property_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_iterate_type_property_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_link_page;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_bean_define_type_scope_name_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_define_type_scope_property_name_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_iterate_type_property_name_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_link_page = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_bean_define_type_scope_name_id.release();
    _jspx_tagPool_bean_define_type_scope_property_name_id.release();
    _jspx_tagPool_logic_iterate_type_property_name_id.release();
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

    jvtemplate.JVPair _jspx_pair_1 = null;

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
 Debug.println(">>> MainMenu"); 
      out.write('\n');
      out.write('\n');
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_0 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_type_scope_name_id.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_define_0.setPageContext(_jspx_page_context);
      _jspx_th_bean_define_0.setParent(null);
      _jspx_th_bean_define_0.setId("jvTemplate");
      _jspx_th_bean_define_0.setName( jvapp.Constants.TEMPLATE_INFO_KEY );
      _jspx_th_bean_define_0.setType("jvtemplate.JVTemplate");
      _jspx_th_bean_define_0.setScope("request");
      int _jspx_eval_bean_define_0 = _jspx_th_bean_define_0.doStartTag();
      if (_jspx_th_bean_define_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_bean_define_type_scope_name_id.reuse(_jspx_th_bean_define_0);
      jvtemplate.JVTemplate jvTemplate = null;
      jvTemplate = (jvtemplate.JVTemplate) _jspx_page_context.findAttribute("jvTemplate");
      out.write('\n');
      out.write('\n');
 Debug.println("MainMenu 1"); 
      out.write('\n');
      out.write('\n');
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_1 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_type_scope_property_name_id.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_define_1.setPageContext(_jspx_page_context);
      _jspx_th_bean_define_1.setParent(null);
      _jspx_th_bean_define_1.setId("jvMenu");
      _jspx_th_bean_define_1.setName( jvapp.Constants.TEMPLATE_INFO_KEY );
      _jspx_th_bean_define_1.setProperty("menu");
      _jspx_th_bean_define_1.setType("jvtemplate.JVMenu");
      _jspx_th_bean_define_1.setScope("request");
      int _jspx_eval_bean_define_1 = _jspx_th_bean_define_1.doStartTag();
      if (_jspx_th_bean_define_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_bean_define_type_scope_property_name_id.reuse(_jspx_th_bean_define_1);
      jvtemplate.JVMenu jvMenu = null;
      jvMenu = (jvtemplate.JVMenu) _jspx_page_context.findAttribute("jvMenu");
      out.write('\n');
      out.write('\n');
 Debug.println("MainMenu 2"); 
      out.write('\n');
      out.write('\n');
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_0 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_property_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_0.setParent(null);
      _jspx_th_logic_iterate_0.setId("submenu");
      _jspx_th_logic_iterate_0.setType("jvtemplate.JVSubMenu");
      _jspx_th_logic_iterate_0.setName("jvMenu");
      _jspx_th_logic_iterate_0.setProperty("submenus");
      int _jspx_eval_logic_iterate_0 = _jspx_th_logic_iterate_0.doStartTag();
      if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        jvtemplate.JVSubMenu submenu = null;
        if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_0.doInitBody();
        }
        submenu = (jvtemplate.JVSubMenu) _jspx_page_context.findAttribute("submenu");
        do {
          out.write("\n\t<table>\n\t\t<tr>\n\t\t\t<th colspan=2>\n\t\t\t\t<div align=\"left\">\n\t\t\t\t\t<strong>");
          out.print(submenu.getName());
          out.write("</strong>\n\t\t\t\t</div>\n\t\t\t</th>\n\t\t</tr>\n\n\t\t");
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_1 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_property_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_iterate_1.setPageContext(_jspx_page_context);
          _jspx_th_logic_iterate_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
          _jspx_th_logic_iterate_1.setId("pair");
          _jspx_th_logic_iterate_1.setType("jvtemplate.JVPair");
          _jspx_th_logic_iterate_1.setName("submenu");
          _jspx_th_logic_iterate_1.setProperty("pairs");
          int _jspx_eval_logic_iterate_1 = _jspx_th_logic_iterate_1.doStartTag();
          if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            jvtemplate.JVPair pair = null;
            _jspx_pair_1 = pair;
            if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_logic_iterate_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_logic_iterate_1.doInitBody();
            }
            pair = (jvtemplate.JVPair) _jspx_page_context.findAttribute("pair");
            do {
              out.write("\n\t\t\t<tr>\n\t\t\t\t<td width=\"10\" valign=\"top\" ></td>\n\t\t\t\t<td valign=\"top\"  >\n\t\t\t\t\t<font size=\"-1\">\n\t\t\t\t\t\t");
              //  html:link
              org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_0 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_page.get(org.apache.struts.taglib.html.LinkTag.class);
              _jspx_th_html_link_0.setPageContext(_jspx_page_context);
              _jspx_th_html_link_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_1);
              _jspx_th_html_link_0.setPage(pair.getLink());
              int _jspx_eval_html_link_0 = _jspx_th_html_link_0.doStartTag();
              if (_jspx_eval_html_link_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_link_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_html_link_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_html_link_0.doInitBody();
                }
                do {
                  out.print(pair.getText());
                  int evalDoAfterBody = _jspx_th_html_link_0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_link_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = _jspx_page_context.popBody();
              }
              if (_jspx_th_html_link_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_html_link_page.reuse(_jspx_th_html_link_0);
              out.write("\n\t\t\t\t\t</font>\n\t\t\t\t</td>\n\t\t\t</tr>\n\t\t");
              int evalDoAfterBody = _jspx_th_logic_iterate_1.doAfterBody();
              pair = (jvtemplate.JVPair) _jspx_page_context.findAttribute("pair");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            pair = _jspx_pair_1;
            if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_logic_iterate_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_logic_iterate_type_property_name_id.reuse(_jspx_th_logic_iterate_1);
          out.write("\n\n\t</table>\n\t<br>\n\n");
          int evalDoAfterBody = _jspx_th_logic_iterate_0.doAfterBody();
          submenu = (jvtemplate.JVSubMenu) _jspx_page_context.findAttribute("submenu");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_logic_iterate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_iterate_type_property_name_id.reuse(_jspx_th_logic_iterate_0);
      out.write('\n');
      out.write('\n');
 Debug.println("<<< MainMenu"); 
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
}
