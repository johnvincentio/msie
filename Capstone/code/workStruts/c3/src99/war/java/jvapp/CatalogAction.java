
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

public final class CatalogAction extends Action {

    public ActionForward perform(ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response)
        throws IOException, ServletException {

		Debug.println (">>> CatalogAction:perform");
		JVParameters params = new JVParameters(request.getParameterMap());
		params.showParams ("CatalogAction");
		JVAttributes attribs = new JVAttributes(request.getAttributeNames());
		attribs.showParams ("CatalogAction");

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

        int nItemId = ((CatalogForm) form).getCatalogid();
		Debug.println("item number "+nItemId);
		JVCatalog catalog = userinfo.getCatalog (nItemId);
		request.setAttribute(Constants.CATALOG_KEY, catalog);
		Debug.println ("<<< CatalogAction:perform");
        return (mapping.findForward(Constants.SUCCESS));
    }
}

