
package jvcommon;

import java.util.*;
import java.io.*;

public class JVAlerts implements Serializable {

	private ArrayList m_list = new ArrayList();

	public JVAlerts() {}

	public void addAlert(JVAlert i) {
		Debug.println("--- addAlert");
		m_list.add(i);
	}
	public Iterator getAlerts() {return m_list.iterator();}
}

