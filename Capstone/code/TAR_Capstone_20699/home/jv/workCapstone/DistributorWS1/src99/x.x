Buildfile: build.xml

dist:

clean:
     [echo] Remove build and distributables...
   [delete] Deleting 15 files from /home/jv/workCapstone/DistributorWS1/src99/ejb3/build
   [delete] Deleted 8 directories from /home/jv/workCapstone/DistributorWS1/src99/ejb3/build
   [delete] Deleting 21 files from /home/jv/workCapstone/DistributorWS1/src99/ejb3/dist
   [delete] Deleted 8 directories from /home/jv/workCapstone/DistributorWS1/src99/ejb3/dist

mkdirs:
     [echo] Create directories...
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS1/src99/ejb3/dist
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS1/src99/ejb3/dist/ear
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS1/src99/ejb3/dist/ejb
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS1/src99/ejb3/dist/appclient
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS1/src99/ejb3/build
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS1/src99/ejb3/build/ear
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS1/src99/ejb3/build/ear/META-INF
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS1/src99/ejb3/build/appclient
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS1/src99/ejb3/build/appclient/META-INF
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS1/src99/ejb3/build/ejb
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS1/src99/ejb3/build/ejb/META-INF

compile:
     [echo] Compiling EJB java...
    [javac] Compiling 5 source files to /home/jv/workCapstone/DistributorWS1/src99/ejb3/build/ejb
     [echo] Compiling appClient java...
    [javac] Compiling 1 source file to /home/jv/workCapstone/DistributorWS1/src99/ejb3/build/appclient

