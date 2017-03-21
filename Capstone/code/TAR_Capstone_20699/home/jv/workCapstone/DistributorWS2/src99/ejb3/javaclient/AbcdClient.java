
import jvcommon.*;
import jvejb3.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.RemoveException;
import javax.naming.NamingException;

public class AbcdClient {

    public static void main(String[] args) {
		Abcd m_bean;

		JVBarcodes barcodes = new JVBarcodes();
		barcodes.addBarcode (
			new JVBarcode (1, 1, "Client/Company", "Client/Imageurl",
					"Client/name", "Client/ds"));
		barcodes.addBarcode (
			new JVBarcode (2, 2, "Client/Company", "Client/Imageurl",
					"Client/name", "Client/ds"));
		barcodes.addBarcode (
			new JVBarcode (3, 3, "Client/Company", "Client/Imageurl",
					"Client/name", "Client/ds"));
		barcodes.addBarcode (
			new JVBarcode (4, 4, "Client/Company", "Client/Imageurl",
					"Client/name", "Client/ds"));
		barcodes.addBarcode (
			new JVBarcode (5, 5, "Client/Company", "Client/Imageurl",
					"Client/name", "Client/ds"));

		Debug.setFile();
		try {
			Debug.println("stage 1");
			Context ic = new InitialContext();
			Debug.println("stage 2");
			Object objref = ic.lookup("java:comp/env/ejb/SimpleDistributorWS2");
			Debug.println("stage 3");
			AbcdHome home = (AbcdHome) PortableRemoteObject.narrow(
				objref,AbcdHome.class);
			Debug.println("stage 4");
			m_bean = home.create();
			Debug.println("stage 5");

			m_bean.addBarcodes (barcodes);
			Debug.println("stage 7");

			m_bean.remove();		// container can delete the bean.....
			Debug.println("stage 8");
		}
		catch (RemoteException rex) {
			Debug.println("remoteexception "+rex.getMessage());
		}
		catch (CreateException cex) {
			Debug.println("createexception "+cex.getMessage());
		}
		catch (NamingException nex) {
			Debug.println("namingexception "+nex.getMessage());
		}
		catch (RemoveException vex) {
			Debug.println("removeexception "+vex.getMessage());
		}
		catch (Exception ex) {
			Debug.println("exception "+ex.getMessage());
			ex.printStackTrace();
		}
	}
}

