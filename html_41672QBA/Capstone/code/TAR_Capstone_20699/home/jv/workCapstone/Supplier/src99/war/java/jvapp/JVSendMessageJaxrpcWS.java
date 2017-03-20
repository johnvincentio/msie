
package jvapp;

import jvcommon.*;
import webclient.*;
import javax.xml.rpc.Stub;

public class JVSendMessageJaxrpcWS {
	private String m_strEndpoint = "http://localhost:8080/hello-ejb/hello";
	private Stub m_stub;
	private HelloIF m_hello;

	public JVSendMessageJaxrpcWS() {}

	public boolean createConnection() {
		Debug.println(">>> createConnection");
        try {
			Debug.println("stage 1");
			m_stub = (Stub) (new MyHelloService_Impl().getHelloIFPort());
			Debug.println("stage 2");
            m_stub._setProperty(javax.xml.rpc.Stub.ENDPOINT_ADDRESS_PROPERTY,
                m_strEndpoint);
			Debug.println("stage 3");
			m_hello = (HelloIF) m_stub;
			Debug.println("stage 4");
        }
		catch (Exception ex) {
            ex.printStackTrace();
			return  false;
        }
		Debug.println("<<< createConnection");
		return true;
	}

	public void removeConnection() {
		Debug.println(">>> removeConnection");
		m_stub = null;
		Debug.println("<<< removeConnection");
	}

	public String sendMessage (String strMsg) {
		String strReturn = null;
		Debug.println(">>> sendMessage; msg :"+strMsg);
		try {
			strReturn = m_hello.sayHello (strMsg);
		}
		catch (Exception ex) {
			Debug.println("exception "+ex.getMessage());
		}
		Debug.println("<<< sendMessage; msg :"+strReturn+":");
		return strReturn;
	}
}

