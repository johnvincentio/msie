
package helloservice;

import jvcommon.*;

import java.rmi.RemoteException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

public class HelloServiceBean implements SessionBean, HelloIF {
	private JVSendMessage m_sendMessage;

    public HelloServiceBean() {}
    public void ejbActivate() {}
    public void ejbPassivate() {}
    public void setSessionContext(SessionContext sc) {}

    public String sayHello(String strMsg) {
		System.out.println(">>>(helloServiceBean)sayHello");
		Debug.println(">>> sayHello; "+strMsg);
		m_sendMessage.sendMessage (strMsg);	// can send multiple messages
		Debug.println("sent the XML");
        return "OK";	// yuk! leave for now....
    }

    public void ejbCreate() {
		System.out.println(">>>(helloServiceBean)ejbCreate");
		Debug.setFile("/tmp/distributor_war.txt",true);
		Debug.println(">>> ejbCreate");
		m_sendMessage = new JVSendMessage();
		boolean bError = m_sendMessage.createConnection();	// yuk! OK for now
		Debug.println("createConnection "+bError);
		Debug.println("<<< ejbCreate");
	}

    public void ejbRemove() {
		System.out.println(">>>(helloServiceBean)ejbRemove");
		Debug.println(">>> ejbRemove");
		m_sendMessage.removeConnection();
		m_sendMessage = null;
		Debug.println("<<< ejbRemove");
	} 
}

