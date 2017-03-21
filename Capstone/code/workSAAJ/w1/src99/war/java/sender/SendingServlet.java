
package sender;

import jvcommon.*;

import java.util.*;
import java.io.*;
import java.net.URL;

import javax.activation.DataHandler;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.*;

import org.w3c.dom.Document;

public class SendingServlet extends HttpServlet {

    private static String strSendTo =
			"http://localhost:8080/DistributorWS2WAR/receiver";

    ServletContext m_sc;
    private SOAPConnection m_connection;

    public void init(ServletConfig servletConfig) throws ServletException {
		super.init(servletConfig);
		m_sc = servletConfig.getServletContext();

		Debug.setFile("/tmp/SendingServlet.txt",false);
		Debug.println("---init()");

		try {
			SOAPConnectionFactory scf = SOAPConnectionFactory.newInstance();
			m_connection = scf.createConnection();
		} catch(Exception ex) {
			Debug.println("Unable to open a SOAPConnection"+ex.getMessage());
		}
		Debug.println("<<< init()");
	}

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException {

		JVBarcodes barcodes = new JVBarcodes();
		JVBarcode barcode;

		barcodes.addBarcode (
			new JVBarcode (1, 1, "SAAJClient/Company", 
					"http://localhost:8080/Capstone/small/10.jpg",
					"SAAJClient/name", "SAAJClient/ds"));
		barcodes.addBarcode (
			new JVBarcode (2, 2, "SAAJClient/Company", 
					"http://localhost:8080/Capstone/small/11.jpg",
					"SAAJClient/name", "SAAJClient/ds"));
		barcodes.addBarcode (
			new JVBarcode (3, 3, "SAAJClient/Company", 
					"http://localhost:8080/Capstone/small/12.jpg",
					"SAAJClient/name", "SAAJClient/ds"));
		barcodes.addBarcode (
			new JVBarcode (4, 4, "SAAJClient/Company", 
					"http://localhost:8080/Capstone/small/13.jpg",
					"SAAJClient/name", "SAAJClient/ds"));
		barcodes.addBarcode (
			new JVBarcode (5, 5, "SAAJClient/Company", 
					"http://localhost:8080/Capstone/small/14.jpg",
					"SAAJClient/name", "SAAJClient/ds"));
/*
<Collection>
<Barcode>
<Barcodeid>1</Barcodeid>
<Itemid>1</Itemid>
<Company>Company_1</Company>
<Imageurl>http://jv2:8080/Capstone/small/1.jpg</Imageurl>
<Name>name_1</Name>
<Description>description_1</Description>
</Barcode>
*/
		Debug.println(">>> goGet");
		try {
			Debug.println("stage 1");
            MessageFactory messageFactory = MessageFactory.newInstance();
            SOAPMessage soapMessage = messageFactory.createMessage();
            SOAPPart soapPart = soapMessage.getSOAPPart();
            SOAPEnvelope soapEnvelope = soapPart.getEnvelope();
            SOAPBody soapBody = soapMessage.getSOAPBody();
            SOAPHeader soapHeader = soapMessage.getSOAPHeader();

            Name bodyName = soapEnvelope.createName("Collection", "co",
					"http://saaj.jv/Collection");
			SOAPBodyElement collectionElem = soapBody.addBodyElement(bodyName);

			URL imageURL;
			DataHandler dataHandler;
			AttachmentPart attachmentPart;

			int nCounter = 0;
			Iterator iter = barcodes.getBarcodes();
			while (iter.hasNext()) {
				nCounter++;
				barcode = (JVBarcode) iter.next();
				Debug.println("Barcodeid "+barcode.getBarcodeid());

            	Name barcodeName = soapEnvelope.createName("Barcode");
				SOAPElement barcodeElem = collectionElem.addChildElement(barcodeName);

	            Name barcodeidName = soapEnvelope.createName("Barcodeid");
				SOAPElement barcodeidElem = barcodeElem.addChildElement(barcodeidName);
				barcodeidElem.addTextNode(
						Integer.toString(barcode.getBarcodeid()));

	            Name itemidName = soapEnvelope.createName("Itemid");
				SOAPElement itemidElem = barcodeElem.addChildElement(itemidName);
				itemidElem.addTextNode(
						Integer.toString(barcode.getItemid()));

	            Name companyName = soapEnvelope.createName("Company");
				SOAPElement companyElem = barcodeElem.addChildElement(companyName);
				companyElem.addTextNode(barcode.getCompany());

	            Name imageurlName = soapEnvelope.createName("Imageurl");
				SOAPElement imageurlElem = barcodeElem.addChildElement(imageurlName);
				imageurlElem.addTextNode(barcode.getImageurl());

	            Name nameName = soapEnvelope.createName("Name");
				SOAPElement nameElem = barcodeElem.addChildElement(nameName);
				nameElem.addTextNode(barcode.getName());

	            Name dsName = soapEnvelope.createName("Description");
				SOAPElement dsElem = barcodeElem.addChildElement(dsName);
				dsElem.addTextNode(barcode.getDs());

	            Name imageidName = soapEnvelope.createName("Imageid");
				SOAPElement imageidElem = barcodeElem.addChildElement(imageidName);
				imageidElem.addTextNode(Integer.toString(nCounter));

				imageURL = new URL (barcode.getImageurl());
				dataHandler = new DataHandler (imageURL);
				attachmentPart = soapMessage.createAttachmentPart (dataHandler);
				attachmentPart.setContentId(Integer.toString(nCounter));
				soapMessage.addAttachmentPart (attachmentPart);
			}

			Debug.println("strSendTo :"+strSendTo+":");
            URL urlEndpoint = new URL(strSendTo);
            Debug.println("Sending message to URLendPoint: "+urlEndpoint);

            SOAPMessage reply = m_connection.call(soapMessage, urlEndpoint);
			Debug.println("survived send message");

            if (reply != null)
				Debug.println("there was a reply");
            else
                Debug.println("No reply");

        } catch(Throwable ex) {
			Debug.println("Exception: "+ex.getMessage());
            ex.printStackTrace();
        }
		Debug.println("<<< goGet");
    }
}

