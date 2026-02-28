package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object billing:
  extension (builder: com.pulumi.aws.billing.ViewArgs.Builder)
    /**
     * @param dataFilterExpression Filter Cost Explorer APIs using the expression. Refer to the data-filter-expression block documentation for more details.
     * @return builder
     */
    def dataFilterExpression(args: Endofunction[com.pulumi.aws.billing.inputs.ViewDataFilterExpressionArgs.Builder]):
        com.pulumi.aws.billing.ViewArgs.Builder =
      val argsBuilder = com.pulumi.aws.billing.inputs.ViewDataFilterExpressionArgs.builder
      builder.dataFilterExpression(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.billing.inputs.ViewTimeoutsArgs.Builder]):
        com.pulumi.aws.billing.ViewArgs.Builder =
      val argsBuilder = com.pulumi.aws.billing.inputs.ViewTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  type BillingFunctions = com.pulumi.aws.billing.BillingFunctions
  object BillingFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.billing.BillingFunctions.*
  extension (self: BillingFunctions.type)
    /** Provides details about an AWS Billing Views. */
    def getViews(args: Endofunction[com.pulumi.aws.billing.inputs.GetViewsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.billing.outputs.GetViewsResult] =
      val argsBuilder = com.pulumi.aws.billing.inputs.GetViewsArgs.builder
      com.pulumi.aws.billing.BillingFunctions.getViews(args(argsBuilder).build)

    /** Provides details about an AWS Billing Views. */
    def getViewsPlain(args: Endofunction[com.pulumi.aws.billing.inputs.GetViewsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.billing.outputs.GetViewsResult] =
      val argsBuilder = com.pulumi.aws.billing.inputs.GetViewsPlainArgs.builder
      com.pulumi.aws.billing.BillingFunctions.getViewsPlain(args(argsBuilder).build)

  /** Manages an AWS Billing View. */
  def View(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.billing.ViewArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.billing.ViewArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.billing.View(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.billing.inputs.ViewDataFilterExpressionArgs.Builder)
    /**
     * @param dimensions Dimension to use for `expression`. Refer to #dimensions for more details.
     * @return builder
     */
    def dimensions(args: Endofunction[com.pulumi.aws.billing.inputs.ViewDataFilterExpressionDimensionsArgs.Builder]):
        com.pulumi.aws.billing.inputs.ViewDataFilterExpressionArgs.Builder =
      val argsBuilder = com.pulumi.aws.billing.inputs.ViewDataFilterExpressionDimensionsArgs.builder
      builder.dimensions(args(argsBuilder).build)

    /**
     * @param tags List of key value map specifying tags associated to the billing view being created.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.billing.inputs.ViewDataFilterExpressionTagArgs.Builder]*):
        com.pulumi.aws.billing.inputs.ViewDataFilterExpressionArgs.Builder =
      def argsBuilder = com.pulumi.aws.billing.inputs.ViewDataFilterExpressionTagArgs.builder
      builder.tags(args.map(_(argsBuilder).build)*)

    /**
     * @param timeRange Time range to use for `expression`. Refer to #time-range for more details.
     * @return builder
     */
    def timeRange(args: Endofunction[com.pulumi.aws.billing.inputs.ViewDataFilterExpressionTimeRangeArgs.Builder]):
        com.pulumi.aws.billing.inputs.ViewDataFilterExpressionArgs.Builder =
      val argsBuilder = com.pulumi.aws.billing.inputs.ViewDataFilterExpressionTimeRangeArgs.builder
      builder.timeRange(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.billing.inputs.ViewState.Builder)
    /**
     * @param dataFilterExpression Filter Cost Explorer APIs using the expression. Refer to the data-filter-expression block documentation for more details.
     * @return builder
     */
    def dataFilterExpression(args: Endofunction[com.pulumi.aws.billing.inputs.ViewDataFilterExpressionArgs.Builder]):
        com.pulumi.aws.billing.inputs.ViewState.Builder =
      val argsBuilder = com.pulumi.aws.billing.inputs.ViewDataFilterExpressionArgs.builder
      builder.dataFilterExpression(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.billing.inputs.ViewTimeoutsArgs.Builder]):
        com.pulumi.aws.billing.inputs.ViewState.Builder =
      val argsBuilder = com.pulumi.aws.billing.inputs.ViewTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
