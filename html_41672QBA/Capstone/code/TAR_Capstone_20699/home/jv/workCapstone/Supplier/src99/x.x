Buildfile: build.xml

dist:
     [echo] Initializing...
     [echo] /opt/SUNWappserver/jdk/bin:/opt/SUNWappserver/bin:/opt/apache-ant-1.6.0/bin:/home/jv/dbin:/usr/local/bin:/bin:/usr/bin:/usr/bin/X11:/usr/X11R6/bin
     [echo] .:/opt/SUNWappserver/lib/j2ee.jar

clean:
     [echo] Remove build and distributables...
   [delete] Deleting 7 files from /home/jv/workCapstone/Supplier/src99/ejb2/build
   [delete] Deleted 3 directories from /home/jv/workCapstone/Supplier/src99/ejb2/build
   [delete] Deleting 3 files from /home/jv/workCapstone/Supplier/src99/ejb2/buildclient
   [delete] Deleted 2 directories from /home/jv/workCapstone/Supplier/src99/ejb2/buildclient
   [delete] Deleting 14 files from /home/jv/workCapstone/Supplier/src99/ejb2/dist
   [delete] Deleted 6 directories from /home/jv/workCapstone/Supplier/src99/ejb2/dist

mkdirs:
     [echo] Create directories...
    [mkdir] Created dir: /home/jv/workCapstone/Supplier/src99/ejb2/dist
    [mkdir] Created dir: /home/jv/workCapstone/Supplier/src99/ejb2/dist/ejb
    [mkdir] Created dir: /home/jv/workCapstone/Supplier/src99/ejb2/dist/appclient
    [mkdir] Created dir: /home/jv/workCapstone/Supplier/src99/ejb2/build
    [mkdir] Created dir: /home/jv/workCapstone/Supplier/src99/ejb2/build/META-INF
    [mkdir] Created dir: /home/jv/workCapstone/Supplier/src99/ejb2/buildclient
    [mkdir] Created dir: /home/jv/workCapstone/Supplier/src99/ejb2/buildclient/META-INF

compile:
     [echo] Compiling EJB java...
    [javac] Compiling 4 source files to /home/jv/workCapstone/Supplier/src99/ejb2/build
     [echo] Compiling appClient java...
    [javac] Compiling 1 source file to /home/jv/workCapstone/Supplier/src99/ejb2/buildclient

