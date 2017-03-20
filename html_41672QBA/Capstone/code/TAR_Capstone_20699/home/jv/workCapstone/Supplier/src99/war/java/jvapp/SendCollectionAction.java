
package jvapp;

import jvcommon.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionServlet;

public final class SendCollectionAction extends Action {

    public ActionForward perform(ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response)
        throws IOException, ServletException {

		Debug.println (">>> SendCollectionAction:perform");
		JVParameters params = new JVParameters(request.getParameterMap());
		params.showParams ("SendCollectionAction");
		JVAttributes attribs = new JVAttributes(request.getAttributeNames());
		attribs.showParams ("SendCollectionAction");

		HttpSession session = request.getSession();
		UserInfo userinfo = 
			(UserInfo) session.getAttribute(Constants.USER_INFO_KEY);
		if (userinfo == null) {
			Debug.println("could not find UserInfo");
			ActionErrors errors = new ActionErrors();
			errors.add(ActionErrors.GLOBAL_ERROR,
				new ActionError("general.error.no.userinfo"));
			saveErrors(request,errors);
        	return (mapping.findForward(Constants.FAILURE));
		}

		int nCollectionid = params.getKeyValue("id",0);
		Debug.println("nCollectionid :"+nCollectionid+":");

		String strAction = params.getKeyValue("action","");
		Debug.println("strAction :"+strAction+":");

		Debug.println("get barcodes for collection=" + nCollectionid);
		JVBarcodes barcodes = userinfo.getBarcodes(nCollectionid);
		Debug.println("got barcodes");

		if (strAction.equals("Send1")) { //Send with SAAJ; one record/send 
			Debug.println("in send 1");	// just iterate through barcodes !!!
		}
		else if (strAction.equals("Send2")) { //Send with SAAJ; all records at once 
			Debug.println("in send 2");
			JVSendMessageSAAJ jvSaaj = new JVSendMessageSAAJ();
			Debug.println("create connection");
			if (jvSaaj.createConnection()) {

				jvSaaj.sendMessage (barcodes);	// overload - allow barcode (above)
				Debug.println("sent the SAAJ");

				jvSaaj.removeConnection();
				Debug.println("removeConnection done");
			}
			else
				Debug.println ("Send to WS as SAAJ failed");
			Debug.println("Send to WS as SAAJ complete");
		}
		else if (strAction.equals("Send3")) { //Send to MDB as XML 

			Debug.println("in send 3; send to MDB as XML");
			JVSendMessage jvMsg = new JVSendMessage();
			Debug.println("create connection");
			if (jvMsg.createConnection()) {

				Debug.println("make XML for collection=" + nCollectionid);
				JVxml jvxml = new JVxml();
				String strXML = jvxml.makeXMLCollection (nCollectionid, barcodes);
				Debug.println("XML: \n"+strXML);

				jvMsg.sendMessage (strXML);	// can send multiple messages
				Debug.println("sent the XML");

				jvMsg.removeConnection();
				Debug.println("removeConnection done");
			}
			else
				Debug.println ("Send to MDB as XML failed");
			Debug.println("Send to MDB as XML complete");
		}
		else if (strAction.equals("Send4")) { //Send to MDB as ObjectMessage 
			Debug.println("in send 4");
		}
		else if (strAction.equals("Send5")) { //Send to JAX-RPC WebService as XML 

			Debug.println("in send 5; send XML JAX-RPC Web Service");
			JVSendMessageJaxrpcWS jvJaxrpcMsg = new JVSendMessageJaxrpcWS();
			Debug.println("create connection");
			if (jvJaxrpcMsg.createConnection()) {

				Debug.println("make XML for collection=" + nCollectionid);
				JVxml jvxml = new JVxml();
				String strXML = jvxml.makeXMLCollection (nCollectionid, barcodes);
				Debug.println("XML: \n"+strXML);

				jvJaxrpcMsg.sendMessage (strXML);	// can send multiple messages
				Debug.println("sent the XML");
//				jvJaxrpcMsg.sendMessage ("JUNK");
//				Debug.println("sent JUNK");

				jvJaxrpcMsg.removeConnection();
				Debug.println("removeConnection done");
				jvJaxrpcMsg = null;
			}
			else
				Debug.println ("JAX-RPC messaging failed");
			Debug.println("JAX-RPC messaging is complete");
		}
		else {
			Debug.println("could not find UserInfo");
			ActionErrors errors = new ActionErrors();
			errors.add(ActionErrors.GLOBAL_ERROR,
				new ActionError("general.error.no.userinfo"));
			saveErrors(request,errors);
        	return (mapping.findForward(Constants.FAILURE));
		}
		Debug.println ("<<< SendCollectionAction:perform");
        return (mapping.findForward(Constants.SUCCESS));
    }
}

