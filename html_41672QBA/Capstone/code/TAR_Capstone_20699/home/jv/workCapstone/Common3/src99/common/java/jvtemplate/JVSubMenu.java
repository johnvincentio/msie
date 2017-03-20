
package jvtemplate;

import java.util.*;

public class JVSubMenu {
	private String m_strName;
	private ArrayList m_pairs = new ArrayList();

	public JVSubMenu (String strName) {m_strName = strName;}
	public String getName() {return m_strName;}
	public void addPair (JVPair pair) {m_pairs.add (pair);}
	public Iterator getPairs() {return m_pairs.iterator();}
	public int getSize() {return m_pairs.size();}
}

