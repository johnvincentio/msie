
package jvapp;

import jvdebug.*;

public class JVTabsItems {
	int index;
	String tabname;
	String href;
	String body;
	String color;

	public JVTabsItems(int i, String a, String b, String c, String d){
		Debug.println(" i "+i+" a "+a+" b "+b+" c "+c+" d "+d);
		index = i;
		tabname = a;
		href = b;
		body = c;
		color = d;
	}
	public int getIndex() {return index;}
	public String getTabname() {return tabname;}
	public String getHref() {return href;}
	public String getBody() {return body;}
	public String getColor() {return color;}
}

