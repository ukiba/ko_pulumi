package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object elasticcloud:
  type ElasticcloudFunctions = com.pulumi.azure.elasticcloud.ElasticcloudFunctions
  object ElasticcloudFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.elasticcloud.ElasticcloudFunctions.*
  extension (self: ElasticcloudFunctions.type)
    /** Use this data source to access information about an existing Elasticsearch resource. */
    def getElasticsearch(args: Endofunction[com.pulumi.azure.elasticcloud.inputs.GetElasticsearchArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.elasticcloud.outputs.GetElasticsearchResult] =
      val argsBuilder = com.pulumi.azure.elasticcloud.inputs.GetElasticsearchArgs.builder
      com.pulumi.azure.elasticcloud.ElasticcloudFunctions.getElasticsearch(args(argsBuilder).build)

    /** Use this data source to access information about an existing Elasticsearch resource. */
    def getElasticsearchPlain(args: Endofunction[com.pulumi.azure.elasticcloud.inputs.GetElasticsearchPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.elasticcloud.outputs.GetElasticsearchResult] =
      val argsBuilder = com.pulumi.azure.elasticcloud.inputs.GetElasticsearchPlainArgs.builder
      com.pulumi.azure.elasticcloud.ElasticcloudFunctions.getElasticsearchPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.elasticcloud.ElasticsearchArgs.Builder)
    /**
     * @param logs A `logs` block as defined below.
     * @return builder
     */
    def logs(args: Endofunction[com.pulumi.azure.elasticcloud.inputs.ElasticsearchLogsArgs.Builder]):
        com.pulumi.azure.elasticcloud.ElasticsearchArgs.Builder =
      val argsBuilder = com.pulumi.azure.elasticcloud.inputs.ElasticsearchLogsArgs.builder
      builder.logs(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.elasticcloud.ElasticsearchArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages an Elasticsearch in Elastic Cloud. */
  def Elasticsearch(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.elasticcloud.ElasticsearchArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.elasticcloud.ElasticsearchArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.elasticcloud.Elasticsearch(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.elasticcloud.inputs.GetElasticsearchLogArgs.Builder)
    /**
     * @param filteringTags A list of `filteringTag` blocks as defined above.
     * @return builder
     */
    def filteringTags(args: Endofunction[com.pulumi.azure.elasticcloud.inputs.GetElasticsearchLogFilteringTagArgs.Builder]*):
        com.pulumi.azure.elasticcloud.inputs.GetElasticsearchLogArgs.Builder =
      def argsBuilder = com.pulumi.azure.elasticcloud.inputs.GetElasticsearchLogFilteringTagArgs.builder
      builder.filteringTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.elasticcloud.inputs.GetElasticsearchArgs.Builder)
    /**
     * @param logs A `logs` block as defined below.
     * @return builder
     */
    def logs(args: Endofunction[com.pulumi.azure.elasticcloud.inputs.GetElasticsearchLogArgs.Builder]*):
        com.pulumi.azure.elasticcloud.inputs.GetElasticsearchArgs.Builder =
      def argsBuilder = com.pulumi.azure.elasticcloud.inputs.GetElasticsearchLogArgs.builder
      builder.logs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.elasticcloud.inputs.ElasticsearchLogsArgs.Builder)
    /**
     * @param filteringTags A list of `filteringTag` blocks as defined above.
     * @return builder
     */
    def filteringTags(args: Endofunction[com.pulumi.azure.elasticcloud.inputs.ElasticsearchLogsFilteringTagArgs.Builder]*):
        com.pulumi.azure.elasticcloud.inputs.ElasticsearchLogsArgs.Builder =
      def argsBuilder = com.pulumi.azure.elasticcloud.inputs.ElasticsearchLogsFilteringTagArgs.builder
      builder.filteringTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.elasticcloud.inputs.ElasticsearchState.Builder)
    /**
     * @param logs A `logs` block as defined below.
     * @return builder
     */
    def logs(args: Endofunction[com.pulumi.azure.elasticcloud.inputs.ElasticsearchLogsArgs.Builder]):
        com.pulumi.azure.elasticcloud.inputs.ElasticsearchState.Builder =
      val argsBuilder = com.pulumi.azure.elasticcloud.inputs.ElasticsearchLogsArgs.builder
      builder.logs(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.elasticcloud.inputs.ElasticsearchState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
