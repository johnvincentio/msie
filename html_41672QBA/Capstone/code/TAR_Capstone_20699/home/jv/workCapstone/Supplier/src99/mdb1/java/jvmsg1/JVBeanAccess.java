
/*
	JVBeanAccess.java; Handles all linked SB functions
*/

package jvmsg1;

import jvcommon.*;
import jvejb2.Abcd;
import jvejb2.AbcdHome;

//import java.util.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.RemoveException;
import javax.naming.NamingException;

public class JVBeanAccess {
	private Abcd m_bean;

	public JVBeanAccess () {
		Debug.println("---JVBeanAccess constructor");
	}

	public void create() {
		Debug.println(">>> create");
		try {
			Debug.println("stage 1");
			Context ic = new InitialContext();
			Debug.println("stage 2");
			Object objref = ic.lookup("java:comp/env/ejb/TheSupplierBean");
			Debug.println("stage 3");
			AbcdHome home = (AbcdHome) PortableRemoteObject.narrow(
				objref,AbcdHome.class);
			Debug.println("stage 4");
			m_bean = home.create();
			Debug.println("stage 5");
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
		catch (Exception ex) {
			Debug.println("exception "+ex.getMessage());
			ex.printStackTrace();
		}
		Debug.println ("<<< create");
	}

	public void remove() {
		Debug.println(">>> remove");
		try {
			Debug.println("stage 1");
			m_bean.remove();		// container can delete the bean.....
			Debug.println("stage 2");
		}
		catch (RemoteException rex) {
			Debug.println("remoteexception "+rex.getMessage());
		}
		catch (RemoveException vex) {
			Debug.println("removeexception "+vex.getMessage());
		}
		Debug.println("<<< remove");
	}

// addAlert; add alert record

	public void addAlert (int nEventid, int nRoleid, int nAlertlevel,
				int nAlertnumber, String strMsg) {
		Debug.println(">>> addAlert; eventid "+nEventid);
		try {
			m_bean.addAlert (nEventid, nRoleid, nAlertlevel,
						nAlertnumber, strMsg);
		}
		catch (RemoteException rex) {
			Debug.println("remoteexception "+rex.getMessage());
		}
		catch (Exception ex) {
			Debug.println("exception "+ex.getMessage());
			ex.printStackTrace();
		}
		Debug.println("<<< addAlert");
	}
}

