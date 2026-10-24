package jp.ukiba.ko_pulumi
package gcp

object vertex_ext:
  extension (builder: com.pulumi.gcp.vertex.AiDatasetArgs.Builder)
    /**
     * @param encryptionSpec Customer-managed encryption key spec for a Dataset. If set, this Dataset and all sub-resources of this Dataset will be secured by this key.
     * Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiDatasetEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.AiDatasetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiDatasetEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiDeploymentResourcePoolArgs.Builder)
    /**
     * @param dedicatedResources The underlying dedicated resources that the deployment resource pool uses.
     * Structure is documented below.
     * @return builder
     */
    def dedicatedResources(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiDeploymentResourcePoolDedicatedResourcesArgs.Builder]):
        com.pulumi.gcp.vertex.AiDeploymentResourcePoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiDeploymentResourcePoolDedicatedResourcesArgs.builder
      builder.dedicatedResources(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiEndpointArgs.Builder)
    /**
     * @param encryptionSpec Customer-managed encryption key spec for an Endpoint. If set, this Endpoint and all sub-resources of this Endpoint will be secured by this key.
     * Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.AiEndpointArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param predictRequestResponseLoggingConfig Configures the request-response logging for online prediction.
     * Structure is documented below.
     * @return builder
     */
    def predictRequestResponseLoggingConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointPredictRequestResponseLoggingConfigArgs.Builder]):
        com.pulumi.gcp.vertex.AiEndpointArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointPredictRequestResponseLoggingConfigArgs.builder
      builder.predictRequestResponseLoggingConfig(args(argsBuilder).build)

    /**
     * @param privateServiceConnectConfig Configuration for private service connect. `network` and `privateServiceConnectConfig` are mutually exclusive.
     * Structure is documented below.
     * @return builder
     */
    def privateServiceConnectConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointPrivateServiceConnectConfigArgs.Builder]):
        com.pulumi.gcp.vertex.AiEndpointArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointPrivateServiceConnectConfigArgs.builder
      builder.privateServiceConnectConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiEndpointIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.vertex.AiEndpointIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiEndpointIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.vertex.AiEndpointIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiEndpointWithModelGardenDeploymentArgs.Builder)
    /**
     * @param deployConfig The deploy config to use for the deployment.
     * Structure is documented below.
     * @return builder
     */
    def deployConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentDeployConfigArgs.Builder]):
        com.pulumi.gcp.vertex.AiEndpointWithModelGardenDeploymentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentDeployConfigArgs.builder
      builder.deployConfig(args(argsBuilder).build)

    /**
     * @param endpointConfig The endpoint config to use for the deployment.
     * Structure is documented below.
     * @return builder
     */
    def endpointConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentEndpointConfigArgs.Builder]):
        com.pulumi.gcp.vertex.AiEndpointWithModelGardenDeploymentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentEndpointConfigArgs.builder
      builder.endpointConfig(args(argsBuilder).build)

    /**
     * @param modelConfig The model config to use for the deployment.
     * Structure is documented below.
     * @return builder
     */
    def modelConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigArgs.Builder]):
        com.pulumi.gcp.vertex.AiEndpointWithModelGardenDeploymentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigArgs.builder
      builder.modelConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiEvaluationMetricArgs.Builder)
    /**
     * @param encryptionSpec Customer-managed encryption key spec for this EvaluationMetric. If set,
     * this EvaluationMetric will be secured by this key.
     * Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEvaluationMetricEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.AiEvaluationMetricArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEvaluationMetricEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiFeatureGroupArgs.Builder)
    /**
     * @param bigQuery Indicates that features for this group come from BigQuery Table/View. By default treats the source as a sparse time series source, which is required to have an entityId and a featureTimestamp column in the source.
     * Structure is documented below.
     * @return builder
     */
    def bigQuery(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureGroupBigQueryArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureGroupArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureGroupBigQueryArgs.builder
      builder.bigQuery(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiFeatureGroupIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureGroupIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureGroupIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureGroupIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiFeatureGroupIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureGroupIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureGroupIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureGroupIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiFeatureOnlineStoreArgs.Builder)
    /**
     * @param bigtable Settings for Cloud Bigtable instance that will be created to serve featureValues for all FeatureViews under this FeatureOnlineStore.
     * Structure is documented below.
     * @return builder
     */
    def bigtable(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreBigtableArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureOnlineStoreArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreBigtableArgs.builder
      builder.bigtable(args(argsBuilder).build)

    /**
     * @param dedicatedServingEndpoint The dedicated serving endpoint for this FeatureOnlineStore, which is different from common vertex service endpoint. Only need to be set when you choose Optimized storage type or enable EmbeddingManagement. Will use public endpoint by default.
     * Structure is documented below.
     * @return builder
     */
    def dedicatedServingEndpoint(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreDedicatedServingEndpointArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureOnlineStoreArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreDedicatedServingEndpointArgs.builder
      builder.dedicatedServingEndpoint(args(argsBuilder).build)

    /**
     * @param embeddingManagement (Optional, Beta, Deprecated)
     * The settings for embedding management in FeatureOnlineStore. Embedding management can only be set for BigTable. It is enabled by default for optimized storagetype.
     * Structure is documented below.
     * 
     * &gt; **Warning:** `embeddingManagement` is deprecated. This field is no longer needed anymore and embedding management is automatically enabled when specifying Optimized storage type
     * @return builder
     * @deprecated `embeddingManagement` is deprecated. This field is no longer needed anymore and embedding management is automatically enabled when specifying Optimized storage type
     */
    @deprecated("`embeddingManagement` is deprecated. This field is no longer needed anymore and embedding management is automatically enabled when specifying Optimized storage type") def embeddingManagement(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreEmbeddingManagementArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureOnlineStoreArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreEmbeddingManagementArgs.builder
      builder.embeddingManagement(args(argsBuilder).build)

    /**
     * @param encryptionSpec If set, both of the online and offline data storage will be secured by this key.
     * Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureOnlineStoreArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param optimized Settings for the Optimized store that will be created to serve featureValues for all FeatureViews under this FeatureOnlineStore
     * @return builder
     */
    def optimized(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreOptimizedArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureOnlineStoreArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreOptimizedArgs.builder
      builder.optimized(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewArgs.Builder)
    /**
     * @param bigQuerySource Configures how data is supposed to be extracted from a BigQuery source to be loaded onto the FeatureOnlineStore.
     * Structure is documented below.
     * @return builder
     */
    def bigQuerySource(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewBigQuerySourceArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewBigQuerySourceArgs.builder
      builder.bigQuerySource(args(argsBuilder).build)

    /**
     * @param featureRegistrySource Configures the features from a Feature Registry source that need to be loaded onto the FeatureOnlineStore.
     * Structure is documented below.
     * @return builder
     */
    def featureRegistrySource(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewFeatureRegistrySourceArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewFeatureRegistrySourceArgs.builder
      builder.featureRegistrySource(args(argsBuilder).build)

    /**
     * @param syncConfig Configures when data is to be synced/updated for this FeatureView. At the end of the sync the latest featureValues for each entityId of this FeatureView are made ready for online serving.
     * Structure is documented below.
     * @return builder
     */
    def syncConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewSyncConfigArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewSyncConfigArgs.builder
      builder.syncConfig(args(argsBuilder).build)

    /**
     * @param vectorSearchConfig (Optional, Beta)
     * Configuration for vector search. It contains the required configurations to create an index from source data, so that approximate nearest neighbor (a.k.a ANN) algorithms search can be performed during online serving.
     * Structure is documented below.
     * @return builder
     */
    def vectorSearchConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewVectorSearchConfigArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewVectorSearchConfigArgs.builder
      builder.vectorSearchConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiFeatureStoreArgs.Builder)
    /**
     * @param encryptionSpec If set, both of the online and offline data storage will be secured by this key.
     * Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureStoreEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureStoreArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureStoreEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param onlineServingConfig Config for online serving resources.
     * Structure is documented below.
     * @return builder
     */
    def onlineServingConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureStoreOnlineServingConfigArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureStoreArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureStoreOnlineServingConfigArgs.builder
      builder.onlineServingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeArgs.Builder)
    /**
     * @param monitoringConfig The default monitoring configuration for all Features under this EntityType.
     * If this is populated with [FeaturestoreMonitoringConfig.monitoring_interval] specified, snapshot analysis monitoring is enabled. Otherwise, snapshot analysis monitoring is disabled.
     * Structure is documented below.
     * @return builder
     */
    def monitoringConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeMonitoringConfigArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeMonitoringConfigArgs.builder
      builder.monitoringConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiFeatureStoreIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureStoreIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureStoreIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureStoreIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiFeatureStoreIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureStoreIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureStoreIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureStoreIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiIndexArgs.Builder)
    /**
     * @param encryptionSpec Customer-managed encryption key spec for an Index. If set, this Index and all sub-resources of this Index will be secured by this key.
     * Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.AiIndexArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param metadata Additional information about the Index.
     * Although this field is not marked as required in the API specification, it is currently required when creating an Index and must be provided.
     * Attempts to create an Index without this field will result in an API error.
     * Structure is documented below.
     * @return builder
     */
    def metadata(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexMetadataArgs.Builder]):
        com.pulumi.gcp.vertex.AiIndexArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexMetadataArgs.builder
      builder.metadata(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiIndexEndpointArgs.Builder)
    /**
     * @param encryptionSpec Customer-managed encryption key spec for an IndexEndpoint. If set, this IndexEndpoint and all sub-resources of this IndexEndpoint will be secured by this key.
     * Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexEndpointEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.AiIndexEndpointArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexEndpointEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param privateServiceConnectConfig Optional. Configuration for private service connect. `network` and `privateServiceConnectConfig` are mutually exclusive.
     * Structure is documented below.
     * @return builder
     */
    def privateServiceConnectConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexEndpointPrivateServiceConnectConfigArgs.Builder]):
        com.pulumi.gcp.vertex.AiIndexEndpointArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexEndpointPrivateServiceConnectConfigArgs.builder
      builder.privateServiceConnectConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiIndexEndpointDeployedIndexArgs.Builder)
    /**
     * @param automaticResources A description of resources that the DeployedIndex uses, which to large degree are decided by Vertex AI, and optionally allows only a modest additional configuration.
     * Structure is documented below.
     * @return builder
     */
    def automaticResources(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexAutomaticResourcesArgs.Builder]):
        com.pulumi.gcp.vertex.AiIndexEndpointDeployedIndexArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexAutomaticResourcesArgs.builder
      builder.automaticResources(args(argsBuilder).build)

    /**
     * @param dedicatedResources A description of resources that are dedicated to the DeployedIndex, and that need a higher degree of manual configuration. The field minReplicaCount must be set to a value strictly greater than 0, or else validation will fail. We don&#39;t provide SLA when minReplicaCount=1. If maxReplicaCount is not set, the default value is minReplicaCount. The max allowed replica count is 1000.
     * Available machine types for SMALL shard: e2-standard-2 and all machine types available for MEDIUM and LARGE shard.
     * Available machine types for MEDIUM shard: e2-standard-16 and all machine types available for LARGE shard.
     * Available machine types for LARGE shard: e2-highmem-16, n2d-standard-32.
     * n1-standard-16 and n1-standard-32 are still available, but we recommend e2-standard-16 and e2-highmem-16 for cost efficiency.
     * Structure is documented below.
     * @return builder
     */
    def dedicatedResources(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexDedicatedResourcesArgs.Builder]):
        com.pulumi.gcp.vertex.AiIndexEndpointDeployedIndexArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexDedicatedResourcesArgs.builder
      builder.dedicatedResources(args(argsBuilder).build)

    /**
     * @param deployedIndexAuthConfig If set, the authentication is enabled for the private endpoint.
     * Structure is documented below.
     * @return builder
     */
    def deployedIndexAuthConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexDeployedIndexAuthConfigArgs.Builder]):
        com.pulumi.gcp.vertex.AiIndexEndpointDeployedIndexArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexDeployedIndexAuthConfigArgs.builder
      builder.deployedIndexAuthConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiMetadataStoreArgs.Builder)
    /**
     * @param encryptionSpec Customer-managed encryption key spec for a MetadataStore. If set, this MetadataStore and all sub-resources of this MetadataStore will be secured by this key.
     * Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiMetadataStoreEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.AiMetadataStoreArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiMetadataStoreEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiOnlineEvaluatorArgs.Builder)
    /**
     * @param cloudObservability Data source for the OnlineEvaluator, based on the Google Cloud
     * Observability stack (Cloud Trace &amp; Cloud Logging). The data source type is
     * immutable once set. Within `cloudObservability`, `logView` and
     * `traceView` can be updated; the eval scope (`traceScope` /
     * `sessionScope`) and the convention (`openTelemetry`) are immutable.
     * Structure is documented below.
     * @return builder
     */
    def cloudObservability(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilityArgs.Builder]):
        com.pulumi.gcp.vertex.AiOnlineEvaluatorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilityArgs.builder
      builder.cloudObservability(args(argsBuilder).build)

    /**
     * @param config Configuration for sampling behavior of the OnlineEvaluator. The
     * OnlineEvaluator runs at a fixed interval of 10 minutes.
     * Structure is documented below.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorConfigArgs.Builder]):
        com.pulumi.gcp.vertex.AiOnlineEvaluatorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorConfigArgs.builder
      builder.config(args(argsBuilder).build)

    /**
     * @param metricSources A list of metric sources to be used for evaluating samples. At least one
     * metric source must be provided. Only predefined metrics (inline `metric`)
     * and registered metrics (`metricResourceName`) are supported. Every
     * registered metric must have a `displayName` (or `title`) and a
     * `scoreRange` defined, otherwise the evaluations will fail. The maximum
     * number of metric sources is 25. Exactly one of `metric` or
     * `metricResourceName` must be set per metric source.
     * Structure is documented below.
     * @return builder
     */
    def metricSources(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorMetricSourceArgs.Builder]*):
        com.pulumi.gcp.vertex.AiOnlineEvaluatorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorMetricSourceArgs.builder
      builder.metricSources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.AiPersistentResourceArgs.Builder)
    /**
     * @param encryptionSpec Represents a customer-managed encryption key specification that can be
     * applied to a Vertex AI resource.
     * Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiPersistentResourceEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.AiPersistentResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiPersistentResourceEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param pscInterfaceConfig Configuration for PSC-I.
     * Structure is documented below.
     * @return builder
     */
    def pscInterfaceConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiPersistentResourcePscInterfaceConfigArgs.Builder]):
        com.pulumi.gcp.vertex.AiPersistentResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiPersistentResourcePscInterfaceConfigArgs.builder
      builder.pscInterfaceConfig(args(argsBuilder).build)

    /**
     * @param resourcePools The spec of the pools of different resources.
     * Structure is documented below.
     * @return builder
     */
    def resourcePools(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiPersistentResourceResourcePoolArgs.Builder]*):
        com.pulumi.gcp.vertex.AiPersistentResourceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiPersistentResourceResourcePoolArgs.builder
      builder.resourcePools(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceRuntimeSpec Configuration for the runtime on a PersistentResource instance.
     * Structure is documented below.
     * @return builder
     */
    def resourceRuntimeSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiPersistentResourceResourceRuntimeSpecArgs.Builder]):
        com.pulumi.gcp.vertex.AiPersistentResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiPersistentResourceResourceRuntimeSpecArgs.builder
      builder.resourceRuntimeSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiRagCorpusArgs.Builder)
    /**
     * @param encryptionSpec Optional. Immutable. The CMEK key name used to encrypt at-rest data
     * related to this corpus. Only applicable to RagManagedDb option for Vector
     * DB. This field can only be set at corpus creation time, and cannot be
     * updated or deleted.
     * Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiRagCorpusEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.AiRagCorpusArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiRagCorpusEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param vectorDbConfig Optional. Immutable. The config for the RAG-managed Vector DB.
     * Structure is documented below.
     * @return builder
     */
    def vectorDbConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiRagCorpusVectorDbConfigArgs.Builder]):
        com.pulumi.gcp.vertex.AiRagCorpusArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiRagCorpusVectorDbConfigArgs.builder
      builder.vectorDbConfig(args(argsBuilder).build)

    /**
     * @param vertexAiSearchConfig Optional. Immutable. The config for the Vertex AI Search.
     * Structure is documented below.
     * @return builder
     */
    def vertexAiSearchConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiRagCorpusVertexAiSearchConfigArgs.Builder]):
        com.pulumi.gcp.vertex.AiRagCorpusArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiRagCorpusVertexAiSearchConfigArgs.builder
      builder.vertexAiSearchConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiRagEngineConfigArgs.Builder)
    /**
     * @param ragManagedDbConfig Required. The config of the RagManagedDb used by RagEngine.
     * Structure is documented below.
     * @return builder
     */
    def ragManagedDbConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiRagEngineConfigRagManagedDbConfigArgs.Builder]):
        com.pulumi.gcp.vertex.AiRagEngineConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiRagEngineConfigRagManagedDbConfigArgs.builder
      builder.ragManagedDbConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiReasoningEngineArgs.Builder)
    /**
     * @param contextSpec Optional. Configuration for how Agent Engine sub-resources should manage context.
     * Structure is documented below.
     * @return builder
     */
    def contextSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecArgs.Builder]):
        com.pulumi.gcp.vertex.AiReasoningEngineArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecArgs.builder
      builder.contextSpec(args(argsBuilder).build)

    /**
     * @param encryptionSpec Optional. Customer-managed encryption key spec for a ReasoningEngine.
     * If set, this ReasoningEngine and all sub-resources of this ReasoningEngine
     * will be secured by this key.
     * Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.AiReasoningEngineArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param spec Optional. Configurations of the ReasoningEngine.
     * Structure is documented below.
     * @return builder
     */
    def spec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecArgs.Builder]):
        com.pulumi.gcp.vertex.AiReasoningEngineArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecArgs.builder
      builder.spec(args(argsBuilder).build)

    /**
     * @param trafficConfig (Optional, Beta)
     * Optional. Traffic distribution configuration for the Reasoning Engine.
     * &gt; **Note:** Because revision IDs do not exist before the resource is created, the best practice for initial deployment is to set `trafficSplitAlwaysLatest {}`. Once the resource is created, you can update the configuration to a manual split using newly generated revision IDs, short names (e.g. `rev-1`), or keywords such as `LATEST` and `PREVIOUS`.
     * Structure is documented below.
     * @return builder
     */
    def trafficConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineTrafficConfigArgs.Builder]):
        com.pulumi.gcp.vertex.AiReasoningEngineArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineTrafficConfigArgs.builder
      builder.trafficConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiReasoningEngineIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.vertex.AiReasoningEngineIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiReasoningEngineIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.vertex.AiReasoningEngineIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiSemanticGovernancePolicyArgs.Builder)
    /**
     * @param agentResponseCustomization Settings for customizing the agent&#39;s response to end users when this policy is evaluated.
     * Structure is documented below.
     * @return builder
     */
    def agentResponseCustomization(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiSemanticGovernancePolicyAgentResponseCustomizationArgs.Builder]):
        com.pulumi.gcp.vertex.AiSemanticGovernancePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiSemanticGovernancePolicyAgentResponseCustomizationArgs.builder
      builder.agentResponseCustomization(args(argsBuilder).build)

    /**
     * @param mcpTools The McpTools that are affected by this policy.
     * Structure is documented below.
     * @return builder
     */
    def mcpTools(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiSemanticGovernancePolicyMcpToolsArgs.Builder]):
        com.pulumi.gcp.vertex.AiSemanticGovernancePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiSemanticGovernancePolicyMcpToolsArgs.builder
      builder.mcpTools(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiSemanticGovernancePolicyEngineArgs.Builder)
    /**
     * @param gatewayConfigs Configurations for gateways, keyed by a user-defined gateway name. At most
     * 5 gateway configurations are allowed. Each gateway name must be 1-63
     * characters, start with a lowercase letter, contain only lowercase letters,
     * numbers and hyphens, and not end with a hyphen.
     * Structure is documented below.
     * @return builder
     */
    def gatewayConfigs(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiSemanticGovernancePolicyEngineGatewayConfigArgs.Builder]*):
        com.pulumi.gcp.vertex.AiSemanticGovernancePolicyEngineArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiSemanticGovernancePolicyEngineGatewayConfigArgs.builder
      builder.gatewayConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.AiTensorboardArgs.Builder)
    /**
     * @param encryptionSpec Customer-managed encryption key spec for a Tensorboard. If set, this Tensorboard and all sub-resources of this Tensorboard will be secured by this key.
     * Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiTensorboardEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.AiTensorboardArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiTensorboardEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiDatasetState.Builder)
    /**
     * @param encryptionSpec Customer-managed encryption key spec for a Dataset. If set, this Dataset and all sub-resources of this Dataset will be secured by this key.
     * Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiDatasetEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiDatasetState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiDatasetEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiDeploymentResourcePoolDedicatedResourcesArgs.Builder)
    /**
     * @param autoscalingMetricSpecs A list of the metric specifications that overrides a resource utilization metric.
     * Structure is documented below.
     * @return builder
     */
    def autoscalingMetricSpecs(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiDeploymentResourcePoolDedicatedResourcesAutoscalingMetricSpecArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiDeploymentResourcePoolDedicatedResourcesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiDeploymentResourcePoolDedicatedResourcesAutoscalingMetricSpecArgs.builder
      builder.autoscalingMetricSpecs(args.map(_(argsBuilder).build)*)

    /**
     * @param machineSpec The specification of a single machine used by the prediction
     * Structure is documented below.
     * @return builder
     */
    def machineSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiDeploymentResourcePoolDedicatedResourcesMachineSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiDeploymentResourcePoolDedicatedResourcesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiDeploymentResourcePoolDedicatedResourcesMachineSpecArgs.builder
      builder.machineSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiDeploymentResourcePoolState.Builder)
    /**
     * @param dedicatedResources The underlying dedicated resources that the deployment resource pool uses.
     * Structure is documented below.
     * @return builder
     */
    def dedicatedResources(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiDeploymentResourcePoolDedicatedResourcesArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiDeploymentResourcePoolState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiDeploymentResourcePoolDedicatedResourcesArgs.builder
      builder.dedicatedResources(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelArgs.Builder)
    /**
     * @param automaticResources (Output)
     * A description of resources that to large degree are decided by Vertex AI, and require only a modest additional configuration.
     * Structure is documented below.
     * @return builder
     */
    def automaticResources(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelAutomaticResourceArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelAutomaticResourceArgs.builder
      builder.automaticResources(args.map(_(argsBuilder).build)*)

    /**
     * @param dedicatedResources (Output)
     * A description of resources that are dedicated to the DeployedModel, and that need a higher degree of manual configuration.
     * Structure is documented below.
     * @return builder
     */
    def dedicatedResources(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelDedicatedResourceArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelDedicatedResourceArgs.builder
      builder.dedicatedResources(args.map(_(argsBuilder).build)*)

    /**
     * @param privateEndpoints (Output)
     * Output only. Provide paths for users to send predict/explain/health requests directly to the deployed model services running on Cloud via private services access. This field is populated if network is configured.
     * Structure is documented below.
     * @return builder
     */
    def privateEndpoints(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelPrivateEndpointArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelPrivateEndpointArgs.builder
      builder.privateEndpoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelDedicatedResourceArgs.Builder)
    /**
     * @param autoscalingMetricSpecs (Output)
     * The metric specifications that overrides a resource utilization metric (CPU utilization, accelerator&#39;s duty cycle, and so on) target value (default to 60 if not set). At most one entry is allowed per metric. If machine_spec.accelerator_count is above 0, the autoscaling will be based on both CPU utilization and accelerator&#39;s duty cycle metrics and scale up when either metrics exceeds its target value while scale down if both metrics are under their target value. The default target value is 60 for both metrics. If machine_spec.accelerator_count is 0, the autoscaling will be based on CPU utilization metric only with default target value 60 if not explicitly set. For example, in the case of Online Prediction, if you want to override target CPU utilization to 80, you should set autoscaling_metric_specs.metric_name to `aiplatform.googleapis.com/prediction/online/cpu/utilization` and autoscaling_metric_specs.target to `80`.
     * Structure is documented below.
     * @return builder
     */
    def autoscalingMetricSpecs(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelDedicatedResourceAutoscalingMetricSpecArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelDedicatedResourceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelDedicatedResourceAutoscalingMetricSpecArgs.builder
      builder.autoscalingMetricSpecs(args.map(_(argsBuilder).build)*)

    /**
     * @param machineSpecs (Output)
     * The specification of a single machine used by the prediction.
     * Structure is documented below.
     * @return builder
     */
    def machineSpecs(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelDedicatedResourceMachineSpecArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelDedicatedResourceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelDedicatedResourceMachineSpecArgs.builder
      builder.machineSpecs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointPredictRequestResponseLoggingConfigArgs.Builder)
    /**
     * @param bigqueryDestination BigQuery table for logging. If only given a project, a new dataset will be created with name `logging_&lt;endpoint-display-name&gt;_&lt;endpoint-id&gt;` where will be made BigQuery-dataset-name compatible (e.g. most special characters will become underscores). If no table name is given, a new table will be created with name `requestResponseLogging`
     * Structure is documented below.
     * @return builder
     */
    def bigqueryDestination(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointPredictRequestResponseLoggingConfigBigqueryDestinationArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointPredictRequestResponseLoggingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointPredictRequestResponseLoggingConfigBigqueryDestinationArgs.builder
      builder.bigqueryDestination(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointPrivateServiceConnectConfigArgs.Builder)
    /**
     * @param pscAutomationConfigs List of projects and networks where the PSC endpoints will be created. This field is used by Online Inference(Prediction) only.
     * Structure is documented below.
     * @return builder
     */
    def pscAutomationConfigs(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointPrivateServiceConnectConfigPscAutomationConfigArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiEndpointPrivateServiceConnectConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointPrivateServiceConnectConfigPscAutomationConfigArgs.builder
      builder.pscAutomationConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointState.Builder)
    /**
     * @param deployedModels Output only. The models deployed in this Endpoint. To add or remove DeployedModels use EndpointService.DeployModel and EndpointService.UndeployModel respectively. Models can also be deployed and undeployed using the [Cloud Console](https://console.cloud.google.com/vertex-ai/).
     * Structure is documented below.
     * @return builder
     */
    def deployedModels(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiEndpointState.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelArgs.builder
      builder.deployedModels(args.map(_(argsBuilder).build)*)

    /**
     * @param encryptionSpec Customer-managed encryption key spec for an Endpoint. If set, this Endpoint and all sub-resources of this Endpoint will be secured by this key.
     * Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param predictRequestResponseLoggingConfig Configures the request-response logging for online prediction.
     * Structure is documented below.
     * @return builder
     */
    def predictRequestResponseLoggingConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointPredictRequestResponseLoggingConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointPredictRequestResponseLoggingConfigArgs.builder
      builder.predictRequestResponseLoggingConfig(args(argsBuilder).build)

    /**
     * @param privateServiceConnectConfig Configuration for private service connect. `network` and `privateServiceConnectConfig` are mutually exclusive.
     * Structure is documented below.
     * @return builder
     */
    def privateServiceConnectConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointPrivateServiceConnectConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointPrivateServiceConnectConfigArgs.builder
      builder.privateServiceConnectConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentDeployConfigArgs.Builder)
    /**
     * @param dedicatedResources A description of resources that are dedicated to a DeployedModel or
     * DeployedIndex, and that need a higher degree of manual configuration.
     * Structure is documented below.
     * @return builder
     */
    def dedicatedResources(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentDeployConfigDedicatedResourcesArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentDeployConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentDeployConfigDedicatedResourcesArgs.builder
      builder.dedicatedResources(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentDeployConfigDedicatedResourcesArgs.Builder)
    /**
     * @param autoscalingMetricSpecs The metric specifications that overrides a resource
     * utilization metric (CPU utilization, accelerator&#39;s duty cycle, and so on)
     * target value (default to 60 if not set). At most one entry is allowed per
     * metric.
     * If machine_spec.accelerator_count is
     * above 0, the autoscaling will be based on both CPU utilization and
     * accelerator&#39;s duty cycle metrics and scale up when either metrics exceeds
     * its target value while scale down if both metrics are under their target
     * value. The default target value is 60 for both metrics.
     * If machine_spec.accelerator_count is
     * 0, the autoscaling will be based on CPU utilization metric only with
     * default target value 60 if not explicitly set.
     * For example, in the case of Online Prediction, if you want to override
     * target CPU utilization to 80, you should set
     * autoscaling_metric_specs.metric_name
     * to `aiplatform.googleapis.com/prediction/online/cpu/utilization` and
     * autoscaling_metric_specs.target to `80`.
     * Structure is documented below.
     * @return builder
     */
    def autoscalingMetricSpecs(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentDeployConfigDedicatedResourcesAutoscalingMetricSpecArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentDeployConfigDedicatedResourcesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentDeployConfigDedicatedResourcesAutoscalingMetricSpecArgs.builder
      builder.autoscalingMetricSpecs(args.map(_(argsBuilder).build)*)

    /**
     * @param machineSpec Specification of a single machine.
     * Structure is documented below.
     * @return builder
     */
    def machineSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentDeployConfigDedicatedResourcesMachineSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentDeployConfigDedicatedResourcesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentDeployConfigDedicatedResourcesMachineSpecArgs.builder
      builder.machineSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentDeployConfigDedicatedResourcesMachineSpecArgs.Builder)
    /**
     * @param reservationAffinity A ReservationAffinity can be used to configure a Vertex AI resource (e.g., a
     * DeployedModel) to draw its Compute Engine resources from a Shared
     * Reservation, or exclusively from on-demand capacity.
     * Structure is documented below.
     * @return builder
     */
    def reservationAffinity(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentDeployConfigDedicatedResourcesMachineSpecReservationAffinityArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentDeployConfigDedicatedResourcesMachineSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentDeployConfigDedicatedResourcesMachineSpecReservationAffinityArgs.builder
      builder.reservationAffinity(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentEndpointConfigArgs.Builder)
    /**
     * @param privateServiceConnectConfig The configuration for Private Service Connect (PSC).
     * Structure is documented below.
     * @return builder
     */
    def privateServiceConnectConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentEndpointConfigPrivateServiceConnectConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentEndpointConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentEndpointConfigPrivateServiceConnectConfigArgs.builder
      builder.privateServiceConnectConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentEndpointConfigPrivateServiceConnectConfigArgs.Builder)
    /**
     * @param pscAutomationConfigs PSC config that is used to automatically create PSC endpoints in the user projects.
     * Structure is documented below.
     * @return builder
     */
    def pscAutomationConfigs(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentEndpointConfigPrivateServiceConnectConfigPscAutomationConfigsArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentEndpointConfigPrivateServiceConnectConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentEndpointConfigPrivateServiceConnectConfigPscAutomationConfigsArgs.builder
      builder.pscAutomationConfigs(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigArgs.Builder)
    /**
     * @param containerSpec Specification of a container for serving predictions. Some fields in this
     * message correspond to fields in the [Kubernetes Container v1 core
     * specification](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.23/#container-v1-core).
     * Structure is documented below.
     * @return builder
     */
    def containerSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecArgs.builder
      builder.containerSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecArgs.Builder)
    /**
     * @param envs List of environment variables to set in the container. After the container
     * starts running, code running in the container can read these environment
     * variables.
     * Additionally, the command and
     * args fields can reference these variables. Later
     * entries in this list can also reference earlier entries. For example, the
     * following example sets the variable `VAR_2` to have the value `foo bar`:
     * 
     * If you switch the order of the variables in the example, then the expansion
     * does not occur.
     * This field corresponds to the `env` field of the Kubernetes Containers
     * [v1 core
     * API](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.23/#container-v1-core).
     * Structure is documented below.
     * @return builder
     */
    def envs(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecEnvArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecEnvArgs.builder
      builder.envs(args.map(_(argsBuilder).build)*)

    /**
     * @param grpcPorts List of ports to expose from the container. Vertex AI sends gRPC
     * prediction requests that it receives to the first port on this list. Vertex
     * AI also sends liveness and health checks to this port.
     * If you do not specify this field, gRPC requests to the container will be
     * disabled.
     * Vertex AI does not use ports other than the first one listed. This field
     * corresponds to the `ports` field of the Kubernetes Containers v1 core API.
     * Structure is documented below.
     * @return builder
     */
    def grpcPorts(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecGrpcPortArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecGrpcPortArgs.builder
      builder.grpcPorts(args.map(_(argsBuilder).build)*)

    /**
     * @param healthProbe Probe describes a health check to be performed against a container to
     * determine whether it is alive or ready to receive traffic.
     * Structure is documented below.
     * @return builder
     */
    def healthProbe(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecHealthProbeArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecHealthProbeArgs.builder
      builder.healthProbe(args(argsBuilder).build)

    /**
     * @param livenessProbe Probe describes a health check to be performed against a container to
     * determine whether it is alive or ready to receive traffic.
     * Structure is documented below.
     * @return builder
     */
    def livenessProbe(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecLivenessProbeArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecLivenessProbeArgs.builder
      builder.livenessProbe(args(argsBuilder).build)

    /**
     * @param ports List of ports to expose from the container. Vertex AI sends any
     * prediction requests that it receives to the first port on this list. Vertex
     * AI also sends
     * [liveness and health
     * checks](https://cloud.google.com/vertex-ai/docs/predictions/custom-container-requirements#liveness)
     * to this port.
     * If you do not specify this field, it defaults to following value:
     * 
     * Vertex AI does not use ports other than the first one listed. This field
     * corresponds to the `ports` field of the Kubernetes Containers
     * [v1 core
     * API](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.23/#container-v1-core).
     * Structure is documented below.
     * @return builder
     */
    def ports(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecPortArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecPortArgs.builder
      builder.ports(args.map(_(argsBuilder).build)*)

    /**
     * @param startupProbe Probe describes a health check to be performed against a container to
     * determine whether it is alive or ready to receive traffic.
     * Structure is documented below.
     * @return builder
     */
    def startupProbe(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecStartupProbeArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecStartupProbeArgs.builder
      builder.startupProbe(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecHealthProbeArgs.Builder)
    /**
     * @param exec ExecAction specifies a command to execute.
     * Structure is documented below.
     * @return builder
     */
    def exec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecHealthProbeExecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecHealthProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecHealthProbeExecArgs.builder
      builder.exec(args(argsBuilder).build)

    /**
     * @param grpc GrpcAction checks the health of a container using a gRPC service.
     * Structure is documented below.
     * @return builder
     */
    def grpc(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecHealthProbeGrpcArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecHealthProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecHealthProbeGrpcArgs.builder
      builder.grpc(args(argsBuilder).build)

    /**
     * @param httpGet HttpGetAction describes an action based on HTTP Get requests.
     * Structure is documented below.
     * @return builder
     */
    def httpGet(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecHealthProbeHttpGetArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecHealthProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecHealthProbeHttpGetArgs.builder
      builder.httpGet(args(argsBuilder).build)

    /**
     * @param tcpSocket TcpSocketAction probes the health of a container by opening a TCP socket
     * connection.
     * Structure is documented below.
     * @return builder
     */
    def tcpSocket(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecHealthProbeTcpSocketArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecHealthProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecHealthProbeTcpSocketArgs.builder
      builder.tcpSocket(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecHealthProbeHttpGetArgs.Builder)
    /**
     * @param httpHeaders Custom headers to set in the request. HTTP allows repeated headers.
     * Structure is documented below.
     * @return builder
     */
    def httpHeaders(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecHealthProbeHttpGetHttpHeaderArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecHealthProbeHttpGetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecHealthProbeHttpGetHttpHeaderArgs.builder
      builder.httpHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecLivenessProbeArgs.Builder)
    /**
     * @param exec ExecAction specifies a command to execute.
     * Structure is documented below.
     * @return builder
     */
    def exec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecLivenessProbeExecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecLivenessProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecLivenessProbeExecArgs.builder
      builder.exec(args(argsBuilder).build)

    /**
     * @param grpc GrpcAction checks the health of a container using a gRPC service.
     * Structure is documented below.
     * @return builder
     */
    def grpc(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecLivenessProbeGrpcArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecLivenessProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecLivenessProbeGrpcArgs.builder
      builder.grpc(args(argsBuilder).build)

    /**
     * @param httpGet HttpGetAction describes an action based on HTTP Get requests.
     * Structure is documented below.
     * @return builder
     */
    def httpGet(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecLivenessProbeHttpGetArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecLivenessProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecLivenessProbeHttpGetArgs.builder
      builder.httpGet(args(argsBuilder).build)

    /**
     * @param tcpSocket TcpSocketAction probes the health of a container by opening a TCP socket
     * connection.
     * Structure is documented below.
     * @return builder
     */
    def tcpSocket(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecLivenessProbeTcpSocketArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecLivenessProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecLivenessProbeTcpSocketArgs.builder
      builder.tcpSocket(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecLivenessProbeHttpGetArgs.Builder)
    /**
     * @param httpHeaders Custom headers to set in the request. HTTP allows repeated headers.
     * Structure is documented below.
     * @return builder
     */
    def httpHeaders(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecLivenessProbeHttpGetHttpHeaderArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecLivenessProbeHttpGetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecLivenessProbeHttpGetHttpHeaderArgs.builder
      builder.httpHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecStartupProbeArgs.Builder)
    /**
     * @param exec ExecAction specifies a command to execute.
     * Structure is documented below.
     * @return builder
     */
    def exec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecStartupProbeExecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecStartupProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecStartupProbeExecArgs.builder
      builder.exec(args(argsBuilder).build)

    /**
     * @param grpc GrpcAction checks the health of a container using a gRPC service.
     * Structure is documented below.
     * @return builder
     */
    def grpc(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecStartupProbeGrpcArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecStartupProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecStartupProbeGrpcArgs.builder
      builder.grpc(args(argsBuilder).build)

    /**
     * @param httpGet HttpGetAction describes an action based on HTTP Get requests.
     * Structure is documented below.
     * @return builder
     */
    def httpGet(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecStartupProbeHttpGetArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecStartupProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecStartupProbeHttpGetArgs.builder
      builder.httpGet(args(argsBuilder).build)

    /**
     * @param tcpSocket TcpSocketAction probes the health of a container by opening a TCP socket
     * connection.
     * Structure is documented below.
     * @return builder
     */
    def tcpSocket(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecStartupProbeTcpSocketArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecStartupProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecStartupProbeTcpSocketArgs.builder
      builder.tcpSocket(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecStartupProbeHttpGetArgs.Builder)
    /**
     * @param httpHeaders Custom headers to set in the request. HTTP allows repeated headers.
     * Structure is documented below.
     * @return builder
     */
    def httpHeaders(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecStartupProbeHttpGetHttpHeaderArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecStartupProbeHttpGetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecStartupProbeHttpGetHttpHeaderArgs.builder
      builder.httpHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentState.Builder)
    /**
     * @param deployConfig The deploy config to use for the deployment.
     * Structure is documented below.
     * @return builder
     */
    def deployConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentDeployConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentDeployConfigArgs.builder
      builder.deployConfig(args(argsBuilder).build)

    /**
     * @param endpointConfig The endpoint config to use for the deployment.
     * Structure is documented below.
     * @return builder
     */
    def endpointConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentEndpointConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentEndpointConfigArgs.builder
      builder.endpointConfig(args(argsBuilder).build)

    /**
     * @param modelConfig The model config to use for the deployment.
     * Structure is documented below.
     * @return builder
     */
    def modelConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigArgs.builder
      builder.modelConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEvaluationMetricState.Builder)
    /**
     * @param encryptionSpec Customer-managed encryption key spec for this EvaluationMetric. If set,
     * this EvaluationMetric will be secured by this key.
     * Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEvaluationMetricEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEvaluationMetricState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEvaluationMetricEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureGroupBigQueryArgs.Builder)
    /**
     * @param bigQuerySource The BigQuery source URI that points to either a BigQuery Table or View.
     * Structure is documented below.
     * @return builder
     */
    def bigQuerySource(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureGroupBigQueryBigQuerySourceArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureGroupBigQueryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureGroupBigQueryBigQuerySourceArgs.builder
      builder.bigQuerySource(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureGroupIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureGroupIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureGroupIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureGroupIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureGroupIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureGroupIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureGroupIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureGroupIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureGroupState.Builder)
    /**
     * @param bigQuery Indicates that features for this group come from BigQuery Table/View. By default treats the source as a sparse time series source, which is required to have an entityId and a featureTimestamp column in the source.
     * Structure is documented below.
     * @return builder
     */
    def bigQuery(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureGroupBigQueryArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureGroupState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureGroupBigQueryArgs.builder
      builder.bigQuery(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreBigtableArgs.Builder)
    /**
     * @param autoScaling Autoscaling config applied to Bigtable Instance.
     * Structure is documented below.
     * @return builder
     */
    def autoScaling(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreBigtableAutoScalingArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreBigtableArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreBigtableAutoScalingArgs.builder
      builder.autoScaling(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreDedicatedServingEndpointArgs.Builder)
    /**
     * @param privateServiceConnectConfig Private service connect config.
     * Structure is documented below.
     * @return builder
     */
    def privateServiceConnectConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreDedicatedServingEndpointPrivateServiceConnectConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreDedicatedServingEndpointArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreDedicatedServingEndpointPrivateServiceConnectConfigArgs.builder
      builder.privateServiceConnectConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewFeatureRegistrySourceArgs.Builder)
    /**
     * @param featureGroups List of features that need to be synced to Online Store.
     * Structure is documented below.
     * @return builder
     */
    def featureGroups(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewFeatureRegistrySourceFeatureGroupArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewFeatureRegistrySourceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewFeatureRegistrySourceFeatureGroupArgs.builder
      builder.featureGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewState.Builder)
    /**
     * @param bigQuerySource Configures how data is supposed to be extracted from a BigQuery source to be loaded onto the FeatureOnlineStore.
     * Structure is documented below.
     * @return builder
     */
    def bigQuerySource(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewBigQuerySourceArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewBigQuerySourceArgs.builder
      builder.bigQuerySource(args(argsBuilder).build)

    /**
     * @param featureRegistrySource Configures the features from a Feature Registry source that need to be loaded onto the FeatureOnlineStore.
     * Structure is documented below.
     * @return builder
     */
    def featureRegistrySource(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewFeatureRegistrySourceArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewFeatureRegistrySourceArgs.builder
      builder.featureRegistrySource(args(argsBuilder).build)

    /**
     * @param syncConfig Configures when data is to be synced/updated for this FeatureView. At the end of the sync the latest featureValues for each entityId of this FeatureView are made ready for online serving.
     * Structure is documented below.
     * @return builder
     */
    def syncConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewSyncConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewSyncConfigArgs.builder
      builder.syncConfig(args(argsBuilder).build)

    /**
     * @param vectorSearchConfig (Optional, Beta)
     * Configuration for vector search. It contains the required configurations to create an index from source data, so that approximate nearest neighbor (a.k.a ANN) algorithms search can be performed during online serving.
     * Structure is documented below.
     * @return builder
     */
    def vectorSearchConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewVectorSearchConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewVectorSearchConfigArgs.builder
      builder.vectorSearchConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewVectorSearchConfigArgs.Builder)
    /**
     * @param bruteForceConfig Configuration options for using brute force search, which simply implements the standard linear search in the database for each query. It is primarily meant for benchmarking and to generate the ground truth for approximate search.
     * @return builder
     */
    def bruteForceConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewVectorSearchConfigBruteForceConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewVectorSearchConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewVectorSearchConfigBruteForceConfigArgs.builder
      builder.bruteForceConfig(args(argsBuilder).build)

    /**
     * @param treeAhConfig Configuration options for the tree-AH algorithm (Shallow tree + Asymmetric Hashing). Please refer to this paper for more details: https://arxiv.org/abs/1908.10396
     * Structure is documented below.
     * @return builder
     */
    def treeAhConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewVectorSearchConfigTreeAhConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewVectorSearchConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewVectorSearchConfigTreeAhConfigArgs.builder
      builder.treeAhConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreState.Builder)
    /**
     * @param bigtable Settings for Cloud Bigtable instance that will be created to serve featureValues for all FeatureViews under this FeatureOnlineStore.
     * Structure is documented below.
     * @return builder
     */
    def bigtable(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreBigtableArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreBigtableArgs.builder
      builder.bigtable(args(argsBuilder).build)

    /**
     * @param dedicatedServingEndpoint The dedicated serving endpoint for this FeatureOnlineStore, which is different from common vertex service endpoint. Only need to be set when you choose Optimized storage type or enable EmbeddingManagement. Will use public endpoint by default.
     * Structure is documented below.
     * @return builder
     */
    def dedicatedServingEndpoint(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreDedicatedServingEndpointArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreDedicatedServingEndpointArgs.builder
      builder.dedicatedServingEndpoint(args(argsBuilder).build)

    /**
     * @param embeddingManagement (Optional, Beta, Deprecated)
     * The settings for embedding management in FeatureOnlineStore. Embedding management can only be set for BigTable. It is enabled by default for optimized storagetype.
     * Structure is documented below.
     * 
     * &gt; **Warning:** `embeddingManagement` is deprecated. This field is no longer needed anymore and embedding management is automatically enabled when specifying Optimized storage type
     * @return builder
     * @deprecated `embeddingManagement` is deprecated. This field is no longer needed anymore and embedding management is automatically enabled when specifying Optimized storage type
     */
    @deprecated("`embeddingManagement` is deprecated. This field is no longer needed anymore and embedding management is automatically enabled when specifying Optimized storage type") def embeddingManagement(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreEmbeddingManagementArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreEmbeddingManagementArgs.builder
      builder.embeddingManagement(args(argsBuilder).build)

    /**
     * @param encryptionSpec If set, both of the online and offline data storage will be secured by this key.
     * Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param optimized Settings for the Optimized store that will be created to serve featureValues for all FeatureViews under this FeatureOnlineStore
     * @return builder
     */
    def optimized(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreOptimizedArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreOptimizedArgs.builder
      builder.optimized(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeMonitoringConfigArgs.Builder)
    /**
     * @param categoricalThresholdConfig Threshold for categorical features of anomaly detection. This is shared by all types of Featurestore Monitoring for categorical features (i.e. Features with type (Feature.ValueType) BOOL or STRING).
     * Structure is documented below.
     * @return builder
     */
    def categoricalThresholdConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeMonitoringConfigCategoricalThresholdConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeMonitoringConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeMonitoringConfigCategoricalThresholdConfigArgs.builder
      builder.categoricalThresholdConfig(args(argsBuilder).build)

    /**
     * @param importFeaturesAnalysis The config for ImportFeatures Analysis Based Feature Monitoring.
     * Structure is documented below.
     * @return builder
     */
    def importFeaturesAnalysis(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeMonitoringConfigImportFeaturesAnalysisArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeMonitoringConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeMonitoringConfigImportFeaturesAnalysisArgs.builder
      builder.importFeaturesAnalysis(args(argsBuilder).build)

    /**
     * @param numericalThresholdConfig Threshold for numerical features of anomaly detection. This is shared by all objectives of Featurestore Monitoring for numerical features (i.e. Features with type (Feature.ValueType) DOUBLE or INT64).
     * Structure is documented below.
     * @return builder
     */
    def numericalThresholdConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeMonitoringConfigNumericalThresholdConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeMonitoringConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeMonitoringConfigNumericalThresholdConfigArgs.builder
      builder.numericalThresholdConfig(args(argsBuilder).build)

    /**
     * @param snapshotAnalysis The config for Snapshot Analysis Based Feature Monitoring.
     * Structure is documented below.
     * @return builder
     */
    def snapshotAnalysis(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysisArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeMonitoringConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysisArgs.builder
      builder.snapshotAnalysis(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeState.Builder)
    /**
     * @param monitoringConfig The default monitoring configuration for all Features under this EntityType.
     * If this is populated with [FeaturestoreMonitoringConfig.monitoring_interval] specified, snapshot analysis monitoring is enabled. Otherwise, snapshot analysis monitoring is disabled.
     * Structure is documented below.
     * @return builder
     */
    def monitoringConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeMonitoringConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeMonitoringConfigArgs.builder
      builder.monitoringConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureStoreIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureStoreIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureStoreIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureStoreIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureStoreIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureStoreIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureStoreIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureStoreIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureStoreOnlineServingConfigArgs.Builder)
    /**
     * @param scaling Online serving scaling configuration. Only one of fixedNodeCount and scaling can be set. Setting one will reset the other.
     * Structure is documented below.
     * @return builder
     */
    def scaling(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureStoreOnlineServingConfigScalingArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureStoreOnlineServingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureStoreOnlineServingConfigScalingArgs.builder
      builder.scaling(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureStoreState.Builder)
    /**
     * @param encryptionSpec If set, both of the online and offline data storage will be secured by this key.
     * Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureStoreEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureStoreState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureStoreEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param onlineServingConfig Config for online serving resources.
     * Structure is documented below.
     * @return builder
     */
    def onlineServingConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureStoreOnlineServingConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureStoreState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureStoreOnlineServingConfigArgs.builder
      builder.onlineServingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexDedicatedResourcesArgs.Builder)
    /**
     * @param machineSpec The minimum number of replicas this DeployedModel will be always deployed on.
     * Structure is documented below.
     * @return builder
     */
    def machineSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexDedicatedResourcesMachineSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexDedicatedResourcesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexDedicatedResourcesMachineSpecArgs.builder
      builder.machineSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexDeployedIndexAuthConfigArgs.Builder)
    /**
     * @param authProvider Defines the authentication provider that the DeployedIndex uses.
     * Structure is documented below.
     * @return builder
     */
    def authProvider(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexDeployedIndexAuthConfigAuthProviderArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexDeployedIndexAuthConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexDeployedIndexAuthConfigAuthProviderArgs.builder
      builder.authProvider(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexPrivateEndpointArgs.Builder)
    /**
     * @param pscAutomatedEndpoints (Output)
     * PscAutomatedEndpoints is populated if private service connect is enabled if PscAutomatedConfig is set.
     * Structure is documented below.
     * @return builder
     */
    def pscAutomatedEndpoints(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexPrivateEndpointPscAutomatedEndpointArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexPrivateEndpointArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexPrivateEndpointPscAutomatedEndpointArgs.builder
      builder.pscAutomatedEndpoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexState.Builder)
    /**
     * @param automaticResources A description of resources that the DeployedIndex uses, which to large degree are decided by Vertex AI, and optionally allows only a modest additional configuration.
     * Structure is documented below.
     * @return builder
     */
    def automaticResources(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexAutomaticResourcesArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexAutomaticResourcesArgs.builder
      builder.automaticResources(args(argsBuilder).build)

    /**
     * @param dedicatedResources A description of resources that are dedicated to the DeployedIndex, and that need a higher degree of manual configuration. The field minReplicaCount must be set to a value strictly greater than 0, or else validation will fail. We don&#39;t provide SLA when minReplicaCount=1. If maxReplicaCount is not set, the default value is minReplicaCount. The max allowed replica count is 1000.
     * Available machine types for SMALL shard: e2-standard-2 and all machine types available for MEDIUM and LARGE shard.
     * Available machine types for MEDIUM shard: e2-standard-16 and all machine types available for LARGE shard.
     * Available machine types for LARGE shard: e2-highmem-16, n2d-standard-32.
     * n1-standard-16 and n1-standard-32 are still available, but we recommend e2-standard-16 and e2-highmem-16 for cost efficiency.
     * Structure is documented below.
     * @return builder
     */
    def dedicatedResources(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexDedicatedResourcesArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexDedicatedResourcesArgs.builder
      builder.dedicatedResources(args(argsBuilder).build)

    /**
     * @param deployedIndexAuthConfig If set, the authentication is enabled for the private endpoint.
     * Structure is documented below.
     * @return builder
     */
    def deployedIndexAuthConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexDeployedIndexAuthConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexDeployedIndexAuthConfigArgs.builder
      builder.deployedIndexAuthConfig(args(argsBuilder).build)

    /**
     * @param privateEndpoints Provides paths for users to send requests directly to the deployed index services running on Cloud via private services access. This field is populated if [network](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.indexEndpoints#IndexEndpoint.FIELDS.network) is configured.
     * Structure is documented below.
     * @return builder
     */
    def privateEndpoints(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexPrivateEndpointArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexState.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexPrivateEndpointArgs.builder
      builder.privateEndpoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiIndexEndpointPrivateServiceConnectConfigArgs.Builder)
    /**
     * @param pscAutomationConfigs List of projects and networks where the PSC endpoints will be created. This field is used by Online Inference(Prediction) only.
     * Structure is documented below.
     * @return builder
     */
    def pscAutomationConfigs(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexEndpointPrivateServiceConnectConfigPscAutomationConfigArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiIndexEndpointPrivateServiceConnectConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexEndpointPrivateServiceConnectConfigPscAutomationConfigArgs.builder
      builder.pscAutomationConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiIndexEndpointState.Builder)
    /**
     * @param encryptionSpec Customer-managed encryption key spec for an IndexEndpoint. If set, this IndexEndpoint and all sub-resources of this IndexEndpoint will be secured by this key.
     * Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexEndpointEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiIndexEndpointState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexEndpointEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param privateServiceConnectConfig Optional. Configuration for private service connect. `network` and `privateServiceConnectConfig` are mutually exclusive.
     * Structure is documented below.
     * @return builder
     */
    def privateServiceConnectConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexEndpointPrivateServiceConnectConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiIndexEndpointState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexEndpointPrivateServiceConnectConfigArgs.builder
      builder.privateServiceConnectConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiIndexMetadataArgs.Builder)
    /**
     * @param config The configuration of the Matching Engine Index.
     * Structure is documented below.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexMetadataConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiIndexMetadataArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexMetadataConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiIndexMetadataConfigAlgorithmConfigArgs.Builder)
    /**
     * @param bruteForceConfig Configuration options for using brute force search, which simply implements the
     * standard linear search in the database for each query.
     * @return builder
     */
    def bruteForceConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexMetadataConfigAlgorithmConfigBruteForceConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiIndexMetadataConfigAlgorithmConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexMetadataConfigAlgorithmConfigBruteForceConfigArgs.builder
      builder.bruteForceConfig(args(argsBuilder).build)

    /**
     * @param treeAhConfig Configuration options for using the tree-AH algorithm (Shallow tree + Asymmetric Hashing).
     * Please refer to this paper for more details: https://arxiv.org/abs/1908.10396
     * Structure is documented below.
     * @return builder
     */
    def treeAhConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexMetadataConfigAlgorithmConfigTreeAhConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiIndexMetadataConfigAlgorithmConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexMetadataConfigAlgorithmConfigTreeAhConfigArgs.builder
      builder.treeAhConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiIndexMetadataConfigArgs.Builder)
    /**
     * @param algorithmConfig The configuration with regard to the algorithms used for efficient search. This field may be required based on your configuration.
     * Structure is documented below.
     * @return builder
     */
    def algorithmConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexMetadataConfigAlgorithmConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiIndexMetadataConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexMetadataConfigAlgorithmConfigArgs.builder
      builder.algorithmConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiIndexState.Builder)
    /**
     * @param deployedIndexes The pointers to DeployedIndexes created from this Index. An Index can be only deleted if all its DeployedIndexes had been undeployed first.
     * Structure is documented below.
     * @return builder
     */
    def deployedIndexes(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexDeployedIndexArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiIndexState.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexDeployedIndexArgs.builder
      builder.deployedIndexes(args.map(_(argsBuilder).build)*)

    /**
     * @param encryptionSpec Customer-managed encryption key spec for an Index. If set, this Index and all sub-resources of this Index will be secured by this key.
     * Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiIndexState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param indexStats Stats of the index resource.
     * Structure is documented below.
     * @return builder
     */
    def indexStats(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexIndexStatArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiIndexState.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexIndexStatArgs.builder
      builder.indexStats(args.map(_(argsBuilder).build)*)

    /**
     * @param metadata Additional information about the Index.
     * Although this field is not marked as required in the API specification, it is currently required when creating an Index and must be provided.
     * Attempts to create an Index without this field will result in an API error.
     * Structure is documented below.
     * @return builder
     */
    def metadata(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexMetadataArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiIndexState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexMetadataArgs.builder
      builder.metadata(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiMetadataStoreState.Builder)
    /**
     * @param encryptionSpec Customer-managed encryption key spec for a MetadataStore. If set, this MetadataStore and all sub-resources of this MetadataStore will be secured by this key.
     * Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiMetadataStoreEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiMetadataStoreState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiMetadataStoreEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param states State information of the MetadataStore.
     * Structure is documented below.
     * @return builder
     */
    def states(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiMetadataStoreStateArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiMetadataStoreState.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiMetadataStoreStateArgs.builder
      builder.states(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilityArgs.Builder)
    /**
     * @param openTelemetry Configuration for a data source following the OpenTelemetry
     * convention. This is the convention that the data source follows.
     * Structure is documented below.
     * @return builder
     */
    def openTelemetry(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilityOpenTelemetryArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilityArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilityOpenTelemetryArgs.builder
      builder.openTelemetry(args(argsBuilder).build)

    /**
     * @param sessionScope If chosen, the OnlineEvaluator will evaluate sessions matching the
     * specified filter. A session is a group of traces with a common
     * `gen_ai.conversation.id`. Exactly one of `traceScope` or
     * `sessionScope` must be set.
     * Structure is documented below.
     * @return builder
     */
    def sessionScope(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilitySessionScopeArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilityArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilitySessionScopeArgs.builder
      builder.sessionScope(args(argsBuilder).build)

    /**
     * @param traceScope If chosen, the OnlineEvaluator will evaluate single traces matching
     * the specified filter. Exactly one of `traceScope` or `sessionScope`
     * must be set.
     * Structure is documented below.
     * @return builder
     */
    def traceScope(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilityTraceScopeArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilityArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilityTraceScopeArgs.builder
      builder.traceScope(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilitySessionScopeArgs.Builder)
    /**
     * @param filters A list of predicates to filter sessions. Multiple predicates are
     * combined using AND. The maximum number of predicates is 10.
     * Structure is documented below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilitySessionScopeFilterArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilitySessionScopeArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilitySessionScopeFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

    /**
     * @param inactivityTrigger Session is considered ready for evaluation when there are no new
     * traces for a specified period of inactivity.
     * Structure is documented below.
     * @return builder
     */
    def inactivityTrigger(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilitySessionScopeInactivityTriggerArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilitySessionScopeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilitySessionScopeInactivityTriggerArgs.builder
      builder.inactivityTrigger(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilitySessionScopeFilterArgs.Builder)
    /**
     * @param duration Filter on the duration of a session (in seconds).
     * Structure is documented below.
     * @return builder
     */
    def duration(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilitySessionScopeFilterDurationArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilitySessionScopeFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilitySessionScopeFilterDurationArgs.builder
      builder.duration(args(argsBuilder).build)

    /**
     * @param modelCallErrors Filter on the number of LLM call errors within a session.
     * Structure is documented below.
     * @return builder
     */
    def modelCallErrors(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilitySessionScopeFilterModelCallErrorsArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilitySessionScopeFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilitySessionScopeFilterModelCallErrorsArgs.builder
      builder.modelCallErrors(args(argsBuilder).build)

    /**
     * @param modelCalls Filter on the number of underlying LLM calls within a session.
     * Structure is documented below.
     * @return builder
     */
    def modelCalls(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilitySessionScopeFilterModelCallsArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilitySessionScopeFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilitySessionScopeFilterModelCallsArgs.builder
      builder.modelCalls(args(argsBuilder).build)

    /**
     * @param toolCallErrors Filter on the number of tool call errors within a session.
     * Structure is documented below.
     * @return builder
     */
    def toolCallErrors(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilitySessionScopeFilterToolCallErrorsArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilitySessionScopeFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilitySessionScopeFilterToolCallErrorsArgs.builder
      builder.toolCallErrors(args(argsBuilder).build)

    /**
     * @param toolCalls Filter on the number of underlying tool calls within a session.
     * Structure is documented below.
     * @return builder
     */
    def toolCalls(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilitySessionScopeFilterToolCallsArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilitySessionScopeFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilitySessionScopeFilterToolCallsArgs.builder
      builder.toolCalls(args(argsBuilder).build)

    /**
     * @param totalTokenUsage Filter on the total token usage within a session.
     * Structure is documented below.
     * @return builder
     */
    def totalTokenUsage(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilitySessionScopeFilterTotalTokenUsageArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilitySessionScopeFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilitySessionScopeFilterTotalTokenUsageArgs.builder
      builder.totalTokenUsage(args(argsBuilder).build)

    /**
     * @param userTurns Filter on the number of user turns within a session.
     * Structure is documented below.
     * @return builder
     */
    def userTurns(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilitySessionScopeFilterUserTurnsArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilitySessionScopeFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilitySessionScopeFilterUserTurnsArgs.builder
      builder.userTurns(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilityTraceScopeArgs.Builder)
    /**
     * @param filters A list of predicates to filter traces. Multiple predicates are
     * combined using AND. The maximum number of predicates is 10.
     * Structure is documented below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilityTraceScopeFilterArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilityTraceScopeArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilityTraceScopeFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilityTraceScopeFilterArgs.Builder)
    /**
     * @param duration Filter on the duration of a session (in seconds).
     * Structure is documented below.
     * @return builder
     */
    def duration(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilityTraceScopeFilterDurationArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilityTraceScopeFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilityTraceScopeFilterDurationArgs.builder
      builder.duration(args(argsBuilder).build)

    /**
     * @param totalTokenUsage Filter on the total token usage within a session.
     * Structure is documented below.
     * @return builder
     */
    def totalTokenUsage(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilityTraceScopeFilterTotalTokenUsageArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilityTraceScopeFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilityTraceScopeFilterTotalTokenUsageArgs.builder
      builder.totalTokenUsage(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorConfigArgs.Builder)
    /**
     * @param randomSampling Configuration for random sampling. This is the sampling method used to
     * select traces for evaluation.
     * Structure is documented below.
     * @return builder
     */
    def randomSampling(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorConfigRandomSamplingArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorConfigRandomSamplingArgs.builder
      builder.randomSampling(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorState.Builder)
    /**
     * @param cloudObservability Data source for the OnlineEvaluator, based on the Google Cloud
     * Observability stack (Cloud Trace &amp; Cloud Logging). The data source type is
     * immutable once set. Within `cloudObservability`, `logView` and
     * `traceView` can be updated; the eval scope (`traceScope` /
     * `sessionScope`) and the convention (`openTelemetry`) are immutable.
     * Structure is documented below.
     * @return builder
     */
    def cloudObservability(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilityArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorCloudObservabilityArgs.builder
      builder.cloudObservability(args(argsBuilder).build)

    /**
     * @param config Configuration for sampling behavior of the OnlineEvaluator. The
     * OnlineEvaluator runs at a fixed interval of 10 minutes.
     * Structure is documented below.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorConfigArgs.builder
      builder.config(args(argsBuilder).build)

    /**
     * @param metricSources A list of metric sources to be used for evaluating samples. At least one
     * metric source must be provided. Only predefined metrics (inline `metric`)
     * and registered metrics (`metricResourceName`) are supported. Every
     * registered metric must have a `displayName` (or `title`) and a
     * `scoreRange` defined, otherwise the evaluations will fail. The maximum
     * number of metric sources is 25. Exactly one of `metric` or
     * `metricResourceName` must be set per metric source.
     * Structure is documented below.
     * @return builder
     */
    def metricSources(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorMetricSourceArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorState.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorMetricSourceArgs.builder
      builder.metricSources(args.map(_(argsBuilder).build)*)

    /**
     * @param stateDetails Contains additional information about the state of the OnlineEvaluator.
     * This is used to provide more details in the event of a failure.
     * Structure is documented below.
     * @return builder
     */
    def stateDetails(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorStateDetailArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorState.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiOnlineEvaluatorStateDetailArgs.builder
      builder.stateDetails(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiPersistentResourcePscInterfaceConfigArgs.Builder)
    /**
     * @param dnsPeeringConfigs DNS peering configurations. When specified, Vertex AI will
     * attempt to configure DNS peering zones in the tenant project VPC
     * to resolve the specified domains using the target network&#39;s Cloud DNS.
     * The user must grant the dns.peer role to the Vertex AI Service Agent
     * on the target project.
     * Structure is documented below.
     * @return builder
     */
    def dnsPeeringConfigs(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiPersistentResourcePscInterfaceConfigDnsPeeringConfigArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiPersistentResourcePscInterfaceConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiPersistentResourcePscInterfaceConfigDnsPeeringConfigArgs.builder
      builder.dnsPeeringConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiPersistentResourceResourcePoolArgs.Builder)
    /**
     * @param autoscalingSpec The min/max number of replicas allowed if enabling autoscaling
     * Structure is documented below.
     * @return builder
     */
    def autoscalingSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiPersistentResourceResourcePoolAutoscalingSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiPersistentResourceResourcePoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiPersistentResourceResourcePoolAutoscalingSpecArgs.builder
      builder.autoscalingSpec(args(argsBuilder).build)

    /**
     * @param diskSpec Represents the spec of disk options.
     * Structure is documented below.
     * @return builder
     */
    def diskSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiPersistentResourceResourcePoolDiskSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiPersistentResourceResourcePoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiPersistentResourceResourcePoolDiskSpecArgs.builder
      builder.diskSpec(args(argsBuilder).build)

    /**
     * @param machineSpec Specification of a single machine.
     * Structure is documented below.
     * @return builder
     */
    def machineSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiPersistentResourceResourcePoolMachineSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiPersistentResourceResourcePoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiPersistentResourceResourcePoolMachineSpecArgs.builder
      builder.machineSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiPersistentResourceResourceRuntimeSpecArgs.Builder)
    /**
     * @param serviceAccountSpec Configuration for the use of custom service account to run the workloads.
     * Structure is documented below.
     * @return builder
     */
    def serviceAccountSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiPersistentResourceResourceRuntimeSpecServiceAccountSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiPersistentResourceResourceRuntimeSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiPersistentResourceResourceRuntimeSpecServiceAccountSpecArgs.builder
      builder.serviceAccountSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiPersistentResourceState.Builder)
    /**
     * @param encryptionSpec Represents a customer-managed encryption key specification that can be
     * applied to a Vertex AI resource.
     * Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiPersistentResourceEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiPersistentResourceState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiPersistentResourceEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param errors The `Status` type defines a logical error model that is suitable for
     * different programming environments, including REST APIs and RPC APIs. It is
     * used by [gRPC](https://github.com/grpc). Each `Status` message contains
     * three pieces of data: error code, error message, and error details.
     * You can find out more about this error model and how to work with it in the
     * [API Design Guide](https://cloud.google.com/apis/design/errors).
     * Structure is documented below.
     * @return builder
     */
    def errors(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiPersistentResourceErrorArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiPersistentResourceState.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiPersistentResourceErrorArgs.builder
      builder.errors(args.map(_(argsBuilder).build)*)

    /**
     * @param pscInterfaceConfig Configuration for PSC-I.
     * Structure is documented below.
     * @return builder
     */
    def pscInterfaceConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiPersistentResourcePscInterfaceConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiPersistentResourceState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiPersistentResourcePscInterfaceConfigArgs.builder
      builder.pscInterfaceConfig(args(argsBuilder).build)

    /**
     * @param resourcePools The spec of the pools of different resources.
     * Structure is documented below.
     * @return builder
     */
    def resourcePools(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiPersistentResourceResourcePoolArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiPersistentResourceState.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiPersistentResourceResourcePoolArgs.builder
      builder.resourcePools(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceRuntimeSpec Configuration for the runtime on a PersistentResource instance.
     * Structure is documented below.
     * @return builder
     */
    def resourceRuntimeSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiPersistentResourceResourceRuntimeSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiPersistentResourceState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiPersistentResourceResourceRuntimeSpecArgs.builder
      builder.resourceRuntimeSpec(args(argsBuilder).build)

    /**
     * @param resourceRuntimes Persistent Cluster runtime information as output
     * Structure is documented below.
     * @return builder
     */
    def resourceRuntimes(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiPersistentResourceResourceRuntimeArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiPersistentResourceState.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiPersistentResourceResourceRuntimeArgs.builder
      builder.resourceRuntimes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiRagCorpusState.Builder)
    /**
     * @param corpusStatuses Output only. RagCorpus state.
     * Structure is documented below.
     * @return builder
     */
    def corpusStatuses(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiRagCorpusCorpusStatusArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiRagCorpusState.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiRagCorpusCorpusStatusArgs.builder
      builder.corpusStatuses(args.map(_(argsBuilder).build)*)

    /**
     * @param encryptionSpec Optional. Immutable. The CMEK key name used to encrypt at-rest data
     * related to this corpus. Only applicable to RagManagedDb option for Vector
     * DB. This field can only be set at corpus creation time, and cannot be
     * updated or deleted.
     * Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiRagCorpusEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiRagCorpusState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiRagCorpusEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param vectorDbConfig Optional. Immutable. The config for the RAG-managed Vector DB.
     * Structure is documented below.
     * @return builder
     */
    def vectorDbConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiRagCorpusVectorDbConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiRagCorpusState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiRagCorpusVectorDbConfigArgs.builder
      builder.vectorDbConfig(args(argsBuilder).build)

    /**
     * @param vertexAiSearchConfig Optional. Immutable. The config for the Vertex AI Search.
     * Structure is documented below.
     * @return builder
     */
    def vertexAiSearchConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiRagCorpusVertexAiSearchConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiRagCorpusState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiRagCorpusVertexAiSearchConfigArgs.builder
      builder.vertexAiSearchConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiRagCorpusVectorDbConfigApiAuthArgs.Builder)
    /**
     * @param apiKeyConfig The API secret.
     * Structure is documented below.
     * @return builder
     */
    def apiKeyConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiRagCorpusVectorDbConfigApiAuthApiKeyConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiRagCorpusVectorDbConfigApiAuthArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiRagCorpusVectorDbConfigApiAuthApiKeyConfigArgs.builder
      builder.apiKeyConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiRagCorpusVectorDbConfigArgs.Builder)
    /**
     * @param apiAuth Authentication config for the chosen Vector DB.
     * Structure is documented below.
     * @return builder
     */
    def apiAuth(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiRagCorpusVectorDbConfigApiAuthArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiRagCorpusVectorDbConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiRagCorpusVectorDbConfigApiAuthArgs.builder
      builder.apiAuth(args(argsBuilder).build)

    /**
     * @param pinecone The config for the Pinecone.
     * Structure is documented below.
     * @return builder
     */
    def pinecone(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiRagCorpusVectorDbConfigPineconeArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiRagCorpusVectorDbConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiRagCorpusVectorDbConfigPineconeArgs.builder
      builder.pinecone(args(argsBuilder).build)

    /**
     * @param ragEmbeddingModelConfig Optional. Immutable. The embedding model config of the Vector DB.
     * Structure is documented below.
     * @return builder
     */
    def ragEmbeddingModelConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiRagCorpusVectorDbConfigRagEmbeddingModelConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiRagCorpusVectorDbConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiRagCorpusVectorDbConfigRagEmbeddingModelConfigArgs.builder
      builder.ragEmbeddingModelConfig(args(argsBuilder).build)

    /**
     * @param ragManagedDb The config for the default RAG-managed Vector DB.
     * Structure is documented below.
     * @return builder
     */
    def ragManagedDb(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiRagCorpusVectorDbConfigRagManagedDbArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiRagCorpusVectorDbConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiRagCorpusVectorDbConfigRagManagedDbArgs.builder
      builder.ragManagedDb(args(argsBuilder).build)

    /**
     * @param vertexVectorSearch The config for the Vertex Vector Search.
     * Structure is documented below.
     * @return builder
     */
    def vertexVectorSearch(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiRagCorpusVectorDbConfigVertexVectorSearchArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiRagCorpusVectorDbConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiRagCorpusVectorDbConfigVertexVectorSearchArgs.builder
      builder.vertexVectorSearch(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiRagCorpusVectorDbConfigRagEmbeddingModelConfigArgs.Builder)
    /**
     * @param vertexPredictionEndpoint The Vertex AI Prediction Endpoint used for dense vector search.
     * Structure is documented below.
     * @return builder
     */
    def vertexPredictionEndpoint(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiRagCorpusVectorDbConfigRagEmbeddingModelConfigVertexPredictionEndpointArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiRagCorpusVectorDbConfigRagEmbeddingModelConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiRagCorpusVectorDbConfigRagEmbeddingModelConfigVertexPredictionEndpointArgs.builder
      builder.vertexPredictionEndpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiRagCorpusVectorDbConfigRagManagedDbArgs.Builder)
    /**
     * @param ann Performs an ANN search on RagCorpus.
     * Structure is documented below.
     * @return builder
     */
    def ann(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiRagCorpusVectorDbConfigRagManagedDbAnnArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiRagCorpusVectorDbConfigRagManagedDbArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiRagCorpusVectorDbConfigRagManagedDbAnnArgs.builder
      builder.ann(args(argsBuilder).build)

    /**
     * @param knn Performs a KNN search on RagCorpus. This is the default choice if not specified.
     * @return builder
     */
    def knn(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiRagCorpusVectorDbConfigRagManagedDbKnnArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiRagCorpusVectorDbConfigRagManagedDbArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiRagCorpusVectorDbConfigRagManagedDbKnnArgs.builder
      builder.knn(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiRagEngineConfigRagManagedDbConfigArgs.Builder)
    /**
     * @param basic Basic tier is a cost-effective and low compute tier suitable for the following cases: Experimenting with RagManagedDb, Small data size, Latency insensitive workload, Only using RAG Engine with external vector DBs.
     * NOTE: This is the default tier if not explicitly chosen.
     * @return builder
     */
    def basic(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiRagEngineConfigRagManagedDbConfigBasicArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiRagEngineConfigRagManagedDbConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiRagEngineConfigRagManagedDbConfigBasicArgs.builder
      builder.basic(args(argsBuilder).build)

    /**
     * @param scaled Scaled tier offers production grade performance along with autoscaling functionality. It is suitable for customers with large amounts of data or performance sensitive workloads.
     * @return builder
     */
    def scaled(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiRagEngineConfigRagManagedDbConfigScaledArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiRagEngineConfigRagManagedDbConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiRagEngineConfigRagManagedDbConfigScaledArgs.builder
      builder.scaled(args(argsBuilder).build)

    /**
     * @param unprovisioned Disables the RAG Engine service and deletes all your data held within this service. This will halt the billing of the service.
     * NOTE: Once deleted the data cannot be recovered. To start using RAG Engine again, you will need to update the tier by calling the UpdateRagEngineConfig API.
     * @return builder
     */
    def unprovisioned(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiRagEngineConfigRagManagedDbConfigUnprovisionedArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiRagEngineConfigRagManagedDbConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiRagEngineConfigRagManagedDbConfigUnprovisionedArgs.builder
      builder.unprovisioned(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiRagEngineConfigState.Builder)
    /**
     * @param ragManagedDbConfig Required. The config of the RagManagedDb used by RagEngine.
     * Structure is documented below.
     * @return builder
     */
    def ragManagedDbConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiRagEngineConfigRagManagedDbConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiRagEngineConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiRagEngineConfigRagManagedDbConfigArgs.builder
      builder.ragManagedDbConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecArgs.Builder)
    /**
     * @param exampleStoreConfig (Optional, Beta)
     * Optional. Specification for an Example Store, which manages few-shot examples for the Agent Engine.
     * Structure is documented below.
     * @return builder
     */
    def exampleStoreConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecExampleStoreConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecExampleStoreConfigArgs.builder
      builder.exampleStoreConfig(args(argsBuilder).build)

    /**
     * @param memoryBankConfig Specification for a Memory Bank, which manages memories for the Agent Engine.
     * Structure is documented below.
     * @return builder
     */
    def memoryBankConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigArgs.builder
      builder.memoryBankConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecExampleStoreConfigArgs.Builder)
    /**
     * @param similaritySearchConfig Optional. Configuration for how to perform similarity search on examples.
     * Structure is documented below.
     * @return builder
     */
    def similaritySearchConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecExampleStoreConfigSimilaritySearchConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecExampleStoreConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecExampleStoreConfigSimilaritySearchConfigArgs.builder
      builder.similaritySearchConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigArgs.Builder)
    /**
     * @param customizationConfigs Optional. Customization configs for how Agent Engine sub-resources manage context at different scope levels.
     * Structure is documented below.
     * @return builder
     */
    def customizationConfigs(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigArgs.builder
      builder.customizationConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param generationConfig Configuration for how to generate memories for the Memory Bank.
     * Structure is documented below.
     * @return builder
     */
    def generationConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigGenerationConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigGenerationConfigArgs.builder
      builder.generationConfig(args(argsBuilder).build)

    /**
     * @param similaritySearchConfig Configuration for how to perform similarity search on memories.
     * Structure is documented below.
     * @return builder
     */
    def similaritySearchConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigSimilaritySearchConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigSimilaritySearchConfigArgs.builder
      builder.similaritySearchConfig(args(argsBuilder).build)

    /**
     * @param structuredMemoryConfigs Optional. Structured memory configurations for Agent Engine sub-resources.
     * Structure is documented below.
     * @return builder
     */
    def structuredMemoryConfigs(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigStructuredMemoryConfigArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigStructuredMemoryConfigArgs.builder
      builder.structuredMemoryConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param ttlConfig Configuration for automatic TTL (&#34;time-to-live&#34;) of the memories in the Memory Bank.
     * Structure is documented below.
     * @return builder
     */
    def ttlConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigTtlConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigTtlConfigArgs.builder
      builder.ttlConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigArgs.Builder)
    /**
     * @param consolidationConfig Optional. Configuration for how many memory revisions Memory Bank considers when consolidating each memory candidate.
     * Structure is documented below.
     * @return builder
     */
    def consolidationConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigConsolidationConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigConsolidationConfigArgs.builder
      builder.consolidationConfig(args(argsBuilder).build)

    /**
     * @param generateMemoriesExamples Provides examples of how to generate memories for a particular scope.
     * Structure is documented below.
     * @return builder
     */
    def generateMemoriesExamples(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleArgs.builder
      builder.generateMemoriesExamples(args.map(_(argsBuilder).build)*)

    /**
     * @param memoryTopics Optional. List of topics that the memory should be associated with.
     * Structure is documented below.
     * @return builder
     */
    def memoryTopics(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigMemoryTopicArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigMemoryTopicArgs.builder
      builder.memoryTopics(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleArgs.Builder)
    /**
     * @param conversationSource A conversation source for the example.
     * Structure is documented below.
     * @return builder
     */
    def conversationSource(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceArgs.builder
      builder.conversationSource(args(argsBuilder).build)

    /**
     * @param generatedMemories Represents the memories that are expected to be generated from the input conversation.
     * Structure is documented below.
     * @return builder
     */
    def generatedMemories(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleGeneratedMemoryArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleGeneratedMemoryArgs.builder
      builder.generatedMemories(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceArgs.Builder)
    /**
     * @param events Represents the input conversation events for the example.
     * Structure is documented below.
     * @return builder
     */
    def events(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceEventArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceEventArgs.builder
      builder.events(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceEventArgs.Builder)
    /**
     * @param content Represents the content of the event.
     * Structure is documented below.
     * @return builder
     */
    def content(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceEventContentArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceEventArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceEventContentArgs.builder
      builder.content(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceEventContentArgs.Builder)
    /**
     * @param parts A list of Part objects that make up a single message.
     * Structure is documented below.
     * @return builder
     */
    def parts(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceEventContentPartArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceEventContentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceEventContentPartArgs.builder
      builder.parts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceEventContentPartArgs.Builder)
    /**
     * @param audioTranscription Audio (input or output) transcription. This is only set when this Part contains audio data.
     * Structure is documented below.
     * @return builder
     */
    def audioTranscription(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceEventContentPartAudioTranscriptionArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceEventContentPartArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceEventContentPartAudioTranscriptionArgs.builder
      builder.audioTranscription(args(argsBuilder).build)

    /**
     * @param codeExecutionResult Result of executing the ExecutableCode.
     * Structure is documented below.
     * @return builder
     */
    def codeExecutionResult(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceEventContentPartCodeExecutionResultArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceEventContentPartArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceEventContentPartCodeExecutionResultArgs.builder
      builder.codeExecutionResult(args(argsBuilder).build)

    /**
     * @param executableCode Code generated by the model that is intended to be executed.
     * Structure is documented below.
     * @return builder
     */
    def executableCode(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceEventContentPartExecutableCodeArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceEventContentPartArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceEventContentPartExecutableCodeArgs.builder
      builder.executableCode(args(argsBuilder).build)

    /**
     * @param fileData URI based data.
     * Structure is documented below.
     * @return builder
     */
    def fileData(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceEventContentPartFileDataArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceEventContentPartArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceEventContentPartFileDataArgs.builder
      builder.fileData(args(argsBuilder).build)

    /**
     * @param functionCall A predicted function call returned from the model.
     * Structure is documented below.
     * @return builder
     */
    def functionCall(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceEventContentPartFunctionCallArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceEventContentPartArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceEventContentPartFunctionCallArgs.builder
      builder.functionCall(args(argsBuilder).build)

    /**
     * @param functionResponse The result of a function call.
     * Structure is documented below.
     * @return builder
     */
    def functionResponse(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceEventContentPartFunctionResponseArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceEventContentPartArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceEventContentPartFunctionResponseArgs.builder
      builder.functionResponse(args(argsBuilder).build)

    /**
     * @param inlineData The inline data content of the part.
     * Structure is documented below.
     * @return builder
     */
    def inlineData(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceEventContentPartInlineDataArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceEventContentPartArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceEventContentPartInlineDataArgs.builder
      builder.inlineData(args(argsBuilder).build)

    /**
     * @param videoMetadata Video metadata.
     * Structure is documented below.
     * @return builder
     */
    def videoMetadata(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceEventContentPartVideoMetadataArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceEventContentPartArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceEventContentPartVideoMetadataArgs.builder
      builder.videoMetadata(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceEventContentPartAudioTranscriptionArgs.Builder)
    /**
     * @param words Detailed word-level transcriptions and timing details. Present when wordTimestamp is set.
     * Structure is documented below.
     * @return builder
     */
    def words(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceEventContentPartAudioTranscriptionWordArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceEventContentPartAudioTranscriptionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleConversationSourceEventContentPartAudioTranscriptionWordArgs.builder
      builder.words(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleGeneratedMemoryArgs.Builder)
    /**
     * @param topics Represents the list of topics that the memory should be associated with.
     * Structure is documented below.
     * @return builder
     */
    def topics(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleGeneratedMemoryTopicArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleGeneratedMemoryArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigGenerateMemoriesExampleGeneratedMemoryTopicArgs.builder
      builder.topics(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigMemoryTopicArgs.Builder)
    /**
     * @param customMemoryTopic Optional. Custom memory topic.
     * Structure is documented below.
     * @return builder
     */
    def customMemoryTopic(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigMemoryTopicCustomMemoryTopicArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigMemoryTopicArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigMemoryTopicCustomMemoryTopicArgs.builder
      builder.customMemoryTopic(args(argsBuilder).build)

    /**
     * @param managedMemoryTopic Optional. Managed memory topic.
     * Structure is documented below.
     * @return builder
     */
    def managedMemoryTopic(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigMemoryTopicManagedMemoryTopicArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigMemoryTopicArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigCustomizationConfigMemoryTopicManagedMemoryTopicArgs.builder
      builder.managedMemoryTopic(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigGenerationConfigArgs.Builder)
    /**
     * @param generationTriggerConfig Optional. Configuration for triggering memory generation.
     * Structure is documented below.
     * @return builder
     */
    def generationTriggerConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigGenerationConfigGenerationTriggerConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigGenerationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigGenerationConfigGenerationTriggerConfigArgs.builder
      builder.generationTriggerConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigGenerationConfigGenerationTriggerConfigArgs.Builder)
    /**
     * @param generationRule Optional. The active rule that determines when to flush the buffer. If not set,
     * then the stream will be force flushed immediately.
     * Structure is documented below.
     * @return builder
     */
    def generationRule(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigGenerationConfigGenerationTriggerConfigGenerationRuleArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigGenerationConfigGenerationTriggerConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigGenerationConfigGenerationTriggerConfigGenerationRuleArgs.builder
      builder.generationRule(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigStructuredMemoryConfigArgs.Builder)
    /**
     * @param schemaConfigs Optional. List of schema configs that this structured memory config applies to.
     * Structure is documented below.
     * @return builder
     */
    def schemaConfigs(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigStructuredMemoryConfigSchemaConfigArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigStructuredMemoryConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigStructuredMemoryConfigSchemaConfigArgs.builder
      builder.schemaConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigTtlConfigArgs.Builder)
    /**
     * @param granularTtlConfig The granular TTL configuration of the memories in the Memory Bank.
     * Structure is documented below.
     * @return builder
     */
    def granularTtlConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigTtlConfigGranularTtlConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigTtlConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigTtlConfigGranularTtlConfigArgs.builder
      builder.granularTtlConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecArgs.Builder)
    /**
     * @param buildSpec Optional. Configuration for building container image.
     * @return builder
     */
    def buildSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecBuildSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecBuildSpecArgs.builder
      builder.buildSpec(args(argsBuilder).build)

    /**
     * @param containerSpec Deploy from a container image with a defined entrypoint and commands.
     * @return builder
     */
    def containerSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecContainerSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecContainerSpecArgs.builder
      builder.containerSpec(args(argsBuilder).build)

    /**
     * @param deploymentSpec Optional. The specification of a Reasoning Engine deployment.
     * @return builder
     */
    def deploymentSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecArgs.builder
      builder.deploymentSpec(args(argsBuilder).build)

    /**
     * @param packageSpec Optional. User provided package spec of the ReasoningEngine.
     * Ignored when users directly specify a deployment image through
     * deploymentSpec.first_party_image_override, but keeping the
     * fieldBehavior to avoid introducing breaking changes.
     * @return builder
     */
    def packageSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecPackageSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecPackageSpecArgs.builder
      builder.packageSpec(args(argsBuilder).build)

    /**
     * @param sourceCodeSpec Specification for deploying from source code.
     * @return builder
     */
    def sourceCodeSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecArgs.builder
      builder.sourceCodeSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecAgentGatewayConfigArgs.Builder)
    /**
     * @param agentToAnywhereConfig Optional. Configuration for traffic originating from the Reasoning Engine.
     * Structure is documented below.
     * @return builder
     */
    def agentToAnywhereConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecAgentGatewayConfigAgentToAnywhereConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecAgentGatewayConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecAgentGatewayConfigAgentToAnywhereConfigArgs.builder
      builder.agentToAnywhereConfig(args(argsBuilder).build)

    /**
     * @param clientToAgentConfig Optional. Configuration for traffic targeting the Reasoning Engine.
     * Structure is documented below.
     * @return builder
     */
    def clientToAgentConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecAgentGatewayConfigClientToAgentConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecAgentGatewayConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecAgentGatewayConfigClientToAgentConfigArgs.builder
      builder.clientToAgentConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecArgs.Builder)
    /**
     * @param agentGatewayConfig Optional. Agent Gateway configuration for a Reasoning Engine deployment.
     * Structure is documented below.
     * @return builder
     */
    def agentGatewayConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecAgentGatewayConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecAgentGatewayConfigArgs.builder
      builder.agentGatewayConfig(args(argsBuilder).build)

    /**
     * @param envs Optional. Environment variables to be set with the Reasoning
     * Engine deployment.
     * Structure is documented below.
     * @return builder
     */
    def envs(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecEnvArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecEnvArgs.builder
      builder.envs(args.map(_(argsBuilder).build)*)

    /**
     * @param keepAliveProbe (Optional, Beta)
     * Optional. Specifies the configuration for keep-alive probe.
     * Structure is documented below.
     * @return builder
     */
    def keepAliveProbe(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecKeepAliveProbeArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecKeepAliveProbeArgs.builder
      builder.keepAliveProbe(args(argsBuilder).build)

    /**
     * @param pscInterfaceConfig Optional. Configuration for PSC-Interface.
     * Structure is documented below.
     * @return builder
     */
    def pscInterfaceConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecPscInterfaceConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecPscInterfaceConfigArgs.builder
      builder.pscInterfaceConfig(args(argsBuilder).build)

    /**
     * @param secretEnvs Optional. Environment variables where the value is a secret in
     * Cloud Secret Manager. To use this feature, add &#39;Secret Manager
     * Secret Accessor&#39; role (roles/secretmanager.secretAccessor) to AI
     * Platform Reasoning Engine service Agent.
     * Structure is documented below.
     * @return builder
     */
    def secretEnvs(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecSecretEnvArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecSecretEnvArgs.builder
      builder.secretEnvs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecKeepAliveProbeArgs.Builder)
    /**
     * @param httpGet Specifies the HTTP GET configuration for the probe.
     * Structure is documented below.
     * @return builder
     */
    def httpGet(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecKeepAliveProbeHttpGetArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecKeepAliveProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecKeepAliveProbeHttpGetArgs.builder
      builder.httpGet(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecPscInterfaceConfigArgs.Builder)
    /**
     * @param dnsPeeringConfigs Optional. DNS peering configurations.
     * When specified, Vertex AI will attempt to configure DNS
     * peering zones in the tenant project VPC to resolve the
     * specified domains using the target network&#39;s Cloud DNS.
     * The user must grant the dns.peer role to the Vertex AI
     * service Agent on the target project.
     * Structure is documented below.
     * @return builder
     */
    def dnsPeeringConfigs(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecPscInterfaceConfigDnsPeeringConfigArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecPscInterfaceConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecPscInterfaceConfigDnsPeeringConfigArgs.builder
      builder.dnsPeeringConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecSecretEnvArgs.Builder)
    /**
     * @param secretRef Reference to a secret stored in the Cloud Secret Manager
     * that will provide the value for this environment variable.
     * Structure is documented below.
     * @return builder
     */
    def secretRef(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecSecretEnvSecretRefArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecSecretEnvArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecSecretEnvSecretRefArgs.builder
      builder.secretRef(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecAgentConfigSourceArgs.Builder)
    /**
     * @param adkConfig Required. Configuration for the Agent Development Kit (ADK).
     * Structure is documented below.
     * @return builder
     */
    def adkConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecAgentConfigSourceAdkConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecAgentConfigSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecAgentConfigSourceAdkConfigArgs.builder
      builder.adkConfig(args(argsBuilder).build)

    /**
     * @param inlineSource Optional. Any additional files needed to interpret the config.
     * Structure is documented below.
     * @return builder
     */
    def inlineSource(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecAgentConfigSourceInlineSourceArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecAgentConfigSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecAgentConfigSourceInlineSourceArgs.builder
      builder.inlineSource(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecArgs.Builder)
    /**
     * @param agentConfigSource Optional. Specification for the deploying from agent config.
     * Structure is documented below.
     * @return builder
     */
    def agentConfigSource(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecAgentConfigSourceArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecAgentConfigSourceArgs.builder
      builder.agentConfigSource(args(argsBuilder).build)

    /**
     * @param developerConnectSource Specification for source code to be fetched from a Git repository managed through the Developer Connect service.
     * Structure is documented below.
     * @return builder
     */
    def developerConnectSource(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecDeveloperConnectSourceArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecDeveloperConnectSourceArgs.builder
      builder.developerConnectSource(args(argsBuilder).build)

    /**
     * @param imageSpec Configuration for building an image with custom config file.
     * Structure is documented below.
     * @return builder
     */
    def imageSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecImageSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecImageSpecArgs.builder
      builder.imageSpec(args(argsBuilder).build)

    /**
     * @param inlineSource Source code is provided directly in the request.
     * Structure is documented below.
     * @return builder
     */
    def inlineSource(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecInlineSourceArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecInlineSourceArgs.builder
      builder.inlineSource(args(argsBuilder).build)

    /**
     * @param pythonSpec Specification for running a Python application from source.
     * Structure is documented below.
     * @return builder
     */
    def pythonSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecPythonSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecPythonSpecArgs.builder
      builder.pythonSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecDeveloperConnectSourceArgs.Builder)
    /**
     * @param config The Developer Connect configuration that defines the specific repository, revision, and directory to use as the source code root.
     * Structure is documented below.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecDeveloperConnectSourceConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecDeveloperConnectSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecDeveloperConnectSourceConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineState.Builder)
    /**
     * @param contextSpec Optional. Configuration for how Agent Engine sub-resources should manage context.
     * Structure is documented below.
     * @return builder
     */
    def contextSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecArgs.builder
      builder.contextSpec(args(argsBuilder).build)

    /**
     * @param encryptionSpec Optional. Customer-managed encryption key spec for a ReasoningEngine.
     * If set, this ReasoningEngine and all sub-resources of this ReasoningEngine
     * will be secured by this key.
     * Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param spec Optional. Configurations of the ReasoningEngine.
     * Structure is documented below.
     * @return builder
     */
    def spec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecArgs.builder
      builder.spec(args(argsBuilder).build)

    /**
     * @param trafficConfig (Optional, Beta)
     * Optional. Traffic distribution configuration for the Reasoning Engine.
     * &gt; **Note:** Because revision IDs do not exist before the resource is created, the best practice for initial deployment is to set `trafficSplitAlwaysLatest {}`. Once the resource is created, you can update the configuration to a manual split using newly generated revision IDs, short names (e.g. `rev-1`), or keywords such as `LATEST` and `PREVIOUS`.
     * Structure is documented below.
     * @return builder
     */
    def trafficConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineTrafficConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineTrafficConfigArgs.builder
      builder.trafficConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineTrafficConfigArgs.Builder)
    /**
     * @param trafficSplitAlwaysLatest Optional. Traffic distribution configuration, where all traffic is sent to the
     * latest Runtime Revision.
     * @return builder
     */
    def trafficSplitAlwaysLatest(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineTrafficConfigTrafficSplitAlwaysLatestArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineTrafficConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineTrafficConfigTrafficSplitAlwaysLatestArgs.builder
      builder.trafficSplitAlwaysLatest(args(argsBuilder).build)

    /**
     * @param trafficSplitManual Optional. Manual traffic distribution configuration, where the user specifies the
     * Runtime Revision IDs and the percentage of traffic to send to each.
     * Structure is documented below.
     * @return builder
     */
    def trafficSplitManual(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineTrafficConfigTrafficSplitManualArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineTrafficConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineTrafficConfigTrafficSplitManualArgs.builder
      builder.trafficSplitManual(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineTrafficConfigTrafficSplitManualArgs.Builder)
    /**
     * @param targets Optional. A list of traffic targets for the Runtimes Revisions. The sum of
     * percentages must equal to 100.
     * Structure is documented below.
     * @return builder
     */
    def targets(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineTrafficConfigTrafficSplitManualTargetArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineTrafficConfigTrafficSplitManualArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineTrafficConfigTrafficSplitManualTargetArgs.builder
      builder.targets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiSemanticGovernancePolicyEngineState.Builder)
    /**
     * @param gatewayConfigs Configurations for gateways, keyed by a user-defined gateway name. At most
     * 5 gateway configurations are allowed. Each gateway name must be 1-63
     * characters, start with a lowercase letter, contain only lowercase letters,
     * numbers and hyphens, and not end with a hyphen.
     * Structure is documented below.
     * @return builder
     */
    def gatewayConfigs(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiSemanticGovernancePolicyEngineGatewayConfigArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiSemanticGovernancePolicyEngineState.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiSemanticGovernancePolicyEngineGatewayConfigArgs.builder
      builder.gatewayConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiSemanticGovernancePolicyState.Builder)
    /**
     * @param agentResponseCustomization Settings for customizing the agent&#39;s response to end users when this policy is evaluated.
     * Structure is documented below.
     * @return builder
     */
    def agentResponseCustomization(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiSemanticGovernancePolicyAgentResponseCustomizationArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiSemanticGovernancePolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiSemanticGovernancePolicyAgentResponseCustomizationArgs.builder
      builder.agentResponseCustomization(args(argsBuilder).build)

    /**
     * @param mcpTools The McpTools that are affected by this policy.
     * Structure is documented below.
     * @return builder
     */
    def mcpTools(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiSemanticGovernancePolicyMcpToolsArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiSemanticGovernancePolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiSemanticGovernancePolicyMcpToolsArgs.builder
      builder.mcpTools(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiTensorboardState.Builder)
    /**
     * @param encryptionSpec Customer-managed encryption key spec for a Tensorboard. If set, this Tensorboard and all sub-resources of this Tensorboard will be secured by this key.
     * Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiTensorboardEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiTensorboardState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiTensorboardEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)
