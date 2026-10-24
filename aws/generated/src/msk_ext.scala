package jp.ukiba.ko_pulumi
package aws

object msk_ext:
  extension (builder: com.pulumi.aws.msk.ChannelArgs.Builder)
    /**
     * @param encryptionConfiguration AWS KMS encryption configuration applied to data at rest. Changing this forces a new resource to be created. See `encryptionConfiguration` Block below.
     * @return builder
     */
    inline def encryptionConfiguration(args: Endofunction[com.pulumi.aws.msk.inputs.ChannelEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.msk.ChannelArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ChannelEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

    /**
     * @param icebergDestination Apache Iceberg destination for the channel. Exactly one of `icebergDestination` or `s3Destination` is required. With the exception of `dataFreshnessInSeconds`, changing an argument in this block forces a new resource to be created. See `icebergDestination` Block below.
     * @return builder
     */
    inline def icebergDestination(args: Endofunction[com.pulumi.aws.msk.inputs.ChannelIcebergDestinationArgs.Builder]):
        com.pulumi.aws.msk.ChannelArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ChannelIcebergDestinationArgs.builder
      builder.icebergDestination(args(argsBuilder).build)

    /**
     * @param loggingInfo Destinations to which the channel publishes operational logs. Changing this forces a new resource to be created. See `loggingInfo` Block below.
     * @return builder
     */
    inline def loggingInfo(args: Endofunction[com.pulumi.aws.msk.inputs.ChannelLoggingInfoArgs.Builder]):
        com.pulumi.aws.msk.ChannelArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ChannelLoggingInfoArgs.builder
      builder.loggingInfo(args(argsBuilder).build)

    /**
     * @param s3Destination Amazon S3 destination for the channel. Exactly one of `icebergDestination` or `s3Destination` is required. With the exception of `dataFreshnessInSeconds`, changing an argument in this block forces a new resource to be created. See `s3Destination` Block below.
     * @return builder
     */
    inline def s3Destination(args: Endofunction[com.pulumi.aws.msk.inputs.ChannelS3DestinationArgs.Builder]):
        com.pulumi.aws.msk.ChannelArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ChannelS3DestinationArgs.builder
      builder.s3Destination(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.msk.inputs.ChannelTimeoutsArgs.Builder]):
        com.pulumi.aws.msk.ChannelArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ChannelTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param topicConfiguration Configuration of the Apache Kafka topic that feeds the channel. Changing this forces a new resource to be created. See `topicConfiguration` Block below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def topicConfiguration(args: Endofunction[com.pulumi.aws.msk.inputs.ChannelTopicConfigurationArgs.Builder]):
        com.pulumi.aws.msk.ChannelArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ChannelTopicConfigurationArgs.builder
      builder.topicConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.ClusterArgs.Builder)
    /**
     * @param brokerNodeGroupInfo Configuration block for the broker nodes of the Kafka cluster. See `brokerNodeGroupInfo` Block below.
     * @return builder
     */
    inline def brokerNodeGroupInfo(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoArgs.Builder]):
        com.pulumi.aws.msk.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoArgs.builder
      builder.brokerNodeGroupInfo(args(argsBuilder).build)

    /**
     * @param clientAuthentication Configuration block for specifying a client authentication. See `clientAuthentication` Block below.
     * @return builder
     */
    inline def clientAuthentication(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterClientAuthenticationArgs.Builder]):
        com.pulumi.aws.msk.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterClientAuthenticationArgs.builder
      builder.clientAuthentication(args(argsBuilder).build)

    /**
     * @param configurationInfo Configuration block for specifying an MSK Configuration to attach to Kafka brokers. See `configurationInfo` Block below.
     * @return builder
     */
    inline def configurationInfo(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterConfigurationInfoArgs.Builder]):
        com.pulumi.aws.msk.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterConfigurationInfoArgs.builder
      builder.configurationInfo(args(argsBuilder).build)

    /**
     * @param encryptionInfo Configuration block for specifying encryption. See `encryptionInfo` Block below.
     * @return builder
     */
    inline def encryptionInfo(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterEncryptionInfoArgs.Builder]):
        com.pulumi.aws.msk.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterEncryptionInfoArgs.builder
      builder.encryptionInfo(args(argsBuilder).build)

    /**
     * @param loggingInfo Configuration block for streaming broker logs to Cloudwatch/S3/Kinesis Firehose. See `loggingInfo` Block below.
     * @return builder
     */
    inline def loggingInfo(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterLoggingInfoArgs.Builder]):
        com.pulumi.aws.msk.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterLoggingInfoArgs.builder
      builder.loggingInfo(args(argsBuilder).build)

    /**
     * @param openMonitoring Configuration block for JMX and Node monitoring for the MSK cluster. See `openMonitoring` Block below.
     * @return builder
     */
    inline def openMonitoring(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterOpenMonitoringArgs.Builder]):
        com.pulumi.aws.msk.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterOpenMonitoringArgs.builder
      builder.openMonitoring(args(argsBuilder).build)

    /**
     * @param rebalancing Configuration block for intelligent rebalancing. See `rebalancing` Block below. Only applicable to MSK Provisioned clusters with Express brokers.
     * @return builder
     */
    inline def rebalancing(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterRebalancingArgs.Builder]):
        com.pulumi.aws.msk.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterRebalancingArgs.builder
      builder.rebalancing(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.ReplicatorArgs.Builder)
    /**
     * @param kafkaClusters Source and target Kafka clusters for the replicator. Exactly two blocks are required. See `kafkaCluster` Block below.
     * @return builder
     */
    inline def kafkaClusters(args: Endofunction[com.pulumi.aws.msk.inputs.ReplicatorKafkaClusterArgs.Builder]*):
        com.pulumi.aws.msk.ReplicatorArgs.Builder =
      def argsBuilder = com.pulumi.aws.msk.inputs.ReplicatorKafkaClusterArgs.builder
      builder.kafkaClusters(args.map(_(argsBuilder).build)*)

    /**
     * @param logDelivery Configuration block for delivering replicator logs to customer destinations. See `logDelivery` Block below.
     * @return builder
     */
    inline def logDelivery(args: Endofunction[com.pulumi.aws.msk.inputs.ReplicatorLogDeliveryArgs.Builder]):
        com.pulumi.aws.msk.ReplicatorArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ReplicatorLogDeliveryArgs.builder
      builder.logDelivery(args(argsBuilder).build)

    /**
     * @param replicationInfoList List of replication configurations, where each configuration targets a given source cluster to target cluster replication flow. See `replicationInfoList` Block below.
     * @return builder
     */
    inline def replicationInfoList(args: Endofunction[com.pulumi.aws.msk.inputs.ReplicatorReplicationInfoListArgs.Builder]):
        com.pulumi.aws.msk.ReplicatorArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ReplicatorReplicationInfoListArgs.builder
      builder.replicationInfoList(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.ServerlessClusterArgs.Builder)
    /**
     * @param clientAuthentication Client authentication information for the serverless cluster. See `clientAuthentication` Block below.
     * @return builder
     */
    inline def clientAuthentication(args: Endofunction[com.pulumi.aws.msk.inputs.ServerlessClusterClientAuthenticationArgs.Builder]):
        com.pulumi.aws.msk.ServerlessClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ServerlessClusterClientAuthenticationArgs.builder
      builder.clientAuthentication(args(argsBuilder).build)

    /**
     * @param vpcConfigs VPC configuration information. See `vpcConfig` Block below.
     * @return builder
     */
    inline def vpcConfigs(args: Endofunction[com.pulumi.aws.msk.inputs.ServerlessClusterVpcConfigArgs.Builder]*):
        com.pulumi.aws.msk.ServerlessClusterArgs.Builder =
      def argsBuilder = com.pulumi.aws.msk.inputs.ServerlessClusterVpcConfigArgs.builder
      builder.vpcConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.msk.TopicArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.msk.inputs.TopicTimeoutsArgs.Builder]):
        com.pulumi.aws.msk.TopicArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.TopicTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ChannelIcebergDestinationArgs.Builder)
    /**
     * @param catalog AWS Glue Data Catalog and S3 Tables warehouse used by the destination. See `catalog` Block below.
     * @return builder
     */
    inline def catalog(args: Endofunction[com.pulumi.aws.msk.inputs.ChannelIcebergDestinationCatalogArgs.Builder]):
        com.pulumi.aws.msk.inputs.ChannelIcebergDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ChannelIcebergDestinationCatalogArgs.builder
      builder.catalog(args(argsBuilder).build)

    /**
     * @param deadLetterQueueS3 Amazon S3 bucket and prefix where MSK writes records that fail to deliver. See `deadLetterQueueS3` Block below.
     * @return builder
     */
    inline def deadLetterQueueS3(args: Endofunction[com.pulumi.aws.msk.inputs.ChannelIcebergDestinationDeadLetterQueueS3Args.Builder]):
        com.pulumi.aws.msk.inputs.ChannelIcebergDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ChannelIcebergDestinationDeadLetterQueueS3Args.builder
      builder.deadLetterQueueS3(args(argsBuilder).build)

    /**
     * @param destinationTable Destination Iceberg table. See `destinationTable` Block below.
     * @return builder
     */
    inline def destinationTable(args: Endofunction[com.pulumi.aws.msk.inputs.ChannelIcebergDestinationDestinationTableArgs.Builder]):
        com.pulumi.aws.msk.inputs.ChannelIcebergDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ChannelIcebergDestinationDestinationTableArgs.builder
      builder.destinationTable(args(argsBuilder).build)

    /**
     * @param schemaEvolution Configuration controlling whether the destination table&#39;s schema is evolved to match incoming records. See `schemaEvolution` Block below.
     * @return builder
     */
    inline def schemaEvolution(args: Endofunction[com.pulumi.aws.msk.inputs.ChannelIcebergDestinationSchemaEvolutionArgs.Builder]):
        com.pulumi.aws.msk.inputs.ChannelIcebergDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ChannelIcebergDestinationSchemaEvolutionArgs.builder
      builder.schemaEvolution(args(argsBuilder).build)

    /**
     * @param tableCreation Configuration controlling whether MSK creates the destination table if it does not already exist. See `tableCreation` Block below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def tableCreation(args: Endofunction[com.pulumi.aws.msk.inputs.ChannelIcebergDestinationTableCreationArgs.Builder]):
        com.pulumi.aws.msk.inputs.ChannelIcebergDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ChannelIcebergDestinationTableCreationArgs.builder
      builder.tableCreation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ChannelIcebergDestinationDestinationTableArgs.Builder)
    /**
     * @param partitionSpec Partition specification for the destination table. See `partitionSpec` Block below.
     * @return builder
     */
    inline def partitionSpec(args: Endofunction[com.pulumi.aws.msk.inputs.ChannelIcebergDestinationDestinationTablePartitionSpecArgs.Builder]):
        com.pulumi.aws.msk.inputs.ChannelIcebergDestinationDestinationTableArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ChannelIcebergDestinationDestinationTablePartitionSpecArgs.builder
      builder.partitionSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ChannelIcebergDestinationDestinationTablePartitionSpecArgs.Builder)
    /**
     * @param sources Source column used by the partitioning strategy. For `TIME_HOUR`, exactly one source must be specified and its column must be a timestamp. See `source` Block below.
     * @return builder
     */
    inline def sources(args: Endofunction[com.pulumi.aws.msk.inputs.ChannelIcebergDestinationDestinationTablePartitionSpecSourceArgs.Builder]*):
        com.pulumi.aws.msk.inputs.ChannelIcebergDestinationDestinationTablePartitionSpecArgs.Builder =
      def argsBuilder = com.pulumi.aws.msk.inputs.ChannelIcebergDestinationDestinationTablePartitionSpecSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.msk.inputs.ChannelLoggingInfoArgs.Builder)
    /**
     * @param cloudwatchLogs CloudWatch Logs destination for channel logs. See `cloudwatchLogs` Block below.
     * @return builder
     */
    inline def cloudwatchLogs(args: Endofunction[com.pulumi.aws.msk.inputs.ChannelLoggingInfoCloudwatchLogsArgs.Builder]):
        com.pulumi.aws.msk.inputs.ChannelLoggingInfoArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ChannelLoggingInfoCloudwatchLogsArgs.builder
      builder.cloudwatchLogs(args(argsBuilder).build)

    /**
     * @param firehose Kinesis Data Firehose delivery stream destination for channel logs. See `firehose` Block below.
     * @return builder
     */
    inline def firehose(args: Endofunction[com.pulumi.aws.msk.inputs.ChannelLoggingInfoFirehoseArgs.Builder]):
        com.pulumi.aws.msk.inputs.ChannelLoggingInfoArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ChannelLoggingInfoFirehoseArgs.builder
      builder.firehose(args(argsBuilder).build)

    /**
     * @param s3 Amazon S3 destination for channel logs. See `s3` Block below.
     * @return builder
     */
    inline def s3(args: Endofunction[com.pulumi.aws.msk.inputs.ChannelLoggingInfoS3Args.Builder]):
        com.pulumi.aws.msk.inputs.ChannelLoggingInfoArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ChannelLoggingInfoS3Args.builder
      builder.s3(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ChannelS3DestinationArgs.Builder)
    /**
     * @param deadLetterQueueS3 Amazon S3 bucket and prefix where MSK writes records that fail to deliver. See `deadLetterQueueS3` Block below.
     * @return builder
     */
    inline def deadLetterQueueS3(args: Endofunction[com.pulumi.aws.msk.inputs.ChannelS3DestinationDeadLetterQueueS3Args.Builder]):
        com.pulumi.aws.msk.inputs.ChannelS3DestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ChannelS3DestinationDeadLetterQueueS3Args.builder
      builder.deadLetterQueueS3(args(argsBuilder).build)

    /**
     * @param storage Amazon S3 bucket, prefix, and storage class for delivered records. See `storage` Block below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def storage(args: Endofunction[com.pulumi.aws.msk.inputs.ChannelS3DestinationStorageArgs.Builder]):
        com.pulumi.aws.msk.inputs.ChannelS3DestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ChannelS3DestinationStorageArgs.builder
      builder.storage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ChannelState.Builder)
    /**
     * @param encryptionConfiguration AWS KMS encryption configuration applied to data at rest. Changing this forces a new resource to be created. See `encryptionConfiguration` Block below.
     * @return builder
     */
    inline def encryptionConfiguration(args: Endofunction[com.pulumi.aws.msk.inputs.ChannelEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.msk.inputs.ChannelState.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ChannelEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

    /**
     * @param icebergDestination Apache Iceberg destination for the channel. Exactly one of `icebergDestination` or `s3Destination` is required. With the exception of `dataFreshnessInSeconds`, changing an argument in this block forces a new resource to be created. See `icebergDestination` Block below.
     * @return builder
     */
    inline def icebergDestination(args: Endofunction[com.pulumi.aws.msk.inputs.ChannelIcebergDestinationArgs.Builder]):
        com.pulumi.aws.msk.inputs.ChannelState.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ChannelIcebergDestinationArgs.builder
      builder.icebergDestination(args(argsBuilder).build)

    /**
     * @param loggingInfo Destinations to which the channel publishes operational logs. Changing this forces a new resource to be created. See `loggingInfo` Block below.
     * @return builder
     */
    inline def loggingInfo(args: Endofunction[com.pulumi.aws.msk.inputs.ChannelLoggingInfoArgs.Builder]):
        com.pulumi.aws.msk.inputs.ChannelState.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ChannelLoggingInfoArgs.builder
      builder.loggingInfo(args(argsBuilder).build)

    /**
     * @param s3Destination Amazon S3 destination for the channel. Exactly one of `icebergDestination` or `s3Destination` is required. With the exception of `dataFreshnessInSeconds`, changing an argument in this block forces a new resource to be created. See `s3Destination` Block below.
     * @return builder
     */
    inline def s3Destination(args: Endofunction[com.pulumi.aws.msk.inputs.ChannelS3DestinationArgs.Builder]):
        com.pulumi.aws.msk.inputs.ChannelState.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ChannelS3DestinationArgs.builder
      builder.s3Destination(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.msk.inputs.ChannelTimeoutsArgs.Builder]):
        com.pulumi.aws.msk.inputs.ChannelState.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ChannelTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param topicConfiguration Configuration of the Apache Kafka topic that feeds the channel. Changing this forces a new resource to be created. See `topicConfiguration` Block below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def topicConfiguration(args: Endofunction[com.pulumi.aws.msk.inputs.ChannelTopicConfigurationArgs.Builder]):
        com.pulumi.aws.msk.inputs.ChannelState.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ChannelTopicConfigurationArgs.builder
      builder.topicConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ChannelTopicConfigurationArgs.Builder)
    /**
     * @param recordConverter Configuration that controls how Apache Kafka record values are deserialized for the destination. See `recordConverter` Block below.
     * @return builder
     */
    inline def recordConverter(args: Endofunction[com.pulumi.aws.msk.inputs.ChannelTopicConfigurationRecordConverterArgs.Builder]):
        com.pulumi.aws.msk.inputs.ChannelTopicConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ChannelTopicConfigurationRecordConverterArgs.builder
      builder.recordConverter(args(argsBuilder).build)

    /**
     * @param recordSchema Schema used to validate records when the value converter requires one. See `recordSchema` Block below.
     * @return builder
     */
    inline def recordSchema(args: Endofunction[com.pulumi.aws.msk.inputs.ChannelTopicConfigurationRecordSchemaArgs.Builder]):
        com.pulumi.aws.msk.inputs.ChannelTopicConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ChannelTopicConfigurationRecordSchemaArgs.builder
      builder.recordSchema(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoArgs.Builder)
    /**
     * @param connectivityInfo Information about the cluster access configuration. See `connectivityInfo` Block below. For security reasons, you can&#39;t turn on public access while creating an MSK cluster. However, you can update an existing cluster to make it publicly accessible. You can also create a new cluster and then update it to make it publicly accessible ([documentation](https://docs.aws.amazon.com/msk/latest/developerguide/public-access.html)).
     * @return builder
     */
    inline def connectivityInfo(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoConnectivityInfoArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoConnectivityInfoArgs.builder
      builder.connectivityInfo(args(argsBuilder).build)

    /**
     * @param storageInfo Configuration block that contains information about storage volumes attached to MSK broker nodes. See `storageInfo` Block below. This block must not be specified when an Express instance type is specified for `instanceType`.
     * @return builder
     */
    inline def storageInfo(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoStorageInfoArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoStorageInfoArgs.builder
      builder.storageInfo(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoConnectivityInfoArgs.Builder)
    /**
     * @param publicAccess Access control settings for brokers. See `publicAccess` Block below.
     * @return builder
     */
    inline def publicAccess(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoConnectivityInfoPublicAccessArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoConnectivityInfoArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoConnectivityInfoPublicAccessArgs.builder
      builder.publicAccess(args(argsBuilder).build)

    /**
     * @param vpcConnectivity VPC connectivity access control for brokers. See `vpcConnectivity` Block below.
     * @return builder
     */
    inline def vpcConnectivity(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoConnectivityInfoVpcConnectivityArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoConnectivityInfoArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoConnectivityInfoVpcConnectivityArgs.builder
      builder.vpcConnectivity(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoConnectivityInfoVpcConnectivityArgs.Builder)
    /**
     * @param clientAuthentication Client authentication information for VPC connectivity. See `vpc_connectivity.client_authentication` Block below.
     * @return builder
     */
    inline def clientAuthentication(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoConnectivityInfoVpcConnectivityClientAuthenticationArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoConnectivityInfoVpcConnectivityArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoConnectivityInfoVpcConnectivityClientAuthenticationArgs.builder
      builder.clientAuthentication(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoConnectivityInfoVpcConnectivityClientAuthenticationArgs.Builder)
    /**
     * @param sasl Configuration block for specifying SASL client authentication. See `sasl` Block below.
     * @return builder
     */
    inline def sasl(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoConnectivityInfoVpcConnectivityClientAuthenticationSaslArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoConnectivityInfoVpcConnectivityClientAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoConnectivityInfoVpcConnectivityClientAuthenticationSaslArgs.builder
      builder.sasl(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoStorageInfoArgs.Builder)
    /**
     * @param ebsStorageInfo Configuration block that contains EBS volume information. See `ebsStorageInfo` Block below.
     * @return builder
     */
    inline def ebsStorageInfo(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoStorageInfoArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoArgs.builder
      builder.ebsStorageInfo(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoArgs.Builder)
    /**
     * @param provisionedThroughput Configuration block that contains EBS volume provisioned throughput information. To provision storage throughput, you must choose broker type kafka.m5.4xlarge or larger. See `provisionedThroughput` Block below.
     * @return builder
     */
    inline def provisionedThroughput(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughputArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughputArgs.builder
      builder.provisionedThroughput(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ClusterClientAuthenticationArgs.Builder)
    /**
     * @param sasl Configuration block for specifying SASL client authentication. See `sasl` Block below.
     * @return builder
     */
    inline def sasl(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterClientAuthenticationSaslArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterClientAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterClientAuthenticationSaslArgs.builder
      builder.sasl(args(argsBuilder).build)

    /**
     * @param tls Configuration block for specifying TLS client authentication. See `tls` Block below.
     * @return builder
     */
    inline def tls(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterClientAuthenticationTlsArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterClientAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterClientAuthenticationTlsArgs.builder
      builder.tls(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ClusterEncryptionInfoArgs.Builder)
    /**
     * @param encryptionInTransit Configuration block to specify encryption in transit. See `encryptionInTransit` Block below.
     * @return builder
     */
    inline def encryptionInTransit(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterEncryptionInfoEncryptionInTransitArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterEncryptionInfoArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterEncryptionInfoEncryptionInTransitArgs.builder
      builder.encryptionInTransit(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ClusterLoggingInfoArgs.Builder)
    /**
     * @param brokerLogs Configuration block for Broker Logs settings for logging info. See `brokerLogs` Block below.
     * @return builder
     */
    inline def brokerLogs(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterLoggingInfoBrokerLogsArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterLoggingInfoArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterLoggingInfoBrokerLogsArgs.builder
      builder.brokerLogs(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ClusterLoggingInfoBrokerLogsArgs.Builder)
    /**
     * @param cloudwatchLogs Configuration block for CloudWatch Logs settings. See `cloudwatchLogs` Block below.
     * @return builder
     */
    inline def cloudwatchLogs(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterLoggingInfoBrokerLogsCloudwatchLogsArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterLoggingInfoBrokerLogsArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterLoggingInfoBrokerLogsCloudwatchLogsArgs.builder
      builder.cloudwatchLogs(args(argsBuilder).build)

    /**
     * @param firehose Configuration block for Kinesis Data Firehose settings. See `firehose` Block below.
     * @return builder
     */
    inline def firehose(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterLoggingInfoBrokerLogsFirehoseArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterLoggingInfoBrokerLogsArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterLoggingInfoBrokerLogsFirehoseArgs.builder
      builder.firehose(args(argsBuilder).build)

    /**
     * @param s3 Configuration block for S3 settings. See `s3` Block below.
     * @return builder
     */
    inline def s3(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterLoggingInfoBrokerLogsS3Args.Builder]):
        com.pulumi.aws.msk.inputs.ClusterLoggingInfoBrokerLogsArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterLoggingInfoBrokerLogsS3Args.builder
      builder.s3(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ClusterOpenMonitoringArgs.Builder)
    /**
     * @param prometheus Configuration block for Prometheus settings for open monitoring. See `prometheus` Block below.
     * @return builder
     */
    inline def prometheus(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterOpenMonitoringPrometheusArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterOpenMonitoringArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterOpenMonitoringPrometheusArgs.builder
      builder.prometheus(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ClusterOpenMonitoringPrometheusArgs.Builder)
    /**
     * @param jmxExporter Configuration block for JMX Exporter. See `jmxExporter` Block below.
     * @return builder
     */
    inline def jmxExporter(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterOpenMonitoringPrometheusJmxExporterArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterOpenMonitoringPrometheusArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterOpenMonitoringPrometheusJmxExporterArgs.builder
      builder.jmxExporter(args(argsBuilder).build)

    /**
     * @param nodeExporter Configuration block for Node Exporter. See `nodeExporter` Block below.
     * @return builder
     */
    inline def nodeExporter(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterOpenMonitoringPrometheusNodeExporterArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterOpenMonitoringPrometheusArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterOpenMonitoringPrometheusNodeExporterArgs.builder
      builder.nodeExporter(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ClusterState.Builder)
    /**
     * @param brokerNodeGroupInfo Configuration block for the broker nodes of the Kafka cluster. See `brokerNodeGroupInfo` Block below.
     * @return builder
     */
    inline def brokerNodeGroupInfo(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoArgs.builder
      builder.brokerNodeGroupInfo(args(argsBuilder).build)

    /**
     * @param clientAuthentication Configuration block for specifying a client authentication. See `clientAuthentication` Block below.
     * @return builder
     */
    inline def clientAuthentication(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterClientAuthenticationArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterClientAuthenticationArgs.builder
      builder.clientAuthentication(args(argsBuilder).build)

    /**
     * @param configurationInfo Configuration block for specifying an MSK Configuration to attach to Kafka brokers. See `configurationInfo` Block below.
     * @return builder
     */
    inline def configurationInfo(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterConfigurationInfoArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterConfigurationInfoArgs.builder
      builder.configurationInfo(args(argsBuilder).build)

    /**
     * @param encryptionInfo Configuration block for specifying encryption. See `encryptionInfo` Block below.
     * @return builder
     */
    inline def encryptionInfo(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterEncryptionInfoArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterEncryptionInfoArgs.builder
      builder.encryptionInfo(args(argsBuilder).build)

    /**
     * @param loggingInfo Configuration block for streaming broker logs to Cloudwatch/S3/Kinesis Firehose. See `loggingInfo` Block below.
     * @return builder
     */
    inline def loggingInfo(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterLoggingInfoArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterLoggingInfoArgs.builder
      builder.loggingInfo(args(argsBuilder).build)

    /**
     * @param openMonitoring Configuration block for JMX and Node monitoring for the MSK cluster. See `openMonitoring` Block below.
     * @return builder
     */
    inline def openMonitoring(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterOpenMonitoringArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterOpenMonitoringArgs.builder
      builder.openMonitoring(args(argsBuilder).build)

    /**
     * @param rebalancing Configuration block for intelligent rebalancing. See `rebalancing` Block below. Only applicable to MSK Provisioned clusters with Express brokers.
     * @return builder
     */
    inline def rebalancing(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterRebalancingArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterRebalancingArgs.builder
      builder.rebalancing(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ReplicatorKafkaClusterArgs.Builder)
    /**
     * @param amazonMskCluster Details of an Amazon MSK cluster. Exactly one of `amazonMskCluster` or `apacheKafkaCluster` must be specified. See `amazonMskCluster` Block below.
     * @return builder
     */
    inline def amazonMskCluster(args: Endofunction[com.pulumi.aws.msk.inputs.ReplicatorKafkaClusterAmazonMskClusterArgs.Builder]):
        com.pulumi.aws.msk.inputs.ReplicatorKafkaClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ReplicatorKafkaClusterAmazonMskClusterArgs.builder
      builder.amazonMskCluster(args(argsBuilder).build)

    /**
     * @param apacheKafkaCluster Details of a self-managed or on-premises Apache Kafka cluster. Exactly one of `amazonMskCluster` or `apacheKafkaCluster` must be specified. See `apacheKafkaCluster` Block below.
     * @return builder
     */
    inline def apacheKafkaCluster(args: Endofunction[com.pulumi.aws.msk.inputs.ReplicatorKafkaClusterApacheKafkaClusterArgs.Builder]):
        com.pulumi.aws.msk.inputs.ReplicatorKafkaClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ReplicatorKafkaClusterApacheKafkaClusterArgs.builder
      builder.apacheKafkaCluster(args(argsBuilder).build)

    /**
     * @param clientAuthentication Details of the client authentication used by the Kafka cluster. Only valid for an `apacheKafkaCluster`. See `clientAuthentication` Block below.
     * @return builder
     */
    inline def clientAuthentication(args: Endofunction[com.pulumi.aws.msk.inputs.ReplicatorKafkaClusterClientAuthenticationArgs.Builder]):
        com.pulumi.aws.msk.inputs.ReplicatorKafkaClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ReplicatorKafkaClusterClientAuthenticationArgs.builder
      builder.clientAuthentication(args(argsBuilder).build)

    /**
     * @param encryptionInTransit Details of encryption in transit to the Kafka cluster. Only valid for an `apacheKafkaCluster`. TLS encryption in transit is always applied to an `apacheKafkaCluster`; this block is only required to supply a custom root CA chain (for a cluster using a private or self-signed certificate). See `encryptionInTransit` Block below.
     * @return builder
     */
    inline def encryptionInTransit(args: Endofunction[com.pulumi.aws.msk.inputs.ReplicatorKafkaClusterEncryptionInTransitArgs.Builder]):
        com.pulumi.aws.msk.inputs.ReplicatorKafkaClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ReplicatorKafkaClusterEncryptionInTransitArgs.builder
      builder.encryptionInTransit(args(argsBuilder).build)

    /**
     * @param vpcConfig Details of an Amazon VPC which has network connectivity to the Kafka cluster. Provide this on the `amazonMskCluster` entry only; the replicator reaches the Apache Kafka cluster through that VPC. See `vpcConfig` Block below.
     * @return builder
     */
    inline def vpcConfig(args: Endofunction[com.pulumi.aws.msk.inputs.ReplicatorKafkaClusterVpcConfigArgs.Builder]):
        com.pulumi.aws.msk.inputs.ReplicatorKafkaClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ReplicatorKafkaClusterVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ReplicatorKafkaClusterClientAuthenticationArgs.Builder)
    /**
     * @param mtls Details of the mTLS client authentication used by the Kafka cluster. See `mtls` Block below.
     * @return builder
     */
    inline def mtls(args: Endofunction[com.pulumi.aws.msk.inputs.ReplicatorKafkaClusterClientAuthenticationMtlsArgs.Builder]):
        com.pulumi.aws.msk.inputs.ReplicatorKafkaClusterClientAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ReplicatorKafkaClusterClientAuthenticationMtlsArgs.builder
      builder.mtls(args(argsBuilder).build)

    /**
     * @param saslScram Details of the SASL/SCRAM client authentication used by the Kafka cluster. See `saslScram` Block below.
     * @return builder
     */
    inline def saslScram(args: Endofunction[com.pulumi.aws.msk.inputs.ReplicatorKafkaClusterClientAuthenticationSaslScramArgs.Builder]):
        com.pulumi.aws.msk.inputs.ReplicatorKafkaClusterClientAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ReplicatorKafkaClusterClientAuthenticationSaslScramArgs.builder
      builder.saslScram(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ReplicatorLogDeliveryArgs.Builder)
    /**
     * @param replicatorLogDelivery Configuration block for replicator log delivery. See `replicatorLogDelivery` Block below.
     * @return builder
     */
    inline def replicatorLogDelivery(args: Endofunction[com.pulumi.aws.msk.inputs.ReplicatorLogDeliveryReplicatorLogDeliveryArgs.Builder]):
        com.pulumi.aws.msk.inputs.ReplicatorLogDeliveryArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ReplicatorLogDeliveryReplicatorLogDeliveryArgs.builder
      builder.replicatorLogDelivery(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ReplicatorLogDeliveryReplicatorLogDeliveryArgs.Builder)
    /**
     * @param cloudwatchLogs Configuration block for replicator log delivery to Amazon CloudWatch Logs. See `cloudwatchLogs` Block below.
     * @return builder
     */
    inline def cloudwatchLogs(args: Endofunction[com.pulumi.aws.msk.inputs.ReplicatorLogDeliveryReplicatorLogDeliveryCloudwatchLogsArgs.Builder]):
        com.pulumi.aws.msk.inputs.ReplicatorLogDeliveryReplicatorLogDeliveryArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ReplicatorLogDeliveryReplicatorLogDeliveryCloudwatchLogsArgs.builder
      builder.cloudwatchLogs(args(argsBuilder).build)

    /**
     * @param firehose Configuration block for replicator log delivery to Amazon Data Firehose. See `firehose` Block below.
     * @return builder
     */
    inline def firehose(args: Endofunction[com.pulumi.aws.msk.inputs.ReplicatorLogDeliveryReplicatorLogDeliveryFirehoseArgs.Builder]):
        com.pulumi.aws.msk.inputs.ReplicatorLogDeliveryReplicatorLogDeliveryArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ReplicatorLogDeliveryReplicatorLogDeliveryFirehoseArgs.builder
      builder.firehose(args(argsBuilder).build)

    /**
     * @param s3 Configuration block for replicator log delivery to Amazon S3. See `s3` Block below.
     * @return builder
     */
    inline def s3(args: Endofunction[com.pulumi.aws.msk.inputs.ReplicatorLogDeliveryReplicatorLogDeliveryS3Args.Builder]):
        com.pulumi.aws.msk.inputs.ReplicatorLogDeliveryReplicatorLogDeliveryArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ReplicatorLogDeliveryReplicatorLogDeliveryS3Args.builder
      builder.s3(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ReplicatorReplicationInfoListArgs.Builder)
    /**
     * @param consumerGroupReplications Configuration relating to consumer group replication. See `consumerGroupReplication` Block below.
     * @return builder
     */
    inline def consumerGroupReplications(args: Endofunction[com.pulumi.aws.msk.inputs.ReplicatorReplicationInfoListConsumerGroupReplicationArgs.Builder]*):
        com.pulumi.aws.msk.inputs.ReplicatorReplicationInfoListArgs.Builder =
      def argsBuilder = com.pulumi.aws.msk.inputs.ReplicatorReplicationInfoListConsumerGroupReplicationArgs.builder
      builder.consumerGroupReplications(args.map(_(argsBuilder).build)*)

    /**
     * @param topicReplications Configuration relating to topic replication. See `topicReplication` Block below.
     * @return builder
     */
    inline def topicReplications(args: Endofunction[com.pulumi.aws.msk.inputs.ReplicatorReplicationInfoListTopicReplicationArgs.Builder]*):
        com.pulumi.aws.msk.inputs.ReplicatorReplicationInfoListArgs.Builder =
      def argsBuilder = com.pulumi.aws.msk.inputs.ReplicatorReplicationInfoListTopicReplicationArgs.builder
      builder.topicReplications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.msk.inputs.ReplicatorReplicationInfoListTopicReplicationArgs.Builder)
    /**
     * @param startingPosition Configuration for specifying the position in the topics to start replicating from. See `startingPosition` Block below.
     * @return builder
     */
    inline def startingPosition(args: Endofunction[com.pulumi.aws.msk.inputs.ReplicatorReplicationInfoListTopicReplicationStartingPositionArgs.Builder]):
        com.pulumi.aws.msk.inputs.ReplicatorReplicationInfoListTopicReplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ReplicatorReplicationInfoListTopicReplicationStartingPositionArgs.builder
      builder.startingPosition(args(argsBuilder).build)

    /**
     * @param topicNameConfiguration Configuration for specifying replicated topic names should be the same as their corresponding upstream topics or prefixed with source cluster alias. See `topicNameConfiguration` Block below.
     * @return builder
     */
    inline def topicNameConfiguration(args: Endofunction[com.pulumi.aws.msk.inputs.ReplicatorReplicationInfoListTopicReplicationTopicNameConfigurationArgs.Builder]):
        com.pulumi.aws.msk.inputs.ReplicatorReplicationInfoListTopicReplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ReplicatorReplicationInfoListTopicReplicationTopicNameConfigurationArgs.builder
      builder.topicNameConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ReplicatorState.Builder)
    /**
     * @param kafkaClusters Source and target Kafka clusters for the replicator. Exactly two blocks are required. See `kafkaCluster` Block below.
     * @return builder
     */
    inline def kafkaClusters(args: Endofunction[com.pulumi.aws.msk.inputs.ReplicatorKafkaClusterArgs.Builder]*):
        com.pulumi.aws.msk.inputs.ReplicatorState.Builder =
      def argsBuilder = com.pulumi.aws.msk.inputs.ReplicatorKafkaClusterArgs.builder
      builder.kafkaClusters(args.map(_(argsBuilder).build)*)

    /**
     * @param logDelivery Configuration block for delivering replicator logs to customer destinations. See `logDelivery` Block below.
     * @return builder
     */
    inline def logDelivery(args: Endofunction[com.pulumi.aws.msk.inputs.ReplicatorLogDeliveryArgs.Builder]):
        com.pulumi.aws.msk.inputs.ReplicatorState.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ReplicatorLogDeliveryArgs.builder
      builder.logDelivery(args(argsBuilder).build)

    /**
     * @param replicationInfoList List of replication configurations, where each configuration targets a given source cluster to target cluster replication flow. See `replicationInfoList` Block below.
     * @return builder
     */
    inline def replicationInfoList(args: Endofunction[com.pulumi.aws.msk.inputs.ReplicatorReplicationInfoListArgs.Builder]):
        com.pulumi.aws.msk.inputs.ReplicatorState.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ReplicatorReplicationInfoListArgs.builder
      builder.replicationInfoList(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ServerlessClusterClientAuthenticationArgs.Builder)
    /**
     * @param sasl Details for client authentication using SASL. See `sasl` Block below.
     * @return builder
     */
    inline def sasl(args: Endofunction[com.pulumi.aws.msk.inputs.ServerlessClusterClientAuthenticationSaslArgs.Builder]):
        com.pulumi.aws.msk.inputs.ServerlessClusterClientAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ServerlessClusterClientAuthenticationSaslArgs.builder
      builder.sasl(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ServerlessClusterClientAuthenticationSaslArgs.Builder)
    /**
     * @param iam Details for client authentication using IAM. See `iam` Block below.
     * @return builder
     */
    inline def iam(args: Endofunction[com.pulumi.aws.msk.inputs.ServerlessClusterClientAuthenticationSaslIamArgs.Builder]):
        com.pulumi.aws.msk.inputs.ServerlessClusterClientAuthenticationSaslArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ServerlessClusterClientAuthenticationSaslIamArgs.builder
      builder.iam(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ServerlessClusterState.Builder)
    /**
     * @param clientAuthentication Client authentication information for the serverless cluster. See `clientAuthentication` Block below.
     * @return builder
     */
    inline def clientAuthentication(args: Endofunction[com.pulumi.aws.msk.inputs.ServerlessClusterClientAuthenticationArgs.Builder]):
        com.pulumi.aws.msk.inputs.ServerlessClusterState.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ServerlessClusterClientAuthenticationArgs.builder
      builder.clientAuthentication(args(argsBuilder).build)

    /**
     * @param vpcConfigs VPC configuration information. See `vpcConfig` Block below.
     * @return builder
     */
    inline def vpcConfigs(args: Endofunction[com.pulumi.aws.msk.inputs.ServerlessClusterVpcConfigArgs.Builder]*):
        com.pulumi.aws.msk.inputs.ServerlessClusterState.Builder =
      def argsBuilder = com.pulumi.aws.msk.inputs.ServerlessClusterVpcConfigArgs.builder
      builder.vpcConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.msk.inputs.TopicState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.msk.inputs.TopicTimeoutsArgs.Builder]):
        com.pulumi.aws.msk.inputs.TopicState.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.TopicTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
