# Environment

## Runtime environment

1. Java 11 or later
    1. [pulumi-java](https://github.com/pulumi/pulumi-java) requires Java 11, but
       [scala 3.8](https://github.com/scala/scala3) required Java 17

## Build environment

1. Recent Linux / macOS / Windows

1. Java 25
    1. [Install Coursier](https://get-coursier.io/docs/cli-installation), then 

           eval $(cs java --jvm corretto:25 --env)

3. [mill](https://com-lihaoyi.github.io/mill/)
    1. The scripts have been commited as

           curl -L https://repo1.maven.org/maven2/com/lihaoyi/mill-dist/1.0.6/mill-dist-1.0.6-mill.sh -o mill
           chmod +x mill

           curl -L https://repo1.maven.org/maven2/com/lihaoyi/mill-dist/1.0.6/mill-dist-1.0.6-mill.bat -o mill.bat
