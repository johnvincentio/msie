
package jvapp;

import jvdebug.*;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public final class CatalogItemForm extends ActionForm {
	private int itemid;
	private int quantity = 1;

	public int getItemid() {return itemid;}
	public int getQuantity() {return quantity;}

	public void setItemid(int num) {itemid = num;}
	public void setQuantity(int num) {quantity = num;}

    public void reset(ActionMapping mapping, HttpServletRequest request) {
		Debug.println("---CatalogItemForm:reset");
        setItemid(0);
        setQuantity(1);
    }

    public ActionErrors validate(ActionMapping mapping,
                                 HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
		Debug.println("---CatalogItemForm:validate");
        return errors;
    }
}

