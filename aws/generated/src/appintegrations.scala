package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object appintegrations:
  object AppintegrationsFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to get information on an existing AppIntegrations Event Integration. */
    inline def getEventIntegration(args: Endofunction[com.pulumi.aws.appintegrations.inputs.GetEventIntegrationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.appintegrations.outputs.GetEventIntegrationResult] =
      val argsBuilder = com.pulumi.aws.appintegrations.inputs.GetEventIntegrationArgs.builder
      com.pulumi.aws.appintegrations.AppintegrationsFunctions.getEventIntegration(args(argsBuilder).build)

    /** Use this data source to get information on an existing AppIntegrations Event Integration. */
    inline def getEventIntegrationPlain(args: Endofunction[com.pulumi.aws.appintegrations.inputs.GetEventIntegrationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.appintegrations.outputs.GetEventIntegrationResult] =
      val argsBuilder = com.pulumi.aws.appintegrations.inputs.GetEventIntegrationPlainArgs.builder
      com.pulumi.aws.appintegrations.AppintegrationsFunctions.getEventIntegrationPlain(args(argsBuilder).build)

  /** Provides an Amazon AppIntegrations Data Integration resource. */
  def DataIntegration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.appintegrations.DataIntegrationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appintegrations.DataIntegrationArgs.builder
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
    com.pulumi.aws.appintegrations.DataIntegration(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.appintegrations.DataIntegrationArgs.Builder)
    /**
     * @param scheduleConfig A block that defines the name of the data and how often it should be pulled from the source. The Schedule Config block is documented below.
     * @return builder
     */
    def scheduleConfig(args: Endofunction[com.pulumi.aws.appintegrations.inputs.DataIntegrationScheduleConfigArgs.Builder]):
        com.pulumi.aws.appintegrations.DataIntegrationArgs.Builder =
      val argsBuilder = com.pulumi.aws.appintegrations.inputs.DataIntegrationScheduleConfigArgs.builder
      builder.scheduleConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.appintegrations.inputs.DataIntegrationState.Builder)
    /**
     * @param scheduleConfig A block that defines the name of the data and how often it should be pulled from the source. The Schedule Config block is documented below.
     * @return builder
     */
    def scheduleConfig(args: Endofunction[com.pulumi.aws.appintegrations.inputs.DataIntegrationScheduleConfigArgs.Builder]):
        com.pulumi.aws.appintegrations.inputs.DataIntegrationState.Builder =
      val argsBuilder = com.pulumi.aws.appintegrations.inputs.DataIntegrationScheduleConfigArgs.builder
      builder.scheduleConfig(args(argsBuilder).build)
