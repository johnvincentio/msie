package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jvejb1.Converter;
import jvejb1.ConverterHome;
import javax.ejb.*;
import java.math.*;
import javax.naming.*;
import javax.rmi.PortableRemoteObject;
import java.rmi.RemoteException;

public final class EJBTest1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


   private Converter converter = null;

   public void jspInit() { 
      try {
         InitialContext ic = new InitialContext();
         Object objRef = ic.lookup("java:comp/env/ejb/TheConverter");
         ConverterHome home = (ConverterHome)PortableRemoteObject.narrow(objRef, ConverterHome.class);
         converter = home.create();
      } catch (RemoteException ex) {
            System.out.println("Couldn't create converter bean."+ ex.getMessage());
      } catch (CreateException ex) {
            System.out.println("Couldn't create converter bean."+ ex.getMessage());
      } catch (NamingException ex) {
            System.out.println("Unable to lookup home: "+ "TheConverter "+ ex.getMessage());
      } 
   }

   public void jspDestroy() {    
         converter = null;
   }

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

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n<html>\n<head>\n    <title>Converter</title>\n</head>\n\n<body bgcolor=\"white\">\n<h1><b><center>Converter</center></b></h1>\n<hr>\n<p>Enter an amount to convert:</p>\n<form method=\"get\">\n<input type=\"text\" name=\"amount\" size=\"25\">\n<br>\n<p>\n<input type=\"submit\" value=\"Submit\">\n<input type=\"reset\" value=\"Reset\">\n</form>\n\n");

    String amount = request.getParameter("amount");
    if ( amount != null && amount.length() > 0 ) {
       BigDecimal d = new BigDecimal (amount);

      out.write("\n   <p>\n   ");
      out.print( amount );
      out.write(" dollars are  ");
      out.print( converter.dollarToYen(d) );
      out.write("  Yen.\n   <p>\n   ");
      out.print( amount );
      out.write(" Yen are ");
      out.print( converter.yenToEuro(d) );
      out.write("  Euro.\n");

    }

      out.write("\n\n</body>\n</html>\n");
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
