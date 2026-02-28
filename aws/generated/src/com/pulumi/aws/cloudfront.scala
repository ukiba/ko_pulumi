package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object cloudfront:
  /**
   * 
   */
  def KeyGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.KeyGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudfront.KeyGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.cloudfront.KeyGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Creates an Amazon CloudFront origin access identity.
   *  
   *  For information about CloudFront distributions, see the
   *  [Amazon CloudFront Developer Guide](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Introduction.html). For more information on generating
   *  origin access identities, see
   *  [Using an Origin Access Identity to Restrict Access to Your Amazon S3 Content][2].
   */
  def OriginAccessIdentity(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.OriginAccessIdentityArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.cloudfront.OriginAccessIdentityArgs.builder
    
    com.pulumi.aws.cloudfront.OriginAccessIdentity(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * 
   */
  def OriginRequestPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.OriginRequestPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudfront.OriginRequestPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.cloudfront.OriginRequestPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a CloudFront Field-level Encryption Config resource. */
  def FieldLevelEncryptionConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.FieldLevelEncryptionConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.cloudfront.FieldLevelEncryptionConfigArgs.builder
    
    com.pulumi.aws.cloudfront.FieldLevelEncryptionConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.cloudfront.DistributionArgs.Builder)
    /**
     * @param customErrorResponses One or more custom error response elements (multiples allowed).
     * @return builder
     */
    def customErrorResponses(args: Endofunction[com.pulumi.aws.cloudfront.inputs.DistributionCustomErrorResponseArgs.Builder]*):
        com.pulumi.aws.cloudfront.DistributionArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudfront.inputs.DistributionCustomErrorResponseArgs.builder
      builder.customErrorResponses(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultCacheBehavior Default cache behavior for this distribution (maximum one). Requires either `cachePolicyId` (preferred) or `forwardedValues` (deprecated) be set.
     * @return builder
     */
    def defaultCacheBehavior(args: Endofunction[com.pulumi.aws.cloudfront.inputs.DistributionDefaultCacheBehaviorArgs.Builder]):
        com.pulumi.aws.cloudfront.DistributionArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.DistributionDefaultCacheBehaviorArgs.builder
      builder.defaultCacheBehavior(args(argsBuilder).build)

    /**
     * @param loggingConfig The logging configuration that controls how logs are written to your distribution (maximum one). AWS provides two versions of access logs for CloudFront: Legacy and v2. This argument configures legacy version standard logs.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.DistributionLoggingConfigArgs.Builder]):
        com.pulumi.aws.cloudfront.DistributionArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.DistributionLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

    /**
     * @param orderedCacheBehaviors Ordered list of cache behaviors resource for this distribution. List from top to bottom in order of precedence. The topmost cache behavior will have precedence 0.
     * @return builder
     */
    def orderedCacheBehaviors(args: Endofunction[com.pulumi.aws.cloudfront.inputs.DistributionOrderedCacheBehaviorArgs.Builder]*):
        com.pulumi.aws.cloudfront.DistributionArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudfront.inputs.DistributionOrderedCacheBehaviorArgs.builder
      builder.orderedCacheBehaviors(args.map(_(argsBuilder).build)*)

    /**
     * @param originGroups One or more originGroup for this distribution (multiples allowed).
     * @return builder
     */
    def originGroups(args: Endofunction[com.pulumi.aws.cloudfront.inputs.DistributionOriginGroupArgs.Builder]*):
        com.pulumi.aws.cloudfront.DistributionArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudfront.inputs.DistributionOriginGroupArgs.builder
      builder.originGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param origins One or more origins for this distribution (multiples allowed).
     * @return builder
     */
    def origins(args: Endofunction[com.pulumi.aws.cloudfront.inputs.DistributionOriginArgs.Builder]*):
        com.pulumi.aws.cloudfront.DistributionArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudfront.inputs.DistributionOriginArgs.builder
      builder.origins(args.map(_(argsBuilder).build)*)

    /**
     * @param restrictions The restriction configuration for this distribution (maximum one).
     * @return builder
     */
    def restrictions(args: Endofunction[com.pulumi.aws.cloudfront.inputs.DistributionRestrictionsArgs.Builder]):
        com.pulumi.aws.cloudfront.DistributionArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.DistributionRestrictionsArgs.builder
      builder.restrictions(args(argsBuilder).build)

    /**
     * @param viewerCertificate The SSL configuration for this distribution (maximum one).
     * @return builder
     */
    def viewerCertificate(args: Endofunction[com.pulumi.aws.cloudfront.inputs.DistributionViewerCertificateArgs.Builder]):
        com.pulumi.aws.cloudfront.DistributionArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.DistributionViewerCertificateArgs.builder
      builder.viewerCertificate(args(argsBuilder).build)

  /**
   * Creates an Amazon CloudFront VPC origin.
   *  
   *  For information about CloudFront VPC origins, see
   *  [Amazon CloudFront Developer Guide - Restrict access with VPC origins][1].
   */
  def VpcOrigin(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.VpcOriginArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudfront.VpcOriginArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.cloudfront.VpcOrigin(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.cloudfront.ContinuousDeploymentPolicyArgs.Builder)
    /**
     * @param stagingDistributionDnsNames CloudFront domain name of the staging distribution. See `stagingDistributionDnsNames`.
     * @return builder
     */
    def stagingDistributionDnsNames(args: Endofunction[com.pulumi.aws.cloudfront.inputs.ContinuousDeploymentPolicyStagingDistributionDnsNamesArgs.Builder]):
        com.pulumi.aws.cloudfront.ContinuousDeploymentPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.ContinuousDeploymentPolicyStagingDistributionDnsNamesArgs.builder
      builder.stagingDistributionDnsNames(args(argsBuilder).build)

    /**
     * @param trafficConfig Parameters for routing production traffic from primary to staging distributions. See `trafficConfig`.
     * @return builder
     */
    def trafficConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.ContinuousDeploymentPolicyTrafficConfigArgs.Builder]):
        com.pulumi.aws.cloudfront.ContinuousDeploymentPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.ContinuousDeploymentPolicyTrafficConfigArgs.builder
      builder.trafficConfig(args(argsBuilder).build)

  /**
   * 
   */
  def CachePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.CachePolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudfront.CachePolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.cloudfront.CachePolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * 
   */
  def KeyvaluestoreKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.KeyvaluestoreKeyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.cloudfront.KeyvaluestoreKeyArgs.builder
    
    com.pulumi.aws.cloudfront.KeyvaluestoreKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * ## Import
   *  
   *  Using `pulumi import`, import AWS CloudFront KeyValueStore Key Value Pairs using the `key_value_store_arn`. For example:
   *  
   *  ```sh
   *  $ pulumi import aws:cloudfront/keyvaluestoreKeysExclusive:KeyvaluestoreKeysExclusive example arn:aws:cloudfront::111111111111:key-value-store/8562g61f-caba-2845-9d99-b97diwae5d3c
   *  ```
   */
  def KeyvaluestoreKeysExclusive(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.KeyvaluestoreKeysExclusiveArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.cloudfront.KeyvaluestoreKeysExclusiveArgs.builder
    
    com.pulumi.aws.cloudfront.KeyvaluestoreKeysExclusive(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.cloudfront.MonitoringSubscriptionArgs.Builder)
    /**
     * @param monitoringSubscription A monitoring subscription. This structure contains information about whether additional CloudWatch metrics are enabled for a given CloudFront distribution.
     * @return builder
     */
    def monitoringSubscription(args: Endofunction[com.pulumi.aws.cloudfront.inputs.MonitoringSubscriptionMonitoringSubscriptionArgs.Builder]):
        com.pulumi.aws.cloudfront.MonitoringSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.MonitoringSubscriptionMonitoringSubscriptionArgs.builder
      builder.monitoringSubscription(args(argsBuilder).build)

  /**
   * Manages an AWS CloudFront Origin Access Control, which is used by CloudFront Distributions with an Amazon S3 bucket as the origin.
   *  
   *  Read more about Origin Access Control in the [CloudFront Developer Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html).
   */
  def OriginAccessControl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.OriginAccessControlArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudfront.OriginAccessControlArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.cloudfront.OriginAccessControl(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a CloudFront real-time log configuration resource. */
  def MonitoringSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.MonitoringSubscriptionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.cloudfront.MonitoringSubscriptionArgs.builder
    
    com.pulumi.aws.cloudfront.MonitoringSubscription(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a CloudFront response headers policy resource.
   *  A response headers policy contains information about a set of HTTP response headers and their values.
   *  After you create a response headers policy, you can use its ID to attach it to one or more cache behaviors in a CloudFront distribution.
   *  When it\u2019s attached to a cache behavior, CloudFront adds the headers in the policy to every response that it sends for requests that match the cache behavior.
   */
  def ResponseHeadersPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.ResponseHeadersPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudfront.ResponseHeadersPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.cloudfront.ResponseHeadersPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a CloudFront real-time log configuration resource. */
  def RealtimeLogConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.RealtimeLogConfigArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudfront.RealtimeLogConfigArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.cloudfront.RealtimeLogConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.cloudfront.KeyValueStoreArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.cloudfront.inputs.KeyValueStoreTimeoutsArgs.Builder]):
        com.pulumi.aws.cloudfront.KeyValueStoreArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.KeyValueStoreTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  type CloudfrontFunctions = com.pulumi.aws.cloudfront.CloudfrontFunctions
  object CloudfrontFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.cloudfront.CloudfrontFunctions.*
  extension (self: CloudfrontFunctions.type)
    /** Use this data source to retrieve information about a CloudFront cache policy. */
    def getCachePolicy(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetCachePolicyArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudfront.outputs.GetCachePolicyResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetCachePolicyArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getCachePolicy(args(argsBuilder).build)

    /** Use this data source to retrieve information about a CloudFront cache policy. */
    def getCachePolicyPlain(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetCachePolicyPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudfront.outputs.GetCachePolicyResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetCachePolicyPlainArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getCachePolicyPlain(args(argsBuilder).build)

    /** Use this data source to retrieve information about a CloudFront distribution. */
    def getDistribution(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetDistributionArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudfront.outputs.GetDistributionResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetDistributionArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getDistribution(args(argsBuilder).build)

    /** Use this data source to retrieve information about a CloudFront distribution. */
    def getDistributionPlain(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetDistributionPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudfront.outputs.GetDistributionResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetDistributionPlainArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getDistributionPlain(args(argsBuilder).build)

    /** Provides information about a CloudFront Function. */
    def getFunction(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetFunctionArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudfront.outputs.GetFunctionResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetFunctionArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getFunction(args(argsBuilder).build)

    /** Provides information about a CloudFront Function. */
    def getFunctionPlain(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetFunctionPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudfront.outputs.GetFunctionResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetFunctionPlainArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getFunctionPlain(args(argsBuilder).build)

    /**
     * The CloudFront Log Delivery Canonical User ID data source allows access to the [canonical user ID](http://docs.aws.amazon.com/general/latest/gr/acct-identifiers.html) of the AWS `awslogsdelivery` account for CloudFront bucket logging.
     *  See the [Amazon CloudFront Developer Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/AccessLogs.html) for more information.
     */
    def getLogDeliveryCanonicalUserId(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetLogDeliveryCanonicalUserIdArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudfront.outputs.GetLogDeliveryCanonicalUserIdResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetLogDeliveryCanonicalUserIdArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getLogDeliveryCanonicalUserId(args(argsBuilder).build)

    /**
     * The CloudFront Log Delivery Canonical User ID data source allows access to the [canonical user ID](http://docs.aws.amazon.com/general/latest/gr/acct-identifiers.html) of the AWS `awslogsdelivery` account for CloudFront bucket logging.
     *  See the [Amazon CloudFront Developer Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/AccessLogs.html) for more information.
     */
    def getLogDeliveryCanonicalUserIdPlain(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetLogDeliveryCanonicalUserIdPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudfront.outputs.GetLogDeliveryCanonicalUserIdResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetLogDeliveryCanonicalUserIdPlainArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getLogDeliveryCanonicalUserIdPlain(args(argsBuilder).build)

    /** Use this data source to retrieve information for an Amazon CloudFront origin access control config. */
    def getOriginAccessControl(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetOriginAccessControlArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudfront.outputs.GetOriginAccessControlResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetOriginAccessControlArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getOriginAccessControl(args(argsBuilder).build)

    /** Use this data source to retrieve information for an Amazon CloudFront origin access control config. */
    def getOriginAccessControlPlain(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetOriginAccessControlPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudfront.outputs.GetOriginAccessControlResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetOriginAccessControlPlainArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getOriginAccessControlPlain(args(argsBuilder).build)

    /** Use this data source to get ARNs, ids and S3 canonical user IDs of Amazon CloudFront origin access identities. */
    def getOriginAccessIdentities(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetOriginAccessIdentitiesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudfront.outputs.GetOriginAccessIdentitiesResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetOriginAccessIdentitiesArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getOriginAccessIdentities(args(argsBuilder).build)

    /** Use this data source to get ARNs, ids and S3 canonical user IDs of Amazon CloudFront origin access identities. */
    def getOriginAccessIdentitiesPlain(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetOriginAccessIdentitiesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudfront.outputs.GetOriginAccessIdentitiesResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetOriginAccessIdentitiesPlainArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getOriginAccessIdentitiesPlain(args(argsBuilder).build)

    /** Use this data source to retrieve information for an Amazon CloudFront origin access identity. */
    def getOriginAccessIdentity(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetOriginAccessIdentityArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudfront.outputs.GetOriginAccessIdentityResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetOriginAccessIdentityArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getOriginAccessIdentity(args(argsBuilder).build)

    /** Use this data source to retrieve information for an Amazon CloudFront origin access identity. */
    def getOriginAccessIdentityPlain(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetOriginAccessIdentityPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudfront.outputs.GetOriginAccessIdentityResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetOriginAccessIdentityPlainArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getOriginAccessIdentityPlain(args(argsBuilder).build)

    /**
     * 
     */
    def getOriginRequestPolicy(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetOriginRequestPolicyArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudfront.outputs.GetOriginRequestPolicyResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetOriginRequestPolicyArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getOriginRequestPolicy(args(argsBuilder).build)

    /**
     * 
     */
    def getOriginRequestPolicyPlain(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetOriginRequestPolicyPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudfront.outputs.GetOriginRequestPolicyResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetOriginRequestPolicyPlainArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getOriginRequestPolicyPlain(args(argsBuilder).build)

    /** Provides a CloudFront real-time log configuration resource. */
    def getRealtimeLogConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetRealtimeLogConfigArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudfront.outputs.GetRealtimeLogConfigResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetRealtimeLogConfigArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getRealtimeLogConfig(args(argsBuilder).build)

    /** Provides a CloudFront real-time log configuration resource. */
    def getRealtimeLogConfigPlain(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetRealtimeLogConfigPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudfront.outputs.GetRealtimeLogConfigResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetRealtimeLogConfigPlainArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getRealtimeLogConfigPlain(args(argsBuilder).build)

    /** Use this data source to retrieve information about a CloudFront cache policy. */
    def getResponseHeadersPolicy(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetResponseHeadersPolicyArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudfront.outputs.GetResponseHeadersPolicyResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetResponseHeadersPolicyArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getResponseHeadersPolicy(args(argsBuilder).build)

    /** Use this data source to retrieve information about a CloudFront cache policy. */
    def getResponseHeadersPolicyPlain(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetResponseHeadersPolicyPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudfront.outputs.GetResponseHeadersPolicyResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetResponseHeadersPolicyPlainArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getResponseHeadersPolicyPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudfront.VpcOriginArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.cloudfront.inputs.VpcOriginTimeoutsArgs.Builder]):
        com.pulumi.aws.cloudfront.VpcOriginArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.VpcOriginTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param vpcOriginEndpointConfig The VPC origin endpoint configuration.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def vpcOriginEndpointConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.VpcOriginVpcOriginEndpointConfigArgs.Builder]):
        com.pulumi.aws.cloudfront.VpcOriginArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.VpcOriginVpcOriginEndpointConfigArgs.builder
      builder.vpcOriginEndpointConfig(args(argsBuilder).build)

  /** Resource for managing an AWS CloudFront Key Value Store. */
  def KeyValueStore(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.KeyValueStoreArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudfront.KeyValueStoreArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.cloudfront.KeyValueStore(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS CloudFront Continuous Deployment Policy. */
  def ContinuousDeploymentPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.ContinuousDeploymentPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.cloudfront.ContinuousDeploymentPolicyArgs.builder
    
    com.pulumi.aws.cloudfront.ContinuousDeploymentPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * 
   */
  def PublicKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.PublicKeyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudfront.PublicKeyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.cloudfront.PublicKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.cloudfront.KeyvaluestoreKeysExclusiveArgs.Builder)
    /**
     * @param resourceKeyValuePairs A list of all resource key value pairs associated with the KeyValueStore.
     *  See `resourceKeyValuePair` below.
     * @return builder
     */
    def resourceKeyValuePairs(args: Endofunction[com.pulumi.aws.cloudfront.inputs.KeyvaluestoreKeysExclusiveResourceKeyValuePairArgs.Builder]*):
        com.pulumi.aws.cloudfront.KeyvaluestoreKeysExclusiveArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudfront.inputs.KeyvaluestoreKeysExclusiveResourceKeyValuePairArgs.builder
      builder.resourceKeyValuePairs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudfront.RealtimeLogConfigArgs.Builder)
    /**
     * @param endpoint The Amazon Kinesis data streams where real-time log data is sent.
     * @return builder
     */
    def endpoint(args: Endofunction[com.pulumi.aws.cloudfront.inputs.RealtimeLogConfigEndpointArgs.Builder]):
        com.pulumi.aws.cloudfront.RealtimeLogConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.RealtimeLogConfigEndpointArgs.builder
      builder.endpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudfront.FieldLevelEncryptionConfigArgs.Builder)
    /**
     * @param contentTypeProfileConfig Content Type Profile Config specifies when to forward content if a content type isn&#39;t recognized and profiles to use as by default in a request if a query argument doesn&#39;t specify a profile to use.
     * @return builder
     */
    def contentTypeProfileConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigContentTypeProfileConfigArgs.Builder]):
        com.pulumi.aws.cloudfront.FieldLevelEncryptionConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigContentTypeProfileConfigArgs.builder
      builder.contentTypeProfileConfig(args(argsBuilder).build)

    /**
     * @param queryArgProfileConfig Query Arg Profile Config that specifies when to forward content if a profile isn&#39;t found and the profile that can be provided as a query argument in a request.
     * @return builder
     */
    def queryArgProfileConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigQueryArgProfileConfigArgs.Builder]):
        com.pulumi.aws.cloudfront.FieldLevelEncryptionConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigQueryArgProfileConfigArgs.builder
      builder.queryArgProfileConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudfront.OriginRequestPolicyArgs.Builder)
    /**
     * @param cookiesConfig Object that determines whether any cookies in viewer requests (and if so, which cookies) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Cookies Config for more information.
     * @return builder
     */
    def cookiesConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.OriginRequestPolicyCookiesConfigArgs.Builder]):
        com.pulumi.aws.cloudfront.OriginRequestPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.OriginRequestPolicyCookiesConfigArgs.builder
      builder.cookiesConfig(args(argsBuilder).build)

    /**
     * @param headersConfig Object that determines whether any HTTP headers (and if so, which headers) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Headers Config for more information.
     * @return builder
     */
    def headersConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.OriginRequestPolicyHeadersConfigArgs.Builder]):
        com.pulumi.aws.cloudfront.OriginRequestPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.OriginRequestPolicyHeadersConfigArgs.builder
      builder.headersConfig(args(argsBuilder).build)

    /**
     * @param queryStringsConfig Object that determines whether any URL query strings in viewer requests (and if so, which query strings) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Query String Config for more information.
     * @return builder
     */
    def queryStringsConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.OriginRequestPolicyQueryStringsConfigArgs.Builder]):
        com.pulumi.aws.cloudfront.OriginRequestPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.OriginRequestPolicyQueryStringsConfigArgs.builder
      builder.queryStringsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudfront.FieldLevelEncryptionProfileArgs.Builder)
    /**
     * @param encryptionEntities The encryption entities config block for field-level encryption profiles that contains an attribute `items` which includes the encryption key and field pattern specifications.
     * @return builder
     */
    def encryptionEntities(args: Endofunction[com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionProfileEncryptionEntitiesArgs.Builder]):
        com.pulumi.aws.cloudfront.FieldLevelEncryptionProfileArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionProfileEncryptionEntitiesArgs.builder
      builder.encryptionEntities(args(argsBuilder).build)

  /**
   * Provides a CloudFront Function resource. With CloudFront Functions in Amazon CloudFront, you can write lightweight functions in JavaScript for high-scale, latency-sensitive CDN customizations.
   *  
   *  See [CloudFront Functions](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-functions.html)
   *  
   *  &gt; **NOTE:** You cannot delete a function if it\u2019s associated with a cache behavior. First, update your distributions to remove the function association from all cache behaviors, then delete the function.
   */
  def Function(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.FunctionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudfront.FunctionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.cloudfront.Function(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a CloudFront Field-level Encryption Profile resource. */
  def FieldLevelEncryptionProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.FieldLevelEncryptionProfileArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudfront.FieldLevelEncryptionProfileArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.cloudfront.FieldLevelEncryptionProfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Creates an Amazon CloudFront web distribution.
   *  
   *  For information about CloudFront distributions, see the [Amazon CloudFront Developer Guide](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Introduction.html). For specific information about creating CloudFront web distributions, see the [POST Distribution](https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_CreateDistribution.html) page in the Amazon CloudFront API Reference.
   *  
   *  &gt; **NOTE:** CloudFront distributions take about 15 minutes to reach a deployed state after creation or modification. During this time, deletes to resources will be blocked. If you need to delete a distribution that is enabled and you do not want to wait, you need to use the `retainOnDelete` flag.
   */
  def Distribution(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.DistributionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudfront.DistributionArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.cloudfront.Distribution(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.cloudfront.CachePolicyArgs.Builder)
    /**
     * @param parametersInCacheKeyAndForwardedToOrigin Configuration for including HTTP headers, cookies, and URL query strings in the cache key. For more information, refer to the Parameters In Cache Key And Forwarded To Origin section.
     * @return builder
     */
    def parametersInCacheKeyAndForwardedToOrigin(args: Endofunction[com.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginArgs.Builder]):
        com.pulumi.aws.cloudfront.CachePolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginArgs.builder
      builder.parametersInCacheKeyAndForwardedToOrigin(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudfront.inputs.ContinuousDeploymentPolicyTrafficConfigArgs.Builder)
    /**
     * @param singleHeaderConfig Determines which HTTP requests are sent to the staging distribution. See `singleHeaderConfig`.
     * @return builder
     */
    def singleHeaderConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.ContinuousDeploymentPolicyTrafficConfigSingleHeaderConfigArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.ContinuousDeploymentPolicyTrafficConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.ContinuousDeploymentPolicyTrafficConfigSingleHeaderConfigArgs.builder
      builder.singleHeaderConfig(args(argsBuilder).build)

    /**
     * @param singleWeightConfig Contains the percentage of traffic to send to the staging distribution. See `singleWeightConfig`.
     * @return builder
     */
    def singleWeightConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.ContinuousDeploymentPolicyTrafficConfigSingleWeightConfigArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.ContinuousDeploymentPolicyTrafficConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.ContinuousDeploymentPolicyTrafficConfigSingleWeightConfigArgs.builder
      builder.singleWeightConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudfront.inputs.OriginRequestPolicyQueryStringsConfigArgs.Builder)
    def queryStrings(args: Endofunction[com.pulumi.aws.cloudfront.inputs.OriginRequestPolicyQueryStringsConfigQueryStringsArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.OriginRequestPolicyQueryStringsConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.OriginRequestPolicyQueryStringsConfigQueryStringsArgs.builder
      builder.queryStrings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudfront.inputs.CachePolicyState.Builder)
    /**
     * @param parametersInCacheKeyAndForwardedToOrigin Configuration for including HTTP headers, cookies, and URL query strings in the cache key. For more information, refer to the Parameters In Cache Key And Forwarded To Origin section.
     * @return builder
     */
    def parametersInCacheKeyAndForwardedToOrigin(args: Endofunction[com.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.CachePolicyState.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginArgs.builder
      builder.parametersInCacheKeyAndForwardedToOrigin(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudfront.inputs.OriginRequestPolicyState.Builder)
    /**
     * @param cookiesConfig Object that determines whether any cookies in viewer requests (and if so, which cookies) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Cookies Config for more information.
     * @return builder
     */
    def cookiesConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.OriginRequestPolicyCookiesConfigArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.OriginRequestPolicyState.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.OriginRequestPolicyCookiesConfigArgs.builder
      builder.cookiesConfig(args(argsBuilder).build)

    /**
     * @param headersConfig Object that determines whether any HTTP headers (and if so, which headers) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Headers Config for more information.
     * @return builder
     */
    def headersConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.OriginRequestPolicyHeadersConfigArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.OriginRequestPolicyState.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.OriginRequestPolicyHeadersConfigArgs.builder
      builder.headersConfig(args(argsBuilder).build)

    /**
     * @param queryStringsConfig Object that determines whether any URL query strings in viewer requests (and if so, which query strings) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Query String Config for more information.
     * @return builder
     */
    def queryStringsConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.OriginRequestPolicyQueryStringsConfigArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.OriginRequestPolicyState.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.OriginRequestPolicyQueryStringsConfigArgs.builder
      builder.queryStringsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCorsConfigArgs.Builder)
    /**
     * @param accessControlAllowHeaders Object that contains an attribute `items` that contains a list of HTTP header names that CloudFront includes as values for the `Access-Control-Allow-Headers` HTTP response header.
     * @return builder
     */
    def accessControlAllowHeaders(args: Endofunction[com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCorsConfigAccessControlAllowHeadersArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCorsConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCorsConfigAccessControlAllowHeadersArgs.builder
      builder.accessControlAllowHeaders(args(argsBuilder).build)

    /**
     * @param accessControlAllowMethods Object that contains an attribute `items` that contains a list of HTTP methods that CloudFront includes as values for the `Access-Control-Allow-Methods` HTTP response header. Valid values: `GET` | `POST` | `OPTIONS` | `PUT` | `DELETE` | `HEAD` | `ALL`
     * @return builder
     */
    def accessControlAllowMethods(args: Endofunction[com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCorsConfigAccessControlAllowMethodsArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCorsConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCorsConfigAccessControlAllowMethodsArgs.builder
      builder.accessControlAllowMethods(args(argsBuilder).build)

    /**
     * @param accessControlAllowOrigins Object that contains an attribute `items` that contains a list of origins that CloudFront can use as the value for the `Access-Control-Allow-Origin` HTTP response header.
     * @return builder
     */
    def accessControlAllowOrigins(args: Endofunction[com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCorsConfigAccessControlAllowOriginsArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCorsConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCorsConfigAccessControlAllowOriginsArgs.builder
      builder.accessControlAllowOrigins(args(argsBuilder).build)

    /**
     * @param accessControlExposeHeaders Object that contains an attribute `items` that contains a list of HTTP headers that CloudFront includes as values for the `Access-Control-Expose-Headers` HTTP response header.
     * @return builder
     */
    def accessControlExposeHeaders(args: Endofunction[com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCorsConfigAccessControlExposeHeadersArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCorsConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCorsConfigAccessControlExposeHeadersArgs.builder
      builder.accessControlExposeHeaders(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigArgs.Builder)
    /**
     * @param cookies Object that contains a list of cookie names. See Items for more information.
     * @return builder
     */
    def cookies(args: Endofunction[com.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesArgs.builder
      builder.cookies(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudfront.inputs.MonitoringSubscriptionState.Builder)
    /**
     * @param monitoringSubscription A monitoring subscription. This structure contains information about whether additional CloudWatch metrics are enabled for a given CloudFront distribution.
     * @return builder
     */
    def monitoringSubscription(args: Endofunction[com.pulumi.aws.cloudfront.inputs.MonitoringSubscriptionMonitoringSubscriptionArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.MonitoringSubscriptionState.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.MonitoringSubscriptionMonitoringSubscriptionArgs.builder
      builder.monitoringSubscription(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyState.Builder)
    /**
     * @param corsConfig A configuration for a set of HTTP response headers that are used for Cross-Origin Resource Sharing (CORS). See Cors Config for more information.
     * @return builder
     */
    def corsConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCorsConfigArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyState.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCorsConfigArgs.builder
      builder.corsConfig(args(argsBuilder).build)

    /**
     * @param customHeadersConfig Object that contains an attribute `items` that contains a list of custom headers. See Custom Header for more information.
     * @return builder
     */
    def customHeadersConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCustomHeadersConfigArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyState.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCustomHeadersConfigArgs.builder
      builder.customHeadersConfig(args(argsBuilder).build)

    /**
     * @param removeHeadersConfig A configuration for a set of HTTP headers to remove from the HTTP response. Object that contains an attribute `items` that contains a list of headers. See Remove Header for more information.
     * @return builder
     */
    def removeHeadersConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyRemoveHeadersConfigArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyState.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyRemoveHeadersConfigArgs.builder
      builder.removeHeadersConfig(args(argsBuilder).build)

    /**
     * @param securityHeadersConfig A configuration for a set of security-related HTTP response headers. See Security Headers Config for more information.
     * @return builder
     */
    def securityHeadersConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyState.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigArgs.builder
      builder.securityHeadersConfig(args(argsBuilder).build)

    /**
     * @param serverTimingHeadersConfig A configuration for enabling the Server-Timing header in HTTP responses sent from CloudFront. See Server Timing Headers Config for more information.
     * @return builder
     */
    def serverTimingHeadersConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyServerTimingHeadersConfigArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyState.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyServerTimingHeadersConfigArgs.builder
      builder.serverTimingHeadersConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudfront.inputs.DistributionOrderedCacheBehaviorArgs.Builder)
    /**
     * @param forwardedValues The forwarded values configuration that specifies how CloudFront handles query strings, cookies and headers (maximum one).
     * @return builder
     */
    def forwardedValues(args: Endofunction[com.pulumi.aws.cloudfront.inputs.DistributionOrderedCacheBehaviorForwardedValuesArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.DistributionOrderedCacheBehaviorArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.DistributionOrderedCacheBehaviorForwardedValuesArgs.builder
      builder.forwardedValues(args(argsBuilder).build)

    /**
     * @param functionAssociations A config block that triggers a cloudfront function with specific actions (maximum 2).
     * @return builder
     */
    def functionAssociations(args: Endofunction[com.pulumi.aws.cloudfront.inputs.DistributionOrderedCacheBehaviorFunctionAssociationArgs.Builder]*):
        com.pulumi.aws.cloudfront.inputs.DistributionOrderedCacheBehaviorArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudfront.inputs.DistributionOrderedCacheBehaviorFunctionAssociationArgs.builder
      builder.functionAssociations(args.map(_(argsBuilder).build)*)

    /**
     * @param grpcConfig A config block that sets the grpc config.
     * @return builder
     */
    def grpcConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.DistributionOrderedCacheBehaviorGrpcConfigArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.DistributionOrderedCacheBehaviorArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.DistributionOrderedCacheBehaviorGrpcConfigArgs.builder
      builder.grpcConfig(args(argsBuilder).build)

    /**
     * @param lambdaFunctionAssociations A config block that triggers a lambda function with specific actions (maximum 4).
     * @return builder
     */
    def lambdaFunctionAssociations(args: Endofunction[com.pulumi.aws.cloudfront.inputs.DistributionOrderedCacheBehaviorLambdaFunctionAssociationArgs.Builder]*):
        com.pulumi.aws.cloudfront.inputs.DistributionOrderedCacheBehaviorArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudfront.inputs.DistributionOrderedCacheBehaviorLambdaFunctionAssociationArgs.builder
      builder.lambdaFunctionAssociations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigArgs.Builder)
    /**
     * @param queryStrings Configuration parameter that contains a list of query string names. See Items for more information.
     * @return builder
     */
    def queryStrings(args: Endofunction[com.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStringsArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryStringsArgs.builder
      builder.queryStrings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudfront.inputs.ContinuousDeploymentPolicyState.Builder)
    /**
     * @param stagingDistributionDnsNames CloudFront domain name of the staging distribution. See `stagingDistributionDnsNames`.
     * @return builder
     */
    def stagingDistributionDnsNames(args: Endofunction[com.pulumi.aws.cloudfront.inputs.ContinuousDeploymentPolicyStagingDistributionDnsNamesArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.ContinuousDeploymentPolicyState.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.ContinuousDeploymentPolicyStagingDistributionDnsNamesArgs.builder
      builder.stagingDistributionDnsNames(args(argsBuilder).build)

    /**
     * @param trafficConfig Parameters for routing production traffic from primary to staging distributions. See `trafficConfig`.
     * @return builder
     */
    def trafficConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.ContinuousDeploymentPolicyTrafficConfigArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.ContinuousDeploymentPolicyState.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.ContinuousDeploymentPolicyTrafficConfigArgs.builder
      builder.trafficConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudfront.inputs.MonitoringSubscriptionMonitoringSubscriptionArgs.Builder)
    /**
     * @param realtimeMetricsSubscriptionConfig A subscription configuration for additional CloudWatch metrics. See below.
     * @return builder
     */
    def realtimeMetricsSubscriptionConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.MonitoringSubscriptionMonitoringSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigArgs.builder
      builder.realtimeMetricsSubscriptionConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudfront.inputs.DistributionOriginArgs.Builder)
    /**
     * @param customHeaders One or more sub-resources with `name` and `value` parameters that specify header data that will be sent to the origin (multiples allowed).
     * @return builder
     */
    def customHeaders(args: Endofunction[com.pulumi.aws.cloudfront.inputs.DistributionOriginCustomHeaderArgs.Builder]*):
        com.pulumi.aws.cloudfront.inputs.DistributionOriginArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudfront.inputs.DistributionOriginCustomHeaderArgs.builder
      builder.customHeaders(args.map(_(argsBuilder).build)*)

    /**
     * @param customOriginConfig The CloudFront custom origin configuration information. If an S3 origin is required, use `originAccessControlId` or `s3OriginConfig` instead.
     * @return builder
     */
    def customOriginConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.DistributionOriginCustomOriginConfigArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.DistributionOriginArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.DistributionOriginCustomOriginConfigArgs.builder
      builder.customOriginConfig(args(argsBuilder).build)

    /**
     * @param originShield CloudFront Origin Shield configuration information. Using Origin Shield can help reduce the load on your origin. For more information, see [Using Origin Shield](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html) in the Amazon CloudFront Developer Guide.
     * @return builder
     */
    def originShield(args: Endofunction[com.pulumi.aws.cloudfront.inputs.DistributionOriginOriginShieldArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.DistributionOriginArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.DistributionOriginOriginShieldArgs.builder
      builder.originShield(args(argsBuilder).build)

    /**
     * @param s3OriginConfig CloudFront S3 origin configuration information. If a custom origin is required, use `customOriginConfig` instead.
     * @return builder
     */
    def s3OriginConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.DistributionOriginS3OriginConfigArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.DistributionOriginArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.DistributionOriginS3OriginConfigArgs.builder
      builder.s3OriginConfig(args(argsBuilder).build)

    /**
     * @param vpcOriginConfig The VPC origin configuration.
     * @return builder
     */
    def vpcOriginConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.DistributionOriginVpcOriginConfigArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.DistributionOriginArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.DistributionOriginVpcOriginConfigArgs.builder
      builder.vpcOriginConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionProfileEncryptionEntitiesArgs.Builder)
    def items(args: Endofunction[com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionProfileEncryptionEntitiesItemArgs.Builder]*):
        com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionProfileEncryptionEntitiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionProfileEncryptionEntitiesItemArgs.builder
      builder.items(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudfront.inputs.RealtimeLogConfigState.Builder)
    /**
     * @param endpoint The Amazon Kinesis data streams where real-time log data is sent.
     * @return builder
     */
    def endpoint(args: Endofunction[com.pulumi.aws.cloudfront.inputs.RealtimeLogConfigEndpointArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.RealtimeLogConfigState.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.RealtimeLogConfigEndpointArgs.builder
      builder.endpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudfront.inputs.KeyvaluestoreKeysExclusiveState.Builder)
    /**
     * @param resourceKeyValuePairs A list of all resource key value pairs associated with the KeyValueStore.
     *  See `resourceKeyValuePair` below.
     * @return builder
     */
    def resourceKeyValuePairs(args: Endofunction[com.pulumi.aws.cloudfront.inputs.KeyvaluestoreKeysExclusiveResourceKeyValuePairArgs.Builder]*):
        com.pulumi.aws.cloudfront.inputs.KeyvaluestoreKeysExclusiveState.Builder =
      def argsBuilder = com.pulumi.aws.cloudfront.inputs.KeyvaluestoreKeysExclusiveResourceKeyValuePairArgs.builder
      builder.resourceKeyValuePairs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudfront.inputs.DistributionState.Builder)
    /**
     * @param customErrorResponses One or more custom error response elements (multiples allowed).
     * @return builder
     */
    def customErrorResponses(args: Endofunction[com.pulumi.aws.cloudfront.inputs.DistributionCustomErrorResponseArgs.Builder]*):
        com.pulumi.aws.cloudfront.inputs.DistributionState.Builder =
      def argsBuilder = com.pulumi.aws.cloudfront.inputs.DistributionCustomErrorResponseArgs.builder
      builder.customErrorResponses(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultCacheBehavior Default cache behavior for this distribution (maximum one). Requires either `cachePolicyId` (preferred) or `forwardedValues` (deprecated) be set.
     * @return builder
     */
    def defaultCacheBehavior(args: Endofunction[com.pulumi.aws.cloudfront.inputs.DistributionDefaultCacheBehaviorArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.DistributionState.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.DistributionDefaultCacheBehaviorArgs.builder
      builder.defaultCacheBehavior(args(argsBuilder).build)

    /**
     * @param loggingConfig The logging configuration that controls how logs are written to your distribution (maximum one). AWS provides two versions of access logs for CloudFront: Legacy and v2. This argument configures legacy version standard logs.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.DistributionLoggingConfigArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.DistributionState.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.DistributionLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

    /**
     * @param orderedCacheBehaviors Ordered list of cache behaviors resource for this distribution. List from top to bottom in order of precedence. The topmost cache behavior will have precedence 0.
     * @return builder
     */
    def orderedCacheBehaviors(args: Endofunction[com.pulumi.aws.cloudfront.inputs.DistributionOrderedCacheBehaviorArgs.Builder]*):
        com.pulumi.aws.cloudfront.inputs.DistributionState.Builder =
      def argsBuilder = com.pulumi.aws.cloudfront.inputs.DistributionOrderedCacheBehaviorArgs.builder
      builder.orderedCacheBehaviors(args.map(_(argsBuilder).build)*)

    /**
     * @param originGroups One or more originGroup for this distribution (multiples allowed).
     * @return builder
     */
    def originGroups(args: Endofunction[com.pulumi.aws.cloudfront.inputs.DistributionOriginGroupArgs.Builder]*):
        com.pulumi.aws.cloudfront.inputs.DistributionState.Builder =
      def argsBuilder = com.pulumi.aws.cloudfront.inputs.DistributionOriginGroupArgs.builder
      builder.originGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param origins One or more origins for this distribution (multiples allowed).
     * @return builder
     */
    def origins(args: Endofunction[com.pulumi.aws.cloudfront.inputs.DistributionOriginArgs.Builder]*):
        com.pulumi.aws.cloudfront.inputs.DistributionState.Builder =
      def argsBuilder = com.pulumi.aws.cloudfront.inputs.DistributionOriginArgs.builder
      builder.origins(args.map(_(argsBuilder).build)*)

    /**
     * @param restrictions The restriction configuration for this distribution (maximum one).
     * @return builder
     */
    def restrictions(args: Endofunction[com.pulumi.aws.cloudfront.inputs.DistributionRestrictionsArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.DistributionState.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.DistributionRestrictionsArgs.builder
      builder.restrictions(args(argsBuilder).build)

    /**
     * @param trustedKeyGroups List of nested attributes for active trusted key groups, if the distribution is set up to serve private content with signed URLs.
     * @return builder
     */
    def trustedKeyGroups(args: Endofunction[com.pulumi.aws.cloudfront.inputs.DistributionTrustedKeyGroupArgs.Builder]*):
        com.pulumi.aws.cloudfront.inputs.DistributionState.Builder =
      def argsBuilder = com.pulumi.aws.cloudfront.inputs.DistributionTrustedKeyGroupArgs.builder
      builder.trustedKeyGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param trustedSigners List of nested attributes for active trusted signers, if the distribution is set up to serve private content with signed URLs.
     * @return builder
     */
    def trustedSigners(args: Endofunction[com.pulumi.aws.cloudfront.inputs.DistributionTrustedSignerArgs.Builder]*):
        com.pulumi.aws.cloudfront.inputs.DistributionState.Builder =
      def argsBuilder = com.pulumi.aws.cloudfront.inputs.DistributionTrustedSignerArgs.builder
      builder.trustedSigners(args.map(_(argsBuilder).build)*)

    /**
     * @param viewerCertificate The SSL configuration for this distribution (maximum one).
     * @return builder
     */
    def viewerCertificate(args: Endofunction[com.pulumi.aws.cloudfront.inputs.DistributionViewerCertificateArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.DistributionState.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.DistributionViewerCertificateArgs.builder
      builder.viewerCertificate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudfront.inputs.DistributionTrustedKeyGroupArgs.Builder)
    /**
     * @param items List of nested attributes for each trusted signer
     * @return builder
     */
    def items(args: Endofunction[com.pulumi.aws.cloudfront.inputs.DistributionTrustedKeyGroupItemArgs.Builder]*):
        com.pulumi.aws.cloudfront.inputs.DistributionTrustedKeyGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudfront.inputs.DistributionTrustedKeyGroupItemArgs.builder
      builder.items(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudfront.inputs.KeyValueStoreState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.cloudfront.inputs.KeyValueStoreTimeoutsArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.KeyValueStoreState.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.KeyValueStoreTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudfront.inputs.OriginRequestPolicyHeadersConfigArgs.Builder)
    def headers(args: Endofunction[com.pulumi.aws.cloudfront.inputs.OriginRequestPolicyHeadersConfigHeadersArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.OriginRequestPolicyHeadersConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.OriginRequestPolicyHeadersConfigHeadersArgs.builder
      builder.headers(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudfront.inputs.VpcOriginState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.cloudfront.inputs.VpcOriginTimeoutsArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.VpcOriginState.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.VpcOriginTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param vpcOriginEndpointConfig The VPC origin endpoint configuration.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def vpcOriginEndpointConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.VpcOriginVpcOriginEndpointConfigArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.VpcOriginState.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.VpcOriginVpcOriginEndpointConfigArgs.builder
      builder.vpcOriginEndpointConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudfront.inputs.DistributionRestrictionsArgs.Builder)
    def geoRestriction(args: Endofunction[com.pulumi.aws.cloudfront.inputs.DistributionRestrictionsGeoRestrictionArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.DistributionRestrictionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.DistributionRestrictionsGeoRestrictionArgs.builder
      builder.geoRestriction(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesArgs.Builder)
    def items(args: Endofunction[com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemArgs.Builder]*):
        com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemArgs.builder
      builder.items(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionProfileEncryptionEntitiesItemArgs.Builder)
    /**
     * @param fieldPatterns Object that contains an attribute `items` that contains the list of field patterns in a field-level encryption content type profile specify the fields that you want to be encrypted.
     * @return builder
     */
    def fieldPatterns(args: Endofunction[com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionProfileEncryptionEntitiesItemFieldPatternsArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionProfileEncryptionEntitiesItemArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionProfileEncryptionEntitiesItemFieldPatternsArgs.builder
      builder.fieldPatterns(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesArgs.Builder)
    def items(args: Endofunction[com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItemArgs.Builder]*):
        com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItemArgs.builder
      builder.items(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudfront.inputs.DistributionDefaultCacheBehaviorArgs.Builder)
    /**
     * @param forwardedValues The forwarded values configuration that specifies how CloudFront handles query strings, cookies and headers (maximum one).
     * @return builder
     */
    def forwardedValues(args: Endofunction[com.pulumi.aws.cloudfront.inputs.DistributionDefaultCacheBehaviorForwardedValuesArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.DistributionDefaultCacheBehaviorArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.DistributionDefaultCacheBehaviorForwardedValuesArgs.builder
      builder.forwardedValues(args(argsBuilder).build)

    /**
     * @param functionAssociations A config block that triggers a cloudfront function with specific actions (maximum 2).
     * @return builder
     */
    def functionAssociations(args: Endofunction[com.pulumi.aws.cloudfront.inputs.DistributionDefaultCacheBehaviorFunctionAssociationArgs.Builder]*):
        com.pulumi.aws.cloudfront.inputs.DistributionDefaultCacheBehaviorArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudfront.inputs.DistributionDefaultCacheBehaviorFunctionAssociationArgs.builder
      builder.functionAssociations(args.map(_(argsBuilder).build)*)

    /**
     * @param grpcConfig A config block that sets the grpc config.
     * @return builder
     */
    def grpcConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.DistributionDefaultCacheBehaviorGrpcConfigArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.DistributionDefaultCacheBehaviorArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.DistributionDefaultCacheBehaviorGrpcConfigArgs.builder
      builder.grpcConfig(args(argsBuilder).build)

    /**
     * @param lambdaFunctionAssociations A config block that triggers a lambda function with specific actions (maximum 4).
     * @return builder
     */
    def lambdaFunctionAssociations(args: Endofunction[com.pulumi.aws.cloudfront.inputs.DistributionDefaultCacheBehaviorLambdaFunctionAssociationArgs.Builder]*):
        com.pulumi.aws.cloudfront.inputs.DistributionDefaultCacheBehaviorArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudfront.inputs.DistributionDefaultCacheBehaviorLambdaFunctionAssociationArgs.builder
      builder.lambdaFunctionAssociations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionProfileState.Builder)
    /**
     * @param encryptionEntities The encryption entities config block for field-level encryption profiles that contains an attribute `items` which includes the encryption key and field pattern specifications.
     * @return builder
     */
    def encryptionEntities(args: Endofunction[com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionProfileEncryptionEntitiesArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionProfileState.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionProfileEncryptionEntitiesArgs.builder
      builder.encryptionEntities(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigArgs.Builder)
    /**
     * @param headers Object contains a list of header names. See Items for more information.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersArgs.builder
      builder.headers(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudfront.inputs.DistributionOrderedCacheBehaviorForwardedValuesArgs.Builder)
    /**
     * @param cookies The forwarded values cookies that specifies how CloudFront handles cookies (maximum one).
     * @return builder
     */
    def cookies(args: Endofunction[com.pulumi.aws.cloudfront.inputs.DistributionOrderedCacheBehaviorForwardedValuesCookiesArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.DistributionOrderedCacheBehaviorForwardedValuesArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.DistributionOrderedCacheBehaviorForwardedValuesCookiesArgs.builder
      builder.cookies(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudfront.inputs.DistributionOriginGroupArgs.Builder)
    /**
     * @param failoverCriteria The failover criteria for when to failover to the secondary origin.
     * @return builder
     */
    def failoverCriteria(args: Endofunction[com.pulumi.aws.cloudfront.inputs.DistributionOriginGroupFailoverCriteriaArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.DistributionOriginGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.DistributionOriginGroupFailoverCriteriaArgs.builder
      builder.failoverCriteria(args(argsBuilder).build)

    /**
     * @param members Ordered member configuration blocks assigned to the origin group, where the first member is the primary origin. You must specify two members.
     * @return builder
     */
    def members(args: Endofunction[com.pulumi.aws.cloudfront.inputs.DistributionOriginGroupMemberArgs.Builder]*):
        com.pulumi.aws.cloudfront.inputs.DistributionOriginGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudfront.inputs.DistributionOriginGroupMemberArgs.builder
      builder.members(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigState.Builder)
    /**
     * @param contentTypeProfileConfig Content Type Profile Config specifies when to forward content if a content type isn&#39;t recognized and profiles to use as by default in a request if a query argument doesn&#39;t specify a profile to use.
     * @return builder
     */
    def contentTypeProfileConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigContentTypeProfileConfigArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigState.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigContentTypeProfileConfigArgs.builder
      builder.contentTypeProfileConfig(args(argsBuilder).build)

    /**
     * @param queryArgProfileConfig Query Arg Profile Config that specifies when to forward content if a profile isn&#39;t found and the profile that can be provided as a query argument in a request.
     * @return builder
     */
    def queryArgProfileConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigQueryArgProfileConfigArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigState.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigQueryArgProfileConfigArgs.builder
      builder.queryArgProfileConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigContentTypeProfileConfigArgs.Builder)
    /**
     * @param contentTypeProfiles Object that contains an attribute `items` that contains the list of configurations for a field-level encryption content type-profile. See Content Type Profile.
     * @return builder
     */
    def contentTypeProfiles(args: Endofunction[com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigContentTypeProfileConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesArgs.builder
      builder.contentTypeProfiles(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigQueryArgProfileConfigArgs.Builder)
    /**
     * @param queryArgProfiles Object that contains an attribute `items` that contains the list ofrofiles specified for query argument-profile mapping for field-level encryption. see Query Arg Profile.
     * @return builder
     */
    def queryArgProfiles(args: Endofunction[com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigQueryArgProfileConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesArgs.builder
      builder.queryArgProfiles(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigArgs.Builder)
    /**
     * @param contentSecurityPolicy The policy directives and their values that CloudFront includes as values for the `Content-Security-Policy` HTTP response header. See Content Security Policy for more information.
     * @return builder
     */
    def contentSecurityPolicy(args: Endofunction[com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyArgs.builder
      builder.contentSecurityPolicy(args(argsBuilder).build)

    /**
     * @param contentTypeOptions Determines whether CloudFront includes the `X-Content-Type-Options` HTTP response header with its value set to `nosniff`. See Content Type Options for more information.
     * @return builder
     */
    def contentTypeOptions(args: Endofunction[com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsArgs.builder
      builder.contentTypeOptions(args(argsBuilder).build)

    /**
     * @param frameOptions Determines whether CloudFront includes the `X-Frame-Options` HTTP response header and the header\u2019s value. See Frame Options for more information.
     * @return builder
     */
    def frameOptions(args: Endofunction[com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigFrameOptionsArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigFrameOptionsArgs.builder
      builder.frameOptions(args(argsBuilder).build)

    /**
     * @param referrerPolicy Determines whether CloudFront includes the `Referrer-Policy` HTTP response header and the header\u2019s value. See Referrer Policy for more information.
     * @return builder
     */
    def referrerPolicy(args: Endofunction[com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyArgs.builder
      builder.referrerPolicy(args(argsBuilder).build)

    /**
     * @param strictTransportSecurity Determines whether CloudFront includes the `Strict-Transport-Security` HTTP response header and the header\u2019s value. See Strict Transport Security for more information.
     * @return builder
     */
    def strictTransportSecurity(args: Endofunction[com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurityArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurityArgs.builder
      builder.strictTransportSecurity(args(argsBuilder).build)

    /**
     * @param xssProtection Determine whether CloudFront includes the `X-XSS-Protection` HTTP response header and the header\u2019s value. See XSS Protection for more information.
     * @return builder
     */
    def xssProtection(args: Endofunction[com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigXssProtectionArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigXssProtectionArgs.builder
      builder.xssProtection(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudfront.inputs.ContinuousDeploymentPolicyTrafficConfigSingleWeightConfigArgs.Builder)
    /**
     * @param sessionStickinessConfig Session stickiness provides the ability to define multiple requests from a single viewer as a single session. This prevents the potentially inconsistent experience of sending some of a given user&#39;s requests to the staging distribution, while others are sent to the primary distribution. Define the session duration using TTL values. See `sessionStickinessConfig`.
     * @return builder
     */
    def sessionStickinessConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.ContinuousDeploymentPolicyTrafficConfigSingleWeightConfigSessionStickinessConfigArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.ContinuousDeploymentPolicyTrafficConfigSingleWeightConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.ContinuousDeploymentPolicyTrafficConfigSingleWeightConfigSessionStickinessConfigArgs.builder
      builder.sessionStickinessConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudfront.inputs.RealtimeLogConfigEndpointArgs.Builder)
    /**
     * @param kinesisStreamConfig The Amazon Kinesis data stream configuration.
     * @return builder
     */
    def kinesisStreamConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.RealtimeLogConfigEndpointKinesisStreamConfigArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.RealtimeLogConfigEndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.RealtimeLogConfigEndpointKinesisStreamConfigArgs.builder
      builder.kinesisStreamConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCustomHeadersConfigArgs.Builder)
    def items(args: Endofunction[com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCustomHeadersConfigItemArgs.Builder]*):
        com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCustomHeadersConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCustomHeadersConfigItemArgs.builder
      builder.items(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginArgs.Builder)
    /**
     * @param cookiesConfig Whether any cookies in viewer requests are included in the cache key and automatically included in requests that CloudFront sends to the origin. See Cookies Config for more information.
     * @return builder
     */
    def cookiesConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigArgs.builder
      builder.cookiesConfig(args(argsBuilder).build)

    /**
     * @param headersConfig Whether any HTTP headers are included in the cache key and automatically included in requests that CloudFront sends to the origin. See Headers Config for more information.
     * @return builder
     */
    def headersConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigArgs.builder
      builder.headersConfig(args(argsBuilder).build)

    /**
     * @param queryStringsConfig Whether any URL query strings in viewer requests are included in the cache key. It also automatically includes these query strings in requests that CloudFront sends to the origin. Please refer to the Query String Config for more information.
     * @return builder
     */
    def queryStringsConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigArgs.builder
      builder.queryStringsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyRemoveHeadersConfigArgs.Builder)
    def items(args: Endofunction[com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyRemoveHeadersConfigItemArgs.Builder]*):
        com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyRemoveHeadersConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyRemoveHeadersConfigItemArgs.builder
      builder.items(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudfront.inputs.DistributionTrustedSignerArgs.Builder)
    /**
     * @param items List of nested attributes for each trusted signer
     * @return builder
     */
    def items(args: Endofunction[com.pulumi.aws.cloudfront.inputs.DistributionTrustedSignerItemArgs.Builder]*):
        com.pulumi.aws.cloudfront.inputs.DistributionTrustedSignerArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudfront.inputs.DistributionTrustedSignerItemArgs.builder
      builder.items(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudfront.inputs.OriginRequestPolicyCookiesConfigArgs.Builder)
    def cookies(args: Endofunction[com.pulumi.aws.cloudfront.inputs.OriginRequestPolicyCookiesConfigCookiesArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.OriginRequestPolicyCookiesConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.OriginRequestPolicyCookiesConfigCookiesArgs.builder
      builder.cookies(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudfront.inputs.DistributionDefaultCacheBehaviorForwardedValuesArgs.Builder)
    /**
     * @param cookies The forwarded values cookies that specifies how CloudFront handles cookies (maximum one).
     * @return builder
     */
    def cookies(args: Endofunction[com.pulumi.aws.cloudfront.inputs.DistributionDefaultCacheBehaviorForwardedValuesCookiesArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.DistributionDefaultCacheBehaviorForwardedValuesArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.DistributionDefaultCacheBehaviorForwardedValuesCookiesArgs.builder
      builder.cookies(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudfront.inputs.VpcOriginVpcOriginEndpointConfigArgs.Builder)
    /**
     * @param originSslProtocols A complex type that contains information about the SSL/TLS protocols that CloudFront can use when establishing an HTTPS connection with your origin.
     * @return builder
     */
    def originSslProtocols(args: Endofunction[com.pulumi.aws.cloudfront.inputs.VpcOriginVpcOriginEndpointConfigOriginSslProtocolsArgs.Builder]):
        com.pulumi.aws.cloudfront.inputs.VpcOriginVpcOriginEndpointConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.VpcOriginVpcOriginEndpointConfigOriginSslProtocolsArgs.builder
      builder.originSslProtocols(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudfront.ResponseHeadersPolicyArgs.Builder)
    /**
     * @param corsConfig A configuration for a set of HTTP response headers that are used for Cross-Origin Resource Sharing (CORS). See Cors Config for more information.
     * @return builder
     */
    def corsConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCorsConfigArgs.Builder]):
        com.pulumi.aws.cloudfront.ResponseHeadersPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCorsConfigArgs.builder
      builder.corsConfig(args(argsBuilder).build)

    /**
     * @param customHeadersConfig Object that contains an attribute `items` that contains a list of custom headers. See Custom Header for more information.
     * @return builder
     */
    def customHeadersConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCustomHeadersConfigArgs.Builder]):
        com.pulumi.aws.cloudfront.ResponseHeadersPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCustomHeadersConfigArgs.builder
      builder.customHeadersConfig(args(argsBuilder).build)

    /**
     * @param removeHeadersConfig A configuration for a set of HTTP headers to remove from the HTTP response. Object that contains an attribute `items` that contains a list of headers. See Remove Header for more information.
     * @return builder
     */
    def removeHeadersConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyRemoveHeadersConfigArgs.Builder]):
        com.pulumi.aws.cloudfront.ResponseHeadersPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyRemoveHeadersConfigArgs.builder
      builder.removeHeadersConfig(args(argsBuilder).build)

    /**
     * @param securityHeadersConfig A configuration for a set of security-related HTTP response headers. See Security Headers Config for more information.
     * @return builder
     */
    def securityHeadersConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigArgs.Builder]):
        com.pulumi.aws.cloudfront.ResponseHeadersPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigArgs.builder
      builder.securityHeadersConfig(args(argsBuilder).build)

    /**
     * @param serverTimingHeadersConfig A configuration for enabling the Server-Timing header in HTTP responses sent from CloudFront. See Server Timing Headers Config for more information.
     * @return builder
     */
    def serverTimingHeadersConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyServerTimingHeadersConfigArgs.Builder]):
        com.pulumi.aws.cloudfront.ResponseHeadersPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyServerTimingHeadersConfigArgs.builder
      builder.serverTimingHeadersConfig(args(argsBuilder).build)
