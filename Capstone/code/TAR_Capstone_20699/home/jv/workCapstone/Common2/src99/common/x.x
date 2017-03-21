Buildfile: build.xml

clean:
     [echo] Remove build and distributables...
   [delete] Deleted 2 directories from /home/jv/workCapstone/Common2/src99/common/build
   [delete] Deleted 2 directories from /home/jv/workCapstone/Common2/src99/common/dist

mkdirs:
     [echo] Create directories...
    [mkdir] Created dir: /home/jv/workCapstone/Common2/src99/common/dist
    [mkdir] Created dir: /home/jv/workCapstone/Common2/src99/common/dist/contents
    [mkdir] Created dir: /home/jv/workCapstone/Common2/src99/common/build
    [mkdir] Created dir: /home/jv/workCapstone/Common2/src99/common/build/META-INF

compile:
     [echo] Compiling java...
    [javac] Compiling 6 source files to /home/jv/workCapstone/Common2/src99/common/build

build:
     [echo] Copying files from lib...

dist:
     [echo] Creating JAR file....
      [jar] Building jar: /home/jv/workCapstone/Common2/src99/common/dist/jar-common.jar
    [unjar] Expanding: /home/jv/workCapstone/Common2/src99/common/dist/jar-common.jar into /home/jv/workCapstone/Common2/src99/common/dist/contents

BUILD SUCCESSFUL
Total time: 5 seconds
build:
total 16
drwxrwxr-x    4 jv       jv           4096 Jul 27 12:27 .
drwxr-xr-x    6 jv       jv           4096 Jul 27 12:27 ..
drwxrwxr-x    2 jv       jv           4096 Jul 27 12:27 jvcart
drwxrwxr-x    2 jv       jv           4096 Jul 27 12:27 META-INF

build/jvcart:
total 32
drwxrwxr-x    2 jv       jv           4096 Jul 27 12:27 .
drwxrwxr-x    4 jv       jv           4096 Jul 27 12:27 ..
-rw-rw-r--    1 jv       jv            704 Jul 27 12:27 JVCart.class
-rw-rw-r--    1 jv       jv            454 Jul 27 12:27 JVCatalog.class
-rw-rw-r--    1 jv       jv            641 Jul 27 12:27 JVCatalogItem.class
-rw-rw-r--    1 jv       jv            513 Jul 27 12:27 JVCatalogName.class
-rw-rw-r--    1 jv       jv            459 Jul 27 12:27 JVCatalogNames.class
-rw-rw-r--    1 jv       jv            950 Jul 27 12:27 JVItem.class

build/META-INF:
total 8
drwxrwxr-x    2 jv       jv           4096 Jul 27 12:27 .
drwxrwxr-x    4 jv       jv           4096 Jul 27 12:27 ..

dist:
total 16
drwxrwxr-x    3 jv       jv           4096 Jul 27 12:27 .
drwxr-xr-x    6 jv       jv           4096 Jul 27 12:27 ..
drwxrwxr-x    4 jv       jv           4096 Jul 27 12:27 contents
-rw-rw-r--    1 jv       jv           3397 Jul 27 12:27 jar-common.jar

dist/contents:
total 16
drwxrwxr-x    4 jv       jv           4096 Jul 27 12:27 .
drwxrwxr-x    3 jv       jv           4096 Jul 27 12:27 ..
drwxrwxr-x    2 jv       jv           4096 Jul 27 12:27 jvcart
drwxrwxr-x    2 jv       jv           4096 Jul 27 12:27 META-INF

dist/contents/jvcart:
total 32
drwxrwxr-x    2 jv       jv           4096 Jul 27 12:27 .
drwxrwxr-x    4 jv       jv           4096 Jul 27 12:27 ..
-rw-rw-r--    1 jv       jv            704 Jul 27  2004 JVCart.class
-rw-rw-r--    1 jv       jv            454 Jul 27  2004 JVCatalog.class
-rw-rw-r--    1 jv       jv            641 Jul 27  2004 JVCatalogItem.class
-rw-rw-r--    1 jv       jv            513 Jul 27  2004 JVCatalogName.class
-rw-rw-r--    1 jv       jv            459 Jul 27  2004 JVCatalogNames.class
-rw-rw-r--    1 jv       jv            950 Jul 27  2004 JVItem.class

dist/contents/META-INF:
total 12
drwxrwxr-x    2 jv       jv           4096 Jul 27 12:27 .
drwxrwxr-x    4 jv       jv           4096 Jul 27 12:27 ..
-rw-rw-r--    1 jv       jv            134 Jul 27 12:27 MANIFEST.MF
