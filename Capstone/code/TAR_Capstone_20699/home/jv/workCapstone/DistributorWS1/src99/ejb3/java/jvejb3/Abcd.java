package jvejb3;

import jvcommon.*;

import java.util.*;
import javax.ejb.EJBObject;
import java.rmi.RemoteException;

public interface Abcd extends EJBObject {
 
	public void doXML (String strMsg) throws RemoteException;
}

