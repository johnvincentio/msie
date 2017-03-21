package org.apache.jsp.templates;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import jvdebug.Debug;
import jvtemplate.JVSubMenu;
import jvtemplate.JVPair;

public final class MainMenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n\n\n\n\n\n");
 Debug.println(">>> MainMenu"); 
      out.write('\n');
      out.write('\n');
      jvtemplate.JVTemplate jvTemplates = null;
      synchronized (request) {
        jvTemplates = (jvtemplate.JVTemplate) _jspx_page_context.getAttribute("jvTemplates", PageContext.REQUEST_SCOPE);
        if (jvTemplates == null){
          jvTemplates = new jvtemplate.JVTemplate();
          _jspx_page_context.setAttribute("jvTemplates", jvTemplates, PageContext.REQUEST_SCOPE);
        }
      }
      out.write('\n');
      out.write('\n');

	Debug.println("MainMenu 1");
	Iterator submenus = jvTemplates.getMenu().getSubmenus();
	while(submenus.hasNext()){
		JVSubMenu submenu = (JVSubMenu)submenus.next();
		Debug.println("MainMenu 2");
		Debug.println("menu name :"+submenu.getName()+":");

      out.write("\n\t<table>\n\t\t<tr>\n\t\t\t<th colspan=2>\n\t\t\t\t<div align=\"left\">\n\t\t\t\t\t<strong>");
      out.print(submenu.getName());
      out.write("</strong>\n\t\t\t\t</div>\n\t\t\t</th>\n\t\t</tr>\n");

		Iterator pairs = submenu.getPairs();
		while(pairs.hasNext()){
			JVPair pair = (JVPair) pairs.next();
			Debug.println("MainMenu 3");

      out.write("\n\t\t\t<tr>\n\t\t\t\t<td width=\"10\" valign=\"top\" ></td>\n\t\t\t\t<td valign=\"top\"  >\n\t\t\t\t\t<font size=\"-1\">\n\t\t\t\t\t\t<a href=\"");
      out.print(pair.getLink());
      out.write('"');
      out.write('>');
      out.print(pair.getText());
      out.write("</a>\n\t\t\t\t\t</font>\n\t\t\t\t</td>\n\t\t\t</tr>\n");

		}

      out.write("\n\t</table>\n\t<br>\n\n");

	}
	Debug.println("<<< MainMenu");

      out.write('\n');
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
