Buildfile: build.xml

clean:
     [echo] Remove build and distributables...

mkdirs:
     [echo] Create directories...
    [mkdir] Created dir: /home/jv/workCapstone/Common4/src99/common/dist
    [mkdir] Created dir: /home/jv/workCapstone/Common4/src99/common/dist/contents
    [mkdir] Created dir: /home/jv/workCapstone/Common4/src99/common/build
    [mkdir] Created dir: /home/jv/workCapstone/Common4/src99/common/build/META-INF

compile:
     [echo] Compiling java...
    [javac] Compiling 1 source file to /home/jv/workCapstone/Common4/src99/common/build

build:
     [echo] Copying files from lib...

dist:
     [echo] Creating JAR file....
      [jar] Building jar: /home/jv/workCapstone/Common4/src99/common/dist/jar-common.jar
    [unjar] Expanding: /home/jv/workCapstone/Common4/src99/common/dist/jar-common.jar into /home/jv/workCapstone/Common4/src99/common/dist/contents

BUILD SUCCESSFUL
Total time: 5 seconds
build:
total 16
drwxrwxr-x    4 jv       jv           4096 Jul 27 12:23 .
drwxr-xr-x    6 jv       jv           4096 Jul 27 12:23 ..
drwxrwxr-x    2 jv       jv           4096 Jul 27 12:23 jvdebug
drwxrwxr-x    2 jv       jv           4096 Jul 27 12:23 META-INF

build/jvdebug:
total 12
drwxrwxr-x    2 jv       jv           4096 Jul 27 12:23 .
drwxrwxr-x    4 jv       jv           4096 Jul 27 12:23 ..
-rw-rw-r--    1 jv       jv           1990 Jul 27 12:23 Debug.class

build/META-INF:
total 8
drwxrwxr-x    2 jv       jv           4096 Jul 27 12:23 .
drwxrwxr-x    4 jv       jv           4096 Jul 27 12:23 ..

dist:
total 16
drwxrwxr-x    3 jv       jv           4096 Jul 27 12:23 .
drwxr-xr-x    6 jv       jv           4096 Jul 27 12:23 ..
drwxrwxr-x    4 jv       jv           4096 Jul 27 12:23 contents
-rw-rw-r--    1 jv       jv           1590 Jul 27 12:23 jar-common.jar

dist/contents:
total 16
drwxrwxr-x    4 jv       jv           4096 Jul 27 12:23 .
drwxrwxr-x    3 jv       jv           4096 Jul 27 12:23 ..
drwxrwxr-x    2 jv       jv           4096 Jul 27  2004 jvdebug
drwxrwxr-x    2 jv       jv           4096 Jul 27  2004 META-INF

dist/contents/jvdebug:
total 12
drwxrwxr-x    2 jv       jv           4096 Jul 27  2004 .
drwxrwxr-x    4 jv       jv           4096 Jul 27 12:23 ..
-rw-rw-r--    1 jv       jv           1990 Jul 27  2004 Debug.class

dist/contents/META-INF:
total 12
drwxrwxr-x    2 jv       jv           4096 Jul 27  2004 .
drwxrwxr-x    4 jv       jv           4096 Jul 27 12:23 ..
-rw-rw-r--    1 jv       jv            134 Jul 27 12:23 MANIFEST.MF
