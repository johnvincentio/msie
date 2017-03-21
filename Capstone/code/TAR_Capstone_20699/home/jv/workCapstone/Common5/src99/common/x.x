Buildfile: build.xml

clean:
     [echo] Remove build and distributables...
   [delete] Deleting 1 files from /home/jv/workCapstone/Common5/src99/common/build
   [delete] Deleted 3 directories from /home/jv/workCapstone/Common5/src99/common/build
   [delete] Deleted 2 directories from /home/jv/workCapstone/Common5/src99/common/dist

mkdirs:
     [echo] Create directories...
    [mkdir] Created dir: /home/jv/workCapstone/Common5/src99/common/dist
    [mkdir] Created dir: /home/jv/workCapstone/Common5/src99/common/dist/contents
    [mkdir] Created dir: /home/jv/workCapstone/Common5/src99/common/build
    [mkdir] Created dir: /home/jv/workCapstone/Common5/src99/common/build/META-INF

compile:
     [echo] Compiling java...
    [javac] Compiling 3 source files to /home/jv/workCapstone/Common5/src99/common/build

build:
     [echo] Copying files from lib...

dist:
     [echo] Creating JAR file....
      [jar] Building jar: /home/jv/workCapstone/Common5/src99/common/dist/jar-common.jar
    [unjar] Expanding: /home/jv/workCapstone/Common5/src99/common/dist/jar-common.jar into /home/jv/workCapstone/Common5/src99/common/dist/contents
     [copy] Copying 1 file to /home/jv/workCapstone/Common5/src99/common/dist

checkXML:
     [echo] Checking custom tag library for version 2.0

jsptaglib_2_0:
     [echo] Checking custom tag library for version 2.0

XMLinit:

XMLExist:
     [echo] Checking /home/jv/workCapstone/Common5/src99/common/tags/JVTags.tld
     [java] start parsing a grammar.
     [java] validating /home/jv/workCapstone/Common5/src99/common/tags/JVTags.tld
     [java] the document is valid.



XMLNoExist:

XMLValidate:

all:

BUILD SUCCESSFUL
Total time: 10 seconds
build:
total 16
drwxrwxr-x    4 jv       jv           4096 Jul 28 22:29 .
drwxr-xr-x    7 jv       jv           4096 Jul 28 22:29 ..
drwxrwxr-x    2 jv       jv           4096 Jul 28 22:29 jvtag
drwxrwxr-x    2 jv       jv           4096 Jul 28 22:29 META-INF

build/jvtag:
total 20
drwxrwxr-x    2 jv       jv           4096 Jul 28 22:29 .
drwxrwxr-x    4 jv       jv           4096 Jul 28 22:29 ..
-rw-rw-r--    1 jv       jv            986 Jul 28 22:29 Debug.class
-rw-rw-r--    1 jv       jv           1347 Jul 28 22:29 GreetTag.class
-rw-rw-r--    1 jv       jv            872 Jul 28 22:29 HiTag.class

build/META-INF:
total 8
drwxrwxr-x    2 jv       jv           4096 Jul 28 22:29 .
drwxrwxr-x    4 jv       jv           4096 Jul 28 22:29 ..

dist:
total 20
drwxrwxr-x    3 jv       jv           4096 Jul 28 22:29 .
drwxr-xr-x    7 jv       jv           4096 Jul 28 22:29 ..
drwxrwxr-x    4 jv       jv           4096 Jul 28 22:29 contents
-rw-rw-r--    1 jv       jv           2534 Jul 28 22:29 jar-common.jar
-rw-rw-r--    1 jv       jv           1762 Jul 28 22:29 JVTags.tld

dist/contents:
total 16
drwxrwxr-x    4 jv       jv           4096 Jul 28 22:29 .
drwxrwxr-x    3 jv       jv           4096 Jul 28 22:29 ..
drwxrwxr-x    2 jv       jv           4096 Jul 28 22:29 jvtag
drwxrwxr-x    2 jv       jv           4096 Jul 28 22:29 META-INF

dist/contents/jvtag:
total 20
drwxrwxr-x    2 jv       jv           4096 Jul 28 22:29 .
drwxrwxr-x    4 jv       jv           4096 Jul 28 22:29 ..
-rw-rw-r--    1 jv       jv            986 Jul 28 22:29 Debug.class
-rw-rw-r--    1 jv       jv           1347 Jul 28 22:29 GreetTag.class
-rw-rw-r--    1 jv       jv            872 Jul 28 22:29 HiTag.class

dist/contents/META-INF:
total 12
drwxrwxr-x    2 jv       jv           4096 Jul 28 22:29 .
drwxrwxr-x    4 jv       jv           4096 Jul 28 22:29 ..
-rw-rw-r--    1 jv       jv            134 Jul 28 22:29 MANIFEST.MF
