
/*
	JVDataAccess.java; Handles all database related tasks.

	Now uses a Session bean...
*/

package jvapp;

import jvejb2.Abcd;
import jvejb2.AbcdHome;

import java.util.*;
import javax.naming.*;
import javax.rmi.*;
import java.rmi.RemoteException;
import javax.ejb.*;

/*
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;
import javax.rmi.RemoteException;
*/

public class JVDataAccess {
	private Abcd m_bean;

	public JVDataAccess() {
		Debug.println (">>> JVDataAccess constructor");
		try {
			Context ic = new InitialContext();
			Object objref = ic.lookup("java:comp/env/ejb/SimpleAbcd");
			AbcdHome home = (AbcdHome) PortableRemoteObject.narrow(
				objref,AbcdHome.class);
			Abcd m_bean = home.create();
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

// getUserPassword; get password for a given username OR "" if user not found

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

// getUsercart; get items in cart for user index

	public JVCart getUserCart (int nUserid) {
		Debug.println(">>> getUserCart; userid "+nUserid);
		JVCart cart = null;
		try {
			ArrayList list = new ArrayList(m_bean.getUserCart (nUserid));
			cart = (JVCart) list.get(0);
		}
		catch (RemoteException rex) {
			Debug.println("remoteexception "+rex.getMessage());
		}
		catch (Exception ex) {
			Debug.println("exception "+ex.getMessage());
			ex.printStackTrace();
		}
		Debug.println("<<< getUserCart");
		return cart;
	}

// getCartItem; get a specific item from the cart

	public JVItem getCartItem (int nCartid) {
		Debug.println(">>> getCartItem; cartid "+nCartid);
		JVItem item = null;
		try {
			ArrayList list = new ArrayList(m_bean.getCartItem (nCartid));
			item = (JVItem) list.get(0);
		}
		catch (RemoteException rex) {
			Debug.println("remoteexception "+rex.getMessage());
		}
		catch (Exception ex) {
			Debug.println("exception "+ex.getMessage());
			ex.printStackTrace();
		}
		Debug.println("<<< getCartItem");
		return item;
	}

// removeCartItem; remove a specific item from the cart

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

// updateCartItem; update a specific item from the cart

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

// addCartItem; add a specific item to the cart

	public void addCartItem (int nUserid, int nItemid, int nQty) {
		Debug.println(">>> addCartItem; userid "+nUserid+" itemid "+nItemid+" qty "+nQty);
		try {
			m_bean.addCartItem (nUserid, nItemid, nQty);
		}
		catch (RemoteException rex) {
			Debug.println("remoteexception "+rex.getMessage());
		}
		catch (Exception ex) {
			Debug.println("exception "+ex.getMessage());
			ex.printStackTrace();
		}
		Debug.println("<<< addCartItem");
	}

// getCatalogNames; get names of all catalogs

	public JVCatalogNames getCatalogNames () {
		Debug.println(">>> getCatalogNames");
		JVCatalogNames catalog = new JVCatalogNames();
		try {
			ArrayList list = new ArrayList(m_bean.getCatalogNames());
			catalog = (JVCatalogNames) list.get(0);
			return catalog;
		}
		catch (RemoteException rex) {
			Debug.println("remoteexception "+rex.getMessage());
		}
		catch (Exception ex) {
			Debug.println("exception "+ex.getMessage());
			ex.printStackTrace();
		}
		Debug.println("<<< getCatalogNames");
		return catalog;
	}

// getCatalogItems; get items for a given catalog

	public JVCatalog getCatalogItems (int nCatalogId) {
		Debug.println(">>> getCatalogItems; id="+nCatalogId);
		JVCatalog catalog = new JVCatalog();
		try {
			ArrayList list = new ArrayList(m_bean.getCatalogItems (nCatalogId));
			catalog = (JVCatalog) list.get(0);
			return catalog;
		}
		catch (RemoteException rex) {
			Debug.println("remoteexception "+rex.getMessage());
		}
		catch (Exception ex) {
			Debug.println("exception "+ex.getMessage());
			ex.printStackTrace();
		}
		Debug.println("<<< getCatalogItems");
		return catalog;
	}
}

