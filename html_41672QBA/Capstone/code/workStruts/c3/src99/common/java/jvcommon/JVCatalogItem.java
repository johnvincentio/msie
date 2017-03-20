
package jvcommon;

import java.io.*;

public class JVCatalogItem implements Serializable{
	int itemid;
	int catalogid;
	String sds;
	String lds;
	double price;

	public JVCatalogItem(int i, int c, String s, String d, double p){
		Debug.println(" i "+i+" c "+c+" s "+s+" d "+d+" p "+p);
		itemid = i;
		catalogid = c;
		sds = s;
		lds = d;
		price = p;
	}
	public int getItemid() {return itemid;}
	public int getCatalogid() {return catalogid;}
	public String getSds() {return sds;}
	public String getLds() {return lds;}
	public double getPrice() {return price;}
}

