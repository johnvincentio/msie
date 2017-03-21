package jvtag;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class HiTag extends TagSupport {

	public HiTag() {super();}

	public int doStartTag() throws javax.servlet.jsp.JspTagException{
		try {
			pageContext.getOut().print("Hi, whoever you are");
		} catch (java.io.IOException e) {
			throw new JspTagException("IO Error: "+ e.getMessage());
		}
		return SKIP_BODY;
	}
}

