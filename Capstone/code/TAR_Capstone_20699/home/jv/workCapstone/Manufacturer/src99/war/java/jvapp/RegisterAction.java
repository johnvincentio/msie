
package jvapp;

import jvcommon.Debug;

import java.io.IOException;
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

public final class RegisterAction extends Action {

    public ActionForward perform(ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response)
        throws IOException, ServletException {

		Debug.println(">>> RegisterAction:perform");
		JVParameters params = new JVParameters(request.getParameterMap());
		params.showParams ("RegisterAction");
		JVAttributes attribs = new JVAttributes(request.getAttributeNames());
		attribs.showParams ("RegisterAction");

        String email = ((RegisterForm) form).getEmail();
        String password = ((RegisterForm) form).getPassword();
		Debug.println("email :"+email+":");
		Debug.println("password :"+password+":");

		Debug.println("<<< RegisterAction:perform");
        return (mapping.findForward(Constants.SUCCESS));
    }
}

