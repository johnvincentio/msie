package org.apache.jsp.doc.portal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class revisions_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<table  width=\"100%\">\r\n<tr>\r\n<th bgcolor=\"aqua\"><FONT size=4>History</FONT></th></tr>\r\n  <TR>\r\n    <TD><FONT size=2><STRONG> 03 Nov. 2002</STRONG> </FONT></TD></TR>\r\n  <TR>\r\n    <TD>\r\n\t  <FONT size=2>\r\n      <UL>\r\n        <LI>Tiles now use the commons-logging package.</LI>\r\n\t\t<li><useAttribute>: Corrected a bug where the tag fail when reused by server.</li>\r\n\t\t<li>The struts TilesPlugin now create one factory for each struts module</li>\r\n\t  </UL>\r\n\t  </FONT>\r\n\t</TD>\r\n  </TR> \r\n  <TR>\r\n    <TD><FONT size=2><STRONG> 19 Jul. 2002</STRONG> </FONT></TD></TR>\r\n  <TR>\r\n    <TD>\r\n\t  <FONT size=2>\r\n      <UL>\r\n        <LI>TilesPlugin available for Struts1.1</LI>\r\n\t\t<li>Blank war files have been updated</li>\r\n\t\t<li>Definition factory interface has change. A new life cycle is introduce</li>\r\n\t\t<li>Struts multi-modules feature works with the Tiles</li>\r\n\t  </UL>\r\n\t  </FONT>\r\n\t</TD>\r\n  </TR> \r\n  <TR>\r\n    <TD><FONT size=2><STRONG> 20 Jun. 2002</STRONG> </FONT></TD></TR>\r\n  <TR>\r\n    <TD>\r\n      <UL>\r\n        <LI><FONT size=2>Update DefinitionDispatcherAction. It now works again</FONT></LI>\r\n");
      out.write("\t  </UL>\r\n\t</TD>\r\n  </TR> \r\n  <TR>\r\n    <TD><FONT size=2><STRONG> 13 Jun. 2002</STRONG> </FONT></TD></TR>\r\n  <TR>\r\n    <TD>\r\n      <UL>\r\n        <LI><FONT size=2>Tiles configuration file now accept nested list as attribute</FONT></LI>\r\n        <LI><FONT size=2>Add <uri> tag to DTD (submitted by Loren Halvorson)</FONT></LI>\r\n\t\tconfiguration file</FONT></LI>\r\n\t  </UL>\r\n\t</TD>\r\n  </TR> \r\n  <TR>\r\n    <TD><FONT size=2><STRONG> 23 May 2002</STRONG> </FONT></TD></TR>\r\n  <TR>\r\n    <TD>\r\n      <UL>\r\n        <LI><FONT size=2>tiles.XmlDefinition.XmlParser : enable default value for <item> classtype\r\n\t\t attribute\r\n\t\t (org.apache.struts.tiles.beans.SimpleMenuItem). As a consequence, all classtype attribute \r\n\t\t can be removed in examples</FONT></LI>\r\n        <LI><FONT size=2>tiles.XmlDefinition.I18nFactorySet : Enable serialization (bug reported \r\n\t\tby Dan Sykes)</FONT></LI>\r\n\t  </UL>\r\n\t</TD>\r\n  </TR> \r\n  <TR>\r\n    <TD><FONT size=2><STRONG> 14 Apr. 2002</STRONG> </FONT></TD></TR>\r\n  <TR>\r\n    <TD>\r\n      <UL>\r\n        <LI><FONT size=2>tiles.XmlDefinition.XmlParser : Correct bug with new Digester release \r\n");
      out.write("\t\tpreventing config file lists to be correctly parsed</FONT></LI>\r\n        <LI><FONT size=2>tabsLayout.jsp : Correct some syntax errors(bug reported by David Marshall)</FONT></LI>\r\n        <LI><FONT size=2>taglib.tiles.UseAttribute : Add release of variable 'id' in release method \r\n\t\t(bug reported by Heath Chiavettone)</FONT></LI>\r\n        <LI><FONT size=2>tiles.XmlDefinition.XmlDefinition : Add inheritance for controllerClass and \r\n\t\tcontrollerUrl attributes (bug reported by Jim Crossley) </FONT></LI>\r\n        <LI><FONT size=2>tiles.XmlDefinition.I18nFactorySet : Add another loading method for config \r\n\t\tfiles in order to let Websphere 3.5.x run (patch from Stephen Houston)</FONT></LI>\r\n        <LI><FONT size=2>tiles.ComponentActionServlet : Add overload of processForward and\r\n\t\tprocessInclude in order to catch properly forward in struts1.0.x struts-config (bug reported from \r\n\t\tstruts user list)</FONT></LI>\r\n\t  </UL>\r\n\t</TD>\r\n  </TR> \r\n  <TR>\r\n    <TD><FONT size=2><STRONG> 22 Feb. 2002</STRONG> </FONT></TD></TR>\r\n");
      out.write("  <TR>\r\n    <TD>\r\n      <UL>\r\n        <LI><FONT size=2>Correct build process preventing examples compilation in war files </FONT></LI>\r\n\t  </UL>\r\n\t</TD>\r\n  </TR> \r\n  <TR>\r\n    <TD><FONT size=2><STRONG> 20 Feb. 2002</STRONG> </FONT></TD></TR>\r\n  <TR>\r\n    <TD>\r\n      <UL>\r\n        <LI><FONT size=2>New tiles-blank-struts1.x applications</FONT></LI>\r\n        <LI><FONT size=2>Change distribution (again) : back to the old fashion</FONT></LI>\r\n\t  </UL>\r\n\t</TD>\r\n  </TR> \r\n  <TR>\r\n    <TD><FONT size=2><STRONG> 18 Feb. 2002</STRONG> </FONT></TD></TR>\r\n  <TR>\r\n    <TD>\r\n      <UL>\r\n        <LI><FONT size=2>New tiles-blank application</FONT></LI>\r\n        <LI><FONT size=2>Added a TilesController to run with latest Struts 1.1 dev</FONT></LI>\r\n        <LI><FONT size=2>Change distribution : a stable release build shipped with Struts1.0.x \r\n\t\tand a development release build with Struts1.1 dev</FONT></LI>\r\n\t  </UL>\r\n\t</TD>\r\n  </TR> \r\n  <TR>\r\n    <TD><FONT size=2><STRONG> 11 Jan. 2002</STRONG> </FONT></TD></TR>\r\n  <TR>\r\n    <TD>\r\n");
      out.write("      <UL>\r\n        <LI><FONT size=2>Corrected bug preventing empty &lt;put&gt; body tags in Tomcat4</FONT></LI>\r\n        <LI><FONT size=2>Corrected customized factory loading. It now works again</FONT></LI>\r\n\t  </UL>\r\n\t</TD>\r\n  </TR> \r\n\r\n <TR>\r\n    <TD><FONT size=2><STRONG>&nbsp;&nbsp; <A href=\"");
      out.print(request.getContextPath());
      out.write("/doc/portal/revisionsCont.html\">\r\n\t<FONT size=2><STRONG>more ...</STRONG></FONT></A></STRONG></FONT>\r\n\t</TD>\r\n </TR>\r\n</table>\r\n");
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
