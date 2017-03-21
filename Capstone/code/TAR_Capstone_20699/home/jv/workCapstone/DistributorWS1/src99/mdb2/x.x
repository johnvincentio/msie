Buildfile: build.xml

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

BUILD SUCCESSFUL
Total time: 26 seconds
build:
total 20
drwxrwxr-x    5 jv       jv           4096 Jul 22 15:17 .
drwxrwxr-x    8 jv       jv           4096 Jul 22 15:17 ..
drwxrwxr-x    3 jv       jv           4096 Jul 22 15:17 appclient
drwxrwxr-x    3 jv       jv           4096 Jul 22 15:17 ear
drwxrwxr-x    4 jv       jv           4096 Jul 22 15:17 ejb

build/appclient:
total 16
drwxrwxr-x    3 jv       jv           4096 Jul 22 15:17 .
drwxrwxr-x    5 jv       jv           4096 Jul 22 15:17 ..
drwxrwxr-x    2 jv       jv           4096 Jul 22 15:17 META-INF
-rw-rw-r--    1 jv       jv           1961 Jul 22 15:17 SimpleMessageClient.class

build/appclient/META-INF:
total 16
drwxrwxr-x    2 jv       jv           4096 Jul 22 15:17 .
drwxrwxr-x    3 jv       jv           4096 Jul 22 15:17 ..
-rw-rw-r--    1 jv       jv           1117 Jul 22 15:17 application-client.xml
-rw-rw-r--    1 jv       jv            746 Jul 22 15:17 sun-application-client.xml

build/ear:
total 44
drwxrwxr-x    3 jv       jv           4096 Jul 22 15:17 .
drwxrwxr-x    5 jv       jv           4096 Jul 22 15:17 ..
-rw-rw-r--    1 jv       jv           2596 Jul 22 15:17 app-client-ic.jar
-rw-rw-r--    1 jv       jv          12806 Jul 22 15:17 ejb3_ejb-jar-ic.jar
-rw-rw-r--    1 jv       jv          10332 Jul 22 15:17 ejb-jar-ic.jar
drwxrwxr-x    2 jv       jv           4096 Jul 22 15:17 META-INF

build/ear/META-INF:
total 16
drwxrwxr-x    2 jv       jv           4096 Jul 22 15:17 .
drwxrwxr-x    3 jv       jv           4096 Jul 22 15:17 ..
-rw-rw-r--    1 jv       jv            959 Jul 22 15:17 application.xml
-rw-rw-r--    1 jv       jv            348 Jul 22 15:17 sun-application.xml

build/ejb:
total 24
drwxrwxr-x    4 jv       jv           4096 Jul 22 15:17 .
drwxrwxr-x    5 jv       jv           4096 Jul 22 15:17 ..
-rw-rw-r--    1 jv       jv           7569 Jul 22 15:17 jar-common.jar
drwxrwxr-x    2 jv       jv           4096 Jul 22 15:17 jvmsg1
drwxrwxr-x    2 jv       jv           4096 Jul 22 15:17 META-INF

build/ejb/jvmsg1:
total 16
drwxrwxr-x    2 jv       jv           4096 Jul 22 15:17 .
drwxrwxr-x    4 jv       jv           4096 Jul 22 15:17 ..
-rw-rw-r--    1 jv       jv           2174 Jul 22 15:17 JVBeanAccess.class
-rw-rw-r--    1 jv       jv           1552 Jul 22 15:17 SimpleMessageBean.class

build/ejb/META-INF:
total 16
drwxrwxr-x    2 jv       jv           4096 Jul 22 15:17 .
drwxrwxr-x    4 jv       jv           4096 Jul 22 15:17 ..
-rw-rw-r--    1 jv       jv           1482 Jul 22 15:17 ejb-jar.xml
-rw-rw-r--    1 jv       jv            901 Jul 22 15:17 sun-ejb-jar.xml

