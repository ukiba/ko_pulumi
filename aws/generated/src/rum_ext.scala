package jp.ukiba.ko_pulumi
package aws

object rum_ext:
  extension (builder: com.pulumi.aws.rum.AppMonitorArgs.Builder)
    /**
     * @param appMonitorConfiguration configuration data for the app monitor. See appMonitorConfiguration below.
     * @return builder
     */
    inline def appMonitorConfiguration(args: Endofunction[com.pulumi.aws.rum.inputs.AppMonitorAppMonitorConfigurationArgs.Builder]):
        com.pulumi.aws.rum.AppMonitorArgs.Builder =
      val argsBuilder = com.pulumi.aws.rum.inputs.AppMonitorAppMonitorConfigurationArgs.builder
      builder.appMonitorConfiguration(args(argsBuilder).build)

    /**
     * @param customEvents Specifies whether this app monitor allows the web client to define and send custom events. If you omit this parameter, custom events are `DISABLED`. See customEvents below.
     * @return builder
     */
    inline def customEvents(args: Endofunction[com.pulumi.aws.rum.inputs.AppMonitorCustomEventsArgs.Builder]):
        com.pulumi.aws.rum.AppMonitorArgs.Builder =
      val argsBuilder = com.pulumi.aws.rum.inputs.AppMonitorCustomEventsArgs.builder
      builder.customEvents(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.rum.inputs.AppMonitorState.Builder)
    /**
     * @param appMonitorConfiguration configuration data for the app monitor. See appMonitorConfiguration below.
     * @return builder
     */
    inline def appMonitorConfiguration(args: Endofunction[com.pulumi.aws.rum.inputs.AppMonitorAppMonitorConfigurationArgs.Builder]):
        com.pulumi.aws.rum.inputs.AppMonitorState.Builder =
      val argsBuilder = com.pulumi.aws.rum.inputs.AppMonitorAppMonitorConfigurationArgs.builder
      builder.appMonitorConfiguration(args(argsBuilder).build)

    /**
     * @param customEvents Specifies whether this app monitor allows the web client to define and send custom events. If you omit this parameter, custom events are `DISABLED`. See customEvents below.
     * @return builder
     */
    inline def customEvents(args: Endofunction[com.pulumi.aws.rum.inputs.AppMonitorCustomEventsArgs.Builder]):
        com.pulumi.aws.rum.inputs.AppMonitorState.Builder =
      val argsBuilder = com.pulumi.aws.rum.inputs.AppMonitorCustomEventsArgs.builder
      builder.customEvents(args(argsBuilder).build)
