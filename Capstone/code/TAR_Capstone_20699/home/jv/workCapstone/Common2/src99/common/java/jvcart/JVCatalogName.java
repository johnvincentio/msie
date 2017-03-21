
package jvcart;

import java.io.*;

public class JVCatalogName implements Serializable{
	private int catalogid = 0;
	private String ds;

	public JVCatalogName(int i, String c){
		catalogid = i;
		ds = c;
	}
	public int getCatalogid() {return catalogid;}
	public String getDs() {return ds;}
	public void setCatalogid(int num) {catalogid = num;}
	public void setDs (String str) {ds = str;}
}
