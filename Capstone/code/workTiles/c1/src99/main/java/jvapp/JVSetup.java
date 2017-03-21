
package jvapp;

public class JVSetup {
	private static String smtphost;
	private static String messagefrom;
	private static String fromuser;
	private static String frompwd;
	private static String driver;
	private static String url;
	private static String user;
	private static String pwd;
	private static boolean error = true;

	private static JVSetup jvsetup = null;

	private JVSetup() {}

	public static JVSetup getInstance() {
		if (null == jvsetup) jvsetup = new JVSetup();
		return jvsetup;
	}

	public void setSmtphost (String str) {smtphost = str;}
	public void setMessagefrom (String str) {messagefrom = str;}
	public void setFromuser (String str) {fromuser = str;}
	public void setFrompwd (String str) {frompwd = str;}
	public void setDriver (String str) {driver = str;}
	public void setUrl (String str) {url = str;}
	public void setUser (String str) {user = str;}
	public void setPwd (String str) {pwd = str;}
	public void setError (boolean bool) {error = bool;}

	public String getSmtphost() {return smtphost;}
	public String getMessagefrom() {return messagefrom;}
	public String getFromuser() {return fromuser;}
	public String getFrompwd() {return frompwd;}
	public String getDriver() {return driver;}
	public String getUrl() {return url;}
	public String getUser() {return user;}
	public String getPwd() {return pwd;}
	public boolean getError() {return error;}
}

