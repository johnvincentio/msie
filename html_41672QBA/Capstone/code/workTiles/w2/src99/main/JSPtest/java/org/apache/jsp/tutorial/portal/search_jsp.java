package org.apache.jsp.tutorial.portal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(2);
    _jspx_dependants.add("/WEB-INF/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_present_parameter;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_parameter_name_id;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_logic_present_parameter = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_parameter_name_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_logic_present_parameter.release();
    _jspx_tagPool_bean_parameter_name_id.release();
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

      out.write("\r\n\r\n\r\n<div align=\"center\"><font size=\"+1\"><b>\r\n<TABLE border=0 cellPadding=2 cellSpacing=0 width=190>\r\n  <FORM name=panel>\r\n  <TBODY>\r\n  <TR>\r\n    <TD class=spanhd>Internet Search</TD></TR>\r\n  <TR>\r\n  \r\n");
      //  logic:present
      org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_present_0 = (org.apache.struts.taglib.logic.PresentTag) _jspx_tagPool_logic_present_parameter.get(org.apache.struts.taglib.logic.PresentTag.class);
      _jspx_th_logic_present_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_present_0.setParent(null);
      _jspx_th_logic_present_0.setParameter("query");
      int _jspx_eval_logic_present_0 = _jspx_th_logic_present_0.doStartTag();
      if (_jspx_eval_logic_present_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\r');
          out.write('\n');
          //  bean:parameter
          java.lang.String query = null;
          org.apache.struts.taglib.bean.ParameterTag _jspx_th_bean_parameter_0 = (org.apache.struts.taglib.bean.ParameterTag) _jspx_tagPool_bean_parameter_name_id.get(org.apache.struts.taglib.bean.ParameterTag.class);
          _jspx_th_bean_parameter_0.setPageContext(_jspx_page_context);
          _jspx_th_bean_parameter_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_present_0);
          _jspx_th_bean_parameter_0.setId("query");
          _jspx_th_bean_parameter_0.setName("query");
          int _jspx_eval_bean_parameter_0 = _jspx_th_bean_parameter_0.doStartTag();
          query = (java.lang.String) _jspx_page_context.findAttribute("query");
          if (_jspx_th_bean_parameter_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          query = (java.lang.String) _jspx_page_context.findAttribute("query");
          _jspx_tagPool_bean_parameter_name_id.reuse(_jspx_th_bean_parameter_0);
          out.write("\r\n    <TD class=datagrey>Query found : <BR><BR> ");
          out.print(query);
          out.write("</TD></TR>\r\n");
          int evalDoAfterBody = _jspx_th_logic_present_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_present_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_present_parameter.reuse(_jspx_th_logic_present_0);
      out.write("\r\n\r\n    <TD class=datagrey>Enter a term or topic: <BR><BR><INPUT maxLength=32 \r\n      name=query size=17></TD></TR>\r\n  <TR>\r\n    <TD class=inputgrey>&nbsp;<INPUT alt=\"Search the Internet\" border=0 \r\n      height=24 name=\"Search the Internet\" src=\"");
      out.print(request.getContextPath());
      out.write("/tutorial/images/input_gen_search.gif\" \r\n      title=\"Search the Internet\" type=image \r\n  width=86></FORM></TD></TR></FORM></TBODY></TABLE>  </b></font></div>");
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
