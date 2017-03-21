
package jvapp;

import java.util.*;

public class JVCatalogNames {

	private ArrayList list = new ArrayList();

	public JVCatalogNames() {}

	public void addItem(JVCatalogName name) {list.add(name);}
	public Iterator getItems() {return list.iterator();}
}

