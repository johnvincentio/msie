
package jvapp;

import jvcommon.*;

import java.util.*;
import java.net.URL;
import javax.activation.DataHandler;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.*;
/*
import org.w3c.dom.Document;
*/

public class JVSendMessageSAAJ {

	private static String m_strSendTo =
			"http://localhost:8080/DistributorWS2WAR/receiver";
	private SOAPConnection m_connection;

	public JVSendMessageSAAJ() {}

	public boolean createConnection() {
		Debug.println(">>> createConnection");
		try {
			SOAPConnectionFactory scf = SOAPConnectionFactory.newInstance();
			m_connection = scf.createConnection();
		} catch(Exception ex) {
			Debug.println("Unable to open a SOAPConnection"+ex.getMessage());
			return false;
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
			catch (SOAPException ex) {
            	Debug.println("SOAPexception "+ex.getMessage());
			}
		}
		Debug.println("<<< removeConnection");
	}

	public void sendMessage (JVBarcodes barcodes) {
		JVBarcode barcode;

		Debug.println(">>> sendMessage");
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

			Debug.println("m_strSendTo :"+m_strSendTo+":");
            URL urlEndpoint = new URL(m_strSendTo);
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
		Debug.println("<<< sendMessage");
    }
}

