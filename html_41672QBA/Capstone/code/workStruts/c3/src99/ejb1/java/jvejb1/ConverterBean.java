
package jvejb1;

import java.rmi.RemoteException; 
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import java.math.*;


public class ConverterBean implements SessionBean {
 
    BigDecimal yenRate = new BigDecimal("121.6000");
    BigDecimal euroRate = new BigDecimal("0.0077");

    public BigDecimal dollarToYen(BigDecimal dollars) {

		System.out.println("--- dollarToYen");

        BigDecimal result = dollars.multiply(yenRate);

        return result.setScale(2, BigDecimal.ROUND_UP);
    }

    public BigDecimal yenToEuro(BigDecimal yen) {

		System.out.println("--- yenToEuro");
        BigDecimal result = yen.multiply(euroRate);

        return result.setScale(2, BigDecimal.ROUND_UP);
    }

    public ConverterBean() {System.out.println("(ejb1) ConverterBean");}

    public void ejbCreate() {System.out.println("(ejb1) ejbCreate");}

    public void ejbRemove() {System.out.println("(ejb1) ejbRemove");}

    public void ejbActivate() {System.out.println("(ejb1) ejbActivate");}

    public void ejbPassivate() {System.out.println("(ejb1) ejbPassivate");}

    public void setSessionContext(SessionContext sc) {}

} // ConverterBean
