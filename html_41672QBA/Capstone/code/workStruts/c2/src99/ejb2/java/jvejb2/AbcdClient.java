
package jvejb2;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;

public class AbcdClient {

    public static void main(String[] args) {
        try {
            Context initial = new InitialContext();
            Context myEnv = (Context) initial.lookup("java:comp/env");
            Object objref = myEnv.lookup("ejb/SimpleAbcd");

            AbcdHome home = (AbcdHome) PortableRemoteObject.narrow(objref,
                    AbcdHome.class);

            Abcd myBean = home.create();

/*
            BigDecimal param = new BigDecimal("100.00");
            BigDecimal amount = currencyConverter.dollarToYen(param);

            System.out.println(amount);
            amount = currencyConverter.yenToEuro(param);
*/
            System.out.println("in AbcdClient");

            System.exit(0);

        } catch (Exception ex) {
            System.err.println("Caught an unexpected exception!");
            ex.printStackTrace();
        }
    } 
} 
