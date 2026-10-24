package jp.ukiba.ko_pulumi
package azure

object datadog_ext:
  extension (builder: com.pulumi.azure.datadog.MonitorArgs.Builder)
    /**
     * @param datadogOrganization A `datadogOrganization` block as defined below.
     * @return builder
     */
    inline def datadogOrganization(args: Endofunction[com.pulumi.azure.datadog.inputs.MonitorDatadogOrganizationArgs.Builder]):
        com.pulumi.azure.datadog.MonitorArgs.Builder =
      val argsBuilder = com.pulumi.azure.datadog.inputs.MonitorDatadogOrganizationArgs.builder
      builder.datadogOrganization(args(argsBuilder).build)

    /**
     * @param identity A `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.datadog.inputs.MonitorIdentityArgs.Builder]):
        com.pulumi.azure.datadog.MonitorArgs.Builder =
      val argsBuilder = com.pulumi.azure.datadog.inputs.MonitorIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param user A `user` block as defined below.
     * @return builder
     */
    inline def user(args: Endofunction[com.pulumi.azure.datadog.inputs.MonitorUserArgs.Builder]):
        com.pulumi.azure.datadog.MonitorArgs.Builder =
      val argsBuilder = com.pulumi.azure.datadog.inputs.MonitorUserArgs.builder
      builder.user(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datadog.MonitorTagRuleArgs.Builder)
    /**
     * @param logs A `log` block as defined below.
     * @return builder
     */
    inline def logs(args: Endofunction[com.pulumi.azure.datadog.inputs.MonitorTagRuleLogArgs.Builder]*):
        com.pulumi.azure.datadog.MonitorTagRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.datadog.inputs.MonitorTagRuleLogArgs.builder
      builder.logs(args.map(_(argsBuilder).build)*)

    /**
     * @param metrics A `metric` block as defined below.
     * @return builder
     */
    inline def metrics(args: Endofunction[com.pulumi.azure.datadog.inputs.MonitorTagRuleMetricArgs.Builder]*):
        com.pulumi.azure.datadog.MonitorTagRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.datadog.inputs.MonitorTagRuleMetricArgs.builder
      builder.metrics(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datadog.inputs.MonitorState.Builder)
    /**
     * @param datadogOrganization A `datadogOrganization` block as defined below.
     * @return builder
     */
    inline def datadogOrganization(args: Endofunction[com.pulumi.azure.datadog.inputs.MonitorDatadogOrganizationArgs.Builder]):
        com.pulumi.azure.datadog.inputs.MonitorState.Builder =
      val argsBuilder = com.pulumi.azure.datadog.inputs.MonitorDatadogOrganizationArgs.builder
      builder.datadogOrganization(args(argsBuilder).build)

    /**
     * @param identity A `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.datadog.inputs.MonitorIdentityArgs.Builder]):
        com.pulumi.azure.datadog.inputs.MonitorState.Builder =
      val argsBuilder = com.pulumi.azure.datadog.inputs.MonitorIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param user A `user` block as defined below.
     * @return builder
     */
    inline def user(args: Endofunction[com.pulumi.azure.datadog.inputs.MonitorUserArgs.Builder]):
        com.pulumi.azure.datadog.inputs.MonitorState.Builder =
      val argsBuilder = com.pulumi.azure.datadog.inputs.MonitorUserArgs.builder
      builder.user(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.datadog.inputs.MonitorTagRuleLogArgs.Builder)
    /**
     * @param filters A `filter` block as defined below.
     * 
     * &gt; **Note:** List of filtering tags to be used for capturing logs. This only takes effect if `resourceLogEnabled` flag is enabled. If empty, all resources will be captured. If only Exclude action is specified, the rules will apply to the list of all available resources. If Include actions are specified, the rules will only include resources with the associated tags.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.azure.datadog.inputs.MonitorTagRuleLogFilterArgs.Builder]*):
        com.pulumi.azure.datadog.inputs.MonitorTagRuleLogArgs.Builder =
      def argsBuilder = com.pulumi.azure.datadog.inputs.MonitorTagRuleLogFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datadog.inputs.MonitorTagRuleMetricArgs.Builder)
    /**
     * @param filters A `filter` block as defined below.
     * 
     * &gt; **Note:** List of filtering tags to be used for capturing metrics. If empty, all resources will be captured. If only Exclude action is specified, the rules will apply to the list of all available resources. If Include actions are specified, the rules will only include resources with the associated tags.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.azure.datadog.inputs.MonitorTagRuleMetricFilterArgs.Builder]*):
        com.pulumi.azure.datadog.inputs.MonitorTagRuleMetricArgs.Builder =
      def argsBuilder = com.pulumi.azure.datadog.inputs.MonitorTagRuleMetricFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datadog.inputs.MonitorTagRuleState.Builder)
    /**
     * @param logs A `log` block as defined below.
     * @return builder
     */
    inline def logs(args: Endofunction[com.pulumi.azure.datadog.inputs.MonitorTagRuleLogArgs.Builder]*):
        com.pulumi.azure.datadog.inputs.MonitorTagRuleState.Builder =
      def argsBuilder = com.pulumi.azure.datadog.inputs.MonitorTagRuleLogArgs.builder
      builder.logs(args.map(_(argsBuilder).build)*)

    /**
     * @param metrics A `metric` block as defined below.
     * @return builder
     */
    inline def metrics(args: Endofunction[com.pulumi.azure.datadog.inputs.MonitorTagRuleMetricArgs.Builder]*):
        com.pulumi.azure.datadog.inputs.MonitorTagRuleState.Builder =
      def argsBuilder = com.pulumi.azure.datadog.inputs.MonitorTagRuleMetricArgs.builder
      builder.metrics(args.map(_(argsBuilder).build)*)
