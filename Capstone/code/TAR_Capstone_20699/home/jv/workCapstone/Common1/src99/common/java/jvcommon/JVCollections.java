
package jvcommon;

import java.util.*;
import java.io.*;

public class JVCollections implements Serializable {

	private ArrayList m_list = new ArrayList();

	public JVCollections() {}

	public void addCollection(JVCollection i) {
		m_list.add(i);
	}
	public JVCollection getCollection (int i) {
		JVCollection collection = null;
		if (i > -1 && i < m_list.size())
			collection = (JVCollection) m_list.get(i);
		return collection;
	}
	public Iterator getCollections() {return m_list.iterator();}
}

