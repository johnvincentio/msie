// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) nonlb 

import java.io.PrintStream;
import javax.jms.*;
import javax.naming.*;

public class SimpleMessageClient {

    public SimpleMessageClient() {
    }

    public static void main(String args[]) {
        InitialContext initialcontext = null;
        ConnectionFactory connectionfactory = null;
        Connection connection = null;
        Object obj = null;
        Queue queue = null;
        Object obj1 = null;
        Object obj2 = null;
        try {
            initialcontext = new InitialContext();
        }
        catch(NamingException namingexception) {
            System.out.println("Could not create JNDI context: " + namingexception.toString());
            System.exit(1);
        }
        try {
            connectionfactory = (ConnectionFactory)initialcontext.lookup("java:comp/env/jms/MyConnectionFactory");
            queue = (Queue)initialcontext.lookup("java:comp/env/jms/QueueName");
        }
        catch(NamingException namingexception1) {
            System.out.println("JNDI lookup failed: " + namingexception1.toString());
            System.exit(1);
        }
        try {
            connection = connectionfactory.createConnection();
            Session session = connection.createSession(false, 1);
            MessageProducer messageproducer = session.createProducer(queue);
            TextMessage textmessage = session.createTextMessage();
            for(int i = 0; i < 3; i++) {
                textmessage.setText("This is message " + (i + 1));
                System.out.println("Sending message: " + textmessage.getText());
                messageproducer.send(textmessage);
            }

            System.out.println("To see if the bean received the messages,");
            System.out.println(" check <install_dir>/domains/domain1/logs/server.log.");
        }
        catch(JMSException jmsexception) {
            System.out.println("Exception occurred: " + jmsexception.toString());
        }
        finally {
            if(connection != null)
                try {
                    connection.close();
                }
                catch(JMSException jmsexception1) { }
            System.exit(0);
        }
    }
}
