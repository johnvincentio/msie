
import jvejb1.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;
import java.math.BigDecimal;

public class ConverterClient {

    public static void main(String[] args) {
        try {
            Context initial = new InitialContext();
            Context myEnv = (Context) initial.lookup("java:comp/env");
            Object objref = myEnv.lookup("ejb/SimpleManufacturer1");

            ConverterHome home = (ConverterHome) PortableRemoteObject.narrow(objref,
                    ConverterHome.class);

            Converter currencyConverter = home.create();

            BigDecimal param = new BigDecimal("100.00");
            BigDecimal amount = currencyConverter.dollarToYen(param);

            System.out.println(amount);
            amount = currencyConverter.yenToEuro(param);
            System.out.println(amount);

            System.exit(0);

        } catch (Exception ex) {
            System.err.println("Caught an unexpected exception!");
            ex.printStackTrace();
        }
    } 
} 
