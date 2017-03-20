
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
		Debug.setFile("/tmp/retailer_war.txt",true);
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
	public JVRoles getUserRoles (int nUserid) {
		return m_database.getUserRoles (nUserid);
	}
	public JVAlerts getAlerts (int nUserid) {
		return m_database.getAlerts (nUserid);
	}
	public JVCollections getCollections() {
		return m_database.getCollections();
	}
	public JVCollections getCollections(int nId) {
		return m_database.getCollections(nId);
	}
	public JVBarcodes getBarcodes (int nId) {
		return m_database.getBarcodes (nId);
	}
	public JVCharacteristics getCharacteristics (int nId) {
		return m_database.getCharacteristics (nId);
	}
	public void doXML (String strMsg) {
		Debug.println("--- doXML; msg :"+strMsg+":");
	}
}

