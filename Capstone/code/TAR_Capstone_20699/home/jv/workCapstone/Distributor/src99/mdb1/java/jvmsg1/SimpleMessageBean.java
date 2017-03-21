
package jvmsg1;

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
    
    static final Logger logger = Logger.getLogger("SimpleMessageBean");

    public SimpleMessageBean() {
        logger.info("In SimpleMessageBean.SimpleMessageBean()");
    }

    public void setMessageDrivenContext(MessageDrivenContext mdc) {
        logger.info("In SimpleMessageBean.setMessageDrivenContext()");
        this.mdc = mdc;
    }

    public void ejbCreate() {
        logger.info("In SimpleMessageBean.ejbCreate()");
    }

    public void onMessage(Message inMessage) {
        TextMessage msg = null;

        try {
            if (inMessage instanceof TextMessage) {
                msg = (TextMessage) inMessage;
                logger.info
                    ("MESSAGE BEAN: Message received: " + 
                    msg.getText());
            } else {
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
    }  // onMessage
    
    public void ejbRemove() {
        logger.info("In SimpleMessageBean.remove()");
    }

} // class
