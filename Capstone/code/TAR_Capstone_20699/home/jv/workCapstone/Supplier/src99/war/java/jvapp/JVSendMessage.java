
package jvapp;

import jvcommon.*;

import javax.jms.*;
import javax.naming.*;

public class JVSendMessage {
	ConnectionFactory m_connectionFactory = null;
	Connection        m_connection = null;
	TextMessage       m_message;
	MessageProducer   m_messageProducer;

	public JVSendMessage() {}

	public boolean createConnection() {
        Session     session = null;
        Destination destination = null;

		Debug.println(">>> createConnection");
        try {
			Debug.println("stage 1");
            Context ic = new InitialContext();
			Debug.println("stage 2");
            m_connectionFactory = (ConnectionFactory) ic.lookup
                    ("java:comp/env/jms/MyConnectionFactory");
			Debug.println("stage 3");
            destination = (Queue) ic.lookup
					("java:comp/env/jms/SupplierMdb1QueueName");
			Debug.println("stage 4");
            m_connection = m_connectionFactory.createConnection();
			Debug.println("stage 5");
            session = m_connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			Debug.println("stage 6");
            m_messageProducer = session.createProducer(destination);
			Debug.println("stage 7");
            m_message = session.createTextMessage();
			Debug.println("stage 8");
        }
		catch (NamingException ex) {
            Debug.println("namingexception "+ex.getMessage());
			return false;
        }
		catch (JMSException ex) {
           	Debug.println("JMSexception "+ex.getMessage());
		}
		Debug.println("<<< createConnection");
		return true;
	}

	public void removeConnection() {
		Debug.println(">>> removeConnection");
		if (m_connection != null) {
			try {
				m_connection.close();
				m_connection = null;
			}
			catch (JMSException ex) {
            	Debug.println("exception "+ex.getMessage());
			}
		}
		Debug.println("<<< removeConnection");
	}

	public void sendMessage (String strMsg) {
		Debug.println(">>> sendMessage; msg :"+strMsg);
		try {
			m_message.setText(strMsg);
			Debug.println("Sending message: " + m_message.getText());
			m_messageProducer.send(m_message);
		}
		catch (JMSException ex) {
			Debug.println("exception "+ex.getMessage());
		}
		Debug.println("<<< sendMessage");
	}
}

