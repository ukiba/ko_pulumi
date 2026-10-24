package jp.ukiba.ko_pulumi
package gcp

object dataplex_ext:
  extension (builder: com.pulumi.gcp.dataplex.AspectTypeIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.AspectTypeIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.AspectTypeIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.AspectTypeIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.AspectTypeIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.AspectTypeIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.AspectTypeIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.AspectTypeIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.AssetArgs.Builder)
    /**
     * @param discoverySpec Required. Specification of the discovery feature applied to data referenced by this asset. When this spec is left unset, the asset will use the spec set on the parent zone.
     * @return builder
     */
    def discoverySpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.AssetDiscoverySpecArgs.Builder]):
        com.pulumi.gcp.dataplex.AssetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.AssetDiscoverySpecArgs.builder
      builder.discoverySpec(args(argsBuilder).build)

    /**
     * @param resourceSpec Required. Immutable. Specification of the resource that is referenced by this asset.
     * @return builder
     */
    def resourceSpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.AssetResourceSpecArgs.Builder]):
        com.pulumi.gcp.dataplex.AssetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.AssetResourceSpecArgs.builder
      builder.resourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.AssetIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.AssetIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.AssetIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.AssetIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.AssetIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.AssetIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.AssetIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.AssetIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.DataAssetArgs.Builder)
    /**
     * @param accessGroupConfigs Access groups configurations.
     * Structure is documented below.
     * @return builder
     */
    def accessGroupConfigs(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DataAssetAccessGroupConfigArgs.Builder]*):
        com.pulumi.gcp.dataplex.DataAssetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.DataAssetAccessGroupConfigArgs.builder
      builder.accessGroupConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataplex.DataProductArgs.Builder)
    /**
     * @param accessApprovalConfig Configuration for access approval for the data product.
     * Structure is documented below.
     * @return builder
     */
    def accessApprovalConfig(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DataProductAccessApprovalConfigArgs.Builder]):
        com.pulumi.gcp.dataplex.DataProductArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DataProductAccessApprovalConfigArgs.builder
      builder.accessApprovalConfig(args(argsBuilder).build)

    /**
     * @param accessGroups Custom user defined access groups at the data product level.
     * Structure is documented below.
     * @return builder
     */
    def accessGroups(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DataProductAccessGroupArgs.Builder]*):
        com.pulumi.gcp.dataplex.DataProductArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.DataProductAccessGroupArgs.builder
      builder.accessGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataplex.DataProductDataAssetArgs.Builder)
    /**
     * @param accessGroupConfigs Access groups configurations.
     * Structure is documented below.
     * @return builder
     */
    def accessGroupConfigs(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DataProductDataAssetAccessGroupConfigArgs.Builder]*):
        com.pulumi.gcp.dataplex.DataProductDataAssetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.DataProductDataAssetAccessGroupConfigArgs.builder
      builder.accessGroupConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataplex.DataProductIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DataProductIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.DataProductIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DataProductIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.DataProductIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DataProductIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.DataProductIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DataProductIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.DatascanArgs.Builder)
    /**
     * @param data The data source for DataScan.
     * Structure is documented below.
     * @return builder
     */
    def data(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataArgs.Builder]):
        com.pulumi.gcp.dataplex.DatascanArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataArgs.builder
      builder.data(args(argsBuilder).build)

    /**
     * @param dataDiscoverySpec DataDiscoveryScan related setting.
     * Structure is documented below.
     * @return builder
     */
    def dataDiscoverySpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataDiscoverySpecArgs.Builder]):
        com.pulumi.gcp.dataplex.DatascanArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataDiscoverySpecArgs.builder
      builder.dataDiscoverySpec(args(argsBuilder).build)

    /**
     * @param dataDocumentationSpec DataDocumentationScan related setting.
     * Structure is documented below.
     * @return builder
     */
    def dataDocumentationSpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataDocumentationSpecArgs.Builder]):
        com.pulumi.gcp.dataplex.DatascanArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataDocumentationSpecArgs.builder
      builder.dataDocumentationSpec(args(argsBuilder).build)

    /**
     * @param dataProfileSpec DataProfileScan related setting.
     * Structure is documented below.
     * @return builder
     */
    def dataProfileSpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataProfileSpecArgs.Builder]):
        com.pulumi.gcp.dataplex.DatascanArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataProfileSpecArgs.builder
      builder.dataProfileSpec(args(argsBuilder).build)

    /**
     * @param dataQualitySpec DataQualityScan related setting.
     * Structure is documented below.
     * @return builder
     */
    def dataQualitySpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecArgs.Builder]):
        com.pulumi.gcp.dataplex.DatascanArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecArgs.builder
      builder.dataQualitySpec(args(argsBuilder).build)

    /**
     * @param executionIdentity The identity to run the datascan. If not specified, defaults to the Dataplex Service Agent.
     * Structure is documented below.
     * @return builder
     */
    def executionIdentity(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanExecutionIdentityArgs.Builder]):
        com.pulumi.gcp.dataplex.DatascanArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanExecutionIdentityArgs.builder
      builder.executionIdentity(args(argsBuilder).build)

    /**
     * @param executionSpec DataScan execution settings.
     * Structure is documented below.
     * @return builder
     */
    def executionSpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanExecutionSpecArgs.Builder]):
        com.pulumi.gcp.dataplex.DatascanArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanExecutionSpecArgs.builder
      builder.executionSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.DatascanIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.DatascanIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.DatascanIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.DatascanIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.EntryArgs.Builder)
    /**
     * @param aspects The aspects that are attached to the entry.
     * Structure is documented below.
     * @return builder
     */
    def aspects(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryAspectArgs.Builder]*):
        com.pulumi.gcp.dataplex.EntryArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryAspectArgs.builder
      builder.aspects(args.map(_(argsBuilder).build)*)

    /**
     * @param entrySource A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    def entrySource(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryEntrySourceArgs.Builder]):
        com.pulumi.gcp.dataplex.EntryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryEntrySourceArgs.builder
      builder.entrySource(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.EntryGroupIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryGroupIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.EntryGroupIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryGroupIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.EntryGroupIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryGroupIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.EntryGroupIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryGroupIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.EntryLinkArgs.Builder)
    /**
     * @param aspects The Aspects attached to the Entry Link.
     * Structure is documented below.
     * @return builder
     */
    def aspects(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryLinkAspectArgs.Builder]*):
        com.pulumi.gcp.dataplex.EntryLinkArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryLinkAspectArgs.builder
      builder.aspects(args.map(_(argsBuilder).build)*)

    /**
     * @param entryReferences Specifies the Entries referenced in the Entry Link. There should be exactly two entry references.
     * Structure is documented below.
     * @return builder
     */
    def entryReferences(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryLinkEntryReferenceArgs.Builder]*):
        com.pulumi.gcp.dataplex.EntryLinkArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryLinkEntryReferenceArgs.builder
      builder.entryReferences(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataplex.EntryTypeArgs.Builder)
    /**
     * @param requiredAspects AspectInfo for the entry type.
     * Structure is documented below.
     * @return builder
     */
    def requiredAspects(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryTypeRequiredAspectArgs.Builder]*):
        com.pulumi.gcp.dataplex.EntryTypeArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryTypeRequiredAspectArgs.builder
      builder.requiredAspects(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataplex.EntryTypeIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryTypeIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.EntryTypeIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryTypeIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.EntryTypeIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryTypeIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.EntryTypeIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryTypeIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.GlossaryIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GlossaryIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.GlossaryIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GlossaryIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.GlossaryIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GlossaryIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.GlossaryIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GlossaryIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.LakeArgs.Builder)
    /**
     * @param metastore Optional. Settings to manage lake and Dataproc Metastore service instance association.
     * @return builder
     */
    def metastore(args: Endofunction[com.pulumi.gcp.dataplex.inputs.LakeMetastoreArgs.Builder]):
        com.pulumi.gcp.dataplex.LakeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.LakeMetastoreArgs.builder
      builder.metastore(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.LakeIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.LakeIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.LakeIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.LakeIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.LakeIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.LakeIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.LakeIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.LakeIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.MetadataFeedArgs.Builder)
    /**
     * @param filters Filters defines the type of changes that you want to listen to. You can have multiple entry type filters and multiple aspect type filters. All of the entry type filters are OR&#39;ed together. All of the aspect type filters are OR&#39;ed together. All of the entry type filters and aspect type filters are AND&#39;ed together.
     * Structure is documented below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.gcp.dataplex.inputs.MetadataFeedFiltersArgs.Builder]):
        com.pulumi.gcp.dataplex.MetadataFeedArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.MetadataFeedFiltersArgs.builder
      builder.filters(args(argsBuilder).build)

    /**
     * @param scope Scope defines the scope of the metadata feed. Scopes are exclusive. Only one of the scopes can be specified.
     * Structure is documented below.
     * @return builder
     */
    def scope(args: Endofunction[com.pulumi.gcp.dataplex.inputs.MetadataFeedScopeArgs.Builder]):
        com.pulumi.gcp.dataplex.MetadataFeedArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.MetadataFeedScopeArgs.builder
      builder.scope(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.TaskArgs.Builder)
    /**
     * @param executionSpec Configuration for the cluster
     * Structure is documented below.
     * @return builder
     */
    def executionSpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskExecutionSpecArgs.Builder]):
        com.pulumi.gcp.dataplex.TaskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskExecutionSpecArgs.builder
      builder.executionSpec(args(argsBuilder).build)

    /**
     * @param notebook A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time.
     * Structure is documented below.
     * @return builder
     */
    def notebook(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskNotebookArgs.Builder]):
        com.pulumi.gcp.dataplex.TaskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskNotebookArgs.builder
      builder.notebook(args(argsBuilder).build)

    /**
     * @param spark A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time.
     * Structure is documented below.
     * @return builder
     */
    def spark(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskSparkArgs.Builder]):
        com.pulumi.gcp.dataplex.TaskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskSparkArgs.builder
      builder.spark(args(argsBuilder).build)

    /**
     * @param triggerSpec Configuration for the cluster
     * Structure is documented below.
     * @return builder
     */
    def triggerSpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskTriggerSpecArgs.Builder]):
        com.pulumi.gcp.dataplex.TaskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskTriggerSpecArgs.builder
      builder.triggerSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.TaskIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.TaskIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.TaskIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.TaskIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.ZoneArgs.Builder)
    /**
     * @param discoverySpec Required. Specification of the discovery feature applied to data in this zone.
     * @return builder
     */
    def discoverySpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.ZoneDiscoverySpecArgs.Builder]):
        com.pulumi.gcp.dataplex.ZoneArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.ZoneDiscoverySpecArgs.builder
      builder.discoverySpec(args(argsBuilder).build)

    /**
     * @param resourceSpec Required. Immutable. Specification of the resources that are referenced by the assets within this zone.
     * @return builder
     */
    def resourceSpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.ZoneResourceSpecArgs.Builder]):
        com.pulumi.gcp.dataplex.ZoneArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.ZoneResourceSpecArgs.builder
      builder.resourceSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.ZoneIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.ZoneIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.ZoneIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.ZoneIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.ZoneIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.ZoneIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.ZoneIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.ZoneIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.AspectTypeIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.AspectTypeIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.AspectTypeIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.AspectTypeIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.AspectTypeIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.AspectTypeIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.AspectTypeIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.AspectTypeIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.AssetDiscoverySpecArgs.Builder)
    /**
     * @param csvOptions Optional. Configuration for CSV data.
     * @return builder
     */
    def csvOptions(args: Endofunction[com.pulumi.gcp.dataplex.inputs.AssetDiscoverySpecCsvOptionsArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.AssetDiscoverySpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.AssetDiscoverySpecCsvOptionsArgs.builder
      builder.csvOptions(args(argsBuilder).build)

    /**
     * @param jsonOptions Optional. Configuration for Json data.
     * @return builder
     */
    def jsonOptions(args: Endofunction[com.pulumi.gcp.dataplex.inputs.AssetDiscoverySpecJsonOptionsArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.AssetDiscoverySpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.AssetDiscoverySpecJsonOptionsArgs.builder
      builder.jsonOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.AssetDiscoveryStatusArgs.Builder)
    /**
     * @param stats Data Stats of the asset reported by discovery.
     * @return builder
     */
    def stats(args: Endofunction[com.pulumi.gcp.dataplex.inputs.AssetDiscoveryStatusStatArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.AssetDiscoveryStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.AssetDiscoveryStatusStatArgs.builder
      builder.stats(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataplex.inputs.AssetIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.AssetIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.AssetIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.AssetIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.AssetIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.AssetIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.AssetIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.AssetIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.AssetState.Builder)
    /**
     * @param discoverySpec Required. Specification of the discovery feature applied to data referenced by this asset. When this spec is left unset, the asset will use the spec set on the parent zone.
     * @return builder
     */
    def discoverySpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.AssetDiscoverySpecArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.AssetState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.AssetDiscoverySpecArgs.builder
      builder.discoverySpec(args(argsBuilder).build)

    /**
     * @param discoveryStatuses Output only. Status of the discovery feature applied to data referenced by this asset.
     * @return builder
     */
    def discoveryStatuses(args: Endofunction[com.pulumi.gcp.dataplex.inputs.AssetDiscoveryStatusArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.AssetState.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.AssetDiscoveryStatusArgs.builder
      builder.discoveryStatuses(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceSpec Required. Immutable. Specification of the resource that is referenced by this asset.
     * @return builder
     */
    def resourceSpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.AssetResourceSpecArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.AssetState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.AssetResourceSpecArgs.builder
      builder.resourceSpec(args(argsBuilder).build)

    /**
     * @param resourceStatuses Output only. Status of the resource referenced by this asset.
     * @return builder
     */
    def resourceStatuses(args: Endofunction[com.pulumi.gcp.dataplex.inputs.AssetResourceStatusArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.AssetState.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.AssetResourceStatusArgs.builder
      builder.resourceStatuses(args.map(_(argsBuilder).build)*)

    /**
     * @param securityStatuses Output only. Status of the security policy applied to resource referenced by this asset.
     * @return builder
     */
    def securityStatuses(args: Endofunction[com.pulumi.gcp.dataplex.inputs.AssetSecurityStatusArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.AssetState.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.AssetSecurityStatusArgs.builder
      builder.securityStatuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DataAssetState.Builder)
    /**
     * @param accessGroupConfigs Access groups configurations.
     * Structure is documented below.
     * @return builder
     */
    def accessGroupConfigs(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DataAssetAccessGroupConfigArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.DataAssetState.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.DataAssetAccessGroupConfigArgs.builder
      builder.accessGroupConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DataProductAccessGroupArgs.Builder)
    /**
     * @param principal The principal entity.
     * Structure is documented below.
     * @return builder
     */
    def principal(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DataProductAccessGroupPrincipalArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DataProductAccessGroupArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DataProductAccessGroupPrincipalArgs.builder
      builder.principal(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DataProductDataAssetState.Builder)
    /**
     * @param accessGroupConfigs Access groups configurations.
     * Structure is documented below.
     * @return builder
     */
    def accessGroupConfigs(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DataProductDataAssetAccessGroupConfigArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.DataProductDataAssetState.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.DataProductDataAssetAccessGroupConfigArgs.builder
      builder.accessGroupConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DataProductIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DataProductIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DataProductIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DataProductIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DataProductIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DataProductIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DataProductIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DataProductIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DataProductState.Builder)
    /**
     * @param accessApprovalConfig Configuration for access approval for the data product.
     * Structure is documented below.
     * @return builder
     */
    def accessApprovalConfig(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DataProductAccessApprovalConfigArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DataProductState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DataProductAccessApprovalConfigArgs.builder
      builder.accessApprovalConfig(args(argsBuilder).build)

    /**
     * @param accessGroups Custom user defined access groups at the data product level.
     * Structure is documented below.
     * @return builder
     */
    def accessGroups(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DataProductAccessGroupArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.DataProductState.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.DataProductAccessGroupArgs.builder
      builder.accessGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DatascanDataDiscoverySpecArgs.Builder)
    /**
     * @param bigqueryPublishingConfig Configuration for metadata publishing.
     * Structure is documented below.
     * @return builder
     */
    def bigqueryPublishingConfig(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataDiscoverySpecBigqueryPublishingConfigArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataDiscoverySpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataDiscoverySpecBigqueryPublishingConfigArgs.builder
      builder.bigqueryPublishingConfig(args(argsBuilder).build)

    /**
     * @param storageConfig Configurations related to Cloud Storage as the data source.
     * Structure is documented below.
     * @return builder
     */
    def storageConfig(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataDiscoverySpecStorageConfigArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataDiscoverySpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataDiscoverySpecStorageConfigArgs.builder
      builder.storageConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DatascanDataDiscoverySpecStorageConfigArgs.Builder)
    /**
     * @param csvOptions Configuration for CSV data.
     * Structure is documented below.
     * @return builder
     */
    def csvOptions(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataDiscoverySpecStorageConfigCsvOptionsArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataDiscoverySpecStorageConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataDiscoverySpecStorageConfigCsvOptionsArgs.builder
      builder.csvOptions(args(argsBuilder).build)

    /**
     * @param jsonOptions Configuration for JSON data.
     * Structure is documented below.
     * @return builder
     */
    def jsonOptions(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataDiscoverySpecStorageConfigJsonOptionsArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataDiscoverySpecStorageConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataDiscoverySpecStorageConfigJsonOptionsArgs.builder
      builder.jsonOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DatascanDataProfileSpecArgs.Builder)
    /**
     * @param excludeFields The fields to exclude from data profile.
     * If specified, the fields will be excluded from data profile, regardless of `includeFields` value.
     * Structure is documented below.
     * @return builder
     */
    def excludeFields(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataProfileSpecExcludeFieldsArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataProfileSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataProfileSpecExcludeFieldsArgs.builder
      builder.excludeFields(args(argsBuilder).build)

    /**
     * @param includeFields The fields to include in data profile.
     * If not specified, all fields at the time of profile scan job execution are included, except for ones listed in `excludeFields`.
     * Structure is documented below.
     * @return builder
     */
    def includeFields(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataProfileSpecIncludeFieldsArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataProfileSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataProfileSpecIncludeFieldsArgs.builder
      builder.includeFields(args(argsBuilder).build)

    /**
     * @param postScanActions Actions to take upon job completion.
     * Structure is documented below.
     * @return builder
     */
    def postScanActions(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataProfileSpecPostScanActionsArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataProfileSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataProfileSpecPostScanActionsArgs.builder
      builder.postScanActions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DatascanDataProfileSpecPostScanActionsArgs.Builder)
    /**
     * @param bigqueryExport If set, results will be exported to the provided BigQuery table.
     * Structure is documented below.
     * @return builder
     */
    def bigqueryExport(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataProfileSpecPostScanActionsBigqueryExportArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataProfileSpecPostScanActionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataProfileSpecPostScanActionsBigqueryExportArgs.builder
      builder.bigqueryExport(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecArgs.Builder)
    /**
     * @param postScanActions Actions to take upon job completion.
     * Structure is documented below.
     * @return builder
     */
    def postScanActions(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsArgs.builder
      builder.postScanActions(args(argsBuilder).build)

    /**
     * @param rules The list of rules to evaluate against a data source. At least one rule is required.
     * Structure is documented below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsArgs.Builder)
    /**
     * @param bigqueryExport If set, results will be exported to the provided BigQuery table.
     * Structure is documented below.
     * @return builder
     */
    def bigqueryExport(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsBigqueryExportArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsBigqueryExportArgs.builder
      builder.bigqueryExport(args(argsBuilder).build)

    /**
     * @param notificationReport The configuration of notification report post scan action.
     * Structure is documented below.
     * @return builder
     */
    def notificationReport(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsNotificationReportArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsNotificationReportArgs.builder
      builder.notificationReport(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsNotificationReportArgs.Builder)
    /**
     * @param jobEndTrigger This trigger is triggered whenever a scan job run ends, regardless of the result.
     * @return builder
     */
    def jobEndTrigger(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsNotificationReportJobEndTriggerArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsNotificationReportArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsNotificationReportJobEndTriggerArgs.builder
      builder.jobEndTrigger(args(argsBuilder).build)

    /**
     * @param jobFailureTrigger This trigger is triggered when the scan job itself fails, regardless of the result.
     * @return builder
     */
    def jobFailureTrigger(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsNotificationReportJobFailureTriggerArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsNotificationReportArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsNotificationReportJobFailureTriggerArgs.builder
      builder.jobFailureTrigger(args(argsBuilder).build)

    /**
     * @param recipients The individuals or groups who are designated to receive notifications upon triggers.
     * Structure is documented below.
     * @return builder
     */
    def recipients(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsNotificationReportRecipientsArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsNotificationReportArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsNotificationReportRecipientsArgs.builder
      builder.recipients(args(argsBuilder).build)

    /**
     * @param scoreThresholdTrigger This trigger is triggered when the DQ score in the job result is less than a specified input score.
     * Structure is documented below.
     * @return builder
     */
    def scoreThresholdTrigger(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsNotificationReportScoreThresholdTriggerArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsNotificationReportArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecPostScanActionsNotificationReportScoreThresholdTriggerArgs.builder
      builder.scoreThresholdTrigger(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleArgs.Builder)
    /**
     * @param nonNullExpectation ColumnMap rule which evaluates whether each column value is null.
     * @return builder
     */
    def nonNullExpectation(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleNonNullExpectationArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleNonNullExpectationArgs.builder
      builder.nonNullExpectation(args(argsBuilder).build)

    /**
     * @param rangeExpectation ColumnMap rule which evaluates whether each column value lies between a specified range.
     * Structure is documented below.
     * @return builder
     */
    def rangeExpectation(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleRangeExpectationArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleRangeExpectationArgs.builder
      builder.rangeExpectation(args(argsBuilder).build)

    /**
     * @param regexExpectation ColumnMap rule which evaluates whether each column value matches a specified regex.
     * Structure is documented below.
     * @return builder
     */
    def regexExpectation(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleRegexExpectationArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleRegexExpectationArgs.builder
      builder.regexExpectation(args(argsBuilder).build)

    /**
     * @param rowConditionExpectation Table rule which evaluates whether each row passes the specified condition.
     * Structure is documented below.
     * @return builder
     */
    def rowConditionExpectation(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleRowConditionExpectationArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleRowConditionExpectationArgs.builder
      builder.rowConditionExpectation(args(argsBuilder).build)

    /**
     * @param setExpectation ColumnMap rule which evaluates whether each column value is contained by a specified set.
     * Structure is documented below.
     * @return builder
     */
    def setExpectation(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleSetExpectationArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleSetExpectationArgs.builder
      builder.setExpectation(args(argsBuilder).build)

    /**
     * @param sqlAssertion Table rule which evaluates whether any row matches invalid state.
     * Structure is documented below.
     * @return builder
     */
    def sqlAssertion(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleSqlAssertionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleSqlAssertionArgs.builder
      builder.sqlAssertion(args(argsBuilder).build)

    /**
     * @param statisticRangeExpectation ColumnAggregate rule which evaluates whether the column aggregate statistic lies between a specified range.
     * Structure is documented below.
     * @return builder
     */
    def statisticRangeExpectation(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleStatisticRangeExpectationArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleStatisticRangeExpectationArgs.builder
      builder.statisticRangeExpectation(args(argsBuilder).build)

    /**
     * @param tableConditionExpectation Table rule which evaluates whether the provided expression is true.
     * Structure is documented below.
     * @return builder
     */
    def tableConditionExpectation(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleTableConditionExpectationArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleTableConditionExpectationArgs.builder
      builder.tableConditionExpectation(args(argsBuilder).build)

    /**
     * @param templateReference Aggregate rule which references a rule template and provides the parameters to be substituted in the template.
     * Structure is documented below.
     * @return builder
     */
    def templateReference(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleTemplateReferenceArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleTemplateReferenceArgs.builder
      builder.templateReference(args(argsBuilder).build)

    /**
     * @param uniquenessExpectation Row-level rule which evaluates whether each column value is unique.
     * @return builder
     */
    def uniquenessExpectation(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleUniquenessExpectationArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleUniquenessExpectationArgs.builder
      builder.uniquenessExpectation(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleTemplateReferenceArgs.Builder)
    /**
     * @param values The map of parameter name and value.
     * Structure is documented below.
     * @return builder
     */
    def values(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleTemplateReferenceValueArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleTemplateReferenceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecRuleTemplateReferenceValueArgs.builder
      builder.values(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DatascanExecutionIdentityArgs.Builder)
    /**
     * @param dataplexServiceAgent The Dataplex service agent associated with the user&#39;s project.
     * @return builder
     */
    def dataplexServiceAgent(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanExecutionIdentityDataplexServiceAgentArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanExecutionIdentityArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanExecutionIdentityDataplexServiceAgentArgs.builder
      builder.dataplexServiceAgent(args(argsBuilder).build)

    /**
     * @param serviceAccount Service account to use to execute a datascan.
     * Structure is documented below.
     * @return builder
     */
    def serviceAccount(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanExecutionIdentityServiceAccountArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanExecutionIdentityArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanExecutionIdentityServiceAccountArgs.builder
      builder.serviceAccount(args(argsBuilder).build)

    /**
     * @param userCredential The credential of the calling user. Supports only ONE_TIME trigger type.
     * @return builder
     */
    def userCredential(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanExecutionIdentityUserCredentialArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanExecutionIdentityArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanExecutionIdentityUserCredentialArgs.builder
      builder.userCredential(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DatascanExecutionSpecArgs.Builder)
    /**
     * @param trigger Spec related to how often and when a scan should be triggered.
     * Structure is documented below.
     * @return builder
     */
    def trigger(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanExecutionSpecTriggerArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanExecutionSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanExecutionSpecTriggerArgs.builder
      builder.trigger(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DatascanExecutionSpecTriggerArgs.Builder)
    /**
     * @param onDemand The scan runs once via dataScans.run API.
     * @return builder
     */
    def onDemand(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanExecutionSpecTriggerOnDemandArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanExecutionSpecTriggerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanExecutionSpecTriggerOnDemandArgs.builder
      builder.onDemand(args(argsBuilder).build)

    /**
     * @param oneTime The scan runs once upon DataScan creation.
     * Structure is documented below.
     * @return builder
     */
    def oneTime(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanExecutionSpecTriggerOneTimeArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanExecutionSpecTriggerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanExecutionSpecTriggerOneTimeArgs.builder
      builder.oneTime(args(argsBuilder).build)

    /**
     * @param schedule The scan is scheduled to run periodically.
     * Structure is documented below.
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanExecutionSpecTriggerScheduleArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanExecutionSpecTriggerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanExecutionSpecTriggerScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DatascanIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DatascanIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.DatascanState.Builder)
    /**
     * @param data The data source for DataScan.
     * Structure is documented below.
     * @return builder
     */
    def data(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataArgs.builder
      builder.data(args(argsBuilder).build)

    /**
     * @param dataDiscoverySpec DataDiscoveryScan related setting.
     * Structure is documented below.
     * @return builder
     */
    def dataDiscoverySpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataDiscoverySpecArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataDiscoverySpecArgs.builder
      builder.dataDiscoverySpec(args(argsBuilder).build)

    /**
     * @param dataDocumentationSpec DataDocumentationScan related setting.
     * Structure is documented below.
     * @return builder
     */
    def dataDocumentationSpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataDocumentationSpecArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataDocumentationSpecArgs.builder
      builder.dataDocumentationSpec(args(argsBuilder).build)

    /**
     * @param dataProfileSpec DataProfileScan related setting.
     * Structure is documented below.
     * @return builder
     */
    def dataProfileSpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataProfileSpecArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataProfileSpecArgs.builder
      builder.dataProfileSpec(args(argsBuilder).build)

    /**
     * @param dataQualitySpec DataQualityScan related setting.
     * Structure is documented below.
     * @return builder
     */
    def dataQualitySpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanDataQualitySpecArgs.builder
      builder.dataQualitySpec(args(argsBuilder).build)

    /**
     * @param executionIdentity The identity to run the datascan. If not specified, defaults to the Dataplex Service Agent.
     * Structure is documented below.
     * @return builder
     */
    def executionIdentity(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanExecutionIdentityArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanExecutionIdentityArgs.builder
      builder.executionIdentity(args(argsBuilder).build)

    /**
     * @param executionSpec DataScan execution settings.
     * Structure is documented below.
     * @return builder
     */
    def executionSpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanExecutionSpecArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.DatascanState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanExecutionSpecArgs.builder
      builder.executionSpec(args(argsBuilder).build)

    /**
     * @param executionStatuses Status of the data scan execution.
     * Structure is documented below.
     * @return builder
     */
    def executionStatuses(args: Endofunction[com.pulumi.gcp.dataplex.inputs.DatascanExecutionStatusArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.DatascanState.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.DatascanExecutionStatusArgs.builder
      builder.executionStatuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataplex.inputs.EntryAspectArgs.Builder)
    /**
     * @param aspect A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    def aspect(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryAspectAspectArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.EntryAspectArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryAspectAspectArgs.builder
      builder.aspect(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.EntryEntrySourceArgs.Builder)
    /**
     * @param ancestors Structure is documented below.
     * @return builder
     */
    def ancestors(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryEntrySourceAncestorArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.EntryEntrySourceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryEntrySourceAncestorArgs.builder
      builder.ancestors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataplex.inputs.EntryGroupIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryGroupIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.EntryGroupIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryGroupIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.EntryGroupIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryGroupIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.EntryGroupIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryGroupIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.EntryLinkAspectArgs.Builder)
    /**
     * @param aspect A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    def aspect(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryLinkAspectAspectArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.EntryLinkAspectArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryLinkAspectAspectArgs.builder
      builder.aspect(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.EntryLinkState.Builder)
    /**
     * @param aspects The Aspects attached to the Entry Link.
     * Structure is documented below.
     * @return builder
     */
    def aspects(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryLinkAspectArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.EntryLinkState.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryLinkAspectArgs.builder
      builder.aspects(args.map(_(argsBuilder).build)*)

    /**
     * @param entryReferences Specifies the Entries referenced in the Entry Link. There should be exactly two entry references.
     * Structure is documented below.
     * @return builder
     */
    def entryReferences(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryLinkEntryReferenceArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.EntryLinkState.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryLinkEntryReferenceArgs.builder
      builder.entryReferences(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataplex.inputs.EntryState.Builder)
    /**
     * @param aspects The aspects that are attached to the entry.
     * Structure is documented below.
     * @return builder
     */
    def aspects(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryAspectArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.EntryState.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryAspectArgs.builder
      builder.aspects(args.map(_(argsBuilder).build)*)

    /**
     * @param entrySource A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    def entrySource(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryEntrySourceArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.EntryState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryEntrySourceArgs.builder
      builder.entrySource(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.EntryTypeIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryTypeIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.EntryTypeIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryTypeIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.EntryTypeIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryTypeIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.EntryTypeIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryTypeIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.EntryTypeState.Builder)
    /**
     * @param requiredAspects AspectInfo for the entry type.
     * Structure is documented below.
     * @return builder
     */
    def requiredAspects(args: Endofunction[com.pulumi.gcp.dataplex.inputs.EntryTypeRequiredAspectArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.EntryTypeState.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.EntryTypeRequiredAspectArgs.builder
      builder.requiredAspects(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataplex.inputs.GlossaryIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GlossaryIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.GlossaryIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GlossaryIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.GlossaryIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.GlossaryIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.GlossaryIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.GlossaryIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.LakeIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.LakeIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.LakeIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.LakeIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.LakeIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.LakeIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.LakeIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.LakeIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.LakeState.Builder)
    /**
     * @param assetStatuses Output only. Aggregated status of the underlying assets of the lake.
     * @return builder
     */
    def assetStatuses(args: Endofunction[com.pulumi.gcp.dataplex.inputs.LakeAssetStatusArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.LakeState.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.LakeAssetStatusArgs.builder
      builder.assetStatuses(args.map(_(argsBuilder).build)*)

    /**
     * @param metastore Optional. Settings to manage lake and Dataproc Metastore service instance association.
     * @return builder
     */
    def metastore(args: Endofunction[com.pulumi.gcp.dataplex.inputs.LakeMetastoreArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.LakeState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.LakeMetastoreArgs.builder
      builder.metastore(args(argsBuilder).build)

    /**
     * @param metastoreStatuses Output only. Metastore status of the lake.
     * @return builder
     */
    def metastoreStatuses(args: Endofunction[com.pulumi.gcp.dataplex.inputs.LakeMetastoreStatusArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.LakeState.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.LakeMetastoreStatusArgs.builder
      builder.metastoreStatuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataplex.inputs.MetadataFeedState.Builder)
    /**
     * @param filters Filters defines the type of changes that you want to listen to. You can have multiple entry type filters and multiple aspect type filters. All of the entry type filters are OR&#39;ed together. All of the aspect type filters are OR&#39;ed together. All of the entry type filters and aspect type filters are AND&#39;ed together.
     * Structure is documented below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.gcp.dataplex.inputs.MetadataFeedFiltersArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.MetadataFeedState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.MetadataFeedFiltersArgs.builder
      builder.filters(args(argsBuilder).build)

    /**
     * @param scope Scope defines the scope of the metadata feed. Scopes are exclusive. Only one of the scopes can be specified.
     * Structure is documented below.
     * @return builder
     */
    def scope(args: Endofunction[com.pulumi.gcp.dataplex.inputs.MetadataFeedScopeArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.MetadataFeedState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.MetadataFeedScopeArgs.builder
      builder.scope(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.TaskExecutionStatusArgs.Builder)
    /**
     * @param latestJobs (Output)
     * latest job execution.
     * Structure is documented below.
     * @return builder
     */
    def latestJobs(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskExecutionStatusLatestJobArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.TaskExecutionStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskExecutionStatusLatestJobArgs.builder
      builder.latestJobs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dataplex.inputs.TaskIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.TaskIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.TaskIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.TaskIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.TaskNotebookArgs.Builder)
    /**
     * @param infrastructureSpec Infrastructure specification for the execution.
     * Structure is documented below.
     * @return builder
     */
    def infrastructureSpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskNotebookInfrastructureSpecArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.TaskNotebookArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskNotebookInfrastructureSpecArgs.builder
      builder.infrastructureSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.TaskNotebookInfrastructureSpecArgs.Builder)
    /**
     * @param batch Compute resources needed for a Task when using Dataproc Serverless.
     * Structure is documented below.
     * @return builder
     */
    def batch(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskNotebookInfrastructureSpecBatchArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.TaskNotebookInfrastructureSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskNotebookInfrastructureSpecBatchArgs.builder
      builder.batch(args(argsBuilder).build)

    /**
     * @param containerImage Container Image Runtime Configuration.
     * Structure is documented below.
     * @return builder
     */
    def containerImage(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskNotebookInfrastructureSpecContainerImageArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.TaskNotebookInfrastructureSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskNotebookInfrastructureSpecContainerImageArgs.builder
      builder.containerImage(args(argsBuilder).build)

    /**
     * @param vpcNetwork Vpc network.
     * Structure is documented below.
     * @return builder
     */
    def vpcNetwork(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskNotebookInfrastructureSpecVpcNetworkArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.TaskNotebookInfrastructureSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskNotebookInfrastructureSpecVpcNetworkArgs.builder
      builder.vpcNetwork(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.TaskSparkArgs.Builder)
    /**
     * @param infrastructureSpec Infrastructure specification for the execution.
     * Structure is documented below.
     * @return builder
     */
    def infrastructureSpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskSparkInfrastructureSpecArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.TaskSparkArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskSparkInfrastructureSpecArgs.builder
      builder.infrastructureSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.TaskSparkInfrastructureSpecArgs.Builder)
    /**
     * @param batch Compute resources needed for a Task when using Dataproc Serverless.
     * Structure is documented below.
     * @return builder
     */
    def batch(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskSparkInfrastructureSpecBatchArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.TaskSparkInfrastructureSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskSparkInfrastructureSpecBatchArgs.builder
      builder.batch(args(argsBuilder).build)

    /**
     * @param containerImage Container Image Runtime Configuration.
     * Structure is documented below.
     * @return builder
     */
    def containerImage(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskSparkInfrastructureSpecContainerImageArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.TaskSparkInfrastructureSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskSparkInfrastructureSpecContainerImageArgs.builder
      builder.containerImage(args(argsBuilder).build)

    /**
     * @param vpcNetwork Vpc network.
     * Structure is documented below.
     * @return builder
     */
    def vpcNetwork(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskSparkInfrastructureSpecVpcNetworkArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.TaskSparkInfrastructureSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskSparkInfrastructureSpecVpcNetworkArgs.builder
      builder.vpcNetwork(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.TaskState.Builder)
    /**
     * @param executionSpec Configuration for the cluster
     * Structure is documented below.
     * @return builder
     */
    def executionSpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskExecutionSpecArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.TaskState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskExecutionSpecArgs.builder
      builder.executionSpec(args(argsBuilder).build)

    /**
     * @param executionStatuses Configuration for the cluster
     * Structure is documented below.
     * @return builder
     */
    def executionStatuses(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskExecutionStatusArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.TaskState.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskExecutionStatusArgs.builder
      builder.executionStatuses(args.map(_(argsBuilder).build)*)

    /**
     * @param notebook A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time.
     * Structure is documented below.
     * @return builder
     */
    def notebook(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskNotebookArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.TaskState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskNotebookArgs.builder
      builder.notebook(args(argsBuilder).build)

    /**
     * @param spark A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time.
     * Structure is documented below.
     * @return builder
     */
    def spark(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskSparkArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.TaskState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskSparkArgs.builder
      builder.spark(args(argsBuilder).build)

    /**
     * @param triggerSpec Configuration for the cluster
     * Structure is documented below.
     * @return builder
     */
    def triggerSpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.TaskTriggerSpecArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.TaskState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.TaskTriggerSpecArgs.builder
      builder.triggerSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.ZoneDiscoverySpecArgs.Builder)
    /**
     * @param csvOptions Optional. Configuration for CSV data.
     * @return builder
     */
    def csvOptions(args: Endofunction[com.pulumi.gcp.dataplex.inputs.ZoneDiscoverySpecCsvOptionsArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.ZoneDiscoverySpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.ZoneDiscoverySpecCsvOptionsArgs.builder
      builder.csvOptions(args(argsBuilder).build)

    /**
     * @param jsonOptions Optional. Configuration for Json data.
     * @return builder
     */
    def jsonOptions(args: Endofunction[com.pulumi.gcp.dataplex.inputs.ZoneDiscoverySpecJsonOptionsArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.ZoneDiscoverySpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.ZoneDiscoverySpecJsonOptionsArgs.builder
      builder.jsonOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.ZoneIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.ZoneIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.ZoneIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.ZoneIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.ZoneIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.dataplex.inputs.ZoneIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.ZoneIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.ZoneIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dataplex.inputs.ZoneState.Builder)
    /**
     * @param assetStatuses Output only. Aggregated status of the underlying assets of the zone.
     * @return builder
     */
    def assetStatuses(args: Endofunction[com.pulumi.gcp.dataplex.inputs.ZoneAssetStatusArgs.Builder]*):
        com.pulumi.gcp.dataplex.inputs.ZoneState.Builder =
      def argsBuilder = com.pulumi.gcp.dataplex.inputs.ZoneAssetStatusArgs.builder
      builder.assetStatuses(args.map(_(argsBuilder).build)*)

    /**
     * @param discoverySpec Required. Specification of the discovery feature applied to data in this zone.
     * @return builder
     */
    def discoverySpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.ZoneDiscoverySpecArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.ZoneState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.ZoneDiscoverySpecArgs.builder
      builder.discoverySpec(args(argsBuilder).build)

    /**
     * @param resourceSpec Required. Immutable. Specification of the resources that are referenced by the assets within this zone.
     * @return builder
     */
    def resourceSpec(args: Endofunction[com.pulumi.gcp.dataplex.inputs.ZoneResourceSpecArgs.Builder]):
        com.pulumi.gcp.dataplex.inputs.ZoneState.Builder =
      val argsBuilder = com.pulumi.gcp.dataplex.inputs.ZoneResourceSpecArgs.builder
      builder.resourceSpec(args(argsBuilder).build)
