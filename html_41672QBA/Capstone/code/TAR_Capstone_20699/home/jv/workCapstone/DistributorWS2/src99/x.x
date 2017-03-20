Buildfile: build.xml

dist:

clean:
     [echo] Remove build and distributables...
   [delete] Deleting 14 files from /home/jv/workCapstone/DistributorWS2/src99/ejb3/build
   [delete] Deleted 8 directories from /home/jv/workCapstone/DistributorWS2/src99/ejb3/build
   [delete] Deleting 20 files from /home/jv/workCapstone/DistributorWS2/src99/ejb3/dist
   [delete] Deleted 8 directories from /home/jv/workCapstone/DistributorWS2/src99/ejb3/dist

mkdirs:
     [echo] Create directories...
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS2/src99/ejb3/dist
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS2/src99/ejb3/dist/ear
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS2/src99/ejb3/dist/ejb
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS2/src99/ejb3/dist/appclient
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS2/src99/ejb3/build
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS2/src99/ejb3/build/ear
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS2/src99/ejb3/build/ear/META-INF
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS2/src99/ejb3/build/appclient
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS2/src99/ejb3/build/appclient/META-INF
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS2/src99/ejb3/build/ejb
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS2/src99/ejb3/build/ejb/META-INF

compile:
     [echo] Compiling EJB java...
    [javac] Compiling 4 source files to /home/jv/workCapstone/DistributorWS2/src99/ejb3/build/ejb
     [echo] Compiling appClient java...
    [javac] Compiling 1 source file to /home/jv/workCapstone/DistributorWS2/src99/ejb3/build/appclient

