Buildfile: build.xml
     [echo] Initializing...
     [echo] /opt/SUNWappserver/jdk/bin:/opt/SUNWappserver/bin:/opt/apache-ant-1.6.0/bin:/home/jv/dbin:/usr/local/bin:/bin:/usr/bin:/usr/bin/X11:/usr/X11R6/bin
     [echo] .:/opt/SUNWappserver/lib/j2ee.jar

clean:
     [echo] Remove build and distributables...
   [delete] Deleting 41 files from /home/jv/workCapstone/Retailer/src99/war/build
   [delete] Deleted 5 directories from /home/jv/workCapstone/Retailer/src99/war/build
   [delete] Deleted 2 directories from /home/jv/workCapstone/Retailer/src99/war/dist

mkdirs:
     [echo] Create directories...
    [mkdir] Created dir: /home/jv/workCapstone/Retailer/src99/war/dist
    [mkdir] Created dir: /home/jv/workCapstone/Retailer/src99/war/dist/contents
    [mkdir] Created dir: /home/jv/workCapstone/Retailer/src99/war/build
    [mkdir] Created dir: /home/jv/workCapstone/Retailer/src99/war/build/WEB-INF
    [mkdir] Created dir: /home/jv/workCapstone/Retailer/src99/war/build/WEB-INF/classes
    [mkdir] Created dir: /home/jv/workCapstone/Retailer/src99/war/build/WEB-INF/lib

compile:
     [echo] Compiling java...
    [javac] Compiling 20 source files to /home/jv/workCapstone/Retailer/src99/war/build/WEB-INF/classes
    [javac] Note: Some input files use or override a deprecated API.
    [javac] Note: Recompile with -deprecation for details.

copyStrutsLibs:
     [echo] Copying Libs...
     [copy] Copying 10 files to /home/jv/workCapstone/Retailer/src99/war/build/WEB-INF/lib
     [echo] Copying Tlds...
     [copy] Copying 6 files to /home/jv/workCapstone/Retailer/src99/war/build/WEB-INF

copyLibs:

