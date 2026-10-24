package jp.ukiba.ko_pulumi
package gcp

object bigqueryanalyticshub_ext:
  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.DataExchangeArgs.Builder)
    /**
     * @param sharingEnvironmentConfig Configurable data sharing environment option for a data exchange.
     * This field is required for data clean room exchanges.
     * Structure is documented below.
     * @return builder
     */
    def sharingEnvironmentConfig(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSharingEnvironmentConfigArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.DataExchangeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSharingEnvironmentConfigArgs.builder
      builder.sharingEnvironmentConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.DataExchangeSubscriptionArgs.Builder)
    /**
     * @param destinationDataset BigQuery destination dataset to create for the subscriber.
     * Structure is documented below.
     * @return builder
     */
    def destinationDataset(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSubscriptionDestinationDatasetArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.DataExchangeSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSubscriptionDestinationDatasetArgs.builder
      builder.destinationDataset(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.ListingArgs.Builder)
    /**
     * @param bigqueryDataset Shared dataset i.e. BigQuery dataset source.
     * Structure is documented below.
     * @return builder
     */
    def bigqueryDataset(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingBigqueryDatasetArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.ListingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingBigqueryDatasetArgs.builder
      builder.bigqueryDataset(args(argsBuilder).build)

    /**
     * @param dataProvider Details of the data provider who owns the source data.
     * Structure is documented below.
     * @return builder
     */
    def dataProvider(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingDataProviderArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.ListingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingDataProviderArgs.builder
      builder.dataProvider(args(argsBuilder).build)

    /**
     * @param publisher Details of the publisher who owns the listing and who can share the source data.
     * Structure is documented below.
     * @return builder
     */
    def publisher(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingPublisherArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.ListingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingPublisherArgs.builder
      builder.publisher(args(argsBuilder).build)

    /**
     * @param pubsubTopic Pub/Sub topic source.
     * Structure is documented below.
     * @return builder
     */
    def pubsubTopic(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingPubsubTopicArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.ListingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingPubsubTopicArgs.builder
      builder.pubsubTopic(args(argsBuilder).build)

    /**
     * @param restrictedExportConfig If set, restricted export configuration will be propagated and enforced on the linked dataset.
     * Structure is documented below.
     * @return builder
     */
    def restrictedExportConfig(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingRestrictedExportConfigArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.ListingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingRestrictedExportConfigArgs.builder
      builder.restrictedExportConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.ListingIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.ListingIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.ListingIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.ListingIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.ListingSubscriptionArgs.Builder)
    /**
     * @param destinationDataset The destination dataset for this subscription.
     * Structure is documented below.
     * @return builder
     */
    def destinationDataset(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationDatasetArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.ListingSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationDatasetArgs.builder
      builder.destinationDataset(args(argsBuilder).build)

    /**
     * @param destinationPubsubSubscription Destination Pub/Sub subscription to create for the subscriber.
     * Structure is documented below.
     * @return builder
     */
    def destinationPubsubSubscription(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationPubsubSubscriptionArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.ListingSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationPubsubSubscriptionArgs.builder
      builder.destinationPubsubSubscription(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.QueryTemplateArgs.Builder)
    /**
     * @param encryptionConfiguration Encryption configuration for the query template.
     * If set, the customer-managed KMS key is used to encrypt the query
     * template definition body.
     * Structure is documented below.
     * @return builder
     */
    def encryptionConfiguration(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.QueryTemplateEncryptionConfigurationArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.QueryTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.QueryTemplateEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

    /**
     * @param routine The routine associated with the QueryTemplate.
     * Structure is documented below.
     * @return builder
     */
    def routine(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.QueryTemplateRoutineArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.QueryTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.QueryTemplateRoutineArgs.builder
      builder.routine(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSharingEnvironmentConfigArgs.Builder)
    /**
     * @param dcrExchangeConfig Data Clean Room (DCR), used for privacy-safe and secured data sharing.
     * @return builder
     */
    def dcrExchangeConfig(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSharingEnvironmentConfigDcrExchangeConfigArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSharingEnvironmentConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSharingEnvironmentConfigDcrExchangeConfigArgs.builder
      builder.dcrExchangeConfig(args(argsBuilder).build)

    /**
     * @param defaultExchangeConfig Default Analytics Hub data exchange, used for secured data sharing.
     * @return builder
     */
    def defaultExchangeConfig(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSharingEnvironmentConfigDefaultExchangeConfigArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSharingEnvironmentConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSharingEnvironmentConfigDefaultExchangeConfigArgs.builder
      builder.defaultExchangeConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeState.Builder)
    /**
     * @param sharingEnvironmentConfig Configurable data sharing environment option for a data exchange.
     * This field is required for data clean room exchanges.
     * Structure is documented below.
     * @return builder
     */
    def sharingEnvironmentConfig(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSharingEnvironmentConfigArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeState.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSharingEnvironmentConfigArgs.builder
      builder.sharingEnvironmentConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSubscriptionDestinationDatasetArgs.Builder)
    /**
     * @param datasetReference A reference that identifies the destination dataset.
     * Structure is documented below.
     * @return builder
     */
    def datasetReference(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSubscriptionDestinationDatasetDatasetReferenceArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSubscriptionDestinationDatasetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSubscriptionDestinationDatasetDatasetReferenceArgs.builder
      builder.datasetReference(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSubscriptionState.Builder)
    /**
     * @param destinationDataset BigQuery destination dataset to create for the subscriber.
     * Structure is documented below.
     * @return builder
     */
    def destinationDataset(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSubscriptionDestinationDatasetArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSubscriptionState.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSubscriptionDestinationDatasetArgs.builder
      builder.destinationDataset(args(argsBuilder).build)

    /**
     * @param linkedDatasetMaps Output only. Map of listing resource names to associated linked resource,
     * e.g. projects/123/locations/us/dataExchanges/456/listings/789 &gt; projects/123/datasets/my_dataset
     * For Data Exchange subscriptions, this map may contain multiple entries if the Data Exchange has multiple listings.
     * Structure is documented below.
     * @return builder
     */
    def linkedDatasetMaps(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSubscriptionLinkedDatasetMapArgs.Builder]*):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSubscriptionState.Builder =
      def argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSubscriptionLinkedDatasetMapArgs.builder
      builder.linkedDatasetMaps(args.map(_(argsBuilder).build)*)

    /**
     * @param linkedResources Output only. Linked resources created in the subscription. Only contains values if state = STATE_ACTIVE.
     * Structure is documented below.
     * @return builder
     */
    def linkedResources(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSubscriptionLinkedResourceArgs.Builder]*):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSubscriptionState.Builder =
      def argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSubscriptionLinkedResourceArgs.builder
      builder.linkedResources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingBigqueryDatasetArgs.Builder)
    /**
     * @param effectiveReplicas (Output)
     * Server owned effective state of replicas. Contains both primary and secondary replicas.
     * Each replica includes a system-computed (output-only) state and primary designation.
     * Structure is documented below.
     * @return builder
     */
    def effectiveReplicas(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingBigqueryDatasetEffectiveReplicaArgs.Builder]*):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingBigqueryDatasetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingBigqueryDatasetEffectiveReplicaArgs.builder
      builder.effectiveReplicas(args.map(_(argsBuilder).build)*)

    /**
     * @param selectedResources Resource in this dataset that is selectively shared. This field is required for data clean room exchanges.
     * Structure is documented below.
     * @return builder
     */
    def selectedResources(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingBigqueryDatasetSelectedResourceArgs.Builder]*):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingBigqueryDatasetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingBigqueryDatasetSelectedResourceArgs.builder
      builder.selectedResources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingCommercialInfoArgs.Builder)
    /**
     * @param cloudMarketplaces (Output)
     * Details of the Marketplace Data Product associated with the Listing.
     * Structure is documented below.
     * @return builder
     */
    def cloudMarketplaces(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingCommercialInfoCloudMarketplaceArgs.Builder]*):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingCommercialInfoArgs.Builder =
      def argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingCommercialInfoCloudMarketplaceArgs.builder
      builder.cloudMarketplaces(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingState.Builder)
    /**
     * @param bigqueryDataset Shared dataset i.e. BigQuery dataset source.
     * Structure is documented below.
     * @return builder
     */
    def bigqueryDataset(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingBigqueryDatasetArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingState.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingBigqueryDatasetArgs.builder
      builder.bigqueryDataset(args(argsBuilder).build)

    /**
     * @param commercialInfos Commercial info contains the information about the commercial data products associated with the listing.
     * Structure is documented below.
     * @return builder
     */
    def commercialInfos(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingCommercialInfoArgs.Builder]*):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingState.Builder =
      def argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingCommercialInfoArgs.builder
      builder.commercialInfos(args.map(_(argsBuilder).build)*)

    /**
     * @param dataProvider Details of the data provider who owns the source data.
     * Structure is documented below.
     * @return builder
     */
    def dataProvider(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingDataProviderArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingState.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingDataProviderArgs.builder
      builder.dataProvider(args(argsBuilder).build)

    /**
     * @param publisher Details of the publisher who owns the listing and who can share the source data.
     * Structure is documented below.
     * @return builder
     */
    def publisher(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingPublisherArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingState.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingPublisherArgs.builder
      builder.publisher(args(argsBuilder).build)

    /**
     * @param pubsubTopic Pub/Sub topic source.
     * Structure is documented below.
     * @return builder
     */
    def pubsubTopic(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingPubsubTopicArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingState.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingPubsubTopicArgs.builder
      builder.pubsubTopic(args(argsBuilder).build)

    /**
     * @param restrictedExportConfig If set, restricted export configuration will be propagated and enforced on the linked dataset.
     * Structure is documented below.
     * @return builder
     */
    def restrictedExportConfig(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingRestrictedExportConfigArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingState.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingRestrictedExportConfigArgs.builder
      builder.restrictedExportConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionCommercialInfoArgs.Builder)
    /**
     * @param cloudMarketplaces (Output)
     * Cloud Marketplace commercial metadata for this subscription.
     * Structure is documented below.
     * @return builder
     */
    def cloudMarketplaces(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionCommercialInfoCloudMarketplaceArgs.Builder]*):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionCommercialInfoArgs.Builder =
      def argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionCommercialInfoCloudMarketplaceArgs.builder
      builder.cloudMarketplaces(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationDatasetArgs.Builder)
    /**
     * @param datasetReference A reference that identifies the destination dataset.
     * Structure is documented below.
     * @return builder
     */
    def datasetReference(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationDatasetDatasetReferenceArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationDatasetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationDatasetDatasetReferenceArgs.builder
      builder.datasetReference(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationPubsubSubscriptionArgs.Builder)
    /**
     * @param pubsubSubscription Destination Pub/Sub subscription resource.
     * Structure is documented below.
     * @return builder
     */
    def pubsubSubscription(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationPubsubSubscriptionPubsubSubscriptionArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationPubsubSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationPubsubSubscriptionPubsubSubscriptionArgs.builder
      builder.pubsubSubscription(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationPubsubSubscriptionPubsubSubscriptionArgs.Builder)
    /**
     * @param bigqueryConfig If delivery to BigQuery is used with this subscription, this field is used to configure it.
     * Structure is documented below.
     * @return builder
     */
    def bigqueryConfig(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationPubsubSubscriptionPubsubSubscriptionBigqueryConfigArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationPubsubSubscriptionPubsubSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationPubsubSubscriptionPubsubSubscriptionBigqueryConfigArgs.builder
      builder.bigqueryConfig(args(argsBuilder).build)

    /**
     * @param cloudStorageConfig If delivery to Google Cloud Storage is used with this subscription, this field is used to configure it.
     * Structure is documented below.
     * @return builder
     */
    def cloudStorageConfig(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationPubsubSubscriptionPubsubSubscriptionCloudStorageConfigArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationPubsubSubscriptionPubsubSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationPubsubSubscriptionPubsubSubscriptionCloudStorageConfigArgs.builder
      builder.cloudStorageConfig(args(argsBuilder).build)

    /**
     * @param deadLetterPolicy A policy that specifies the conditions for dead lettering messages in this subscription. If
     * `deadLetterPolicy` is not set, dead lettering is disabled. The Pub/Sub service account associated
     * with this subscriptions&#39;s parent project (i.e.,
     * service-{project_number}{@literal @}gcp-sa-pubsub.iam.gserviceaccount.com) must have permission to
     * Acknowledge() messages on this subscription.
     * Structure is documented below.
     * @return builder
     */
    def deadLetterPolicy(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationPubsubSubscriptionPubsubSubscriptionDeadLetterPolicyArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationPubsubSubscriptionPubsubSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationPubsubSubscriptionPubsubSubscriptionDeadLetterPolicyArgs.builder
      builder.deadLetterPolicy(args(argsBuilder).build)

    /**
     * @param expirationPolicy A policy that specifies the conditions for this subscription&#39;s expiration. A subscription is
     * considered active as long as any connected subscriber is successfully consuming messages from
     * the subscription or is issuing operations on the subscription. If `expirationPolicy` is not
     * set, a default policy with `ttl` of 31 days will be used. The minimum allowed value for
     * `expirationPolicy.ttl` is 1 day. If `expirationPolicy` is set, but `expirationPolicy.ttl`
     * is not set, the subscription never expires.
     * Structure is documented below.
     * @return builder
     */
    def expirationPolicy(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationPubsubSubscriptionPubsubSubscriptionExpirationPolicyArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationPubsubSubscriptionPubsubSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationPubsubSubscriptionPubsubSubscriptionExpirationPolicyArgs.builder
      builder.expirationPolicy(args(argsBuilder).build)

    /**
     * @param pushConfig If push delivery is used with this subscription, this field is used to configure it.
     * Structure is documented below.
     * @return builder
     */
    def pushConfig(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationPubsubSubscriptionPubsubSubscriptionPushConfigArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationPubsubSubscriptionPubsubSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationPubsubSubscriptionPubsubSubscriptionPushConfigArgs.builder
      builder.pushConfig(args(argsBuilder).build)

    /**
     * @param retryPolicy A policy that specifies how Pub/Sub retries message delivery for this subscription. If not set,
     * the default retry policy is applied. This generally implies that messages will be retried as soon
     * as possible for healthy subscribers. RetryPolicy will be triggered on NACKs or acknowledgement
     * deadline exceeded events for a given message.
     * Structure is documented below.
     * @return builder
     */
    def retryPolicy(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationPubsubSubscriptionPubsubSubscriptionRetryPolicyArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationPubsubSubscriptionPubsubSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationPubsubSubscriptionPubsubSubscriptionRetryPolicyArgs.builder
      builder.retryPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationPubsubSubscriptionPubsubSubscriptionCloudStorageConfigArgs.Builder)
    /**
     * @param avroConfig If set, message data will be written to Cloud Storage in Avro format.
     * Structure is documented below.
     * @return builder
     */
    def avroConfig(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationPubsubSubscriptionPubsubSubscriptionCloudStorageConfigAvroConfigArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationPubsubSubscriptionPubsubSubscriptionCloudStorageConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationPubsubSubscriptionPubsubSubscriptionCloudStorageConfigAvroConfigArgs.builder
      builder.avroConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationPubsubSubscriptionPubsubSubscriptionPushConfigArgs.Builder)
    /**
     * @param noWrapper When set, the payload to the push endpoint is not wrapped.
     * Structure is documented below.
     * @return builder
     */
    def noWrapper(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationPubsubSubscriptionPubsubSubscriptionPushConfigNoWrapperArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationPubsubSubscriptionPubsubSubscriptionPushConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationPubsubSubscriptionPubsubSubscriptionPushConfigNoWrapperArgs.builder
      builder.noWrapper(args(argsBuilder).build)

    /**
     * @param oidcToken If specified, Pub/Sub will generate and attach an OIDC JWT token as an
     * Authorization header in the HTTP request for every pushed message.
     * Structure is documented below.
     * @return builder
     */
    def oidcToken(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationPubsubSubscriptionPubsubSubscriptionPushConfigOidcTokenArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationPubsubSubscriptionPubsubSubscriptionPushConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationPubsubSubscriptionPubsubSubscriptionPushConfigOidcTokenArgs.builder
      builder.oidcToken(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionState.Builder)
    /**
     * @param commercialInfos Commercial info metadata for this subscription. This is set if this is a commercial subscription i.e. if this subscription was created from subscribing to a commercial listing.
     * Structure is documented below.
     * @return builder
     */
    def commercialInfos(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionCommercialInfoArgs.Builder]*):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionState.Builder =
      def argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionCommercialInfoArgs.builder
      builder.commercialInfos(args.map(_(argsBuilder).build)*)

    /**
     * @param destinationDataset The destination dataset for this subscription.
     * Structure is documented below.
     * @return builder
     */
    def destinationDataset(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationDatasetArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionState.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationDatasetArgs.builder
      builder.destinationDataset(args(argsBuilder).build)

    /**
     * @param destinationPubsubSubscription Destination Pub/Sub subscription to create for the subscriber.
     * Structure is documented below.
     * @return builder
     */
    def destinationPubsubSubscription(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationPubsubSubscriptionArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionState.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationPubsubSubscriptionArgs.builder
      builder.destinationPubsubSubscription(args(argsBuilder).build)

    /**
     * @param linkedDatasetMaps Output only. Map of listing resource names to associated linked resource,
     * e.g. projects/123/locations/US/dataExchanges/456/listings/789 &gt; projects/123/datasets/my_dataset
     * Structure is documented below.
     * @return builder
     */
    def linkedDatasetMaps(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionLinkedDatasetMapArgs.Builder]*):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionState.Builder =
      def argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionLinkedDatasetMapArgs.builder
      builder.linkedDatasetMaps(args.map(_(argsBuilder).build)*)

    /**
     * @param linkedResources Output only. Linked resources created in the subscription. Only contains values if state = STATE_ACTIVE.
     * Structure is documented below.
     * @return builder
     */
    def linkedResources(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionLinkedResourceArgs.Builder]*):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionState.Builder =
      def argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionLinkedResourceArgs.builder
      builder.linkedResources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.inputs.QueryTemplateState.Builder)
    /**
     * @param encryptionConfiguration Encryption configuration for the query template.
     * If set, the customer-managed KMS key is used to encrypt the query
     * template definition body.
     * Structure is documented below.
     * @return builder
     */
    def encryptionConfiguration(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.QueryTemplateEncryptionConfigurationArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.QueryTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.QueryTemplateEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

    /**
     * @param routine The routine associated with the QueryTemplate.
     * Structure is documented below.
     * @return builder
     */
    def routine(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.QueryTemplateRoutineArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.QueryTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.QueryTemplateRoutineArgs.builder
      builder.routine(args(argsBuilder).build)
