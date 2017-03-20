package jvcart;

import java.util.*;
import java.io.*;

public class JVCatalog implements Serializable{

	private ArrayList list = new ArrayList();

	public JVCatalog() {}

	public void addItem(JVCatalogItem i){list.add(i);}
	public Iterator getItems() {return list.iterator();}
}

