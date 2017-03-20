
/*
	JVDataAccess.java; Handles all database related tasks.

	Now uses a Session bean...
*/

package jvapp;

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

public class JVDataAccess {
	private Abcd m_bean;

	public JVDataAccess() {
		Debug.println (">>> JVDataAccess constructor");
		try {
			Debug.println("stage 1");
			Context ic = new InitialContext();
			Debug.println("stage 2");
			Object objref = ic.lookup("java:comp/env/ejb/TheRetailer2Bean");
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
		Debug.println ("<<< JVDataAccess constructor");
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

// getUserid; return users.userid or -1 if user not found

	public int getUserid (String strUser, String strPassword) {
		Debug.println(">>> getUserid; user :"+strUser+": pwd :"+strPassword+":");
		int nReturn = -1;	// default to not found
		try {
			nReturn = m_bean.getUserid (strUser, strPassword);
		}
		catch (RemoteException rex) {
			Debug.println("remoteexception "+rex.getMessage());
		}
		catch (Exception ex) {
			Debug.println("exception "+ex.getMessage());
			ex.printStackTrace();
		}
		Debug.println("<<< getUserid; status "+nReturn);
		return nReturn;
	}

// getUserRoles; get roles for user index

	public JVRoles getUserRoles (int nUserid) {
		Debug.println(">>> getUserRoles; userid "+nUserid);
		JVRoles roles = null;
		try {
			roles = m_bean.getUserRoles (nUserid);
		}
		catch (RemoteException rex) {
			Debug.println("remoteexception "+rex.getMessage());
		}
		catch (Exception ex) {
			Debug.println("exception "+ex.getMessage());
			ex.printStackTrace();
		}
		Debug.println("<<< getUserRoles");
		return roles;
	}

// getAlerts; get Alerts for user index

	public JVAlerts getAlerts (int nUserid) {
		Debug.println(">>> getAlerts; userid "+nUserid);
		JVAlerts alerts = null;
		try {
			alerts = m_bean.getAlerts (nUserid);
		}
		catch (RemoteException rex) {
			Debug.println("remoteexception "+rex.getMessage());
		}
		catch (Exception ex) {
			Debug.println("exception "+ex.getMessage());
			ex.printStackTrace();
		}
		Debug.println("<<< getAlerts");
		return alerts;
	}

// getCollections; get Collections

	public JVCollections getCollections() {
		Debug.println(">>> getCollections");
		JVCollections collections = null;
		try {
			collections = m_bean.getCollections();
		}
		catch (RemoteException rex) {
			Debug.println("remoteexception "+rex.getMessage());
		}
		catch (Exception ex) {
			Debug.println("exception "+ex.getMessage());
			ex.printStackTrace();
		}
		Debug.println("<<< getCollections");
		return collections;
	}

// getCollections; get Collections

	public JVCollections getCollections(int nId) {
		Debug.println(">>> getCollections; nId "+nId);
		JVCollections collections = null;
		try {
			collections = m_bean.getCollections(nId);
		}
		catch (RemoteException rex) {
			Debug.println("remoteexception "+rex.getMessage());
		}
		catch (Exception ex) {
			Debug.println("exception "+ex.getMessage());
			ex.printStackTrace();
		}
		Debug.println("<<< getCollections");
		return collections;
	}


// getBarcodes; get Barcodes for user index

	public JVBarcodes getBarcodes (int nId) {
		Debug.println(">>> getBarcodes; collectionid "+nId);
		JVBarcodes barcodes = null;
		try {
			barcodes = m_bean.getBarcodes (nId);
		}
		catch (RemoteException rex) {
			Debug.println("remoteexception "+rex.getMessage());
		}
		catch (Exception ex) {
			Debug.println("exception "+ex.getMessage());
			ex.printStackTrace();
		}
		Debug.println("<<< getBarcodes");
		return barcodes;
	}

// getCharacteristics; get Characteristics for user index

	public JVCharacteristics getCharacteristics (int nId) {
		Debug.println(">>> getCharacteristics; itemid "+nId);
		JVCharacteristics characteristics = null;
		try {
			characteristics = m_bean.getCharacteristics (nId);
		}
		catch (RemoteException rex) {
			Debug.println("remoteexception "+rex.getMessage());
		}
		catch (Exception ex) {
			Debug.println("exception "+ex.getMessage());
			ex.printStackTrace();
		}
		Debug.println("<<< getCharacteristics");
		return characteristics;
	}

// getUserPassword; get password for a given username OR "" if user not found
/*
	public String getUserPassword (String strUser) {
		Debug.println(">>> getUserPassword; user :"+strUser+":");
		String strReturn = "";	// default to not found
		try {
			strReturn = m_bean.getUserPassword (strUser);
		}
		catch (RemoteException rex) {
			Debug.println("remoteexception "+rex.getMessage());
		}
		catch (Exception ex) {
			Debug.println("exception "+ex.getMessage());
			ex.printStackTrace();
		}
		Debug.println("<<< getUserPassword; password "+strReturn);
		return strReturn;
	}
*/

// removeCartItem; remove a specific item from the cart

/*
	public void removeCartItem (int nCartid) {
		Debug.println(">>> removeCartItem; index "+nCartid);
		try {
			m_bean.removeCartItem (nCartid);
		}
		catch (RemoteException rex) {
			Debug.println("remoteexception "+rex.getMessage());
		}
		catch (Exception ex) {
			Debug.println("exception "+ex.getMessage());
			ex.printStackTrace();
		}
		Debug.println("<<< removeCartItem");
	}
*/

// updateCartItem; update a specific item from the cart

/*
	public void updateCartItem (int nCartid, int nQty) {
		Debug.println(">>> updateCartItem; cartid "+nCartid+" qty "+nQty);
		try {
			m_bean.updateCartItem (nCartid, nQty);
		}
		catch (RemoteException rex) {
			Debug.println("remoteexception "+rex.getMessage());
		}
		catch (Exception ex) {
			Debug.println("exception "+ex.getMessage());
			ex.printStackTrace();
		}
		Debug.println("<<< updateCartItem");
	}
*/

}

