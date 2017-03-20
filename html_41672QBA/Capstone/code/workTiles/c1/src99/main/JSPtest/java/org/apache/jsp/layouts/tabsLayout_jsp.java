package org.apache.jsp.layouts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jvapp.Debug;
import jvapp.JVParameters;
import jvapp.JVAttributes;

public final class tabsLayout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(3);
    _jspx_dependants.add("/WEB-INF/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/struts-tiles.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tiles_useAttribute_name_classname;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tiles_useAttribute_name_ignore_id_classname;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_iterate_type_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tiles_insert_name_flush;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_tiles_useAttribute_name_classname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_tiles_useAttribute_name_ignore_id_classname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_iterate_type_name_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_tiles_insert_name_flush = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_tiles_useAttribute_name_classname.release();
    _jspx_tagPool_tiles_useAttribute_name_ignore_id_classname.release();
    _jspx_tagPool_logic_iterate_type_name_id.release();
    _jspx_tagPool_tiles_insert_name_flush.release();
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

      out.write("\n\n\n\n\n\n\n\n\n\n\n");
      //  tiles:useAttribute
      org.apache.struts.taglib.tiles.UseAttributeTag _jspx_th_tiles_useAttribute_0 = (org.apache.struts.taglib.tiles.UseAttributeTag) _jspx_tagPool_tiles_useAttribute_name_classname.get(org.apache.struts.taglib.tiles.UseAttributeTag.class);
      _jspx_th_tiles_useAttribute_0.setPageContext(_jspx_page_context);
      _jspx_th_tiles_useAttribute_0.setParent(null);
      _jspx_th_tiles_useAttribute_0.setName("parameterName");
      _jspx_th_tiles_useAttribute_0.setClassname("java.lang.String");
      int _jspx_eval_tiles_useAttribute_0 = _jspx_th_tiles_useAttribute_0.doStartTag();
      if (_jspx_th_tiles_useAttribute_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_tiles_useAttribute_name_classname.reuse(_jspx_th_tiles_useAttribute_0);
      java.lang.String parameterName = null;
      parameterName = (java.lang.String) _jspx_page_context.findAttribute("parameterName");
      out.write('\n');
      //  tiles:useAttribute
      org.apache.struts.taglib.tiles.UseAttributeTag _jspx_th_tiles_useAttribute_1 = (org.apache.struts.taglib.tiles.UseAttributeTag) _jspx_tagPool_tiles_useAttribute_name_ignore_id_classname.get(org.apache.struts.taglib.tiles.UseAttributeTag.class);
      _jspx_th_tiles_useAttribute_1.setPageContext(_jspx_page_context);
      _jspx_th_tiles_useAttribute_1.setParent(null);
      _jspx_th_tiles_useAttribute_1.setId("selectedIndexStr");
      _jspx_th_tiles_useAttribute_1.setName("selectedIndex");
      _jspx_th_tiles_useAttribute_1.setIgnore(true);
      _jspx_th_tiles_useAttribute_1.setClassname("java.lang.String");
      int _jspx_eval_tiles_useAttribute_1 = _jspx_th_tiles_useAttribute_1.doStartTag();
      if (_jspx_th_tiles_useAttribute_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_tiles_useAttribute_name_ignore_id_classname.reuse(_jspx_th_tiles_useAttribute_1);
      java.lang.String selectedIndexStr = null;
      selectedIndexStr = (java.lang.String) _jspx_page_context.findAttribute("selectedIndexStr");
      out.write('\n');
      //  tiles:useAttribute
      org.apache.struts.taglib.tiles.UseAttributeTag _jspx_th_tiles_useAttribute_2 = (org.apache.struts.taglib.tiles.UseAttributeTag) _jspx_tagPool_tiles_useAttribute_name_classname.get(org.apache.struts.taglib.tiles.UseAttributeTag.class);
      _jspx_th_tiles_useAttribute_2.setPageContext(_jspx_page_context);
      _jspx_th_tiles_useAttribute_2.setParent(null);
      _jspx_th_tiles_useAttribute_2.setName("tabList");
      _jspx_th_tiles_useAttribute_2.setClassname("java.util.List");
      int _jspx_eval_tiles_useAttribute_2 = _jspx_th_tiles_useAttribute_2.doStartTag();
      if (_jspx_th_tiles_useAttribute_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_tiles_useAttribute_name_classname.reuse(_jspx_th_tiles_useAttribute_2);
      java.util.List tabList = null;
      tabList = (java.util.List) _jspx_page_context.findAttribute("tabList");
      out.write('\n');

	Debug.println(">>> tabsLayout.jsp");
	JVParameters params = new JVParameters(request.getParameterMap());
	params.showParams ("tabsLayout");
	JVAttributes attribs = new JVAttributes(request.getAttributeNames());
	attribs.showParams ("tabsLayout");

	String selectedColor="#98ABC7";
	String notSelectedColor="#C0C0C0";
  
	int index = 0; // Loop index
	int selectedIndex = 0;
// Check if selected come from request parameter
	Debug.println("stage 1");
	try {
		selectedIndex = Integer.parseInt(selectedIndexStr);
		Debug.println("stage 2");
		selectedIndex = Integer.parseInt(request.getParameter( parameterName ));
		Debug.println("stage 3");
	}
	catch( java.lang.NumberFormatException ex )
	{ // do nothing
		Debug.println("stage 4");
	}

// Check selectedIndex bounds
	Debug.println("stage 5");
	if (selectedIndex < 0 || selectedIndex >= tabList.size())
		selectedIndex = 0;
	Debug.println("selectedIndex "+selectedIndex);
	String selectedBody = ((org.apache.struts.tiles.beans.MenuItem)tabList.get(selectedIndex)).getLink(); // Selected body
	Debug.println("selectedBody :"+selectedBody+":");

      out.write("\n\n<table border=\"0\"  cellspacing=\"0\" cellpadding=\"0\">\n  \n<tr>\n  <td width=\"10\">&nbsp;</td>\n  <td>\n    <table border=\"0\"  cellspacing=\"0\" cellpadding=\"5\">\n      <tr>\n\n");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_0 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_type_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_0.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_0.setParent(null);
      _jspx_th_logic_iterate_0.setId("tab");
      _jspx_th_logic_iterate_0.setName("tabList");
      _jspx_th_logic_iterate_0.setType("org.apache.struts.tiles.beans.MenuItem");
      int _jspx_eval_logic_iterate_0 = _jspx_th_logic_iterate_0.doStartTag();
      if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        org.apache.struts.tiles.beans.MenuItem tab = null;
        if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_0.doInitBody();
        }
        tab = (org.apache.struts.tiles.beans.MenuItem) _jspx_page_context.findAttribute("tab");
        do {
          out.write('\n');
 // compute href
	Debug.println("stage 10");
String href = request.getRequestURI() + "?"+parameterName + "=" + index;
	Debug.println("href :"+href+":");
    // Don't add request URI prefix , but let the client compute the original URL
	// This allows to use a Struts action as page URL, and perform a forward.
	// Bug reported by Don Peterkofsky 
  //String href = "" + "?"+parameterName + "=" + index;

	String color = notSelectedColor;
	Debug.println("selectedIndex (2) "+selectedIndex);
	if( index == selectedIndex ) {
		Debug.println("stage 11");
		selectedBody = tab.getLink();
		color = selectedColor;
	} // enf if
	Debug.println("selectedBody (2):"+selectedBody+":");
	Debug.println("color :"+color+":");
	index++;
	Debug.println("index:"+index+":");
	Debug.println("stage 12");

          out.write("\n  <td bgcolor=\"");
          out.print(color);
          out.write("\">\n  <a href=\"");
          out.print(href);
          out.write('"');
          out.write(' ');
          out.write('>');
          out.print(tab.getValue());
          out.write("</a>\n  </td>\n  <td width=\"1\" ></td>\n  \n");
          int evalDoAfterBody = _jspx_th_logic_iterate_0.doAfterBody();
          tab = (org.apache.struts.tiles.beans.MenuItem) _jspx_page_context.findAttribute("tab");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_logic_iterate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_iterate_type_name_id.reuse(_jspx_th_logic_iterate_0);
      out.write("\n      </tr>\n    </table>\n  </td>\n  <td width=\"10\" >&nbsp;</td>\n</tr>\n\n<tr>\n  <td height=\"5\" bgcolor=\"");
      out.print(selectedColor);
      out.write("\" colspan=\"3\" >&nbsp;</td>\n</tr>  \n\n  \n<tr>\n\n");

	Debug.println("selectedColor (3):"+selectedColor+":");
	Debug.println("selectedBody (3):"+selectedBody+":");

      out.write("\n\n  <td width=\"10\" bgcolor=\"");
      out.print(selectedColor);
      out.write("\">&nbsp;</td>\n  <td>\n  ");
      //  tiles:insert
      org.apache.struts.taglib.tiles.InsertTag _jspx_th_tiles_insert_0 = (org.apache.struts.taglib.tiles.InsertTag) _jspx_tagPool_tiles_insert_name_flush.get(org.apache.struts.taglib.tiles.InsertTag.class);
      _jspx_th_tiles_insert_0.setPageContext(_jspx_page_context);
      _jspx_th_tiles_insert_0.setParent(null);
      _jspx_th_tiles_insert_0.setName(selectedBody);
      _jspx_th_tiles_insert_0.setFlush(true);
      int _jspx_eval_tiles_insert_0 = _jspx_th_tiles_insert_0.doStartTag();
      if (_jspx_th_tiles_insert_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_tiles_insert_name_flush.reuse(_jspx_th_tiles_insert_0);
      out.write("\n\n\n  </td>\n  <td width=\"10\" bgcolor=\"");
      out.print(selectedColor);
      out.write("\">&nbsp;</td>\n</tr>  \n\n<tr>\n  <td height=\"5\" bgcolor=\"");
      out.print(selectedColor);
      out.write("\" colspan=\"3\" >&nbsp;</td>\n</tr>  \n\n</table>\n");

	Debug.println("<<< tabsLayout.jsp");

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
