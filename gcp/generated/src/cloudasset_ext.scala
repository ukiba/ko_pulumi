package jp.ukiba.ko_pulumi
package gcp

object cloudasset_ext:
  extension (builder: com.pulumi.gcp.cloudasset.FolderFeedArgs.Builder)
    /**
     * @param condition A condition which determines whether an asset update should be published. If specified, an asset
     * will be returned only when the expression evaluates to true. When set, expression field
     * must be a valid CEL expression on a TemporalAsset with name temporal_asset. Example: a Feed with
     * expression &#34;temporal_asset.deleted == true&#34; will only publish Asset deletions. Other fields of
     * condition are optional.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.cloudasset.inputs.FolderFeedConditionArgs.Builder]):
        com.pulumi.gcp.cloudasset.FolderFeedArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudasset.inputs.FolderFeedConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param feedOutputConfig Output configuration for asset feed destination.
     * Structure is documented below.
     * @return builder
     */
    inline def feedOutputConfig(args: Endofunction[com.pulumi.gcp.cloudasset.inputs.FolderFeedFeedOutputConfigArgs.Builder]):
        com.pulumi.gcp.cloudasset.FolderFeedArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudasset.inputs.FolderFeedFeedOutputConfigArgs.builder
      builder.feedOutputConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudasset.OrganizationFeedArgs.Builder)
    /**
     * @param condition A condition which determines whether an asset update should be published. If specified, an asset
     * will be returned only when the expression evaluates to true. When set, expression field
     * must be a valid CEL expression on a TemporalAsset with name temporal_asset. Example: a Feed with
     * expression &#34;temporal_asset.deleted == true&#34; will only publish Asset deletions. Other fields of
     * condition are optional.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.cloudasset.inputs.OrganizationFeedConditionArgs.Builder]):
        com.pulumi.gcp.cloudasset.OrganizationFeedArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudasset.inputs.OrganizationFeedConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param feedOutputConfig Output configuration for asset feed destination.
     * Structure is documented below.
     * @return builder
     */
    inline def feedOutputConfig(args: Endofunction[com.pulumi.gcp.cloudasset.inputs.OrganizationFeedFeedOutputConfigArgs.Builder]):
        com.pulumi.gcp.cloudasset.OrganizationFeedArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudasset.inputs.OrganizationFeedFeedOutputConfigArgs.builder
      builder.feedOutputConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudasset.ProjectFeedArgs.Builder)
    /**
     * @param condition A condition which determines whether an asset update should be published. If specified, an asset
     * will be returned only when the expression evaluates to true. When set, expression field
     * must be a valid CEL expression on a TemporalAsset with name temporal_asset. Example: a Feed with
     * expression &#34;temporal_asset.deleted == true&#34; will only publish Asset deletions. Other fields of
     * condition are optional.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.cloudasset.inputs.ProjectFeedConditionArgs.Builder]):
        com.pulumi.gcp.cloudasset.ProjectFeedArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudasset.inputs.ProjectFeedConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param feedOutputConfig Output configuration for asset feed destination.
     * Structure is documented below.
     * @return builder
     */
    inline def feedOutputConfig(args: Endofunction[com.pulumi.gcp.cloudasset.inputs.ProjectFeedFeedOutputConfigArgs.Builder]):
        com.pulumi.gcp.cloudasset.ProjectFeedArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudasset.inputs.ProjectFeedFeedOutputConfigArgs.builder
      builder.feedOutputConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudasset.inputs.FolderFeedFeedOutputConfigArgs.Builder)
    /**
     * @param pubsubDestination Destination on Cloud Pubsub.
     * Structure is documented below.
     * @return builder
     */
    inline def pubsubDestination(args: Endofunction[com.pulumi.gcp.cloudasset.inputs.FolderFeedFeedOutputConfigPubsubDestinationArgs.Builder]):
        com.pulumi.gcp.cloudasset.inputs.FolderFeedFeedOutputConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudasset.inputs.FolderFeedFeedOutputConfigPubsubDestinationArgs.builder
      builder.pubsubDestination(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudasset.inputs.FolderFeedState.Builder)
    /**
     * @param condition A condition which determines whether an asset update should be published. If specified, an asset
     * will be returned only when the expression evaluates to true. When set, expression field
     * must be a valid CEL expression on a TemporalAsset with name temporal_asset. Example: a Feed with
     * expression &#34;temporal_asset.deleted == true&#34; will only publish Asset deletions. Other fields of
     * condition are optional.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.cloudasset.inputs.FolderFeedConditionArgs.Builder]):
        com.pulumi.gcp.cloudasset.inputs.FolderFeedState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudasset.inputs.FolderFeedConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param feedOutputConfig Output configuration for asset feed destination.
     * Structure is documented below.
     * @return builder
     */
    inline def feedOutputConfig(args: Endofunction[com.pulumi.gcp.cloudasset.inputs.FolderFeedFeedOutputConfigArgs.Builder]):
        com.pulumi.gcp.cloudasset.inputs.FolderFeedState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudasset.inputs.FolderFeedFeedOutputConfigArgs.builder
      builder.feedOutputConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudasset.inputs.OrganizationFeedFeedOutputConfigArgs.Builder)
    /**
     * @param pubsubDestination Destination on Cloud Pubsub.
     * Structure is documented below.
     * @return builder
     */
    inline def pubsubDestination(args: Endofunction[com.pulumi.gcp.cloudasset.inputs.OrganizationFeedFeedOutputConfigPubsubDestinationArgs.Builder]):
        com.pulumi.gcp.cloudasset.inputs.OrganizationFeedFeedOutputConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudasset.inputs.OrganizationFeedFeedOutputConfigPubsubDestinationArgs.builder
      builder.pubsubDestination(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudasset.inputs.OrganizationFeedState.Builder)
    /**
     * @param condition A condition which determines whether an asset update should be published. If specified, an asset
     * will be returned only when the expression evaluates to true. When set, expression field
     * must be a valid CEL expression on a TemporalAsset with name temporal_asset. Example: a Feed with
     * expression &#34;temporal_asset.deleted == true&#34; will only publish Asset deletions. Other fields of
     * condition are optional.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.cloudasset.inputs.OrganizationFeedConditionArgs.Builder]):
        com.pulumi.gcp.cloudasset.inputs.OrganizationFeedState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudasset.inputs.OrganizationFeedConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param feedOutputConfig Output configuration for asset feed destination.
     * Structure is documented below.
     * @return builder
     */
    inline def feedOutputConfig(args: Endofunction[com.pulumi.gcp.cloudasset.inputs.OrganizationFeedFeedOutputConfigArgs.Builder]):
        com.pulumi.gcp.cloudasset.inputs.OrganizationFeedState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudasset.inputs.OrganizationFeedFeedOutputConfigArgs.builder
      builder.feedOutputConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudasset.inputs.ProjectFeedFeedOutputConfigArgs.Builder)
    /**
     * @param pubsubDestination Destination on Cloud Pubsub.
     * Structure is documented below.
     * @return builder
     */
    inline def pubsubDestination(args: Endofunction[com.pulumi.gcp.cloudasset.inputs.ProjectFeedFeedOutputConfigPubsubDestinationArgs.Builder]):
        com.pulumi.gcp.cloudasset.inputs.ProjectFeedFeedOutputConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudasset.inputs.ProjectFeedFeedOutputConfigPubsubDestinationArgs.builder
      builder.pubsubDestination(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudasset.inputs.ProjectFeedState.Builder)
    /**
     * @param condition A condition which determines whether an asset update should be published. If specified, an asset
     * will be returned only when the expression evaluates to true. When set, expression field
     * must be a valid CEL expression on a TemporalAsset with name temporal_asset. Example: a Feed with
     * expression &#34;temporal_asset.deleted == true&#34; will only publish Asset deletions. Other fields of
     * condition are optional.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.cloudasset.inputs.ProjectFeedConditionArgs.Builder]):
        com.pulumi.gcp.cloudasset.inputs.ProjectFeedState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudasset.inputs.ProjectFeedConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param feedOutputConfig Output configuration for asset feed destination.
     * Structure is documented below.
     * @return builder
     */
    inline def feedOutputConfig(args: Endofunction[com.pulumi.gcp.cloudasset.inputs.ProjectFeedFeedOutputConfigArgs.Builder]):
        com.pulumi.gcp.cloudasset.inputs.ProjectFeedState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudasset.inputs.ProjectFeedFeedOutputConfigArgs.builder
      builder.feedOutputConfig(args(argsBuilder).build)
