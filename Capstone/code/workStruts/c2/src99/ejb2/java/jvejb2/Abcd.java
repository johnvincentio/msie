package jvejb2;

import jvapp.*;

import java.util.*;
import javax.ejb.EJBObject;
import java.rmi.RemoteException;

public interface Abcd extends EJBObject {
 
	public int getUserid (String strUser, String strPassword) throws RemoteException;
	public String getUserPassword (String strUser) throws RemoteException;
	public Collection getUserCart (int nUserid) throws RemoteException;
	public Collection getCartItem (int nCartid) throws RemoteException;
	public void removeCartItem (int nCartid) throws RemoteException;
	public void updateCartItem (int nCartid, int nQty) throws RemoteException;
	public void addCartItem (int nUserid, int nItemid, int nQty) throws RemoteException;
	public Collection getCatalogNames () throws RemoteException;
	public Collection getCatalogItems (int nCatalogId) throws RemoteException;
}

