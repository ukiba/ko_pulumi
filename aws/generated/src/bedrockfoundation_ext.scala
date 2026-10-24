package jp.ukiba.ko_pulumi
package aws

object bedrockfoundation_ext:
  extension (builder: com.pulumi.aws.bedrockfoundation.ModelAgreementArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.bedrockfoundation.inputs.ModelAgreementTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrockfoundation.ModelAgreementArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrockfoundation.inputs.ModelAgreementTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrockfoundation.inputs.ModelAgreementState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.bedrockfoundation.inputs.ModelAgreementTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrockfoundation.inputs.ModelAgreementState.Builder =
      val argsBuilder = com.pulumi.aws.bedrockfoundation.inputs.ModelAgreementTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
