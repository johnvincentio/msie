
package jvcommon;

import java.util.*;
import java.io.*;

public class JVCatalogNames implements Serializable{

	private ArrayList list = new ArrayList();

	public JVCatalogNames() {}

	public void addItem(JVCatalogName name) {list.add(name);}
	public Iterator getItems() {return list.iterator();}
}

