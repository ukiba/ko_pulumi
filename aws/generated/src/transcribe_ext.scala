package jp.ukiba.ko_pulumi
package aws

object transcribe_ext:
  extension (builder: com.pulumi.aws.transcribe.LanguageModelArgs.Builder)
    /**
     * @param inputDataConfig Input data configuration for the LanguageModel. See `inputDataConfig` Block for details.
     * @return builder
     */
    def inputDataConfig(args: Endofunction[com.pulumi.aws.transcribe.inputs.LanguageModelInputDataConfigArgs.Builder]):
        com.pulumi.aws.transcribe.LanguageModelArgs.Builder =
      val argsBuilder = com.pulumi.aws.transcribe.inputs.LanguageModelInputDataConfigArgs.builder
      builder.inputDataConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.transcribe.inputs.LanguageModelState.Builder)
    /**
     * @param inputDataConfig Input data configuration for the LanguageModel. See `inputDataConfig` Block for details.
     * @return builder
     */
    def inputDataConfig(args: Endofunction[com.pulumi.aws.transcribe.inputs.LanguageModelInputDataConfigArgs.Builder]):
        com.pulumi.aws.transcribe.inputs.LanguageModelState.Builder =
      val argsBuilder = com.pulumi.aws.transcribe.inputs.LanguageModelInputDataConfigArgs.builder
      builder.inputDataConfig(args(argsBuilder).build)
