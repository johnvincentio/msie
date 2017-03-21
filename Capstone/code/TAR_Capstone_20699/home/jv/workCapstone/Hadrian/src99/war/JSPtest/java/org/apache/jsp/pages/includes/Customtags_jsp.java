package org.apache.jsp.pages.includes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Customtags_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(2);
    _jspx_dependants.add("/WEB-INF/fmt.tld");
    _jspx_dependants.add("/WEB-INF/JVTags.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_jv_hi;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_jv_greet_param;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_message_key = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_jv_hi = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_jv_greet_param = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_message_key.release();
    _jspx_tagPool_jv_hi.release();
    _jspx_tagPool_jv_greet_param.release();
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

      out.write("\n\n\n\n<center>\n<h1>");
      if (_jspx_meth_fmt_message_0(_jspx_page_context))
        return;
      out.write("</h1>\n\n<p>This page test a custom tag library<p>\n\n<p>Some greeting follows: ");
      if (_jspx_meth_jv_hi_0(_jspx_page_context))
        return;
      out.write("</p>\n\n<p>Your user name is ");
      if (_jspx_meth_jv_greet_0(_jspx_page_context))
        return;
      out.write("</p>\n\n</center>\n\n");
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

  private boolean _jspx_meth_fmt_message_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_0.setParent(null);
    _jspx_th_fmt_message_0.setKey("main.title");
    int _jspx_eval_fmt_message_0 = _jspx_th_fmt_message_0.doStartTag();
    if (_jspx_th_fmt_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_fmt_message_key.reuse(_jspx_th_fmt_message_0);
    return false;
  }

  private boolean _jspx_meth_jv_hi_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  jv:hi
    jvtag.HiTag _jspx_th_jv_hi_0 = (jvtag.HiTag) _jspx_tagPool_jv_hi.get(jvtag.HiTag.class);
    _jspx_th_jv_hi_0.setPageContext(_jspx_page_context);
    _jspx_th_jv_hi_0.setParent(null);
    int _jspx_eval_jv_hi_0 = _jspx_th_jv_hi_0.doStartTag();
    if (_jspx_th_jv_hi_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_jv_hi.reuse(_jspx_th_jv_hi_0);
    return false;
  }

  private boolean _jspx_meth_jv_greet_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  jv:greet
    jvtag.GreetTag _jspx_th_jv_greet_0 = (jvtag.GreetTag) _jspx_tagPool_jv_greet_param.get(jvtag.GreetTag.class);
    _jspx_th_jv_greet_0.setPageContext(_jspx_page_context);
    _jspx_th_jv_greet_0.setParent(null);
    _jspx_th_jv_greet_0.setParam("jvTaguser");
    int _jspx_eval_jv_greet_0 = _jspx_th_jv_greet_0.doStartTag();
    if (_jspx_th_jv_greet_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_jv_greet_param.reuse(_jspx_th_jv_greet_0);
    return false;
  }
}
