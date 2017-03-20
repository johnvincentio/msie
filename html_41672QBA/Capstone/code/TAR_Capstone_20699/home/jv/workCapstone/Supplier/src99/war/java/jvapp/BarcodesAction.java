
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

public final class BarcodesAction extends Action {

    public ActionForward perform(ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response)
        throws IOException, ServletException {

		Debug.println (">>> BarcodesAction:perform");
		JVParameters params = new JVParameters(request.getParameterMap());
		params.showParams ("BarcodesAction");

		JVAttributes attribs = new JVAttributes(request.getAttributeNames());
		attribs.showParams ("BarcodesAction");

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

		int nCollection = params.getKeyValue("COLLECTION",-1);
		Debug.println("nCollection :"+nCollection+":");
		if (nCollection < 1) {
			Debug.println("Invalid collection id");
			ActionErrors errors = new ActionErrors();
			errors.add(ActionErrors.GLOBAL_ERROR,
				new ActionError("general.error.no.collectionid"));
			saveErrors(request,errors);
        	return (mapping.findForward(Constants.FAILURE));
		}
		userinfo.setCollectionid (nCollection);

		String strSend = params.getKeyValue("SEND","");
		Debug.println("strSend :"+strSend+":");
		if (strSend.equals("Send")) {
			Debug.println ("<<< BarcodesAction:perform (SEND)");
			return (mapping.findForward(Constants.PRESENDCOLLECTION));
		}

		String strDetails = params.getKeyValue("DETAILS","");
		Debug.println("strDetails :"+strDetails+":");
		if (strDetails.equals("Details")) {
			Debug.println("add barcodes to request");
			JVBarcodes barcodes = userinfo.getBarcodes(nCollection);
			request.setAttribute(Constants.BARCODES_INFO_KEY,barcodes);
			Debug.println ("<<< BarcodesAction:perform (DETAILS)");
		}
		return (mapping.findForward(Constants.SUCCESS));
    }
}

