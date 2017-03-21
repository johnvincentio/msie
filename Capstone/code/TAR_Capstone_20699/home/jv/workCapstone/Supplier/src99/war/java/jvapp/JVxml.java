
package jvapp;

import jvcommon.*;

import java.io.*;

import java.util.*;
import java.text.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;

public class JVxml {
	public JVxml() {}

	public String makeXMLCollection (int nCollection, JVBarcodes barcodes) {
		String strXML = null;
		JVBarcode barcode;
		Element topElem, barcodeElem, elem;
		DocumentBuilderFactory docBuilderFactory;
		DocumentBuilder docBuilder;
		Document doc;

		Debug.println (">>> makeXMLCollection; nCollection "+nCollection);
		try {
			docBuilderFactory = DocumentBuilderFactory.newInstance();
//			docBuilderFactory.setNamespaceAware(true);
			docBuilderFactory.setNamespaceAware(false);
			docBuilder = docBuilderFactory.newDocumentBuilder();
			doc = docBuilder.newDocument();          

			topElem = doc.createElement("Collection");
/*
		topElem.setAttribute("xmlns:xsi", 
				"http://www.w3.org/2001/XMLSchema-instance");
		topElem.setAttribute("xsi:schemaLocation",
				"http://java.sun.com/blueprints/ns/invoice " + 
				"http://java.sun.com/blueprints/schemas/invoice-lodging.xsd");
		topElem.setAttribute("xmlns", 
				"http://java.sun.com/blueprints/ns/invoice");
*/
			doc.appendChild(topElem);

			Iterator iter = barcodes.getBarcodes();
			while (iter.hasNext()) {
				barcode = (JVBarcode) iter.next();
				Debug.println("Barcodeid "+barcode.getBarcodeid());

				barcodeElem = doc.createElement("Barcode");
				topElem.appendChild(barcodeElem);

				elem = doc.createElement("Barcodeid");
				elem.appendChild(doc.createTextNode(
						Integer.toString(barcode.getBarcodeid())));
				barcodeElem.appendChild(elem);

				elem = doc.createElement("Itemid");
				elem.appendChild(doc.createTextNode(
						Integer.toString(barcode.getItemid())));
				barcodeElem.appendChild(elem);

				elem = doc.createElement("Company");
				elem.appendChild(doc.createTextNode(barcode.getCompany()));
				barcodeElem.appendChild(elem);

				elem = doc.createElement("Imageurl");
				elem.appendChild(doc.createTextNode(barcode.getImageurl()));
				barcodeElem.appendChild(elem);

				elem = doc.createElement("Name");
				elem.appendChild(doc.createTextNode(barcode.getName()));
				barcodeElem.appendChild(elem);

				elem = doc.createElement("Description");
				elem.appendChild(doc.createTextNode(barcode.getDs()));
				barcodeElem.appendChild(elem);
			}

			ByteArrayOutputStream baStream = new ByteArrayOutputStream();
			Result res = new StreamResult(baStream);
			TransformerFactory transFactory = TransformerFactory.newInstance();
			Transformer transformer = transFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.METHOD, "xml");          
			transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
//			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty(OutputKeys.INDENT, "no");
			transformer.transform(new DOMSource(doc), res);
			strXML = baStream.toString("UTF-8");  
		}
// some day; throw new exception here.....
		catch (ParserConfigurationException pcex) {
			Debug.println("ParserConfigurationException "+pcex.getMessage());
		}
		catch (TransformerConfigurationException tcex) {
			Debug.println("TransformerConfigurationException "+tcex.getMessage());
		}
		catch (TransformerException tex) {
			Debug.println("TransformerException "+tex.getMessage());
		}
		catch (UnsupportedEncodingException ueex) {
			Debug.println("UnsupportedEncodingException "+ueex.getMessage());
		}
		catch (Exception ex) {
			Debug.println("Exception "+ex.getMessage());
		}
		Debug.println ("<<< makeXMLCollection");
		return strXML;
	}
}

