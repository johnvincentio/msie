
package jvcommon;

import java.io.*;

public class JVRole implements Serializable{
	String name;
	int roleid;
	int value;

	public JVRole(String a, int i, int j) {
		Debug.println(" a "+a+" i "+i+" j "+j);
		name = a;
		roleid = i;
		value = j;
	}
	public String getName() {return name;}
	public int getRoleid() {return roleid;}
	public int getValue() {return value;}
}

