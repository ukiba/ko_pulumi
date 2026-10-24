package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object msk:
  /**
   * Manages an Amazon Managed Streaming for Apache Kafka (MSK) Channel.
   * 
   * With [Amazon MSK Data Delivery](https://docs.aws.amazon.com/msk/latest/developerguide/msk-data-delivery.html), a channel delivers Apache Kafka data from an Amazon MSK Provisioned cluster that uses Express brokers directly to Amazon S3, without connectors or additional infrastructure to manage. A channel reads records from a Kafka topic and delivers them to one of two destinations:
   * 
   * * **Amazon S3 general purpose buckets** \u2014 records are written in their source format (`JSON`, `ByteArray`, or `String`) as objects, for use cases such as log archival, compliance retention, and Kafka replay.
   * * **Apache Iceberg tables on Amazon S3 Tables** \u2014 `JSON` records, validated against an AWS Glue Schema Registry schema, are materialized as Apache Iceberg tables.
   * 
   * Records that cannot be processed are routed to a required dead-letter queue (DLQ) Amazon S3 bucket. Channels are supported only on Amazon MSK Provisioned clusters that use Express brokers; Standard brokers and Amazon MSK Serverless are not supported.
   * 
   * &gt; **Note:** A channel does not backfill previously produced data; only data produced after creation is delivered. For the Iceberg destination, a channel creates a new Iceberg table for each configuration.
   */
  def Channel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.msk.ChannelArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.msk.ChannelArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.msk.Channel(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages an Amazon MSK cluster.
   * 
   * &gt; **Note:** This resource manages _provisioned_ clusters. To manage a _serverless_ Amazon MSK cluster, use the `aws.msk.ServerlessCluster` resource.
   */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.msk.ClusterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.msk.ClusterArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.msk.Cluster(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Resource for managing an AWS Managed Streaming for Kafka Cluster Policy. */
  def ClusterPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.msk.ClusterPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.msk.ClusterPolicyArgs.builder
    com.pulumi.aws.msk.ClusterPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an Amazon Managed Streaming for Kafka configuration. More information can be found on the [MSK Developer Guide](https://docs.aws.amazon.com/msk/latest/developerguide/msk-configuration.html). */
  def Configuration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.msk.ConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.msk.ConfigurationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.msk.Configuration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object MskFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Get a list of brokers that a client application can use to bootstrap. */
    inline def getBootstrapBrokers(args: Endofunction[com.pulumi.aws.msk.inputs.GetBootstrapBrokersArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.msk.outputs.GetBootstrapBrokersResult] =
      val argsBuilder = com.pulumi.aws.msk.inputs.GetBootstrapBrokersArgs.builder
      com.pulumi.aws.msk.MskFunctions.getBootstrapBrokers(args(argsBuilder).build)

    /** Get a list of brokers that a client application can use to bootstrap. */
    inline def getBootstrapBrokersPlain(args: Endofunction[com.pulumi.aws.msk.inputs.GetBootstrapBrokersPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.msk.outputs.GetBootstrapBrokersResult] =
      val argsBuilder = com.pulumi.aws.msk.inputs.GetBootstrapBrokersPlainArgs.builder
      com.pulumi.aws.msk.MskFunctions.getBootstrapBrokersPlain(args(argsBuilder).build)

    /** Get information on an Amazon MSK Broker Nodes. */
    inline def getBrokerNodes(args: Endofunction[com.pulumi.aws.msk.inputs.GetBrokerNodesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.msk.outputs.GetBrokerNodesResult] =
      val argsBuilder = com.pulumi.aws.msk.inputs.GetBrokerNodesArgs.builder
      com.pulumi.aws.msk.MskFunctions.getBrokerNodes(args(argsBuilder).build)

    /** Get information on an Amazon MSK Broker Nodes. */
    inline def getBrokerNodesPlain(args: Endofunction[com.pulumi.aws.msk.inputs.GetBrokerNodesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.msk.outputs.GetBrokerNodesResult] =
      val argsBuilder = com.pulumi.aws.msk.inputs.GetBrokerNodesPlainArgs.builder
      com.pulumi.aws.msk.MskFunctions.getBrokerNodesPlain(args(argsBuilder).build)

    /**
     * Get information on an Amazon MSK Cluster.
     * 
     * &gt; **Note:** This data sources returns information on _provisioned_ clusters.
     */
    inline def getCluster(args: Endofunction[com.pulumi.aws.msk.inputs.GetClusterArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.msk.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.aws.msk.inputs.GetClusterArgs.builder
      com.pulumi.aws.msk.MskFunctions.getCluster(args(argsBuilder).build)

    /**
     * Get information on an Amazon MSK Cluster.
     * 
     * &gt; **Note:** This data sources returns information on _provisioned_ clusters.
     */
    inline def getClusterPlain(args: Endofunction[com.pulumi.aws.msk.inputs.GetClusterPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.msk.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.aws.msk.inputs.GetClusterPlainArgs.builder
      com.pulumi.aws.msk.MskFunctions.getClusterPlain(args(argsBuilder).build)

    /** Get information on an Amazon MSK Configuration. */
    inline def getConfiguration(args: Endofunction[com.pulumi.aws.msk.inputs.GetConfigurationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.msk.outputs.GetConfigurationResult] =
      val argsBuilder = com.pulumi.aws.msk.inputs.GetConfigurationArgs.builder
      com.pulumi.aws.msk.MskFunctions.getConfiguration(args(argsBuilder).build)

    /** Get information on an Amazon MSK Configuration. */
    inline def getConfigurationPlain(args: Endofunction[com.pulumi.aws.msk.inputs.GetConfigurationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.msk.outputs.GetConfigurationResult] =
      val argsBuilder = com.pulumi.aws.msk.inputs.GetConfigurationPlainArgs.builder
      com.pulumi.aws.msk.MskFunctions.getConfigurationPlain(args(argsBuilder).build)

    /** Get information on a Amazon MSK Kafka Version */
    inline def getKafkaVersion(args: Endofunction[com.pulumi.aws.msk.inputs.GetKafkaVersionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.msk.outputs.GetKafkaVersionResult] =
      val argsBuilder = com.pulumi.aws.msk.inputs.GetKafkaVersionArgs.builder
      com.pulumi.aws.msk.MskFunctions.getKafkaVersion(args(argsBuilder).build)

    /** Get information on a Amazon MSK Kafka Version */
    inline def getKafkaVersionPlain(args: Endofunction[com.pulumi.aws.msk.inputs.GetKafkaVersionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.msk.outputs.GetKafkaVersionResult] =
      val argsBuilder = com.pulumi.aws.msk.inputs.GetKafkaVersionPlainArgs.builder
      com.pulumi.aws.msk.MskFunctions.getKafkaVersionPlain(args(argsBuilder).build)

    /** Get information on an Amazon MSK Topic. */
    inline def getTopic(args: Endofunction[com.pulumi.aws.msk.inputs.GetTopicArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.msk.outputs.GetTopicResult] =
      val argsBuilder = com.pulumi.aws.msk.inputs.GetTopicArgs.builder
      com.pulumi.aws.msk.MskFunctions.getTopic(args(argsBuilder).build)

    /** Get information on an Amazon MSK Topic. */
    inline def getTopicPlain(args: Endofunction[com.pulumi.aws.msk.inputs.GetTopicPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.msk.outputs.GetTopicResult] =
      val argsBuilder = com.pulumi.aws.msk.inputs.GetTopicPlainArgs.builder
      com.pulumi.aws.msk.MskFunctions.getTopicPlain(args(argsBuilder).build)

    /** Get information on an Amazon MSK VPC Connection. */
    inline def getVpcConnection(args: Endofunction[com.pulumi.aws.msk.inputs.GetVpcConnectionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.msk.outputs.GetVpcConnectionResult] =
      val argsBuilder = com.pulumi.aws.msk.inputs.GetVpcConnectionArgs.builder
      com.pulumi.aws.msk.MskFunctions.getVpcConnection(args(argsBuilder).build)

    /** Get information on an Amazon MSK VPC Connection. */
    inline def getVpcConnectionPlain(args: Endofunction[com.pulumi.aws.msk.inputs.GetVpcConnectionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.msk.outputs.GetVpcConnectionResult] =
      val argsBuilder = com.pulumi.aws.msk.inputs.GetVpcConnectionPlainArgs.builder
      com.pulumi.aws.msk.MskFunctions.getVpcConnectionPlain(args(argsBuilder).build)

  /** Resource for managing an AWS Managed Streaming for Kafka Replicator. */
  def Replicator(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.msk.ReplicatorArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.msk.ReplicatorArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.msk.Replicator(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Associates SCRAM secrets stored in the Secrets Manager service with a Managed Streaming for Kafka (MSK) cluster.
   * 
   * &gt; This resource takes exclusive ownership over SCRAM secrets associated with a cluster. This includes removal of SCRAM secrets which are not explicitly configured. To prevent persistent drift, ensure any `aws.msk.SingleScramSecretAssociation` resources managed alongside this resource are included in the `secretArnList` argument.
   * 
   * &gt; **Note:** The following assumes the MSK cluster has SASL/SCRAM authentication enabled. See below for example usage or refer to the [Username/Password Authentication](https://docs.aws.amazon.com/msk/latest/developerguide/msk-password.html) section of the MSK Developer Guide for more details.
   * 
   * To set up username and password authentication for a cluster, create an `aws.secretsmanager.Secret` resource and associate
   * a username and password with the secret with an `aws.secretsmanager.SecretVersion` resource. When creating a secret for the cluster,
   * the `name` must have the prefix `AmazonMSK_` and you must either use an existing custom AWS KMS key or create a new
   * custom AWS KMS key for your secret with the `aws.kms.Key` resource. It is important to note that a policy is required for the `aws.secretsmanager.Secret`
   * resource in order for Kafka to be able to read it. This policy is attached automatically when the `aws.msk.ScramSecretAssociation` is used,
   * however, this policy will not be in the state and as such, will present a diff on plan/apply. For that reason, you must use the `aws.secretsmanager.SecretPolicy`
   * resource](/docs/providers/aws/r/secretsmanager_secret_policy.html) as shown below in order to ensure that the state is in a clean state after the creation of secret and the association to the cluster.
   */
  def ScramSecretAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.msk.ScramSecretAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.msk.ScramSecretAssociationArgs.builder
    com.pulumi.aws.msk.ScramSecretAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages an Amazon MSK Serverless cluster.
   * 
   * &gt; **Note:** To manage a _provisioned_ Amazon MSK cluster, use the `aws.msk.Cluster` resource.
   */
  def ServerlessCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.msk.ServerlessClusterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.msk.ServerlessClusterArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.msk.ServerlessCluster(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Associates a single SCRAM secret with a Managed Streaming for Kafka (MSK) cluster. */
  def SingleScramSecretAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.msk.SingleScramSecretAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.msk.SingleScramSecretAssociationArgs.builder
    com.pulumi.aws.msk.SingleScramSecretAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an AWS Managed Streaming for Kafka Topic. */
  def Topic(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.msk.TopicArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.msk.TopicArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.msk.Topic(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Resource for managing an AWS Managed Streaming for Kafka VPC Connection. */
  def VpcConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.msk.VpcConnectionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.msk.VpcConnectionArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.msk.VpcConnection(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
