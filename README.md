# Environment

## Runtime environment

1. Java 17 or later
    1. [pulumi-java](https://github.com/pulumi/pulumi-java) requires Java 11, but
       [scala 3.8](https://github.com/scala/scala3) requires Java 17

2. Plumi 3.235.0 or later
    1. Mac: `brew install pulumi/tap/pulumi`

## Build environment

1. Recent Linux / macOS / Windows

2. Java 25
    1. [Install Coursier](https://get-coursier.io/docs/cli-installation), then 

           eval $(cs java --jvm corretto:25 --env)

3. [mill](https://com-lihaoyi.github.io/mill/)
    1. The launcher scripts were downloaded as follows, and then committed to the repository.

           curl -Lf https://repo1.maven.org/maven2/com/lihaoyi/mill-dist/1.1.5/mill-dist-1.1.5-mill.sh -o mill
           chmod +x mill

           curl -Lf https://repo1.maven.org/maven2/com/lihaoyi/mill-dist/1.1.5/mill-dist-1.1.5-mill.bat -o mill.bat


# Build

## Generate the Scala wrappers

    ./mill _.generate
    ./mill _.compile

1. `publishLocal` that outputs to `~/.ivy2/local` is not used (unreliable)
    1. [The local ivy2 repository is searched before Maven Central by default](https://get-coursier.io/docs/other-repositories), but
    2. [SNAPSHOT versions are cached for 24 hours by default](https://get-coursier.io/docs/ttl)


# Development

## Show the available dependency updates

    ./mill mill.scalalib.Dependency/showUpdates
