package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object lambdamicrovms:
  /** Manages an AWS Lambda MicroVMs Image. Use this resource to define the base image, application code, and runtime configuration from which MicroVMs are launched. */
  def Image(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.lambdamicrovms.ImageArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lambdamicrovms.ImageArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.lambdamicrovms.Image(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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

  /**
   * Manages an AWS Lambda MicroVMs MicroVM. Use this resource to run a MicroVM from a MicroVM image, which provisions a dedicated HTTPS endpoint and starts your application from the image snapshot.
   * 
   * &gt; MicroVMs are immutable. Because the service has no update operation, changing any argument terminates the MicroVM and runs a new one.
   */
  def Microvm(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.lambdamicrovms.MicrovmArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lambdamicrovms.MicrovmArgs.builder
    com.pulumi.aws.lambdamicrovms.Microvm(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
