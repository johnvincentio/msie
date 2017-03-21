
package jvejb2;

import jvapp.*;

import java.util.*;
import java.rmi.RemoteException; 
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

public class AbcdBean implements SessionBean {
 
/*
	JVDatabase m_database = new JVDatabase();
*/
	JVDatabase m_database = null;

	public int getUserid (String strUser, String strPassword) {
		return m_database.getUserid (strUser, strPassword);
	}
	public String getUserPassword (String strUser) {
		return m_database.getUserPassword (strUser);
	}
	public Collection getUserCart (int nUserid) {
		return m_database.getUserCart (nUserid);
	}
	public Collection getCartItem (int nCartid) {
		return m_database.getCartItem (nCartid);
	}
	public void removeCartItem (int nCartid) {
		m_database.removeCartItem (nCartid);
	}
	public void updateCartItem (int nCartid, int nQty) {
		m_database.updateCartItem (nCartid, nQty);
	}
	public void addCartItem (int nUserid, int nItemid, int nQty) {
		m_database.addCartItem (nUserid, nItemid, nQty);
	}
	public Collection getCatalogNames () {
		return m_database.getCatalogNames ();
	}
	public Collection getCatalogItems (int nCatalogId) {
		return m_database.getCatalogItems (nCatalogId);
	}

	public AbcdBean() {System.out.println("in AbcdBean");}

    public void ejbCreate(){System.out.println("in ejbCreate");} 

    public void ejbRemove(){System.out.println("in ejbRemove");} 

    public void ejbActivate(){System.out.println("in ejbActivate");} 

    public void ejbPassivate(){System.out.println("in ejbPassivate");} 

    public void setSessionContext(SessionContext sc) 
		{System.out.println("in setSessionContext");}

}

