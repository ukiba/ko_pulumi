package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object elasticsearch:
  /** Manages an AWS Elasticsearch Domain. */
  def Domain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.elasticsearch.DomainArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.elasticsearch.DomainArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.elasticsearch.Domain(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Allows setting policy to an Elasticsearch domain while referencing domain attributes (e.g., ARN) */
  def DomainPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.elasticsearch.DomainPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.elasticsearch.DomainPolicyArgs.builder
    com.pulumi.aws.elasticsearch.DomainPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages SAML authentication options for an AWS Elasticsearch Domain. */
  def DomainSamlOptions(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.elasticsearch.DomainSamlOptionsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.elasticsearch.DomainSamlOptionsArgs.builder
    com.pulumi.aws.elasticsearch.DomainSamlOptions(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object ElasticsearchFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to get information about an Elasticsearch Domain */
    inline def getDomain(args: Endofunction[com.pulumi.aws.elasticsearch.inputs.GetDomainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.elasticsearch.outputs.GetDomainResult] =
      val argsBuilder = com.pulumi.aws.elasticsearch.inputs.GetDomainArgs.builder
      com.pulumi.aws.elasticsearch.ElasticsearchFunctions.getDomain(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get information about an Elasticsearch Domain */
    inline def getDomainPlain(args: Endofunction[com.pulumi.aws.elasticsearch.inputs.GetDomainPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.elasticsearch.outputs.GetDomainResult] =
      val argsBuilder = com.pulumi.aws.elasticsearch.inputs.GetDomainPlainArgs.builder
      com.pulumi.aws.elasticsearch.ElasticsearchFunctions.getDomainPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages an [AWS Elasticsearch VPC Endpoint](https://docs.aws.amazon.com/elasticsearch-service/latest/APIReference/API_CreateVpcEndpoint.html). Creates an Amazon Elasticsearch Service-managed VPC endpoint. */
  def VpcEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.elasticsearch.VpcEndpointArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.elasticsearch.VpcEndpointArgs.builder
    com.pulumi.aws.elasticsearch.VpcEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
