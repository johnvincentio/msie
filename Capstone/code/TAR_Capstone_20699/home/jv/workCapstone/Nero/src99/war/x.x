Buildfile: build.xml
     [echo] Initializing...
     [echo] /opt/SUNWappserver/jdk/bin:/opt/SUNWappserver/bin:/opt/apache-ant-1.6.0/bin:/home/jv/dbin:/usr/local/bin:/bin:/usr/bin:/usr/bin/X11:/usr/X11R6/bin
     [echo] .:/opt/SUNWappserver/lib/j2ee.jar

clean:
     [echo] Remove build and distributables...
   [delete] Deleting 92 files from /home/jv/workCapstone/Nero/src99/war/build
   [delete] Deleted 13 directories from /home/jv/workCapstone/Nero/src99/war/build
   [delete] Deleting 94 files from /home/jv/workCapstone/Nero/src99/war/dist
   [delete] Deleted 15 directories from /home/jv/workCapstone/Nero/src99/war/dist
   [delete] Deleting 61 files from /home/jv/workCapstone/Nero/src99/war/JSPtest
   [delete] Deleted 16 directories from /home/jv/workCapstone/Nero/src99/war/JSPtest

mkdirs:
     [echo] Create directories...
    [mkdir] Created dir: /home/jv/workCapstone/Nero/src99/war/dist
    [mkdir] Created dir: /home/jv/workCapstone/Nero/src99/war/dist/contents
    [mkdir] Created dir: /home/jv/workCapstone/Nero/src99/war/build
    [mkdir] Created dir: /home/jv/workCapstone/Nero/src99/war/build/WEB-INF
    [mkdir] Created dir: /home/jv/workCapstone/Nero/src99/war/build/WEB-INF/classes
    [mkdir] Created dir: /home/jv/workCapstone/Nero/src99/war/build/WEB-INF/lib

compile:
     [echo] Compiling java...
    [javac] Compiling 31 source files to /home/jv/workCapstone/Nero/src99/war/build/WEB-INF/classes
    [javac] Note: Some input files use or override a deprecated API.
    [javac] Note: Recompile with -deprecation for details.

copyStrutsLibs:
     [echo] Copying Libs...
     [copy] Copying 10 files to /home/jv/workCapstone/Nero/src99/war/build/WEB-INF/lib
     [echo] Copying Tlds...
     [copy] Copying 6 files to /home/jv/workCapstone/Nero/src99/war/build/WEB-INF

copyLibs:

