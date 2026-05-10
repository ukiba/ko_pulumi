This is a Scala 3 wrapper library for [pulumi-java](https://github.com/pulumi/pulumi-java).

1. Unlike [besom](https://github.com/VirtusLab/besom), the Pulumi Java types are used and directly visible.
    1. Convenient syntax (methods and extensions) is generated to reduce verbosity.

1. The syntax is generated for the following providers:
    1. [pulumi-aws](https://github.com/pulumi/pulumi-aws)
    1. [pulumi-gcp](https://github.com/pulumi/pulumi-gcp)
    1. [pulumi-azure](https://github.com/pulumi/pulumi-azure)


## Example

An example Java code to create an S3 bucket with versioning enabled

    import com.pulumi.aws.s3.Bucket;
    import com.pulumi.aws.s3.BucketArgs;
    import com.pulumi.aws.s3.BucketVersioning;
    import com.pulumi.aws.s3.BucketVersioningArgs;
    import com.pulumi.aws.s3.inputs.BucketVersioningVersioningConfigurationArgs;

    ...

          var bucket = new Bucket("my-bucket", BucketArgs.builder()
              .bucket("my-bucket")
              .tags(Map.of("Name", "my-bucket"))
              .build(), CustomResourceOptions.builder()
              .protect(true)
              .build());

          var versioning = new BucketVersioning("my-bucket-versioning", BucketVersioningArgs.builder()
              .bucket(bucket.id())
              .versioningConfiguration(
                  BucketVersioningVersioningConfigurationArgs.builder()
                      .status("Enabled")
                      .build())
              .build());

Equivalent Scala code with the wrapper would be

    import jp.ukiba.ko_pulumi.aws.syntax.all.*
    import jp.ukiba.ko_pulumi.aws.s3

    val bucket = s3.Bucket("my-bucket", _.protect(true)):  // Scala 3 optional braces syntax
      _.bucket("my-bucket")

    val versioning = s3.BucketVersioning("my-bucket-versioning"): args =>
      args.bucket(bucket.id)
          .versioningConfiguration:
            _.status("Enabled")

1. All the extension methods just call the Java methods of the same name; easy to look up in the provider doc.
1. The noise reduction is not significant in this example but it adds up.

Equivalent code with besom would be

    import besom.*
    import besom.api.aws

    val bucket = aws.s3.Bucket("my-bucket",
      aws.s3.BucketArgs(
        bucket = "my-bucket",
        tags = Map("Name" -> "my-bucket")
      ),
      opts(protect = true)
    )

    val versioning = aws.s3.BucketVersioning("my-bucket-versioning",
      aws.s3.BucketVersioningArgs(
        bucket = bucket.id,
        versioningConfiguration = aws.s3.inputs.BucketVersioningVersioningConfigurationArgs(
          status = "Enabled"
        )
      )
    )


## Known limitations

1. Since Pulumi Java type [`com.pulumi.core.Output`](https://www.pulumi.com/docs/reference/pkg/java/com/pulumi/core/Output.html)
   represents an already-running computation (backed by `CompletableFuture`),
   converting [`cats.effect.IO`](https://typelevel.org/cats-effect/api/3.x/cats/effect/IO.html) into it
   requires `unsafeRun*` and breaks referential transparency.
    1. besom evaluates lazily and does not have this problem.


## Environment

### Runtime environment

1. Java 17 or later
    1. [pulumi-java](https://github.com/pulumi/pulumi-java) requires Java 11, but
       [Scala 3.8](https://github.com/scala/scala3) requires Java 17

1. Pulumi 3.237.0 or later
    1. Mac: `brew install pulumi/tap/pulumi`

### Build environment

1. Recent Linux / macOS / Windows

1. Java 25
    1. [Install Coursier](https://get-coursier.io/docs/cli-installation), then 

           eval $(cs java --jvm corretto:25 --env)

1. [mill](https://com-lihaoyi.github.io/mill/)
    1. The launcher scripts were downloaded as follows, and then committed to the repository.

           curl -Lf https://repo1.maven.org/maven2/com/lihaoyi/mill-dist/1.1.5/mill-dist-1.1.5-mill.sh -o mill
           chmod +x mill

           curl -Lf https://repo1.maven.org/maven2/com/lihaoyi/mill-dist/1.1.5/mill-dist-1.1.5-mill.bat -o mill.bat


## Build

### Generate the Scala wrappers

    ./mill _.generate
    ./mill _.compile


## Development

### Show the available dependency updates

    ./mill mill.scalalib.Dependency/showUpdates
