
package jvapp;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public final class CartForm extends ActionForm {
    private int item;
    private int quantity;
    public int getItem() {return (this.item);}
    public int getQuantity() {return (this.quantity);}
	public void setItem(int num) {item = num;}
	public void setQuantity(int num) {quantity = num;}

    public void reset(ActionMapping mapping, HttpServletRequest request) {
		Debug.println("--- CartForm:reset");
		setItem(0);
		setQuantity(1);
    }

    public ActionErrors validate(ActionMapping mapping,
                                 HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
		Debug.println("CartForm:validate");
        return errors;
    }
}

