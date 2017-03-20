
package jvapp;

import jvdebug.*;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public final class ConfirmedForm extends ActionForm {

    public void reset(ActionMapping mapping, HttpServletRequest request) {
		Debug.println("--- ConfirmedForm:reset");
    }

    public ActionErrors validate(ActionMapping mapping,
                                 HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
		Debug.println("--- ConfirmedForm:validate");
        return errors;
    }
}

