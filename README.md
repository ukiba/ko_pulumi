# Environment

## Runtime environment

1. Java 17 or later
    1. [pulumi-java](https://github.com/pulumi/pulumi-java) requires Java 11, but
       [scala 3.8](https://github.com/scala/scala3) requires Java 17

1. Plumi 3.204.0 or later
    1. Mac: `brew install pulumi/tap/pulumi`

## Build environment

1. Recent Linux / macOS / Windows

1. Java 25
    1. [Install Coursier](https://get-coursier.io/docs/cli-installation), then 

           eval $(cs java --jvm corretto:25 --env)

3. [mill](https://com-lihaoyi.github.io/mill/)
    1. The launcher scripts have been committed

           curl -L https://repo1.maven.org/maven2/com/lihaoyi/mill-dist/1.0.6/mill-dist-1.0.6-mill.sh -o mill
           chmod +x mill

           curl -L https://repo1.maven.org/maven2/com/lihaoyi/mill-dist/1.0.6/mill-dist-1.0.6-mill.bat -o mill.bat


# Build

## Generate the Scala wrappers

    ./mill _.compile

1. `publishLocal` that outputs to `~/.ivy2/local` is unreliable
    1. [The local ivy2 repository is searched before Maven Central by default](https://get-coursier.io/docs/other-repositories), but
    2. [SNAPSHOT versions are cached for 24 hours by default](https://get-coursier.io/docs/ttl)


# Development

## Show the available dependency updates

    ./mill mill.scalalib.Dependency/showUpdates

## Review the changes in the generated sources

    cd out/aws/
    git init -b main
    echo '/*' > .gitignore
    echo '!generatedSources.dest' >> .gitignore
    echo '!.gitignore' >> .gitignore
    git add generatedSources.dest .gitignore
    git commit -m orig
