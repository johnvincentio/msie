Buildfile: build.xml

dist:

clean:
     [echo] Remove build and distributables...
   [delete] Deleting 12 files from /home/jv/workCapstone/Common1/src99/common/build
   [delete] Deleted 3 directories from /home/jv/workCapstone/Common1/src99/common/build
   [delete] Deleting 14 files from /home/jv/workCapstone/Common1/src99/common/dist
   [delete] Deleted 4 directories from /home/jv/workCapstone/Common1/src99/common/dist

mkdirs:
     [echo] Create directories...
    [mkdir] Created dir: /home/jv/workCapstone/Common1/src99/common/dist
    [mkdir] Created dir: /home/jv/workCapstone/Common1/src99/common/dist/contents
    [mkdir] Created dir: /home/jv/workCapstone/Common1/src99/common/build
    [mkdir] Created dir: /home/jv/workCapstone/Common1/src99/common/build/META-INF

compile:
     [echo] Compiling java...
    [javac] Compiling 12 source files to /home/jv/workCapstone/Common1/src99/common/build

build:
     [echo] Copying files from lib...

dist:
     [echo] Creating JAR file....
      [jar] Building jar: /home/jv/workCapstone/Common1/src99/common/dist/jar-common.jar
    [unjar] Expanding: /home/jv/workCapstone/Common1/src99/common/dist/jar-common.jar into /home/jv/workCapstone/Common1/src99/common/dist/contents

all:

BUILD SUCCESSFUL
Total time: 5 seconds
