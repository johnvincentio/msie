
package jvapp;

import jvcommon.*;

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

public final class SendCollectionAction extends Action {

    public ActionForward perform(ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response)
        throws IOException, ServletException {

		Debug.println (">>> SendCollectionAction:perform");
		JVParameters params = new JVParameters(request.getParameterMap());
		params.showParams ("SendCollectionAction");
		JVAttributes attribs = new JVAttributes(request.getAttributeNames());
		attribs.showParams ("SendCollectionAction");

		HttpSession session = request.getSession();
		UserInfo userinfo = 
			(UserInfo) session.getAttribute(Constants.USER_INFO_KEY);
		if (userinfo == null) {
			Debug.println("could not find UserInfo");
			ActionErrors errors = new ActionErrors();
			errors.add(ActionErrors.GLOBAL_ERROR,
				new ActionError("general.error.no.userinfo"));
			saveErrors(request,errors);
        	return (mapping.findForward(Constants.FAILURE));
		}

		int nCollectionid = params.getKeyValue("id",0);
		Debug.println("nCollectionid :"+nCollectionid+":");

		String strAction = params.getKeyValue("action","");
		Debug.println("strAction :"+strAction+":");
		if (strAction.equals("Send1")) {
			Debug.println("in send 1");
		}
		else if (strAction.equals("Send2")) {
			Debug.println("in send 2");
		}
		else if (strAction.equals("Send3")) {
			Debug.println("in send 3");
		}
		else if (strAction.equals("Send4")) {
			Debug.println("in send 4");
		}
		else if (strAction.equals("Send5")) {
			Debug.println("in send 5");
			Debug.println("send 5 is complete");
		}
		else {
			Debug.println("could not find UserInfo");
			ActionErrors errors = new ActionErrors();
			errors.add(ActionErrors.GLOBAL_ERROR,
				new ActionError("general.error.no.userinfo"));
			saveErrors(request,errors);
        	return (mapping.findForward(Constants.FAILURE));
		}
		Debug.println ("<<< SendCollectionAction:perform");
        return (mapping.findForward(Constants.SUCCESS));
    }
}

