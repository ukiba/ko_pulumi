package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object opensearch:
  /** Provides an AWS OpenSearch Application resource. OpenSearch Applications provide a user interface for interacting with OpenSearch data and managing OpenSearch resources. */
  inline def Application(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.opensearch.ApplicationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.opensearch.ApplicationArgs.builder
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
    com.pulumi.aws.opensearch.Application(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS OpenSearch Authorize VPC Endpoint Access. */
  inline def AuthorizeVpcEndpointAccess(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.opensearch.AuthorizeVpcEndpointAccessArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.opensearch.AuthorizeVpcEndpointAccessArgs.builder
    com.pulumi.aws.opensearch.AuthorizeVpcEndpointAccess(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an Amazon OpenSearch Domain.
   * 
   * Amazon OpenSearch Service is the successor to Amazon Elasticsearch Service and supports OpenSearch and legacy Elasticsearch OSS (up to 7.10, the final open source version of the software). Notable differences from Elasticsearch: OpenSearch uses `engineVersion` (vs `elasticsearchVersion`), versions are specified as `Elasticsearch_7.10` (vs `7.10`), `instanceType` values end in `search` (vs `elasticsearch`), and the service-linked role is `AWSServiceRoleForAmazonOpenSearchService`. Similarities: ARNs use `arn:aws:es:`, assume role policies reference `es.amazonaws.com`, and IAM policy actions are prefixed with `es:`.
   */
  inline def Domain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.opensearch.DomainArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.opensearch.DomainArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.opensearch.Domain(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Allows setting policy to an OpenSearch domain while referencing domain attributes (e.g., ARN). */
  inline def DomainPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.opensearch.DomainPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.opensearch.DomainPolicyArgs.builder
    com.pulumi.aws.opensearch.DomainPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages SAML authentication options for an AWS OpenSearch Domain. */
  inline def DomainSamlOptions(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.opensearch.DomainSamlOptionsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.opensearch.DomainSamlOptionsArgs.builder
    com.pulumi.aws.opensearch.DomainSamlOptions(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an [AWS Opensearch Inbound Connection Accepter](https://docs.aws.amazon.com/opensearch-service/latest/APIReference/API_AcceptInboundConnection.html). If connecting domains from different AWS accounts, ensure that the accepter is configured to use the AWS account where the _remote_ opensearch domain exists. */
  inline def InboundConnectionAccepter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.opensearch.InboundConnectionAccepterArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.opensearch.InboundConnectionAccepterArgs.builder
    com.pulumi.aws.opensearch.InboundConnectionAccepter(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object OpensearchFunctions:
    /** Use this data source to get information about an OpenSearch Domain */
    inline def getDomain(args: Endofunction[com.pulumi.aws.opensearch.inputs.GetDomainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.opensearch.outputs.GetDomainResult] =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.GetDomainArgs.builder
      com.pulumi.aws.opensearch.OpensearchFunctions.getDomain(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get information about an OpenSearch Domain */
    inline def getDomainPlain(args: Endofunction[com.pulumi.aws.opensearch.inputs.GetDomainPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.opensearch.outputs.GetDomainResult] =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.GetDomainPlainArgs.builder
      com.pulumi.aws.opensearch.OpensearchFunctions.getDomainPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing an AWS OpenSearch Serverless Access Policy. */
    inline def getServerlessAccessPolicy(args: Endofunction[com.pulumi.aws.opensearch.inputs.GetServerlessAccessPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.opensearch.outputs.GetServerlessAccessPolicyResult] =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.GetServerlessAccessPolicyArgs.builder
      com.pulumi.aws.opensearch.OpensearchFunctions.getServerlessAccessPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS OpenSearch Serverless Access Policy. */
    inline def getServerlessAccessPolicyPlain(args: Endofunction[com.pulumi.aws.opensearch.inputs.GetServerlessAccessPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.opensearch.outputs.GetServerlessAccessPolicyResult] =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.GetServerlessAccessPolicyPlainArgs.builder
      com.pulumi.aws.opensearch.OpensearchFunctions.getServerlessAccessPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing an AWS OpenSearch Serverless Collection. */
    inline def getServerlessCollection(args: Endofunction[com.pulumi.aws.opensearch.inputs.GetServerlessCollectionArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.opensearch.outputs.GetServerlessCollectionResult] =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.GetServerlessCollectionArgs.builder
      com.pulumi.aws.opensearch.OpensearchFunctions.getServerlessCollection(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS OpenSearch Serverless Collection. */
    inline def getServerlessCollectionPlain(args: Endofunction[com.pulumi.aws.opensearch.inputs.GetServerlessCollectionPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.opensearch.outputs.GetServerlessCollectionResult] =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.GetServerlessCollectionPlainArgs.builder
      com.pulumi.aws.opensearch.OpensearchFunctions.getServerlessCollectionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing an AWS OpenSearch Serverless Collection Group. */
    inline def getServerlessCollectionGroup(args: Endofunction[com.pulumi.aws.opensearch.inputs.GetServerlessCollectionGroupArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.opensearch.outputs.GetServerlessCollectionGroupResult] =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.GetServerlessCollectionGroupArgs.builder
      com.pulumi.aws.opensearch.OpensearchFunctions.getServerlessCollectionGroup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS OpenSearch Serverless Collection Group. */
    inline def getServerlessCollectionGroupPlain(args: Endofunction[com.pulumi.aws.opensearch.inputs.GetServerlessCollectionGroupPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.opensearch.outputs.GetServerlessCollectionGroupResult] =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.GetServerlessCollectionGroupPlainArgs.builder
      com.pulumi.aws.opensearch.OpensearchFunctions.getServerlessCollectionGroupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for listing AWS OpenSearch Serverless Collection Groups. */
    inline def getServerlessCollectionGroups(args: Endofunction[com.pulumi.aws.opensearch.inputs.GetServerlessCollectionGroupsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.opensearch.outputs.GetServerlessCollectionGroupsResult] =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.GetServerlessCollectionGroupsArgs.builder
      com.pulumi.aws.opensearch.OpensearchFunctions.getServerlessCollectionGroups(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for listing AWS OpenSearch Serverless Collection Groups. */
    inline def getServerlessCollectionGroupsPlain(args: Endofunction[com.pulumi.aws.opensearch.inputs.GetServerlessCollectionGroupsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.opensearch.outputs.GetServerlessCollectionGroupsResult] =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.GetServerlessCollectionGroupsPlainArgs.builder
      com.pulumi.aws.opensearch.OpensearchFunctions.getServerlessCollectionGroupsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing an AWS OpenSearch Serverless Lifecycle Policy. */
    inline def getServerlessLifecyclePolicy(args: Endofunction[com.pulumi.aws.opensearch.inputs.GetServerlessLifecyclePolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.opensearch.outputs.GetServerlessLifecyclePolicyResult] =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.GetServerlessLifecyclePolicyArgs.builder
      com.pulumi.aws.opensearch.OpensearchFunctions.getServerlessLifecyclePolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS OpenSearch Serverless Lifecycle Policy. */
    inline def getServerlessLifecyclePolicyPlain(args: Endofunction[com.pulumi.aws.opensearch.inputs.GetServerlessLifecyclePolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.opensearch.outputs.GetServerlessLifecyclePolicyResult] =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.GetServerlessLifecyclePolicyPlainArgs.builder
      com.pulumi.aws.opensearch.OpensearchFunctions.getServerlessLifecyclePolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing an AWS OpenSearch Serverless Security Config. */
    inline def getServerlessSecurityConfig(args: Endofunction[com.pulumi.aws.opensearch.inputs.GetServerlessSecurityConfigArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.opensearch.outputs.GetServerlessSecurityConfigResult] =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.GetServerlessSecurityConfigArgs.builder
      com.pulumi.aws.opensearch.OpensearchFunctions.getServerlessSecurityConfig(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS OpenSearch Serverless Security Config. */
    inline def getServerlessSecurityConfigPlain(args: Endofunction[com.pulumi.aws.opensearch.inputs.GetServerlessSecurityConfigPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.opensearch.outputs.GetServerlessSecurityConfigResult] =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.GetServerlessSecurityConfigPlainArgs.builder
      com.pulumi.aws.opensearch.OpensearchFunctions.getServerlessSecurityConfigPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to get information about an AWS OpenSearch Serverless Security Policy. */
    inline def getServerlessSecurityPolicy(args: Endofunction[com.pulumi.aws.opensearch.inputs.GetServerlessSecurityPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.opensearch.outputs.GetServerlessSecurityPolicyResult] =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.GetServerlessSecurityPolicyArgs.builder
      com.pulumi.aws.opensearch.OpensearchFunctions.getServerlessSecurityPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get information about an AWS OpenSearch Serverless Security Policy. */
    inline def getServerlessSecurityPolicyPlain(args: Endofunction[com.pulumi.aws.opensearch.inputs.GetServerlessSecurityPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.opensearch.outputs.GetServerlessSecurityPolicyResult] =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.GetServerlessSecurityPolicyPlainArgs.builder
      com.pulumi.aws.opensearch.OpensearchFunctions.getServerlessSecurityPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing an AWS OpenSearch Serverless VPC Endpoint. */
    inline def getServerlessVpcEndpoint(args: Endofunction[com.pulumi.aws.opensearch.inputs.GetServerlessVpcEndpointArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.opensearch.outputs.GetServerlessVpcEndpointResult] =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.GetServerlessVpcEndpointArgs.builder
      com.pulumi.aws.opensearch.OpensearchFunctions.getServerlessVpcEndpoint(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS OpenSearch Serverless VPC Endpoint. */
    inline def getServerlessVpcEndpointPlain(args: Endofunction[com.pulumi.aws.opensearch.inputs.GetServerlessVpcEndpointPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.opensearch.outputs.GetServerlessVpcEndpointResult] =
      val argsBuilder = com.pulumi.aws.opensearch.inputs.GetServerlessVpcEndpointPlainArgs.builder
      com.pulumi.aws.opensearch.OpensearchFunctions.getServerlessVpcEndpointPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages an AWS Opensearch Outbound Connection. */
  inline def OutboundConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.opensearch.OutboundConnectionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.opensearch.OutboundConnectionArgs.builder
    com.pulumi.aws.opensearch.OutboundConnection(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an AWS Opensearch Package. */
  inline def Package(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.opensearch.PackageArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.opensearch.PackageArgs.builder
    com.pulumi.aws.opensearch.Package(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an AWS Opensearch Package Association. */
  inline def PackageAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.opensearch.PackageAssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.opensearch.PackageAssociationArgs.builder
    com.pulumi.aws.opensearch.PackageAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS OpenSearch Serverless Access Policy. See AWS documentation for [data access policies](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-data-access.html) and [supported data access policy permissions](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-data-access.html#serverless-data-supported-permissions). */
  inline def ServerlessAccessPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.opensearch.ServerlessAccessPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.opensearch.ServerlessAccessPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.opensearch.ServerlessAccessPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an AWS OpenSearch Serverless Collection.
   * 
   * &gt; **NOTE:** An `aws.opensearch.ServerlessCollection` must have encryption configured either by an applicable encryption security policy or by setting `encryptionConfig` directly on the resource.
   * 
   * &gt; **NOTE:** An `aws.opensearch.ServerlessCollection` is not accessible without configuring an applicable network security policy. Data cannot be accessed without configuring an applicable data access policy.
   */
  inline def ServerlessCollection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.opensearch.ServerlessCollectionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.opensearch.ServerlessCollectionArgs.builder
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
    com.pulumi.aws.opensearch.ServerlessCollection(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Resource for managing an AWS OpenSearch Serverless Collection Group.
   * 
   * Collection groups let multiple OpenSearch Serverless collections share compute resources while keeping encryption and access controls independent.
   */
  inline def ServerlessCollectionGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.opensearch.ServerlessCollectionGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.opensearch.ServerlessCollectionGroupArgs.builder
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
    com.pulumi.aws.opensearch.ServerlessCollectionGroup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS OpenSearch Serverless Lifecycle Policy. See AWS documentation for [lifecycle policies](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-lifecycle.html). */
  inline def ServerlessLifecyclePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.opensearch.ServerlessLifecyclePolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.opensearch.ServerlessLifecyclePolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.opensearch.ServerlessLifecyclePolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS OpenSearch Serverless Security Config. */
  inline def ServerlessSecurityConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.opensearch.ServerlessSecurityConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.opensearch.ServerlessSecurityConfigArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.opensearch.ServerlessSecurityConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS OpenSearch Serverless Security Policy. See AWS documentation for [encryption policies](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-encryption.html#serverless-encryption-policies) and [network policies](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-network.html#serverless-network-policies). */
  inline def ServerlessSecurityPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.opensearch.ServerlessSecurityPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.opensearch.ServerlessSecurityPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.opensearch.ServerlessSecurityPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS OpenSearchServerless VPC Endpoint. */
  inline def ServerlessVpcEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.opensearch.ServerlessVpcEndpointArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.opensearch.ServerlessVpcEndpointArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.opensearch.ServerlessVpcEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an [AWS Opensearch VPC Endpoint](https://docs.aws.amazon.com/opensearch-service/latest/APIReference/API_CreateVpcEndpoint.html). Creates an Amazon OpenSearch Service-managed VPC endpoint. */
  inline def VpcEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.opensearch.VpcEndpointArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.opensearch.VpcEndpointArgs.builder
    com.pulumi.aws.opensearch.VpcEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
