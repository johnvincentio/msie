package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class polarBears_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_subview_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_panelGrid_columns_columnClasses;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_graphicImage_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_outputText_value_styleClass;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_f_subview_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_panelGrid_columns_columnClasses = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_graphicImage_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_outputText_value_styleClass = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_f_subview_id.release();
    _jspx_tagPool_h_panelGrid_columns_columnClasses.release();
    _jspx_tagPool_h_graphicImage_value.release();
    _jspx_tagPool_h_outputText_value_styleClass.release();
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

      out.write('\n');
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_f_subview_0(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_f_subview_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  f:subview
    com.sun.faces.taglib.jsf_core.SubviewTag _jspx_th_f_subview_0 = (com.sun.faces.taglib.jsf_core.SubviewTag) _jspx_tagPool_f_subview_id.get(com.sun.faces.taglib.jsf_core.SubviewTag.class);
    _jspx_th_f_subview_0.setPageContext(_jspx_page_context);
    _jspx_th_f_subview_0.setParent(null);
    _jspx_th_f_subview_0.setId("polarBear");
    int _jspx_eval_f_subview_0 = _jspx_th_f_subview_0.doStartTag();
    if (_jspx_eval_f_subview_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n   ");
      if (_jspx_meth_h_panelGrid_0(_jspx_th_f_subview_0, _jspx_page_context))
        return true;
      out.write('\n');
    }
    if (_jspx_th_f_subview_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_f_subview_id.reuse(_jspx_th_f_subview_0);
    return false;
  }

  private boolean _jspx_meth_h_panelGrid_0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_subview_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  h:panelGrid
    com.sun.faces.taglib.html_basic.PanelGridTag _jspx_th_h_panelGrid_0 = (com.sun.faces.taglib.html_basic.PanelGridTag) _jspx_tagPool_h_panelGrid_columns_columnClasses.get(com.sun.faces.taglib.html_basic.PanelGridTag.class);
    _jspx_th_h_panelGrid_0.setPageContext(_jspx_page_context);
    _jspx_th_h_panelGrid_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_subview_0);
    _jspx_th_h_panelGrid_0.setColumns("2");
    _jspx_th_h_panelGrid_0.setColumnClasses("bearDiscussionColumn");
    int _jspx_eval_h_panelGrid_0 = _jspx_th_h_panelGrid_0.doStartTag();
    if (_jspx_eval_h_panelGrid_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n      ");
      if (_jspx_meth_h_graphicImage_0(_jspx_th_h_panelGrid_0, _jspx_page_context))
        return true;
      out.write("\n      ");
      if (_jspx_meth_h_outputText_0(_jspx_th_h_panelGrid_0, _jspx_page_context))
        return true;
      out.write("\n   ");
    }
    if (_jspx_th_h_panelGrid_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_h_panelGrid_columns_columnClasses.reuse(_jspx_th_h_panelGrid_0);
    return false;
  }

  private boolean _jspx_meth_h_graphicImage_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_panelGrid_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  h:graphicImage
    com.sun.faces.taglib.html_basic.GraphicImageTag _jspx_th_h_graphicImage_0 = (com.sun.faces.taglib.html_basic.GraphicImageTag) _jspx_tagPool_h_graphicImage_value.get(com.sun.faces.taglib.html_basic.GraphicImageTag.class);
    _jspx_th_h_graphicImage_0.setPageContext(_jspx_page_context);
    _jspx_th_h_graphicImage_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_panelGrid_0);
    _jspx_th_h_graphicImage_0.setValue("/images/polar-bears.jpg");
    int _jspx_eval_h_graphicImage_0 = _jspx_th_h_graphicImage_0.doStartTag();
    if (_jspx_th_h_graphicImage_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_h_graphicImage_value.reuse(_jspx_th_h_graphicImage_0);
    return false;
  }

  private boolean _jspx_meth_h_outputText_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_panelGrid_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_0 = (com.sun.faces.taglib.html_basic.OutputTextTag) _jspx_tagPool_h_outputText_value_styleClass.get(com.sun.faces.taglib.html_basic.OutputTextTag.class);
    _jspx_th_h_outputText_0.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_panelGrid_0);
    _jspx_th_h_outputText_0.setValue("#{msgs.polarBearDiscussion}");
    _jspx_th_h_outputText_0.setStyleClass("tabbedPaneContent");
    int _jspx_eval_h_outputText_0 = _jspx_th_h_outputText_0.doStartTag();
    if (_jspx_th_h_outputText_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_h_outputText_value_styleClass.reuse(_jspx_th_h_outputText_0);
    return false;
  }
}
