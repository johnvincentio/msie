
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

public final class CustomtagsAction extends Action {

    public ActionForward perform(ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response)
        throws IOException, ServletException {

		Debug.println (">>> CustomtagsAction:perform");
		JVParameters params = new JVParameters(request.getParameterMap());
		params.showParams ("CustomtagsAction");
		JVAttributes attribs = new JVAttributes(request.getAttributeNames());
		attribs.showParams ("CustomtagsAction");

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

		Debug.println("before get resource bundle");
		ResourceBundle rb = ResourceBundle.getBundle
						("resources.application",request.getLocale());
		Debug.println("after get resource bundle");

		JVTemplate tpt = new JVTemplate();
		tpt.setComment ("Main page; CustomtagsAction");
		tpt.setTitle (rb.getString ("catalogs.title"));
		tpt.getHeader().setFile ("/pages/includes/Header.jsp");
		tpt.getMenu().setFile ("/templates/MainMenu.jsp");
		tpt.getBody().setFile ("/pages/includes/Customtags.jsp");
		tpt.getFooter().setFile ("/pages/includes/Footer.jsp");

		Debug.println("Creating sub-menus");
		JVurl jvurl = new JVurl (request);
		JVSubMenu sbm = new JVSubMenu (rb.getString ("menu.options.options"));
		sbm.addPair (new JVPair (jvurl.getURL("/Main.do"),
									rb.getString ("menu.home")));
		sbm.addPair (new JVPair (jvurl.getURL("/Logoff.do"),
									rb.getString ("menu.logoff")));
		tpt.getMenu().addSubMenu (sbm);
		Debug.println("Sub-menus created");

		Debug.println("Template complete");
		request.setAttribute(Constants.TEMPLATE_INFO_KEY, tpt);

		Debug.println("Setting username for the custom tag lib test");
		String strUserid = userinfo.getLogonName();
		request.setAttribute("jvTaguser", strUserid);

		Debug.println ("<<< CustomtagsAction:perform");
        return (mapping.findForward(Constants.SUCCESS));
    }
}