build:
     [echo] Copying files from lib...
     [echo] Copying common JAR from common...
     [copy] Copying 1 file to /home/jv/workCapstone/DistributorWS2/src99/ejb3/build/ejb
     [echo] Copying EAR META-INF/*.xml files...
     [copy] Copying 2 files to /home/jv/workCapstone/DistributorWS2/src99/ejb3/build/ear/META-INF
     [echo] Copying EJB META-INF/*.xml files...
     [copy] Copying 2 files to /home/jv/workCapstone/DistributorWS2/src99/ejb3/build/ejb/META-INF
     [echo] Copying appClient META-INF/*.xml files...
     [copy] Copying 2 files to /home/jv/workCapstone/DistributorWS2/src99/ejb3/build/appclient/META-INF

dist:
     [echo] Creating EJB JAR file....
      [jar] Building jar: /home/jv/workCapstone/DistributorWS2/src99/ejb3/dist/ejb/ejb-jar-ic.jar
    [unjar] Expanding: /home/jv/workCapstone/DistributorWS2/src99/ejb3/dist/ejb/ejb-jar-ic.jar into /home/jv/workCapstone/DistributorWS2/src99/ejb3/dist/ejb
     [echo] Creating AppClient JAR file....
      [jar] Building jar: /home/jv/workCapstone/DistributorWS2/src99/ejb3/dist/appclient/app-client-ic.jar
    [unjar] Expanding: /home/jv/workCapstone/DistributorWS2/src99/ejb3/dist/appclient/app-client-ic.jar into /home/jv/workCapstone/DistributorWS2/src99/ejb3/dist/appclient
     [echo] Copying EJB JAR files...
     [copy] Copying 1 file to /home/jv/workCapstone/DistributorWS2/src99/ejb3/build/ear
     [copy] Copying 1 file to /home/jv/workCapstone/DistributorWS2/src99/ejb3/build/ear
     [echo] Creating EJB JAR file....
      [jar] Building jar: /home/jv/workCapstone/DistributorWS2/src99/ejb3/dist/ejb3.ear
     [echo] Expanding EAR file....
    [unjar] Expanding: /home/jv/workCapstone/DistributorWS2/src99/ejb3/dist/ejb3.ear into /home/jv/workCapstone/DistributorWS2/src99/ejb3/dist/ear

ejb-jar_2_1:
     [echo] Checking ejb-jar.xml for version 2.1

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/DistributorWS2/src99/ejb3/etc/ejb-jar.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/DistributorWS2/src99/ejb3/etc/ejb-jar.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

sun-ejb-jar_2_1:
     [echo] Checking sun-ejb-jar.xml for version 2.1

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/DistributorWS2/src99/ejb3/etc/sun-ejb-jar.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/DistributorWS2/src99/ejb3/etc/sun-ejb-jar.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

application-client_1_4:
     [echo] Checking application-client.xml for version 1.4

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/DistributorWS2/src99/ejb3/etc/application-client.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/DistributorWS2/src99/ejb3/etc/application-client.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

sun-application-client_1_4:
     [echo] Checking sun-application.xml for version 1.4

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/DistributorWS2/src99/ejb3/etc/sun-application-client.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/DistributorWS2/src99/ejb3/etc/sun-application-client.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

checkXML:

all:

clean:
     [echo] Remove build and distributables...
   [delete] Deleting 7 files from /home/jv/workCapstone/DistributorWS2/src99/war/build
   [delete] Deleted 6 directories from /home/jv/workCapstone/DistributorWS2/src99/war/build
   [delete] Deleting 9 files from /home/jv/workCapstone/DistributorWS2/src99/war/dist
   [delete] Deleted 8 directories from /home/jv/workCapstone/DistributorWS2/src99/war/dist
   [delete] Deleting 1 files from /home/jv/workCapstone/DistributorWS2/src99/war/JSPtest
   [delete] Deleted 4 directories from /home/jv/workCapstone/DistributorWS2/src99/war/JSPtest

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
    [javac] Compiling 4 source files to /home/jv/workCapstone/DistributorWS2/src99/war/build/WEB-INF/classes

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

clean:
     [echo] Remove build and distributables...
   [delete] Deleting 5 files from /home/jv/workCapstone/DistributorWS2/src99/ear/build
   [delete] Deleted 2 directories from /home/jv/workCapstone/DistributorWS2/src99/ear/build
   [delete] Deleting 16 files from /home/jv/workCapstone/DistributorWS2/src99/ear/dist
   [delete] Deleted 10 directories from /home/jv/workCapstone/DistributorWS2/src99/ear/dist

mkdirs:
     [echo] Create directories...
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS2/src99/ear/dist
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS2/src99/ear/dist/ear
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS2/src99/ear/build
    [mkdir] Created dir: /home/jv/workCapstone/DistributorWS2/src99/ear/build/META-INF

build:
     [echo] Copying EAR JAR files...
     [copy] Copying 1 file to /home/jv/workCapstone/DistributorWS2/src99/ear/build
     [echo] Copying EJB2 JAR files...
     [copy] Copying 1 file to /home/jv/workCapstone/DistributorWS2/src99/ear/build
     [copy] Copying 1 file to /home/jv/workCapstone/DistributorWS2/src99/ear/build
     [echo] Copying EAR META-INF/*.xml files...
     [copy] Copying 2 files to /home/jv/workCapstone/DistributorWS2/src99/ear/build/META-INF

dist:
     [echo] Creating EJB JAR file....
      [jar] Building jar: /home/jv/workCapstone/DistributorWS2/src99/ear/dist/DistributorWS2EAR.ear
     [echo] Expanding EAR file....
    [unjar] Expanding: /home/jv/workCapstone/DistributorWS2/src99/ear/dist/DistributorWS2EAR.ear into /home/jv/workCapstone/DistributorWS2/src99/ear/dist/ear
     [echo] Expanding WAR file....
    [unjar] Expanding: /home/jv/workCapstone/DistributorWS2/src99/ear/dist/ear/war-ic.war into /home/jv/workCapstone/DistributorWS2/src99/ear/dist/war

application_1_4:
     [echo] Checking application.xml for version 1.4

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/DistributorWS2/src99/ear/etc/application.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/DistributorWS2/src99/ear/etc/application.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

sun-application_1_4:
     [echo] Checking sun-application.xml for version 1.4

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/DistributorWS2/src99/ear/etc/sun-application.xml
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/DistributorWS2/src99/ear/etc/sun-application.xml
     [java] the document is valid.



XMLNoExist:

XMLValidate:

checkXML:

all:

tools:

deploy:
     [exec] deploy --password yetiyeti --secure=false --user admin --terse=false --target server --echo=true --upload=true --dbvendorname oracle --port 4848 --interactive=true --enabled=true --retrieve /home/jv/workCapstone/DistributorWS2/src99/ear/dist --host localhost --precompilejsp=true --force=true --verify=false --name DistributorWS2EAR /home/jv/workCapstone/DistributorWS2/src99/ear/dist/DistributorWS2EAR.ear
     [exec] Command deploy executed successfully.



BUILD SUCCESSFUL
Total time: 51 seconds
