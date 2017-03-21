
package jvapp;

import jvtemplate.*;
import jvcommon.*;

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

public final class MainAction extends Action {

    public ActionForward perform(ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response)
        throws IOException, ServletException {

		Debug.println (">>> MainAction:perform");
		JVParameters params = new JVParameters(request.getParameterMap());
		params.showParams ("MainAction");

		JVAttributes attribs = new JVAttributes(request.getAttributeNames());
		attribs.showParams ("MainAction");

		Debug.println("before get resource bundle");
		ResourceBundle rb = ResourceBundle.getBundle
						("resources.application",request.getLocale());
		Debug.println("after get resource bundle");

		JVTemplate tpt = new JVTemplate();
		tpt.setComment ("Main page; MainAction");
		tpt.setTitle (rb.getString ("main.title"));
		tpt.getHeader().setFile ("/pages/includes/Header.jsp");
		tpt.getMenu().setFile ("/templates/MainMenu.jsp");
		tpt.getBody().setFile ("/templates/MainBody.jsp");
		tpt.getFooter().setFile ("/pages/includes/Footer.jsp");

		Debug.println("Creating sub-menus");
		JVSubMenu sbm = new JVSubMenu ("Options");
		sbm.addPair (new JVPair ("/Main.do","Home"));
		sbm.addPair (new JVPair ("/Logon.do","Portal Logon"));
		tpt.getMenu().addSubMenu (sbm);

		sbm = new JVSubMenu ("Let's Go Shopping");
		sbm.addPair (new JVPair ("/Goshopping.do", "Nero On-line Store"));
		sbm.addPair (new JVPair ("/Goshopping2.do", "Hadrian On-line Store"));
		tpt.getMenu().addSubMenu (sbm);
		Debug.println("Sub-menus created");

		Debug.println("Creating sub-bodies");
		JVSubBody sbb = new JVSubBody();
		sbb.addColumn (new JVColumn ("/pages/includes/Picture.jsp"));
		sbb.addColumn (new JVColumn ("/pages/includes/Welcome.jsp"));
		sbb.addColumn (new JVColumn ("/pages/includes/Features.jsp"));
		tpt.getBody().addSubBody (sbb);

		sbb = new JVSubBody();
		sbb.addColumn (new JVColumn ("/pages/includes/News.jsp"));
		sbb.addColumn (new JVColumn ("/pages/includes/Comments.jsp"));
		tpt.getBody().addSubBody (sbb);

		request.setAttribute(Constants.TEMPLATE_INFO_KEY, tpt);
		Debug.println ("<<< MainAction:perform");
        return (mapping.findForward(Constants.SUCCESS));
    }
}

