
import javax.jms.*;
import javax.naming.*;

public class SimpleMessageClient {

    public static void main(String[] args) {

        Context            jndiContext = null;
        ConnectionFactory  connectionFactory = null;
        Connection         connection = null;
        Session            session = null;
        Destination        destination = null;
        MessageProducer    messageProducer = null;
        TextMessage        message = null;
        final int          NUM_MSGS = 3;

        try {
            jndiContext = new InitialContext();
        } catch (NamingException e) {
            System.out.println("Could not create JNDI " + "context: "
                    + e.toString());
            System.exit(1);
        }

        try {
            connectionFactory = (ConnectionFactory) jndiContext.lookup
                    ("java:comp/env/jms/MyConnectionFactory");
            destination = (Queue) jndiContext.lookup
					("java:comp/env/jms/SupplierMdb1QueueName");
        } catch (NamingException e) {
            System.out.println("JNDI lookup failed: " + e.toString());
            System.exit(1);
        }

        try {
            connection = connectionFactory.createConnection();
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            messageProducer = session.createProducer(destination);
            message = session.createTextMessage();

            for (int i = 0; i < NUM_MSGS; i++) {
                message.setText("This is message " + (i + 1));
                System.out.println("Sending message: " + message.getText());
                messageProducer.send(message);
            }
            System.out.println("To see if the bean received the messages,");
            System.out.println(" check <install_dir>/domains/domain1/logs/server.log."); 

        } catch (JMSException e) {
            System.out.println("Exception occurred: " + e.toString());
        }
        finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (JMSException e) {}
            } // if
            System.exit(0);
        } // finally
    } // main
} // class

