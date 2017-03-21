
package jvapp;

import jvdebug.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionServlet;

public final class LogoffAction extends Action {

    public ActionForward perform(ActionMapping mapping,
         ActionForm form,
         HttpServletRequest request,
         HttpServletResponse response)
            throws IOException, ServletException {

		Debug.println (">>> LogoffAction:perform");
		JVParameters params = new JVParameters(request.getParameterMap());
		params.showParams ("LogoffAction");
		JVAttributes attribs = new JVAttributes(request.getAttributeNames());
		attribs.showParams ("LogoffAction");

		HttpSession session = request.getSession();
		UserInfo userinfo = 
			(UserInfo) session.getAttribute(Constants.USER_INFO_KEY);
		if (userinfo == null)
			Debug.println("could not find UserInfo");
		else {
			Debug.println("Remove Session Attribute Userinfo");
			userinfo.remove();
			session.removeAttribute(Constants.USER_INFO_KEY);
		}
		Debug.println ("<<< LogoffAction:perform");
        return (mapping.findForward(Constants.SUCCESS));
    }
}

