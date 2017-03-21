
package jvapp;

import jvcommon.*;

import javax.servlet.http.*;

public class UserInfo {
	private JVDataAccess m_database;
	private JVRoles m_roles;
	private int m_nUserid;			// table users.userid
	private int m_nCollectionid;
	private int m_nBarcodeid;
	private int m_nItemid;
	private String m_strClientUsername;

	public UserInfo () {
		Debug.println(">>> UserInfo (constructor)");
		m_database = new JVDataAccess ();
		m_nUserid = -1;		// not logged in
		m_nCollectionid = -1;	// no collection selected
		m_nBarcodeid = -1;	// no barcode selected
		m_nItemid = -1;		// no item selected
		Debug.println("<<< UserInfo (constructor)");
	}
	public boolean isSubsystemAccessible (int nSubsystem) {
		return m_roles.isSubsystemAccessible(nSubsystem);
	}
	public String getLogonName() {return m_strClientUsername;}
	public JVDataAccess getDatabase() {return m_database;}
	public int getCollectionid() {return m_nCollectionid;}
	public int getBarcodeid() {return m_nBarcodeid;}
	public int getItemid() {return m_nItemid;}
	public void setCollectionid (int i) {m_nCollectionid = i;}
	public void setBarcodeid (int i) {m_nBarcodeid = i;}
	public void setItemid (int i) {m_nItemid = i;}

	public void remove() {
		Debug.println(">>> remove");
		if (m_database != null) {
			m_database.remove();
		}
		Debug.println("<<< remove");
	}
	public boolean doCheckLogin(String strUser, String strPassword) {
		Debug.println(">>> doCheckLogin");
		int nReturn = m_database.getUserid(strUser,strPassword);
		if (nReturn < 0) return false;
		m_nUserid = nReturn;	// remember this user
		m_strClientUsername = strUser;
		m_roles = m_database.getUserRoles (m_nUserid);	// get user roles
		Debug.println("<<< doCheckLogin");
		return true;
	}
	public JVAlerts getAlerts() {return m_database.getAlerts(m_nUserid);}
	public JVCollections getCollections() {return m_database.getCollections();}
	public JVCollections getCollections(int nId) {
			return m_database.getCollections(nId);}
	public JVBarcodes getBarcodes(int nId) {return m_database.getBarcodes(nId);}
	public JVCharacteristics getCharacteristics(int nId) {
		return m_database.getCharacteristics(nId);}

/*
	public void doAddCartItem(int nItemid, int nQty) {
		Debug.println(">>> doAddCartItem");
		Debug.println("nItemid :"+nItemid+":");
		Debug.println("nQty :"+nQty+":");
		Debug.println("UserID :"+m_nUserid+":");
		if ((nItemid > -1) && (nQty > 0))
			m_database.addCartItem(m_nUserid, nItemid, nQty);
		Debug.println("<<< doAddCartItem");
	}
*/
}

