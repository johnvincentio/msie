
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

public final class TabAction extends Action {

    public ActionForward perform(ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response)
        throws IOException, ServletException {

		Debug.println (">>> TabAction:perform");
		JVParameters params = new JVParameters(request.getParameterMap());
		params.showParams ("TabAction");

		JVAttributes attribs = new JVAttributes(request.getAttributeNames());
		attribs.showParams ("TabAction");
/*
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
*/
		int nTabNo = params.getKeyValue("TABNO",-1);
		Debug.println("nTabNo :"+nTabNo+":");
		int nSelected = params.getKeyValue("SELECTED",0);
		Debug.println("nSelected :"+nSelected+":");

		Debug.println("doing fresh tabs");
		String selectedColor="#98ABC7";
		String notSelectedColor="#C0C0C0";
		JVTabs tabs = new JVTabs(selectedColor, notSelectedColor);

		String myString = notSelectedColor;
		if (nSelected == 0) myString = selectedColor;
		tabs.addItem (
			new JVTabsItems (0,"News","/Tab1.do?selected=0",
								"/pages/includes/News.jsp",myString));

		myString = notSelectedColor;
		if (nSelected == 1) myString = selectedColor;
		tabs.addItem (
			new JVTabsItems (1,"Features","/Tab1.do?selected=1",
								"/pages/includes/Features.jsp",myString));

		tabs.setSelectedIndex(nSelected);

		request.setAttribute(Constants.USER_TABS, tabs);
		Debug.println ("<<< TabAction:perform");
        return (mapping.findForward(Constants.SUCCESS));
    }
}

