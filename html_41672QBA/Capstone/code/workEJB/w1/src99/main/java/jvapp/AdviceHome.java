package jvapp;

import javax.ejb.*;
import java.rmi.RemoteException;

public interface AdviceHome extends EJBHome {
	public Advice create() throws CreateException, RemoteException;
}

