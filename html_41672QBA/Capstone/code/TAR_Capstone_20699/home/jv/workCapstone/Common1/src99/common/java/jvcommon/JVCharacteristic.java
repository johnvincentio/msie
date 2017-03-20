
package jvcommon;

import java.io.*;

public class JVCharacteristic implements Serializable {
	String catname;
	String optname;
	String optvalue;

	public JVCharacteristic(String a, String b, String c) {
		catname = a;
		optname = b;
		optvalue = c;
	}
	public String getCatname() {return catname;}
	public String getOptname() {return optname;}
	public String getOptvalue() {return optvalue;}
}

