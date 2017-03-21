
package jvapp;

import jvcommon.*;
import jvtemplate.*;

import java.util.*;
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

public final class ConstructionAction extends Action {

    public ActionForward perform(ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response)
        throws IOException, ServletException {

		Debug.println (">>> ConstructionAction:perform");
		JVParameters params = new JVParameters(request.getParameterMap());
		params.showParams ("ConstructionAction");

		JVAttributes attribs = new JVAttributes(request.getAttributeNames());
		attribs.showParams ("ConstructionAction");

		Debug.println("before get resource bundle");
		ResourceBundle rb = ResourceBundle.getBundle
						("resources.application",request.getLocale());
		Debug.println("after get resource bundle");

		JVTemplate tpt = new JVTemplate();
		tpt.setComment ("Main page; ConstructionAction");
		tpt.setTitle (rb.getString ("construction.title"));
		tpt.getHeader().setFile ("/pages/includes/Header.jsp");
		tpt.getMenu().setFile ("/templates/MainMenu.jsp");
		tpt.getBody().setFile ("/pages/includes/ConstructionBody.jsp");
		tpt.getFooter().setFile ("/pages/includes/Footer.jsp");

		Debug.println("Creating sub-menus");
		JVSubMenu sbm = new JVSubMenu ("Options");
		sbm.addPair (new JVPair ("/Main.do","Home"));
		tpt.getMenu().addSubMenu (sbm);
		Debug.println("Sub-menus created");

		Debug.println("Template complete");
		request.setAttribute(Constants.TEMPLATE_INFO_KEY, tpt);
		Debug.println ("<<< ConstructionAction:perform");
        return (mapping.findForward(Constants.SUCCESS));
    }
}

