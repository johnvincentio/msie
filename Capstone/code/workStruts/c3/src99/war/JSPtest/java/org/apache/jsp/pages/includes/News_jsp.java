package org.apache.jsp.pages.includes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class News_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<table  width=\"100%\">\r\n<tr>\r\n<th bgcolor=\"aqua\"><font size=\"+1\"><strong>News</strong></font></th></tr>\r\n<tr>\r\n<td>\r\n      <p><FONT size=2>10 June 2004</FONT></P>\r\n      <P><STRONG><EM><FONT color=#ff0000>Nullam fringilla, lectus</FONT></EM></STRONG>\r\n\t  <br><FONT color=#000000 size=2>\r\nLorem ipsum dolor sit amet, consectetuer adipiscing elit. Sed ut mauris. Suspendisse nec diam ut ipsum blandit blandit. Donec non augue ut felis aliquam euismod. Quisque massa turpis, ultricies sed, bibendum eget, dictum nec, quam. Nunc vel leo at tellus pulvinar sollicitudin. Nullam fringilla, lectus ut fermentum ultricies, felis lorem tincidunt nunc, ultricies volutpat lacus justo sit amet urna. Vivamus scelerisque lobortis dolor. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Fusce at pede. Maecenas ante felis, ultricies eget, dapibus ut, commodo at, pede. In viverra. \r\n\t  </FONT></P>\r\n\t  \r\n      <p><FONT size=2>09 June 2004</FONT></P>\r\n      <P><STRONG><EM><FONT color=#ff0000>Vestibulum ante ipsum primis in faucibus</FONT></EM></STRONG>\r\n");
      out.write("\t  <br><FONT color=#000000 size=2>\r\nProin placerat lacus at ante. Fusce blandit viverra nisl. Nullam lacus felis, commodo luctus, condimentum vel, pellentesque eget, nisl. Praesent eleifend odio non nisl. Nulla in mauris. Nunc magna quam, mollis non, placerat euismod, vulputate sit amet, enim. Proin nulla mi, mattis nec, eleifend sed, mollis at, diam. Donec mollis. Quisque ultricies, massa eget rutrum malesuada, orci quam aliquam mi, ac viverra tortor tellus sit amet mauris. Donec quis nibh. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Cras vehicula mollis risus. Donec feugiat eros nec lacus. In hac habitasse platea dictumst. Praesent vitae dui. Quisque euismod nunc ac ante. Fusce a dui in justo bibendum porttitor. Maecenas hendrerit dolor vel quam. Maecenas pretium accumsan arcu. Nunc nunc. \r\n\t  </FONT></P>\r\n\t  \r\n\t  <p><FONT size=2>01 June 2004</FONT></P>\r\n      <P><STRONG><EM><FONT color=#ff0000>Duis condimentum tempus</FONT></EM></STRONG>\r\n\t  <br><FONT color=#000000 size=2>\r\n");
      out.write("Aenean dui risus, auctor a, sagittis sit amet, fringilla vel, lectus. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Morbi massa ante, feugiat quis, interdum quis, gravida id, est. Integer vel leo. Maecenas sodales interdum purus. Suspendisse aliquam blandit felis. Maecenas in nunc. Nunc quis elit quis augue pharetra vehicula. Vivamus mauris. Duis condimentum tempus arcu. Mauris egestas congue nisl. Etiam sit amet sapien non magna gravida vehicula. Duis accumsan venenatis elit. Sed porttitor est vitae augue. Aliquam gravida pulvinar augue. Mauris pretium aliquam pede. Vivamus vehicula laoreet elit. Praesent et ipsum. Pellentesque nunc.\r\n\t  </FONT></P>\r\n\r\n</td></tr></table>\r\n");
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
