
package jvapp;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public final class LogonForm extends ActionForm {
    private String password = null;
    private String username = null;
    public String getPassword() {return (this.password);}
    public void setPassword(String password) {this.password = password;}
    public String getUsername() {return (this.username);}
    public void setUsername(String username) {this.username = username;}

    public void reset(ActionMapping mapping, HttpServletRequest request) {
		Debug.println (">>> LogonForm:reset");
        setPassword(null);
        setUsername(null);
		Debug.println ("<<< LogonForm:reset");
    }

    public ActionErrors validate(ActionMapping mapping,
                                 HttpServletRequest request) {
		Debug.println (">>> LogonForm:validate");
        ActionErrors errors = new ActionErrors();

        if ((username == null) || (username.length() < 1))
            errors.add("username",
                new ActionError("logon.error.username.required"));

        if ((password == null) || (password.length() < 1))
            errors.add("password",
                new ActionError("logon.error.password.required"));

		Debug.println ("<<< LogonForm:validate");
        return errors;
    }
}
