
package jvbean;

import jvutils.Debug;

public class JVMessage {
	private String header;
	private String text;
	public JVMessage (String header, String text) {
		this.header = header;
		this.text = text;
	}
	public void setHeader(String msg) {header = msg;}
	public String getHeader() {return header;}
	public void setText(String msg) {text = msg;}
	public String getText() {return text;}
}

