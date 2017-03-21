package jvejb2;

import jvcommon.*;

import java.util.*;
import javax.ejb.EJBObject;
import java.rmi.RemoteException;

public interface Abcd extends EJBObject {
 
	public int getUserid (String strUser, String strPassword) throws RemoteException;
	public String getUserPassword (String strUser) throws RemoteException;
/*
	public Collection getUserCart (int nUserid) throws RemoteException;
*/
	public JVCart getUserCart (int nUserid) throws RemoteException;

	public JVItem getCartItem (int nCartid) throws RemoteException;
	public void removeCartItem (int nCartid) throws RemoteException;
	public void updateCartItem (int nCartid, int nQty) throws RemoteException;
	public void addCartItem (int nUserid, int nItemid, int nQty) throws RemoteException;
	public JVCatalogNames getCatalogNames () throws RemoteException;
	public JVCatalog getCatalogItems (int nCatalogId) throws RemoteException;
}

