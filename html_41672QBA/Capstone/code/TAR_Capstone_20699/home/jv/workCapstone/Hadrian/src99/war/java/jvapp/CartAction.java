
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

public final class CartAction extends Action {

    public ActionForward perform(ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response)
        throws IOException, ServletException {

		Debug.println (">>> CartAction:perform");
		JVParameters params = new JVParameters(request.getParameterMap());
		params.showParams ("CartAction");
		JVAttributes attribs = new JVAttributes(request.getAttributeNames());
		attribs.showParams ("CartAction");

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

		String strUpdate = params.getKeyValue("UPDATE","NULL");
		String strRemove = params.getKeyValue("REMOVE","NULL");
		int nItemid = params.getKeyValue("ITEM",-1);
		Debug.println("Update :"+strUpdate+":");
		Debug.println("Remove :"+strRemove+":");
		Debug.println("nItemid :"+nItemid+":");

		if (! strUpdate.equals("NULL")) {
			Debug.println("doing update");
			Integer Isave = new Integer (nItemid);
			request.setAttribute("JVUPDATE", Isave);
//			doUpdateCart(req,params);
        	return (mapping.findForward("update"));
		}
		if (! strRemove.equals("NULL")) {
			Debug.println("doing remove");
			userinfo.getDatabase().removeCartItem(nItemid);		// needs cart.cartid
		}
		Debug.println("doing fresh cart");
		JVCart cart = userinfo.doCart();
		request.setAttribute(Constants.SHOPPING_CART, cart);

		Debug.println("before get resource bundle");
		ResourceBundle rb = ResourceBundle.getBundle
						("resources.application",request.getLocale());
		Debug.println("after get resource bundle");

		JVTemplate tpt = new JVTemplate();
		tpt.setComment ("Main page; CartAction");
		tpt.setTitle (rb.getString ("cart.title"));
		tpt.getHeader().setFile ("/pages/includes/Header.jsp");
		tpt.getMenu().setFile ("/templates/MainMenu.jsp");
		tpt.getBody().setFile ("/pages/includes/Cart.jsp");
		tpt.getFooter().setFile ("/pages/includes/Footer.jsp");

		Debug.println("Creating sub-menus");
		JVurl jvurl = new JVurl (request);
		JVSubMenu sbm = new JVSubMenu (rb.getString ("menu.options.options"));
		sbm.addPair (new JVPair (jvurl.getURL("/Main.do"),
									rb.getString ("menu.home")));
		sbm.addPair (new JVPair (jvurl.getURL("/Catalogs.do"),
									rb.getString ("menu.catalogs")));
		sbm.addPair (new JVPair (jvurl.getURL("/Checkout.do"),
									rb.getString ("menu.checkout")));
		sbm.addPair (new JVPair (jvurl.getURL("/Logoff.do"),
									rb.getString ("menu.logoff")));
		tpt.getMenu().addSubMenu (sbm);
		Debug.println("Sub-menus created");

		Debug.println("Template complete");
		request.setAttribute(Constants.TEMPLATE_INFO_KEY, tpt);

		Debug.println ("<<< CartAction:perform");
        return (mapping.findForward(Constants.SUCCESS));
    }
}

