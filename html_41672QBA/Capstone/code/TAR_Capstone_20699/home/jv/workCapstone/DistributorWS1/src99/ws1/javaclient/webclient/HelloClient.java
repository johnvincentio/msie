
package webclient;

import javax.xml.rpc.Stub;

public class HelloClient {
    private String endpointAddress;
	private static String strXML = 
"<Collection>"+
"<Barcode>"+
"<Barcodeid>1</Barcodeid>"+
"<Itemid>1</Itemid>"+
"<Company>Company_1</Company>"+
"<Imageurl>http://jv2:8080/Capstone/small/1.jpg</Imageurl>"+
"<Name>name_1</Name>"+
"<Description>description_1</Description>"+
"</Barcode>"+
"<Barcode>"+
"<Barcodeid>2</Barcodeid>"+
"<Itemid>2</Itemid>"+
"<Company>Company_2</Company>"+
"<Imageurl>http://jv2:8080/Capstone/small/2.jpg</Imageurl>"+
"<Name>name_2</Name>"+
"<Description>description_2</Description>"+
"</Barcode>"+
"<Barcode>"+
"<Barcodeid>3</Barcodeid>"+
"<Itemid>3</Itemid>"+
"<Company>Company_3</Company>"+
"<Imageurl>http://jv2:8080/Capstone/small/3.jpg</Imageurl>"+
"<Name>name_3</Name>"+
"<Description>description_3</Description>"+
"</Barcode>"+
"<Barcode>"+
"<Barcodeid>4</Barcodeid>"+
"<Itemid>4</Itemid>"+
"<Company>Company_4</Company>"+
"<Imageurl>http://jv2:8080/Capstone/small/4.jpg</Imageurl>"+
"<Name>name_4</Name>"+
"<Description>description_4</Description>"+
"</Barcode>"+
"<Barcode>"+
"<Barcodeid>5</Barcodeid>"+
"<Itemid>5</Itemid>"+
"<Company>Company_5</Company>"+
"<Imageurl>http://jv2:8080/Capstone/small/5.jpg</Imageurl>"+
"<Name>name_5</Name>"+
"<Description>description_5</Description>"+
"</Barcode>"+
"</Collection>";

    public static void main(String[] args) {
        System.out.println("Endpoint address = " + args[0]);

        try {
            Stub stub = createProxy();

            stub._setProperty(javax.xml.rpc.Stub.ENDPOINT_ADDRESS_PROPERTY,
                args[0]);

            HelloIF hello = (HelloIF) stub;

//            System.out.println(hello.sayHello("Duke!"));
            System.out.println(hello.sayHello(strXML));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static Stub createProxy() {
        // Note: MyHelloService_Impl is implementation-specific.
        return (Stub) (new MyHelloService_Impl().getHelloIFPort());
    }
}
