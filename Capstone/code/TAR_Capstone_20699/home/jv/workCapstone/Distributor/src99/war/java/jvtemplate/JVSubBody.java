
package jvtemplate;

import java.util.*;

public class JVSubBody {
	private ArrayList m_columns = new ArrayList();

	public JVSubBody () {}

	public void addColumn (JVColumn column) {m_columns.add (column);}
	public Iterator getColumns() {return m_columns.iterator();}
	public int getSize() {return m_columns.size();}
}

