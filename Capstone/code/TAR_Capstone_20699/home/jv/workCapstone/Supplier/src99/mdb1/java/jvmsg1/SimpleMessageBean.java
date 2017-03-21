
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
import java.util.logging.*;

public class SimpleMessageBean implements MessageDrivenBean, 
            MessageListener {

    private transient MessageDrivenContext mdc = null;
    private Context context;
	private JVBeanAccess m_ejbBean;
    
    static final Logger logger = Logger.getLogger("SimpleMessageBean");

    public SimpleMessageBean() {
        logger.info("In SimpleMessageBean.SimpleMessageBean()");
    }

    public void setMessageDrivenContext(MessageDrivenContext mdc) {
        logger.info("In SimpleMessageBean.setMessageDrivenContext()");
        this.mdc = mdc;
    }

    public void ejbCreate() {
		Debug.setFile("/tmp/supplier_war.txt",true);
		Debug.println(">>> ejbCreate");
		m_ejbBean = new JVBeanAccess();
		m_ejbBean.create();
		Debug.println("<<< ejbCreate");
	}

    public void ejbRemove() {
		Debug.println(">>> ejbRemove");
		m_ejbBean.remove();
		m_ejbBean = null;
		Debug.println("<<< ejbRemove");
	} 

    public void onMessage(Message inMessage) {
		Debug.println(">>> onMessage");
        TextMessage msg = null;

        try {
            if (inMessage instanceof TextMessage) {
				Debug.println("message is TextMessage");
                msg = (TextMessage) inMessage;
                logger.info
                    ("MESSAGE BEAN: Message received: " + 
                    msg.getText());
				Debug.println("message is :"+msg.getText()+":");
				Debug.println("add Alert");
//
//	horrible botch, good enough for now....
// just test the mechanics....
//	eventid = 1 is a good bet - it has to be there....
//
//	inserted value too large column - now set to 2500 chars
//
//				m_ejbBean.addAlert(1,1,25,450,msg.getText());
//
// this works fine...
//				String strMyMsg = "any message for now";
//				m_ejbBean.addAlert(1,1,25,450,strMyMsg);
				m_ejbBean.addAlert(1,1,25,450,msg.getText());
				Debug.println("survived add Alert");
            } else {
				Debug.println("message is NOT TextMessage");
                logger.warning
                    ("Message of wrong type: " +
                    inMessage.getClass().getName());
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

