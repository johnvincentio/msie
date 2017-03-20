
package helloservice;

import java.rmi.RemoteException;
import java.rmi.Remote;

public interface HelloIF extends Remote {
    public String sayHello(String name) throws RemoteException;
}