build:
     [echo] Copying common JAR from common...
     [copy] Copying 1 file to /home/jv/workCapstone/Supplier/src99/ejb2/build
     [echo] Copying EJB META-INF/*.xml files...
     [copy] Copying 2 files to /home/jv/workCapstone/Supplier/src99/ejb2/build/META-INF
     [echo] Copying appClient META-INF/*.xml files...
     [copy] Copying 2 files to /home/jv/workCapstone/Supplier/src99/ejb2/buildclient/META-INF

dist:
     [echo] Creating EJB JAR file....
      [jar] Building jar: /home/jv/workCapstone/Supplier/src99/ejb2/dist/ejb-jar-ic.jar
    [unjar] Expanding: /home/jv/workCapstone/Supplier/src99/ejb2/dist/ejb-jar-ic.jar into /home/jv/workCapstone/Supplier/src99/ejb2/dist/ejb
     [echo] Creating AppClient JAR file....
      [jar] Building jar: /home/jv/workCapstone/Supplier/src99/ejb2/dist/app-client-ic.jar
    [unjar] Expanding: /home/jv/workCapstone/Supplier/src99/ejb2/dist/app-client-ic.jar into /home/jv/workCapstone/Supplier/src99/ejb2/dist/appclient

ejb-jar_2_1:
     [echo] Checking ejb-jar.xml for version 2.1
     [echo] Initializing...
     [echo] /opt/SUNWappserver/jdk/bin:/opt/SUNWappserver/bin:/opt/apache-ant-1.6.0/bin:/home/jv/dbin:/usr/local/bin:/bin:/usr/bin:/usr/bin/X11:/usr/X11R6/bin
     [echo] .:/opt/SUNWappserver/lib/j2ee.jar

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/Supplier/src99/ejb2/etc/ejb-jar.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/Supplier/src99/ejb2/etc/ejb-jar.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

sun-ejb-jar_2_1:
     [echo] Checking sun-ejb-jar.xml for version 2.1
     [echo] Initializing...
     [echo] /opt/SUNWappserver/jdk/bin:/opt/SUNWappserver/bin:/opt/apache-ant-1.6.0/bin:/home/jv/dbin:/usr/local/bin:/bin:/usr/bin:/usr/bin/X11:/usr/X11R6/bin
     [echo] .:/opt/SUNWappserver/lib/j2ee.jar

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/Supplier/src99/ejb2/etc/sun-ejb-jar.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/Supplier/src99/ejb2/etc/sun-ejb-jar.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

application-client_1_4:
     [echo] Checking application-client.xml for version 1.4
     [echo] Initializing...
     [echo] /opt/SUNWappserver/jdk/bin:/opt/SUNWappserver/bin:/opt/apache-ant-1.6.0/bin:/home/jv/dbin:/usr/local/bin:/bin:/usr/bin:/usr/bin/X11:/usr/X11R6/bin
     [echo] .:/opt/SUNWappserver/lib/j2ee.jar

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/Supplier/src99/ejb2/etc/application-client.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/Supplier/src99/ejb2/etc/application-client.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

sun-application-client_1_4:
     [echo] Checking sun-application.xml for version 1.4
     [echo] Initializing...
     [echo] /opt/SUNWappserver/jdk/bin:/opt/SUNWappserver/bin:/opt/apache-ant-1.6.0/bin:/home/jv/dbin:/usr/local/bin:/bin:/usr/bin:/usr/bin/X11:/usr/X11R6/bin
     [echo] .:/opt/SUNWappserver/lib/j2ee.jar

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/Supplier/src99/ejb2/etc/sun-application-client.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/Supplier/src99/ejb2/etc/sun-application-client.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

checkXML:

all:
     [echo] Initializing...
     [echo] /opt/SUNWappserver/jdk/bin:/opt/SUNWappserver/bin:/opt/apache-ant-1.6.0/bin:/home/jv/dbin:/usr/local/bin:/bin:/usr/bin:/usr/bin/X11:/usr/X11R6/bin
     [echo] .:/opt/SUNWappserver/lib/j2ee.jar

application_1_4:
     [echo] Checking application.xml for version 1.4
     [echo] Initializing...
     [echo] /opt/SUNWappserver/jdk/bin:/opt/SUNWappserver/bin:/opt/apache-ant-1.6.0/bin:/home/jv/dbin:/usr/local/bin:/bin:/usr/bin:/usr/bin/X11:/usr/X11R6/bin
     [echo] .:/opt/SUNWappserver/lib/j2ee.jar

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/Supplier/src99/mdb1/etc/application.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/Supplier/src99/mdb1/etc/application.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

sun-application_1_4:
     [echo] Checking sun-application.xml for version 1.4
     [echo] Initializing...
     [echo] /opt/SUNWappserver/jdk/bin:/opt/SUNWappserver/bin:/opt/apache-ant-1.6.0/bin:/home/jv/dbin:/usr/local/bin:/bin:/usr/bin:/usr/bin/X11:/usr/X11R6/bin
     [echo] .:/opt/SUNWappserver/lib/j2ee.jar

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/Supplier/src99/mdb1/etc/sun-application.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/Supplier/src99/mdb1/etc/sun-application.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

ejb-jar_2_1:
     [echo] Checking ejb-jar.xml for version 2.1
     [echo] Initializing...
     [echo] /opt/SUNWappserver/jdk/bin:/opt/SUNWappserver/bin:/opt/apache-ant-1.6.0/bin:/home/jv/dbin:/usr/local/bin:/bin:/usr/bin:/usr/bin/X11:/usr/X11R6/bin
     [echo] .:/opt/SUNWappserver/lib/j2ee.jar

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/Supplier/src99/mdb1/etc/ejb-jar.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/Supplier/src99/mdb1/etc/ejb-jar.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

sun-ejb-jar_2_1:
     [echo] Checking sun-ejb-jar.xml for version 2.1
     [echo] Initializing...
     [echo] /opt/SUNWappserver/jdk/bin:/opt/SUNWappserver/bin:/opt/apache-ant-1.6.0/bin:/home/jv/dbin:/usr/local/bin:/bin:/usr/bin:/usr/bin/X11:/usr/X11R6/bin
     [echo] .:/opt/SUNWappserver/lib/j2ee.jar

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/Supplier/src99/mdb1/etc/sun-ejb-jar.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/Supplier/src99/mdb1/etc/sun-ejb-jar.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

application-client_1_4:
     [echo] Checking application-client.xml for version 1.4
     [echo] Initializing...
     [echo] /opt/SUNWappserver/jdk/bin:/opt/SUNWappserver/bin:/opt/apache-ant-1.6.0/bin:/home/jv/dbin:/usr/local/bin:/bin:/usr/bin:/usr/bin/X11:/usr/X11R6/bin
     [echo] .:/opt/SUNWappserver/lib/j2ee.jar

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/Supplier/src99/mdb1/etc/application-client.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/Supplier/src99/mdb1/etc/application-client.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

sun-application-client_1_4:
     [echo] Checking sun-application.xml for version 1.4
     [echo] Initializing...
     [echo] /opt/SUNWappserver/jdk/bin:/opt/SUNWappserver/bin:/opt/apache-ant-1.6.0/bin:/home/jv/dbin:/usr/local/bin:/bin:/usr/bin:/usr/bin/X11:/usr/X11R6/bin
     [echo] .:/opt/SUNWappserver/lib/j2ee.jar

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/Supplier/src99/mdb1/etc/sun-application-client.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/Supplier/src99/mdb1/etc/sun-application-client.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

checkXML:

clean:
     [echo] Remove build and distributables...
   [delete] Deleting 12 files from /home/jv/workCapstone/Supplier/src99/mdb1/build
   [delete] Deleted 8 directories from /home/jv/workCapstone/Supplier/src99/mdb1/build
   [delete] Deleting 18 files from /home/jv/workCapstone/Supplier/src99/mdb1/dist
   [delete] Deleted 8 directories from /home/jv/workCapstone/Supplier/src99/mdb1/dist

mkdirs:
     [echo] Create directories...
    [mkdir] Created dir: /home/jv/workCapstone/Supplier/src99/mdb1/dist
    [mkdir] Created dir: /home/jv/workCapstone/Supplier/src99/mdb1/dist/ear
    [mkdir] Created dir: /home/jv/workCapstone/Supplier/src99/mdb1/dist/ejb
    [mkdir] Created dir: /home/jv/workCapstone/Supplier/src99/mdb1/dist/appclient
    [mkdir] Created dir: /home/jv/workCapstone/Supplier/src99/mdb1/build
    [mkdir] Created dir: /home/jv/workCapstone/Supplier/src99/mdb1/build/ear
    [mkdir] Created dir: /home/jv/workCapstone/Supplier/src99/mdb1/build/ear/META-INF
    [mkdir] Created dir: /home/jv/workCapstone/Supplier/src99/mdb1/build/appclient
    [mkdir] Created dir: /home/jv/workCapstone/Supplier/src99/mdb1/build/appclient/META-INF
    [mkdir] Created dir: /home/jv/workCapstone/Supplier/src99/mdb1/build/ejb
    [mkdir] Created dir: /home/jv/workCapstone/Supplier/src99/mdb1/build/ejb/META-INF

compile:
     [echo] Compiling EJB java...
    [javac] Compiling 2 source files to /home/jv/workCapstone/Supplier/src99/mdb1/build/ejb
     [echo] Compiling appClient java...
    [javac] Compiling 1 source file to /home/jv/workCapstone/Supplier/src99/mdb1/build/appclient

build:
     [echo] Copying files from lib...
     [echo] Copying common JAR from common...
     [copy] Copying 1 file to /home/jv/workCapstone/Supplier/src99/mdb1/build/ejb
     [echo] Copying EAR META-INF/*.xml files...
     [copy] Copying 2 files to /home/jv/workCapstone/Supplier/src99/mdb1/build/ear/META-INF
     [echo] Copying EJB META-INF/*.xml files...
     [copy] Copying 2 files to /home/jv/workCapstone/Supplier/src99/mdb1/build/ejb/META-INF
     [echo] Copying appClient META-INF/*.xml files...
     [copy] Copying 2 files to /home/jv/workCapstone/Supplier/src99/mdb1/build/appclient/META-INF

dist:
     [echo] Creating EJB JAR file....
      [jar] Building jar: /home/jv/workCapstone/Supplier/src99/mdb1/dist/ejb/ejb-jar-ic.jar
    [unjar] Expanding: /home/jv/workCapstone/Supplier/src99/mdb1/dist/ejb/ejb-jar-ic.jar into /home/jv/workCapstone/Supplier/src99/mdb1/dist/ejb
     [echo] Creating AppClient JAR file....
      [jar] Building jar: /home/jv/workCapstone/Supplier/src99/mdb1/dist/appclient/app-client-ic.jar
    [unjar] Expanding: /home/jv/workCapstone/Supplier/src99/mdb1/dist/appclient/app-client-ic.jar into /home/jv/workCapstone/Supplier/src99/mdb1/dist/appclient
     [echo] Copying EJB JAR files...
     [copy] Copying 1 file to /home/jv/workCapstone/Supplier/src99/mdb1/build/ear
     [copy] Copying 1 file to /home/jv/workCapstone/Supplier/src99/mdb1/build/ear
     [echo] Creating EJB JAR file....
      [jar] Building jar: /home/jv/workCapstone/Supplier/src99/mdb1/dist/workmdbEAR.ear
     [echo] Expanding EAR file....
    [unjar] Expanding: /home/jv/workCapstone/Supplier/src99/mdb1/dist/workmdbEAR.ear into /home/jv/workCapstone/Supplier/src99/mdb1/dist/ear

all:

clean:
     [echo] Remove build and distributables...
   [delete] Deleting 82 files from /home/jv/workCapstone/Supplier/src99/war/build
   [delete] Deleted 9 directories from /home/jv/workCapstone/Supplier/src99/war/build
   [delete] Deleting 84 files from /home/jv/workCapstone/Supplier/src99/war/dist
   [delete] Deleted 11 directories from /home/jv/workCapstone/Supplier/src99/war/dist
   [delete] Deleting 65 files from /home/jv/workCapstone/Supplier/src99/war/JSPtest
   [delete] Deleted 14 directories from /home/jv/workCapstone/Supplier/src99/war/JSPtest

mkdirs:
     [echo] Create directories...
    [mkdir] Created dir: /home/jv/workCapstone/Supplier/src99/war/dist
    [mkdir] Created dir: /home/jv/workCapstone/Supplier/src99/war/dist/contents
    [mkdir] Created dir: /home/jv/workCapstone/Supplier/src99/war/build
    [mkdir] Created dir: /home/jv/workCapstone/Supplier/src99/war/build/WEB-INF
    [mkdir] Created dir: /home/jv/workCapstone/Supplier/src99/war/build/WEB-INF/classes
    [mkdir] Created dir: /home/jv/workCapstone/Supplier/src99/war/build/WEB-INF/lib

compile:
     [echo] Compiling java...
    [javac] Compiling 22 source files to /home/jv/workCapstone/Supplier/src99/war/build/WEB-INF/classes
    [javac] Note: Some input files use or override a deprecated API.
    [javac] Note: Recompile with -deprecation for details.

copyStrutsLibs:
     [echo] Copying Libs...
     [copy] Copying 10 files to /home/jv/workCapstone/Supplier/src99/war/build/WEB-INF/lib
     [echo] Copying Tlds...
     [copy] Copying 6 files to /home/jv/workCapstone/Supplier/src99/war/build/WEB-INF

copyLibs:

build:
     [echo] Copying WEB-INF/*.xml files...
     [copy] Copying 3 files to /home/jv/workCapstone/Supplier/src99/war/build/WEB-INF
     [echo] Copying files from lib...
     [echo] Copying common JAR from common...
     [copy] Copying 1 file to /home/jv/workCapstone/Supplier/src99/war/build/WEB-INF/lib
     [echo] Copying wsdl JAR from Distributor...
     [copy] Copying 1 file to /home/jv/workCapstone/Supplier/src99/war/build/WEB-INF/lib
     [echo] Copying files from tags...
     [echo] Copying html, jsp, css, jpg etc files...
     [copy] Copying 38 files to /home/jv/workCapstone/Supplier/src99/war/build
     [echo] Copying resources files...
     [copy] Copying 1 file to /home/jv/workCapstone/Supplier/src99/war/build/WEB-INF/classes/resources

dist:
     [echo] Creating WAR file....
      [jar] Building jar: /home/jv/workCapstone/Supplier/src99/war/dist/war-ic.war
    [unwar] Expanding: /home/jv/workCapstone/Supplier/src99/war/dist/war-ic.war into /home/jv/workCapstone/Supplier/src99/war/dist/contents

sun-webXML-2-4:
     [echo] Checking sun-web.xml for version 2.4

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/Supplier/src99/war/etc/sun-web.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/Supplier/src99/war/etc/sun-web.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

webXML-2-4:
     [echo] Checking web.xml for version 2.4

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/Supplier/src99/war/etc/web.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/Supplier/src99/war/etc/web.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

checkStrutsXML:
     [echo] Checking struts-config.xml

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/Supplier/src99/war/etc/struts-config.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/Supplier/src99/war/etc/struts-config.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:
     [echo] Checking tiles-defs.xml

XMLinit:

XMLExist:

XMLNoExist:
     [echo] WARNING: /home/jv/workCapstone/Supplier/src99/war/etc/tiles-defs.xml does not exist.

XMLValidate:
     [echo] Checking validation.xml

XMLinit:

XMLExist:

XMLNoExist:
     [echo] WARNING: /home/jv/workCapstone/Supplier/src99/war/etc/validation.xml does not exist.

XMLValidate:
     [echo] Checking validator-rules.xml

XMLinit:

XMLExist:

XMLNoExist:
     [echo] WARNING: /home/jv/workCapstone/Supplier/src99/war/etc/validator-rules.xml does not exist.

XMLValidate:

checkXML:

precompileJSP_clean:
     [echo] Cleaning JSP Validate....

precompileJSP:
     [echo] Precompiling JSP to Java code...
    [mkdir] Created dir: /home/jv/workCapstone/Supplier/src99/war/JSPtest
    [mkdir] Created dir: /home/jv/workCapstone/Supplier/src99/war/JSPtest/java
    [mkdir] Created dir: /home/jv/workCapstone/Supplier/src99/war/JSPtest/classes
    [mkdir] Created dir: /home/jv/workCapstone/Supplier/src99/war/JSPtest/generated
     [java] Aug 3, 2004 9:11:41 AM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /index.jsp
     [java] Aug 3, 2004 9:11:41 AM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/Parameters.jsp
     [java] Aug 3, 2004 9:11:41 AM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/Welcome.jsp
     [java] Aug 3, 2004 9:11:42 AM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/SendCollection.jsp
     [java] Aug 3, 2004 9:11:42 AM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/Main.jsp
     [java] Aug 3, 2004 9:11:42 AM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/ViewLogout.jsp
     [java] Aug 3, 2004 9:11:42 AM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/Fatal.jsp
     [java] Aug 3, 2004 9:11:43 AM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/Construction.jsp
     [java] Aug 3, 2004 9:11:43 AM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/Barcodes.jsp
     [java] Aug 3, 2004 9:11:44 AM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/Logon.jsp
     [java] Aug 3, 2004 9:11:44 AM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/Tabs.jsp
     [java] Aug 3, 2004 9:11:44 AM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/Error.jsp
     [java] Aug 3, 2004 9:11:44 AM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/Contracts.jsp
     [java] Aug 3, 2004 9:11:44 AM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/MainMenu.jsp
     [java] Aug 3, 2004 9:11:44 AM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/LogonBody.jsp
     [java] Aug 3, 2004 9:11:45 AM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/Alerts.jsp
     [java] Aug 3, 2004 9:11:45 AM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/TabsBody.jsp
     [java] Aug 3, 2004 9:11:45 AM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/ConstructionBody.jsp
     [java] Aug 3, 2004 9:11:45 AM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/News.jsp
     [java] Aug 3, 2004 9:11:45 AM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/ConstructionMenu.jsp
     [java] Aug 3, 2004 9:11:45 AM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/Shipments.jsp
     [java] Aug 3, 2004 9:11:45 AM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/Comments.jsp
     [java] Aug 3, 2004 9:11:45 AM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/SendCollection.jsp
     [java] Aug 3, 2004 9:11:46 AM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/Products.jsp
     [java] Aug 3, 2004 9:11:46 AM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/Barcodes.jsp
     [java] Aug 3, 2004 9:11:46 AM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/Picture.jsp
     [java] Aug 3, 2004 9:11:46 AM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/Footer.jsp
     [java] Aug 3, 2004 9:11:46 AM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/Header.jsp
     [java] Aug 3, 2004 9:11:46 AM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/Characteristics.jsp
     [java] Aug 3, 2004 9:11:47 AM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/MainBody.jsp
     [java] Aug 3, 2004 9:11:47 AM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/Features.jsp
     [java] Aug 3, 2004 9:11:47 AM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/Welcome.jsp



CompileJSP:
     [echo] Compiling translated JSP code...
    [javac] Compiling 32 source files to /home/jv/workCapstone/Supplier/src99/war/JSPtest/classes

all:
     [echo] Initializing...
     [echo] /opt/SUNWappserver/jdk/bin:/opt/SUNWappserver/bin:/opt/apache-ant-1.6.0/bin:/home/jv/dbin:/usr/local/bin:/bin:/usr/bin:/usr/bin/X11:/usr/X11R6/bin
     [echo] .:/opt/SUNWappserver/lib/j2ee.jar

clean:
     [echo] Remove build and distributables...
   [delete] Deleting 7 files from /home/jv/workCapstone/Supplier/src99/ear/build
   [delete] Deleted 2 directories from /home/jv/workCapstone/Supplier/src99/ear/build
   [delete] Deleting 93 files from /home/jv/workCapstone/Supplier/src99/ear/dist
   [delete] Deleted 13 directories from /home/jv/workCapstone/Supplier/src99/ear/dist

mkdirs:
     [echo] Create directories...
    [mkdir] Created dir: /home/jv/workCapstone/Supplier/src99/ear/dist
    [mkdir] Created dir: /home/jv/workCapstone/Supplier/src99/ear/dist/ear
    [mkdir] Created dir: /home/jv/workCapstone/Supplier/src99/ear/build
    [mkdir] Created dir: /home/jv/workCapstone/Supplier/src99/ear/build/META-INF

build:
     [echo] Copying EAR JAR files...
     [copy] Copying 1 file to /home/jv/workCapstone/Supplier/src99/ear/build
     [echo] Copying EJB2 JAR files...
     [copy] Copying 1 file to /home/jv/workCapstone/Supplier/src99/ear/build
     [copy] Copying 1 file to /home/jv/workCapstone/Supplier/src99/ear/build
     [echo] Copying MDB1 JAR files...
     [copy] Copying 1 file to /home/jv/workCapstone/Supplier/src99/ear/build
     [copy] Copying 1 file to /home/jv/workCapstone/Supplier/src99/ear/build
     [echo] Copying EAR META-INF/*.xml files...
     [copy] Copying 2 files to /home/jv/workCapstone/Supplier/src99/ear/build/META-INF

dist:
     [echo] Creating EJB JAR file....
      [jar] Building jar: /home/jv/workCapstone/Supplier/src99/ear/dist/SupplierEAR.ear
     [echo] Expanding EAR file....
    [unjar] Expanding: /home/jv/workCapstone/Supplier/src99/ear/dist/SupplierEAR.ear into /home/jv/workCapstone/Supplier/src99/ear/dist/ear
     [echo] Expanding WAR file....
    [unjar] Expanding: /home/jv/workCapstone/Supplier/src99/ear/dist/ear/war-ic.war into /home/jv/workCapstone/Supplier/src99/ear/dist/war

application_1_4:
     [echo] Checking application.xml for version 1.4
     [echo] Initializing...
     [echo] /opt/SUNWappserver/jdk/bin:/opt/SUNWappserver/bin:/opt/apache-ant-1.6.0/bin:/home/jv/dbin:/usr/local/bin:/bin:/usr/bin:/usr/bin/X11:/usr/X11R6/bin
     [echo] .:/opt/SUNWappserver/lib/j2ee.jar

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/Supplier/src99/ear/etc/application.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/Supplier/src99/ear/etc/application.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

sun-application_1_4:
     [echo] Checking sun-application.xml for version 1.4
     [echo] Initializing...
     [echo] /opt/SUNWappserver/jdk/bin:/opt/SUNWappserver/bin:/opt/apache-ant-1.6.0/bin:/home/jv/dbin:/usr/local/bin:/bin:/usr/bin:/usr/bin/X11:/usr/X11R6/bin
     [echo] .:/opt/SUNWappserver/lib/j2ee.jar

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/Supplier/src99/ear/etc/sun-application.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/Supplier/src99/ear/etc/sun-application.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

checkXML:

all:
     [echo] Initializing...
     [echo] /opt/SUNWappserver/jdk/bin:/opt/SUNWappserver/bin:/opt/apache-ant-1.6.0/bin:/home/jv/dbin:/usr/local/bin:/bin:/usr/bin:/usr/bin/X11:/usr/X11R6/bin
     [echo] .:/opt/SUNWappserver/lib/j2ee.jar

tools:

deploy:
     [exec] deploy --password yetiyeti --secure=false --user admin --terse=false --target server --echo=true --upload=true --dbvendorname oracle --port 4848 --interactive=true --enabled=true --retrieve /home/jv/workCapstone/Supplier/src99/ear/dist --host localhost --precompilejsp=true --force=true --verify=false --name SupplierEAR /home/jv/workCapstone/Supplier/src99/ear/dist/SupplierEAR.ear
     [exec] Command deploy executed successfully.



BUILD SUCCESSFUL
Total time: 2 minutes 27 seconds
