package jp.ukiba.ko_pulumi
package aws

object servicequotas_ext:
  extension (builder: com.pulumi.aws.servicequotas.inputs.ServiceQuotaState.Builder)
    /**
     * @param usageMetrics Information about the measurement.
     * @return builder
     */
    inline def usageMetrics(args: Endofunction[com.pulumi.aws.servicequotas.inputs.ServiceQuotaUsageMetricArgs.Builder]*):
        com.pulumi.aws.servicequotas.inputs.ServiceQuotaState.Builder =
      def argsBuilder = com.pulumi.aws.servicequotas.inputs.ServiceQuotaUsageMetricArgs.builder
      builder.usageMetrics(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.servicequotas.inputs.ServiceQuotaUsageMetricArgs.Builder)
    /**
     * @param metricDimensions The metric dimensions.
     * @return builder
     */
    inline def metricDimensions(args: Endofunction[com.pulumi.aws.servicequotas.inputs.ServiceQuotaUsageMetricMetricDimensionArgs.Builder]*):
        com.pulumi.aws.servicequotas.inputs.ServiceQuotaUsageMetricArgs.Builder =
      def argsBuilder = com.pulumi.aws.servicequotas.inputs.ServiceQuotaUsageMetricMetricDimensionArgs.builder
      builder.metricDimensions(args.map(_(argsBuilder).build)*)
