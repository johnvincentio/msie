
package app;

import org.apache.struts.action.ActionForm;

public class RegisterForm extends ActionForm {

    public RegisterForm() {}

    public String getPassword1() {return password1;}
    public String getPassword2() {return password2;}
    public String getUsername() {return username;}

    public void setPassword1(String s) {password1 = s;}
    public void setPassword2(String s) {password2 = s;}
    public void setUsername(String s) {username = s;}

    protected String username;
    protected String password1;
    protected String password2;
}
