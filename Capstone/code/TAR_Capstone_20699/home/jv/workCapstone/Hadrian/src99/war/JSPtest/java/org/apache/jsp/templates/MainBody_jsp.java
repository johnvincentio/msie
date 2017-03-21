package org.apache.jsp.templates;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import jvdebug.Debug;
import jvtemplate.JVSubBody;
import jvtemplate.JVColumn;

public final class MainBody_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 Debug.println(">>> MainBody"); 
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
      out.write("\n<table>\n\t<tr>\n");

		Debug.println("MainBody 1");
		Iterator subbodies = jvTemplates.getBody().getSubbodies();
		while(subbodies.hasNext()){
			JVSubBody subbody = (JVSubBody)subbodies.next();
			Debug.println("MainBody 2");

      out.write("\n\t\t\t<td valign=\"top\">\n");

				Iterator columns = subbody.getColumns();
				while(columns.hasNext()){
					JVColumn column = (JVColumn) columns.next();
					Debug.println("MainBody 3");

      out.write("\n\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, column.getFile(), out, false);
      out.write("\n\t\t\t\t\t<br/>\n");

				}

      out.write("\n\t\t\t</td>\n");

		}

      out.write("\n\t</tr>\n</table>\n\n");
 Debug.println("<<< MainBody"); 
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
