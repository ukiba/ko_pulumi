package jp.ukiba.ko_pulumi
package gcp

object logging_ext:
  extension (builder: com.pulumi.gcp.logging.BillingAccountBucketConfigArgs.Builder)
    /**
     * @param cmekSettings The CMEK settings of the log bucket. If present, new log entries written to this log bucket are encrypted using the CMEK key provided in this configuration. If a log bucket has CMEK settings, the CMEK settings cannot be disabled later by updating the log bucket. Changing the KMS key is allowed.
     * @return builder
     */
    inline def cmekSettings(args: Endofunction[com.pulumi.gcp.logging.inputs.BillingAccountBucketConfigCmekSettingsArgs.Builder]):
        com.pulumi.gcp.logging.BillingAccountBucketConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.BillingAccountBucketConfigCmekSettingsArgs.builder
      builder.cmekSettings(args(argsBuilder).build)

    /**
     * @param indexConfigs A list of indexed fields and related configuration data. Structure is documented below.
     * @return builder
     */
    inline def indexConfigs(args: Endofunction[com.pulumi.gcp.logging.inputs.BillingAccountBucketConfigIndexConfigArgs.Builder]*):
        com.pulumi.gcp.logging.BillingAccountBucketConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.BillingAccountBucketConfigIndexConfigArgs.builder
      builder.indexConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.logging.BillingAccountSinkArgs.Builder)
    /**
     * @param bigqueryOptions Options that affect sinks exporting data to BigQuery. Structure documented below.
     * @return builder
     */
    inline def bigqueryOptions(args: Endofunction[com.pulumi.gcp.logging.inputs.BillingAccountSinkBigqueryOptionsArgs.Builder]):
        com.pulumi.gcp.logging.BillingAccountSinkArgs.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.BillingAccountSinkBigqueryOptionsArgs.builder
      builder.bigqueryOptions(args(argsBuilder).build)

    /**
     * @param exclusions Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both `filter` and one of `exclusions.filter`, it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
     * @return builder
     */
    inline def exclusions(args: Endofunction[com.pulumi.gcp.logging.inputs.BillingAccountSinkExclusionArgs.Builder]*):
        com.pulumi.gcp.logging.BillingAccountSinkArgs.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.BillingAccountSinkExclusionArgs.builder
      builder.exclusions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.logging.FolderBucketConfigArgs.Builder)
    /**
     * @param cmekSettings The CMEK settings of the log bucket. If present, new log entries written to this log bucket are encrypted using the CMEK key provided in this configuration. If a log bucket has CMEK settings, the CMEK settings cannot be disabled later by updating the log bucket. Changing the KMS key is allowed.
     * @return builder
     */
    inline def cmekSettings(args: Endofunction[com.pulumi.gcp.logging.inputs.FolderBucketConfigCmekSettingsArgs.Builder]):
        com.pulumi.gcp.logging.FolderBucketConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.FolderBucketConfigCmekSettingsArgs.builder
      builder.cmekSettings(args(argsBuilder).build)

    /**
     * @param indexConfigs A list of indexed fields and related configuration data. Structure is documented below.
     * @return builder
     */
    inline def indexConfigs(args: Endofunction[com.pulumi.gcp.logging.inputs.FolderBucketConfigIndexConfigArgs.Builder]*):
        com.pulumi.gcp.logging.FolderBucketConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.FolderBucketConfigIndexConfigArgs.builder
      builder.indexConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.logging.FolderSinkArgs.Builder)
    /**
     * @param bigqueryOptions Options that affect sinks exporting data to BigQuery. Structure documented below.
     * @return builder
     */
    inline def bigqueryOptions(args: Endofunction[com.pulumi.gcp.logging.inputs.FolderSinkBigqueryOptionsArgs.Builder]):
        com.pulumi.gcp.logging.FolderSinkArgs.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.FolderSinkBigqueryOptionsArgs.builder
      builder.bigqueryOptions(args(argsBuilder).build)

    /**
     * @param exclusions Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both `filter` and one of `exclusions.filter`, it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
     * @return builder
     */
    inline def exclusions(args: Endofunction[com.pulumi.gcp.logging.inputs.FolderSinkExclusionArgs.Builder]*):
        com.pulumi.gcp.logging.FolderSinkArgs.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.FolderSinkExclusionArgs.builder
      builder.exclusions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.logging.LinkedDatasetArgs.Builder)
    /**
     * @param bigqueryDatasets The information of a BigQuery Dataset. When a link is created, a BigQuery dataset is created along
     * with it, in the same project as the LogBucket it&#39;s linked to. This dataset will also have BigQuery
     * Views corresponding to the LogViews in the bucket.
     * Structure is documented below.
     * @return builder
     */
    inline def bigqueryDatasets(args: Endofunction[com.pulumi.gcp.logging.inputs.LinkedDatasetBigqueryDatasetArgs.Builder]*):
        com.pulumi.gcp.logging.LinkedDatasetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.LinkedDatasetBigqueryDatasetArgs.builder
      builder.bigqueryDatasets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.logging.LogViewIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.logging.inputs.LogViewIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.logging.LogViewIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.LogViewIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.logging.LogViewIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.logging.inputs.LogViewIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.logging.LogViewIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.LogViewIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.logging.MetricArgs.Builder)
    /**
     * @param bucketOptions The bucketOptions are required when the logs-based metric is using a DISTRIBUTION value type and it
     * describes the bucket boundaries used to create a histogram of the extracted values.
     * Structure is documented below.
     * @return builder
     */
    inline def bucketOptions(args: Endofunction[com.pulumi.gcp.logging.inputs.MetricBucketOptionsArgs.Builder]):
        com.pulumi.gcp.logging.MetricArgs.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.MetricBucketOptionsArgs.builder
      builder.bucketOptions(args(argsBuilder).build)

    /**
     * @param metricDescriptor The optional metric descriptor associated with the logs-based metric.
     * If unspecified, it uses a default metric descriptor with a DELTA metric kind,
     * INT64 value type, with no labels and a unit of &#34;1&#34;. Such a metric counts the
     * number of log entries matching the filter expression.
     * Structure is documented below.
     * @return builder
     */
    inline def metricDescriptor(args: Endofunction[com.pulumi.gcp.logging.inputs.MetricMetricDescriptorArgs.Builder]):
        com.pulumi.gcp.logging.MetricArgs.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.MetricMetricDescriptorArgs.builder
      builder.metricDescriptor(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.logging.OrganizationBucketConfigArgs.Builder)
    /**
     * @param cmekSettings The CMEK settings of the log bucket. If present, new log entries written to this log bucket are encrypted using the CMEK key provided in this configuration. If a log bucket has CMEK settings, the CMEK settings cannot be disabled later by updating the log bucket. Changing the KMS key is allowed.
     * @return builder
     */
    inline def cmekSettings(args: Endofunction[com.pulumi.gcp.logging.inputs.OrganizationBucketConfigCmekSettingsArgs.Builder]):
        com.pulumi.gcp.logging.OrganizationBucketConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.OrganizationBucketConfigCmekSettingsArgs.builder
      builder.cmekSettings(args(argsBuilder).build)

    /**
     * @param indexConfigs A list of indexed fields and related configuration data. Structure is documented below.
     * @return builder
     */
    inline def indexConfigs(args: Endofunction[com.pulumi.gcp.logging.inputs.OrganizationBucketConfigIndexConfigArgs.Builder]*):
        com.pulumi.gcp.logging.OrganizationBucketConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.OrganizationBucketConfigIndexConfigArgs.builder
      builder.indexConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.logging.OrganizationSinkArgs.Builder)
    /**
     * @param bigqueryOptions Options that affect sinks exporting data to BigQuery. Structure documented below.
     * @return builder
     */
    inline def bigqueryOptions(args: Endofunction[com.pulumi.gcp.logging.inputs.OrganizationSinkBigqueryOptionsArgs.Builder]):
        com.pulumi.gcp.logging.OrganizationSinkArgs.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.OrganizationSinkBigqueryOptionsArgs.builder
      builder.bigqueryOptions(args(argsBuilder).build)

    /**
     * @param exclusions Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both `filter` and one of `exclusions.filter`, it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
     * @return builder
     */
    inline def exclusions(args: Endofunction[com.pulumi.gcp.logging.inputs.OrganizationSinkExclusionArgs.Builder]*):
        com.pulumi.gcp.logging.OrganizationSinkArgs.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.OrganizationSinkExclusionArgs.builder
      builder.exclusions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.logging.ProjectBucketConfigArgs.Builder)
    /**
     * @param cmekSettings The CMEK settings of the log bucket. If present, new log entries written to this log bucket are encrypted using the CMEK key provided in this configuration. If a log bucket has CMEK settings, the CMEK settings cannot be disabled later by updating the log bucket. Changing the KMS key is allowed. Structure is documented below.
     * @return builder
     */
    inline def cmekSettings(args: Endofunction[com.pulumi.gcp.logging.inputs.ProjectBucketConfigCmekSettingsArgs.Builder]):
        com.pulumi.gcp.logging.ProjectBucketConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.ProjectBucketConfigCmekSettingsArgs.builder
      builder.cmekSettings(args(argsBuilder).build)

    /**
     * @param indexConfigs A list of indexed fields and related configuration data. Structure is documented below.
     * @return builder
     */
    inline def indexConfigs(args: Endofunction[com.pulumi.gcp.logging.inputs.ProjectBucketConfigIndexConfigArgs.Builder]*):
        com.pulumi.gcp.logging.ProjectBucketConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.ProjectBucketConfigIndexConfigArgs.builder
      builder.indexConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.logging.ProjectSinkArgs.Builder)
    /**
     * @param bigqueryOptions Options that affect sinks exporting data to BigQuery. Structure documented below.
     * @return builder
     */
    inline def bigqueryOptions(args: Endofunction[com.pulumi.gcp.logging.inputs.ProjectSinkBigqueryOptionsArgs.Builder]):
        com.pulumi.gcp.logging.ProjectSinkArgs.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.ProjectSinkBigqueryOptionsArgs.builder
      builder.bigqueryOptions(args(argsBuilder).build)

    /**
     * @param exclusions Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both `filter` and one of `exclusions.filter`, it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
     * @return builder
     */
    inline def exclusions(args: Endofunction[com.pulumi.gcp.logging.inputs.ProjectSinkExclusionArgs.Builder]*):
        com.pulumi.gcp.logging.ProjectSinkArgs.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.ProjectSinkExclusionArgs.builder
      builder.exclusions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.logging.SavedQueryArgs.Builder)
    /**
     * @param loggingQuery The contents of the saved query.
     * Structure is documented below.
     * @return builder
     */
    inline def loggingQuery(args: Endofunction[com.pulumi.gcp.logging.inputs.SavedQueryLoggingQueryArgs.Builder]):
        com.pulumi.gcp.logging.SavedQueryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.SavedQueryLoggingQueryArgs.builder
      builder.loggingQuery(args(argsBuilder).build)

    /**
     * @param opsAnalyticsQuery The contents of the saved query.
     * Structure is documented below.
     * @return builder
     */
    inline def opsAnalyticsQuery(args: Endofunction[com.pulumi.gcp.logging.inputs.SavedQueryOpsAnalyticsQueryArgs.Builder]):
        com.pulumi.gcp.logging.SavedQueryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.SavedQueryOpsAnalyticsQueryArgs.builder
      builder.opsAnalyticsQuery(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.logging.inputs.BillingAccountBucketConfigState.Builder)
    /**
     * @param cmekSettings The CMEK settings of the log bucket. If present, new log entries written to this log bucket are encrypted using the CMEK key provided in this configuration. If a log bucket has CMEK settings, the CMEK settings cannot be disabled later by updating the log bucket. Changing the KMS key is allowed.
     * @return builder
     */
    inline def cmekSettings(args: Endofunction[com.pulumi.gcp.logging.inputs.BillingAccountBucketConfigCmekSettingsArgs.Builder]):
        com.pulumi.gcp.logging.inputs.BillingAccountBucketConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.BillingAccountBucketConfigCmekSettingsArgs.builder
      builder.cmekSettings(args(argsBuilder).build)

    /**
     * @param indexConfigs A list of indexed fields and related configuration data. Structure is documented below.
     * @return builder
     */
    inline def indexConfigs(args: Endofunction[com.pulumi.gcp.logging.inputs.BillingAccountBucketConfigIndexConfigArgs.Builder]*):
        com.pulumi.gcp.logging.inputs.BillingAccountBucketConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.BillingAccountBucketConfigIndexConfigArgs.builder
      builder.indexConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.logging.inputs.BillingAccountSinkState.Builder)
    /**
     * @param bigqueryOptions Options that affect sinks exporting data to BigQuery. Structure documented below.
     * @return builder
     */
    inline def bigqueryOptions(args: Endofunction[com.pulumi.gcp.logging.inputs.BillingAccountSinkBigqueryOptionsArgs.Builder]):
        com.pulumi.gcp.logging.inputs.BillingAccountSinkState.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.BillingAccountSinkBigqueryOptionsArgs.builder
      builder.bigqueryOptions(args(argsBuilder).build)

    /**
     * @param exclusions Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both `filter` and one of `exclusions.filter`, it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
     * @return builder
     */
    inline def exclusions(args: Endofunction[com.pulumi.gcp.logging.inputs.BillingAccountSinkExclusionArgs.Builder]*):
        com.pulumi.gcp.logging.inputs.BillingAccountSinkState.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.BillingAccountSinkExclusionArgs.builder
      builder.exclusions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.logging.inputs.FolderBucketConfigState.Builder)
    /**
     * @param cmekSettings The CMEK settings of the log bucket. If present, new log entries written to this log bucket are encrypted using the CMEK key provided in this configuration. If a log bucket has CMEK settings, the CMEK settings cannot be disabled later by updating the log bucket. Changing the KMS key is allowed.
     * @return builder
     */
    inline def cmekSettings(args: Endofunction[com.pulumi.gcp.logging.inputs.FolderBucketConfigCmekSettingsArgs.Builder]):
        com.pulumi.gcp.logging.inputs.FolderBucketConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.FolderBucketConfigCmekSettingsArgs.builder
      builder.cmekSettings(args(argsBuilder).build)

    /**
     * @param indexConfigs A list of indexed fields and related configuration data. Structure is documented below.
     * @return builder
     */
    inline def indexConfigs(args: Endofunction[com.pulumi.gcp.logging.inputs.FolderBucketConfigIndexConfigArgs.Builder]*):
        com.pulumi.gcp.logging.inputs.FolderBucketConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.FolderBucketConfigIndexConfigArgs.builder
      builder.indexConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.logging.inputs.FolderSinkState.Builder)
    /**
     * @param bigqueryOptions Options that affect sinks exporting data to BigQuery. Structure documented below.
     * @return builder
     */
    inline def bigqueryOptions(args: Endofunction[com.pulumi.gcp.logging.inputs.FolderSinkBigqueryOptionsArgs.Builder]):
        com.pulumi.gcp.logging.inputs.FolderSinkState.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.FolderSinkBigqueryOptionsArgs.builder
      builder.bigqueryOptions(args(argsBuilder).build)

    /**
     * @param exclusions Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both `filter` and one of `exclusions.filter`, it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
     * @return builder
     */
    inline def exclusions(args: Endofunction[com.pulumi.gcp.logging.inputs.FolderSinkExclusionArgs.Builder]*):
        com.pulumi.gcp.logging.inputs.FolderSinkState.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.FolderSinkExclusionArgs.builder
      builder.exclusions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.logging.inputs.LinkedDatasetState.Builder)
    /**
     * @param bigqueryDatasets The information of a BigQuery Dataset. When a link is created, a BigQuery dataset is created along
     * with it, in the same project as the LogBucket it&#39;s linked to. This dataset will also have BigQuery
     * Views corresponding to the LogViews in the bucket.
     * Structure is documented below.
     * @return builder
     */
    inline def bigqueryDatasets(args: Endofunction[com.pulumi.gcp.logging.inputs.LinkedDatasetBigqueryDatasetArgs.Builder]*):
        com.pulumi.gcp.logging.inputs.LinkedDatasetState.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.LinkedDatasetBigqueryDatasetArgs.builder
      builder.bigqueryDatasets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.logging.inputs.LogViewIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.logging.inputs.LogViewIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.logging.inputs.LogViewIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.LogViewIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.logging.inputs.LogViewIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.logging.inputs.LogViewIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.logging.inputs.LogViewIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.LogViewIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.logging.inputs.MetricBucketOptionsArgs.Builder)
    /**
     * @param explicitBuckets Specifies a set of buckets with arbitrary widths.
     * Structure is documented below.
     * @return builder
     */
    inline def explicitBuckets(args: Endofunction[com.pulumi.gcp.logging.inputs.MetricBucketOptionsExplicitBucketsArgs.Builder]):
        com.pulumi.gcp.logging.inputs.MetricBucketOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.MetricBucketOptionsExplicitBucketsArgs.builder
      builder.explicitBuckets(args(argsBuilder).build)

    /**
     * @param exponentialBuckets Specifies an exponential sequence of buckets that have a width that is proportional to the value of
     * the lower bound. Each bucket represents a constant relative uncertainty on a specific value in the bucket.
     * Structure is documented below.
     * @return builder
     */
    inline def exponentialBuckets(args: Endofunction[com.pulumi.gcp.logging.inputs.MetricBucketOptionsExponentialBucketsArgs.Builder]):
        com.pulumi.gcp.logging.inputs.MetricBucketOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.MetricBucketOptionsExponentialBucketsArgs.builder
      builder.exponentialBuckets(args(argsBuilder).build)

    /**
     * @param linearBuckets Specifies a linear sequence of buckets that all have the same width (except overflow and underflow).
     * Each bucket represents a constant absolute uncertainty on the specific value in the bucket.
     * Structure is documented below.
     * @return builder
     */
    inline def linearBuckets(args: Endofunction[com.pulumi.gcp.logging.inputs.MetricBucketOptionsLinearBucketsArgs.Builder]):
        com.pulumi.gcp.logging.inputs.MetricBucketOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.MetricBucketOptionsLinearBucketsArgs.builder
      builder.linearBuckets(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.logging.inputs.MetricMetricDescriptorArgs.Builder)
    /**
     * @param labels The set of labels that can be used to describe a specific instance of this metric type. For
     * example, the appengine.googleapis.com/http/server/response_latencies metric type has a label
     * for the HTTP response code, response_code, so you can look at latencies for successful responses
     * or just for responses that failed.
     * Structure is documented below.
     * @return builder
     */
    inline def labels(args: Endofunction[com.pulumi.gcp.logging.inputs.MetricMetricDescriptorLabelArgs.Builder]*):
        com.pulumi.gcp.logging.inputs.MetricMetricDescriptorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.MetricMetricDescriptorLabelArgs.builder
      builder.labels(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.logging.inputs.MetricState.Builder)
    /**
     * @param bucketOptions The bucketOptions are required when the logs-based metric is using a DISTRIBUTION value type and it
     * describes the bucket boundaries used to create a histogram of the extracted values.
     * Structure is documented below.
     * @return builder
     */
    inline def bucketOptions(args: Endofunction[com.pulumi.gcp.logging.inputs.MetricBucketOptionsArgs.Builder]):
        com.pulumi.gcp.logging.inputs.MetricState.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.MetricBucketOptionsArgs.builder
      builder.bucketOptions(args(argsBuilder).build)

    /**
     * @param metricDescriptor The optional metric descriptor associated with the logs-based metric.
     * If unspecified, it uses a default metric descriptor with a DELTA metric kind,
     * INT64 value type, with no labels and a unit of &#34;1&#34;. Such a metric counts the
     * number of log entries matching the filter expression.
     * Structure is documented below.
     * @return builder
     */
    inline def metricDescriptor(args: Endofunction[com.pulumi.gcp.logging.inputs.MetricMetricDescriptorArgs.Builder]):
        com.pulumi.gcp.logging.inputs.MetricState.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.MetricMetricDescriptorArgs.builder
      builder.metricDescriptor(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.logging.inputs.OrganizationBucketConfigState.Builder)
    /**
     * @param cmekSettings The CMEK settings of the log bucket. If present, new log entries written to this log bucket are encrypted using the CMEK key provided in this configuration. If a log bucket has CMEK settings, the CMEK settings cannot be disabled later by updating the log bucket. Changing the KMS key is allowed.
     * @return builder
     */
    inline def cmekSettings(args: Endofunction[com.pulumi.gcp.logging.inputs.OrganizationBucketConfigCmekSettingsArgs.Builder]):
        com.pulumi.gcp.logging.inputs.OrganizationBucketConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.OrganizationBucketConfigCmekSettingsArgs.builder
      builder.cmekSettings(args(argsBuilder).build)

    /**
     * @param indexConfigs A list of indexed fields and related configuration data. Structure is documented below.
     * @return builder
     */
    inline def indexConfigs(args: Endofunction[com.pulumi.gcp.logging.inputs.OrganizationBucketConfigIndexConfigArgs.Builder]*):
        com.pulumi.gcp.logging.inputs.OrganizationBucketConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.OrganizationBucketConfigIndexConfigArgs.builder
      builder.indexConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.logging.inputs.OrganizationSinkState.Builder)
    /**
     * @param bigqueryOptions Options that affect sinks exporting data to BigQuery. Structure documented below.
     * @return builder
     */
    inline def bigqueryOptions(args: Endofunction[com.pulumi.gcp.logging.inputs.OrganizationSinkBigqueryOptionsArgs.Builder]):
        com.pulumi.gcp.logging.inputs.OrganizationSinkState.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.OrganizationSinkBigqueryOptionsArgs.builder
      builder.bigqueryOptions(args(argsBuilder).build)

    /**
     * @param exclusions Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both `filter` and one of `exclusions.filter`, it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
     * @return builder
     */
    inline def exclusions(args: Endofunction[com.pulumi.gcp.logging.inputs.OrganizationSinkExclusionArgs.Builder]*):
        com.pulumi.gcp.logging.inputs.OrganizationSinkState.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.OrganizationSinkExclusionArgs.builder
      builder.exclusions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.logging.inputs.ProjectBucketConfigState.Builder)
    /**
     * @param cmekSettings The CMEK settings of the log bucket. If present, new log entries written to this log bucket are encrypted using the CMEK key provided in this configuration. If a log bucket has CMEK settings, the CMEK settings cannot be disabled later by updating the log bucket. Changing the KMS key is allowed. Structure is documented below.
     * @return builder
     */
    inline def cmekSettings(args: Endofunction[com.pulumi.gcp.logging.inputs.ProjectBucketConfigCmekSettingsArgs.Builder]):
        com.pulumi.gcp.logging.inputs.ProjectBucketConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.ProjectBucketConfigCmekSettingsArgs.builder
      builder.cmekSettings(args(argsBuilder).build)

    /**
     * @param indexConfigs A list of indexed fields and related configuration data. Structure is documented below.
     * @return builder
     */
    inline def indexConfigs(args: Endofunction[com.pulumi.gcp.logging.inputs.ProjectBucketConfigIndexConfigArgs.Builder]*):
        com.pulumi.gcp.logging.inputs.ProjectBucketConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.ProjectBucketConfigIndexConfigArgs.builder
      builder.indexConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.logging.inputs.ProjectSinkState.Builder)
    /**
     * @param bigqueryOptions Options that affect sinks exporting data to BigQuery. Structure documented below.
     * @return builder
     */
    inline def bigqueryOptions(args: Endofunction[com.pulumi.gcp.logging.inputs.ProjectSinkBigqueryOptionsArgs.Builder]):
        com.pulumi.gcp.logging.inputs.ProjectSinkState.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.ProjectSinkBigqueryOptionsArgs.builder
      builder.bigqueryOptions(args(argsBuilder).build)

    /**
     * @param exclusions Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both `filter` and one of `exclusions.filter`, it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
     * @return builder
     */
    inline def exclusions(args: Endofunction[com.pulumi.gcp.logging.inputs.ProjectSinkExclusionArgs.Builder]*):
        com.pulumi.gcp.logging.inputs.ProjectSinkState.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.ProjectSinkExclusionArgs.builder
      builder.exclusions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.logging.inputs.SavedQueryLoggingQueryArgs.Builder)
    /**
     * @param summaryFields The names of the fields to display in the summary.
     * Structure is documented below.
     * @return builder
     */
    inline def summaryFields(args: Endofunction[com.pulumi.gcp.logging.inputs.SavedQueryLoggingQuerySummaryFieldArgs.Builder]*):
        com.pulumi.gcp.logging.inputs.SavedQueryLoggingQueryArgs.Builder =
      def argsBuilder = com.pulumi.gcp.logging.inputs.SavedQueryLoggingQuerySummaryFieldArgs.builder
      builder.summaryFields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.logging.inputs.SavedQueryState.Builder)
    /**
     * @param loggingQuery The contents of the saved query.
     * Structure is documented below.
     * @return builder
     */
    inline def loggingQuery(args: Endofunction[com.pulumi.gcp.logging.inputs.SavedQueryLoggingQueryArgs.Builder]):
        com.pulumi.gcp.logging.inputs.SavedQueryState.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.SavedQueryLoggingQueryArgs.builder
      builder.loggingQuery(args(argsBuilder).build)

    /**
     * @param opsAnalyticsQuery The contents of the saved query.
     * Structure is documented below.
     * @return builder
     */
    inline def opsAnalyticsQuery(args: Endofunction[com.pulumi.gcp.logging.inputs.SavedQueryOpsAnalyticsQueryArgs.Builder]):
        com.pulumi.gcp.logging.inputs.SavedQueryState.Builder =
      val argsBuilder = com.pulumi.gcp.logging.inputs.SavedQueryOpsAnalyticsQueryArgs.builder
      builder.opsAnalyticsQuery(args(argsBuilder).build)
