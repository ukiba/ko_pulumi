package jp.ukiba.ko_pulumi
package aws


object polly:
  type PollyFunctions = com.pulumi.aws.polly.PollyFunctions
  object PollyFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.polly.PollyFunctions.*
  extension (self: PollyFunctions.type)
    /** Data source for managing an AWS Polly Voices. */
    def getVoices(args: Endofunction[com.pulumi.aws.polly.inputs.GetVoicesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.polly.outputs.GetVoicesResult] =
      val argsBuilder = com.pulumi.aws.polly.inputs.GetVoicesArgs.builder
      com.pulumi.aws.polly.PollyFunctions.getVoices(args(argsBuilder).build)

    /** Data source for managing an AWS Polly Voices. */
    def getVoicesPlain(args: Endofunction[com.pulumi.aws.polly.inputs.GetVoicesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.polly.outputs.GetVoicesResult] =
      val argsBuilder = com.pulumi.aws.polly.inputs.GetVoicesPlainArgs.builder
      com.pulumi.aws.polly.PollyFunctions.getVoicesPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.polly.inputs.GetVoicesArgs.Builder)
    /**
     * @param voices List of voices with their properties. See `voices` Attribute Reference below.
     * @return builder
     */
    def voices(args: Endofunction[com.pulumi.aws.polly.inputs.GetVoicesVoiceArgs.Builder]*):
        com.pulumi.aws.polly.inputs.GetVoicesArgs.Builder =
      def argsBuilder = com.pulumi.aws.polly.inputs.GetVoicesVoiceArgs.builder
      builder.voices(args.map(_(argsBuilder).build)*)
