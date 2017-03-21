package jvapp;

import javax.ejb.*;

public class AdviceBean implements SessionBean {

	private String adviceString[] = {"one","two","three","four","five"};

	public void ejbActivate() {System.out.println("ejbActivate");}
	public void ejbPassivate() {System.out.println("ejbPassivate");}
	public void ejbCreate() {System.out.println("ejbCreate");}
	public void ejbRemove() {System.out.println("ejbRemove");}
	public void setSessionContext(SessionContext ctx)
		{System.out.println("setSessionContext");}

	public String getAdvice() {
		System.out.println("getAdvice");
		int random = (int) (Math.random() * adviceString.length);
		return adviceString[random];
	}
}

