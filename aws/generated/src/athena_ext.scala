package jp.ukiba.ko_pulumi
package aws

object athena_ext:
  extension (builder: com.pulumi.aws.athena.CapacityReservationArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.athena.inputs.CapacityReservationTimeoutsArgs.Builder]):
        com.pulumi.aws.athena.CapacityReservationArgs.Builder =
      val argsBuilder = com.pulumi.aws.athena.inputs.CapacityReservationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.athena.DatabaseArgs.Builder)
    /**
     * @param aclConfiguration That an Amazon S3 canned ACL should be set to control ownership of stored query results. See ACL Configuration below.
     * @return builder
     */
    inline def aclConfiguration(args: Endofunction[com.pulumi.aws.athena.inputs.DatabaseAclConfigurationArgs.Builder]):
        com.pulumi.aws.athena.DatabaseArgs.Builder =
      val argsBuilder = com.pulumi.aws.athena.inputs.DatabaseAclConfigurationArgs.builder
      builder.aclConfiguration(args(argsBuilder).build)

    /**
     * @param encryptionConfiguration Encryption key block AWS Athena uses to decrypt the data in S3, such as a KMS key. See Encryption Configuration below.
     * @return builder
     */
    inline def encryptionConfiguration(args: Endofunction[com.pulumi.aws.athena.inputs.DatabaseEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.athena.DatabaseArgs.Builder =
      val argsBuilder = com.pulumi.aws.athena.inputs.DatabaseEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.athena.WorkgroupArgs.Builder)
    /**
     * @param configuration Configuration block with various settings for the workgroup. Documented below.
     * @return builder
     */
    inline def configuration(args: Endofunction[com.pulumi.aws.athena.inputs.WorkgroupConfigurationArgs.Builder]):
        com.pulumi.aws.athena.WorkgroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.athena.inputs.WorkgroupConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.athena.inputs.CapacityReservationState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.athena.inputs.CapacityReservationTimeoutsArgs.Builder]):
        com.pulumi.aws.athena.inputs.CapacityReservationState.Builder =
      val argsBuilder = com.pulumi.aws.athena.inputs.CapacityReservationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.athena.inputs.DatabaseState.Builder)
    /**
     * @param aclConfiguration That an Amazon S3 canned ACL should be set to control ownership of stored query results. See ACL Configuration below.
     * @return builder
     */
    inline def aclConfiguration(args: Endofunction[com.pulumi.aws.athena.inputs.DatabaseAclConfigurationArgs.Builder]):
        com.pulumi.aws.athena.inputs.DatabaseState.Builder =
      val argsBuilder = com.pulumi.aws.athena.inputs.DatabaseAclConfigurationArgs.builder
      builder.aclConfiguration(args(argsBuilder).build)

    /**
     * @param encryptionConfiguration Encryption key block AWS Athena uses to decrypt the data in S3, such as a KMS key. See Encryption Configuration below.
     * @return builder
     */
    inline def encryptionConfiguration(args: Endofunction[com.pulumi.aws.athena.inputs.DatabaseEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.athena.inputs.DatabaseState.Builder =
      val argsBuilder = com.pulumi.aws.athena.inputs.DatabaseEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.athena.inputs.WorkgroupConfigurationArgs.Builder)
    /**
     * @param customerContentEncryptionConfiguration Configuration block to specify the KMS key that is used to encrypt the user&#39;s data stores in Athena. This setting applies to the PySpark engine for Athena notebooks. See Customer Content Encryption Configuration below.
     * @return builder
     */
    inline def customerContentEncryptionConfiguration(args: Endofunction[com.pulumi.aws.athena.inputs.WorkgroupConfigurationCustomerContentEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.athena.inputs.WorkgroupConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.athena.inputs.WorkgroupConfigurationCustomerContentEncryptionConfigurationArgs.builder
      builder.customerContentEncryptionConfiguration(args(argsBuilder).build)

    /**
     * @param engineVersion Configuration block for the Athena Engine Versioning. For more information, see [Athena Engine Versioning](https://docs.aws.amazon.com/athena/latest/ug/engine-versions.html). See Engine Version below.
     * @return builder
     */
    inline def engineVersion(args: Endofunction[com.pulumi.aws.athena.inputs.WorkgroupConfigurationEngineVersionArgs.Builder]):
        com.pulumi.aws.athena.inputs.WorkgroupConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.athena.inputs.WorkgroupConfigurationEngineVersionArgs.builder
      builder.engineVersion(args(argsBuilder).build)

    /**
     * @param identityCenterConfiguration Configuration block to set up an IAM Identity Center enabled workgroup. See Identity Center Configuration below.
     * @return builder
     */
    inline def identityCenterConfiguration(args: Endofunction[com.pulumi.aws.athena.inputs.WorkgroupConfigurationIdentityCenterConfigurationArgs.Builder]):
        com.pulumi.aws.athena.inputs.WorkgroupConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.athena.inputs.WorkgroupConfigurationIdentityCenterConfigurationArgs.builder
      builder.identityCenterConfiguration(args(argsBuilder).build)

    /**
     * @param managedQueryResultsConfiguration Configuration block for storing results in Athena owned storage. See Managed Query Results Configuration below.
     * @return builder
     */
    inline def managedQueryResultsConfiguration(args: Endofunction[com.pulumi.aws.athena.inputs.WorkgroupConfigurationManagedQueryResultsConfigurationArgs.Builder]):
        com.pulumi.aws.athena.inputs.WorkgroupConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.athena.inputs.WorkgroupConfigurationManagedQueryResultsConfigurationArgs.builder
      builder.managedQueryResultsConfiguration(args(argsBuilder).build)

    /**
     * @param monitoringConfiguration Configuration block for managed log persistence, delivering logs to Amazon S3 buckets, Amazon CloudWatch log groups etc. Only applicable to Apache Spark engine. See Monitoring Configuration below.
     * @return builder
     */
    inline def monitoringConfiguration(args: Endofunction[com.pulumi.aws.athena.inputs.WorkgroupConfigurationMonitoringConfigurationArgs.Builder]):
        com.pulumi.aws.athena.inputs.WorkgroupConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.athena.inputs.WorkgroupConfigurationMonitoringConfigurationArgs.builder
      builder.monitoringConfiguration(args(argsBuilder).build)

    /**
     * @param queryResultsS3AccessGrantsConfiguration Configuration block for S3 access grants. See Query Results S3 Access Grants Configuration below.
     * @return builder
     */
    inline def queryResultsS3AccessGrantsConfiguration(args: Endofunction[com.pulumi.aws.athena.inputs.WorkgroupConfigurationQueryResultsS3AccessGrantsConfigurationArgs.Builder]):
        com.pulumi.aws.athena.inputs.WorkgroupConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.athena.inputs.WorkgroupConfigurationQueryResultsS3AccessGrantsConfigurationArgs.builder
      builder.queryResultsS3AccessGrantsConfiguration(args(argsBuilder).build)

    /**
     * @param resultConfiguration Configuration block with result settings. See Result Configuration below.
     * @return builder
     */
    inline def resultConfiguration(args: Endofunction[com.pulumi.aws.athena.inputs.WorkgroupConfigurationResultConfigurationArgs.Builder]):
        com.pulumi.aws.athena.inputs.WorkgroupConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.athena.inputs.WorkgroupConfigurationResultConfigurationArgs.builder
      builder.resultConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.athena.inputs.WorkgroupConfigurationManagedQueryResultsConfigurationArgs.Builder)
    /**
     * @param encryptionConfiguration Configuration block for the encryption configuration. See Managed Query Results Encryption Configuration below.
     * @return builder
     */
    inline def encryptionConfiguration(args: Endofunction[com.pulumi.aws.athena.inputs.WorkgroupConfigurationManagedQueryResultsConfigurationEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.athena.inputs.WorkgroupConfigurationManagedQueryResultsConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.athena.inputs.WorkgroupConfigurationManagedQueryResultsConfigurationEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.athena.inputs.WorkgroupConfigurationMonitoringConfigurationArgs.Builder)
    /**
     * @param cloudWatchLoggingConfiguration Configuration block for delivering logs to Amazon CloudWatch log groups. See CloudWatch Logging Configuration below.
     * @return builder
     */
    inline def cloudWatchLoggingConfiguration(args: Endofunction[com.pulumi.aws.athena.inputs.WorkgroupConfigurationMonitoringConfigurationCloudWatchLoggingConfigurationArgs.Builder]):
        com.pulumi.aws.athena.inputs.WorkgroupConfigurationMonitoringConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.athena.inputs.WorkgroupConfigurationMonitoringConfigurationCloudWatchLoggingConfigurationArgs.builder
      builder.cloudWatchLoggingConfiguration(args(argsBuilder).build)

    /**
     * @param managedLoggingConfiguration Configuration block for managed log persistence. See Managed Logging Configuration below.
     * @return builder
     */
    inline def managedLoggingConfiguration(args: Endofunction[com.pulumi.aws.athena.inputs.WorkgroupConfigurationMonitoringConfigurationManagedLoggingConfigurationArgs.Builder]):
        com.pulumi.aws.athena.inputs.WorkgroupConfigurationMonitoringConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.athena.inputs.WorkgroupConfigurationMonitoringConfigurationManagedLoggingConfigurationArgs.builder
      builder.managedLoggingConfiguration(args(argsBuilder).build)

    /**
     * @param s3LoggingConfiguration Configuration block for delivering logs to Amazon S3 buckets. See S3 Logging Configuration below.
     * @return builder
     */
    inline def s3LoggingConfiguration(args: Endofunction[com.pulumi.aws.athena.inputs.WorkgroupConfigurationMonitoringConfigurationS3LoggingConfigurationArgs.Builder]):
        com.pulumi.aws.athena.inputs.WorkgroupConfigurationMonitoringConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.athena.inputs.WorkgroupConfigurationMonitoringConfigurationS3LoggingConfigurationArgs.builder
      builder.s3LoggingConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.athena.inputs.WorkgroupConfigurationMonitoringConfigurationCloudWatchLoggingConfigurationArgs.Builder)
    /**
     * @param logTypes Repeatable block defining log types to be delivered to CloudWatch.
     * @return builder
     */
    inline def logTypes(args: Endofunction[com.pulumi.aws.athena.inputs.WorkgroupConfigurationMonitoringConfigurationCloudWatchLoggingConfigurationLogTypeArgs.Builder]*):
        com.pulumi.aws.athena.inputs.WorkgroupConfigurationMonitoringConfigurationCloudWatchLoggingConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.athena.inputs.WorkgroupConfigurationMonitoringConfigurationCloudWatchLoggingConfigurationLogTypeArgs.builder
      builder.logTypes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.athena.inputs.WorkgroupConfigurationResultConfigurationArgs.Builder)
    /**
     * @param aclConfiguration That an Amazon S3 canned ACL should be set to control ownership of stored query results. See ACL Configuration below.
     * @return builder
     */
    inline def aclConfiguration(args: Endofunction[com.pulumi.aws.athena.inputs.WorkgroupConfigurationResultConfigurationAclConfigurationArgs.Builder]):
        com.pulumi.aws.athena.inputs.WorkgroupConfigurationResultConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.athena.inputs.WorkgroupConfigurationResultConfigurationAclConfigurationArgs.builder
      builder.aclConfiguration(args(argsBuilder).build)

    /**
     * @param encryptionConfiguration Configuration block with encryption settings. See Encryption Configuration below.
     * @return builder
     */
    inline def encryptionConfiguration(args: Endofunction[com.pulumi.aws.athena.inputs.WorkgroupConfigurationResultConfigurationEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.athena.inputs.WorkgroupConfigurationResultConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.athena.inputs.WorkgroupConfigurationResultConfigurationEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.athena.inputs.WorkgroupState.Builder)
    /**
     * @param configuration Configuration block with various settings for the workgroup. Documented below.
     * @return builder
     */
    inline def configuration(args: Endofunction[com.pulumi.aws.athena.inputs.WorkgroupConfigurationArgs.Builder]):
        com.pulumi.aws.athena.inputs.WorkgroupState.Builder =
      val argsBuilder = com.pulumi.aws.athena.inputs.WorkgroupConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)
