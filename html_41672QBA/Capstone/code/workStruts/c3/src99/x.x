Buildfile: build.xml

dist:
     [echo] Initializing...
     [echo] /opt/SUNWappserver/jdk/bin:/opt/SUNWappserver/bin:/opt/apache-ant-1.6.0/bin:/home/jv/dbin:/usr/local/bin:/bin:/usr/bin:/usr/bin/X11:/usr/X11R6/bin
     [echo] .:/opt/SUNWappserver/lib/j2ee.jar

clean:
     [echo] Remove build and distributables...
   [delete] Deleting 7 files from /home/jv/workStruts/c3/src99/common/build
   [delete] Deleted 3 directories from /home/jv/workStruts/c3/src99/common/build
   [delete] Deleting 9 files from /home/jv/workStruts/c3/src99/common/dist
   [delete] Deleted 4 directories from /home/jv/workStruts/c3/src99/common/dist

mkdirs:
     [echo] Create directories...
    [mkdir] Created dir: /home/jv/workStruts/c3/src99/common/dist
    [mkdir] Created dir: /home/jv/workStruts/c3/src99/common/dist/contents
    [mkdir] Created dir: /home/jv/workStruts/c3/src99/common/build
    [mkdir] Created dir: /home/jv/workStruts/c3/src99/common/build/META-INF

compile:
     [echo] Compiling java...
    [javac] Compiling 7 source files to /home/jv/workStruts/c3/src99/common/build

build:
     [echo] Copying files from lib...

dist:
     [echo] Creating JAR file....
      [jar] Building jar: /home/jv/workStruts/c3/src99/common/dist/jar-common.jar
    [unjar] Expanding: /home/jv/workStruts/c3/src99/common/dist/jar-common.jar into /home/jv/workStruts/c3/src99/common/dist/contents

all:
     [echo] Initializing...
     [echo] /opt/SUNWappserver/jdk/bin:/opt/SUNWappserver/bin:/opt/apache-ant-1.6.0/bin:/home/jv/dbin:/usr/local/bin:/bin:/usr/bin:/usr/bin/X11:/usr/X11R6/bin
     [echo] .:/opt/SUNWappserver/lib/j2ee.jar

clean:
     [echo] Remove build and distributables...
   [delete] Deleting 5 files from /home/jv/workStruts/c3/src99/ejb1/build
   [delete] Deleted 3 directories from /home/jv/workStruts/c3/src99/ejb1/build
   [delete] Deleting 3 files from /home/jv/workStruts/c3/src99/ejb1/buildclient
   [delete] Deleted 2 directories from /home/jv/workStruts/c3/src99/ejb1/buildclient
   [delete] Deleting 12 files from /home/jv/workStruts/c3/src99/ejb1/dist
   [delete] Deleted 6 directories from /home/jv/workStruts/c3/src99/ejb1/dist

mkdirs:
     [echo] Create directories...
    [mkdir] Created dir: /home/jv/workStruts/c3/src99/ejb1/dist
    [mkdir] Created dir: /home/jv/workStruts/c3/src99/ejb1/dist/ejb
    [mkdir] Created dir: /home/jv/workStruts/c3/src99/ejb1/dist/appclient
    [mkdir] Created dir: /home/jv/workStruts/c3/src99/ejb1/build
    [mkdir] Created dir: /home/jv/workStruts/c3/src99/ejb1/build/META-INF
    [mkdir] Created dir: /home/jv/workStruts/c3/src99/ejb1/buildclient
    [mkdir] Created dir: /home/jv/workStruts/c3/src99/ejb1/buildclient/META-INF

compile:
     [echo] Compiling EJB java...
    [javac] Compiling 3 source files to /home/jv/workStruts/c3/src99/ejb1/build
     [echo] Compiling appClient java...
    [javac] Compiling 1 source file to /home/jv/workStruts/c3/src99/ejb1/buildclient

