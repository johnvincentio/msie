
package webclient;

import javax.xml.rpc.Stub;

public class HelloClient {
    private String endpointAddress;

    public static void main(String[] args) {
        System.out.println("Endpoint address = " + args[0]);

        try {
            Stub stub = createProxy();

            stub._setProperty(javax.xml.rpc.Stub.ENDPOINT_ADDRESS_PROPERTY,
                args[0]);

            HelloIF hello = (HelloIF) stub;

            System.out.println(hello.sayHello("Duke!"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static Stub createProxy() {
        // Note: MyHelloService_Impl is implementation-specific.
        return (Stub) (new MyHelloService_Impl().getHelloIFPort());
    }
}
