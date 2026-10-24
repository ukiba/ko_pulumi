package jp.ukiba.ko_pulumi
package aws

object billing_ext:
  extension (builder: com.pulumi.aws.billing.ViewArgs.Builder)
    /**
     * @param dataFilterExpression Filter Cost Explorer APIs using the expression. See `dataFilterExpression` below for details.
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

  extension (builder: com.pulumi.aws.billing.inputs.ViewDataFilterExpressionArgs.Builder)
    /**
     * @param dimensions Dimension to use for the expression. See `dimensions` below for details.
     * @return builder
     */
    def dimensions(args: Endofunction[com.pulumi.aws.billing.inputs.ViewDataFilterExpressionDimensionsArgs.Builder]):
        com.pulumi.aws.billing.inputs.ViewDataFilterExpressionArgs.Builder =
      val argsBuilder = com.pulumi.aws.billing.inputs.ViewDataFilterExpressionDimensionsArgs.builder
      builder.dimensions(args(argsBuilder).build)

    /**
     * @param tags Tags to use for the expression. See `tags` below for details.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.billing.inputs.ViewDataFilterExpressionTagArgs.Builder]*):
        com.pulumi.aws.billing.inputs.ViewDataFilterExpressionArgs.Builder =
      def argsBuilder = com.pulumi.aws.billing.inputs.ViewDataFilterExpressionTagArgs.builder
      builder.tags(args.map(_(argsBuilder).build)*)

    /**
     * @param timeRange Time range to use for the expression. See `timeRange` below for details.
     * @return builder
     */
    def timeRange(args: Endofunction[com.pulumi.aws.billing.inputs.ViewDataFilterExpressionTimeRangeArgs.Builder]):
        com.pulumi.aws.billing.inputs.ViewDataFilterExpressionArgs.Builder =
      val argsBuilder = com.pulumi.aws.billing.inputs.ViewDataFilterExpressionTimeRangeArgs.builder
      builder.timeRange(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.billing.inputs.ViewState.Builder)
    /**
     * @param dataFilterExpression Filter Cost Explorer APIs using the expression. See `dataFilterExpression` below for details.
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
