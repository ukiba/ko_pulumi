package jp.ukiba.ko_pulumi
package gcp

object storage_ext:
  extension (builder: com.pulumi.gcp.storage.BatchOperationsJobArgs.Builder)
    /**
     * @param bucketList List of buckets and their objects to be transformed. Currently, only one bucket configuration is supported. If multiple buckets are specified, an error will be returned
     * Structure is documented below.
     * @return builder
     */
    def bucketList(args: Endofunction[com.pulumi.gcp.storage.inputs.BatchOperationsJobBucketListArgs.Builder]):
        com.pulumi.gcp.storage.BatchOperationsJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BatchOperationsJobBucketListArgs.builder
      builder.bucketList(args(argsBuilder).build)

    /**
     * @param deleteObject allows batch operations to delete objects in bucket
     * Structure is documented below.
     * @return builder
     */
    def deleteObject(args: Endofunction[com.pulumi.gcp.storage.inputs.BatchOperationsJobDeleteObjectArgs.Builder]):
        com.pulumi.gcp.storage.BatchOperationsJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BatchOperationsJobDeleteObjectArgs.builder
      builder.deleteObject(args(argsBuilder).build)

    /**
     * @param putMetadata allows batch operations to update metadata for objects in bucket
     * Structure is documented below.
     * @return builder
     */
    def putMetadata(args: Endofunction[com.pulumi.gcp.storage.inputs.BatchOperationsJobPutMetadataArgs.Builder]):
        com.pulumi.gcp.storage.BatchOperationsJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BatchOperationsJobPutMetadataArgs.builder
      builder.putMetadata(args(argsBuilder).build)

    /**
     * @param putObjectHold allows to update temporary hold or eventBased hold for objects in bucket.
     * Structure is documented below.
     * @return builder
     */
    def putObjectHold(args: Endofunction[com.pulumi.gcp.storage.inputs.BatchOperationsJobPutObjectHoldArgs.Builder]):
        com.pulumi.gcp.storage.BatchOperationsJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BatchOperationsJobPutObjectHoldArgs.builder
      builder.putObjectHold(args(argsBuilder).build)

    /**
     * @param rewriteObject allows to update encryption key for objects in bucket.
     * Structure is documented below.
     * @return builder
     */
    def rewriteObject(args: Endofunction[com.pulumi.gcp.storage.inputs.BatchOperationsJobRewriteObjectArgs.Builder]):
        com.pulumi.gcp.storage.BatchOperationsJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BatchOperationsJobRewriteObjectArgs.builder
      builder.rewriteObject(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.BucketArgs.Builder)
    /**
     * @param autoclass The bucket&#39;s [Autoclass](https://cloud.google.com/storage/docs/autoclass) configuration.  Structure is documented below.
     * @return builder
     */
    def autoclass(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketAutoclassArgs.Builder]):
        com.pulumi.gcp.storage.BucketArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketAutoclassArgs.builder
      builder.autoclass(args(argsBuilder).build)

    /**
     * @param cors The bucket&#39;s [Cross-Origin Resource Sharing (CORS)](https://www.w3.org/TR/cors/) configuration. Multiple blocks of this type are permitted. Structure is documented below.
     * @return builder
     */
    def cors(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketCorArgs.Builder]*):
        com.pulumi.gcp.storage.BucketArgs.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.BucketCorArgs.builder
      builder.cors(args.map(_(argsBuilder).build)*)

    /**
     * @param customPlacementConfig The bucket&#39;s custom location configuration, which specifies the individual regions that comprise a dual-region bucket. If the bucket is designated a single or multi-region, the parameters are empty. Structure is documented below.
     * @return builder
     */
    def customPlacementConfig(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketCustomPlacementConfigArgs.Builder]):
        com.pulumi.gcp.storage.BucketArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketCustomPlacementConfigArgs.builder
      builder.customPlacementConfig(args(argsBuilder).build)

    /**
     * @param encryption The bucket&#39;s encryption configuration. Structure is documented below.
     * @return builder
     */
    def encryption(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketEncryptionArgs.Builder]):
        com.pulumi.gcp.storage.BucketArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

    /**
     * @param hierarchicalNamespace The bucket&#39;s hierarchical namespace policy, which defines the bucket capability to handle folders in logical structure. Structure is documented below. To use this configuration, `uniformBucketLevelAccess` must be enabled on bucket.
     * @return builder
     */
    def hierarchicalNamespace(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketHierarchicalNamespaceArgs.Builder]):
        com.pulumi.gcp.storage.BucketArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketHierarchicalNamespaceArgs.builder
      builder.hierarchicalNamespace(args(argsBuilder).build)

    /**
     * @param ipFilter The bucket IP filtering configuration. Specifies the network sources that can access the bucket, as well as its underlying objects. Structure is documented below.
     * @return builder
     */
    def ipFilter(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketIpFilterArgs.Builder]):
        com.pulumi.gcp.storage.BucketArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketIpFilterArgs.builder
      builder.ipFilter(args(argsBuilder).build)

    /**
     * @param lifecycleRules The bucket&#39;s [Lifecycle Rules](https://cloud.google.com/storage/docs/lifecycle#configuration) configuration. Multiple blocks of this type are permitted. Structure is documented below.
     * @return builder
     */
    def lifecycleRules(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketLifecycleRuleArgs.Builder]*):
        com.pulumi.gcp.storage.BucketArgs.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.BucketLifecycleRuleArgs.builder
      builder.lifecycleRules(args.map(_(argsBuilder).build)*)

    /**
     * @param logging The bucket&#39;s [Access &amp; Storage Logs](https://cloud.google.com/storage/docs/access-logs) configuration. Structure is documented below.
     * @return builder
     */
    def logging(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketLoggingArgs.Builder]):
        com.pulumi.gcp.storage.BucketArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketLoggingArgs.builder
      builder.logging(args(argsBuilder).build)

    /**
     * @param retentionPolicy Configuration of the bucket&#39;s data retention policy for how long objects in the bucket should be retained. Structure is documented below.
     * @return builder
     */
    def retentionPolicy(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketRetentionPolicyArgs.Builder]):
        com.pulumi.gcp.storage.BucketArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketRetentionPolicyArgs.builder
      builder.retentionPolicy(args(argsBuilder).build)

    /**
     * @param softDeletePolicy The bucket&#39;s soft delete policy, which defines the period of time that soft-deleted objects will be retained, and cannot be permanently deleted. If the block is not provided, Server side value will be kept which means removal of block won&#39;t generate any terraform change. Structure is documented below.
     * @return builder
     */
    def softDeletePolicy(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketSoftDeletePolicyArgs.Builder]):
        com.pulumi.gcp.storage.BucketArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketSoftDeletePolicyArgs.builder
      builder.softDeletePolicy(args(argsBuilder).build)

    /**
     * @param versioning The bucket&#39;s [Versioning](https://cloud.google.com/storage/docs/object-versioning) configuration.  Structure is documented below.
     * @return builder
     */
    def versioning(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketVersioningArgs.Builder]):
        com.pulumi.gcp.storage.BucketArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketVersioningArgs.builder
      builder.versioning(args(argsBuilder).build)

    /**
     * @param website Configuration if the bucket acts as a website. Structure is documented below.
     * @return builder
     */
    def website(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketWebsiteArgs.Builder]):
        com.pulumi.gcp.storage.BucketArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketWebsiteArgs.builder
      builder.website(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.BucketIAMBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.storage.BucketIAMBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.BucketIAMMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.storage.BucketIAMMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.BucketObjectArgs.Builder)
    /**
     * @param contexts Contexts attached to an object, in key-value pairs. For more information about object contexts, see [Object contexts overview](https://cloud.google.com/storage/docs/object-contexts). Structure is documented below.
     * @return builder
     */
    def contexts(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketObjectContextsArgs.Builder]):
        com.pulumi.gcp.storage.BucketObjectArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketObjectContextsArgs.builder
      builder.contexts(args(argsBuilder).build)

    /**
     * @param customerEncryption Enables object encryption with Customer-Supplied Encryption Key (CSEK). Google [documentation about CSEK.](https://cloud.google.com/storage/docs/encryption/customer-supplied-keys)
     * Structure is documented below.
     * @return builder
     */
    def customerEncryption(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketObjectCustomerEncryptionArgs.Builder]):
        com.pulumi.gcp.storage.BucketObjectArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketObjectCustomerEncryptionArgs.builder
      builder.customerEncryption(args(argsBuilder).build)

    /**
     * @param retention The [object retention](http://cloud.google.com/storage/docs/object-lock) settings for the object. The retention settings allow an object to be retained until a provided date. Structure is documented below.
     * @return builder
     */
    def retention(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketObjectRetentionArgs.Builder]):
        com.pulumi.gcp.storage.BucketObjectArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketObjectRetentionArgs.builder
      builder.retention(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.ControlFolderIntelligenceConfigArgs.Builder)
    /**
     * @param filter Filter over location and bucket using include or exclude semantics. Resources that match the include or exclude filter are exclusively included or excluded from the Storage Intelligence plan.
     * Structure is documented below.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigFilterArgs.Builder]):
        com.pulumi.gcp.storage.ControlFolderIntelligenceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.ControlOrganizationIntelligenceConfigArgs.Builder)
    /**
     * @param filter Filter over location and bucket using include or exclude semantics. Resources that match the include or exclude filter are exclusively included or excluded from the Storage Intelligence plan.
     * Structure is documented below.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigFilterArgs.Builder]):
        com.pulumi.gcp.storage.ControlOrganizationIntelligenceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.ControlProjectIntelligenceConfigArgs.Builder)
    /**
     * @param filter Filter over location and bucket using include or exclude semantics. Resources that match the include or exclude filter are exclusively included or excluded from the Storage Intelligence plan.
     * Structure is documented below.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigFilterArgs.Builder]):
        com.pulumi.gcp.storage.ControlProjectIntelligenceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.FtpServerArgs.Builder)
    /**
     * @param externalConfig Configuration for external access type SFTP servers.
     * Structure is documented below.
     * @return builder
     */
    def externalConfig(args: Endofunction[com.pulumi.gcp.storage.inputs.FtpServerExternalConfigArgs.Builder]):
        com.pulumi.gcp.storage.FtpServerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.FtpServerExternalConfigArgs.builder
      builder.externalConfig(args(argsBuilder).build)

    /**
     * @param internalConfig Configuration for internal access type SFTP servers.
     * Structure is documented below.
     * @return builder
     */
    def internalConfig(args: Endofunction[com.pulumi.gcp.storage.inputs.FtpServerInternalConfigArgs.Builder]):
        com.pulumi.gcp.storage.FtpServerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.FtpServerInternalConfigArgs.builder
      builder.internalConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.FtpUserArgs.Builder)
    /**
     * @param storageDirectoryMappings Directory mappings for the Storage FTP user.
     * Structure is documented below.
     * @return builder
     */
    def storageDirectoryMappings(args: Endofunction[com.pulumi.gcp.storage.inputs.FtpUserStorageDirectoryMappingArgs.Builder]*):
        com.pulumi.gcp.storage.FtpUserArgs.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.FtpUserStorageDirectoryMappingArgs.builder
      builder.storageDirectoryMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param userCredentials The credentials associated with the user.
     * Structure is documented below.
     * @return builder
     */
    def userCredentials(args: Endofunction[com.pulumi.gcp.storage.inputs.FtpUserUserCredentialArgs.Builder]*):
        com.pulumi.gcp.storage.FtpUserArgs.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.FtpUserUserCredentialArgs.builder
      builder.userCredentials(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.storage.InsightsDatasetConfigArgs.Builder)
    /**
     * @param excludeCloudStorageBuckets Defined the options for excluding cloud storage buckets for the DatasetConfig.
     * Structure is documented below.
     * @return builder
     */
    def excludeCloudStorageBuckets(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsDatasetConfigExcludeCloudStorageBucketsArgs.Builder]):
        com.pulumi.gcp.storage.InsightsDatasetConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsDatasetConfigExcludeCloudStorageBucketsArgs.builder
      builder.excludeCloudStorageBuckets(args(argsBuilder).build)

    /**
     * @param excludeCloudStorageLocations Defines the options for excluding cloud storage locations for the DatasetConfig.
     * Structure is documented below.
     * @return builder
     */
    def excludeCloudStorageLocations(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsDatasetConfigExcludeCloudStorageLocationsArgs.Builder]):
        com.pulumi.gcp.storage.InsightsDatasetConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsDatasetConfigExcludeCloudStorageLocationsArgs.builder
      builder.excludeCloudStorageLocations(args(argsBuilder).build)

    /**
     * @param identity Identity used by DatasetConfig.
     * Structure is documented below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsDatasetConfigIdentityArgs.Builder]):
        com.pulumi.gcp.storage.InsightsDatasetConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsDatasetConfigIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param includeCloudStorageBuckets Defines the options for including cloud storage buckets for the DatasetConfig.
     * Structure is documented below.
     * @return builder
     */
    def includeCloudStorageBuckets(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsDatasetConfigIncludeCloudStorageBucketsArgs.Builder]):
        com.pulumi.gcp.storage.InsightsDatasetConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsDatasetConfigIncludeCloudStorageBucketsArgs.builder
      builder.includeCloudStorageBuckets(args(argsBuilder).build)

    /**
     * @param includeCloudStorageLocations Defines the options for including cloud storage locations for the DatasetConfig.
     * Structure is documented below.
     * @return builder
     */
    def includeCloudStorageLocations(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsDatasetConfigIncludeCloudStorageLocationsArgs.Builder]):
        com.pulumi.gcp.storage.InsightsDatasetConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsDatasetConfigIncludeCloudStorageLocationsArgs.builder
      builder.includeCloudStorageLocations(args(argsBuilder).build)

    /**
     * @param sourceFolders Defines the options for providing source folders for the DatasetConfig.
     * Structure is documented below.
     * @return builder
     */
    def sourceFolders(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsDatasetConfigSourceFoldersArgs.Builder]):
        com.pulumi.gcp.storage.InsightsDatasetConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsDatasetConfigSourceFoldersArgs.builder
      builder.sourceFolders(args(argsBuilder).build)

    /**
     * @param sourceProjects Defines the options for providing source projects for the DatasetConfig.
     * Structure is documented below.
     * @return builder
     */
    def sourceProjects(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsDatasetConfigSourceProjectsArgs.Builder]):
        com.pulumi.gcp.storage.InsightsDatasetConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsDatasetConfigSourceProjectsArgs.builder
      builder.sourceProjects(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.InsightsReportConfigArgs.Builder)
    /**
     * @param csvOptions Options for configuring the format of the inventory report CSV file.
     * Structure is documented below.
     * @return builder
     */
    def csvOptions(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsReportConfigCsvOptionsArgs.Builder]):
        com.pulumi.gcp.storage.InsightsReportConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsReportConfigCsvOptionsArgs.builder
      builder.csvOptions(args(argsBuilder).build)

    /**
     * @param frequencyOptions Options for configuring how inventory reports are generated.
     * Structure is documented below.
     * @return builder
     */
    def frequencyOptions(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsReportConfigFrequencyOptionsArgs.Builder]):
        com.pulumi.gcp.storage.InsightsReportConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsReportConfigFrequencyOptionsArgs.builder
      builder.frequencyOptions(args(argsBuilder).build)

    /**
     * @param objectMetadataReportOptions Options for including metadata in an inventory report.
     * Structure is documented below.
     * @return builder
     */
    def objectMetadataReportOptions(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsReportConfigObjectMetadataReportOptionsArgs.Builder]):
        com.pulumi.gcp.storage.InsightsReportConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsReportConfigObjectMetadataReportOptionsArgs.builder
      builder.objectMetadataReportOptions(args(argsBuilder).build)

    /**
     * @param parquetOptions An option for outputting inventory reports as parquet files.
     * @return builder
     */
    def parquetOptions(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsReportConfigParquetOptionsArgs.Builder]):
        com.pulumi.gcp.storage.InsightsReportConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsReportConfigParquetOptionsArgs.builder
      builder.parquetOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.ManagedFolderIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.storage.inputs.ManagedFolderIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.storage.ManagedFolderIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ManagedFolderIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.ManagedFolderIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.storage.inputs.ManagedFolderIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.storage.ManagedFolderIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ManagedFolderIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.TransferAgentPoolArgs.Builder)
    /**
     * @param bandwidthLimit Specifies the bandwidth limit details. If this field is unspecified, the default value is set as &#39;No Limit&#39;.
     * Structure is documented below.
     * @return builder
     */
    def bandwidthLimit(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferAgentPoolBandwidthLimitArgs.Builder]):
        com.pulumi.gcp.storage.TransferAgentPoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferAgentPoolBandwidthLimitArgs.builder
      builder.bandwidthLimit(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.TransferJobArgs.Builder)
    /**
     * @param eventStream Specifies the Event-driven transfer options. Event-driven transfers listen to an event stream to transfer updated files. Structure documented below Either `eventStream` or `schedule` must be set.
     * @return builder
     */
    def eventStream(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobEventStreamArgs.Builder]):
        com.pulumi.gcp.storage.TransferJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobEventStreamArgs.builder
      builder.eventStream(args(argsBuilder).build)

    /**
     * @param loggingConfig Logging configuration. Structure documented below.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobLoggingConfigArgs.Builder]):
        com.pulumi.gcp.storage.TransferJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

    /**
     * @param notificationConfig Notification configuration. This is not supported for transfers involving PosixFilesystem. Structure documented below.
     * @return builder
     */
    def notificationConfig(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobNotificationConfigArgs.Builder]):
        com.pulumi.gcp.storage.TransferJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobNotificationConfigArgs.builder
      builder.notificationConfig(args(argsBuilder).build)

    /**
     * @param replicationSpec Replication specification. Structure documented below. User should not configure `schedule`, `eventStream` with this argument. One of `transferSpec`, or `replicationSpec` must be specified.
     * 
     * ***
     * @return builder
     */
    def replicationSpec(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecArgs.Builder]):
        com.pulumi.gcp.storage.TransferJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecArgs.builder
      builder.replicationSpec(args(argsBuilder).build)

    /**
     * @param schedule Schedule specification defining when the Transfer Job should be scheduled to start, end and what time to run. Structure documented below. Either `schedule` or `eventStream` must be set.
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobScheduleArgs.Builder]):
        com.pulumi.gcp.storage.TransferJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

    /**
     * @param transferSpec Transfer specification. Structure documented below. One of `transferSpec`, or `replicationSpec` can be specified.
     * @return builder
     */
    def transferSpec(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobTransferSpecArgs.Builder]):
        com.pulumi.gcp.storage.TransferJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobTransferSpecArgs.builder
      builder.transferSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.BatchOperationsJobBucketListArgs.Builder)
    /**
     * @param buckets List of buckets and their objects to be transformed.
     * Structure is documented below.
     * @return builder
     */
    def buckets(args: Endofunction[com.pulumi.gcp.storage.inputs.BatchOperationsJobBucketListBucketsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BatchOperationsJobBucketListArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BatchOperationsJobBucketListBucketsArgs.builder
      builder.buckets(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.BatchOperationsJobBucketListBucketsArgs.Builder)
    /**
     * @param manifest contain the manifest source file that is a CSV file in a Google Cloud Storage bucket.
     * Structure is documented below.
     * @return builder
     */
    def manifest(args: Endofunction[com.pulumi.gcp.storage.inputs.BatchOperationsJobBucketListBucketsManifestArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BatchOperationsJobBucketListBucketsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BatchOperationsJobBucketListBucketsManifestArgs.builder
      builder.manifest(args(argsBuilder).build)

    /**
     * @param prefixList Specifies objects matching a prefix set.
     * Structure is documented below.
     * @return builder
     */
    def prefixList(args: Endofunction[com.pulumi.gcp.storage.inputs.BatchOperationsJobBucketListBucketsPrefixListArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BatchOperationsJobBucketListBucketsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BatchOperationsJobBucketListBucketsPrefixListArgs.builder
      builder.prefixList(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.BatchOperationsJobState.Builder)
    /**
     * @param bucketList List of buckets and their objects to be transformed. Currently, only one bucket configuration is supported. If multiple buckets are specified, an error will be returned
     * Structure is documented below.
     * @return builder
     */
    def bucketList(args: Endofunction[com.pulumi.gcp.storage.inputs.BatchOperationsJobBucketListArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BatchOperationsJobState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BatchOperationsJobBucketListArgs.builder
      builder.bucketList(args(argsBuilder).build)

    /**
     * @param deleteObject allows batch operations to delete objects in bucket
     * Structure is documented below.
     * @return builder
     */
    def deleteObject(args: Endofunction[com.pulumi.gcp.storage.inputs.BatchOperationsJobDeleteObjectArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BatchOperationsJobState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BatchOperationsJobDeleteObjectArgs.builder
      builder.deleteObject(args(argsBuilder).build)

    /**
     * @param putMetadata allows batch operations to update metadata for objects in bucket
     * Structure is documented below.
     * @return builder
     */
    def putMetadata(args: Endofunction[com.pulumi.gcp.storage.inputs.BatchOperationsJobPutMetadataArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BatchOperationsJobState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BatchOperationsJobPutMetadataArgs.builder
      builder.putMetadata(args(argsBuilder).build)

    /**
     * @param putObjectHold allows to update temporary hold or eventBased hold for objects in bucket.
     * Structure is documented below.
     * @return builder
     */
    def putObjectHold(args: Endofunction[com.pulumi.gcp.storage.inputs.BatchOperationsJobPutObjectHoldArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BatchOperationsJobState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BatchOperationsJobPutObjectHoldArgs.builder
      builder.putObjectHold(args(argsBuilder).build)

    /**
     * @param rewriteObject allows to update encryption key for objects in bucket.
     * Structure is documented below.
     * @return builder
     */
    def rewriteObject(args: Endofunction[com.pulumi.gcp.storage.inputs.BatchOperationsJobRewriteObjectArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BatchOperationsJobState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BatchOperationsJobRewriteObjectArgs.builder
      builder.rewriteObject(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.BucketEncryptionArgs.Builder)
    /**
     * @param customerManagedEncryptionEnforcementConfig If omitted, then new objects with CMEK encryption-type is allowed. If set, then new objects created in this bucket must comply with enforcement config. Changing this has no effect on existing objects; it applies to new objects only, Structure is documented below documented below.
     * @return builder
     */
    def customerManagedEncryptionEnforcementConfig(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketEncryptionCustomerManagedEncryptionEnforcementConfigArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketEncryptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketEncryptionCustomerManagedEncryptionEnforcementConfigArgs.builder
      builder.customerManagedEncryptionEnforcementConfig(args(argsBuilder).build)

    /**
     * @param customerSuppliedEncryptionEnforcementConfig If omitted, then new objects with CSEK encryption-type is allowed. If set, then new objects created in this bucket must comply with enforcement config. Changing this has no effect on existing objects; it applies to new objects only, Structure is documented below documented below.
     * @return builder
     */
    def customerSuppliedEncryptionEnforcementConfig(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketEncryptionCustomerSuppliedEncryptionEnforcementConfigArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketEncryptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketEncryptionCustomerSuppliedEncryptionEnforcementConfigArgs.builder
      builder.customerSuppliedEncryptionEnforcementConfig(args(argsBuilder).build)

    /**
     * @param googleManagedEncryptionEnforcementConfig If omitted, then new objects with GMEK encryption-type is allowed. If set, then new objects created in this bucket must comply with enforcement config. Changing this has no effect on existing objects; it applies to new objects only, Structure is documented below documented below.
     * @return builder
     */
    def googleManagedEncryptionEnforcementConfig(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketEncryptionGoogleManagedEncryptionEnforcementConfigArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketEncryptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketEncryptionGoogleManagedEncryptionEnforcementConfigArgs.builder
      builder.googleManagedEncryptionEnforcementConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.BucketIAMBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketIAMBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.BucketIAMMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketIAMMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.BucketIpFilterArgs.Builder)
    /**
     * @param publicNetworkSource The public network IP address ranges that can access the bucket and its data. Structure is documented below.
     * @return builder
     */
    def publicNetworkSource(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketIpFilterPublicNetworkSourceArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketIpFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketIpFilterPublicNetworkSourceArgs.builder
      builder.publicNetworkSource(args(argsBuilder).build)

    /**
     * @param vpcNetworkSources The list of VPC networks that can access the bucket. Structure is documented below.
     * @return builder
     */
    def vpcNetworkSources(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketIpFilterVpcNetworkSourceArgs.Builder]*):
        com.pulumi.gcp.storage.inputs.BucketIpFilterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.BucketIpFilterVpcNetworkSourceArgs.builder
      builder.vpcNetworkSources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.storage.inputs.BucketLifecycleRuleArgs.Builder)
    /**
     * @param action The Lifecycle Rule&#39;s action configuration. A single block of this type is supported. Structure is documented below.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketLifecycleRuleActionArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketLifecycleRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketLifecycleRuleActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param condition The Lifecycle Rule&#39;s condition configuration. A single block of this type is supported. Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketLifecycleRuleConditionArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketLifecycleRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketLifecycleRuleConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.BucketObjectContextsArgs.Builder)
    /**
     * @param customs A list of custom context key-value pairs.
     * @return builder
     */
    def customs(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketObjectContextsCustomArgs.Builder]*):
        com.pulumi.gcp.storage.inputs.BucketObjectContextsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.BucketObjectContextsCustomArgs.builder
      builder.customs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.storage.inputs.BucketObjectState.Builder)
    /**
     * @param contexts Contexts attached to an object, in key-value pairs. For more information about object contexts, see [Object contexts overview](https://cloud.google.com/storage/docs/object-contexts). Structure is documented below.
     * @return builder
     */
    def contexts(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketObjectContextsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketObjectState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketObjectContextsArgs.builder
      builder.contexts(args(argsBuilder).build)

    /**
     * @param customerEncryption Enables object encryption with Customer-Supplied Encryption Key (CSEK). Google [documentation about CSEK.](https://cloud.google.com/storage/docs/encryption/customer-supplied-keys)
     * Structure is documented below.
     * @return builder
     */
    def customerEncryption(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketObjectCustomerEncryptionArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketObjectState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketObjectCustomerEncryptionArgs.builder
      builder.customerEncryption(args(argsBuilder).build)

    /**
     * @param retention The [object retention](http://cloud.google.com/storage/docs/object-lock) settings for the object. The retention settings allow an object to be retained until a provided date. Structure is documented below.
     * @return builder
     */
    def retention(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketObjectRetentionArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketObjectState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketObjectRetentionArgs.builder
      builder.retention(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.BucketState.Builder)
    /**
     * @param autoclass The bucket&#39;s [Autoclass](https://cloud.google.com/storage/docs/autoclass) configuration.  Structure is documented below.
     * @return builder
     */
    def autoclass(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketAutoclassArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketAutoclassArgs.builder
      builder.autoclass(args(argsBuilder).build)

    /**
     * @param cors The bucket&#39;s [Cross-Origin Resource Sharing (CORS)](https://www.w3.org/TR/cors/) configuration. Multiple blocks of this type are permitted. Structure is documented below.
     * @return builder
     */
    def cors(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketCorArgs.Builder]*):
        com.pulumi.gcp.storage.inputs.BucketState.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.BucketCorArgs.builder
      builder.cors(args.map(_(argsBuilder).build)*)

    /**
     * @param customPlacementConfig The bucket&#39;s custom location configuration, which specifies the individual regions that comprise a dual-region bucket. If the bucket is designated a single or multi-region, the parameters are empty. Structure is documented below.
     * @return builder
     */
    def customPlacementConfig(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketCustomPlacementConfigArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketCustomPlacementConfigArgs.builder
      builder.customPlacementConfig(args(argsBuilder).build)

    /**
     * @param encryption The bucket&#39;s encryption configuration. Structure is documented below.
     * @return builder
     */
    def encryption(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketEncryptionArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

    /**
     * @param hierarchicalNamespace The bucket&#39;s hierarchical namespace policy, which defines the bucket capability to handle folders in logical structure. Structure is documented below. To use this configuration, `uniformBucketLevelAccess` must be enabled on bucket.
     * @return builder
     */
    def hierarchicalNamespace(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketHierarchicalNamespaceArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketHierarchicalNamespaceArgs.builder
      builder.hierarchicalNamespace(args(argsBuilder).build)

    /**
     * @param ipFilter The bucket IP filtering configuration. Specifies the network sources that can access the bucket, as well as its underlying objects. Structure is documented below.
     * @return builder
     */
    def ipFilter(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketIpFilterArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketIpFilterArgs.builder
      builder.ipFilter(args(argsBuilder).build)

    /**
     * @param lifecycleRules The bucket&#39;s [Lifecycle Rules](https://cloud.google.com/storage/docs/lifecycle#configuration) configuration. Multiple blocks of this type are permitted. Structure is documented below.
     * @return builder
     */
    def lifecycleRules(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketLifecycleRuleArgs.Builder]*):
        com.pulumi.gcp.storage.inputs.BucketState.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.BucketLifecycleRuleArgs.builder
      builder.lifecycleRules(args.map(_(argsBuilder).build)*)

    /**
     * @param logging The bucket&#39;s [Access &amp; Storage Logs](https://cloud.google.com/storage/docs/access-logs) configuration. Structure is documented below.
     * @return builder
     */
    def logging(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketLoggingArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketLoggingArgs.builder
      builder.logging(args(argsBuilder).build)

    /**
     * @param retentionPolicy Configuration of the bucket&#39;s data retention policy for how long objects in the bucket should be retained. Structure is documented below.
     * @return builder
     */
    def retentionPolicy(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketRetentionPolicyArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketRetentionPolicyArgs.builder
      builder.retentionPolicy(args(argsBuilder).build)

    /**
     * @param softDeletePolicy The bucket&#39;s soft delete policy, which defines the period of time that soft-deleted objects will be retained, and cannot be permanently deleted. If the block is not provided, Server side value will be kept which means removal of block won&#39;t generate any terraform change. Structure is documented below.
     * @return builder
     */
    def softDeletePolicy(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketSoftDeletePolicyArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketSoftDeletePolicyArgs.builder
      builder.softDeletePolicy(args(argsBuilder).build)

    /**
     * @param versioning The bucket&#39;s [Versioning](https://cloud.google.com/storage/docs/object-versioning) configuration.  Structure is documented below.
     * @return builder
     */
    def versioning(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketVersioningArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketVersioningArgs.builder
      builder.versioning(args(argsBuilder).build)

    /**
     * @param website Configuration if the bucket acts as a website. Structure is documented below.
     * @return builder
     */
    def website(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketWebsiteArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketWebsiteArgs.builder
      builder.website(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigFilterArgs.Builder)
    /**
     * @param excludedCloudStorageBuckets Buckets to exclude from the Storage Intelligence plan.
     * Structure is documented below.
     * @return builder
     */
    def excludedCloudStorageBuckets(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigFilterExcludedCloudStorageBucketsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigFilterExcludedCloudStorageBucketsArgs.builder
      builder.excludedCloudStorageBuckets(args(argsBuilder).build)

    /**
     * @param excludedCloudStorageLocations Locations to exclude from the Storage Intelligence plan.
     * Structure is documented below.
     * @return builder
     */
    def excludedCloudStorageLocations(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigFilterExcludedCloudStorageLocationsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigFilterExcludedCloudStorageLocationsArgs.builder
      builder.excludedCloudStorageLocations(args(argsBuilder).build)

    /**
     * @param includedCloudStorageBuckets Buckets to include in the Storage Intelligence plan.
     * Structure is documented below.
     * @return builder
     */
    def includedCloudStorageBuckets(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigFilterIncludedCloudStorageBucketsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigFilterIncludedCloudStorageBucketsArgs.builder
      builder.includedCloudStorageBuckets(args(argsBuilder).build)

    /**
     * @param includedCloudStorageLocations Locations to include in the Storage Intelligence plan.
     * Structure is documented below.
     * @return builder
     */
    def includedCloudStorageLocations(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigFilterIncludedCloudStorageLocationsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigFilterIncludedCloudStorageLocationsArgs.builder
      builder.includedCloudStorageLocations(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigState.Builder)
    /**
     * @param effectiveIntelligenceConfigs The Intelligence config that is effective for the resource.
     * Structure is documented below.
     * @return builder
     */
    def effectiveIntelligenceConfigs(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigEffectiveIntelligenceConfigArgs.Builder]*):
        com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigEffectiveIntelligenceConfigArgs.builder
      builder.effectiveIntelligenceConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param filter Filter over location and bucket using include or exclude semantics. Resources that match the include or exclude filter are exclusively included or excluded from the Storage Intelligence plan.
     * Structure is documented below.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigFilterArgs.Builder]):
        com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param trialConfigs The trial configuration of the Storage Intelligence resource.
     * Structure is documented below.
     * @return builder
     */
    def trialConfigs(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigTrialConfigArgs.Builder]*):
        com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigTrialConfigArgs.builder
      builder.trialConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigFilterArgs.Builder)
    /**
     * @param excludedCloudStorageBuckets Buckets to exclude from the Storage Intelligence plan.
     * Structure is documented below.
     * @return builder
     */
    def excludedCloudStorageBuckets(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigFilterExcludedCloudStorageBucketsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigFilterExcludedCloudStorageBucketsArgs.builder
      builder.excludedCloudStorageBuckets(args(argsBuilder).build)

    /**
     * @param excludedCloudStorageLocations Locations to exclude from the Storage Intelligence plan.
     * Structure is documented below.
     * @return builder
     */
    def excludedCloudStorageLocations(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigFilterExcludedCloudStorageLocationsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigFilterExcludedCloudStorageLocationsArgs.builder
      builder.excludedCloudStorageLocations(args(argsBuilder).build)

    /**
     * @param includedCloudStorageBuckets Buckets to include in the Storage Intelligence plan.
     * Structure is documented below.
     * @return builder
     */
    def includedCloudStorageBuckets(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigFilterIncludedCloudStorageBucketsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigFilterIncludedCloudStorageBucketsArgs.builder
      builder.includedCloudStorageBuckets(args(argsBuilder).build)

    /**
     * @param includedCloudStorageLocations Locations to include in the Storage Intelligence plan.
     * Structure is documented below.
     * @return builder
     */
    def includedCloudStorageLocations(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigFilterIncludedCloudStorageLocationsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigFilterIncludedCloudStorageLocationsArgs.builder
      builder.includedCloudStorageLocations(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigState.Builder)
    /**
     * @param effectiveIntelligenceConfigs The Intelligence config that is effective for the resource.
     * Structure is documented below.
     * @return builder
     */
    def effectiveIntelligenceConfigs(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigEffectiveIntelligenceConfigArgs.Builder]*):
        com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigEffectiveIntelligenceConfigArgs.builder
      builder.effectiveIntelligenceConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param filter Filter over location and bucket using include or exclude semantics. Resources that match the include or exclude filter are exclusively included or excluded from the Storage Intelligence plan.
     * Structure is documented below.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigFilterArgs.Builder]):
        com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param trialConfigs The trial configuration of the Storage Intelligence resource.
     * Structure is documented below.
     * @return builder
     */
    def trialConfigs(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigTrialConfigArgs.Builder]*):
        com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigTrialConfigArgs.builder
      builder.trialConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigFilterArgs.Builder)
    /**
     * @param excludedCloudStorageBuckets Buckets to exclude from the Storage Intelligence plan.
     * Structure is documented below.
     * @return builder
     */
    def excludedCloudStorageBuckets(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigFilterExcludedCloudStorageBucketsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigFilterExcludedCloudStorageBucketsArgs.builder
      builder.excludedCloudStorageBuckets(args(argsBuilder).build)

    /**
     * @param excludedCloudStorageLocations Locations to exclude from the Storage Intelligence plan.
     * Structure is documented below.
     * @return builder
     */
    def excludedCloudStorageLocations(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigFilterExcludedCloudStorageLocationsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigFilterExcludedCloudStorageLocationsArgs.builder
      builder.excludedCloudStorageLocations(args(argsBuilder).build)

    /**
     * @param includedCloudStorageBuckets Buckets to include in the Storage Intelligence plan.
     * Structure is documented below.
     * @return builder
     */
    def includedCloudStorageBuckets(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigFilterIncludedCloudStorageBucketsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigFilterIncludedCloudStorageBucketsArgs.builder
      builder.includedCloudStorageBuckets(args(argsBuilder).build)

    /**
     * @param includedCloudStorageLocations Locations to include in the Storage Intelligence plan.
     * Structure is documented below.
     * @return builder
     */
    def includedCloudStorageLocations(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigFilterIncludedCloudStorageLocationsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigFilterIncludedCloudStorageLocationsArgs.builder
      builder.includedCloudStorageLocations(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigState.Builder)
    /**
     * @param effectiveIntelligenceConfigs The Intelligence config that is effective for the resource.
     * Structure is documented below.
     * @return builder
     */
    def effectiveIntelligenceConfigs(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigEffectiveIntelligenceConfigArgs.Builder]*):
        com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigEffectiveIntelligenceConfigArgs.builder
      builder.effectiveIntelligenceConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param filter Filter over location and bucket using include or exclude semantics. Resources that match the include or exclude filter are exclusively included or excluded from the Storage Intelligence plan.
     * Structure is documented below.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigFilterArgs.Builder]):
        com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param trialConfigs The trial configuration of the Storage Intelligence resource.
     * Structure is documented below.
     * @return builder
     */
    def trialConfigs(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigTrialConfigArgs.Builder]*):
        com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigTrialConfigArgs.builder
      builder.trialConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.storage.inputs.DefaultObjectAccessControlState.Builder)
    /**
     * @param projectTeams The project team associated with the entity
     * Structure is documented below.
     * @return builder
     */
    def projectTeams(args: Endofunction[com.pulumi.gcp.storage.inputs.DefaultObjectAccessControlProjectTeamArgs.Builder]*):
        com.pulumi.gcp.storage.inputs.DefaultObjectAccessControlState.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.DefaultObjectAccessControlProjectTeamArgs.builder
      builder.projectTeams(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.storage.inputs.FtpServerInternalConfigArgs.Builder)
    /**
     * @param consumerAcceptLists A list of consumer projects that are allowed to connect to this server.
     * Structure is documented below.
     * @return builder
     */
    def consumerAcceptLists(args: Endofunction[com.pulumi.gcp.storage.inputs.FtpServerInternalConfigConsumerAcceptListArgs.Builder]*):
        com.pulumi.gcp.storage.inputs.FtpServerInternalConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.FtpServerInternalConfigConsumerAcceptListArgs.builder
      builder.consumerAcceptLists(args.map(_(argsBuilder).build)*)

    /**
     * @param consumerRejectLists A list of consumer projects that are rejected from connecting to this server.
     * Structure is documented below.
     * @return builder
     */
    def consumerRejectLists(args: Endofunction[com.pulumi.gcp.storage.inputs.FtpServerInternalConfigConsumerRejectListArgs.Builder]*):
        com.pulumi.gcp.storage.inputs.FtpServerInternalConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.FtpServerInternalConfigConsumerRejectListArgs.builder
      builder.consumerRejectLists(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.storage.inputs.FtpServerState.Builder)
    /**
     * @param externalConfig Configuration for external access type SFTP servers.
     * Structure is documented below.
     * @return builder
     */
    def externalConfig(args: Endofunction[com.pulumi.gcp.storage.inputs.FtpServerExternalConfigArgs.Builder]):
        com.pulumi.gcp.storage.inputs.FtpServerState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.FtpServerExternalConfigArgs.builder
      builder.externalConfig(args(argsBuilder).build)

    /**
     * @param internalConfig Configuration for internal access type SFTP servers.
     * Structure is documented below.
     * @return builder
     */
    def internalConfig(args: Endofunction[com.pulumi.gcp.storage.inputs.FtpServerInternalConfigArgs.Builder]):
        com.pulumi.gcp.storage.inputs.FtpServerState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.FtpServerInternalConfigArgs.builder
      builder.internalConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.FtpUserState.Builder)
    /**
     * @param storageDirectoryMappings Directory mappings for the Storage FTP user.
     * Structure is documented below.
     * @return builder
     */
    def storageDirectoryMappings(args: Endofunction[com.pulumi.gcp.storage.inputs.FtpUserStorageDirectoryMappingArgs.Builder]*):
        com.pulumi.gcp.storage.inputs.FtpUserState.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.FtpUserStorageDirectoryMappingArgs.builder
      builder.storageDirectoryMappings(args.map(_(argsBuilder).build)*)

    /**
     * @param userCredentials The credentials associated with the user.
     * Structure is documented below.
     * @return builder
     */
    def userCredentials(args: Endofunction[com.pulumi.gcp.storage.inputs.FtpUserUserCredentialArgs.Builder]*):
        com.pulumi.gcp.storage.inputs.FtpUserState.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.FtpUserUserCredentialArgs.builder
      builder.userCredentials(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.storage.inputs.InsightsDatasetConfigExcludeCloudStorageBucketsArgs.Builder)
    /**
     * @param cloudStorageBuckets The list of cloud storage buckets/bucket prefix regexes to exclude in the DatasetConfig.
     * Structure is documented below.
     * @return builder
     */
    def cloudStorageBuckets(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsDatasetConfigExcludeCloudStorageBucketsCloudStorageBucketArgs.Builder]*):
        com.pulumi.gcp.storage.inputs.InsightsDatasetConfigExcludeCloudStorageBucketsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.InsightsDatasetConfigExcludeCloudStorageBucketsCloudStorageBucketArgs.builder
      builder.cloudStorageBuckets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.storage.inputs.InsightsDatasetConfigIncludeCloudStorageBucketsArgs.Builder)
    /**
     * @param cloudStorageBuckets The list of cloud storage buckets/bucket prefix regexes to include in the DatasetConfig.
     * Structure is documented below.
     * @return builder
     */
    def cloudStorageBuckets(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsDatasetConfigIncludeCloudStorageBucketsCloudStorageBucketArgs.Builder]*):
        com.pulumi.gcp.storage.inputs.InsightsDatasetConfigIncludeCloudStorageBucketsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.InsightsDatasetConfigIncludeCloudStorageBucketsCloudStorageBucketArgs.builder
      builder.cloudStorageBuckets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.storage.inputs.InsightsDatasetConfigState.Builder)
    /**
     * @param excludeCloudStorageBuckets Defined the options for excluding cloud storage buckets for the DatasetConfig.
     * Structure is documented below.
     * @return builder
     */
    def excludeCloudStorageBuckets(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsDatasetConfigExcludeCloudStorageBucketsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.InsightsDatasetConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsDatasetConfigExcludeCloudStorageBucketsArgs.builder
      builder.excludeCloudStorageBuckets(args(argsBuilder).build)

    /**
     * @param excludeCloudStorageLocations Defines the options for excluding cloud storage locations for the DatasetConfig.
     * Structure is documented below.
     * @return builder
     */
    def excludeCloudStorageLocations(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsDatasetConfigExcludeCloudStorageLocationsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.InsightsDatasetConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsDatasetConfigExcludeCloudStorageLocationsArgs.builder
      builder.excludeCloudStorageLocations(args(argsBuilder).build)

    /**
     * @param identity Identity used by DatasetConfig.
     * Structure is documented below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsDatasetConfigIdentityArgs.Builder]):
        com.pulumi.gcp.storage.inputs.InsightsDatasetConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsDatasetConfigIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param includeCloudStorageBuckets Defines the options for including cloud storage buckets for the DatasetConfig.
     * Structure is documented below.
     * @return builder
     */
    def includeCloudStorageBuckets(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsDatasetConfigIncludeCloudStorageBucketsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.InsightsDatasetConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsDatasetConfigIncludeCloudStorageBucketsArgs.builder
      builder.includeCloudStorageBuckets(args(argsBuilder).build)

    /**
     * @param includeCloudStorageLocations Defines the options for including cloud storage locations for the DatasetConfig.
     * Structure is documented below.
     * @return builder
     */
    def includeCloudStorageLocations(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsDatasetConfigIncludeCloudStorageLocationsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.InsightsDatasetConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsDatasetConfigIncludeCloudStorageLocationsArgs.builder
      builder.includeCloudStorageLocations(args(argsBuilder).build)

    /**
     * @param links Details of the linked DatasetConfig.
     * Structure is documented below.
     * @return builder
     */
    def links(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsDatasetConfigLinkArgs.Builder]*):
        com.pulumi.gcp.storage.inputs.InsightsDatasetConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.InsightsDatasetConfigLinkArgs.builder
      builder.links(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceFolders Defines the options for providing source folders for the DatasetConfig.
     * Structure is documented below.
     * @return builder
     */
    def sourceFolders(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsDatasetConfigSourceFoldersArgs.Builder]):
        com.pulumi.gcp.storage.inputs.InsightsDatasetConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsDatasetConfigSourceFoldersArgs.builder
      builder.sourceFolders(args(argsBuilder).build)

    /**
     * @param sourceProjects Defines the options for providing source projects for the DatasetConfig.
     * Structure is documented below.
     * @return builder
     */
    def sourceProjects(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsDatasetConfigSourceProjectsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.InsightsDatasetConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsDatasetConfigSourceProjectsArgs.builder
      builder.sourceProjects(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.InsightsReportConfigFrequencyOptionsArgs.Builder)
    /**
     * @param endDate The date to stop generating inventory reports. For example, {&#34;day&#34;: 15, &#34;month&#34;: 9, &#34;year&#34;: 2022}.
     * Structure is documented below.
     * @return builder
     */
    def endDate(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsReportConfigFrequencyOptionsEndDateArgs.Builder]):
        com.pulumi.gcp.storage.inputs.InsightsReportConfigFrequencyOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsReportConfigFrequencyOptionsEndDateArgs.builder
      builder.endDate(args(argsBuilder).build)

    /**
     * @param startDate The date to start generating inventory reports. For example, {&#34;day&#34;: 15, &#34;month&#34;: 8, &#34;year&#34;: 2022}.
     * Structure is documented below.
     * @return builder
     */
    def startDate(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsReportConfigFrequencyOptionsStartDateArgs.Builder]):
        com.pulumi.gcp.storage.inputs.InsightsReportConfigFrequencyOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsReportConfigFrequencyOptionsStartDateArgs.builder
      builder.startDate(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.InsightsReportConfigObjectMetadataReportOptionsArgs.Builder)
    /**
     * @param storageDestinationOptions Options for where the inventory reports are stored.
     * Structure is documented below.
     * @return builder
     */
    def storageDestinationOptions(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsReportConfigObjectMetadataReportOptionsStorageDestinationOptionsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.InsightsReportConfigObjectMetadataReportOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsReportConfigObjectMetadataReportOptionsStorageDestinationOptionsArgs.builder
      builder.storageDestinationOptions(args(argsBuilder).build)

    /**
     * @param storageFilters A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    def storageFilters(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsReportConfigObjectMetadataReportOptionsStorageFiltersArgs.Builder]):
        com.pulumi.gcp.storage.inputs.InsightsReportConfigObjectMetadataReportOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsReportConfigObjectMetadataReportOptionsStorageFiltersArgs.builder
      builder.storageFilters(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.InsightsReportConfigState.Builder)
    /**
     * @param csvOptions Options for configuring the format of the inventory report CSV file.
     * Structure is documented below.
     * @return builder
     */
    def csvOptions(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsReportConfigCsvOptionsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.InsightsReportConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsReportConfigCsvOptionsArgs.builder
      builder.csvOptions(args(argsBuilder).build)

    /**
     * @param frequencyOptions Options for configuring how inventory reports are generated.
     * Structure is documented below.
     * @return builder
     */
    def frequencyOptions(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsReportConfigFrequencyOptionsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.InsightsReportConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsReportConfigFrequencyOptionsArgs.builder
      builder.frequencyOptions(args(argsBuilder).build)

    /**
     * @param objectMetadataReportOptions Options for including metadata in an inventory report.
     * Structure is documented below.
     * @return builder
     */
    def objectMetadataReportOptions(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsReportConfigObjectMetadataReportOptionsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.InsightsReportConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsReportConfigObjectMetadataReportOptionsArgs.builder
      builder.objectMetadataReportOptions(args(argsBuilder).build)

    /**
     * @param parquetOptions An option for outputting inventory reports as parquet files.
     * @return builder
     */
    def parquetOptions(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsReportConfigParquetOptionsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.InsightsReportConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsReportConfigParquetOptionsArgs.builder
      builder.parquetOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.ManagedFolderIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.storage.inputs.ManagedFolderIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.storage.inputs.ManagedFolderIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ManagedFolderIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.ManagedFolderIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.storage.inputs.ManagedFolderIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.storage.inputs.ManagedFolderIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ManagedFolderIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.ObjectAccessControlState.Builder)
    /**
     * @param projectTeams The project team associated with the entity
     * Structure is documented below.
     * @return builder
     */
    def projectTeams(args: Endofunction[com.pulumi.gcp.storage.inputs.ObjectAccessControlProjectTeamArgs.Builder]*):
        com.pulumi.gcp.storage.inputs.ObjectAccessControlState.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.ObjectAccessControlProjectTeamArgs.builder
      builder.projectTeams(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.storage.inputs.TransferAgentPoolState.Builder)
    /**
     * @param bandwidthLimit Specifies the bandwidth limit details. If this field is unspecified, the default value is set as &#39;No Limit&#39;.
     * Structure is documented below.
     * @return builder
     */
    def bandwidthLimit(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferAgentPoolBandwidthLimitArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferAgentPoolState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferAgentPoolBandwidthLimitArgs.builder
      builder.bandwidthLimit(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecArgs.Builder)
    /**
     * @param gcsDataSink A Google Cloud Storage data sink. Structure documented below.
     * @return builder
     */
    def gcsDataSink(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecGcsDataSinkArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecGcsDataSinkArgs.builder
      builder.gcsDataSink(args(argsBuilder).build)

    /**
     * @param gcsDataSource A Google Cloud Storage data source. Structure documented below.
     * @return builder
     */
    def gcsDataSource(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecGcsDataSourceArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecGcsDataSourceArgs.builder
      builder.gcsDataSource(args(argsBuilder).build)

    /**
     * @param objectConditions Only objects that satisfy these object conditions are included in the set of data source and data sink objects. Object conditions based on objects&#39; `lastModificationTime` do not exclude objects in a data sink. Structure documented below.
     * @return builder
     */
    def objectConditions(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecObjectConditionsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecObjectConditionsArgs.builder
      builder.objectConditions(args(argsBuilder).build)

    /**
     * @param transferOptions Characteristics of how to treat files from datasource and sink during job. If the option `deleteObjectsUniqueInSink` is true, object conditions based on objects&#39; `lastModificationTime` are ignored and do not exclude objects in a data source or a data sink. Structure documented below.
     * @return builder
     */
    def transferOptions(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecTransferOptionsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecTransferOptionsArgs.builder
      builder.transferOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecTransferOptionsArgs.Builder)
    /**
     * @param metadataOptions Specifies the metadata options for running a transfer. Structure documented below.
     * @return builder
     */
    def metadataOptions(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecTransferOptionsMetadataOptionsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecTransferOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecTransferOptionsMetadataOptionsArgs.builder
      builder.metadataOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.TransferJobScheduleArgs.Builder)
    /**
     * @param scheduleEndDate The last day the recurring transfer will be run. If `scheduleEndDate` is the same as `scheduleStartDate`, the transfer will be executed only once. Structure documented below.
     * @return builder
     */
    def scheduleEndDate(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobScheduleScheduleEndDateArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobScheduleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobScheduleScheduleEndDateArgs.builder
      builder.scheduleEndDate(args(argsBuilder).build)

    /**
     * @param scheduleStartDate The first day the recurring transfer is scheduled to run. If `scheduleStartDate` is in the past, the transfer will run for the first time on the following day. Structure documented below.
     * @return builder
     */
    def scheduleStartDate(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobScheduleScheduleStartDateArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobScheduleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobScheduleScheduleStartDateArgs.builder
      builder.scheduleStartDate(args(argsBuilder).build)

    /**
     * @param startTimeOfDay The time in UTC at which the transfer will be scheduled to start in a day. Transfers may start later than this time. If not specified, recurring and one-time transfers that are scheduled to run today will run immediately; recurring transfers that are scheduled to run on a future date will start at approximately midnight UTC on that date. Note that when configuring a transfer with the Cloud Platform Console, the transfer&#39;s start time in a day is specified in your local timezone. Structure documented below.
     * @return builder
     */
    def startTimeOfDay(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobScheduleStartTimeOfDayArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobScheduleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobScheduleStartTimeOfDayArgs.builder
      builder.startTimeOfDay(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.TransferJobState.Builder)
    /**
     * @param eventStream Specifies the Event-driven transfer options. Event-driven transfers listen to an event stream to transfer updated files. Structure documented below Either `eventStream` or `schedule` must be set.
     * @return builder
     */
    def eventStream(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobEventStreamArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobEventStreamArgs.builder
      builder.eventStream(args(argsBuilder).build)

    /**
     * @param loggingConfig Logging configuration. Structure documented below.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobLoggingConfigArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

    /**
     * @param notificationConfig Notification configuration. This is not supported for transfers involving PosixFilesystem. Structure documented below.
     * @return builder
     */
    def notificationConfig(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobNotificationConfigArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobNotificationConfigArgs.builder
      builder.notificationConfig(args(argsBuilder).build)

    /**
     * @param replicationSpec Replication specification. Structure documented below. User should not configure `schedule`, `eventStream` with this argument. One of `transferSpec`, or `replicationSpec` must be specified.
     * 
     * ***
     * @return builder
     */
    def replicationSpec(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecArgs.builder
      builder.replicationSpec(args(argsBuilder).build)

    /**
     * @param schedule Schedule specification defining when the Transfer Job should be scheduled to start, end and what time to run. Structure documented below. Either `schedule` or `eventStream` must be set.
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobScheduleArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

    /**
     * @param transferSpec Transfer specification. Structure documented below. One of `transferSpec`, or `replicationSpec` can be specified.
     * @return builder
     */
    def transferSpec(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobTransferSpecArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobTransferSpecArgs.builder
      builder.transferSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.TransferJobTransferSpecArgs.Builder)
    /**
     * @param awsS3CompatibleDataSource An AWS S3 Compatible data source. Structure documented below.
     * @return builder
     */
    def awsS3CompatibleDataSource(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAwsS3CompatibleDataSourceArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobTransferSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAwsS3CompatibleDataSourceArgs.builder
      builder.awsS3CompatibleDataSource(args(argsBuilder).build)

    /**
     * @param awsS3DataSource An AWS S3 data source. Structure documented below.
     * @return builder
     */
    def awsS3DataSource(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAwsS3DataSourceArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobTransferSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAwsS3DataSourceArgs.builder
      builder.awsS3DataSource(args(argsBuilder).build)

    /**
     * @param azureBlobStorageDataSource An Azure Blob Storage data source. Structure documented below.
     * @return builder
     */
    def azureBlobStorageDataSource(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAzureBlobStorageDataSourceArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobTransferSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAzureBlobStorageDataSourceArgs.builder
      builder.azureBlobStorageDataSource(args(argsBuilder).build)

    /**
     * @param gcsDataSink A Google Cloud Storage data sink. Structure documented below.
     * @return builder
     */
    def gcsDataSink(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobTransferSpecGcsDataSinkArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobTransferSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobTransferSpecGcsDataSinkArgs.builder
      builder.gcsDataSink(args(argsBuilder).build)

    /**
     * @param gcsDataSource A Google Cloud Storage data source. Structure documented below.
     * @return builder
     */
    def gcsDataSource(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobTransferSpecGcsDataSourceArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobTransferSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobTransferSpecGcsDataSourceArgs.builder
      builder.gcsDataSource(args(argsBuilder).build)

    /**
     * @param hdfsDataSource An HDFS data source. Structure documented below.
     * @return builder
     */
    def hdfsDataSource(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobTransferSpecHdfsDataSourceArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobTransferSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobTransferSpecHdfsDataSourceArgs.builder
      builder.hdfsDataSource(args(argsBuilder).build)

    /**
     * @param httpDataSource A HTTP URL data source. Structure documented below.
     * @return builder
     */
    def httpDataSource(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobTransferSpecHttpDataSourceArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobTransferSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobTransferSpecHttpDataSourceArgs.builder
      builder.httpDataSource(args(argsBuilder).build)

    /**
     * @param objectConditions Only objects that satisfy these object conditions are included in the set of data source and data sink objects. Object conditions based on objects&#39; `lastModificationTime` do not exclude objects in a data sink. Structure documented below.
     * @return builder
     */
    def objectConditions(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobTransferSpecObjectConditionsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobTransferSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobTransferSpecObjectConditionsArgs.builder
      builder.objectConditions(args(argsBuilder).build)

    /**
     * @param posixDataSink A POSIX data sink. Structure documented below.
     * @return builder
     */
    def posixDataSink(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobTransferSpecPosixDataSinkArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobTransferSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobTransferSpecPosixDataSinkArgs.builder
      builder.posixDataSink(args(argsBuilder).build)

    /**
     * @param posixDataSource A POSIX filesystem data source. Structure documented below.
     * @return builder
     */
    def posixDataSource(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobTransferSpecPosixDataSourceArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobTransferSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobTransferSpecPosixDataSourceArgs.builder
      builder.posixDataSource(args(argsBuilder).build)

    /**
     * @param transferManifest Use a manifest file to limit which object are transferred. See [Storage Transfer Service manifest file format](https://cloud.google.com/storage-transfer/docs/manifest). Structure documented below.
     * @return builder
     */
    def transferManifest(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobTransferSpecTransferManifestArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobTransferSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobTransferSpecTransferManifestArgs.builder
      builder.transferManifest(args(argsBuilder).build)

    /**
     * @param transferOptions Characteristics of how to treat files from datasource and sink during job. If the option `deleteObjectsUniqueInSink` is true, object conditions based on objects&#39; `lastModificationTime` are ignored and do not exclude objects in a data source or a data sink. Structure documented below.
     * @return builder
     */
    def transferOptions(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobTransferSpecTransferOptionsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobTransferSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobTransferSpecTransferOptionsArgs.builder
      builder.transferOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAwsS3CompatibleDataSourceArgs.Builder)
    /**
     * @param s3Metadata S3 compatible metadata.
     * @return builder
     */
    def s3Metadata(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAwsS3CompatibleDataSourceS3MetadataArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAwsS3CompatibleDataSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAwsS3CompatibleDataSourceS3MetadataArgs.builder
      builder.s3Metadata(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAwsS3DataSourceArgs.Builder)
    /**
     * @param awsAccessKey AWS credentials block.
     * @return builder
     */
    def awsAccessKey(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAwsS3DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyArgs.builder
      builder.awsAccessKey(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAzureBlobStorageDataSourceArgs.Builder)
    /**
     * @param azureCredentials ) Credentials used to authenticate API requests to Azure block.
     * @return builder
     */
    def azureCredentials(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAzureBlobStorageDataSourceAzureCredentialsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAzureBlobStorageDataSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAzureBlobStorageDataSourceAzureCredentialsArgs.builder
      builder.azureCredentials(args(argsBuilder).build)

    /**
     * @param federatedIdentityConfig Federated identity config of a user registered Azure application. Structure documented below.
     * @return builder
     */
    def federatedIdentityConfig(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAzureBlobStorageDataSourceFederatedIdentityConfigArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAzureBlobStorageDataSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAzureBlobStorageDataSourceFederatedIdentityConfigArgs.builder
      builder.federatedIdentityConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.TransferJobTransferSpecTransferOptionsArgs.Builder)
    /**
     * @param metadataOptions Specifies the metadata options for running a transfer. Structure documented below.
     * @return builder
     */
    def metadataOptions(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobTransferSpecTransferOptionsMetadataOptionsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobTransferSpecTransferOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobTransferSpecTransferOptionsMetadataOptionsArgs.builder
      builder.metadataOptions(args(argsBuilder).build)
