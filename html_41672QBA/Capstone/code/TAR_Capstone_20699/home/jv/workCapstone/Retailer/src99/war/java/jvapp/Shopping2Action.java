
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

public final class Shopping2Action extends Action {

    public ActionForward perform(ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response)
        throws IOException, ServletException {

		Debug.println (">>> Shopping2Action:perform");
		JVParameters params = new JVParameters(request.getParameterMap());
		params.showParams ("Shopping2Action");

		JVAttributes attribs = new JVAttributes(request.getAttributeNames());
		attribs.showParams ("Shopping2Action");

		Debug.println("before get resource bundle");
		ResourceBundle rb = ResourceBundle.getBundle
						("resources.application",request.getLocale());
		Debug.println("after get resource bundle");

		String strURL = "http://jv2:8080/HadrianWAR";
		Debug.println("redirect :"+strURL+":");
		response.sendRedirect (strURL);
		Debug.println ("<<< Shopping2Action:perform");
        return (mapping.findForward(Constants.SUCCESS));
    }
}

