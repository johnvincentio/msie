
package jvapp;

import jvcommon.Debug;

import jvejb1.Converter;
import jvejb1.ConverterHome;

import javax.naming.*;
import javax.rmi.*;
import java.rmi.RemoteException;
import javax.ejb.*;

/*
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;
import javax.rmi.RemoteException;
*/
import java.math.BigDecimal;

public class SB1Test {
	public SB1Test() {
		Debug.println (">>> SB1Test constructor");
		Debug.println ("<<< SB1Test constructor");
	}
	public void doTest() {
		Debug.println (">>> SB1Test::doTest");
		try {
			Context ic = new InitialContext();
			Object objref = ic.lookup("java:comp/env/ejb/TheConverter");
			ConverterHome home = (ConverterHome) PortableRemoteObject.narrow(
				objref,ConverterHome.class);
			Converter jv = home.create();

			Debug.println("Do donversions");
			BigDecimal param = new BigDecimal("100.00");
			Debug.println("dollars "+param);

			BigDecimal amount = jv.dollarToYen(param);
			Debug.println("yen "+amount);

			amount = jv.yenToEuro(param);
			Debug.println("euros "+amount);
		}
		catch (RemoteException rex) {
			Debug.println("remoteexception "+rex.getMessage());
		}
		catch (CreateException cex) {
			Debug.println("createexception "+cex.getMessage());
		}
		catch (NamingException nex) {
			Debug.println("namingexception "+nex.getMessage());
		}
		catch (Exception ex) {
			Debug.println("exception "+ex.getMessage());
			ex.printStackTrace();
		}
		Debug.println ("<<< SB1Test::doTest");
	}
}

