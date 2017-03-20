
package jvdata;

import java.util.*;
import java.io.*;
import jvutils.Debug;

public class JVProperties {
	Properties m_props;
	public JVProperties (String strFile) {
		Debug.println("JVProperties; file:"+strFile+":");
		m_props = new Properties();
		try {
			m_props.load(new FileInputStream(strFile));
		}
		catch (FileNotFoundException ex) {
			Debug.println("--- FileNotFoundException ---:");
			Debug.println(ex.getMessage());
		}
		catch (IOException ei) {
			Debug.println("--- IOException ---:");
			Debug.println(ei.getMessage());
		}
	}
	public String getDriver() {return m_props.getProperty("Driver");}
	public String getURL() {return m_props.getProperty("Url");}
	public String getUser() {return m_props.getProperty("User");}
	public String getPassword() {return m_props.getProperty("Password");}

	public String getSmtpHost() {return m_props.getProperty("Smtphost");}
	public String getMessagefrom() {return m_props.getProperty("Messagefrom");}
	public String getFromuser() {return m_props.getProperty("Fromuser");}
	public String getFrompwd() {return m_props.getProperty("Frompwd");}
}

