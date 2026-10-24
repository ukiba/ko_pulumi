package jp.ukiba.ko_pulumi
package aws

object m2_ext:
  extension (builder: com.pulumi.aws.m2.ApplicationArgs.Builder)
    /**
     * @param definition Application definition for this application. You can specify either inline JSON or an S3 bucket location.
     * @return builder
     */
    inline def definition(args: Endofunction[com.pulumi.aws.m2.inputs.ApplicationDefinitionArgs.Builder]):
        com.pulumi.aws.m2.ApplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.m2.inputs.ApplicationDefinitionArgs.builder
      builder.definition(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.m2.inputs.ApplicationTimeoutsArgs.Builder]):
        com.pulumi.aws.m2.ApplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.m2.inputs.ApplicationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.m2.DeploymentArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.m2.inputs.DeploymentTimeoutsArgs.Builder]):
        com.pulumi.aws.m2.DeploymentArgs.Builder =
      val argsBuilder = com.pulumi.aws.m2.inputs.DeploymentTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.m2.EnvironmentArgs.Builder)
    inline def highAvailabilityConfig(args: Endofunction[com.pulumi.aws.m2.inputs.EnvironmentHighAvailabilityConfigArgs.Builder]):
        com.pulumi.aws.m2.EnvironmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.m2.inputs.EnvironmentHighAvailabilityConfigArgs.builder
      builder.highAvailabilityConfig(args(argsBuilder).build)

    inline def storageConfiguration(args: Endofunction[com.pulumi.aws.m2.inputs.EnvironmentStorageConfigurationArgs.Builder]):
        com.pulumi.aws.m2.EnvironmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.m2.inputs.EnvironmentStorageConfigurationArgs.builder
      builder.storageConfiguration(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.m2.inputs.EnvironmentTimeoutsArgs.Builder]):
        com.pulumi.aws.m2.EnvironmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.m2.inputs.EnvironmentTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.m2.inputs.ApplicationState.Builder)
    /**
     * @param definition Application definition for this application. You can specify either inline JSON or an S3 bucket location.
     * @return builder
     */
    inline def definition(args: Endofunction[com.pulumi.aws.m2.inputs.ApplicationDefinitionArgs.Builder]):
        com.pulumi.aws.m2.inputs.ApplicationState.Builder =
      val argsBuilder = com.pulumi.aws.m2.inputs.ApplicationDefinitionArgs.builder
      builder.definition(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.m2.inputs.ApplicationTimeoutsArgs.Builder]):
        com.pulumi.aws.m2.inputs.ApplicationState.Builder =
      val argsBuilder = com.pulumi.aws.m2.inputs.ApplicationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.m2.inputs.DeploymentState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.m2.inputs.DeploymentTimeoutsArgs.Builder]):
        com.pulumi.aws.m2.inputs.DeploymentState.Builder =
      val argsBuilder = com.pulumi.aws.m2.inputs.DeploymentTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.m2.inputs.EnvironmentState.Builder)
    inline def highAvailabilityConfig(args: Endofunction[com.pulumi.aws.m2.inputs.EnvironmentHighAvailabilityConfigArgs.Builder]):
        com.pulumi.aws.m2.inputs.EnvironmentState.Builder =
      val argsBuilder = com.pulumi.aws.m2.inputs.EnvironmentHighAvailabilityConfigArgs.builder
      builder.highAvailabilityConfig(args(argsBuilder).build)

    inline def storageConfiguration(args: Endofunction[com.pulumi.aws.m2.inputs.EnvironmentStorageConfigurationArgs.Builder]):
        com.pulumi.aws.m2.inputs.EnvironmentState.Builder =
      val argsBuilder = com.pulumi.aws.m2.inputs.EnvironmentStorageConfigurationArgs.builder
      builder.storageConfiguration(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.m2.inputs.EnvironmentTimeoutsArgs.Builder]):
        com.pulumi.aws.m2.inputs.EnvironmentState.Builder =
      val argsBuilder = com.pulumi.aws.m2.inputs.EnvironmentTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.m2.inputs.EnvironmentStorageConfigurationArgs.Builder)
    inline def efs(args: Endofunction[com.pulumi.aws.m2.inputs.EnvironmentStorageConfigurationEfsArgs.Builder]):
        com.pulumi.aws.m2.inputs.EnvironmentStorageConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.m2.inputs.EnvironmentStorageConfigurationEfsArgs.builder
      builder.efs(args(argsBuilder).build)

    inline def fsx(args: Endofunction[com.pulumi.aws.m2.inputs.EnvironmentStorageConfigurationFsxArgs.Builder]):
        com.pulumi.aws.m2.inputs.EnvironmentStorageConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.m2.inputs.EnvironmentStorageConfigurationFsxArgs.builder
      builder.fsx(args(argsBuilder).build)
