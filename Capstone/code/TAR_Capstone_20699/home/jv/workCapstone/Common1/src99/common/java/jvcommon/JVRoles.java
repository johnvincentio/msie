
package jvcommon;

import java.util.*;
import java.io.*;

public class JVRoles implements Serializable{

	private ArrayList m_list = new ArrayList();

	public JVRoles() {}

	public void addRole(JVRole i) {
		Debug.println("--- addRole");
		m_list.add(i);
	}
	public Iterator getRoles() {return m_list.iterator();}

	public boolean isSubsystemAccessible (int nSubsystem) {
		Debug.println(">>> isSubsystemAccessible "+nSubsystem);
		boolean bReturn = false;	// default to no access
		Iterator iterator = m_list.iterator();
		while(iterator.hasNext()) {
			JVRole role = (JVRole)iterator.next();
			if (role.getRoleid() == nSubsystem) {
				bReturn = true;
				break;
			}
		}
		Debug.println("<<< isSubsystemAccessible "+bReturn);
		return bReturn;
	}
}

