
package jvapp;

import jvdebug.*;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public final class CatalogsForm extends ActionForm {
/*
    private int catalogid = 0;
    private String ds = null;
    public int getCatalogid() {return (this.catalogid);}
    public String getDs() {return (this.ds);}
    public void setCatalogid(int catalogid) {this.catalogid = catalogid;}
    public void setDs(String ds) {this.ds = ds;}
*/
    public void reset(ActionMapping mapping, HttpServletRequest request) {
		Debug.println("--- CatalogsForm:reset");
//        setCatalogid(0);
//        setDs(null);
    }

    public ActionErrors validate(ActionMapping mapping,
                                 HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
		Debug.println("---CatalogsForm:validate");
        return errors;
    }
}

