package org.apache.jsp.test;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(3);
    _jspx_dependants.add("/WEB-INF/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/struts-tiles.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tiles_importAttribute;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_define_type_scope_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_iterate_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_name_filter;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_tiles_importAttribute = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_define_type_scope_name_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_iterate_name_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_write_name_filter = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_tiles_importAttribute.release();
    _jspx_tagPool_bean_define_type_scope_name_id.release();
    _jspx_tagPool_logic_iterate_name_id.release();
    _jspx_tagPool_bean_write_name_filter.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
      if (_jspx_meth_tiles_importAttribute_0(_jspx_page_context))
        return;
      out.write("\r\n\r\n\r\n");
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_0 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_type_scope_name_id.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_define_0.setPageContext(_jspx_page_context);
      _jspx_th_bean_define_0.setParent(null);
      _jspx_th_bean_define_0.setId("links");
      _jspx_th_bean_define_0.setName("links");
      _jspx_th_bean_define_0.setType("java.util.List");
      _jspx_th_bean_define_0.setScope("page");
      int _jspx_eval_bean_define_0 = _jspx_th_bean_define_0.doStartTag();
      if (_jspx_th_bean_define_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_bean_define_type_scope_name_id.reuse(_jspx_th_bean_define_0);
      java.util.List links = null;
      links = (java.util.List) _jspx_page_context.findAttribute("links");
      out.write('\r');
      out.write('\n');
 Iterator i = links.iterator(); 
      out.write("\r\n\r\n\r\n<table>\r\n");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_0 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_0.setParent(null);
      _jspx_th_logic_iterate_0.setId("item");
      _jspx_th_logic_iterate_0.setName("items");
      int _jspx_eval_logic_iterate_0 = _jspx_th_logic_iterate_0.doStartTag();
      if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object item = null;
        if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_0.doInitBody();
        }
        item = (java.lang.Object) _jspx_page_context.findAttribute("item");
        do {
          out.write("\r\n\r\n<tr>\r\n  <td width=\"10\" valign=\"top\" ></td>\r\n  <td valign=\"top\"  >\r\n\t  ");
 // Compute link value
	    String link = i.next().toString();
	    if(link.startsWith("/") )
		  link = request.getContextPath() + link;
	  
          out.write("\r\n\t  <font size=\"-1\"><a href=\"");
          out.print(link);
          out.write('"');
          out.write('>');
          if (_jspx_meth_bean_write_0(_jspx_th_logic_iterate_0, _jspx_page_context))
            return;
          out.write("</a></font>\r\n  </td>\r\n</tr>\r\n");
          int evalDoAfterBody = _jspx_th_logic_iterate_0.doAfterBody();
          item = (java.lang.Object) _jspx_page_context.findAttribute("item");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_logic_iterate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_iterate_name_id.reuse(_jspx_th_logic_iterate_0);
      out.write("\r\n</table>\r\n");
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
    org.apache.struts.taglib.tiles.ImportAttributeTag _jspx_th_tiles_importAttribute_0 = (org.apache.struts.taglib.tiles.ImportAttributeTag) _jspx_tagPool_tiles_importAttribute.get(org.apache.struts.taglib.tiles.ImportAttributeTag.class);
    _jspx_th_tiles_importAttribute_0.setPageContext(_jspx_page_context);
    _jspx_th_tiles_importAttribute_0.setParent(null);
    int _jspx_eval_tiles_importAttribute_0 = _jspx_th_tiles_importAttribute_0.doStartTag();
    if (_jspx_th_tiles_importAttribute_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_importAttribute.reuse(_jspx_th_tiles_importAttribute_0);
    return false;
  }

  private boolean _jspx_meth_bean_write_0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_0 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_name_filter.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_0.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
    _jspx_th_bean_write_0.setName("item");
    _jspx_th_bean_write_0.setFilter(false);
    int _jspx_eval_bean_write_0 = _jspx_th_bean_write_0.doStartTag();
    if (_jspx_th_bean_write_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_name_filter.reuse(_jspx_th_bean_write_0);
    return false;
  }
}
