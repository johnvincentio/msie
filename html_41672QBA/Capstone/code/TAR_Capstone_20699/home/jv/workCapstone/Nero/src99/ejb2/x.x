Buildfile: build.xml

clean:
     [echo] Remove build and distributables...
   [delete] Deleting 15 files from /home/jv/workCapstone/Nero/src99/ejb2/build
   [delete] Deleted 10 directories from /home/jv/workCapstone/Nero/src99/ejb2/build
   [delete] Deleting 22 files from /home/jv/workCapstone/Nero/src99/ejb2/dist
   [delete] Deleted 10 directories from /home/jv/workCapstone/Nero/src99/ejb2/dist

mkdirs:
     [echo] Create directories...
    [mkdir] Created dir: /home/jv/workCapstone/Nero/src99/ejb2/dist
    [mkdir] Created dir: /home/jv/workCapstone/Nero/src99/ejb2/dist/ear
    [mkdir] Created dir: /home/jv/workCapstone/Nero/src99/ejb2/dist/ejb
    [mkdir] Created dir: /home/jv/workCapstone/Nero/src99/ejb2/dist/appclient
    [mkdir] Created dir: /home/jv/workCapstone/Nero/src99/ejb2/build
    [mkdir] Created dir: /home/jv/workCapstone/Nero/src99/ejb2/build/ear
    [mkdir] Created dir: /home/jv/workCapstone/Nero/src99/ejb2/build/ear/META-INF
    [mkdir] Created dir: /home/jv/workCapstone/Nero/src99/ejb2/build/appclient
    [mkdir] Created dir: /home/jv/workCapstone/Nero/src99/ejb2/build/appclient/META-INF
    [mkdir] Created dir: /home/jv/workCapstone/Nero/src99/ejb2/build/ejb
    [mkdir] Created dir: /home/jv/workCapstone/Nero/src99/ejb2/build/ejb/META-INF

compile:
     [echo] Compiling EJB java...
    [javac] Compiling 4 source files to /home/jv/workCapstone/Nero/src99/ejb2/build/ejb
     [echo] Compiling appClient java...
    [javac] Compiling 1 source file to /home/jv/workCapstone/Nero/src99/ejb2/build/appclient

