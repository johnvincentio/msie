package org.apache.jsp.pages.includes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jvcommon.Debug;
import jvapp.JVParameters;
import jvapp.JVAttributes;

public final class TabsBody_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(2);
    _jspx_dependants.add("/WEB-INF/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_define_type_scope_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_iterate_type_property_name_id;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_bean_define_type_scope_name_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_iterate_type_property_name_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_bean_define_type_scope_name_id.release();
    _jspx_tagPool_logic_iterate_type_property_name_id.release();
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
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_0 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_type_scope_name_id.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_define_0.setPageContext(_jspx_page_context);
      _jspx_th_bean_define_0.setParent(null);
      _jspx_th_bean_define_0.setId("jvTab");
      _jspx_th_bean_define_0.setName( jvapp.Constants.USER_TABS );
      _jspx_th_bean_define_0.setType("jvapp.JVTabs");
      _jspx_th_bean_define_0.setScope("request");
      int _jspx_eval_bean_define_0 = _jspx_th_bean_define_0.doStartTag();
      if (_jspx_th_bean_define_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_bean_define_type_scope_name_id.reuse(_jspx_th_bean_define_0);
      jvapp.JVTabs jvTab = null;
      jvTab = (jvapp.JVTabs) _jspx_page_context.findAttribute("jvTab");
      out.write('\n');
      out.write('\n');

	Debug.println(">>> TabsBody.jsp");
	JVParameters params = new JVParameters(request.getParameterMap());
	params.showParams ("tabsLayout");
	JVAttributes attribs = new JVAttributes(request.getAttributeNames());
	attribs.showParams ("tabsLayout");

      out.write("\n\n<table border=\"0\"  cellspacing=\"0\" cellpadding=\"0\">\n\t<tr>\n\t\t<td width=\"10\">&nbsp;</td>\n\t\t<td>\n\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"5\">\n\t\t\t\t<tr>\n\t\t\t\t\t");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_0 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_property_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_0.setParent(null);
      _jspx_th_logic_iterate_0.setId("item");
      _jspx_th_logic_iterate_0.setType("jvapp.JVTabsItems");
      _jspx_th_logic_iterate_0.setName("jvTab");
      _jspx_th_logic_iterate_0.setProperty("items");
      int _jspx_eval_logic_iterate_0 = _jspx_th_logic_iterate_0.doStartTag();
      if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        jvapp.JVTabsItems item = null;
        if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_0.doInitBody();
        }
        item = (jvapp.JVTabsItems) _jspx_page_context.findAttribute("item");
        do {
          out.write("\n\t\t\t\t\t\t<td bgcolor=\"");
          out.print(item.getColor());
          out.write("\">\n\t\t\t\t\t\t\t<html:link \n\t\t\t\t\t\t\t\tpage=\"");
          out.print(item.getHref());
          out.write('"');
          out.write('>');
          out.print(item.getTabname());
          out.write("\n\t\t\t\t\t\t\t</html:link>\n\t\t\t\t\t\t</td>\n\t\t\t\t\t\t<td width=\"1\" ></td>\n\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_logic_iterate_0.doAfterBody();
          item = (jvapp.JVTabsItems) _jspx_page_context.findAttribute("item");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_logic_iterate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_iterate_type_property_name_id.reuse(_jspx_th_logic_iterate_0);
      out.write("\n\t\t\t\t</tr>\n\t\t\t</table>\n\t\t</td>\n\t\t<td width=\"10\" >&nbsp;</td>\n\t</tr>\n\n<tr>\n  <td height=\"5\" bgcolor=\"");
      out.print(jvTab.getSelectedColor());
      out.write("\" colspan=\"3\" >&nbsp;</td>\n</tr>  \n\n<tr>\n  <td width=\"10\" bgcolor=\"");
      out.print(jvTab.getSelectedColor());
      out.write("\">&nbsp;</td>\n  <td>\n\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, jvTab.getSelectedBody(), out, false);
      out.write("\n  </td>\n  <td width=\"10\" bgcolor=\"");
      out.print(jvTab.getSelectedColor());
      out.write("\">&nbsp;</td>\n</tr>  \n\n<tr>\n  <td height=\"5\" bgcolor=\"");
      out.print(jvTab.getSelectedColor());
      out.write("\" colspan=\"3\" >&nbsp;</td>\n</tr>  \n\n</table>\n");

	Debug.println("<<< TabsBody.jsp");

      out.write('\n');
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
