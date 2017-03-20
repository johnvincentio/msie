
package jvapp;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public final class CartUpdateForm extends ActionForm {
    private int quantity = 0;
    public int getQuantity() {return (this.quantity);}
    public void setQuantity(int num) {this.quantity = num;}
    public void reset(ActionMapping mapping, HttpServletRequest request) {
		Debug.println("--- CartUpdateForm:reset");
        setQuantity(0);
    }

    public ActionErrors validate(ActionMapping mapping,
                                 HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
		Debug.println("CartUpdateForm:validate");
        return errors;
    }
}


