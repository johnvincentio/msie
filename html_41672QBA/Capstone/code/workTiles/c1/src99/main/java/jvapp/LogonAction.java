
package jvapp;

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

public final class LogonAction extends Action {

    public ActionForward perform(ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response)
        throws IOException, ServletException {

		Debug.println (">>> LogonAction:perform");
/*
		JVSetup jvsetup = JVSetup.getInstance();
		if (jvsetup == null) {
			ActionErrors errors = new ActionErrors();
			errors.add(ActionErrors.GLOBAL_ERROR,
				new ActionError("logon.error.logon.connect"));
			saveErrors(request,errors);
			return (new ActionForward(mapping.getInput()));
		}
*/
		JVParameters params = new JVParameters(request.getParameterMap());
		params.showParams ("LogonAction");
		JVAttributes attribs = new JVAttributes(request.getAttributeNames());
		attribs.showParams ("LogonAction");
/*
		HttpSession session = request.getSession();
		UserInfo userinfo = (UserInfo) session.getAttribute(Constants.USER_INFO_KEY);
		if (userinfo == null) {
			Debug.println("new UserInfo");
			userinfo = new UserInfo(jvsetup.getSmtphost(),
									jvsetup.getMessagefrom(),
									jvsetup.getFromuser(),
									jvsetup.getFrompwd(),
									jvsetup.getUrl(),
									jvsetup.getUser(),
									jvsetup.getPwd());
			session.setAttribute(Constants.USER_INFO_KEY,userinfo);
		}
*/

        String strUser = ((LogonForm) form).getUsername();
        String strPassword = ((LogonForm) form).getPassword();
		Debug.println("username "+strUser);
		Debug.println("password "+strPassword);

/*
		if (! userinfo.doCheckLogin(strUser, strPassword)) {
			ActionErrors errors = new ActionErrors();
			errors.add(ActionErrors.GLOBAL_ERROR,
				new ActionError("logon.error.logon.invalid"));
			saveErrors(request,errors);
			return (new ActionForward(mapping.getInput()));
		}
*/
        return (mapping.findForward(Constants.SUCCESS));
    }
}

