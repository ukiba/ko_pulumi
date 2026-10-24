package jp.ukiba.ko_pulumi
package gcp

object gemini_ext:
  extension (builder: com.pulumi.gcp.gemini.CodeToolsSettingArgs.Builder)
    /**
     * @param enabledTools Represents the full set of enabled tools.
     * Structure is documented below.
     * @return builder
     */
    inline def enabledTools(args: Endofunction[com.pulumi.gcp.gemini.inputs.CodeToolsSettingEnabledToolArgs.Builder]*):
        com.pulumi.gcp.gemini.CodeToolsSettingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gemini.inputs.CodeToolsSettingEnabledToolArgs.builder
      builder.enabledTools(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gemini.DataAnalyticsDataAgentArgs.Builder)
    /**
     * @param dataAnalyticsAgent Data analytics agent configuration.
     * Structure is documented below.
     * @return builder
     */
    inline def dataAnalyticsAgent(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentArgs.Builder]):
        com.pulumi.gcp.gemini.DataAnalyticsDataAgentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentArgs.builder
      builder.dataAnalyticsAgent(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.gemini.DataAnalyticsDataAgentIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.GdaObservabilitySettingArgs.Builder)
    /**
     * @param conversationalAnalyticsSetting Message describing Setting for Conversational Analytics.
     * Structure is documented below.
     * @return builder
     */
    inline def conversationalAnalyticsSetting(args: Endofunction[com.pulumi.gcp.gemini.inputs.GdaObservabilitySettingConversationalAnalyticsSettingArgs.Builder]):
        com.pulumi.gcp.gemini.GdaObservabilitySettingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.GdaObservabilitySettingConversationalAnalyticsSettingArgs.builder
      builder.conversationalAnalyticsSetting(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.GibqObservabilitySettingArgs.Builder)
    /**
     * @param conversationalAnalyticsSetting Settings for Conversational Analytics, which can be used to enable observability features.
     * Structure is documented below.
     * @return builder
     */
    inline def conversationalAnalyticsSetting(args: Endofunction[com.pulumi.gcp.gemini.inputs.GibqObservabilitySettingConversationalAnalyticsSettingArgs.Builder]):
        com.pulumi.gcp.gemini.GibqObservabilitySettingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.GibqObservabilitySettingConversationalAnalyticsSettingArgs.builder
      builder.conversationalAnalyticsSetting(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.RepositoryGroupArgs.Builder)
    /**
     * @param repositories Required. List of repositories to group.
     * Structure is documented below.
     * @return builder
     */
    inline def repositories(args: Endofunction[com.pulumi.gcp.gemini.inputs.RepositoryGroupRepositoryArgs.Builder]*):
        com.pulumi.gcp.gemini.RepositoryGroupArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gemini.inputs.RepositoryGroupRepositoryArgs.builder
      builder.repositories(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gemini.RepositoryGroupIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.gemini.inputs.RepositoryGroupIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.gemini.RepositoryGroupIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.RepositoryGroupIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.RepositoryGroupIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.gemini.inputs.RepositoryGroupIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.gemini.RepositoryGroupIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.RepositoryGroupIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.CodeToolsSettingEnabledToolArgs.Builder)
    /**
     * @param configs Configuration parameters for the tool.
     * Structure is documented below.
     * @return builder
     */
    inline def configs(args: Endofunction[com.pulumi.gcp.gemini.inputs.CodeToolsSettingEnabledToolConfigArgs.Builder]*):
        com.pulumi.gcp.gemini.inputs.CodeToolsSettingEnabledToolArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gemini.inputs.CodeToolsSettingEnabledToolConfigArgs.builder
      builder.configs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gemini.inputs.CodeToolsSettingState.Builder)
    /**
     * @param enabledTools Represents the full set of enabled tools.
     * Structure is documented below.
     * @return builder
     */
    inline def enabledTools(args: Endofunction[com.pulumi.gcp.gemini.inputs.CodeToolsSettingEnabledToolArgs.Builder]*):
        com.pulumi.gcp.gemini.inputs.CodeToolsSettingState.Builder =
      def argsBuilder = com.pulumi.gcp.gemini.inputs.CodeToolsSettingEnabledToolArgs.builder
      builder.enabledTools(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentArgs.Builder)
    /**
     * @param lastPublishedContexts (Output)
     * Output only. The last published context for the agent.
     * Structure is documented below.
     * @return builder
     */
    inline def lastPublishedContexts(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentLastPublishedContextArgs.Builder]*):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentLastPublishedContextArgs.builder
      builder.lastPublishedContexts(args.map(_(argsBuilder).build)*)

    /**
     * @param publishedContext Optional. The published context for the agent. This context is used by
     * the Chat API in production.
     * Structure is documented below.
     * @return builder
     */
    inline def publishedContext(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextArgs.builder
      builder.publishedContext(args(argsBuilder).build)

    /**
     * @param stagingContext Optional. The staging context for the agent. This context is used to
     * test and validate changes before publishing.
     * Structure is documented below.
     * @return builder
     */
    inline def stagingContext(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextArgs.builder
      builder.stagingContext(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentLastPublishedContextArgs.Builder)
    /**
     * @param datasourceReferences Output only. Data sources that are available for answering questions.
     * @return builder
     */
    inline def datasourceReferences(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentLastPublishedContextDatasourceReferencesArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentLastPublishedContextArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentLastPublishedContextDatasourceReferencesArgs.builder
      builder.datasourceReferences(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentLastPublishedContextDatasourceReferencesArgs.Builder)
    /**
     * @param bq References to BigQuery tables.
     * Structure is documented below.
     * @return builder
     */
    inline def bq(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentLastPublishedContextDatasourceReferencesBqArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentLastPublishedContextDatasourceReferencesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentLastPublishedContextDatasourceReferencesBqArgs.builder
      builder.bq(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentLastPublishedContextDatasourceReferencesBqArgs.Builder)
    /**
     * @param tableReferences References to BigQuery tables.
     * Structure is documented below.
     * @return builder
     */
    inline def tableReferences(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentLastPublishedContextDatasourceReferencesBqTableReferenceArgs.Builder]*):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentLastPublishedContextDatasourceReferencesBqArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentLastPublishedContextDatasourceReferencesBqTableReferenceArgs.builder
      builder.tableReferences(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextArgs.Builder)
    /**
     * @param datasourceReferences Required. Data sources that are available for answering questions.
     * This Terraform resource currently supports BigQuery table references.
     * Structure is documented below.
     * @return builder
     */
    inline def datasourceReferences(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextDatasourceReferencesArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextDatasourceReferencesArgs.builder
      builder.datasourceReferences(args(argsBuilder).build)

    /**
     * @param exampleQueries Optional. A list of example queries for BigQuery data sources.
     * Structure is documented below.
     * @return builder
     */
    inline def exampleQueries(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextExampleQueryArgs.Builder]*):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextExampleQueryArgs.builder
      builder.exampleQueries(args.map(_(argsBuilder).build)*)

    /**
     * @param glossaryTerms Optional. Term definitions for the agent&#39;s domain.
     * Structure is documented below.
     * @return builder
     */
    inline def glossaryTerms(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextGlossaryTermArgs.Builder]*):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextGlossaryTermArgs.builder
      builder.glossaryTerms(args.map(_(argsBuilder).build)*)

    /**
     * @param options Optional. Additional options for the conversation.
     * Structure is documented below.
     * @return builder
     */
    inline def options(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextOptionsArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextOptionsArgs.builder
      builder.options(args(argsBuilder).build)

    /**
     * @param schemaRelationships Optional. Relationships between table schemas, including referencing
     * and referenced columns.
     * Structure is documented below.
     * @return builder
     */
    inline def schemaRelationships(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextSchemaRelationshipArgs.Builder]*):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextSchemaRelationshipArgs.builder
      builder.schemaRelationships(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextDatasourceReferencesArgs.Builder)
    /**
     * @param bq References to BigQuery tables.
     * Structure is documented below.
     * @return builder
     */
    inline def bq(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextDatasourceReferencesBqArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextDatasourceReferencesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextDatasourceReferencesBqArgs.builder
      builder.bq(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextDatasourceReferencesBqArgs.Builder)
    /**
     * @param tableReferences References to BigQuery tables.
     * Structure is documented below.
     * @return builder
     */
    inline def tableReferences(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextDatasourceReferencesBqTableReferenceArgs.Builder]*):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextDatasourceReferencesBqArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextDatasourceReferencesBqTableReferenceArgs.builder
      builder.tableReferences(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextOptionsAnalysisArgs.Builder)
    /**
     * @param python Optional. Options for Python analysis.
     * Structure is documented below.
     * @return builder
     */
    inline def python(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextOptionsAnalysisPythonArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextOptionsAnalysisArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextOptionsAnalysisPythonArgs.builder
      builder.python(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextOptionsArgs.Builder)
    /**
     * @param analysis Optional. Options for analysis.
     * Structure is documented below.
     * @return builder
     */
    inline def analysis(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextOptionsAnalysisArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextOptionsAnalysisArgs.builder
      builder.analysis(args(argsBuilder).build)

    /**
     * @param datasource Optional. Options for datasource configuration.
     * Structure is documented below.
     * @return builder
     */
    inline def datasource(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextOptionsDatasourceArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextOptionsDatasourceArgs.builder
      builder.datasource(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextSchemaRelationshipArgs.Builder)
    /**
     * @param leftSchemaPaths Required. An ordered list of fields for the left side of the join.
     * Structure is documented below.
     * @return builder
     */
    inline def leftSchemaPaths(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextSchemaRelationshipLeftSchemaPathsArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextSchemaRelationshipArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextSchemaRelationshipLeftSchemaPathsArgs.builder
      builder.leftSchemaPaths(args(argsBuilder).build)

    /**
     * @param rightSchemaPaths Required. An ordered list of fields for the right side of the join.
     * Structure is documented below.
     * @return builder
     */
    inline def rightSchemaPaths(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextSchemaRelationshipRightSchemaPathsArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextSchemaRelationshipArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentPublishedContextSchemaRelationshipRightSchemaPathsArgs.builder
      builder.rightSchemaPaths(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextArgs.Builder)
    /**
     * @param datasourceReferences Required. Data sources that are available for answering questions.
     * This Terraform resource currently supports BigQuery table references.
     * Structure is documented below.
     * @return builder
     */
    inline def datasourceReferences(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextDatasourceReferencesArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextDatasourceReferencesArgs.builder
      builder.datasourceReferences(args(argsBuilder).build)

    /**
     * @param exampleQueries Optional. A list of example queries for BigQuery data sources.
     * Structure is documented below.
     * @return builder
     */
    inline def exampleQueries(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextExampleQueryArgs.Builder]*):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextExampleQueryArgs.builder
      builder.exampleQueries(args.map(_(argsBuilder).build)*)

    /**
     * @param glossaryTerms Optional. Term definitions for the agent&#39;s domain.
     * Structure is documented below.
     * @return builder
     */
    inline def glossaryTerms(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextGlossaryTermArgs.Builder]*):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextGlossaryTermArgs.builder
      builder.glossaryTerms(args.map(_(argsBuilder).build)*)

    /**
     * @param options Optional. Additional options for the conversation.
     * Structure is documented below.
     * @return builder
     */
    inline def options(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextOptionsArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextOptionsArgs.builder
      builder.options(args(argsBuilder).build)

    /**
     * @param schemaRelationships Optional. Relationships between table schemas, including referencing
     * and referenced columns.
     * Structure is documented below.
     * @return builder
     */
    inline def schemaRelationships(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextSchemaRelationshipArgs.Builder]*):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextSchemaRelationshipArgs.builder
      builder.schemaRelationships(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextDatasourceReferencesArgs.Builder)
    /**
     * @param bq References to BigQuery tables.
     * Structure is documented below.
     * @return builder
     */
    inline def bq(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextDatasourceReferencesBqArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextDatasourceReferencesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextDatasourceReferencesBqArgs.builder
      builder.bq(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextDatasourceReferencesBqArgs.Builder)
    /**
     * @param tableReferences References to BigQuery tables.
     * Structure is documented below.
     * @return builder
     */
    inline def tableReferences(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextDatasourceReferencesBqTableReferenceArgs.Builder]*):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextDatasourceReferencesBqArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextDatasourceReferencesBqTableReferenceArgs.builder
      builder.tableReferences(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextOptionsAnalysisArgs.Builder)
    /**
     * @param python Optional. Options for Python analysis.
     * Structure is documented below.
     * @return builder
     */
    inline def python(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextOptionsAnalysisPythonArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextOptionsAnalysisArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextOptionsAnalysisPythonArgs.builder
      builder.python(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextOptionsArgs.Builder)
    /**
     * @param analysis Optional. Options for analysis.
     * Structure is documented below.
     * @return builder
     */
    inline def analysis(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextOptionsAnalysisArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextOptionsAnalysisArgs.builder
      builder.analysis(args(argsBuilder).build)

    /**
     * @param datasource Optional. Options for datasource configuration.
     * Structure is documented below.
     * @return builder
     */
    inline def datasource(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextOptionsDatasourceArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextOptionsDatasourceArgs.builder
      builder.datasource(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextSchemaRelationshipArgs.Builder)
    /**
     * @param leftSchemaPaths Required. An ordered list of fields for the left side of the join.
     * Structure is documented below.
     * @return builder
     */
    inline def leftSchemaPaths(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextSchemaRelationshipLeftSchemaPathsArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextSchemaRelationshipArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextSchemaRelationshipLeftSchemaPathsArgs.builder
      builder.leftSchemaPaths(args(argsBuilder).build)

    /**
     * @param rightSchemaPaths Required. An ordered list of fields for the right side of the join.
     * Structure is documented below.
     * @return builder
     */
    inline def rightSchemaPaths(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextSchemaRelationshipRightSchemaPathsArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextSchemaRelationshipArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentStagingContextSchemaRelationshipRightSchemaPathsArgs.builder
      builder.rightSchemaPaths(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentState.Builder)
    /**
     * @param dataAnalyticsAgent Data analytics agent configuration.
     * Structure is documented below.
     * @return builder
     */
    inline def dataAnalyticsAgent(args: Endofunction[com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentState.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.DataAnalyticsDataAgentDataAnalyticsAgentArgs.builder
      builder.dataAnalyticsAgent(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.GdaObservabilitySettingState.Builder)
    /**
     * @param conversationalAnalyticsSetting Message describing Setting for Conversational Analytics.
     * Structure is documented below.
     * @return builder
     */
    inline def conversationalAnalyticsSetting(args: Endofunction[com.pulumi.gcp.gemini.inputs.GdaObservabilitySettingConversationalAnalyticsSettingArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.GdaObservabilitySettingState.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.GdaObservabilitySettingConversationalAnalyticsSettingArgs.builder
      builder.conversationalAnalyticsSetting(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.GibqObservabilitySettingState.Builder)
    /**
     * @param conversationalAnalyticsSetting Settings for Conversational Analytics, which can be used to enable observability features.
     * Structure is documented below.
     * @return builder
     */
    inline def conversationalAnalyticsSetting(args: Endofunction[com.pulumi.gcp.gemini.inputs.GibqObservabilitySettingConversationalAnalyticsSettingArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.GibqObservabilitySettingState.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.GibqObservabilitySettingConversationalAnalyticsSettingArgs.builder
      builder.conversationalAnalyticsSetting(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.RepositoryGroupIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.gemini.inputs.RepositoryGroupIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.RepositoryGroupIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.RepositoryGroupIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.RepositoryGroupIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.gemini.inputs.RepositoryGroupIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.gemini.inputs.RepositoryGroupIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.gemini.inputs.RepositoryGroupIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gemini.inputs.RepositoryGroupState.Builder)
    /**
     * @param repositories Required. List of repositories to group.
     * Structure is documented below.
     * @return builder
     */
    inline def repositories(args: Endofunction[com.pulumi.gcp.gemini.inputs.RepositoryGroupRepositoryArgs.Builder]*):
        com.pulumi.gcp.gemini.inputs.RepositoryGroupState.Builder =
      def argsBuilder = com.pulumi.gcp.gemini.inputs.RepositoryGroupRepositoryArgs.builder
      builder.repositories(args.map(_(argsBuilder).build)*)
