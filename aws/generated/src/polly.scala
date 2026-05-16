package jp.ukiba.ko_pulumi
package aws


object polly:
  object PollyFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Data source for managing an AWS Polly Voices. */
    inline def getVoices(args: Endofunction[com.pulumi.aws.polly.inputs.GetVoicesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.polly.outputs.GetVoicesResult] =
      val argsBuilder = com.pulumi.aws.polly.inputs.GetVoicesArgs.builder
      com.pulumi.aws.polly.PollyFunctions.getVoices(args(argsBuilder).build)

    /** Data source for managing an AWS Polly Voices. */
    inline def getVoicesPlain(args: Endofunction[com.pulumi.aws.polly.inputs.GetVoicesPlainArgs.Builder] = scala.Predef.identity):
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
