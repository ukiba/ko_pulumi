package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object verifiedaccess:
  extension (builder: com.pulumi.aws.verifiedaccess.GroupArgs.Builder)
    /**
     * @param sseConfiguration Configuration block to use KMS keys for server-side encryption.
     * @return builder
     */
    def sseConfiguration(args: Endofunction[com.pulumi.aws.verifiedaccess.inputs.GroupSseConfigurationArgs.Builder]):
        com.pulumi.aws.verifiedaccess.GroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedaccess.inputs.GroupSseConfigurationArgs.builder
      builder.sseConfiguration(args(argsBuilder).build)

  /** Resource for managing a Verified Access Logging Configuration. */
  def InstanceLoggingConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.verifiedaccess.InstanceLoggingConfigurationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.verifiedaccess.InstanceLoggingConfigurationArgs.builder
    
    com.pulumi.aws.verifiedaccess.InstanceLoggingConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing a Verified Access Group. */
  def Group(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.verifiedaccess.GroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.verifiedaccess.GroupArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.verifiedaccess.Group(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.verifiedaccess.InstanceLoggingConfigurationArgs.Builder)
    /**
     * @param accessLogs A block that specifies the configuration options for Verified Access instances. Detailed below.
     * @return builder
     */
    def accessLogs(args: Endofunction[com.pulumi.aws.verifiedaccess.inputs.InstanceLoggingConfigurationAccessLogsArgs.Builder]):
        com.pulumi.aws.verifiedaccess.InstanceLoggingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedaccess.inputs.InstanceLoggingConfigurationAccessLogsArgs.builder
      builder.accessLogs(args(argsBuilder).build)

  /** Resource for managing a Verified Access Instance Trust Provider Attachment. */
  def InstanceTrustProviderAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.verifiedaccess.InstanceTrustProviderAttachmentArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.verifiedaccess.InstanceTrustProviderAttachmentArgs.builder
    
    com.pulumi.aws.verifiedaccess.InstanceTrustProviderAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.verifiedaccess.TrustProviderArgs.Builder)
    /**
     * @param deviceOptions A block of options for device identity based trust providers.
     * @return builder
     */
    def deviceOptions(args: Endofunction[com.pulumi.aws.verifiedaccess.inputs.TrustProviderDeviceOptionsArgs.Builder]):
        com.pulumi.aws.verifiedaccess.TrustProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedaccess.inputs.TrustProviderDeviceOptionsArgs.builder
      builder.deviceOptions(args(argsBuilder).build)

    /**
     * @param nativeApplicationOidcOptions The OpenID Connect details for an Native Application OIDC, user-identity based trust provider.
     * @return builder
     */
    def nativeApplicationOidcOptions(args: Endofunction[com.pulumi.aws.verifiedaccess.inputs.TrustProviderNativeApplicationOidcOptionsArgs.Builder]):
        com.pulumi.aws.verifiedaccess.TrustProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedaccess.inputs.TrustProviderNativeApplicationOidcOptionsArgs.builder
      builder.nativeApplicationOidcOptions(args(argsBuilder).build)

    /**
     * @param oidcOptions The OpenID Connect details for an oidc-type, user-identity based trust provider.
     * @return builder
     */
    def oidcOptions(args: Endofunction[com.pulumi.aws.verifiedaccess.inputs.TrustProviderOidcOptionsArgs.Builder]):
        com.pulumi.aws.verifiedaccess.TrustProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedaccess.inputs.TrustProviderOidcOptionsArgs.builder
      builder.oidcOptions(args(argsBuilder).build)

    def sseSpecification(args: Endofunction[com.pulumi.aws.verifiedaccess.inputs.TrustProviderSseSpecificationArgs.Builder]):
        com.pulumi.aws.verifiedaccess.TrustProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedaccess.inputs.TrustProviderSseSpecificationArgs.builder
      builder.sseSpecification(args(argsBuilder).build)

  /** Resource for managing an AWS EC2 (Elastic Compute Cloud) Verified Access Endpoint. */
  def Endpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.verifiedaccess.EndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.verifiedaccess.EndpointArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.verifiedaccess.Endpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing a Verified Access Instance. */
  def Instance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.verifiedaccess.InstanceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.verifiedaccess.InstanceArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.verifiedaccess.Instance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing a Verified Access Trust Provider. */
  def TrustProvider(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.verifiedaccess.TrustProviderArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.verifiedaccess.TrustProviderArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.verifiedaccess.TrustProvider(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.verifiedaccess.EndpointArgs.Builder)
    /**
     * @param cidrOptions The CIDR block details. This parameter is required if the endpoint type is `cidr`.
     * @return builder
     */
    def cidrOptions(args: Endofunction[com.pulumi.aws.verifiedaccess.inputs.EndpointCidrOptionsArgs.Builder]):
        com.pulumi.aws.verifiedaccess.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedaccess.inputs.EndpointCidrOptionsArgs.builder
      builder.cidrOptions(args(argsBuilder).build)

    /**
     * @param loadBalancerOptions The load balancer details. This parameter is required if the endpoint type is `load-balancer`.
     * @return builder
     */
    def loadBalancerOptions(args: Endofunction[com.pulumi.aws.verifiedaccess.inputs.EndpointLoadBalancerOptionsArgs.Builder]):
        com.pulumi.aws.verifiedaccess.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedaccess.inputs.EndpointLoadBalancerOptionsArgs.builder
      builder.loadBalancerOptions(args(argsBuilder).build)

    /**
     * @param networkInterfaceOptions The network interface details. This parameter is required if the endpoint type is `network-interface`.
     * @return builder
     */
    def networkInterfaceOptions(args: Endofunction[com.pulumi.aws.verifiedaccess.inputs.EndpointNetworkInterfaceOptionsArgs.Builder]):
        com.pulumi.aws.verifiedaccess.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedaccess.inputs.EndpointNetworkInterfaceOptionsArgs.builder
      builder.networkInterfaceOptions(args(argsBuilder).build)

    def rdsOptions(args: Endofunction[com.pulumi.aws.verifiedaccess.inputs.EndpointRdsOptionsArgs.Builder]):
        com.pulumi.aws.verifiedaccess.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedaccess.inputs.EndpointRdsOptionsArgs.builder
      builder.rdsOptions(args(argsBuilder).build)

    /**
     * @param sseSpecification The options in use for server side encryption.
     * @return builder
     */
    def sseSpecification(args: Endofunction[com.pulumi.aws.verifiedaccess.inputs.EndpointSseSpecificationArgs.Builder]):
        com.pulumi.aws.verifiedaccess.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedaccess.inputs.EndpointSseSpecificationArgs.builder
      builder.sseSpecification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.verifiedaccess.inputs.TrustProviderState.Builder)
    /**
     * @param deviceOptions A block of options for device identity based trust providers.
     * @return builder
     */
    def deviceOptions(args: Endofunction[com.pulumi.aws.verifiedaccess.inputs.TrustProviderDeviceOptionsArgs.Builder]):
        com.pulumi.aws.verifiedaccess.inputs.TrustProviderState.Builder =
      val argsBuilder = com.pulumi.aws.verifiedaccess.inputs.TrustProviderDeviceOptionsArgs.builder
      builder.deviceOptions(args(argsBuilder).build)

    /**
     * @param nativeApplicationOidcOptions The OpenID Connect details for an Native Application OIDC, user-identity based trust provider.
     * @return builder
     */
    def nativeApplicationOidcOptions(args: Endofunction[com.pulumi.aws.verifiedaccess.inputs.TrustProviderNativeApplicationOidcOptionsArgs.Builder]):
        com.pulumi.aws.verifiedaccess.inputs.TrustProviderState.Builder =
      val argsBuilder = com.pulumi.aws.verifiedaccess.inputs.TrustProviderNativeApplicationOidcOptionsArgs.builder
      builder.nativeApplicationOidcOptions(args(argsBuilder).build)

    /**
     * @param oidcOptions The OpenID Connect details for an oidc-type, user-identity based trust provider.
     * @return builder
     */
    def oidcOptions(args: Endofunction[com.pulumi.aws.verifiedaccess.inputs.TrustProviderOidcOptionsArgs.Builder]):
        com.pulumi.aws.verifiedaccess.inputs.TrustProviderState.Builder =
      val argsBuilder = com.pulumi.aws.verifiedaccess.inputs.TrustProviderOidcOptionsArgs.builder
      builder.oidcOptions(args(argsBuilder).build)

    def sseSpecification(args: Endofunction[com.pulumi.aws.verifiedaccess.inputs.TrustProviderSseSpecificationArgs.Builder]):
        com.pulumi.aws.verifiedaccess.inputs.TrustProviderState.Builder =
      val argsBuilder = com.pulumi.aws.verifiedaccess.inputs.TrustProviderSseSpecificationArgs.builder
      builder.sseSpecification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.verifiedaccess.inputs.GroupState.Builder)
    /**
     * @param sseConfiguration Configuration block to use KMS keys for server-side encryption.
     * @return builder
     */
    def sseConfiguration(args: Endofunction[com.pulumi.aws.verifiedaccess.inputs.GroupSseConfigurationArgs.Builder]):
        com.pulumi.aws.verifiedaccess.inputs.GroupState.Builder =
      val argsBuilder = com.pulumi.aws.verifiedaccess.inputs.GroupSseConfigurationArgs.builder
      builder.sseConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.verifiedaccess.inputs.EndpointNetworkInterfaceOptionsArgs.Builder)
    def portRanges(args: Endofunction[com.pulumi.aws.verifiedaccess.inputs.EndpointNetworkInterfaceOptionsPortRangeArgs.Builder]*):
        com.pulumi.aws.verifiedaccess.inputs.EndpointNetworkInterfaceOptionsArgs.Builder =
      def argsBuilder = com.pulumi.aws.verifiedaccess.inputs.EndpointNetworkInterfaceOptionsPortRangeArgs.builder
      builder.portRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.verifiedaccess.inputs.EndpointState.Builder)
    /**
     * @param cidrOptions The CIDR block details. This parameter is required if the endpoint type is `cidr`.
     * @return builder
     */
    def cidrOptions(args: Endofunction[com.pulumi.aws.verifiedaccess.inputs.EndpointCidrOptionsArgs.Builder]):
        com.pulumi.aws.verifiedaccess.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.aws.verifiedaccess.inputs.EndpointCidrOptionsArgs.builder
      builder.cidrOptions(args(argsBuilder).build)

    /**
     * @param loadBalancerOptions The load balancer details. This parameter is required if the endpoint type is `load-balancer`.
     * @return builder
     */
    def loadBalancerOptions(args: Endofunction[com.pulumi.aws.verifiedaccess.inputs.EndpointLoadBalancerOptionsArgs.Builder]):
        com.pulumi.aws.verifiedaccess.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.aws.verifiedaccess.inputs.EndpointLoadBalancerOptionsArgs.builder
      builder.loadBalancerOptions(args(argsBuilder).build)

    /**
     * @param networkInterfaceOptions The network interface details. This parameter is required if the endpoint type is `network-interface`.
     * @return builder
     */
    def networkInterfaceOptions(args: Endofunction[com.pulumi.aws.verifiedaccess.inputs.EndpointNetworkInterfaceOptionsArgs.Builder]):
        com.pulumi.aws.verifiedaccess.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.aws.verifiedaccess.inputs.EndpointNetworkInterfaceOptionsArgs.builder
      builder.networkInterfaceOptions(args(argsBuilder).build)

    def rdsOptions(args: Endofunction[com.pulumi.aws.verifiedaccess.inputs.EndpointRdsOptionsArgs.Builder]):
        com.pulumi.aws.verifiedaccess.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.aws.verifiedaccess.inputs.EndpointRdsOptionsArgs.builder
      builder.rdsOptions(args(argsBuilder).build)

    /**
     * @param sseSpecification The options in use for server side encryption.
     * @return builder
     */
    def sseSpecification(args: Endofunction[com.pulumi.aws.verifiedaccess.inputs.EndpointSseSpecificationArgs.Builder]):
        com.pulumi.aws.verifiedaccess.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.aws.verifiedaccess.inputs.EndpointSseSpecificationArgs.builder
      builder.sseSpecification(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.verifiedaccess.inputs.InstanceLoggingConfigurationState.Builder)
    /**
     * @param accessLogs A block that specifies the configuration options for Verified Access instances. Detailed below.
     * @return builder
     */
    def accessLogs(args: Endofunction[com.pulumi.aws.verifiedaccess.inputs.InstanceLoggingConfigurationAccessLogsArgs.Builder]):
        com.pulumi.aws.verifiedaccess.inputs.InstanceLoggingConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.verifiedaccess.inputs.InstanceLoggingConfigurationAccessLogsArgs.builder
      builder.accessLogs(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.verifiedaccess.inputs.InstanceLoggingConfigurationAccessLogsArgs.Builder)
    /**
     * @param cloudwatchLogs A block that specifies configures sending Verified Access logs to CloudWatch Logs. Detailed below.
     * @return builder
     */
    def cloudwatchLogs(args: Endofunction[com.pulumi.aws.verifiedaccess.inputs.InstanceLoggingConfigurationAccessLogsCloudwatchLogsArgs.Builder]):
        com.pulumi.aws.verifiedaccess.inputs.InstanceLoggingConfigurationAccessLogsArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedaccess.inputs.InstanceLoggingConfigurationAccessLogsCloudwatchLogsArgs.builder
      builder.cloudwatchLogs(args(argsBuilder).build)

    /**
     * @param kinesisDataFirehose A block that specifies configures sending Verified Access logs to Kinesis. Detailed below.
     * @return builder
     */
    def kinesisDataFirehose(args: Endofunction[com.pulumi.aws.verifiedaccess.inputs.InstanceLoggingConfigurationAccessLogsKinesisDataFirehoseArgs.Builder]):
        com.pulumi.aws.verifiedaccess.inputs.InstanceLoggingConfigurationAccessLogsArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedaccess.inputs.InstanceLoggingConfigurationAccessLogsKinesisDataFirehoseArgs.builder
      builder.kinesisDataFirehose(args(argsBuilder).build)

    /**
     * @param s3 A block that specifies configures sending Verified Access logs to S3. Detailed below.
     * @return builder
     */
    def s3(args: Endofunction[com.pulumi.aws.verifiedaccess.inputs.InstanceLoggingConfigurationAccessLogsS3Args.Builder]):
        com.pulumi.aws.verifiedaccess.inputs.InstanceLoggingConfigurationAccessLogsArgs.Builder =
      val argsBuilder = com.pulumi.aws.verifiedaccess.inputs.InstanceLoggingConfigurationAccessLogsS3Args.builder
      builder.s3(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.verifiedaccess.inputs.EndpointLoadBalancerOptionsArgs.Builder)
    def portRanges(args: Endofunction[com.pulumi.aws.verifiedaccess.inputs.EndpointLoadBalancerOptionsPortRangeArgs.Builder]*):
        com.pulumi.aws.verifiedaccess.inputs.EndpointLoadBalancerOptionsArgs.Builder =
      def argsBuilder = com.pulumi.aws.verifiedaccess.inputs.EndpointLoadBalancerOptionsPortRangeArgs.builder
      builder.portRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.verifiedaccess.inputs.EndpointCidrOptionsArgs.Builder)
    def portRanges(args: Endofunction[com.pulumi.aws.verifiedaccess.inputs.EndpointCidrOptionsPortRangeArgs.Builder]*):
        com.pulumi.aws.verifiedaccess.inputs.EndpointCidrOptionsArgs.Builder =
      def argsBuilder = com.pulumi.aws.verifiedaccess.inputs.EndpointCidrOptionsPortRangeArgs.builder
      builder.portRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.verifiedaccess.inputs.InstanceState.Builder)
    /**
     * @param verifiedAccessTrustProviders One or more blocks of providing information about the AWS Verified Access Trust Providers. See verifiedAccessTrustProviders below for details.One or more blocks
     * @return builder
     */
    def verifiedAccessTrustProviders(args: Endofunction[com.pulumi.aws.verifiedaccess.inputs.InstanceVerifiedAccessTrustProviderArgs.Builder]*):
        com.pulumi.aws.verifiedaccess.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.aws.verifiedaccess.inputs.InstanceVerifiedAccessTrustProviderArgs.builder
      builder.verifiedAccessTrustProviders(args.map(_(argsBuilder).build)*)
