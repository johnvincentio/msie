import javax.naming.*;
import java.rmi.*;
import javax.rmi.*;
import javax.ejb.*;

import jvapp.*;

public class AdviceClient {
	public static void main (String[]args) {
		new AdviceClient().go();
	}

	public void go() {
		try {
			System.out.println("get InitialContext");
			Context ic = new InitialContext();

			System.out.println("lookup bean");
			Object o = ic.lookup ("java:comp/env/ejb/SimpleAdvice");

			System.out.println("get home object");
			AdviceHome home = (AdviceHome) PortableRemoteObject.
					narrow (o, AdviceHome.class);

			System.out.println("do home.create");
			Advice advisor = home.create();

			System.out.println("Should return one of: one, two, three, four, five");
			System.out.println(advisor.getAdvice());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("Completed OK");
	}
}

