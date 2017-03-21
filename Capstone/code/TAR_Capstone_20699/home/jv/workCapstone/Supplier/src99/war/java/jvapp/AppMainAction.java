
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

public final class AppMainAction extends Action {

    public ActionForward perform(ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response)
        throws IOException, ServletException {

		Debug.println (">>> AppMainAction:perform");
		JVParameters params = new JVParameters(request.getParameterMap());
		params.showParams ("AppMainAction");

		JVAttributes attribs = new JVAttributes(request.getAttributeNames());
		attribs.showParams ("AppMainAction");

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

		int nTabNo = params.getKeyValue("TABNO",-1);
		Debug.println("nTabNo :"+nTabNo+":");
		int nSelected = params.getKeyValue("SELECTED",0);
		Debug.println("nSelected :"+nSelected+":");

		Debug.println("doing fresh tabs");
		String selectedColor="#98ABC7";
		String notSelectedColor="#C0C0C0";
		JVTabs tabs = new JVTabs(selectedColor, notSelectedColor);

		int nTabCount = 0;		// run through the potential tabs

		Debug.println("handle Alerts tab");	// always get own alerts
		String myString = notSelectedColor;
		if (nSelected == nTabCount) {
			Debug.println("add alerts to request");
			myString = selectedColor;
			JVAlerts alerts = userinfo.getAlerts();
			request.setAttribute(Constants.ALERTS_INFO_KEY,alerts);
		}
		tabs.addItem (
			new JVTabsItems (nTabCount,
						"Alerts","/AppMain.do?selected="+nTabCount,
						"/pages/includes/Alerts.jsp",myString));
		nTabCount++;

		if (userinfo.isSubsystemAccessible(AppConstants.SUBSYSTEM_SHIPPING)) {
			Debug.println("handle Shipments tab");
			myString = notSelectedColor;
			if (nSelected == nTabCount) myString = selectedColor;
			tabs.addItem (
				new JVTabsItems (nTabCount,
						"Shipments","/AppMain.do?selected="+nTabCount,
						"/pages/includes/Shipments.jsp",myString));
			nTabCount++;
		}

		if (userinfo.isSubsystemAccessible(AppConstants.SUBSYSTEM_PRODUCTS)) {
			Debug.println("handle Products tab");
			myString = notSelectedColor;
			if (nSelected == nTabCount) {
				Debug.println("add collections to request");
				myString = selectedColor;
				JVCollections collections = userinfo.getCollections();
				request.setAttribute(Constants.COLLECTIONS_INFO_KEY,collections);
			}
			tabs.addItem (
				new JVTabsItems (nTabCount,
						"Products","/AppMain.do?selected="+nTabCount,
						"/pages/includes/Products.jsp",myString));
			nTabCount++;
		}

		if (userinfo.isSubsystemAccessible(AppConstants.SUBSYSTEM_CONTRACTS)) {
			Debug.println("handle Contracts tab");
			myString = notSelectedColor;
			if (nSelected == nTabCount) myString = selectedColor;
			tabs.addItem (
				new JVTabsItems (nTabCount,
						"Contracts","/AppMain.do?selected="+nTabCount,
						"/pages/includes/Contracts.jsp",myString));
		}

		tabs.setSelectedIndex(nSelected);
		request.setAttribute(Constants.USER_TABS, tabs);
		Debug.println ("<<< AppMainAction:perform");
        return (mapping.findForward(Constants.SUCCESS));
    }
}

