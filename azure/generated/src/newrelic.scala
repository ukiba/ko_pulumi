package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object newrelic:
  extension (builder: com.pulumi.azure.newrelic.MonitorArgs.Builder)
    /**
     * @param identity An `identity` block as defined below. Changing this forces a new Azure Native New Relic Monitor to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.newrelic.inputs.MonitorIdentityArgs.Builder]):
        com.pulumi.azure.newrelic.MonitorArgs.Builder =
      val argsBuilder = com.pulumi.azure.newrelic.inputs.MonitorIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param plan A `plan` block as defined below. Changing this forces a new Azure Native New Relic Monitor to be created.
     * @return builder
     */
    def plan(args: Endofunction[com.pulumi.azure.newrelic.inputs.MonitorPlanArgs.Builder]):
        com.pulumi.azure.newrelic.MonitorArgs.Builder =
      val argsBuilder = com.pulumi.azure.newrelic.inputs.MonitorPlanArgs.builder
      builder.plan(args(argsBuilder).build)

    /**
     * @param user A `user` block as defined below. Changing this forces a new Azure Native New Relic Monitor to be created.
     * @return builder
     */
    def user(args: Endofunction[com.pulumi.azure.newrelic.inputs.MonitorUserArgs.Builder]):
        com.pulumi.azure.newrelic.MonitorArgs.Builder =
      val argsBuilder = com.pulumi.azure.newrelic.inputs.MonitorUserArgs.builder
      builder.user(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.newrelic.TagRuleArgs.Builder)
    /**
     * @param logTagFilters A `logTagFilter` block as defined below.
     * @return builder
     */
    def logTagFilters(args: Endofunction[com.pulumi.azure.newrelic.inputs.TagRuleLogTagFilterArgs.Builder]*):
        com.pulumi.azure.newrelic.TagRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.newrelic.inputs.TagRuleLogTagFilterArgs.builder
      builder.logTagFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param metricTagFilters A `metricTagFilter` block as defined below.
     * @return builder
     */
    def metricTagFilters(args: Endofunction[com.pulumi.azure.newrelic.inputs.TagRuleMetricTagFilterArgs.Builder]*):
        com.pulumi.azure.newrelic.TagRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.newrelic.inputs.TagRuleMetricTagFilterArgs.builder
      builder.metricTagFilters(args.map(_(argsBuilder).build)*)

  /** Manages an Azure Native New Relic Tag Rule. */
  def TagRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.newrelic.TagRuleArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.newrelic.TagRuleArgs.builder
    com.pulumi.azure.newrelic.TagRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Azure Native New Relic Monitor. */
  def Monitor(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.newrelic.MonitorArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.newrelic.MonitorArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.newrelic.Monitor(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.newrelic.inputs.TagRuleState.Builder)
    /**
     * @param logTagFilters A `logTagFilter` block as defined below.
     * @return builder
     */
    def logTagFilters(args: Endofunction[com.pulumi.azure.newrelic.inputs.TagRuleLogTagFilterArgs.Builder]*):
        com.pulumi.azure.newrelic.inputs.TagRuleState.Builder =
      def argsBuilder = com.pulumi.azure.newrelic.inputs.TagRuleLogTagFilterArgs.builder
      builder.logTagFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param metricTagFilters A `metricTagFilter` block as defined below.
     * @return builder
     */
    def metricTagFilters(args: Endofunction[com.pulumi.azure.newrelic.inputs.TagRuleMetricTagFilterArgs.Builder]*):
        com.pulumi.azure.newrelic.inputs.TagRuleState.Builder =
      def argsBuilder = com.pulumi.azure.newrelic.inputs.TagRuleMetricTagFilterArgs.builder
      builder.metricTagFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.newrelic.inputs.MonitorState.Builder)
    /**
     * @param identity An `identity` block as defined below. Changing this forces a new Azure Native New Relic Monitor to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.newrelic.inputs.MonitorIdentityArgs.Builder]):
        com.pulumi.azure.newrelic.inputs.MonitorState.Builder =
      val argsBuilder = com.pulumi.azure.newrelic.inputs.MonitorIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param plan A `plan` block as defined below. Changing this forces a new Azure Native New Relic Monitor to be created.
     * @return builder
     */
    def plan(args: Endofunction[com.pulumi.azure.newrelic.inputs.MonitorPlanArgs.Builder]):
        com.pulumi.azure.newrelic.inputs.MonitorState.Builder =
      val argsBuilder = com.pulumi.azure.newrelic.inputs.MonitorPlanArgs.builder
      builder.plan(args(argsBuilder).build)

    /**
     * @param user A `user` block as defined below. Changing this forces a new Azure Native New Relic Monitor to be created.
     * @return builder
     */
    def user(args: Endofunction[com.pulumi.azure.newrelic.inputs.MonitorUserArgs.Builder]):
        com.pulumi.azure.newrelic.inputs.MonitorState.Builder =
      val argsBuilder = com.pulumi.azure.newrelic.inputs.MonitorUserArgs.builder
      builder.user(args(argsBuilder).build)
