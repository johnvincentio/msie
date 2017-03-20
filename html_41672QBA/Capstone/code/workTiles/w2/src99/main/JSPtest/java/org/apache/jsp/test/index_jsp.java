package org.apache.jsp.test;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<h1>Tiles Simple Tests</h1>\r\n<P> \r\n                                \r\n         These tests allow quick checking of \r\nTiles behaviors and Tiles instalation. </P>\r\n<P>It is possible to run each test separately, or all in one. In this later \r\ncase, test results and test codes are displayed in the same page. You can \r\ncompare the resulting page with the quick overview page from main site to check \r\nif all is ok.</P>\r\n<P>To run tests, follow the \"all in one\" link. If there is a problem, try \r\neach separate test in turn to localize which one fail.</P>\r\n<UL>\r\n  <LI><A href=\"testAll.jsp\">All in one</A> (main code + test results)  \r\n  <LI><A href=\"testBasic.jsp\">basic tests</A>(no definitions) \r\n  <LI><A href=\"testIgnore.jsp\">Test 'ignore' attribute, and basic errors processing</A> \r\n  <LI><A href=\"testList.jsp\">test lists</A> \r\n  <LI><A href=\"testDefinitions.jsp\">test definitions</A> \r\n  <LI><A href=\"testRole.jsp\">test role (With Tomcat, use 'tomcat' as userid and password)</A> \r\n  <LI><A href=\"testStrutsAction.jsp\">test struts action integration and behavior</A> \r\n");
      out.write("  <LI><A href=\"testController.jsp\">test tile controller calls</A> \r\n</LI></UL>");
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
