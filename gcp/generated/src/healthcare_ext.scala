package jp.ukiba.ko_pulumi
package gcp

object healthcare_ext:
  extension (builder: com.pulumi.gcp.healthcare.ConsentStoreIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.ConsentStoreIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.ConsentStoreIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.ConsentStoreIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.ConsentStoreIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.ConsentStoreIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.ConsentStoreIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.ConsentStoreIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.DatasetArgs.Builder)
    /**
     * @param encryptionSpec A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def encryptionSpec(args: Endofunction[com.pulumi.gcp.healthcare.inputs.DatasetEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.healthcare.DatasetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.DatasetEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.DatasetIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.DatasetIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.DatasetIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.DatasetIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.DatasetIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.DatasetIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.DatasetIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.DatasetIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.DicomStoreArgs.Builder)
    /**
     * @param notificationConfig A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def notificationConfig(args: Endofunction[com.pulumi.gcp.healthcare.inputs.DicomStoreNotificationConfigArgs.Builder]):
        com.pulumi.gcp.healthcare.DicomStoreArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.DicomStoreNotificationConfigArgs.builder
      builder.notificationConfig(args(argsBuilder).build)

    /**
     * @param streamConfigs (Optional, Beta)
     * To enable streaming to BigQuery, configure the streamConfigs object in your DICOM store.
     * streamConfigs is an array, so you can specify multiple BigQuery destinations. You can stream metadata from a single DICOM store to up to five BigQuery tables in a BigQuery dataset.
     * Structure is documented below.
     * @return builder
     */
    inline def streamConfigs(args: Endofunction[com.pulumi.gcp.healthcare.inputs.DicomStoreStreamConfigArgs.Builder]*):
        com.pulumi.gcp.healthcare.DicomStoreArgs.Builder =
      def argsBuilder = com.pulumi.gcp.healthcare.inputs.DicomStoreStreamConfigArgs.builder
      builder.streamConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.healthcare.DicomStoreIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.DicomStoreIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.DicomStoreIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.DicomStoreIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.DicomStoreIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.DicomStoreIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.DicomStoreIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.DicomStoreIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.FhirStoreArgs.Builder)
    /**
     * @param consentConfig (Optional, Beta)
     * Specifies whether this store has consent enforcement. Not available for DSTU2 FHIR version due to absence of Consent resources. Not supported for R5 FHIR version.
     * Structure is documented below.
     * @return builder
     */
    inline def consentConfig(args: Endofunction[com.pulumi.gcp.healthcare.inputs.FhirStoreConsentConfigArgs.Builder]):
        com.pulumi.gcp.healthcare.FhirStoreArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.FhirStoreConsentConfigArgs.builder
      builder.consentConfig(args(argsBuilder).build)

    /**
     * @param notificationConfig (Optional, Deprecated)
     * A nested object resource.
     * Structure is documented below.
     * 
     * &gt; **Warning:** `notificationConfig` is deprecated and will be removed in a future major release. Use `notificationConfigs` instead.
     * @return builder
     * @deprecated `notificationConfig` is deprecated and will be removed in a future major release. Use `notificationConfigs` instead.
     */
    @deprecated("`notificationConfig` is deprecated and will be removed in a future major release. Use `notificationConfigs` instead.") inline def notificationConfig(args: Endofunction[com.pulumi.gcp.healthcare.inputs.FhirStoreNotificationConfigArgs.Builder]):
        com.pulumi.gcp.healthcare.FhirStoreArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.FhirStoreNotificationConfigArgs.builder
      builder.notificationConfig(args(argsBuilder).build)

    /**
     * @param notificationConfigs A list of notifcation configs that configure the notification for every resource mutation in this FHIR store.
     * Structure is documented below.
     * @return builder
     */
    inline def notificationConfigs(args: Endofunction[com.pulumi.gcp.healthcare.inputs.FhirStoreNotificationConfigArgs.Builder]*):
        com.pulumi.gcp.healthcare.FhirStoreArgs.Builder =
      def argsBuilder = com.pulumi.gcp.healthcare.inputs.FhirStoreNotificationConfigArgs.builder
      builder.notificationConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param streamConfigs A list of streaming configs that configure the destinations of streaming export for every resource mutation in
     * this FHIR store. Each store is allowed to have up to 10 streaming configs. After a new config is added, the next
     * resource mutation is streamed to the new location in addition to the existing ones. When a location is removed
     * from the list, the server stops streaming to that location. Before adding a new config, you must add the required
     * bigquery.dataEditor role to your project&#39;s Cloud Healthcare Service Agent service account. Some lag (typically on
     * the order of dozens of seconds) is expected before the results show up in the streaming destination.
     * Structure is documented below.
     * @return builder
     */
    inline def streamConfigs(args: Endofunction[com.pulumi.gcp.healthcare.inputs.FhirStoreStreamConfigArgs.Builder]*):
        com.pulumi.gcp.healthcare.FhirStoreArgs.Builder =
      def argsBuilder = com.pulumi.gcp.healthcare.inputs.FhirStoreStreamConfigArgs.builder
      builder.streamConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param validationConfig Configuration for how to validate incoming FHIR resources against configured profiles.
     * Structure is documented below.
     * @return builder
     */
    inline def validationConfig(args: Endofunction[com.pulumi.gcp.healthcare.inputs.FhirStoreValidationConfigArgs.Builder]):
        com.pulumi.gcp.healthcare.FhirStoreArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.FhirStoreValidationConfigArgs.builder
      builder.validationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.FhirStoreIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.FhirStoreIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.FhirStoreIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.FhirStoreIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.FhirStoreIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.FhirStoreIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.FhirStoreIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.FhirStoreIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.Hl7StoreArgs.Builder)
    /**
     * @param notificationConfig (Optional, Deprecated)
     * A nested object resource.
     * Structure is documented below.
     * 
     * &gt; **Warning:** `notificationConfig` is deprecated and will be removed in a future major release. Use `notificationConfigs` instead.
     * @return builder
     * @deprecated `notificationConfig` is deprecated and will be removed in a future major release. Use `notificationConfigs` instead.
     */
    @deprecated("`notificationConfig` is deprecated and will be removed in a future major release. Use `notificationConfigs` instead.") inline def notificationConfig(args: Endofunction[com.pulumi.gcp.healthcare.inputs.Hl7StoreNotificationConfigArgs.Builder]):
        com.pulumi.gcp.healthcare.Hl7StoreArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.Hl7StoreNotificationConfigArgs.builder
      builder.notificationConfig(args(argsBuilder).build)

    /**
     * @param notificationConfigs A list of notification configs. Each configuration uses a filter to determine whether to publish a
     * message (both Ingest &amp; Create) on the corresponding notification destination. Only the message name
     * is sent as part of the notification. Supplied by the client.
     * Structure is documented below.
     * @return builder
     */
    inline def notificationConfigs(args: Endofunction[com.pulumi.gcp.healthcare.inputs.Hl7StoreNotificationConfigsArgs.Builder]*):
        com.pulumi.gcp.healthcare.Hl7StoreArgs.Builder =
      def argsBuilder = com.pulumi.gcp.healthcare.inputs.Hl7StoreNotificationConfigsArgs.builder
      builder.notificationConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param parserConfig A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def parserConfig(args: Endofunction[com.pulumi.gcp.healthcare.inputs.Hl7StoreParserConfigArgs.Builder]):
        com.pulumi.gcp.healthcare.Hl7StoreArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.Hl7StoreParserConfigArgs.builder
      builder.parserConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.Hl7StoreIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.Hl7StoreIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.Hl7StoreIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.Hl7StoreIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.Hl7StoreIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.Hl7StoreIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.Hl7StoreIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.Hl7StoreIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.PipelineJobArgs.Builder)
    /**
     * @param backfillPipelineJob Specifies the backfill configuration.
     * Structure is documented below.
     * @return builder
     */
    inline def backfillPipelineJob(args: Endofunction[com.pulumi.gcp.healthcare.inputs.PipelineJobBackfillPipelineJobArgs.Builder]):
        com.pulumi.gcp.healthcare.PipelineJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.PipelineJobBackfillPipelineJobArgs.builder
      builder.backfillPipelineJob(args(argsBuilder).build)

    /**
     * @param mappingPipelineJob Specifies mapping configuration.
     * Structure is documented below.
     * @return builder
     */
    inline def mappingPipelineJob(args: Endofunction[com.pulumi.gcp.healthcare.inputs.PipelineJobMappingPipelineJobArgs.Builder]):
        com.pulumi.gcp.healthcare.PipelineJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.PipelineJobMappingPipelineJobArgs.builder
      builder.mappingPipelineJob(args(argsBuilder).build)

    /**
     * @param reconciliationPipelineJob Specifies reconciliation configuration.
     * Structure is documented below.
     * @return builder
     */
    inline def reconciliationPipelineJob(args: Endofunction[com.pulumi.gcp.healthcare.inputs.PipelineJobReconciliationPipelineJobArgs.Builder]):
        com.pulumi.gcp.healthcare.PipelineJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.PipelineJobReconciliationPipelineJobArgs.builder
      builder.reconciliationPipelineJob(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.WorkspaceArgs.Builder)
    /**
     * @param settings Settings associated with this workspace.
     * Structure is documented below.
     * @return builder
     */
    inline def settings(args: Endofunction[com.pulumi.gcp.healthcare.inputs.WorkspaceSettingsArgs.Builder]):
        com.pulumi.gcp.healthcare.WorkspaceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.WorkspaceSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.ConsentStoreIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.ConsentStoreIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.ConsentStoreIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.ConsentStoreIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.ConsentStoreIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.ConsentStoreIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.ConsentStoreIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.ConsentStoreIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.DatasetIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.DatasetIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.DatasetIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.DatasetIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.DatasetIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.DatasetIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.DatasetIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.DatasetIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.DatasetState.Builder)
    /**
     * @param encryptionSpec A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def encryptionSpec(args: Endofunction[com.pulumi.gcp.healthcare.inputs.DatasetEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.DatasetState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.DatasetEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.DicomStoreIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.DicomStoreIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.DicomStoreIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.DicomStoreIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.DicomStoreIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.DicomStoreIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.DicomStoreIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.DicomStoreIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.DicomStoreState.Builder)
    /**
     * @param notificationConfig A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def notificationConfig(args: Endofunction[com.pulumi.gcp.healthcare.inputs.DicomStoreNotificationConfigArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.DicomStoreState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.DicomStoreNotificationConfigArgs.builder
      builder.notificationConfig(args(argsBuilder).build)

    /**
     * @param streamConfigs (Optional, Beta)
     * To enable streaming to BigQuery, configure the streamConfigs object in your DICOM store.
     * streamConfigs is an array, so you can specify multiple BigQuery destinations. You can stream metadata from a single DICOM store to up to five BigQuery tables in a BigQuery dataset.
     * Structure is documented below.
     * @return builder
     */
    inline def streamConfigs(args: Endofunction[com.pulumi.gcp.healthcare.inputs.DicomStoreStreamConfigArgs.Builder]*):
        com.pulumi.gcp.healthcare.inputs.DicomStoreState.Builder =
      def argsBuilder = com.pulumi.gcp.healthcare.inputs.DicomStoreStreamConfigArgs.builder
      builder.streamConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.healthcare.inputs.DicomStoreStreamConfigArgs.Builder)
    /**
     * @param bigqueryDestination BigQueryDestination to include a fully qualified BigQuery table URI where DICOM instance metadata will be streamed.
     * Structure is documented below.
     * @return builder
     */
    inline def bigqueryDestination(args: Endofunction[com.pulumi.gcp.healthcare.inputs.DicomStoreStreamConfigBigqueryDestinationArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.DicomStoreStreamConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.DicomStoreStreamConfigBigqueryDestinationArgs.builder
      builder.bigqueryDestination(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.FhirStoreConsentConfigArgs.Builder)
    /**
     * @param accessDeterminationLogConfig Specifies how the server logs the consent-aware requests. If not specified, the AccessDeterminationLogConfig.LogLevel.MINIMUM option is used.
     * Structure is documented below.
     * @return builder
     */
    inline def accessDeterminationLogConfig(args: Endofunction[com.pulumi.gcp.healthcare.inputs.FhirStoreConsentConfigAccessDeterminationLogConfigArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.FhirStoreConsentConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.FhirStoreConsentConfigAccessDeterminationLogConfigArgs.builder
      builder.accessDeterminationLogConfig(args(argsBuilder).build)

    /**
     * @param consentHeaderHandling Different options to configure the behaviour of the server when handling the X-Consent-Scope header.
     * Structure is documented below.
     * @return builder
     */
    inline def consentHeaderHandling(args: Endofunction[com.pulumi.gcp.healthcare.inputs.FhirStoreConsentConfigConsentHeaderHandlingArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.FhirStoreConsentConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.FhirStoreConsentConfigConsentHeaderHandlingArgs.builder
      builder.consentHeaderHandling(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.FhirStoreIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.FhirStoreIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.FhirStoreIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.FhirStoreIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.FhirStoreIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.FhirStoreIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.FhirStoreIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.FhirStoreIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.FhirStoreState.Builder)
    /**
     * @param consentConfig (Optional, Beta)
     * Specifies whether this store has consent enforcement. Not available for DSTU2 FHIR version due to absence of Consent resources. Not supported for R5 FHIR version.
     * Structure is documented below.
     * @return builder
     */
    inline def consentConfig(args: Endofunction[com.pulumi.gcp.healthcare.inputs.FhirStoreConsentConfigArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.FhirStoreState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.FhirStoreConsentConfigArgs.builder
      builder.consentConfig(args(argsBuilder).build)

    /**
     * @param notificationConfig (Optional, Deprecated)
     * A nested object resource.
     * Structure is documented below.
     * 
     * &gt; **Warning:** `notificationConfig` is deprecated and will be removed in a future major release. Use `notificationConfigs` instead.
     * @return builder
     * @deprecated `notificationConfig` is deprecated and will be removed in a future major release. Use `notificationConfigs` instead.
     */
    @deprecated("`notificationConfig` is deprecated and will be removed in a future major release. Use `notificationConfigs` instead.") inline def notificationConfig(args: Endofunction[com.pulumi.gcp.healthcare.inputs.FhirStoreNotificationConfigArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.FhirStoreState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.FhirStoreNotificationConfigArgs.builder
      builder.notificationConfig(args(argsBuilder).build)

    /**
     * @param notificationConfigs A list of notifcation configs that configure the notification for every resource mutation in this FHIR store.
     * Structure is documented below.
     * @return builder
     */
    inline def notificationConfigs(args: Endofunction[com.pulumi.gcp.healthcare.inputs.FhirStoreNotificationConfigArgs.Builder]*):
        com.pulumi.gcp.healthcare.inputs.FhirStoreState.Builder =
      def argsBuilder = com.pulumi.gcp.healthcare.inputs.FhirStoreNotificationConfigArgs.builder
      builder.notificationConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param streamConfigs A list of streaming configs that configure the destinations of streaming export for every resource mutation in
     * this FHIR store. Each store is allowed to have up to 10 streaming configs. After a new config is added, the next
     * resource mutation is streamed to the new location in addition to the existing ones. When a location is removed
     * from the list, the server stops streaming to that location. Before adding a new config, you must add the required
     * bigquery.dataEditor role to your project&#39;s Cloud Healthcare Service Agent service account. Some lag (typically on
     * the order of dozens of seconds) is expected before the results show up in the streaming destination.
     * Structure is documented below.
     * @return builder
     */
    inline def streamConfigs(args: Endofunction[com.pulumi.gcp.healthcare.inputs.FhirStoreStreamConfigArgs.Builder]*):
        com.pulumi.gcp.healthcare.inputs.FhirStoreState.Builder =
      def argsBuilder = com.pulumi.gcp.healthcare.inputs.FhirStoreStreamConfigArgs.builder
      builder.streamConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param validationConfig Configuration for how to validate incoming FHIR resources against configured profiles.
     * Structure is documented below.
     * @return builder
     */
    inline def validationConfig(args: Endofunction[com.pulumi.gcp.healthcare.inputs.FhirStoreValidationConfigArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.FhirStoreState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.FhirStoreValidationConfigArgs.builder
      builder.validationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.FhirStoreStreamConfigArgs.Builder)
    /**
     * @param bigqueryDestination The destination BigQuery structure that contains both the dataset location and corresponding schema config.
     * The output is organized in one table per resource type. The server reuses the existing tables (if any) that
     * are named after the resource types, e.g. &#34;Patient&#34;, &#34;Observation&#34;. When there is no existing table for a given
     * resource type, the server attempts to create one.
     * See the [streaming config reference](https://cloud.google.com/healthcare/docs/reference/rest/v1beta1/projects.locations.datasets.fhirStores#streamconfig) for more details.
     * Structure is documented below.
     * @return builder
     */
    inline def bigqueryDestination(args: Endofunction[com.pulumi.gcp.healthcare.inputs.FhirStoreStreamConfigBigqueryDestinationArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.FhirStoreStreamConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.FhirStoreStreamConfigBigqueryDestinationArgs.builder
      builder.bigqueryDestination(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.FhirStoreStreamConfigBigqueryDestinationArgs.Builder)
    /**
     * @param schemaConfig The configuration for the exported BigQuery schema.
     * Structure is documented below.
     * @return builder
     */
    inline def schemaConfig(args: Endofunction[com.pulumi.gcp.healthcare.inputs.FhirStoreStreamConfigBigqueryDestinationSchemaConfigArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.FhirStoreStreamConfigBigqueryDestinationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.FhirStoreStreamConfigBigqueryDestinationSchemaConfigArgs.builder
      builder.schemaConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.FhirStoreStreamConfigBigqueryDestinationSchemaConfigArgs.Builder)
    /**
     * @param lastUpdatedPartitionConfig The configuration for exported BigQuery tables to be partitioned by FHIR resource&#39;s last updated time column.
     * Structure is documented below.
     * @return builder
     */
    inline def lastUpdatedPartitionConfig(args: Endofunction[com.pulumi.gcp.healthcare.inputs.FhirStoreStreamConfigBigqueryDestinationSchemaConfigLastUpdatedPartitionConfigArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.FhirStoreStreamConfigBigqueryDestinationSchemaConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.FhirStoreStreamConfigBigqueryDestinationSchemaConfigLastUpdatedPartitionConfigArgs.builder
      builder.lastUpdatedPartitionConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.Hl7StoreIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.Hl7StoreIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.Hl7StoreIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.Hl7StoreIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.Hl7StoreIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.Hl7StoreIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.Hl7StoreIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.Hl7StoreIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.Hl7StoreState.Builder)
    /**
     * @param notificationConfig (Optional, Deprecated)
     * A nested object resource.
     * Structure is documented below.
     * 
     * &gt; **Warning:** `notificationConfig` is deprecated and will be removed in a future major release. Use `notificationConfigs` instead.
     * @return builder
     * @deprecated `notificationConfig` is deprecated and will be removed in a future major release. Use `notificationConfigs` instead.
     */
    @deprecated("`notificationConfig` is deprecated and will be removed in a future major release. Use `notificationConfigs` instead.") inline def notificationConfig(args: Endofunction[com.pulumi.gcp.healthcare.inputs.Hl7StoreNotificationConfigArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.Hl7StoreState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.Hl7StoreNotificationConfigArgs.builder
      builder.notificationConfig(args(argsBuilder).build)

    /**
     * @param notificationConfigs A list of notification configs. Each configuration uses a filter to determine whether to publish a
     * message (both Ingest &amp; Create) on the corresponding notification destination. Only the message name
     * is sent as part of the notification. Supplied by the client.
     * Structure is documented below.
     * @return builder
     */
    inline def notificationConfigs(args: Endofunction[com.pulumi.gcp.healthcare.inputs.Hl7StoreNotificationConfigsArgs.Builder]*):
        com.pulumi.gcp.healthcare.inputs.Hl7StoreState.Builder =
      def argsBuilder = com.pulumi.gcp.healthcare.inputs.Hl7StoreNotificationConfigsArgs.builder
      builder.notificationConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param parserConfig A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    inline def parserConfig(args: Endofunction[com.pulumi.gcp.healthcare.inputs.Hl7StoreParserConfigArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.Hl7StoreState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.Hl7StoreParserConfigArgs.builder
      builder.parserConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.PipelineJobMappingPipelineJobArgs.Builder)
    /**
     * @param fhirStreamingSource A streaming FHIR data source.
     * Structure is documented below.
     * @return builder
     */
    inline def fhirStreamingSource(args: Endofunction[com.pulumi.gcp.healthcare.inputs.PipelineJobMappingPipelineJobFhirStreamingSourceArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.PipelineJobMappingPipelineJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.PipelineJobMappingPipelineJobFhirStreamingSourceArgs.builder
      builder.fhirStreamingSource(args(argsBuilder).build)

    /**
     * @param mappingConfig The location of the mapping configuration.
     * Structure is documented below.
     * @return builder
     */
    inline def mappingConfig(args: Endofunction[com.pulumi.gcp.healthcare.inputs.PipelineJobMappingPipelineJobMappingConfigArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.PipelineJobMappingPipelineJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.PipelineJobMappingPipelineJobMappingConfigArgs.builder
      builder.mappingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.PipelineJobMappingPipelineJobMappingConfigArgs.Builder)
    /**
     * @param whistleConfigSource Specifies the path to the mapping configuration for harmonization pipeline.
     * Structure is documented below.
     * @return builder
     */
    inline def whistleConfigSource(args: Endofunction[com.pulumi.gcp.healthcare.inputs.PipelineJobMappingPipelineJobMappingConfigWhistleConfigSourceArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.PipelineJobMappingPipelineJobMappingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.PipelineJobMappingPipelineJobMappingConfigWhistleConfigSourceArgs.builder
      builder.whistleConfigSource(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.PipelineJobReconciliationPipelineJobArgs.Builder)
    /**
     * @param mergeConfig Specifies the location of the reconciliation configuration.
     * Structure is documented below.
     * @return builder
     */
    inline def mergeConfig(args: Endofunction[com.pulumi.gcp.healthcare.inputs.PipelineJobReconciliationPipelineJobMergeConfigArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.PipelineJobReconciliationPipelineJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.PipelineJobReconciliationPipelineJobMergeConfigArgs.builder
      builder.mergeConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.PipelineJobReconciliationPipelineJobMergeConfigArgs.Builder)
    /**
     * @param whistleConfigSource Specifies the path to the mapping configuration for harmonization pipeline.
     * Structure is documented below.
     * @return builder
     */
    inline def whistleConfigSource(args: Endofunction[com.pulumi.gcp.healthcare.inputs.PipelineJobReconciliationPipelineJobMergeConfigWhistleConfigSourceArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.PipelineJobReconciliationPipelineJobMergeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.PipelineJobReconciliationPipelineJobMergeConfigWhistleConfigSourceArgs.builder
      builder.whistleConfigSource(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.PipelineJobState.Builder)
    /**
     * @param backfillPipelineJob Specifies the backfill configuration.
     * Structure is documented below.
     * @return builder
     */
    inline def backfillPipelineJob(args: Endofunction[com.pulumi.gcp.healthcare.inputs.PipelineJobBackfillPipelineJobArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.PipelineJobState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.PipelineJobBackfillPipelineJobArgs.builder
      builder.backfillPipelineJob(args(argsBuilder).build)

    /**
     * @param mappingPipelineJob Specifies mapping configuration.
     * Structure is documented below.
     * @return builder
     */
    inline def mappingPipelineJob(args: Endofunction[com.pulumi.gcp.healthcare.inputs.PipelineJobMappingPipelineJobArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.PipelineJobState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.PipelineJobMappingPipelineJobArgs.builder
      builder.mappingPipelineJob(args(argsBuilder).build)

    /**
     * @param reconciliationPipelineJob Specifies reconciliation configuration.
     * Structure is documented below.
     * @return builder
     */
    inline def reconciliationPipelineJob(args: Endofunction[com.pulumi.gcp.healthcare.inputs.PipelineJobReconciliationPipelineJobArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.PipelineJobState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.PipelineJobReconciliationPipelineJobArgs.builder
      builder.reconciliationPipelineJob(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.WorkspaceState.Builder)
    /**
     * @param settings Settings associated with this workspace.
     * Structure is documented below.
     * @return builder
     */
    inline def settings(args: Endofunction[com.pulumi.gcp.healthcare.inputs.WorkspaceSettingsArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.WorkspaceState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.WorkspaceSettingsArgs.builder
      builder.settings(args(argsBuilder).build)
