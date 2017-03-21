package org.apache.jsp.doc.portal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class features_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("      <table width=\"100%\">\r\n         <tr>\r\n            <th bgcolor=\"aqua\">\r\n               <font size=\"+1\"><strong>Tiles Library<br>\r\n                Features Overview</strong></font> \r\n            </th>\r\n         </tr>\r\n         <tr>\r\n            <td>\r\n               <p>\r\n                  <font size=\"2\"><strong><font size=\"2\"><strong>Following is an\r\n                  overview of what can be done with Tiles\r\n                  :</strong></font></strong></font>\r\n               </p>\r\n               <ul>\r\n                  <li>\r\n                     <font size=\"2\">Screen definitions</font> \r\n                     <ul>\r\n                        <li>\r\n                           <font size=\"2\">Create a screen by assembling\r\n                           <strong><em>Tiles</em></strong> : header, footer,\r\n                           menu, body</font>\r\n                        </li>\r\n                        <li>\r\n                           <font size=\"2\">Definitions can take place :</font> \r\n                           <ul>\r\n");
      out.write("                              <li>\r\n                                 <font size=\"2\">in a centralized xml\r\n                                 file</font>\r\n                              </li>\r\n                              <li>\r\n                                 <font size=\"2\">directly in jsp page</font>\r\n                              </li>\r\n                              <li>\r\n                                 <font size=\"2\">in struts action</font>\r\n                              </li>\r\n                           </ul>\r\n                        </li>\r\n                        <li>\r\n                           <font size=\"2\">Definitions provide an inheritance\r\n                           mechanism : a definition can extends another one,\r\n                           and override parameters.</font>\r\n                        </li>\r\n                     </ul>\r\n                  </li>\r\n                  <li>\r\n                     <font size=\"2\">Templating</font> \r\n                     <ul>\r\n                        <li>\r\n                           <font size=\"2\"><strong><em>Tiles</em></strong>\r\n");
      out.write("                           framework is entirely compatible with\r\n                           <em>Templates</em> defined by David Geary and\r\n                           implemented in Struts</font>\r\n                        </li>\r\n                        <li>\r\n                           <font size=\"2\">You can replace <em>Templates</em>\r\n                           library by <strong><em>Tiles</em></strong>\r\n                           one</font>\r\n                        </li>\r\n                     </ul>\r\n                  </li>\r\n                  <li>\r\n                     <font size=\"2\">Layouts</font> \r\n                     <ul>\r\n                        <li>\r\n                           <font size=\"2\">Define common page layouts and reuse\r\n                           them across your web site</font>\r\n                        </li>\r\n                        <li>\r\n                           <font size=\"2\">Define menu layouts, and use them by\r\n                           passing lists of items and links</font>\r\n                        </li>\r\n");
      out.write("                        <li>\r\n                           <font size=\"2\">Define portal layout, use it by\r\n                           passing list of <strong><em>Tiles</em></strong>\r\n                           (pages) to show</font>\r\n                        </li>\r\n                        <li>\r\n                           <font size=\"2\">Reuse existing layouts, or define\r\n                           your owns</font>\r\n                        </li>\r\n                     </ul>\r\n                  </li>\r\n                  <li>\r\n                     <font size=\"2\">Dynamic page building</font> \r\n                     <ul>\r\n                        <li>\r\n                           <font size=\"2\">Tiles are gather dynamically during\r\n                           page reload. It is possible to change any attributes\r\n                           : layout, list of Tiles in portal, list of menu\r\n                           items, ...</font>\r\n                        </li>\r\n                     </ul>\r\n                  </li>\r\n                  <li>\r\n");
      out.write("                     <font size=\"2\">Reuse of <strong><em>Tiles</em></strong> /\r\n                     Components</font> \r\n                     <ul>\r\n                        <li>\r\n                           <font size=\"2\">If well defined, a\r\n                           <strong><em>Tile</em></strong> can be reused in\r\n                           different location</font>\r\n                        </li>\r\n                        <li>\r\n                           <font size=\"2\">Dynamic attributes are used to\r\n                           parameterized <em><strong>Tiles</strong></em></font>\r\n                        </li>\r\n                        <li>\r\n                           <font size=\"2\">It is possible to define library of\r\n                           reusable <em><strong>Tiles</strong></em>.</font>\r\n                        </li>\r\n                        <li>\r\n                           <font size=\"2\">Build a page by assembling predefined\r\n                           components, give them appropriate parameters</font>\r\n");
      out.write("                        </li>\r\n                     </ul>\r\n                  </li>\r\n                  <li>\r\n                     <font size=\"2\">Internationalization (i18n)</font>\r\n                  </li>\r\n\t\t\t\t  <ul>\r\n                  <li>\r\n                     <font size=\"2\">It is possible to load different tiles\r\n                     according to Locale</font>\r\n                  </li>\r\n                  <li>\r\n                     <font size=\"2\">A mechanism similar to Java properties\r\n                     files is used for definitions files : you can have one\r\n                     definition file per Locale. The appropriate definition is\r\n                     loaded according to current Locale</font>\r\n                  </li>\r\n\t\t\t\t  </ul>\r\n                  <li>\r\n                     <font size=\"2\">Multi-channels</font>\r\n                  </li>\r\n\t\t\t\t  <ul>\r\n                  <li>\r\n                     <font size=\"2\">It is possible to load different Tiles\r\n                     according to a key stored in jsp session, or\r\n");
      out.write("                     anywhere.</font>\r\n                  </li>\r\n\t\t\t\t  \r\n                  <li>\r\n                     <font size=\"2\">For example, key could be user provilege,\r\n                     browser type, ...</font>\r\n                  </li>\r\n\t\t\t\t  \r\n                  <li>\r\n                     <font size=\"2\">A mechanism similar to Java properties\r\n                     files is used for definitions files : you can have one\r\n                     definition file per key. The appropriate definition is\r\n                     loaded according to the key.</font>\r\n                  </li>\r\n\t\t\t\t  </ul>\r\n               </ul>\r\n            </td>\r\n         </tr>\r\n      </table>\r\n\r\n\r\n");
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
