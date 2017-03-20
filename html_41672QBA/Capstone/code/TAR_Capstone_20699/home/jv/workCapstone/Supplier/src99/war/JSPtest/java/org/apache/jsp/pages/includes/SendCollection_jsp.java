package org.apache.jsp.pages.includes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jvcommon.Debug;
import jvapp.JVParameters;
import jvapp.JVAttributes;

public final class SendCollection_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(3);
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/struts-logic.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_errors;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_define_type_scope_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_message_key;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_property_name_filter;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_link_page;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_errors = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_define_type_scope_name_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_message_key = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_write_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_write_property_name_filter = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_link_page = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_errors.release();
    _jspx_tagPool_bean_define_type_scope_name_id.release();
    _jspx_tagPool_bean_message_key.release();
    _jspx_tagPool_bean_write_property_name.release();
    _jspx_tagPool_bean_write_property_name_filter.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      if (_jspx_meth_html_errors_0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_0 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_type_scope_name_id.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_define_0.setPageContext(_jspx_page_context);
      _jspx_th_bean_define_0.setParent(null);
      _jspx_th_bean_define_0.setId("collection");
      _jspx_th_bean_define_0.setName( jvapp.Constants.COLLECTION_INFO_KEY );
      _jspx_th_bean_define_0.setType("jvcommon.JVCollection");
      _jspx_th_bean_define_0.setScope("request");
      int _jspx_eval_bean_define_0 = _jspx_th_bean_define_0.doStartTag();
      if (_jspx_th_bean_define_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_bean_define_type_scope_name_id.reuse(_jspx_th_bean_define_0);
      jvcommon.JVCollection collection = null;
      collection = (jvcommon.JVCollection) _jspx_page_context.findAttribute("collection");
      out.write("\r\n\r\n");

	Debug.println(">>> SendCollection.jsp");
	JVParameters params = new JVParameters(request.getParameterMap());
	params.showParams ("SendCollection");
	JVAttributes attribs = new JVAttributes(request.getAttributeNames());
	attribs.showParams ("SendCollection");

      out.write("\r\n\r\n<center>\r\n\r\n<table>\r\n<TR>\r\n\t<TD BGCOLOR=AAAAAA>");
      if (_jspx_meth_bean_message_0(_jspx_page_context))
        return;
      out.write("</TD>\r\n    <TD BGCOLOR=AAAAAA ALIGN=CENTER>");
      if (_jspx_meth_bean_message_1(_jspx_page_context))
        return;
      out.write("</TD>\r\n</TR>\r\n\r\n<tr>\r\n\t<td>");
      if (_jspx_meth_bean_write_0(_jspx_page_context))
        return;
      out.write("</td>\r\n\t<td>");
      if (_jspx_meth_bean_write_1(_jspx_page_context))
        return;
      out.write("</td>\r\n</tr>\r\n</table>\r\n</center>\r\n\r\n<br/>\r\n");

	int nCollection = collection.getCollectionid();
	String strLink = "/SendCollection.do?action=Send1&id=" + nCollection;

      out.write('\r');
      out.write('\n');
      //  html:link
      org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_0 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_page.get(org.apache.struts.taglib.html.LinkTag.class);
      _jspx_th_html_link_0.setPageContext(_jspx_page_context);
      _jspx_th_html_link_0.setParent(null);
      _jspx_th_html_link_0.setPage(strLink);
      int _jspx_eval_html_link_0 = _jspx_th_html_link_0.doStartTag();
      if (_jspx_eval_html_link_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_link_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_link_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_link_0.doInitBody();
        }
        do {
          out.write("Send with SAAJ; one record/send");
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
      out.write("\r\n\r\n<br/>\r\n");

	nCollection = collection.getCollectionid();
	strLink = "/SendCollection.do?action=Send2&id=" + nCollection;

      out.write('\r');
      out.write('\n');
      //  html:link
      org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_1 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_page.get(org.apache.struts.taglib.html.LinkTag.class);
      _jspx_th_html_link_1.setPageContext(_jspx_page_context);
      _jspx_th_html_link_1.setParent(null);
      _jspx_th_html_link_1.setPage(strLink);
      int _jspx_eval_html_link_1 = _jspx_th_html_link_1.doStartTag();
      if (_jspx_eval_html_link_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_link_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_link_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_link_1.doInitBody();
        }
        do {
          out.write("Send with SAAJ; all records at once");
          int evalDoAfterBody = _jspx_th_html_link_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_link_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_html_link_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_html_link_page.reuse(_jspx_th_html_link_1);
      out.write("\r\n\r\n<br/>\r\n");

	nCollection = collection.getCollectionid();
	strLink = "/SendCollection.do?action=Send3&id=" + nCollection;

      out.write('\r');
      out.write('\n');
      //  html:link
      org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_2 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_page.get(org.apache.struts.taglib.html.LinkTag.class);
      _jspx_th_html_link_2.setPageContext(_jspx_page_context);
      _jspx_th_html_link_2.setParent(null);
      _jspx_th_html_link_2.setPage(strLink);
      int _jspx_eval_html_link_2 = _jspx_th_html_link_2.doStartTag();
      if (_jspx_eval_html_link_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_link_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_link_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_link_2.doInitBody();
        }
        do {
          out.write("Send to MDB as XML");
          int evalDoAfterBody = _jspx_th_html_link_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_link_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_html_link_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_html_link_page.reuse(_jspx_th_html_link_2);
      out.write("\r\n\r\n<br/>\r\n");

	nCollection = collection.getCollectionid();
	strLink = "/SendCollection.do?action=Send4&id=" + nCollection;

      out.write('\r');
      out.write('\n');
      //  html:link
      org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_3 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_page.get(org.apache.struts.taglib.html.LinkTag.class);
      _jspx_th_html_link_3.setPageContext(_jspx_page_context);
      _jspx_th_html_link_3.setParent(null);
      _jspx_th_html_link_3.setPage(strLink);
      int _jspx_eval_html_link_3 = _jspx_th_html_link_3.doStartTag();
      if (_jspx_eval_html_link_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_link_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_link_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_link_3.doInitBody();
        }
        do {
          out.write("Send to MDB as ObjectMessage");
          int evalDoAfterBody = _jspx_th_html_link_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_link_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_html_link_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_html_link_page.reuse(_jspx_th_html_link_3);
      out.write("\r\n\r\n<br/>\r\n");

	nCollection = collection.getCollectionid();
	strLink = "/SendCollection.do?action=Send5&id=" + nCollection;

      out.write('\r');
      out.write('\n');
      //  html:link
      org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_4 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_page.get(org.apache.struts.taglib.html.LinkTag.class);
      _jspx_th_html_link_4.setPageContext(_jspx_page_context);
      _jspx_th_html_link_4.setParent(null);
      _jspx_th_html_link_4.setPage(strLink);
      int _jspx_eval_html_link_4 = _jspx_th_html_link_4.doStartTag();
      if (_jspx_eval_html_link_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_html_link_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_html_link_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_html_link_4.doInitBody();
        }
        do {
          out.write("Send to JAX-RPC WebService as XML");
          int evalDoAfterBody = _jspx_th_html_link_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_html_link_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_html_link_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_html_link_page.reuse(_jspx_th_html_link_4);
      out.write("\r\n\r\n<br/>\r\n\r\n");
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

  private boolean _jspx_meth_html_errors_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_0 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_0.setPageContext(_jspx_page_context);
    _jspx_th_html_errors_0.setParent(null);
    int _jspx_eval_html_errors_0 = _jspx_th_html_errors_0.doStartTag();
    if (_jspx_th_html_errors_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_errors.reuse(_jspx_th_html_errors_0);
    return false;
  }

  private boolean _jspx_meth_bean_message_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_0 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_0.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_0.setParent(null);
    _jspx_th_bean_message_0.setKey("products.hd1");
    int _jspx_eval_bean_message_0 = _jspx_th_bean_message_0.doStartTag();
    if (_jspx_th_bean_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_message_key.reuse(_jspx_th_bean_message_0);
    return false;
  }

  private boolean _jspx_meth_bean_message_1(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  bean:message
    org.apache.struts.taglib.bean.MessageTag _jspx_th_bean_message_1 = (org.apache.struts.taglib.bean.MessageTag) _jspx_tagPool_bean_message_key.get(org.apache.struts.taglib.bean.MessageTag.class);
    _jspx_th_bean_message_1.setPageContext(_jspx_page_context);
    _jspx_th_bean_message_1.setParent(null);
    _jspx_th_bean_message_1.setKey("products.hd2");
    int _jspx_eval_bean_message_1 = _jspx_th_bean_message_1.doStartTag();
    if (_jspx_th_bean_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_message_key.reuse(_jspx_th_bean_message_1);
    return false;
  }

  private boolean _jspx_meth_bean_write_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_0 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_0.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_0.setParent(null);
    _jspx_th_bean_write_0.setName("collection");
    _jspx_th_bean_write_0.setProperty("collectionid");
    int _jspx_eval_bean_write_0 = _jspx_th_bean_write_0.doStartTag();
    if (_jspx_th_bean_write_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name.reuse(_jspx_th_bean_write_0);
    return false;
  }

  private boolean _jspx_meth_bean_write_1(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_1 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_filter.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_1.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_1.setParent(null);
    _jspx_th_bean_write_1.setName("collection");
    _jspx_th_bean_write_1.setProperty("description");
    _jspx_th_bean_write_1.setFilter(false);
    int _jspx_eval_bean_write_1 = _jspx_th_bean_write_1.doStartTag();
    if (_jspx_th_bean_write_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_filter.reuse(_jspx_th_bean_write_1);
    return false;
  }
}
