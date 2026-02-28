package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object kendra:
  /** Use the `awsKendraIndexBlockList` resource to manage an AWS Kendra block list used for query suggestions for an index. */
  def QuerySuggestionsBlockList(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.kendra.QuerySuggestionsBlockListArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.kendra.QuerySuggestionsBlockListArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.kendra.QuerySuggestionsBlockList(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.kendra.DataSourceArgs.Builder)
    /**
     * @param configuration A block with the configuration information to connect to your Data Source repository. You can&#39;t specify the `configuration` block when the `type` parameter is set to `CUSTOM`. Detailed below.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.kendra.inputs.DataSourceConfigurationArgs.Builder]):
        com.pulumi.aws.kendra.DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.DataSourceConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

    /**
     * @param customDocumentEnrichmentConfiguration A block with the configuration information for altering document metadata and content during the document ingestion process. For more information on how to create, modify and delete document metadata, or make other content alterations when you ingest documents into Amazon Kendra, see [Customizing document metadata during the ingestion process](https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html). Detailed below.
     * @return builder
     */
    def customDocumentEnrichmentConfiguration(args: Endofunction[com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationArgs.Builder]):
        com.pulumi.aws.kendra.DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationArgs.builder
      builder.customDocumentEnrichmentConfiguration(args(argsBuilder).build)

  /** Provides an Amazon Kendra Index resource. */
  def Index(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.kendra.IndexArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.kendra.IndexArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.kendra.Index(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.kendra.IndexArgs.Builder)
    /**
     * @param capacityUnits A block that sets the number of additional document storage and query capacity units that should be used by the index. Detailed below.
     * @return builder
     */
    def capacityUnits(args: Endofunction[com.pulumi.aws.kendra.inputs.IndexCapacityUnitsArgs.Builder]):
        com.pulumi.aws.kendra.IndexArgs.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.IndexCapacityUnitsArgs.builder
      builder.capacityUnits(args(argsBuilder).build)

    /**
     * @param documentMetadataConfigurationUpdates One or more blocks that specify the configuration settings for any metadata applied to the documents in the index. Minimum number of 0 items. Maximum number of 500 items. If specified, you must define all elements, including those that are provided by default. These index fields are documented at [Amazon Kendra Index documentation](https://docs.aws.amazon.com/kendra/latest/dg/hiw-index.html). For an example resource that defines these default index fields, refer to the default example above. For an example resource that appends additional index fields, refer to the append example above. All arguments for each block must be specified. Note that blocks cannot be removed since index fields cannot be deleted. This argument is detailed below.
     * @return builder
     */
    def documentMetadataConfigurationUpdates(args: Endofunction[com.pulumi.aws.kendra.inputs.IndexDocumentMetadataConfigurationUpdateArgs.Builder]*):
        com.pulumi.aws.kendra.IndexArgs.Builder =
      def argsBuilder = com.pulumi.aws.kendra.inputs.IndexDocumentMetadataConfigurationUpdateArgs.builder
      builder.documentMetadataConfigurationUpdates(args.map(_(argsBuilder).build)*)

    /**
     * @param serverSideEncryptionConfiguration A block that specifies the identifier of the AWS KMS customer managed key (CMK) that&#39;s used to encrypt data indexed by Amazon Kendra. Amazon Kendra doesn&#39;t support asymmetric CMKs. Detailed below.
     * @return builder
     */
    def serverSideEncryptionConfiguration(args: Endofunction[com.pulumi.aws.kendra.inputs.IndexServerSideEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.kendra.IndexArgs.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.IndexServerSideEncryptionConfigurationArgs.builder
      builder.serverSideEncryptionConfiguration(args(argsBuilder).build)

    /**
     * @param userGroupResolutionConfiguration A block that enables fetching access levels of groups and users from an AWS Single Sign-On identity source. To configure this, see [UserGroupResolutionConfiguration](https://docs.aws.amazon.com/kendra/latest/dg/API_UserGroupResolutionConfiguration.html). Detailed below.
     * @return builder
     */
    def userGroupResolutionConfiguration(args: Endofunction[com.pulumi.aws.kendra.inputs.IndexUserGroupResolutionConfigurationArgs.Builder]):
        com.pulumi.aws.kendra.IndexArgs.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.IndexUserGroupResolutionConfigurationArgs.builder
      builder.userGroupResolutionConfiguration(args(argsBuilder).build)

    /**
     * @param userTokenConfigurations A block that specifies the user token configuration. Detailed below.
     * @return builder
     */
    def userTokenConfigurations(args: Endofunction[com.pulumi.aws.kendra.inputs.IndexUserTokenConfigurationsArgs.Builder]):
        com.pulumi.aws.kendra.IndexArgs.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.IndexUserTokenConfigurationsArgs.builder
      builder.userTokenConfigurations(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kendra.ThesaurusArgs.Builder)
    /**
     * @param sourceS3Path The S3 path where your thesaurus file sits in S3. Detailed below.
     * @return builder
     */
    def sourceS3Path(args: Endofunction[com.pulumi.aws.kendra.inputs.ThesaurusSourceS3PathArgs.Builder]):
        com.pulumi.aws.kendra.ThesaurusArgs.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.ThesaurusSourceS3PathArgs.builder
      builder.sourceS3Path(args(argsBuilder).build)

  /** Resource for managing an AWS Kendra Thesaurus. */
  def Thesaurus(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.kendra.ThesaurusArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.kendra.ThesaurusArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.kendra.Thesaurus(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.kendra.FaqArgs.Builder)
    /**
     * @param s3Path The S3 location of the FAQ input data. Detailed below.
     * @return builder
     */
    def s3Path(args: Endofunction[com.pulumi.aws.kendra.inputs.FaqS3PathArgs.Builder]):
        com.pulumi.aws.kendra.FaqArgs.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.FaqS3PathArgs.builder
      builder.s3Path(args(argsBuilder).build)

  /** Resource for managing an AWS Kendra Experience. */
  def Experience(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.kendra.ExperienceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.kendra.ExperienceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.kendra.Experience(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type KendraFunctions = com.pulumi.aws.kendra.KendraFunctions
  object KendraFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.kendra.KendraFunctions.*
  extension (self: KendraFunctions.type)
    /** Provides details about a specific Amazon Kendra Experience. */
    def getExperience(args: Endofunction[com.pulumi.aws.kendra.inputs.GetExperienceArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.kendra.outputs.GetExperienceResult] =
      val argsBuilder = com.pulumi.aws.kendra.inputs.GetExperienceArgs.builder
      com.pulumi.aws.kendra.KendraFunctions.getExperience(args(argsBuilder).build)

    /** Provides details about a specific Amazon Kendra Experience. */
    def getExperiencePlain(args: Endofunction[com.pulumi.aws.kendra.inputs.GetExperiencePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.kendra.outputs.GetExperienceResult] =
      val argsBuilder = com.pulumi.aws.kendra.inputs.GetExperiencePlainArgs.builder
      com.pulumi.aws.kendra.KendraFunctions.getExperiencePlain(args(argsBuilder).build)

    /** Provides details about a specific Amazon Kendra Faq. */
    def getFaq(args: Endofunction[com.pulumi.aws.kendra.inputs.GetFaqArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.kendra.outputs.GetFaqResult] =
      val argsBuilder = com.pulumi.aws.kendra.inputs.GetFaqArgs.builder
      com.pulumi.aws.kendra.KendraFunctions.getFaq(args(argsBuilder).build)

    /** Provides details about a specific Amazon Kendra Faq. */
    def getFaqPlain(args: Endofunction[com.pulumi.aws.kendra.inputs.GetFaqPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.kendra.outputs.GetFaqResult] =
      val argsBuilder = com.pulumi.aws.kendra.inputs.GetFaqPlainArgs.builder
      com.pulumi.aws.kendra.KendraFunctions.getFaqPlain(args(argsBuilder).build)

    /** Provides details about a specific Amazon Kendra Index. */
    def getIndex(args: Endofunction[com.pulumi.aws.kendra.inputs.GetIndexArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.kendra.outputs.GetIndexResult] =
      val argsBuilder = com.pulumi.aws.kendra.inputs.GetIndexArgs.builder
      com.pulumi.aws.kendra.KendraFunctions.getIndex(args(argsBuilder).build)

    /** Provides details about a specific Amazon Kendra Index. */
    def getIndexPlain(args: Endofunction[com.pulumi.aws.kendra.inputs.GetIndexPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.kendra.outputs.GetIndexResult] =
      val argsBuilder = com.pulumi.aws.kendra.inputs.GetIndexPlainArgs.builder
      com.pulumi.aws.kendra.KendraFunctions.getIndexPlain(args(argsBuilder).build)

    /** Provides details about a specific Amazon Kendra block list used for query suggestions for an index. */
    def getQuerySuggestionsBlockList(args: Endofunction[com.pulumi.aws.kendra.inputs.GetQuerySuggestionsBlockListArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.kendra.outputs.GetQuerySuggestionsBlockListResult] =
      val argsBuilder = com.pulumi.aws.kendra.inputs.GetQuerySuggestionsBlockListArgs.builder
      com.pulumi.aws.kendra.KendraFunctions.getQuerySuggestionsBlockList(args(argsBuilder).build)

    /** Provides details about a specific Amazon Kendra block list used for query suggestions for an index. */
    def getQuerySuggestionsBlockListPlain(args: Endofunction[com.pulumi.aws.kendra.inputs.GetQuerySuggestionsBlockListPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.kendra.outputs.GetQuerySuggestionsBlockListResult] =
      val argsBuilder = com.pulumi.aws.kendra.inputs.GetQuerySuggestionsBlockListPlainArgs.builder
      com.pulumi.aws.kendra.KendraFunctions.getQuerySuggestionsBlockListPlain(args(argsBuilder).build)

    /** Provides details about a specific Amazon Kendra Thesaurus. */
    def getThesaurus(args: Endofunction[com.pulumi.aws.kendra.inputs.GetThesaurusArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.kendra.outputs.GetThesaurusResult] =
      val argsBuilder = com.pulumi.aws.kendra.inputs.GetThesaurusArgs.builder
      com.pulumi.aws.kendra.KendraFunctions.getThesaurus(args(argsBuilder).build)

    /** Provides details about a specific Amazon Kendra Thesaurus. */
    def getThesaurusPlain(args: Endofunction[com.pulumi.aws.kendra.inputs.GetThesaurusPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.kendra.outputs.GetThesaurusResult] =
      val argsBuilder = com.pulumi.aws.kendra.inputs.GetThesaurusPlainArgs.builder
      com.pulumi.aws.kendra.KendraFunctions.getThesaurusPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kendra.ExperienceArgs.Builder)
    /**
     * @param configuration Configuration information for your Amazon Kendra experience. The provider will only perform drift detection of its value when present in a configuration. Detailed below.
     *  
     *  &gt; **NOTE:** By default of the AWS Kendra API, updates to an existing `aws.kendra.Experience` resource (e.g. updating the `name`) will also update the `configuration.content_source_configuration.direct_put_content` parameter to `false` if not already provided.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.kendra.inputs.ExperienceConfigurationArgs.Builder]):
        com.pulumi.aws.kendra.ExperienceArgs.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.ExperienceConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kendra.QuerySuggestionsBlockListArgs.Builder)
    /**
     * @param sourceS3Path S3 path where your block list text file is located. See details below.
     * @return builder
     */
    def sourceS3Path(args: Endofunction[com.pulumi.aws.kendra.inputs.QuerySuggestionsBlockListSourceS3PathArgs.Builder]):
        com.pulumi.aws.kendra.QuerySuggestionsBlockListArgs.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.QuerySuggestionsBlockListSourceS3PathArgs.builder
      builder.sourceS3Path(args(argsBuilder).build)

  /** Resource for managing an AWS Kendra FAQ. */
  def Faq(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.kendra.FaqArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.kendra.FaqArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.kendra.Faq(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.kendra.inputs.FaqState.Builder)
    /**
     * @param s3Path The S3 location of the FAQ input data. Detailed below.
     * @return builder
     */
    def s3Path(args: Endofunction[com.pulumi.aws.kendra.inputs.FaqS3PathArgs.Builder]):
        com.pulumi.aws.kendra.inputs.FaqState.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.FaqS3PathArgs.builder
      builder.s3Path(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationConditionArgs.Builder)
    /**
     * @param conditionOnValue The value used by the operator. For example, you can specify the value &#39;financial&#39; for strings in the `_source_uri` field that partially match or contain this value. See condition_on_value.
     * @return builder
     */
    def conditionOnValue(args: Endofunction[com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationConditionConditionOnValueArgs.Builder]):
        com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationConditionConditionOnValueArgs.builder
      builder.conditionOnValue(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationArgs.Builder)
    /**
     * @param condition Configuration of the condition used for the target document attribute or metadata field when ingesting documents into Amazon Kendra. See condition.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationConditionArgs.Builder]):
        com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param target Configuration of the target document attribute or metadata field when ingesting documents into Amazon Kendra. You can also include a value. Detailed below.
     * @return builder
     */
    def target(args: Endofunction[com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationTargetArgs.Builder]):
        com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationTargetArgs.builder
      builder.target(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kendra.inputs.DataSourceConfigurationArgs.Builder)
    /**
     * @param s3Configuration A block that provides the configuration information to connect to an Amazon S3 bucket as your data source. Detailed below.
     * @return builder
     * @deprecated s3_configuration is deprecated. Use templateConfiguration instead.
     */
    @deprecated def s3Configuration(args: Endofunction[com.pulumi.aws.kendra.inputs.DataSourceConfigurationS3ConfigurationArgs.Builder]):
        com.pulumi.aws.kendra.inputs.DataSourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.DataSourceConfigurationS3ConfigurationArgs.builder
      builder.s3Configuration(args(argsBuilder).build)

    /**
     * @param templateConfiguration A block that provides the configuration information required for Amazon Kendra Web Crawler. Detailed below.
     * @return builder
     */
    def templateConfiguration(args: Endofunction[com.pulumi.aws.kendra.inputs.DataSourceConfigurationTemplateConfigurationArgs.Builder]):
        com.pulumi.aws.kendra.inputs.DataSourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.DataSourceConfigurationTemplateConfigurationArgs.builder
      builder.templateConfiguration(args(argsBuilder).build)

    /**
     * @param webCrawlerConfiguration A block that provides the configuration information required for Amazon Kendra Web Crawler. Detailed below.
     * @return builder
     * @deprecated web_crawler_configuration is deprecated. Use templateConfiguration instead.
     */
    @deprecated def webCrawlerConfiguration(args: Endofunction[com.pulumi.aws.kendra.inputs.DataSourceConfigurationWebCrawlerConfigurationArgs.Builder]):
        com.pulumi.aws.kendra.inputs.DataSourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.DataSourceConfigurationWebCrawlerConfigurationArgs.builder
      builder.webCrawlerConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kendra.inputs.IndexDocumentMetadataConfigurationUpdateArgs.Builder)
    /**
     * @param relevance A block that provides manual tuning parameters to determine how the field affects the search results. Detailed below
     * @return builder
     */
    def relevance(args: Endofunction[com.pulumi.aws.kendra.inputs.IndexDocumentMetadataConfigurationUpdateRelevanceArgs.Builder]):
        com.pulumi.aws.kendra.inputs.IndexDocumentMetadataConfigurationUpdateArgs.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.IndexDocumentMetadataConfigurationUpdateRelevanceArgs.builder
      builder.relevance(args(argsBuilder).build)

    /**
     * @param search A block that provides information about how the field is used during a search. Documented below. Detailed below
     * @return builder
     */
    def search(args: Endofunction[com.pulumi.aws.kendra.inputs.IndexDocumentMetadataConfigurationUpdateSearchArgs.Builder]):
        com.pulumi.aws.kendra.inputs.IndexDocumentMetadataConfigurationUpdateArgs.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.IndexDocumentMetadataConfigurationUpdateSearchArgs.builder
      builder.search(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kendra.inputs.DataSourceConfigurationWebCrawlerConfigurationAuthenticationConfigurationArgs.Builder)
    /**
     * @param basicAuthentications The list of configuration information that&#39;s required to connect to and crawl a website host using basic authentication credentials. The list includes the name and port number of the website host. Detailed below.
     * @return builder
     */
    def basicAuthentications(args: Endofunction[com.pulumi.aws.kendra.inputs.DataSourceConfigurationWebCrawlerConfigurationAuthenticationConfigurationBasicAuthenticationArgs.Builder]*):
        com.pulumi.aws.kendra.inputs.DataSourceConfigurationWebCrawlerConfigurationAuthenticationConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.kendra.inputs.DataSourceConfigurationWebCrawlerConfigurationAuthenticationConfigurationBasicAuthenticationArgs.builder
      builder.basicAuthentications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationTargetArgs.Builder)
    /**
     * @param targetDocumentAttributeValue The target value you want to create for the target attribute. For example, &#39;Finance&#39; could be the target value for the target attribute key &#39;Department&#39;. See target_document_attribute_value.
     * @return builder
     */
    def targetDocumentAttributeValue(args: Endofunction[com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationTargetTargetDocumentAttributeValueArgs.Builder]):
        com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationTargetTargetDocumentAttributeValueArgs.builder
      builder.targetDocumentAttributeValue(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kendra.inputs.IndexState.Builder)
    /**
     * @param capacityUnits A block that sets the number of additional document storage and query capacity units that should be used by the index. Detailed below.
     * @return builder
     */
    def capacityUnits(args: Endofunction[com.pulumi.aws.kendra.inputs.IndexCapacityUnitsArgs.Builder]):
        com.pulumi.aws.kendra.inputs.IndexState.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.IndexCapacityUnitsArgs.builder
      builder.capacityUnits(args(argsBuilder).build)

    /**
     * @param documentMetadataConfigurationUpdates One or more blocks that specify the configuration settings for any metadata applied to the documents in the index. Minimum number of 0 items. Maximum number of 500 items. If specified, you must define all elements, including those that are provided by default. These index fields are documented at [Amazon Kendra Index documentation](https://docs.aws.amazon.com/kendra/latest/dg/hiw-index.html). For an example resource that defines these default index fields, refer to the default example above. For an example resource that appends additional index fields, refer to the append example above. All arguments for each block must be specified. Note that blocks cannot be removed since index fields cannot be deleted. This argument is detailed below.
     * @return builder
     */
    def documentMetadataConfigurationUpdates(args: Endofunction[com.pulumi.aws.kendra.inputs.IndexDocumentMetadataConfigurationUpdateArgs.Builder]*):
        com.pulumi.aws.kendra.inputs.IndexState.Builder =
      def argsBuilder = com.pulumi.aws.kendra.inputs.IndexDocumentMetadataConfigurationUpdateArgs.builder
      builder.documentMetadataConfigurationUpdates(args.map(_(argsBuilder).build)*)

    /**
     * @param indexStatistics A block that provides information about the number of FAQ questions and answers and the number of text documents indexed. Detailed below.
     * @return builder
     */
    def indexStatistics(args: Endofunction[com.pulumi.aws.kendra.inputs.IndexIndexStatisticArgs.Builder]*):
        com.pulumi.aws.kendra.inputs.IndexState.Builder =
      def argsBuilder = com.pulumi.aws.kendra.inputs.IndexIndexStatisticArgs.builder
      builder.indexStatistics(args.map(_(argsBuilder).build)*)

    /**
     * @param serverSideEncryptionConfiguration A block that specifies the identifier of the AWS KMS customer managed key (CMK) that&#39;s used to encrypt data indexed by Amazon Kendra. Amazon Kendra doesn&#39;t support asymmetric CMKs. Detailed below.
     * @return builder
     */
    def serverSideEncryptionConfiguration(args: Endofunction[com.pulumi.aws.kendra.inputs.IndexServerSideEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.kendra.inputs.IndexState.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.IndexServerSideEncryptionConfigurationArgs.builder
      builder.serverSideEncryptionConfiguration(args(argsBuilder).build)

    /**
     * @param userGroupResolutionConfiguration A block that enables fetching access levels of groups and users from an AWS Single Sign-On identity source. To configure this, see [UserGroupResolutionConfiguration](https://docs.aws.amazon.com/kendra/latest/dg/API_UserGroupResolutionConfiguration.html). Detailed below.
     * @return builder
     */
    def userGroupResolutionConfiguration(args: Endofunction[com.pulumi.aws.kendra.inputs.IndexUserGroupResolutionConfigurationArgs.Builder]):
        com.pulumi.aws.kendra.inputs.IndexState.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.IndexUserGroupResolutionConfigurationArgs.builder
      builder.userGroupResolutionConfiguration(args(argsBuilder).build)

    /**
     * @param userTokenConfigurations A block that specifies the user token configuration. Detailed below.
     * @return builder
     */
    def userTokenConfigurations(args: Endofunction[com.pulumi.aws.kendra.inputs.IndexUserTokenConfigurationsArgs.Builder]):
        com.pulumi.aws.kendra.inputs.IndexState.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.IndexUserTokenConfigurationsArgs.builder
      builder.userTokenConfigurations(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kendra.inputs.DataSourceConfigurationWebCrawlerConfigurationUrlsArgs.Builder)
    /**
     * @param seedUrlConfiguration A block that specifies the configuration of the seed or starting point URLs of the websites you want to crawl. You can choose to crawl only the website host names, or the website host names with subdomains, or the website host names with subdomains and other domains that the webpages link to. You can list up to `100` seed URLs. Detailed below.
     * @return builder
     */
    def seedUrlConfiguration(args: Endofunction[com.pulumi.aws.kendra.inputs.DataSourceConfigurationWebCrawlerConfigurationUrlsSeedUrlConfigurationArgs.Builder]):
        com.pulumi.aws.kendra.inputs.DataSourceConfigurationWebCrawlerConfigurationUrlsArgs.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.DataSourceConfigurationWebCrawlerConfigurationUrlsSeedUrlConfigurationArgs.builder
      builder.seedUrlConfiguration(args(argsBuilder).build)

    /**
     * @param siteMapsConfiguration A block that specifies the configuration of the sitemap URLs of the websites you want to crawl. Only URLs belonging to the same website host names are crawled. You can list up to `3` sitemap URLs. Detailed below.
     * @return builder
     */
    def siteMapsConfiguration(args: Endofunction[com.pulumi.aws.kendra.inputs.DataSourceConfigurationWebCrawlerConfigurationUrlsSiteMapsConfigurationArgs.Builder]):
        com.pulumi.aws.kendra.inputs.DataSourceConfigurationWebCrawlerConfigurationUrlsArgs.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.DataSourceConfigurationWebCrawlerConfigurationUrlsSiteMapsConfigurationArgs.builder
      builder.siteMapsConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationInvocationConditionArgs.Builder)
    /**
     * @param conditionOnValue The value used by the operator. For example, you can specify the value &#39;financial&#39; for strings in the `_source_uri` field that partially match or contain this value. See condition_on_value.
     * @return builder
     */
    def conditionOnValue(args: Endofunction[com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationInvocationConditionConditionOnValueArgs.Builder]):
        com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationInvocationConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationInvocationConditionConditionOnValueArgs.builder
      builder.conditionOnValue(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kendra.inputs.ExperienceConfigurationArgs.Builder)
    /**
     * @param contentSourceConfiguration The identifiers of your data sources and FAQs. Or, you can specify that you want to use documents indexed via the `BatchPutDocument API`. The provider will only perform drift detection of its value when present in a configuration. Detailed below.
     * @return builder
     */
    def contentSourceConfiguration(args: Endofunction[com.pulumi.aws.kendra.inputs.ExperienceConfigurationContentSourceConfigurationArgs.Builder]):
        com.pulumi.aws.kendra.inputs.ExperienceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.ExperienceConfigurationContentSourceConfigurationArgs.builder
      builder.contentSourceConfiguration(args(argsBuilder).build)

    /**
     * @param userIdentityConfiguration The AWS SSO field name that contains the identifiers of your users, such as their emails. Detailed below.
     * @return builder
     */
    def userIdentityConfiguration(args: Endofunction[com.pulumi.aws.kendra.inputs.ExperienceConfigurationUserIdentityConfigurationArgs.Builder]):
        com.pulumi.aws.kendra.inputs.ExperienceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.ExperienceConfigurationUserIdentityConfigurationArgs.builder
      builder.userIdentityConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationPostExtractionHookConfigurationArgs.Builder)
    /**
     * @param invocationCondition A block that specifies the condition used for when a Lambda function should be invoked. For example, you can specify a condition that if there are empty date-time values, then Amazon Kendra should invoke a function that inserts the current date-time. See invocation_condition.
     * @return builder
     */
    def invocationCondition(args: Endofunction[com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationPostExtractionHookConfigurationInvocationConditionArgs.Builder]):
        com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationPostExtractionHookConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationPostExtractionHookConfigurationInvocationConditionArgs.builder
      builder.invocationCondition(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kendra.inputs.IndexIndexStatisticArgs.Builder)
    /**
     * @param faqStatistics A block that specifies the number of question and answer topics in the index. Detailed below.
     * @return builder
     */
    def faqStatistics(args: Endofunction[com.pulumi.aws.kendra.inputs.IndexIndexStatisticFaqStatisticArgs.Builder]*):
        com.pulumi.aws.kendra.inputs.IndexIndexStatisticArgs.Builder =
      def argsBuilder = com.pulumi.aws.kendra.inputs.IndexIndexStatisticFaqStatisticArgs.builder
      builder.faqStatistics(args.map(_(argsBuilder).build)*)

    /**
     * @param textDocumentStatistics A block that specifies the number of text documents indexed. Detailed below.
     * @return builder
     */
    def textDocumentStatistics(args: Endofunction[com.pulumi.aws.kendra.inputs.IndexIndexStatisticTextDocumentStatisticArgs.Builder]*):
        com.pulumi.aws.kendra.inputs.IndexIndexStatisticArgs.Builder =
      def argsBuilder = com.pulumi.aws.kendra.inputs.IndexIndexStatisticTextDocumentStatisticArgs.builder
      builder.textDocumentStatistics(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.kendra.inputs.DataSourceConfigurationWebCrawlerConfigurationArgs.Builder)
    /**
     * @param authenticationConfiguration A block with the configuration information required to connect to websites using authentication. You can connect to websites using basic authentication of user name and password. You use a secret in AWS Secrets Manager to store your authentication credentials. You must provide the website host name and port number. For example, the host name of `https://a.example.com/page1.html` is `&#34;a.example.com&#34;` and the port is `443`, the standard port for HTTPS. Detailed below.
     * @return builder
     */
    def authenticationConfiguration(args: Endofunction[com.pulumi.aws.kendra.inputs.DataSourceConfigurationWebCrawlerConfigurationAuthenticationConfigurationArgs.Builder]):
        com.pulumi.aws.kendra.inputs.DataSourceConfigurationWebCrawlerConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.DataSourceConfigurationWebCrawlerConfigurationAuthenticationConfigurationArgs.builder
      builder.authenticationConfiguration(args(argsBuilder).build)

    /**
     * @param proxyConfiguration Configuration information required to connect to your internal websites via a web proxy. You must provide the website host name and port number. For example, the host name of `https://a.example.com/page1.html` is `&#34;a.example.com&#34;` and the port is `443`, the standard port for HTTPS. Web proxy credentials are optional and you can use them to connect to a web proxy server that requires basic authentication. To store web proxy credentials, you use a secret in [AWS Secrets Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html). Detailed below.
     * @return builder
     */
    def proxyConfiguration(args: Endofunction[com.pulumi.aws.kendra.inputs.DataSourceConfigurationWebCrawlerConfigurationProxyConfigurationArgs.Builder]):
        com.pulumi.aws.kendra.inputs.DataSourceConfigurationWebCrawlerConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.DataSourceConfigurationWebCrawlerConfigurationProxyConfigurationArgs.builder
      builder.proxyConfiguration(args(argsBuilder).build)

    /**
     * @param urls A block that specifies the seed or starting point URLs of the websites or the sitemap URLs of the websites you want to crawl. You can include website subdomains. You can list up to `100` seed URLs and up to `3` sitemap URLs. You can only crawl websites that use the secure communication protocol, Hypertext Transfer Protocol Secure (HTTPS). If you receive an error when crawling a website, it could be that the website is blocked from crawling. When selecting websites to index, you must adhere to the [Amazon Acceptable Use Policy](https://aws.amazon.com/aup/) and all other Amazon terms. Remember that you must only use Amazon Kendra Web Crawler to index your own webpages, or webpages that you have authorization to index. Detailed below.
     * @return builder
     */
    def urls(args: Endofunction[com.pulumi.aws.kendra.inputs.DataSourceConfigurationWebCrawlerConfigurationUrlsArgs.Builder]):
        com.pulumi.aws.kendra.inputs.DataSourceConfigurationWebCrawlerConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.DataSourceConfigurationWebCrawlerConfigurationUrlsArgs.builder
      builder.urls(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationArgs.Builder)
    /**
     * @param inlineConfigurations Configuration information to alter document attributes or metadata fields and content when ingesting documents into Amazon Kendra. Minimum number of `0` items. Maximum number of `100` items. Detailed below.
     * @return builder
     */
    def inlineConfigurations(args: Endofunction[com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationArgs.Builder]*):
        com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationInlineConfigurationArgs.builder
      builder.inlineConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param postExtractionHookConfiguration A block that specifies the configuration information for invoking a Lambda function in AWS Lambda on the structured documents with their metadata and text extracted. You can use a Lambda function to apply advanced logic for creating, modifying, or deleting document metadata and content. For more information, see [Advanced data manipulation](https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#advanced-data-manipulation). Detailed below.
     * @return builder
     */
    def postExtractionHookConfiguration(args: Endofunction[com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationPostExtractionHookConfigurationArgs.Builder]):
        com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationPostExtractionHookConfigurationArgs.builder
      builder.postExtractionHookConfiguration(args(argsBuilder).build)

    /**
     * @param preExtractionHookConfiguration Configuration information for invoking a Lambda function in AWS Lambda on the original or raw documents before extracting their metadata and text. You can use a Lambda function to apply advanced logic for creating, modifying, or deleting document metadata and content. For more information, see [Advanced data manipulation](https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html#advanced-data-manipulation). Detailed below.
     * @return builder
     */
    def preExtractionHookConfiguration(args: Endofunction[com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationArgs.Builder]):
        com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationArgs.builder
      builder.preExtractionHookConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kendra.inputs.QuerySuggestionsBlockListState.Builder)
    /**
     * @param sourceS3Path S3 path where your block list text file is located. See details below.
     * @return builder
     */
    def sourceS3Path(args: Endofunction[com.pulumi.aws.kendra.inputs.QuerySuggestionsBlockListSourceS3PathArgs.Builder]):
        com.pulumi.aws.kendra.inputs.QuerySuggestionsBlockListState.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.QuerySuggestionsBlockListSourceS3PathArgs.builder
      builder.sourceS3Path(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kendra.inputs.DataSourceConfigurationS3ConfigurationArgs.Builder)
    /**
     * @param accessControlListConfiguration A block that provides the path to the S3 bucket that contains the user context filtering files for the data source. For the format of the file, see [Access control for S3 data sources](https://docs.aws.amazon.com/kendra/latest/dg/s3-acl.html). Detailed below.
     * @return builder
     */
    def accessControlListConfiguration(args: Endofunction[com.pulumi.aws.kendra.inputs.DataSourceConfigurationS3ConfigurationAccessControlListConfigurationArgs.Builder]):
        com.pulumi.aws.kendra.inputs.DataSourceConfigurationS3ConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.DataSourceConfigurationS3ConfigurationAccessControlListConfigurationArgs.builder
      builder.accessControlListConfiguration(args(argsBuilder).build)

    /**
     * @param documentsMetadataConfiguration A block that defines the Document metadata files that contain information such as the document access control information, source URI, document author, and custom attributes. Each metadata file contains metadata about a single document. Detailed below.
     * @return builder
     */
    def documentsMetadataConfiguration(args: Endofunction[com.pulumi.aws.kendra.inputs.DataSourceConfigurationS3ConfigurationDocumentsMetadataConfigurationArgs.Builder]):
        com.pulumi.aws.kendra.inputs.DataSourceConfigurationS3ConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.DataSourceConfigurationS3ConfigurationDocumentsMetadataConfigurationArgs.builder
      builder.documentsMetadataConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kendra.inputs.ThesaurusState.Builder)
    /**
     * @param sourceS3Path The S3 path where your thesaurus file sits in S3. Detailed below.
     * @return builder
     */
    def sourceS3Path(args: Endofunction[com.pulumi.aws.kendra.inputs.ThesaurusSourceS3PathArgs.Builder]):
        com.pulumi.aws.kendra.inputs.ThesaurusState.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.ThesaurusSourceS3PathArgs.builder
      builder.sourceS3Path(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationPostExtractionHookConfigurationInvocationConditionArgs.Builder)
    /**
     * @param conditionOnValue The value used by the operator. For example, you can specify the value &#39;financial&#39; for strings in the `_source_uri` field that partially match or contain this value. See condition_on_value.
     * @return builder
     */
    def conditionOnValue(args: Endofunction[com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationPostExtractionHookConfigurationInvocationConditionConditionOnValueArgs.Builder]):
        com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationPostExtractionHookConfigurationInvocationConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationPostExtractionHookConfigurationInvocationConditionConditionOnValueArgs.builder
      builder.conditionOnValue(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kendra.inputs.IndexUserTokenConfigurationsArgs.Builder)
    /**
     * @param jsonTokenTypeConfiguration A block that specifies the information about the JSON token type configuration. Detailed below.
     * @return builder
     */
    def jsonTokenTypeConfiguration(args: Endofunction[com.pulumi.aws.kendra.inputs.IndexUserTokenConfigurationsJsonTokenTypeConfigurationArgs.Builder]):
        com.pulumi.aws.kendra.inputs.IndexUserTokenConfigurationsArgs.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.IndexUserTokenConfigurationsJsonTokenTypeConfigurationArgs.builder
      builder.jsonTokenTypeConfiguration(args(argsBuilder).build)

    /**
     * @param jwtTokenTypeConfiguration A block that specifies the information about the JWT token type configuration. Detailed below.
     * @return builder
     */
    def jwtTokenTypeConfiguration(args: Endofunction[com.pulumi.aws.kendra.inputs.IndexUserTokenConfigurationsJwtTokenTypeConfigurationArgs.Builder]):
        com.pulumi.aws.kendra.inputs.IndexUserTokenConfigurationsArgs.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.IndexUserTokenConfigurationsJwtTokenTypeConfigurationArgs.builder
      builder.jwtTokenTypeConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kendra.inputs.ExperienceState.Builder)
    /**
     * @param configuration Configuration information for your Amazon Kendra experience. The provider will only perform drift detection of its value when present in a configuration. Detailed below.
     *  
     *  &gt; **NOTE:** By default of the AWS Kendra API, updates to an existing `aws.kendra.Experience` resource (e.g. updating the `name`) will also update the `configuration.content_source_configuration.direct_put_content` parameter to `false` if not already provided.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.kendra.inputs.ExperienceConfigurationArgs.Builder]):
        com.pulumi.aws.kendra.inputs.ExperienceState.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.ExperienceConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

    /**
     * @param endpoints Shows the endpoint URLs for your Amazon Kendra experiences. The URLs are unique and fully hosted by AWS.
     * @return builder
     */
    def endpoints(args: Endofunction[com.pulumi.aws.kendra.inputs.ExperienceEndpointArgs.Builder]*):
        com.pulumi.aws.kendra.inputs.ExperienceState.Builder =
      def argsBuilder = com.pulumi.aws.kendra.inputs.ExperienceEndpointArgs.builder
      builder.endpoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.kendra.inputs.DataSourceState.Builder)
    /**
     * @param configuration A block with the configuration information to connect to your Data Source repository. You can&#39;t specify the `configuration` block when the `type` parameter is set to `CUSTOM`. Detailed below.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.kendra.inputs.DataSourceConfigurationArgs.Builder]):
        com.pulumi.aws.kendra.inputs.DataSourceState.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.DataSourceConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

    /**
     * @param customDocumentEnrichmentConfiguration A block with the configuration information for altering document metadata and content during the document ingestion process. For more information on how to create, modify and delete document metadata, or make other content alterations when you ingest documents into Amazon Kendra, see [Customizing document metadata during the ingestion process](https://docs.aws.amazon.com/kendra/latest/dg/custom-document-enrichment.html). Detailed below.
     * @return builder
     */
    def customDocumentEnrichmentConfiguration(args: Endofunction[com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationArgs.Builder]):
        com.pulumi.aws.kendra.inputs.DataSourceState.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationArgs.builder
      builder.customDocumentEnrichmentConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationArgs.Builder)
    /**
     * @param invocationCondition A block that specifies the condition used for when a Lambda function should be invoked. For example, you can specify a condition that if there are empty date-time values, then Amazon Kendra should invoke a function that inserts the current date-time. See invocation_condition.
     * @return builder
     */
    def invocationCondition(args: Endofunction[com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationInvocationConditionArgs.Builder]):
        com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.kendra.inputs.DataSourceCustomDocumentEnrichmentConfigurationPreExtractionHookConfigurationInvocationConditionArgs.builder
      builder.invocationCondition(args(argsBuilder).build)

  /** Resource for managing an AWS Kendra Data Source. */
  def DataSource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.kendra.DataSourceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.kendra.DataSourceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.kendra.DataSource(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
