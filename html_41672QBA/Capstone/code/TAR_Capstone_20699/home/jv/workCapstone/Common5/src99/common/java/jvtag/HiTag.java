package jvtag;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class HiTag extends TagSupport {

	public HiTag() {super();}

	public int doStartTag() throws javax.servlet.jsp.JspTagException{
		Debug.println(">>> HiTag; doStartTag");
		try {
			pageContext.getOut().print("Hi, whoever you are");
		} catch (java.io.IOException e) {
			throw new JspTagException("IO Error: "+ e.getMessage());
		}
		Debug.println("<<< HiTag; doStartTag");
		return SKIP_BODY;
	}
}

