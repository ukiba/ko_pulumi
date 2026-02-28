package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object costexplorer:
  /** Provides a CE Cost Category. */
  def CostCategory(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.costexplorer.CostCategoryArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.costexplorer.CostCategoryArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.costexplorer.CostCategory(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a CE Anomaly Monitor. */
  def AnomalyMonitor(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.costexplorer.AnomalyMonitorArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.costexplorer.AnomalyMonitorArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.costexplorer.AnomalyMonitor(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a CE Cost Allocation Tag. */
  def CostAllocationTag(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.costexplorer.CostAllocationTagArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.costexplorer.CostAllocationTagArgs.builder
    
    com.pulumi.aws.costexplorer.CostAllocationTag(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.costexplorer.CostCategoryArgs.Builder)
    /**
     * @param rules Configuration block for the Cost Category rules used to categorize costs. See below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleArgs.Builder]*):
        com.pulumi.aws.costexplorer.CostCategoryArgs.Builder =
      def argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

    /**
     * @param splitChargeRules Configuration block for the split charge rules used to allocate your charges between your Cost Category values. See below.
     * @return builder
     */
    def splitChargeRules(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategorySplitChargeRuleArgs.Builder]*):
        com.pulumi.aws.costexplorer.CostCategoryArgs.Builder =
      def argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategorySplitChargeRuleArgs.builder
      builder.splitChargeRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.costexplorer.AnomalySubscriptionArgs.Builder)
    /**
     * @param subscribers A subscriber configuration. Multiple subscribers can be defined.
     * @return builder
     */
    def subscribers(args: Endofunction[com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionSubscriberArgs.Builder]*):
        com.pulumi.aws.costexplorer.AnomalySubscriptionArgs.Builder =
      def argsBuilder = com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionSubscriberArgs.builder
      builder.subscribers(args.map(_(argsBuilder).build)*)

    /**
     * @param thresholdExpression An Expression object used to specify the anomalies that you want to generate alerts for. See Threshold Expression.
     * @return builder
     */
    def thresholdExpression(args: Endofunction[com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionArgs.Builder]):
        com.pulumi.aws.costexplorer.AnomalySubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionArgs.builder
      builder.thresholdExpression(args(argsBuilder).build)

  /** Provides a CE Anomaly Subscription. */
  def AnomalySubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.costexplorer.AnomalySubscriptionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.costexplorer.AnomalySubscriptionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.costexplorer.AnomalySubscription(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type CostexplorerFunctions = com.pulumi.aws.costexplorer.CostexplorerFunctions
  object CostexplorerFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.costexplorer.CostexplorerFunctions.*
  extension (self: CostexplorerFunctions.type)
    /** Provides details about a specific CostExplorer Cost Category. */
    def getCostCategory(args: Endofunction[com.pulumi.aws.costexplorer.inputs.GetCostCategoryArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.costexplorer.outputs.GetCostCategoryResult] =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.GetCostCategoryArgs.builder
      com.pulumi.aws.costexplorer.CostexplorerFunctions.getCostCategory(args(argsBuilder).build)

    /** Provides details about a specific CostExplorer Cost Category. */
    def getCostCategoryPlain(args: Endofunction[com.pulumi.aws.costexplorer.inputs.GetCostCategoryPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.costexplorer.outputs.GetCostCategoryResult] =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.GetCostCategoryPlainArgs.builder
      com.pulumi.aws.costexplorer.CostexplorerFunctions.getCostCategoryPlain(args(argsBuilder).build)

    /** Provides the available cost allocation tag keys and tag values for a specified period. */
    def getTags(args: Endofunction[com.pulumi.aws.costexplorer.inputs.GetTagsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.costexplorer.outputs.GetTagsResult] =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.GetTagsArgs.builder
      com.pulumi.aws.costexplorer.CostexplorerFunctions.getTags(args(argsBuilder).build)

    /** Provides the available cost allocation tag keys and tag values for a specified period. */
    def getTagsPlain(args: Endofunction[com.pulumi.aws.costexplorer.inputs.GetTagsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.costexplorer.outputs.GetTagsResult] =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.GetTagsPlainArgs.builder
      com.pulumi.aws.costexplorer.CostexplorerFunctions.getTagsPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.costexplorer.inputs.GetTagsArgs.Builder)
    /**
     * @param filter Configuration block for the `Expression` object used to categorize costs. See `filter` block below for details.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.aws.costexplorer.inputs.GetTagsFilterArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.GetTagsArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.GetTagsFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param sortBies Configuration block for the value by which you want to sort the data. `sortBy` block below for details.
     * @return builder
     */
    def sortBies(args: Endofunction[com.pulumi.aws.costexplorer.inputs.GetTagsSortByArgs.Builder]*):
        com.pulumi.aws.costexplorer.inputs.GetTagsArgs.Builder =
      def argsBuilder = com.pulumi.aws.costexplorer.inputs.GetTagsSortByArgs.builder
      builder.sortBies(args.map(_(argsBuilder).build)*)

    /**
     * @param timePeriod Configuration block for the start and end dates for retrieving the dimension values. See `timePeriod` block below for details.
     * @return builder
     */
    def timePeriod(args: Endofunction[com.pulumi.aws.costexplorer.inputs.GetTagsTimePeriodArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.GetTagsArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.GetTagsTimePeriodArgs.builder
      builder.timePeriod(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotAndArgs.Builder)
    /**
     * @param costCategory Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
     * @return builder
     */
    def costCategory(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotAndCostCategoryArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotAndCostCategoryArgs.builder
      builder.costCategory(args(argsBuilder).build)

    /**
     * @param dimension Configuration block for the specific `Dimension` to use for `Expression`. See below.
     * @return builder
     */
    def dimension(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotAndDimensionArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotAndDimensionArgs.builder
      builder.dimension(args(argsBuilder).build)

    /**
     * @param tags Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotAndTagsArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotAndTagsArgs.builder
      builder.tags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndNotArgs.Builder)
    /**
     * @param costCategory Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
     * @return builder
     */
    def costCategory(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndNotCostCategoryArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndNotArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndNotCostCategoryArgs.builder
      builder.costCategory(args(argsBuilder).build)

    /**
     * @param dimension Configuration block for the specific `Dimension` to use for `Expression`. See below.
     * @return builder
     */
    def dimension(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndNotDimensionArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndNotArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndNotDimensionArgs.builder
      builder.dimension(args(argsBuilder).build)

    /**
     * @param tags Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndNotTagsArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndNotArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndNotTagsArgs.builder
      builder.tags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotOrArgs.Builder)
    /**
     * @param costCategory Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
     * @return builder
     */
    def costCategory(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotOrCostCategoryArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotOrArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotOrCostCategoryArgs.builder
      builder.costCategory(args(argsBuilder).build)

    /**
     * @param dimension Configuration block for the specific `Dimension` to use for `Expression`. See below.
     * @return builder
     */
    def dimension(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotOrDimensionArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotOrArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotOrDimensionArgs.builder
      builder.dimension(args(argsBuilder).build)

    /**
     * @param tags Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotOrTagsArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotOrArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotOrTagsArgs.builder
      builder.tags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionNotArgs.Builder)
    /**
     * @param costCategory Configuration block for the filter that&#39;s based on  values. See Cost Category below.
     * @return builder
     */
    def costCategory(args: Endofunction[com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionNotCostCategoryArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionNotArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionNotCostCategoryArgs.builder
      builder.costCategory(args(argsBuilder).build)

    /**
     * @param dimension Configuration block for the specific Dimension to use for.
     * @return builder
     */
    def dimension(args: Endofunction[com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionNotDimensionArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionNotArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionNotDimensionArgs.builder
      builder.dimension(args(argsBuilder).build)

    /**
     * @param tags A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionNotTagsArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionNotArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionNotTagsArgs.builder
      builder.tags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrNotArgs.Builder)
    /**
     * @param costCategory Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
     * @return builder
     */
    def costCategory(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrNotCostCategoryArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrNotArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrNotCostCategoryArgs.builder
      builder.costCategory(args(argsBuilder).build)

    /**
     * @param dimension Configuration block for the specific `Dimension` to use for `Expression`. See below.
     * @return builder
     */
    def dimension(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrNotDimensionArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrNotArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrNotDimensionArgs.builder
      builder.dimension(args(argsBuilder).build)

    /**
     * @param tags Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrNotTagsArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrNotArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrNotTagsArgs.builder
      builder.tags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionState.Builder)
    /**
     * @param subscribers A subscriber configuration. Multiple subscribers can be defined.
     * @return builder
     */
    def subscribers(args: Endofunction[com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionSubscriberArgs.Builder]*):
        com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionState.Builder =
      def argsBuilder = com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionSubscriberArgs.builder
      builder.subscribers(args.map(_(argsBuilder).build)*)

    /**
     * @param thresholdExpression An Expression object used to specify the anomalies that you want to generate alerts for. See Threshold Expression.
     * @return builder
     */
    def thresholdExpression(args: Endofunction[com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionState.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionArgs.builder
      builder.thresholdExpression(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.costexplorer.inputs.GetTagsFilterOrArgs.Builder)
    /**
     * @param costCategory Configuration block for the filter that&#39;s based on `CostCategory` values. See `costCategory` block below for details.
     * @return builder
     */
    def costCategory(args: Endofunction[com.pulumi.aws.costexplorer.inputs.GetTagsFilterOrCostCategoryArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.GetTagsFilterOrArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.GetTagsFilterOrCostCategoryArgs.builder
      builder.costCategory(args(argsBuilder).build)

    /**
     * @param dimension Configuration block for the specific `Dimension` to use for `Expression`. See `dimension` block below for details.
     * @return builder
     */
    def dimension(args: Endofunction[com.pulumi.aws.costexplorer.inputs.GetTagsFilterOrDimensionArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.GetTagsFilterOrArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.GetTagsFilterOrDimensionArgs.builder
      builder.dimension(args(argsBuilder).build)

    /**
     * @param tags Tags that match your request.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.costexplorer.inputs.GetTagsFilterOrTagsArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.GetTagsFilterOrArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.GetTagsFilterOrTagsArgs.builder
      builder.tags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotArgs.Builder)
    /**
     * @param ands Return results that match both `Dimension` objects.
     * @return builder
     */
    def ands(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotAndArgs.Builder]*):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotArgs.Builder =
      def argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotAndArgs.builder
      builder.ands(args.map(_(argsBuilder).build)*)

    /**
     * @param costCategory Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
     * @return builder
     */
    def costCategory(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotCostCategoryArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotCostCategoryArgs.builder
      builder.costCategory(args(argsBuilder).build)

    /**
     * @param dimension Configuration block for the specific `Dimension` to use for `Expression`. See below.
     * @return builder
     */
    def dimension(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotDimensionArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotDimensionArgs.builder
      builder.dimension(args(argsBuilder).build)

    /**
     * @param not Return results that match both `Dimension` object.
     * @return builder
     */
    def not(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotNotArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotNotArgs.builder
      builder.not(args(argsBuilder).build)

    /**
     * @param ors Return results that match both `Dimension` object.
     * @return builder
     */
    def ors(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotOrArgs.Builder]*):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotArgs.Builder =
      def argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotOrArgs.builder
      builder.ors(args.map(_(argsBuilder).build)*)

    /**
     * @param tags Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotTagsArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotTagsArgs.builder
      builder.tags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.costexplorer.inputs.GetTagsFilterNotArgs.Builder)
    /**
     * @param costCategory Configuration block for the filter that&#39;s based on `CostCategory` values. See `costCategory` block below for details.
     * @return builder
     */
    def costCategory(args: Endofunction[com.pulumi.aws.costexplorer.inputs.GetTagsFilterNotCostCategoryArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.GetTagsFilterNotArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.GetTagsFilterNotCostCategoryArgs.builder
      builder.costCategory(args(argsBuilder).build)

    /**
     * @param dimension Configuration block for the specific `Dimension` to use for `Expression`. See `dimension` block below for details.
     * @return builder
     */
    def dimension(args: Endofunction[com.pulumi.aws.costexplorer.inputs.GetTagsFilterNotDimensionArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.GetTagsFilterNotArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.GetTagsFilterNotDimensionArgs.builder
      builder.dimension(args(argsBuilder).build)

    /**
     * @param tags Tags that match your request.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.costexplorer.inputs.GetTagsFilterNotTagsArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.GetTagsFilterNotArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.GetTagsFilterNotTagsArgs.builder
      builder.tags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.costexplorer.inputs.CostCategoryRuleArgs.Builder)
    /**
     * @param inheritedValue Configuration block for the value the line item is categorized as if the line item contains the matched dimension. See below.
     * @return builder
     */
    def inheritedValue(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleInheritedValueArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleInheritedValueArgs.builder
      builder.inheritedValue(args(argsBuilder).build)

    /**
     * @param rule Configuration block for the `Expression` object used to categorize costs. See below.
     * @return builder
     */
    def rule(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleArgs.builder
      builder.rule(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.costexplorer.inputs.GetTagsFilterAndArgs.Builder)
    /**
     * @param costCategory Configuration block for the filter that&#39;s based on `CostCategory` values. See `costCategory` block below for details.
     * @return builder
     */
    def costCategory(args: Endofunction[com.pulumi.aws.costexplorer.inputs.GetTagsFilterAndCostCategoryArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.GetTagsFilterAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.GetTagsFilterAndCostCategoryArgs.builder
      builder.costCategory(args(argsBuilder).build)

    /**
     * @param dimension Configuration block for the specific `Dimension` to use for `Expression`. See `dimension` block below for details.
     * @return builder
     */
    def dimension(args: Endofunction[com.pulumi.aws.costexplorer.inputs.GetTagsFilterAndDimensionArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.GetTagsFilterAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.GetTagsFilterAndDimensionArgs.builder
      builder.dimension(args(argsBuilder).build)

    /**
     * @param tags Tags that match your request.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.costexplorer.inputs.GetTagsFilterAndTagsArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.GetTagsFilterAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.GetTagsFilterAndTagsArgs.builder
      builder.tags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.costexplorer.inputs.GetTagsFilterArgs.Builder)
    /**
     * @param ands Return results that match both `Dimension` objects.
     * @return builder
     */
    def ands(args: Endofunction[com.pulumi.aws.costexplorer.inputs.GetTagsFilterAndArgs.Builder]*):
        com.pulumi.aws.costexplorer.inputs.GetTagsFilterArgs.Builder =
      def argsBuilder = com.pulumi.aws.costexplorer.inputs.GetTagsFilterAndArgs.builder
      builder.ands(args.map(_(argsBuilder).build)*)

    /**
     * @param costCategory Configuration block for the filter that&#39;s based on `CostCategory` values. See `costCategory` block below for details.
     * @return builder
     */
    def costCategory(args: Endofunction[com.pulumi.aws.costexplorer.inputs.GetTagsFilterCostCategoryArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.GetTagsFilterArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.GetTagsFilterCostCategoryArgs.builder
      builder.costCategory(args(argsBuilder).build)

    /**
     * @param dimension Configuration block for the specific `Dimension` to use for `Expression`. See `dimension` block below for details.
     * @return builder
     */
    def dimension(args: Endofunction[com.pulumi.aws.costexplorer.inputs.GetTagsFilterDimensionArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.GetTagsFilterArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.GetTagsFilterDimensionArgs.builder
      builder.dimension(args(argsBuilder).build)

    /**
     * @param not Return results that match both `Dimension` object.
     * @return builder
     */
    def not(args: Endofunction[com.pulumi.aws.costexplorer.inputs.GetTagsFilterNotArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.GetTagsFilterArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.GetTagsFilterNotArgs.builder
      builder.not(args(argsBuilder).build)

    /**
     * @param ors Return results that match both `Dimension` object.
     * @return builder
     */
    def ors(args: Endofunction[com.pulumi.aws.costexplorer.inputs.GetTagsFilterOrArgs.Builder]*):
        com.pulumi.aws.costexplorer.inputs.GetTagsFilterArgs.Builder =
      def argsBuilder = com.pulumi.aws.costexplorer.inputs.GetTagsFilterOrArgs.builder
      builder.ors(args.map(_(argsBuilder).build)*)

    /**
     * @param tags Tags that match your request.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.costexplorer.inputs.GetTagsFilterTagsArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.GetTagsFilterArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.GetTagsFilterTagsArgs.builder
      builder.tags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionOrArgs.Builder)
    /**
     * @param costCategory Configuration block for the filter that&#39;s based on  values. See Cost Category below.
     * @return builder
     */
    def costCategory(args: Endofunction[com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionOrCostCategoryArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionOrArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionOrCostCategoryArgs.builder
      builder.costCategory(args(argsBuilder).build)

    /**
     * @param dimension Configuration block for the specific Dimension to use for.
     * @return builder
     */
    def dimension(args: Endofunction[com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionOrDimensionArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionOrArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionOrDimensionArgs.builder
      builder.dimension(args(argsBuilder).build)

    /**
     * @param tags A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionOrTagsArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionOrArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionOrTagsArgs.builder
      builder.tags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrArgs.Builder)
    /**
     * @param ands Return results that match both `Dimension` objects.
     * @return builder
     */
    def ands(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrAndArgs.Builder]*):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrArgs.Builder =
      def argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrAndArgs.builder
      builder.ands(args.map(_(argsBuilder).build)*)

    /**
     * @param costCategory Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
     * @return builder
     */
    def costCategory(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrCostCategoryArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrCostCategoryArgs.builder
      builder.costCategory(args(argsBuilder).build)

    /**
     * @param dimension Configuration block for the specific `Dimension` to use for `Expression`. See below.
     * @return builder
     */
    def dimension(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrDimensionArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrDimensionArgs.builder
      builder.dimension(args(argsBuilder).build)

    /**
     * @param not Return results that match both `Dimension` object.
     * @return builder
     */
    def not(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrNotArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrNotArgs.builder
      builder.not(args(argsBuilder).build)

    /**
     * @param ors Return results that match both `Dimension` object.
     * @return builder
     */
    def ors(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrOrArgs.Builder]*):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrArgs.Builder =
      def argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrOrArgs.builder
      builder.ors(args.map(_(argsBuilder).build)*)

    /**
     * @param tags Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrTagsArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrTagsArgs.builder
      builder.tags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndArgs.Builder)
    /**
     * @param ands Return results that match both `Dimension` objects.
     * @return builder
     */
    def ands(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndAndArgs.Builder]*):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndArgs.Builder =
      def argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndAndArgs.builder
      builder.ands(args.map(_(argsBuilder).build)*)

    /**
     * @param costCategory Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
     * @return builder
     */
    def costCategory(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndCostCategoryArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndCostCategoryArgs.builder
      builder.costCategory(args(argsBuilder).build)

    /**
     * @param dimension Configuration block for the specific `Dimension` to use for `Expression`. See below.
     * @return builder
     */
    def dimension(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndDimensionArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndDimensionArgs.builder
      builder.dimension(args(argsBuilder).build)

    /**
     * @param not Return results that match both `Dimension` object.
     * @return builder
     */
    def not(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndNotArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndNotArgs.builder
      builder.not(args(argsBuilder).build)

    /**
     * @param ors Return results that match both `Dimension` object.
     * @return builder
     */
    def ors(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndOrArgs.Builder]*):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndArgs.Builder =
      def argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndOrArgs.builder
      builder.ors(args.map(_(argsBuilder).build)*)

    /**
     * @param tags Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndTagsArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndTagsArgs.builder
      builder.tags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleArgs.Builder)
    /**
     * @param ands Return results that match both `Dimension` objects.
     * @return builder
     */
    def ands(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndArgs.Builder]*):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndArgs.builder
      builder.ands(args.map(_(argsBuilder).build)*)

    /**
     * @param costCategory Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
     * @return builder
     */
    def costCategory(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleCostCategoryArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleCostCategoryArgs.builder
      builder.costCategory(args(argsBuilder).build)

    /**
     * @param dimension Configuration block for the specific `Dimension` to use for `Expression`. See below.
     * @return builder
     */
    def dimension(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleDimensionArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleDimensionArgs.builder
      builder.dimension(args(argsBuilder).build)

    /**
     * @param not Return results that match both `Dimension` object.
     * @return builder
     */
    def not(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotArgs.builder
      builder.not(args(argsBuilder).build)

    /**
     * @param ors Return results that match both `Dimension` object.
     * @return builder
     */
    def ors(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrArgs.Builder]*):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrArgs.builder
      builder.ors(args.map(_(argsBuilder).build)*)

    /**
     * @param tags Configuration block for the specific `Tag` to use for `Expression`. See below.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleTagsArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleTagsArgs.builder
      builder.tags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.costexplorer.inputs.CostCategoryState.Builder)
    /**
     * @param rules Configuration block for the Cost Category rules used to categorize costs. See below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleArgs.Builder]*):
        com.pulumi.aws.costexplorer.inputs.CostCategoryState.Builder =
      def argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

    /**
     * @param splitChargeRules Configuration block for the split charge rules used to allocate your charges between your Cost Category values. See below.
     * @return builder
     */
    def splitChargeRules(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategorySplitChargeRuleArgs.Builder]*):
        com.pulumi.aws.costexplorer.inputs.CostCategoryState.Builder =
      def argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategorySplitChargeRuleArgs.builder
      builder.splitChargeRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrOrArgs.Builder)
    /**
     * @param costCategory Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
     * @return builder
     */
    def costCategory(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrOrCostCategoryArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrOrArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrOrCostCategoryArgs.builder
      builder.costCategory(args(argsBuilder).build)

    /**
     * @param dimension Configuration block for the specific `Dimension` to use for `Expression`. See below.
     * @return builder
     */
    def dimension(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrOrDimensionArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrOrArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrOrDimensionArgs.builder
      builder.dimension(args(argsBuilder).build)

    /**
     * @param tags Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrOrTagsArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrOrArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrOrTagsArgs.builder
      builder.tags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.costexplorer.inputs.CostCategorySplitChargeRuleArgs.Builder)
    /**
     * @param parameters Configuration block for the parameters for a split charge method. This is only required for the `FIXED` method. See below.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategorySplitChargeRuleParameterArgs.Builder]*):
        com.pulumi.aws.costexplorer.inputs.CostCategorySplitChargeRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategorySplitChargeRuleParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndOrArgs.Builder)
    /**
     * @param costCategory Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
     * @return builder
     */
    def costCategory(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndOrCostCategoryArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndOrArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndOrCostCategoryArgs.builder
      builder.costCategory(args(argsBuilder).build)

    /**
     * @param dimension Configuration block for the specific `Dimension` to use for `Expression`. See below.
     * @return builder
     */
    def dimension(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndOrDimensionArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndOrArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndOrDimensionArgs.builder
      builder.dimension(args(argsBuilder).build)

    /**
     * @param tags Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndOrTagsArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndOrArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndOrTagsArgs.builder
      builder.tags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndAndArgs.Builder)
    /**
     * @param costCategory Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
     * @return builder
     */
    def costCategory(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndAndCostCategoryArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndAndCostCategoryArgs.builder
      builder.costCategory(args(argsBuilder).build)

    /**
     * @param dimension Configuration block for the specific `Dimension` to use for `Expression`. See below.
     * @return builder
     */
    def dimension(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndAndDimensionArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndAndDimensionArgs.builder
      builder.dimension(args(argsBuilder).build)

    /**
     * @param tags Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndAndTagsArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleAndAndTagsArgs.builder
      builder.tags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotNotArgs.Builder)
    /**
     * @param costCategory Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
     * @return builder
     */
    def costCategory(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotNotCostCategoryArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotNotArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotNotCostCategoryArgs.builder
      builder.costCategory(args(argsBuilder).build)

    /**
     * @param dimension Configuration block for the specific `Dimension` to use for `Expression`. See below.
     * @return builder
     */
    def dimension(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotNotDimensionArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotNotArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotNotDimensionArgs.builder
      builder.dimension(args(argsBuilder).build)

    /**
     * @param tags Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotNotTagsArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotNotArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleNotNotTagsArgs.builder
      builder.tags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionAndArgs.Builder)
    /**
     * @param costCategory Configuration block for the filter that&#39;s based on  values. See Cost Category below.
     * @return builder
     */
    def costCategory(args: Endofunction[com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionAndCostCategoryArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionAndCostCategoryArgs.builder
      builder.costCategory(args(argsBuilder).build)

    /**
     * @param dimension Configuration block for the specific Dimension to use for.
     * @return builder
     */
    def dimension(args: Endofunction[com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionAndDimensionArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionAndDimensionArgs.builder
      builder.dimension(args(argsBuilder).build)

    /**
     * @param tags A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionAndTagsArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionAndTagsArgs.builder
      builder.tags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionArgs.Builder)
    /**
     * @param ands Return results that match both Dimension objects.
     * @return builder
     */
    def ands(args: Endofunction[com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionAndArgs.Builder]*):
        com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionArgs.Builder =
      def argsBuilder = com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionAndArgs.builder
      builder.ands(args.map(_(argsBuilder).build)*)

    /**
     * @param costCategory Configuration block for the filter that&#39;s based on  values. See Cost Category below.
     * @return builder
     */
    def costCategory(args: Endofunction[com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionCostCategoryArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionCostCategoryArgs.builder
      builder.costCategory(args(argsBuilder).build)

    /**
     * @param dimension Configuration block for the specific Dimension to use for.
     * @return builder
     */
    def dimension(args: Endofunction[com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionDimensionArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionDimensionArgs.builder
      builder.dimension(args(argsBuilder).build)

    /**
     * @param not Return results that do not match the Dimension object.
     * @return builder
     */
    def not(args: Endofunction[com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionNotArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionNotArgs.builder
      builder.not(args(argsBuilder).build)

    /**
     * @param ors Return results that match either Dimension object.
     * @return builder
     */
    def ors(args: Endofunction[com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionOrArgs.Builder]*):
        com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionArgs.Builder =
      def argsBuilder = com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionOrArgs.builder
      builder.ors(args.map(_(argsBuilder).build)*)

    /**
     * @param tags Configuration block for the specific Tag to use for. See Tags below.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionTagsArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionTagsArgs.builder
      builder.tags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrAndArgs.Builder)
    /**
     * @param costCategory Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
     * @return builder
     */
    def costCategory(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrAndCostCategoryArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrAndCostCategoryArgs.builder
      builder.costCategory(args(argsBuilder).build)

    /**
     * @param dimension Configuration block for the specific `Dimension` to use for `Expression`. See below.
     * @return builder
     */
    def dimension(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrAndDimensionArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrAndDimensionArgs.builder
      builder.dimension(args(argsBuilder).build)

    /**
     * @param tags Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrAndTagsArgs.Builder]):
        com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.costexplorer.inputs.CostCategoryRuleRuleOrAndTagsArgs.builder
      builder.tags(args(argsBuilder).build)
