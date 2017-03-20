package org.apache.jsp.test;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class testInclude_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(2);
    _jspx_dependants.add("/WEB-INF/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/struts-tiles.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_iterate_type_id_collection;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tiles_insert_flush_definition;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_logic_iterate_type_id_collection = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_tiles_insert_flush_definition = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_logic_iterate_type_id_collection.release();
    _jspx_tagPool_tiles_insert_flush_definition.release();
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

      out.write("\r\n\r\n\r\n\r\n");

java.util.List list = new java.util.ArrayList();
list.add( "header.jsp" );
list.add( "body.jsp" );
int position=0;

      out.write("\r\n\r\n <hr>\r\n \r\n <strong>1 request.getRequestDispatcher(uri).include(request, response)</strong>\r\n\r\n ");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_0 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_id_collection.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_0.setParent(null);
      _jspx_th_logic_iterate_0.setId("uri");
      _jspx_th_logic_iterate_0.setCollection(list);
      _jspx_th_logic_iterate_0.setType("java.lang.String");
      int _jspx_eval_logic_iterate_0 = _jspx_th_logic_iterate_0.doStartTag();
      if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.String uri = null;
        if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_0.doInitBody();
        }
        uri = (java.lang.String) _jspx_page_context.findAttribute("uri");
        do {
          out.write("\r\n  <br>\r\n  include number ");
          out.print( position++ );
          out.write("\r\n  <br>\r\n   ");
 // insert the id
   response.flushBuffer();
   response.getWriter().flush();
   //out.flush();
   request.getRequestDispatcher(uri).include(request, response);
   response.getWriter().flush();
   response.flushBuffer();
   
          out.write('\r');
          out.write('\n');
          out.write(' ');
          int evalDoAfterBody = _jspx_th_logic_iterate_0.doAfterBody();
          uri = (java.lang.String) _jspx_page_context.findAttribute("uri");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_logic_iterate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_iterate_type_id_collection.reuse(_jspx_th_logic_iterate_0);
      out.write("\r\n \r\n<hr>\r\n<strong>pageContext.include(page)</strong>\r\n\r\n ");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_1 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_id_collection.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_1.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_1.setParent(null);
      _jspx_th_logic_iterate_1.setId("uri");
      _jspx_th_logic_iterate_1.setCollection(list);
      _jspx_th_logic_iterate_1.setType("java.lang.String");
      int _jspx_eval_logic_iterate_1 = _jspx_th_logic_iterate_1.doStartTag();
      if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.String uri = null;
        if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_1.doInitBody();
        }
        uri = (java.lang.String) _jspx_page_context.findAttribute("uri");
        do {
          out.write("\r\n  <br>\r\n  include number ");
          out.print( position++ );
          out.write("\r\n  <br>\r\n   ");
 // insert the id
   pageContext.include(uri);
   
          out.write('\r');
          out.write('\n');
          out.write(' ');
          int evalDoAfterBody = _jspx_th_logic_iterate_1.doAfterBody();
          uri = (java.lang.String) _jspx_page_context.findAttribute("uri");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_logic_iterate_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_iterate_type_id_collection.reuse(_jspx_th_logic_iterate_1);
      out.write("<hr>\r\n \r\n<hr>\r\n<strong>tiles:insert</strong>\r\n\r\n ");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_2 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_id_collection.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_2.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_2.setParent(null);
      _jspx_th_logic_iterate_2.setId("uri");
      _jspx_th_logic_iterate_2.setCollection(list);
      _jspx_th_logic_iterate_2.setType("java.lang.String");
      int _jspx_eval_logic_iterate_2 = _jspx_th_logic_iterate_2.doStartTag();
      if (_jspx_eval_logic_iterate_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.String uri = null;
        if (_jspx_eval_logic_iterate_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_2.doInitBody();
        }
        uri = (java.lang.String) _jspx_page_context.findAttribute("uri");
        do {
          out.write("\r\n  <br>\r\n  include number ");
          out.print( position++ );
          out.write("\r\n  <br>\r\n   ");
          if (_jspx_meth_tiles_insert_0(_jspx_th_logic_iterate_2, _jspx_page_context))
            return;
          out.write('\r');
          out.write('\n');
          out.write(' ');
          int evalDoAfterBody = _jspx_th_logic_iterate_2.doAfterBody();
          uri = (java.lang.String) _jspx_page_context.findAttribute("uri");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_logic_iterate_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_iterate_type_id_collection.reuse(_jspx_th_logic_iterate_2);
      out.write("\r\n\r\n<strong>Done</strong>\r\n\r\n \r\n");
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

  private boolean _jspx_meth_tiles_insert_0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_2, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insert
    org.apache.struts.taglib.tiles.InsertTag _jspx_th_tiles_insert_0 = (org.apache.struts.taglib.tiles.InsertTag) _jspx_tagPool_tiles_insert_flush_definition.get(org.apache.struts.taglib.tiles.InsertTag.class);
    _jspx_th_tiles_insert_0.setPageContext(_jspx_page_context);
    _jspx_th_tiles_insert_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_2);
    _jspx_th_tiles_insert_0.setDefinition("test.layout.test1");
    _jspx_th_tiles_insert_0.setFlush(false);
    int _jspx_eval_tiles_insert_0 = _jspx_th_tiles_insert_0.doStartTag();
    if (_jspx_th_tiles_insert_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_insert_flush_definition.reuse(_jspx_th_tiles_insert_0);
    return false;
  }
}