dist:
total 48
drwxrwxr-x    5 jv       jv           4096 Jul 22 15:17 .
drwxrwxr-x    8 jv       jv           4096 Jul 22 15:17 ..
drwxrwxr-x    3 jv       jv           4096 Jul 22 15:17 appclient
drwxrwxr-x    3 jv       jv           4096 Jul 22 15:17 ear
drwxrwxr-x    4 jv       jv           4096 Jul 22 15:17 ejb
-rw-rw-r--    1 jv       jv          25767 Jul 22 15:17 workmdb2EAR.ear

dist/appclient:
total 20
drwxrwxr-x    3 jv       jv           4096 Jul 22 15:17 .
drwxrwxr-x    5 jv       jv           4096 Jul 22 15:17 ..
-rw-rw-r--    1 jv       jv           2596 Jul 22 15:17 app-client-ic.jar
drwxrwxr-x    2 jv       jv           4096 Jul 22  2004 META-INF
-rw-rw-r--    1 jv       jv           1961 Jul 22 15:17 SimpleMessageClient.class

dist/appclient/META-INF:
total 20
drwxrwxr-x    2 jv       jv           4096 Jul 22  2004 .
drwxrwxr-x    3 jv       jv           4096 Jul 22 15:17 ..
-rw-rw-r--    1 jv       jv           1117 Jul 22 15:17 application-client.xml
-rw-rw-r--    1 jv       jv            134 Jul 22 15:17 MANIFEST.MF
-rw-rw-r--    1 jv       jv            746 Jul 22 15:17 sun-application-client.xml

dist/ear:
total 44
drwxrwxr-x    3 jv       jv           4096 Jul 22 15:17 .
drwxrwxr-x    5 jv       jv           4096 Jul 22 15:17 ..
-rw-rw-r--    1 jv       jv           2596 Jul 22 15:17 app-client-ic.jar
-rw-rw-r--    1 jv       jv          12806 Jul 22 15:17 ejb3_ejb-jar-ic.jar
-rw-rw-r--    1 jv       jv          10332 Jul 22 15:17 ejb-jar-ic.jar
drwxrwxr-x    2 jv       jv           4096 Jul 22  2004 META-INF

dist/ear/META-INF:
total 20
drwxrwxr-x    2 jv       jv           4096 Jul 22  2004 .
drwxrwxr-x    3 jv       jv           4096 Jul 22 15:17 ..
-rw-rw-r--    1 jv       jv            959 Jul 22 15:17 application.xml
-rw-rw-r--    1 jv       jv            257 Jul 22 15:17 MANIFEST.MF
-rw-rw-r--    1 jv       jv            348 Jul 22 15:17 sun-application.xml

dist/ejb:
total 36
drwxrwxr-x    4 jv       jv           4096 Jul 22 15:17 .
drwxrwxr-x    5 jv       jv           4096 Jul 22 15:17 ..
-rw-rw-r--    1 jv       jv          10332 Jul 22 15:17 ejb-jar-ic.jar
-rw-rw-r--    1 jv       jv           7569 Jul 22 15:17 jar-common.jar
drwxrwxr-x    2 jv       jv           4096 Jul 22 15:17 jvmsg1
drwxrwxr-x    2 jv       jv           4096 Jul 22  2004 META-INF

dist/ejb/jvmsg1:
total 16
drwxrwxr-x    2 jv       jv           4096 Jul 22 15:17 .
drwxrwxr-x    4 jv       jv           4096 Jul 22 15:17 ..
-rw-rw-r--    1 jv       jv           2174 Jul 22 15:17 JVBeanAccess.class
-rw-rw-r--    1 jv       jv           1552 Jul 22 15:17 SimpleMessageBean.class

dist/ejb/META-INF:
total 20
drwxrwxr-x    2 jv       jv           4096 Jul 22  2004 .
drwxrwxr-x    4 jv       jv           4096 Jul 22 15:17 ..
-rw-rw-r--    1 jv       jv           1482 Jul 22 15:17 ejb-jar.xml
-rw-rw-r--    1 jv       jv            134 Jul 22 15:17 MANIFEST.MF
-rw-rw-r--    1 jv       jv            901 Jul 22 15:17 sun-ejb-jar.xml
