package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object cloudfront:
  /** Resource for managing a CloudFront Anycast IP List. */
  def AnycastIpList(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.AnycastIpListArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudfront.AnycastIpListArgs.builder
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
    com.pulumi.aws.cloudfront.AnycastIpList(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  def CachePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.CachePolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudfront.CachePolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.cloudfront.CachePolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object CloudfrontFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to retrieve information about a CloudFront cache policy. */
    inline def getCachePolicy(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetCachePolicyArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudfront.outputs.GetCachePolicyResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetCachePolicyArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getCachePolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to retrieve information about a CloudFront cache policy. */
    inline def getCachePolicyPlain(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetCachePolicyPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudfront.outputs.GetCachePolicyResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetCachePolicyPlainArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getCachePolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to retrieve information about a CloudFront connection group. */
    inline def getConnectionGroup(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetConnectionGroupArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudfront.outputs.GetConnectionGroupResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetConnectionGroupArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getConnectionGroup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to retrieve information about a CloudFront connection group. */
    inline def getConnectionGroupPlain(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetConnectionGroupPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudfront.outputs.GetConnectionGroupResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetConnectionGroupPlainArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getConnectionGroupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to retrieve information about a CloudFront distribution. */
    inline def getDistribution(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetDistributionArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudfront.outputs.GetDistributionResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetDistributionArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getDistribution(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to retrieve information about a CloudFront distribution. */
    inline def getDistributionPlain(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetDistributionPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudfront.outputs.GetDistributionResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetDistributionPlainArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getDistributionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to retrieve information about a CloudFront distribution tenant. */
    inline def getDistributionTenant(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetDistributionTenantArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudfront.outputs.GetDistributionTenantResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetDistributionTenantArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getDistributionTenant(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to retrieve information about a CloudFront distribution tenant. */
    inline def getDistributionTenantPlain(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetDistributionTenantPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudfront.outputs.GetDistributionTenantResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetDistributionTenantPlainArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getDistributionTenantPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides information about a CloudFront Function. */
    inline def getFunction(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetFunctionArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudfront.outputs.GetFunctionResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetFunctionArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getFunction(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides information about a CloudFront Function. */
    inline def getFunctionPlain(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetFunctionPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudfront.outputs.GetFunctionResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetFunctionPlainArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getFunctionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * The CloudFront Log Delivery Canonical User ID data source allows access to the [canonical user ID](http://docs.aws.amazon.com/general/latest/gr/acct-identifiers.html) of the AWS `awslogsdelivery` account for CloudFront bucket logging.
     * See the [Amazon CloudFront Developer Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/AccessLogs.html) for more information.
     */
    inline def getLogDeliveryCanonicalUserId(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetLogDeliveryCanonicalUserIdArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudfront.outputs.GetLogDeliveryCanonicalUserIdResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetLogDeliveryCanonicalUserIdArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getLogDeliveryCanonicalUserId(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * The CloudFront Log Delivery Canonical User ID data source allows access to the [canonical user ID](http://docs.aws.amazon.com/general/latest/gr/acct-identifiers.html) of the AWS `awslogsdelivery` account for CloudFront bucket logging.
     * See the [Amazon CloudFront Developer Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/AccessLogs.html) for more information.
     */
    inline def getLogDeliveryCanonicalUserIdPlain(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetLogDeliveryCanonicalUserIdPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudfront.outputs.GetLogDeliveryCanonicalUserIdResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetLogDeliveryCanonicalUserIdPlainArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getLogDeliveryCanonicalUserIdPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to retrieve information for an Amazon CloudFront origin access control config. */
    inline def getOriginAccessControl(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetOriginAccessControlArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudfront.outputs.GetOriginAccessControlResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetOriginAccessControlArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getOriginAccessControl(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to retrieve information for an Amazon CloudFront origin access control config. */
    inline def getOriginAccessControlPlain(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetOriginAccessControlPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudfront.outputs.GetOriginAccessControlResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetOriginAccessControlPlainArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getOriginAccessControlPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to get ARNs, IDs and S3 canonical user IDs of Amazon CloudFront origin access identities. */
    inline def getOriginAccessIdentities(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetOriginAccessIdentitiesArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudfront.outputs.GetOriginAccessIdentitiesResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetOriginAccessIdentitiesArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getOriginAccessIdentities(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get ARNs, IDs and S3 canonical user IDs of Amazon CloudFront origin access identities. */
    inline def getOriginAccessIdentitiesPlain(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetOriginAccessIdentitiesPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudfront.outputs.GetOriginAccessIdentitiesResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetOriginAccessIdentitiesPlainArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getOriginAccessIdentitiesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to retrieve information for an Amazon CloudFront origin access identity. */
    inline def getOriginAccessIdentity(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetOriginAccessIdentityArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudfront.outputs.GetOriginAccessIdentityResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetOriginAccessIdentityArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getOriginAccessIdentity(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to retrieve information for an Amazon CloudFront origin access identity. */
    inline def getOriginAccessIdentityPlain(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetOriginAccessIdentityPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudfront.outputs.GetOriginAccessIdentityResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetOriginAccessIdentityPlainArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getOriginAccessIdentityPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getOriginRequestPolicy(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetOriginRequestPolicyArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudfront.outputs.GetOriginRequestPolicyResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetOriginRequestPolicyArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getOriginRequestPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getOriginRequestPolicyPlain(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetOriginRequestPolicyPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudfront.outputs.GetOriginRequestPolicyResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetOriginRequestPolicyPlainArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getOriginRequestPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides a CloudFront real-time log configuration resource. */
    inline def getRealtimeLogConfig(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetRealtimeLogConfigArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudfront.outputs.GetRealtimeLogConfigResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetRealtimeLogConfigArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getRealtimeLogConfig(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides a CloudFront real-time log configuration resource. */
    inline def getRealtimeLogConfigPlain(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetRealtimeLogConfigPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudfront.outputs.GetRealtimeLogConfigResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetRealtimeLogConfigPlainArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getRealtimeLogConfigPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to retrieve information about a CloudFront cache policy. */
    inline def getResponseHeadersPolicy(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetResponseHeadersPolicyArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudfront.outputs.GetResponseHeadersPolicyResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetResponseHeadersPolicyArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getResponseHeadersPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to retrieve information about a CloudFront cache policy. */
    inline def getResponseHeadersPolicyPlain(args: Endofunction[com.pulumi.aws.cloudfront.inputs.GetResponseHeadersPolicyPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudfront.outputs.GetResponseHeadersPolicyResult] =
      val argsBuilder = com.pulumi.aws.cloudfront.inputs.GetResponseHeadersPolicyPlainArgs.builder
      com.pulumi.aws.cloudfront.CloudfrontFunctions.getResponseHeadersPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages an AWS CloudFront Connection Function. */
  def ConnectionFunction(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.ConnectionFunctionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudfront.ConnectionFunctionArgs.builder
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
    com.pulumi.aws.cloudfront.ConnectionFunction(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Creates an Amazon CloudFront Connection Group.
   * 
   * For information about CloudFront Connection Groups, see the [AWS CloudFormation Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/TemplateReference/aws-resource-cloudfront-connectiongroup.html).
   */
  def ConnectionGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.ConnectionGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudfront.ConnectionGroupArgs.builder
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
    com.pulumi.aws.cloudfront.ConnectionGroup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS CloudFront Continuous Deployment Policy. */
  def ContinuousDeploymentPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.ContinuousDeploymentPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudfront.ContinuousDeploymentPolicyArgs.builder
    com.pulumi.aws.cloudfront.ContinuousDeploymentPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Creates an Amazon CloudFront web distribution.
   * 
   * For information about CloudFront distributions, see the [Amazon CloudFront Developer Guide](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Introduction.html). For specific information about creating CloudFront web distributions, see the [POST Distribution](https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_CreateDistribution.html) page in the Amazon CloudFront API Reference.
   * 
   * &gt; **NOTE:** CloudFront distributions take about 15 minutes to reach a deployed state after creation or modification. During this time, deletes to resources will be blocked. If you need to delete a distribution that is enabled and you do not want to wait, you need to use the `retainOnDelete` flag.
   */
  def Distribution(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.DistributionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudfront.DistributionArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.cloudfront.Distribution(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Creates an Amazon CloudFront distribution tenant.
   * 
   * Distribution tenants allow you to create isolated configurations within a multi-tenant CloudFront distribution. Each tenant can have its own domains, customizations, and parameters while sharing the underlying distribution infrastructure.
   * 
   * For information about CloudFront distribution tenants, see the [Amazon CloudFront Developer Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-tenants.html).
   */
  def DistributionTenant(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.DistributionTenantArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudfront.DistributionTenantArgs.builder
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
    com.pulumi.aws.cloudfront.DistributionTenant(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a CloudFront Field-level Encryption Config resource. */
  def FieldLevelEncryptionConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.FieldLevelEncryptionConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudfront.FieldLevelEncryptionConfigArgs.builder
    com.pulumi.aws.cloudfront.FieldLevelEncryptionConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a CloudFront Field-level Encryption Profile resource. */
  def FieldLevelEncryptionProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.FieldLevelEncryptionProfileArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudfront.FieldLevelEncryptionProfileArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.cloudfront.FieldLevelEncryptionProfile(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a CloudFront Function resource. With CloudFront Functions in Amazon CloudFront, you can write lightweight functions in JavaScript for high-scale, latency-sensitive CDN customizations.
   * 
   * See [CloudFront Functions](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-functions.html)
   * 
   * &gt; **NOTE:** You cannot delete a function if it\u2019s associated with a cache behavior. First, update your distributions to remove the function association from all cache behaviors, then delete the function.
   */
  def Function(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.FunctionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudfront.FunctionArgs.builder
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
    com.pulumi.aws.cloudfront.Function(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  def KeyGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.KeyGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudfront.KeyGroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.cloudfront.KeyGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS CloudFront Key Value Store. */
  def KeyValueStore(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.KeyValueStoreArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudfront.KeyValueStoreArgs.builder
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
    com.pulumi.aws.cloudfront.KeyValueStore(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Resource for managing an AWS CloudFront KeyValueStore Key.
   * 
   * &gt; This resource manages individual key value pairs in a KeyValueStore. This can lead to high costs associated with accessing the CloudFront KeyValueStore API when performing terraform operations with many key value pairs defined. For large key value stores, consider the `aws.cloudfront.KeyvaluestoreKeysExclusive` resource to minimize the number of API calls made to the CloudFront KeyValueStore API.
   */
  def KeyvaluestoreKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.KeyvaluestoreKeyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudfront.KeyvaluestoreKeyArgs.builder
    com.pulumi.aws.cloudfront.KeyvaluestoreKey(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Resource for maintaining exclusive management of resource key value pairs defined in an AWS CloudFront KeyValueStore.
   * 
   * &gt; This resource takes exclusive ownership over key value pairs defined in a KeyValueStore. This includes removal of key value pairs which are not explicitly configured. To prevent persistent drift, ensure any `aws.cloudfront.KeyvaluestoreKey` resources managed alongside this resource have an equivalent `resourceKeyValuePair` argument.
   * 
   * &gt; Destruction of this resource means Terraform will no longer manage reconciliation of the configured key value pairs. It __will not__ delete the configured key value pairs from the KeyValueStore.
   */
  def KeyvaluestoreKeysExclusive(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.KeyvaluestoreKeysExclusiveArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudfront.KeyvaluestoreKeysExclusiveArgs.builder
    com.pulumi.aws.cloudfront.KeyvaluestoreKeysExclusive(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a CloudFront real-time log configuration resource. */
  def MonitoringSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.MonitoringSubscriptionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudfront.MonitoringSubscriptionArgs.builder
    com.pulumi.aws.cloudfront.MonitoringSubscription(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Creates an Amazon CloudFront multi-tenant distribution.
   * 
   * Multi-tenant distributions are a specialized type of CloudFront distribution designed for multi-tenant applications. They have specific limitations and requirements compared to standard CloudFront distributions.
   * 
   * For information about CloudFront multi-tenant distributions, see the [Amazon CloudFront Developer Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/).
   */
  def MultitenantDistribution(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.MultitenantDistributionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudfront.MultitenantDistributionArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.cloudfront.MultitenantDistribution(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an AWS CloudFront Origin Access Control, which is used by CloudFront Distributions with an Amazon S3 bucket as the origin.
   * 
   * Read more about Origin Access Control in the [CloudFront Developer Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html).
   */
  def OriginAccessControl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.OriginAccessControlArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudfront.OriginAccessControlArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.cloudfront.OriginAccessControl(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Creates an Amazon CloudFront origin access identity.
   * 
   * For information about CloudFront distributions, see the
   * [Amazon CloudFront Developer Guide](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Introduction.html). For more information on generating
   * origin access identities, see
   * [Using an Origin Access Identity to Restrict Access to Your Amazon S3 Content](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html).
   */
  def OriginAccessIdentity(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.OriginAccessIdentityArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudfront.OriginAccessIdentityArgs.builder
    com.pulumi.aws.cloudfront.OriginAccessIdentity(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  def OriginRequestPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.OriginRequestPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudfront.OriginRequestPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.cloudfront.OriginRequestPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  def PublicKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.PublicKeyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudfront.PublicKeyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.cloudfront.PublicKey(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a CloudFront real-time log configuration resource. */
  def RealtimeLogConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.RealtimeLogConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudfront.RealtimeLogConfigArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.cloudfront.RealtimeLogConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a CloudFront response headers policy resource.
   * A response headers policy contains information about a set of HTTP response headers and their values.
   * After you create a response headers policy, you can use its ID to attach it to one or more cache behaviors in a CloudFront distribution.
   * When it\u2019s attached to a cache behavior, CloudFront adds the headers in the policy to every response that it sends for requests that match the cache behavior.
   */
  def ResponseHeadersPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.ResponseHeadersPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudfront.ResponseHeadersPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.cloudfront.ResponseHeadersPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an AWS CloudFront Trust Store. */
  def TrustStore(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.TrustStoreArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudfront.TrustStoreArgs.builder
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
    com.pulumi.aws.cloudfront.TrustStore(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Creates an Amazon CloudFront VPC origin.
   * 
   * For information about CloudFront VPC origins, see
   * [Amazon CloudFront Developer Guide - Restrict access with VPC origins](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-vpc-origins.html).
   */
  def VpcOrigin(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudfront.VpcOriginArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudfront.VpcOriginArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.cloudfront.VpcOrigin(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
