package jvapp;

import java.util.*;

public class JVCatalog {

	private ArrayList list = new ArrayList();

	public JVCatalog() {}

	public void addItem(JVCatalogItem i){list.add(i);}
	public Iterator getItems() {return list.iterator();}
}

