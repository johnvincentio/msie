
package jvbean;

public class JVItem {
	int cartid;
	int itemid;
	String catalog;
	String sds;
	String lds;
	int quantity;
	double price;

	public JVItem(int i, int j, String c, String s, String d, int n, double p){
		jvutils.Debug.println(" i "+i+" j "+j+" c "+c+" s "+s+" d "+d+" n "+n+" p "+p);
		cartid = i;
		itemid = j;
		catalog = c;
		sds = s;
		lds = d;
		quantity = n;
		price = p;
	}
	public int getCartid() {return cartid;}
	public int getItemid() {return itemid;}
	public String getCatalog() {return catalog;}
	public String getSds() {return sds;}
	public String getLds() {return lds;}
	public int getQuantity() {return quantity;}
	public double getPrice() {return price;}

	public void setQuantity (int newItems) {quantity = newItems;}
}

