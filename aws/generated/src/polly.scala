package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions

object polly:
  object PollyFunctions:
    /** Data source for managing an AWS Polly Voices. */
    inline def getVoices(args: Endofunction[com.pulumi.aws.polly.inputs.GetVoicesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.polly.outputs.GetVoicesResult] =
      val argsBuilder = com.pulumi.aws.polly.inputs.GetVoicesArgs.builder
      com.pulumi.aws.polly.PollyFunctions.getVoices(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS Polly Voices. */
    inline def getVoicesPlain(args: Endofunction[com.pulumi.aws.polly.inputs.GetVoicesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.polly.outputs.GetVoicesResult] =
      val argsBuilder = com.pulumi.aws.polly.inputs.GetVoicesPlainArgs.builder
      com.pulumi.aws.polly.PollyFunctions.getVoicesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