build:
     [echo] Copying files from lib...
     [echo] Copying common JARs
     [copy] Copying 1 file to /home/jv/workCapstone/Nero/src99/ejb2/build/ejb/common2
     [copy] Copying 1 file to /home/jv/workCapstone/Nero/src99/ejb2/build/ejb/common4
     [echo] Copying EAR META-INF/*.xml files...
     [copy] Copying 2 files to /home/jv/workCapstone/Nero/src99/ejb2/build/ear/META-INF
     [echo] Copying EJB META-INF/*.xml files...
     [copy] Copying 2 files to /home/jv/workCapstone/Nero/src99/ejb2/build/ejb/META-INF
     [echo] Copying appClient META-INF/*.xml files...
     [copy] Copying 2 files to /home/jv/workCapstone/Nero/src99/ejb2/build/appclient/META-INF

dist:
     [echo] Creating EJB JAR file....
      [jar] Building jar: /home/jv/workCapstone/Nero/src99/ejb2/dist/ejb/ejb-jar-ic.jar
    [unjar] Expanding: /home/jv/workCapstone/Nero/src99/ejb2/dist/ejb/ejb-jar-ic.jar into /home/jv/workCapstone/Nero/src99/ejb2/dist/ejb
     [echo] Creating AppClient JAR file....
      [jar] Building jar: /home/jv/workCapstone/Nero/src99/ejb2/dist/appclient/app-client-ic.jar
    [unjar] Expanding: /home/jv/workCapstone/Nero/src99/ejb2/dist/appclient/app-client-ic.jar into /home/jv/workCapstone/Nero/src99/ejb2/dist/appclient
     [echo] Copying EJB JAR files...
     [copy] Copying 1 file to /home/jv/workCapstone/Nero/src99/ejb2/build/ear
     [copy] Copying 1 file to /home/jv/workCapstone/Nero/src99/ejb2/build/ear
     [echo] Creating EJB JAR file....
      [jar] Building jar: /home/jv/workCapstone/Nero/src99/ejb2/dist/ejb2.ear
     [echo] Expanding EAR file....
    [unjar] Expanding: /home/jv/workCapstone/Nero/src99/ejb2/dist/ejb2.ear into /home/jv/workCapstone/Nero/src99/ejb2/dist/ear

BUILD SUCCESSFUL
Total time: 6 seconds
build:
total 20
drwxrwxr-x    5 jv       jv           4096 Jul 27 13:08 .
drwxr-xr-x    8 jv       jv           4096 Jul 27 13:08 ..
drwxrwxr-x    3 jv       jv           4096 Jul 27 13:08 appclient
drwxrwxr-x    3 jv       jv           4096 Jul 27 13:08 ear
drwxrwxr-x    6 jv       jv           4096 Jul 27 13:08 ejb

build/appclient:
total 16
drwxrwxr-x    3 jv       jv           4096 Jul 27 13:08 .
drwxrwxr-x    5 jv       jv           4096 Jul 27 13:08 ..
-rw-rw-r--    1 jv       jv           2188 Jul 27 13:08 AbcdClient.class
drwxrwxr-x    2 jv       jv           4096 Jul 27 13:08 META-INF

build/appclient/META-INF:
total 16
drwxrwxr-x    2 jv       jv           4096 Jul 27 13:08 .
drwxrwxr-x    3 jv       jv           4096 Jul 27 13:08 ..
-rw-rw-r--    1 jv       jv            499 Jul 27 13:08 application-client.xml
-rw-rw-r--    1 jv       jv            396 Jul 27 13:08 sun-application-client.xml

build/ear:
total 28
drwxrwxr-x    3 jv       jv           4096 Jul 27 13:08 .
drwxrwxr-x    5 jv       jv           4096 Jul 27 13:08 ..
-rw-rw-r--    1 jv       jv           2382 Jul 27 13:08 app-client-ic.jar
-rw-rw-r--    1 jv       jv          11260 Jul 27 13:08 ejb-jar-ic.jar
drwxrwxr-x    2 jv       jv           4096 Jul 27 13:08 META-INF

build/ear/META-INF:
total 16
drwxrwxr-x    2 jv       jv           4096 Jul 27 13:08 .
drwxrwxr-x    3 jv       jv           4096 Jul 27 13:08 ..
-rw-rw-r--    1 jv       jv            497 Jul 27 13:08 application.xml
-rw-rw-r--    1 jv       jv            348 Jul 27 13:08 sun-application.xml

build/ejb:
total 24
drwxrwxr-x    6 jv       jv           4096 Jul 27 13:08 .
drwxrwxr-x    5 jv       jv           4096 Jul 27 13:08 ..
drwxrwxr-x    2 jv       jv           4096 Jul 27 13:08 common2
drwxrwxr-x    2 jv       jv           4096 Jul 27 13:08 common4
drwxrwxr-x    2 jv       jv           4096 Jul 27 13:08 jvejb2
drwxrwxr-x    2 jv       jv           4096 Jul 27 13:08 META-INF

build/ejb/common2:
total 12
drwxrwxr-x    2 jv       jv           4096 Jul 27 13:08 .
drwxrwxr-x    6 jv       jv           4096 Jul 27 13:08 ..
-rw-rw-r--    1 jv       jv           3397 Jul 27 13:08 jar-common.jar

build/ejb/common4:
total 12
drwxrwxr-x    2 jv       jv           4096 Jul 27 13:08 .
drwxrwxr-x    6 jv       jv           4096 Jul 27 13:08 ..
-rw-rw-r--    1 jv       jv           1590 Jul 27 13:08 jar-common.jar

build/ejb/jvejb2:
total 28
drwxrwxr-x    2 jv       jv           4096 Jul 27 13:08 .
drwxrwxr-x    6 jv       jv           4096 Jul 27 13:08 ..
-rw-rw-r--    1 jv       jv           2006 Jul 27 13:08 AbcdBean.class
-rw-rw-r--    1 jv       jv            638 Jul 27 13:08 Abcd.class
-rw-rw-r--    1 jv       jv            213 Jul 27 13:08 AbcdHome.class
-rw-rw-r--    1 jv       jv           7996 Jul 27 13:08 JVDatabase.class

build/ejb/META-INF:
total 16
drwxrwxr-x    2 jv       jv           4096 Jul 27 13:08 .
drwxrwxr-x    6 jv       jv           4096 Jul 27 13:08 ..
-rw-rw-r--    1 jv       jv           1170 Jul 27 13:08 ejb-jar.xml
-rw-rw-r--    1 jv       jv            517 Jul 27 13:08 sun-ejb-jar.xml

dist:
total 36
drwxrwxr-x    5 jv       jv           4096 Jul 27 13:08 .
drwxr-xr-x    8 jv       jv           4096 Jul 27 13:08 ..
drwxrwxr-x    3 jv       jv           4096 Jul 27 13:08 appclient
drwxrwxr-x    3 jv       jv           4096 Jul 27 13:08 ear
drwxrwxr-x    6 jv       jv           4096 Jul 27 13:08 ejb
-rw-rw-r--    1 jv       jv          13796 Jul 27 13:08 ejb2.ear

dist/appclient:
total 20
drwxrwxr-x    3 jv       jv           4096 Jul 27 13:08 .
drwxrwxr-x    5 jv       jv           4096 Jul 27 13:08 ..
-rw-rw-r--    1 jv       jv           2188 Jul 27  2004 AbcdClient.class
-rw-rw-r--    1 jv       jv           2382 Jul 27 13:08 app-client-ic.jar
drwxrwxr-x    2 jv       jv           4096 Jul 27  2004 META-INF

dist/appclient/META-INF:
total 20
drwxrwxr-x    2 jv       jv           4096 Jul 27  2004 .
drwxrwxr-x    3 jv       jv           4096 Jul 27 13:08 ..
-rw-rw-r--    1 jv       jv            499 Jul 27  2004 application-client.xml
-rw-rw-r--    1 jv       jv            134 Jul 27 13:08 MANIFEST.MF
-rw-rw-r--    1 jv       jv            396 Jul 27  2004 sun-application-client.xml

dist/ear:
total 28
drwxrwxr-x    3 jv       jv           4096 Jul 27 13:08 .
drwxrwxr-x    5 jv       jv           4096 Jul 27 13:08 ..
-rw-rw-r--    1 jv       jv           2382 Jul 27  2004 app-client-ic.jar
-rw-rw-r--    1 jv       jv          11260 Jul 27  2004 ejb-jar-ic.jar
drwxrwxr-x    2 jv       jv           4096 Jul 27  2004 META-INF

dist/ear/META-INF:
total 20
drwxrwxr-x    2 jv       jv           4096 Jul 27  2004 .
drwxrwxr-x    3 jv       jv           4096 Jul 27 13:08 ..
-rw-rw-r--    1 jv       jv            497 Jul 27  2004 application.xml
-rw-rw-r--    1 jv       jv            257 Jul 27 13:08 MANIFEST.MF
-rw-rw-r--    1 jv       jv            348 Jul 27  2004 sun-application.xml

dist/ejb:
total 36
drwxrwxr-x    6 jv       jv           4096 Jul 27 13:08 .
drwxrwxr-x    5 jv       jv           4096 Jul 27 13:08 ..
drwxrwxr-x    2 jv       jv           4096 Jul 27 13:08 common2
drwxrwxr-x    2 jv       jv           4096 Jul 27  2004 common4
-rw-rw-r--    1 jv       jv          11260 Jul 27 13:08 ejb-jar-ic.jar
drwxrwxr-x    2 jv       jv           4096 Jul 27 13:08 jvejb2
drwxrwxr-x    2 jv       jv           4096 Jul 27 13:08 META-INF

dist/ejb/common2:
total 12
drwxrwxr-x    2 jv       jv           4096 Jul 27 13:08 .
drwxrwxr-x    6 jv       jv           4096 Jul 27 13:08 ..
-rw-rw-r--    1 jv       jv           3397 Jul 27  2004 jar-common.jar

dist/ejb/common4:
total 12
drwxrwxr-x    2 jv       jv           4096 Jul 27  2004 .
drwxrwxr-x    6 jv       jv           4096 Jul 27 13:08 ..
-rw-rw-r--    1 jv       jv           1590 Jul 27  2004 jar-common.jar

dist/ejb/jvejb2:
total 28
drwxrwxr-x    2 jv       jv           4096 Jul 27 13:08 .
drwxrwxr-x    6 jv       jv           4096 Jul 27 13:08 ..
-rw-rw-r--    1 jv       jv           2006 Jul 27 13:08 AbcdBean.class
-rw-rw-r--    1 jv       jv            638 Jul 27 13:08 Abcd.class
-rw-rw-r--    1 jv       jv            213 Jul 27 13:08 AbcdHome.class
-rw-rw-r--    1 jv       jv           7996 Jul 27 13:08 JVDatabase.class

dist/ejb/META-INF:
total 20
drwxrwxr-x    2 jv       jv           4096 Jul 27 13:08 .
drwxrwxr-x    6 jv       jv           4096 Jul 27 13:08 ..
-rw-rw-r--    1 jv       jv           1170 Jul 27  2004 ejb-jar.xml
-rw-rw-r--    1 jv       jv            134 Jul 27 13:08 MANIFEST.MF
-rw-rw-r--    1 jv       jv            517 Jul 27  2004 sun-ejb-jar.xml
