package jp.ukiba.ko_pulumi
package aws

object polly_ext:
  extension (builder: com.pulumi.aws.polly.inputs.GetVoicesArgs.Builder)
    /**
     * @param voices List of voices with their properties. See `voices` Block below.
     * @return builder
     */
    inline def voices(args: Endofunction[com.pulumi.aws.polly.inputs.GetVoicesVoiceArgs.Builder]*):
        com.pulumi.aws.polly.inputs.GetVoicesArgs.Builder =
      def argsBuilder = com.pulumi.aws.polly.inputs.GetVoicesVoiceArgs.builder
      builder.voices(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.polly.inputs.GetVoicesPlainArgs.Builder)
    /**
     * @param voices List of voices with their properties. See `voices` Block below.
     * @return builder
     */
    inline def voices(args: Endofunction[com.pulumi.aws.polly.inputs.GetVoicesVoice.Builder]*):
        com.pulumi.aws.polly.inputs.GetVoicesPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.polly.inputs.GetVoicesVoice.builder
      builder.voices(args.map(_(argsBuilder).build)*)
