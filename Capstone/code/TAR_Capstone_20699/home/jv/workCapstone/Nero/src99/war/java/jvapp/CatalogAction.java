
package jvapp;

import jvdebug.*;
import jvcart.*;
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

		Debug.println("before get resource bundle");
		ResourceBundle rb = ResourceBundle.getBundle
						("resources.application",request.getLocale());
		Debug.println("after get resource bundle");

		JVTemplate tpt = new JVTemplate();
		tpt.setComment ("Main page; CatalogsAction");
		tpt.setTitle (rb.getString ("catalogitems.title"));
		tpt.getHeader().setFile ("/pages/includes/Header.jsp");
		tpt.getMenu().setFile ("/templates/MainMenu.jsp");
		tpt.getBody().setFile ("/pages/includes/CatalogItems.jsp");
		tpt.getFooter().setFile ("/pages/includes/Footer.jsp");

		Debug.println("Creating sub-menus");
		JVSubMenu sbm = new JVSubMenu (rb.getString ("menu.options.options"));
		sbm.addPair (new JVPair ("/Main.do",rb.getString ("menu.home")));
		sbm.addPair (new JVPair ("/Logoff.do",rb.getString ("menu.logoff")));
		tpt.getMenu().addSubMenu (sbm);
		Debug.println("Sub-menus created");

		sbm = new JVSubMenu (rb.getString ("menu.options.cart"));
		sbm.addPair (new JVPair ("/Cart.do",rb.getString ("menu.cart")));
		tpt.getMenu().addSubMenu (sbm);
		Debug.println("Sub-menus created");

		Debug.println("Template complete");
		request.setAttribute(Constants.TEMPLATE_INFO_KEY, tpt);

		Debug.println ("<<< CatalogAction:perform");
        return (mapping.findForward(Constants.SUCCESS));
    }
}

