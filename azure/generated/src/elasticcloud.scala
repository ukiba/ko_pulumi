package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object elasticcloud:
  object ElasticcloudFunctions:
    /** Use this data source to access information about an existing Elasticsearch resource. */
    inline def getElasticsearch(args: Endofunction[com.pulumi.azure.elasticcloud.inputs.GetElasticsearchArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.elasticcloud.outputs.GetElasticsearchResult] =
      val argsBuilder = com.pulumi.azure.elasticcloud.inputs.GetElasticsearchArgs.builder
      com.pulumi.azure.elasticcloud.ElasticcloudFunctions.getElasticsearch(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Elasticsearch resource. */
    inline def getElasticsearchPlain(args: Endofunction[com.pulumi.azure.elasticcloud.inputs.GetElasticsearchPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.elasticcloud.outputs.GetElasticsearchResult] =
      val argsBuilder = com.pulumi.azure.elasticcloud.inputs.GetElasticsearchPlainArgs.builder
      com.pulumi.azure.elasticcloud.ElasticcloudFunctions.getElasticsearchPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages an Elasticsearch in Elastic Cloud. */
  def Elasticsearch(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.elasticcloud.ElasticsearchArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.elasticcloud.ElasticsearchArgs.builder
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
    com.pulumi.azure.elasticcloud.Elasticsearch(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
