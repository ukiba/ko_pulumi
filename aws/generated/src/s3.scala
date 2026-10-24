package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object s3:
  /**
   * Provides a resource to manage an S3 Access Point.
   * 
   * &gt; **NOTE on Access Points and Access Point Policies:** This provider provides both a standalone Access Point Policy resource and an Access Point resource with a resource policy defined in-line. You cannot use an Access Point with in-line resource policy in conjunction with an Access Point Policy resource. Doing so will cause a conflict of policies and will overwrite the access point&#39;s resource policy.
   * 
   * &gt; Advanced usage: To use a custom API endpoint for this resource, use the `s3control` endpoint provider configuration), not the `s3` endpoint provider configuration.
   * 
   * &gt; This resource can be used with s3 directory buckets. Please see [AWS Documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points-directory-buckets.html) for more information.
   */
  def AccessPoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.AccessPointArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.s3.AccessPointArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.s3.AccessPoint(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages S3 account-level Public Access Block configuration. For more information about these settings, see the [AWS S3 Block Public Access documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html).
   * 
   * &gt; **NOTE:** Each AWS account may only have one S3 Public Access Block configuration. Multiple configurations of the resource against the same AWS account will cause a perpetual difference.
   * 
   * &gt; Advanced usage: To use a custom API endpoint for this resource, use the `s3control` endpoint provider configuration, not the `s3` endpoint provider configuration.
   */
  def AccountPublicAccessBlock(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.AccountPublicAccessBlockArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3.AccountPublicAccessBlockArgs.builder
    com.pulumi.aws.s3.AccountPublicAccessBlock(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a S3 bucket [analytics configuration](https://docs.aws.amazon.com/AmazonS3/latest/dev/analytics-storage-class.html) resource.
   * 
   * &gt; This resource cannot be used with S3 directory buckets.
   */
  def AnalyticsConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.AnalyticsConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.s3.AnalyticsConfigurationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.s3.AnalyticsConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a S3 bucket resource.
   * 
   * &gt; This resource provides functionality for managing S3 general purpose buckets in an AWS Partition. To manage Amazon S3 Express directory buckets, use the `aws.s3.DirectoryBucket` resource. To manage [S3 on Outposts](https://docs.aws.amazon.com/AmazonS3/latest/dev/S3onOutposts.html), use the `aws.s3control.Bucket` resource.
   * 
   * &gt; Object Lock can be enabled by using the `objectLockEnabled` attribute or by using the `aws.s3.BucketObjectLockConfiguration` resource.
   * 
   * &gt; To support ABAC (Attribute Based Access Control) in general purpose buckets, this resource will now attempt to send tags in the create request and use the S3 Control tagging APIs [`TagResource`](https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_TagResource.html), [`UntagResource`](https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_UntagResource.html), and [`ListTagsForResource`](https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListTagsForResource.html) for read and update operations. The calling principal must have the corresponding `s3:TagResource`, `s3:UntagResource`, and `s3:ListTagsForResource` [IAM permissions](https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazons3.html#amazons3-actions-as-permissions). If the principal lacks the appropriate permissions, the provider will fall back to tagging after creation and using the S3 tagging APIs [`PutBucketTagging`](https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketTagging.html), [`DeleteBucketTagging`](https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketTagging.html), and [`GetBucketTagging`](https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketTagging.html) instead. With ABAC enabled, tag modifications may fail with the fall back behavior. See the [AWS documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/buckets-tagging-enable-abac.html) for additional details on enabling ABAC in general purpose buckets.
   */
  def Bucket(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.s3.BucketArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.s3.Bucket(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages ABAC (Attribute Based Access Control) for an AWS S3 (Simple Storage) Bucket.
   * See the [AWS documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/buckets-tagging-enable-abac.html) on enabling ABAC for general purpose buckets for additional information.
   */
  def BucketAbac(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketAbacArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3.BucketAbacArgs.builder
    com.pulumi.aws.s3.BucketAbac(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an S3 bucket accelerate configuration resource. See the [Requirements for using Transfer Acceleration](https://docs.aws.amazon.com/AmazonS3/latest/userguide/transfer-acceleration.html#transfer-acceleration-requirements) for more details.
   * 
   * &gt; This resource cannot be used with S3 directory buckets.
   */
  def BucketAccelerateConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketAccelerateConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3.BucketAccelerateConfigurationArgs.builder
    com.pulumi.aws.s3.BucketAccelerateConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an S3 bucket accelerate configuration resource. See the [Requirements for using Transfer Acceleration](https://docs.aws.amazon.com/AmazonS3/latest/userguide/transfer-acceleration.html#transfer-acceleration-requirements) for more details.
   * 
   * &gt; This resource cannot be used with S3 directory buckets.
   */
  @deprecated("aws.s3/bucketaccelerateconfigurationv2.BucketAccelerateConfigurationV2 has been deprecated in favor of aws.s3/bucketaccelerateconfiguration.BucketAccelerateConfiguration") def BucketAccelerateConfigurationV2(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketAccelerateConfigurationV2Args.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3.BucketAccelerateConfigurationV2Args.builder
    com.pulumi.aws.s3.BucketAccelerateConfigurationV2(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an S3 bucket ACL resource.
   * 
   * &gt; **Note:** destroy does not delete the S3 Bucket ACL but does remove the resource from state.
   * 
   * &gt; This resource cannot be used with S3 directory buckets.
   */
  def BucketAcl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketAclArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3.BucketAclArgs.builder
    com.pulumi.aws.s3.BucketAcl(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an S3 bucket ACL resource.
   * 
   * &gt; **Note:** destroy does not delete the S3 Bucket ACL but does remove the resource from state.
   * 
   * &gt; This resource cannot be used with S3 directory buckets.
   */
  @deprecated("aws.s3/bucketaclv2.BucketAclV2 has been deprecated in favor of aws.s3/bucketacl.BucketAcl") def BucketAclV2(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketAclV2Args.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3.BucketAclV2Args.builder
    com.pulumi.aws.s3.BucketAclV2(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an S3 bucket CORS configuration resource. For more information about CORS, go to [Enabling Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/userguide/cors.html) in the Amazon S3 User Guide.
   * 
   * &gt; **NOTE:** S3 Buckets only support a single CORS configuration. Declaring multiple `aws.s3.BucketCorsConfiguration` resources to the same S3 Bucket will cause a perpetual difference in configuration.
   * 
   * &gt; This resource cannot be used with S3 directory buckets.
   */
  def BucketCorsConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketCorsConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3.BucketCorsConfigurationArgs.builder
    com.pulumi.aws.s3.BucketCorsConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an S3 bucket CORS configuration resource. For more information about CORS, go to [Enabling Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/userguide/cors.html) in the Amazon S3 User Guide.
   * 
   * &gt; **NOTE:** S3 Buckets only support a single CORS configuration. Declaring multiple `aws.s3.BucketCorsConfiguration` resources to the same S3 Bucket will cause a perpetual difference in configuration.
   * 
   * &gt; This resource cannot be used with S3 directory buckets.
   */
  @deprecated("aws.s3/bucketcorsconfigurationv2.BucketCorsConfigurationV2 has been deprecated in favor of aws.s3/bucketcorsconfiguration.BucketCorsConfiguration") def BucketCorsConfigurationV2(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketCorsConfigurationV2Args.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3.BucketCorsConfigurationV2Args.builder
    com.pulumi.aws.s3.BucketCorsConfigurationV2(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an [S3 Intelligent-Tiering](https://docs.aws.amazon.com/AmazonS3/latest/userguide/intelligent-tiering.html) configuration resource.
   * 
   * &gt; This resource cannot be used with S3 directory buckets.
   */
  def BucketIntelligentTieringConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketIntelligentTieringConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.s3.BucketIntelligentTieringConfigurationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.s3.BucketIntelligentTieringConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an independent configuration resource for S3 bucket [lifecycle configuration](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lifecycle-mgmt.html).
   * 
   * An S3 Lifecycle configuration consists of one or more Lifecycle rules. Each rule consists of the following:
   * 
   * * Rule metadata (`id` and `status`)
   * * Filter identifying objects to which the rule applies
   * * One or more transition or expiration actions
   * 
   * For more information see the Amazon S3 User Guide on [`Lifecycle Configuration Elements`](https://docs.aws.amazon.com/AmazonS3/latest/userguide/intro-lifecycle-rules.html).
   * 
   * &gt; S3 Buckets only support a single lifecycle configuration. Declaring multiple `aws.s3.BucketLifecycleConfiguration` resources to the same S3 Bucket will cause a perpetual difference in configuration.
   * 
   * &gt; Lifecycle configurations may take some time to fully propagate to all AWS S3 systems.
   * Running Pulumi operations shortly after creating a lifecycle configuration may result in changes that affect configuration idempotence.
   * See the Amazon S3 User Guide on [setting lifecycle configuration on a bucket](https://docs.aws.amazon.com/AmazonS3/latest/userguide/how-to-set-lifecycle-configuration-intro.html).
   */
  def BucketLifecycleConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketLifecycleConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3.BucketLifecycleConfigurationArgs.builder
    com.pulumi.aws.s3.BucketLifecycleConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an independent configuration resource for S3 bucket [lifecycle configuration](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lifecycle-mgmt.html).
   * 
   * An S3 Lifecycle configuration consists of one or more Lifecycle rules. Each rule consists of the following:
   * 
   * * Rule metadata (`id` and `status`)
   * * Filter identifying objects to which the rule applies
   * * One or more transition or expiration actions
   * 
   * For more information see the Amazon S3 User Guide on [`Lifecycle Configuration Elements`](https://docs.aws.amazon.com/AmazonS3/latest/userguide/intro-lifecycle-rules.html).
   * 
   * &gt; S3 Buckets only support a single lifecycle configuration. Declaring multiple `aws.s3.BucketLifecycleConfiguration` resources to the same S3 Bucket will cause a perpetual difference in configuration.
   * 
   * &gt; Lifecycle configurations may take some time to fully propagate to all AWS S3 systems.
   * Running Pulumi operations shortly after creating a lifecycle configuration may result in changes that affect configuration idempotence.
   * See the Amazon S3 User Guide on [setting lifecycle configuration on a bucket](https://docs.aws.amazon.com/AmazonS3/latest/userguide/how-to-set-lifecycle-configuration-intro.html).
   */
  @deprecated("aws.s3/bucketlifecycleconfigurationv2.BucketLifecycleConfigurationV2 has been deprecated in favor of aws.s3/bucketlifecycleconfiguration.BucketLifecycleConfiguration") def BucketLifecycleConfigurationV2(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketLifecycleConfigurationV2Args.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3.BucketLifecycleConfigurationV2Args.builder
    com.pulumi.aws.s3.BucketLifecycleConfigurationV2(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an S3 bucket (server access) logging resource. For more information, see [Logging requests using server access logging](https://docs.aws.amazon.com/AmazonS3/latest/userguide/ServerLogs.html)
   * in the AWS S3 User Guide.
   * 
   * &gt; **Note:** Amazon S3 supports server access logging, AWS CloudTrail, or a combination of both. Refer to the [Logging options for Amazon S3](https://docs.aws.amazon.com/AmazonS3/latest/userguide/logging-with-S3.html)
   * to decide which method meets your requirements.
   * 
   * &gt; This resource cannot be used with S3 directory buckets.
   */
  def BucketLogging(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketLoggingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3.BucketLoggingArgs.builder
    com.pulumi.aws.s3.BucketLogging(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an S3 bucket (server access) logging resource. For more information, see [Logging requests using server access logging](https://docs.aws.amazon.com/AmazonS3/latest/userguide/ServerLogs.html)
   * in the AWS S3 User Guide.
   * 
   * &gt; **Note:** Amazon S3 supports server access logging, AWS CloudTrail, or a combination of both. Refer to the [Logging options for Amazon S3](https://docs.aws.amazon.com/AmazonS3/latest/userguide/logging-with-S3.html)
   * to decide which method meets your requirements.
   * 
   * &gt; This resource cannot be used with S3 directory buckets.
   */
  @deprecated("aws.s3/bucketloggingv2.BucketLoggingV2 has been deprecated in favor of aws.s3/bucketlogging.BucketLogging") def BucketLoggingV2(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketLoggingV2Args.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3.BucketLoggingV2Args.builder
    com.pulumi.aws.s3.BucketLoggingV2(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages Amazon S3 Metadata for a bucket. */
  def BucketMetadataConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketMetadataConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3.BucketMetadataConfigurationArgs.builder
    com.pulumi.aws.s3.BucketMetadataConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a S3 bucket [metrics configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/metrics-configurations.html) resource. */
  def BucketMetric(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketMetricArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.s3.BucketMetricArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.s3.BucketMetric(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a S3 Bucket Notification Configuration. For additional information, see the [Configuring S3 Event Notifications section in the Amazon S3 Developer Guide](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html).
   * 
   * &gt; **NOTE:** The S3 [`PutBucketNotificationConfiguration`](https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketNotificationConfiguration.html) API is atomic \u2014 it replaces the bucket&#39;s entire notification configuration on every call. Only one `aws.s3.BucketNotification` resource can manage a bucket; declaring more than one causes a perpetual diff, and applying this resource will overwrite any notifications already on the bucket. To configure multiple destinations on the same bucket, declare them all as nested blocks within a single resource (see Trigger multiple Lambda functions below). To let independent teams or Pulumi configurations subscribe to the same bucket without stepping on each other, prefer the Emit events to EventBridge pattern below. To bring existing notifications under management without losing them, see the `aws.s3.BucketNotification` data source.
   * 
   * &gt; This resource cannot be used with S3 directory buckets.
   */
  def BucketNotification(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketNotificationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3.BucketNotificationArgs.builder
    com.pulumi.aws.s3.BucketNotification(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an S3 object resource. */
  def BucketObject(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketObjectArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.s3.BucketObjectArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.s3.BucketObject(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an S3 bucket Object Lock configuration resource. For more information about Object Locking, go to [Using S3 Object Lock](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock.html) in the Amazon S3 User Guide.
   * 
   * &gt; This resource can be used enable Object Lock for **new** and **existing** buckets.
   * 
   * &gt; This resource cannot be used with S3 directory buckets.
   */
  def BucketObjectLockConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketObjectLockConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3.BucketObjectLockConfigurationArgs.builder
    com.pulumi.aws.s3.BucketObjectLockConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an S3 bucket Object Lock configuration resource. For more information about Object Locking, go to [Using S3 Object Lock](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock.html) in the Amazon S3 User Guide.
   * 
   * &gt; This resource can be used enable Object Lock for **new** and **existing** buckets.
   * 
   * &gt; This resource cannot be used with S3 directory buckets.
   */
  @deprecated("aws.s3/bucketobjectlockconfigurationv2.BucketObjectLockConfigurationV2 has been deprecated in favor of aws.s3/bucketobjectlockconfiguration.BucketObjectLockConfiguration") def BucketObjectLockConfigurationV2(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketObjectLockConfigurationV2Args.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3.BucketObjectLockConfigurationV2Args.builder
    com.pulumi.aws.s3.BucketObjectLockConfigurationV2(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an S3 object resource. */
  def BucketObjectv2(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketObjectv2Args.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.s3.BucketObjectv2Args.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.s3.BucketObjectv2(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a resource to manage S3 Bucket Ownership Controls. For more information, see the [S3 Developer Guide](https://docs.aws.amazon.com/AmazonS3/latest/dev/about-object-ownership.html).
   * 
   * &gt; This resource cannot be used with S3 directory buckets.
   */
  def BucketOwnershipControls(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketOwnershipControlsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3.BucketOwnershipControlsArgs.builder
    com.pulumi.aws.s3.BucketOwnershipControls(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Attaches a policy to an S3 bucket resource.
   * 
   * &gt; Policies can be attached to both S3 general purpose buckets and S3 directory buckets.
   */
  def BucketPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3.BucketPolicyArgs.builder
    com.pulumi.aws.s3.BucketPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages S3 bucket-level Public Access Block configuration. For more information about these settings, see the [AWS S3 Block Public Access documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html).
   * 
   * &gt; This resource cannot be used with S3 directory buckets.
   * 
   * &gt; Setting `skipDestroy` to `true` means that the AWS Provider will not destroy a public access block, even when running `terraform destroy`. The configuration is thus an intentional dangling resource that is not managed by Terraform and will remain in-place in your AWS account.
   */
  def BucketPublicAccessBlock(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketPublicAccessBlockArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3.BucketPublicAccessBlockArgs.builder
    com.pulumi.aws.s3.BucketPublicAccessBlock(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an independent configuration resource for S3 bucket [replication configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html).
   * 
   * &gt; **NOTE:** S3 Buckets only support a single replication configuration. Declaring multiple `aws.s3.BucketReplicationConfig` resources to the same S3 Bucket will cause a perpetual difference in configuration.
   * 
   * &gt; This resource cannot be used with S3 directory buckets.
   */
  def BucketReplicationConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketReplicationConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3.BucketReplicationConfigArgs.builder
    com.pulumi.aws.s3.BucketReplicationConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an S3 bucket request payment configuration resource. For more information, see [Requester Pays Buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html).
   * 
   * &gt; **NOTE:** Destroying an `aws.s3.BucketRequestPaymentConfiguration` resource resets the bucket&#39;s `payer` to the S3 default: the bucket owner.
   * 
   * &gt; This resource cannot be used with S3 directory buckets.
   */
  def BucketRequestPaymentConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketRequestPaymentConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3.BucketRequestPaymentConfigurationArgs.builder
    com.pulumi.aws.s3.BucketRequestPaymentConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an S3 bucket request payment configuration resource. For more information, see [Requester Pays Buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html).
   * 
   * &gt; **NOTE:** Destroying an `aws.s3.BucketRequestPaymentConfiguration` resource resets the bucket&#39;s `payer` to the S3 default: the bucket owner.
   * 
   * &gt; This resource cannot be used with S3 directory buckets.
   */
  @deprecated("aws.s3/bucketrequestpaymentconfigurationv2.BucketRequestPaymentConfigurationV2 has been deprecated in favor of aws.s3/bucketrequestpaymentconfiguration.BucketRequestPaymentConfiguration") def BucketRequestPaymentConfigurationV2(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketRequestPaymentConfigurationV2Args.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3.BucketRequestPaymentConfigurationV2Args.builder
    com.pulumi.aws.s3.BucketRequestPaymentConfigurationV2(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a S3 bucket server-side encryption configuration resource.
   * 
   * &gt; **NOTE:** Destroying an `aws.s3.BucketServerSideEncryptionConfiguration` resource resets the bucket to [Amazon S3 bucket default encryption](https://docs.aws.amazon.com/AmazonS3/latest/userguide/default-encryption-faq.html).
   * 
   * &gt; **NOTE:** Starting in April 2026, Amazon S3 will automatically block server-side encryption with customer-provided keys (SSE-C) for all new buckets. Use the `blockedEncryptionTypes` argument to manage this behavior. For more information, see the [SSE-C changes FAQ](https://docs.aws.amazon.com/AmazonS3/latest/userguide/default-s3-c-encryption-setting-faq.html).
   */
  def BucketServerSideEncryptionConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketServerSideEncryptionConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3.BucketServerSideEncryptionConfigurationArgs.builder
    com.pulumi.aws.s3.BucketServerSideEncryptionConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a S3 bucket server-side encryption configuration resource.
   * 
   * &gt; **NOTE:** Destroying an `aws.s3.BucketServerSideEncryptionConfiguration` resource resets the bucket to [Amazon S3 bucket default encryption](https://docs.aws.amazon.com/AmazonS3/latest/userguide/default-encryption-faq.html).
   * 
   * &gt; **NOTE:** Starting in April 2026, Amazon S3 will automatically block server-side encryption with customer-provided keys (SSE-C) for all new buckets. Use the `blockedEncryptionTypes` argument to manage this behavior. For more information, see the [SSE-C changes FAQ](https://docs.aws.amazon.com/AmazonS3/latest/userguide/default-s3-c-encryption-setting-faq.html).
   */
  @deprecated("aws.s3/bucketserversideencryptionconfigurationv2.BucketServerSideEncryptionConfigurationV2 has been deprecated in favor of aws.s3/bucketserversideencryptionconfiguration.BucketServerSideEncryptionConfiguration") def BucketServerSideEncryptionConfigurationV2(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketServerSideEncryptionConfigurationV2Args.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3.BucketServerSideEncryptionConfigurationV2Args.builder
    com.pulumi.aws.s3.BucketServerSideEncryptionConfigurationV2(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a S3 bucket resource.
   * 
   * &gt; This resource provides functionality for managing S3 general purpose buckets in an AWS Partition. To manage Amazon S3 Express directory buckets, use the `aws.s3.DirectoryBucket` resource. To manage [S3 on Outposts](https://docs.aws.amazon.com/AmazonS3/latest/dev/S3onOutposts.html), use the `aws.s3control.Bucket` resource.
   * 
   * &gt; Object Lock can be enabled by using the `objectLockEnabled` attribute or by using the `aws.s3.BucketObjectLockConfiguration` resource.
   * 
   * &gt; To support ABAC (Attribute Based Access Control) in general purpose buckets, this resource will now attempt to send tags in the create request and use the S3 Control tagging APIs [`TagResource`](https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_TagResource.html), [`UntagResource`](https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_UntagResource.html), and [`ListTagsForResource`](https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListTagsForResource.html) for read and update operations. The calling principal must have the corresponding `s3:TagResource`, `s3:UntagResource`, and `s3:ListTagsForResource` [IAM permissions](https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazons3.html#amazons3-actions-as-permissions). If the principal lacks the appropriate permissions, the provider will fall back to tagging after creation and using the S3 tagging APIs [`PutBucketTagging`](https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketTagging.html), [`DeleteBucketTagging`](https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketTagging.html), and [`GetBucketTagging`](https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketTagging.html) instead. With ABAC enabled, tag modifications may fail with the fall back behavior. See the [AWS documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/buckets-tagging-enable-abac.html) for additional details on enabling ABAC in general purpose buckets.
   */
  @deprecated("s3.BucketV2 has been deprecated in favor of s3.Bucket") def BucketV2(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketV2Args.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.s3.BucketV2Args.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.s3.BucketV2(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a resource for controlling versioning on an S3 bucket.
   * Deleting this resource will either suspend versioning on the associated S3 bucket or
   * simply remove the resource from state if the associated S3 bucket is unversioned.
   * 
   * For more information, see [How S3 versioning works](https://docs.aws.amazon.com/AmazonS3/latest/userguide/manage-versioning-examples.html).
   * 
   * &gt; **NOTE:** If you are enabling versioning on the bucket for the first time, AWS recommends that you wait for 15 minutes after enabling versioning before issuing write operations (PUT or DELETE) on objects in the bucket.
   * 
   * &gt; This resource cannot be used with S3 directory buckets.
   */
  def BucketVersioning(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketVersioningArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3.BucketVersioningArgs.builder
    com.pulumi.aws.s3.BucketVersioning(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a resource for controlling versioning on an S3 bucket.
   * Deleting this resource will either suspend versioning on the associated S3 bucket or
   * simply remove the resource from state if the associated S3 bucket is unversioned.
   * 
   * For more information, see [How S3 versioning works](https://docs.aws.amazon.com/AmazonS3/latest/userguide/manage-versioning-examples.html).
   * 
   * &gt; **NOTE:** If you are enabling versioning on the bucket for the first time, AWS recommends that you wait for 15 minutes after enabling versioning before issuing write operations (PUT or DELETE) on objects in the bucket.
   * 
   * &gt; This resource cannot be used with S3 directory buckets.
   */
  @deprecated("aws.s3/bucketversioningv2.BucketVersioningV2 has been deprecated in favor of aws.s3/bucketversioning.BucketVersioning") def BucketVersioningV2(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketVersioningV2Args.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3.BucketVersioningV2Args.builder
    com.pulumi.aws.s3.BucketVersioningV2(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an S3 bucket website configuration resource. For more information, see [Hosting Websites on S3](https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html).
   * 
   * &gt; This resource cannot be used with S3 directory buckets.
   */
  def BucketWebsiteConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketWebsiteConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3.BucketWebsiteConfigurationArgs.builder
    com.pulumi.aws.s3.BucketWebsiteConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an S3 bucket website configuration resource. For more information, see [Hosting Websites on S3](https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html).
   * 
   * &gt; This resource cannot be used with S3 directory buckets.
   */
  @deprecated("aws.s3/bucketwebsiteconfigurationv2.BucketWebsiteConfigurationV2 has been deprecated in favor of aws.s3/bucketwebsiteconfiguration.BucketWebsiteConfiguration") def BucketWebsiteConfigurationV2(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.BucketWebsiteConfigurationV2Args.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3.BucketWebsiteConfigurationV2Args.builder
    com.pulumi.aws.s3.BucketWebsiteConfigurationV2(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an Amazon S3 Express directory bucket resource. */
  def DirectoryBucket(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.DirectoryBucketArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.s3.DirectoryBucketArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.s3.DirectoryBucket(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an S3 Files Access Point. */
  def FilesAccessPoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.FilesAccessPointArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.s3.FilesAccessPointArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.s3.FilesAccessPoint(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an S3 Files File System. */
  def FilesFileSystem(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.FilesFileSystemArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.s3.FilesFileSystemArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.s3.FilesFileSystem(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an S3 Files File System Policy. */
  def FilesFileSystemPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.FilesFileSystemPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3.FilesFileSystemPolicyArgs.builder
    com.pulumi.aws.s3.FilesFileSystemPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an S3 Files Mount Target. */
  def FilesMountTarget(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.FilesMountTargetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3.FilesMountTargetArgs.builder
    com.pulumi.aws.s3.FilesMountTarget(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an S3 Files Synchronization configuration. */
  def FilesSynchronizationConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.FilesSynchronizationConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3.FilesSynchronizationConfigurationArgs.builder
    com.pulumi.aws.s3.FilesSynchronizationConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a S3 bucket [inventory configuration](https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-inventory.html) resource. */
  def Inventory(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.InventoryArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.s3.InventoryArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.s3.Inventory(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a resource for copying an S3 object. */
  def ObjectCopy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.ObjectCopyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.s3.ObjectCopyArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.s3.ObjectCopy(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object S3Functions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Provides details about a specific S3 access point. */
    inline def getAccessPoint(args: Endofunction[com.pulumi.aws.s3.inputs.GetAccessPointArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.s3.outputs.GetAccessPointResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetAccessPointArgs.builder
      com.pulumi.aws.s3.S3Functions.getAccessPoint(args(argsBuilder).build)

    /** Provides details about a specific S3 access point. */
    inline def getAccessPointPlain(args: Endofunction[com.pulumi.aws.s3.inputs.GetAccessPointPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.s3.outputs.GetAccessPointResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetAccessPointPlainArgs.builder
      com.pulumi.aws.s3.S3Functions.getAccessPointPlain(args(argsBuilder).build)

    /** The S3 account public access block data source returns account-level public access block configuration. */
    inline def getAccountPublicAccessBlock(args: Endofunction[com.pulumi.aws.s3.inputs.GetAccountPublicAccessBlockArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.s3.outputs.GetAccountPublicAccessBlockResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetAccountPublicAccessBlockArgs.builder
      com.pulumi.aws.s3.S3Functions.getAccountPublicAccessBlock(args(argsBuilder).build)

    /** The S3 account public access block data source returns account-level public access block configuration. */
    inline def getAccountPublicAccessBlockPlain(args: Endofunction[com.pulumi.aws.s3.inputs.GetAccountPublicAccessBlockPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.s3.outputs.GetAccountPublicAccessBlockResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetAccountPublicAccessBlockPlainArgs.builder
      com.pulumi.aws.s3.S3Functions.getAccountPublicAccessBlockPlain(args(argsBuilder).build)

    /**
     * Provides details about a specific S3 bucket.
     * 
     * This resource may prove useful when setting up a Route53 record, or an origin for a CloudFront
     * Distribution.
     */
    inline def getBucket(args: Endofunction[com.pulumi.aws.s3.inputs.GetBucketArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.s3.outputs.GetBucketResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetBucketArgs.builder
      com.pulumi.aws.s3.S3Functions.getBucket(args(argsBuilder).build)

    /**
     * Provides details about a specific S3 bucket.
     * 
     * This resource may prove useful when setting up a Route53 record, or an origin for a CloudFront
     * Distribution.
     */
    inline def getBucketPlain(args: Endofunction[com.pulumi.aws.s3.inputs.GetBucketPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.s3.outputs.GetBucketResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetBucketPlainArgs.builder
      com.pulumi.aws.s3.S3Functions.getBucketPlain(args(argsBuilder).build)

    /**
     * Provides details about the notification configuration of an S3 bucket.
     * 
     * Useful when `aws.s3.BucketNotification` is the right resource but the bucket already has notifications you do not manage. Read the existing notifications with this data source and re-emit them \u2014 alongside your own \u2014 in a single `aws.s3.BucketNotification` resource. See issue #501 for the longer story. For sharing a bucket across many independent consumers, enabling EventBridge on the resource is usually a better fit.
     */
    inline def getBucketNotification(args: Endofunction[com.pulumi.aws.s3.inputs.GetBucketNotificationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.s3.outputs.GetBucketNotificationResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetBucketNotificationArgs.builder
      com.pulumi.aws.s3.S3Functions.getBucketNotification(args(argsBuilder).build)

    /**
     * Provides details about the notification configuration of an S3 bucket.
     * 
     * Useful when `aws.s3.BucketNotification` is the right resource but the bucket already has notifications you do not manage. Read the existing notifications with this data source and re-emit them \u2014 alongside your own \u2014 in a single `aws.s3.BucketNotification` resource. See issue #501 for the longer story. For sharing a bucket across many independent consumers, enabling EventBridge on the resource is usually a better fit.
     */
    inline def getBucketNotificationPlain(args: Endofunction[com.pulumi.aws.s3.inputs.GetBucketNotificationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.s3.outputs.GetBucketNotificationResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetBucketNotificationPlainArgs.builder
      com.pulumi.aws.s3.S3Functions.getBucketNotificationPlain(args(argsBuilder).build)

    /**
     * &gt; **NOTE:** The `aws.s3.BucketObject` data source is DEPRECATED and will be removed in a future version! Use `aws.s3.BucketObjectv2` instead, where new features and fixes will be added.
     * 
     * The S3 object data source allows access to the metadata and
     * _optionally_ (see below) content of an object stored inside S3 bucket.
     * 
     * &gt; **Note:** The content of an object (`body` field) is available only for objects which have a human-readable `Content-Type`:
     * 
     * * `text&#47;&#42;`
     * * `application/json`
     * * `application/ld+json`
     * * `application/x-httpd-php`
     * * `application/xhtml+xml`
     * * `application/x-csh`
     * * `application/x-sh`
     * * `application/xml`
     * * `application/atom+xml`
     * * `application/x-sql`
     * 
     * This is to prevent printing unsafe characters and potentially downloading large amount of data which would be thrown away in favor of metadata.
     */
    inline def getBucketObject(args: Endofunction[com.pulumi.aws.s3.inputs.GetBucketObjectArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.s3.outputs.GetBucketObjectResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetBucketObjectArgs.builder
      com.pulumi.aws.s3.S3Functions.getBucketObject(args(argsBuilder).build)

    /**
     * &gt; **NOTE:** The `aws.s3.BucketObject` data source is DEPRECATED and will be removed in a future version! Use `aws.s3.BucketObjectv2` instead, where new features and fixes will be added.
     * 
     * The S3 object data source allows access to the metadata and
     * _optionally_ (see below) content of an object stored inside S3 bucket.
     * 
     * &gt; **Note:** The content of an object (`body` field) is available only for objects which have a human-readable `Content-Type`:
     * 
     * * `text&#47;&#42;`
     * * `application/json`
     * * `application/ld+json`
     * * `application/x-httpd-php`
     * * `application/xhtml+xml`
     * * `application/x-csh`
     * * `application/x-sh`
     * * `application/xml`
     * * `application/atom+xml`
     * * `application/x-sql`
     * 
     * This is to prevent printing unsafe characters and potentially downloading large amount of data which would be thrown away in favor of metadata.
     */
    inline def getBucketObjectPlain(args: Endofunction[com.pulumi.aws.s3.inputs.GetBucketObjectPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.s3.outputs.GetBucketObjectResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetBucketObjectPlainArgs.builder
      com.pulumi.aws.s3.S3Functions.getBucketObjectPlain(args(argsBuilder).build)

    /** Provides details about an AWS S3 (Simple Storage) Bucket Object Lock Configuration. */
    inline def getBucketObjectLockConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.GetBucketObjectLockConfigurationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.s3.outputs.GetBucketObjectLockConfigurationResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetBucketObjectLockConfigurationArgs.builder
      com.pulumi.aws.s3.S3Functions.getBucketObjectLockConfiguration(args(argsBuilder).build)

    /** Provides details about an AWS S3 (Simple Storage) Bucket Object Lock Configuration. */
    inline def getBucketObjectLockConfigurationPlain(args: Endofunction[com.pulumi.aws.s3.inputs.GetBucketObjectLockConfigurationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.s3.outputs.GetBucketObjectLockConfigurationResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetBucketObjectLockConfigurationPlainArgs.builder
      com.pulumi.aws.s3.S3Functions.getBucketObjectLockConfigurationPlain(args(argsBuilder).build)

    /**
     * &gt; **NOTE:** The `aws.s3.getBucketObjects` data source is DEPRECATED and will be removed in a future version! Use `aws.s3.getObjects` instead, where new features and fixes will be added.
     * 
     * &gt; **NOTE on `maxKeys`:** Retrieving very large numbers of keys can adversely affect this provider&#39;s performance.
     * 
     * The objects data source returns keys (i.e., file names) and other metadata about objects in an S3 bucket.
     */
    inline def getBucketObjects(args: Endofunction[com.pulumi.aws.s3.inputs.GetBucketObjectsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.s3.outputs.GetBucketObjectsResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetBucketObjectsArgs.builder
      com.pulumi.aws.s3.S3Functions.getBucketObjects(args(argsBuilder).build)

    /**
     * &gt; **NOTE:** The `aws.s3.getBucketObjects` data source is DEPRECATED and will be removed in a future version! Use `aws.s3.getObjects` instead, where new features and fixes will be added.
     * 
     * &gt; **NOTE on `maxKeys`:** Retrieving very large numbers of keys can adversely affect this provider&#39;s performance.
     * 
     * The objects data source returns keys (i.e., file names) and other metadata about objects in an S3 bucket.
     */
    inline def getBucketObjectsPlain(args: Endofunction[com.pulumi.aws.s3.inputs.GetBucketObjectsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.s3.outputs.GetBucketObjectsResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetBucketObjectsPlainArgs.builder
      com.pulumi.aws.s3.S3Functions.getBucketObjectsPlain(args(argsBuilder).build)

    /** The bucket policy data source returns IAM policy of an S3 bucket. */
    inline def getBucketPolicy(args: Endofunction[com.pulumi.aws.s3.inputs.GetBucketPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.s3.outputs.GetBucketPolicyResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetBucketPolicyArgs.builder
      com.pulumi.aws.s3.S3Functions.getBucketPolicy(args(argsBuilder).build)

    /** The bucket policy data source returns IAM policy of an S3 bucket. */
    inline def getBucketPolicyPlain(args: Endofunction[com.pulumi.aws.s3.inputs.GetBucketPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.s3.outputs.GetBucketPolicyResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetBucketPolicyPlainArgs.builder
      com.pulumi.aws.s3.S3Functions.getBucketPolicyPlain(args(argsBuilder).build)

    /** Data source for managing an AWS S3 (Simple Storage) Bucket Replication Configuration. */
    inline def getBucketReplicationConfiguration(args: Endofunction[com.pulumi.aws.s3.inputs.GetBucketReplicationConfigurationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.s3.outputs.GetBucketReplicationConfigurationResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetBucketReplicationConfigurationArgs.builder
      com.pulumi.aws.s3.S3Functions.getBucketReplicationConfiguration(args(argsBuilder).build)

    /** Data source for managing an AWS S3 (Simple Storage) Bucket Replication Configuration. */
    inline def getBucketReplicationConfigurationPlain(args: Endofunction[com.pulumi.aws.s3.inputs.GetBucketReplicationConfigurationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.s3.outputs.GetBucketReplicationConfigurationResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetBucketReplicationConfigurationPlainArgs.builder
      com.pulumi.aws.s3.S3Functions.getBucketReplicationConfigurationPlain(args(argsBuilder).build)

    /** Provides details about AWS S3 (Simple Storage) buckets with optional filters. */
    inline def getBuckets(args: Endofunction[com.pulumi.aws.s3.inputs.GetBucketsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.s3.outputs.GetBucketsResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetBucketsArgs.builder
      com.pulumi.aws.s3.S3Functions.getBuckets(args(argsBuilder).build)

    /** Provides details about AWS S3 (Simple Storage) buckets with optional filters. */
    inline def getBucketsPlain(args: Endofunction[com.pulumi.aws.s3.inputs.GetBucketsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.s3.outputs.GetBucketsResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetBucketsPlainArgs.builder
      com.pulumi.aws.s3.S3Functions.getBucketsPlain(args(argsBuilder).build)

    /** Lists Amazon S3 Express directory buckets. */
    inline def getDirectoryBuckets(args: Endofunction[com.pulumi.aws.s3.inputs.GetDirectoryBucketsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.s3.outputs.GetDirectoryBucketsResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetDirectoryBucketsArgs.builder
      com.pulumi.aws.s3.S3Functions.getDirectoryBuckets(args(argsBuilder).build)

    /** Lists Amazon S3 Express directory buckets. */
    inline def getDirectoryBucketsPlain(args: Endofunction[com.pulumi.aws.s3.inputs.GetDirectoryBucketsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.s3.outputs.GetDirectoryBucketsResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetDirectoryBucketsPlainArgs.builder
      com.pulumi.aws.s3.S3Functions.getDirectoryBucketsPlain(args(argsBuilder).build)

    /** Data source for managing an S3 Files Access Point. */
    inline def getFilesAccessPoint(args: Endofunction[com.pulumi.aws.s3.inputs.GetFilesAccessPointArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.s3.outputs.GetFilesAccessPointResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetFilesAccessPointArgs.builder
      com.pulumi.aws.s3.S3Functions.getFilesAccessPoint(args(argsBuilder).build)

    /** Data source for managing an S3 Files Access Point. */
    inline def getFilesAccessPointPlain(args: Endofunction[com.pulumi.aws.s3.inputs.GetFilesAccessPointPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.s3.outputs.GetFilesAccessPointResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetFilesAccessPointPlainArgs.builder
      com.pulumi.aws.s3.S3Functions.getFilesAccessPointPlain(args(argsBuilder).build)

    /** Get information on an S3 Files File System. */
    inline def getFilesFileSystem(args: Endofunction[com.pulumi.aws.s3.inputs.GetFilesFileSystemArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.s3.outputs.GetFilesFileSystemResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetFilesFileSystemArgs.builder
      com.pulumi.aws.s3.S3Functions.getFilesFileSystem(args(argsBuilder).build)

    /** Get information on an S3 Files File System. */
    inline def getFilesFileSystemPlain(args: Endofunction[com.pulumi.aws.s3.inputs.GetFilesFileSystemPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.s3.outputs.GetFilesFileSystemResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetFilesFileSystemPlainArgs.builder
      com.pulumi.aws.s3.S3Functions.getFilesFileSystemPlain(args(argsBuilder).build)

    /** Provides details about S3 Files File Systems. */
    inline def getFilesFileSystems(args: Endofunction[com.pulumi.aws.s3.inputs.GetFilesFileSystemsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.s3.outputs.GetFilesFileSystemsResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetFilesFileSystemsArgs.builder
      com.pulumi.aws.s3.S3Functions.getFilesFileSystems(args(argsBuilder).build)

    /** Provides details about S3 Files File Systems. */
    inline def getFilesFileSystemsPlain(args: Endofunction[com.pulumi.aws.s3.inputs.GetFilesFileSystemsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.s3.outputs.GetFilesFileSystemsResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetFilesFileSystemsPlainArgs.builder
      com.pulumi.aws.s3.S3Functions.getFilesFileSystemsPlain(args(argsBuilder).build)

    /** Provides details about an S3 Files Mount Target. */
    inline def getFilesMountTarget(args: Endofunction[com.pulumi.aws.s3.inputs.GetFilesMountTargetArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.s3.outputs.GetFilesMountTargetResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetFilesMountTargetArgs.builder
      com.pulumi.aws.s3.S3Functions.getFilesMountTarget(args(argsBuilder).build)

    /** Provides details about an S3 Files Mount Target. */
    inline def getFilesMountTargetPlain(args: Endofunction[com.pulumi.aws.s3.inputs.GetFilesMountTargetPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.s3.outputs.GetFilesMountTargetResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetFilesMountTargetPlainArgs.builder
      com.pulumi.aws.s3.S3Functions.getFilesMountTargetPlain(args(argsBuilder).build)

    /**
     * The S3 object data source allows access to the metadata and
     * _optionally_ (see below) content of an object stored inside S3 bucket.
     * 
     * &gt; **Note:** The content of an object (`body` field) is available only for objects which have a human-readable `Content-Type`:
     * 
     * * `text&#47;&#42;`
     * * `application/json`
     * * `application/ld+json`
     * * `application/x-httpd-php`
     * * `application/xhtml+xml`
     * * `application/x-csh`
     * * `application/x-sh`
     * * `application/xml`
     * * `application/atom+xml`
     * * `application/x-sql`
     * * `application/yaml`
     * 
     * This is to prevent printing unsafe characters and potentially downloading large amount of data which would be thrown away in favor of metadata.
     */
    inline def getObject(args: Endofunction[com.pulumi.aws.s3.inputs.GetObjectArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.s3.outputs.GetObjectResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetObjectArgs.builder
      com.pulumi.aws.s3.S3Functions.getObject(args(argsBuilder).build)

    /**
     * The S3 object data source allows access to the metadata and
     * _optionally_ (see below) content of an object stored inside S3 bucket.
     * 
     * &gt; **Note:** The content of an object (`body` field) is available only for objects which have a human-readable `Content-Type`:
     * 
     * * `text&#47;&#42;`
     * * `application/json`
     * * `application/ld+json`
     * * `application/x-httpd-php`
     * * `application/xhtml+xml`
     * * `application/x-csh`
     * * `application/x-sh`
     * * `application/xml`
     * * `application/atom+xml`
     * * `application/x-sql`
     * * `application/yaml`
     * 
     * This is to prevent printing unsafe characters and potentially downloading large amount of data which would be thrown away in favor of metadata.
     */
    inline def getObjectPlain(args: Endofunction[com.pulumi.aws.s3.inputs.GetObjectPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.s3.outputs.GetObjectResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetObjectPlainArgs.builder
      com.pulumi.aws.s3.S3Functions.getObjectPlain(args(argsBuilder).build)

    /**
     * &gt; **NOTE on `maxKeys`:** Retrieving very large numbers of keys can adversely affect the provider&#39;s performance.
     * 
     * The objects data source returns keys (i.e., file names) and other metadata about objects in an S3 bucket.
     */
    inline def getObjects(args: Endofunction[com.pulumi.aws.s3.inputs.GetObjectsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.s3.outputs.GetObjectsResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetObjectsArgs.builder
      com.pulumi.aws.s3.S3Functions.getObjects(args(argsBuilder).build)

    /**
     * &gt; **NOTE on `maxKeys`:** Retrieving very large numbers of keys can adversely affect the provider&#39;s performance.
     * 
     * The objects data source returns keys (i.e., file names) and other metadata about objects in an S3 bucket.
     */
    inline def getObjectsPlain(args: Endofunction[com.pulumi.aws.s3.inputs.GetObjectsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.s3.outputs.GetObjectsResult] =
      val argsBuilder = com.pulumi.aws.s3.inputs.GetObjectsPlainArgs.builder
      com.pulumi.aws.s3.S3Functions.getObjectsPlain(args(argsBuilder).build)

  /** Resource for managing an Amazon S3 Vectors Index. */
  def VectorsIndex(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.VectorsIndexArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.s3.VectorsIndexArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.s3.VectorsIndex(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an Amazon S3 Vectors Vector Bucket. */
  def VectorsVectorBucket(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.VectorsVectorBucketArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.s3.VectorsVectorBucketArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.s3.VectorsVectorBucket(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an Amazon S3 Vectors Vector Bucket policy. */
  def VectorsVectorBucketPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3.VectorsVectorBucketPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3.VectorsVectorBucketPolicyArgs.builder
    com.pulumi.aws.s3.VectorsVectorBucketPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