build:
     [echo] Copying WEB-INF/*.xml files...
     [copy] Copying 3 files to /home/jv/workCapstone/Retailer/src99/war/build/WEB-INF
     [echo] Copying files from lib...
     [echo] Copying common JAR from common...
     [copy] Copying 1 file to /home/jv/workCapstone/Retailer/src99/war/build/WEB-INF/lib
     [copy] Copying 1 file to /home/jv/workCapstone/Retailer/src99/war/build/WEB-INF/lib
     [echo] Copying files from tags...
     [echo] Copying html, jsp, css, jpg etc files...
     [copy] Copying 32 files to /home/jv/workCapstone/Retailer/src99/war/build
     [echo] Copying resources files...
     [copy] Copying 2 files to /home/jv/workCapstone/Retailer/src99/war/build/WEB-INF/classes/resources

dist:
     [echo] Creating WAR file....
      [jar] Building jar: /home/jv/workCapstone/Retailer/src99/war/dist/war-ic.war
    [unwar] Expanding: /home/jv/workCapstone/Retailer/src99/war/dist/war-ic.war into /home/jv/workCapstone/Retailer/src99/war/dist/contents

sun-webXML-2-4:
     [echo] Checking sun-web.xml for version 2.4
     [echo] Initializing...
     [echo] /opt/SUNWappserver/jdk/bin:/opt/SUNWappserver/bin:/opt/apache-ant-1.6.0/bin:/home/jv/dbin:/usr/local/bin:/bin:/usr/bin:/usr/bin/X11:/usr/X11R6/bin
     [echo] .:/opt/SUNWappserver/lib/j2ee.jar

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/Retailer/src99/war/etc/sun-web.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/Retailer/src99/war/etc/sun-web.xml
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
     [echo] Checking /home/jv/workCapstone/Retailer/src99/war/etc/web.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/Retailer/src99/war/etc/web.xml
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
     [echo] Checking /home/jv/workCapstone/Retailer/src99/war/etc/struts-config.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/Retailer/src99/war/etc/struts-config.xml
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
     [echo] WARNING: /home/jv/workCapstone/Retailer/src99/war/etc/tiles-defs.xml does not exist.

XMLValidate:
     [echo] Checking validation.xml
     [echo] Initializing...
     [echo] /opt/SUNWappserver/jdk/bin:/opt/SUNWappserver/bin:/opt/apache-ant-1.6.0/bin:/home/jv/dbin:/usr/local/bin:/bin:/usr/bin:/usr/bin/X11:/usr/X11R6/bin
     [echo] .:/opt/SUNWappserver/lib/j2ee.jar

XMLinit:

XMLExist:

XMLNoExist:
     [echo] WARNING: /home/jv/workCapstone/Retailer/src99/war/etc/validation.xml does not exist.

XMLValidate:
     [echo] Checking validator-rules.xml
     [echo] Initializing...
     [echo] /opt/SUNWappserver/jdk/bin:/opt/SUNWappserver/bin:/opt/apache-ant-1.6.0/bin:/home/jv/dbin:/usr/local/bin:/bin:/usr/bin:/usr/bin/X11:/usr/X11R6/bin
     [echo] .:/opt/SUNWappserver/lib/j2ee.jar

XMLinit:

XMLExist:

XMLNoExist:
     [echo] WARNING: /home/jv/workCapstone/Retailer/src99/war/etc/validator-rules.xml does not exist.

XMLValidate:

checkXML:

precompileJSP_clean:
     [echo] Cleaning JSP Validate....

precompileJSP:
     [echo] Precompiling JSP to Java code...
    [mkdir] Created dir: /home/jv/workCapstone/Retailer/src99/war/JSPtest
    [mkdir] Created dir: /home/jv/workCapstone/Retailer/src99/war/JSPtest/java
    [mkdir] Created dir: /home/jv/workCapstone/Retailer/src99/war/JSPtest/classes
    [mkdir] Created dir: /home/jv/workCapstone/Retailer/src99/war/JSPtest/generated
     [java] Jul 27, 2004 4:00:57 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /index.jsp
     [java] Jul 27, 2004 4:00:57 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/Welcome.jsp
     [java] Jul 27, 2004 4:00:57 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/Error.jsp
     [java] Jul 27, 2004 4:00:57 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/Fatal.jsp
     [java] Jul 27, 2004 4:00:58 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/ViewLogout.jsp
     [java] Jul 27, 2004 4:00:58 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/Parameters.jsp
     [java] Jul 27, 2004 4:00:58 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/Barcodes.jsp
     [java] Jul 27, 2004 4:00:58 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/LogonBody.jsp
     [java] Jul 27, 2004 4:00:59 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/Alerts.jsp
     [java] Jul 27, 2004 4:00:59 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/News.jsp
     [java] Jul 27, 2004 4:00:59 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/Shipments.jsp
     [java] Jul 27, 2004 4:00:59 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/Features.jsp
     [java] Jul 27, 2004 4:00:59 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/Contracts.jsp
     [java] Jul 27, 2004 4:00:59 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/Picture.jsp
     [java] Jul 27, 2004 4:00:59 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/SendCollection.jsp
     [java] Jul 27, 2004 4:00:59 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/Footer.jsp
     [java] Jul 27, 2004 4:01:00 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/Header.jsp
     [java] Jul 27, 2004 4:01:00 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/Welcome.jsp
     [java] Jul 27, 2004 4:01:00 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/Characteristics.jsp
     [java] Jul 27, 2004 4:01:00 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/ConstructionBody.jsp
     [java] Jul 27, 2004 4:01:00 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/Products.jsp
     [java] Jul 27, 2004 4:01:00 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/Comments.jsp
     [java] Jul 27, 2004 4:01:01 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /templates/Main.jsp
     [java] Jul 27, 2004 4:01:01 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /templates/TabsBody.jsp
     [java] Jul 27, 2004 4:01:01 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /templates/MainMenu.jsp
     [java] Jul 27, 2004 4:01:02 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /templates/MainBody.jsp



CompileJSP:
     [echo] Compiling translated JSP code...
    [javac] Compiling 26 source files to /home/jv/workCapstone/Retailer/src99/war/JSPtest/classes

all:

BUILD SUCCESSFUL
Total time: 32 seconds
build:
total 28
drwxrwxr-x    6 jv       jv           4096 Jul 27 16:00 .
drwxr-xr-x   10 jv       jv           4096 Jul 27 16:00 ..
drwxrwxr-x    2 jv       jv           4096 Jul 27 16:00 images
-rw-rw-r--    1 jv       jv            250 Jul 27 16:00 index.jsp
drwxrwxr-x    3 jv       jv           4096 Jul 27 16:00 pages
drwxrwxr-x    2 jv       jv           4096 Jul 27 16:00 templates
drwxrwxr-x    4 jv       jv           4096 Jul 27 16:00 WEB-INF

build/images:
total 60
drwxrwxr-x    2 jv       jv           4096 Jul 27 16:00 .
drwxrwxr-x    6 jv       jv           4096 Jul 27 16:00 ..
-rw-rw-r--    1 jv       jv          10552 Jul 27 16:00 construction.gif
-rw-rw-r--    1 jv       jv          11077 Jul 27 16:00 crystals.jpg
-rw-rw-r--    1 jv       jv           8006 Jul 27 16:00 jakarta-logo.gif
-rw-rw-r--    1 jv       jv           7064 Jul 27 16:00 jv.jpg
-rw-rw-r--    1 jv       jv           6879 Jul 27 16:00 struts.gif
-rw-rw-r--    1 jv       jv           1798 Jul 27 16:00 struts-power.gif

build/pages:
total 32
drwxrwxr-x    3 jv       jv           4096 Jul 27 16:00 .
drwxrwxr-x    6 jv       jv           4096 Jul 27 16:00 ..
-rw-rw-r--    1 jv       jv            478 Jul 27 16:00 Error.jsp
-rw-rw-r--    1 jv       jv            249 Jul 27 16:00 Fatal.jsp
drwxrwxr-x    2 jv       jv           4096 Jul 27 16:00 includes
-rw-rw-r--    1 jv       jv            872 Jul 27 16:00 Parameters.jsp
-rw-rw-r--    1 jv       jv            196 Jul 27 16:00 ViewLogout.jsp
-rw-rw-r--    1 jv       jv           1101 Jul 27 16:00 Welcome.jsp

build/pages/includes:
total 72
drwxrwxr-x    2 jv       jv           4096 Jul 27 16:00 .
drwxrwxr-x    3 jv       jv           4096 Jul 27 16:00 ..
-rw-rw-r--    1 jv       jv           2108 Jul 27 16:00 Alerts.jsp
-rw-rw-r--    1 jv       jv           1882 Jul 27 16:00 Barcodes.jsp
-rw-rw-r--    1 jv       jv           2021 Jul 27 16:00 Characteristics.jsp
-rw-rw-r--    1 jv       jv            442 Jul 27 16:00 Comments.jsp
-rw-rw-r--    1 jv       jv            342 Jul 27 16:00 ConstructionBody.jsp
-rw-rw-r--    1 jv       jv           2836 Jul 27 16:00 Contracts.jsp
-rw-rw-r--    1 jv       jv           1253 Jul 27 16:00 Features.jsp
-rw-rw-r--    1 jv       jv            310 Jul 27 16:00 Footer.jsp
-rw-rw-r--    1 jv       jv            162 Jul 27 16:00 Header.jsp
-rw-rw-r--    1 jv       jv            707 Jul 27 16:00 LogonBody.jsp
-rw-rw-r--    1 jv       jv           2836 Jul 27 16:00 News.jsp
-rw-rw-r--    1 jv       jv            253 Jul 27 16:00 Picture.jsp
-rw-rw-r--    1 jv       jv           1698 Jul 27 16:00 Products.jsp
-rw-rw-r--    1 jv       jv           2102 Jul 27 16:00 SendCollection.jsp
-rw-rw-r--    1 jv       jv           2836 Jul 27 16:00 Shipments.jsp
-rw-rw-r--    1 jv       jv           2043 Jul 27 16:00 Welcome.jsp

build/templates:
total 24
drwxrwxr-x    2 jv       jv           4096 Jul 27 16:00 .
drwxrwxr-x    6 jv       jv           4096 Jul 27 16:00 ..
-rw-rw-r--    1 jv       jv            843 Jul 27 16:00 MainBody.jsp
-rw-rw-r--    1 jv       jv           1380 Jul 27 16:00 Main.jsp
-rw-rw-r--    1 jv       jv           1178 Jul 27 16:00 MainMenu.jsp
-rw-rw-r--    1 jv       jv           1636 Jul 27 16:00 TabsBody.jsp

build/WEB-INF:
total 212
drwxrwxr-x    4 jv       jv           4096 Jul 27 16:00 .
drwxrwxr-x    6 jv       jv           4096 Jul 27 16:00 ..
drwxrwxr-x    4 jv       jv           4096 Jul 27 16:00 classes
drwxrwxr-x    2 jv       jv           4096 Jul 27 16:00 lib
-rw-rw-r--    1 jv       jv           8868 Jul 27 16:00 struts-bean.tld
-rw-rw-r--    1 jv       jv           4273 Jul 27 16:00 struts-config.xml
-rw-rw-r--    1 jv       jv          66192 Jul 27 16:00 struts-html.tld
-rw-rw-r--    1 jv       jv          14511 Jul 27 16:00 struts-logic.tld
-rw-rw-r--    1 jv       jv          64659 Jul 27 16:00 struts-nested.tld
-rw-rw-r--    1 jv       jv           1631 Jul 27 16:00 struts-template.tld
-rw-rw-r--    1 jv       jv           7850 Jul 27 16:00 struts-tiles.tld
-rw-rw-r--    1 jv       jv            398 Jul 27 16:00 sun-web.xml
-rw-rw-r--    1 jv       jv           2420 Jul 27 16:00 web.xml

build/WEB-INF/classes:
total 16
drwxrwxr-x    4 jv       jv           4096 Jul 27 16:00 .
drwxrwxr-x    4 jv       jv           4096 Jul 27 16:00 ..
drwxrwxr-x    2 jv       jv           4096 Jul 27 16:00 jvapp
drwxrwxr-x    2 jv       jv           4096 Jul 27 16:00 resources

build/WEB-INF/classes/jvapp:
total 100
drwxrwxr-x    2 jv       jv           4096 Jul 27 16:00 .
drwxrwxr-x    4 jv       jv           4096 Jul 27 16:00 ..
-rw-rw-r--    1 jv       jv           4866 Jul 27 16:00 AppMainAction.class
-rw-rw-r--    1 jv       jv            489 Jul 27 16:00 AppMainForm.class
-rw-rw-r--    1 jv       jv           4962 Jul 27 16:00 BarcodeDetailsAction.class
-rw-rw-r--    1 jv       jv           4250 Jul 27 16:00 BarcodesAction.class
-rw-rw-r--    1 jv       jv            737 Jul 27 16:00 Constants.class
-rw-rw-r--    1 jv       jv           2590 Jul 27 16:00 ConstructionAction.class
-rw-rw-r--    1 jv       jv            771 Jul 27 16:00 JVAttributes.class
-rw-rw-r--    1 jv       jv           3794 Jul 27 16:00 JVDataAccess.class
-rw-rw-r--    1 jv       jv            503 Jul 27 16:00 JVListener.class
-rw-rw-r--    1 jv       jv           1934 Jul 27 16:00 JVParameters.class
-rw-rw-r--    1 jv       jv           1478 Jul 27 16:00 LogoffAction.class
-rw-rw-r--    1 jv       jv           2271 Jul 27 16:00 LogonAction.class
-rw-rw-r--    1 jv       jv           1154 Jul 27 16:00 LogonForm.class
-rw-rw-r--    1 jv       jv           3117 Jul 27 16:00 MainAction.class
-rw-rw-r--    1 jv       jv           2565 Jul 27 16:00 PreLogonAction.class
-rw-rw-r--    1 jv       jv           3562 Jul 27 16:00 PreSendCollectionAction.class
-rw-rw-r--    1 jv       jv           2620 Jul 27 16:00 SendCollectionAction.class
-rw-rw-r--    1 jv       jv           1670 Jul 27 16:00 ShoppingAction.class
-rw-rw-r--    1 jv       jv           2131 Jul 27 16:00 TabAction.class
-rw-rw-r--    1 jv       jv           2008 Jul 27 16:00 UserInfo.class

build/WEB-INF/classes/resources:
total 24
drwxrwxr-x    2 jv       jv           4096 Jul 27 16:00 .
drwxrwxr-x    4 jv       jv           4096 Jul 27 16:00 ..
-rw-rw-r--    1 jv       jv           1846 Jul 27 16:00 application.properties
-rw-rw-r--    1 jv       jv          12288 Jul 27 16:00 .application.properties.swp

build/WEB-INF/lib:
total 1168
drwxrwxr-x    2 jv       jv           4096 Jul 27 16:00 .
drwxrwxr-x    4 jv       jv           4096 Jul 27 16:00 ..
-rw-rw-r--    1 jv       jv         118726 Jul 27 16:00 commons-beanutils.jar
-rw-rw-r--    1 jv       jv         165119 Jul 27 16:00 commons-collections.jar
-rw-rw-r--    1 jv       jv         109096 Jul 27 16:00 commons-digester.jar
-rw-rw-r--    1 jv       jv          22379 Jul 27 16:00 commons-fileupload.jar
-rw-rw-r--    1 jv       jv          63980 Jul 27 16:00 commons-lang.jar
-rw-rw-r--    1 jv       jv          31605 Jul 27 16:00 commons-logging.jar
-rw-rw-r--    1 jv       jv          46865 Jul 27 16:00 commons-validator.jar
-rw-rw-r--    1 jv       jv          65368 Jul 27 16:00 jakarta-oro.jar
-rw-rw-r--    1 jv       jv           7569 Jul 27 16:00 jar-common1.jar
-rw-rw-r--    1 jv       jv           5604 Jul 27 16:00 jar-common3.jar
-rw-rw-r--    1 jv       jv         498051 Jul 27 16:00 struts.jar
-rw-rw-r--    1 jv       jv          10518 Jul 27 16:00 struts-legacy.jar

dist:
total 1108
drwxrwxr-x    3 jv       jv           4096 Jul 27 16:00 .
drwxr-xr-x   10 jv       jv           4096 Jul 27 16:00 ..
drwxrwxr-x    7 jv       jv           4096 Jul 27 16:00 contents
-rw-rw-r--    1 jv       jv        1117672 Jul 27 16:00 war-ic.war

dist/contents:
total 32
drwxrwxr-x    7 jv       jv           4096 Jul 27 16:00 .
drwxrwxr-x    3 jv       jv           4096 Jul 27 16:00 ..
drwxrwxr-x    2 jv       jv           4096 Jul 27 16:00 images
-rw-rw-r--    1 jv       jv            250 Jul 27 16:00 index.jsp
drwxrwxr-x    2 jv       jv           4096 Jul 27 16:00 META-INF
drwxrwxr-x    3 jv       jv           4096 Jul 27 16:00 pages
drwxrwxr-x    2 jv       jv           4096 Jul 27 16:00 templates
drwxrwxr-x    4 jv       jv           4096 Jul 27 16:00 WEB-INF

dist/contents/images:
total 60
drwxrwxr-x    2 jv       jv           4096 Jul 27 16:00 .
drwxrwxr-x    7 jv       jv           4096 Jul 27 16:00 ..
-rw-rw-r--    1 jv       jv          10552 Jul 27 16:00 construction.gif
-rw-rw-r--    1 jv       jv          11077 Jul 27 16:00 crystals.jpg
-rw-rw-r--    1 jv       jv           8006 Jul 27 16:00 jakarta-logo.gif
-rw-rw-r--    1 jv       jv           7064 Jul 27 16:00 jv.jpg
-rw-rw-r--    1 jv       jv           6879 Jul 27 16:00 struts.gif
-rw-rw-r--    1 jv       jv           1798 Jul 27 16:00 struts-power.gif

dist/contents/META-INF:
total 12
drwxrwxr-x    2 jv       jv           4096 Jul 27 16:00 .
drwxrwxr-x    7 jv       jv           4096 Jul 27 16:00 ..
-rw-rw-r--    1 jv       jv            106 Jul 27 16:00 MANIFEST.MF

dist/contents/pages:
total 32
drwxrwxr-x    3 jv       jv           4096 Jul 27 16:00 .
drwxrwxr-x    7 jv       jv           4096 Jul 27 16:00 ..
-rw-rw-r--    1 jv       jv            478 Jul 27 16:00 Error.jsp
-rw-rw-r--    1 jv       jv            249 Jul 27 16:00 Fatal.jsp
drwxrwxr-x    2 jv       jv           4096 Jul 27 16:00 includes
-rw-rw-r--    1 jv       jv            872 Jul 27 16:00 Parameters.jsp
-rw-rw-r--    1 jv       jv            196 Jul 27 16:00 ViewLogout.jsp
-rw-rw-r--    1 jv       jv           1101 Jul 27 16:00 Welcome.jsp

dist/contents/pages/includes:
total 72
drwxrwxr-x    2 jv       jv           4096 Jul 27 16:00 .
drwxrwxr-x    3 jv       jv           4096 Jul 27 16:00 ..
-rw-rw-r--    1 jv       jv           2108 Jul 27 16:00 Alerts.jsp
-rw-rw-r--    1 jv       jv           1882 Jul 27 16:00 Barcodes.jsp
-rw-rw-r--    1 jv       jv           2021 Jul 27 16:00 Characteristics.jsp
-rw-rw-r--    1 jv       jv            442 Jul 27 16:00 Comments.jsp
-rw-rw-r--    1 jv       jv            342 Jul 27 16:00 ConstructionBody.jsp
-rw-rw-r--    1 jv       jv           2836 Jul 27 16:00 Contracts.jsp
-rw-rw-r--    1 jv       jv           1253 Jul 27 16:00 Features.jsp
-rw-rw-r--    1 jv       jv            310 Jul 27 16:00 Footer.jsp
-rw-rw-r--    1 jv       jv            162 Jul 27 16:00 Header.jsp
-rw-rw-r--    1 jv       jv            707 Jul 27 16:00 LogonBody.jsp
-rw-rw-r--    1 jv       jv           2836 Jul 27 16:00 News.jsp
-rw-rw-r--    1 jv       jv            253 Jul 27 16:00 Picture.jsp
-rw-rw-r--    1 jv       jv           1698 Jul 27 16:00 Products.jsp
-rw-rw-r--    1 jv       jv           2102 Jul 27 16:00 SendCollection.jsp
-rw-rw-r--    1 jv       jv           2836 Jul 27 16:00 Shipments.jsp
-rw-rw-r--    1 jv       jv           2043 Jul 27 16:00 Welcome.jsp

dist/contents/templates:
total 24
drwxrwxr-x    2 jv       jv           4096 Jul 27 16:00 .
drwxrwxr-x    7 jv       jv           4096 Jul 27 16:00 ..
-rw-rw-r--    1 jv       jv            843 Jul 27 16:00 MainBody.jsp
-rw-rw-r--    1 jv       jv           1380 Jul 27 16:00 Main.jsp
-rw-rw-r--    1 jv       jv           1178 Jul 27 16:00 MainMenu.jsp
-rw-rw-r--    1 jv       jv           1636 Jul 27 16:00 TabsBody.jsp

dist/contents/WEB-INF:
total 212
drwxrwxr-x    4 jv       jv           4096 Jul 27 16:00 .
drwxrwxr-x    7 jv       jv           4096 Jul 27 16:00 ..
drwxrwxr-x    4 jv       jv           4096 Jul 27 16:00 classes
drwxrwxr-x    2 jv       jv           4096 Jul 27 16:00 lib
-rw-rw-r--    1 jv       jv           8868 Jul 27 16:00 struts-bean.tld
-rw-rw-r--    1 jv       jv           4273 Jul 27 16:00 struts-config.xml
-rw-rw-r--    1 jv       jv          66192 Jul 27 16:00 struts-html.tld
-rw-rw-r--    1 jv       jv          14511 Jul 27 16:00 struts-logic.tld
-rw-rw-r--    1 jv       jv          64659 Jul 27 16:00 struts-nested.tld
-rw-rw-r--    1 jv       jv           1631 Jul 27 16:00 struts-template.tld
-rw-rw-r--    1 jv       jv           7850 Jul 27 16:00 struts-tiles.tld
-rw-rw-r--    1 jv       jv            398 Jul 27 16:00 sun-web.xml
-rw-rw-r--    1 jv       jv           2420 Jul 27 16:00 web.xml

dist/contents/WEB-INF/classes:
total 16
drwxrwxr-x    4 jv       jv           4096 Jul 27 16:00 .
drwxrwxr-x    4 jv       jv           4096 Jul 27 16:00 ..
drwxrwxr-x    2 jv       jv           4096 Jul 27 16:00 jvapp
drwxrwxr-x    2 jv       jv           4096 Jul 27 16:00 resources

dist/contents/WEB-INF/classes/jvapp:
total 100
drwxrwxr-x    2 jv       jv           4096 Jul 27 16:00 .
drwxrwxr-x    4 jv       jv           4096 Jul 27 16:00 ..
-rw-rw-r--    1 jv       jv           4866 Jul 27 16:00 AppMainAction.class
-rw-rw-r--    1 jv       jv            489 Jul 27 16:00 AppMainForm.class
-rw-rw-r--    1 jv       jv           4962 Jul 27 16:00 BarcodeDetailsAction.class
-rw-rw-r--    1 jv       jv           4250 Jul 27 16:00 BarcodesAction.class
-rw-rw-r--    1 jv       jv            737 Jul 27 16:00 Constants.class
-rw-rw-r--    1 jv       jv           2590 Jul 27 16:00 ConstructionAction.class
-rw-rw-r--    1 jv       jv            771 Jul 27 16:00 JVAttributes.class
-rw-rw-r--    1 jv       jv           3794 Jul 27 16:00 JVDataAccess.class
-rw-rw-r--    1 jv       jv            503 Jul 27 16:00 JVListener.class
-rw-rw-r--    1 jv       jv           1934 Jul 27 16:00 JVParameters.class
-rw-rw-r--    1 jv       jv           1478 Jul 27 16:00 LogoffAction.class
-rw-rw-r--    1 jv       jv           2271 Jul 27 16:00 LogonAction.class
-rw-rw-r--    1 jv       jv           1154 Jul 27 16:00 LogonForm.class
-rw-rw-r--    1 jv       jv           3117 Jul 27 16:00 MainAction.class
-rw-rw-r--    1 jv       jv           2565 Jul 27 16:00 PreLogonAction.class
-rw-rw-r--    1 jv       jv           3562 Jul 27 16:00 PreSendCollectionAction.class
-rw-rw-r--    1 jv       jv           2620 Jul 27 16:00 SendCollectionAction.class
-rw-rw-r--    1 jv       jv           1670 Jul 27 16:00 ShoppingAction.class
-rw-rw-r--    1 jv       jv           2131 Jul 27 16:00 TabAction.class
-rw-rw-r--    1 jv       jv           2008 Jul 27 16:00 UserInfo.class

dist/contents/WEB-INF/classes/resources:
total 24
drwxrwxr-x    2 jv       jv           4096 Jul 27 16:00 .
drwxrwxr-x    4 jv       jv           4096 Jul 27 16:00 ..
-rw-rw-r--    1 jv       jv           1846 Jul 27 16:00 application.properties
-rw-rw-r--    1 jv       jv          12288 Jul 27 16:00 .application.properties.swp

dist/contents/WEB-INF/lib:
total 1168
drwxrwxr-x    2 jv       jv           4096 Jul 27 16:00 .
drwxrwxr-x    4 jv       jv           4096 Jul 27 16:00 ..
-rw-rw-r--    1 jv       jv         118726 Jul 27 16:00 commons-beanutils.jar
-rw-rw-r--    1 jv       jv         165119 Jul 27 16:00 commons-collections.jar
-rw-rw-r--    1 jv       jv         109096 Jul 27 16:00 commons-digester.jar
-rw-rw-r--    1 jv       jv          22379 Jul 27 16:00 commons-fileupload.jar
-rw-rw-r--    1 jv       jv          63980 Jul 27 16:00 commons-lang.jar
-rw-rw-r--    1 jv       jv          31605 Jul 27 16:00 commons-logging.jar
-rw-rw-r--    1 jv       jv          46865 Jul 27 16:00 commons-validator.jar
-rw-rw-r--    1 jv       jv          65368 Jul 27 16:00 jakarta-oro.jar
-rw-rw-r--    1 jv       jv           7569 Jul 27 16:00 jar-common1.jar
-rw-rw-r--    1 jv       jv           5604 Jul 27 16:00 jar-common3.jar
-rw-rw-r--    1 jv       jv         498051 Jul 27 16:00 struts.jar
-rw-rw-r--    1 jv       jv          10518 Jul 27 16:00 struts-legacy.jar
