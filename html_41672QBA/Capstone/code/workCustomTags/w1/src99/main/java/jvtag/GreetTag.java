package jvtag;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class GreetTag extends TagSupport {

	public GreetTag() {super();}

	public int doEndTag() throws javax.servlet.jsp.JspTagException{
		try {
			try {
				pageContext.getOut().write(
					pageContext.getRequest().getParameter("user"));
			} catch (java.lang.NullPointerException npe){
				pageContext.getOut().write("annonymous");
			}
		} catch (java.io.IOException e) {
			throw new JspTagException("IO Error: "+ e.getMessage());
		}
		return EVAL_PAGE;
	}

	public void setParam(String name) {this.name= name;}
	private String name;
}