build:
     [echo] Copying WEB-INF/*.xml files...
     [copy] Copying 3 files to /home/jv/workCapstone/Nero/src99/war/build/WEB-INF
     [echo] Copying files from lib...
     [echo] Copying common JARs from common...
     [copy] Copying 1 file to /home/jv/workCapstone/Nero/src99/war/build/WEB-INF/lib
     [copy] Copying 1 file to /home/jv/workCapstone/Nero/src99/war/build/WEB-INF/lib.jar
     [copy] Copying 1 file to /home/jv/workCapstone/Nero/src99/war/build/WEB-INF/lib
     [echo] Copying files from tags...
     [echo] Copying html, jsp, css, jpg etc files...
     [copy] Copying 37 files to /home/jv/workCapstone/Nero/src99/war/build
     [echo] Copying resources files...
     [copy] Copying 1 file to /home/jv/workCapstone/Nero/src99/war/build/WEB-INF/classes/resources

dist:
     [echo] Creating WAR file....
      [jar] Building jar: /home/jv/workCapstone/Nero/src99/war/dist/war-ic.war
    [unwar] Expanding: /home/jv/workCapstone/Nero/src99/war/dist/war-ic.war into /home/jv/workCapstone/Nero/src99/war/dist/contents

sun-webXML-2-4:
     [echo] Checking sun-web.xml for version 2.4
     [echo] Initializing...
     [echo] /opt/SUNWappserver/jdk/bin:/opt/SUNWappserver/bin:/opt/apache-ant-1.6.0/bin:/home/jv/dbin:/usr/local/bin:/bin:/usr/bin:/usr/bin/X11:/usr/X11R6/bin
     [echo] .:/opt/SUNWappserver/lib/j2ee.jar

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/Nero/src99/war/etc/sun-web.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/Nero/src99/war/etc/sun-web.xml
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
     [echo] Checking /home/jv/workCapstone/Nero/src99/war/etc/web.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/Nero/src99/war/etc/web.xml
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
     [echo] Checking /home/jv/workCapstone/Nero/src99/war/etc/struts-config.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/Nero/src99/war/etc/struts-config.xml
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
     [echo] WARNING: /home/jv/workCapstone/Nero/src99/war/etc/tiles-defs.xml does not exist.

XMLValidate:
     [echo] Checking validation.xml
     [echo] Initializing...
     [echo] /opt/SUNWappserver/jdk/bin:/opt/SUNWappserver/bin:/opt/apache-ant-1.6.0/bin:/home/jv/dbin:/usr/local/bin:/bin:/usr/bin:/usr/bin/X11:/usr/X11R6/bin
     [echo] .:/opt/SUNWappserver/lib/j2ee.jar

XMLinit:

XMLExist:

XMLNoExist:
     [echo] WARNING: /home/jv/workCapstone/Nero/src99/war/etc/validation.xml does not exist.

XMLValidate:
     [echo] Checking validator-rules.xml
     [echo] Initializing...
     [echo] /opt/SUNWappserver/jdk/bin:/opt/SUNWappserver/bin:/opt/apache-ant-1.6.0/bin:/home/jv/dbin:/usr/local/bin:/bin:/usr/bin:/usr/bin/X11:/usr/X11R6/bin
     [echo] .:/opt/SUNWappserver/lib/j2ee.jar

XMLinit:

XMLExist:

XMLNoExist:
     [echo] WARNING: /home/jv/workCapstone/Nero/src99/war/etc/validator-rules.xml does not exist.

XMLValidate:

checkXML:

precompileJSP_clean:
     [echo] Cleaning JSP Validate....

precompileJSP:
     [echo] Precompiling JSP to Java code...
    [mkdir] Created dir: /home/jv/workCapstone/Nero/src99/war/JSPtest
    [mkdir] Created dir: /home/jv/workCapstone/Nero/src99/war/JSPtest/java
    [mkdir] Created dir: /home/jv/workCapstone/Nero/src99/war/JSPtest/classes
    [mkdir] Created dir: /home/jv/workCapstone/Nero/src99/war/JSPtest/generated
     [java] Jul 27, 2004 2:57:02 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /index.jsp
     [java] Jul 27, 2004 2:57:02 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /templates/Main.jsp
     [java] Jul 27, 2004 2:57:02 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /templates/MainBody.jsp
     [java] Jul 27, 2004 2:57:03 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /templates/MainMenu.jsp
     [java] Jul 27, 2004 2:57:03 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /templates/TabsBody.jsp
     [java] Jul 27, 2004 2:57:03 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/Error.jsp
     [java] Jul 27, 2004 2:57:04 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/Checkout.jsp
     [java] Jul 27, 2004 2:57:04 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/Parameters.jsp
     [java] Jul 27, 2004 2:57:04 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/Cart.jsp
     [java] Jul 27, 2004 2:57:04 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/ViewCheckout.jsp
     [java] Jul 27, 2004 2:57:04 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/CartUpdate.jsp
     [java] Jul 27, 2004 2:57:05 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/Welcome.jsp
     [java] Jul 27, 2004 2:57:05 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/Catalogs.jsp
     [java] Jul 27, 2004 2:57:05 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/ViewLogout.jsp
     [java] Jul 27, 2004 2:57:05 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/Fatal.jsp
     [java] Jul 27, 2004 2:57:05 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/ViewHome.jsp
     [java] Jul 27, 2004 2:57:05 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/ViewCatalogs.jsp
     [java] Jul 27, 2004 2:57:05 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/ViewCart.jsp
     [java] Jul 27, 2004 2:57:06 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/Register.jsp
     [java] Jul 27, 2004 2:57:06 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/Logon.jsp
     [java] Jul 27, 2004 2:57:06 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/CatalogItems.jsp
     [java] Jul 27, 2004 2:57:06 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/Picture.jsp
     [java] Jul 27, 2004 2:57:06 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/News.jsp
     [java] Jul 27, 2004 2:57:06 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/Welcome.jsp
     [java] Jul 27, 2004 2:57:06 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/Features.jsp
     [java] Jul 27, 2004 2:57:06 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/ConstructionBody.jsp
     [java] Jul 27, 2004 2:57:07 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/Footer.jsp
     [java] Jul 27, 2004 2:57:07 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/Header.jsp
     [java] Jul 27, 2004 2:57:07 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/LogonBody.jsp
     [java] Jul 27, 2004 2:57:07 PM org.apache.jasper.JspC processFile
     [java] INFO: Built File: /pages/includes/Comments.jsp



CompileJSP:
     [echo] Compiling translated JSP code...
    [javac] Compiling 30 source files to /home/jv/workCapstone/Nero/src99/war/JSPtest/classes

all:

BUILD SUCCESSFUL
Total time: 34 seconds
build:
total 24
drwxrwxr-x    5 jv       jv           4096 Jul 27 14:56 .
drwxr-xr-x   10 jv       jv           4096 Jul 27 14:56 ..
-rw-rw-r--    1 jv       jv            250 Jul 27 14:56 index.jsp
drwxrwxr-x    4 jv       jv           4096 Jul 27 14:56 pages
drwxrwxr-x    2 jv       jv           4096 Jul 27 14:56 templates
drwxrwxr-x    5 jv       jv           4096 Jul 27 14:56 WEB-INF

build/pages:
total 84
drwxrwxr-x    4 jv       jv           4096 Jul 27 14:56 .
drwxrwxr-x    5 jv       jv           4096 Jul 27 14:56 ..
-rw-rw-r--    1 jv       jv           2418 Jul 27 14:56 Cart.jsp
-rw-rw-r--    1 jv       jv           1924 Jul 27 14:56 CartUpdate.jsp
-rw-rw-r--    1 jv       jv           1836 Jul 27 14:56 CatalogItems.jsp
-rw-rw-r--    1 jv       jv           4129 Jul 27 14:56 Catalogs.jsp
-rw-rw-r--    1 jv       jv           2856 Jul 27 14:56 Checkout.jsp
-rw-rw-r--    1 jv       jv            478 Jul 27 14:56 Error.jsp
-rw-rw-r--    1 jv       jv            249 Jul 27 14:56 Fatal.jsp
drwxrwxr-x    2 jv       jv           4096 Jul 27 14:56 images
drwxrwxr-x    2 jv       jv           4096 Jul 27 14:56 includes
-rw-rw-r--    1 jv       jv            884 Jul 27 14:56 Logon.jsp
-rw-rw-r--    1 jv       jv            872 Jul 27 14:56 Parameters.jsp
-rw-rw-r--    1 jv       jv           2273 Jul 27 14:56 Register.jsp
-rw-rw-r--    1 jv       jv            112 Jul 27 14:56 ViewCart.jsp
-rw-rw-r--    1 jv       jv            124 Jul 27 14:56 ViewCatalogs.jsp
-rw-rw-r--    1 jv       jv            130 Jul 27 14:56 ViewCheckout.jsp
-rw-rw-r--    1 jv       jv            113 Jul 27 14:56 ViewHome.jsp
-rw-rw-r--    1 jv       jv            196 Jul 27 14:56 ViewLogout.jsp
-rw-rw-r--    1 jv       jv           1209 Jul 27 14:56 Welcome.jsp

build/pages/images:
total 116
drwxrwxr-x    2 jv       jv           4096 Jul 27 14:56 .
drwxrwxr-x    4 jv       jv           4096 Jul 27 14:56 ..
-rw-rw-r--    1 jv       jv          10552 Jul 27 14:56 construction.gif
-rw-rw-r--    1 jv       jv          11077 Jul 27 14:56 crystals.jpg
-rw-rw-r--    1 jv       jv           8006 Jul 27 14:56 jakarta-logo.gif
-rw-rw-r--    1 jv       jv           7064 Jul 27 14:56 jv.jpg
-rw-rw-r--    1 jv       jv          51164 Jul 27 14:56 saturn.jpg
-rw-rw-r--    1 jv       jv           6879 Jul 27 14:56 struts.gif
-rw-rw-r--    1 jv       jv           1798 Jul 27 14:56 struts-power.gif

build/pages/includes:
total 44
drwxrwxr-x    2 jv       jv           4096 Jul 27 14:56 .
drwxrwxr-x    4 jv       jv           4096 Jul 27 14:56 ..
-rw-rw-r--    1 jv       jv            442 Jul 27 14:56 Comments.jsp
-rw-rw-r--    1 jv       jv            342 Jul 27 14:56 ConstructionBody.jsp
-rw-rw-r--    1 jv       jv           1253 Jul 27 14:56 Features.jsp
-rw-rw-r--    1 jv       jv            310 Jul 27 14:56 Footer.jsp
-rw-rw-r--    1 jv       jv            162 Jul 27 14:56 Header.jsp
-rw-rw-r--    1 jv       jv            707 Jul 27 14:56 LogonBody.jsp
-rw-rw-r--    1 jv       jv           2836 Jul 27 14:56 News.jsp
-rw-rw-r--    1 jv       jv            253 Jul 27 14:56 Picture.jsp
-rw-rw-r--    1 jv       jv           2043 Jul 27 14:56 Welcome.jsp

build/templates:
total 24
drwxrwxr-x    2 jv       jv           4096 Jul 27 14:56 .
drwxrwxr-x    5 jv       jv           4096 Jul 27 14:56 ..
-rw-rw-r--    1 jv       jv            842 Jul 27 14:56 MainBody.jsp
-rw-rw-r--    1 jv       jv           1379 Jul 27 14:56 Main.jsp
-rw-rw-r--    1 jv       jv           1177 Jul 27 14:56 MainMenu.jsp
-rw-rw-r--    1 jv       jv           1635 Jul 27 14:56 TabsBody.jsp

build/WEB-INF:
total 216
drwxrwxr-x    5 jv       jv           4096 Jul 27 14:56 .
drwxrwxr-x    5 jv       jv           4096 Jul 27 14:56 ..
drwxrwxr-x    4 jv       jv           4096 Jul 27 14:56 classes
drwxrwxr-x    2 jv       jv           4096 Jul 27 14:56 lib
drwxrwxr-x    2 jv       jv           4096 Jul 27 14:56 lib.jar
-rw-rw-r--    1 jv       jv           8868 Jul 27 14:56 struts-bean.tld
-rw-rw-r--    1 jv       jv           7840 Jul 27 14:56 struts-config.xml
-rw-rw-r--    1 jv       jv          66192 Jul 27 14:56 struts-html.tld
-rw-rw-r--    1 jv       jv          14511 Jul 27 14:56 struts-logic.tld
-rw-rw-r--    1 jv       jv          64659 Jul 27 14:56 struts-nested.tld
-rw-rw-r--    1 jv       jv           1631 Jul 27 14:56 struts-template.tld
-rw-rw-r--    1 jv       jv           7850 Jul 27 14:56 struts-tiles.tld
-rw-rw-r--    1 jv       jv            384 Jul 27 14:56 sun-web.xml
-rw-rw-r--    1 jv       jv           2880 Jul 27 14:56 web.xml

build/WEB-INF/classes:
total 16
drwxrwxr-x    4 jv       jv           4096 Jul 27 14:56 .
drwxrwxr-x    5 jv       jv           4096 Jul 27 14:56 ..
drwxrwxr-x    2 jv       jv           4096 Jul 27 14:56 jvapp
drwxrwxr-x    2 jv       jv           4096 Jul 27 14:56 resources

build/WEB-INF/classes/jvapp:
total 140
drwxrwxr-x    2 jv       jv           4096 Jul 27 14:56 .
drwxrwxr-x    4 jv       jv           4096 Jul 27 14:56 ..
-rw-rw-r--    1 jv       jv           3646 Jul 27 14:56 AppMainAction.class
-rw-rw-r--    1 jv       jv            489 Jul 27 14:56 AppMainForm.class
-rw-rw-r--    1 jv       jv           2788 Jul 27 14:56 CartAction.class
-rw-rw-r--    1 jv       jv            881 Jul 27 14:56 CartForm.class
-rw-rw-r--    1 jv       jv           2358 Jul 27 14:56 CartUpdateAction.class
-rw-rw-r--    1 jv       jv            781 Jul 27 14:56 CartUpdateForm.class
-rw-rw-r--    1 jv       jv           2217 Jul 27 14:56 CatalogAction.class
-rw-rw-r--    1 jv       jv           1003 Jul 27 14:56 CatalogForm.class
-rw-rw-r--    1 jv       jv           2202 Jul 27 14:56 CatalogItemAction.class
-rw-rw-r--    1 jv       jv            915 Jul 27 14:56 CatalogItemForm.class
-rw-rw-r--    1 jv       jv           1946 Jul 27 14:56 CatalogsAction.class
-rw-rw-r--    1 jv       jv            621 Jul 27 14:56 CatalogsForm.class
-rw-rw-r--    1 jv       jv            641 Jul 27 14:56 Constants.class
-rw-rw-r--    1 jv       jv           2589 Jul 27 14:56 ConstructionAction.class
-rw-rw-r--    1 jv       jv            770 Jul 27 14:56 JVAttributes.class
-rw-rw-r--    1 jv       jv           4429 Jul 27 14:56 JVDataAccess.class
-rw-rw-r--    1 jv       jv           1023 Jul 27 14:56 JVListener.class
-rw-rw-r--    1 jv       jv           1933 Jul 27 14:56 JVParameters.class
-rw-rw-r--    1 jv       jv           1038 Jul 27 14:56 JVSetup.class
-rw-rw-r--    1 jv       jv           1101 Jul 27 14:56 JVTabs.class
-rw-rw-r--    1 jv       jv            960 Jul 27 14:56 JVTabsItems.class
-rw-rw-r--    1 jv       jv           1477 Jul 27 14:56 LogoffAction.class
-rw-rw-r--    1 jv       jv           2619 Jul 27 14:56 LogonAction.class
-rw-rw-r--    1 jv       jv           1154 Jul 27 14:56 LogonForm.class
-rw-rw-r--    1 jv       jv           3005 Jul 27 14:56 MainAction.class
-rw-rw-r--    1 jv       jv           2564 Jul 27 14:56 PreLogonAction.class
-rw-rw-r--    1 jv       jv           1442 Jul 27 14:56 RegisterAction.class
-rw-rw-r--    1 jv       jv           2975 Jul 27 14:56 RegisterForm.class
-rw-rw-r--    1 jv       jv           2777 Jul 27 14:56 SendMail.class
-rw-rw-r--    1 jv       jv            738 Jul 27 14:56 SendMail$MyAuthenticator.class
-rw-rw-r--    1 jv       jv           2115 Jul 27 14:56 TabAction.class
-rw-rw-r--    1 jv       jv           2122 Jul 27 14:56 UserInfo.class

build/WEB-INF/classes/resources:
total 12
drwxrwxr-x    2 jv       jv           4096 Jul 27 14:56 .
drwxrwxr-x    4 jv       jv           4096 Jul 27 14:56 ..
-rw-rw-r--    1 jv       jv           3853 Jul 27 14:56 application.properties

build/WEB-INF/lib:
total 1160
drwxrwxr-x    2 jv       jv           4096 Jul 27 14:56 .
drwxrwxr-x    5 jv       jv           4096 Jul 27 14:56 ..
-rw-rw-r--    1 jv       jv         118726 Jul 27 14:56 commons-beanutils.jar
-rw-rw-r--    1 jv       jv         165119 Jul 27 14:56 commons-collections.jar
-rw-rw-r--    1 jv       jv         109096 Jul 27 14:56 commons-digester.jar
-rw-rw-r--    1 jv       jv          22379 Jul 27 14:56 commons-fileupload.jar
-rw-rw-r--    1 jv       jv          63980 Jul 27 14:56 commons-lang.jar
-rw-rw-r--    1 jv       jv          31605 Jul 27 14:56 commons-logging.jar
-rw-rw-r--    1 jv       jv          46865 Jul 27 14:56 commons-validator.jar
-rw-rw-r--    1 jv       jv          65368 Jul 27 14:56 jakarta-oro.jar
-rw-rw-r--    1 jv       jv           3397 Jul 27 14:56 jar-common2.jar
-rw-rw-r--    1 jv       jv           1590 Jul 27 14:56 jar-common4.jar
-rw-rw-r--    1 jv       jv         498051 Jul 27 14:56 struts.jar
-rw-rw-r--    1 jv       jv          10518 Jul 27 14:56 struts-legacy.jar

build/WEB-INF/lib.jar:
total 16
drwxrwxr-x    2 jv       jv           4096 Jul 27 14:56 .
drwxrwxr-x    5 jv       jv           4096 Jul 27 14:56 ..
-rw-rw-r--    1 jv       jv           5604 Jul 27 14:56 jar-common3.jar

dist:
total 1164
drwxrwxr-x    3 jv       jv           4096 Jul 27 14:56 .
drwxr-xr-x   10 jv       jv           4096 Jul 27 14:56 ..
drwxrwxr-x    6 jv       jv           4096 Jul 27 14:56 contents
-rw-rw-r--    1 jv       jv        1173050 Jul 27 14:56 war-ic.war

dist/contents:
total 28
drwxrwxr-x    6 jv       jv           4096 Jul 27 14:56 .
drwxrwxr-x    3 jv       jv           4096 Jul 27 14:56 ..
-rw-rw-r--    1 jv       jv            250 Jul 27 14:56 index.jsp
drwxrwxr-x    2 jv       jv           4096 Jul 27 14:56 META-INF
drwxrwxr-x    4 jv       jv           4096 Jul 27 14:56 pages
drwxrwxr-x    2 jv       jv           4096 Jul 27 14:56 templates
drwxrwxr-x    5 jv       jv           4096 Jul 27 14:56 WEB-INF

dist/contents/META-INF:
total 12
drwxrwxr-x    2 jv       jv           4096 Jul 27 14:56 .
drwxrwxr-x    6 jv       jv           4096 Jul 27 14:56 ..
-rw-rw-r--    1 jv       jv            106 Jul 27 14:56 MANIFEST.MF

dist/contents/pages:
total 84
drwxrwxr-x    4 jv       jv           4096 Jul 27 14:56 .
drwxrwxr-x    6 jv       jv           4096 Jul 27 14:56 ..
-rw-rw-r--    1 jv       jv           2418 Jul 27 14:56 Cart.jsp
-rw-rw-r--    1 jv       jv           1924 Jul 27 14:56 CartUpdate.jsp
-rw-rw-r--    1 jv       jv           1836 Jul 27 14:56 CatalogItems.jsp
-rw-rw-r--    1 jv       jv           4129 Jul 27 14:56 Catalogs.jsp
-rw-rw-r--    1 jv       jv           2856 Jul 27 14:56 Checkout.jsp
-rw-rw-r--    1 jv       jv            478 Jul 27 14:56 Error.jsp
-rw-rw-r--    1 jv       jv            249 Jul 27 14:56 Fatal.jsp
drwxrwxr-x    2 jv       jv           4096 Jul 27 14:56 images
drwxrwxr-x    2 jv       jv           4096 Jul 27 14:56 includes
-rw-rw-r--    1 jv       jv            884 Jul 27 14:56 Logon.jsp
-rw-rw-r--    1 jv       jv            872 Jul 27 14:56 Parameters.jsp
-rw-rw-r--    1 jv       jv           2273 Jul 27 14:56 Register.jsp
-rw-rw-r--    1 jv       jv            112 Jul 27 14:56 ViewCart.jsp
-rw-rw-r--    1 jv       jv            124 Jul 27 14:56 ViewCatalogs.jsp
-rw-rw-r--    1 jv       jv            130 Jul 27 14:56 ViewCheckout.jsp
-rw-rw-r--    1 jv       jv            113 Jul 27 14:56 ViewHome.jsp
-rw-rw-r--    1 jv       jv            196 Jul 27 14:56 ViewLogout.jsp
-rw-rw-r--    1 jv       jv           1209 Jul 27 14:56 Welcome.jsp

dist/contents/pages/images:
total 116
drwxrwxr-x    2 jv       jv           4096 Jul 27 14:56 .
drwxrwxr-x    4 jv       jv           4096 Jul 27 14:56 ..
-rw-rw-r--    1 jv       jv          10552 Jul 27 14:56 construction.gif
-rw-rw-r--    1 jv       jv          11077 Jul 27 14:56 crystals.jpg
-rw-rw-r--    1 jv       jv           8006 Jul 27 14:56 jakarta-logo.gif
-rw-rw-r--    1 jv       jv           7064 Jul 27 14:56 jv.jpg
-rw-rw-r--    1 jv       jv          51164 Jul 27 14:56 saturn.jpg
-rw-rw-r--    1 jv       jv           6879 Jul 27 14:56 struts.gif
-rw-rw-r--    1 jv       jv           1798 Jul 27 14:56 struts-power.gif

dist/contents/pages/includes:
total 44
drwxrwxr-x    2 jv       jv           4096 Jul 27 14:56 .
drwxrwxr-x    4 jv       jv           4096 Jul 27 14:56 ..
-rw-rw-r--    1 jv       jv            442 Jul 27 14:56 Comments.jsp
-rw-rw-r--    1 jv       jv            342 Jul 27 14:56 ConstructionBody.jsp
-rw-rw-r--    1 jv       jv           1253 Jul 27 14:56 Features.jsp
-rw-rw-r--    1 jv       jv            310 Jul 27 14:56 Footer.jsp
-rw-rw-r--    1 jv       jv            162 Jul 27 14:56 Header.jsp
-rw-rw-r--    1 jv       jv            707 Jul 27 14:56 LogonBody.jsp
-rw-rw-r--    1 jv       jv           2836 Jul 27 14:56 News.jsp
-rw-rw-r--    1 jv       jv            253 Jul 27 14:56 Picture.jsp
-rw-rw-r--    1 jv       jv           2043 Jul 27 14:56 Welcome.jsp

dist/contents/templates:
total 24
drwxrwxr-x    2 jv       jv           4096 Jul 27 14:56 .
drwxrwxr-x    6 jv       jv           4096 Jul 27 14:56 ..
-rw-rw-r--    1 jv       jv            842 Jul 27 14:56 MainBody.jsp
-rw-rw-r--    1 jv       jv           1379 Jul 27 14:56 Main.jsp
-rw-rw-r--    1 jv       jv           1177 Jul 27 14:56 MainMenu.jsp
-rw-rw-r--    1 jv       jv           1635 Jul 27 14:56 TabsBody.jsp

dist/contents/WEB-INF:
total 216
drwxrwxr-x    5 jv       jv           4096 Jul 27 14:56 .
drwxrwxr-x    6 jv       jv           4096 Jul 27 14:56 ..
drwxrwxr-x    4 jv       jv           4096 Jul 27 14:56 classes
drwxrwxr-x    2 jv       jv           4096 Jul 27 14:56 lib
drwxrwxr-x    2 jv       jv           4096 Jul 27 14:56 lib.jar
-rw-rw-r--    1 jv       jv           8868 Jul 27 14:56 struts-bean.tld
-rw-rw-r--    1 jv       jv           7840 Jul 27 14:56 struts-config.xml
-rw-rw-r--    1 jv       jv          66192 Jul 27 14:56 struts-html.tld
-rw-rw-r--    1 jv       jv          14511 Jul 27 14:56 struts-logic.tld
-rw-rw-r--    1 jv       jv          64659 Jul 27 14:56 struts-nested.tld
-rw-rw-r--    1 jv       jv           1631 Jul 27 14:56 struts-template.tld
-rw-rw-r--    1 jv       jv           7850 Jul 27 14:56 struts-tiles.tld
-rw-rw-r--    1 jv       jv            384 Jul 27 14:56 sun-web.xml
-rw-rw-r--    1 jv       jv           2880 Jul 27 14:56 web.xml

dist/contents/WEB-INF/classes:
total 16
drwxrwxr-x    4 jv       jv           4096 Jul 27 14:56 .
drwxrwxr-x    5 jv       jv           4096 Jul 27 14:56 ..
drwxrwxr-x    2 jv       jv           4096 Jul 27 14:56 jvapp
drwxrwxr-x    2 jv       jv           4096 Jul 27 14:56 resources

dist/contents/WEB-INF/classes/jvapp:
total 140
drwxrwxr-x    2 jv       jv           4096 Jul 27 14:56 .
drwxrwxr-x    4 jv       jv           4096 Jul 27 14:56 ..
-rw-rw-r--    1 jv       jv           3646 Jul 27 14:56 AppMainAction.class
-rw-rw-r--    1 jv       jv            489 Jul 27 14:56 AppMainForm.class
-rw-rw-r--    1 jv       jv           2788 Jul 27 14:56 CartAction.class
-rw-rw-r--    1 jv       jv            881 Jul 27 14:56 CartForm.class
-rw-rw-r--    1 jv       jv           2358 Jul 27 14:56 CartUpdateAction.class
-rw-rw-r--    1 jv       jv            781 Jul 27 14:56 CartUpdateForm.class
-rw-rw-r--    1 jv       jv           2217 Jul 27 14:56 CatalogAction.class
-rw-rw-r--    1 jv       jv           1003 Jul 27 14:56 CatalogForm.class
-rw-rw-r--    1 jv       jv           2202 Jul 27 14:56 CatalogItemAction.class
-rw-rw-r--    1 jv       jv            915 Jul 27 14:56 CatalogItemForm.class
-rw-rw-r--    1 jv       jv           1946 Jul 27 14:56 CatalogsAction.class
-rw-rw-r--    1 jv       jv            621 Jul 27 14:56 CatalogsForm.class
-rw-rw-r--    1 jv       jv            641 Jul 27 14:56 Constants.class
-rw-rw-r--    1 jv       jv           2589 Jul 27 14:56 ConstructionAction.class
-rw-rw-r--    1 jv       jv            770 Jul 27 14:56 JVAttributes.class
-rw-rw-r--    1 jv       jv           4429 Jul 27 14:56 JVDataAccess.class
-rw-rw-r--    1 jv       jv           1023 Jul 27 14:56 JVListener.class
-rw-rw-r--    1 jv       jv           1933 Jul 27 14:56 JVParameters.class
-rw-rw-r--    1 jv       jv           1038 Jul 27 14:56 JVSetup.class
-rw-rw-r--    1 jv       jv           1101 Jul 27 14:56 JVTabs.class
-rw-rw-r--    1 jv       jv            960 Jul 27 14:56 JVTabsItems.class
-rw-rw-r--    1 jv       jv           1477 Jul 27 14:56 LogoffAction.class
-rw-rw-r--    1 jv       jv           2619 Jul 27 14:56 LogonAction.class
-rw-rw-r--    1 jv       jv           1154 Jul 27 14:56 LogonForm.class
-rw-rw-r--    1 jv       jv           3005 Jul 27 14:56 MainAction.class
-rw-rw-r--    1 jv       jv           2564 Jul 27 14:56 PreLogonAction.class
-rw-rw-r--    1 jv       jv           1442 Jul 27 14:56 RegisterAction.class
-rw-rw-r--    1 jv       jv           2975 Jul 27 14:56 RegisterForm.class
-rw-rw-r--    1 jv       jv           2777 Jul 27 14:56 SendMail.class
-rw-rw-r--    1 jv       jv            738 Jul 27 14:56 SendMail$MyAuthenticator.class
-rw-rw-r--    1 jv       jv           2115 Jul 27 14:56 TabAction.class
-rw-rw-r--    1 jv       jv           2122 Jul 27 14:56 UserInfo.class

dist/contents/WEB-INF/classes/resources:
total 12
drwxrwxr-x    2 jv       jv           4096 Jul 27 14:56 .
drwxrwxr-x    4 jv       jv           4096 Jul 27 14:56 ..
-rw-rw-r--    1 jv       jv           3853 Jul 27 14:56 application.properties

dist/contents/WEB-INF/lib:
total 1160
drwxrwxr-x    2 jv       jv           4096 Jul 27 14:56 .
drwxrwxr-x    5 jv       jv           4096 Jul 27 14:56 ..
-rw-rw-r--    1 jv       jv         118726 Jul 27 14:56 commons-beanutils.jar
-rw-rw-r--    1 jv       jv         165119 Jul 27 14:56 commons-collections.jar
-rw-rw-r--    1 jv       jv         109096 Jul 27 14:56 commons-digester.jar
-rw-rw-r--    1 jv       jv          22379 Jul 27 14:56 commons-fileupload.jar
-rw-rw-r--    1 jv       jv          63980 Jul 27 14:56 commons-lang.jar
-rw-rw-r--    1 jv       jv          31605 Jul 27 14:56 commons-logging.jar
-rw-rw-r--    1 jv       jv          46865 Jul 27 14:56 commons-validator.jar
-rw-rw-r--    1 jv       jv          65368 Jul 27 14:56 jakarta-oro.jar
-rw-rw-r--    1 jv       jv           3397 Jul 27 14:56 jar-common2.jar
-rw-rw-r--    1 jv       jv           1590 Jul 27 14:56 jar-common4.jar
-rw-rw-r--    1 jv       jv         498051 Jul 27 14:56 struts.jar
-rw-rw-r--    1 jv       jv          10518 Jul 27 14:56 struts-legacy.jar

dist/contents/WEB-INF/lib.jar:
total 16
drwxrwxr-x    2 jv       jv           4096 Jul 27 14:56 .
drwxrwxr-x    5 jv       jv           4096 Jul 27 14:56 ..
-rw-rw-r--    1 jv       jv           5604 Jul 27 14:56 jar-common3.jar
