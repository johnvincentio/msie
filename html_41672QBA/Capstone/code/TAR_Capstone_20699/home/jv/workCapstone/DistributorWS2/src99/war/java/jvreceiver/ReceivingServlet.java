
package jvreceiver;

import jvcommon.*;

import java.util.Iterator;

import javax.xml.soap.*;

public class ReceivingServlet extends SAAJServlet {

	public SOAPMessage onMessage(SOAPMessage soapMessage) {
		AttachmentPart attachmentPart;
		SOAPBodyElement bodyElement1;
		SOAPElement elem1, elem2;

		JVDataAccess m_dataAccess;
		JVBarcodes barcodes = new JVBarcodes();
		String strNodeName, strNodeValue;
		int nBarcodeid, nItemid;
		String strCompany, strImageurl, strName, strDs;

		Debug.println(">>> onMessage");
		m_dataAccess = new JVDataAccess ();
		try {
			Debug.println("stage 1");
			System.out.println("Here's the message: "); // Yuk...
			soapMessage.writeTo(System.out);	// but OK for now

			SOAPHeader soapHeader = soapMessage.getSOAPHeader();
			SOAPBody soapBody = soapMessage.getSOAPBody();

			Debug.println("stage 2");
			Iterator bodyIter1 = soapBody.getChildElements();
			Debug.println("stage 3");
			bodyElement1 = (SOAPBodyElement) bodyIter1.next();
			Debug.println("stage 4");
			Iterator bodyIter2 = bodyElement1.getChildElements();

			while (bodyIter2.hasNext()) {
				Debug.println("stage 5");
				elem1 = (SOAPElement) bodyIter2.next();
				strNodeName = elem1.getElementName().getLocalName();
				Debug.println("strNodeName "+strNodeName);
				if (! strNodeName.equals("Barcode")) break;

				Debug.println("stage 5");
				Iterator bodyIter3 = elem1.getChildElements();

				nBarcodeid = nItemid = -1;
				strCompany = strImageurl = strName = strDs = "";
				while (bodyIter3.hasNext()) {
					Debug.println("stage 6");
					elem2 = (SOAPElement) bodyIter3.next();
					strNodeName = elem2.getElementName().getLocalName();
					strNodeValue = elem2.getValue();
					Debug.println("strNodeName "+strNodeName);
					Debug.println("strNodeValue "+strNodeValue);
					if (strNodeName.equals("Barcodeid"))
						nBarcodeid = (new Integer(strNodeValue).intValue());
					else if (strNodeName.equals("Itemid"))
						nItemid = (new Integer(strNodeValue).intValue());
					else if (strNodeName.equals("Company"))
						strCompany = strNodeValue;
					else if (strNodeName.equals("Imageurl"))
						strImageurl = strNodeValue;
					else if (strNodeName.equals("Name"))
						strName = strNodeValue;
					else if (strNodeName.equals("Description"))
						strDs = strNodeValue;
					else if (strNodeName.equals("Imageid"))
						;
					else
						throw new Exception ("unknown node name "+strNodeName);
				}
				barcodes.addBarcode (
					new JVBarcode (nBarcodeid, nItemid, strCompany, strImageurl,
							strName, strDs));
			}
			m_dataAccess.addBarcodes (barcodes);

//	get attachments - do nothing with them for now...

			Debug.println("stage 10");
			Iterator iter = soapMessage.getAttachments();
			Debug.println("stage 11");
			while (iter.hasNext()) {
				Debug.println("stage 12");
				attachmentPart = (AttachmentPart) iter.next();
				Debug.println("stage 13");
				String id = attachmentPart.getContentId();
				String type = attachmentPart.getContentType();
				Debug.println("Attachment; Id "+id+" type "+type);
			}
			Debug.println("stage 20");

// make a response....

			SOAPMessage msg = msgFactory.createMessage();
			SOAPEnvelope env = msg.getSOAPPart().getEnvelope();
			env.getBody()
				.addChildElement (env.createName ("Answer"))
				.addTextNode ("Silly answer");
			return msg;
		}
		catch(Exception ex) {
			Debug.println("Exception; "+ex.getMessage());
            return null;
        }
    }
}

