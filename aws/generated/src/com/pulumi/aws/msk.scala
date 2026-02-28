package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object msk:
  extension (builder: com.pulumi.aws.msk.ReplicatorArgs.Builder)
    /**
     * @param kafkaClusters A list of Kafka clusters which are targets of the replicator.
     * @return builder
     */
    def kafkaClusters(args: Endofunction[com.pulumi.aws.msk.inputs.ReplicatorKafkaClusterArgs.Builder]*):
        com.pulumi.aws.msk.ReplicatorArgs.Builder =
      def argsBuilder = com.pulumi.aws.msk.inputs.ReplicatorKafkaClusterArgs.builder
      builder.kafkaClusters(args.map(_(argsBuilder).build)*)

    /**
     * @param replicationInfoList A list of replication configurations, where each configuration targets a given source cluster to target cluster replication flow.
     * @return builder
     */
    def replicationInfoList(args: Endofunction[com.pulumi.aws.msk.inputs.ReplicatorReplicationInfoListArgs.Builder]):
        com.pulumi.aws.msk.ReplicatorArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ReplicatorReplicationInfoListArgs.builder
      builder.replicationInfoList(args(argsBuilder).build)

  type MskFunctions = com.pulumi.aws.msk.MskFunctions
  object MskFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.msk.MskFunctions.*
  extension (self: MskFunctions.type)
    /** Get a list of brokers that a client application can use to bootstrap. */
    def getBootstrapBrokers(args: Endofunction[com.pulumi.aws.msk.inputs.GetBootstrapBrokersArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.msk.outputs.GetBootstrapBrokersResult] =
      val argsBuilder = com.pulumi.aws.msk.inputs.GetBootstrapBrokersArgs.builder
      com.pulumi.aws.msk.MskFunctions.getBootstrapBrokers(args(argsBuilder).build)

    /** Get a list of brokers that a client application can use to bootstrap. */
    def getBootstrapBrokersPlain(args: Endofunction[com.pulumi.aws.msk.inputs.GetBootstrapBrokersPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.msk.outputs.GetBootstrapBrokersResult] =
      val argsBuilder = com.pulumi.aws.msk.inputs.GetBootstrapBrokersPlainArgs.builder
      com.pulumi.aws.msk.MskFunctions.getBootstrapBrokersPlain(args(argsBuilder).build)

    /** Get information on an Amazon MSK Broker Nodes. */
    def getBrokerNodes(args: Endofunction[com.pulumi.aws.msk.inputs.GetBrokerNodesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.msk.outputs.GetBrokerNodesResult] =
      val argsBuilder = com.pulumi.aws.msk.inputs.GetBrokerNodesArgs.builder
      com.pulumi.aws.msk.MskFunctions.getBrokerNodes(args(argsBuilder).build)

    /** Get information on an Amazon MSK Broker Nodes. */
    def getBrokerNodesPlain(args: Endofunction[com.pulumi.aws.msk.inputs.GetBrokerNodesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.msk.outputs.GetBrokerNodesResult] =
      val argsBuilder = com.pulumi.aws.msk.inputs.GetBrokerNodesPlainArgs.builder
      com.pulumi.aws.msk.MskFunctions.getBrokerNodesPlain(args(argsBuilder).build)

    /**
     * Get information on an Amazon MSK Cluster.
     *  
     *  &gt; **Note:** This data sources returns information on _provisioned_ clusters.
     */
    def getCluster(args: Endofunction[com.pulumi.aws.msk.inputs.GetClusterArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.msk.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.aws.msk.inputs.GetClusterArgs.builder
      com.pulumi.aws.msk.MskFunctions.getCluster(args(argsBuilder).build)

    /**
     * Get information on an Amazon MSK Cluster.
     *  
     *  &gt; **Note:** This data sources returns information on _provisioned_ clusters.
     */
    def getClusterPlain(args: Endofunction[com.pulumi.aws.msk.inputs.GetClusterPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.msk.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.aws.msk.inputs.GetClusterPlainArgs.builder
      com.pulumi.aws.msk.MskFunctions.getClusterPlain(args(argsBuilder).build)

    /** Get information on an Amazon MSK Configuration. */
    def getConfiguration(args: Endofunction[com.pulumi.aws.msk.inputs.GetConfigurationArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.msk.outputs.GetConfigurationResult] =
      val argsBuilder = com.pulumi.aws.msk.inputs.GetConfigurationArgs.builder
      com.pulumi.aws.msk.MskFunctions.getConfiguration(args(argsBuilder).build)

    /** Get information on an Amazon MSK Configuration. */
    def getConfigurationPlain(args: Endofunction[com.pulumi.aws.msk.inputs.GetConfigurationPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.msk.outputs.GetConfigurationResult] =
      val argsBuilder = com.pulumi.aws.msk.inputs.GetConfigurationPlainArgs.builder
      com.pulumi.aws.msk.MskFunctions.getConfigurationPlain(args(argsBuilder).build)

    /** Get information on a Amazon MSK Kafka Version */
    def getKafkaVersion(args: Endofunction[com.pulumi.aws.msk.inputs.GetKafkaVersionArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.msk.outputs.GetKafkaVersionResult] =
      val argsBuilder = com.pulumi.aws.msk.inputs.GetKafkaVersionArgs.builder
      com.pulumi.aws.msk.MskFunctions.getKafkaVersion(args(argsBuilder).build)

    /** Get information on a Amazon MSK Kafka Version */
    def getKafkaVersionPlain(args: Endofunction[com.pulumi.aws.msk.inputs.GetKafkaVersionPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.msk.outputs.GetKafkaVersionResult] =
      val argsBuilder = com.pulumi.aws.msk.inputs.GetKafkaVersionPlainArgs.builder
      com.pulumi.aws.msk.MskFunctions.getKafkaVersionPlain(args(argsBuilder).build)

    /** Get information on an Amazon MSK VPC Connection. */
    def getVpcConnection(args: Endofunction[com.pulumi.aws.msk.inputs.GetVpcConnectionArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.msk.outputs.GetVpcConnectionResult] =
      val argsBuilder = com.pulumi.aws.msk.inputs.GetVpcConnectionArgs.builder
      com.pulumi.aws.msk.MskFunctions.getVpcConnection(args(argsBuilder).build)

    /** Get information on an Amazon MSK VPC Connection. */
    def getVpcConnectionPlain(args: Endofunction[com.pulumi.aws.msk.inputs.GetVpcConnectionPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.msk.outputs.GetVpcConnectionResult] =
      val argsBuilder = com.pulumi.aws.msk.inputs.GetVpcConnectionPlainArgs.builder
      com.pulumi.aws.msk.MskFunctions.getVpcConnectionPlain(args(argsBuilder).build)

  /** Resource for managing an AWS Managed Streaming for Kafka Replicator. */
  def Replicator(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.msk.ReplicatorArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.msk.ReplicatorArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.msk.Replicator(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS Managed Streaming for Kafka VPC Connection. */
  def VpcConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.msk.VpcConnectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.msk.VpcConnectionArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.msk.VpcConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.msk.ServerlessClusterArgs.Builder)
    /**
     * @param clientAuthentication Specifies client authentication information for the serverless cluster. See below.
     * @return builder
     */
    def clientAuthentication(args: Endofunction[com.pulumi.aws.msk.inputs.ServerlessClusterClientAuthenticationArgs.Builder]):
        com.pulumi.aws.msk.ServerlessClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ServerlessClusterClientAuthenticationArgs.builder
      builder.clientAuthentication(args(argsBuilder).build)

    /**
     * @param vpcConfigs VPC configuration information. See below.
     * @return builder
     */
    def vpcConfigs(args: Endofunction[com.pulumi.aws.msk.inputs.ServerlessClusterVpcConfigArgs.Builder]*):
        com.pulumi.aws.msk.ServerlessClusterArgs.Builder =
      def argsBuilder = com.pulumi.aws.msk.inputs.ServerlessClusterVpcConfigArgs.builder
      builder.vpcConfigs(args.map(_(argsBuilder).build)*)

  /** Associates a single SCRAM secret with a Managed Streaming for Kafka (MSK) cluster. */
  def SingleScramSecretAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.msk.SingleScramSecretAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.msk.SingleScramSecretAssociationArgs.builder
    
    com.pulumi.aws.msk.SingleScramSecretAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Amazon Managed Streaming for Kafka configuration. More information can be found on the [MSK Developer Guide](https://docs.aws.amazon.com/msk/latest/developerguide/msk-configuration.html). */
  def Configuration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.msk.ConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.msk.ConfigurationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.msk.Configuration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an Amazon MSK Serverless cluster.
   *  
   *  &gt; **Note:** To manage a _provisioned_ Amazon MSK cluster, use the `aws.msk.Cluster` resource.
   */
  def ServerlessCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.msk.ServerlessClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.msk.ServerlessClusterArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.msk.ServerlessCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an Amazon MSK cluster.
   *  
   *  &gt; **Note:** This resource manages _provisioned_ clusters. To manage a _serverless_ Amazon MSK cluster, use the `aws.msk.ServerlessCluster` resource.
   */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.msk.ClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.msk.ClusterArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.msk.Cluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.msk.ClusterArgs.Builder)
    /**
     * @param brokerNodeGroupInfo Configuration block for the broker nodes of the Kafka cluster. See brokerNodeGroupInfo Argument Reference below.
     * @return builder
     */
    def brokerNodeGroupInfo(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoArgs.Builder]):
        com.pulumi.aws.msk.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoArgs.builder
      builder.brokerNodeGroupInfo(args(argsBuilder).build)

    /**
     * @param clientAuthentication Configuration block for specifying a client authentication. See clientAuthentication Argument Reference below.
     * @return builder
     */
    def clientAuthentication(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterClientAuthenticationArgs.Builder]):
        com.pulumi.aws.msk.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterClientAuthenticationArgs.builder
      builder.clientAuthentication(args(argsBuilder).build)

    /**
     * @param configurationInfo Configuration block for specifying an MSK Configuration to attach to Kafka brokers. See configurationInfo Argument Reference below.
     * @return builder
     */
    def configurationInfo(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterConfigurationInfoArgs.Builder]):
        com.pulumi.aws.msk.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterConfigurationInfoArgs.builder
      builder.configurationInfo(args(argsBuilder).build)

    /**
     * @param encryptionInfo Configuration block for specifying encryption. See encryptionInfo Argument Reference below.
     * @return builder
     */
    def encryptionInfo(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterEncryptionInfoArgs.Builder]):
        com.pulumi.aws.msk.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterEncryptionInfoArgs.builder
      builder.encryptionInfo(args(argsBuilder).build)

    /**
     * @param loggingInfo Configuration block for streaming broker logs to Cloudwatch/S3/Kinesis Firehose. See loggingInfo Argument Reference below.
     * @return builder
     */
    def loggingInfo(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterLoggingInfoArgs.Builder]):
        com.pulumi.aws.msk.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterLoggingInfoArgs.builder
      builder.loggingInfo(args(argsBuilder).build)

    /**
     * @param openMonitoring Configuration block for JMX and Node monitoring for the MSK cluster. See openMonitoring Argument Reference below.
     * @return builder
     */
    def openMonitoring(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterOpenMonitoringArgs.Builder]):
        com.pulumi.aws.msk.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterOpenMonitoringArgs.builder
      builder.openMonitoring(args(argsBuilder).build)

    /**
     * @param rebalancing Configuration block for intelligent rebalancing. See rebalancing Argument Reference below. Only applicable to MSK Provisioned clusters with Express brokers.
     * @return builder
     */
    def rebalancing(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterRebalancingArgs.Builder]):
        com.pulumi.aws.msk.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterRebalancingArgs.builder
      builder.rebalancing(args(argsBuilder).build)

  /**
   * Associates SCRAM secrets stored in the Secrets Manager service with a Managed Streaming for Kafka (MSK) cluster.
   *  
   *  !&gt; This resource takes exclusive ownership over SCRAM secrets associated with a cluster. This includes removal of SCRAM secrets which are not explicitly configured. To prevent persistent drift, ensure any `aws.msk.SingleScramSecretAssociation` resources managed alongside this resource are included in the `secretArnList` argument.
   *  
   *  &gt; **Note:** The following assumes the MSK cluster has SASL/SCRAM authentication enabled. See below for example usage or refer to the [Username/Password Authentication](https://docs.aws.amazon.com/msk/latest/developerguide/msk-password.html) section of the MSK Developer Guide for more details.
   *  
   *  To set up username and password authentication for a cluster, create an `aws.secretsmanager.Secret` resource and associate
   *  a username and password with the secret with an `aws.secretsmanager.SecretVersion` resource. When creating a secret for the cluster,
   *  the `name` must have the prefix `AmazonMSK_` and you must either use an existing custom AWS KMS key or create a new
   *  custom AWS KMS key for your secret with the `aws.kms.Key` resource. It is important to note that a policy is required for the `aws.secretsmanager.Secret`
   *  resource in order for Kafka to be able to read it. This policy is attached automatically when the `aws.msk.ScramSecretAssociation` is used,
   *  however, this policy will not be in the state and as such, will present a diff on plan/apply. For that reason, you must use the `aws.secretsmanager.SecretPolicy`
   *  resource](/docs/providers/aws/r/secretsmanager_secret_policy.html) as shown below in order to ensure that the state is in a clean state after the creation of secret and the association to the cluster.
   */
  def ScramSecretAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.msk.ScramSecretAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.msk.ScramSecretAssociationArgs.builder
    
    com.pulumi.aws.msk.ScramSecretAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS Managed Streaming for Kafka Cluster Policy. */
  def ClusterPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.msk.ClusterPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.msk.ClusterPolicyArgs.builder
    
    com.pulumi.aws.msk.ClusterPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ReplicatorReplicationInfoListTopicReplicationArgs.Builder)
    /**
     * @param startingPosition Configuration for specifying the position in the topics to start replicating from.
     * @return builder
     */
    def startingPosition(args: Endofunction[com.pulumi.aws.msk.inputs.ReplicatorReplicationInfoListTopicReplicationStartingPositionArgs.Builder]):
        com.pulumi.aws.msk.inputs.ReplicatorReplicationInfoListTopicReplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ReplicatorReplicationInfoListTopicReplicationStartingPositionArgs.builder
      builder.startingPosition(args(argsBuilder).build)

    /**
     * @param topicNameConfiguration Configuration for specifying replicated topic names should be the same as their corresponding upstream topics or prefixed with source cluster alias.
     * @return builder
     */
    def topicNameConfiguration(args: Endofunction[com.pulumi.aws.msk.inputs.ReplicatorReplicationInfoListTopicReplicationTopicNameConfigurationArgs.Builder]):
        com.pulumi.aws.msk.inputs.ReplicatorReplicationInfoListTopicReplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ReplicatorReplicationInfoListTopicReplicationTopicNameConfigurationArgs.builder
      builder.topicNameConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ClusterState.Builder)
    /**
     * @param brokerNodeGroupInfo Configuration block for the broker nodes of the Kafka cluster. See brokerNodeGroupInfo Argument Reference below.
     * @return builder
     */
    def brokerNodeGroupInfo(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoArgs.builder
      builder.brokerNodeGroupInfo(args(argsBuilder).build)

    /**
     * @param clientAuthentication Configuration block for specifying a client authentication. See clientAuthentication Argument Reference below.
     * @return builder
     */
    def clientAuthentication(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterClientAuthenticationArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterClientAuthenticationArgs.builder
      builder.clientAuthentication(args(argsBuilder).build)

    /**
     * @param configurationInfo Configuration block for specifying an MSK Configuration to attach to Kafka brokers. See configurationInfo Argument Reference below.
     * @return builder
     */
    def configurationInfo(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterConfigurationInfoArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterConfigurationInfoArgs.builder
      builder.configurationInfo(args(argsBuilder).build)

    /**
     * @param encryptionInfo Configuration block for specifying encryption. See encryptionInfo Argument Reference below.
     * @return builder
     */
    def encryptionInfo(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterEncryptionInfoArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterEncryptionInfoArgs.builder
      builder.encryptionInfo(args(argsBuilder).build)

    /**
     * @param loggingInfo Configuration block for streaming broker logs to Cloudwatch/S3/Kinesis Firehose. See loggingInfo Argument Reference below.
     * @return builder
     */
    def loggingInfo(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterLoggingInfoArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterLoggingInfoArgs.builder
      builder.loggingInfo(args(argsBuilder).build)

    /**
     * @param openMonitoring Configuration block for JMX and Node monitoring for the MSK cluster. See openMonitoring Argument Reference below.
     * @return builder
     */
    def openMonitoring(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterOpenMonitoringArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterOpenMonitoringArgs.builder
      builder.openMonitoring(args(argsBuilder).build)

    /**
     * @param rebalancing Configuration block for intelligent rebalancing. See rebalancing Argument Reference below. Only applicable to MSK Provisioned clusters with Express brokers.
     * @return builder
     */
    def rebalancing(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterRebalancingArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterRebalancingArgs.builder
      builder.rebalancing(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ReplicatorReplicationInfoListArgs.Builder)
    /**
     * @param consumerGroupReplications Configuration relating to consumer group replication.
     * @return builder
     */
    def consumerGroupReplications(args: Endofunction[com.pulumi.aws.msk.inputs.ReplicatorReplicationInfoListConsumerGroupReplicationArgs.Builder]*):
        com.pulumi.aws.msk.inputs.ReplicatorReplicationInfoListArgs.Builder =
      def argsBuilder = com.pulumi.aws.msk.inputs.ReplicatorReplicationInfoListConsumerGroupReplicationArgs.builder
      builder.consumerGroupReplications(args.map(_(argsBuilder).build)*)

    /**
     * @param topicReplications Configuration relating to topic replication.
     * @return builder
     */
    def topicReplications(args: Endofunction[com.pulumi.aws.msk.inputs.ReplicatorReplicationInfoListTopicReplicationArgs.Builder]*):
        com.pulumi.aws.msk.inputs.ReplicatorReplicationInfoListArgs.Builder =
      def argsBuilder = com.pulumi.aws.msk.inputs.ReplicatorReplicationInfoListTopicReplicationArgs.builder
      builder.topicReplications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.msk.inputs.ServerlessClusterClientAuthenticationArgs.Builder)
    /**
     * @param sasl Details for client authentication using SASL. See below.
     * @return builder
     */
    def sasl(args: Endofunction[com.pulumi.aws.msk.inputs.ServerlessClusterClientAuthenticationSaslArgs.Builder]):
        com.pulumi.aws.msk.inputs.ServerlessClusterClientAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ServerlessClusterClientAuthenticationSaslArgs.builder
      builder.sasl(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ReplicatorKafkaClusterArgs.Builder)
    /**
     * @param amazonMskCluster Details of an Amazon MSK cluster.
     * @return builder
     */
    def amazonMskCluster(args: Endofunction[com.pulumi.aws.msk.inputs.ReplicatorKafkaClusterAmazonMskClusterArgs.Builder]):
        com.pulumi.aws.msk.inputs.ReplicatorKafkaClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ReplicatorKafkaClusterAmazonMskClusterArgs.builder
      builder.amazonMskCluster(args(argsBuilder).build)

    /**
     * @param vpcConfig Details of an Amazon VPC which has network connectivity to the Apache Kafka cluster.
     * @return builder
     */
    def vpcConfig(args: Endofunction[com.pulumi.aws.msk.inputs.ReplicatorKafkaClusterVpcConfigArgs.Builder]):
        com.pulumi.aws.msk.inputs.ReplicatorKafkaClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ReplicatorKafkaClusterVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoConnectivityInfoVpcConnectivityClientAuthenticationArgs.Builder)
    /**
     * @param sasl Configuration block for specifying SASL client authentication. See clientAuthentication sasl Argument Reference below.
     * @return builder
     */
    def sasl(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoConnectivityInfoVpcConnectivityClientAuthenticationSaslArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoConnectivityInfoVpcConnectivityClientAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoConnectivityInfoVpcConnectivityClientAuthenticationSaslArgs.builder
      builder.sasl(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoStorageInfoArgs.Builder)
    /**
     * @param ebsStorageInfo A block that contains EBS volume information. See storageInfo ebs_storage_info Argument Reference below.
     * @return builder
     */
    def ebsStorageInfo(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoStorageInfoArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoArgs.builder
      builder.ebsStorageInfo(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ReplicatorState.Builder)
    /**
     * @param kafkaClusters A list of Kafka clusters which are targets of the replicator.
     * @return builder
     */
    def kafkaClusters(args: Endofunction[com.pulumi.aws.msk.inputs.ReplicatorKafkaClusterArgs.Builder]*):
        com.pulumi.aws.msk.inputs.ReplicatorState.Builder =
      def argsBuilder = com.pulumi.aws.msk.inputs.ReplicatorKafkaClusterArgs.builder
      builder.kafkaClusters(args.map(_(argsBuilder).build)*)

    /**
     * @param replicationInfoList A list of replication configurations, where each configuration targets a given source cluster to target cluster replication flow.
     * @return builder
     */
    def replicationInfoList(args: Endofunction[com.pulumi.aws.msk.inputs.ReplicatorReplicationInfoListArgs.Builder]):
        com.pulumi.aws.msk.inputs.ReplicatorState.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ReplicatorReplicationInfoListArgs.builder
      builder.replicationInfoList(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ClusterLoggingInfoArgs.Builder)
    /**
     * @param brokerLogs Configuration block for Broker Logs settings for logging info. See loggingInfo broker_logs Argument Reference below.
     * @return builder
     */
    def brokerLogs(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterLoggingInfoBrokerLogsArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterLoggingInfoArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterLoggingInfoBrokerLogsArgs.builder
      builder.brokerLogs(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ClusterOpenMonitoringPrometheusArgs.Builder)
    /**
     * @param jmxExporter Configuration block for JMX Exporter. See openMonitoring prometheus jmxExporter Argument Reference below.
     * @return builder
     */
    def jmxExporter(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterOpenMonitoringPrometheusJmxExporterArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterOpenMonitoringPrometheusArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterOpenMonitoringPrometheusJmxExporterArgs.builder
      builder.jmxExporter(args(argsBuilder).build)

    /**
     * @param nodeExporter Configuration block for Node Exporter. See openMonitoring prometheus nodeExporter Argument Reference below.
     * @return builder
     */
    def nodeExporter(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterOpenMonitoringPrometheusNodeExporterArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterOpenMonitoringPrometheusArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterOpenMonitoringPrometheusNodeExporterArgs.builder
      builder.nodeExporter(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoConnectivityInfoArgs.Builder)
    /**
     * @param publicAccess Access control settings for brokers. See connectivityInfo public_access Argument Reference below.
     * @return builder
     */
    def publicAccess(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoConnectivityInfoPublicAccessArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoConnectivityInfoArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoConnectivityInfoPublicAccessArgs.builder
      builder.publicAccess(args(argsBuilder).build)

    /**
     * @param vpcConnectivity VPC connectivity access control for brokers. See connectivityInfo vpc_connectivity Argument Reference below.
     * @return builder
     */
    def vpcConnectivity(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoConnectivityInfoVpcConnectivityArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoConnectivityInfoArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoConnectivityInfoVpcConnectivityArgs.builder
      builder.vpcConnectivity(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ClusterEncryptionInfoArgs.Builder)
    /**
     * @param encryptionInTransit Configuration block to specify encryption in transit. See encryptionInfo encryption_in_transit Argument Reference below.
     * @return builder
     */
    def encryptionInTransit(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterEncryptionInfoEncryptionInTransitArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterEncryptionInfoArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterEncryptionInfoEncryptionInTransitArgs.builder
      builder.encryptionInTransit(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoArgs.Builder)
    /**
     * @param provisionedThroughput A block that contains EBS volume provisioned throughput information. To provision storage throughput, you must choose broker type kafka.m5.4xlarge or larger. See ebsStorageInfo provisioned_throughput Argument Reference below.
     * @return builder
     */
    def provisionedThroughput(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughputArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughputArgs.builder
      builder.provisionedThroughput(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ClusterOpenMonitoringArgs.Builder)
    /**
     * @param prometheus Configuration block for Prometheus settings for open monitoring. See openMonitoring prometheus Argument Reference below.
     * @return builder
     */
    def prometheus(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterOpenMonitoringPrometheusArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterOpenMonitoringArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterOpenMonitoringPrometheusArgs.builder
      builder.prometheus(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoConnectivityInfoVpcConnectivityArgs.Builder)
    /**
     * @param clientAuthentication Configuration block for specifying a client authentication. See clientAuthentication Argument Reference below.
     * @return builder
     */
    def clientAuthentication(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoConnectivityInfoVpcConnectivityClientAuthenticationArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoConnectivityInfoVpcConnectivityArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoConnectivityInfoVpcConnectivityClientAuthenticationArgs.builder
      builder.clientAuthentication(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ServerlessClusterClientAuthenticationSaslArgs.Builder)
    /**
     * @param iam Details for client authentication using IAM. See below.
     * @return builder
     */
    def iam(args: Endofunction[com.pulumi.aws.msk.inputs.ServerlessClusterClientAuthenticationSaslIamArgs.Builder]):
        com.pulumi.aws.msk.inputs.ServerlessClusterClientAuthenticationSaslArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ServerlessClusterClientAuthenticationSaslIamArgs.builder
      builder.iam(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoArgs.Builder)
    /**
     * @param connectivityInfo Information about the cluster access configuration. See brokerNodeGroupInfo connectivity_info Argument Reference below. For security reasons, you can&#39;t turn on public access while creating an MSK cluster. However, you can update an existing cluster to make it publicly accessible. You can also create a new cluster and then update it to make it publicly accessible ([documentation](https://docs.aws.amazon.com/msk/latest/developerguide/public-access.html)).
     * @return builder
     */
    def connectivityInfo(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoConnectivityInfoArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoConnectivityInfoArgs.builder
      builder.connectivityInfo(args(argsBuilder).build)

    /**
     * @param storageInfo A block that contains information about storage volumes attached to MSK broker nodes. See brokerNodeGroupInfo storage_info Argument Reference below.
     * @return builder
     */
    def storageInfo(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoStorageInfoArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoStorageInfoArgs.builder
      builder.storageInfo(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ServerlessClusterState.Builder)
    /**
     * @param clientAuthentication Specifies client authentication information for the serverless cluster. See below.
     * @return builder
     */
    def clientAuthentication(args: Endofunction[com.pulumi.aws.msk.inputs.ServerlessClusterClientAuthenticationArgs.Builder]):
        com.pulumi.aws.msk.inputs.ServerlessClusterState.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ServerlessClusterClientAuthenticationArgs.builder
      builder.clientAuthentication(args(argsBuilder).build)

    /**
     * @param vpcConfigs VPC configuration information. See below.
     * @return builder
     */
    def vpcConfigs(args: Endofunction[com.pulumi.aws.msk.inputs.ServerlessClusterVpcConfigArgs.Builder]*):
        com.pulumi.aws.msk.inputs.ServerlessClusterState.Builder =
      def argsBuilder = com.pulumi.aws.msk.inputs.ServerlessClusterVpcConfigArgs.builder
      builder.vpcConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.msk.inputs.ClusterClientAuthenticationArgs.Builder)
    /**
     * @param sasl Configuration block for specifying SASL client authentication. See clientAuthentication sasl Argument Reference below.
     * @return builder
     */
    def sasl(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterClientAuthenticationSaslArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterClientAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterClientAuthenticationSaslArgs.builder
      builder.sasl(args(argsBuilder).build)

    /**
     * @param tls Configuration block for specifying TLS client authentication. See clientAuthentication tls Argument Reference below.
     * @return builder
     */
    def tls(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterClientAuthenticationTlsArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterClientAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterClientAuthenticationTlsArgs.builder
      builder.tls(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.msk.inputs.ClusterLoggingInfoBrokerLogsArgs.Builder)
    /**
     * @param cloudwatchLogs Configuration block for Cloudwatch Logs settings. See loggingInfo broker_logs cloudwatchLogs Argument Reference below.
     * @return builder
     */
    def cloudwatchLogs(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterLoggingInfoBrokerLogsCloudwatchLogsArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterLoggingInfoBrokerLogsArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterLoggingInfoBrokerLogsCloudwatchLogsArgs.builder
      builder.cloudwatchLogs(args(argsBuilder).build)

    /**
     * @param firehose Configuration block for Kinesis Data Firehose settings. See loggingInfo broker_logs firehose Argument Reference below.
     * @return builder
     */
    def firehose(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterLoggingInfoBrokerLogsFirehoseArgs.Builder]):
        com.pulumi.aws.msk.inputs.ClusterLoggingInfoBrokerLogsArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterLoggingInfoBrokerLogsFirehoseArgs.builder
      builder.firehose(args(argsBuilder).build)

    /**
     * @param s3 Configuration block for S3 settings. See loggingInfo broker_logs s3 Argument Reference below.
     * @return builder
     */
    def s3(args: Endofunction[com.pulumi.aws.msk.inputs.ClusterLoggingInfoBrokerLogsS3Args.Builder]):
        com.pulumi.aws.msk.inputs.ClusterLoggingInfoBrokerLogsArgs.Builder =
      val argsBuilder = com.pulumi.aws.msk.inputs.ClusterLoggingInfoBrokerLogsS3Args.builder
      builder.s3(args(argsBuilder).build)
