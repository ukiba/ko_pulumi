package jp.ukiba.ko_pulumi
package aws

object dms_ext:
  extension (builder: com.pulumi.aws.dms.DataProviderArgs.Builder)
    /**
     * @param settings Database connection settings. Configure exactly one block matching `engine`. See `settings` Block below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def settings(args: Endofunction[com.pulumi.aws.dms.inputs.DataProviderSettingsArgs.Builder]):
        com.pulumi.aws.dms.DataProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.DataProviderSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dms.EndpointArgs.Builder)
    /**
     * @param elasticsearchSettings Configuration block for OpenSearch settings. See below.
     * @return builder
     */
    inline def elasticsearchSettings(args: Endofunction[com.pulumi.aws.dms.inputs.EndpointElasticsearchSettingsArgs.Builder]):
        com.pulumi.aws.dms.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.EndpointElasticsearchSettingsArgs.builder
      builder.elasticsearchSettings(args(argsBuilder).build)

    /**
     * @param kafkaSettings Configuration block for Kafka settings. See below.
     * @return builder
     */
    inline def kafkaSettings(args: Endofunction[com.pulumi.aws.dms.inputs.EndpointKafkaSettingsArgs.Builder]):
        com.pulumi.aws.dms.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.EndpointKafkaSettingsArgs.builder
      builder.kafkaSettings(args(argsBuilder).build)

    /**
     * @param kinesisSettings Configuration block for Kinesis settings. See below.
     * @return builder
     */
    inline def kinesisSettings(args: Endofunction[com.pulumi.aws.dms.inputs.EndpointKinesisSettingsArgs.Builder]):
        com.pulumi.aws.dms.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.EndpointKinesisSettingsArgs.builder
      builder.kinesisSettings(args(argsBuilder).build)

    /**
     * @param mongodbSettings Configuration block for MongoDB settings. See below.
     * @return builder
     */
    inline def mongodbSettings(args: Endofunction[com.pulumi.aws.dms.inputs.EndpointMongodbSettingsArgs.Builder]):
        com.pulumi.aws.dms.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.EndpointMongodbSettingsArgs.builder
      builder.mongodbSettings(args(argsBuilder).build)

    /**
     * @param mysqlSettings Configuration block for MySQL settings. See below.
     * @return builder
     */
    inline def mysqlSettings(args: Endofunction[com.pulumi.aws.dms.inputs.EndpointMysqlSettingsArgs.Builder]):
        com.pulumi.aws.dms.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.EndpointMysqlSettingsArgs.builder
      builder.mysqlSettings(args(argsBuilder).build)

    /**
     * @param oracleSettings Configuration block for Oracle settings. See below.
     * @return builder
     */
    inline def oracleSettings(args: Endofunction[com.pulumi.aws.dms.inputs.EndpointOracleSettingsArgs.Builder]):
        com.pulumi.aws.dms.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.EndpointOracleSettingsArgs.builder
      builder.oracleSettings(args(argsBuilder).build)

    /**
     * @param postgresSettings Configuration block for Postgres settings. See below.
     * @return builder
     */
    inline def postgresSettings(args: Endofunction[com.pulumi.aws.dms.inputs.EndpointPostgresSettingsArgs.Builder]):
        com.pulumi.aws.dms.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.EndpointPostgresSettingsArgs.builder
      builder.postgresSettings(args(argsBuilder).build)

    inline def redisSettings(args: Endofunction[com.pulumi.aws.dms.inputs.EndpointRedisSettingsArgs.Builder]):
        com.pulumi.aws.dms.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.EndpointRedisSettingsArgs.builder
      builder.redisSettings(args(argsBuilder).build)

    /**
     * @param redshiftSettings Configuration block for Redshift settings. See below.
     * @return builder
     */
    inline def redshiftSettings(args: Endofunction[com.pulumi.aws.dms.inputs.EndpointRedshiftSettingsArgs.Builder]):
        com.pulumi.aws.dms.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.EndpointRedshiftSettingsArgs.builder
      builder.redshiftSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dms.MigrationProjectArgs.Builder)
    /**
     * @param schemaConversionApplicationAttributes Schema conversion application attributes, including the S3 bucket path and S3 role ARN. See `schemaConversionApplicationAttributes` Block below.
     * @return builder
     */
    inline def schemaConversionApplicationAttributes(args: Endofunction[com.pulumi.aws.dms.inputs.MigrationProjectSchemaConversionApplicationAttributesArgs.Builder]):
        com.pulumi.aws.dms.MigrationProjectArgs.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.MigrationProjectSchemaConversionApplicationAttributesArgs.builder
      builder.schemaConversionApplicationAttributes(args(argsBuilder).build)

    /**
     * @param sourceDataProviderDescriptors Information about the source data provider. See `sourceDataProviderDescriptor` Block below.
     * @return builder
     */
    inline def sourceDataProviderDescriptors(args: Endofunction[com.pulumi.aws.dms.inputs.MigrationProjectSourceDataProviderDescriptorArgs.Builder]*):
        com.pulumi.aws.dms.MigrationProjectArgs.Builder =
      def argsBuilder = com.pulumi.aws.dms.inputs.MigrationProjectSourceDataProviderDescriptorArgs.builder
      builder.sourceDataProviderDescriptors(args.map(_(argsBuilder).build)*)

    /**
     * @param targetDataProviderDescriptors Information about the target data provider. See `targetDataProviderDescriptor` Block below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def targetDataProviderDescriptors(args: Endofunction[com.pulumi.aws.dms.inputs.MigrationProjectTargetDataProviderDescriptorArgs.Builder]*):
        com.pulumi.aws.dms.MigrationProjectArgs.Builder =
      def argsBuilder = com.pulumi.aws.dms.inputs.MigrationProjectTargetDataProviderDescriptorArgs.builder
      builder.targetDataProviderDescriptors(args.map(_(argsBuilder).build)*)

    inline def timeouts(args: Endofunction[com.pulumi.aws.dms.inputs.MigrationProjectTimeoutsArgs.Builder]):
        com.pulumi.aws.dms.MigrationProjectArgs.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.MigrationProjectTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dms.ReplicationConfigArgs.Builder)
    /**
     * @param computeConfig Configuration block for provisioning an DMS Serverless replication.
     * @return builder
     */
    inline def computeConfig(args: Endofunction[com.pulumi.aws.dms.inputs.ReplicationConfigComputeConfigArgs.Builder]):
        com.pulumi.aws.dms.ReplicationConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.ReplicationConfigComputeConfigArgs.builder
      builder.computeConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dms.ReplicationInstanceArgs.Builder)
    /**
     * @param kerberosAuthenticationSettings Configuration block for settings required for Kerberos authentication. See below.
     * @return builder
     */
    inline def kerberosAuthenticationSettings(args: Endofunction[com.pulumi.aws.dms.inputs.ReplicationInstanceKerberosAuthenticationSettingsArgs.Builder]):
        com.pulumi.aws.dms.ReplicationInstanceArgs.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.ReplicationInstanceKerberosAuthenticationSettingsArgs.builder
      builder.kerberosAuthenticationSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dms.inputs.DataProviderSettingsArgs.Builder)
    /**
     * @param docDbSettings Settings for the `docdb` engine. See `docDbSettings` Block below.
     * @return builder
     */
    inline def docDbSettings(args: Endofunction[com.pulumi.aws.dms.inputs.DataProviderSettingsDocDbSettingsArgs.Builder]):
        com.pulumi.aws.dms.inputs.DataProviderSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.DataProviderSettingsDocDbSettingsArgs.builder
      builder.docDbSettings(args(argsBuilder).build)

    /**
     * @param ibmDb2LuwSettings Settings for the `db2` engine. See `ibmDb2LuwSettings` Block below.
     * @return builder
     */
    inline def ibmDb2LuwSettings(args: Endofunction[com.pulumi.aws.dms.inputs.DataProviderSettingsIbmDb2LuwSettingsArgs.Builder]):
        com.pulumi.aws.dms.inputs.DataProviderSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.DataProviderSettingsIbmDb2LuwSettingsArgs.builder
      builder.ibmDb2LuwSettings(args(argsBuilder).build)

    /**
     * @param ibmDb2ZosSettings Settings for the `db2-zos` engine. See `ibmDb2ZosSettings` Block below.
     * @return builder
     */
    inline def ibmDb2ZosSettings(args: Endofunction[com.pulumi.aws.dms.inputs.DataProviderSettingsIbmDb2ZosSettingsArgs.Builder]):
        com.pulumi.aws.dms.inputs.DataProviderSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.DataProviderSettingsIbmDb2ZosSettingsArgs.builder
      builder.ibmDb2ZosSettings(args(argsBuilder).build)

    /**
     * @param mariaDbSettings Settings for the `mariadb` engine. See `mariaDbSettings` Block below.
     * @return builder
     */
    inline def mariaDbSettings(args: Endofunction[com.pulumi.aws.dms.inputs.DataProviderSettingsMariaDbSettingsArgs.Builder]):
        com.pulumi.aws.dms.inputs.DataProviderSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.DataProviderSettingsMariaDbSettingsArgs.builder
      builder.mariaDbSettings(args(argsBuilder).build)

    /**
     * @param microsoftSqlServerSettings Settings for the `sqlserver` engine. See `microsoftSqlServerSettings` Block below.
     * @return builder
     */
    inline def microsoftSqlServerSettings(args: Endofunction[com.pulumi.aws.dms.inputs.DataProviderSettingsMicrosoftSqlServerSettingsArgs.Builder]):
        com.pulumi.aws.dms.inputs.DataProviderSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.DataProviderSettingsMicrosoftSqlServerSettingsArgs.builder
      builder.microsoftSqlServerSettings(args(argsBuilder).build)

    /**
     * @param mongoDbSettings Settings for the `mongodb` engine. See `mongoDbSettings` Block below.
     * @return builder
     */
    inline def mongoDbSettings(args: Endofunction[com.pulumi.aws.dms.inputs.DataProviderSettingsMongoDbSettingsArgs.Builder]):
        com.pulumi.aws.dms.inputs.DataProviderSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.DataProviderSettingsMongoDbSettingsArgs.builder
      builder.mongoDbSettings(args(argsBuilder).build)

    /**
     * @param mysqlSettings Settings for the `mysql` and `aurora` engines. See `mysqlSettings` Block below.
     * @return builder
     */
    inline def mysqlSettings(args: Endofunction[com.pulumi.aws.dms.inputs.DataProviderSettingsMysqlSettingsArgs.Builder]):
        com.pulumi.aws.dms.inputs.DataProviderSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.DataProviderSettingsMysqlSettingsArgs.builder
      builder.mysqlSettings(args(argsBuilder).build)

    /**
     * @param oracleSettings Settings for the `oracle` engine. See `oracleSettings` Block below.
     * @return builder
     */
    inline def oracleSettings(args: Endofunction[com.pulumi.aws.dms.inputs.DataProviderSettingsOracleSettingsArgs.Builder]):
        com.pulumi.aws.dms.inputs.DataProviderSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.DataProviderSettingsOracleSettingsArgs.builder
      builder.oracleSettings(args(argsBuilder).build)

    /**
     * @param postgresqlSettings Settings for the `postgres` and `aurora-postgresql` engines. See `postgresqlSettings` Block below.
     * @return builder
     */
    inline def postgresqlSettings(args: Endofunction[com.pulumi.aws.dms.inputs.DataProviderSettingsPostgresqlSettingsArgs.Builder]):
        com.pulumi.aws.dms.inputs.DataProviderSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.DataProviderSettingsPostgresqlSettingsArgs.builder
      builder.postgresqlSettings(args(argsBuilder).build)

    /**
     * @param redshiftSettings Settings for the `redshift` engine. See `redshiftSettings` Block below.
     * @return builder
     */
    inline def redshiftSettings(args: Endofunction[com.pulumi.aws.dms.inputs.DataProviderSettingsRedshiftSettingsArgs.Builder]):
        com.pulumi.aws.dms.inputs.DataProviderSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.DataProviderSettingsRedshiftSettingsArgs.builder
      builder.redshiftSettings(args(argsBuilder).build)

    /**
     * @param sybaseAseSettings Settings for the `sybase` engine. See `sybaseAseSettings` Block below.
     * @return builder
     */
    inline def sybaseAseSettings(args: Endofunction[com.pulumi.aws.dms.inputs.DataProviderSettingsSybaseAseSettingsArgs.Builder]):
        com.pulumi.aws.dms.inputs.DataProviderSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.DataProviderSettingsSybaseAseSettingsArgs.builder
      builder.sybaseAseSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dms.inputs.DataProviderState.Builder)
    /**
     * @param settings Database connection settings. Configure exactly one block matching `engine`. See `settings` Block below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def settings(args: Endofunction[com.pulumi.aws.dms.inputs.DataProviderSettingsArgs.Builder]):
        com.pulumi.aws.dms.inputs.DataProviderState.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.DataProviderSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dms.inputs.EndpointState.Builder)
    /**
     * @param elasticsearchSettings Configuration block for OpenSearch settings. See below.
     * @return builder
     */
    inline def elasticsearchSettings(args: Endofunction[com.pulumi.aws.dms.inputs.EndpointElasticsearchSettingsArgs.Builder]):
        com.pulumi.aws.dms.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.EndpointElasticsearchSettingsArgs.builder
      builder.elasticsearchSettings(args(argsBuilder).build)

    /**
     * @param kafkaSettings Configuration block for Kafka settings. See below.
     * @return builder
     */
    inline def kafkaSettings(args: Endofunction[com.pulumi.aws.dms.inputs.EndpointKafkaSettingsArgs.Builder]):
        com.pulumi.aws.dms.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.EndpointKafkaSettingsArgs.builder
      builder.kafkaSettings(args(argsBuilder).build)

    /**
     * @param kinesisSettings Configuration block for Kinesis settings. See below.
     * @return builder
     */
    inline def kinesisSettings(args: Endofunction[com.pulumi.aws.dms.inputs.EndpointKinesisSettingsArgs.Builder]):
        com.pulumi.aws.dms.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.EndpointKinesisSettingsArgs.builder
      builder.kinesisSettings(args(argsBuilder).build)

    /**
     * @param mongodbSettings Configuration block for MongoDB settings. See below.
     * @return builder
     */
    inline def mongodbSettings(args: Endofunction[com.pulumi.aws.dms.inputs.EndpointMongodbSettingsArgs.Builder]):
        com.pulumi.aws.dms.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.EndpointMongodbSettingsArgs.builder
      builder.mongodbSettings(args(argsBuilder).build)

    /**
     * @param mysqlSettings Configuration block for MySQL settings. See below.
     * @return builder
     */
    inline def mysqlSettings(args: Endofunction[com.pulumi.aws.dms.inputs.EndpointMysqlSettingsArgs.Builder]):
        com.pulumi.aws.dms.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.EndpointMysqlSettingsArgs.builder
      builder.mysqlSettings(args(argsBuilder).build)

    /**
     * @param oracleSettings Configuration block for Oracle settings. See below.
     * @return builder
     */
    inline def oracleSettings(args: Endofunction[com.pulumi.aws.dms.inputs.EndpointOracleSettingsArgs.Builder]):
        com.pulumi.aws.dms.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.EndpointOracleSettingsArgs.builder
      builder.oracleSettings(args(argsBuilder).build)

    /**
     * @param postgresSettings Configuration block for Postgres settings. See below.
     * @return builder
     */
    inline def postgresSettings(args: Endofunction[com.pulumi.aws.dms.inputs.EndpointPostgresSettingsArgs.Builder]):
        com.pulumi.aws.dms.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.EndpointPostgresSettingsArgs.builder
      builder.postgresSettings(args(argsBuilder).build)

    inline def redisSettings(args: Endofunction[com.pulumi.aws.dms.inputs.EndpointRedisSettingsArgs.Builder]):
        com.pulumi.aws.dms.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.EndpointRedisSettingsArgs.builder
      builder.redisSettings(args(argsBuilder).build)

    /**
     * @param redshiftSettings Configuration block for Redshift settings. See below.
     * @return builder
     */
    inline def redshiftSettings(args: Endofunction[com.pulumi.aws.dms.inputs.EndpointRedshiftSettingsArgs.Builder]):
        com.pulumi.aws.dms.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.EndpointRedshiftSettingsArgs.builder
      builder.redshiftSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dms.inputs.MigrationProjectState.Builder)
    /**
     * @param schemaConversionApplicationAttributes Schema conversion application attributes, including the S3 bucket path and S3 role ARN. See `schemaConversionApplicationAttributes` Block below.
     * @return builder
     */
    inline def schemaConversionApplicationAttributes(args: Endofunction[com.pulumi.aws.dms.inputs.MigrationProjectSchemaConversionApplicationAttributesArgs.Builder]):
        com.pulumi.aws.dms.inputs.MigrationProjectState.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.MigrationProjectSchemaConversionApplicationAttributesArgs.builder
      builder.schemaConversionApplicationAttributes(args(argsBuilder).build)

    /**
     * @param sourceDataProviderDescriptors Information about the source data provider. See `sourceDataProviderDescriptor` Block below.
     * @return builder
     */
    inline def sourceDataProviderDescriptors(args: Endofunction[com.pulumi.aws.dms.inputs.MigrationProjectSourceDataProviderDescriptorArgs.Builder]*):
        com.pulumi.aws.dms.inputs.MigrationProjectState.Builder =
      def argsBuilder = com.pulumi.aws.dms.inputs.MigrationProjectSourceDataProviderDescriptorArgs.builder
      builder.sourceDataProviderDescriptors(args.map(_(argsBuilder).build)*)

    /**
     * @param targetDataProviderDescriptors Information about the target data provider. See `targetDataProviderDescriptor` Block below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def targetDataProviderDescriptors(args: Endofunction[com.pulumi.aws.dms.inputs.MigrationProjectTargetDataProviderDescriptorArgs.Builder]*):
        com.pulumi.aws.dms.inputs.MigrationProjectState.Builder =
      def argsBuilder = com.pulumi.aws.dms.inputs.MigrationProjectTargetDataProviderDescriptorArgs.builder
      builder.targetDataProviderDescriptors(args.map(_(argsBuilder).build)*)

    inline def timeouts(args: Endofunction[com.pulumi.aws.dms.inputs.MigrationProjectTimeoutsArgs.Builder]):
        com.pulumi.aws.dms.inputs.MigrationProjectState.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.MigrationProjectTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dms.inputs.ReplicationConfigState.Builder)
    /**
     * @param computeConfig Configuration block for provisioning an DMS Serverless replication.
     * @return builder
     */
    inline def computeConfig(args: Endofunction[com.pulumi.aws.dms.inputs.ReplicationConfigComputeConfigArgs.Builder]):
        com.pulumi.aws.dms.inputs.ReplicationConfigState.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.ReplicationConfigComputeConfigArgs.builder
      builder.computeConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dms.inputs.ReplicationInstanceState.Builder)
    /**
     * @param kerberosAuthenticationSettings Configuration block for settings required for Kerberos authentication. See below.
     * @return builder
     */
    inline def kerberosAuthenticationSettings(args: Endofunction[com.pulumi.aws.dms.inputs.ReplicationInstanceKerberosAuthenticationSettingsArgs.Builder]):
        com.pulumi.aws.dms.inputs.ReplicationInstanceState.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.ReplicationInstanceKerberosAuthenticationSettingsArgs.builder
      builder.kerberosAuthenticationSettings(args(argsBuilder).build)
