
package jvcommon;

import java.util.*;
import java.io.*;

public class JVCart implements Serializable{

	private ArrayList list = new ArrayList();

	public JVCart() {}

	public void addItem(JVItem i) {
		Debug.println("--- addItem");
		list.add(i);
	}
	public Iterator getItems() {return list.iterator();}

	public double getComputeTotal() {
		Iterator iterator = list.iterator();
		double total = 0;
		while(iterator.hasNext()) {
			JVItem item = (JVItem)iterator.next();
			total = total + item.getQuantity() * item.getPrice();
		}
		return total;
	}
}

