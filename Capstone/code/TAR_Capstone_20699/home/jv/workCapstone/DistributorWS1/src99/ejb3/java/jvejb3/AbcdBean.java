
package jvejb3;

import jvcommon.*;

import java.rmi.RemoteException; 
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

public class AbcdBean implements SessionBean {
 
	private SessionContext m_context;
	private JVDatabase m_database;

	public AbcdBean() {}		// do nothing

    public void ejbCreate() {
		Debug.setFile("/tmp/distributor_war.txt",true);
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
//		System.out.println("(ejb3) in setSessionContext");
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

	public void doXML (String strMsg) {
		Debug.println(">>> doXML");
		JVxml jvxml = new JVxml();
		JVBarcodes barcodes = jvxml.fromXML(strMsg);
		m_database.addBarcodes (barcodes);
		Debug.println("<<< doXML");
	}
}

