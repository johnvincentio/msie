package org.apache.jsp.doc.portal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class news_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<table  width=\"100%\">\r\n<tr>\r\n<th bgcolor=\"aqua\"><font size=\"+1\"><strong>News</strong></font></th></tr>\r\n<tr>\r\n<td>\r\n      <p><FONT size=2>03 Nov. 2002</FONT></P>\r\n      <P><STRONG><EM><FONT color=#ff0000>TilesPlugin module aware</FONT></EM></STRONG>\r\n\t  <br><FONT color=#000000 size=2>\r\n\t  The TilesPlugin for struts now create one separate definition factory for each struts module.\r\n\t  </FONT></P>\r\n\t  \r\n      <p><FONT size=2>19 Jul. 2002</FONT></P>\r\n      <P><STRONG><EM><FONT color=#ff0000>Tiles is now in the main branch of\r\n\t   Struts1.1 distribution</FONT></EM></STRONG>\r\n\t  <br><FONT color=#000000 size=2>\r\n\t  A Tiles plug-in is available for Struts1.1.\r\n\t  </FONT></P>\r\n\t  \r\n\t  <p><FONT size=2>22 May 2002</FONT></P>\r\n      <P><STRONG><EM><FONT color=#ff0000>Tiles Advanced Features Documentation (draft version)</FONT></EM></STRONG>\r\n\t  <br><FONT color=#000000 size=2>\r\n\t  <a href=\"http://www.lifl.fr/~dumoulin/tiles/tilesAdvancedFeatures.pdf\" />tilesAdvancedFeatures.pdf</a>\r\n\t  </FONT></P>\r\n\t  \r\n      <P><STRONG><EM><FONT color=#ff0000>Tiles-blank Applications</FONT></EM></STRONG>\r\n");
      out.write("\t  <br><FONT color=#000000 size=2>\r\n\t  Different <code>tiles-blanc.war</code> files are now provided to help starting new project using Tiles. \r\n\t    <ul>\r\n\t\t  <li><code>tiles-blank.war</code> - Tiles without Struts</li>\r\n\t\t  <li><code>tiles-blank-struts1.1.war</code> - Tiles with Struts1.1</li>\r\n\t\t  <li><code>tiles-blank-struts1.0.war</code> - Tiles with latest stable Struts1.0.x</li>\r\n\t\t</ul>\r\n\t  </FONT></P>\r\n\r\n      <P><FONT color=#ff0000><EM><STRONG>Article on Tiles and Struts</STRONG></EM></FONT>\r\n\t  <br><FONT color=#000000 size=2>\r\n\t  An article on using Tiles and Struts is available at :\r\n\t  <br>\r\n\t  <a href=\"http://www.javaworld.com/javaworld/jw-01-2002/jw-0104-tilestrut.html\" >http://www.javaworld.com/javaworld/jw-01-2002/jw-0104-tilestrut.html</a>\r\n\t  </FONT></P>\r\n      <P><FONT color=#ff0000><EM><STRONG>Dynamic Layout</STRONG></EM></FONT>\r\n\t  <br><FONT color=#000000 size=2>\r\n\t  Dynamic layouts allow a user to customize a site L&amp;F. Check the example to see how to proceed with Tiles.\r\n\t  </FONT></P>\r\n");
      out.write("      <P><FONT color=#ff0000><EM><STRONG>New Layout : Tabs</STRONG></EM></FONT>\r\n\t  <br><FONT color=#000000 size=2>\r\n\t  The new tabs layout allows to build easily tabs like page : specify which\r\n\t  body you want in which tabs, and that all !\r\n\t  </FONT></P>\r\n      <P><FONT color=#ff0000><EM><STRONG>Commented Examples</STRONG></EM></FONT>\r\n\t  <br><FONT color=#000000 size=2>\r\n\t  A lot of interesting examples have been revisited and commented in a \"portal\" fashion.\r\n\t  Check \"Live Examples\" menu entry.\r\n\t  </FONT></P>\r\n      <P><STRONG><EM><FONT color=#ff0000>Each Tile can have its own controller !<BR></FONT></EM></STRONG>\r\n\t  <FONT color=#000000 size=2>\r\n\t  It is now possible to associate a controller to each Tile. This controller (Java code \r\n\t  or struts action) is called immediately before the Tile jsp page. It is useful to prepare \r\n\t  data to be shown by jsp page. \r\n\t  </FONT></P>\r\n      <P><STRONG><EM><FONT color=#ff0000>Reload Action<BR></FONT></EM></STRONG>\r\n\t  <FONT color=#000000 size=2>\r\n\t  There is now a reload action, and a reloadable factory wrapper allowing to reload Tiles\r\n");
      out.write("\t  configuration files without restarting web server.\r\n\t  </FONT></P>\r\n      <P><STRONG><EM><FONT color=#ff0000>Use and Set Bean in configuration file<BR></FONT></EM></STRONG>\r\n\t  <FONT color=#000000 size=2>\r\n\t  It is now possible to use and set beans in the configuration file. Such bean can then be\r\n\t  set as a &lt;put&gt; or &lt;putList&gt; tag value.\r\n\t  <br>\r\n\t  This increase and facilitate menu creation.\r\n\t  </FONT></P>\r\n      <P>\r\n      <FONT size=2>Check \"History\" for latest modifications (further in this page)</FONT></P>\r\n      <P>\r\n\t  \r\n</td></tr></table>\r\n");
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
