package org.apache.jsp.templates;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import jvdebug.Debug;
import jvapp.JVParameters;
import jvapp.JVAttributes;
import jvtemplate.JVTabsItems;

public final class TabsBody_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n\n\n\n\n\n\n");
      jvtemplate.JVTabs jvTab = null;
      synchronized (request) {
        jvTab = (jvtemplate.JVTabs) _jspx_page_context.getAttribute("jvTab", PageContext.REQUEST_SCOPE);
        if (jvTab == null){
          try {
            jvTab = (jvtemplate.JVTabs) java.beans.Beans.instantiate(this.getClass().getClassLoader(), "jvtemplate.JVTabs");
          } catch (ClassNotFoundException exc) {
            throw new InstantiationException(exc.getMessage());
          } catch (Exception exc) {
            throw new ServletException("Cannot create bean of class " + "jvtemplate.JVTabs", exc);
          }
          _jspx_page_context.setAttribute("jvTab", jvTab, PageContext.REQUEST_SCOPE);
        }
      }
      out.write('\n');
      out.write('\n');

	Debug.println(">>> TabsBody.jsp");
	JVParameters params = new JVParameters(request.getParameterMap());
	params.showParams ("tabsLayout");
	JVAttributes attribs = new JVAttributes(request.getAttributeNames());
	attribs.showParams ("tabsLayout");

      out.write("\n\n<table border=\"0\"  cellspacing=\"0\" cellpadding=\"0\">\n\t<tr>\n\t\t<td width=\"10\">&nbsp;</td>\n\t\t<td>\n\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"5\">\n\t\t\t\t<tr>\n");

					Debug.println("TabsBody 1");
					Iterator items = jvTab.getItems();
					while(items.hasNext()){
						JVTabsItems item = (JVTabsItems)items.next();
						Debug.println("TabsBody 1");

      out.write("\n\t\t\t\t\t\t<td bgcolor=\"");
      out.print(item.getColor());
      out.write("\">\n\t\t\t\t\t\t\t<a href=\"");
      out.print(item.getHref());
      out.write('"');
      out.write('>');
      out.print(item.getTabname());
      out.write("</a>\n\t\t\t\t\t\t</td>\n\t\t\t\t\t\t<td width=\"1\" ></td>\n");

					}

      out.write("\n\t\t\t\t</tr>\n\t\t\t</table>\n\t\t</td>\n\t\t<td width=\"10\" >&nbsp;</td>\n\t</tr>\n\n\t<tr>\n\t\t<td height=\"5\" bgcolor=\"");
      out.print(jvTab.getSelectedColor());
      out.write("\" colspan=\"3\" >&nbsp;</td>\n\t</tr>  \n\n\t<tr>\n\t\t<td width=\"10\" bgcolor=\"");
      out.print(jvTab.getSelectedColor());
      out.write("\">&nbsp;</td>\n\t\t<td>\n\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, jvTab.getSelectedBody(), out, false);
      out.write("\n\t\t</td>\n\t\t<td width=\"10\" bgcolor=\"");
      out.print(jvTab.getSelectedColor());
      out.write("\">&nbsp;</td>\n\t</tr>  \n\n\t<tr>\n\t\t<td height=\"5\" bgcolor=\"");
      out.print(jvTab.getSelectedColor());
      out.write("\" colspan=\"3\" >&nbsp;</td>\n\t</tr>  \n\n</table>\n\n");
 Debug.println("<<< TabsBody.jsp"); 
      out.write('\n');
      out.write('\n');
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
