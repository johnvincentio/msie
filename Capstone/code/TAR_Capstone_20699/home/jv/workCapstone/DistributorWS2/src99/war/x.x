Buildfile: build.xml

clean:
     [echo] Remove build and distributables...
   [delete] Deleting 1 files from /home/jv/workCapstone/DistributorWS2/src99/war/build
   [delete] Deleted 5 directories from /home/jv/workCapstone/DistributorWS2/src99/war/build
   [delete] Deleted 2 directories from /home/jv/workCapstone/DistributorWS2/src99/war/dist

mkdirs:
     [echo] Create directories...
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS2/src99/war/dist
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS2/src99/war/dist/war
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS2/src99/war/build
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS2/src99/war/build/WEB-INF
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS2/src99/war/build/WEB-INF/classes
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS2/src99/war/build/WEB-INF/lib

compile:
     [echo] Compiling java...
    [javac] Compiling 3 source files to /home/jv/workCapstone/DistributorWS2/src99/war/build/WEB-INF/classes

build:
     [echo] Copying WEB-INF/*.xml files...
     [copy] Copying 2 files to /home/jv/workCapstone/DistributorWS2/src99/war/build/WEB-INF
     [echo] Copying files from lib...
     [echo] Copying common JAR from common...
     [copy] Copying 1 file to /home/jv/workCapstone/DistributorWS2/src99/war/build/WEB-INF/lib
     [echo] Copying html, jsp, css, jpg etc files...
     [echo] Copying resources files...
     [copy] Copied 1 empty directory to 1 empty directory under /home/jv/workCapstone/DistributorWS2/src99/war/build/WEB-INF/classes/resources

dist:
     [echo] Creating WAR file....
      [jar] Building jar: /home/jv/workCapstone/DistributorWS2/src99/war/dist/war-ic.war
    [unwar] Expanding: /home/jv/workCapstone/DistributorWS2/src99/war/dist/war-ic.war into /home/jv/workCapstone/DistributorWS2/src99/war/dist/war

sun-webXML-2-4:
     [echo] Checking sun-web.xml for version 2.4

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/DistributorWS2/src99/war/etc/sun-web.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/DistributorWS2/src99/war/etc/sun-web.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

webXML-2-4:
     [echo] Checking web.xml for version 2.4

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/DistributorWS2/src99/war/etc/web.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/DistributorWS2/src99/war/etc/web.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

checkXML:

precompileJSP_clean:
     [echo] Cleaning JSP Validate....

precompileJSP:
     [echo] Precompiling JSP to Java code...
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS2/src99/war/JSPtest
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS2/src99/war/JSPtest/java
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS2/src99/war/JSPtest/classes
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS2/src99/war/JSPtest/generated



CompileJSP:
     [echo] Compiling translated JSP code...

all:

BUILD SUCCESSFUL
Total time: 15 seconds
.:
total 72
drwxrwxr-x   10 jv       jv           4096 Jul 21 11:14 .
drwxrwxr-x    5 jv       jv           4096 Jul 21 09:57 ..
drwxrwxr-x    3 jv       jv           4096 Jul 21 11:14 build
-rw-r--r--    1 jv       jv           3838 Jul 21 11:13 build.xml
-rw-------    1 jv       jv          20480 Jul 21 11:13 .build.xml.swp
drwxrwxr-x    3 jv       jv           4096 Jul 21 11:14 dist
drwxrwxr-x    2 jv       jv           4096 Jul 21 10:57 etc
drwxrwxr-x    3 jv       jv           4096 Jul 21 11:00 java
drwxrwxr-x    5 jv       jv           4096 Jul 21 11:14 JSPtest
drwxrwxr-x    2 jv       jv           4096 Jul 21 10:41 lib
-rwxr-xr-x    1 jv       jv             40 Jul 21 11:00 po
drwxrwxr-x    2 jv       jv           4096 Jul 21 10:40 resources
drwxrwxr-x    2 jv       jv           4096 Jul 21 11:12 web
-rw-rw-r--    1 jv       jv           3160 Jul 21 11:14 x.x

./build:
total 12
drwxrwxr-x    3 jv       jv           4096 Jul 21 11:14 .
drwxrwxr-x   10 jv       jv           4096 Jul 21 11:14 ..
drwxrwxr-x    4 jv       jv           4096 Jul 21 11:14 WEB-INF

./build/WEB-INF:
total 24
drwxrwxr-x    4 jv       jv           4096 Jul 21 11:14 .
drwxrwxr-x    3 jv       jv           4096 Jul 21 11:14 ..
drwxrwxr-x    4 jv       jv           4096 Jul 21 11:14 classes
drwxrwxr-x    2 jv       jv           4096 Jul 21 11:14 lib
-rw-rw-r--    1 jv       jv            414 Jul 21 11:14 sun-web.xml
-rw-rw-r--    1 jv       jv            986 Jul 21 11:14 web.xml

./build/WEB-INF/classes:
total 16
drwxrwxr-x    4 jv       jv           4096 Jul 21 11:14 .
drwxrwxr-x    4 jv       jv           4096 Jul 21 11:14 ..
drwxrwxr-x    2 jv       jv           4096 Jul 21 11:14 jvreceiver
drwxrwxr-x    2 jv       jv           4096 Jul 21 11:14 resources

./build/WEB-INF/classes/jvreceiver:
total 20
drwxrwxr-x    2 jv       jv           4096 Jul 21 11:14 .
drwxrwxr-x    4 jv       jv           4096 Jul 21 11:14 ..
-rw-rw-r--    1 jv       jv            514 Jul 21 11:14 JVListener.class
-rw-rw-r--    1 jv       jv           1746 Jul 21 11:14 ReceivingServlet.class
-rw-rw-r--    1 jv       jv           3613 Jul 21 11:14 SAAJServlet.class

./build/WEB-INF/classes/resources:
total 8
drwxrwxr-x    2 jv       jv           4096 Jul 21 11:14 .
drwxrwxr-x    4 jv       jv           4096 Jul 21 11:14 ..

./build/WEB-INF/lib:
total 16
drwxrwxr-x    2 jv       jv           4096 Jul 21 11:14 .
drwxrwxr-x    4 jv       jv           4096 Jul 21 11:14 ..
-rw-rw-r--    1 jv       jv           7569 Jul 21 11:14 jar-common.jar

./dist:
total 24
drwxrwxr-x    3 jv       jv           4096 Jul 21 11:14 .
drwxrwxr-x   10 jv       jv           4096 Jul 21 11:14 ..
drwxrwxr-x    4 jv       jv           4096 Jul 21 11:14 war
-rw-rw-r--    1 jv       jv          11800 Jul 21 11:14 war-ic.war

./dist/war:
total 16
drwxrwxr-x    4 jv       jv           4096 Jul 21 11:14 .
drwxrwxr-x    3 jv       jv           4096 Jul 21 11:14 ..
drwxrwxr-x    2 jv       jv           4096 Jul 21 11:14 META-INF
drwxrwxr-x    4 jv       jv           4096 Jul 21 11:14 WEB-INF

./dist/war/META-INF:
total 12
drwxrwxr-x    2 jv       jv           4096 Jul 21 11:14 .
drwxrwxr-x    4 jv       jv           4096 Jul 21 11:14 ..
-rw-rw-r--    1 jv       jv            106 Jul 21 11:14 MANIFEST.MF

./dist/war/WEB-INF:
total 24
drwxrwxr-x    4 jv       jv           4096 Jul 21 11:14 .
drwxrwxr-x    4 jv       jv           4096 Jul 21 11:14 ..
drwxrwxr-x    4 jv       jv           4096 Jul 21 11:14 classes
drwxrwxr-x    2 jv       jv           4096 Jul 21 11:14 lib
-rw-rw-r--    1 jv       jv            414 Jul 21 11:14 sun-web.xml
-rw-rw-r--    1 jv       jv            986 Jul 21 11:14 web.xml

./dist/war/WEB-INF/classes:
total 16
drwxrwxr-x    4 jv       jv           4096 Jul 21 11:14 .
drwxrwxr-x    4 jv       jv           4096 Jul 21 11:14 ..
drwxrwxr-x    2 jv       jv           4096 Jul 21 11:14 jvreceiver
drwxrwxr-x    2 jv       jv           4096 Jul 21 11:14 resources

./dist/war/WEB-INF/classes/jvreceiver:
total 20
drwxrwxr-x    2 jv       jv           4096 Jul 21 11:14 .
drwxrwxr-x    4 jv       jv           4096 Jul 21 11:14 ..
-rw-rw-r--    1 jv       jv            514 Jul 21 11:14 JVListener.class
-rw-rw-r--    1 jv       jv           1746 Jul 21 11:14 ReceivingServlet.class
-rw-rw-r--    1 jv       jv           3613 Jul 21 11:14 SAAJServlet.class

./dist/war/WEB-INF/classes/resources:
total 8
drwxrwxr-x    2 jv       jv           4096 Jul 21 11:14 .
drwxrwxr-x    4 jv       jv           4096 Jul 21 11:14 ..

./dist/war/WEB-INF/lib:
total 16
drwxrwxr-x    2 jv       jv           4096 Jul 21 11:14 .
drwxrwxr-x    4 jv       jv           4096 Jul 21 11:14 ..
-rw-rw-r--    1 jv       jv           7569 Jul 21 11:14 jar-common.jar

./etc:
total 40
drwxrwxr-x    2 jv       jv           4096 Jul 21 10:57 .
drwxrwxr-x   10 jv       jv           4096 Jul 21 11:14 ..
-rw-------    1 jv       jv            414 Jul 21 10:45 sun-web.xml
-rw-------    1 jv       jv          12288 Jul 21 10:45 .sun-web.xml.swp
-rw-rw-r--    1 jv       jv            986 Jul 21 10:57 web.xml
-rw-------    1 jv       jv          12288 Jul 21 10:57 .web.xml.swp

./java:
total 12
drwxrwxr-x    3 jv       jv           4096 Jul 21 11:00 .
drwxrwxr-x   10 jv       jv           4096 Jul 21 11:14 ..
drwxrwxr-x    2 jv       jv           4096 Jul 21 11:13 jvreceiver

./java/jvreceiver:
total 60
drwxrwxr-x    2 jv       jv           4096 Jul 21 11:13 .
drwxrwxr-x    3 jv       jv           4096 Jul 21 11:00 ..
-rw-------    1 jv       jv            452 Jul 21 10:57 JVListener.java
-rw-------    1 jv       jv          12288 Jul 21 10:57 .JVListener.java.swp
-rw-rw-r--    1 jv       jv           1635 Jul 21 10:53 ReceivingServlet.java
-rw-------    1 jv       jv          12288 Jul 21 10:54 .ReceivingServlet.java.swp
-rw-rw-r--    1 jv       jv           3626 Jul 21 11:13 SAAJServlet.java
-rw-------    1 jv       jv          16384 Jul 21 11:13 .SAAJServlet.java.swp

./JSPtest:
total 20
drwxrwxr-x    5 jv       jv           4096 Jul 21 11:14 .
drwxrwxr-x   10 jv       jv           4096 Jul 21 11:14 ..
drwxrwxr-x    2 jv       jv           4096 Jul 21 11:14 classes
drwxrwxr-x    2 jv       jv           4096 Jul 21 11:14 generated
drwxrwxr-x    2 jv       jv           4096 Jul 21 11:14 java

./JSPtest/classes:
total 8
drwxrwxr-x    2 jv       jv           4096 Jul 21 11:14 .
drwxrwxr-x    5 jv       jv           4096 Jul 21 11:14 ..

./JSPtest/generated:
total 12
drwxrwxr-x    2 jv       jv           4096 Jul 21 11:14 .
drwxrwxr-x    5 jv       jv           4096 Jul 21 11:14 ..
-rw-rw-r--    1 jv       jv            249 Jul 21 11:14 webxml.xml

./JSPtest/java:
total 8
drwxrwxr-x    2 jv       jv           4096 Jul 21 11:14 .
drwxrwxr-x    5 jv       jv           4096 Jul 21 11:14 ..

./lib:
total 8
drwxrwxr-x    2 jv       jv           4096 Jul 21 10:41 .
drwxrwxr-x   10 jv       jv           4096 Jul 21 11:14 ..

./resources:
total 8
drwxrwxr-x    2 jv       jv           4096 Jul 21 10:40 .
drwxrwxr-x   10 jv       jv           4096 Jul 21 11:14 ..

./web:
total 8
drwxrwxr-x    2 jv       jv           4096 Jul 21 11:12 .
drwxrwxr-x   10 jv       jv           4096 Jul 21 11:14 ..
