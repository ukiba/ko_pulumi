package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object datadog:
  extension (builder: com.pulumi.azure.datadog.MonitorArgs.Builder)
    /**
     * @param datadogOrganization A `datadogOrganization` block as defined below.
     * @return builder
     */
    def datadogOrganization(args: Endofunction[com.pulumi.azure.datadog.inputs.MonitorDatadogOrganizationArgs.Builder]):
        com.pulumi.azure.datadog.MonitorArgs.Builder =
      val argsBuilder = com.pulumi.azure.datadog.inputs.MonitorDatadogOrganizationArgs.builder
      builder.datadogOrganization(args(argsBuilder).build)

    /**
     * @param identity A `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.datadog.inputs.MonitorIdentityArgs.Builder]):
        com.pulumi.azure.datadog.MonitorArgs.Builder =
      val argsBuilder = com.pulumi.azure.datadog.inputs.MonitorIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param user A `user` block as defined below.
     * @return builder
     */
    def user(args: Endofunction[com.pulumi.azure.datadog.inputs.MonitorUserArgs.Builder]):
        com.pulumi.azure.datadog.MonitorArgs.Builder =
      val argsBuilder = com.pulumi.azure.datadog.inputs.MonitorUserArgs.builder
      builder.user(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.datadog.MonitorArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages SingleSignOn on the datadog Monitor. */
  def MonitorSsoConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datadog.MonitorSsoConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datadog.MonitorSsoConfigurationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datadog.MonitorSsoConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages TagRules on the datadog Monitor. */
  def MonitorTagRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datadog.MonitorTagRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datadog.MonitorTagRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.datadog.MonitorTagRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.datadog.MonitorTagRuleArgs.Builder)
    /**
     * @param logs A `log` block as defined below.
     * @return builder
     */
    def logs(args: Endofunction[com.pulumi.azure.datadog.inputs.MonitorTagRuleLogArgs.Builder]*):
        com.pulumi.azure.datadog.MonitorTagRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.datadog.inputs.MonitorTagRuleLogArgs.builder
      builder.logs(args.map(_(argsBuilder).build)*)

    /**
     * @param metrics A `metric` block as defined below.
     * @return builder
     */
    def metrics(args: Endofunction[com.pulumi.azure.datadog.inputs.MonitorTagRuleMetricArgs.Builder]*):
        com.pulumi.azure.datadog.MonitorTagRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.datadog.inputs.MonitorTagRuleMetricArgs.builder
      builder.metrics(args.map(_(argsBuilder).build)*)

  /** Manages a datadog Monitor. */
  def Monitor(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.datadog.MonitorArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.datadog.MonitorArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.datadog.Monitor(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.datadog.inputs.MonitorTagRuleState.Builder)
    /**
     * @param logs A `log` block as defined below.
     * @return builder
     */
    def logs(args: Endofunction[com.pulumi.azure.datadog.inputs.MonitorTagRuleLogArgs.Builder]*):
        com.pulumi.azure.datadog.inputs.MonitorTagRuleState.Builder =
      def argsBuilder = com.pulumi.azure.datadog.inputs.MonitorTagRuleLogArgs.builder
      builder.logs(args.map(_(argsBuilder).build)*)

    /**
     * @param metrics A `metric` block as defined below.
     * @return builder
     */
    def metrics(args: Endofunction[com.pulumi.azure.datadog.inputs.MonitorTagRuleMetricArgs.Builder]*):
        com.pulumi.azure.datadog.inputs.MonitorTagRuleState.Builder =
      def argsBuilder = com.pulumi.azure.datadog.inputs.MonitorTagRuleMetricArgs.builder
      builder.metrics(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datadog.inputs.MonitorTagRuleMetricArgs.Builder)
    /**
     * @param filters A `filter` block as defined below.
     * 
     *  &gt; **Note:** List of filtering tags to be used for capturing metrics. If empty, all resources will be captured. If only Exclude action is specified, the rules will apply to the list of all available resources. If Include actions are specified, the rules will only include resources with the associated tags.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.azure.datadog.inputs.MonitorTagRuleMetricFilterArgs.Builder]*):
        com.pulumi.azure.datadog.inputs.MonitorTagRuleMetricArgs.Builder =
      def argsBuilder = com.pulumi.azure.datadog.inputs.MonitorTagRuleMetricFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datadog.inputs.MonitorTagRuleLogArgs.Builder)
    /**
     * @param filters A `filter` block as defined below.
     * 
     *  &gt; **Note:** List of filtering tags to be used for capturing logs. This only takes effect if `resourceLogEnabled` flag is enabled. If empty, all resources will be captured. If only Exclude action is specified, the rules will apply to the list of all available resources. If Include actions are specified, the rules will only include resources with the associated tags.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.azure.datadog.inputs.MonitorTagRuleLogFilterArgs.Builder]*):
        com.pulumi.azure.datadog.inputs.MonitorTagRuleLogArgs.Builder =
      def argsBuilder = com.pulumi.azure.datadog.inputs.MonitorTagRuleLogFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.datadog.inputs.MonitorState.Builder)
    /**
     * @param datadogOrganization A `datadogOrganization` block as defined below.
     * @return builder
     */
    def datadogOrganization(args: Endofunction[com.pulumi.azure.datadog.inputs.MonitorDatadogOrganizationArgs.Builder]):
        com.pulumi.azure.datadog.inputs.MonitorState.Builder =
      val argsBuilder = com.pulumi.azure.datadog.inputs.MonitorDatadogOrganizationArgs.builder
      builder.datadogOrganization(args(argsBuilder).build)

    /**
     * @param identity A `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.datadog.inputs.MonitorIdentityArgs.Builder]):
        com.pulumi.azure.datadog.inputs.MonitorState.Builder =
      val argsBuilder = com.pulumi.azure.datadog.inputs.MonitorIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param user A `user` block as defined below.
     * @return builder
     */
    def user(args: Endofunction[com.pulumi.azure.datadog.inputs.MonitorUserArgs.Builder]):
        com.pulumi.azure.datadog.inputs.MonitorState.Builder =
      val argsBuilder = com.pulumi.azure.datadog.inputs.MonitorUserArgs.builder
      builder.user(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.datadog.inputs.MonitorState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
