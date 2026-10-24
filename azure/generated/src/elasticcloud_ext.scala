package jp.ukiba.ko_pulumi
package azure

object elasticcloud_ext:
  extension (builder: com.pulumi.azure.elasticcloud.ElasticsearchArgs.Builder)
    /**
     * @param logs A `logs` block as defined below.
     * @return builder
     */
    def logs(args: Endofunction[com.pulumi.azure.elasticcloud.inputs.ElasticsearchLogsArgs.Builder]):
        com.pulumi.azure.elasticcloud.ElasticsearchArgs.Builder =
      val argsBuilder = com.pulumi.azure.elasticcloud.inputs.ElasticsearchLogsArgs.builder
      builder.logs(args(argsBuilder).build)

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

  extension (builder: com.pulumi.azure.elasticcloud.inputs.GetElasticsearchArgs.Builder)
    /**
     * @param logs A `logs` block as defined below.
     * @return builder
     */
    def logs(args: Endofunction[com.pulumi.azure.elasticcloud.inputs.GetElasticsearchLogArgs.Builder]*):
        com.pulumi.azure.elasticcloud.inputs.GetElasticsearchArgs.Builder =
      def argsBuilder = com.pulumi.azure.elasticcloud.inputs.GetElasticsearchLogArgs.builder
      builder.logs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.elasticcloud.inputs.GetElasticsearchLog.Builder)
    /**
     * @param filteringTags A list of `filteringTag` blocks as defined above.
     * @return builder
     */
    def filteringTags(args: Endofunction[com.pulumi.azure.elasticcloud.inputs.GetElasticsearchLogFilteringTag.Builder]*):
        com.pulumi.azure.elasticcloud.inputs.GetElasticsearchLog.Builder =
      def argsBuilder = com.pulumi.azure.elasticcloud.inputs.GetElasticsearchLogFilteringTag.builder
      builder.filteringTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.elasticcloud.inputs.GetElasticsearchLogArgs.Builder)
    /**
     * @param filteringTags A list of `filteringTag` blocks as defined above.
     * @return builder
     */
    def filteringTags(args: Endofunction[com.pulumi.azure.elasticcloud.inputs.GetElasticsearchLogFilteringTagArgs.Builder]*):
        com.pulumi.azure.elasticcloud.inputs.GetElasticsearchLogArgs.Builder =
      def argsBuilder = com.pulumi.azure.elasticcloud.inputs.GetElasticsearchLogFilteringTagArgs.builder
      builder.filteringTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.elasticcloud.inputs.GetElasticsearchPlainArgs.Builder)
    /**
     * @param logs A `logs` block as defined below.
     * @return builder
     */
    def logs(args: Endofunction[com.pulumi.azure.elasticcloud.inputs.GetElasticsearchLog.Builder]*):
        com.pulumi.azure.elasticcloud.inputs.GetElasticsearchPlainArgs.Builder =
      def argsBuilder = com.pulumi.azure.elasticcloud.inputs.GetElasticsearchLog.builder
      builder.logs(args.map(_(argsBuilder).build)*)
