package jp.ukiba.ko_pulumi
package aws

object s3_ext:
  extension (builder: com.pulumi.aws.s3.AccessPointArgs.Builder)
    /**
     * @param publicAccessBlockConfiguration Configuration block to manage the `PublicAccessBlock` configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration options in any combination. Detailed below.
     * @return builder
     */
    inline def publicAccessBlockConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.AccessPointPublicAccessBlockConfigurationArgs.Builder]):
        com.pulumi.aws.s3.AccessPointArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.AccessPointPublicAccessBlockConfigurationArgs.builder
      builder.publicAccessBlockConfiguration(args(argsBuilder).build)

    /**
     * @param vpcConfiguration Configuration block to restrict access to this access point to requests from the specified VPC. Required for S3 on Outposts. Detailed below.
     * @return builder
     */
    inline def vpcConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.AccessPointVpcConfigurationArgs.Builder]):
        com.pulumi.aws.s3.AccessPointArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.AccessPointVpcConfigurationArgs.builder
      builder.vpcConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.AnalyticsConfigurationArgs.Builder)
    /**
     * @param filter Object filtering that accepts a prefix, tags, or a logical AND of prefix and tags (documented below).
     * @return builder
     */
    inline def filter(args: Endofunction[com.pulumi.aws.s3.inputs.AnalyticsConfigurationFilterArgs.Builder]):
        com.pulumi.aws.s3.AnalyticsConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.AnalyticsConfigurationFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param storageClassAnalysis Configuration for the analytics data export (documented below).
     * @return builder
     */
    inline def storageClassAnalysis(args: Endofunction[com.pulumi.aws.s3.inputs.AnalyticsConfigurationStorageClassAnalysisArgs.Builder]):
        com.pulumi.aws.s3.AnalyticsConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.AnalyticsConfigurationStorageClassAnalysisArgs.builder
      builder.storageClassAnalysis(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.BucketAbacArgs.Builder)
    /**
     * @param abacStatus ABAC status configuration. See `abacStatus` Block for details.
     * @return builder
     */
    inline def abacStatus(args: Endofunction[com.pulumi.aws.s3.inputs.BucketAbacAbacStatusArgs.Builder]):
        com.pulumi.aws.s3.BucketAbacArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketAbacAbacStatusArgs.builder
      builder.abacStatus(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.BucketAclArgs.Builder)
    /**
     * @param accessControlPolicy Configuration block that sets the ACL permissions for an object per grantee. See below.
     * @return builder
     */
    inline def accessControlPolicy(args: Endofunction[com.pulumi.aws.s3.inputs.BucketAclAccessControlPolicyArgs.Builder]):
        com.pulumi.aws.s3.BucketAclArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketAclAccessControlPolicyArgs.builder
      builder.accessControlPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.BucketAclV2Args.Builder)
    /**
     * @param accessControlPolicy Configuration block that sets the ACL permissions for an object per grantee. See below.
     * @return builder
     */
    inline def accessControlPolicy(args: Endofunction[com.pulumi.aws.s3.inputs.BucketAclV2AccessControlPolicyArgs.Builder]):
        com.pulumi.aws.s3.BucketAclV2Args.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketAclV2AccessControlPolicyArgs.builder
      builder.accessControlPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.BucketArgs.Builder)
    /**
     * @param corsRules Rule of [Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html). See `corsRule` Block below for details. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketCorsConfiguration` instead.
     * @return builder
     * @deprecated cors_rule is deprecated. Use the aws.s3.BucketCorsConfiguration resource instead.
     */
    @deprecated("cors_rule is deprecated. Use the aws.s3.BucketCorsConfiguration resource instead.") inline def corsRules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketCorsRuleArgs.Builder]*):
        com.pulumi.aws.s3.BucketArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketCorsRuleArgs.builder
      builder.corsRules(args.map(_(argsBuilder).build)*)

    /**
     * @param grants [ACL policy grant](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#sample-acl). See `grant` Block below for details. Conflicts with `acl`. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketAcl` instead.
     * @return builder
     * @deprecated grant is deprecated. Use the aws.s3.BucketAcl resource instead.
     */
    @deprecated("grant is deprecated. Use the aws.s3.BucketAcl resource instead.") inline def grants(args: Endofunction[com.pulumi.aws.s3.inputs.BucketGrantArgs.Builder]*):
        com.pulumi.aws.s3.BucketArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketGrantArgs.builder
      builder.grants(args.map(_(argsBuilder).build)*)

    /**
     * @param lifecycleRules Configuration of [object lifecycle management](http://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html). See `lifecycleRule` Block below for details. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketLifecycleConfiguration` instead.
     * @return builder
     * @deprecated lifecycle_rule is deprecated. Use the aws.s3.BucketLifecycleConfiguration resource instead.
     */
    @deprecated("lifecycle_rule is deprecated. Use the aws.s3.BucketLifecycleConfiguration resource instead.") inline def lifecycleRules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleRuleArgs.Builder]*):
        com.pulumi.aws.s3.BucketArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleRuleArgs.builder
      builder.lifecycleRules(args.map(_(argsBuilder).build)*)

    /**
     * @param logging Configuration of [S3 bucket logging](https://docs.aws.amazon.com/AmazonS3/latest/UG/ManagingBucketLogging.html) parameters. See `logging` Block below for details. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketLogging` instead.
     * @return builder
     * @deprecated logging is deprecated. Use the aws.s3.BucketLogging resource instead.
     */
    @deprecated("logging is deprecated. Use the aws.s3.BucketLogging resource instead.") inline def logging(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLoggingArgs.Builder]):
        com.pulumi.aws.s3.BucketArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLoggingArgs.builder
      builder.logging(args(argsBuilder).build)

    /**
     * @param objectLockConfiguration Configuration of [S3 object locking](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html). See `objectLockConfiguration` Block below for details. The provider will only perform drift detection if a configuration value is provided. Use the `objectLockEnabled` parameter and the resource `aws.s3.BucketObjectLockConfiguration` instead.
     * @return builder
     * @deprecated object_lock_configuration is deprecated. Use the top-level parameter objectLockEnabled and the aws.s3.BucketObjectLockConfiguration resource instead.
     */
    @deprecated("object_lock_configuration is deprecated. Use the top-level parameter objectLockEnabled and the aws.s3.BucketObjectLockConfiguration resource instead.") inline def objectLockConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationArgs.Builder]):
        com.pulumi.aws.s3.BucketArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationArgs.builder
      builder.objectLockConfiguration(args(argsBuilder).build)

    /**
     * @param policy Valid [bucket policy](https://docs.aws.amazon.com/AmazonS3/latest/dev/example-bucket-policies.html) JSON document. Note that if the policy document is not specific enough (but still valid), this provider may view the policy as constantly changing. In this case, please make sure you use the verbose/specific version of the policy. For more information about building AWS IAM policy documents with this provider, see the AWS IAM Policy Document Guide. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketPolicy` instead.
     * @return builder
     * @deprecated policy is deprecated. Use the aws.s3.BucketPolicy resource instead.
     */
    @deprecated("policy is deprecated. Use the aws.s3.BucketPolicy resource instead.") inline def policy(args: Endofunction[com.pulumi.aws.s3.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.s3.BucketArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

    /**
     * @param replicationConfiguration Configuration of [replication configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html). See `replicationConfiguration` Block below for details. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketReplicationConfig` instead.
     * @return builder
     * @deprecated replication_configuration is deprecated. Use the aws.s3.BucketReplicationConfig resource instead.
     */
    @deprecated("replication_configuration is deprecated. Use the aws.s3.BucketReplicationConfig resource instead.") inline def replicationConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigurationArgs.Builder]):
        com.pulumi.aws.s3.BucketArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigurationArgs.builder
      builder.replicationConfiguration(args(argsBuilder).build)

    /**
     * @param serverSideEncryptionConfiguration Configuration of [server-side encryption configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html). See `serverSideEncryptionConfiguration` Block below for details. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketServerSideEncryptionConfiguration` instead.
     * @return builder
     * @deprecated server_side_encryption_configuration is deprecated. Use the aws.s3.BucketServerSideEncryptionConfiguration resource instead.
     */
    @deprecated("server_side_encryption_configuration is deprecated. Use the aws.s3.BucketServerSideEncryptionConfiguration resource instead.") inline def serverSideEncryptionConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.s3.BucketArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationArgs.builder
      builder.serverSideEncryptionConfiguration(args(argsBuilder).build)

    /**
     * @param versioning Configuration of the [S3 bucket versioning state](https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html). See `versioning` Block below for details. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketVersioning` instead.
     * @return builder
     * @deprecated versioning is deprecated. Use the aws.s3.BucketVersioning resource instead.
     */
    @deprecated("versioning is deprecated. Use the aws.s3.BucketVersioning resource instead.") inline def versioning(args: Endofunction[com.pulumi.aws.s3.inputs.BucketVersioningArgs.Builder]):
        com.pulumi.aws.s3.BucketArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketVersioningArgs.builder
      builder.versioning(args(argsBuilder).build)

    /**
     * @param website Configuration of the [S3 bucket website](https://docs.aws.amazon.com/AmazonS3/latest/userguide/WebsiteHosting.html). See `website` Block below for details. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketWebsiteConfiguration` instead.
     * @return builder
     * @deprecated website is deprecated. Use the aws.s3.BucketWebsiteConfiguration resource instead.
     */
    @deprecated("website is deprecated. Use the aws.s3.BucketWebsiteConfiguration resource instead.") inline def website(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteArgs.Builder]):
        com.pulumi.aws.s3.BucketArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteArgs.builder
      builder.website(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.BucketCorsConfigurationArgs.Builder)
    /**
     * @param corsRules Set of origins and methods (cross-origin access that you want to allow). See below. You can configure up to 100 rules.
     * @return builder
     */
    inline def corsRules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketCorsConfigurationCorsRuleArgs.Builder]*):
        com.pulumi.aws.s3.BucketCorsConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketCorsConfigurationCorsRuleArgs.builder
      builder.corsRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.BucketCorsConfigurationV2Args.Builder)
    /**
     * @param corsRules Set of origins and methods (cross-origin access that you want to allow). See below. You can configure up to 100 rules.
     * @return builder
     */
    inline def corsRules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketCorsConfigurationV2CorsRuleArgs.Builder]*):
        com.pulumi.aws.s3.BucketCorsConfigurationV2Args.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketCorsConfigurationV2CorsRuleArgs.builder
      builder.corsRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.BucketIntelligentTieringConfigurationArgs.Builder)
    /**
     * @param filter Bucket filter. The configuration only includes objects that meet the filter&#39;s criteria. See `filter` Block below.
     * @return builder
     */
    inline def filter(args: Endofunction[com.pulumi.aws.s3.inputs.BucketIntelligentTieringConfigurationFilterArgs.Builder]):
        com.pulumi.aws.s3.BucketIntelligentTieringConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketIntelligentTieringConfigurationFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param tierings S3 Intelligent-Tiering storage class tiers of the configuration. See `tiering` Block below.
     * @return builder
     */
    inline def tierings(args: Endofunction[com.pulumi.aws.s3.inputs.BucketIntelligentTieringConfigurationTieringArgs.Builder]*):
        com.pulumi.aws.s3.BucketIntelligentTieringConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketIntelligentTieringConfigurationTieringArgs.builder
      builder.tierings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.BucketLifecycleConfigurationArgs.Builder)
    /**
     * @param rules List of configuration blocks describing the rules managing the replication. See below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleArgs.Builder]*):
        com.pulumi.aws.s3.BucketLifecycleConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

    inline def timeouts(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationTimeoutsArgs.Builder]):
        com.pulumi.aws.s3.BucketLifecycleConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.BucketLifecycleConfigurationV2Args.Builder)
    /**
     * @param rules List of configuration blocks describing the rules managing the replication. See below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleArgs.Builder]*):
        com.pulumi.aws.s3.BucketLifecycleConfigurationV2Args.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

    inline def timeouts(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2TimeoutsArgs.Builder]):
        com.pulumi.aws.s3.BucketLifecycleConfigurationV2Args.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2TimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.BucketLoggingArgs.Builder)
    /**
     * @param targetGrants Set of configuration blocks with information for granting permissions. See below.
     * @return builder
     */
    inline def targetGrants(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLoggingTargetGrantArgs.Builder]*):
        com.pulumi.aws.s3.BucketLoggingArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketLoggingTargetGrantArgs.builder
      builder.targetGrants(args.map(_(argsBuilder).build)*)

    /**
     * @param targetObjectKeyFormat Amazon S3 key format for log objects. See below.
     * @return builder
     */
    inline def targetObjectKeyFormat(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLoggingTargetObjectKeyFormatArgs.Builder]):
        com.pulumi.aws.s3.BucketLoggingArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLoggingTargetObjectKeyFormatArgs.builder
      builder.targetObjectKeyFormat(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.BucketLoggingV2Args.Builder)
    /**
     * @param targetGrants Set of configuration blocks with information for granting permissions. See below.
     * @return builder
     */
    inline def targetGrants(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLoggingV2TargetGrantArgs.Builder]*):
        com.pulumi.aws.s3.BucketLoggingV2Args.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketLoggingV2TargetGrantArgs.builder
      builder.targetGrants(args.map(_(argsBuilder).build)*)

    /**
     * @param targetObjectKeyFormat Amazon S3 key format for log objects. See below.
     * @return builder
     */
    inline def targetObjectKeyFormat(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLoggingV2TargetObjectKeyFormatArgs.Builder]):
        com.pulumi.aws.s3.BucketLoggingV2Args.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLoggingV2TargetObjectKeyFormatArgs.builder
      builder.targetObjectKeyFormat(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.BucketMetadataConfigurationArgs.Builder)
    /**
     * @param metadataConfiguration Metadata configuration. See `metadataConfiguration` Block for details.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def metadataConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationArgs.Builder]):
        com.pulumi.aws.s3.BucketMetadataConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationArgs.builder
      builder.metadataConfiguration(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.s3.inputs.BucketMetadataConfigurationTimeoutsArgs.Builder]):
        com.pulumi.aws.s3.BucketMetadataConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketMetadataConfigurationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.BucketMetricArgs.Builder)
    /**
     * @param filter [Object filtering](http://docs.aws.amazon.com/AmazonS3/latest/dev/metrics-configurations.html#metrics-configurations-filter) that accepts a prefix, tags, or a logical AND of prefix and tags. See below.
     * @return builder
     */
    inline def filter(args: Endofunction[com.pulumi.aws.s3.inputs.BucketMetricFilterArgs.Builder]):
        com.pulumi.aws.s3.BucketMetricArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketMetricFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.BucketNotificationArgs.Builder)
    /**
     * @param lambdaFunctions Notification configuration to a Lambda Function. See below.
     * @return builder
     */
    inline def lambdaFunctions(args: Endofunction[com.pulumi.aws.s3.inputs.BucketNotificationLambdaFunctionArgs.Builder]*):
        com.pulumi.aws.s3.BucketNotificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketNotificationLambdaFunctionArgs.builder
      builder.lambdaFunctions(args.map(_(argsBuilder).build)*)

    /**
     * @param queues Notification configuration to SQS Queue. See below.
     * @return builder
     */
    inline def queues(args: Endofunction[com.pulumi.aws.s3.inputs.BucketNotificationQueueArgs.Builder]*):
        com.pulumi.aws.s3.BucketNotificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketNotificationQueueArgs.builder
      builder.queues(args.map(_(argsBuilder).build)*)

    /**
     * @param topics Notification configuration to SNS Topic. See below.
     * @return builder
     */
    inline def topics(args: Endofunction[com.pulumi.aws.s3.inputs.BucketNotificationTopicArgs.Builder]*):
        com.pulumi.aws.s3.BucketNotificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketNotificationTopicArgs.builder
      builder.topics(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.BucketObjectLockConfigurationArgs.Builder)
    /**
     * @param rule Configuration block for specifying the Object Lock rule for the specified object. See below.
     * @return builder
     */
    inline def rule(args: Endofunction[com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationRuleArgs.Builder]):
        com.pulumi.aws.s3.BucketObjectLockConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationRuleArgs.builder
      builder.rule(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.BucketObjectLockConfigurationV2Args.Builder)
    /**
     * @param rule Configuration block for specifying the Object Lock rule for the specified object. See below.
     * @return builder
     */
    inline def rule(args: Endofunction[com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationV2RuleArgs.Builder]):
        com.pulumi.aws.s3.BucketObjectLockConfigurationV2Args.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationV2RuleArgs.builder
      builder.rule(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.BucketObjectv2Args.Builder)
    /**
     * @param overrideProvider Override provider-level configuration options. See `overrideProvider` Block below for more details.
     * @return builder
     */
    inline def overrideProvider(args: Endofunction[com.pulumi.aws.s3.inputs.BucketObjectv2OverrideProviderArgs.Builder]):
        com.pulumi.aws.s3.BucketObjectv2Args.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketObjectv2OverrideProviderArgs.builder
      builder.overrideProvider(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.BucketOwnershipControlsArgs.Builder)
    /**
     * @param rule Configuration block(s) with Ownership Controls rules. Detailed below.
     * @return builder
     */
    inline def rule(args: Endofunction[com.pulumi.aws.s3.inputs.BucketOwnershipControlsRuleArgs.Builder]):
        com.pulumi.aws.s3.BucketOwnershipControlsArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketOwnershipControlsRuleArgs.builder
      builder.rule(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.BucketPolicyArgs.Builder)
    /**
     * @param policy Text of the policy. Although this is a bucket policy rather than an IAM policy, the `aws.iam.getPolicyDocument` data source may be used, so long as it specifies a principal. For more information about building AWS IAM policy documents, see the AWS IAM Policy Document Guide. Note: Bucket policies are limited to 20 KB in size.
     * @return builder
     */
    inline def policy(args: Endofunction[com.pulumi.aws.s3.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.s3.BucketPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.BucketReplicationConfigArgs.Builder)
    /**
     * @param rules List of configuration blocks describing the rules managing the replication. See below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleArgs.Builder]*):
        com.pulumi.aws.s3.BucketReplicationConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.BucketServerSideEncryptionConfigurationArgs.Builder)
    /**
     * @param rules Set of server-side encryption configuration rules. See below. Currently, only a single rule is supported.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationRuleArgs.Builder]*):
        com.pulumi.aws.s3.BucketServerSideEncryptionConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.BucketServerSideEncryptionConfigurationV2Args.Builder)
    /**
     * @param rules Set of server-side encryption configuration rules. See below. Currently, only a single rule is supported.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationV2RuleArgs.Builder]*):
        com.pulumi.aws.s3.BucketServerSideEncryptionConfigurationV2Args.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationV2RuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.BucketV2Args.Builder)
    /**
     * @param corsRules Rule of [Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html). See `corsRule` Block below for details. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketCorsConfiguration` instead.
     * @return builder
     * @deprecated cors_rule is deprecated. Use the aws.s3.BucketCorsConfiguration resource instead.
     */
    @deprecated("cors_rule is deprecated. Use the aws.s3.BucketCorsConfiguration resource instead.") inline def corsRules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2CorsRuleArgs.Builder]*):
        com.pulumi.aws.s3.BucketV2Args.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2CorsRuleArgs.builder
      builder.corsRules(args.map(_(argsBuilder).build)*)

    /**
     * @param grants [ACL policy grant](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#sample-acl). See `grant` Block below for details. Conflicts with `acl`. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketAcl` instead.
     * @return builder
     * @deprecated grant is deprecated. Use the aws.s3.BucketAcl resource instead.
     */
    @deprecated("grant is deprecated. Use the aws.s3.BucketAcl resource instead.") inline def grants(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2GrantArgs.Builder]*):
        com.pulumi.aws.s3.BucketV2Args.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2GrantArgs.builder
      builder.grants(args.map(_(argsBuilder).build)*)

    /**
     * @param lifecycleRules Configuration of [object lifecycle management](http://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html). See `lifecycleRule` Block below for details. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketLifecycleConfiguration` instead.
     * @return builder
     * @deprecated lifecycle_rule is deprecated. Use the aws.s3.BucketLifecycleConfiguration resource instead.
     */
    @deprecated("lifecycle_rule is deprecated. Use the aws.s3.BucketLifecycleConfiguration resource instead.") inline def lifecycleRules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2LifecycleRuleArgs.Builder]*):
        com.pulumi.aws.s3.BucketV2Args.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2LifecycleRuleArgs.builder
      builder.lifecycleRules(args.map(_(argsBuilder).build)*)

    /**
     * @param loggings Configuration of [S3 bucket logging](https://docs.aws.amazon.com/AmazonS3/latest/UG/ManagingBucketLogging.html) parameters. See `logging` Block below for details. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketLogging` instead.
     * @return builder
     * @deprecated logging is deprecated. Use the aws.s3.BucketLogging resource instead.
     */
    @deprecated("logging is deprecated. Use the aws.s3.BucketLogging resource instead.") inline def loggings(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2LoggingArgs.Builder]*):
        com.pulumi.aws.s3.BucketV2Args.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2LoggingArgs.builder
      builder.loggings(args.map(_(argsBuilder).build)*)

    /**
     * @param objectLockConfiguration Configuration of [S3 object locking](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html). See `objectLockConfiguration` Block below for details. The provider will only perform drift detection if a configuration value is provided. Use the `objectLockEnabled` parameter and the resource `aws.s3.BucketObjectLockConfiguration` instead.
     * @return builder
     * @deprecated object_lock_configuration is deprecated. Use the top-level parameter objectLockEnabled and the aws.s3.BucketObjectLockConfiguration resource instead.
     */
    @deprecated("object_lock_configuration is deprecated. Use the top-level parameter objectLockEnabled and the aws.s3.BucketObjectLockConfiguration resource instead.") inline def objectLockConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2ObjectLockConfigurationArgs.Builder]):
        com.pulumi.aws.s3.BucketV2Args.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketV2ObjectLockConfigurationArgs.builder
      builder.objectLockConfiguration(args(argsBuilder).build)

    /**
     * @param replicationConfigurations Configuration of [replication configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html). See `replicationConfiguration` Block below for details. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketReplicationConfig` instead.
     * @return builder
     * @deprecated replication_configuration is deprecated. Use the aws.s3.BucketReplicationConfig resource instead.
     */
    @deprecated("replication_configuration is deprecated. Use the aws.s3.BucketReplicationConfig resource instead.") inline def replicationConfigurations(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationArgs.Builder]*):
        com.pulumi.aws.s3.BucketV2Args.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationArgs.builder
      builder.replicationConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param serverSideEncryptionConfigurations Configuration of [server-side encryption configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html). See `serverSideEncryptionConfiguration` Block below for details. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketServerSideEncryptionConfiguration` instead.
     * @return builder
     * @deprecated server_side_encryption_configuration is deprecated. Use the aws.s3.BucketServerSideEncryptionConfiguration resource instead.
     */
    @deprecated("server_side_encryption_configuration is deprecated. Use the aws.s3.BucketServerSideEncryptionConfiguration resource instead.") inline def serverSideEncryptionConfigurations(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2ServerSideEncryptionConfigurationArgs.Builder]*):
        com.pulumi.aws.s3.BucketV2Args.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2ServerSideEncryptionConfigurationArgs.builder
      builder.serverSideEncryptionConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param versionings Configuration of the [S3 bucket versioning state](https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html). See `versioning` Block below for details. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketVersioning` instead.
     * @return builder
     * @deprecated versioning is deprecated. Use the aws.s3.BucketVersioning resource instead.
     */
    @deprecated("versioning is deprecated. Use the aws.s3.BucketVersioning resource instead.") inline def versionings(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2VersioningArgs.Builder]*):
        com.pulumi.aws.s3.BucketV2Args.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2VersioningArgs.builder
      builder.versionings(args.map(_(argsBuilder).build)*)

    /**
     * @param websites Configuration of the [S3 bucket website](https://docs.aws.amazon.com/AmazonS3/latest/userguide/WebsiteHosting.html). See `website` Block below for details. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketWebsiteConfiguration` instead.
     * @return builder
     * @deprecated website is deprecated. Use the aws.s3.BucketWebsiteConfiguration resource instead.
     */
    @deprecated("website is deprecated. Use the aws.s3.BucketWebsiteConfiguration resource instead.") inline def websites(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2WebsiteArgs.Builder]*):
        com.pulumi.aws.s3.BucketV2Args.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2WebsiteArgs.builder
      builder.websites(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.BucketVersioningArgs.Builder)
    /**
     * @param versioningConfiguration Configuration block for the versioning parameters. See below.
     * @return builder
     */
    inline def versioningConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketVersioningVersioningConfigurationArgs.Builder]):
        com.pulumi.aws.s3.BucketVersioningArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketVersioningVersioningConfigurationArgs.builder
      builder.versioningConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.BucketVersioningV2Args.Builder)
    /**
     * @param versioningConfiguration Configuration block for the versioning parameters. See below.
     * @return builder
     */
    inline def versioningConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketVersioningV2VersioningConfigurationArgs.Builder]):
        com.pulumi.aws.s3.BucketVersioningV2Args.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketVersioningV2VersioningConfigurationArgs.builder
      builder.versioningConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.BucketWebsiteConfigurationArgs.Builder)
    /**
     * @param errorDocument Name of the error document for the website. See below.
     * @return builder
     */
    inline def errorDocument(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationErrorDocumentArgs.Builder]):
        com.pulumi.aws.s3.BucketWebsiteConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationErrorDocumentArgs.builder
      builder.errorDocument(args(argsBuilder).build)

    /**
     * @param indexDocument Name of the index document for the website. See below.
     * @return builder
     */
    inline def indexDocument(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationIndexDocumentArgs.Builder]):
        com.pulumi.aws.s3.BucketWebsiteConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationIndexDocumentArgs.builder
      builder.indexDocument(args(argsBuilder).build)

    /**
     * @param redirectAllRequestsTo Redirect behavior for every request to this bucket&#39;s website endpoint. See below. Conflicts with `errorDocument`, `indexDocument`, and `routingRule`.
     * @return builder
     */
    inline def redirectAllRequestsTo(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationRedirectAllRequestsToArgs.Builder]):
        com.pulumi.aws.s3.BucketWebsiteConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationRedirectAllRequestsToArgs.builder
      builder.redirectAllRequestsTo(args(argsBuilder).build)

    /**
     * @param routingRules List of rules that define when a redirect is applied and the redirect behavior. See below.
     * @return builder
     */
    inline def routingRules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationRoutingRuleArgs.Builder]*):
        com.pulumi.aws.s3.BucketWebsiteConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationRoutingRuleArgs.builder
      builder.routingRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.BucketWebsiteConfigurationV2Args.Builder)
    /**
     * @param errorDocument Name of the error document for the website. See below.
     * @return builder
     */
    inline def errorDocument(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2ErrorDocumentArgs.Builder]):
        com.pulumi.aws.s3.BucketWebsiteConfigurationV2Args.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2ErrorDocumentArgs.builder
      builder.errorDocument(args(argsBuilder).build)

    /**
     * @param indexDocument Name of the index document for the website. See below.
     * @return builder
     */
    inline def indexDocument(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2IndexDocumentArgs.Builder]):
        com.pulumi.aws.s3.BucketWebsiteConfigurationV2Args.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2IndexDocumentArgs.builder
      builder.indexDocument(args(argsBuilder).build)

    /**
     * @param redirectAllRequestsTo Redirect behavior for every request to this bucket&#39;s website endpoint. See below. Conflicts with `errorDocument`, `indexDocument`, and `routingRule`.
     * @return builder
     */
    inline def redirectAllRequestsTo(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2RedirectAllRequestsToArgs.Builder]):
        com.pulumi.aws.s3.BucketWebsiteConfigurationV2Args.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2RedirectAllRequestsToArgs.builder
      builder.redirectAllRequestsTo(args(argsBuilder).build)

    /**
     * @param routingRules List of rules that define when a redirect is applied and the redirect behavior. See below.
     * @return builder
     */
    inline def routingRules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2RoutingRuleArgs.Builder]*):
        com.pulumi.aws.s3.BucketWebsiteConfigurationV2Args.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2RoutingRuleArgs.builder
      builder.routingRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.DirectoryBucketArgs.Builder)
    /**
     * @param location Bucket location. See Location below for more details.
     * @return builder
     */
    inline def location(args: Endofunction[com.pulumi.aws.s3.inputs.DirectoryBucketLocationArgs.Builder]):
        com.pulumi.aws.s3.DirectoryBucketArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.DirectoryBucketLocationArgs.builder
      builder.location(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.FilesAccessPointArgs.Builder)
    /**
     * @param posixUsers POSIX user configuration. See `posixUser` below. Changing this value forces replacement.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def posixUsers(args: Endofunction[com.pulumi.aws.s3.inputs.FilesAccessPointPosixUserArgs.Builder]*):
        com.pulumi.aws.s3.FilesAccessPointArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.FilesAccessPointPosixUserArgs.builder
      builder.posixUsers(args.map(_(argsBuilder).build)*)

    /**
     * @param rootDirectories Root directory configuration. See `rootDirectory` below. Changing this value forces replacement.
     * @return builder
     */
    inline def rootDirectories(args: Endofunction[com.pulumi.aws.s3.inputs.FilesAccessPointRootDirectoryArgs.Builder]*):
        com.pulumi.aws.s3.FilesAccessPointArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.FilesAccessPointRootDirectoryArgs.builder
      builder.rootDirectories(args.map(_(argsBuilder).build)*)

    inline def timeouts(args: Endofunction[com.pulumi.aws.s3.inputs.FilesAccessPointTimeoutsArgs.Builder]):
        com.pulumi.aws.s3.FilesAccessPointArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.FilesAccessPointTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.FilesFileSystemArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.s3.inputs.FilesFileSystemTimeoutsArgs.Builder]):
        com.pulumi.aws.s3.FilesFileSystemArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.FilesFileSystemTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.FilesMountTargetArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.s3.inputs.FilesMountTargetTimeoutsArgs.Builder]):
        com.pulumi.aws.s3.FilesMountTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.FilesMountTargetTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.FilesSynchronizationConfigurationArgs.Builder)
    /**
     * @param expirationDataRules Expiration data rule configuration. See `expirationDataRule` below.
     * @return builder
     */
    inline def expirationDataRules(args: Endofunction[com.pulumi.aws.s3.inputs.FilesSynchronizationConfigurationExpirationDataRuleArgs.Builder]*):
        com.pulumi.aws.s3.FilesSynchronizationConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.FilesSynchronizationConfigurationExpirationDataRuleArgs.builder
      builder.expirationDataRules(args.map(_(argsBuilder).build)*)

    /**
     * @param importDataRules One or more import data rules. See `importDataRule` below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def importDataRules(args: Endofunction[com.pulumi.aws.s3.inputs.FilesSynchronizationConfigurationImportDataRuleArgs.Builder]*):
        com.pulumi.aws.s3.FilesSynchronizationConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.FilesSynchronizationConfigurationImportDataRuleArgs.builder
      builder.importDataRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.InventoryArgs.Builder)
    /**
     * @param destination Where to publish the inventory results. See `destination` Block below.
     * @return builder
     */
    inline def destination(args: Endofunction[com.pulumi.aws.s3.inputs.InventoryDestinationArgs.Builder]):
        com.pulumi.aws.s3.InventoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.InventoryDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

    /**
     * @param filter Inventory filter. The inventory only includes objects that meet the filter&#39;s criteria. See `filter` Block below.
     * @return builder
     */
    inline def filter(args: Endofunction[com.pulumi.aws.s3.inputs.InventoryFilterArgs.Builder]):
        com.pulumi.aws.s3.InventoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.InventoryFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param schedule Schedule for generating inventory results. See `schedule` Block below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def schedule(args: Endofunction[com.pulumi.aws.s3.inputs.InventoryScheduleArgs.Builder]):
        com.pulumi.aws.s3.InventoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.InventoryScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.ObjectCopyArgs.Builder)
    /**
     * @param grants Configuration block for header grants. Documented below. Conflicts with `acl`.
     * @return builder
     */
    inline def grants(args: Endofunction[com.pulumi.aws.s3.inputs.ObjectCopyGrantArgs.Builder]*):
        com.pulumi.aws.s3.ObjectCopyArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.ObjectCopyGrantArgs.builder
      builder.grants(args.map(_(argsBuilder).build)*)

    inline def overrideProvider(args: Endofunction[com.pulumi.aws.s3.inputs.ObjectCopyOverrideProviderArgs.Builder]):
        com.pulumi.aws.s3.ObjectCopyArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.ObjectCopyOverrideProviderArgs.builder
      builder.overrideProvider(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.VectorsIndexArgs.Builder)
    /**
     * @param encryptionConfigurations Block for encryption configuration for the vector index. See `encryptionConfiguration` Block below.
     * @return builder
     */
    inline def encryptionConfigurations(args: Endofunction[com.pulumi.aws.s3.inputs.VectorsIndexEncryptionConfigurationArgs.Builder]*):
        com.pulumi.aws.s3.VectorsIndexArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.VectorsIndexEncryptionConfigurationArgs.builder
      builder.encryptionConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param metadataConfiguration Block for metadata configuration for the vector index. See `metadataConfiguration` Block below.
     * @return builder
     */
    inline def metadataConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.VectorsIndexMetadataConfigurationArgs.Builder]):
        com.pulumi.aws.s3.VectorsIndexArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.VectorsIndexMetadataConfigurationArgs.builder
      builder.metadataConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.VectorsVectorBucketArgs.Builder)
    /**
     * @param encryptionConfigurations Encryption configuration for the vector bucket. See `encryptionConfiguration` below for more details.
     * @return builder
     */
    inline def encryptionConfigurations(args: Endofunction[com.pulumi.aws.s3.inputs.VectorsVectorBucketEncryptionConfigurationArgs.Builder]*):
        com.pulumi.aws.s3.VectorsVectorBucketArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.VectorsVectorBucketEncryptionConfigurationArgs.builder
      builder.encryptionConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.AccessPointState.Builder)
    /**
     * @param publicAccessBlockConfiguration Configuration block to manage the `PublicAccessBlock` configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration options in any combination. Detailed below.
     * @return builder
     */
    inline def publicAccessBlockConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.AccessPointPublicAccessBlockConfigurationArgs.Builder]):
        com.pulumi.aws.s3.inputs.AccessPointState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.AccessPointPublicAccessBlockConfigurationArgs.builder
      builder.publicAccessBlockConfiguration(args(argsBuilder).build)

    /**
     * @param vpcConfiguration Configuration block to restrict access to this access point to requests from the specified VPC. Required for S3 on Outposts. Detailed below.
     * @return builder
     */
    inline def vpcConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.AccessPointVpcConfigurationArgs.Builder]):
        com.pulumi.aws.s3.inputs.AccessPointState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.AccessPointVpcConfigurationArgs.builder
      builder.vpcConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.AnalyticsConfigurationState.Builder)
    /**
     * @param filter Object filtering that accepts a prefix, tags, or a logical AND of prefix and tags (documented below).
     * @return builder
     */
    inline def filter(args: Endofunction[com.pulumi.aws.s3.inputs.AnalyticsConfigurationFilterArgs.Builder]):
        com.pulumi.aws.s3.inputs.AnalyticsConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.AnalyticsConfigurationFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param storageClassAnalysis Configuration for the analytics data export (documented below).
     * @return builder
     */
    inline def storageClassAnalysis(args: Endofunction[com.pulumi.aws.s3.inputs.AnalyticsConfigurationStorageClassAnalysisArgs.Builder]):
        com.pulumi.aws.s3.inputs.AnalyticsConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.AnalyticsConfigurationStorageClassAnalysisArgs.builder
      builder.storageClassAnalysis(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.AnalyticsConfigurationStorageClassAnalysisArgs.Builder)
    /**
     * @param dataExport Data export configuration (documented below).
     * @return builder
     */
    inline def dataExport(args: Endofunction[com.pulumi.aws.s3.inputs.AnalyticsConfigurationStorageClassAnalysisDataExportArgs.Builder]):
        com.pulumi.aws.s3.inputs.AnalyticsConfigurationStorageClassAnalysisArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.AnalyticsConfigurationStorageClassAnalysisDataExportArgs.builder
      builder.dataExport(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.AnalyticsConfigurationStorageClassAnalysisDataExportArgs.Builder)
    /**
     * @param destination Destination for the exported analytics data (documented below).
     * @return builder
     */
    inline def destination(args: Endofunction[com.pulumi.aws.s3.inputs.AnalyticsConfigurationStorageClassAnalysisDataExportDestinationArgs.Builder]):
        com.pulumi.aws.s3.inputs.AnalyticsConfigurationStorageClassAnalysisDataExportArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.AnalyticsConfigurationStorageClassAnalysisDataExportDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.AnalyticsConfigurationStorageClassAnalysisDataExportDestinationArgs.Builder)
    /**
     * @param s3BucketDestination Analytics data export currently only supports an S3 bucket destination (documented below).
     * @return builder
     */
    inline def s3BucketDestination(args: Endofunction[com.pulumi.aws.s3.inputs.AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestinationArgs.Builder]):
        com.pulumi.aws.s3.inputs.AnalyticsConfigurationStorageClassAnalysisDataExportDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestinationArgs.builder
      builder.s3BucketDestination(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketAbacState.Builder)
    /**
     * @param abacStatus ABAC status configuration. See `abacStatus` Block for details.
     * @return builder
     */
    inline def abacStatus(args: Endofunction[com.pulumi.aws.s3.inputs.BucketAbacAbacStatusArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketAbacState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketAbacAbacStatusArgs.builder
      builder.abacStatus(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketAclAccessControlPolicyArgs.Builder)
    /**
     * @param grants Set of `grant` configuration blocks. See below.
     * @return builder
     */
    inline def grants(args: Endofunction[com.pulumi.aws.s3.inputs.BucketAclAccessControlPolicyGrantArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketAclAccessControlPolicyArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketAclAccessControlPolicyGrantArgs.builder
      builder.grants(args.map(_(argsBuilder).build)*)

    /**
     * @param owner Configuration block for the bucket owner&#39;s display name and ID. See below.
     * @return builder
     */
    inline def owner(args: Endofunction[com.pulumi.aws.s3.inputs.BucketAclAccessControlPolicyOwnerArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketAclAccessControlPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketAclAccessControlPolicyOwnerArgs.builder
      builder.owner(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketAclAccessControlPolicyGrantArgs.Builder)
    /**
     * @param grantee Configuration block for the person being granted permissions. See below.
     * @return builder
     */
    inline def grantee(args: Endofunction[com.pulumi.aws.s3.inputs.BucketAclAccessControlPolicyGrantGranteeArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketAclAccessControlPolicyGrantArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketAclAccessControlPolicyGrantGranteeArgs.builder
      builder.grantee(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketAclState.Builder)
    /**
     * @param accessControlPolicy Configuration block that sets the ACL permissions for an object per grantee. See below.
     * @return builder
     */
    inline def accessControlPolicy(args: Endofunction[com.pulumi.aws.s3.inputs.BucketAclAccessControlPolicyArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketAclState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketAclAccessControlPolicyArgs.builder
      builder.accessControlPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketAclV2AccessControlPolicyArgs.Builder)
    /**
     * @param grants Set of `grant` configuration blocks. See below.
     * @return builder
     */
    inline def grants(args: Endofunction[com.pulumi.aws.s3.inputs.BucketAclV2AccessControlPolicyGrantArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketAclV2AccessControlPolicyArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketAclV2AccessControlPolicyGrantArgs.builder
      builder.grants(args.map(_(argsBuilder).build)*)

    /**
     * @param owner Configuration block for the bucket owner&#39;s display name and ID. See below.
     * @return builder
     */
    inline def owner(args: Endofunction[com.pulumi.aws.s3.inputs.BucketAclV2AccessControlPolicyOwnerArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketAclV2AccessControlPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketAclV2AccessControlPolicyOwnerArgs.builder
      builder.owner(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketAclV2AccessControlPolicyGrantArgs.Builder)
    /**
     * @param grantee Configuration block for the person being granted permissions. See below.
     * @return builder
     */
    inline def grantee(args: Endofunction[com.pulumi.aws.s3.inputs.BucketAclV2AccessControlPolicyGrantGranteeArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketAclV2AccessControlPolicyGrantArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketAclV2AccessControlPolicyGrantGranteeArgs.builder
      builder.grantee(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketAclV2State.Builder)
    /**
     * @param accessControlPolicy Configuration block that sets the ACL permissions for an object per grantee. See below.
     * @return builder
     */
    inline def accessControlPolicy(args: Endofunction[com.pulumi.aws.s3.inputs.BucketAclV2AccessControlPolicyArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketAclV2State.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketAclV2AccessControlPolicyArgs.builder
      builder.accessControlPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketCorsConfigurationState.Builder)
    /**
     * @param corsRules Set of origins and methods (cross-origin access that you want to allow). See below. You can configure up to 100 rules.
     * @return builder
     */
    inline def corsRules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketCorsConfigurationCorsRuleArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketCorsConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketCorsConfigurationCorsRuleArgs.builder
      builder.corsRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketCorsConfigurationV2State.Builder)
    /**
     * @param corsRules Set of origins and methods (cross-origin access that you want to allow). See below. You can configure up to 100 rules.
     * @return builder
     */
    inline def corsRules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketCorsConfigurationV2CorsRuleArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketCorsConfigurationV2State.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketCorsConfigurationV2CorsRuleArgs.builder
      builder.corsRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketIntelligentTieringConfigurationState.Builder)
    /**
     * @param filter Bucket filter. The configuration only includes objects that meet the filter&#39;s criteria. See `filter` Block below.
     * @return builder
     */
    inline def filter(args: Endofunction[com.pulumi.aws.s3.inputs.BucketIntelligentTieringConfigurationFilterArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketIntelligentTieringConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketIntelligentTieringConfigurationFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param tierings S3 Intelligent-Tiering storage class tiers of the configuration. See `tiering` Block below.
     * @return builder
     */
    inline def tierings(args: Endofunction[com.pulumi.aws.s3.inputs.BucketIntelligentTieringConfigurationTieringArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketIntelligentTieringConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketIntelligentTieringConfigurationTieringArgs.builder
      builder.tierings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleArgs.Builder)
    /**
     * @param abortIncompleteMultipartUpload Configuration block that specifies the days since the initiation of an incomplete multipart upload that Amazon S3 will wait before permanently removing all parts of the upload. See below.
     * @return builder
     */
    inline def abortIncompleteMultipartUpload(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadArgs.builder
      builder.abortIncompleteMultipartUpload(args(argsBuilder).build)

    /**
     * @param expiration Configuration block that specifies the expiration for the lifecycle of the object in the form of date, days and, whether the object has a delete marker. See below.
     * @return builder
     */
    inline def expiration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleExpirationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleExpirationArgs.builder
      builder.expiration(args(argsBuilder).build)

    /**
     * @param filter Configuration block used to identify objects that a Lifecycle Rule applies to. See below.
     * @return builder
     */
    inline def filter(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleFilterArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param noncurrentVersionExpiration Configuration block that specifies when noncurrent object versions expire. See below.
     * @return builder
     */
    inline def noncurrentVersionExpiration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleNoncurrentVersionExpirationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleNoncurrentVersionExpirationArgs.builder
      builder.noncurrentVersionExpiration(args(argsBuilder).build)

    /**
     * @param noncurrentVersionTransitions Set of configuration blocks that specify the transition rule for the lifecycle rule that describes when noncurrent objects transition to a specific storage class. See below.
     * @return builder
     */
    inline def noncurrentVersionTransitions(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleNoncurrentVersionTransitionArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleNoncurrentVersionTransitionArgs.builder
      builder.noncurrentVersionTransitions(args.map(_(argsBuilder).build)*)

    /**
     * @param transitions Set of configuration blocks that specify when an Amazon S3 object transitions to a specified storage class. See below.
     * @return builder
     */
    inline def transitions(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleTransitionArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleTransitionArgs.builder
      builder.transitions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleFilterArgs.Builder)
    /**
     * @param and Configuration block used to apply a logical `AND` to two or more predicates. See below. The Lifecycle Rule will apply to any object matching all the predicates configured inside the `and` block.
     * @return builder
     */
    inline def and(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleFilterAndArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleFilterArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleFilterAndArgs.builder
      builder.and(args(argsBuilder).build)

    /**
     * @param tag Configuration block for specifying a tag key and value. See below.
     * @return builder
     */
    inline def tag(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleFilterTagArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleFilterArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleFilterTagArgs.builder
      builder.tag(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationState.Builder)
    /**
     * @param rules List of configuration blocks describing the rules managing the replication. See below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

    inline def timeouts(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationTimeoutsArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleArgs.Builder)
    /**
     * @param abortIncompleteMultipartUpload Configuration block that specifies the days since the initiation of an incomplete multipart upload that Amazon S3 will wait before permanently removing all parts of the upload. See below.
     * @return builder
     */
    inline def abortIncompleteMultipartUpload(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleAbortIncompleteMultipartUploadArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleAbortIncompleteMultipartUploadArgs.builder
      builder.abortIncompleteMultipartUpload(args(argsBuilder).build)

    /**
     * @param expiration Configuration block that specifies the expiration for the lifecycle of the object in the form of date, days and, whether the object has a delete marker. See below.
     * @return builder
     */
    inline def expiration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleExpirationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleExpirationArgs.builder
      builder.expiration(args(argsBuilder).build)

    /**
     * @param filter Configuration block used to identify objects that a Lifecycle Rule applies to. See below.
     * @return builder
     */
    inline def filter(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleFilterArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param noncurrentVersionExpiration Configuration block that specifies when noncurrent object versions expire. See below.
     * @return builder
     */
    inline def noncurrentVersionExpiration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleNoncurrentVersionExpirationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleNoncurrentVersionExpirationArgs.builder
      builder.noncurrentVersionExpiration(args(argsBuilder).build)

    /**
     * @param noncurrentVersionTransitions Set of configuration blocks that specify the transition rule for the lifecycle rule that describes when noncurrent objects transition to a specific storage class. See below.
     * @return builder
     */
    inline def noncurrentVersionTransitions(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleNoncurrentVersionTransitionArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleNoncurrentVersionTransitionArgs.builder
      builder.noncurrentVersionTransitions(args.map(_(argsBuilder).build)*)

    /**
     * @param transitions Set of configuration blocks that specify when an Amazon S3 object transitions to a specified storage class. See below.
     * @return builder
     */
    inline def transitions(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleTransitionArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleTransitionArgs.builder
      builder.transitions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleFilterArgs.Builder)
    /**
     * @param and Configuration block used to apply a logical `AND` to two or more predicates. See below. The Lifecycle Rule will apply to any object matching all the predicates configured inside the `and` block.
     * @return builder
     */
    inline def and(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleFilterAndArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleFilterArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleFilterAndArgs.builder
      builder.and(args(argsBuilder).build)

    /**
     * @param tag Configuration block for specifying a tag key and value. See below.
     * @return builder
     */
    inline def tag(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleFilterTagArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleFilterArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleFilterTagArgs.builder
      builder.tag(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2State.Builder)
    /**
     * @param rules List of configuration blocks describing the rules managing the replication. See below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2State.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

    inline def timeouts(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2TimeoutsArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2State.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2TimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketLifecycleRuleArgs.Builder)
    /**
     * @param expiration Configuration of the object expiration. See `expiration` Block below for details.
     * @return builder
     */
    inline def expiration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleRuleExpirationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLifecycleRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleRuleExpirationArgs.builder
      builder.expiration(args(argsBuilder).build)

    /**
     * @param noncurrentVersionExpiration When noncurrent object versions expire. See `noncurrentVersionExpiration` Block below for details.
     * @return builder
     */
    inline def noncurrentVersionExpiration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleRuleNoncurrentVersionExpirationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLifecycleRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleRuleNoncurrentVersionExpirationArgs.builder
      builder.noncurrentVersionExpiration(args(argsBuilder).build)

    /**
     * @param noncurrentVersionTransitions When noncurrent object versions transition. See `noncurrentVersionTransition` Block below for details.
     * @return builder
     */
    inline def noncurrentVersionTransitions(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleRuleNoncurrentVersionTransitionArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketLifecycleRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleRuleNoncurrentVersionTransitionArgs.builder
      builder.noncurrentVersionTransitions(args.map(_(argsBuilder).build)*)

    /**
     * @param transitions Configuration of the object transition. See `transition` Block below for details.
     * @return builder
     */
    inline def transitions(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleRuleTransitionArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketLifecycleRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleRuleTransitionArgs.builder
      builder.transitions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketLoggingState.Builder)
    /**
     * @param targetGrants Set of configuration blocks with information for granting permissions. See below.
     * @return builder
     */
    inline def targetGrants(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLoggingTargetGrantArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketLoggingState.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketLoggingTargetGrantArgs.builder
      builder.targetGrants(args.map(_(argsBuilder).build)*)

    /**
     * @param targetObjectKeyFormat Amazon S3 key format for log objects. See below.
     * @return builder
     */
    inline def targetObjectKeyFormat(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLoggingTargetObjectKeyFormatArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLoggingState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLoggingTargetObjectKeyFormatArgs.builder
      builder.targetObjectKeyFormat(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketLoggingTargetGrantArgs.Builder)
    /**
     * @param grantee Configuration block for the person being granted permissions. See below.
     * @return builder
     */
    inline def grantee(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLoggingTargetGrantGranteeArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLoggingTargetGrantArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLoggingTargetGrantGranteeArgs.builder
      builder.grantee(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketLoggingTargetObjectKeyFormatArgs.Builder)
    /**
     * @param partitionedPrefix Partitioned S3 key for log objects, in the form `[targetPrefix][SourceAccountId]/[SourceRegion]/[SourceBucket]/[YYYY]/[MM]/[DD]/[YYYY]-[MM]-[DD]-[hh]-[mm]-[ss]-[UniqueString]`. Conflicts with `simplePrefix`. See below.
     * @return builder
     */
    inline def partitionedPrefix(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLoggingTargetObjectKeyFormatPartitionedPrefixArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLoggingTargetObjectKeyFormatArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLoggingTargetObjectKeyFormatPartitionedPrefixArgs.builder
      builder.partitionedPrefix(args(argsBuilder).build)

    /**
     * @param simplePrefix Use the simple format for S3 keys for log objects, in the form `[targetPrefix][YYYY]-[MM]-[DD]-[hh]-[mm]-[ss]-[UniqueString]`. To use, set `simplePrefix {}`. Conflicts with `partitionedPrefix`.
     * @return builder
     */
    inline def simplePrefix(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLoggingTargetObjectKeyFormatSimplePrefixArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLoggingTargetObjectKeyFormatArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLoggingTargetObjectKeyFormatSimplePrefixArgs.builder
      builder.simplePrefix(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketLoggingV2State.Builder)
    /**
     * @param targetGrants Set of configuration blocks with information for granting permissions. See below.
     * @return builder
     */
    inline def targetGrants(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLoggingV2TargetGrantArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketLoggingV2State.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketLoggingV2TargetGrantArgs.builder
      builder.targetGrants(args.map(_(argsBuilder).build)*)

    /**
     * @param targetObjectKeyFormat Amazon S3 key format for log objects. See below.
     * @return builder
     */
    inline def targetObjectKeyFormat(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLoggingV2TargetObjectKeyFormatArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLoggingV2State.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLoggingV2TargetObjectKeyFormatArgs.builder
      builder.targetObjectKeyFormat(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketLoggingV2TargetGrantArgs.Builder)
    /**
     * @param grantee Configuration block for the person being granted permissions. See below.
     * @return builder
     */
    inline def grantee(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLoggingV2TargetGrantGranteeArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLoggingV2TargetGrantArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLoggingV2TargetGrantGranteeArgs.builder
      builder.grantee(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketLoggingV2TargetObjectKeyFormatArgs.Builder)
    /**
     * @param partitionedPrefix Partitioned S3 key for log objects, in the form `[targetPrefix][SourceAccountId]/[SourceRegion]/[SourceBucket]/[YYYY]/[MM]/[DD]/[YYYY]-[MM]-[DD]-[hh]-[mm]-[ss]-[UniqueString]`. Conflicts with `simplePrefix`. See below.
     * @return builder
     */
    inline def partitionedPrefix(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLoggingV2TargetObjectKeyFormatPartitionedPrefixArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLoggingV2TargetObjectKeyFormatArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLoggingV2TargetObjectKeyFormatPartitionedPrefixArgs.builder
      builder.partitionedPrefix(args(argsBuilder).build)

    /**
     * @param simplePrefix Use the simple format for S3 keys for log objects, in the form `[targetPrefix][YYYY]-[MM]-[DD]-[hh]-[mm]-[ss]-[UniqueString]`. To use, set `simplePrefix {}`. Conflicts with `partitionedPrefix`.
     * @return builder
     */
    inline def simplePrefix(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLoggingV2TargetObjectKeyFormatSimplePrefixArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLoggingV2TargetObjectKeyFormatArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLoggingV2TargetObjectKeyFormatSimplePrefixArgs.builder
      builder.simplePrefix(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationArgs.Builder)
    /**
     * @param destinations Destination information for the S3 Metadata configuration. See `destination` Block for details.
     * @return builder
     */
    inline def destinations(args: Endofunction[com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationDestinationArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

    /**
     * @param inventoryTableConfiguration Inventory table configuration. See `inventoryTableConfiguration` Block for details.
     * @return builder
     */
    inline def inventoryTableConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationInventoryTableConfigurationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationInventoryTableConfigurationArgs.builder
      builder.inventoryTableConfiguration(args(argsBuilder).build)

    /**
     * @param journalTableConfiguration Journal table configuration. See `journalTableConfiguration` Block for details.
     * @return builder
     */
    inline def journalTableConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationJournalTableConfigurationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationJournalTableConfigurationArgs.builder
      builder.journalTableConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationInventoryTableConfigurationArgs.Builder)
    /**
     * @param encryptionConfiguration Encryption configuration for the inventory table. See `encryptionConfiguration` Block for details.
     * @return builder
     */
    inline def encryptionConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationInventoryTableConfigurationEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationInventoryTableConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationInventoryTableConfigurationEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationJournalTableConfigurationArgs.Builder)
    /**
     * @param encryptionConfiguration Encryption configuration for the journal table. See `encryptionConfiguration` Block for details.
     * @return builder
     */
    inline def encryptionConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationJournalTableConfigurationEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationJournalTableConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationJournalTableConfigurationEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

    /**
     * @param recordExpiration Journal table record expiration settings. See `recordExpiration` Block for details.
     * @return builder
     */
    inline def recordExpiration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationJournalTableConfigurationRecordExpirationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationJournalTableConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationJournalTableConfigurationRecordExpirationArgs.builder
      builder.recordExpiration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketMetadataConfigurationState.Builder)
    /**
     * @param metadataConfiguration Metadata configuration. See `metadataConfiguration` Block for details.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def metadataConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketMetadataConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationArgs.builder
      builder.metadataConfiguration(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.s3.inputs.BucketMetadataConfigurationTimeoutsArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketMetadataConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketMetadataConfigurationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketMetricState.Builder)
    /**
     * @param filter [Object filtering](http://docs.aws.amazon.com/AmazonS3/latest/dev/metrics-configurations.html#metrics-configurations-filter) that accepts a prefix, tags, or a logical AND of prefix and tags. See below.
     * @return builder
     */
    inline def filter(args: Endofunction[com.pulumi.aws.s3.inputs.BucketMetricFilterArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketMetricState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketMetricFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketNotificationState.Builder)
    /**
     * @param lambdaFunctions Notification configuration to a Lambda Function. See below.
     * @return builder
     */
    inline def lambdaFunctions(args: Endofunction[com.pulumi.aws.s3.inputs.BucketNotificationLambdaFunctionArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketNotificationState.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketNotificationLambdaFunctionArgs.builder
      builder.lambdaFunctions(args.map(_(argsBuilder).build)*)

    /**
     * @param queues Notification configuration to SQS Queue. See below.
     * @return builder
     */
    inline def queues(args: Endofunction[com.pulumi.aws.s3.inputs.BucketNotificationQueueArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketNotificationState.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketNotificationQueueArgs.builder
      builder.queues(args.map(_(argsBuilder).build)*)

    /**
     * @param topics Notification configuration to SNS Topic. See below.
     * @return builder
     */
    inline def topics(args: Endofunction[com.pulumi.aws.s3.inputs.BucketNotificationTopicArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketNotificationState.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketNotificationTopicArgs.builder
      builder.topics(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationArgs.Builder)
    /**
     * @param rule Object Lock rule in place for this bucket. See `object_lock_configuration.rule` Block below for details.
     * @return builder
     * @deprecated rule is deprecated. Use the aws.s3.BucketObjectLockConfiguration resource instead.
     */
    @deprecated("rule is deprecated. Use the aws.s3.BucketObjectLockConfiguration resource instead.") inline def rule(args: Endofunction[com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationRuleArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationRuleArgs.builder
      builder.rule(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationRuleArgs.Builder)
    /**
     * @param defaultRetention Configuration block for specifying the default Object Lock retention settings for new objects placed in the specified bucket. See below.
     * @return builder
     */
    inline def defaultRetention(args: Endofunction[com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationRuleDefaultRetentionArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationRuleDefaultRetentionArgs.builder
      builder.defaultRetention(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationState.Builder)
    /**
     * @param rule Configuration block for specifying the Object Lock rule for the specified object. See below.
     * @return builder
     */
    inline def rule(args: Endofunction[com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationRuleArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationRuleArgs.builder
      builder.rule(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationV2RuleArgs.Builder)
    /**
     * @param defaultRetention Configuration block for specifying the default Object Lock retention settings for new objects placed in the specified bucket. See below.
     * @return builder
     */
    inline def defaultRetention(args: Endofunction[com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationV2RuleDefaultRetentionArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationV2RuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationV2RuleDefaultRetentionArgs.builder
      builder.defaultRetention(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationV2State.Builder)
    /**
     * @param rule Configuration block for specifying the Object Lock rule for the specified object. See below.
     * @return builder
     */
    inline def rule(args: Endofunction[com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationV2RuleArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationV2State.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationV2RuleArgs.builder
      builder.rule(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketObjectv2OverrideProviderArgs.Builder)
    /**
     * @param defaultTags Override the provider `defaultTags` configuration block. See `defaultTags` Block below for more details.
     * @return builder
     */
    inline def defaultTags(args: Endofunction[com.pulumi.aws.s3.inputs.BucketObjectv2OverrideProviderDefaultTagsArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketObjectv2OverrideProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketObjectv2OverrideProviderDefaultTagsArgs.builder
      builder.defaultTags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketObjectv2State.Builder)
    /**
     * @param overrideProvider Override provider-level configuration options. See `overrideProvider` Block below for more details.
     * @return builder
     */
    inline def overrideProvider(args: Endofunction[com.pulumi.aws.s3.inputs.BucketObjectv2OverrideProviderArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketObjectv2State.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketObjectv2OverrideProviderArgs.builder
      builder.overrideProvider(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketOwnershipControlsState.Builder)
    /**
     * @param rule Configuration block(s) with Ownership Controls rules. Detailed below.
     * @return builder
     */
    inline def rule(args: Endofunction[com.pulumi.aws.s3.inputs.BucketOwnershipControlsRuleArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketOwnershipControlsState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketOwnershipControlsRuleArgs.builder
      builder.rule(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketPolicyState.Builder)
    /**
     * @param policy Text of the policy. Although this is a bucket policy rather than an IAM policy, the `aws.iam.getPolicyDocument` data source may be used, so long as it specifies a principal. For more information about building AWS IAM policy documents, see the AWS IAM Policy Document Guide. Note: Bucket policies are limited to 20 KB in size.
     * @return builder
     */
    inline def policy(args: Endofunction[com.pulumi.aws.s3.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketPolicyState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleArgs.Builder)
    /**
     * @param deleteMarkerReplication Whether delete markers are replicated. This argument is only valid with V2 replication configurations (i.e., when `filter` is used)documented below.
     * @return builder
     */
    inline def deleteMarkerReplication(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDeleteMarkerReplicationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDeleteMarkerReplicationArgs.builder
      builder.deleteMarkerReplication(args(argsBuilder).build)

    /**
     * @param destination Destination for the rule. See below.
     * @return builder
     */
    inline def destination(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

    /**
     * @param existingObjectReplication Replicate existing objects in the source bucket according to the rule configurations. See below.
     * @return builder
     */
    inline def existingObjectReplication(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleExistingObjectReplicationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleExistingObjectReplicationArgs.builder
      builder.existingObjectReplication(args(argsBuilder).build)

    /**
     * @param filter Filter that identifies subset of objects to which the replication rule applies. See below. If not specified, the `rule` will default to using `prefix`.
     * @return builder
     */
    inline def filter(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleFilterArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param sourceSelectionCriteria Special object selection criteria. See below.
     * @return builder
     */
    inline def sourceSelectionCriteria(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleSourceSelectionCriteriaArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleSourceSelectionCriteriaArgs.builder
      builder.sourceSelectionCriteria(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationArgs.Builder)
    /**
     * @param accessControlTranslation Configuration block that specifies the overrides to use for object owners on replication. See below. Specify this only in a cross-account scenario (where source and destination bucket owners are not the same), and you want to change replica ownership to the AWS account that owns the destination bucket. If this is not specified in the replication configuration, the replicas are owned by same AWS account that owns the source object. Must be used in conjunction with `account` owner override configuration.
     * @return builder
     */
    inline def accessControlTranslation(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationAccessControlTranslationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationAccessControlTranslationArgs.builder
      builder.accessControlTranslation(args(argsBuilder).build)

    /**
     * @param encryptionConfiguration Configuration block that provides information about encryption. See below. If `sourceSelectionCriteria` is specified, you must specify this element.
     * @return builder
     */
    inline def encryptionConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

    /**
     * @param metrics Configuration block that specifies replication metrics-related settings enabling replication metrics and events. See below.
     * @return builder
     */
    inline def metrics(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationMetricsArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationMetricsArgs.builder
      builder.metrics(args(argsBuilder).build)

    /**
     * @param replicationTime Configuration block that specifies S3 Replication Time Control (S3 RTC), including whether S3 RTC is enabled and the time when all objects and operations on objects must be replicated. See below. Replication Time Control must be used in conjunction with `metrics`.
     * @return builder
     */
    inline def replicationTime(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationReplicationTimeArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationReplicationTimeArgs.builder
      builder.replicationTime(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationMetricsArgs.Builder)
    /**
     * @param eventThreshold Configuration block that specifies the time threshold for emitting the `s3:Replication:OperationMissedThreshold` event. See below.
     * @return builder
     */
    inline def eventThreshold(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationMetricsEventThresholdArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationMetricsArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationMetricsEventThresholdArgs.builder
      builder.eventThreshold(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationReplicationTimeArgs.Builder)
    /**
     * @param time Configuration block specifying the time by which replication should be complete for all objects and operations on objects. See below.
     * @return builder
     */
    inline def time(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationReplicationTimeTimeArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationReplicationTimeArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationReplicationTimeTimeArgs.builder
      builder.time(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleFilterArgs.Builder)
    /**
     * @param and Configuration block for specifying rule filters. This element is required only if you specify more than one filter. See and below for more details.
     * @return builder
     */
    inline def and(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleFilterAndArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleFilterArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleFilterAndArgs.builder
      builder.and(args(argsBuilder).build)

    /**
     * @param tag Configuration block for specifying a tag key and value. See below.
     * @return builder
     */
    inline def tag(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleFilterTagArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleFilterArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleFilterTagArgs.builder
      builder.tag(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleSourceSelectionCriteriaArgs.Builder)
    /**
     * @param replicaModifications Configuration block that you can specify for selections for modifications on replicas. Amazon S3 doesn&#39;t replicate replica modifications by default. In the latest version of replication configuration (when `filter` is specified), you can specify this element and set the status to `Enabled` to replicate modifications on replicas.
     * @return builder
     */
    inline def replicaModifications(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleSourceSelectionCriteriaReplicaModificationsArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleSourceSelectionCriteriaArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleSourceSelectionCriteriaReplicaModificationsArgs.builder
      builder.replicaModifications(args(argsBuilder).build)

    /**
     * @param sseKmsEncryptedObjects Configuration block for filter information for the selection of Amazon S3 objects encrypted with AWS KMS. If specified, `replicaKmsKeyId` in `destination` `encryptionConfiguration` must be specified as well.
     * @return builder
     */
    inline def sseKmsEncryptedObjects(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleSourceSelectionCriteriaArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsArgs.builder
      builder.sseKmsEncryptedObjects(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketReplicationConfigState.Builder)
    /**
     * @param rules List of configuration blocks describing the rules managing the replication. See below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigState.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketReplicationConfigurationArgs.Builder)
    /**
     * @param rules Rules managing the replication. See `rules` Block below for details.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleArgs.Builder)
    /**
     * @param destination Destination for the rule. See `destination` Block below for details.
     * @return builder
     */
    inline def destination(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleDestinationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

    /**
     * @param filter Filter that identifies subset of objects to which the replication rule applies. See `filter` Block below for details.
     * @return builder
     */
    inline def filter(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleFilterArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param sourceSelectionCriteria Special object selection criteria. See `sourceSelectionCriteria` Block below for details.
     * @return builder
     */
    inline def sourceSelectionCriteria(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleSourceSelectionCriteriaArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleSourceSelectionCriteriaArgs.builder
      builder.sourceSelectionCriteria(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleDestinationArgs.Builder)
    /**
     * @param accessControlTranslation Overrides to use for object owners on replication. See `accessControlTranslation` Block below for details. Must be used in conjunction with `accountId` owner override configuration.
     * @return builder
     */
    inline def accessControlTranslation(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleDestinationAccessControlTranslationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleDestinationAccessControlTranslationArgs.builder
      builder.accessControlTranslation(args(argsBuilder).build)

    /**
     * @param metrics Enables replication metrics (required for S3 RTC). See `metrics` Block below for details.
     * @return builder
     */
    inline def metrics(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleDestinationMetricsArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleDestinationMetricsArgs.builder
      builder.metrics(args(argsBuilder).build)

    /**
     * @param replicationTime Enables S3 Replication Time Control (S3 RTC). See `replicationTime` Block below for details.
     * @return builder
     */
    inline def replicationTime(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleDestinationReplicationTimeArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleDestinationReplicationTimeArgs.builder
      builder.replicationTime(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleSourceSelectionCriteriaArgs.Builder)
    /**
     * @param sseKmsEncryptedObjects Match SSE-KMS encrypted objects. See `sseKmsEncryptedObjects` Block below for details. If specified, `replicaKmsKeyId` in `destination` must be specified as well.
     * @return builder
     */
    inline def sseKmsEncryptedObjects(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectsArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleSourceSelectionCriteriaArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectsArgs.builder
      builder.sseKmsEncryptedObjects(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationArgs.Builder)
    /**
     * @param rule Single object for server-side encryption by default configuration. See `server_side_encryption_configuration.rule` Block below for details.
     * @return builder
     */
    inline def rule(args: Endofunction[com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationRuleArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationRuleArgs.builder
      builder.rule(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationRuleArgs.Builder)
    /**
     * @param applyServerSideEncryptionByDefault Single object for setting server-side encryption by default. See below.
     * @return builder
     */
    inline def applyServerSideEncryptionByDefault(args: Endofunction[com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefaultArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefaultArgs.builder
      builder.applyServerSideEncryptionByDefault(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationState.Builder)
    /**
     * @param rules Set of server-side encryption configuration rules. See below. Currently, only a single rule is supported.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationRuleArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationV2RuleArgs.Builder)
    /**
     * @param applyServerSideEncryptionByDefault Single object for setting server-side encryption by default. See below.
     * @return builder
     */
    inline def applyServerSideEncryptionByDefault(args: Endofunction[com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationV2RuleApplyServerSideEncryptionByDefaultArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationV2RuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationV2RuleApplyServerSideEncryptionByDefaultArgs.builder
      builder.applyServerSideEncryptionByDefault(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationV2State.Builder)
    /**
     * @param rules Set of server-side encryption configuration rules. See below. Currently, only a single rule is supported.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationV2RuleArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationV2State.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationV2RuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketState.Builder)
    /**
     * @param corsRules Rule of [Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html). See `corsRule` Block below for details. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketCorsConfiguration` instead.
     * @return builder
     * @deprecated cors_rule is deprecated. Use the aws.s3.BucketCorsConfiguration resource instead.
     */
    @deprecated("cors_rule is deprecated. Use the aws.s3.BucketCorsConfiguration resource instead.") inline def corsRules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketCorsRuleArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketState.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketCorsRuleArgs.builder
      builder.corsRules(args.map(_(argsBuilder).build)*)

    /**
     * @param grants [ACL policy grant](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#sample-acl). See `grant` Block below for details. Conflicts with `acl`. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketAcl` instead.
     * @return builder
     * @deprecated grant is deprecated. Use the aws.s3.BucketAcl resource instead.
     */
    @deprecated("grant is deprecated. Use the aws.s3.BucketAcl resource instead.") inline def grants(args: Endofunction[com.pulumi.aws.s3.inputs.BucketGrantArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketState.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketGrantArgs.builder
      builder.grants(args.map(_(argsBuilder).build)*)

    /**
     * @param lifecycleRules Configuration of [object lifecycle management](http://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html). See `lifecycleRule` Block below for details. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketLifecycleConfiguration` instead.
     * @return builder
     * @deprecated lifecycle_rule is deprecated. Use the aws.s3.BucketLifecycleConfiguration resource instead.
     */
    @deprecated("lifecycle_rule is deprecated. Use the aws.s3.BucketLifecycleConfiguration resource instead.") inline def lifecycleRules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleRuleArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketState.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleRuleArgs.builder
      builder.lifecycleRules(args.map(_(argsBuilder).build)*)

    /**
     * @param logging Configuration of [S3 bucket logging](https://docs.aws.amazon.com/AmazonS3/latest/UG/ManagingBucketLogging.html) parameters. See `logging` Block below for details. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketLogging` instead.
     * @return builder
     * @deprecated logging is deprecated. Use the aws.s3.BucketLogging resource instead.
     */
    @deprecated("logging is deprecated. Use the aws.s3.BucketLogging resource instead.") inline def logging(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLoggingArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLoggingArgs.builder
      builder.logging(args(argsBuilder).build)

    /**
     * @param objectLockConfiguration Configuration of [S3 object locking](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html). See `objectLockConfiguration` Block below for details. The provider will only perform drift detection if a configuration value is provided. Use the `objectLockEnabled` parameter and the resource `aws.s3.BucketObjectLockConfiguration` instead.
     * @return builder
     * @deprecated object_lock_configuration is deprecated. Use the top-level parameter objectLockEnabled and the aws.s3.BucketObjectLockConfiguration resource instead.
     */
    @deprecated("object_lock_configuration is deprecated. Use the top-level parameter objectLockEnabled and the aws.s3.BucketObjectLockConfiguration resource instead.") inline def objectLockConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationArgs.builder
      builder.objectLockConfiguration(args(argsBuilder).build)

    /**
     * @param policy Valid [bucket policy](https://docs.aws.amazon.com/AmazonS3/latest/dev/example-bucket-policies.html) JSON document. Note that if the policy document is not specific enough (but still valid), this provider may view the policy as constantly changing. In this case, please make sure you use the verbose/specific version of the policy. For more information about building AWS IAM policy documents with this provider, see the AWS IAM Policy Document Guide. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketPolicy` instead.
     * @return builder
     * @deprecated policy is deprecated. Use the aws.s3.BucketPolicy resource instead.
     */
    @deprecated("policy is deprecated. Use the aws.s3.BucketPolicy resource instead.") inline def policy(args: Endofunction[com.pulumi.aws.s3.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

    /**
     * @param replicationConfiguration Configuration of [replication configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html). See `replicationConfiguration` Block below for details. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketReplicationConfig` instead.
     * @return builder
     * @deprecated replication_configuration is deprecated. Use the aws.s3.BucketReplicationConfig resource instead.
     */
    @deprecated("replication_configuration is deprecated. Use the aws.s3.BucketReplicationConfig resource instead.") inline def replicationConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigurationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigurationArgs.builder
      builder.replicationConfiguration(args(argsBuilder).build)

    /**
     * @param serverSideEncryptionConfiguration Configuration of [server-side encryption configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html). See `serverSideEncryptionConfiguration` Block below for details. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketServerSideEncryptionConfiguration` instead.
     * @return builder
     * @deprecated server_side_encryption_configuration is deprecated. Use the aws.s3.BucketServerSideEncryptionConfiguration resource instead.
     */
    @deprecated("server_side_encryption_configuration is deprecated. Use the aws.s3.BucketServerSideEncryptionConfiguration resource instead.") inline def serverSideEncryptionConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationArgs.builder
      builder.serverSideEncryptionConfiguration(args(argsBuilder).build)

    /**
     * @param versioning Configuration of the [S3 bucket versioning state](https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html). See `versioning` Block below for details. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketVersioning` instead.
     * @return builder
     * @deprecated versioning is deprecated. Use the aws.s3.BucketVersioning resource instead.
     */
    @deprecated("versioning is deprecated. Use the aws.s3.BucketVersioning resource instead.") inline def versioning(args: Endofunction[com.pulumi.aws.s3.inputs.BucketVersioningArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketVersioningArgs.builder
      builder.versioning(args(argsBuilder).build)

    /**
     * @param website Configuration of the [S3 bucket website](https://docs.aws.amazon.com/AmazonS3/latest/userguide/WebsiteHosting.html). See `website` Block below for details. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketWebsiteConfiguration` instead.
     * @return builder
     * @deprecated website is deprecated. Use the aws.s3.BucketWebsiteConfiguration resource instead.
     */
    @deprecated("website is deprecated. Use the aws.s3.BucketWebsiteConfiguration resource instead.") inline def website(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteArgs.builder
      builder.website(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketV2LifecycleRuleArgs.Builder)
    /**
     * @param expirations Configuration of the object expiration. See `expiration` Block below for details.
     * @return builder
     */
    inline def expirations(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2LifecycleRuleExpirationArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2LifecycleRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2LifecycleRuleExpirationArgs.builder
      builder.expirations(args.map(_(argsBuilder).build)*)

    /**
     * @param noncurrentVersionExpirations When noncurrent object versions expire. See `noncurrentVersionExpiration` Block below for details.
     * @return builder
     */
    inline def noncurrentVersionExpirations(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2LifecycleRuleNoncurrentVersionExpirationArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2LifecycleRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2LifecycleRuleNoncurrentVersionExpirationArgs.builder
      builder.noncurrentVersionExpirations(args.map(_(argsBuilder).build)*)

    /**
     * @param noncurrentVersionTransitions When noncurrent object versions transition. See `noncurrentVersionTransition` Block below for details.
     * @return builder
     */
    inline def noncurrentVersionTransitions(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2LifecycleRuleNoncurrentVersionTransitionArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2LifecycleRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2LifecycleRuleNoncurrentVersionTransitionArgs.builder
      builder.noncurrentVersionTransitions(args.map(_(argsBuilder).build)*)

    /**
     * @param transitions Configuration of the object transition. See `transition` Block below for details.
     * @return builder
     */
    inline def transitions(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2LifecycleRuleTransitionArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2LifecycleRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2LifecycleRuleTransitionArgs.builder
      builder.transitions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketV2ObjectLockConfigurationArgs.Builder)
    /**
     * @param rules Object Lock rule in place for this bucket. See `object_lock_configuration.rule` Block below for details.
     * @return builder
     * @deprecated rule is deprecated. Use the aws.s3.BucketObjectLockConfiguration resource instead.
     */
    @deprecated("rule is deprecated. Use the aws.s3.BucketObjectLockConfiguration resource instead.") inline def rules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2ObjectLockConfigurationRuleArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2ObjectLockConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2ObjectLockConfigurationRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketV2ObjectLockConfigurationRuleArgs.Builder)
    /**
     * @param defaultRetentions Default retention period that you want to apply to new objects placed in this bucket. See `defaultRetention` Block below for details.
     * @return builder
     */
    inline def defaultRetentions(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2ObjectLockConfigurationRuleDefaultRetentionArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2ObjectLockConfigurationRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2ObjectLockConfigurationRuleDefaultRetentionArgs.builder
      builder.defaultRetentions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationArgs.Builder)
    /**
     * @param rules Rules managing the replication. See `rules` Block below for details.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleArgs.Builder)
    /**
     * @param destinations Destination for the rule. See `destination` Block below for details.
     * @return builder
     */
    inline def destinations(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleDestinationArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

    /**
     * @param filters Filter that identifies subset of objects to which the replication rule applies. See `filter` Block below for details.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleFilterArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceSelectionCriterias Special object selection criteria. See `sourceSelectionCriteria` Block below for details.
     * @return builder
     */
    inline def sourceSelectionCriterias(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleSourceSelectionCriteriaArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleSourceSelectionCriteriaArgs.builder
      builder.sourceSelectionCriterias(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleDestinationArgs.Builder)
    /**
     * @param accessControlTranslations Overrides to use for object owners on replication. See `accessControlTranslation` Block below for details. Must be used in conjunction with `accountId` owner override configuration.
     * @return builder
     */
    inline def accessControlTranslations(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleDestinationAccessControlTranslationArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleDestinationArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleDestinationAccessControlTranslationArgs.builder
      builder.accessControlTranslations(args.map(_(argsBuilder).build)*)

    /**
     * @param metrics Enables replication metrics (required for S3 RTC). See `metrics` Block below for details.
     * @return builder
     */
    inline def metrics(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleDestinationMetricArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleDestinationArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleDestinationMetricArgs.builder
      builder.metrics(args.map(_(argsBuilder).build)*)

    /**
     * @param replicationTimes Enables S3 Replication Time Control (S3 RTC). See `replicationTime` Block below for details.
     * @return builder
     */
    inline def replicationTimes(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleDestinationReplicationTimeArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleDestinationArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleDestinationReplicationTimeArgs.builder
      builder.replicationTimes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleSourceSelectionCriteriaArgs.Builder)
    /**
     * @param sseKmsEncryptedObjects Match SSE-KMS encrypted objects. See `sseKmsEncryptedObjects` Block below for details. If specified, `replicaKmsKeyId` in `destination` must be specified as well.
     * @return builder
     */
    inline def sseKmsEncryptedObjects(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleSourceSelectionCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectArgs.builder
      builder.sseKmsEncryptedObjects(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketV2ServerSideEncryptionConfigurationArgs.Builder)
    /**
     * @param rules Single object for server-side encryption by default configuration. See `server_side_encryption_configuration.rule` Block below for details.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2ServerSideEncryptionConfigurationRuleArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2ServerSideEncryptionConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2ServerSideEncryptionConfigurationRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketV2ServerSideEncryptionConfigurationRuleArgs.Builder)
    /**
     * @param applyServerSideEncryptionByDefaults Single object for setting server-side encryption by default. See `applyServerSideEncryptionByDefault` Block below for details.
     * @return builder
     */
    inline def applyServerSideEncryptionByDefaults(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2ServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefaultArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2ServerSideEncryptionConfigurationRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2ServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefaultArgs.builder
      builder.applyServerSideEncryptionByDefaults(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketV2State.Builder)
    /**
     * @param corsRules Rule of [Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html). See `corsRule` Block below for details. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketCorsConfiguration` instead.
     * @return builder
     * @deprecated cors_rule is deprecated. Use the aws.s3.BucketCorsConfiguration resource instead.
     */
    @deprecated("cors_rule is deprecated. Use the aws.s3.BucketCorsConfiguration resource instead.") inline def corsRules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2CorsRuleArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2State.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2CorsRuleArgs.builder
      builder.corsRules(args.map(_(argsBuilder).build)*)

    /**
     * @param grants [ACL policy grant](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#sample-acl). See `grant` Block below for details. Conflicts with `acl`. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketAcl` instead.
     * @return builder
     * @deprecated grant is deprecated. Use the aws.s3.BucketAcl resource instead.
     */
    @deprecated("grant is deprecated. Use the aws.s3.BucketAcl resource instead.") inline def grants(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2GrantArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2State.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2GrantArgs.builder
      builder.grants(args.map(_(argsBuilder).build)*)

    /**
     * @param lifecycleRules Configuration of [object lifecycle management](http://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html). See `lifecycleRule` Block below for details. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketLifecycleConfiguration` instead.
     * @return builder
     * @deprecated lifecycle_rule is deprecated. Use the aws.s3.BucketLifecycleConfiguration resource instead.
     */
    @deprecated("lifecycle_rule is deprecated. Use the aws.s3.BucketLifecycleConfiguration resource instead.") inline def lifecycleRules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2LifecycleRuleArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2State.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2LifecycleRuleArgs.builder
      builder.lifecycleRules(args.map(_(argsBuilder).build)*)

    /**
     * @param loggings Configuration of [S3 bucket logging](https://docs.aws.amazon.com/AmazonS3/latest/UG/ManagingBucketLogging.html) parameters. See `logging` Block below for details. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketLogging` instead.
     * @return builder
     * @deprecated logging is deprecated. Use the aws.s3.BucketLogging resource instead.
     */
    @deprecated("logging is deprecated. Use the aws.s3.BucketLogging resource instead.") inline def loggings(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2LoggingArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2State.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2LoggingArgs.builder
      builder.loggings(args.map(_(argsBuilder).build)*)

    /**
     * @param objectLockConfiguration Configuration of [S3 object locking](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html). See `objectLockConfiguration` Block below for details. The provider will only perform drift detection if a configuration value is provided. Use the `objectLockEnabled` parameter and the resource `aws.s3.BucketObjectLockConfiguration` instead.
     * @return builder
     * @deprecated object_lock_configuration is deprecated. Use the top-level parameter objectLockEnabled and the aws.s3.BucketObjectLockConfiguration resource instead.
     */
    @deprecated("object_lock_configuration is deprecated. Use the top-level parameter objectLockEnabled and the aws.s3.BucketObjectLockConfiguration resource instead.") inline def objectLockConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2ObjectLockConfigurationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketV2State.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketV2ObjectLockConfigurationArgs.builder
      builder.objectLockConfiguration(args(argsBuilder).build)

    /**
     * @param replicationConfigurations Configuration of [replication configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html). See `replicationConfiguration` Block below for details. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketReplicationConfig` instead.
     * @return builder
     * @deprecated replication_configuration is deprecated. Use the aws.s3.BucketReplicationConfig resource instead.
     */
    @deprecated("replication_configuration is deprecated. Use the aws.s3.BucketReplicationConfig resource instead.") inline def replicationConfigurations(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2State.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationArgs.builder
      builder.replicationConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param serverSideEncryptionConfigurations Configuration of [server-side encryption configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html). See `serverSideEncryptionConfiguration` Block below for details. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketServerSideEncryptionConfiguration` instead.
     * @return builder
     * @deprecated server_side_encryption_configuration is deprecated. Use the aws.s3.BucketServerSideEncryptionConfiguration resource instead.
     */
    @deprecated("server_side_encryption_configuration is deprecated. Use the aws.s3.BucketServerSideEncryptionConfiguration resource instead.") inline def serverSideEncryptionConfigurations(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2ServerSideEncryptionConfigurationArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2State.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2ServerSideEncryptionConfigurationArgs.builder
      builder.serverSideEncryptionConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param versionings Configuration of the [S3 bucket versioning state](https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html). See `versioning` Block below for details. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketVersioning` instead.
     * @return builder
     * @deprecated versioning is deprecated. Use the aws.s3.BucketVersioning resource instead.
     */
    @deprecated("versioning is deprecated. Use the aws.s3.BucketVersioning resource instead.") inline def versionings(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2VersioningArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2State.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2VersioningArgs.builder
      builder.versionings(args.map(_(argsBuilder).build)*)

    /**
     * @param websites Configuration of the [S3 bucket website](https://docs.aws.amazon.com/AmazonS3/latest/userguide/WebsiteHosting.html). See `website` Block below for details. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketWebsiteConfiguration` instead.
     * @return builder
     * @deprecated website is deprecated. Use the aws.s3.BucketWebsiteConfiguration resource instead.
     */
    @deprecated("website is deprecated. Use the aws.s3.BucketWebsiteConfiguration resource instead.") inline def websites(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2WebsiteArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2State.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2WebsiteArgs.builder
      builder.websites(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketVersioningState.Builder)
    /**
     * @param versioningConfiguration Configuration block for the versioning parameters. See below.
     * @return builder
     */
    inline def versioningConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketVersioningVersioningConfigurationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketVersioningState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketVersioningVersioningConfigurationArgs.builder
      builder.versioningConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketVersioningV2State.Builder)
    /**
     * @param versioningConfiguration Configuration block for the versioning parameters. See below.
     * @return builder
     */
    inline def versioningConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketVersioningV2VersioningConfigurationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketVersioningV2State.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketVersioningV2VersioningConfigurationArgs.builder
      builder.versioningConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationRoutingRuleArgs.Builder)
    /**
     * @param condition Configuration block for describing a condition that must be met for the specified redirect to apply. See below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationRoutingRuleConditionArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationRoutingRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationRoutingRuleConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param redirect Configuration block for redirect information. See below.
     * @return builder
     */
    inline def redirect(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationRoutingRuleRedirectArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationRoutingRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationRoutingRuleRedirectArgs.builder
      builder.redirect(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationState.Builder)
    /**
     * @param errorDocument Name of the error document for the website. See below.
     * @return builder
     */
    inline def errorDocument(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationErrorDocumentArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationErrorDocumentArgs.builder
      builder.errorDocument(args(argsBuilder).build)

    /**
     * @param indexDocument Name of the index document for the website. See below.
     * @return builder
     */
    inline def indexDocument(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationIndexDocumentArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationIndexDocumentArgs.builder
      builder.indexDocument(args(argsBuilder).build)

    /**
     * @param redirectAllRequestsTo Redirect behavior for every request to this bucket&#39;s website endpoint. See below. Conflicts with `errorDocument`, `indexDocument`, and `routingRule`.
     * @return builder
     */
    inline def redirectAllRequestsTo(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationRedirectAllRequestsToArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationRedirectAllRequestsToArgs.builder
      builder.redirectAllRequestsTo(args(argsBuilder).build)

    /**
     * @param routingRules List of rules that define when a redirect is applied and the redirect behavior. See below.
     * @return builder
     */
    inline def routingRules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationRoutingRuleArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationRoutingRuleArgs.builder
      builder.routingRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2RoutingRuleArgs.Builder)
    /**
     * @param condition Configuration block for describing a condition that must be met for the specified redirect to apply. See below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2RoutingRuleConditionArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2RoutingRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2RoutingRuleConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param redirect Configuration block for redirect information. See below.
     * @return builder
     */
    inline def redirect(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2RoutingRuleRedirectArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2RoutingRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2RoutingRuleRedirectArgs.builder
      builder.redirect(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2State.Builder)
    /**
     * @param errorDocument Name of the error document for the website. See below.
     * @return builder
     */
    inline def errorDocument(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2ErrorDocumentArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2State.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2ErrorDocumentArgs.builder
      builder.errorDocument(args(argsBuilder).build)

    /**
     * @param indexDocument Name of the index document for the website. See below.
     * @return builder
     */
    inline def indexDocument(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2IndexDocumentArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2State.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2IndexDocumentArgs.builder
      builder.indexDocument(args(argsBuilder).build)

    /**
     * @param redirectAllRequestsTo Redirect behavior for every request to this bucket&#39;s website endpoint. See below. Conflicts with `errorDocument`, `indexDocument`, and `routingRule`.
     * @return builder
     */
    inline def redirectAllRequestsTo(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2RedirectAllRequestsToArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2State.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2RedirectAllRequestsToArgs.builder
      builder.redirectAllRequestsTo(args(argsBuilder).build)

    /**
     * @param routingRules List of rules that define when a redirect is applied and the redirect behavior. See below.
     * @return builder
     */
    inline def routingRules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2RoutingRuleArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2State.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2RoutingRuleArgs.builder
      builder.routingRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.DirectoryBucketState.Builder)
    /**
     * @param location Bucket location. See Location below for more details.
     * @return builder
     */
    inline def location(args: Endofunction[com.pulumi.aws.s3.inputs.DirectoryBucketLocationArgs.Builder]):
        com.pulumi.aws.s3.inputs.DirectoryBucketState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.DirectoryBucketLocationArgs.builder
      builder.location(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.FilesAccessPointRootDirectoryArgs.Builder)
    /**
     * @param creationPermissions Permissions to set when creating the root directory. See `creationPermissions` below. Changing this value forces replacement.
     * @return builder
     */
    inline def creationPermissions(args: Endofunction[com.pulumi.aws.s3.inputs.FilesAccessPointRootDirectoryCreationPermissionArgs.Builder]*):
        com.pulumi.aws.s3.inputs.FilesAccessPointRootDirectoryArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.FilesAccessPointRootDirectoryCreationPermissionArgs.builder
      builder.creationPermissions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.FilesAccessPointState.Builder)
    /**
     * @param posixUsers POSIX user configuration. See `posixUser` below. Changing this value forces replacement.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def posixUsers(args: Endofunction[com.pulumi.aws.s3.inputs.FilesAccessPointPosixUserArgs.Builder]*):
        com.pulumi.aws.s3.inputs.FilesAccessPointState.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.FilesAccessPointPosixUserArgs.builder
      builder.posixUsers(args.map(_(argsBuilder).build)*)

    /**
     * @param rootDirectories Root directory configuration. See `rootDirectory` below. Changing this value forces replacement.
     * @return builder
     */
    inline def rootDirectories(args: Endofunction[com.pulumi.aws.s3.inputs.FilesAccessPointRootDirectoryArgs.Builder]*):
        com.pulumi.aws.s3.inputs.FilesAccessPointState.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.FilesAccessPointRootDirectoryArgs.builder
      builder.rootDirectories(args.map(_(argsBuilder).build)*)

    inline def timeouts(args: Endofunction[com.pulumi.aws.s3.inputs.FilesAccessPointTimeoutsArgs.Builder]):
        com.pulumi.aws.s3.inputs.FilesAccessPointState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.FilesAccessPointTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.FilesFileSystemState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.s3.inputs.FilesFileSystemTimeoutsArgs.Builder]):
        com.pulumi.aws.s3.inputs.FilesFileSystemState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.FilesFileSystemTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.FilesMountTargetState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.s3.inputs.FilesMountTargetTimeoutsArgs.Builder]):
        com.pulumi.aws.s3.inputs.FilesMountTargetState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.FilesMountTargetTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.FilesSynchronizationConfigurationState.Builder)
    /**
     * @param expirationDataRules Expiration data rule configuration. See `expirationDataRule` below.
     * @return builder
     */
    inline def expirationDataRules(args: Endofunction[com.pulumi.aws.s3.inputs.FilesSynchronizationConfigurationExpirationDataRuleArgs.Builder]*):
        com.pulumi.aws.s3.inputs.FilesSynchronizationConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.FilesSynchronizationConfigurationExpirationDataRuleArgs.builder
      builder.expirationDataRules(args.map(_(argsBuilder).build)*)

    /**
     * @param importDataRules One or more import data rules. See `importDataRule` below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def importDataRules(args: Endofunction[com.pulumi.aws.s3.inputs.FilesSynchronizationConfigurationImportDataRuleArgs.Builder]*):
        com.pulumi.aws.s3.inputs.FilesSynchronizationConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.FilesSynchronizationConfigurationImportDataRuleArgs.builder
      builder.importDataRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.GetFilesAccessPointArgs.Builder)
    /**
     * @param posixUsers POSIX user configuration. See `posixUser` below.
     * @return builder
     */
    inline def posixUsers(args: Endofunction[com.pulumi.aws.s3.inputs.GetFilesAccessPointPosixUserArgs.Builder]*):
        com.pulumi.aws.s3.inputs.GetFilesAccessPointArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.GetFilesAccessPointPosixUserArgs.builder
      builder.posixUsers(args.map(_(argsBuilder).build)*)

    /**
     * @param rootDirectories Root directory configuration. See `rootDirectory` below.
     * @return builder
     */
    inline def rootDirectories(args: Endofunction[com.pulumi.aws.s3.inputs.GetFilesAccessPointRootDirectoryArgs.Builder]*):
        com.pulumi.aws.s3.inputs.GetFilesAccessPointArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.GetFilesAccessPointRootDirectoryArgs.builder
      builder.rootDirectories(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.GetFilesAccessPointPlainArgs.Builder)
    /**
     * @param posixUsers POSIX user configuration. See `posixUser` below.
     * @return builder
     */
    inline def posixUsers(args: Endofunction[com.pulumi.aws.s3.inputs.GetFilesAccessPointPosixUser.Builder]*):
        com.pulumi.aws.s3.inputs.GetFilesAccessPointPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.GetFilesAccessPointPosixUser.builder
      builder.posixUsers(args.map(_(argsBuilder).build)*)

    /**
     * @param rootDirectories Root directory configuration. See `rootDirectory` below.
     * @return builder
     */
    inline def rootDirectories(args: Endofunction[com.pulumi.aws.s3.inputs.GetFilesAccessPointRootDirectory.Builder]*):
        com.pulumi.aws.s3.inputs.GetFilesAccessPointPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.GetFilesAccessPointRootDirectory.builder
      builder.rootDirectories(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.GetFilesAccessPointRootDirectory.Builder)
    /**
     * @param creationPermissions Permissions set when the root directory was created. See `creationPermissions` below.
     * @return builder
     */
    inline def creationPermissions(args: Endofunction[com.pulumi.aws.s3.inputs.GetFilesAccessPointRootDirectoryCreationPermission.Builder]*):
        com.pulumi.aws.s3.inputs.GetFilesAccessPointRootDirectory.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.GetFilesAccessPointRootDirectoryCreationPermission.builder
      builder.creationPermissions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.GetFilesAccessPointRootDirectoryArgs.Builder)
    /**
     * @param creationPermissions Permissions set when the root directory was created. See `creationPermissions` below.
     * @return builder
     */
    inline def creationPermissions(args: Endofunction[com.pulumi.aws.s3.inputs.GetFilesAccessPointRootDirectoryCreationPermissionArgs.Builder]*):
        com.pulumi.aws.s3.inputs.GetFilesAccessPointRootDirectoryArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.GetFilesAccessPointRootDirectoryCreationPermissionArgs.builder
      builder.creationPermissions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.GetFilesFileSystemsArgs.Builder)
    /**
     * @param fileSystems List of file systems. See `fileSystems` below.
     * @return builder
     */
    inline def fileSystems(args: Endofunction[com.pulumi.aws.s3.inputs.GetFilesFileSystemsFileSystemArgs.Builder]*):
        com.pulumi.aws.s3.inputs.GetFilesFileSystemsArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.GetFilesFileSystemsFileSystemArgs.builder
      builder.fileSystems(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.GetFilesFileSystemsPlainArgs.Builder)
    /**
     * @param fileSystems List of file systems. See `fileSystems` below.
     * @return builder
     */
    inline def fileSystems(args: Endofunction[com.pulumi.aws.s3.inputs.GetFilesFileSystemsFileSystem.Builder]*):
        com.pulumi.aws.s3.inputs.GetFilesFileSystemsPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.GetFilesFileSystemsFileSystem.builder
      builder.fileSystems(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.InventoryDestinationArgs.Builder)
    /**
     * @param bucket S3 bucket configuration where inventory results are published. See `bucket` Block below.
     * @return builder
     */
    inline def bucket(args: Endofunction[com.pulumi.aws.s3.inputs.InventoryDestinationBucketArgs.Builder]):
        com.pulumi.aws.s3.inputs.InventoryDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.InventoryDestinationBucketArgs.builder
      builder.bucket(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.InventoryDestinationBucketArgs.Builder)
    /**
     * @param encryption Type of server-side encryption to use to encrypt the inventory. See `encryption` Block below.
     * @return builder
     */
    inline def encryption(args: Endofunction[com.pulumi.aws.s3.inputs.InventoryDestinationBucketEncryptionArgs.Builder]):
        com.pulumi.aws.s3.inputs.InventoryDestinationBucketArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.InventoryDestinationBucketEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.InventoryDestinationBucketEncryptionArgs.Builder)
    /**
     * @param sseKms Server-side encryption with AWS KMS-managed keys to encrypt the inventory file. See `sseKms` Block below.
     * @return builder
     */
    inline def sseKms(args: Endofunction[com.pulumi.aws.s3.inputs.InventoryDestinationBucketEncryptionSseKmsArgs.Builder]):
        com.pulumi.aws.s3.inputs.InventoryDestinationBucketEncryptionArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.InventoryDestinationBucketEncryptionSseKmsArgs.builder
      builder.sseKms(args(argsBuilder).build)

    /**
     * @param sseS3 Server-side encryption with Amazon S3-managed keys (SSE-S3) to encrypt the inventory file.
     * @return builder
     */
    inline def sseS3(args: Endofunction[com.pulumi.aws.s3.inputs.InventoryDestinationBucketEncryptionSseS3Args.Builder]):
        com.pulumi.aws.s3.inputs.InventoryDestinationBucketEncryptionArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.InventoryDestinationBucketEncryptionSseS3Args.builder
      builder.sseS3(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.InventoryState.Builder)
    /**
     * @param destination Where to publish the inventory results. See `destination` Block below.
     * @return builder
     */
    inline def destination(args: Endofunction[com.pulumi.aws.s3.inputs.InventoryDestinationArgs.Builder]):
        com.pulumi.aws.s3.inputs.InventoryState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.InventoryDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

    /**
     * @param filter Inventory filter. The inventory only includes objects that meet the filter&#39;s criteria. See `filter` Block below.
     * @return builder
     */
    inline def filter(args: Endofunction[com.pulumi.aws.s3.inputs.InventoryFilterArgs.Builder]):
        com.pulumi.aws.s3.inputs.InventoryState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.InventoryFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param schedule Schedule for generating inventory results. See `schedule` Block below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def schedule(args: Endofunction[com.pulumi.aws.s3.inputs.InventoryScheduleArgs.Builder]):
        com.pulumi.aws.s3.inputs.InventoryState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.InventoryScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.ObjectCopyOverrideProviderArgs.Builder)
    /**
     * @param defaultTags Configuration block to override the provider `defaultTags` configuration block. See `defaultTags` Block below.
     * @return builder
     */
    inline def defaultTags(args: Endofunction[com.pulumi.aws.s3.inputs.ObjectCopyOverrideProviderDefaultTagsArgs.Builder]):
        com.pulumi.aws.s3.inputs.ObjectCopyOverrideProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.ObjectCopyOverrideProviderDefaultTagsArgs.builder
      builder.defaultTags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.ObjectCopyState.Builder)
    /**
     * @param grants Configuration block for header grants. Documented below. Conflicts with `acl`.
     * @return builder
     */
    inline def grants(args: Endofunction[com.pulumi.aws.s3.inputs.ObjectCopyGrantArgs.Builder]*):
        com.pulumi.aws.s3.inputs.ObjectCopyState.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.ObjectCopyGrantArgs.builder
      builder.grants(args.map(_(argsBuilder).build)*)

    inline def overrideProvider(args: Endofunction[com.pulumi.aws.s3.inputs.ObjectCopyOverrideProviderArgs.Builder]):
        com.pulumi.aws.s3.inputs.ObjectCopyState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.ObjectCopyOverrideProviderArgs.builder
      builder.overrideProvider(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.PolicyDocumentArgs.Builder)
    inline def Statement(args: Endofunction[com.pulumi.aws.iam.inputs.PolicyStatementArgs.Builder]*):
        com.pulumi.aws.s3.inputs.PolicyDocumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.iam.inputs.PolicyStatementArgs.builder
      builder.Statement(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.VectorsIndexState.Builder)
    /**
     * @param encryptionConfigurations Block for encryption configuration for the vector index. See `encryptionConfiguration` Block below.
     * @return builder
     */
    inline def encryptionConfigurations(args: Endofunction[com.pulumi.aws.s3.inputs.VectorsIndexEncryptionConfigurationArgs.Builder]*):
        com.pulumi.aws.s3.inputs.VectorsIndexState.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.VectorsIndexEncryptionConfigurationArgs.builder
      builder.encryptionConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param metadataConfiguration Block for metadata configuration for the vector index. See `metadataConfiguration` Block below.
     * @return builder
     */
    inline def metadataConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.VectorsIndexMetadataConfigurationArgs.Builder]):
        com.pulumi.aws.s3.inputs.VectorsIndexState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.VectorsIndexMetadataConfigurationArgs.builder
      builder.metadataConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.VectorsVectorBucketState.Builder)
    /**
     * @param encryptionConfigurations Encryption configuration for the vector bucket. See `encryptionConfiguration` below for more details.
     * @return builder
     */
    inline def encryptionConfigurations(args: Endofunction[com.pulumi.aws.s3.inputs.VectorsVectorBucketEncryptionConfigurationArgs.Builder]*):
        com.pulumi.aws.s3.inputs.VectorsVectorBucketState.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.VectorsVectorBucketEncryptionConfigurationArgs.builder
      builder.encryptionConfigurations(args.map(_(argsBuilder).build)*)
