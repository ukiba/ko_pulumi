package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object m2:
  /** Resource for managing an [AWS Mainframe Modernization Environment](https://docs.aws.amazon.com/m2/latest/userguide/environments-m2.html). */
  def Environment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.m2.EnvironmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.m2.EnvironmentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.m2.Environment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an [AWS Mainframe Modernization Application](https://docs.aws.amazon.com/m2/latest/userguide/applications-m2.html). */
  def Application(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.m2.ApplicationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.m2.ApplicationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.m2.Application(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.m2.EnvironmentArgs.Builder)
    def highAvailabilityConfig(args: Endofunction[com.pulumi.aws.m2.inputs.EnvironmentHighAvailabilityConfigArgs.Builder]):
        com.pulumi.aws.m2.EnvironmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.m2.inputs.EnvironmentHighAvailabilityConfigArgs.builder
      builder.highAvailabilityConfig(args(argsBuilder).build)

    def storageConfiguration(args: Endofunction[com.pulumi.aws.m2.inputs.EnvironmentStorageConfigurationArgs.Builder]):
        com.pulumi.aws.m2.EnvironmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.m2.inputs.EnvironmentStorageConfigurationArgs.builder
      builder.storageConfiguration(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.m2.inputs.EnvironmentTimeoutsArgs.Builder]):
        com.pulumi.aws.m2.EnvironmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.m2.inputs.EnvironmentTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.m2.DeploymentArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.m2.inputs.DeploymentTimeoutsArgs.Builder]):
        com.pulumi.aws.m2.DeploymentArgs.Builder =
      val argsBuilder = com.pulumi.aws.m2.inputs.DeploymentTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.m2.ApplicationArgs.Builder)
    /**
     * @param definition The application definition for this application. You can specify either inline JSON or an S3 bucket location.
     * @return builder
     */
    def definition(args: Endofunction[com.pulumi.aws.m2.inputs.ApplicationDefinitionArgs.Builder]):
        com.pulumi.aws.m2.ApplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.m2.inputs.ApplicationDefinitionArgs.builder
      builder.definition(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.m2.inputs.ApplicationTimeoutsArgs.Builder]):
        com.pulumi.aws.m2.ApplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.m2.inputs.ApplicationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Resource for managing an [AWS Mainframe Modernization Deployment.](https://docs.aws.amazon.com/m2/latest/userguide/applications-m2-deploy.html) */
  def Deployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.m2.DeploymentArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.m2.DeploymentArgs.builder
    
    com.pulumi.aws.m2.Deployment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.m2.inputs.EnvironmentState.Builder)
    def highAvailabilityConfig(args: Endofunction[com.pulumi.aws.m2.inputs.EnvironmentHighAvailabilityConfigArgs.Builder]):
        com.pulumi.aws.m2.inputs.EnvironmentState.Builder =
      val argsBuilder = com.pulumi.aws.m2.inputs.EnvironmentHighAvailabilityConfigArgs.builder
      builder.highAvailabilityConfig(args(argsBuilder).build)

    def storageConfiguration(args: Endofunction[com.pulumi.aws.m2.inputs.EnvironmentStorageConfigurationArgs.Builder]):
        com.pulumi.aws.m2.inputs.EnvironmentState.Builder =
      val argsBuilder = com.pulumi.aws.m2.inputs.EnvironmentStorageConfigurationArgs.builder
      builder.storageConfiguration(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.m2.inputs.EnvironmentTimeoutsArgs.Builder]):
        com.pulumi.aws.m2.inputs.EnvironmentState.Builder =
      val argsBuilder = com.pulumi.aws.m2.inputs.EnvironmentTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.m2.inputs.ApplicationState.Builder)
    /**
     * @param definition The application definition for this application. You can specify either inline JSON or an S3 bucket location.
     * @return builder
     */
    def definition(args: Endofunction[com.pulumi.aws.m2.inputs.ApplicationDefinitionArgs.Builder]):
        com.pulumi.aws.m2.inputs.ApplicationState.Builder =
      val argsBuilder = com.pulumi.aws.m2.inputs.ApplicationDefinitionArgs.builder
      builder.definition(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.m2.inputs.ApplicationTimeoutsArgs.Builder]):
        com.pulumi.aws.m2.inputs.ApplicationState.Builder =
      val argsBuilder = com.pulumi.aws.m2.inputs.ApplicationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.m2.inputs.EnvironmentStorageConfigurationArgs.Builder)
    def efs(args: Endofunction[com.pulumi.aws.m2.inputs.EnvironmentStorageConfigurationEfsArgs.Builder]):
        com.pulumi.aws.m2.inputs.EnvironmentStorageConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.m2.inputs.EnvironmentStorageConfigurationEfsArgs.builder
      builder.efs(args(argsBuilder).build)

    def fsx(args: Endofunction[com.pulumi.aws.m2.inputs.EnvironmentStorageConfigurationFsxArgs.Builder]):
        com.pulumi.aws.m2.inputs.EnvironmentStorageConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.m2.inputs.EnvironmentStorageConfigurationFsxArgs.builder
      builder.fsx(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.m2.inputs.DeploymentState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.m2.inputs.DeploymentTimeoutsArgs.Builder]):
        com.pulumi.aws.m2.inputs.DeploymentState.Builder =
      val argsBuilder = com.pulumi.aws.m2.inputs.DeploymentTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
