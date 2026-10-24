package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object managedkafka:
  /** A Managed Service for Apache Kafka ACL. Apache Kafka is a trademark owned by the Apache Software Foundation. */
  def Acl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.managedkafka.AclArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.managedkafka.AclArgs.builder
    com.pulumi.gcp.managedkafka.Acl(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** A Managed Service for Apache Kafka cluster. Apache Kafka is a trademark owned by the Apache Software Foundation. */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.managedkafka.ClusterArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.managedkafka.ClusterArgs.builder
    com.pulumi.gcp.managedkafka.Cluster(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** A Managed Service for Kafka Connect cluster. */
  def ConnectCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.managedkafka.ConnectClusterArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.managedkafka.ConnectClusterArgs.builder
    com.pulumi.gcp.managedkafka.ConnectCluster(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** A Managed Service for Kafka Connect Connectors. */
  def Connector(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.managedkafka.ConnectorArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.managedkafka.ConnectorArgs.builder
    com.pulumi.gcp.managedkafka.Connector(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** A Managed Service for Apache Kafka topic. Apache Kafka is a trademark owned by the Apache Software Foundation. */
  def Topic(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.managedkafka.TopicArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.managedkafka.TopicArgs.builder
    com.pulumi.gcp.managedkafka.Topic(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
