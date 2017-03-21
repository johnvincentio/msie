
package jvapp;

import jvcommon.Debug;

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

public final class SB1Action extends Action {

    public ActionForward perform(ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response)
        throws IOException, ServletException {

		Debug.println (">>> SB1Action:perform");
		JVParameters params = new JVParameters(request.getParameterMap());
		params.showParams ("SB1Action");

		JVAttributes attribs = new JVAttributes(request.getAttributeNames());
		attribs.showParams ("SB1Action");

		SB1Test sb1Test = new SB1Test();
		sb1Test.doTest();

		Debug.println ("<<< SB1Action:perform");
        return (mapping.findForward(Constants.SUCCESS));
    }
}

