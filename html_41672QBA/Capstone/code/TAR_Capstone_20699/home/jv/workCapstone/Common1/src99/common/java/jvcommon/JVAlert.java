
package jvcommon;

import java.io.*;

public class JVAlert implements Serializable {
	int alertid;
	int eventid;
	int roleid;
	int alertlevel;
	int alertnumber;
	String description;

	public JVAlert(int i, int j, int k, int m, int n, String a) {
		Debug.println(" i "+i+" j "+j);
		alertid = i;
		eventid = j;
		roleid = k;
		alertlevel = m;
		alertnumber = n;
		description = a;
	}
	public int getAlertid() {return alertid;}
	public int getEventid() {return eventid;}
	public int getRoleid() {return roleid;}
	public int getAlertlevel() {return alertlevel;}
	public int getAlertnumber() {return alertnumber;}
	public String getDescription() {return description;}
}

