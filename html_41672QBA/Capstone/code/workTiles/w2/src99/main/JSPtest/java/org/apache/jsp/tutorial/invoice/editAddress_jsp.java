package org.apache.jsp.tutorial.invoice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editAddress_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(3);
    _jspx_dependants.add("/WEB-INF/struts-tiles.tld");
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
    _jspx_dependants.add("/WEB-INF/struts-bean.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tiles_useAttribute_name_ignore_id_classname;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tiles_importAttribute_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_size_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_size_property;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_tiles_useAttribute_name_ignore_id_classname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_tiles_importAttribute_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_size_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_size_property = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_tiles_useAttribute_name_ignore_id_classname.release();
    _jspx_tagPool_tiles_importAttribute_name.release();
    _jspx_tagPool_html_text_size_property_name.release();
    _jspx_tagPool_html_text_size_property.release();
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

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n");
      //  tiles:useAttribute
      org.apache.struts.taglib.tiles.UseAttributeTag _jspx_th_tiles_useAttribute_0 = (org.apache.struts.taglib.tiles.UseAttributeTag) _jspx_tagPool_tiles_useAttribute_name_ignore_id_classname.get(org.apache.struts.taglib.tiles.UseAttributeTag.class);
      _jspx_th_tiles_useAttribute_0.setPageContext(_jspx_page_context);
      _jspx_th_tiles_useAttribute_0.setParent(null);
      _jspx_th_tiles_useAttribute_0.setId("beanName");
      _jspx_th_tiles_useAttribute_0.setName("property");
      _jspx_th_tiles_useAttribute_0.setClassname("java.lang.String");
      _jspx_th_tiles_useAttribute_0.setIgnore(true);
      int _jspx_eval_tiles_useAttribute_0 = _jspx_th_tiles_useAttribute_0.doStartTag();
      if (_jspx_th_tiles_useAttribute_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_tiles_useAttribute_name_ignore_id_classname.reuse(_jspx_th_tiles_useAttribute_0);
      java.lang.String beanName = null;
      beanName = (java.lang.String) _jspx_page_context.findAttribute("beanName");
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_tiles_importAttribute_0(_jspx_page_context))
        return;
      out.write("\r\n\r\n\r\n");
 if( beanName == null ) beanName = ""; else if (beanName !="" ) beanName = beanName + "."; 
      out.write("\r\n\r\n<table border=\"0\" width=\"100%\">\r\n\r\n  <tr>\r\n    <th align=\"right\" width=\"30%\">\r\n      Street\r\n    </th>\r\n    <td align=\"left\">\r\n\t  \r\n\t  \r\n\t  \r\n\t  \r\n\t  ");
      //  html:text
      org.apache.struts.taglib.html.TextTag _jspx_th_html_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_size_property_name.get(org.apache.struts.taglib.html.TextTag.class);
      _jspx_th_html_text_0.setPageContext(_jspx_page_context);
      _jspx_th_html_text_0.setParent(null);
      _jspx_th_html_text_0.setName("bean");
      _jspx_th_html_text_0.setProperty(beanName+"street1");
      _jspx_th_html_text_0.setSize("50");
      int _jspx_eval_html_text_0 = _jspx_th_html_text_0.doStartTag();
      if (_jspx_th_html_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_html_text_size_property_name.reuse(_jspx_th_html_text_0);
      out.write("\r\n\t  \r\n    </td>\r\n  </tr>\r\n\r\n  <tr>\r\n    <th align=\"right\">\r\n      Street (con't)\r\n    </th>\r\n    <td align=\"left\">\r\n        ");
      //  html:text
      org.apache.struts.taglib.html.TextTag _jspx_th_html_text_1 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_size_property.get(org.apache.struts.taglib.html.TextTag.class);
      _jspx_th_html_text_1.setPageContext(_jspx_page_context);
      _jspx_th_html_text_1.setParent(null);
      _jspx_th_html_text_1.setProperty(beanName+"street2");
      _jspx_th_html_text_1.setSize("50");
      int _jspx_eval_html_text_1 = _jspx_th_html_text_1.doStartTag();
      if (_jspx_th_html_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_html_text_size_property.reuse(_jspx_th_html_text_1);
      out.write("\r\n    </td>\r\n  </tr>\r\n\r\n  <tr>\r\n    <th align=\"right\">\r\n      City\r\n    </th>\r\n    <td align=\"left\">\r\n        ");
      //  html:text
      org.apache.struts.taglib.html.TextTag _jspx_th_html_text_2 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_size_property_name.get(org.apache.struts.taglib.html.TextTag.class);
      _jspx_th_html_text_2.setPageContext(_jspx_page_context);
      _jspx_th_html_text_2.setParent(null);
      _jspx_th_html_text_2.setName("bean");
      _jspx_th_html_text_2.setProperty(beanName+"city");
      _jspx_th_html_text_2.setSize("50");
      int _jspx_eval_html_text_2 = _jspx_th_html_text_2.doStartTag();
      if (_jspx_th_html_text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_html_text_size_property_name.reuse(_jspx_th_html_text_2);
      out.write("\r\n    </td>\r\n  </tr>\r\n\r\n  <tr>\r\n    <th align=\"right\">\r\n      Country\r\n    </th>\r\n    <td align=\"left\">\r\n        ");
      //  html:text
      org.apache.struts.taglib.html.TextTag _jspx_th_html_text_3 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_size_property.get(org.apache.struts.taglib.html.TextTag.class);
      _jspx_th_html_text_3.setPageContext(_jspx_page_context);
      _jspx_th_html_text_3.setParent(null);
      _jspx_th_html_text_3.setProperty(beanName+"country");
      _jspx_th_html_text_3.setSize("50");
      int _jspx_eval_html_text_3 = _jspx_th_html_text_3.doStartTag();
      if (_jspx_th_html_text_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_html_text_size_property.reuse(_jspx_th_html_text_3);
      out.write("\r\n    </td>\r\n  </tr>\r\n\r\n  <tr>\r\n    <th align=\"right\">\r\n      Zip code\r\n    </th>\r\n    <td align=\"left\">\r\n\t  ");
      //  html:text
      org.apache.struts.taglib.html.TextTag _jspx_th_html_text_4 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_size_property.get(org.apache.struts.taglib.html.TextTag.class);
      _jspx_th_html_text_4.setPageContext(_jspx_page_context);
      _jspx_th_html_text_4.setParent(null);
      _jspx_th_html_text_4.setProperty(beanName+"zipCode");
      _jspx_th_html_text_4.setSize("50");
      int _jspx_eval_html_text_4 = _jspx_th_html_text_4.doStartTag();
      if (_jspx_th_html_text_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_html_text_size_property.reuse(_jspx_th_html_text_4);
      out.write("\r\n    </td>\r\n  </tr>\r\n\r\n</table>\r\n");
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
    org.apache.struts.taglib.tiles.ImportAttributeTag _jspx_th_tiles_importAttribute_0 = (org.apache.struts.taglib.tiles.ImportAttributeTag) _jspx_tagPool_tiles_importAttribute_name.get(org.apache.struts.taglib.tiles.ImportAttributeTag.class);
    _jspx_th_tiles_importAttribute_0.setPageContext(_jspx_page_context);
    _jspx_th_tiles_importAttribute_0.setParent(null);
    _jspx_th_tiles_importAttribute_0.setName("bean");
    int _jspx_eval_tiles_importAttribute_0 = _jspx_th_tiles_importAttribute_0.doStartTag();
    if (_jspx_th_tiles_importAttribute_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_importAttribute_name.reuse(_jspx_th_tiles_importAttribute_0);
    return false;
  }
}
