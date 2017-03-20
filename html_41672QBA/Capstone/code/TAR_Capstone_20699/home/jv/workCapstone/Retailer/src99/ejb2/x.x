Buildfile: build.xml

clean:
     [echo] Remove build and distributables...
   [delete] Deleting 14 files from /home/jv/workCapstone/Distributor/src99/ejb2/build
   [delete] Deleted 8 directories from /home/jv/workCapstone/Distributor/src99/ejb2/build
   [delete] Deleting 20 files from /home/jv/workCapstone/Distributor/src99/ejb2/dist
   [delete] Deleted 8 directories from /home/jv/workCapstone/Distributor/src99/ejb2/dist

mkdirs:
     [echo] Create directories...
    [mkdir] Created dir: /home/jv/workCapstone/Distributor/src99/ejb2/dist
    [mkdir] Created dir: /home/jv/workCapstone/Distributor/src99/ejb2/dist/ear
    [mkdir] Created dir: /home/jv/workCapstone/Distributor/src99/ejb2/dist/ejb
    [mkdir] Created dir: /home/jv/workCapstone/Distributor/src99/ejb2/dist/appclient
    [mkdir] Created dir: /home/jv/workCapstone/Distributor/src99/ejb2/build
    [mkdir] Created dir: /home/jv/workCapstone/Distributor/src99/ejb2/build/ear
    [mkdir] Created dir: /home/jv/workCapstone/Distributor/src99/ejb2/build/ear/META-INF
    [mkdir] Created dir: /home/jv/workCapstone/Distributor/src99/ejb2/build/appclient
    [mkdir] Created dir: /home/jv/workCapstone/Distributor/src99/ejb2/build/appclient/META-INF
    [mkdir] Created dir: /home/jv/workCapstone/Distributor/src99/ejb2/build/ejb
    [mkdir] Created dir: /home/jv/workCapstone/Distributor/src99/ejb2/build/ejb/META-INF

compile:
     [echo] Compiling EJB java...
    [javac] Compiling 4 source files to /home/jv/workCapstone/Distributor/src99/ejb2/build/ejb
     [echo] Compiling appClient java...
    [javac] Compiling 1 source file to /home/jv/workCapstone/Distributor/src99/ejb2/build/appclient

