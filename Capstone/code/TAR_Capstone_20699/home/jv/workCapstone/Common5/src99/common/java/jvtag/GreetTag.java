package jvtag;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class GreetTag extends TagSupport {
	private String name;

	public GreetTag() {super();}

	public void setParam(String name) {
		Debug.println ("setParam; name :"+name+":");
		this.name= name;
	}

	public int doEndTag() throws javax.servlet.jsp.JspTagException{
		Debug.println(">>> doEndTag");
		try {
			try {
				Debug.println("doEndTag - stage 1");
				String strUserid = (String) pageContext.getAttribute (
					name, pageContext.REQUEST_SCOPE);
				Debug.println("doEndTag - stage 2");
				Debug.println("userid :"+strUserid+":");
				pageContext.getOut().write(strUserid);
				Debug.println("doEndTag - stage 3");
/*
get a parameter...
				pageContext.getOut().write(
					pageContext.getRequest().getParameter("user"));
*/
			} catch (java.lang.NullPointerException npe){
				Debug.println("doEndTag - stage 4");
				pageContext.getOut().write("annonymous");
				Debug.println("doEndTag - stage 5");
			}
		} catch (java.io.IOException e) {
			throw new JspTagException("IO Error: "+ e.getMessage());
		}
		Debug.println("<<< doEndTag");
		return EVAL_PAGE;
	}
}

