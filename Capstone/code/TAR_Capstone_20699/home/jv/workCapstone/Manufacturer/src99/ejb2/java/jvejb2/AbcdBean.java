
package jvejb2;

import jvcommon.*;

//import java.util.*;
import java.rmi.RemoteException; 
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

public class AbcdBean implements SessionBean {
 
	private SessionContext m_context;
	private JVDatabase m_database;

	public AbcdBean() {}		// do nothing

    public void ejbCreate() {
		Debug.setFile("/tmp/manufacturer_ejb2.txt",true);
		Debug.println(">>> ejbCreate");
		createDatabaseAccess();
		Debug.println("<<< ejbCreate");
	}

    public void ejbRemove() {
		Debug.println(">>> ejbRemove");
		m_database.removeDataSource();
		m_database = null;
		Debug.println("<<< ejbRemove");
	} 

    public void ejbActivate() {
		Debug.println(">>> ejbActivate");
		createDatabaseAccess();
		Debug.println("<<< ejbActivate");
	} 

    public void ejbPassivate() {
		Debug.println(">>> ejbPassivate");
		removeDatabaseAccess();
		Debug.println("<<< ejbPassivate");
	} 

    public void setSessionContext(SessionContext sc) {
//		System.out.println("(ejb2) in setSessionContext");
		m_context = sc;
	}

	private void createDatabaseAccess() {
		Debug.println(">>> createDatabaseAccess");
		m_database = new JVDatabase();
		m_database.createDataSource();
		Debug.println("<<< createDatabaseAccess");
	}

	private void removeDatabaseAccess() {
		Debug.println(">>> removeDatabaseAccess");
		m_database.removeDataSource();
		m_database = null;
		Debug.println("<<< removeDatabaseAccess");
	}

	public int getUserid (String strUser, String strPassword) {
		return m_database.getUserid (strUser, strPassword);
	}

	public String getUserPassword (String strUser) {
		return m_database.getUserPassword (strUser);
	}
/*
		this also works...clever way to return lots of stuff

	public Collection getUserCart (int nUserid) {
		Collection collection = new ArrayList();
		JVCart cart = m_database.getUserCart (nUserid);
		collection.add(cart);
		return collection;

	}
*/
	public JVCart getUserCart (int nUserid) {
		return m_database.getUserCart (nUserid);

	}
	public JVItem getCartItem (int nCartid) {
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
	public JVCatalogNames getCatalogNames () {
		return m_database.getCatalogNames ();
	}
	public JVCatalog getCatalogItems (int nCatalogId) {
		return m_database.getCatalogItems (nCatalogId);
	}
}

