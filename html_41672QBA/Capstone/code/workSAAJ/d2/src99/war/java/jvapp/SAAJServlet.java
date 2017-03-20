
// got this from SUN; use for now....

package jvapp;

import java.io.IOException;
import java.io.OutputStream;
import java.util.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.xml.soap.*;

public abstract class SAAJServlet extends HttpServlet {

    public SAAJServlet() {
        conn = null;
        msgFactory = null;
    }

    public void init(ServletConfig servletConfig) throws ServletException {
        super.init(servletConfig);

		Debug.setFile("/tmp/SAAJServlet.txt",false);
		Debug.println("---init()");

        try {
            msgFactory = MessageFactory.newInstance();
            SOAPConnectionFactory connFactory = SOAPConnectionFactory.newInstance();
            conn = connFactory.createConnection();
        }
        catch(SOAPException ex) {
            throw new ServletException("Unable to create message factory" + ex.getMessage());
        }
		Debug.println("<<< init()");
    }

    public void setMessageFactory(MessageFactory msgFactory) {
		Debug.println("---setMessageFactory()");
        this.msgFactory = msgFactory;
    }

    protected static MimeHeaders getHeaders(HttpServletRequest req) {
		Debug.println(">>> getHeaders");
        Enumeration enum = req.getHeaderNames();
        MimeHeaders headers = new MimeHeaders();
        while(enum.hasMoreElements())  {
            String headerName = (String)enum.nextElement();
            String headerValue = req.getHeader(headerName);
            for(StringTokenizer values = new StringTokenizer(headerValue, ","); values.hasMoreTokens(); headers.addHeader(headerName, values.nextToken().trim()));
        }
		Debug.println("<<< getHeaders");
        return headers;
    }

    protected static void putHeaders(MimeHeaders headers, HttpServletResponse res) {
		Debug.println(">>> putHeaders");
        for(Iterator it = headers.getAllHeaders(); it.hasNext();) {
            MimeHeader header = (MimeHeader)it.next();
            String values[] = headers.getHeader(header.getName());
            if(values.length == 1) {
                res.setHeader(header.getName(), header.getValue());
            } else {
                StringBuffer concat = new StringBuffer();
                for(int i = 0; i < values.length;) {
                    if(i != 0)
                        concat.append(',');
                    concat.append(values[i++]);
                }

                res.setHeader(header.getName(), concat.toString());
            }
        }
		Debug.println("<<< putHeaders");
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Debug.println(">>> doPost");
        try {
            MimeHeaders headers = getHeaders(req);
            java.io.InputStream is = req.getInputStream();
            SOAPMessage msg = msgFactory.createMessage(headers, is);
            SOAPMessage reply = null;
            reply = onMessage(msg);
            if(reply != null) {
                if(reply.saveRequired())
                    reply.saveChanges();
                resp.setStatus(200);
                putHeaders(reply.getMimeHeaders(), resp);
                OutputStream os = resp.getOutputStream();
                reply.writeTo(os);
                os.flush();
            } else {
                resp.setStatus(204);
            }
        }
        catch(Exception ex) {
            throw new ServletException("SAAJ POST failed " + ex.getMessage());
        }
		Debug.println("<<< doPost");
    }

    public abstract SOAPMessage onMessage(SOAPMessage soapmessage);

    protected SOAPConnection conn;
    protected MessageFactory msgFactory;
}
