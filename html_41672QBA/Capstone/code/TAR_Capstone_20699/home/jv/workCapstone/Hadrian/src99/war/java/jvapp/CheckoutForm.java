
package jvapp;

import jvdebug.*;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public final class CheckoutForm extends ActionForm {
    private int item;
    private int quantity;
    public int getItem() {return (this.item);}
    public int getQuantity() {return (this.quantity);}
	public void setItem(int num) {item = num;}
	public void setQuantity(int num) {quantity = num;}

    public void reset(ActionMapping mapping, HttpServletRequest request) {
		Debug.println("--- CheckoutForm:reset");
		setItem(0);
		setQuantity(1);
    }

    public ActionErrors validate(ActionMapping mapping,
                                 HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
		Debug.println("CheckoutForm:validate");
        return errors;
    }
}

