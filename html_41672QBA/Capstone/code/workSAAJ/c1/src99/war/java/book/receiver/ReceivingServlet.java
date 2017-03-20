
package book.receiver;

import jvapp.*;

import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.soap.*;

public class ReceivingServlet extends SAAJServlet
{

    static Logger
        logger = Logger.getLogger("Samples/Book");

    // This is the application code for handling the message.. Once the
    // message is received the application can retrieve the soap part, the
    // attachment part if there are any, or any other information from the
    // message.

    public SOAPMessage onMessage(SOAPMessage message) {
		Debug.println(">>> onMessage");
        System.out.println("On message called in receiving servlet");
        try {
			Debug.println("stage 1");
            System.out.println("Here's the message: ");
            message.writeTo(System.out);

		    SOAPHeader header = message.getSOAPHeader();
		    SOAPBody body = message.getSOAPBody();

			Debug.println("stage 2");
		    Iterator headerElems = header.examineMustUnderstandHeaderElements(
						"http://saaj.sample/receiver");

			Debug.println("stage 3");
			while(headerElems.hasNext()) {
				SOAPHeaderElement elem = (SOAPHeaderElement) headerElems.next();
				String actor = elem.getActor();
				boolean mu = elem.getMustUnderstand();
				Iterator elemChildren = elem.getChildElements();

				Debug.println("**************");
				Debug.println("actor and mu are " + actor + " " + mu);
				while(elemChildren.hasNext()) {
					SOAPElement elem1 = (SOAPElement)elemChildren.next();
					org.w3c.dom.Node child = elem1.getFirstChild();
					String childValue = child.getNodeValue();
					Debug.println("childValue is " + childValue);
				}
			}
			return message;
		}
		catch(Exception e) {
            logger.log(Level.SEVERE,
                "Error in processing or replying to a message",e);
            return null;
        }
    }
}

