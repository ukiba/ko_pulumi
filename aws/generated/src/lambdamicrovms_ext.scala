package jp.ukiba.ko_pulumi
package aws

object lambdamicrovms_ext:
  extension (builder: com.pulumi.aws.lambdamicrovms.ImageArgs.Builder)
    /**
     * @param codeArtifact Code artifact containing the application code and metadata for the image. See below.
     * @return builder
     */
    def codeArtifact(args: Endofunction[com.pulumi.aws.lambdamicrovms.inputs.ImageCodeArtifactArgs.Builder]):
        com.pulumi.aws.lambdamicrovms.ImageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambdamicrovms.inputs.ImageCodeArtifactArgs.builder
      builder.codeArtifact(args(argsBuilder).build)

    /**
     * @param cpuConfigurations CPU configuration for the MicroVM. See `cpuConfiguration` Block below.
     * @return builder
     */
    def cpuConfigurations(args: Endofunction[com.pulumi.aws.lambdamicrovms.inputs.ImageCpuConfigurationArgs.Builder]*):
        com.pulumi.aws.lambdamicrovms.ImageArgs.Builder =
      def argsBuilder = com.pulumi.aws.lambdamicrovms.inputs.ImageCpuConfigurationArgs.builder
      builder.cpuConfigurations(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.lambdamicrovms.inputs.ImageTimeoutsArgs.Builder]):
        com.pulumi.aws.lambdamicrovms.ImageArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambdamicrovms.inputs.ImageTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lambdamicrovms.MicrovmArgs.Builder)
    /**
     * @param idlePolicy Configuration controlling automatic suspend and resume behavior. See below. Changing this value creates a new resource.
     * @return builder
     */
    def idlePolicy(args: Endofunction[com.pulumi.aws.lambdamicrovms.inputs.MicrovmIdlePolicyArgs.Builder]):
        com.pulumi.aws.lambdamicrovms.MicrovmArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambdamicrovms.inputs.MicrovmIdlePolicyArgs.builder
      builder.idlePolicy(args(argsBuilder).build)

    /**
     * @param logging Logging configuration for the MicroVM. See below. Changing this value creates a new resource.
     * @return builder
     */
    def logging(args: Endofunction[com.pulumi.aws.lambdamicrovms.inputs.MicrovmLoggingArgs.Builder]):
        com.pulumi.aws.lambdamicrovms.MicrovmArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambdamicrovms.inputs.MicrovmLoggingArgs.builder
      builder.logging(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.lambdamicrovms.inputs.MicrovmTimeoutsArgs.Builder]):
        com.pulumi.aws.lambdamicrovms.MicrovmArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambdamicrovms.inputs.MicrovmTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lambdamicrovms.inputs.ImageState.Builder)
    /**
     * @param codeArtifact Code artifact containing the application code and metadata for the image. See below.
     * @return builder
     */
    def codeArtifact(args: Endofunction[com.pulumi.aws.lambdamicrovms.inputs.ImageCodeArtifactArgs.Builder]):
        com.pulumi.aws.lambdamicrovms.inputs.ImageState.Builder =
      val argsBuilder = com.pulumi.aws.lambdamicrovms.inputs.ImageCodeArtifactArgs.builder
      builder.codeArtifact(args(argsBuilder).build)

    /**
     * @param cpuConfigurations CPU configuration for the MicroVM. See `cpuConfiguration` Block below.
     * @return builder
     */
    def cpuConfigurations(args: Endofunction[com.pulumi.aws.lambdamicrovms.inputs.ImageCpuConfigurationArgs.Builder]*):
        com.pulumi.aws.lambdamicrovms.inputs.ImageState.Builder =
      def argsBuilder = com.pulumi.aws.lambdamicrovms.inputs.ImageCpuConfigurationArgs.builder
      builder.cpuConfigurations(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.lambdamicrovms.inputs.ImageTimeoutsArgs.Builder]):
        com.pulumi.aws.lambdamicrovms.inputs.ImageState.Builder =
      val argsBuilder = com.pulumi.aws.lambdamicrovms.inputs.ImageTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lambdamicrovms.inputs.MicrovmLoggingArgs.Builder)
    /**
     * @param cloudwatch Send logs to Amazon CloudWatch Logs. See below.
     * @return builder
     */
    def cloudwatch(args: Endofunction[com.pulumi.aws.lambdamicrovms.inputs.MicrovmLoggingCloudwatchArgs.Builder]):
        com.pulumi.aws.lambdamicrovms.inputs.MicrovmLoggingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambdamicrovms.inputs.MicrovmLoggingCloudwatchArgs.builder
      builder.cloudwatch(args(argsBuilder).build)

    /**
     * @param disabled Disable logging for the MicroVM. Specify an empty block: `disabled {}`.
     * @return builder
     */
    def disabled(args: Endofunction[com.pulumi.aws.lambdamicrovms.inputs.MicrovmLoggingDisabledArgs.Builder]):
        com.pulumi.aws.lambdamicrovms.inputs.MicrovmLoggingArgs.Builder =
      val argsBuilder = com.pulumi.aws.lambdamicrovms.inputs.MicrovmLoggingDisabledArgs.builder
      builder.disabled(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lambdamicrovms.inputs.MicrovmState.Builder)
    /**
     * @param idlePolicy Configuration controlling automatic suspend and resume behavior. See below. Changing this value creates a new resource.
     * @return builder
     */
    def idlePolicy(args: Endofunction[com.pulumi.aws.lambdamicrovms.inputs.MicrovmIdlePolicyArgs.Builder]):
        com.pulumi.aws.lambdamicrovms.inputs.MicrovmState.Builder =
      val argsBuilder = com.pulumi.aws.lambdamicrovms.inputs.MicrovmIdlePolicyArgs.builder
      builder.idlePolicy(args(argsBuilder).build)

    /**
     * @param logging Logging configuration for the MicroVM. See below. Changing this value creates a new resource.
     * @return builder
     */
    def logging(args: Endofunction[com.pulumi.aws.lambdamicrovms.inputs.MicrovmLoggingArgs.Builder]):
        com.pulumi.aws.lambdamicrovms.inputs.MicrovmState.Builder =
      val argsBuilder = com.pulumi.aws.lambdamicrovms.inputs.MicrovmLoggingArgs.builder
      builder.logging(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.lambdamicrovms.inputs.MicrovmTimeoutsArgs.Builder]):
        com.pulumi.aws.lambdamicrovms.inputs.MicrovmState.Builder =
      val argsBuilder = com.pulumi.aws.lambdamicrovms.inputs.MicrovmTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
