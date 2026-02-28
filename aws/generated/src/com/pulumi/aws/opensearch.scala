package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object opensearch:
  /** Resource for managing an AWS OpenSearch Serverless Lifecycle Policy. See AWS documentation for [lifecycle policies](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-lifecycle.html). */
  def ServerlessLifecyclePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.opensearch.ServerlessLifecyclePolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.opensearch.ServerlessLifecyclePolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.opensearch.ServerlessLifecyclePolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS OpenSearch Serverless Security Policy. See AWS documentation for [encryption policies](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-encryption.html#serverless-encryption-policies) and [network policies](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-network.html#serverless-network-policies). */
  def ServerlessSecurityPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.opensearch.ServerlessSecurityPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.opensearch.ServerlessSecurityPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.opensearch.ServerlessSecurityPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an [AWS Opensearch VPC Endpoint](https://docs.aws.amazon.com/opensearch-service/latest/APIReference/API_CreateVpcEndpoint.html). Creates an Amazon OpenSearch Service-managed VPC endpoint. */
  def VpcEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.opensearch.VpcEndpointArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.opensearch.VpcEndpointArgs.builder
    
    com.pulumi.aws.opensearch.VpcEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an AWS Opensearch Package Association. */
  def PackageAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.opensearch.PackageAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.opensearch.PackageAssociationArgs.builder
    
    com.pulumi.aws.opensearch.PackageAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an AWS OpenSearch Application resource. OpenSearch Applications provide a user interface for interacting with OpenSearch data and managing OpenSearch resources. */
  def Application(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.opensearch.ApplicationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.opensearch.ApplicationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.opensearch.Application(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.opensearch.ServerlessCollectionArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.opensearch.inputs.ServerlessCollectionTimeoutsArgs.Builder]):
        com.pulumi.aws.opensearch.ServerlessCollectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.ServerlessCollectionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Resource for managing an AWS OpenSearch Serverless Security Config. */
  def ServerlessSecurityConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.opensearch.ServerlessSecurityConfigArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.opensearch.ServerlessSecurityConfigArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.opensearch.ServerlessSecurityConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.opensearch.OutboundConnectionArgs.Builder)
    /**
     * @param connectionProperties Configuration block for the outbound connection.
     * @return builder
     */
    def connectionProperties(args: Endofunction[com.pulumi.aws.opensearch.inputs.OutboundConnectionConnectionPropertiesArgs.Builder]):
        com.pulumi.aws.opensearch.OutboundConnectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.OutboundConnectionConnectionPropertiesArgs.builder
      builder.connectionProperties(args(argsBuilder).build)

    /**
     * @param localDomainInfo Configuration block for the local Opensearch domain.
     * @return builder
     */
    def localDomainInfo(args: Endofunction[com.pulumi.aws.opensearch.inputs.OutboundConnectionLocalDomainInfoArgs.Builder]):
        com.pulumi.aws.opensearch.OutboundConnectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.OutboundConnectionLocalDomainInfoArgs.builder
      builder.localDomainInfo(args(argsBuilder).build)

    /**
     * @param remoteDomainInfo Configuration block for the remote Opensearch domain.
     * @return builder
     */
    def remoteDomainInfo(args: Endofunction[com.pulumi.aws.opensearch.inputs.OutboundConnectionRemoteDomainInfoArgs.Builder]):
        com.pulumi.aws.opensearch.OutboundConnectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.OutboundConnectionRemoteDomainInfoArgs.builder
      builder.remoteDomainInfo(args(argsBuilder).build)

  /** Resource for managing an AWS OpenSearch Authorize Vpc Endpoint Access. */
  def AuthorizeVpcEndpointAccess(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.opensearch.AuthorizeVpcEndpointAccessArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.opensearch.AuthorizeVpcEndpointAccessArgs.builder
    
    com.pulumi.aws.opensearch.AuthorizeVpcEndpointAccess(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an AWS Opensearch Package. */
  def Package(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.opensearch.PackageArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.opensearch.PackageArgs.builder
    
    com.pulumi.aws.opensearch.Package(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.opensearch.ServerlessSecurityConfigArgs.Builder)
    /**
     * @param samlOptions Configuration block for SAML options.
     * @return builder
     */
    def samlOptions(args: Endofunction[com.pulumi.aws.opensearch.inputs.ServerlessSecurityConfigSamlOptionsArgs.Builder]):
        com.pulumi.aws.opensearch.ServerlessSecurityConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.ServerlessSecurityConfigSamlOptionsArgs.builder
      builder.samlOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.opensearch.DomainArgs.Builder)
    /**
     * @param advancedSecurityOptions Configuration block for [fine-grained access control](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html). Detailed below.
     * @return builder
     */
    def advancedSecurityOptions(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainAdvancedSecurityOptionsArgs.Builder]):
        com.pulumi.aws.opensearch.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainAdvancedSecurityOptionsArgs.builder
      builder.advancedSecurityOptions(args(argsBuilder).build)

    /**
     * @param aimlOptions Configuration block for parameters required to enable all machine learning features. Detailed below.
     * @return builder
     */
    def aimlOptions(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainAimlOptionsArgs.Builder]):
        com.pulumi.aws.opensearch.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainAimlOptionsArgs.builder
      builder.aimlOptions(args(argsBuilder).build)

    /**
     * @param autoTuneOptions Configuration block for the Auto-Tune options of the domain. Detailed below.
     * @return builder
     */
    def autoTuneOptions(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainAutoTuneOptionsArgs.Builder]):
        com.pulumi.aws.opensearch.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainAutoTuneOptionsArgs.builder
      builder.autoTuneOptions(args(argsBuilder).build)

    /**
     * @param clusterConfig Configuration block for the cluster of the domain. Detailed below.
     * @return builder
     */
    def clusterConfig(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainClusterConfigArgs.Builder]):
        com.pulumi.aws.opensearch.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainClusterConfigArgs.builder
      builder.clusterConfig(args(argsBuilder).build)

    /**
     * @param cognitoOptions Configuration block for authenticating dashboard with Cognito. Detailed below.
     * @return builder
     */
    def cognitoOptions(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainCognitoOptionsArgs.Builder]):
        com.pulumi.aws.opensearch.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainCognitoOptionsArgs.builder
      builder.cognitoOptions(args(argsBuilder).build)

    /**
     * @param domainEndpointOptions Configuration block for domain endpoint HTTP(S) related options. Detailed below.
     * @return builder
     */
    def domainEndpointOptions(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainDomainEndpointOptionsArgs.Builder]):
        com.pulumi.aws.opensearch.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainDomainEndpointOptionsArgs.builder
      builder.domainEndpointOptions(args(argsBuilder).build)

    /**
     * @param ebsOptions Configuration block for EBS related options, may be required based on chosen [instance size](https://aws.amazon.com/opensearch-service/pricing/). Detailed below.
     * @return builder
     */
    def ebsOptions(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainEbsOptionsArgs.Builder]):
        com.pulumi.aws.opensearch.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainEbsOptionsArgs.builder
      builder.ebsOptions(args(argsBuilder).build)

    /**
     * @param encryptAtRest Configuration block for encrypt at rest options. Only available for [certain instance types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html). Detailed below.
     * @return builder
     */
    def encryptAtRest(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainEncryptAtRestArgs.Builder]):
        com.pulumi.aws.opensearch.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainEncryptAtRestArgs.builder
      builder.encryptAtRest(args(argsBuilder).build)

    /**
     * @param identityCenterOptions Configuration block for enabling and managing IAM Identity Center integration within a domain. Detailed below.
     * @return builder
     */
    def identityCenterOptions(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainIdentityCenterOptionsArgs.Builder]):
        com.pulumi.aws.opensearch.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainIdentityCenterOptionsArgs.builder
      builder.identityCenterOptions(args(argsBuilder).build)

    /**
     * @param logPublishingOptions Configuration block for publishing slow and application logs to CloudWatch Logs. This block can be declared multiple times, for each log_type, within the same resource. Detailed below.
     * @return builder
     */
    def logPublishingOptions(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainLogPublishingOptionArgs.Builder]*):
        com.pulumi.aws.opensearch.DomainArgs.Builder =
      def argsBuilder = com.pulumi.aws.opensearch.inputs.DomainLogPublishingOptionArgs.builder
      builder.logPublishingOptions(args.map(_(argsBuilder).build)*)

    /**
     * @param nodeToNodeEncryption Configuration block for node-to-node encryption options. Detailed below.
     * @return builder
     */
    def nodeToNodeEncryption(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainNodeToNodeEncryptionArgs.Builder]):
        com.pulumi.aws.opensearch.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainNodeToNodeEncryptionArgs.builder
      builder.nodeToNodeEncryption(args(argsBuilder).build)

    /**
     * @param offPeakWindowOptions Configuration to add Off Peak update options. ([documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/off-peak.html)). Detailed below.
     * @return builder
     */
    def offPeakWindowOptions(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainOffPeakWindowOptionsArgs.Builder]):
        com.pulumi.aws.opensearch.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainOffPeakWindowOptionsArgs.builder
      builder.offPeakWindowOptions(args(argsBuilder).build)

    /**
     * @param snapshotOptions Configuration block for snapshot related options. Detailed below. DEPRECATED. For domains running OpenSearch 5.3 and later, Amazon OpenSearch takes hourly automated snapshots, making this setting irrelevant. For domains running earlier versions, OpenSearch takes daily automated snapshots.
     * @return builder
     */
    def snapshotOptions(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainSnapshotOptionsArgs.Builder]):
        com.pulumi.aws.opensearch.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainSnapshotOptionsArgs.builder
      builder.snapshotOptions(args(argsBuilder).build)

    /**
     * @param softwareUpdateOptions Software update options for the domain. Detailed below.
     * @return builder
     */
    def softwareUpdateOptions(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainSoftwareUpdateOptionsArgs.Builder]):
        com.pulumi.aws.opensearch.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainSoftwareUpdateOptionsArgs.builder
      builder.softwareUpdateOptions(args(argsBuilder).build)

    /**
     * @param vpcOptions Configuration block for VPC related options. Adding or removing this configuration forces a new resource ([documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html)). Detailed below.
     * @return builder
     */
    def vpcOptions(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainVpcOptionsArgs.Builder]):
        com.pulumi.aws.opensearch.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainVpcOptionsArgs.builder
      builder.vpcOptions(args(argsBuilder).build)

  /** Manages an [AWS Opensearch Inbound Connection Accepter](https://docs.aws.amazon.com/opensearch-service/latest/APIReference/API_AcceptInboundConnection.html). If connecting domains from different AWS accounts, ensure that the accepter is configured to use the AWS account where the _remote_ opensearch domain exists. */
  def InboundConnectionAccepter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.opensearch.InboundConnectionAccepterArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.opensearch.InboundConnectionAccepterArgs.builder
    
    com.pulumi.aws.opensearch.InboundConnectionAccepter(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an AWS Opensearch Outbound Connection. */
  def OutboundConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.opensearch.OutboundConnectionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.opensearch.OutboundConnectionArgs.builder
    
    com.pulumi.aws.opensearch.OutboundConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS OpenSearch Serverless Access Policy. See AWS documentation for [data access policies](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-data-access.html) and [supported data access policy permissions](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-data-access.html#serverless-data-supported-permissions). */
  def ServerlessAccessPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.opensearch.ServerlessAccessPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.opensearch.ServerlessAccessPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.opensearch.ServerlessAccessPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.opensearch.ServerlessVpcEndpointArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.opensearch.inputs.ServerlessVpcEndpointTimeoutsArgs.Builder]):
        com.pulumi.aws.opensearch.ServerlessVpcEndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.ServerlessVpcEndpointTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.opensearch.PackageArgs.Builder)
    /**
     * @param packageSource Configuration block for the package source options.
     * @return builder
     */
    def packageSource(args: Endofunction[com.pulumi.aws.opensearch.inputs.PackagePackageSourceArgs.Builder]):
        com.pulumi.aws.opensearch.PackageArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.PackagePackageSourceArgs.builder
      builder.packageSource(args(argsBuilder).build)

  /** Allows setting policy to an OpenSearch domain while referencing domain attributes (e.g., ARN). */
  def DomainPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.opensearch.DomainPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.opensearch.DomainPolicyArgs.builder
    
    com.pulumi.aws.opensearch.DomainPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.opensearch.DomainSamlOptionsArgs.Builder)
    /**
     * @param samlOptions SAML authentication options for an AWS OpenSearch Domain.
     * @return builder
     */
    def samlOptions(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainSamlOptionsSamlOptionsArgs.Builder]):
        com.pulumi.aws.opensearch.DomainSamlOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainSamlOptionsSamlOptionsArgs.builder
      builder.samlOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.opensearch.VpcEndpointArgs.Builder)
    /**
     * @param vpcOptions Options to specify the subnets and security groups for the endpoint.
     * @return builder
     */
    def vpcOptions(args: Endofunction[com.pulumi.aws.opensearch.inputs.VpcEndpointVpcOptionsArgs.Builder]):
        com.pulumi.aws.opensearch.VpcEndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.VpcEndpointVpcOptionsArgs.builder
      builder.vpcOptions(args(argsBuilder).build)

  /** Resource for managing an AWS OpenSearchServerless VPC Endpoint. */
  def ServerlessVpcEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.opensearch.ServerlessVpcEndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.opensearch.ServerlessVpcEndpointArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.opensearch.ServerlessVpcEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.opensearch.ApplicationArgs.Builder)
    /**
     * @param appConfigs Configuration block(s) for OpenSearch application settings. See App Config below.
     * @return builder
     */
    def appConfigs(args: Endofunction[com.pulumi.aws.opensearch.inputs.ApplicationAppConfigArgs.Builder]*):
        com.pulumi.aws.opensearch.ApplicationArgs.Builder =
      def argsBuilder = com.pulumi.aws.opensearch.inputs.ApplicationAppConfigArgs.builder
      builder.appConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param dataSources Configuration block(s) for data sources to link to the OpenSearch application. See Data Source below.
     * @return builder
     */
    def dataSources(args: Endofunction[com.pulumi.aws.opensearch.inputs.ApplicationDataSourceArgs.Builder]*):
        com.pulumi.aws.opensearch.ApplicationArgs.Builder =
      def argsBuilder = com.pulumi.aws.opensearch.inputs.ApplicationDataSourceArgs.builder
      builder.dataSources(args.map(_(argsBuilder).build)*)

    /**
     * @param iamIdentityCenterOptions Configuration block for integrating AWS IAM Identity Center with the OpenSearch application. See IAM Identity Center Options below.
     * @return builder
     */
    def iamIdentityCenterOptions(args: Endofunction[com.pulumi.aws.opensearch.inputs.ApplicationIamIdentityCenterOptionsArgs.Builder]):
        com.pulumi.aws.opensearch.ApplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.ApplicationIamIdentityCenterOptionsArgs.builder
      builder.iamIdentityCenterOptions(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.opensearch.inputs.ApplicationTimeoutsArgs.Builder]):
        com.pulumi.aws.opensearch.ApplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.ApplicationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Manages SAML authentication options for an AWS OpenSearch Domain. */
  def DomainSamlOptions(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.opensearch.DomainSamlOptionsArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.opensearch.DomainSamlOptionsArgs.builder
    
    com.pulumi.aws.opensearch.DomainSamlOptions(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Resource for managing an AWS OpenSearch Serverless Collection.
   *  
   *  &gt; **NOTE:** An `aws.opensearch.ServerlessCollection` cannot be created without having an applicable encryption security policy. Use the `dependsOn` meta-argument to define this dependency.
   *  
   *  &gt; **NOTE:** An `aws.opensearch.ServerlessCollection` is not accessible without configuring an applicable network security policy. Data cannot be accessed without configuring an applicable data access policy.
   */
  def ServerlessCollection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.opensearch.ServerlessCollectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.opensearch.ServerlessCollectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.opensearch.ServerlessCollection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type OpensearchFunctions = com.pulumi.aws.opensearch.OpensearchFunctions
  object OpensearchFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.opensearch.OpensearchFunctions.*
  extension (self: OpensearchFunctions.type)
    /** Use this data source to get information about an OpenSearch Domain */
    def getDomain(args: Endofunction[com.pulumi.aws.opensearch.inputs.GetDomainArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.opensearch.outputs.GetDomainResult] =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.GetDomainArgs.builder
      com.pulumi.aws.opensearch.OpensearchFunctions.getDomain(args(argsBuilder).build)

    /** Use this data source to get information about an OpenSearch Domain */
    def getDomainPlain(args: Endofunction[com.pulumi.aws.opensearch.inputs.GetDomainPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.opensearch.outputs.GetDomainResult] =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.GetDomainPlainArgs.builder
      com.pulumi.aws.opensearch.OpensearchFunctions.getDomainPlain(args(argsBuilder).build)

    /** Data source for managing an AWS OpenSearch Serverless Access Policy. */
    def getServerlessAccessPolicy(args: Endofunction[com.pulumi.aws.opensearch.inputs.GetServerlessAccessPolicyArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.opensearch.outputs.GetServerlessAccessPolicyResult] =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.GetServerlessAccessPolicyArgs.builder
      com.pulumi.aws.opensearch.OpensearchFunctions.getServerlessAccessPolicy(args(argsBuilder).build)

    /** Data source for managing an AWS OpenSearch Serverless Access Policy. */
    def getServerlessAccessPolicyPlain(args: Endofunction[com.pulumi.aws.opensearch.inputs.GetServerlessAccessPolicyPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.opensearch.outputs.GetServerlessAccessPolicyResult] =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.GetServerlessAccessPolicyPlainArgs.builder
      com.pulumi.aws.opensearch.OpensearchFunctions.getServerlessAccessPolicyPlain(args(argsBuilder).build)

    /** Data source for managing an AWS OpenSearch Serverless Collection. */
    def getServerlessCollection(args: Endofunction[com.pulumi.aws.opensearch.inputs.GetServerlessCollectionArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.opensearch.outputs.GetServerlessCollectionResult] =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.GetServerlessCollectionArgs.builder
      com.pulumi.aws.opensearch.OpensearchFunctions.getServerlessCollection(args(argsBuilder).build)

    /** Data source for managing an AWS OpenSearch Serverless Collection. */
    def getServerlessCollectionPlain(args: Endofunction[com.pulumi.aws.opensearch.inputs.GetServerlessCollectionPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.opensearch.outputs.GetServerlessCollectionResult] =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.GetServerlessCollectionPlainArgs.builder
      com.pulumi.aws.opensearch.OpensearchFunctions.getServerlessCollectionPlain(args(argsBuilder).build)

    /** Data source for managing an AWS OpenSearch Serverless Lifecycle Policy. */
    def getServerlessLifecyclePolicy(args: Endofunction[com.pulumi.aws.opensearch.inputs.GetServerlessLifecyclePolicyArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.opensearch.outputs.GetServerlessLifecyclePolicyResult] =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.GetServerlessLifecyclePolicyArgs.builder
      com.pulumi.aws.opensearch.OpensearchFunctions.getServerlessLifecyclePolicy(args(argsBuilder).build)

    /** Data source for managing an AWS OpenSearch Serverless Lifecycle Policy. */
    def getServerlessLifecyclePolicyPlain(args: Endofunction[com.pulumi.aws.opensearch.inputs.GetServerlessLifecyclePolicyPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.opensearch.outputs.GetServerlessLifecyclePolicyResult] =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.GetServerlessLifecyclePolicyPlainArgs.builder
      com.pulumi.aws.opensearch.OpensearchFunctions.getServerlessLifecyclePolicyPlain(args(argsBuilder).build)

    /** Data source for managing an AWS OpenSearch Serverless Security Config. */
    def getServerlessSecurityConfig(args: Endofunction[com.pulumi.aws.opensearch.inputs.GetServerlessSecurityConfigArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.opensearch.outputs.GetServerlessSecurityConfigResult] =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.GetServerlessSecurityConfigArgs.builder
      com.pulumi.aws.opensearch.OpensearchFunctions.getServerlessSecurityConfig(args(argsBuilder).build)

    /** Data source for managing an AWS OpenSearch Serverless Security Config. */
    def getServerlessSecurityConfigPlain(args: Endofunction[com.pulumi.aws.opensearch.inputs.GetServerlessSecurityConfigPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.opensearch.outputs.GetServerlessSecurityConfigResult] =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.GetServerlessSecurityConfigPlainArgs.builder
      com.pulumi.aws.opensearch.OpensearchFunctions.getServerlessSecurityConfigPlain(args(argsBuilder).build)

    /** Use this data source to get information about an AWS OpenSearch Serverless Security Policy. */
    def getServerlessSecurityPolicy(args: Endofunction[com.pulumi.aws.opensearch.inputs.GetServerlessSecurityPolicyArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.opensearch.outputs.GetServerlessSecurityPolicyResult] =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.GetServerlessSecurityPolicyArgs.builder
      com.pulumi.aws.opensearch.OpensearchFunctions.getServerlessSecurityPolicy(args(argsBuilder).build)

    /** Use this data source to get information about an AWS OpenSearch Serverless Security Policy. */
    def getServerlessSecurityPolicyPlain(args: Endofunction[com.pulumi.aws.opensearch.inputs.GetServerlessSecurityPolicyPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.opensearch.outputs.GetServerlessSecurityPolicyResult] =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.GetServerlessSecurityPolicyPlainArgs.builder
      com.pulumi.aws.opensearch.OpensearchFunctions.getServerlessSecurityPolicyPlain(args(argsBuilder).build)

    /** Data source for managing an AWS OpenSearch Serverless VPC Endpoint. */
    def getServerlessVpcEndpoint(args: Endofunction[com.pulumi.aws.opensearch.inputs.GetServerlessVpcEndpointArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.opensearch.outputs.GetServerlessVpcEndpointResult] =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.GetServerlessVpcEndpointArgs.builder
      com.pulumi.aws.opensearch.OpensearchFunctions.getServerlessVpcEndpoint(args(argsBuilder).build)

    /** Data source for managing an AWS OpenSearch Serverless VPC Endpoint. */
    def getServerlessVpcEndpointPlain(args: Endofunction[com.pulumi.aws.opensearch.inputs.GetServerlessVpcEndpointPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.opensearch.outputs.GetServerlessVpcEndpointResult] =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.GetServerlessVpcEndpointPlainArgs.builder
      com.pulumi.aws.opensearch.OpensearchFunctions.getServerlessVpcEndpointPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.opensearch.inputs.OutboundConnectionState.Builder)
    /**
     * @param connectionProperties Configuration block for the outbound connection.
     * @return builder
     */
    def connectionProperties(args: Endofunction[com.pulumi.aws.opensearch.inputs.OutboundConnectionConnectionPropertiesArgs.Builder]):
        com.pulumi.aws.opensearch.inputs.OutboundConnectionState.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.OutboundConnectionConnectionPropertiesArgs.builder
      builder.connectionProperties(args(argsBuilder).build)

    /**
     * @param localDomainInfo Configuration block for the local Opensearch domain.
     * @return builder
     */
    def localDomainInfo(args: Endofunction[com.pulumi.aws.opensearch.inputs.OutboundConnectionLocalDomainInfoArgs.Builder]):
        com.pulumi.aws.opensearch.inputs.OutboundConnectionState.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.OutboundConnectionLocalDomainInfoArgs.builder
      builder.localDomainInfo(args(argsBuilder).build)

    /**
     * @param remoteDomainInfo Configuration block for the remote Opensearch domain.
     * @return builder
     */
    def remoteDomainInfo(args: Endofunction[com.pulumi.aws.opensearch.inputs.OutboundConnectionRemoteDomainInfoArgs.Builder]):
        com.pulumi.aws.opensearch.inputs.OutboundConnectionState.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.OutboundConnectionRemoteDomainInfoArgs.builder
      builder.remoteDomainInfo(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.opensearch.inputs.DomainState.Builder)
    /**
     * @param advancedSecurityOptions Configuration block for [fine-grained access control](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html). Detailed below.
     * @return builder
     */
    def advancedSecurityOptions(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainAdvancedSecurityOptionsArgs.Builder]):
        com.pulumi.aws.opensearch.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainAdvancedSecurityOptionsArgs.builder
      builder.advancedSecurityOptions(args(argsBuilder).build)

    /**
     * @param aimlOptions Configuration block for parameters required to enable all machine learning features. Detailed below.
     * @return builder
     */
    def aimlOptions(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainAimlOptionsArgs.Builder]):
        com.pulumi.aws.opensearch.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainAimlOptionsArgs.builder
      builder.aimlOptions(args(argsBuilder).build)

    /**
     * @param autoTuneOptions Configuration block for the Auto-Tune options of the domain. Detailed below.
     * @return builder
     */
    def autoTuneOptions(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainAutoTuneOptionsArgs.Builder]):
        com.pulumi.aws.opensearch.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainAutoTuneOptionsArgs.builder
      builder.autoTuneOptions(args(argsBuilder).build)

    /**
     * @param clusterConfig Configuration block for the cluster of the domain. Detailed below.
     * @return builder
     */
    def clusterConfig(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainClusterConfigArgs.Builder]):
        com.pulumi.aws.opensearch.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainClusterConfigArgs.builder
      builder.clusterConfig(args(argsBuilder).build)

    /**
     * @param cognitoOptions Configuration block for authenticating dashboard with Cognito. Detailed below.
     * @return builder
     */
    def cognitoOptions(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainCognitoOptionsArgs.Builder]):
        com.pulumi.aws.opensearch.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainCognitoOptionsArgs.builder
      builder.cognitoOptions(args(argsBuilder).build)

    /**
     * @param domainEndpointOptions Configuration block for domain endpoint HTTP(S) related options. Detailed below.
     * @return builder
     */
    def domainEndpointOptions(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainDomainEndpointOptionsArgs.Builder]):
        com.pulumi.aws.opensearch.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainDomainEndpointOptionsArgs.builder
      builder.domainEndpointOptions(args(argsBuilder).build)

    /**
     * @param ebsOptions Configuration block for EBS related options, may be required based on chosen [instance size](https://aws.amazon.com/opensearch-service/pricing/). Detailed below.
     * @return builder
     */
    def ebsOptions(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainEbsOptionsArgs.Builder]):
        com.pulumi.aws.opensearch.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainEbsOptionsArgs.builder
      builder.ebsOptions(args(argsBuilder).build)

    /**
     * @param encryptAtRest Configuration block for encrypt at rest options. Only available for [certain instance types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html). Detailed below.
     * @return builder
     */
    def encryptAtRest(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainEncryptAtRestArgs.Builder]):
        com.pulumi.aws.opensearch.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainEncryptAtRestArgs.builder
      builder.encryptAtRest(args(argsBuilder).build)

    /**
     * @param identityCenterOptions Configuration block for enabling and managing IAM Identity Center integration within a domain. Detailed below.
     * @return builder
     */
    def identityCenterOptions(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainIdentityCenterOptionsArgs.Builder]):
        com.pulumi.aws.opensearch.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainIdentityCenterOptionsArgs.builder
      builder.identityCenterOptions(args(argsBuilder).build)

    /**
     * @param logPublishingOptions Configuration block for publishing slow and application logs to CloudWatch Logs. This block can be declared multiple times, for each log_type, within the same resource. Detailed below.
     * @return builder
     */
    def logPublishingOptions(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainLogPublishingOptionArgs.Builder]*):
        com.pulumi.aws.opensearch.inputs.DomainState.Builder =
      def argsBuilder = com.pulumi.aws.opensearch.inputs.DomainLogPublishingOptionArgs.builder
      builder.logPublishingOptions(args.map(_(argsBuilder).build)*)

    /**
     * @param nodeToNodeEncryption Configuration block for node-to-node encryption options. Detailed below.
     * @return builder
     */
    def nodeToNodeEncryption(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainNodeToNodeEncryptionArgs.Builder]):
        com.pulumi.aws.opensearch.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainNodeToNodeEncryptionArgs.builder
      builder.nodeToNodeEncryption(args(argsBuilder).build)

    /**
     * @param offPeakWindowOptions Configuration to add Off Peak update options. ([documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/off-peak.html)). Detailed below.
     * @return builder
     */
    def offPeakWindowOptions(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainOffPeakWindowOptionsArgs.Builder]):
        com.pulumi.aws.opensearch.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainOffPeakWindowOptionsArgs.builder
      builder.offPeakWindowOptions(args(argsBuilder).build)

    /**
     * @param snapshotOptions Configuration block for snapshot related options. Detailed below. DEPRECATED. For domains running OpenSearch 5.3 and later, Amazon OpenSearch takes hourly automated snapshots, making this setting irrelevant. For domains running earlier versions, OpenSearch takes daily automated snapshots.
     * @return builder
     */
    def snapshotOptions(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainSnapshotOptionsArgs.Builder]):
        com.pulumi.aws.opensearch.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainSnapshotOptionsArgs.builder
      builder.snapshotOptions(args(argsBuilder).build)

    /**
     * @param softwareUpdateOptions Software update options for the domain. Detailed below.
     * @return builder
     */
    def softwareUpdateOptions(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainSoftwareUpdateOptionsArgs.Builder]):
        com.pulumi.aws.opensearch.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainSoftwareUpdateOptionsArgs.builder
      builder.softwareUpdateOptions(args(argsBuilder).build)

    /**
     * @param vpcOptions Configuration block for VPC related options. Adding or removing this configuration forces a new resource ([documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html)). Detailed below.
     * @return builder
     */
    def vpcOptions(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainVpcOptionsArgs.Builder]):
        com.pulumi.aws.opensearch.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainVpcOptionsArgs.builder
      builder.vpcOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.opensearch.inputs.ServerlessSecurityConfigState.Builder)
    /**
     * @param samlOptions Configuration block for SAML options.
     * @return builder
     */
    def samlOptions(args: Endofunction[com.pulumi.aws.opensearch.inputs.ServerlessSecurityConfigSamlOptionsArgs.Builder]):
        com.pulumi.aws.opensearch.inputs.ServerlessSecurityConfigState.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.ServerlessSecurityConfigSamlOptionsArgs.builder
      builder.samlOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.opensearch.inputs.DomainAimlOptionsArgs.Builder)
    /**
     * @param naturalLanguageQueryGenerationOptions Configuration block for parameters required for natural language query generation on the specified domain.
     * @return builder
     */
    def naturalLanguageQueryGenerationOptions(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainAimlOptionsNaturalLanguageQueryGenerationOptionsArgs.Builder]):
        com.pulumi.aws.opensearch.inputs.DomainAimlOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainAimlOptionsNaturalLanguageQueryGenerationOptionsArgs.builder
      builder.naturalLanguageQueryGenerationOptions(args(argsBuilder).build)

    /**
     * @param s3VectorsEngine Configuration block for parameters required to enable S3 vectors engine features on the specified domain.
     * @return builder
     */
    def s3VectorsEngine(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainAimlOptionsS3VectorsEngineArgs.Builder]):
        com.pulumi.aws.opensearch.inputs.DomainAimlOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainAimlOptionsS3VectorsEngineArgs.builder
      builder.s3VectorsEngine(args(argsBuilder).build)

    /**
     * @param serverlessVectorAcceleration Configuration block for parameters required to enable GPU-accelerated vector search on the specified domain.
     * @return builder
     */
    def serverlessVectorAcceleration(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainAimlOptionsServerlessVectorAccelerationArgs.Builder]):
        com.pulumi.aws.opensearch.inputs.DomainAimlOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainAimlOptionsServerlessVectorAccelerationArgs.builder
      builder.serverlessVectorAcceleration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.opensearch.inputs.DomainOffPeakWindowOptionsOffPeakWindowArgs.Builder)
    /**
     * @param windowStartTime 10h window for updates
     * @return builder
     */
    def windowStartTime(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainOffPeakWindowOptionsOffPeakWindowWindowStartTimeArgs.Builder]):
        com.pulumi.aws.opensearch.inputs.DomainOffPeakWindowOptionsOffPeakWindowArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainOffPeakWindowOptionsOffPeakWindowWindowStartTimeArgs.builder
      builder.windowStartTime(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.opensearch.inputs.VpcEndpointState.Builder)
    /**
     * @param vpcOptions Options to specify the subnets and security groups for the endpoint.
     * @return builder
     */
    def vpcOptions(args: Endofunction[com.pulumi.aws.opensearch.inputs.VpcEndpointVpcOptionsArgs.Builder]):
        com.pulumi.aws.opensearch.inputs.VpcEndpointState.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.VpcEndpointVpcOptionsArgs.builder
      builder.vpcOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.opensearch.inputs.DomainSamlOptionsSamlOptionsArgs.Builder)
    /**
     * @param idp Information from your identity provider.
     * @return builder
     */
    def idp(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainSamlOptionsSamlOptionsIdpArgs.Builder]):
        com.pulumi.aws.opensearch.inputs.DomainSamlOptionsSamlOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainSamlOptionsSamlOptionsIdpArgs.builder
      builder.idp(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.opensearch.inputs.OutboundConnectionConnectionPropertiesArgs.Builder)
    /**
     * @param crossClusterSearch Configuration block for cross cluster search.
     * @return builder
     */
    def crossClusterSearch(args: Endofunction[com.pulumi.aws.opensearch.inputs.OutboundConnectionConnectionPropertiesCrossClusterSearchArgs.Builder]):
        com.pulumi.aws.opensearch.inputs.OutboundConnectionConnectionPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.OutboundConnectionConnectionPropertiesCrossClusterSearchArgs.builder
      builder.crossClusterSearch(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.opensearch.inputs.ServerlessCollectionState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.opensearch.inputs.ServerlessCollectionTimeoutsArgs.Builder]):
        com.pulumi.aws.opensearch.inputs.ServerlessCollectionState.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.ServerlessCollectionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.opensearch.inputs.DomainOffPeakWindowOptionsArgs.Builder)
    def offPeakWindow(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainOffPeakWindowOptionsOffPeakWindowArgs.Builder]):
        com.pulumi.aws.opensearch.inputs.DomainOffPeakWindowOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainOffPeakWindowOptionsOffPeakWindowArgs.builder
      builder.offPeakWindow(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.opensearch.inputs.DomainAutoTuneOptionsMaintenanceScheduleArgs.Builder)
    /**
     * @param duration Configuration block for the duration of the Auto-Tune maintenance window. Detailed below.
     * @return builder
     */
    def duration(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainAutoTuneOptionsMaintenanceScheduleDurationArgs.Builder]):
        com.pulumi.aws.opensearch.inputs.DomainAutoTuneOptionsMaintenanceScheduleArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainAutoTuneOptionsMaintenanceScheduleDurationArgs.builder
      builder.duration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.opensearch.inputs.ApplicationState.Builder)
    /**
     * @param appConfigs Configuration block(s) for OpenSearch application settings. See App Config below.
     * @return builder
     */
    def appConfigs(args: Endofunction[com.pulumi.aws.opensearch.inputs.ApplicationAppConfigArgs.Builder]*):
        com.pulumi.aws.opensearch.inputs.ApplicationState.Builder =
      def argsBuilder = com.pulumi.aws.opensearch.inputs.ApplicationAppConfigArgs.builder
      builder.appConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param dataSources Configuration block(s) for data sources to link to the OpenSearch application. See Data Source below.
     * @return builder
     */
    def dataSources(args: Endofunction[com.pulumi.aws.opensearch.inputs.ApplicationDataSourceArgs.Builder]*):
        com.pulumi.aws.opensearch.inputs.ApplicationState.Builder =
      def argsBuilder = com.pulumi.aws.opensearch.inputs.ApplicationDataSourceArgs.builder
      builder.dataSources(args.map(_(argsBuilder).build)*)

    /**
     * @param iamIdentityCenterOptions Configuration block for integrating AWS IAM Identity Center with the OpenSearch application. See IAM Identity Center Options below.
     * @return builder
     */
    def iamIdentityCenterOptions(args: Endofunction[com.pulumi.aws.opensearch.inputs.ApplicationIamIdentityCenterOptionsArgs.Builder]):
        com.pulumi.aws.opensearch.inputs.ApplicationState.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.ApplicationIamIdentityCenterOptionsArgs.builder
      builder.iamIdentityCenterOptions(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.opensearch.inputs.ApplicationTimeoutsArgs.Builder]):
        com.pulumi.aws.opensearch.inputs.ApplicationState.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.ApplicationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.opensearch.inputs.DomainClusterConfigNodeOptionArgs.Builder)
    /**
     * @param nodeConfig Container to specify sizing of a node type.
     * @return builder
     */
    def nodeConfig(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainClusterConfigNodeOptionNodeConfigArgs.Builder]):
        com.pulumi.aws.opensearch.inputs.DomainClusterConfigNodeOptionArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainClusterConfigNodeOptionNodeConfigArgs.builder
      builder.nodeConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.opensearch.inputs.ServerlessVpcEndpointState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.opensearch.inputs.ServerlessVpcEndpointTimeoutsArgs.Builder]):
        com.pulumi.aws.opensearch.inputs.ServerlessVpcEndpointState.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.ServerlessVpcEndpointTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.opensearch.inputs.DomainClusterConfigArgs.Builder)
    /**
     * @param coldStorageOptions Configuration block containing cold storage configuration. Detailed below.
     * @return builder
     */
    def coldStorageOptions(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainClusterConfigColdStorageOptionsArgs.Builder]):
        com.pulumi.aws.opensearch.inputs.DomainClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainClusterConfigColdStorageOptionsArgs.builder
      builder.coldStorageOptions(args(argsBuilder).build)

    /**
     * @param nodeOptions List of node options for the domain.
     * @return builder
     */
    def nodeOptions(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainClusterConfigNodeOptionArgs.Builder]*):
        com.pulumi.aws.opensearch.inputs.DomainClusterConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.opensearch.inputs.DomainClusterConfigNodeOptionArgs.builder
      builder.nodeOptions(args.map(_(argsBuilder).build)*)

    /**
     * @param zoneAwarenessConfig Configuration block containing zone awareness settings. Detailed below.
     * @return builder
     */
    def zoneAwarenessConfig(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainClusterConfigZoneAwarenessConfigArgs.Builder]):
        com.pulumi.aws.opensearch.inputs.DomainClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainClusterConfigZoneAwarenessConfigArgs.builder
      builder.zoneAwarenessConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.opensearch.inputs.GetServerlessSecurityConfigArgs.Builder)
    /**
     * @param samlOptions SAML options for the security configuration.
     * @return builder
     */
    def samlOptions(args: Endofunction[com.pulumi.aws.opensearch.inputs.GetServerlessSecurityConfigSamlOptionArgs.Builder]*):
        com.pulumi.aws.opensearch.inputs.GetServerlessSecurityConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.opensearch.inputs.GetServerlessSecurityConfigSamlOptionArgs.builder
      builder.samlOptions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.opensearch.inputs.PackageState.Builder)
    /**
     * @param packageSource Configuration block for the package source options.
     * @return builder
     */
    def packageSource(args: Endofunction[com.pulumi.aws.opensearch.inputs.PackagePackageSourceArgs.Builder]):
        com.pulumi.aws.opensearch.inputs.PackageState.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.PackagePackageSourceArgs.builder
      builder.packageSource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.opensearch.inputs.AuthorizeVpcEndpointAccessState.Builder)
    /**
     * @param authorizedPrincipals Information about the Amazon Web Services account or service that was provided access to the domain. See authorized principal attribute for further details.
     * @return builder
     */
    def authorizedPrincipals(args: Endofunction[com.pulumi.aws.opensearch.inputs.AuthorizeVpcEndpointAccessAuthorizedPrincipalArgs.Builder]*):
        com.pulumi.aws.opensearch.inputs.AuthorizeVpcEndpointAccessState.Builder =
      def argsBuilder = com.pulumi.aws.opensearch.inputs.AuthorizeVpcEndpointAccessAuthorizedPrincipalArgs.builder
      builder.authorizedPrincipals(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.opensearch.inputs.DomainSamlOptionsState.Builder)
    /**
     * @param samlOptions SAML authentication options for an AWS OpenSearch Domain.
     * @return builder
     */
    def samlOptions(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainSamlOptionsSamlOptionsArgs.Builder]):
        com.pulumi.aws.opensearch.inputs.DomainSamlOptionsState.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainSamlOptionsSamlOptionsArgs.builder
      builder.samlOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.opensearch.inputs.DomainAutoTuneOptionsArgs.Builder)
    /**
     * @param maintenanceSchedules Configuration block for Auto-Tune maintenance windows. Can be specified multiple times for each maintenance window. Detailed below.
     *  
     *  **NOTE:** Maintenance windows are deprecated and have been replaced with [off-peak windows](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/off-peak.html). Consequently, `maintenanceSchedule` configuration blocks cannot be specified when `useOffPeakWindow` is set to `true`.
     * @return builder
     */
    def maintenanceSchedules(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainAutoTuneOptionsMaintenanceScheduleArgs.Builder]*):
        com.pulumi.aws.opensearch.inputs.DomainAutoTuneOptionsArgs.Builder =
      def argsBuilder = com.pulumi.aws.opensearch.inputs.DomainAutoTuneOptionsMaintenanceScheduleArgs.builder
      builder.maintenanceSchedules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.opensearch.inputs.DomainAdvancedSecurityOptionsArgs.Builder)
    /**
     * @param masterUserOptions Configuration block for the main user. Detailed below.
     * @return builder
     */
    def masterUserOptions(args: Endofunction[com.pulumi.aws.opensearch.inputs.DomainAdvancedSecurityOptionsMasterUserOptionsArgs.Builder]):
        com.pulumi.aws.opensearch.inputs.DomainAdvancedSecurityOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.DomainAdvancedSecurityOptionsMasterUserOptionsArgs.builder
      builder.masterUserOptions(args(argsBuilder).build)

  /**
   * Manages an Amazon OpenSearch Domain.
   *  
   *  ## Elasticsearch vs. OpenSearch
   *  
   *  Amazon OpenSearch Service is the successor to Amazon Elasticsearch Service and supports OpenSearch and legacy Elasticsearch OSS (up to 7.10, the final open source version of the software).
   *  
   *  OpenSearch Domain configurations are similar in many ways to Elasticsearch Domain configurations. However, there are important differences including these:
   *  
   *  * OpenSearch has `engineVersion` while Elasticsearch has `elasticsearchVersion`
   *  * Versions are specified differently - _e.g._, `Elasticsearch_7.10` with OpenSearch vs. `7.10` for Elasticsearch.
   *  * `instanceType` argument values end in `search` for OpenSearch vs. `elasticsearch` for Elasticsearch (_e.g._, `t2.micro.search` vs. `t2.micro.elasticsearch`).
   *  * The AWS-managed service-linked role for OpenSearch is called `AWSServiceRoleForAmazonOpenSearchService` instead of `AWSServiceRoleForAmazonElasticsearchService` for Elasticsearch.
   *  
   *  There are also some potentially unexpected similarities in configurations:
   *  
   *  * ARNs for both are prefaced with `arn:aws:es:`.
   *  * Both OpenSearch and Elasticsearch use assume role policies that refer to the `Principal` `Service` as `es.amazonaws.com`.
   *  * IAM policy actions, such as those you will find in `accessPolicies`, are prefaced with `es:` for both.
   */
  def Domain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.opensearch.DomainArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.opensearch.DomainArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.opensearch.Domain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
