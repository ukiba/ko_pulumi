package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object dynatrace:
  extension (builder: com.pulumi.azure.dynatrace.MonitorArgs.Builder)
    /**
     * @param environmentProperties Properties of the Dynatrace environment. An `environmentProperties` block as defined below.
     * @return builder
     */
    def environmentProperties(args: Endofunction[com.pulumi.azure.dynatrace.inputs.MonitorEnvironmentPropertyArgs.Builder]*):
        com.pulumi.azure.dynatrace.MonitorArgs.Builder =
      def argsBuilder = com.pulumi.azure.dynatrace.inputs.MonitorEnvironmentPropertyArgs.builder
      builder.environmentProperties(args.map(_(argsBuilder).build)*)

    /**
     * @param identity The kind of managed identity assigned to this resource. A `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.dynatrace.inputs.MonitorIdentityArgs.Builder]):
        com.pulumi.azure.dynatrace.MonitorArgs.Builder =
      val argsBuilder = com.pulumi.azure.dynatrace.inputs.MonitorIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param plan Billing plan information. A `plan` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def plan(args: Endofunction[com.pulumi.azure.dynatrace.inputs.MonitorPlanArgs.Builder]):
        com.pulumi.azure.dynatrace.MonitorArgs.Builder =
      val argsBuilder = com.pulumi.azure.dynatrace.inputs.MonitorPlanArgs.builder
      builder.plan(args(argsBuilder).build)

    /**
     * @param user User&#39;s information. A `user` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def user(args: Endofunction[com.pulumi.azure.dynatrace.inputs.MonitorUserArgs.Builder]):
        com.pulumi.azure.dynatrace.MonitorArgs.Builder =
      val argsBuilder = com.pulumi.azure.dynatrace.inputs.MonitorUserArgs.builder
      builder.user(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.dynatrace.MonitorArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  type DynatraceFunctions = com.pulumi.azure.dynatrace.DynatraceFunctions
  object DynatraceFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.dynatrace.DynatraceFunctions.*
  extension (self: DynatraceFunctions.type)
    /** Use this data source to access information about an existing Dynatrace Monitor. */
    def getMonitor(args: Endofunction[com.pulumi.azure.dynatrace.inputs.GetMonitorArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.dynatrace.outputs.GetMonitorResult] =
      val argsBuilder = com.pulumi.azure.dynatrace.inputs.GetMonitorArgs.builder
      com.pulumi.azure.dynatrace.DynatraceFunctions.getMonitor(args(argsBuilder).build)

    /** Use this data source to access information about an existing Dynatrace Monitor. */
    def getMonitorPlain(args: Endofunction[com.pulumi.azure.dynatrace.inputs.GetMonitorPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.dynatrace.outputs.GetMonitorResult] =
      val argsBuilder = com.pulumi.azure.dynatrace.inputs.GetMonitorPlainArgs.builder
      com.pulumi.azure.dynatrace.DynatraceFunctions.getMonitorPlain(args(argsBuilder).build)

  /** Manages Dynatrace tag rules. */
  def TagRules(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dynatrace.TagRulesArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dynatrace.TagRulesArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.dynatrace.TagRules(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Dynatrace monitor. */
  def Monitor(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dynatrace.MonitorArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dynatrace.MonitorArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.dynatrace.Monitor(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.dynatrace.TagRulesArgs.Builder)
    /**
     * @param logRule Set of rules for sending logs for the Monitor resource. A `logRule` block as defined below.
     * @return builder
     */
    def logRule(args: Endofunction[com.pulumi.azure.dynatrace.inputs.TagRulesLogRuleArgs.Builder]):
        com.pulumi.azure.dynatrace.TagRulesArgs.Builder =
      val argsBuilder = com.pulumi.azure.dynatrace.inputs.TagRulesLogRuleArgs.builder
      builder.logRule(args(argsBuilder).build)

    /**
     * @param metricRule Set of rules for sending metrics for the Monitor resource. A `metricRule` block as defined below.
     * @return builder
     */
    def metricRule(args: Endofunction[com.pulumi.azure.dynatrace.inputs.TagRulesMetricRuleArgs.Builder]):
        com.pulumi.azure.dynatrace.TagRulesArgs.Builder =
      val argsBuilder = com.pulumi.azure.dynatrace.inputs.TagRulesMetricRuleArgs.builder
      builder.metricRule(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.dynatrace.inputs.TagRulesMetricRuleArgs.Builder)
    /**
     * @param filteringTags Filtering tag for the metric rule. A `filteringTag` block as defined below.
     * @return builder
     */
    def filteringTags(args: Endofunction[com.pulumi.azure.dynatrace.inputs.TagRulesMetricRuleFilteringTagArgs.Builder]*):
        com.pulumi.azure.dynatrace.inputs.TagRulesMetricRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.dynatrace.inputs.TagRulesMetricRuleFilteringTagArgs.builder
      builder.filteringTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dynatrace.inputs.MonitorEnvironmentPropertyArgs.Builder)
    /**
     * @param environmentInfos Information about the Dynatrace environment. An `environmentInfo` block as defined below.
     * @return builder
     */
    def environmentInfos(args: Endofunction[com.pulumi.azure.dynatrace.inputs.MonitorEnvironmentPropertyEnvironmentInfoArgs.Builder]*):
        com.pulumi.azure.dynatrace.inputs.MonitorEnvironmentPropertyArgs.Builder =
      def argsBuilder = com.pulumi.azure.dynatrace.inputs.MonitorEnvironmentPropertyEnvironmentInfoArgs.builder
      builder.environmentInfos(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dynatrace.inputs.TagRulesState.Builder)
    /**
     * @param logRule Set of rules for sending logs for the Monitor resource. A `logRule` block as defined below.
     * @return builder
     */
    def logRule(args: Endofunction[com.pulumi.azure.dynatrace.inputs.TagRulesLogRuleArgs.Builder]):
        com.pulumi.azure.dynatrace.inputs.TagRulesState.Builder =
      val argsBuilder = com.pulumi.azure.dynatrace.inputs.TagRulesLogRuleArgs.builder
      builder.logRule(args(argsBuilder).build)

    /**
     * @param metricRule Set of rules for sending metrics for the Monitor resource. A `metricRule` block as defined below.
     * @return builder
     */
    def metricRule(args: Endofunction[com.pulumi.azure.dynatrace.inputs.TagRulesMetricRuleArgs.Builder]):
        com.pulumi.azure.dynatrace.inputs.TagRulesState.Builder =
      val argsBuilder = com.pulumi.azure.dynatrace.inputs.TagRulesMetricRuleArgs.builder
      builder.metricRule(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.dynatrace.inputs.MonitorState.Builder)
    /**
     * @param environmentProperties Properties of the Dynatrace environment. An `environmentProperties` block as defined below.
     * @return builder
     */
    def environmentProperties(args: Endofunction[com.pulumi.azure.dynatrace.inputs.MonitorEnvironmentPropertyArgs.Builder]*):
        com.pulumi.azure.dynatrace.inputs.MonitorState.Builder =
      def argsBuilder = com.pulumi.azure.dynatrace.inputs.MonitorEnvironmentPropertyArgs.builder
      builder.environmentProperties(args.map(_(argsBuilder).build)*)

    /**
     * @param identity The kind of managed identity assigned to this resource. A `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.dynatrace.inputs.MonitorIdentityArgs.Builder]):
        com.pulumi.azure.dynatrace.inputs.MonitorState.Builder =
      val argsBuilder = com.pulumi.azure.dynatrace.inputs.MonitorIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param plan Billing plan information. A `plan` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def plan(args: Endofunction[com.pulumi.azure.dynatrace.inputs.MonitorPlanArgs.Builder]):
        com.pulumi.azure.dynatrace.inputs.MonitorState.Builder =
      val argsBuilder = com.pulumi.azure.dynatrace.inputs.MonitorPlanArgs.builder
      builder.plan(args(argsBuilder).build)

    /**
     * @param user User&#39;s information. A `user` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def user(args: Endofunction[com.pulumi.azure.dynatrace.inputs.MonitorUserArgs.Builder]):
        com.pulumi.azure.dynatrace.inputs.MonitorState.Builder =
      val argsBuilder = com.pulumi.azure.dynatrace.inputs.MonitorUserArgs.builder
      builder.user(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.dynatrace.inputs.MonitorState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.dynatrace.inputs.TagRulesLogRuleArgs.Builder)
    /**
     * @param filteringTags Filtering tag for the log rule. A `filteringTag` block as defined below.
     * @return builder
     */
    def filteringTags(args: Endofunction[com.pulumi.azure.dynatrace.inputs.TagRulesLogRuleFilteringTagArgs.Builder]*):
        com.pulumi.azure.dynatrace.inputs.TagRulesLogRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.dynatrace.inputs.TagRulesLogRuleFilteringTagArgs.builder
      builder.filteringTags(args.map(_(argsBuilder).build)*)