build:
     [echo] Copying files from lib...
     [echo] Copying common JAR from common...
     [copy] Copying 1 file to /home/jv/workCapstone/Distributor/src99/ejb2/build/ejb
     [echo] Copying EAR META-INF/*.xml files...
     [copy] Copying 2 files to /home/jv/workCapstone/Distributor/src99/ejb2/build/ear/META-INF
     [echo] Copying EJB META-INF/*.xml files...
     [copy] Copying 2 files to /home/jv/workCapstone/Distributor/src99/ejb2/build/ejb/META-INF
     [echo] Copying appClient META-INF/*.xml files...
     [copy] Copying 2 files to /home/jv/workCapstone/Distributor/src99/ejb2/build/appclient/META-INF

dist:
     [echo] Creating EJB JAR file....
      [jar] Building jar: /home/jv/workCapstone/Distributor/src99/ejb2/dist/ejb/ejb-jar-ic.jar
    [unjar] Expanding: /home/jv/workCapstone/Distributor/src99/ejb2/dist/ejb/ejb-jar-ic.jar into /home/jv/workCapstone/Distributor/src99/ejb2/dist/ejb
     [echo] Creating AppClient JAR file....
      [jar] Building jar: /home/jv/workCapstone/Distributor/src99/ejb2/dist/appclient/app-client-ic.jar
    [unjar] Expanding: /home/jv/workCapstone/Distributor/src99/ejb2/dist/appclient/app-client-ic.jar into /home/jv/workCapstone/Distributor/src99/ejb2/dist/appclient
     [echo] Copying EJB JAR files...
     [copy] Copying 1 file to /home/jv/workCapstone/Distributor/src99/ejb2/build/ear
     [copy] Copying 1 file to /home/jv/workCapstone/Distributor/src99/ejb2/build/ear
     [echo] Creating EJB JAR file....
      [jar] Building jar: /home/jv/workCapstone/Distributor/src99/ejb2/dist/ejb2.ear
     [echo] Expanding EAR file....
    [unjar] Expanding: /home/jv/workCapstone/Distributor/src99/ejb2/dist/ejb2.ear into /home/jv/workCapstone/Distributor/src99/ejb2/dist/ear

BUILD SUCCESSFUL
Total time: 8 seconds
build:
total 20
drwxrwxr-x    5 jv       jv           4096 Jul 22 16:42 .
drwxrwxr-x    8 jv       jv           4096 Jul 22 16:42 ..
drwxrwxr-x    3 jv       jv           4096 Jul 22 16:42 appclient
drwxrwxr-x    3 jv       jv           4096 Jul 22 16:42 ear
drwxrwxr-x    4 jv       jv           4096 Jul 22 16:42 ejb

build/appclient:
total 16
drwxrwxr-x    3 jv       jv           4096 Jul 22 16:42 .
drwxrwxr-x    5 jv       jv           4096 Jul 22 16:42 ..
-rw-rw-r--    1 jv       jv           2107 Jul 22 16:42 AbcdClient.class
drwxrwxr-x    2 jv       jv           4096 Jul 22 16:42 META-INF

build/appclient/META-INF:
total 16
drwxrwxr-x    2 jv       jv           4096 Jul 22 16:42 .
drwxrwxr-x    3 jv       jv           4096 Jul 22 16:42 ..
-rw-rw-r--    1 jv       jv            515 Jul 22 16:42 application-client.xml
-rw-rw-r--    1 jv       jv            412 Jul 22 16:42 sun-application-client.xml

build/ear:
total 32
drwxrwxr-x    3 jv       jv           4096 Jul 22 16:42 .
drwxrwxr-x    5 jv       jv           4096 Jul 22 16:42 ..
-rw-rw-r--    1 jv       jv           2384 Jul 22 16:42 app-client-ic.jar
-rw-rw-r--    1 jv       jv          13285 Jul 22 16:42 ejb-jar-ic.jar
drwxrwxr-x    2 jv       jv           4096 Jul 22 16:42 META-INF

build/ear/META-INF:
total 16
drwxrwxr-x    2 jv       jv           4096 Jul 22 16:42 .
drwxrwxr-x    3 jv       jv           4096 Jul 22 16:42 ..
-rw-rw-r--    1 jv       jv            497 Jul 22 16:42 application.xml
-rw-rw-r--    1 jv       jv            348 Jul 22 16:42 sun-application.xml

build/ejb:
total 24
drwxrwxr-x    4 jv       jv           4096 Jul 22 16:42 .
drwxrwxr-x    5 jv       jv           4096 Jul 22 16:42 ..
-rw-rw-r--    1 jv       jv           7569 Jul 22 16:42 jar-common.jar
drwxrwxr-x    2 jv       jv           4096 Jul 22 16:42 jvejb2
drwxrwxr-x    2 jv       jv           4096 Jul 22 16:42 META-INF

build/ejb/jvejb2:
total 32
drwxrwxr-x    2 jv       jv           4096 Jul 22 16:42 .
drwxrwxr-x    4 jv       jv           4096 Jul 22 16:42 ..
-rw-rw-r--    1 jv       jv           2114 Jul 22 16:42 AbcdBean.class
-rw-rw-r--    1 jv       jv            611 Jul 22 16:42 Abcd.class
-rw-rw-r--    1 jv       jv            213 Jul 22 16:42 AbcdHome.class
-rw-rw-r--    1 jv       jv           8211 Jul 22 16:42 JVDatabase.class

build/ejb/META-INF:
total 16
drwxrwxr-x    2 jv       jv           4096 Jul 22 16:42 .
drwxrwxr-x    4 jv       jv           4096 Jul 22 16:42 ..
-rw-rw-r--    1 jv       jv           1213 Jul 22 16:42 ejb-jar.xml
-rw-rw-r--    1 jv       jv            548 Jul 22 16:42 sun-ejb-jar.xml

dist:
total 36
drwxrwxr-x    5 jv       jv           4096 Jul 22 16:42 .
drwxrwxr-x    8 jv       jv           4096 Jul 22 16:42 ..
drwxrwxr-x    3 jv       jv           4096 Jul 22 16:42 appclient
drwxrwxr-x    3 jv       jv           4096 Jul 22 16:42 ear
drwxrwxr-x    4 jv       jv           4096 Jul 22 16:42 ejb
-rw-rw-r--    1 jv       jv          16068 Jul 22 16:42 ejb2.ear

dist/appclient:
total 20
drwxrwxr-x    3 jv       jv           4096 Jul 22 16:42 .
drwxrwxr-x    5 jv       jv           4096 Jul 22 16:42 ..
-rw-rw-r--    1 jv       jv           2107 Jul 22 16:42 AbcdClient.class
-rw-rw-r--    1 jv       jv           2384 Jul 22 16:42 app-client-ic.jar
drwxrwxr-x    2 jv       jv           4096 Jul 22  2004 META-INF

dist/appclient/META-INF:
total 20
drwxrwxr-x    2 jv       jv           4096 Jul 22  2004 .
drwxrwxr-x    3 jv       jv           4096 Jul 22 16:42 ..
-rw-rw-r--    1 jv       jv            515 Jul 22 16:42 application-client.xml
-rw-rw-r--    1 jv       jv            134 Jul 22 16:42 MANIFEST.MF
-rw-rw-r--    1 jv       jv            412 Jul 22 16:42 sun-application-client.xml

dist/ear:
total 32
drwxrwxr-x    3 jv       jv           4096 Jul 22 16:42 .
drwxrwxr-x    5 jv       jv           4096 Jul 22 16:42 ..
-rw-rw-r--    1 jv       jv           2384 Jul 22  2004 app-client-ic.jar
-rw-rw-r--    1 jv       jv          13285 Jul 22  2004 ejb-jar-ic.jar
drwxrwxr-x    2 jv       jv           4096 Jul 22  2004 META-INF

dist/ear/META-INF:
total 20
drwxrwxr-x    2 jv       jv           4096 Jul 22  2004 .
drwxrwxr-x    3 jv       jv           4096 Jul 22 16:42 ..
-rw-rw-r--    1 jv       jv            497 Jul 22 16:42 application.xml
-rw-rw-r--    1 jv       jv            257 Jul 22 16:42 MANIFEST.MF
-rw-rw-r--    1 jv       jv            348 Jul 22 16:42 sun-application.xml

dist/ejb:
total 40
drwxrwxr-x    4 jv       jv           4096 Jul 22 16:42 .
drwxrwxr-x    5 jv       jv           4096 Jul 22 16:42 ..
-rw-rw-r--    1 jv       jv          13285 Jul 22 16:42 ejb-jar-ic.jar
-rw-rw-r--    1 jv       jv           7569 Jul 22 16:42 jar-common.jar
drwxrwxr-x    2 jv       jv           4096 Jul 22 16:42 jvejb2
drwxrwxr-x    2 jv       jv           4096 Jul 22 16:42 META-INF

dist/ejb/jvejb2:
total 32
drwxrwxr-x    2 jv       jv           4096 Jul 22 16:42 .
drwxrwxr-x    4 jv       jv           4096 Jul 22 16:42 ..
-rw-rw-r--    1 jv       jv           2114 Jul 22 16:42 AbcdBean.class
-rw-rw-r--    1 jv       jv            611 Jul 22 16:42 Abcd.class
-rw-rw-r--    1 jv       jv            213 Jul 22 16:42 AbcdHome.class
-rw-rw-r--    1 jv       jv           8211 Jul 22 16:42 JVDatabase.class

dist/ejb/META-INF:
total 20
drwxrwxr-x    2 jv       jv           4096 Jul 22 16:42 .
drwxrwxr-x    4 jv       jv           4096 Jul 22 16:42 ..
-rw-rw-r--    1 jv       jv           1213 Jul 22 16:42 ejb-jar.xml
-rw-rw-r--    1 jv       jv            134 Jul 22 16:42 MANIFEST.MF
-rw-rw-r--    1 jv       jv            548 Jul 22 16:42 sun-ejb-jar.xml
