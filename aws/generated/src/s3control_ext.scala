package jp.ukiba.ko_pulumi
package aws

object s3control_ext:
  extension (builder: com.pulumi.aws.s3control.AccessGrantArgs.Builder)
    /**
     * @param accessGrantsLocationConfiguration See `accessGrantsLocationConfiguration` Block below for more details.
     * @return builder
     */
    inline def accessGrantsLocationConfiguration(args: Endofunction[com.pulumi.aws.s3control.inputs.AccessGrantAccessGrantsLocationConfigurationArgs.Builder]):
        com.pulumi.aws.s3control.AccessGrantArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.AccessGrantAccessGrantsLocationConfigurationArgs.builder
      builder.accessGrantsLocationConfiguration(args(argsBuilder).build)

    /**
     * @param grantee See `grantee` Block below for more details.
     * @return builder
     */
    inline def grantee(args: Endofunction[com.pulumi.aws.s3control.inputs.AccessGrantGranteeArgs.Builder]):
        com.pulumi.aws.s3control.AccessGrantArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.AccessGrantGranteeArgs.builder
      builder.grantee(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.BucketLifecycleConfigurationArgs.Builder)
    /**
     * @param rules Configuration block(s) containing lifecycle rules for the bucket. See `rule` below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationRuleArgs.Builder]*):
        com.pulumi.aws.s3control.BucketLifecycleConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3control.DirectoryBucketAccessPointScopeArgs.Builder)
    /**
     * @param scope . Scope is used to restrict access to specific prefixes, API operations, or a combination of both. To remove the `scope`, set it to `{permissions=[] prefixes=[]}`. The default scope is `{permissions=[] prefixes=[]}`.
     * @return builder
     */
    inline def scope(args: Endofunction[com.pulumi.aws.s3control.inputs.DirectoryBucketAccessPointScopeScopeArgs.Builder]):
        com.pulumi.aws.s3control.DirectoryBucketAccessPointScopeArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.DirectoryBucketAccessPointScopeScopeArgs.builder
      builder.scope(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.MultiRegionAccessPointArgs.Builder)
    /**
     * @param details Configuration block containing details about the Multi-Region Access Point. See `details` Block below.
     * @return builder
     */
    inline def details(args: Endofunction[com.pulumi.aws.s3control.inputs.MultiRegionAccessPointDetailsArgs.Builder]):
        com.pulumi.aws.s3control.MultiRegionAccessPointArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.MultiRegionAccessPointDetailsArgs.builder
      builder.details(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.MultiRegionAccessPointPolicyArgs.Builder)
    /**
     * @param details Configuration block containing details about the policy for the Multi-Region Access Point. See `details` Block below for more details
     * @return builder
     */
    inline def details(args: Endofunction[com.pulumi.aws.s3control.inputs.MultiRegionAccessPointPolicyDetailsArgs.Builder]):
        com.pulumi.aws.s3control.MultiRegionAccessPointPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.MultiRegionAccessPointPolicyDetailsArgs.builder
      builder.details(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.MultiRegionAccessPointRoutesArgs.Builder)
    /**
     * @param routes Route configurations. At least one route must have a `trafficDialPercentage` of `100`. See `route` below.
     * @return builder
     */
    inline def routes(args: Endofunction[com.pulumi.aws.s3control.inputs.MultiRegionAccessPointRoutesRouteArgs.Builder]*):
        com.pulumi.aws.s3control.MultiRegionAccessPointRoutesArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3control.inputs.MultiRegionAccessPointRoutesRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3control.ObjectLambdaAccessPointArgs.Builder)
    /**
     * @param configuration Configuration block containing details about the Object Lambda Access Point. See `configuration` Block below for more details.
     * @return builder
     */
    inline def configuration(args: Endofunction[com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationArgs.Builder]):
        com.pulumi.aws.s3control.ObjectLambdaAccessPointArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.StorageLensConfigurationArgs.Builder)
    /**
     * @param storageLensConfiguration S3 Storage Lens configuration. See `storageLensConfiguration` below for more details.
     * @return builder
     */
    inline def storageLensConfiguration(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationArgs.Builder]):
        com.pulumi.aws.s3control.StorageLensConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationArgs.builder
      builder.storageLensConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.AccessGrantState.Builder)
    /**
     * @param accessGrantsLocationConfiguration See `accessGrantsLocationConfiguration` Block below for more details.
     * @return builder
     */
    inline def accessGrantsLocationConfiguration(args: Endofunction[com.pulumi.aws.s3control.inputs.AccessGrantAccessGrantsLocationConfigurationArgs.Builder]):
        com.pulumi.aws.s3control.inputs.AccessGrantState.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.AccessGrantAccessGrantsLocationConfigurationArgs.builder
      builder.accessGrantsLocationConfiguration(args(argsBuilder).build)

    /**
     * @param grantee See `grantee` Block below for more details.
     * @return builder
     */
    inline def grantee(args: Endofunction[com.pulumi.aws.s3control.inputs.AccessGrantGranteeArgs.Builder]):
        com.pulumi.aws.s3control.inputs.AccessGrantState.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.AccessGrantGranteeArgs.builder
      builder.grantee(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationRuleArgs.Builder)
    /**
     * @param abortIncompleteMultipartUpload Configuration block containing settings for abort incomplete multipart upload. See `abortIncompleteMultipartUpload` below.
     * @return builder
     */
    inline def abortIncompleteMultipartUpload(args: Endofunction[com.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadArgs.Builder]):
        com.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadArgs.builder
      builder.abortIncompleteMultipartUpload(args(argsBuilder).build)

    /**
     * @param expiration Configuration block containing settings for expiration of objects. See `expiration` below.
     * @return builder
     */
    inline def expiration(args: Endofunction[com.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationRuleExpirationArgs.Builder]):
        com.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationRuleExpirationArgs.builder
      builder.expiration(args(argsBuilder).build)

    /**
     * @param filter Configuration block containing settings for filtering. See `filter` below.
     * @return builder
     */
    inline def filter(args: Endofunction[com.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationRuleFilterArgs.Builder]):
        com.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationRuleFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationState.Builder)
    /**
     * @param rules Configuration block(s) containing lifecycle rules for the bucket. See `rule` below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationRuleArgs.Builder]*):
        com.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3control.inputs.DirectoryBucketAccessPointScopeState.Builder)
    /**
     * @param scope . Scope is used to restrict access to specific prefixes, API operations, or a combination of both. To remove the `scope`, set it to `{permissions=[] prefixes=[]}`. The default scope is `{permissions=[] prefixes=[]}`.
     * @return builder
     */
    inline def scope(args: Endofunction[com.pulumi.aws.s3control.inputs.DirectoryBucketAccessPointScopeScopeArgs.Builder]):
        com.pulumi.aws.s3control.inputs.DirectoryBucketAccessPointScopeState.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.DirectoryBucketAccessPointScopeScopeArgs.builder
      builder.scope(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.MultiRegionAccessPointDetailsArgs.Builder)
    /**
     * @param publicAccessBlock Configuration block to manage the `PublicAccessBlock` configuration that you want to apply to this Multi-Region Access Point. You can enable the configuration options in any combination. See `publicAccessBlock` Block below.
     * @return builder
     */
    inline def publicAccessBlock(args: Endofunction[com.pulumi.aws.s3control.inputs.MultiRegionAccessPointDetailsPublicAccessBlockArgs.Builder]):
        com.pulumi.aws.s3control.inputs.MultiRegionAccessPointDetailsArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.MultiRegionAccessPointDetailsPublicAccessBlockArgs.builder
      builder.publicAccessBlock(args(argsBuilder).build)

    /**
     * @param regions Region configuration block to specify the bucket associated with the Multi-Region Access Point. See `region` Block below.
     * @return builder
     */
    inline def regions(args: Endofunction[com.pulumi.aws.s3control.inputs.MultiRegionAccessPointDetailsRegionArgs.Builder]*):
        com.pulumi.aws.s3control.inputs.MultiRegionAccessPointDetailsArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3control.inputs.MultiRegionAccessPointDetailsRegionArgs.builder
      builder.regions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3control.inputs.MultiRegionAccessPointPolicyState.Builder)
    /**
     * @param details Configuration block containing details about the policy for the Multi-Region Access Point. See `details` Block below for more details
     * @return builder
     */
    inline def details(args: Endofunction[com.pulumi.aws.s3control.inputs.MultiRegionAccessPointPolicyDetailsArgs.Builder]):
        com.pulumi.aws.s3control.inputs.MultiRegionAccessPointPolicyState.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.MultiRegionAccessPointPolicyDetailsArgs.builder
      builder.details(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.MultiRegionAccessPointRoutesState.Builder)
    /**
     * @param routes Route configurations. At least one route must have a `trafficDialPercentage` of `100`. See `route` below.
     * @return builder
     */
    inline def routes(args: Endofunction[com.pulumi.aws.s3control.inputs.MultiRegionAccessPointRoutesRouteArgs.Builder]*):
        com.pulumi.aws.s3control.inputs.MultiRegionAccessPointRoutesState.Builder =
      def argsBuilder = com.pulumi.aws.s3control.inputs.MultiRegionAccessPointRoutesRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3control.inputs.MultiRegionAccessPointState.Builder)
    /**
     * @param details Configuration block containing details about the Multi-Region Access Point. See `details` Block below.
     * @return builder
     */
    inline def details(args: Endofunction[com.pulumi.aws.s3control.inputs.MultiRegionAccessPointDetailsArgs.Builder]):
        com.pulumi.aws.s3control.inputs.MultiRegionAccessPointState.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.MultiRegionAccessPointDetailsArgs.builder
      builder.details(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationArgs.Builder)
    /**
     * @param transformationConfigurations List of transformation configurations for the Object Lambda Access Point. See `transformationConfiguration` Block below for more details.
     * @return builder
     */
    inline def transformationConfigurations(args: Endofunction[com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationTransformationConfigurationArgs.Builder]*):
        com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationTransformationConfigurationArgs.builder
      builder.transformationConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationTransformationConfigurationArgs.Builder)
    /**
     * @param contentTransformation Content transformation of an Object Lambda Access Point configuration. See `contentTransformation` Block below for more details.
     * @return builder
     */
    inline def contentTransformation(args: Endofunction[com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationArgs.Builder]):
        com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationTransformationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationArgs.builder
      builder.contentTransformation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationArgs.Builder)
    /**
     * @param awsLambda Configuration for an AWS Lambda function. See `awsLambda` Block below for more details.
     * @return builder
     */
    inline def awsLambda(args: Endofunction[com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambdaArgs.Builder]):
        com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambdaArgs.builder
      builder.awsLambda(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointState.Builder)
    /**
     * @param configuration Configuration block containing details about the Object Lambda Access Point. See `configuration` Block below for more details.
     * @return builder
     */
    inline def configuration(args: Endofunction[com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationArgs.Builder]):
        com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointState.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.StorageLensConfigurationState.Builder)
    /**
     * @param storageLensConfiguration S3 Storage Lens configuration. See `storageLensConfiguration` below for more details.
     * @return builder
     */
    inline def storageLensConfiguration(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationArgs.builder
      builder.storageLensConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelArgs.Builder)
    /**
     * @param activityMetrics S3 Storage Lens activity metrics. See `activityMetrics` below for more details.
     * @return builder
     */
    inline def activityMetrics(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelActivityMetricsArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelActivityMetricsArgs.builder
      builder.activityMetrics(args(argsBuilder).build)

    /**
     * @param advancedCostOptimizationMetrics Advanced cost-optimization metrics for S3 Storage Lens. See `advancedCostOptimizationMetrics` below for more details.
     * @return builder
     */
    inline def advancedCostOptimizationMetrics(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelAdvancedCostOptimizationMetricsArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelAdvancedCostOptimizationMetricsArgs.builder
      builder.advancedCostOptimizationMetrics(args(argsBuilder).build)

    /**
     * @param advancedDataProtectionMetrics Advanced data-protection metrics for S3 Storage Lens. See `advancedDataProtectionMetrics` below for more details.
     * @return builder
     */
    inline def advancedDataProtectionMetrics(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelAdvancedDataProtectionMetricsArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelAdvancedDataProtectionMetricsArgs.builder
      builder.advancedDataProtectionMetrics(args(argsBuilder).build)

    /**
     * @param advancedPerformanceMetrics Advanced performance metrics for S3 Storage Lens. See `advancedPerformanceMetrics` below for more details.
     * @return builder
     */
    inline def advancedPerformanceMetrics(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelAdvancedPerformanceMetricsArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelAdvancedPerformanceMetricsArgs.builder
      builder.advancedPerformanceMetrics(args(argsBuilder).build)

    /**
     * @param bucketLevel S3 Storage Lens bucket-level configuration. See `bucketLevel` below for more details.
     * @return builder
     */
    inline def bucketLevel(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelArgs.builder
      builder.bucketLevel(args(argsBuilder).build)

    /**
     * @param detailedStatusCodeMetrics Detailed status code metrics for S3 Storage Lens. See `detailedStatusCodeMetrics` below for more details.
     * @return builder
     */
    inline def detailedStatusCodeMetrics(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelDetailedStatusCodeMetricsArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelDetailedStatusCodeMetricsArgs.builder
      builder.detailedStatusCodeMetrics(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelArgs.Builder)
    /**
     * @param activityMetrics S3 Storage Lens activity metrics. See `activityMetrics` above for more details.
     * @return builder
     */
    inline def activityMetrics(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelActivityMetricsArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelActivityMetricsArgs.builder
      builder.activityMetrics(args(argsBuilder).build)

    /**
     * @param advancedCostOptimizationMetrics Advanced cost-optimization metrics for S3 Storage Lens. See `advancedCostOptimizationMetrics` above for more details.
     * @return builder
     */
    inline def advancedCostOptimizationMetrics(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelAdvancedCostOptimizationMetricsArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelAdvancedCostOptimizationMetricsArgs.builder
      builder.advancedCostOptimizationMetrics(args(argsBuilder).build)

    /**
     * @param advancedDataProtectionMetrics Advanced data-protection metrics for S3 Storage Lens. See `advancedDataProtectionMetrics` above for more details.
     * @return builder
     */
    inline def advancedDataProtectionMetrics(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelAdvancedDataProtectionMetricsArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelAdvancedDataProtectionMetricsArgs.builder
      builder.advancedDataProtectionMetrics(args(argsBuilder).build)

    /**
     * @param advancedPerformanceMetrics Advanced performance metrics for S3 Storage Lens. See `advancedPerformanceMetrics` above for more details.
     * @return builder
     */
    inline def advancedPerformanceMetrics(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelAdvancedPerformanceMetricsArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelAdvancedPerformanceMetricsArgs.builder
      builder.advancedPerformanceMetrics(args(argsBuilder).build)

    /**
     * @param detailedStatusCodeMetrics Detailed status code metrics for S3 Storage Lens. See `detailedStatusCodeMetrics` above for more details.
     * @return builder
     */
    inline def detailedStatusCodeMetrics(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelDetailedStatusCodeMetricsArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelDetailedStatusCodeMetricsArgs.builder
      builder.detailedStatusCodeMetrics(args(argsBuilder).build)

    /**
     * @param prefixLevel Prefix-level metrics for S3 Storage Lens. See `prefixLevel` below for more details.
     * @return builder
     */
    inline def prefixLevel(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelPrefixLevelArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelPrefixLevelArgs.builder
      builder.prefixLevel(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelPrefixLevelArgs.Builder)
    /**
     * @param storageMetrics Prefix-level storage metrics for S3 Storage Lens. See `storageMetrics` below for more details.
     * @return builder
     */
    inline def storageMetrics(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelPrefixLevelStorageMetricsArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelPrefixLevelArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelPrefixLevelStorageMetricsArgs.builder
      builder.storageMetrics(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelPrefixLevelStorageMetricsArgs.Builder)
    /**
     * @param selectionCriteria Selection criteria. See `selectionCriteria` below for more details.
     * @return builder
     */
    inline def selectionCriteria(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelPrefixLevelStorageMetricsSelectionCriteriaArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelPrefixLevelStorageMetricsArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelPrefixLevelStorageMetricsSelectionCriteriaArgs.builder
      builder.selectionCriteria(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationArgs.Builder)
    /**
     * @param accountLevel Account-level configurations of the S3 Storage Lens configuration. See `accountLevel` below for more details.
     * @return builder
     */
    inline def accountLevel(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelArgs.builder
      builder.accountLevel(args(argsBuilder).build)

    /**
     * @param awsOrg Amazon Web Services organization for the S3 Storage Lens configuration. See `awsOrg` below for more details.
     * @return builder
     */
    inline def awsOrg(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAwsOrgArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAwsOrgArgs.builder
      builder.awsOrg(args(argsBuilder).build)

    /**
     * @param dataExport Properties of S3 Storage Lens metrics export including the destination, schema and format. See `dataExport` below for more details.
     * @return builder
     */
    inline def dataExport(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportArgs.builder
      builder.dataExport(args(argsBuilder).build)

    /**
     * @param exclude What is excluded in this configuration. Conflicts with `include`. See `exclude` below for more details.
     * @return builder
     */
    inline def exclude(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExcludeArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExcludeArgs.builder
      builder.exclude(args(argsBuilder).build)

    /**
     * @param expandedPrefixesDataExport Configuration for the S3 Storage Lens expanded prefix metrics report. Unlike the default Storage Lens metrics report, the enhanced prefix metrics report includes all S3 Storage Lens storage and activity data related to the full list of prefixes in your Storage Lens configuration. See `expandedPrefixesDataExport` below for more details.
     * @return builder
     */
    inline def expandedPrefixesDataExport(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportArgs.builder
      builder.expandedPrefixesDataExport(args(argsBuilder).build)

    /**
     * @param include What is included in this configuration. Conflicts with `exclude`. See `include` below for more details.
     * @return builder
     */
    inline def include(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationIncludeArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationIncludeArgs.builder
      builder.include(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportArgs.Builder)
    /**
     * @param cloudWatchMetrics Amazon CloudWatch publishing for S3 Storage Lens metrics. See `cloudWatchMetrics` below for more details.
     * @return builder
     */
    inline def cloudWatchMetrics(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportCloudWatchMetricsArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportCloudWatchMetricsArgs.builder
      builder.cloudWatchMetrics(args(argsBuilder).build)

    /**
     * @param s3BucketDestination Bucket where the S3 Storage Lens metrics export will be located. See `s3BucketDestination` below for more details.
     * @return builder
     */
    inline def s3BucketDestination(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportS3BucketDestinationArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportS3BucketDestinationArgs.builder
      builder.s3BucketDestination(args(argsBuilder).build)

    /**
     * @param storageLensTableDestination S3 table bucket where the S3 Storage Lens metrics export will be located. See `storageLensTableDestination` below for more details.
     * @return builder
     */
    inline def storageLensTableDestination(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportStorageLensTableDestinationArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportStorageLensTableDestinationArgs.builder
      builder.storageLensTableDestination(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportS3BucketDestinationArgs.Builder)
    /**
     * @param encryption Encryption of the metrics exports in this bucket. See `encryption` below for more details.
     * @return builder
     */
    inline def encryption(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportS3BucketDestinationEncryptionArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportS3BucketDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportS3BucketDestinationEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportS3BucketDestinationEncryptionArgs.Builder)
    /**
     * @param sseKms SSE-KMS encryption. See `sseKms` below for more details.
     * @return builder
     */
    inline def sseKms(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportS3BucketDestinationEncryptionSseKmsArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportS3BucketDestinationEncryptionArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportS3BucketDestinationEncryptionSseKmsArgs.builder
      builder.sseKms(args(argsBuilder).build)

    /**
     * @param sseS3s SSE-S3 encryption. An empty configuration block `{}` should be used.
     * @return builder
     */
    inline def sseS3s(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportS3BucketDestinationEncryptionSseS3Args.Builder]*):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportS3BucketDestinationEncryptionArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportS3BucketDestinationEncryptionSseS3Args.builder
      builder.sseS3s(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportStorageLensTableDestinationArgs.Builder)
    /**
     * @param encryption Encryption of the metrics exports in this S3 tables bucket. See `encryption` below for more details.
     * @return builder
     */
    inline def encryption(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportStorageLensTableDestinationEncryptionArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportStorageLensTableDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportStorageLensTableDestinationEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportStorageLensTableDestinationEncryptionArgs.Builder)
    /**
     * @param sseKms SSE-KMS encryption. See `sseKms` below for more details.
     * @return builder
     */
    inline def sseKms(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportStorageLensTableDestinationEncryptionSseKmsArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportStorageLensTableDestinationEncryptionArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportStorageLensTableDestinationEncryptionSseKmsArgs.builder
      builder.sseKms(args(argsBuilder).build)

    /**
     * @param sseS3s SSE-S3 encryption. An empty configuration block `{}` should be used.
     * @return builder
     */
    inline def sseS3s(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportStorageLensTableDestinationEncryptionSseS3Args.Builder]*):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportStorageLensTableDestinationEncryptionArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportStorageLensTableDestinationEncryptionSseS3Args.builder
      builder.sseS3s(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportArgs.Builder)
    /**
     * @param s3BucketDestination Bucket where the S3 Storage Lens expanded prefix metrics export will be located. See `s3BucketDestination` below for more details.
     * @return builder
     */
    inline def s3BucketDestination(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportS3BucketDestinationArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportS3BucketDestinationArgs.builder
      builder.s3BucketDestination(args(argsBuilder).build)

    /**
     * @param storageLensTableDestination S3 table bucket where the S3 Storage Lens expanded prefix metrics export will be located. See `storageLensTableDestination` below for more details.
     * @return builder
     */
    inline def storageLensTableDestination(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportStorageLensTableDestinationArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportStorageLensTableDestinationArgs.builder
      builder.storageLensTableDestination(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportS3BucketDestinationArgs.Builder)
    /**
     * @param encryption Encryption of the metrics exports in this bucket. See `encryption` below for more details.
     * @return builder
     */
    inline def encryption(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportS3BucketDestinationEncryptionArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportS3BucketDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportS3BucketDestinationEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportS3BucketDestinationEncryptionArgs.Builder)
    /**
     * @param sseKms SSE-KMS encryption. See `sseKms` below for more details.
     * @return builder
     */
    inline def sseKms(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportS3BucketDestinationEncryptionSseKmsArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportS3BucketDestinationEncryptionArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportS3BucketDestinationEncryptionSseKmsArgs.builder
      builder.sseKms(args(argsBuilder).build)

    /**
     * @param sseS3s SSE-S3 encryption. An empty configuration block `{}` should be used.
     * @return builder
     */
    inline def sseS3s(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportS3BucketDestinationEncryptionSseS3Args.Builder]*):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportS3BucketDestinationEncryptionArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportS3BucketDestinationEncryptionSseS3Args.builder
      builder.sseS3s(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportStorageLensTableDestinationArgs.Builder)
    /**
     * @param encryption Encryption of the metrics exports in this S3 tables bucket. See `encryption` below for more details.
     * @return builder
     */
    inline def encryption(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportStorageLensTableDestinationEncryptionArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportStorageLensTableDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportStorageLensTableDestinationEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportStorageLensTableDestinationEncryptionArgs.Builder)
    /**
     * @param sseKms SSE-KMS encryption. See `sseKms` below for more details.
     * @return builder
     */
    inline def sseKms(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportStorageLensTableDestinationEncryptionSseKmsArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportStorageLensTableDestinationEncryptionArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportStorageLensTableDestinationEncryptionSseKmsArgs.builder
      builder.sseKms(args(argsBuilder).build)

    /**
     * @param sseS3s SSE-S3 encryption. An empty configuration block `{}` should be used.
     * @return builder
     */
    inline def sseS3s(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportStorageLensTableDestinationEncryptionSseS3Args.Builder]*):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportStorageLensTableDestinationEncryptionArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportStorageLensTableDestinationEncryptionSseS3Args.builder
      builder.sseS3s(args.map(_(argsBuilder).build)*)
