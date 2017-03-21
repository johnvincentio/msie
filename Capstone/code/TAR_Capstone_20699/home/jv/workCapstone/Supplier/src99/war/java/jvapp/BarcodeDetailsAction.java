
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

public final class BarcodeDetailsAction extends Action {

    public ActionForward perform(ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response)
        throws IOException, ServletException {

		Debug.println (">>> BarcodeDetailsAction:perform");
		JVParameters params = new JVParameters(request.getParameterMap());
		params.showParams ("BarcodeDetailsAction");

		JVAttributes attribs = new JVAttributes(request.getAttributeNames());
		attribs.showParams ("BarcodeDetailsAction");

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
		int nBarcodeid = params.getKeyValue("BARCODE",-1);
		Debug.println("nBarcodeid :"+nBarcodeid+":");
		int nItemid = params.getKeyValue("ITEM",-1);
		Debug.println("nItemid :"+nItemid+":");

		Debug.println("doing fresh tabs");
		String selectedColor="#98ABC7";
		String notSelectedColor="#C0C0C0";
		JVTabs tabs = new JVTabs(selectedColor, notSelectedColor);

		Debug.println("handle tab 0");
		String myString = notSelectedColor;
		if (nSelected == 0) {
			Debug.println("add characteristics to request");
			myString = selectedColor;
			if (nItemid < 0)
				nItemid = userinfo.getItemid();
			else
				userinfo.setItemid (nItemid);
			Debug.println("(2) nItemid :"+nItemid+":");
			JVCharacteristics characteristics = userinfo.getCharacteristics(nItemid);
			request.setAttribute(Constants.CHARACTERISTICS_INFO_KEY,characteristics);
		}
		tabs.addItem (
			new JVTabsItems (0,"Characteristics","/BarcodeDetails.do?selected=0",
								"/pages/includes/Characteristics.jsp",myString));

		Debug.println("handle tab 1");
		myString = notSelectedColor;
		if (nSelected == 1) myString = selectedColor;
		tabs.addItem (
			new JVTabsItems (1,"Costs","/BarcodeDetails.do?selected=1",
								"/pages/Construction.jsp",myString));

		Debug.println("handle tab 2");
		myString = notSelectedColor;
		if (nSelected == 2) {
			myString = selectedColor;
		}
		tabs.addItem (
			new JVTabsItems (2,"Supplier","/BarcodeDetails.do?selected=2",
								"/pages/includes/Shipments.jsp",myString));

		Debug.println("handle tab 3");
		myString = notSelectedColor;
		if (nSelected == 3) {
			myString = selectedColor;
		}
		tabs.addItem (
			new JVTabsItems (3,"Testing","/BarcodeDetails.do?selected=3",
								"/pages/includes/ConstructionBody.jsp",myString));


		tabs.setSelectedIndex(nSelected);
		request.setAttribute(Constants.USER_TABS, tabs);
		Debug.println ("<<< BarcodeDetailsAction:perform");
        return (mapping.findForward(Constants.SUCCESS));
    }
}

