package org.apache.jsp.templates;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jvdebug.Debug;
import jvapp.JVParameters;
import jvapp.JVAttributes;

public final class Main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(3);
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/struts-logic.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_define_type_scope_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_html_locale;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_base;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_bean_define_type_scope_name_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_html_locale = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_base = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_bean_define_type_scope_name_id.release();
    _jspx_tagPool_html_html_locale.release();
    _jspx_tagPool_html_base.release();
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

      out.write("\n\n\n\n\n\n\n\n\n\n");
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

	Debug.println(">>> Main.jsp");
	JVParameters params = new JVParameters(request.getParameterMap());
	params.showParams ("Main");
	JVAttributes attribs = new JVAttributes(request.getAttributeNames());
	attribs.showParams ("Main");

      out.write('\n');
      out.write('\n');
      //  html:html
      org.apache.struts.taglib.html.HtmlTag _jspx_th_html_html_0 = (org.apache.struts.taglib.html.HtmlTag) _jspx_tagPool_html_html_locale.get(org.apache.struts.taglib.html.HtmlTag.class);
      _jspx_th_html_html_0.setPageContext(_jspx_page_context);
      _jspx_th_html_html_0.setParent(null);
      _jspx_th_html_html_0.setLocale(true);
      int _jspx_eval_html_html_0 = _jspx_th_html_html_0.doStartTag();
      if (_jspx_eval_html_html_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n<head>\n\t<title>");
          out.print(jvTemplate.getTitle());
          out.write("</title>\n\t");
          if (_jspx_meth_html_base_0(_jspx_th_html_html_0, _jspx_page_context))
            return;
          out.write("\n</head>\n\n<body bgcolor=\"#ffffff\" text=\"#000000\" link=\"#023264\" alink=\"#023264\" vlink=\"#023264\">\n<table border=\"0\" width=\"100%\" cellspacing=\"5\">\n\t<tr>\n\t\t<td colspan=\"2\">\n\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, jvTemplate.getHeader().getFile(), out, false);
          out.write("\n\t\t</td>\n\t</tr>\n\t<tr>\n\t\t<td width=\"140\" valign=\"top\">\n\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, jvTemplate.getMenu().getFile(), out, false);
          out.write("\n\t\t</td>\n\t\t<td valign=\"top\"  align=\"left\">\n\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, jvTemplate.getBody().getFile(), out, false);
          out.write("\n\t\t</td>\n\t</tr>\n\t<tr>\n\t\t<td colspan=\"2\">\n\t\t\t<hr>\n\t\t</td>\n\t</tr>\n\t<tr>\n\t\t<td colspan=\"2\">\n\t\t\t");
          org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, jvTemplate.getFooter().getFile(), out, false);
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
}
