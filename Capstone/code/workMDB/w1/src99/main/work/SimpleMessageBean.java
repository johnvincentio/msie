// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) nonlb 

import java.util.logging.Logger;
import javax.ejb.MessageDrivenBean;
import javax.ejb.MessageDrivenContext;
import javax.jms.*;
import javax.naming.Context;

public class SimpleMessageBean
    implements MessageDrivenBean, MessageListener {

    public SimpleMessageBean() {
        mdc = null;
        logger.info("In SimpleMessageBean.SimpleMessageBean()");
    }

    public void setMessageDrivenContext(MessageDrivenContext messagedrivencontext) {
        logger.info("In SimpleMessageBean.setMessageDrivenContext()");
        mdc = messagedrivencontext;
    }

    public void ejbCreate() {
        logger.info("In SimpleMessageBean.ejbCreate()");
    }

    public void onMessage(Message message) {
        Object obj = null;
        try {
            if(message instanceof TextMessage) {
                TextMessage textmessage = (TextMessage)message;
                logger.info("MESSAGE BEAN: Message received: " + textmessage.getText());
            } else {
                logger.warning("Message of wrong type: " + message.getClass().getName());
            }
        }
        catch(JMSException jmsexception) {
            jmsexception.printStackTrace();
            mdc.setRollbackOnly();
        }
        catch(Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public void ejbRemove() {
        logger.info("In SimpleMessageBean.remove()");
    }

    private transient MessageDrivenContext mdc;
    private Context context;
    static final Logger logger = Logger.getLogger("SimpleMessageBean");

}
