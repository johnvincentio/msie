
package book.sender;

import jvapp.*;

import java.io.*;
import java.net.URL;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.activation.DataHandler;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.*;

import org.w3c.dom.Document;

public class SendingServlet extends HttpServlet {

    String to = null;
    String data = null;
    ServletContext servletContext;

    private static Logger logger = Logger.getLogger("Samples/Book");

    // Connection to send messages.
    private SOAPConnection con;

    public void init(ServletConfig servletConfig) throws ServletException {
        super.init( servletConfig );
        servletContext = servletConfig.getServletContext();

		Debug.setFile("/tmp/SendingServlet.txt",false);
		Debug.println("---init()");

        try {
			Debug.println("stage 1");
            SOAPConnectionFactory scf = SOAPConnectionFactory.newInstance();
			Debug.println("stage 2");
            con = scf.createConnection();
			Debug.println("stage 3");
        } catch(Exception e) {
            logger.log(Level.SEVERE, "Unable to open a SOAPConnection", e);
        }

		Debug.println("stage 4");
        InputStream in
        = servletContext.getResourceAsStream("/WEB-INF/address.properties");

		Debug.println("stage 5");
        if (in != null) {
            Properties props = new Properties();

            try {
                props.load(in);

                to = props.getProperty("to");
                data = props.getProperty("data");
            } catch (IOException ex) {
                // Ignore
            }
        }
		Debug.println("<<< init()");
    }

    public void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException {

		Debug.println(">>> goGet");
        String retval ="<html> <H4>";

        try {
            // Create a message factory.
			Debug.println("stage 1");
            MessageFactory mf = MessageFactory.newInstance();

            // Create a message from the message factory.
            SOAPMessage msg = mf.createMessage();

            // Message creation takes care of creating the SOAPPart - a
            // required part of the message as per the SOAP 1.1
            // specification.
            SOAPPart sp = msg.getSOAPPart();

            // Retrieve the envelope from the soap part to start building
            // the soap message.
            SOAPEnvelope envelope = sp.getEnvelope();

            // Get the soap SOAP Header from the message
            SOAPHeader header = msg.getSOAPHeader();

			Debug.println("stage 2");
            Name book = envelope.createName("book", "b",
                                        "http://saaj.sample/book");
            SOAPHeaderElement bookHeaderElem =
                                header.addHeaderElement(book);
            bookHeaderElem.setActor("http://saaj.sample/receiver");
            bookHeaderElem.setMustUnderstand(true);

			Debug.println("stage 3");
            Name isbn = envelope.createName("isbn", "b",
                                        "http://saaj.sample/book");
            SOAPElement isbnElem = bookHeaderElem.addChildElement(isbn);
            isbnElem.addTextNode("9-999-99999-9");

			Debug.println("stage 4");
			SOAPFactory soapFactory = SOAPFactory.newInstance();
			Name edition = soapFactory.createName("edition", "b",
						  "http://saaj.sample/book");
			SOAPElement editionElem = bookHeaderElem.addChildElement(edition);
			editionElem.addTextNode("2");

            // Get the soap SOAP Body from the message
			Debug.println("stage 5");
            SOAPBody body = msg.getSOAPBody();

            StringBuffer urlSB=new StringBuffer("http://");
            urlSB.append(req.getServerName());
            urlSB.append( ":" ).append( req.getServerPort() );
		    urlSB.append( req.getContextPath() );
            String reqBase=urlSB.toString();
			Debug.println("reqBase :"+reqBase+":");

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            dbf.setNamespaceAware(true);
            DocumentBuilder docBuilder = dbf.newDocumentBuilder();
            Document bookInfo = docBuilder.parse(reqBase + "/bookinfo.xml");

			Debug.println("stage 6");
            body.addDocument(bookInfo);

			Debug.println("stage 7");
            Name author = envelope.createName("author", "a",
                                        "http://saaj.sample/author");
            SOAPBodyElement authorElem = body.addBodyElement(author);
            SOAPElement authorName = authorElem.addChildElement("name", "a",
                                        "http://saaj.sample/author");
            authorName.addTextNode("John Rhodes");

			Debug.println("stage 8");
            if(data==null) {
				Debug.println("stage 9");
                data=reqBase + "/index.html";
            }

            // Want to set an attachment from the following url.
            //Get context
			Debug.println("stage 10");
            URL url = new URL(data);

			Debug.println("stage 11");
            AttachmentPart ap = msg.createAttachmentPart(new DataHandler(url));

			Debug.println("stage 12");
            ap.setContentType("text/html");

            // Add the attachment part to the message.
			Debug.println("stage 13");
            msg.addAttachmentPart(ap);

            // Create an endpoint for the recipient of the message.
			Debug.println("stage 14");
            if(to==null) {
				Debug.println("stage 15");
                to=reqBase + "/receiver";
            }
			Debug.println("to :"+to+":");

            URL urlEndpoint = new URL(to);

            Debug.println("Sending message to URL: "+urlEndpoint);
            Debug.println("Sent message is logged in \"sent.msg\"");

            retval += " Sent message (check \"sent.msg\") and ";

			Debug.println("stage 16");
            FileOutputStream sentFile = new FileOutputStream("sent.msg");
            msg.writeTo(sentFile);
            sentFile.close();

            // Send the message to the provider using the connection.
			Debug.println("before send message");
            SOAPMessage reply = con.call(msg, urlEndpoint);
			Debug.println("survived send message");

            if (reply != null) {
				Debug.println("there was a reply");
                FileOutputStream replyFile = new FileOutputStream("reply.msg");
                reply.writeTo(replyFile);
                replyFile.close();
                Debug.println("Reply logged in \"reply.msg\"");
                retval += " received reply (check \"reply.msg\").</H4> </html>";

            } else {
                Debug.println("No reply");
                retval += " no reply was received. </H4> </html>";
            }

        } catch(Throwable e) {
            e.printStackTrace();
            logger.severe("Error in constructing or sending message "
            +e.getMessage());
            retval += " There was an error " +
            "in constructing or sending message. </H4> </html>";
        }

        try {
            OutputStream os = resp.getOutputStream();
            os.write(retval.getBytes());
            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
            logger.severe( "Error in outputting servlet response "
            + e.getMessage());
        }
		Debug.println("<<< goGet");
    }
}

