package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object elasticcloud:
  object ElasticcloudFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Elasticsearch resource. */
    inline def getElasticsearch(args: Endofunction[com.pulumi.azure.elasticcloud.inputs.GetElasticsearchArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.elasticcloud.outputs.GetElasticsearchResult] =
      val argsBuilder = com.pulumi.azure.elasticcloud.inputs.GetElasticsearchArgs.builder
      com.pulumi.azure.elasticcloud.ElasticcloudFunctions.getElasticsearch(args(argsBuilder).build)

    /** Use this data source to access information about an existing Elasticsearch resource. */
    inline def getElasticsearchPlain(args: Endofunction[com.pulumi.azure.elasticcloud.inputs.GetElasticsearchPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.elasticcloud.outputs.GetElasticsearchResult] =
      val argsBuilder = com.pulumi.azure.elasticcloud.inputs.GetElasticsearchPlainArgs.builder
      com.pulumi.azure.elasticcloud.ElasticcloudFunctions.getElasticsearchPlain(args(argsBuilder).build)

  /** Manages an Elasticsearch in Elastic Cloud. */
  def Elasticsearch(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.elasticcloud.ElasticsearchArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
