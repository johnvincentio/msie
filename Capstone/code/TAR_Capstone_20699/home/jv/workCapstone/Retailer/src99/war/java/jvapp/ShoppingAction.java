
package jvapp;

import jvtemplate.*;
import jvcommon.*;

import java.util.*;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionServlet;

public final class ShoppingAction extends Action {

    public ActionForward perform(ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response)
        throws IOException, ServletException {

		Debug.println (">>> ShoppingAction:perform");
		JVParameters params = new JVParameters(request.getParameterMap());
		params.showParams ("ShoppingAction");

		JVAttributes attribs = new JVAttributes(request.getAttributeNames());
		attribs.showParams ("ShoppingAction");

		Debug.println("before get resource bundle");
		ResourceBundle rb = ResourceBundle.getBundle
						("resources.application",request.getLocale());
		Debug.println("after get resource bundle");

//
//	did not work - only within the same application
//
//		RequestDispatcher dispatcher = request.getRequestDispatcher (strURL);
//		dispatcher.forward (request, response);
//
//	the URL is relative to the client... thus the hostname must be set
//
		String strURL = "http://jv2:8080/NeroWAR";
		Debug.println("redirect :"+strURL+":");
		response.sendRedirect (strURL);
		Debug.println ("<<< ShoppingAction:perform");
//
//	ensure the SUCCESS name has not been set
//
        return (mapping.findForward(Constants.SUCCESS));
    }
}

