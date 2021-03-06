package jvejb2;

import jvcommon.*;

import java.util.*;
import javax.ejb.EJBObject;
import java.rmi.RemoteException;

public interface Abcd extends EJBObject {
 
	public int getUserid (String strUser, String strPassword) throws RemoteException;
	public JVRoles getUserRoles (int nUserid) throws RemoteException;
	public JVAlerts getAlerts (int nUserid) throws RemoteException;
	public JVCollections getCollections() throws RemoteException;
	public JVCollections getCollections(int nId) throws RemoteException;
	public JVBarcodes getBarcodes (int nId) throws RemoteException;
	public JVCharacteristics getCharacteristics (int nId) throws RemoteException;

	public void addAlert (int nEventid, int nRoleid, int nAlertlevel,
				int nAlertnumber, String strMsg) throws RemoteException;

/*
	public String getUserPassword (String strUser) throws RemoteException;
	public Collection getUserCart (int nUserid) throws RemoteException;
	public void addCartItem (int nUserid, int nItemid, int nQty) throws RemoteException;
*/
}

