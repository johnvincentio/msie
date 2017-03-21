
package jvcommon;

import java.io.*;

public class JVBarcode implements Serializable {
	int barcodeid;
	int itemid;
	String company;
	String imageurl;
	String name;
	String ds;

	public JVBarcode(int i, int j, String a, String b, String c, String d) {
		barcodeid = i;
		itemid = j;
		company = a;
		imageurl = b;
		name = c;
		ds = d;
	}
	public int getBarcodeid() {return barcodeid;}
	public int getItemid() {return itemid;}
	public String getCompany() {return company;}
	public String getImageurl() {return imageurl;}
	public String getName() {return name;}
	public String getDs() {return ds;}
}

