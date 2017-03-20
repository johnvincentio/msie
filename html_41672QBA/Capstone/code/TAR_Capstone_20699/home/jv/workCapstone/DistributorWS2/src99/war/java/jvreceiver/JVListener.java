
package jvreceiver;

import jvcommon.Debug;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class JVListener implements ServletContextListener {

	public void contextInitialized (ServletContextEvent evt) {
		Debug.setFile("/tmp/distributorWS2_ear.txt",false);
		Debug.println("---init()");
	}

	public void contextDestroyed (ServletContextEvent evt) {
		Debug.println("--contextDestroyed()");
	}

}
