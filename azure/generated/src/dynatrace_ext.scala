package jp.ukiba.ko_pulumi
package azure

object dynatrace_ext:
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

  extension (builder: com.pulumi.azure.dynatrace.inputs.MonitorEnvironmentPropertyArgs.Builder)
    /**
     * @param environmentInfos Information about the Dynatrace environment. An `environmentInfo` block as defined below.
     * @return builder
     */
    def environmentInfos(args: Endofunction[com.pulumi.azure.dynatrace.inputs.MonitorEnvironmentPropertyEnvironmentInfoArgs.Builder]*):
        com.pulumi.azure.dynatrace.inputs.MonitorEnvironmentPropertyArgs.Builder =
      def argsBuilder = com.pulumi.azure.dynatrace.inputs.MonitorEnvironmentPropertyEnvironmentInfoArgs.builder
      builder.environmentInfos(args.map(_(argsBuilder).build)*)

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

  extension (builder: com.pulumi.azure.dynatrace.inputs.TagRulesLogRuleArgs.Builder)
    /**
     * @param filteringTags Filtering tag for the log rule. A `filteringTag` block as defined below.
     * @return builder
     */
    def filteringTags(args: Endofunction[com.pulumi.azure.dynatrace.inputs.TagRulesLogRuleFilteringTagArgs.Builder]*):
        com.pulumi.azure.dynatrace.inputs.TagRulesLogRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.dynatrace.inputs.TagRulesLogRuleFilteringTagArgs.builder
      builder.filteringTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dynatrace.inputs.TagRulesMetricRuleArgs.Builder)
    /**
     * @param filteringTags Filtering tag for the metric rule. A `filteringTag` block as defined below.
     * @return builder
     */
    def filteringTags(args: Endofunction[com.pulumi.azure.dynatrace.inputs.TagRulesMetricRuleFilteringTagArgs.Builder]*):
        com.pulumi.azure.dynatrace.inputs.TagRulesMetricRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.dynatrace.inputs.TagRulesMetricRuleFilteringTagArgs.builder
      builder.filteringTags(args.map(_(argsBuilder).build)*)

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
