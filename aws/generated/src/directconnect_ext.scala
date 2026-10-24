package jp.ukiba.ko_pulumi
package aws

object directconnect_ext:
  extension (builder: com.pulumi.aws.directconnect.inputs.ConnectionState.Builder)
    /**
     * @param rateLimiterStatuses Rate limiter status for the connection. See `rateLimiterStatus` Block below.
     * @return builder
     */
    def rateLimiterStatuses(args: Endofunction[com.pulumi.aws.directconnect.inputs.ConnectionRateLimiterStatusArgs.Builder]*):
        com.pulumi.aws.directconnect.inputs.ConnectionState.Builder =
      def argsBuilder = com.pulumi.aws.directconnect.inputs.ConnectionRateLimiterStatusArgs.builder
      builder.rateLimiterStatuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.directconnect.inputs.LinkAggregationGroupState.Builder)
    /**
     * @param rateLimiterStatuses Rate limiter status for the LAG. See `rateLimiterStatus` Block below.
     * @return builder
     */
    def rateLimiterStatuses(args: Endofunction[com.pulumi.aws.directconnect.inputs.LinkAggregationGroupRateLimiterStatusArgs.Builder]*):
        com.pulumi.aws.directconnect.inputs.LinkAggregationGroupState.Builder =
      def argsBuilder = com.pulumi.aws.directconnect.inputs.LinkAggregationGroupRateLimiterStatusArgs.builder
      builder.rateLimiterStatuses(args.map(_(argsBuilder).build)*)
