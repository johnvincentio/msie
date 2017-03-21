package org.apache.jsp.doc.portal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class download_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("      <table width=\"100%\">\r\n         <tr>\r\n            <th bgcolor=\"aqua\">\r\n               <font size=\"+1\"><strong>Download</strong></font> \r\n    </th></tr>\r\n         <tr>\r\n            <td>\r\n               <p></p>\r\n\r\n\t\t  \r\n      <DIV align=center>\r\n      <div align=\"center\">\r\n      <font size=\"2\">Choose between binaries or sources distribution</font> </div>\r\n\t  <br>\r\n\t  <DIV align=center><FONT size=2>Latest build : @compilation-date@ </FONT></DIV>\r\n      <DIV align=center>\r\n\t\t  \r\n\t\t  \r\n                 <table border=\"2\">\r\n                     <tr>\r\n                        <td>\r\n                           <p align=\"center\">\r\n                              &nbsp;<font color=\"#ff0000\"><strong>Development</strong></font> \r\n\t\t\t\t\t\t\t  <br>\r\n\t\t\t\t\t\t\t  </p></td>\r\n                        <td>\r\n                           <p align=\"center\">\r\n                              <font size=\"2\"><strong>binaries<br></strong>(src excluded)</font> </p></td>\r\n                        <td>\r\n                           <p align=\"center\">\r\n                              <font size=\"2\"><strong>sources</strong></font> </p></td></tr>\r\n");
      out.write("                     <tr>\r\n                        <td>\r\n                           <div align=\"right\">\r\n                              <font size=\"2\"><strong>Main site :<br></strong>(<a href=\r\n                              \"http://www.lifl.fr/~dumoulin/tiles\">www.lifl.fr</a>)</font> </div></td>\r\n                        <td>\r\n                           <div align=\"left\">\r\n                              <a href=\r\n                              \"http://www.lifl.fr/~dumoulin/tiles/tiles.zip\"><strong>\r\n                              tiles.zip</strong></a> </div>\r\n                           <div align=\"left\">\r\n                              <a href=\r\n                              \"http://www.lifl.fr/~dumoulin/tiles/tiles.tar.gz\">\r\n                              <strong>tiles.tar.gz</strong></a> </div></td>\r\n                        <td>\r\n                           <div align=\"left\">\r\n                              <a href=\r\n                              \"http://www.lifl.fr/~dumoulin/tiles/tiles-src.zip\">\r\n                              <font size=\r\n");
      out.write("                              \"2\"><strong>tiles-src.zip</strong></font></a> </div>\r\n                           <div align=\"left\">\r\n                              <a href=\r\n                              \"http://www.lifl.fr/~dumoulin/tiles/tiles-src.tar.gz\">\r\n                              <strong><font size=\r\n                              \"2\">tiles-src.tar.gz</font></strong></a> \r\n</div></td></tr>\r\n                     <tr>\r\n                        <td>\r\n                           <div align=\"right\">\r\n                              <font size=\"2\"><strong>Mirror \r\n            :</strong></font> </div>\r\n                           <div align=\"right\">\r\n                              <font size=\"2\">(<a href=\"http://www.geocities.com/cedricDumoulin/tiles\">\r\n                              www.geocities.com</a>)</font> </div></td>\r\n                        <td>\r\n                           <div align=\"left\">\r\n                              <a href=\r\n                              \"http://www.geocities.com/cedricdumoulin/tiles/tiles.zip\">\r\n");
      out.write("                              <strong>tiles.zip</strong></a> </div>\r\n                           <div align=\"left\">\r\n                              <strong><a href=\r\n                              \"http://www.geocities.com/cedricdumoulin/tiles/tiles.tar.gz\">\r\n                              tiles.tar.gz</a></strong> </div></td>\r\n                        <td>\r\n                           <div align=\"left\">\r\n                              <a href=\r\n                              \"http://www.geocities.com/cedricdumoulin/tiles/tiles-src.zip\">\r\n                              <font size=\r\n                              \"2\"><strong>tiles-src.zip</strong></font></a> </div>\r\n                           <div align=\"left\">\r\n                              <strong><a href=\r\n                              \"http://www.geocities.com/cedricdumoulin/tiles/tiles-src.tar.gz\">\r\n                              <font size=\r\n                              \"2\">components-src.tar.gz</font></a></strong> \r\n          </div></td></tr>\r\n    </table></DIV>\r\n");
      out.write("\t  <br>\r\n      <DIV align=center><FONT size=2><FONT size=2>\r\n\t  <EM><STRONG>Tiles </STRONG></EM>is also distributed with<STRONG> <EM>Struts 1.1 . \r\n      <BR>   \r\n      </EM></STRONG>You can download it by downloading <A \r\n      href=\"http://jakarta.apache.org/struts\"><STRONG><EM>Struts</EM></STRONG></A><STRONG><EM>.</EM></STRONG></FONT></FONT></DIV></DIV></td></tr></table>");
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
