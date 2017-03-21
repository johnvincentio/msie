
package jvcommon;

import java.util.*;
import java.io.*;

public class JVCharacteristics implements Serializable {
	private int itemid;
	private String name;
	private String description;

	private ArrayList m_list = new ArrayList();

	public JVCharacteristics(int i, String a, String b) {
		itemid = i;
		name = a;
		description = b;
	}
	public int getItemid() {return itemid;}
	public String getName() {return name;}
	public String getDescription() {return description;}

	public void addCharacteristic(JVCharacteristic i) {
		Debug.println("--- addCharacteristic");
		m_list.add(i);
	}
	public Iterator getCharacteristics() {return m_list.iterator();}
}

