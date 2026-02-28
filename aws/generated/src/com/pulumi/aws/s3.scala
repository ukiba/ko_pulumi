package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object s3:
  extension (builder: com.pulumi.aws.s3.BucketWebsiteConfigurationV2Args.Builder)
    /**
     * @param errorDocument Name of the error document for the website. See below.
     * @return builder
     */
    def errorDocument(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2ErrorDocumentArgs.Builder]):
        com.pulumi.aws.s3.BucketWebsiteConfigurationV2Args.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2ErrorDocumentArgs.builder
      builder.errorDocument(args(argsBuilder).build)

    /**
     * @param indexDocument Name of the index document for the website. See below.
     * @return builder
     */
    def indexDocument(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2IndexDocumentArgs.Builder]):
        com.pulumi.aws.s3.BucketWebsiteConfigurationV2Args.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2IndexDocumentArgs.builder
      builder.indexDocument(args(argsBuilder).build)

    /**
     * @param redirectAllRequestsTo Redirect behavior for every request to this bucket&#39;s website endpoint. See below. Conflicts with `errorDocument`, `indexDocument`, and `routingRule`.
     * @return builder
     */
    def redirectAllRequestsTo(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2RedirectAllRequestsToArgs.Builder]):
        com.pulumi.aws.s3.BucketWebsiteConfigurationV2Args.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2RedirectAllRequestsToArgs.builder
      builder.redirectAllRequestsTo(args(argsBuilder).build)

    /**
     * @param routingRules List of rules that define when a redirect is applied and the redirect behavior. See below.
     * @return builder
     */
    def routingRules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2RoutingRuleArgs.Builder]*):
        com.pulumi.aws.s3.BucketWebsiteConfigurationV2Args.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2RoutingRuleArgs.builder
      builder.routingRules(args.map(_(argsBuilder).build)*)

  /**
   * Provides an S3 bucket accelerate configuration resource. See the [Requirements for using Transfer Acceleration](https://docs.aws.amazon.com/AmazonS3/latest/userguide/transfer-acceleration.html#transfer-acceleration-requirements) for more details.
   *  
   *  &gt; This resource cannot be used with S3 directory buckets.
   */
  def BucketAccelerateConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketAccelerateConfigurationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.s3.BucketAccelerateConfigurationArgs.builder
    
    com.pulumi.aws.s3.BucketAccelerateConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a S3 Bucket Notification Configuration. For additional information, see the [Configuring S3 Event Notifications section in the Amazon S3 Developer Guide](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html).
   *  
   *  &gt; **NOTE:** S3 Buckets only support a single notification configuration resource. Declaring multiple `aws.s3.BucketNotification` resources to the same S3 Bucket will cause a perpetual difference in configuration. This resource will overwrite any existing event notifications configured for the S3 bucket it&#39;s associated with. See the example &#34;Trigger multiple Lambda functions&#34; for an option of how to configure multiple triggers within this resource.
   *  
   *  &gt; This resource cannot be used with S3 directory buckets.
   */
  def BucketNotification(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketNotificationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.s3.BucketNotificationArgs.builder
    
    com.pulumi.aws.s3.BucketNotification(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an S3 bucket ACL resource.
   *  
   *  &gt; **Note:** destroy does not delete the S3 Bucket ACL but does remove the resource from state.
   *  
   *  &gt; This resource cannot be used with S3 directory buckets.
   */
  def BucketAcl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketAclArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.s3.BucketAclArgs.builder
    
    com.pulumi.aws.s3.BucketAcl(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a resource to manage an S3 Access Point.
   *  
   *  &gt; **NOTE on Access Points and Access Point Policies:** This provider provides both a standalone Access Point Policy resource and an Access Point resource with a resource policy defined in-line. You cannot use an Access Point with in-line resource policy in conjunction with an Access Point Policy resource. Doing so will cause a conflict of policies and will overwrite the access point&#39;s resource policy.
   *  
   *  &gt; Advanced usage: To use a custom API endpoint for this resource, use the `s3control` endpoint provider configuration), not the `s3` endpoint provider configuration.
   *  
   *  &gt; This resource can be used with s3 directory buckets. Please see [AWS Documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points-directory-buckets.html) for more information.
   */
  def AccessPoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.AccessPointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.s3.AccessPointArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.s3.AccessPoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.s3.BucketAclArgs.Builder)
    /**
     * @param accessControlPolicy Configuration block that sets the ACL permissions for an object per grantee. See below.
     * @return builder
     */
    def accessControlPolicy(args: Endofunction[com.pulumi.aws.s3.inputs.BucketAclAccessControlPolicyArgs.Builder]):
        com.pulumi.aws.s3.BucketAclArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketAclAccessControlPolicyArgs.builder
      builder.accessControlPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.AccessPointArgs.Builder)
    /**
     * @param publicAccessBlockConfiguration Configuration block to manage the `PublicAccessBlock` configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration options in any combination. Detailed below.
     * @return builder
     */
    def publicAccessBlockConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.AccessPointPublicAccessBlockConfigurationArgs.Builder]):
        com.pulumi.aws.s3.AccessPointArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.AccessPointPublicAccessBlockConfigurationArgs.builder
      builder.publicAccessBlockConfiguration(args(argsBuilder).build)

    /**
     * @param vpcConfiguration Configuration block to restrict access to this access point to requests from the specified Virtual Private Cloud (VPC). Required for S3 on Outposts. Detailed below.
     * @return builder
     */
    def vpcConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.AccessPointVpcConfigurationArgs.Builder]):
        com.pulumi.aws.s3.AccessPointArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.AccessPointVpcConfigurationArgs.builder
      builder.vpcConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.BucketServerSideEncryptionConfigurationArgs.Builder)
    /**
     * @param rules Set of server-side encryption configuration rules. See below. Currently, only a single rule is supported.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationRuleArgs.Builder]*):
        com.pulumi.aws.s3.BucketServerSideEncryptionConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.BucketV2Args.Builder)
    /**
     * @param corsRules Rule of [Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html). See CORS rule below for details. This provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketCorsConfiguration` instead.
     * @return builder
     * @deprecated cors_rule is deprecated. Use the aws.s3.BucketCorsConfiguration resource instead.
     */
    @deprecated def corsRules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2CorsRuleArgs.Builder]*):
        com.pulumi.aws.s3.BucketV2Args.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2CorsRuleArgs.builder
      builder.corsRules(args.map(_(argsBuilder).build)*)

    /**
     * @param grants An [ACL policy grant](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#sample-acl). See Grant below for details. Conflicts with `acl`. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketAcl` instead.
     * @return builder
     * @deprecated grant is deprecated. Use the aws.s3.BucketAcl resource instead.
     */
    @deprecated def grants(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2GrantArgs.Builder]*):
        com.pulumi.aws.s3.BucketV2Args.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2GrantArgs.builder
      builder.grants(args.map(_(argsBuilder).build)*)

    /**
     * @param lifecycleRules Configuration of [object lifecycle management](http://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html). See Lifecycle Rule below for details. The provider will only perform drift detection if a configuration value is provided.
     *  Use the resource `aws.s3.BucketLifecycleConfiguration` instead.
     * @return builder
     * @deprecated lifecycle_rule is deprecated. Use the aws.s3.BucketLifecycleConfiguration resource instead.
     */
    @deprecated def lifecycleRules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2LifecycleRuleArgs.Builder]*):
        com.pulumi.aws.s3.BucketV2Args.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2LifecycleRuleArgs.builder
      builder.lifecycleRules(args.map(_(argsBuilder).build)*)

    /**
     * @param loggings Configuration of [S3 bucket logging](https://docs.aws.amazon.com/AmazonS3/latest/UG/ManagingBucketLogging.html) parameters. See Logging below for details. The provider will only perform drift detection if a configuration value is provided.
     *  Use the resource `aws.s3.BucketLogging` instead.
     * @return builder
     * @deprecated logging is deprecated. Use the aws.s3.BucketLogging resource instead.
     */
    @deprecated def loggings(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2LoggingArgs.Builder]*):
        com.pulumi.aws.s3.BucketV2Args.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2LoggingArgs.builder
      builder.loggings(args.map(_(argsBuilder).build)*)

    /**
     * @param objectLockConfiguration Configuration of [S3 object locking](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html). See Object Lock Configuration below for details.
     *  The provider wil only perform drift detection if a configuration value is provided.
     *  Use the `objectLockEnabled` parameter and the resource `aws.s3.BucketObjectLockConfiguration` instead.
     * @return builder
     * @deprecated object_lock_configuration is deprecated. Use the top-level parameter objectLockEnabled and the aws.s3.BucketObjectLockConfiguration resource instead.
     */
    @deprecated def objectLockConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2ObjectLockConfigurationArgs.Builder]):
        com.pulumi.aws.s3.BucketV2Args.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketV2ObjectLockConfigurationArgs.builder
      builder.objectLockConfiguration(args(argsBuilder).build)

    /**
     * @param replicationConfigurations Configuration of [replication configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html). See Replication Configuration below for details. The provider will only perform drift detection if a configuration value is provided.
     *  Use the resource `aws.s3.BucketReplicationConfig` instead.
     * @return builder
     * @deprecated replication_configuration is deprecated. Use the aws.s3.BucketReplicationConfig resource instead.
     */
    @deprecated def replicationConfigurations(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationArgs.Builder]*):
        com.pulumi.aws.s3.BucketV2Args.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationArgs.builder
      builder.replicationConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param serverSideEncryptionConfigurations Configuration of [server-side encryption configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html). See Server Side Encryption Configuration below for details.
     *  The provider will only perform drift detection if a configuration value is provided.
     *  Use the resource `aws.s3.BucketServerSideEncryptionConfiguration` instead.
     * @return builder
     * @deprecated server_side_encryption_configuration is deprecated. Use the aws.s3.BucketServerSideEncryptionConfiguration resource instead.
     */
    @deprecated def serverSideEncryptionConfigurations(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2ServerSideEncryptionConfigurationArgs.Builder]*):
        com.pulumi.aws.s3.BucketV2Args.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2ServerSideEncryptionConfigurationArgs.builder
      builder.serverSideEncryptionConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param versionings Configuration of the [S3 bucket versioning state](https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html). See Versioning below for details. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketVersioning` instead.
     * @return builder
     * @deprecated versioning is deprecated. Use the aws.s3.BucketVersioning resource instead.
     */
    @deprecated def versionings(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2VersioningArgs.Builder]*):
        com.pulumi.aws.s3.BucketV2Args.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2VersioningArgs.builder
      builder.versionings(args.map(_(argsBuilder).build)*)

    /**
     * @param websites Configuration of the [S3 bucket website](https://docs.aws.amazon.com/AmazonS3/latest/userguide/WebsiteHosting.html). See Website below for details. The provider will only perform drift detection if a configuration value is provided.
     *  Use the resource `aws.s3.BucketWebsiteConfiguration` instead.
     * @return builder
     * @deprecated website is deprecated. Use the aws.s3.BucketWebsiteConfiguration resource instead.
     */
    @deprecated def websites(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2WebsiteArgs.Builder]*):
        com.pulumi.aws.s3.BucketV2Args.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2WebsiteArgs.builder
      builder.websites(args.map(_(argsBuilder).build)*)

  /**
   * Provides an S3 bucket Object Lock configuration resource. For more information about Object Locking, go to [Using S3 Object Lock](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock.html) in the Amazon S3 User Guide.
   *  
   *  &gt; This resource can be used enable Object Lock for **new** and **existing** buckets.
   *  
   *  &gt; This resource cannot be used with S3 directory buckets.
   */
  @deprecated() def BucketObjectLockConfigurationV2(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketObjectLockConfigurationV2Args.Builder]) =
    val argsBuilder = com.pulumi.aws.s3.BucketObjectLockConfigurationV2Args.builder
    
    com.pulumi.aws.s3.BucketObjectLockConfigurationV2(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an S3 object resource. */
  def BucketObject(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketObjectArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.s3.BucketObjectArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.s3.BucketObject(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.s3.BucketObjectLockConfigurationV2Args.Builder)
    /**
     * @param rule Configuration block for specifying the Object Lock rule for the specified object. See below.
     * @return builder
     */
    def rule(args: Endofunction[com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationV2RuleArgs.Builder]):
        com.pulumi.aws.s3.BucketObjectLockConfigurationV2Args.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationV2RuleArgs.builder
      builder.rule(args(argsBuilder).build)

  /**
   * Provides an [S3 Intelligent-Tiering](https://docs.aws.amazon.com/AmazonS3/latest/userguide/intelligent-tiering.html) configuration resource.
   *  
   *  &gt; This resource cannot be used with S3 directory buckets.
   */
  def BucketIntelligentTieringConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketIntelligentTieringConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.s3.BucketIntelligentTieringConfigurationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.s3.BucketIntelligentTieringConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.s3.BucketServerSideEncryptionConfigurationV2Args.Builder)
    /**
     * @param rules Set of server-side encryption configuration rules. See below. Currently, only a single rule is supported.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationV2RuleArgs.Builder]*):
        com.pulumi.aws.s3.BucketServerSideEncryptionConfigurationV2Args.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationV2RuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  /**
   * Provides an S3 bucket (server access) logging resource. For more information, see [Logging requests using server access logging](https://docs.aws.amazon.com/AmazonS3/latest/userguide/ServerLogs.html)
   *  in the AWS S3 User Guide.
   *  
   *  &gt; **Note:** Amazon S3 supports server access logging, AWS CloudTrail, or a combination of both. Refer to the [Logging options for Amazon S3](https://docs.aws.amazon.com/AmazonS3/latest/userguide/logging-with-S3.html)
   *  to decide which method meets your requirements.
   *  
   *  &gt; This resource cannot be used with S3 directory buckets.
   */
  @deprecated() def BucketLoggingV2(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketLoggingV2Args.Builder]) =
    val argsBuilder = com.pulumi.aws.s3.BucketLoggingV2Args.builder
    
    com.pulumi.aws.s3.BucketLoggingV2(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.s3.VectorsVectorBucketArgs.Builder)
    /**
     * @param encryptionConfigurations Encryption configuration for the vector bucket. See Encryption Configuration below for more details.
     * @return builder
     */
    def encryptionConfigurations(args: Endofunction[com.pulumi.aws.s3.inputs.VectorsVectorBucketEncryptionConfigurationArgs.Builder]*):
        com.pulumi.aws.s3.VectorsVectorBucketArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.VectorsVectorBucketEncryptionConfigurationArgs.builder
      builder.encryptionConfigurations(args.map(_(argsBuilder).build)*)

  /**
   * Provides a S3 bucket [metrics configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/metrics-configurations.html) resource.
   *  
   *  &gt; This resource cannot be used with S3 directory buckets.
   */
  def BucketMetric(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketMetricArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.s3.BucketMetricArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.s3.BucketMetric(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an independent configuration resource for S3 bucket [lifecycle configuration](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lifecycle-mgmt.html).
   *  
   *  An S3 Lifecycle configuration consists of one or more Lifecycle rules. Each rule consists of the following:
   *  
   *  * Rule metadata (`id` and `status`)
   *  * Filter identifying objects to which the rule applies
   *  * One or more transition or expiration actions
   *  
   *  For more information see the Amazon S3 User Guide on [`Lifecycle Configuration Elements`](https://docs.aws.amazon.com/AmazonS3/latest/userguide/intro-lifecycle-rules.html).
   *  
   *  &gt; S3 Buckets only support a single lifecycle configuration. Declaring multiple `aws.s3.BucketLifecycleConfiguration` resources to the same S3 Bucket will cause a perpetual difference in configuration.
   *  
   *  &gt; Lifecycle configurations may take some time to fully propagate to all AWS S3 systems.
   *  Running Pulumi operations shortly after creating a lifecycle configuration may result in changes that affect configuration idempotence.
   *  See the Amazon S3 User Guide on [setting lifecycle configuration on a bucket](https://docs.aws.amazon.com/AmazonS3/latest/userguide/how-to-set-lifecycle-configuration-intro.html).
   */
  @deprecated() def BucketLifecycleConfigurationV2(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketLifecycleConfigurationV2Args.Builder]) =
    val argsBuilder = com.pulumi.aws.s3.BucketLifecycleConfigurationV2Args.builder
    
    com.pulumi.aws.s3.BucketLifecycleConfigurationV2(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an Amazon S3 Vectors Vector Bucket. */
  def VectorsVectorBucket(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.VectorsVectorBucketArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.s3.VectorsVectorBucketArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.s3.VectorsVectorBucket(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.s3.BucketPolicyArgs.Builder)
    /**
     * @param policy Text of the policy. Although this is a bucket policy rather than an IAM policy, the `aws.iam.getPolicyDocument` data source may be used, so long as it specifies a principal. For more information about building AWS IAM policy documents, see the AWS IAM Policy Document Guide. Note: Bucket policies are limited to 20 KB in size.
     * @return builder
     */
    def policy(args: Endofunction[com.pulumi.aws.s3.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.s3.BucketPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.BucketVersioningArgs.Builder)
    /**
     * @param versioningConfiguration Configuration block for the versioning parameters. See below.
     * @return builder
     */
    def versioningConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketVersioningVersioningConfigurationArgs.Builder]):
        com.pulumi.aws.s3.BucketVersioningArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketVersioningVersioningConfigurationArgs.builder
      builder.versioningConfiguration(args(argsBuilder).build)

  /**
   * Provides a S3 bucket [inventory configuration](https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-inventory.html) resource.
   *  
   *  &gt; This resource cannot be used with S3 directory buckets.
   */
  def Inventory(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.InventoryArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.s3.InventoryArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.s3.Inventory(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.s3.BucketLoggingV2Args.Builder)
    /**
     * @param targetGrants Set of configuration blocks with information for granting permissions. See below.
     * @return builder
     */
    def targetGrants(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLoggingV2TargetGrantArgs.Builder]*):
        com.pulumi.aws.s3.BucketLoggingV2Args.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketLoggingV2TargetGrantArgs.builder
      builder.targetGrants(args.map(_(argsBuilder).build)*)

    /**
     * @param targetObjectKeyFormat Amazon S3 key format for log objects. See below.
     * @return builder
     */
    def targetObjectKeyFormat(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLoggingV2TargetObjectKeyFormatArgs.Builder]):
        com.pulumi.aws.s3.BucketLoggingV2Args.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLoggingV2TargetObjectKeyFormatArgs.builder
      builder.targetObjectKeyFormat(args(argsBuilder).build)

  /**
   * Provides a resource to manage S3 Bucket Ownership Controls. For more information, see the [S3 Developer Guide](https://docs.aws.amazon.com/AmazonS3/latest/dev/about-object-ownership.html).
   *  
   *  &gt; This resource cannot be used with S3 directory buckets.
   */
  def BucketOwnershipControls(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketOwnershipControlsArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.s3.BucketOwnershipControlsArgs.builder
    
    com.pulumi.aws.s3.BucketOwnershipControls(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.s3.BucketLifecycleConfigurationV2Args.Builder)
    /**
     * @param rules List of configuration blocks describing the rules managing the replication. See below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleArgs.Builder]*):
        com.pulumi.aws.s3.BucketLifecycleConfigurationV2Args.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2TimeoutsArgs.Builder]):
        com.pulumi.aws.s3.BucketLifecycleConfigurationV2Args.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2TimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /**
   * Provides a resource for controlling versioning on an S3 bucket.
   *  Deleting this resource will either suspend versioning on the associated S3 bucket or
   *  simply remove the resource from state if the associated S3 bucket is unversioned.
   *  
   *  For more information, see [How S3 versioning works](https://docs.aws.amazon.com/AmazonS3/latest/userguide/manage-versioning-examples.html).
   *  
   *  &gt; **NOTE:** If you are enabling versioning on the bucket for the first time, AWS recommends that you wait for 15 minutes after enabling versioning before issuing write operations (PUT or DELETE) on objects in the bucket.
   *  
   *  &gt; This resource cannot be used with S3 directory buckets.
   */
  @deprecated() def BucketVersioningV2(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketVersioningV2Args.Builder]) =
    val argsBuilder = com.pulumi.aws.s3.BucketVersioningV2Args.builder
    
    com.pulumi.aws.s3.BucketVersioningV2(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a resource for copying an S3 object. */
  def ObjectCopy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.ObjectCopyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.s3.ObjectCopyArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.s3.ObjectCopy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an S3 bucket CORS configuration resource. For more information about CORS, go to [Enabling Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/userguide/cors.html) in the Amazon S3 User Guide.
   *  
   *  &gt; **NOTE:** S3 Buckets only support a single CORS configuration. Declaring multiple `aws.s3.BucketCorsConfiguration` resources to the same S3 Bucket will cause a perpetual difference in configuration.
   *  
   *  &gt; This resource cannot be used with S3 directory buckets.
   */
  def BucketCorsConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketCorsConfigurationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.s3.BucketCorsConfigurationArgs.builder
    
    com.pulumi.aws.s3.BucketCorsConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an S3 object resource. */
  def BucketObjectv2(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketObjectv2Args.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.s3.BucketObjectv2Args.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.s3.BucketObjectv2(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.s3.BucketObjectLockConfigurationArgs.Builder)
    /**
     * @param rule Configuration block for specifying the Object Lock rule for the specified object. See below.
     * @return builder
     */
    def rule(args: Endofunction[com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationRuleArgs.Builder]):
        com.pulumi.aws.s3.BucketObjectLockConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationRuleArgs.builder
      builder.rule(args(argsBuilder).build)

  /**
   * Provides an independent configuration resource for S3 bucket [replication configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html).
   *  
   *  &gt; **NOTE:** S3 Buckets only support a single replication configuration. Declaring multiple `aws.s3.BucketReplicationConfig` resources to the same S3 Bucket will cause a perpetual difference in configuration.
   *  
   *  &gt; This resource cannot be used with S3 directory buckets.
   */
  def BucketReplicationConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketReplicationConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.s3.BucketReplicationConfigArgs.builder
    
    com.pulumi.aws.s3.BucketReplicationConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.s3.BucketCorsConfigurationV2Args.Builder)
    /**
     * @param corsRules Set of origins and methods (cross-origin access that you want to allow). See below. You can configure up to 100 rules.
     * @return builder
     */
    def corsRules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketCorsConfigurationV2CorsRuleArgs.Builder]*):
        com.pulumi.aws.s3.BucketCorsConfigurationV2Args.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketCorsConfigurationV2CorsRuleArgs.builder
      builder.corsRules(args.map(_(argsBuilder).build)*)

  /**
   * Provides an S3 bucket accelerate configuration resource. See the [Requirements for using Transfer Acceleration](https://docs.aws.amazon.com/AmazonS3/latest/userguide/transfer-acceleration.html#transfer-acceleration-requirements) for more details.
   *  
   *  &gt; This resource cannot be used with S3 directory buckets.
   */
  @deprecated() def BucketAccelerateConfigurationV2(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketAccelerateConfigurationV2Args.Builder]) =
    val argsBuilder = com.pulumi.aws.s3.BucketAccelerateConfigurationV2Args.builder
    
    com.pulumi.aws.s3.BucketAccelerateConfigurationV2(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages S3 bucket-level Public Access Block configuration. For more information about these settings, see the [AWS S3 Block Public Access documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html).
   *  
   *  &gt; This resource cannot be used with S3 directory buckets.
   *  
   *  &gt; Setting `skipDestroy` to `true` means that the AWS Provider will not destroy a public access block, even when running `terraform destroy`. The configuration is thus an intentional dangling resource that is not managed by Terraform and will remain in-place in your AWS account.
   */
  def BucketPublicAccessBlock(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketPublicAccessBlockArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.s3.BucketPublicAccessBlockArgs.builder
    
    com.pulumi.aws.s3.BucketPublicAccessBlock(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an S3 bucket CORS configuration resource. For more information about CORS, go to [Enabling Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/userguide/cors.html) in the Amazon S3 User Guide.
   *  
   *  &gt; **NOTE:** S3 Buckets only support a single CORS configuration. Declaring multiple `aws.s3.BucketCorsConfiguration` resources to the same S3 Bucket will cause a perpetual difference in configuration.
   *  
   *  &gt; This resource cannot be used with S3 directory buckets.
   */
  @deprecated() def BucketCorsConfigurationV2(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketCorsConfigurationV2Args.Builder]) =
    val argsBuilder = com.pulumi.aws.s3.BucketCorsConfigurationV2Args.builder
    
    com.pulumi.aws.s3.BucketCorsConfigurationV2(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.s3.AnalyticsConfigurationArgs.Builder)
    /**
     * @param filter Object filtering that accepts a prefix, tags, or a logical AND of prefix and tags (documented below).
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.aws.s3.inputs.AnalyticsConfigurationFilterArgs.Builder]):
        com.pulumi.aws.s3.AnalyticsConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.AnalyticsConfigurationFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param storageClassAnalysis Configuration for the analytics data export (documented below).
     * @return builder
     */
    def storageClassAnalysis(args: Endofunction[com.pulumi.aws.s3.inputs.AnalyticsConfigurationStorageClassAnalysisArgs.Builder]):
        com.pulumi.aws.s3.AnalyticsConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.AnalyticsConfigurationStorageClassAnalysisArgs.builder
      builder.storageClassAnalysis(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.BucketArgs.Builder)
    /**
     * @param corsRules Rule of [Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html). See CORS rule below for details. This provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketCorsConfiguration` instead.
     * @return builder
     * @deprecated cors_rule is deprecated. Use the aws.s3.BucketCorsConfiguration resource instead.
     */
    @deprecated def corsRules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketCorsRuleArgs.Builder]*):
        com.pulumi.aws.s3.BucketArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketCorsRuleArgs.builder
      builder.corsRules(args.map(_(argsBuilder).build)*)

    /**
     * @param grants An [ACL policy grant](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#sample-acl). See Grant below for details. Conflicts with `acl`. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketAcl` instead.
     * @return builder
     * @deprecated grant is deprecated. Use the aws.s3.BucketAcl resource instead.
     */
    @deprecated def grants(args: Endofunction[com.pulumi.aws.s3.inputs.BucketGrantArgs.Builder]*):
        com.pulumi.aws.s3.BucketArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketGrantArgs.builder
      builder.grants(args.map(_(argsBuilder).build)*)

    /**
     * @param lifecycleRules Configuration of [object lifecycle management](http://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html). See Lifecycle Rule below for details. The provider will only perform drift detection if a configuration value is provided.
     *  Use the resource `aws.s3.BucketLifecycleConfiguration` instead.
     * @return builder
     * @deprecated lifecycle_rule is deprecated. Use the aws.s3.BucketLifecycleConfiguration resource instead.
     */
    @deprecated def lifecycleRules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleRuleArgs.Builder]*):
        com.pulumi.aws.s3.BucketArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleRuleArgs.builder
      builder.lifecycleRules(args.map(_(argsBuilder).build)*)

    /**
     * @param logging Configuration of [S3 bucket logging](https://docs.aws.amazon.com/AmazonS3/latest/UG/ManagingBucketLogging.html) parameters. See Logging below for details. The provider will only perform drift detection if a configuration value is provided.
     *  Use the resource `aws.s3.BucketLogging` instead.
     * @return builder
     * @deprecated logging is deprecated. Use the aws.s3.BucketLogging resource instead.
     */
    @deprecated def logging(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLoggingArgs.Builder]):
        com.pulumi.aws.s3.BucketArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLoggingArgs.builder
      builder.logging(args(argsBuilder).build)

    /**
     * @param objectLockConfiguration Configuration of [S3 object locking](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html). See Object Lock Configuration below for details.
     *  The provider wil only perform drift detection if a configuration value is provided.
     *  Use the `objectLockEnabled` parameter and the resource `aws.s3.BucketObjectLockConfiguration` instead.
     * @return builder
     * @deprecated object_lock_configuration is deprecated. Use the top-level parameter objectLockEnabled and the aws.s3.BucketObjectLockConfiguration resource instead.
     */
    @deprecated def objectLockConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationArgs.Builder]):
        com.pulumi.aws.s3.BucketArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationArgs.builder
      builder.objectLockConfiguration(args(argsBuilder).build)

    /**
     * @param policy Valid [bucket policy](https://docs.aws.amazon.com/AmazonS3/latest/dev/example-bucket-policies.html) JSON document. Note that if the policy document is not specific enough (but still valid), this provider may view the policy as constantly changing. In this case, please make sure you use the verbose/specific version of the policy. For more information about building AWS IAM policy documents with this provider, see the AWS IAM Policy Document Guide.
     *  The provider will only perform drift detection if a configuration value is provided.
     *  Use the resource `aws.s3.BucketPolicy` instead.
     * @return builder
     * @deprecated policy is deprecated. Use the aws.s3.BucketPolicy resource instead.
     */
    @deprecated def policy(args: Endofunction[com.pulumi.aws.s3.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.s3.BucketArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

    /**
     * @param replicationConfiguration Configuration of [replication configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html). See Replication Configuration below for details. The provider will only perform drift detection if a configuration value is provided.
     *  Use the resource `aws.s3.BucketReplicationConfig` instead.
     * @return builder
     * @deprecated replication_configuration is deprecated. Use the aws.s3.BucketReplicationConfig resource instead.
     */
    @deprecated def replicationConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigurationArgs.Builder]):
        com.pulumi.aws.s3.BucketArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigurationArgs.builder
      builder.replicationConfiguration(args(argsBuilder).build)

    /**
     * @param serverSideEncryptionConfiguration Configuration of [server-side encryption configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html). See Server Side Encryption Configuration below for details.
     *  The provider will only perform drift detection if a configuration value is provided.
     *  Use the resource `aws.s3.BucketServerSideEncryptionConfiguration` instead.
     * @return builder
     * @deprecated server_side_encryption_configuration is deprecated. Use the aws.s3.BucketServerSideEncryptionConfiguration resource instead.
     */
    @deprecated def serverSideEncryptionConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.s3.BucketArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationArgs.builder
      builder.serverSideEncryptionConfiguration(args(argsBuilder).build)

    /**
     * @param versioning Configuration of the [S3 bucket versioning state](https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html). See Versioning below for details. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketVersioning` instead.
     * @return builder
     * @deprecated versioning is deprecated. Use the aws.s3.BucketVersioning resource instead.
     */
    @deprecated def versioning(args: Endofunction[com.pulumi.aws.s3.inputs.BucketVersioningArgs.Builder]):
        com.pulumi.aws.s3.BucketArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketVersioningArgs.builder
      builder.versioning(args(argsBuilder).build)

    /**
     * @param website Configuration of the [S3 bucket website](https://docs.aws.amazon.com/AmazonS3/latest/userguide/WebsiteHosting.html). See Website below for details. The provider will only perform drift detection if a configuration value is provided.
     *  Use the resource `aws.s3.BucketWebsiteConfiguration` instead.
     * @return builder
     * @deprecated website is deprecated. Use the aws.s3.BucketWebsiteConfiguration resource instead.
     */
    @deprecated def website(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteArgs.Builder]):
        com.pulumi.aws.s3.BucketArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteArgs.builder
      builder.website(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.BucketLifecycleConfigurationArgs.Builder)
    /**
     * @param rules List of configuration blocks describing the rules managing the replication. See below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleArgs.Builder]*):
        com.pulumi.aws.s3.BucketLifecycleConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationTimeoutsArgs.Builder]):
        com.pulumi.aws.s3.BucketLifecycleConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.BucketObjectv2Args.Builder)
    /**
     * @param overrideProvider Override provider-level configuration options. See Override Provider below for more details.
     * @return builder
     */
    def overrideProvider(args: Endofunction[com.pulumi.aws.s3.inputs.BucketObjectv2OverrideProviderArgs.Builder]):
        com.pulumi.aws.s3.BucketObjectv2Args.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketObjectv2OverrideProviderArgs.builder
      builder.overrideProvider(args(argsBuilder).build)

  /**
   * Provides an S3 bucket website configuration resource. For more information, see [Hosting Websites on S3](https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html).
   *  
   *  &gt; This resource cannot be used with S3 directory buckets.
   */
  @deprecated() def BucketWebsiteConfigurationV2(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketWebsiteConfigurationV2Args.Builder]) =
    val argsBuilder = com.pulumi.aws.s3.BucketWebsiteConfigurationV2Args.builder
    
    com.pulumi.aws.s3.BucketWebsiteConfigurationV2(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.s3.BucketReplicationConfigArgs.Builder)
    /**
     * @param rules List of configuration blocks describing the rules managing the replication. See below.
     *  
     *  &gt; **NOTE:** Replication to multiple destination buckets requires that `priority` is specified in the `rule` object. If the corresponding rule requires no filter, an empty configuration block `filter {}` must be specified.
     *  
     *  &gt; **NOTE:** Amazon S3&#39;s latest version of the replication configuration is V2, which includes the `filter` attribute for replication rules.
     *  
     *  &gt; **NOTE:** The `existingObjectReplication` parameter is not supported by Amazon S3 at this time and should not be included in your `rule` configurations. Specifying this parameter will result in `MalformedXML` errors.
     *  To replicate existing objects, please refer to the [Replicating existing objects with S3 Batch Replication](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-batch-replication-batch.html) documentation in the Amazon S3 User Guide.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleArgs.Builder]*):
        com.pulumi.aws.s3.BucketReplicationConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  /**
   * Provides an S3 bucket request payment configuration resource. For more information, see [Requester Pays Buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html).
   *  
   *  &gt; **NOTE:** Destroying an `aws.s3.BucketRequestPaymentConfiguration` resource resets the bucket&#39;s `payer` to the S3 default: the bucket owner.
   *  
   *  &gt; This resource cannot be used with S3 directory buckets.
   */
  def BucketRequestPaymentConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketRequestPaymentConfigurationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.s3.BucketRequestPaymentConfigurationArgs.builder
    
    com.pulumi.aws.s3.BucketRequestPaymentConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Attaches a policy to an S3 bucket resource.
   *  
   *  &gt; Policies can be attached to both S3 general purpose buckets and S3 directory buckets.
   */
  def BucketPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.s3.BucketPolicyArgs.builder
    
    com.pulumi.aws.s3.BucketPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a S3 bucket resource.
   *  
   *  &gt; This resource provides functionality for managing S3 general purpose buckets in an AWS Partition. To manage Amazon S3 Express directory buckets, use the `awsDirectoryBucket` resource. To manage [S3 on Outposts](https://docs.aws.amazon.com/AmazonS3/latest/dev/S3onOutposts.html), use the `aws.s3control.Bucket` resource.
   *  
   *  &gt; Object Lock can be enabled by using the `objectLockEnable` attribute or by using the `aws.s3.BucketObjectLockConfiguration` resource. Please note, that by using the resource, Object Lock can be enabled/disabled without destroying and recreating the bucket.
   *  
   *  &gt; To support ABAC (Attribute Based Access Control) in general purpose buckets, this resource will now attempt to send tags in the create request and use the S3 Control tagging APIs [`TagResource`](https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_TagResource.html), [`UntagResource`](https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_UntagResource.html), and [`ListTagsForResource`](https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListTagsForResource.html) for read and update operations. The calling principal must have the corresponding `s3:TagResource`, `s3:UntagResource`, and `s3:ListTagsForResource` [IAM permissions](https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazons3.html#amazons3-actions-as-permissions). If the principal lacks the appropriate permissions, the provider will fall back to tagging after creation and using the S3 tagging APIs [`PutBucketTagging`](https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketTagging.html), [`DeleteBucketTagging`](https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketTagging.html), and [`GetBucketTagging`](https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketTagging.html) instead. With ABAC enabled, tag modifications may fail with the fall back behavior. See the [AWS documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/buckets-tagging-enable-abac.html) for additional details on enabling ABAC in general purpose buckets.
   */
  @deprecated() def BucketV2(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketV2Args.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.s3.BucketV2Args.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.s3.BucketV2(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages ABAC (Attribute Based Access Control) for an AWS S3 (Simple Storage) Bucket.
   *  See the [AWS documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/buckets-tagging-enable-abac.html) on enabling ABAC for general purpose buckets for additional information.
   */
  def BucketAbac(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketAbacArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.s3.BucketAbacArgs.builder
    
    com.pulumi.aws.s3.BucketAbac(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an S3 bucket request payment configuration resource. For more information, see [Requester Pays Buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html).
   *  
   *  &gt; **NOTE:** Destroying an `aws.s3.BucketRequestPaymentConfiguration` resource resets the bucket&#39;s `payer` to the S3 default: the bucket owner.
   *  
   *  &gt; This resource cannot be used with S3 directory buckets.
   */
  @deprecated() def BucketRequestPaymentConfigurationV2(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketRequestPaymentConfigurationV2Args.Builder]) =
    val argsBuilder = com.pulumi.aws.s3.BucketRequestPaymentConfigurationV2Args.builder
    
    com.pulumi.aws.s3.BucketRequestPaymentConfigurationV2(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type S3Functions = com.pulumi.aws.s3.S3Functions
  object S3Functions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.s3.S3Functions.*
  extension (self: S3Functions.type)
    /** Provides details about a specific S3 access point. */
    def getAccessPoint(args: Endofunction[com.pulumi.aws.s3.inputs.GetAccessPointArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.s3.outputs.GetAccessPointResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetAccessPointArgs.builder
      com.pulumi.aws.s3.S3Functions.getAccessPoint(args(argsBuilder).build)

    /** Provides details about a specific S3 access point. */
    def getAccessPointPlain(args: Endofunction[com.pulumi.aws.s3.inputs.GetAccessPointPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.s3.outputs.GetAccessPointResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetAccessPointPlainArgs.builder
      com.pulumi.aws.s3.S3Functions.getAccessPointPlain(args(argsBuilder).build)

    /** The S3 account public access block data source returns account-level public access block configuration. */
    def getAccountPublicAccessBlock(args: Endofunction[com.pulumi.aws.s3.inputs.GetAccountPublicAccessBlockArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.s3.outputs.GetAccountPublicAccessBlockResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetAccountPublicAccessBlockArgs.builder
      com.pulumi.aws.s3.S3Functions.getAccountPublicAccessBlock(args(argsBuilder).build)

    /** The S3 account public access block data source returns account-level public access block configuration. */
    def getAccountPublicAccessBlockPlain(args: Endofunction[com.pulumi.aws.s3.inputs.GetAccountPublicAccessBlockPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.s3.outputs.GetAccountPublicAccessBlockResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetAccountPublicAccessBlockPlainArgs.builder
      com.pulumi.aws.s3.S3Functions.getAccountPublicAccessBlockPlain(args(argsBuilder).build)

    /**
     * Provides details about a specific S3 bucket.
     *  
     *  This resource may prove useful when setting up a Route53 record, or an origin for a CloudFront
     *  Distribution.
     */
    def getBucket(args: Endofunction[com.pulumi.aws.s3.inputs.GetBucketArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.s3.outputs.GetBucketResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetBucketArgs.builder
      com.pulumi.aws.s3.S3Functions.getBucket(args(argsBuilder).build)

    /**
     * Provides details about a specific S3 bucket.
     *  
     *  This resource may prove useful when setting up a Route53 record, or an origin for a CloudFront
     *  Distribution.
     */
    def getBucketPlain(args: Endofunction[com.pulumi.aws.s3.inputs.GetBucketPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.s3.outputs.GetBucketResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetBucketPlainArgs.builder
      com.pulumi.aws.s3.S3Functions.getBucketPlain(args(argsBuilder).build)

    /**
     * &gt; **NOTE:** The `aws.s3.BucketObject` data source is DEPRECATED and will be removed in a future version! Use `aws.s3.BucketObjectv2` instead, where new features and fixes will be added.
     *  
     *  The S3 object data source allows access to the metadata and
     *  _optionally_ (see below) content of an object stored inside S3 bucket.
     *  
     *  &gt; **Note:** The content of an object (`body` field) is available only for objects which have a human-readable `Content-Type`:
     *  
     *  * `text&#47;&#42;`
     *  * `application/json`
     *  * `application/ld+json`
     *  * `application/x-httpd-php`
     *  * `application/xhtml+xml`
     *  * `application/x-csh`
     *  * `application/x-sh`
     *  * `application/xml`
     *  * `application/atom+xml`
     *  * `application/x-sql`
     *  
     *  This is to prevent printing unsafe characters and potentially downloading large amount of data which would be thrown away in favor of metadata.
     */
    def getBucketObject(args: Endofunction[com.pulumi.aws.s3.inputs.GetBucketObjectArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.s3.outputs.GetBucketObjectResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetBucketObjectArgs.builder
      com.pulumi.aws.s3.S3Functions.getBucketObject(args(argsBuilder).build)

    /**
     * &gt; **NOTE:** The `aws.s3.BucketObject` data source is DEPRECATED and will be removed in a future version! Use `aws.s3.BucketObjectv2` instead, where new features and fixes will be added.
     *  
     *  The S3 object data source allows access to the metadata and
     *  _optionally_ (see below) content of an object stored inside S3 bucket.
     *  
     *  &gt; **Note:** The content of an object (`body` field) is available only for objects which have a human-readable `Content-Type`:
     *  
     *  * `text&#47;&#42;`
     *  * `application/json`
     *  * `application/ld+json`
     *  * `application/x-httpd-php`
     *  * `application/xhtml+xml`
     *  * `application/x-csh`
     *  * `application/x-sh`
     *  * `application/xml`
     *  * `application/atom+xml`
     *  * `application/x-sql`
     *  
     *  This is to prevent printing unsafe characters and potentially downloading large amount of data which would be thrown away in favor of metadata.
     */
    def getBucketObjectPlain(args: Endofunction[com.pulumi.aws.s3.inputs.GetBucketObjectPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.s3.outputs.GetBucketObjectResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetBucketObjectPlainArgs.builder
      com.pulumi.aws.s3.S3Functions.getBucketObjectPlain(args(argsBuilder).build)

    /** Provides details about an AWS S3 (Simple Storage) Bucket Object Lock Configuration. */
    def getBucketObjectLockConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.GetBucketObjectLockConfigurationArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.s3.outputs.GetBucketObjectLockConfigurationResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetBucketObjectLockConfigurationArgs.builder
      com.pulumi.aws.s3.S3Functions.getBucketObjectLockConfiguration(args(argsBuilder).build)

    /** Provides details about an AWS S3 (Simple Storage) Bucket Object Lock Configuration. */
    def getBucketObjectLockConfigurationPlain(args: Endofunction[com.pulumi.aws.s3.inputs.GetBucketObjectLockConfigurationPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.s3.outputs.GetBucketObjectLockConfigurationResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetBucketObjectLockConfigurationPlainArgs.builder
      com.pulumi.aws.s3.S3Functions.getBucketObjectLockConfigurationPlain(args(argsBuilder).build)

    /**
     * &gt; **NOTE:** The `aws.s3.getBucketObjects` data source is DEPRECATED and will be removed in a future version! Use `aws.s3.getObjects` instead, where new features and fixes will be added.
     *  
     *  &gt; **NOTE on `maxKeys`:** Retrieving very large numbers of keys can adversely affect this provider&#39;s performance.
     *  
     *  The objects data source returns keys (i.e., file names) and other metadata about objects in an S3 bucket.
     */
    def getBucketObjects(args: Endofunction[com.pulumi.aws.s3.inputs.GetBucketObjectsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.s3.outputs.GetBucketObjectsResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetBucketObjectsArgs.builder
      com.pulumi.aws.s3.S3Functions.getBucketObjects(args(argsBuilder).build)

    /**
     * &gt; **NOTE:** The `aws.s3.getBucketObjects` data source is DEPRECATED and will be removed in a future version! Use `aws.s3.getObjects` instead, where new features and fixes will be added.
     *  
     *  &gt; **NOTE on `maxKeys`:** Retrieving very large numbers of keys can adversely affect this provider&#39;s performance.
     *  
     *  The objects data source returns keys (i.e., file names) and other metadata about objects in an S3 bucket.
     */
    def getBucketObjectsPlain(args: Endofunction[com.pulumi.aws.s3.inputs.GetBucketObjectsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.s3.outputs.GetBucketObjectsResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetBucketObjectsPlainArgs.builder
      com.pulumi.aws.s3.S3Functions.getBucketObjectsPlain(args(argsBuilder).build)

    /** The bucket policy data source returns IAM policy of an S3 bucket. */
    def getBucketPolicy(args: Endofunction[com.pulumi.aws.s3.inputs.GetBucketPolicyArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.s3.outputs.GetBucketPolicyResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetBucketPolicyArgs.builder
      com.pulumi.aws.s3.S3Functions.getBucketPolicy(args(argsBuilder).build)

    /** The bucket policy data source returns IAM policy of an S3 bucket. */
    def getBucketPolicyPlain(args: Endofunction[com.pulumi.aws.s3.inputs.GetBucketPolicyPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.s3.outputs.GetBucketPolicyResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetBucketPolicyPlainArgs.builder
      com.pulumi.aws.s3.S3Functions.getBucketPolicyPlain(args(argsBuilder).build)

    /** Data source for managing an AWS S3 (Simple Storage) Bucket Replication Configuration. */
    def getBucketReplicationConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.GetBucketReplicationConfigurationArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.s3.outputs.GetBucketReplicationConfigurationResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetBucketReplicationConfigurationArgs.builder
      com.pulumi.aws.s3.S3Functions.getBucketReplicationConfiguration(args(argsBuilder).build)

    /** Data source for managing an AWS S3 (Simple Storage) Bucket Replication Configuration. */
    def getBucketReplicationConfigurationPlain(args: Endofunction[com.pulumi.aws.s3.inputs.GetBucketReplicationConfigurationPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.s3.outputs.GetBucketReplicationConfigurationResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetBucketReplicationConfigurationPlainArgs.builder
      com.pulumi.aws.s3.S3Functions.getBucketReplicationConfigurationPlain(args(argsBuilder).build)

    /** Lists Amazon S3 Express directory buckets. */
    def getDirectoryBuckets(args: Endofunction[com.pulumi.aws.s3.inputs.GetDirectoryBucketsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.s3.outputs.GetDirectoryBucketsResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetDirectoryBucketsArgs.builder
      com.pulumi.aws.s3.S3Functions.getDirectoryBuckets(args(argsBuilder).build)

    /** Lists Amazon S3 Express directory buckets. */
    def getDirectoryBucketsPlain(args: Endofunction[com.pulumi.aws.s3.inputs.GetDirectoryBucketsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.s3.outputs.GetDirectoryBucketsResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetDirectoryBucketsPlainArgs.builder
      com.pulumi.aws.s3.S3Functions.getDirectoryBucketsPlain(args(argsBuilder).build)

    /**
     * The S3 object data source allows access to the metadata and
     *  _optionally_ (see below) content of an object stored inside S3 bucket.
     *  
     *  &gt; **Note:** The content of an object (`body` field) is available only for objects which have a human-readable `Content-Type`:
     *  
     *  * `text&#47;&#42;`
     *  * `application/json`
     *  * `application/ld+json`
     *  * `application/x-httpd-php`
     *  * `application/xhtml+xml`
     *  * `application/x-csh`
     *  * `application/x-sh`
     *  * `application/xml`
     *  * `application/atom+xml`
     *  * `application/x-sql`
     *  * `application/yaml`
     *  
     *  This is to prevent printing unsafe characters and potentially downloading large amount of data which would be thrown away in favor of metadata.
     */
    def getObject(args: Endofunction[com.pulumi.aws.s3.inputs.GetObjectArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.s3.outputs.GetObjectResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetObjectArgs.builder
      com.pulumi.aws.s3.S3Functions.getObject(args(argsBuilder).build)

    /**
     * The S3 object data source allows access to the metadata and
     *  _optionally_ (see below) content of an object stored inside S3 bucket.
     *  
     *  &gt; **Note:** The content of an object (`body` field) is available only for objects which have a human-readable `Content-Type`:
     *  
     *  * `text&#47;&#42;`
     *  * `application/json`
     *  * `application/ld+json`
     *  * `application/x-httpd-php`
     *  * `application/xhtml+xml`
     *  * `application/x-csh`
     *  * `application/x-sh`
     *  * `application/xml`
     *  * `application/atom+xml`
     *  * `application/x-sql`
     *  * `application/yaml`
     *  
     *  This is to prevent printing unsafe characters and potentially downloading large amount of data which would be thrown away in favor of metadata.
     */
    def getObjectPlain(args: Endofunction[com.pulumi.aws.s3.inputs.GetObjectPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.s3.outputs.GetObjectResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetObjectPlainArgs.builder
      com.pulumi.aws.s3.S3Functions.getObjectPlain(args(argsBuilder).build)

    /**
     * &gt; **NOTE on `maxKeys`:** Retrieving very large numbers of keys can adversely affect the provider&#39;s performance.
     *  
     *  The objects data source returns keys (i.e., file names) and other metadata about objects in an S3 bucket.
     */
    def getObjects(args: Endofunction[com.pulumi.aws.s3.inputs.GetObjectsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.s3.outputs.GetObjectsResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetObjectsArgs.builder
      com.pulumi.aws.s3.S3Functions.getObjects(args(argsBuilder).build)

    /**
     * &gt; **NOTE on `maxKeys`:** Retrieving very large numbers of keys can adversely affect the provider&#39;s performance.
     *  
     *  The objects data source returns keys (i.e., file names) and other metadata about objects in an S3 bucket.
     */
    def getObjectsPlain(args: Endofunction[com.pulumi.aws.s3.inputs.GetObjectsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.s3.outputs.GetObjectsResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetObjectsPlainArgs.builder
      com.pulumi.aws.s3.S3Functions.getObjectsPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.BucketCorsConfigurationArgs.Builder)
    /**
     * @param corsRules Set of origins and methods (cross-origin access that you want to allow). See below. You can configure up to 100 rules.
     * @return builder
     */
    def corsRules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketCorsConfigurationCorsRuleArgs.Builder]*):
        com.pulumi.aws.s3.BucketCorsConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketCorsConfigurationCorsRuleArgs.builder
      builder.corsRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.BucketMetricArgs.Builder)
    /**
     * @param filter [Object filtering](http://docs.aws.amazon.com/AmazonS3/latest/dev/metrics-configurations.html#metrics-configurations-filter) that accepts a prefix, tags, or a logical AND of prefix and tags (documented below).
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.aws.s3.inputs.BucketMetricFilterArgs.Builder]):
        com.pulumi.aws.s3.BucketMetricArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketMetricFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.BucketNotificationArgs.Builder)
    /**
     * @param lambdaFunctions Used to configure notifications to a Lambda Function. See below.
     * @return builder
     */
    def lambdaFunctions(args: Endofunction[com.pulumi.aws.s3.inputs.BucketNotificationLambdaFunctionArgs.Builder]*):
        com.pulumi.aws.s3.BucketNotificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketNotificationLambdaFunctionArgs.builder
      builder.lambdaFunctions(args.map(_(argsBuilder).build)*)

    /**
     * @param queues Notification configuration to SQS Queue. See below.
     * @return builder
     */
    def queues(args: Endofunction[com.pulumi.aws.s3.inputs.BucketNotificationQueueArgs.Builder]*):
        com.pulumi.aws.s3.BucketNotificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketNotificationQueueArgs.builder
      builder.queues(args.map(_(argsBuilder).build)*)

    /**
     * @param topics Notification configuration to SNS Topic. See below.
     * @return builder
     */
    def topics(args: Endofunction[com.pulumi.aws.s3.inputs.BucketNotificationTopicArgs.Builder]*):
        com.pulumi.aws.s3.BucketNotificationArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketNotificationTopicArgs.builder
      builder.topics(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.BucketLoggingArgs.Builder)
    /**
     * @param targetGrants Set of configuration blocks with information for granting permissions. See below.
     * @return builder
     */
    def targetGrants(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLoggingTargetGrantArgs.Builder]*):
        com.pulumi.aws.s3.BucketLoggingArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketLoggingTargetGrantArgs.builder
      builder.targetGrants(args.map(_(argsBuilder).build)*)

    /**
     * @param targetObjectKeyFormat Amazon S3 key format for log objects. See below.
     * @return builder
     */
    def targetObjectKeyFormat(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLoggingTargetObjectKeyFormatArgs.Builder]):
        com.pulumi.aws.s3.BucketLoggingArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLoggingTargetObjectKeyFormatArgs.builder
      builder.targetObjectKeyFormat(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.BucketVersioningV2Args.Builder)
    /**
     * @param versioningConfiguration Configuration block for the versioning parameters. See below.
     * @return builder
     */
    def versioningConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketVersioningV2VersioningConfigurationArgs.Builder]):
        com.pulumi.aws.s3.BucketVersioningV2Args.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketVersioningV2VersioningConfigurationArgs.builder
      builder.versioningConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.VectorsIndexArgs.Builder)
    /**
     * @param encryptionConfigurations Block for encryption configuration for the vector index. See `encyptionConfiguration` block below.
     * @return builder
     */
    def encryptionConfigurations(args: Endofunction[com.pulumi.aws.s3.inputs.VectorsIndexEncryptionConfigurationArgs.Builder]*):
        com.pulumi.aws.s3.VectorsIndexArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.VectorsIndexEncryptionConfigurationArgs.builder
      builder.encryptionConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param metadataConfiguration Block for metadata configuration for the vector index. See `metadataConfiguration` block below.
     * @return builder
     */
    def metadataConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.VectorsIndexMetadataConfigurationArgs.Builder]):
        com.pulumi.aws.s3.VectorsIndexArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.VectorsIndexMetadataConfigurationArgs.builder
      builder.metadataConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.BucketIntelligentTieringConfigurationArgs.Builder)
    /**
     * @param filter Bucket filter. The configuration only includes objects that meet the filter&#39;s criteria (documented below).
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.aws.s3.inputs.BucketIntelligentTieringConfigurationFilterArgs.Builder]):
        com.pulumi.aws.s3.BucketIntelligentTieringConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketIntelligentTieringConfigurationFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param tierings S3 Intelligent-Tiering storage class tiers of the configuration (documented below).
     * @return builder
     */
    def tierings(args: Endofunction[com.pulumi.aws.s3.inputs.BucketIntelligentTieringConfigurationTieringArgs.Builder]*):
        com.pulumi.aws.s3.BucketIntelligentTieringConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketIntelligentTieringConfigurationTieringArgs.builder
      builder.tierings(args.map(_(argsBuilder).build)*)

  /** Resource for managing an Amazon S3 Vectors Vector Bucket policy. */
  def VectorsVectorBucketPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.VectorsVectorBucketPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.s3.VectorsVectorBucketPolicyArgs.builder
    
    com.pulumi.aws.s3.VectorsVectorBucketPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an Amazon S3 Vectors Index. */
  def VectorsIndex(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.VectorsIndexArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.s3.VectorsIndexArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.s3.VectorsIndex(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an S3 bucket website configuration resource. For more information, see [Hosting Websites on S3](https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html).
   *  
   *  &gt; This resource cannot be used with S3 directory buckets.
   */
  def BucketWebsiteConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketWebsiteConfigurationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.s3.BucketWebsiteConfigurationArgs.builder
    
    com.pulumi.aws.s3.BucketWebsiteConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.s3.DirectoryBucketArgs.Builder)
    /**
     * @param location Bucket location. See Location below for more details.
     * @return builder
     */
    def location(args: Endofunction[com.pulumi.aws.s3.inputs.DirectoryBucketLocationArgs.Builder]):
        com.pulumi.aws.s3.DirectoryBucketArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.DirectoryBucketLocationArgs.builder
      builder.location(args(argsBuilder).build)

  /**
   * Provides an independent configuration resource for S3 bucket [lifecycle configuration](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lifecycle-mgmt.html).
   *  
   *  An S3 Lifecycle configuration consists of one or more Lifecycle rules. Each rule consists of the following:
   *  
   *  * Rule metadata (`id` and `status`)
   *  * Filter identifying objects to which the rule applies
   *  * One or more transition or expiration actions
   *  
   *  For more information see the Amazon S3 User Guide on [`Lifecycle Configuration Elements`](https://docs.aws.amazon.com/AmazonS3/latest/userguide/intro-lifecycle-rules.html).
   *  
   *  &gt; S3 Buckets only support a single lifecycle configuration. Declaring multiple `aws.s3.BucketLifecycleConfiguration` resources to the same S3 Bucket will cause a perpetual difference in configuration.
   *  
   *  &gt; Lifecycle configurations may take some time to fully propagate to all AWS S3 systems.
   *  Running Pulumi operations shortly after creating a lifecycle configuration may result in changes that affect configuration idempotence.
   *  See the Amazon S3 User Guide on [setting lifecycle configuration on a bucket](https://docs.aws.amazon.com/AmazonS3/latest/userguide/how-to-set-lifecycle-configuration-intro.html).
   */
  def BucketLifecycleConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketLifecycleConfigurationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.s3.BucketLifecycleConfigurationArgs.builder
    
    com.pulumi.aws.s3.BucketLifecycleConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.s3.BucketAclV2Args.Builder)
    /**
     * @param accessControlPolicy Configuration block that sets the ACL permissions for an object per grantee. See below.
     * @return builder
     */
    def accessControlPolicy(args: Endofunction[com.pulumi.aws.s3.inputs.BucketAclV2AccessControlPolicyArgs.Builder]):
        com.pulumi.aws.s3.BucketAclV2Args.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketAclV2AccessControlPolicyArgs.builder
      builder.accessControlPolicy(args(argsBuilder).build)

  /**
   * Provides a S3 bucket server-side encryption configuration resource.
   *  
   *  &gt; **NOTE:** Destroying an `aws.s3.BucketServerSideEncryptionConfiguration` resource resets the bucket to [Amazon S3 bucket default encryption](https://docs.aws.amazon.com/AmazonS3/latest/userguide/default-encryption-faq.html).
   *  
   *  &gt; **NOTE:** Starting in March 2026, Amazon S3 will automatically block server-side encryption with customer-provided keys (SSE-C) for all new buckets. Use the `blockedEncryptionTypes` argument to manage this behavior. For more information, see the [SSE-C changes FAQ](https://docs.aws.amazon.com/AmazonS3/latest/userguide/default-s3-c-encryption-setting-faq.html).
   */
  @deprecated() def BucketServerSideEncryptionConfigurationV2(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketServerSideEncryptionConfigurationV2Args.Builder]) =
    val argsBuilder = com.pulumi.aws.s3.BucketServerSideEncryptionConfigurationV2Args.builder
    
    com.pulumi.aws.s3.BucketServerSideEncryptionConfigurationV2(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an Amazon S3 Express directory bucket resource. */
  def DirectoryBucket(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.DirectoryBucketArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.s3.DirectoryBucketArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.s3.DirectoryBucket(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a S3 bucket [analytics configuration](https://docs.aws.amazon.com/AmazonS3/latest/dev/analytics-storage-class.html) resource.
   *  
   *  &gt; This resource cannot be used with S3 directory buckets.
   */
  def AnalyticsConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.AnalyticsConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.s3.AnalyticsConfigurationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.s3.AnalyticsConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a S3 bucket server-side encryption configuration resource.
   *  
   *  &gt; **NOTE:** Destroying an `aws.s3.BucketServerSideEncryptionConfiguration` resource resets the bucket to [Amazon S3 bucket default encryption](https://docs.aws.amazon.com/AmazonS3/latest/userguide/default-encryption-faq.html).
   *  
   *  &gt; **NOTE:** Starting in March 2026, Amazon S3 will automatically block server-side encryption with customer-provided keys (SSE-C) for all new buckets. Use the `blockedEncryptionTypes` argument to manage this behavior. For more information, see the [SSE-C changes FAQ](https://docs.aws.amazon.com/AmazonS3/latest/userguide/default-s3-c-encryption-setting-faq.html).
   */
  def BucketServerSideEncryptionConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketServerSideEncryptionConfigurationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.s3.BucketServerSideEncryptionConfigurationArgs.builder
    
    com.pulumi.aws.s3.BucketServerSideEncryptionConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.s3.BucketMetadataConfigurationArgs.Builder)
    /**
     * @param metadataConfiguration Metadata configuration. See `metadataConfiguration` Block for details.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def metadataConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationArgs.Builder]):
        com.pulumi.aws.s3.BucketMetadataConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationArgs.builder
      builder.metadataConfiguration(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.s3.inputs.BucketMetadataConfigurationTimeoutsArgs.Builder]):
        com.pulumi.aws.s3.BucketMetadataConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketMetadataConfigurationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.ObjectCopyArgs.Builder)
    /**
     * @param grants Configuration block for header grants. Documented below. Conflicts with `acl`.
     * @return builder
     */
    def grants(args: Endofunction[com.pulumi.aws.s3.inputs.ObjectCopyGrantArgs.Builder]*):
        com.pulumi.aws.s3.ObjectCopyArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.ObjectCopyGrantArgs.builder
      builder.grants(args.map(_(argsBuilder).build)*)

    def overrideProvider(args: Endofunction[com.pulumi.aws.s3.inputs.ObjectCopyOverrideProviderArgs.Builder]):
        com.pulumi.aws.s3.ObjectCopyArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.ObjectCopyOverrideProviderArgs.builder
      builder.overrideProvider(args(argsBuilder).build)

  /**
   * Provides an S3 bucket ACL resource.
   *  
   *  &gt; **Note:** destroy does not delete the S3 Bucket ACL but does remove the resource from state.
   *  
   *  &gt; This resource cannot be used with S3 directory buckets.
   */
  @deprecated() def BucketAclV2(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketAclV2Args.Builder]) =
    val argsBuilder = com.pulumi.aws.s3.BucketAclV2Args.builder
    
    com.pulumi.aws.s3.BucketAclV2(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an S3 bucket Object Lock configuration resource. For more information about Object Locking, go to [Using S3 Object Lock](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock.html) in the Amazon S3 User Guide.
   *  
   *  &gt; This resource can be used enable Object Lock for **new** and **existing** buckets.
   *  
   *  &gt; This resource cannot be used with S3 directory buckets.
   */
  def BucketObjectLockConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketObjectLockConfigurationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.s3.BucketObjectLockConfigurationArgs.builder
    
    com.pulumi.aws.s3.BucketObjectLockConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.s3.BucketOwnershipControlsArgs.Builder)
    /**
     * @param rule Configuration block(s) with Ownership Controls rules. Detailed below.
     * @return builder
     */
    def rule(args: Endofunction[com.pulumi.aws.s3.inputs.BucketOwnershipControlsRuleArgs.Builder]):
        com.pulumi.aws.s3.BucketOwnershipControlsArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketOwnershipControlsRuleArgs.builder
      builder.rule(args(argsBuilder).build)

  /**
   * Provides a resource for controlling versioning on an S3 bucket.
   *  Deleting this resource will either suspend versioning on the associated S3 bucket or
   *  simply remove the resource from state if the associated S3 bucket is unversioned.
   *  
   *  For more information, see [How S3 versioning works](https://docs.aws.amazon.com/AmazonS3/latest/userguide/manage-versioning-examples.html).
   *  
   *  &gt; **NOTE:** If you are enabling versioning on the bucket for the first time, AWS recommends that you wait for 15 minutes after enabling versioning before issuing write operations (PUT or DELETE) on objects in the bucket.
   *  
   *  &gt; This resource cannot be used with S3 directory buckets.
   */
  def BucketVersioning(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketVersioningArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.s3.BucketVersioningArgs.builder
    
    com.pulumi.aws.s3.BucketVersioning(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.s3.BucketAbacArgs.Builder)
    /**
     * @param abacStatus ABAC status configuration. See `abacStatus` Block for details.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def abacStatus(args: Endofunction[com.pulumi.aws.s3.inputs.BucketAbacAbacStatusArgs.Builder]):
        com.pulumi.aws.s3.BucketAbacArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketAbacAbacStatusArgs.builder
      builder.abacStatus(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.BucketWebsiteConfigurationArgs.Builder)
    /**
     * @param errorDocument Name of the error document for the website. See below.
     * @return builder
     */
    def errorDocument(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationErrorDocumentArgs.Builder]):
        com.pulumi.aws.s3.BucketWebsiteConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationErrorDocumentArgs.builder
      builder.errorDocument(args(argsBuilder).build)

    /**
     * @param indexDocument Name of the index document for the website. See below.
     * @return builder
     */
    def indexDocument(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationIndexDocumentArgs.Builder]):
        com.pulumi.aws.s3.BucketWebsiteConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationIndexDocumentArgs.builder
      builder.indexDocument(args(argsBuilder).build)

    /**
     * @param redirectAllRequestsTo Redirect behavior for every request to this bucket&#39;s website endpoint. See below. Conflicts with `errorDocument`, `indexDocument`, and `routingRule`.
     * @return builder
     */
    def redirectAllRequestsTo(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationRedirectAllRequestsToArgs.Builder]):
        com.pulumi.aws.s3.BucketWebsiteConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationRedirectAllRequestsToArgs.builder
      builder.redirectAllRequestsTo(args(argsBuilder).build)

    /**
     * @param routingRules List of rules that define when a redirect is applied and the redirect behavior. See below.
     * @return builder
     */
    def routingRules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationRoutingRuleArgs.Builder]*):
        com.pulumi.aws.s3.BucketWebsiteConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationRoutingRuleArgs.builder
      builder.routingRules(args.map(_(argsBuilder).build)*)

  /**
   * Manages S3 account-level Public Access Block configuration. For more information about these settings, see the [AWS S3 Block Public Access documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html).
   *  
   *  &gt; **NOTE:** Each AWS account may only have one S3 Public Access Block configuration. Multiple configurations of the resource against the same AWS account will cause a perpetual difference.
   *  
   *  &gt; Advanced usage: To use a custom API endpoint for this resource, use the `s3control` endpoint provider configuration, not the `s3` endpoint provider configuration.
   */
  def AccountPublicAccessBlock(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.AccountPublicAccessBlockArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.s3.AccountPublicAccessBlockArgs.builder
    
    com.pulumi.aws.s3.AccountPublicAccessBlock(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an S3 bucket (server access) logging resource. For more information, see [Logging requests using server access logging](https://docs.aws.amazon.com/AmazonS3/latest/userguide/ServerLogs.html)
   *  in the AWS S3 User Guide.
   *  
   *  &gt; **Note:** Amazon S3 supports server access logging, AWS CloudTrail, or a combination of both. Refer to the [Logging options for Amazon S3](https://docs.aws.amazon.com/AmazonS3/latest/userguide/logging-with-S3.html)
   *  to decide which method meets your requirements.
   *  
   *  &gt; This resource cannot be used with S3 directory buckets.
   */
  def BucketLogging(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketLoggingArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.s3.BucketLoggingArgs.builder
    
    com.pulumi.aws.s3.BucketLogging(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketAclV2AccessControlPolicyGrantArgs.Builder)
    /**
     * @param grantee Configuration block for the person being granted permissions. See below.
     * @return builder
     */
    def grantee(args: Endofunction[com.pulumi.aws.s3.inputs.BucketAclV2AccessControlPolicyGrantGranteeArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketAclV2AccessControlPolicyGrantArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketAclV2AccessControlPolicyGrantGranteeArgs.builder
      builder.grantee(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketMetricState.Builder)
    /**
     * @param filter [Object filtering](http://docs.aws.amazon.com/AmazonS3/latest/dev/metrics-configurations.html#metrics-configurations-filter) that accepts a prefix, tags, or a logical AND of prefix and tags (documented below).
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.aws.s3.inputs.BucketMetricFilterArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketMetricState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketMetricFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.DirectoryBucketState.Builder)
    /**
     * @param location Bucket location. See Location below for more details.
     * @return builder
     */
    def location(args: Endofunction[com.pulumi.aws.s3.inputs.DirectoryBucketLocationArgs.Builder]):
        com.pulumi.aws.s3.inputs.DirectoryBucketState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.DirectoryBucketLocationArgs.builder
      builder.location(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationJournalTableConfigurationArgs.Builder)
    /**
     * @param encryptionConfiguration Encryption configuration for the journal table. See `encryptionConfiguration` Block for details.
     * @return builder
     */
    def encryptionConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationJournalTableConfigurationEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationJournalTableConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationJournalTableConfigurationEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

    /**
     * @param recordExpiration Journal table record expiration settings. See `recordExpiration` Block for details.
     * @return builder
     */
    def recordExpiration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationJournalTableConfigurationRecordExpirationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationJournalTableConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationJournalTableConfigurationRecordExpirationArgs.builder
      builder.recordExpiration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationArgs.Builder)
    /**
     * @param rule Single object for server-side encryption by default configuration. (documented below)
     * @return builder
     */
    def rule(args: Endofunction[com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationRuleArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationRuleArgs.builder
      builder.rule(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketV2ServerSideEncryptionConfigurationArgs.Builder)
    /**
     * @param rules Single object for server-side encryption by default configuration. (documented below)
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2ServerSideEncryptionConfigurationRuleArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2ServerSideEncryptionConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2ServerSideEncryptionConfigurationRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketObjectv2OverrideProviderArgs.Builder)
    /**
     * @param defaultTags Override the provider `defaultTags` configuration block.
     * @return builder
     */
    def defaultTags(args: Endofunction[com.pulumi.aws.s3.inputs.BucketObjectv2OverrideProviderDefaultTagsArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketObjectv2OverrideProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketObjectv2OverrideProviderDefaultTagsArgs.builder
      builder.defaultTags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketLifecycleRuleArgs.Builder)
    /**
     * @param expiration Specifies a period in the object&#39;s expire. See Expiration below for details.
     * @return builder
     */
    def expiration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleRuleExpirationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLifecycleRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleRuleExpirationArgs.builder
      builder.expiration(args(argsBuilder).build)

    /**
     * @param noncurrentVersionExpiration Specifies when noncurrent object versions expire. See Noncurrent Version Expiration below for details.
     * @return builder
     */
    def noncurrentVersionExpiration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleRuleNoncurrentVersionExpirationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLifecycleRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleRuleNoncurrentVersionExpirationArgs.builder
      builder.noncurrentVersionExpiration(args(argsBuilder).build)

    /**
     * @param noncurrentVersionTransitions Specifies when noncurrent object versions transitions. See Noncurrent Version Transition below for details.
     * @return builder
     */
    def noncurrentVersionTransitions(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleRuleNoncurrentVersionTransitionArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketLifecycleRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleRuleNoncurrentVersionTransitionArgs.builder
      builder.noncurrentVersionTransitions(args.map(_(argsBuilder).build)*)

    /**
     * @param transitions Specifies a period in the object&#39;s transitions. See Transition below for details.
     * @return builder
     */
    def transitions(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleRuleTransitionArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketLifecycleRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleRuleTransitionArgs.builder
      builder.transitions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketMetadataConfigurationState.Builder)
    /**
     * @param metadataConfiguration Metadata configuration. See `metadataConfiguration` Block for details.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def metadataConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketMetadataConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationArgs.builder
      builder.metadataConfiguration(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.s3.inputs.BucketMetadataConfigurationTimeoutsArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketMetadataConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketMetadataConfigurationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketAclV2State.Builder)
    /**
     * @param accessControlPolicy Configuration block that sets the ACL permissions for an object per grantee. See below.
     * @return builder
     */
    def accessControlPolicy(args: Endofunction[com.pulumi.aws.s3.inputs.BucketAclV2AccessControlPolicyArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketAclV2State.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketAclV2AccessControlPolicyArgs.builder
      builder.accessControlPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketObjectv2State.Builder)
    /**
     * @param overrideProvider Override provider-level configuration options. See Override Provider below for more details.
     * @return builder
     */
    def overrideProvider(args: Endofunction[com.pulumi.aws.s3.inputs.BucketObjectv2OverrideProviderArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketObjectv2State.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketObjectv2OverrideProviderArgs.builder
      builder.overrideProvider(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketVersioningState.Builder)
    /**
     * @param versioningConfiguration Configuration block for the versioning parameters. See below.
     * @return builder
     */
    def versioningConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketVersioningVersioningConfigurationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketVersioningState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketVersioningVersioningConfigurationArgs.builder
      builder.versioningConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.ObjectCopyState.Builder)
    /**
     * @param grants Configuration block for header grants. Documented below. Conflicts with `acl`.
     * @return builder
     */
    def grants(args: Endofunction[com.pulumi.aws.s3.inputs.ObjectCopyGrantArgs.Builder]*):
        com.pulumi.aws.s3.inputs.ObjectCopyState.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.ObjectCopyGrantArgs.builder
      builder.grants(args.map(_(argsBuilder).build)*)

    def overrideProvider(args: Endofunction[com.pulumi.aws.s3.inputs.ObjectCopyOverrideProviderArgs.Builder]):
        com.pulumi.aws.s3.inputs.ObjectCopyState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.ObjectCopyOverrideProviderArgs.builder
      builder.overrideProvider(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationArgs.Builder)
    /**
     * @param destinations Destination information for the S3 Metadata configuration.
     * @return builder
     */
    def destinations(args: Endofunction[com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationDestinationArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

    /**
     * @param inventoryTableConfiguration Inventory table configuration. See `inventoryTableConfiguration` Block for details.
     * @return builder
     */
    def inventoryTableConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationInventoryTableConfigurationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationInventoryTableConfigurationArgs.builder
      builder.inventoryTableConfiguration(args(argsBuilder).build)

    /**
     * @param journalTableConfiguration Journal table configuration. See `journalTableConfiguration` Block for details.
     * @return builder
     */
    def journalTableConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationJournalTableConfigurationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationJournalTableConfigurationArgs.builder
      builder.journalTableConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketLoggingV2TargetObjectKeyFormatArgs.Builder)
    /**
     * @param partitionedPrefix Partitioned S3 key for log objects, in the form `[targetPrefix][SourceAccountId]/[SourceRegion]/[SourceBucket]/[YYYY]/[MM]/[DD]/[YYYY]-[MM]-[DD]-[hh]-[mm]-[ss]-[UniqueString]`. Conflicts with `simplePrefix`. See below.
     * @return builder
     */
    def partitionedPrefix(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLoggingV2TargetObjectKeyFormatPartitionedPrefixArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLoggingV2TargetObjectKeyFormatArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLoggingV2TargetObjectKeyFormatPartitionedPrefixArgs.builder
      builder.partitionedPrefix(args(argsBuilder).build)

    /**
     * @param simplePrefix Use the simple format for S3 keys for log objects, in the form `[targetPrefix][YYYY]-[MM]-[DD]-[hh]-[mm]-[ss]-[UniqueString]`. To use, set `simplePrefix {}`. Conflicts with `partitionedPrefix`.
     * @return builder
     */
    def simplePrefix(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLoggingV2TargetObjectKeyFormatSimplePrefixArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLoggingV2TargetObjectKeyFormatArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLoggingV2TargetObjectKeyFormatSimplePrefixArgs.builder
      builder.simplePrefix(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleArgs.Builder)
    /**
     * @param abortIncompleteMultipartUpload Configuration block that specifies the days since the initiation of an incomplete multipart upload that Amazon S3 will wait before permanently removing all parts of the upload. See below.
     * @return builder
     */
    def abortIncompleteMultipartUpload(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleAbortIncompleteMultipartUploadArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleAbortIncompleteMultipartUploadArgs.builder
      builder.abortIncompleteMultipartUpload(args(argsBuilder).build)

    /**
     * @param expiration Configuration block that specifies the expiration for the lifecycle of the object in the form of date, days and, whether the object has a delete marker. See below.
     * @return builder
     */
    def expiration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleExpirationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleExpirationArgs.builder
      builder.expiration(args(argsBuilder).build)

    /**
     * @param filter Configuration block used to identify objects that a Lifecycle Rule applies to.
     *  See below.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleFilterArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param noncurrentVersionExpiration Configuration block that specifies when noncurrent object versions expire. See below.
     * @return builder
     */
    def noncurrentVersionExpiration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleNoncurrentVersionExpirationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleNoncurrentVersionExpirationArgs.builder
      builder.noncurrentVersionExpiration(args(argsBuilder).build)

    /**
     * @param noncurrentVersionTransitions Set of configuration blocks that specify the transition rule for the lifecycle rule that describes when noncurrent objects transition to a specific storage class. See below.
     * @return builder
     */
    def noncurrentVersionTransitions(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleNoncurrentVersionTransitionArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleNoncurrentVersionTransitionArgs.builder
      builder.noncurrentVersionTransitions(args.map(_(argsBuilder).build)*)

    /**
     * @param transitions Set of configuration blocks that specify when an Amazon S3 object transitions to a specified storage class. See below.
     * @return builder
     */
    def transitions(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleTransitionArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleTransitionArgs.builder
      builder.transitions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketLoggingTargetGrantArgs.Builder)
    /**
     * @param grantee Configuration block for the person being granted permissions. See below.
     * @return builder
     */
    def grantee(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLoggingTargetGrantGranteeArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLoggingTargetGrantArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLoggingTargetGrantGranteeArgs.builder
      builder.grantee(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationArgs.Builder)
    /**
     * @param rules Specifies the rules managing the replication (documented below).
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.AccessPointState.Builder)
    /**
     * @param publicAccessBlockConfiguration Configuration block to manage the `PublicAccessBlock` configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration options in any combination. Detailed below.
     * @return builder
     */
    def publicAccessBlockConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.AccessPointPublicAccessBlockConfigurationArgs.Builder]):
        com.pulumi.aws.s3.inputs.AccessPointState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.AccessPointPublicAccessBlockConfigurationArgs.builder
      builder.publicAccessBlockConfiguration(args(argsBuilder).build)

    /**
     * @param vpcConfiguration Configuration block to restrict access to this access point to requests from the specified Virtual Private Cloud (VPC). Required for S3 on Outposts. Detailed below.
     * @return builder
     */
    def vpcConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.AccessPointVpcConfigurationArgs.Builder]):
        com.pulumi.aws.s3.inputs.AccessPointState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.AccessPointVpcConfigurationArgs.builder
      builder.vpcConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketCorsConfigurationV2State.Builder)
    /**
     * @param corsRules Set of origins and methods (cross-origin access that you want to allow). See below. You can configure up to 100 rules.
     * @return builder
     */
    def corsRules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketCorsConfigurationV2CorsRuleArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketCorsConfigurationV2State.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketCorsConfigurationV2CorsRuleArgs.builder
      builder.corsRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationState.Builder)
    /**
     * @param errorDocument Name of the error document for the website. See below.
     * @return builder
     */
    def errorDocument(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationErrorDocumentArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationErrorDocumentArgs.builder
      builder.errorDocument(args(argsBuilder).build)

    /**
     * @param indexDocument Name of the index document for the website. See below.
     * @return builder
     */
    def indexDocument(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationIndexDocumentArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationIndexDocumentArgs.builder
      builder.indexDocument(args(argsBuilder).build)

    /**
     * @param redirectAllRequestsTo Redirect behavior for every request to this bucket&#39;s website endpoint. See below. Conflicts with `errorDocument`, `indexDocument`, and `routingRule`.
     * @return builder
     */
    def redirectAllRequestsTo(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationRedirectAllRequestsToArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationRedirectAllRequestsToArgs.builder
      builder.redirectAllRequestsTo(args(argsBuilder).build)

    /**
     * @param routingRules List of rules that define when a redirect is applied and the redirect behavior. See below.
     * @return builder
     */
    def routingRules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationRoutingRuleArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationRoutingRuleArgs.builder
      builder.routingRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketV2ServerSideEncryptionConfigurationRuleArgs.Builder)
    /**
     * @param applyServerSideEncryptionByDefaults Single object for setting server-side encryption by default. (documented below)
     * @return builder
     */
    def applyServerSideEncryptionByDefaults(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2ServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefaultArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2ServerSideEncryptionConfigurationRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2ServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefaultArgs.builder
      builder.applyServerSideEncryptionByDefaults(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.InventoryDestinationBucketEncryptionArgs.Builder)
    /**
     * @param sseKms Specifies to use server-side encryption with AWS KMS-managed keys to encrypt the inventory file (documented below).
     * @return builder
     */
    def sseKms(args: Endofunction[com.pulumi.aws.s3.inputs.InventoryDestinationBucketEncryptionSseKmsArgs.Builder]):
        com.pulumi.aws.s3.inputs.InventoryDestinationBucketEncryptionArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.InventoryDestinationBucketEncryptionSseKmsArgs.builder
      builder.sseKms(args(argsBuilder).build)

    /**
     * @param sseS3 Specifies to use server-side encryption with Amazon S3-managed keys (SSE-S3) to encrypt the inventory file.
     * @return builder
     */
    def sseS3(args: Endofunction[com.pulumi.aws.s3.inputs.InventoryDestinationBucketEncryptionSseS3Args.Builder]):
        com.pulumi.aws.s3.inputs.InventoryDestinationBucketEncryptionArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.InventoryDestinationBucketEncryptionSseS3Args.builder
      builder.sseS3(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationState.Builder)
    /**
     * @param rule Configuration block for specifying the Object Lock rule for the specified object. See below.
     * @return builder
     */
    def rule(args: Endofunction[com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationRuleArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationRuleArgs.builder
      builder.rule(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketAclState.Builder)
    /**
     * @param accessControlPolicy Configuration block that sets the ACL permissions for an object per grantee. See below.
     * @return builder
     */
    def accessControlPolicy(args: Endofunction[com.pulumi.aws.s3.inputs.BucketAclAccessControlPolicyArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketAclState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketAclAccessControlPolicyArgs.builder
      builder.accessControlPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketCorsConfigurationState.Builder)
    /**
     * @param corsRules Set of origins and methods (cross-origin access that you want to allow). See below. You can configure up to 100 rules.
     * @return builder
     */
    def corsRules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketCorsConfigurationCorsRuleArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketCorsConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketCorsConfigurationCorsRuleArgs.builder
      builder.corsRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketV2State.Builder)
    /**
     * @param corsRules Rule of [Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html). See CORS rule below for details. This provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketCorsConfiguration` instead.
     * @return builder
     * @deprecated cors_rule is deprecated. Use the aws.s3.BucketCorsConfiguration resource instead.
     */
    @deprecated def corsRules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2CorsRuleArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2State.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2CorsRuleArgs.builder
      builder.corsRules(args.map(_(argsBuilder).build)*)

    /**
     * @param grants An [ACL policy grant](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#sample-acl). See Grant below for details. Conflicts with `acl`. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketAcl` instead.
     * @return builder
     * @deprecated grant is deprecated. Use the aws.s3.BucketAcl resource instead.
     */
    @deprecated def grants(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2GrantArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2State.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2GrantArgs.builder
      builder.grants(args.map(_(argsBuilder).build)*)

    /**
     * @param lifecycleRules Configuration of [object lifecycle management](http://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html). See Lifecycle Rule below for details. The provider will only perform drift detection if a configuration value is provided.
     *  Use the resource `aws.s3.BucketLifecycleConfiguration` instead.
     * @return builder
     * @deprecated lifecycle_rule is deprecated. Use the aws.s3.BucketLifecycleConfiguration resource instead.
     */
    @deprecated def lifecycleRules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2LifecycleRuleArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2State.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2LifecycleRuleArgs.builder
      builder.lifecycleRules(args.map(_(argsBuilder).build)*)

    /**
     * @param loggings Configuration of [S3 bucket logging](https://docs.aws.amazon.com/AmazonS3/latest/UG/ManagingBucketLogging.html) parameters. See Logging below for details. The provider will only perform drift detection if a configuration value is provided.
     *  Use the resource `aws.s3.BucketLogging` instead.
     * @return builder
     * @deprecated logging is deprecated. Use the aws.s3.BucketLogging resource instead.
     */
    @deprecated def loggings(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2LoggingArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2State.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2LoggingArgs.builder
      builder.loggings(args.map(_(argsBuilder).build)*)

    /**
     * @param objectLockConfiguration Configuration of [S3 object locking](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html). See Object Lock Configuration below for details.
     *  The provider wil only perform drift detection if a configuration value is provided.
     *  Use the `objectLockEnabled` parameter and the resource `aws.s3.BucketObjectLockConfiguration` instead.
     * @return builder
     * @deprecated object_lock_configuration is deprecated. Use the top-level parameter objectLockEnabled and the aws.s3.BucketObjectLockConfiguration resource instead.
     */
    @deprecated def objectLockConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2ObjectLockConfigurationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketV2State.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketV2ObjectLockConfigurationArgs.builder
      builder.objectLockConfiguration(args(argsBuilder).build)

    /**
     * @param replicationConfigurations Configuration of [replication configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html). See Replication Configuration below for details. The provider will only perform drift detection if a configuration value is provided.
     *  Use the resource `aws.s3.BucketReplicationConfig` instead.
     * @return builder
     * @deprecated replication_configuration is deprecated. Use the aws.s3.BucketReplicationConfig resource instead.
     */
    @deprecated def replicationConfigurations(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2State.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationArgs.builder
      builder.replicationConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param serverSideEncryptionConfigurations Configuration of [server-side encryption configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html). See Server Side Encryption Configuration below for details.
     *  The provider will only perform drift detection if a configuration value is provided.
     *  Use the resource `aws.s3.BucketServerSideEncryptionConfiguration` instead.
     * @return builder
     * @deprecated server_side_encryption_configuration is deprecated. Use the aws.s3.BucketServerSideEncryptionConfiguration resource instead.
     */
    @deprecated def serverSideEncryptionConfigurations(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2ServerSideEncryptionConfigurationArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2State.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2ServerSideEncryptionConfigurationArgs.builder
      builder.serverSideEncryptionConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param versionings Configuration of the [S3 bucket versioning state](https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html). See Versioning below for details. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketVersioning` instead.
     * @return builder
     * @deprecated versioning is deprecated. Use the aws.s3.BucketVersioning resource instead.
     */
    @deprecated def versionings(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2VersioningArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2State.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2VersioningArgs.builder
      builder.versionings(args.map(_(argsBuilder).build)*)

    /**
     * @param websites Configuration of the [S3 bucket website](https://docs.aws.amazon.com/AmazonS3/latest/userguide/WebsiteHosting.html). See Website below for details. The provider will only perform drift detection if a configuration value is provided.
     *  Use the resource `aws.s3.BucketWebsiteConfiguration` instead.
     * @return builder
     * @deprecated website is deprecated. Use the aws.s3.BucketWebsiteConfiguration resource instead.
     */
    @deprecated def websites(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2WebsiteArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2State.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2WebsiteArgs.builder
      builder.websites(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationRuleArgs.Builder)
    /**
     * @param applyServerSideEncryptionByDefault Single object for setting server-side encryption by default. See below.
     * @return builder
     */
    def applyServerSideEncryptionByDefault(args: Endofunction[com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefaultArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefaultArgs.builder
      builder.applyServerSideEncryptionByDefault(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleSourceSelectionCriteriaArgs.Builder)
    /**
     * @param sseKmsEncryptedObjects Match SSE-KMS encrypted objects (documented below). If specified, `replicaKmsKeyId`
     *  in `destination` must be specified as well.
     * @return builder
     */
    def sseKmsEncryptedObjects(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectsArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleSourceSelectionCriteriaArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectsArgs.builder
      builder.sseKmsEncryptedObjects(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleArgs.Builder)
    /**
     * @param destinations Specifies the destination for the rule (documented below).
     * @return builder
     */
    def destinations(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleDestinationArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

    /**
     * @param filters Filter that identifies subset of objects to which the replication rule applies (documented below).
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleFilterArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceSelectionCriterias Specifies special object selection criteria (documented below).
     * @return builder
     */
    def sourceSelectionCriterias(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleSourceSelectionCriteriaArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleSourceSelectionCriteriaArgs.builder
      builder.sourceSelectionCriterias(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketOwnershipControlsState.Builder)
    /**
     * @param rule Configuration block(s) with Ownership Controls rules. Detailed below.
     * @return builder
     */
    def rule(args: Endofunction[com.pulumi.aws.s3.inputs.BucketOwnershipControlsRuleArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketOwnershipControlsState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketOwnershipControlsRuleArgs.builder
      builder.rule(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketState.Builder)
    /**
     * @param corsRules Rule of [Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html). See CORS rule below for details. This provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketCorsConfiguration` instead.
     * @return builder
     * @deprecated cors_rule is deprecated. Use the aws.s3.BucketCorsConfiguration resource instead.
     */
    @deprecated def corsRules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketCorsRuleArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketState.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketCorsRuleArgs.builder
      builder.corsRules(args.map(_(argsBuilder).build)*)

    /**
     * @param grants An [ACL policy grant](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#sample-acl). See Grant below for details. Conflicts with `acl`. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketAcl` instead.
     * @return builder
     * @deprecated grant is deprecated. Use the aws.s3.BucketAcl resource instead.
     */
    @deprecated def grants(args: Endofunction[com.pulumi.aws.s3.inputs.BucketGrantArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketState.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketGrantArgs.builder
      builder.grants(args.map(_(argsBuilder).build)*)

    /**
     * @param lifecycleRules Configuration of [object lifecycle management](http://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html). See Lifecycle Rule below for details. The provider will only perform drift detection if a configuration value is provided.
     *  Use the resource `aws.s3.BucketLifecycleConfiguration` instead.
     * @return builder
     * @deprecated lifecycle_rule is deprecated. Use the aws.s3.BucketLifecycleConfiguration resource instead.
     */
    @deprecated def lifecycleRules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleRuleArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketState.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleRuleArgs.builder
      builder.lifecycleRules(args.map(_(argsBuilder).build)*)

    /**
     * @param logging Configuration of [S3 bucket logging](https://docs.aws.amazon.com/AmazonS3/latest/UG/ManagingBucketLogging.html) parameters. See Logging below for details. The provider will only perform drift detection if a configuration value is provided.
     *  Use the resource `aws.s3.BucketLogging` instead.
     * @return builder
     * @deprecated logging is deprecated. Use the aws.s3.BucketLogging resource instead.
     */
    @deprecated def logging(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLoggingArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLoggingArgs.builder
      builder.logging(args(argsBuilder).build)

    /**
     * @param objectLockConfiguration Configuration of [S3 object locking](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html). See Object Lock Configuration below for details.
     *  The provider wil only perform drift detection if a configuration value is provided.
     *  Use the `objectLockEnabled` parameter and the resource `aws.s3.BucketObjectLockConfiguration` instead.
     * @return builder
     * @deprecated object_lock_configuration is deprecated. Use the top-level parameter objectLockEnabled and the aws.s3.BucketObjectLockConfiguration resource instead.
     */
    @deprecated def objectLockConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationArgs.builder
      builder.objectLockConfiguration(args(argsBuilder).build)

    /**
     * @param policy Valid [bucket policy](https://docs.aws.amazon.com/AmazonS3/latest/dev/example-bucket-policies.html) JSON document. Note that if the policy document is not specific enough (but still valid), this provider may view the policy as constantly changing. In this case, please make sure you use the verbose/specific version of the policy. For more information about building AWS IAM policy documents with this provider, see the AWS IAM Policy Document Guide.
     *  The provider will only perform drift detection if a configuration value is provided.
     *  Use the resource `aws.s3.BucketPolicy` instead.
     * @return builder
     * @deprecated policy is deprecated. Use the aws.s3.BucketPolicy resource instead.
     */
    @deprecated def policy(args: Endofunction[com.pulumi.aws.s3.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

    /**
     * @param replicationConfiguration Configuration of [replication configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html). See Replication Configuration below for details. The provider will only perform drift detection if a configuration value is provided.
     *  Use the resource `aws.s3.BucketReplicationConfig` instead.
     * @return builder
     * @deprecated replication_configuration is deprecated. Use the aws.s3.BucketReplicationConfig resource instead.
     */
    @deprecated def replicationConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigurationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigurationArgs.builder
      builder.replicationConfiguration(args(argsBuilder).build)

    /**
     * @param serverSideEncryptionConfiguration Configuration of [server-side encryption configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html). See Server Side Encryption Configuration below for details.
     *  The provider will only perform drift detection if a configuration value is provided.
     *  Use the resource `aws.s3.BucketServerSideEncryptionConfiguration` instead.
     * @return builder
     * @deprecated server_side_encryption_configuration is deprecated. Use the aws.s3.BucketServerSideEncryptionConfiguration resource instead.
     */
    @deprecated def serverSideEncryptionConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationArgs.builder
      builder.serverSideEncryptionConfiguration(args(argsBuilder).build)

    /**
     * @param versioning Configuration of the [S3 bucket versioning state](https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html). See Versioning below for details. The provider will only perform drift detection if a configuration value is provided. Use the resource `aws.s3.BucketVersioning` instead.
     * @return builder
     * @deprecated versioning is deprecated. Use the aws.s3.BucketVersioning resource instead.
     */
    @deprecated def versioning(args: Endofunction[com.pulumi.aws.s3.inputs.BucketVersioningArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketVersioningArgs.builder
      builder.versioning(args(argsBuilder).build)

    /**
     * @param website Configuration of the [S3 bucket website](https://docs.aws.amazon.com/AmazonS3/latest/userguide/WebsiteHosting.html). See Website below for details. The provider will only perform drift detection if a configuration value is provided.
     *  Use the resource `aws.s3.BucketWebsiteConfiguration` instead.
     * @return builder
     * @deprecated website is deprecated. Use the aws.s3.BucketWebsiteConfiguration resource instead.
     */
    @deprecated def website(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteArgs.builder
      builder.website(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleArgs.Builder)
    /**
     * @param destination Specifies the destination for the rule (documented below).
     * @return builder
     */
    def destination(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleDestinationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

    /**
     * @param filter Filter that identifies subset of objects to which the replication rule applies (documented below).
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleFilterArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param sourceSelectionCriteria Specifies special object selection criteria (documented below).
     * @return builder
     */
    def sourceSelectionCriteria(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleSourceSelectionCriteriaArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleSourceSelectionCriteriaArgs.builder
      builder.sourceSelectionCriteria(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2State.Builder)
    /**
     * @param errorDocument Name of the error document for the website. See below.
     * @return builder
     */
    def errorDocument(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2ErrorDocumentArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2State.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2ErrorDocumentArgs.builder
      builder.errorDocument(args(argsBuilder).build)

    /**
     * @param indexDocument Name of the index document for the website. See below.
     * @return builder
     */
    def indexDocument(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2IndexDocumentArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2State.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2IndexDocumentArgs.builder
      builder.indexDocument(args(argsBuilder).build)

    /**
     * @param redirectAllRequestsTo Redirect behavior for every request to this bucket&#39;s website endpoint. See below. Conflicts with `errorDocument`, `indexDocument`, and `routingRule`.
     * @return builder
     */
    def redirectAllRequestsTo(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2RedirectAllRequestsToArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2State.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2RedirectAllRequestsToArgs.builder
      builder.redirectAllRequestsTo(args(argsBuilder).build)

    /**
     * @param routingRules List of rules that define when a redirect is applied and the redirect behavior. See below.
     * @return builder
     */
    def routingRules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2RoutingRuleArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2State.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2RoutingRuleArgs.builder
      builder.routingRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationArgs.Builder)
    /**
     * @param rule Object Lock rule in place for this bucket (documented below).
     * @return builder
     * @deprecated rule is deprecated. Use the aws.s3.BucketObjectLockConfiguration resource instead.
     */
    @deprecated def rule(args: Endofunction[com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationRuleArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationRuleArgs.builder
      builder.rule(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleFilterArgs.Builder)
    /**
     * @param and Configuration block used to apply a logical `AND` to two or more predicates. See below. The Lifecycle Rule will apply to any object matching all the predicates configured inside the `and` block.
     * @return builder
     */
    def and(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleFilterAndArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleFilterArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleFilterAndArgs.builder
      builder.and(args(argsBuilder).build)

    /**
     * @param tag Configuration block for specifying a tag key and value. See below.
     * @return builder
     */
    def tag(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleFilterTagArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleFilterArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleFilterTagArgs.builder
      builder.tag(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2RoutingRuleArgs.Builder)
    /**
     * @param condition Configuration block for describing a condition that must be met for the specified redirect to apply. See below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2RoutingRuleConditionArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2RoutingRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2RoutingRuleConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param redirect Configuration block for redirect information. See below.
     * @return builder
     */
    def redirect(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2RoutingRuleRedirectArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2RoutingRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationV2RoutingRuleRedirectArgs.builder
      builder.redirect(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketLoggingState.Builder)
    /**
     * @param targetGrants Set of configuration blocks with information for granting permissions. See below.
     * @return builder
     */
    def targetGrants(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLoggingTargetGrantArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketLoggingState.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketLoggingTargetGrantArgs.builder
      builder.targetGrants(args.map(_(argsBuilder).build)*)

    /**
     * @param targetObjectKeyFormat Amazon S3 key format for log objects. See below.
     * @return builder
     */
    def targetObjectKeyFormat(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLoggingTargetObjectKeyFormatArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLoggingState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLoggingTargetObjectKeyFormatArgs.builder
      builder.targetObjectKeyFormat(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.AnalyticsConfigurationStorageClassAnalysisDataExportDestinationArgs.Builder)
    /**
     * @param s3BucketDestination Analytics data export currently only supports an S3 bucket destination (documented below).
     * @return builder
     */
    def s3BucketDestination(args: Endofunction[com.pulumi.aws.s3.inputs.AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestinationArgs.Builder]):
        com.pulumi.aws.s3.inputs.AnalyticsConfigurationStorageClassAnalysisDataExportDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.AnalyticsConfigurationStorageClassAnalysisDataExportDestinationS3BucketDestinationArgs.builder
      builder.s3BucketDestination(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationV2RuleArgs.Builder)
    /**
     * @param applyServerSideEncryptionByDefault Single object for setting server-side encryption by default. See below.
     * @return builder
     */
    def applyServerSideEncryptionByDefault(args: Endofunction[com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationV2RuleApplyServerSideEncryptionByDefaultArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationV2RuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationV2RuleApplyServerSideEncryptionByDefaultArgs.builder
      builder.applyServerSideEncryptionByDefault(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationRuleArgs.Builder)
    /**
     * @param defaultRetention Configuration block for specifying the default Object Lock retention settings for new objects placed in the specified bucket. See below.
     * @return builder
     */
    def defaultRetention(args: Endofunction[com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationRuleDefaultRetentionArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationRuleDefaultRetentionArgs.builder
      builder.defaultRetention(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketV2ObjectLockConfigurationRuleArgs.Builder)
    /**
     * @param defaultRetentions Default retention period that you want to apply to new objects placed in this bucket (documented below).
     * @return builder
     */
    def defaultRetentions(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2ObjectLockConfigurationRuleDefaultRetentionArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2ObjectLockConfigurationRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2ObjectLockConfigurationRuleDefaultRetentionArgs.builder
      builder.defaultRetentions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationV2RuleArgs.Builder)
    /**
     * @param defaultRetention Configuration block for specifying the default Object Lock retention settings for new objects placed in the specified bucket. See below.
     * @return builder
     */
    def defaultRetention(args: Endofunction[com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationV2RuleDefaultRetentionArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationV2RuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationV2RuleDefaultRetentionArgs.builder
      builder.defaultRetention(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationInventoryTableConfigurationArgs.Builder)
    /**
     * @param encryptionConfiguration Encryption configuration for the inventory table. See `encryptionConfiguration` Block for details.
     * @return builder
     */
    def encryptionConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationInventoryTableConfigurationEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationInventoryTableConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketMetadataConfigurationMetadataConfigurationInventoryTableConfigurationEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.ObjectCopyOverrideProviderArgs.Builder)
    /**
     * @param defaultTags Override the provider `defaultTags` configuration block.
     * @return builder
     */
    def defaultTags(args: Endofunction[com.pulumi.aws.s3.inputs.ObjectCopyOverrideProviderDefaultTagsArgs.Builder]):
        com.pulumi.aws.s3.inputs.ObjectCopyOverrideProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.ObjectCopyOverrideProviderDefaultTagsArgs.builder
      builder.defaultTags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationRoutingRuleArgs.Builder)
    /**
     * @param condition Configuration block for describing a condition that must be met for the specified redirect to apply. See below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationRoutingRuleConditionArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationRoutingRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationRoutingRuleConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param redirect Configuration block for redirect information. See below.
     * @return builder
     */
    def redirect(args: Endofunction[com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationRoutingRuleRedirectArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationRoutingRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketWebsiteConfigurationRoutingRuleRedirectArgs.builder
      builder.redirect(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.AnalyticsConfigurationState.Builder)
    /**
     * @param filter Object filtering that accepts a prefix, tags, or a logical AND of prefix and tags (documented below).
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.aws.s3.inputs.AnalyticsConfigurationFilterArgs.Builder]):
        com.pulumi.aws.s3.inputs.AnalyticsConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.AnalyticsConfigurationFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param storageClassAnalysis Configuration for the analytics data export (documented below).
     * @return builder
     */
    def storageClassAnalysis(args: Endofunction[com.pulumi.aws.s3.inputs.AnalyticsConfigurationStorageClassAnalysisArgs.Builder]):
        com.pulumi.aws.s3.inputs.AnalyticsConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.AnalyticsConfigurationStorageClassAnalysisArgs.builder
      builder.storageClassAnalysis(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationState.Builder)
    /**
     * @param rules List of configuration blocks describing the rules managing the replication. See below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationTimeoutsArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleSourceSelectionCriteriaArgs.Builder)
    /**
     * @param sseKmsEncryptedObjects Match SSE-KMS encrypted objects (documented below). If specified, `replicaKmsKeyId`
     *  in `destination` must be specified as well.
     * @return builder
     */
    def sseKmsEncryptedObjects(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleSourceSelectionCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectArgs.builder
      builder.sseKmsEncryptedObjects(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationArgs.Builder)
    /**
     * @param accessControlTranslation Configuration block that specifies the overrides to use for object owners on replication. See below. Specify this only in a cross-account scenario (where source and destination bucket owners are not the same), and you want to change replica ownership to the AWS account that owns the destination bucket. If this is not specified in the replication configuration, the replicas are owned by same AWS account that owns the source object. Must be used in conjunction with `account` owner override configuration.
     * @return builder
     */
    def accessControlTranslation(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationAccessControlTranslationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationAccessControlTranslationArgs.builder
      builder.accessControlTranslation(args(argsBuilder).build)

    /**
     * @param encryptionConfiguration Configuration block that provides information about encryption. See below. If `sourceSelectionCriteria` is specified, you must specify this element.
     * @return builder
     */
    def encryptionConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

    /**
     * @param metrics Configuration block that specifies replication metrics-related settings enabling replication metrics and events. See below.
     * @return builder
     */
    def metrics(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationMetricsArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationMetricsArgs.builder
      builder.metrics(args(argsBuilder).build)

    /**
     * @param replicationTime Configuration block that specifies S3 Replication Time Control (S3 RTC), including whether S3 RTC is enabled and the time when all objects and operations on objects must be replicated. See below. Replication Time Control must be used in conjunction with `metrics`.
     * @return builder
     */
    def replicationTime(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationReplicationTimeArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationReplicationTimeArgs.builder
      builder.replicationTime(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2State.Builder)
    /**
     * @param rules List of configuration blocks describing the rules managing the replication. See below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2State.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2TimeoutsArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2State.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2TimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketReplicationConfigState.Builder)
    /**
     * @param rules List of configuration blocks describing the rules managing the replication. See below.
     *  
     *  &gt; **NOTE:** Replication to multiple destination buckets requires that `priority` is specified in the `rule` object. If the corresponding rule requires no filter, an empty configuration block `filter {}` must be specified.
     *  
     *  &gt; **NOTE:** Amazon S3&#39;s latest version of the replication configuration is V2, which includes the `filter` attribute for replication rules.
     *  
     *  &gt; **NOTE:** The `existingObjectReplication` parameter is not supported by Amazon S3 at this time and should not be included in your `rule` configurations. Specifying this parameter will result in `MalformedXML` errors.
     *  To replicate existing objects, please refer to the [Replicating existing objects with S3 Batch Replication](https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-batch-replication-batch.html) documentation in the Amazon S3 User Guide.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigState.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketLoggingV2TargetGrantArgs.Builder)
    /**
     * @param grantee Configuration block for the person being granted permissions. See below.
     * @return builder
     */
    def grantee(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLoggingV2TargetGrantGranteeArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLoggingV2TargetGrantArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLoggingV2TargetGrantGranteeArgs.builder
      builder.grantee(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketAclV2AccessControlPolicyArgs.Builder)
    /**
     * @param grants Set of `grant` configuration blocks. See below.
     * @return builder
     */
    def grants(args: Endofunction[com.pulumi.aws.s3.inputs.BucketAclV2AccessControlPolicyGrantArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketAclV2AccessControlPolicyArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketAclV2AccessControlPolicyGrantArgs.builder
      builder.grants(args.map(_(argsBuilder).build)*)

    /**
     * @param owner Configuration block for the bucket owner&#39;s display name and ID. See below.
     * @return builder
     */
    def owner(args: Endofunction[com.pulumi.aws.s3.inputs.BucketAclV2AccessControlPolicyOwnerArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketAclV2AccessControlPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketAclV2AccessControlPolicyOwnerArgs.builder
      builder.owner(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleDestinationArgs.Builder)
    /**
     * @param accessControlTranslation Specifies the overrides to use for object owners on replication (documented below). Must be used in conjunction with `accountId` owner override configuration.
     * @return builder
     */
    def accessControlTranslation(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleDestinationAccessControlTranslationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleDestinationAccessControlTranslationArgs.builder
      builder.accessControlTranslation(args(argsBuilder).build)

    /**
     * @param metrics Enables replication metrics (required for S3 RTC) (documented below).
     * @return builder
     */
    def metrics(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleDestinationMetricsArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleDestinationMetricsArgs.builder
      builder.metrics(args(argsBuilder).build)

    /**
     * @param replicationTime Enables S3 Replication Time Control (S3 RTC) (documented below).
     * @return builder
     */
    def replicationTime(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleDestinationReplicationTimeArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleDestinationReplicationTimeArgs.builder
      builder.replicationTime(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleArgs.Builder)
    /**
     * @param abortIncompleteMultipartUpload Configuration block that specifies the days since the initiation of an incomplete multipart upload that Amazon S3 will wait before permanently removing all parts of the upload. See below.
     * @return builder
     */
    def abortIncompleteMultipartUpload(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadArgs.builder
      builder.abortIncompleteMultipartUpload(args(argsBuilder).build)

    /**
     * @param expiration Configuration block that specifies the expiration for the lifecycle of the object in the form of date, days and, whether the object has a delete marker. See below.
     * @return builder
     */
    def expiration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleExpirationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleExpirationArgs.builder
      builder.expiration(args(argsBuilder).build)

    /**
     * @param filter Configuration block used to identify objects that a Lifecycle Rule applies to.
     *  See below.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleFilterArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param noncurrentVersionExpiration Configuration block that specifies when noncurrent object versions expire. See below.
     * @return builder
     */
    def noncurrentVersionExpiration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleNoncurrentVersionExpirationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleNoncurrentVersionExpirationArgs.builder
      builder.noncurrentVersionExpiration(args(argsBuilder).build)

    /**
     * @param noncurrentVersionTransitions Set of configuration blocks that specify the transition rule for the lifecycle rule that describes when noncurrent objects transition to a specific storage class. See below.
     * @return builder
     */
    def noncurrentVersionTransitions(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleNoncurrentVersionTransitionArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleNoncurrentVersionTransitionArgs.builder
      builder.noncurrentVersionTransitions(args.map(_(argsBuilder).build)*)

    /**
     * @param transitions Set of configuration blocks that specify when an Amazon S3 object transitions to a specified storage class. See below.
     * @return builder
     */
    def transitions(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleTransitionArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleTransitionArgs.builder
      builder.transitions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketVersioningV2State.Builder)
    /**
     * @param versioningConfiguration Configuration block for the versioning parameters. See below.
     * @return builder
     */
    def versioningConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.BucketVersioningV2VersioningConfigurationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketVersioningV2State.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketVersioningV2VersioningConfigurationArgs.builder
      builder.versioningConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationMetricsArgs.Builder)
    /**
     * @param eventThreshold Configuration block that specifies the time threshold for emitting the `s3:Replication:OperationMissedThreshold` event. See below.
     * @return builder
     */
    def eventThreshold(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationMetricsEventThresholdArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationMetricsArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationMetricsEventThresholdArgs.builder
      builder.eventThreshold(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.VectorsIndexState.Builder)
    /**
     * @param encryptionConfigurations Block for encryption configuration for the vector index. See `encyptionConfiguration` block below.
     * @return builder
     */
    def encryptionConfigurations(args: Endofunction[com.pulumi.aws.s3.inputs.VectorsIndexEncryptionConfigurationArgs.Builder]*):
        com.pulumi.aws.s3.inputs.VectorsIndexState.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.VectorsIndexEncryptionConfigurationArgs.builder
      builder.encryptionConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param metadataConfiguration Block for metadata configuration for the vector index. See `metadataConfiguration` block below.
     * @return builder
     */
    def metadataConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.VectorsIndexMetadataConfigurationArgs.Builder]):
        com.pulumi.aws.s3.inputs.VectorsIndexState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.VectorsIndexMetadataConfigurationArgs.builder
      builder.metadataConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleDestinationArgs.Builder)
    /**
     * @param accessControlTranslations Specifies the overrides to use for object owners on replication (documented below). Must be used in conjunction with `accountId` owner override configuration.
     * @return builder
     */
    def accessControlTranslations(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleDestinationAccessControlTranslationArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleDestinationArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleDestinationAccessControlTranslationArgs.builder
      builder.accessControlTranslations(args.map(_(argsBuilder).build)*)

    /**
     * @param metrics Enables replication metrics (required for S3 RTC) (documented below).
     * @return builder
     */
    def metrics(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleDestinationMetricArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleDestinationArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleDestinationMetricArgs.builder
      builder.metrics(args.map(_(argsBuilder).build)*)

    /**
     * @param replicationTimes Enables S3 Replication Time Control (S3 RTC) (documented below).
     * @return builder
     */
    def replicationTimes(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleDestinationReplicationTimeArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleDestinationArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2ReplicationConfigurationRuleDestinationReplicationTimeArgs.builder
      builder.replicationTimes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketAbacState.Builder)
    /**
     * @param abacStatus ABAC status configuration. See `abacStatus` Block for details.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def abacStatus(args: Endofunction[com.pulumi.aws.s3.inputs.BucketAbacAbacStatusArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketAbacState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketAbacAbacStatusArgs.builder
      builder.abacStatus(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.VectorsVectorBucketState.Builder)
    /**
     * @param encryptionConfigurations Encryption configuration for the vector bucket. See Encryption Configuration below for more details.
     * @return builder
     */
    def encryptionConfigurations(args: Endofunction[com.pulumi.aws.s3.inputs.VectorsVectorBucketEncryptionConfigurationArgs.Builder]*):
        com.pulumi.aws.s3.inputs.VectorsVectorBucketState.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.VectorsVectorBucketEncryptionConfigurationArgs.builder
      builder.encryptionConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketNotificationState.Builder)
    /**
     * @param lambdaFunctions Used to configure notifications to a Lambda Function. See below.
     * @return builder
     */
    def lambdaFunctions(args: Endofunction[com.pulumi.aws.s3.inputs.BucketNotificationLambdaFunctionArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketNotificationState.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketNotificationLambdaFunctionArgs.builder
      builder.lambdaFunctions(args.map(_(argsBuilder).build)*)

    /**
     * @param queues Notification configuration to SQS Queue. See below.
     * @return builder
     */
    def queues(args: Endofunction[com.pulumi.aws.s3.inputs.BucketNotificationQueueArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketNotificationState.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketNotificationQueueArgs.builder
      builder.queues(args.map(_(argsBuilder).build)*)

    /**
     * @param topics Notification configuration to SNS Topic. See below.
     * @return builder
     */
    def topics(args: Endofunction[com.pulumi.aws.s3.inputs.BucketNotificationTopicArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketNotificationState.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketNotificationTopicArgs.builder
      builder.topics(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleArgs.Builder)
    /**
     * @param deleteMarkerReplication Whether delete markers are replicated. This argument is only valid with V2 replication configurations (i.e., when `filter` is used)documented below.
     * @return builder
     */
    def deleteMarkerReplication(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDeleteMarkerReplicationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDeleteMarkerReplicationArgs.builder
      builder.deleteMarkerReplication(args(argsBuilder).build)

    /**
     * @param destination Specifies the destination for the rule. See below.
     * @return builder
     */
    def destination(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

    /**
     * @param existingObjectReplication Replicate existing objects in the source bucket according to the rule configurations. See below.
     * @return builder
     */
    def existingObjectReplication(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleExistingObjectReplicationArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleExistingObjectReplicationArgs.builder
      builder.existingObjectReplication(args(argsBuilder).build)

    /**
     * @param filter Filter that identifies subset of objects to which the replication rule applies. See below. If not specified, the `rule` will default to using `prefix`.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleFilterArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param sourceSelectionCriteria Specifies special object selection criteria. See below.
     * @return builder
     */
    def sourceSelectionCriteria(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleSourceSelectionCriteriaArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleSourceSelectionCriteriaArgs.builder
      builder.sourceSelectionCriteria(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleSourceSelectionCriteriaArgs.Builder)
    /**
     * @param replicaModifications Configuration block that you can specify for selections for modifications on replicas. Amazon S3 doesn&#39;t replicate replica modifications by default. In the latest version of replication configuration (when `filter` is specified), you can specify this element and set the status to `Enabled` to replicate modifications on replicas.
     * @return builder
     */
    def replicaModifications(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleSourceSelectionCriteriaReplicaModificationsArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleSourceSelectionCriteriaArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleSourceSelectionCriteriaReplicaModificationsArgs.builder
      builder.replicaModifications(args(argsBuilder).build)

    /**
     * @param sseKmsEncryptedObjects Configuration block for filter information for the selection of Amazon S3 objects encrypted with AWS KMS. If specified, `replicaKmsKeyId` in `destination` `encryptionConfiguration` must be specified as well.
     * @return builder
     */
    def sseKmsEncryptedObjects(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleSourceSelectionCriteriaArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsArgs.builder
      builder.sseKmsEncryptedObjects(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketLoggingTargetObjectKeyFormatArgs.Builder)
    /**
     * @param partitionedPrefix Partitioned S3 key for log objects, in the form `[targetPrefix][SourceAccountId]/[SourceRegion]/[SourceBucket]/[YYYY]/[MM]/[DD]/[YYYY]-[MM]-[DD]-[hh]-[mm]-[ss]-[UniqueString]`. Conflicts with `simplePrefix`. See below.
     * @return builder
     */
    def partitionedPrefix(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLoggingTargetObjectKeyFormatPartitionedPrefixArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLoggingTargetObjectKeyFormatArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLoggingTargetObjectKeyFormatPartitionedPrefixArgs.builder
      builder.partitionedPrefix(args(argsBuilder).build)

    /**
     * @param simplePrefix Use the simple format for S3 keys for log objects, in the form `[targetPrefix][YYYY]-[MM]-[DD]-[hh]-[mm]-[ss]-[UniqueString]`. To use, set `simplePrefix {}`. Conflicts with `partitionedPrefix`.
     * @return builder
     */
    def simplePrefix(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLoggingTargetObjectKeyFormatSimplePrefixArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLoggingTargetObjectKeyFormatArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLoggingTargetObjectKeyFormatSimplePrefixArgs.builder
      builder.simplePrefix(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.InventoryState.Builder)
    /**
     * @param destination Contains information about where to publish the inventory results (documented below).
     * @return builder
     */
    def destination(args: Endofunction[com.pulumi.aws.s3.inputs.InventoryDestinationArgs.Builder]):
        com.pulumi.aws.s3.inputs.InventoryState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.InventoryDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

    /**
     * @param filter Specifies an inventory filter. The inventory only includes objects that meet the filter&#39;s criteria (documented below).
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.aws.s3.inputs.InventoryFilterArgs.Builder]):
        com.pulumi.aws.s3.inputs.InventoryState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.InventoryFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param schedule Specifies the schedule for generating inventory results (documented below).
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.aws.s3.inputs.InventoryScheduleArgs.Builder]):
        com.pulumi.aws.s3.inputs.InventoryState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.InventoryScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationV2State.Builder)
    /**
     * @param rule Configuration block for specifying the Object Lock rule for the specified object. See below.
     * @return builder
     */
    def rule(args: Endofunction[com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationV2RuleArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationV2State.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketObjectLockConfigurationV2RuleArgs.builder
      builder.rule(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketV2LifecycleRuleArgs.Builder)
    /**
     * @param expirations Specifies a period in the object&#39;s expire. See Expiration below for details.
     * @return builder
     */
    def expirations(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2LifecycleRuleExpirationArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2LifecycleRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2LifecycleRuleExpirationArgs.builder
      builder.expirations(args.map(_(argsBuilder).build)*)

    /**
     * @param noncurrentVersionExpirations Specifies when noncurrent object versions expire. See Noncurrent Version Expiration below for details.
     * @return builder
     */
    def noncurrentVersionExpirations(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2LifecycleRuleNoncurrentVersionExpirationArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2LifecycleRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2LifecycleRuleNoncurrentVersionExpirationArgs.builder
      builder.noncurrentVersionExpirations(args.map(_(argsBuilder).build)*)

    /**
     * @param noncurrentVersionTransitions Specifies when noncurrent object versions transitions. See Noncurrent Version Transition below for details.
     * @return builder
     */
    def noncurrentVersionTransitions(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2LifecycleRuleNoncurrentVersionTransitionArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2LifecycleRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2LifecycleRuleNoncurrentVersionTransitionArgs.builder
      builder.noncurrentVersionTransitions(args.map(_(argsBuilder).build)*)

    /**
     * @param transitions Specifies a period in the object&#39;s transitions. See Transition below for details.
     * @return builder
     */
    def transitions(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2LifecycleRuleTransitionArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2LifecycleRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2LifecycleRuleTransitionArgs.builder
      builder.transitions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketAclAccessControlPolicyArgs.Builder)
    /**
     * @param grants Set of `grant` configuration blocks. See below.
     * @return builder
     */
    def grants(args: Endofunction[com.pulumi.aws.s3.inputs.BucketAclAccessControlPolicyGrantArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketAclAccessControlPolicyArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketAclAccessControlPolicyGrantArgs.builder
      builder.grants(args.map(_(argsBuilder).build)*)

    /**
     * @param owner Configuration block for the bucket owner&#39;s display name and ID. See below.
     * @return builder
     */
    def owner(args: Endofunction[com.pulumi.aws.s3.inputs.BucketAclAccessControlPolicyOwnerArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketAclAccessControlPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketAclAccessControlPolicyOwnerArgs.builder
      builder.owner(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleFilterArgs.Builder)
    /**
     * @param and Configuration block for specifying rule filters. This element is required only if you specify more than one filter. See and below for more details.
     * @return builder
     */
    def and(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleFilterAndArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleFilterArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleFilterAndArgs.builder
      builder.and(args(argsBuilder).build)

    /**
     * @param tag Configuration block for specifying a tag key and value. See below.
     * @return builder
     */
    def tag(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleFilterTagArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleFilterArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleFilterTagArgs.builder
      builder.tag(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketPolicyState.Builder)
    /**
     * @param policy Text of the policy. Although this is a bucket policy rather than an IAM policy, the `aws.iam.getPolicyDocument` data source may be used, so long as it specifies a principal. For more information about building AWS IAM policy documents, see the AWS IAM Policy Document Guide. Note: Bucket policies are limited to 20 KB in size.
     * @return builder
     */
    def policy(args: Endofunction[com.pulumi.aws.s3.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketPolicyState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketIntelligentTieringConfigurationState.Builder)
    /**
     * @param filter Bucket filter. The configuration only includes objects that meet the filter&#39;s criteria (documented below).
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.aws.s3.inputs.BucketIntelligentTieringConfigurationFilterArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketIntelligentTieringConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketIntelligentTieringConfigurationFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param tierings S3 Intelligent-Tiering storage class tiers of the configuration (documented below).
     * @return builder
     */
    def tierings(args: Endofunction[com.pulumi.aws.s3.inputs.BucketIntelligentTieringConfigurationTieringArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketIntelligentTieringConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketIntelligentTieringConfigurationTieringArgs.builder
      builder.tierings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.InventoryDestinationBucketArgs.Builder)
    /**
     * @param encryption Contains the type of server-side encryption to use to encrypt the inventory (documented below).
     * @return builder
     */
    def encryption(args: Endofunction[com.pulumi.aws.s3.inputs.InventoryDestinationBucketEncryptionArgs.Builder]):
        com.pulumi.aws.s3.inputs.InventoryDestinationBucketArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.InventoryDestinationBucketEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketLoggingV2State.Builder)
    /**
     * @param targetGrants Set of configuration blocks with information for granting permissions. See below.
     * @return builder
     */
    def targetGrants(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLoggingV2TargetGrantArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketLoggingV2State.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketLoggingV2TargetGrantArgs.builder
      builder.targetGrants(args.map(_(argsBuilder).build)*)

    /**
     * @param targetObjectKeyFormat Amazon S3 key format for log objects. See below.
     * @return builder
     */
    def targetObjectKeyFormat(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLoggingV2TargetObjectKeyFormatArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLoggingV2State.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLoggingV2TargetObjectKeyFormatArgs.builder
      builder.targetObjectKeyFormat(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.AnalyticsConfigurationStorageClassAnalysisArgs.Builder)
    /**
     * @param dataExport Data export configuration (documented below).
     * @return builder
     */
    def dataExport(args: Endofunction[com.pulumi.aws.s3.inputs.AnalyticsConfigurationStorageClassAnalysisDataExportArgs.Builder]):
        com.pulumi.aws.s3.inputs.AnalyticsConfigurationStorageClassAnalysisArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.AnalyticsConfigurationStorageClassAnalysisDataExportArgs.builder
      builder.dataExport(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.PolicyDocumentArgs.Builder)
    def Statement(args: Endofunction[com.pulumi.aws.iam.inputs.PolicyStatementArgs.Builder]*):
        com.pulumi.aws.s3.inputs.PolicyDocumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.iam.inputs.PolicyStatementArgs.builder
      builder.Statement(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationState.Builder)
    /**
     * @param rules Set of server-side encryption configuration rules. See below. Currently, only a single rule is supported.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationRuleArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationReplicationTimeArgs.Builder)
    /**
     * @param time Configuration block specifying the time by which replication should be complete for all objects and operations on objects. See below.
     * @return builder
     */
    def time(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationReplicationTimeTimeArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationReplicationTimeArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationReplicationTimeTimeArgs.builder
      builder.time(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketReplicationConfigurationArgs.Builder)
    /**
     * @param rules Specifies the rules managing the replication (documented below).
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketReplicationConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationV2State.Builder)
    /**
     * @param rules Set of server-side encryption configuration rules. See below. Currently, only a single rule is supported.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationV2RuleArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationV2State.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationV2RuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.BucketV2ObjectLockConfigurationArgs.Builder)
    /**
     * @param rules Object Lock rule in place for this bucket (documented below).
     * @return builder
     * @deprecated rule is deprecated. Use the aws.s3.BucketObjectLockConfiguration resource instead.
     */
    @deprecated def rules(args: Endofunction[com.pulumi.aws.s3.inputs.BucketV2ObjectLockConfigurationRuleArgs.Builder]*):
        com.pulumi.aws.s3.inputs.BucketV2ObjectLockConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3.inputs.BucketV2ObjectLockConfigurationRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3.inputs.AnalyticsConfigurationStorageClassAnalysisDataExportArgs.Builder)
    /**
     * @param destination Specifies the destination for the exported analytics data (documented below).
     * @return builder
     */
    def destination(args: Endofunction[com.pulumi.aws.s3.inputs.AnalyticsConfigurationStorageClassAnalysisDataExportDestinationArgs.Builder]):
        com.pulumi.aws.s3.inputs.AnalyticsConfigurationStorageClassAnalysisDataExportArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.AnalyticsConfigurationStorageClassAnalysisDataExportDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.InventoryDestinationArgs.Builder)
    /**
     * @param bucket S3 bucket configuration where inventory results are published (documented below).
     * @return builder
     */
    def bucket(args: Endofunction[com.pulumi.aws.s3.inputs.InventoryDestinationBucketArgs.Builder]):
        com.pulumi.aws.s3.inputs.InventoryDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.InventoryDestinationBucketArgs.builder
      builder.bucket(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketAclAccessControlPolicyGrantArgs.Builder)
    /**
     * @param grantee Configuration block for the person being granted permissions. See below.
     * @return builder
     */
    def grantee(args: Endofunction[com.pulumi.aws.s3.inputs.BucketAclAccessControlPolicyGrantGranteeArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketAclAccessControlPolicyGrantArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketAclAccessControlPolicyGrantGranteeArgs.builder
      builder.grantee(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleFilterArgs.Builder)
    /**
     * @param and Configuration block used to apply a logical `AND` to two or more predicates. See below. The Lifecycle Rule will apply to any object matching all the predicates configured inside the `and` block.
     * @return builder
     */
    def and(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleFilterAndArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleFilterArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleFilterAndArgs.builder
      builder.and(args(argsBuilder).build)

    /**
     * @param tag Configuration block for specifying a tag key and value. See below.
     * @return builder
     */
    def tag(args: Endofunction[com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleFilterTagArgs.Builder]):
        com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleFilterArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationRuleFilterTagArgs.builder
      builder.tag(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3.InventoryArgs.Builder)
    /**
     * @param destination Contains information about where to publish the inventory results (documented below).
     * @return builder
     */
    def destination(args: Endofunction[com.pulumi.aws.s3.inputs.InventoryDestinationArgs.Builder]):
        com.pulumi.aws.s3.InventoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.InventoryDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

    /**
     * @param filter Specifies an inventory filter. The inventory only includes objects that meet the filter&#39;s criteria (documented below).
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.aws.s3.inputs.InventoryFilterArgs.Builder]):
        com.pulumi.aws.s3.InventoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.InventoryFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param schedule Specifies the schedule for generating inventory results (documented below).
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.aws.s3.inputs.InventoryScheduleArgs.Builder]):
        com.pulumi.aws.s3.InventoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3.inputs.InventoryScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  /**
   * Provides a S3 bucket resource.
   *  
   *  &gt; This resource provides functionality for managing S3 general purpose buckets in an AWS Partition. To manage Amazon S3 Express directory buckets, use the `awsDirectoryBucket` resource. To manage [S3 on Outposts](https://docs.aws.amazon.com/AmazonS3/latest/dev/S3onOutposts.html), use the `aws.s3control.Bucket` resource.
   *  
   *  &gt; Object Lock can be enabled by using the `objectLockEnable` attribute or by using the `aws.s3.BucketObjectLockConfiguration` resource. Please note, that by using the resource, Object Lock can be enabled/disabled without destroying and recreating the bucket.
   *  
   *  &gt; To support ABAC (Attribute Based Access Control) in general purpose buckets, this resource will now attempt to send tags in the create request and use the S3 Control tagging APIs [`TagResource`](https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_TagResource.html), [`UntagResource`](https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_UntagResource.html), and [`ListTagsForResource`](https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListTagsForResource.html) for read and update operations. The calling principal must have the corresponding `s3:TagResource`, `s3:UntagResource`, and `s3:ListTagsForResource` [IAM permissions](https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazons3.html#amazons3-actions-as-permissions). If the principal lacks the appropriate permissions, the provider will fall back to tagging after creation and using the S3 tagging APIs [`PutBucketTagging`](https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketTagging.html), [`DeleteBucketTagging`](https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketTagging.html), and [`GetBucketTagging`](https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketTagging.html) instead. With ABAC enabled, tag modifications may fail with the fall back behavior. See the [AWS documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/buckets-tagging-enable-abac.html) for additional details on enabling ABAC in general purpose buckets.
   */
  def Bucket(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.s3.BucketArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.s3.Bucket(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages Amazon S3 Metadata for a bucket. */
  def BucketMetadataConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketMetadataConfigurationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.s3.BucketMetadataConfigurationArgs.builder
    
    com.pulumi.aws.s3.BucketMetadataConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
