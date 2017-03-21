Buildfile: build.xml

clean:
     [echo] Remove build and distributables...
   [delete] Deleting 15 files from /home/jv/workCapstone/DistributorWS1/src99/ejb3/build
   [delete] Deleted 8 directories from /home/jv/workCapstone/DistributorWS1/src99/ejb3/build
   [delete] Deleting 22 files from /home/jv/workCapstone/DistributorWS1/src99/ejb3/dist
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

BUILD SUCCESSFUL
Total time: 6 seconds
build:
total 20
drwxrwxr-x    5 jv       jv           4096 Jul 22 12:58 .
drwxrwxr-x    8 jv       jv           4096 Jul 22 12:58 ..
drwxrwxr-x    3 jv       jv           4096 Jul 22 12:58 appclient
drwxrwxr-x    3 jv       jv           4096 Jul 22 12:58 ear
drwxrwxr-x    4 jv       jv           4096 Jul 22 12:58 ejb

build/appclient:
total 16
drwxrwxr-x    3 jv       jv           4096 Jul 22 12:58 .
drwxrwxr-x    5 jv       jv           4096 Jul 22 12:58 ..
-rw-rw-r--    1 jv       jv           1897 Jul 22 12:58 AbcdClient.class
drwxrwxr-x    2 jv       jv           4096 Jul 22 12:58 META-INF

build/appclient/META-INF:
total 16
drwxrwxr-x    2 jv       jv           4096 Jul 22 12:58 .
drwxrwxr-x    3 jv       jv           4096 Jul 22 12:58 ..
-rw-rw-r--    1 jv       jv            520 Jul 22 12:58 application-client.xml
-rw-rw-r--    1 jv       jv            417 Jul 22 12:58 sun-application-client.xml

build/ear:
total 32
drwxrwxr-x    3 jv       jv           4096 Jul 22 12:58 .
drwxrwxr-x    5 jv       jv           4096 Jul 22 12:58 ..
-rw-rw-r--    1 jv       jv           2287 Jul 22 12:58 app-client-ic.jar
-rw-rw-r--    1 jv       jv          12806 Jul 22 12:58 ejb-jar-ic.jar
drwxrwxr-x    2 jv       jv           4096 Jul 22 12:58 META-INF

build/ear/META-INF:
total 16
drwxrwxr-x    2 jv       jv           4096 Jul 22 12:58 .
drwxrwxr-x    3 jv       jv           4096 Jul 22 12:58 ..
-rw-rw-r--    1 jv       jv            497 Jul 22 12:58 application.xml
-rw-rw-r--    1 jv       jv            348 Jul 22 12:58 sun-application.xml

build/ejb:
total 24
drwxrwxr-x    4 jv       jv           4096 Jul 22 12:58 .
drwxrwxr-x    5 jv       jv           4096 Jul 22 12:58 ..
-rw-rw-r--    1 jv       jv           7569 Jul 22 12:58 jar-common.jar
drwxrwxr-x    2 jv       jv           4096 Jul 22 12:58 jvejb3
drwxrwxr-x    2 jv       jv           4096 Jul 22 12:58 META-INF

build/ejb/jvejb3:
total 28
drwxrwxr-x    2 jv       jv           4096 Jul 22 12:58 .
drwxrwxr-x    4 jv       jv           4096 Jul 22 12:58 ..
-rw-rw-r--    1 jv       jv           1498 Jul 22 12:58 AbcdBean.class
-rw-rw-r--    1 jv       jv            183 Jul 22 12:58 Abcd.class
-rw-rw-r--    1 jv       jv            213 Jul 22 12:58 AbcdHome.class
-rw-rw-r--    1 jv       jv           3524 Jul 22 12:58 JVDatabase.class
-rw-rw-r--    1 jv       jv           2585 Jul 22 12:58 JVxml.class

build/ejb/META-INF:
total 16
drwxrwxr-x    2 jv       jv           4096 Jul 22 12:58 .
drwxrwxr-x    4 jv       jv           4096 Jul 22 12:58 ..
-rw-rw-r--    1 jv       jv           1217 Jul 22 12:58 ejb-jar.xml
-rw-rw-r--    1 jv       jv            554 Jul 22 12:58 sun-ejb-jar.xml

