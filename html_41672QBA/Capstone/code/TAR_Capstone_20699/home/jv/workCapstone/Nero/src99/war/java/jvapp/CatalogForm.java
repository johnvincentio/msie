
package jvapp;

import jvdebug.*;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public final class CatalogForm extends ActionForm {
    private int catalogid = 0;
    public int getCatalogid() {return (this.catalogid);}
    public void setCatalogid(int catalogid) {this.catalogid = catalogid;}

    public void reset(ActionMapping mapping, HttpServletRequest request) {
		Debug.println("--- CatalogForm:reset");
        setCatalogid(0);
    }

    public ActionErrors validate(ActionMapping mapping,
                                 HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
		Debug.println("--- CatalogForm:validate");
		Debug.println("catalogid "+catalogid);
        return errors;
    }
}

