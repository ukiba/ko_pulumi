package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object appintegrations:
  /** Provides an Amazon AppIntegrations Data Integration resource. */
  def DataIntegration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appintegrations.DataIntegrationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appintegrations.DataIntegrationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.appintegrations.DataIntegration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.appintegrations.DataIntegrationArgs.Builder)
    /**
     * @param scheduleConfig A block that defines the name of the data and how often it should be pulled from the source. The Schedule Config block is documented below.
     * @return builder
     */
    def scheduleConfig(args: Endofunction[com.pulumi.aws.appintegrations.inputs.DataIntegrationScheduleConfigArgs.Builder]):
        com.pulumi.aws.appintegrations.DataIntegrationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appintegrations.inputs.DataIntegrationScheduleConfigArgs.builder
      builder.scheduleConfig(args(argsBuilder).build)

  type AppintegrationsFunctions = com.pulumi.aws.appintegrations.AppintegrationsFunctions
  object AppintegrationsFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.appintegrations.AppintegrationsFunctions.*
  extension (self: AppintegrationsFunctions.type)
    /** Use this data source to get information on an existing AppIntegrations Event Integration. */
    def getEventIntegration(args: Endofunction[com.pulumi.aws.appintegrations.inputs.GetEventIntegrationArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.appintegrations.outputs.GetEventIntegrationResult] =
      val argsBuilder = com.pulumi.aws.appintegrations.inputs.GetEventIntegrationArgs.builder
      com.pulumi.aws.appintegrations.AppintegrationsFunctions.getEventIntegration(args(argsBuilder).build)

    /** Use this data source to get information on an existing AppIntegrations Event Integration. */
    def getEventIntegrationPlain(args: Endofunction[com.pulumi.aws.appintegrations.inputs.GetEventIntegrationPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.appintegrations.outputs.GetEventIntegrationResult] =
      val argsBuilder = com.pulumi.aws.appintegrations.inputs.GetEventIntegrationPlainArgs.builder
      com.pulumi.aws.appintegrations.AppintegrationsFunctions.getEventIntegrationPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appintegrations.inputs.DataIntegrationState.Builder)
    /**
     * @param scheduleConfig A block that defines the name of the data and how often it should be pulled from the source. The Schedule Config block is documented below.
     * @return builder
     */
    def scheduleConfig(args: Endofunction[com.pulumi.aws.appintegrations.inputs.DataIntegrationScheduleConfigArgs.Builder]):
        com.pulumi.aws.appintegrations.inputs.DataIntegrationState.Builder =
      val argsBuilder = com.pulumi.aws.appintegrations.inputs.DataIntegrationScheduleConfigArgs.builder
      builder.scheduleConfig(args(argsBuilder).build)
