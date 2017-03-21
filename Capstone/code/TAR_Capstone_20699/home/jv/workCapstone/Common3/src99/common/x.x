Buildfile: build.xml

clean:
     [echo] Remove build and distributables...

mkdirs:
     [echo] Create directories...
    [mkdir] Created dir: /home/jv/workCapstone/Common3/src99/common/dist
    [mkdir] Created dir: /home/jv/workCapstone/Common3/src99/common/dist/contents
    [mkdir] Created dir: /home/jv/workCapstone/Common3/src99/common/build
    [mkdir] Created dir: /home/jv/workCapstone/Common3/src99/common/build/META-INF

compile:
     [echo] Compiling java...
    [javac] Compiling 11 source files to /home/jv/workCapstone/Common3/src99/common/build

build:
     [echo] Copying files from lib...

dist:
     [echo] Creating JAR file....
      [jar] Building jar: /home/jv/workCapstone/Common3/src99/common/dist/jar-common.jar
    [unjar] Expanding: /home/jv/workCapstone/Common3/src99/common/dist/jar-common.jar into /home/jv/workCapstone/Common3/src99/common/dist/contents

BUILD SUCCESSFUL
Total time: 5 seconds
build:
total 16
drwxrwxr-x    4 jv       jv           4096 Jul 27 12:18 .
drwxr-xr-x    6 jv       jv           4096 Jul 27 12:18 ..
drwxrwxr-x    2 jv       jv           4096 Jul 27 12:18 jvtemplate
drwxrwxr-x    2 jv       jv           4096 Jul 27 12:18 META-INF

build/jvtemplate:
total 52
drwxrwxr-x    2 jv       jv           4096 Jul 27 12:18 .
drwxrwxr-x    4 jv       jv           4096 Jul 27 12:18 ..
-rw-rw-r--    1 jv       jv            694 Jul 27 12:18 JVBody.class
-rw-rw-r--    1 jv       jv            283 Jul 27 12:18 JVColumn.class
-rw-rw-r--    1 jv       jv            320 Jul 27 12:18 JVFooter.class
-rw-rw-r--    1 jv       jv            320 Jul 27 12:18 JVHeader.class
-rw-rw-r--    1 jv       jv            692 Jul 27 12:18 JVMenu.class
-rw-rw-r--    1 jv       jv            370 Jul 27 12:18 JVPair.class
-rw-rw-r--    1 jv       jv            505 Jul 27 12:18 JVSubBody.class
-rw-rw-r--    1 jv       jv            641 Jul 27 12:18 JVSubMenu.class
-rw-rw-r--    1 jv       jv           1031 Jul 27 12:18 JVTabs.class
-rw-rw-r--    1 jv       jv            637 Jul 27 12:18 JVTabsItems.class
-rw-rw-r--    1 jv       jv           1094 Jul 27 12:18 JVTemplate.class

build/META-INF:
total 8
drwxrwxr-x    2 jv       jv           4096 Jul 27 12:18 .
drwxrwxr-x    4 jv       jv           4096 Jul 27 12:18 ..

dist:
total 20
drwxrwxr-x    3 jv       jv           4096 Jul 27 12:18 .
drwxr-xr-x    6 jv       jv           4096 Jul 27 12:18 ..
drwxrwxr-x    4 jv       jv           4096 Jul 27 12:18 contents
-rw-rw-r--    1 jv       jv           5604 Jul 27 12:18 jar-common.jar

dist/contents:
total 16
drwxrwxr-x    4 jv       jv           4096 Jul 27 12:18 .
drwxrwxr-x    3 jv       jv           4096 Jul 27 12:18 ..
drwxrwxr-x    2 jv       jv           4096 Jul 27 12:18 jvtemplate
drwxrwxr-x    2 jv       jv           4096 Jul 27 12:18 META-INF

dist/contents/jvtemplate:
total 52
drwxrwxr-x    2 jv       jv           4096 Jul 27 12:18 .
drwxrwxr-x    4 jv       jv           4096 Jul 27 12:18 ..
-rw-rw-r--    1 jv       jv            694 Jul 27 12:18 JVBody.class
-rw-rw-r--    1 jv       jv            283 Jul 27 12:18 JVColumn.class
-rw-rw-r--    1 jv       jv            320 Jul 27 12:18 JVFooter.class
-rw-rw-r--    1 jv       jv            320 Jul 27 12:18 JVHeader.class
-rw-rw-r--    1 jv       jv            692 Jul 27 12:18 JVMenu.class
-rw-rw-r--    1 jv       jv            370 Jul 27 12:18 JVPair.class
-rw-rw-r--    1 jv       jv            505 Jul 27 12:18 JVSubBody.class
-rw-rw-r--    1 jv       jv            641 Jul 27 12:18 JVSubMenu.class
-rw-rw-r--    1 jv       jv           1031 Jul 27 12:18 JVTabs.class
-rw-rw-r--    1 jv       jv            637 Jul 27 12:18 JVTabsItems.class
-rw-rw-r--    1 jv       jv           1094 Jul 27 12:18 JVTemplate.class

dist/contents/META-INF:
total 12
drwxrwxr-x    2 jv       jv           4096 Jul 27 12:18 .
drwxrwxr-x    4 jv       jv           4096 Jul 27 12:18 ..
-rw-rw-r--    1 jv       jv            134 Jul 27 12:18 MANIFEST.MF
