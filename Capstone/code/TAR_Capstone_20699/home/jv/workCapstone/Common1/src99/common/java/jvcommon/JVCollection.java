
package jvcommon;

import java.io.*;

public class JVCollection implements Serializable {
	int collectionid;
	String description;

	public JVCollection(int i, String a) {
		Debug.println(" i "+i+" a "+a);
		collectionid = i;
		description = a;
	}
	public int getCollectionid() {return collectionid;}
	public String getDescription() {return description;}
}

