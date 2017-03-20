
package helloservice;

import java.rmi.RemoteException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

public class HelloServiceBean implements SessionBean, HelloIF {
    public HelloServiceBean() {
    }

    public String sayHello(String name) {
        return "Hello " + name + " (from HelloServiceBean)";
    }

    public void ejbCreate() {
    }

    public void ejbRemove() {
    }

    public void ejbActivate() {
    }

    public void ejbPassivate() {
    }

    public void setSessionContext(SessionContext sc) {
    }
}

