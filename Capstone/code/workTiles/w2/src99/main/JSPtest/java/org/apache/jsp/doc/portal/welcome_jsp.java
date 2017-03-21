package org.apache.jsp.doc.portal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  public java.util.List getDependants() {
    return _jspx_dependants;
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

      out.write("<table  width=\"100%\">\r\n<tr>\r\n<th bgcolor=\"aqua\"><font size=\"+1\"><strong>Welcome</strong></font></th></tr>\r\n<tr>\r\n<td>\r\n      <P>\r\n      <FONT size=2> Welcome to the <EM>Tiles </EM>website. This \"portal\" page is an example of what can be \r\n      done with <EM>Tiles</EM>. It is made by assembling <EM>Tiles</EM>.\r\n\t   </FONT>\r\n  <BR><FONT size=2>\r\n  You can :\r\n  <ul>\r\n    <li>Take a glance at some Tiles features and capabilities by browsing the commented live examples (avalaible if you install Tiles)</li>\r\n    <li>Check the \"Quick Overview\" for code examples and results</li>\r\n    <li>Start learning Tiles with the tutorial</li>\r\n    <li>Learn <a href=\"http://www.lifl.fr/~dumoulin/tiles/tilesAdvancedFeatures.pdf\" />Tiles Advanced Features (pdf)</a></li>\r\n    <li>Read article from <a href=\"http://www.javaworld.com/javaworld/jw-01-2002/jw-0104-tilestrut.html\" >javaworld</a></li>\r\n  </ul>\r\n  </FONT> \r\n</P>\r\n</td></tr>\r\n</table>\r\n");
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
