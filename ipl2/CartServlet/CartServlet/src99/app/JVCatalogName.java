
package jvbean;

public class JVCatalogName {
	int catalogid;
	String ds;

	public JVCatalogName(int i, String c){
		jvutils.Debug.println(" i "+i+" c "+c+":");
		catalogid = i;
		ds = c;
	}
	public int getCatalogid() {return catalogid;}
	public String getDs() {return ds;}
}