build:
     [echo] Copying EJB META-INF/*.xml files...
     [copy] Copying 2 files to /home/jv/workStruts/c3/src99/ejb1/build/META-INF
     [echo] Copying appClient META-INF/*.xml files...
     [copy] Copying 2 files to /home/jv/workStruts/c3/src99/ejb1/buildclient/META-INF

dist:
     [echo] Creating EJB JAR file....
      [jar] Building jar: /home/jv/workStruts/c3/src99/ejb1/dist/ejb-jar-ic.jar
    [unjar] Expanding: /home/jv/workStruts/c3/src99/ejb1/dist/ejb-jar-ic.jar into /home/jv/workStruts/c3/src99/ejb1/dist/ejb
     [echo] Creating AppClient JAR file....
      [jar] Building jar: /home/jv/workStruts/c3/src99/ejb1/dist/app-client-ic.jar
    [unjar] Expanding: /home/jv/workStruts/c3/src99/ejb1/dist/app-client-ic.jar into /home/jv/workStruts/c3/src99/ejb1/dist/appclient

ejb-jar_2_1:
     [echo] Checking ejb-jar.xml for version 2.1
     [echo] Initializing...
     [echo] /opt/SUNWappserver/jdk/bin:/opt/SUNWappserver/bin:/opt/apache-ant-1.6.0/bin:/home/jv/dbin:/usr/local/bin:/bin:/usr/bin:/usr/bin/X11:/usr/X11R6/bin
     [echo] .:/opt/SUNWappserver/lib/j2ee.jar

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workStruts/c3/src99/ejb1/etc/ejb-jar.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workStruts/c3/src99/ejb1/etc/ejb-jar.xml
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
     [echo] Checking /home/jv/workStruts/c3/src99/ejb1/etc/sun-ejb-jar.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workStruts/c3/src99/ejb1/etc/sun-ejb-jar.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

checkXML:

all:
     [echo] Initializing...
     [echo] /opt/SUNWappserver/jdk/bin:/opt/SUNWappserver/bin:/opt/apache-ant-1.6.0/bin:/home/jv/dbin:/usr/local/bin:/bin:/usr/bin:/usr/bin/X11:/usr/X11R6/bin
     [echo] .:/opt/SUNWappserver/lib/j2ee.jar

clean:
     [echo] Remove build and distributables...
   [delete] Deleting 7 files from /home/jv/workStruts/c3/src99/ejb2/build
   [delete] Deleted 3 directories from /home/jv/workStruts/c3/src99/ejb2/build
   [delete] Deleting 3 files from /home/jv/workStruts/c3/src99/ejb2/buildclient
   [delete] Deleted 2 directories from /home/jv/workStruts/c3/src99/ejb2/buildclient
   [delete] Deleting 14 files from /home/jv/workStruts/c3/src99/ejb2/dist
   [delete] Deleted 6 directories from /home/jv/workStruts/c3/src99/ejb2/dist

mkdirs:
     [echo] Create directories...
    [mkdir] Created dir: /home/jv/workStruts/c3/src99/ejb2/dist
    [mkdir] Created dir: /home/jv/workStruts/c3/src99/ejb2/dist/ejb
    [mkdir] Created dir: /home/jv/workStruts/c3/src99/ejb2/dist/appclient
    [mkdir] Created dir: /home/jv/workStruts/c3/src99/ejb2/build
    [mkdir] Created dir: /home/jv/workStruts/c3/src99/ejb2/build/META-INF
    [mkdir] Created dir: /home/jv/workStruts/c3/src99/ejb2/buildclient
    [mkdir] Created dir: /home/jv/workStruts/c3/src99/ejb2/buildclient/META-INF

compile:
     [echo] Compiling EJB java...
    [javac] Compiling 4 source files to /home/jv/workStruts/c3/src99/ejb2/build
     [echo] Compiling appClient java...
    [javac] Compiling 1 source file to /home/jv/workStruts/c3/src99/ejb2/buildclient

build:
     [echo] Copying common JAR from common...
     [copy] Copying 1 file to /home/jv/workStruts/c3/src99/ejb2/build
     [echo] Copying EJB META-INF/*.xml files...
     [copy] Copying 2 files to /home/jv/workStruts/c3/src99/ejb2/build/META-INF
     [echo] Copying appClient META-INF/*.xml files...
     [copy] Copying 2 files to /home/jv/workStruts/c3/src99/ejb2/buildclient/META-INF

dist:
     [echo] Creating EJB JAR file....
      [jar] Building jar: /home/jv/workStruts/c3/src99/ejb2/dist/ejb-jar-ic.jar
    [unjar] Expanding: /home/jv/workStruts/c3/src99/ejb2/dist/ejb-jar-ic.jar into /home/jv/workStruts/c3/src99/ejb2/dist/ejb
     [echo] Creating AppClient JAR file....
      [jar] Building jar: /home/jv/workStruts/c3/src99/ejb2/dist/app-client-ic.jar
    [unjar] Expanding: /home/jv/workStruts/c3/src99/ejb2/dist/app-client-ic.jar into /home/jv/workStruts/c3/src99/ejb2/dist/appclient

ejb-jar_2_1:
     [echo] Checking ejb-jar.xml for version 2.1
     [echo] Initializing...
     [echo] /opt/SUNWappserver/jdk/bin:/opt/SUNWappserver/bin:/opt/apache-ant-1.6.0/bin:/home/jv/dbin:/usr/local/bin:/bin:/usr/bin:/usr/bin/X11:/usr/X11R6/bin
     [echo] .:/opt/SUNWappserver/lib/j2ee.jar

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workStruts/c3/src99/ejb2/etc/ejb-jar.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workStruts/c3/src99/ejb2/etc/ejb-jar.xml
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
     [echo] Checking /home/jv/workStruts/c3/src99/ejb2/etc/sun-ejb-jar.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workStruts/c3/src99/ejb2/etc/sun-ejb-jar.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

checkXML:

all:
     [echo] Initializing...
     [echo] /opt/SUNWappserver/jdk/bin:/opt/SUNWappserver/bin:/opt/apache-ant-1.6.0/bin:/home/jv/dbin:/usr/local/bin:/bin:/usr/bin:/usr/bin/X11:/usr/X11R6/bin
     [echo] .:/opt/SUNWappserver/lib/j2ee.jar

clean:
     [echo] Remove build and distributables...
   [delete] Deleting 91 files from /home/jv/workStruts/c3/src99/war/build
   [delete] Deleted 9 directories from /home/jv/workStruts/c3/src99/war/build
   [delete] Deleting 93 files from /home/jv/workStruts/c3/src99/war/dist
   [delete] Deleted 11 directories from /home/jv/workStruts/c3/src99/war/dist
   [delete] Deleting 67 files from /home/jv/workStruts/c3/src99/war/JSPtest
   [delete] Deleted 14 directories from /home/jv/workStruts/c3/src99/war/JSPtest

mkdirs:
     [echo] Create directories...
    [mkdir] Created dir: /home/jv/workStruts/c3/src99/war/dist
    [mkdir] Created dir: /home/jv/workStruts/c3/src99/war/dist/contents
    [mkdir] Created dir: /home/jv/workStruts/c3/src99/war/build
    [mkdir] Created dir: /home/jv/workStruts/c3/src99/war/build/WEB-INF
    [mkdir] Created dir: /home/jv/workStruts/c3/src99/war/build/WEB-INF/classes
    [mkdir] Created dir: /home/jv/workStruts/c3/src99/war/build/WEB-INF/lib

compile:
     [echo] Compiling java...
    [javac] Compiling 28 source files to /home/jv/workStruts/c3/src99/war/build/WEB-INF/classes
    [javac] Note: Some input files use or override a deprecated API.
    [javac] Note: Recompile with -deprecation for details.

copyStrutsLibs:
     [echo] Copying Libs...
     [copy] Copying 10 files to /home/jv/workStruts/c3/src99/war/build/WEB-INF/lib
     [echo] Copying Tlds...
     [copy] Copying 6 files to /home/jv/workStruts/c3/src99/war/build/WEB-INF

copyLibs:

build:
     [echo] Copying WEB-INF/*.xml files...
     [copy] Copying 3 files to /home/jv/workStruts/c3/src99/war/build/WEB-INF
     [echo] Copying files from lib...
     [echo] Copying common JAR from common...
     [copy] Copying 1 file to /home/jv/workStruts/c3/src99/war/build/WEB-INF/lib
     [echo] Copying files from tags...
     [echo] Copying html, jsp, css, jpg etc files...
     [copy] Copying 40 files to /home/jv/workStruts/c3/src99/war/build
     [echo] Copying resources files...
     [copy] Copying 2 files to /home/jv/workStruts/c3/src99/war/build/WEB-INF/classes/resources

dist:
     [echo] Creating WAR file....
      [jar] Building jar: /home/jv/workStruts/c3/src99/war/dist/war-ic.war
    [unwar] Expanding: /home/jv/workStruts/c3/src99/war/dist/war-ic.war into /home/jv/workStruts/c3/src99/war/dist/contents

sun-webXML-2-4:
     [echo] Checking sun-web.xml for version 2.4
     [echo] Initializing...
     [echo] /opt/SUNWappserver/jdk/bin:/opt/SUNWappserver/bin:/opt/apache-ant-1.6.0/bin:/home/jv/dbin:/usr/local/bin:/bin:/usr/bin:/usr/bin/X11:/usr/X11R6/bin
     [echo] .:/opt/SUNWappserver/lib/j2ee.jar

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workStruts/c3/src99/war/etc/sun-web.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workStruts/c3/src99/war/etc/sun-web.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

webXML-2-4:
     [echo] Checking web.xml for version 2.4
     [echo] Initializing...
     [echo] /opt/SUNWappserver/jdk/bin:/opt/SUNWappserver/bin:/opt/apache-ant-1.6.0/bin:/home/jv/dbin:/usr/local/bin:/bin:/usr/bin:/usr/bin/X11:/usr/X11R6/bin
     [echo] .:/opt/SUNWappserver/lib/j2ee.jar

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workStruts/c3/src99/war/etc/web.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workStruts/c3/src99/war/etc/web.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

checkStrutsXML:
     [echo] Checking struts-config.xml
     [echo] Initializing...
     [echo] /opt/SUNWappserver/jdk/bin:/opt/SUNWappserver/bin:/opt/apache-ant-1.6.0/bin:/home/jv/dbin:/usr/local/bin:/bin:/usr/bin:/usr/bin/X11:/usr/X11R6/bin
     [echo] .:/opt/SUNWappserver/lib/j2ee.jar

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workStruts/c3/src99/war/etc/struts-config.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workStruts/c3/src99/war/etc/struts-config.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:
     [echo] Checking tiles-defs.xml
     [echo] Initializing...
     [echo] /opt/SUNWappserver/jdk/bin:/opt/SUNWappserver/bin:/opt/apache-ant-1.6.0/bin:/home/jv/dbin:/usr/local/bin:/bin:/usr/bin:/usr/bin/X11:/usr/X11R6/bin
     [echo] .:/opt/SUNWappserver/lib/j2ee.jar

XMLinit:

XMLExist:

XMLNoExist:
     [echo] WARNING: /home/jv/workStruts/c3/src99/war/etc/tiles-defs.xml does not exist.

XMLValidate:
     [echo] Checking validation.xml
     [echo] Initializing...
     [echo] /opt/SUNWappserver/jdk/bin:/opt/SUNWappserver/bin:/opt/apache-ant-1.6.0/bin:/home/jv/dbin:/usr/local/bin:/bin:/usr/bin:/usr/bin/X11:/usr/X11R6/bin
     [echo] .:/opt/SUNWappserver/lib/j2ee.jar

XMLinit:

XMLExist:

XMLNoExist:
     [echo] WARNING: /home/jv/workStruts/c3/src99/war/etc/validation.xml does not exist.

XMLValidate:
     [echo] Checking validator-rules.xml
     [echo] Initializing...
     [echo] /opt/SUNWappserver/jdk/bin:/opt/SUNWappserver/bin:/opt/apache-ant-1.6.0/bin:/home/jv/dbin:/usr/local/bin:/bin:/usr/bin:/usr/bin/X11:/usr/X11R6/bin
     [echo] .:/opt/SUNWappserver/lib/j2ee.jar

XMLinit:

XMLExist:

XMLNoExist:
     [echo] WARNING: /home/jv/workStruts/c3/src99/war/etc/validator-rules.xml does not exist.

XMLValidate:

checkXML:

precompileJSP_clean:
     [echo] Cleaning JSP Validate....

precompileJSP:
     [echo] Precompiling JSP to Java code...
    [mkdir] Created dir: /home/jv/workStruts/c3/src99/war/JSPtest
    [mkdir] Created dir: /home/jv/workStruts/c3/src99/war/JSPtest/java
    [mkdir] Created dir: /home/jv/workStruts/c3/src99/war/JSPtest/classes
    [mkdir] Created dir: /home/jv/workStruts/c3/src99/war/JSPtest/generated
     [java] Jun 23, 2004 3:03:06 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /index.jsp
     [java] Jun 23, 2004 3:03:06 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/ViewCart.jsp
     [java] Jun 23, 2004 3:03:06 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/ViewCatalogs.jsp
     [java] Jun 23, 2004 3:03:07 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/CartUpdate.jsp
     [java] Jun 23, 2004 3:03:07 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/Register.jsp
     [java] Jun 23, 2004 3:03:07 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/EJBTest1.jsp
     [java] Jun 23, 2004 3:03:08 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/Construction.jsp
     [java] Jun 23, 2004 3:03:08 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/Main.jsp
     [java] Jun 23, 2004 3:03:08 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/ViewLogout.jsp
     [java] Jun 23, 2004 3:03:08 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/CatalogItems.jsp
     [java] Jun 23, 2004 3:03:09 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/Cart.jsp
     [java] Jun 23, 2004 3:03:09 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/Fatal.jsp
     [java] Jun 23, 2004 3:03:09 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/Checkout.jsp
     [java] Jun 23, 2004 3:03:09 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/ViewCheckout.jsp
     [java] Jun 23, 2004 3:03:09 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/Logon.jsp
     [java] Jun 23, 2004 3:03:09 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/Welcome.jsp
     [java] Jun 23, 2004 3:03:10 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/Tabs.jsp
     [java] Jun 23, 2004 3:03:10 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/Catalogs.jsp
     [java] Jun 23, 2004 3:03:10 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/Error.jsp
     [java] Jun 23, 2004 3:03:10 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/ViewHome.jsp
     [java] Jun 23, 2004 3:03:10 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/Parameters.jsp
     [java] Jun 23, 2004 3:03:10 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/MainBody.jsp
     [java] Jun 23, 2004 3:03:10 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/Features.jsp
     [java] Jun 23, 2004 3:03:10 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/MainMenu.jsp
     [java] Jun 23, 2004 3:03:10 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/ConstructionBody.jsp
     [java] Jun 23, 2004 3:03:10 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/Picture.jsp
     [java] Jun 23, 2004 3:03:10 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/Footer.jsp
     [java] Jun 23, 2004 3:03:10 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/Header.jsp
     [java] Jun 23, 2004 3:03:10 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/ConstructionMenu.jsp
     [java] Jun 23, 2004 3:03:10 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/Welcome.jsp
     [java] Jun 23, 2004 3:03:11 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/TabsBody.jsp
     [java] Jun 23, 2004 3:03:11 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/News.jsp
     [java] Jun 23, 2004 3:03:11 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/Comments.jsp



CompileJSP:
     [echo] Compiling translated JSP code...
    [javac] Compiling 33 source files to /home/jv/workStruts/c3/src99/war/JSPtest/classes

all:
     [echo] Initializing...
     [echo] /opt/SUNWappserver/jdk/bin:/opt/SUNWappserver/bin:/opt/apache-ant-1.6.0/bin:/home/jv/dbin:/usr/local/bin:/bin:/usr/bin:/usr/bin/X11:/usr/X11R6/bin
     [echo] .:/opt/SUNWappserver/lib/j2ee.jar

clean:
     [echo] Remove build and distributables...
   [delete] Deleting 7 files from /home/jv/workStruts/c3/src99/ear/build
   [delete] Deleted 2 directories from /home/jv/workStruts/c3/src99/ear/build
   [delete] Deleting 102 files from /home/jv/workStruts/c3/src99/ear/dist
   [delete] Deleted 13 directories from /home/jv/workStruts/c3/src99/ear/dist

mkdirs:
     [echo] Create directories...
    [mkdir] Created dir: /home/jv/workStruts/c3/src99/ear/dist
    [mkdir] Created dir: /home/jv/workStruts/c3/src99/ear/dist/ear
    [mkdir] Created dir: /home/jv/workStruts/c3/src99/ear/build
    [mkdir] Created dir: /home/jv/workStruts/c3/src99/ear/build/META-INF

build:
     [echo] Copying EAR JAR files...
     [copy] Copying 1 file to /home/jv/workStruts/c3/src99/ear/build
     [echo] Copying EJB 1 JAR files...
     [copy] Copying 1 file to /home/jv/workStruts/c3/src99/ear/build
     [copy] Copying 1 file to /home/jv/workStruts/c3/src99/ear/build
     [echo] Copying EJB 2 JAR files...
     [copy] Copying 1 file to /home/jv/workStruts/c3/src99/ear/build
     [copy] Copying 1 file to /home/jv/workStruts/c3/src99/ear/build
     [echo] Copying EAR META-INF/*.xml files...
     [copy] Copying 2 files to /home/jv/workStruts/c3/src99/ear/build/META-INF

dist:
     [echo] Creating EJB JAR file....
      [jar] Building jar: /home/jv/workStruts/c3/src99/ear/dist/ear.ear
     [echo] Expanding EAR file....
    [unjar] Expanding: /home/jv/workStruts/c3/src99/ear/dist/ear.ear into /home/jv/workStruts/c3/src99/ear/dist/ear
     [echo] Expanding WAR file....
    [unjar] Expanding: /home/jv/workStruts/c3/src99/ear/dist/ear/war-ic.war into /home/jv/workStruts/c3/src99/ear/dist/war

application_1_4:
     [echo] Checking application.xml for version 1.4
     [echo] Initializing...
     [echo] /opt/SUNWappserver/jdk/bin:/opt/SUNWappserver/bin:/opt/apache-ant-1.6.0/bin:/home/jv/dbin:/usr/local/bin:/bin:/usr/bin:/usr/bin/X11:/usr/X11R6/bin
     [echo] .:/opt/SUNWappserver/lib/j2ee.jar

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workStruts/c3/src99/ear/etc/application.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workStruts/c3/src99/ear/etc/application.xml
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
     [echo] Checking /home/jv/workStruts/c3/src99/ear/etc/sun-application.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workStruts/c3/src99/ear/etc/sun-application.xml
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
     [exec] deploy --password yetiyeti --secure=false --user admin --terse=false --target server --echo=true --upload=true --dbvendorname oracle --port 4848 --interactive=true --enabled=true --retrieve /home/jv/workStruts/c3/src99/ear/dist --host localhost --precompilejsp=true --force=true --verify=false --name ear /home/jv/workStruts/c3/src99/ear/dist/ear.ear
     [exec] Command deploy executed successfully.



BUILD SUCCESSFUL
Total time: 1 minute 50 seconds
