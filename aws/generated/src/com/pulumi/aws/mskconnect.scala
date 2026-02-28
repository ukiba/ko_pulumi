package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object mskconnect:
  /** Provides an Amazon MSK Connect Worker Configuration Resource. */
  def WorkerConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.mskconnect.WorkerConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.mskconnect.WorkerConfigurationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.mskconnect.WorkerConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type MskconnectFunctions = com.pulumi.aws.mskconnect.MskconnectFunctions
  object MskconnectFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.mskconnect.MskconnectFunctions.*
  extension (self: MskconnectFunctions.type)
    /** Get information on an Amazon MSK Connect Connector. */
    def getConnector(args: Endofunction[com.pulumi.aws.mskconnect.inputs.GetConnectorArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.mskconnect.outputs.GetConnectorResult] =
      val argsBuilder = com.pulumi.aws.mskconnect.inputs.GetConnectorArgs.builder
      com.pulumi.aws.mskconnect.MskconnectFunctions.getConnector(args(argsBuilder).build)

    /** Get information on an Amazon MSK Connect Connector. */
    def getConnectorPlain(args: Endofunction[com.pulumi.aws.mskconnect.inputs.GetConnectorPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.mskconnect.outputs.GetConnectorResult] =
      val argsBuilder = com.pulumi.aws.mskconnect.inputs.GetConnectorPlainArgs.builder
      com.pulumi.aws.mskconnect.MskconnectFunctions.getConnectorPlain(args(argsBuilder).build)

    /** Get information on an Amazon MSK Connect custom plugin. */
    def getCustomPlugin(args: Endofunction[com.pulumi.aws.mskconnect.inputs.GetCustomPluginArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.mskconnect.outputs.GetCustomPluginResult] =
      val argsBuilder = com.pulumi.aws.mskconnect.inputs.GetCustomPluginArgs.builder
      com.pulumi.aws.mskconnect.MskconnectFunctions.getCustomPlugin(args(argsBuilder).build)

    /** Get information on an Amazon MSK Connect custom plugin. */
    def getCustomPluginPlain(args: Endofunction[com.pulumi.aws.mskconnect.inputs.GetCustomPluginPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.mskconnect.outputs.GetCustomPluginResult] =
      val argsBuilder = com.pulumi.aws.mskconnect.inputs.GetCustomPluginPlainArgs.builder
      com.pulumi.aws.mskconnect.MskconnectFunctions.getCustomPluginPlain(args(argsBuilder).build)

    /** Get information on an Amazon MSK Connect Worker Configuration. */
    def getWorkerConfiguration(args: Endofunction[com.pulumi.aws.mskconnect.inputs.GetWorkerConfigurationArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.mskconnect.outputs.GetWorkerConfigurationResult] =
      val argsBuilder = com.pulumi.aws.mskconnect.inputs.GetWorkerConfigurationArgs.builder
      com.pulumi.aws.mskconnect.MskconnectFunctions.getWorkerConfiguration(args(argsBuilder).build)

    /** Get information on an Amazon MSK Connect Worker Configuration. */
    def getWorkerConfigurationPlain(args: Endofunction[com.pulumi.aws.mskconnect.inputs.GetWorkerConfigurationPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.mskconnect.outputs.GetWorkerConfigurationResult] =
      val argsBuilder = com.pulumi.aws.mskconnect.inputs.GetWorkerConfigurationPlainArgs.builder
      com.pulumi.aws.mskconnect.MskconnectFunctions.getWorkerConfigurationPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mskconnect.CustomPluginArgs.Builder)
    /**
     * @param location Information about the location of a custom plugin. See `location` Block for details.
     * @return builder
     */
    def location(args: Endofunction[com.pulumi.aws.mskconnect.inputs.CustomPluginLocationArgs.Builder]):
        com.pulumi.aws.mskconnect.CustomPluginArgs.Builder =
      val argsBuilder = com.pulumi.aws.mskconnect.inputs.CustomPluginLocationArgs.builder
      builder.location(args(argsBuilder).build)

  /** Provides an Amazon MSK Connect Custom Plugin Resource. */
  def CustomPlugin(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.mskconnect.CustomPluginArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.mskconnect.CustomPluginArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.mskconnect.CustomPlugin(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an Amazon MSK Connect Connector resource. */
  def Connector(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.mskconnect.ConnectorArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.mskconnect.ConnectorArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.mskconnect.Connector(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.mskconnect.ConnectorArgs.Builder)
    /**
     * @param capacity Information about the capacity allocated to the connector. See `capacity` Block for details.
     * @return builder
     */
    def capacity(args: Endofunction[com.pulumi.aws.mskconnect.inputs.ConnectorCapacityArgs.Builder]):
        com.pulumi.aws.mskconnect.ConnectorArgs.Builder =
      val argsBuilder = com.pulumi.aws.mskconnect.inputs.ConnectorCapacityArgs.builder
      builder.capacity(args(argsBuilder).build)

    /**
     * @param kafkaCluster Specifies which Apache Kafka cluster to connect to. See `kafkaCluster` Block for details.
     * @return builder
     */
    def kafkaCluster(args: Endofunction[com.pulumi.aws.mskconnect.inputs.ConnectorKafkaClusterArgs.Builder]):
        com.pulumi.aws.mskconnect.ConnectorArgs.Builder =
      val argsBuilder = com.pulumi.aws.mskconnect.inputs.ConnectorKafkaClusterArgs.builder
      builder.kafkaCluster(args(argsBuilder).build)

    /**
     * @param kafkaClusterClientAuthentication Details of the client authentication used by the Apache Kafka cluster. See `kafkaClusterClientAuthentication` Block for details.
     * @return builder
     */
    def kafkaClusterClientAuthentication(args: Endofunction[com.pulumi.aws.mskconnect.inputs.ConnectorKafkaClusterClientAuthenticationArgs.Builder]):
        com.pulumi.aws.mskconnect.ConnectorArgs.Builder =
      val argsBuilder = com.pulumi.aws.mskconnect.inputs.ConnectorKafkaClusterClientAuthenticationArgs.builder
      builder.kafkaClusterClientAuthentication(args(argsBuilder).build)

    /**
     * @param kafkaClusterEncryptionInTransit Details of encryption in transit to the Apache Kafka cluster. See `kafkaClusterEncryptionInTransit` Block for details.
     * @return builder
     */
    def kafkaClusterEncryptionInTransit(args: Endofunction[com.pulumi.aws.mskconnect.inputs.ConnectorKafkaClusterEncryptionInTransitArgs.Builder]):
        com.pulumi.aws.mskconnect.ConnectorArgs.Builder =
      val argsBuilder = com.pulumi.aws.mskconnect.inputs.ConnectorKafkaClusterEncryptionInTransitArgs.builder
      builder.kafkaClusterEncryptionInTransit(args(argsBuilder).build)

    /**
     * @param logDelivery Details about log delivery. See `logDelivery` Block for details.
     * @return builder
     */
    def logDelivery(args: Endofunction[com.pulumi.aws.mskconnect.inputs.ConnectorLogDeliveryArgs.Builder]):
        com.pulumi.aws.mskconnect.ConnectorArgs.Builder =
      val argsBuilder = com.pulumi.aws.mskconnect.inputs.ConnectorLogDeliveryArgs.builder
      builder.logDelivery(args(argsBuilder).build)

    /**
     * @param plugins Specifies which plugins to use for the connector. See `plugin` Block for details.
     * @return builder
     */
    def plugins(args: Endofunction[com.pulumi.aws.mskconnect.inputs.ConnectorPluginArgs.Builder]*):
        com.pulumi.aws.mskconnect.ConnectorArgs.Builder =
      def argsBuilder = com.pulumi.aws.mskconnect.inputs.ConnectorPluginArgs.builder
      builder.plugins(args.map(_(argsBuilder).build)*)

    /**
     * @param workerConfiguration Specifies which worker configuration to use with the connector. See `workerConfiguration` Block for details.
     * @return builder
     */
    def workerConfiguration(args: Endofunction[com.pulumi.aws.mskconnect.inputs.ConnectorWorkerConfigurationArgs.Builder]):
        com.pulumi.aws.mskconnect.ConnectorArgs.Builder =
      val argsBuilder = com.pulumi.aws.mskconnect.inputs.ConnectorWorkerConfigurationArgs.builder
      builder.workerConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mskconnect.inputs.ConnectorCapacityArgs.Builder)
    /**
     * @param autoscaling Information about the auto scaling parameters for the connector. See `autoscaling` Block for details.
     * @return builder
     */
    def autoscaling(args: Endofunction[com.pulumi.aws.mskconnect.inputs.ConnectorCapacityAutoscalingArgs.Builder]):
        com.pulumi.aws.mskconnect.inputs.ConnectorCapacityArgs.Builder =
      val argsBuilder = com.pulumi.aws.mskconnect.inputs.ConnectorCapacityAutoscalingArgs.builder
      builder.autoscaling(args(argsBuilder).build)

    /**
     * @param provisionedCapacity Details about a fixed capacity allocated to a connector. See `provisionedCapacity` Block for details.
     * @return builder
     */
    def provisionedCapacity(args: Endofunction[com.pulumi.aws.mskconnect.inputs.ConnectorCapacityProvisionedCapacityArgs.Builder]):
        com.pulumi.aws.mskconnect.inputs.ConnectorCapacityArgs.Builder =
      val argsBuilder = com.pulumi.aws.mskconnect.inputs.ConnectorCapacityProvisionedCapacityArgs.builder
      builder.provisionedCapacity(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mskconnect.inputs.CustomPluginLocationArgs.Builder)
    /**
     * @param s3 Information of the plugin file stored in Amazon S3. See `s3` Block for details..
     * @return builder
     */
    def s3(args: Endofunction[com.pulumi.aws.mskconnect.inputs.CustomPluginLocationS3Args.Builder]):
        com.pulumi.aws.mskconnect.inputs.CustomPluginLocationArgs.Builder =
      val argsBuilder = com.pulumi.aws.mskconnect.inputs.CustomPluginLocationS3Args.builder
      builder.s3(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mskconnect.inputs.ConnectorKafkaClusterArgs.Builder)
    /**
     * @param apacheKafkaCluster The Apache Kafka cluster to which the connector is connected. See `apacheKafkaCluster` Block for details.
     * @return builder
     */
    def apacheKafkaCluster(args: Endofunction[com.pulumi.aws.mskconnect.inputs.ConnectorKafkaClusterApacheKafkaClusterArgs.Builder]):
        com.pulumi.aws.mskconnect.inputs.ConnectorKafkaClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.mskconnect.inputs.ConnectorKafkaClusterApacheKafkaClusterArgs.builder
      builder.apacheKafkaCluster(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mskconnect.inputs.ConnectorKafkaClusterApacheKafkaClusterArgs.Builder)
    /**
     * @param vpc Details of an Amazon VPC which has network connectivity to the Apache Kafka cluster. See `vpc` Block for details.
     * @return builder
     */
    def vpc(args: Endofunction[com.pulumi.aws.mskconnect.inputs.ConnectorKafkaClusterApacheKafkaClusterVpcArgs.Builder]):
        com.pulumi.aws.mskconnect.inputs.ConnectorKafkaClusterApacheKafkaClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.mskconnect.inputs.ConnectorKafkaClusterApacheKafkaClusterVpcArgs.builder
      builder.vpc(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mskconnect.inputs.ConnectorLogDeliveryArgs.Builder)
    /**
     * @param workerLogDelivery The workers can send worker logs to different destination types. This configuration specifies the details of these destinations. See `workerLogDelivery` Block for details.
     * @return builder
     */
    def workerLogDelivery(args: Endofunction[com.pulumi.aws.mskconnect.inputs.ConnectorLogDeliveryWorkerLogDeliveryArgs.Builder]):
        com.pulumi.aws.mskconnect.inputs.ConnectorLogDeliveryArgs.Builder =
      val argsBuilder = com.pulumi.aws.mskconnect.inputs.ConnectorLogDeliveryWorkerLogDeliveryArgs.builder
      builder.workerLogDelivery(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mskconnect.inputs.ConnectorPluginArgs.Builder)
    /**
     * @param customPlugin Details about a custom plugin. See `customPlugin` Block for details.
     * @return builder
     */
    def customPlugin(args: Endofunction[com.pulumi.aws.mskconnect.inputs.ConnectorPluginCustomPluginArgs.Builder]):
        com.pulumi.aws.mskconnect.inputs.ConnectorPluginArgs.Builder =
      val argsBuilder = com.pulumi.aws.mskconnect.inputs.ConnectorPluginCustomPluginArgs.builder
      builder.customPlugin(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mskconnect.inputs.ConnectorCapacityAutoscalingArgs.Builder)
    /**
     * @param scaleInPolicy The scale-in policy for the connector. See `scaleInPolicy` Block for details.
     * @return builder
     */
    def scaleInPolicy(args: Endofunction[com.pulumi.aws.mskconnect.inputs.ConnectorCapacityAutoscalingScaleInPolicyArgs.Builder]):
        com.pulumi.aws.mskconnect.inputs.ConnectorCapacityAutoscalingArgs.Builder =
      val argsBuilder = com.pulumi.aws.mskconnect.inputs.ConnectorCapacityAutoscalingScaleInPolicyArgs.builder
      builder.scaleInPolicy(args(argsBuilder).build)

    /**
     * @param scaleOutPolicy The scale-out policy for the connector. See `scaleOutPolicy` Block for details.
     * @return builder
     */
    def scaleOutPolicy(args: Endofunction[com.pulumi.aws.mskconnect.inputs.ConnectorCapacityAutoscalingScaleOutPolicyArgs.Builder]):
        com.pulumi.aws.mskconnect.inputs.ConnectorCapacityAutoscalingArgs.Builder =
      val argsBuilder = com.pulumi.aws.mskconnect.inputs.ConnectorCapacityAutoscalingScaleOutPolicyArgs.builder
      builder.scaleOutPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mskconnect.inputs.ConnectorState.Builder)
    /**
     * @param capacity Information about the capacity allocated to the connector. See `capacity` Block for details.
     * @return builder
     */
    def capacity(args: Endofunction[com.pulumi.aws.mskconnect.inputs.ConnectorCapacityArgs.Builder]):
        com.pulumi.aws.mskconnect.inputs.ConnectorState.Builder =
      val argsBuilder = com.pulumi.aws.mskconnect.inputs.ConnectorCapacityArgs.builder
      builder.capacity(args(argsBuilder).build)

    /**
     * @param kafkaCluster Specifies which Apache Kafka cluster to connect to. See `kafkaCluster` Block for details.
     * @return builder
     */
    def kafkaCluster(args: Endofunction[com.pulumi.aws.mskconnect.inputs.ConnectorKafkaClusterArgs.Builder]):
        com.pulumi.aws.mskconnect.inputs.ConnectorState.Builder =
      val argsBuilder = com.pulumi.aws.mskconnect.inputs.ConnectorKafkaClusterArgs.builder
      builder.kafkaCluster(args(argsBuilder).build)

    /**
     * @param kafkaClusterClientAuthentication Details of the client authentication used by the Apache Kafka cluster. See `kafkaClusterClientAuthentication` Block for details.
     * @return builder
     */
    def kafkaClusterClientAuthentication(args: Endofunction[com.pulumi.aws.mskconnect.inputs.ConnectorKafkaClusterClientAuthenticationArgs.Builder]):
        com.pulumi.aws.mskconnect.inputs.ConnectorState.Builder =
      val argsBuilder = com.pulumi.aws.mskconnect.inputs.ConnectorKafkaClusterClientAuthenticationArgs.builder
      builder.kafkaClusterClientAuthentication(args(argsBuilder).build)

    /**
     * @param kafkaClusterEncryptionInTransit Details of encryption in transit to the Apache Kafka cluster. See `kafkaClusterEncryptionInTransit` Block for details.
     * @return builder
     */
    def kafkaClusterEncryptionInTransit(args: Endofunction[com.pulumi.aws.mskconnect.inputs.ConnectorKafkaClusterEncryptionInTransitArgs.Builder]):
        com.pulumi.aws.mskconnect.inputs.ConnectorState.Builder =
      val argsBuilder = com.pulumi.aws.mskconnect.inputs.ConnectorKafkaClusterEncryptionInTransitArgs.builder
      builder.kafkaClusterEncryptionInTransit(args(argsBuilder).build)

    /**
     * @param logDelivery Details about log delivery. See `logDelivery` Block for details.
     * @return builder
     */
    def logDelivery(args: Endofunction[com.pulumi.aws.mskconnect.inputs.ConnectorLogDeliveryArgs.Builder]):
        com.pulumi.aws.mskconnect.inputs.ConnectorState.Builder =
      val argsBuilder = com.pulumi.aws.mskconnect.inputs.ConnectorLogDeliveryArgs.builder
      builder.logDelivery(args(argsBuilder).build)

    /**
     * @param plugins Specifies which plugins to use for the connector. See `plugin` Block for details.
     * @return builder
     */
    def plugins(args: Endofunction[com.pulumi.aws.mskconnect.inputs.ConnectorPluginArgs.Builder]*):
        com.pulumi.aws.mskconnect.inputs.ConnectorState.Builder =
      def argsBuilder = com.pulumi.aws.mskconnect.inputs.ConnectorPluginArgs.builder
      builder.plugins(args.map(_(argsBuilder).build)*)

    /**
     * @param workerConfiguration Specifies which worker configuration to use with the connector. See `workerConfiguration` Block for details.
     * @return builder
     */
    def workerConfiguration(args: Endofunction[com.pulumi.aws.mskconnect.inputs.ConnectorWorkerConfigurationArgs.Builder]):
        com.pulumi.aws.mskconnect.inputs.ConnectorState.Builder =
      val argsBuilder = com.pulumi.aws.mskconnect.inputs.ConnectorWorkerConfigurationArgs.builder
      builder.workerConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mskconnect.inputs.ConnectorLogDeliveryWorkerLogDeliveryArgs.Builder)
    /**
     * @param cloudwatchLogs Details about delivering logs to Amazon CloudWatch Logs. See `cloudwatchLogs` Block for details.
     * @return builder
     */
    def cloudwatchLogs(args: Endofunction[com.pulumi.aws.mskconnect.inputs.ConnectorLogDeliveryWorkerLogDeliveryCloudwatchLogsArgs.Builder]):
        com.pulumi.aws.mskconnect.inputs.ConnectorLogDeliveryWorkerLogDeliveryArgs.Builder =
      val argsBuilder = com.pulumi.aws.mskconnect.inputs.ConnectorLogDeliveryWorkerLogDeliveryCloudwatchLogsArgs.builder
      builder.cloudwatchLogs(args(argsBuilder).build)

    /**
     * @param firehose Details about delivering logs to Amazon Kinesis Data Firehose. See `firehose` Block for details.
     * @return builder
     */
    def firehose(args: Endofunction[com.pulumi.aws.mskconnect.inputs.ConnectorLogDeliveryWorkerLogDeliveryFirehoseArgs.Builder]):
        com.pulumi.aws.mskconnect.inputs.ConnectorLogDeliveryWorkerLogDeliveryArgs.Builder =
      val argsBuilder = com.pulumi.aws.mskconnect.inputs.ConnectorLogDeliveryWorkerLogDeliveryFirehoseArgs.builder
      builder.firehose(args(argsBuilder).build)

    /**
     * @param s3 Details about delivering logs to Amazon S3. See `s3` Block for deetails.
     * @return builder
     */
    def s3(args: Endofunction[com.pulumi.aws.mskconnect.inputs.ConnectorLogDeliveryWorkerLogDeliveryS3Args.Builder]):
        com.pulumi.aws.mskconnect.inputs.ConnectorLogDeliveryWorkerLogDeliveryArgs.Builder =
      val argsBuilder = com.pulumi.aws.mskconnect.inputs.ConnectorLogDeliveryWorkerLogDeliveryS3Args.builder
      builder.s3(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.mskconnect.inputs.CustomPluginState.Builder)
    /**
     * @param location Information about the location of a custom plugin. See `location` Block for details.
     * @return builder
     */
    def location(args: Endofunction[com.pulumi.aws.mskconnect.inputs.CustomPluginLocationArgs.Builder]):
        com.pulumi.aws.mskconnect.inputs.CustomPluginState.Builder =
      val argsBuilder = com.pulumi.aws.mskconnect.inputs.CustomPluginLocationArgs.builder
      builder.location(args(argsBuilder).build)