dist:
total 36
drwxrwxr-x    5 jv       jv           4096 Jul 22 12:58 .
drwxrwxr-x    8 jv       jv           4096 Jul 22 12:58 ..
drwxrwxr-x    3 jv       jv           4096 Jul 22 12:58 appclient
drwxrwxr-x    3 jv       jv           4096 Jul 22 12:58 ear
drwxrwxr-x    4 jv       jv           4096 Jul 22 12:58 ejb
-rw-rw-r--    1 jv       jv          15418 Jul 22 12:58 ejb3.ear

dist/appclient:
total 20
drwxrwxr-x    3 jv       jv           4096 Jul 22 12:58 .
drwxrwxr-x    5 jv       jv           4096 Jul 22 12:58 ..
-rw-rw-r--    1 jv       jv           1897 Jul 22  2004 AbcdClient.class
-rw-rw-r--    1 jv       jv           2287 Jul 22 12:58 app-client-ic.jar
drwxrwxr-x    2 jv       jv           4096 Jul 22  2004 META-INF

dist/appclient/META-INF:
total 20
drwxrwxr-x    2 jv       jv           4096 Jul 22  2004 .
drwxrwxr-x    3 jv       jv           4096 Jul 22 12:58 ..
-rw-rw-r--    1 jv       jv            520 Jul 22  2004 application-client.xml
-rw-rw-r--    1 jv       jv            134 Jul 22 12:58 MANIFEST.MF
-rw-rw-r--    1 jv       jv            417 Jul 22  2004 sun-application-client.xml

dist/ear:
total 32
drwxrwxr-x    3 jv       jv           4096 Jul 22 12:58 .
drwxrwxr-x    5 jv       jv           4096 Jul 22 12:58 ..
-rw-rw-r--    1 jv       jv           2287 Jul 22  2004 app-client-ic.jar
-rw-rw-r--    1 jv       jv          12806 Jul 22  2004 ejb-jar-ic.jar
drwxrwxr-x    2 jv       jv           4096 Jul 22  2004 META-INF

dist/ear/META-INF:
total 20
drwxrwxr-x    2 jv       jv           4096 Jul 22  2004 .
drwxrwxr-x    3 jv       jv           4096 Jul 22 12:58 ..
-rw-rw-r--    1 jv       jv            497 Jul 22  2004 application.xml
-rw-rw-r--    1 jv       jv            257 Jul 22 12:58 MANIFEST.MF
-rw-rw-r--    1 jv       jv            348 Jul 22  2004 sun-application.xml

dist/ejb:
total 40
drwxrwxr-x    4 jv       jv           4096 Jul 22 12:58 .
drwxrwxr-x    5 jv       jv           4096 Jul 22 12:58 ..
-rw-rw-r--    1 jv       jv          12806 Jul 22 12:58 ejb-jar-ic.jar
-rw-rw-r--    1 jv       jv           7569 Jul 22  2004 jar-common.jar
drwxrwxr-x    2 jv       jv           4096 Jul 22 12:58 jvejb3
drwxrwxr-x    2 jv       jv           4096 Jul 22 12:58 META-INF

dist/ejb/jvejb3:
total 28
drwxrwxr-x    2 jv       jv           4096 Jul 22 12:58 .
drwxrwxr-x    4 jv       jv           4096 Jul 22 12:58 ..
-rw-rw-r--    1 jv       jv           1498 Jul 22 12:58 AbcdBean.class
-rw-rw-r--    1 jv       jv            183 Jul 22 12:58 Abcd.class
-rw-rw-r--    1 jv       jv            213 Jul 22 12:58 AbcdHome.class
-rw-rw-r--    1 jv       jv           3524 Jul 22 12:58 JVDatabase.class
-rw-rw-r--    1 jv       jv           2585 Jul 22 12:58 JVxml.class

dist/ejb/META-INF:
total 20
drwxrwxr-x    2 jv       jv           4096 Jul 22 12:58 .
drwxrwxr-x    4 jv       jv           4096 Jul 22 12:58 ..
-rw-rw-r--    1 jv       jv           1217 Jul 22  2004 ejb-jar.xml
-rw-rw-r--    1 jv       jv            134 Jul 22 12:58 MANIFEST.MF
-rw-rw-r--    1 jv       jv            554 Jul 22  2004 sun-ejb-jar.xml