build:
     [echo] Copying files from lib...
     [echo] Copying common JAR from common...
     [copy] Copying 1 file to /home/jv/workCapstone/DistributorWS1/src99/ejb3/build/ejb
     [echo] Copying EAR META-INF/*.xml files...
     [copy] Copying 2 files to /home/jv/workCapstone/DistributorWS1/src99/ejb3/build/ear/META-INF
     [echo] Copying EJB META-INF/*.xml files...
     [copy] Copying 2 files to /home/jv/workCapstone/DistributorWS1/src99/ejb3/build/ejb/META-INF
     [echo] Copying appClient META-INF/*.xml files...
     [copy] Copying 2 files to /home/jv/workCapstone/DistributorWS1/src99/ejb3/build/appclient/META-INF

dist:
     [echo] Creating EJB JAR file....
      [jar] Building jar: /home/jv/workCapstone/DistributorWS1/src99/ejb3/dist/ejb/ejb-jar-ic.jar
    [unjar] Expanding: /home/jv/workCapstone/DistributorWS1/src99/ejb3/dist/ejb/ejb-jar-ic.jar into /home/jv/workCapstone/DistributorWS1/src99/ejb3/dist/ejb
     [echo] Creating AppClient JAR file....
      [jar] Building jar: /home/jv/workCapstone/DistributorWS1/src99/ejb3/dist/appclient/app-client-ic.jar
    [unjar] Expanding: /home/jv/workCapstone/DistributorWS1/src99/ejb3/dist/appclient/app-client-ic.jar into /home/jv/workCapstone/DistributorWS1/src99/ejb3/dist/appclient
     [echo] Copying EJB JAR files...
     [copy] Copying 1 file to /home/jv/workCapstone/DistributorWS1/src99/ejb3/build/ear
     [copy] Copying 1 file to /home/jv/workCapstone/DistributorWS1/src99/ejb3/build/ear
     [echo] Creating EJB JAR file....
      [jar] Building jar: /home/jv/workCapstone/DistributorWS1/src99/ejb3/dist/ejb3.ear
     [echo] Expanding EAR file....
    [unjar] Expanding: /home/jv/workCapstone/DistributorWS1/src99/ejb3/dist/ejb3.ear into /home/jv/workCapstone/DistributorWS1/src99/ejb3/dist/ear

application_1_4:
     [echo] Checking application.xml for version 1.4

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/DistributorWS1/src99/ejb3/etc/application.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/DistributorWS1/src99/ejb3/etc/application.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

sun-application_1_4:
     [echo] Checking sun-application.xml for version 1.4

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/DistributorWS1/src99/ejb3/etc/sun-application.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/DistributorWS1/src99/ejb3/etc/sun-application.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

ejb-jar_2_1:
     [echo] Checking ejb-jar.xml for version 2.1

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/DistributorWS1/src99/ejb3/etc/ejb-jar.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/DistributorWS1/src99/ejb3/etc/ejb-jar.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

sun-ejb-jar_2_1:
     [echo] Checking sun-ejb-jar.xml for version 2.1

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/DistributorWS1/src99/ejb3/etc/sun-ejb-jar.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/DistributorWS1/src99/ejb3/etc/sun-ejb-jar.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

application-client_1_4:
     [echo] Checking application-client.xml for version 1.4

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/DistributorWS1/src99/ejb3/etc/application-client.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/DistributorWS1/src99/ejb3/etc/application-client.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

sun-application-client_1_4:
     [echo] Checking sun-application.xml for version 1.4

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/DistributorWS1/src99/ejb3/etc/sun-application-client.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/DistributorWS1/src99/ejb3/etc/sun-application-client.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

checkXML:

all:

application_1_4:
     [echo] Checking application.xml for version 1.4

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/DistributorWS1/src99/mdb2/etc/application.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/DistributorWS1/src99/mdb2/etc/application.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

sun-application_1_4:
     [echo] Checking sun-application.xml for version 1.4

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/DistributorWS1/src99/mdb2/etc/sun-application.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/DistributorWS1/src99/mdb2/etc/sun-application.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

ejb-jar_2_1:
     [echo] Checking ejb-jar.xml for version 2.1

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/DistributorWS1/src99/mdb2/etc/ejb-jar.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/DistributorWS1/src99/mdb2/etc/ejb-jar.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

sun-ejb-jar_2_1:
     [echo] Checking sun-ejb-jar.xml for version 2.1

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/DistributorWS1/src99/mdb2/etc/sun-ejb-jar.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/DistributorWS1/src99/mdb2/etc/sun-ejb-jar.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

application-client_1_4:
     [echo] Checking application-client.xml for version 1.4

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/DistributorWS1/src99/mdb2/etc/application-client.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/DistributorWS1/src99/mdb2/etc/application-client.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

sun-application-client_1_4:
     [echo] Checking sun-application.xml for version 1.4

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/DistributorWS1/src99/mdb2/etc/sun-application-client.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/DistributorWS1/src99/mdb2/etc/sun-application-client.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

checkXML:

clean:
     [echo] Remove build and distributables...
   [delete] Deleting 13 files from /home/jv/workCapstone/DistributorWS1/src99/mdb2/build
   [delete] Deleted 8 directories from /home/jv/workCapstone/DistributorWS1/src99/mdb2/build
   [delete] Deleting 19 files from /home/jv/workCapstone/DistributorWS1/src99/mdb2/dist
   [delete] Deleted 8 directories from /home/jv/workCapstone/DistributorWS1/src99/mdb2/dist

mkdirs:
     [echo] Create directories...
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS1/src99/mdb2/dist
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS1/src99/mdb2/dist/ear
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS1/src99/mdb2/dist/ejb
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS1/src99/mdb2/dist/appclient
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS1/src99/mdb2/build
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS1/src99/mdb2/build/ear
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS1/src99/mdb2/build/ear/META-INF
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS1/src99/mdb2/build/appclient
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS1/src99/mdb2/build/appclient/META-INF
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS1/src99/mdb2/build/ejb
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS1/src99/mdb2/build/ejb/META-INF

compile:
     [echo] Compiling EJB java...
    [javac] Compiling 2 source files to /home/jv/workCapstone/DistributorWS1/src99/mdb2/build/ejb
     [echo] Compiling appClient java...
    [javac] Compiling 1 source file to /home/jv/workCapstone/DistributorWS1/src99/mdb2/build/appclient

build:
     [echo] Copying files from lib...
     [echo] Copying common JAR from common...
     [copy] Copying 1 file to /home/jv/workCapstone/DistributorWS1/src99/mdb2/build/ejb
     [echo] Copying EJB3 JAR to EAR...
     [copy] Copying 1 file to /home/jv/workCapstone/DistributorWS1/src99/mdb2/build/ear
     [echo] Copying EAR META-INF/*.xml files...
     [copy] Copying 2 files to /home/jv/workCapstone/DistributorWS1/src99/mdb2/build/ear/META-INF
     [echo] Copying EJB META-INF/*.xml files...
     [copy] Copying 2 files to /home/jv/workCapstone/DistributorWS1/src99/mdb2/build/ejb/META-INF
     [echo] Copying appClient META-INF/*.xml files...
     [copy] Copying 2 files to /home/jv/workCapstone/DistributorWS1/src99/mdb2/build/appclient/META-INF

dist:
     [echo] Creating EJB JAR file....
      [jar] Building jar: /home/jv/workCapstone/DistributorWS1/src99/mdb2/dist/ejb/ejb-jar-ic.jar
    [unjar] Expanding: /home/jv/workCapstone/DistributorWS1/src99/mdb2/dist/ejb/ejb-jar-ic.jar into /home/jv/workCapstone/DistributorWS1/src99/mdb2/dist/ejb
     [echo] Creating AppClient JAR file....
      [jar] Building jar: /home/jv/workCapstone/DistributorWS1/src99/mdb2/dist/appclient/app-client-ic.jar
    [unjar] Expanding: /home/jv/workCapstone/DistributorWS1/src99/mdb2/dist/appclient/app-client-ic.jar into /home/jv/workCapstone/DistributorWS1/src99/mdb2/dist/appclient
     [echo] Copying EJB JAR files...
     [copy] Copying 1 file to /home/jv/workCapstone/DistributorWS1/src99/mdb2/build/ear
     [copy] Copying 1 file to /home/jv/workCapstone/DistributorWS1/src99/mdb2/build/ear
     [echo] Creating EJB JAR file....
      [jar] Building jar: /home/jv/workCapstone/DistributorWS1/src99/mdb2/dist/workmdb2EAR.ear
     [echo] Expanding EAR file....
    [unjar] Expanding: /home/jv/workCapstone/DistributorWS1/src99/mdb2/dist/workmdb2EAR.ear into /home/jv/workCapstone/DistributorWS1/src99/mdb2/dist/ear

all:

clean:
     [echo] Remove build and distributables...
   [delete] Deleting 30 files from /home/jv/workCapstone/DistributorWS1/src99/ws1/build
   [delete] Deleted 10 directories from /home/jv/workCapstone/DistributorWS1/src99/ws1/build
   [delete] Deleting 35 files from /home/jv/workCapstone/DistributorWS1/src99/ws1/dist
   [delete] Deleted 10 directories from /home/jv/workCapstone/DistributorWS1/src99/ws1/dist

mkdirs:
     [echo] Create directories...
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS1/src99/ws1/dist
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS1/src99/ws1/dist/ear
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS1/src99/ws1/dist/ejb
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS1/src99/ws1/build
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS1/src99/ws1/build/ear
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS1/src99/ws1/build/ear/META-INF
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS1/src99/ws1/build/ejb
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS1/src99/ws1/build/ejb/META-INF
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS1/src99/ws1/build/ejb/META-INF/wsdl
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS1/src99/ws1/build/wsdl
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS1/src99/ws1/build/wsdl/stubs

compile:
     [echo] Compiling EJB java...
    [javac] Compiling 3 source files to /home/jv/workCapstone/DistributorWS1/src99/ws1/build/ejb
     [echo] wscompile config-interface.xml

generate-wsdl:
     [exec] [creating model: MyHelloService]
     [exec] [creating service: MyHelloService]
     [exec] [creating port: helloservice.HelloIF]
     [exec] [creating operation: sayHello]


     [echo] wscompile wsdl to get stubs

generate-stubs:
     [exec] [ServiceInterfaceGenerator: creating service interface: webclient.MyHelloService]
     [exec] [ServiceGenerator: creating service: webclient.MyHelloService_Impl]
     [exec] [CustomClassGenerator: generating JavaClass for: sayHello]
     [exec] [CustomClassGenerator: generating JavaClass for: sayHelloResponse]
     [exec] [SOAPObjectSerializerGenerator: writing  serializer/deserializer for: {urn:Foo}sayHello]
     [exec] [SOAPObjectSerializerGenerator: writing  serializer/deserializer for: {urn:Foo}sayHelloResponse]
     [exec] [SOAPObjectBuilderGenerator: writing object builder for: sayHello]
     [exec] [SOAPObjectBuilderGenerator: writing object builder for: sayHelloResponse]
     [exec] [SerializerRegistryGenerator: creating serializer registry: webclient.MyHelloService_SerializerRegistry]


    [javac] Compiling 1 source file to /home/jv/workCapstone/DistributorWS1/src99/ws1/build/wsdl/stubs

build:
     [echo] Copying files from lib...
     [echo] Copying common JAR from common...
     [copy] Copying 1 file to /home/jv/workCapstone/DistributorWS1/src99/ws1/build/ejb
     [echo] Copying MDB1 JAR files...
     [copy] Copying 1 file to /home/jv/workCapstone/DistributorWS1/src99/ws1/build/ear
     [copy] Copying 1 file to /home/jv/workCapstone/DistributorWS1/src99/ws1/build/ear
     [echo] Copying EJB2 JAR files...
     [copy] Copying 1 file to /home/jv/workCapstone/DistributorWS1/src99/ws1/build/ear
     [copy] Copying 1 file to /home/jv/workCapstone/DistributorWS1/src99/ws1/build/ear
     [echo] Copying EAR META-INF/*.xml files...
     [copy] Copying 2 files to /home/jv/workCapstone/DistributorWS1/src99/ws1/build/ear/META-INF
     [copy] Copying 1 file to /home/jv/workCapstone/DistributorWS1/src99/ws1/build/ejb
     [copy] Copying 1 file to /home/jv/workCapstone/DistributorWS1/src99/ws1/build/ejb/META-INF/wsdl
     [echo] Copying EJB META-INF/*.xml files...
     [copy] Copying 3 files to /home/jv/workCapstone/DistributorWS1/src99/ws1/build/ejb/META-INF

dist:
     [echo] Copying WSDL file...
     [copy] Copying 1 file to /home/jv/workCapstone/DistributorWS1/src99/ws1/dist
     [echo] Creating client JAR file....
      [jar] Building jar: /home/jv/workCapstone/DistributorWS1/src99/ws1/dist/client.jar
    [unjar] Expanding: /home/jv/workCapstone/DistributorWS1/src99/ws1/dist/client.jar into /home/jv/workCapstone/DistributorWS1/src99/ws1/dist/wsdl
     [echo] Creating EJB JAR file....
      [jar] Building jar: /home/jv/workCapstone/DistributorWS1/src99/ws1/dist/ejb/ejb-jar-ic.jar
    [unjar] Expanding: /home/jv/workCapstone/DistributorWS1/src99/ws1/dist/ejb/ejb-jar-ic.jar into /home/jv/workCapstone/DistributorWS1/src99/ws1/dist/ejb
     [echo] Copying EJB JAR files...
     [copy] Copying 1 file to /home/jv/workCapstone/DistributorWS1/src99/ws1/build/ear
     [echo] Creating EJB JAR file....
      [jar] Building jar: /home/jv/workCapstone/DistributorWS1/src99/ws1/dist/DistributorWS1EAR.ear
     [echo] Expanding EAR file....
    [unjar] Expanding: /home/jv/workCapstone/DistributorWS1/src99/ws1/dist/DistributorWS1EAR.ear into /home/jv/workCapstone/DistributorWS1/src99/ws1/dist/ear

application_1_4:
     [echo] Checking application.xml for version 1.4

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/DistributorWS1/src99/ws1/etc/application.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/DistributorWS1/src99/ws1/etc/application.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

sun-application_1_4:
     [echo] Checking sun-application.xml for version 1.4

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/DistributorWS1/src99/ws1/etc/sun-application.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/DistributorWS1/src99/ws1/etc/sun-application.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

ejb-jar_2_1:
     [echo] Checking ejb-jar.xml for version 2.1

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/DistributorWS1/src99/ws1/etc/ejb-jar.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/DistributorWS1/src99/ws1/etc/ejb-jar.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

sun-ejb-jar_2_1:
     [echo] Checking sun-ejb-jar.xml for version 2.1

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/DistributorWS1/src99/ws1/etc/sun-ejb-jar.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/DistributorWS1/src99/ws1/etc/sun-ejb-jar.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

config-interface_1_0:
     [echo] Checking config-interface.xml for version 1.0

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/DistributorWS1/src99/ws1/config-interface.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/DistributorWS1/src99/ws1/config-interface.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

config-wsdl_1_0:
     [echo] Checking config-wsdl.xml for version 1.0

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/DistributorWS1/src99/ws1/config-wsdl.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/DistributorWS1/src99/ws1/config-wsdl.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

web_services_1_1:
     [echo] Checking webservices.xml for version 1.1

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/DistributorWS1/src99/ws1/etc/webservices.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/DistributorWS1/src99/ws1/etc/webservices.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

checkXML:

all:

clean:
     [echo] Remove build and distributables...
   [delete] Deleting 7 files from /home/jv/workCapstone/DistributorWS1/src99/ear/build
   [delete] Deleted 2 directories from /home/jv/workCapstone/DistributorWS1/src99/ear/build
   [delete] Deleting 10 files from /home/jv/workCapstone/DistributorWS1/src99/ear/dist
   [delete] Deleted 3 directories from /home/jv/workCapstone/DistributorWS1/src99/ear/dist

mkdirs:
     [echo] Create directories...
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS1/src99/ear/dist
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS1/src99/ear/dist/ear
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS1/src99/ear/build
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS1/src99/ear/build/META-INF

build:
     [echo] Copying EJB3 JAR files...
     [copy] Copying 1 file to /home/jv/workCapstone/DistributorWS1/src99/ear/build
     [copy] Copying 1 file to /home/jv/workCapstone/DistributorWS1/src99/ear/build
     [echo] Copying MDB2 JAR files...
     [copy] Copying 1 file to /home/jv/workCapstone/DistributorWS1/src99/ear/build
     [copy] Copying 1 file to /home/jv/workCapstone/DistributorWS1/src99/ear/build
     [echo] Copying WS1 JAR files...
     [copy] Copying 1 file to /home/jv/workCapstone/DistributorWS1/src99/ear/build
     [echo] Copying EAR META-INF/*.xml files...
     [copy] Copying 2 files to /home/jv/workCapstone/DistributorWS1/src99/ear/build/META-INF

dist:
     [echo] Creating EJB JAR file....
      [jar] Building jar: /home/jv/workCapstone/DistributorWS1/src99/ear/dist/DistributorWS1EAR.ear
     [echo] Expanding EAR file....
    [unjar] Expanding: /home/jv/workCapstone/DistributorWS1/src99/ear/dist/DistributorWS1EAR.ear into /home/jv/workCapstone/DistributorWS1/src99/ear/dist/ear

application_1_4:
     [echo] Checking application.xml for version 1.4

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/DistributorWS1/src99/ear/etc/application.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/DistributorWS1/src99/ear/etc/application.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

sun-application_1_4:
     [echo] Checking sun-application.xml for version 1.4

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/DistributorWS1/src99/ear/etc/sun-application.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/DistributorWS1/src99/ear/etc/sun-application.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

checkXML:

all:

tools:

deploy:
     [exec] deploy --password yetiyeti --secure=false --user admin --terse=false --target server --echo=true --upload=true --dbvendorname oracle --port 4848 --interactive=true --enabled=true --retrieve /home/jv/workCapstone/DistributorWS1/src99/ear/dist --host localhost --precompilejsp=true --force=true --verify=false --name DistributorWS1EAR /home/jv/workCapstone/DistributorWS1/src99/ear/dist/DistributorWS1EAR.ear
     [exec] Command deploy executed successfully.



BUILD SUCCESSFUL
Total time: 2 minutes 10 seconds
