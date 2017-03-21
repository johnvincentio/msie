
package jvapp;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class SendMail {
	String m_strHost;
	String m_strTo;
	String m_strFrom;
	String m_strUser;
	String m_strPwd;

	public SendMail (String host, String to, String from, String user,
						String pwd) {
		Debug.println(">>> SendMail (constructor)");
		m_strHost = host;
		m_strTo = to;
		m_strFrom = from;
		m_strUser = user;
		m_strPwd = pwd;
		Debug.println("host :"+m_strHost+":");
		Debug.println("to :"+m_strTo+":");
		Debug.println("from :"+m_strFrom+":");
		Debug.println("user :"+m_strUser+":");
		Debug.println("pwd :"+m_strPwd+":");
		Debug.println("<<< SendMail (constructor)");
	}
	public void sendMessage (String strTo, String strSubject, String strText) {
		Debug.println(">>> sendMessage (1)");
		m_strTo = strTo;
		sendMessage (strSubject, strText);
		Debug.println("<<< sendMessage (1)");
	}
	private void sendMessage (String strSubject, String strText) {
		Debug.println(">>> sendMessage (2)");
        Properties props = System.getProperties(); // Get properties object
		Debug.println("stage 1");
        props.put("mail.smtp.host",m_strHost); // Define SMTP host property
//        props.put("mail.smtp.auth","true");	// do not set - it fails!

		Debug.println("stage 2");
		Authenticator auth = new MyAuthenticator (m_strUser,m_strPwd);
        try {
		Debug.println("stage 3");
            Session session = Session.getDefaultInstance(props,auth);
		Debug.println("stage 4");
            MimeMessage message = new MimeMessage(session);
		Debug.println("stage 5");

            message.setText(strText);
		Debug.println("stage 6");
            message.setSubject(strSubject);
		Debug.println("stage 7");
            message.setFrom(new InternetAddress(m_strFrom));
		Debug.println("stage 8");
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(m_strTo));
           	Debug.println("Sending Message ");
			Transport.send(message);
           	Debug.println("Message Sent");

        }
        catch (AuthenticationFailedException afe) {
            Debug.println("trouble 2");
            Debug.println(afe.getMessage());
        }
        catch (IllegalStateException ise) {
            Debug.println("trouble 3");
            Debug.println(ise.getMessage());
        }
        catch (MessagingException me) {
            Debug.println("trouble");
            Debug.println(me.getMessage());
        }
		Debug.println("<<< sendMessage (2)");
    }
	public class MyAuthenticator extends Authenticator {
		private String strUser;
		private String strPwd;
		public MyAuthenticator (String user, String pwd) {
			strUser = user;
			strPwd = pwd;
		}
		protected PasswordAuthentication getPasswordAuthentication () {
			Debug.println("in getPasswordAuthentication");
			return new PasswordAuthentication (strUser, strPwd);
		}
	}
}

