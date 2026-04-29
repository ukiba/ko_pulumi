package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object rum:
  /** Provides a CloudWatch RUM App Monitor resource. */
  def AppMonitor(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.rum.AppMonitorArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.rum.AppMonitorArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.rum.AppMonitor(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.rum.AppMonitorArgs.Builder)
    /**
     * @param appMonitorConfiguration configuration data for the app monitor. See appMonitorConfiguration below.
     * @return builder
     */
    def appMonitorConfiguration(args: Endofunction[com.pulumi.aws.rum.inputs.AppMonitorAppMonitorConfigurationArgs.Builder]):
        com.pulumi.aws.rum.AppMonitorArgs.Builder =
      val argsBuilder = com.pulumi.aws.rum.inputs.AppMonitorAppMonitorConfigurationArgs.builder
      builder.appMonitorConfiguration(args(argsBuilder).build)

    /**
     * @param customEvents Specifies whether this app monitor allows the web client to define and send custom events. If you omit this parameter, custom events are `DISABLED`. See customEvents below.
     * @return builder
     */
    def customEvents(args: Endofunction[com.pulumi.aws.rum.inputs.AppMonitorCustomEventsArgs.Builder]):
        com.pulumi.aws.rum.AppMonitorArgs.Builder =
      val argsBuilder = com.pulumi.aws.rum.inputs.AppMonitorCustomEventsArgs.builder
      builder.customEvents(args(argsBuilder).build)

  /** Provides a CloudWatch RUM Metrics Destination resource. */
  def MetricsDestination(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.rum.MetricsDestinationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.rum.MetricsDestinationArgs.builder
    
    com.pulumi.aws.rum.MetricsDestination(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.rum.inputs.AppMonitorState.Builder)
    /**
     * @param appMonitorConfiguration configuration data for the app monitor. See appMonitorConfiguration below.
     * @return builder
     */
    def appMonitorConfiguration(args: Endofunction[com.pulumi.aws.rum.inputs.AppMonitorAppMonitorConfigurationArgs.Builder]):
        com.pulumi.aws.rum.inputs.AppMonitorState.Builder =
      val argsBuilder = com.pulumi.aws.rum.inputs.AppMonitorAppMonitorConfigurationArgs.builder
      builder.appMonitorConfiguration(args(argsBuilder).build)

    /**
     * @param customEvents Specifies whether this app monitor allows the web client to define and send custom events. If you omit this parameter, custom events are `DISABLED`. See customEvents below.
     * @return builder
     */
    def customEvents(args: Endofunction[com.pulumi.aws.rum.inputs.AppMonitorCustomEventsArgs.Builder]):
        com.pulumi.aws.rum.inputs.AppMonitorState.Builder =
      val argsBuilder = com.pulumi.aws.rum.inputs.AppMonitorCustomEventsArgs.builder
      builder.customEvents(args(argsBuilder).build)
