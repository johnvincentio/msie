
package app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;

public class RegisterAction extends Action {

    public RegisterAction() {}

    public ActionForward perform(ActionMapping actionmapping, 
					ActionForm actionform, 
					HttpServletRequest httpservletrequest, 
					HttpServletResponse httpservletresponse) {
        RegisterForm registerform = (RegisterForm)actionform;
        String s = registerform.getUsername();
        String s1 = registerform.getPassword1();
        String s2 = registerform.getPassword2();
        if(s1.equals(s2))
            try {
                UserDirectory.getInstance().setUser(s, s1);
                return actionmapping.findForward("success");
            }
            catch(UserDirectoryException _ex) {
                return actionmapping.findForward("failure");
            }
        else
            return actionmapping.findForward("failure");
    }
}
