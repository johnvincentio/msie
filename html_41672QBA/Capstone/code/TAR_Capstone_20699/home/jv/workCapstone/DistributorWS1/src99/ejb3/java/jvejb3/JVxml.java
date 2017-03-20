
package jvejb3;

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

	public JVBarcodes fromXML(String strXML) {

		JVBarcodes barcodes = new JVBarcodes();
		InputSource source;
		DocumentBuilderFactory docBuilderFactory;
		DocumentBuilder docBuilder;
		Document doc;
		Element elem;

		Debug.println (">>> fromXML; "+strXML);
		try {
			docBuilderFactory = DocumentBuilderFactory.newInstance();
//			docBuilderFactory.setNamespaceAware(true);
			docBuilderFactory.setNamespaceAware(false);
			docBuilderFactory.setIgnoringElementContentWhitespace(true);
			docBuilder = docBuilderFactory.newDocumentBuilder();

			source = new InputSource(new StringReader(strXML));
			doc = docBuilder.parse(source);   

			doc.getDocumentElement().normalize();

			Element elem1 = doc.getDocumentElement();	// s.b. Collection
			Debug.println ("root nodeName "+elem1.getNodeName());
			if (! elem1.getNodeName().equals("Collection")) {
				throw new Exception ("Not a collection");
			}

			boolean bFirst = true;
			NodeList nodeList2, nodeList3;
			int len2, len3, i2, i3;
			Node node2, node3;

			String strNodeName, strNodeValue;
			int nBarcodeid, nItemid;
			String strCompany, strImageurl, strName, strDs;

			nodeList2 = elem1.getChildNodes();	// s.b. Barcode
			len2 = (nodeList2 != null) ? nodeList2.getLength() : 0;
			for (i2=0; i2<len2; i2++) {
				node2 = nodeList2.item(i2);
				Debug.println("has child (2) node "+node2.getNodeName());
				if (! node2.getNodeName().equals("Barcode")) {
					throw new Exception ("Not a Barcode");
				}

				nBarcodeid = nItemid = -1;
				strCompany = strImageurl = strName = strDs = "";

				nodeList3 = node2.getChildNodes();
				len3 = (nodeList3 != null) ? nodeList3.getLength() : 0;
				for (i3=0; i3<len3; i3++) {
					node3 = nodeList3.item(i3);
					strNodeName = node3.getNodeName();
					strNodeValue = node3.getFirstChild().getNodeValue();
					Debug.println("node "+strNodeName);
					Debug.println("value "+strNodeValue);
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
					else
						throw new Exception ("unknown node name "+strNodeName);
				}
				barcodes.addBarcode (
					new JVBarcode (nBarcodeid, nItemid, strCompany, strImageurl,
							strName, strDs));
			}
		}
		catch (Exception ex) {
			Debug.println("Exception "+ex.getMessage());
//
//  yuk! .... good enough for now...
//			throw new XMLException("XML Exception");
		}
		Debug.println ("<<< fromXML");
		return barcodes;
	}
}


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

/*

			String strTmp;
			int barcodeid, itemid;
			String strCompany, strImageurl, strName, strDs;

			elem = (Element)doc.getDocumentElement().getFirstChild();
			Debug.println("stage 8");
			strTmp = ((Text)(elem.getFirstChild())).getData();
			Debug.println("stage 9");
			barcodeid = (new Integer(strTmp).intValue());
			Debug.println("stage 10");
			Debug.println("barcodeid "+barcodeid);
 
			elem =  getNextSibling(elem);
			strTmp = ((Text)(elem.getFirstChild())).getData();
			itemid = (new Integer(strTmp).intValue());
			Debug.println("itemid "+itemid);

			elem =  getNextSibling(elem);
			strCompany = ((Text)(elem.getFirstChild())).getData();
			Debug.println("strCompany "+strCompany);

			elem =  getNextSibling(elem);
			strImageurl = ((Text)(elem.getFirstChild())).getData();
			Debug.println("strImageurl "+strImageurl);

			elem =  getNextSibling(elem);
			strName = ((Text)(elem.getFirstChild())).getData();
			Debug.println("strName "+strName);

			elem =  getNextSibling(elem);
			strDs = ((Text)(elem.getFirstChild())).getData();
			Debug.println("strDs "+strDs);

			barcode = new JVBarcode (barcodeid, itemid, strCompany, 
					strImageurl, strName, strDs);
		}
		catch (Exception ex) {
			Debug.println("Exception "+ex.getMessage());
		}
		Debug.println ("<<< fromXML");
		return barcode;
	}
	public static Element getNextSibling(Element elem) {
		for (Node sib=elem.getNextSibling(); sib != null; 
							sib=sib.getNextSibling()) {
			if (sib.getNodeType() == Node.ELEMENT_NODE) {
				return (Element) sib;
			}
		}
		return null;     
	}
*/

