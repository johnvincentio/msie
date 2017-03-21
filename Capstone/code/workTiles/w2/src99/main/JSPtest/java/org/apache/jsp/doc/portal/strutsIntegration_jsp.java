package org.apache.jsp.doc.portal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class strutsIntegration_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<table  width=\"100%\">\r\n<tr>\r\n<th bgcolor=\"aqua\">\r\n  <font size=\"+1\"><strong>Tiles and Struts</STRONG></FONT>\r\n</TH>\r\n</TR>\r\n  <TR>\r\n    <TD>\r\n      <P>\r\n      <FONT size=2>Tiles are actually shipped with Struts</FONT></P>\r\n      <P>             \r\n      <FONT size=2>    \r\n\t  Tiles and Struts code are clearly separated. In fact, Tiles can run without Struts. But using \r\n\t  both give you interresting features, like forwarding an action to a tile's definition.  \r\n      </FONT>\r\n      <FONT size=2>Following is a list of actual modifications :</FONT> </P></TD></TR>\r\n  <TR>\r\n    <TD><FONT size=2><b>Tile Action Servlet</B></FONT></TD></TR>\r\n  <TR>\r\n    <TD>\r\n      <UL>\r\n        <LI><FONT size=2>Add a \r\n        \"processForward\" method. </FONT>    \r\n        <LI><FONT size=2>Purpose : be \r\n        able to subclass servlet, and override the forward mechanism. </FONT>\r\n        <LI><FONT size=2>Needed if you \r\n        want to forward to a definition in \r\n  struts-config.xml.</FONT></LI>\r\n        <LI><FONT size=2>A ready to run servlet is provided.</FONT></LI>\r\n");
      out.write("     </UL>\r\n  \r\n    </TD>\r\n  </TR>\r\n  <TR>\r\n    <TD><FONT size=2><STRONG> <EM>text</EM> \r\n    tag</STRONG></FONT></TD></TR>\r\n  <TR>\r\n    <TD>\r\n      <UL>\r\n        <LI><FONT size=2>Not \r\n        mandatory, can be omitted if not used </FONT>\r\n        <LI><FONT size=2>Add a \r\n        \"prefix\" attribute. </FONT>    \r\n        <LI><FONT size=2>Purpose : be \r\n        able to add a prefix to the name of generated input tag. This \r\n        modification is not mandatory. It is only useful in some \r\n        examples.</FONT> </LI></UL></TD></TR></TABLE>");
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
