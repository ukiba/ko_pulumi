package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object trafficmanager:
  /** Manages a Traffic Manager Profile to which multiple endpoints can be attached. */
  @deprecated() def Profile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.trafficmanager.ProfileArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.trafficmanager.ProfileArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.trafficmanager.Profile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.trafficmanager.ProfileArgs.Builder)
    /**
     * @param dnsConfig This block specifies the DNS configuration of the Profile. One `dnsConfig` block as defined below.
     * @return builder
     */
    def dnsConfig(args: Endofunction[com.pulumi.azure.trafficmanager.inputs.ProfileDnsConfigArgs.Builder]):
        com.pulumi.azure.trafficmanager.ProfileArgs.Builder =
      val argsBuilder = com.pulumi.azure.trafficmanager.inputs.ProfileDnsConfigArgs.builder
      builder.dnsConfig(args(argsBuilder).build)

    /**
     * @param monitorConfig This block specifies the Endpoint monitoring configuration for the Profile. One `monitorConfig` block as defined below.
     * @return builder
     */
    def monitorConfig(args: Endofunction[com.pulumi.azure.trafficmanager.inputs.ProfileMonitorConfigArgs.Builder]):
        com.pulumi.azure.trafficmanager.ProfileArgs.Builder =
      val argsBuilder = com.pulumi.azure.trafficmanager.inputs.ProfileMonitorConfigArgs.builder
      builder.monitorConfig(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.trafficmanager.ProfileArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  type TrafficmanagerFunctions = com.pulumi.azure.trafficmanager.TrafficmanagerFunctions
  object TrafficmanagerFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.trafficmanager.TrafficmanagerFunctions.*
  extension (self: TrafficmanagerFunctions.type)
    /** Use this data source to access the ID of a specified Traffic Manager Geographical Location within the Geographical Hierarchy. */
    @deprecated def getGeographicalLocation(args: Endofunction[com.pulumi.azure.trafficmanager.inputs.GetGeographicalLocationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.trafficmanager.outputs.GetGeographicalLocationResult] =
      val argsBuilder = com.pulumi.azure.trafficmanager.inputs.GetGeographicalLocationArgs.builder
      com.pulumi.azure.trafficmanager.TrafficmanagerFunctions.getGeographicalLocation(args(argsBuilder).build)

    /** Use this data source to access the ID of a specified Traffic Manager Geographical Location within the Geographical Hierarchy. */
    @deprecated def getGeographicalLocationPlain(args: Endofunction[com.pulumi.azure.trafficmanager.inputs.GetGeographicalLocationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.trafficmanager.outputs.GetGeographicalLocationResult] =
      val argsBuilder = com.pulumi.azure.trafficmanager.inputs.GetGeographicalLocationPlainArgs.builder
      com.pulumi.azure.trafficmanager.TrafficmanagerFunctions.getGeographicalLocationPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.trafficmanager.inputs.ProfileMonitorConfigArgs.Builder)
    /**
     * @param customHeaders One or more `customHeader` blocks as defined below.
     * @return builder
     */
    def customHeaders(args: Endofunction[com.pulumi.azure.trafficmanager.inputs.ProfileMonitorConfigCustomHeaderArgs.Builder]*):
        com.pulumi.azure.trafficmanager.inputs.ProfileMonitorConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.trafficmanager.inputs.ProfileMonitorConfigCustomHeaderArgs.builder
      builder.customHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.trafficmanager.inputs.ProfileState.Builder)
    /**
     * @param dnsConfig This block specifies the DNS configuration of the Profile. One `dnsConfig` block as defined below.
     * @return builder
     */
    def dnsConfig(args: Endofunction[com.pulumi.azure.trafficmanager.inputs.ProfileDnsConfigArgs.Builder]):
        com.pulumi.azure.trafficmanager.inputs.ProfileState.Builder =
      val argsBuilder = com.pulumi.azure.trafficmanager.inputs.ProfileDnsConfigArgs.builder
      builder.dnsConfig(args(argsBuilder).build)

    /**
     * @param monitorConfig This block specifies the Endpoint monitoring configuration for the Profile. One `monitorConfig` block as defined below.
     * @return builder
     */
    def monitorConfig(args: Endofunction[com.pulumi.azure.trafficmanager.inputs.ProfileMonitorConfigArgs.Builder]):
        com.pulumi.azure.trafficmanager.inputs.ProfileState.Builder =
      val argsBuilder = com.pulumi.azure.trafficmanager.inputs.ProfileMonitorConfigArgs.builder
      builder.monitorConfig(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.trafficmanager.inputs.ProfileState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
