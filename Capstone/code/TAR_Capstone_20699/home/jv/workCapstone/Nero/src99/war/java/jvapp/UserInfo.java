
package jvapp;

import jvdebug.*;
import jvcart.*;

import javax.servlet.http.*;

public class UserInfo {
	private SendMail m_sendMail;
	private JVDataAccess m_database;
	private int m_nUserid;			// table users.userid
	private String m_strClientUsername;
	private String m_strClientPassword;

	public UserInfo (String smtphost, String messagefrom, String fromuser,
					String frompwd) {
		Debug.println(">>> UserInfo (constructor)");
		m_sendMail = new SendMail (smtphost, "", messagefrom,
									fromuser, frompwd);
		m_database = new JVDataAccess ();
		m_nUserid = -1;		// not logged in
		Debug.println("<<< UserInfo (constructor)");
	}
	public String getUrl() {return "something silly";}		// useful for debugging
	public String getLogonName() {return m_strClientUsername;}
	public JVDataAccess getDatabase() {return m_database;}

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
		m_strClientPassword = strPassword;
		Debug.println("<<< doCheckLogin");
		return true;
	}
	public JVCatalogNames getCatalogNames() {return m_database.getCatalogNames();}
	public JVCatalog getCatalog (int nItemid) {
		return m_database.getCatalogItems(nItemid);
	}
	public void doAddCartItem(int nItemid, int nQty) {
		Debug.println(">>> doAddCartItem");
		Debug.println("nItemid :"+nItemid+":");
		Debug.println("nQty :"+nQty+":");
		Debug.println("UserID :"+m_nUserid+":");
		if ((nItemid > -1) && (nQty > 0))
			m_database.addCartItem(m_nUserid, nItemid, nQty);
		Debug.println("<<< doAddCartItem");
	}

	public JVCart doCart() {
		Debug.println(">>> doCart");
		JVCart cart = null;
		if (m_nUserid > -1)
			cart = m_database.getUserCart(m_nUserid);	// needs users.userid
		Debug.println("<<< doCart");
		return cart;
	}
}

