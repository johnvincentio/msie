
package jvapp;

import jvcommon.Debug;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public final class RegisterForm extends ActionForm {
	private String email = null;
	private String password = null;
	private String firstname = null;
	private String middle = null;
	private String lastname = null;
	private String faddress = null;
	private String laddress = null;
	private String city = null;
	private String state = null;
	private String zip = null;
	private String phone = null;

	public void setEmail (String str) {this.email = str;}
	public String getEmail() {return this.email;}
	public void setPassword (String str) {this.password = str;}
	public String getPassword() {return this.password;}
	public void setFirstname (String str) {this.firstname = str;}
	public String getFirstname() {return this.firstname;}
	public void setMiddle (String str) {this.middle = str;}
	public String getMiddle() {return this.middle;}
	public void setLastname (String str) {this.lastname = str;}
	public String getLastname() {return this.lastname;}
	public void setFaddress (String str) {this.faddress = str;}
	public String getFaddress() {return this.faddress;}
	public void setLaddress (String str) {this.laddress = str;}
	public String getLaddress() {return this.laddress;}
	public void setCity (String str) {this.city = str;}
	public String getCity() {return this.city;}
	public void setState (String str) {this.state = str;}
	public String getState() {return this.state;}
	public void setZip (String str) {this.zip = str;}
	public String getZip() {return this.zip;}
	public void setPhone (String str) {this.phone = str;}
	public String getPhone() {return this.phone;}

    public void reset(ActionMapping mapping, HttpServletRequest request) {
		Debug.println("--- RegisterForm:reset");
        setEmail(null);
        setPassword(null);
        setFirstname(null);
        setMiddle(null);
        setLastname(null);
        setFaddress(null);
        setLaddress(null);
        setCity(null);
        setState(null);
        setZip(null);
        setPhone(null);
    }

    public ActionErrors validate(ActionMapping mapping,
                                 HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
		Debug.println("--- RegisterForm:validate");

        if ((email == null) || (email.length() < 1))
            errors.add("email",
                new ActionError("register.error.email.required"));

        if ((password == null) || (password.length() < 1))
            errors.add("password",
                new ActionError("register.error.password.required"));

        if ((firstname == null) || (firstname.length() < 1))
            errors.add("firstname",
                new ActionError("register.error.firstname.required"));

        if ((lastname == null) || (lastname.length() < 1))
            errors.add("lastname",
                new ActionError("register.error.lastname.required"));

        if ((faddress == null) || (faddress.length() < 1))
            errors.add("faddress",
                new ActionError("register.error.faddress.required"));

        if ((city == null) || (city.length() < 1))
            errors.add("city",
                new ActionError("register.error.city.required"));

        if ((state == null) || (state.length() < 1))
            errors.add("state",
                new ActionError("register.error.state.required"));

        if ((zip == null) || (zip.length() < 1))
            errors.add("zip",
                new ActionError("register.error.zip.required"));

        if ((phone == null) || (phone.length() < 1))
            errors.add("phone",
                new ActionError("register.error.phone.required"));

        return errors;
    }
}

