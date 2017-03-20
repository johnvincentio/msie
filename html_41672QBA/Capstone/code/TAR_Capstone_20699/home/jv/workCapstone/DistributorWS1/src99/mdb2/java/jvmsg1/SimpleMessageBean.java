
package jvmsg1;

import jvcommon.*;

import java.io.Serializable;
import java.rmi.RemoteException; 
import javax.ejb.EJBException;
import javax.ejb.MessageDrivenBean;
import javax.ejb.MessageDrivenContext;
import javax.ejb.CreateException;
import javax.naming.*;
import javax.jms.*;

public class SimpleMessageBean implements MessageDrivenBean, 
            MessageListener {

    private transient MessageDrivenContext mdc = null;
    private Context context;
	private JVBeanAccess m_beanAccess;
    
    public SimpleMessageBean() {}

    public void setMessageDrivenContext(MessageDrivenContext mdc) {
        this.mdc = mdc;
    }

    public void ejbCreate() {
		Debug.setFile("/tmp/distributor_war.txt",true);
		Debug.println(">>> ejbCreate");
		m_beanAccess = new JVBeanAccess();
		m_beanAccess.create();
		Debug.println("<<< ejbCreate");
	}

    public void ejbRemove() {
		Debug.println(">>> ejbRemove");
		m_beanAccess.remove();
		m_beanAccess = null;
		Debug.println("<<< ejbRemove");
	} 

    public void onMessage(Message inMessage) {
		Debug.println(">>> onMessage");
        TextMessage msg = null;

        try {
            if (inMessage instanceof TextMessage) {
				Debug.println("message is TextMessage");
                msg = (TextMessage) inMessage;
				Debug.println("message is :"+msg.getText()+":");
				m_beanAccess.doXML(msg.getText());
            } else {
				Debug.println("message is NOT TextMessage");
            }
        } catch (JMSException e) {
            e.printStackTrace();
            mdc.setRollbackOnly();
        } catch (Throwable te) {
            te.printStackTrace();
        }
		Debug.println("<<< onMessage");
    }
}

