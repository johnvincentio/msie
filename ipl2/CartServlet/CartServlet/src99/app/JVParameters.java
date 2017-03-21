package jvservlets;

import java.util.*;
import jvutils.Debug;

public class JVParameters {
	private Map m_Map;

	public JVParameters (Map paramMap) {
		m_Map = new HashMap(paramMap);
	}
	public boolean isValidKey (String strKey) {
		Debug.println (">>> isKey :"+strKey);
		Iterator iter = m_Map.entrySet().iterator();
		Map.Entry me;
		String keyName;
		String compKey = strKey.toUpperCase();
		while (iter.hasNext()) {
			me = (Map.Entry) iter.next();
			keyName = (String) me.getKey();
			if (compKey.equals(keyName.toUpperCase())) return true;
		}
		return false;
	}
	public String getKeyValue (String strKey, String strDef) {
		Debug.println (">>> getKeyValue :"+strKey);
		String strReturn = strDef;
		Iterator iter = m_Map.entrySet().iterator();
		Map.Entry me;
		String keyName;
		String compKey = strKey.toUpperCase();
		while (iter.hasNext()) {
			me = (Map.Entry) iter.next();
			keyName = (String) me.getKey();
			if (compKey.equals(keyName.toUpperCase())) {
				String vals[] = (String[]) me.getValue();
				strReturn = vals[0];
				break;
			}
		}
		Debug.println("<<< getKeyValue :"+strReturn+":");
		return strReturn;
	}
	public int getKeyValue (String strKey, int nDef) {
		Debug.println (">>> getKeyValue :"+strKey);
		String strDef = (new Integer(nDef)).toString();
		String strTmp = getKeyValue(strKey,strDef);
		int nReturn = (new Integer(strTmp)).intValue();
		Debug.println("<<< getKeyValue :"+nReturn+":");
		return nReturn;
	}

	public void showParams (String msg) {
		Debug.println (">>> toString :"+msg);
		Iterator iter = m_Map.entrySet().iterator();
		Map.Entry me;
		while (iter.hasNext()) {
			me = (Map.Entry) iter.next();
			Debug.println("Parameter :"+me.getKey() + ":");
			String vals[] = (String[]) me.getValue();
			for (int i=0; i<vals.length; i++)
				Debug.println("Value :"+vals[i]+":");
		}
		Debug.println ("<<< toString");
	}
}

