
package jvtemplate;

import java.util.*;

public class JVBody {
	private String m_strFile = null;
	private ArrayList m_subbodies = new ArrayList();

	public JVBody () {}
	public String getFile() {return m_strFile;}
	public void setFile (String strFile) {m_strFile = strFile;}

	public void addSubBody (JVSubBody subbody) {
		m_subbodies.add (subbody);
	}
	public Iterator getSubbodies() {return m_subbodies.iterator();}
	public int getSize() {return m_subbodies.size();}
}

