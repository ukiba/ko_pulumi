Scala wrapper libraries for [pulumi-java](https://github.com/pulumi/pulumi-java).

1. Scala syntaxes (methods and extensions) are generated for the following providers:
    1. [pulumi-aws](https://github.com/pulumi/pulumi-aws)
    1. [pulumi-gcp](https://github.com/pulumi/pulumi-gcp)
    1. [pulumi-azure](https://github.com/pulumi/pulumi-azure)
    1. [pulumi-postgresql](https://github.com/pulumi/pulumi-postgresql)

1. The syntax and implicit conversions are provided to make the code concise.
    1. Unlike [besom](https://github.com/VirtusLab/besom), the Pulumi Java types are used and directly visible.


## Example

### Java

An example Java code to fan out SNS topic messages to an SQS worker queue

```java
import com.pulumi.aws.sns.Topic;
import com.pulumi.aws.sns.TopicArgs;
import com.pulumi.aws.sns.TopicSubscription;
import com.pulumi.aws.sns.TopicSubscriptionArgs;
import com.pulumi.aws.sqs.Queue;
import com.pulumi.aws.sqs.QueueArgs;
import com.pulumi.aws.sqs.QueuePolicy;
import com.pulumi.aws.sqs.QueuePolicyArgs;
import com.pulumi.aws.sqs.inputs.PolicyDocumentArgs;
import com.pulumi.aws.iam.IamFunctions;
import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
import com.pulumi.aws.iam.inputs.GetPolicyDocumentStatementArgs;
import com.pulumi.aws.iam.inputs.GetPolicyDocumentStatementConditionArgs;
import com.pulumi.aws.iam.inputs.GetPolicyDocumentStatementPrincipalArgs;
import com.pulumi.resources.CustomResourceOptions;
import com.pulumi.core.Either;
import java.util.List;
import java.util.Map;

...

    var protectedOpts = CustomResourceOptions.builder().protect(true).build();

    var topic = new Topic("order-events", TopicArgs.builder()
        .name("order-events")
        .displayName("Order events")
        .tags(Map.of("Name", "order-events"))
        .build(), protectedOpts);

    var queue = new Queue("order-worker", QueueArgs.builder()
        .name("order-worker")
        .visibilityTimeoutSeconds(300)
        .tags(Map.of("Name", "order-worker"))
        .build(), protectedOpts);

    var policyDoc = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
        .statements(GetPolicyDocumentStatementArgs.builder()
            .effect("Allow")
            .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
                .type("Service")
                .identifiers("sns.amazonaws.com")
                .build())
            .actions("sqs:SendMessage")
            .resources(queue.arn().applyValue(List::of))
            .conditions(GetPolicyDocumentStatementConditionArgs.builder()
                .test("ArnEquals")
                .variable("aws:SourceArn")
                .values(topic.arn().applyValue(List::of))
                .build())
            .build())
        .build());

    var queuePolicy = new QueuePolicy("order-worker-policy", QueuePolicyArgs.builder()
        .queueUrl(queue.url())
        .policy(policyDoc.applyValue(r -> Either.<String, PolicyDocumentArgs>ofLeft(r.json())))
        .build(), protectedOpts);

    var sub = new TopicSubscription("order-worker-sub", TopicSubscriptionArgs.builder()
        .topic(topic.arn())
        .protocol("sqs")
        .endpoint(queue.arn())
        .build(), CustomResourceOptions.builder().protect(true).dependsOn(queuePolicy).build());
```

### ko_pulumi

Equivalent Scala 3 (optional braces syntax) with this library would be

```scala
import jp.ukiba.ko_pulumi.aws.syntax.all.*
import jp.ukiba.ko_pulumi.aws.{sns, sqs}

// propagate the logical name (e.g. `order-events`) to physical name and Name tag,
// when the builder has `name` and `tags` setter method.  Also protect resource in default.
given KoPulumiConf = KoPulumiConf.PropagateLogicalNameAll.copy(defaultProtect = true)

val topic = sns.Topic("order-events"):
  _.displayName("Order events")

val queue = sqs.Queue("order-worker"):
  _.visibilityTimeoutSeconds(300)

val policyDoc = IamFunctions.getPolicyDocument:
  _.statements:
    _ .effect("Allow")
      .principals:
        _ .`type`("Service")
          .identifiers("sns.amazonaws.com")
      .actions("sqs:SendMessage")
      .resources(queue.arn)
      .conditions:
        _ .test("ArnEquals")
          .variable("aws:SourceArn")
          .values(topic.arn)

val queuePolicy = sqs.QueuePolicy("order-worker-policy"):
  _ .queueUrl(queue.url)
    .policy(policyDoc.map(doc => Left(doc.json)))

val sub = sns.TopicSubscription("order-worker-sub", _.dependsOn(queuePolicy)):
  _ .topic(topic.arn)
    .protocol("sqs")
    .endpoint(queue.arn)
```

1. All the extension methods call the Java methods of the same name; handy to look up in the provider doc.

### besom

Equivalent code with besom would be

```scala
import besom.*
import besom.api.aws.{iam, sns, sqs}

val topic = sns.Topic("order-events",
  sns.TopicArgs(
    name = "order-events",
    displayName = "Order events",
    tags = Map("Name" -> "order-events")
  ),
  opts(protect = true)
)

val queue = sqs.Queue("order-worker",
  sqs.QueueArgs(
    name = "order-worker",
    visibilityTimeoutSeconds = 300,
    tags = Map("Name" -> "order-worker")
  ),
  opts(protect = true)
)

val policyDoc = iam.getPolicyDocument(iam.GetPolicyDocumentArgs(
  statements = List(iam.inputs.GetPolicyDocumentStatementArgs(
    effect = "Allow",
    principals = List(iam.inputs.GetPolicyDocumentStatementPrincipalArgs(
      `type` = "Service",
      identifiers = List("sns.amazonaws.com")
    )),
    actions = List("sqs:SendMessage"),
    resources = List(queue.arn),
    conditions = List(iam.inputs.GetPolicyDocumentStatementConditionArgs(
      test = "ArnEquals",
      variable = "aws:SourceArn",
      values = List(topic.arn)
    ))
  ))
))

val queuePolicy = sqs.QueuePolicy("order-worker-policy",
  sqs.QueuePolicyArgs(
    queueUrl = queue.url,
    policy = policyDoc.json  // this is nice
  ),
  opts(protect = true)
)

val sub = sns.TopicSubscription("order-worker-sub",
  sns.TopicSubscriptionArgs(
    topic = topic.arn,
    protocol = "sqs",
    endpoint = queue.arn
  ),
  opts(protect = true, dependsOn = List(queuePolicy))
)
```

1. The repeated `opts(protect = true)` can be factored into a shared value.


## Known limitations

1. Since [`com.pulumi.core.Output`](https://www.pulumi.com/docs/reference/pkg/java/com/pulumi/core/Output.html)
   represents an already-running computation (backed by `CompletableFuture`),
   converting [`cats.effect.IO`](https://typelevel.org/cats-effect/api/3.x/cats/effect/IO.html) into it
   requires `unsafeRun*` and breaks referential transparency.
    1. besom evaluates lazily and does not have this problem.


## Environment

### Runtime environment

1. Java 25 or later
    1. We are using JDK 25 API
    1. [Scala 3.8](https://github.com/scala/scala3) requires Java 17
    1. [pulumi-java](https://github.com/pulumi/pulumi-java) requires Java 11

1. Pulumi 3.244.0 or later
    1. Mac: `brew install pulumi/tap/pulumi`

### Build environment

1. Recent Linux / macOS / Windows

1. Java 25
    1. [Install Coursier](https://get-coursier.io/docs/cli-installation), then 

           eval $(cs java --jvm temurin:25 --env)

1. [mill](https://com-lihaoyi.github.io/mill/)
    1. The launcher scripts were downloaded as follows, and then committed to the repository.

           curl -Lf https://repo1.maven.org/maven2/com/lihaoyi/mill-dist/1.1.6/mill-dist-1.1.6-mill.sh -o mill
           chmod +x mill

           curl -Lf https://repo1.maven.org/maven2/com/lihaoyi/mill-dist/1.1.6/mill-dist-1.1.6-mill.bat -o mill.bat


## Build

### Generate the Scala wrappers

    ./mill _.generate
    ./mill _.compile


## Development

### Show the available dependency updates

    ./mill mill.scalalib.Dependency/showUpdates
