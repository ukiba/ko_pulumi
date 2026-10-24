package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions

object polly:
  object PollyFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Data source for managing an AWS Polly Voices. */
    inline def getVoices(args: Endofunction[com.pulumi.aws.polly.inputs.GetVoicesArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.polly.outputs.GetVoicesResult] =
      val argsBuilder = com.pulumi.aws.polly.inputs.GetVoicesArgs.builder
      com.pulumi.aws.polly.PollyFunctions.getVoices(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS Polly Voices. */
    inline def getVoicesPlain(args: Endofunction[com.pulumi.aws.polly.inputs.GetVoicesPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.polly.outputs.GetVoicesResult] =
      val argsBuilder = com.pulumi.aws.polly.inputs.GetVoicesPlainArgs.builder
      com.pulumi.aws.polly.PollyFunctions.getVoicesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
