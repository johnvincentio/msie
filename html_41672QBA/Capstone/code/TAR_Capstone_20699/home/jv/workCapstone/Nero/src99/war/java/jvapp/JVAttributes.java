package jvapp;

import jvdebug.*;

import java.util.*;

public class JVAttributes {
	private Enumeration m_enum;

	public JVAttributes (Enumeration pEnum) {
		m_enum = pEnum;
	}

	public void showParams (String msg) {
		Debug.println (">>> toString :"+msg);
		while (m_enum.hasMoreElements()) {
			Debug.println("Parameter :"+m_enum.nextElement()+ ":");
		}
		Debug.println ("<<< toString");
	}
}


