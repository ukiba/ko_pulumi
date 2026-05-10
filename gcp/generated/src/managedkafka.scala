package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object managedkafka:
  extension (builder: com.pulumi.gcp.managedkafka.AclArgs.Builder)
    /**
     * @param aclEntries The acl entries that apply to the resource pattern. The maximum number of allowed entries is 100.
     *  Structure is documented below.
     * @return builder
     */
    def aclEntries(args: Endofunction[com.pulumi.gcp.managedkafka.inputs.AclAclEntryArgs.Builder]*):
        com.pulumi.gcp.managedkafka.AclArgs.Builder =
      def argsBuilder = com.pulumi.gcp.managedkafka.inputs.AclAclEntryArgs.builder
      builder.aclEntries(args.map(_(argsBuilder).build)*)

  /** A Managed Service for Kafka Connect cluster. */
  def ConnectCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.managedkafka.ConnectClusterArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.managedkafka.ConnectClusterArgs.builder
    com.pulumi.gcp.managedkafka.ConnectCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** A Managed Service for Apache Kafka cluster. Apache Kafka is a trademark owned by the Apache Software Foundation. */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.managedkafka.ClusterArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.managedkafka.ClusterArgs.builder
    com.pulumi.gcp.managedkafka.Cluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.managedkafka.ClusterArgs.Builder)
    /**
     * @param brokerCapacityConfig Capacity configuration at a per-broker level within the Kafka cluster. The config will be appled to each broker in the cluster.
     *  Structure is documented below.
     * @return builder
     */
    def brokerCapacityConfig(args: Endofunction[com.pulumi.gcp.managedkafka.inputs.ClusterBrokerCapacityConfigArgs.Builder]):
        com.pulumi.gcp.managedkafka.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.managedkafka.inputs.ClusterBrokerCapacityConfigArgs.builder
      builder.brokerCapacityConfig(args(argsBuilder).build)

    /**
     * @param capacityConfig A capacity configuration of a Kafka cluster.
     *  Structure is documented below.
     * @return builder
     */
    def capacityConfig(args: Endofunction[com.pulumi.gcp.managedkafka.inputs.ClusterCapacityConfigArgs.Builder]):
        com.pulumi.gcp.managedkafka.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.managedkafka.inputs.ClusterCapacityConfigArgs.builder
      builder.capacityConfig(args(argsBuilder).build)

    /**
     * @param gcpConfig Configuration properties for a Kafka cluster deployed to Google Cloud Platform.
     *  Structure is documented below.
     * @return builder
     */
    def gcpConfig(args: Endofunction[com.pulumi.gcp.managedkafka.inputs.ClusterGcpConfigArgs.Builder]):
        com.pulumi.gcp.managedkafka.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.managedkafka.inputs.ClusterGcpConfigArgs.builder
      builder.gcpConfig(args(argsBuilder).build)

    /**
     * @param rebalanceConfig Defines rebalancing behavior of a Kafka cluster.
     *  Structure is documented below.
     * @return builder
     */
    def rebalanceConfig(args: Endofunction[com.pulumi.gcp.managedkafka.inputs.ClusterRebalanceConfigArgs.Builder]):
        com.pulumi.gcp.managedkafka.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.managedkafka.inputs.ClusterRebalanceConfigArgs.builder
      builder.rebalanceConfig(args(argsBuilder).build)

    /**
     * @param tlsConfig TLS configuration for the Kafka cluster. This is used to configure mTLS authentication. To clear our a TLS configuration that has been previously set, please explicitly add an empty `tlsConfig` block.
     *  Structure is documented below.
     * @return builder
     */
    def tlsConfig(args: Endofunction[com.pulumi.gcp.managedkafka.inputs.ClusterTlsConfigArgs.Builder]):
        com.pulumi.gcp.managedkafka.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.managedkafka.inputs.ClusterTlsConfigArgs.builder
      builder.tlsConfig(args(argsBuilder).build)

  /** A Managed Service for Kafka Connect Connectors. */
  def Connector(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.managedkafka.ConnectorArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.managedkafka.ConnectorArgs.builder
    com.pulumi.gcp.managedkafka.Connector(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** A Managed Service for Apache Kafka ACL. Apache Kafka is a trademark owned by the Apache Software Foundation. */
  def Acl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.managedkafka.AclArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.managedkafka.AclArgs.builder
    com.pulumi.gcp.managedkafka.Acl(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** A Managed Service for Apache Kafka topic. Apache Kafka is a trademark owned by the Apache Software Foundation. */
  def Topic(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.managedkafka.TopicArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.managedkafka.TopicArgs.builder
    com.pulumi.gcp.managedkafka.Topic(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.managedkafka.ConnectorArgs.Builder)
    /**
     * @param taskRestartPolicy A policy that specifies how to restart the failed connectors/tasks in a Cluster resource. If not set, the failed connectors/tasks won&#39;t be restarted.
     *  Structure is documented below.
     * @return builder
     */
    def taskRestartPolicy(args: Endofunction[com.pulumi.gcp.managedkafka.inputs.ConnectorTaskRestartPolicyArgs.Builder]):
        com.pulumi.gcp.managedkafka.ConnectorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.managedkafka.inputs.ConnectorTaskRestartPolicyArgs.builder
      builder.taskRestartPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.managedkafka.ConnectClusterArgs.Builder)
    /**
     * @param capacityConfig A capacity configuration of a Kafka cluster.
     *  Structure is documented below.
     * @return builder
     */
    def capacityConfig(args: Endofunction[com.pulumi.gcp.managedkafka.inputs.ConnectClusterCapacityConfigArgs.Builder]):
        com.pulumi.gcp.managedkafka.ConnectClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.managedkafka.inputs.ConnectClusterCapacityConfigArgs.builder
      builder.capacityConfig(args(argsBuilder).build)

    /**
     * @param gcpConfig Configuration properties for a Kafka Connect cluster deployed to Google Cloud Platform.
     *  Structure is documented below.
     * @return builder
     */
    def gcpConfig(args: Endofunction[com.pulumi.gcp.managedkafka.inputs.ConnectClusterGcpConfigArgs.Builder]):
        com.pulumi.gcp.managedkafka.ConnectClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.managedkafka.inputs.ConnectClusterGcpConfigArgs.builder
      builder.gcpConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.managedkafka.inputs.ClusterState.Builder)
    /**
     * @param brokerCapacityConfig Capacity configuration at a per-broker level within the Kafka cluster. The config will be appled to each broker in the cluster.
     *  Structure is documented below.
     * @return builder
     */
    def brokerCapacityConfig(args: Endofunction[com.pulumi.gcp.managedkafka.inputs.ClusterBrokerCapacityConfigArgs.Builder]):
        com.pulumi.gcp.managedkafka.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.managedkafka.inputs.ClusterBrokerCapacityConfigArgs.builder
      builder.brokerCapacityConfig(args(argsBuilder).build)

    /**
     * @param capacityConfig A capacity configuration of a Kafka cluster.
     *  Structure is documented below.
     * @return builder
     */
    def capacityConfig(args: Endofunction[com.pulumi.gcp.managedkafka.inputs.ClusterCapacityConfigArgs.Builder]):
        com.pulumi.gcp.managedkafka.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.managedkafka.inputs.ClusterCapacityConfigArgs.builder
      builder.capacityConfig(args(argsBuilder).build)

    /**
     * @param gcpConfig Configuration properties for a Kafka cluster deployed to Google Cloud Platform.
     *  Structure is documented below.
     * @return builder
     */
    def gcpConfig(args: Endofunction[com.pulumi.gcp.managedkafka.inputs.ClusterGcpConfigArgs.Builder]):
        com.pulumi.gcp.managedkafka.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.managedkafka.inputs.ClusterGcpConfigArgs.builder
      builder.gcpConfig(args(argsBuilder).build)

    /**
     * @param rebalanceConfig Defines rebalancing behavior of a Kafka cluster.
     *  Structure is documented below.
     * @return builder
     */
    def rebalanceConfig(args: Endofunction[com.pulumi.gcp.managedkafka.inputs.ClusterRebalanceConfigArgs.Builder]):
        com.pulumi.gcp.managedkafka.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.managedkafka.inputs.ClusterRebalanceConfigArgs.builder
      builder.rebalanceConfig(args(argsBuilder).build)

    /**
     * @param tlsConfig TLS configuration for the Kafka cluster. This is used to configure mTLS authentication. To clear our a TLS configuration that has been previously set, please explicitly add an empty `tlsConfig` block.
     *  Structure is documented below.
     * @return builder
     */
    def tlsConfig(args: Endofunction[com.pulumi.gcp.managedkafka.inputs.ClusterTlsConfigArgs.Builder]):
        com.pulumi.gcp.managedkafka.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.managedkafka.inputs.ClusterTlsConfigArgs.builder
      builder.tlsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.managedkafka.inputs.ConnectClusterState.Builder)
    /**
     * @param capacityConfig A capacity configuration of a Kafka cluster.
     *  Structure is documented below.
     * @return builder
     */
    def capacityConfig(args: Endofunction[com.pulumi.gcp.managedkafka.inputs.ConnectClusterCapacityConfigArgs.Builder]):
        com.pulumi.gcp.managedkafka.inputs.ConnectClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.managedkafka.inputs.ConnectClusterCapacityConfigArgs.builder
      builder.capacityConfig(args(argsBuilder).build)

    /**
     * @param gcpConfig Configuration properties for a Kafka Connect cluster deployed to Google Cloud Platform.
     *  Structure is documented below.
     * @return builder
     */
    def gcpConfig(args: Endofunction[com.pulumi.gcp.managedkafka.inputs.ConnectClusterGcpConfigArgs.Builder]):
        com.pulumi.gcp.managedkafka.inputs.ConnectClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.managedkafka.inputs.ConnectClusterGcpConfigArgs.builder
      builder.gcpConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.managedkafka.inputs.ConnectClusterGcpConfigArgs.Builder)
    /**
     * @param accessConfig The configuration of access to the Kafka Connect cluster.
     *  Structure is documented below.
     * @return builder
     */
    def accessConfig(args: Endofunction[com.pulumi.gcp.managedkafka.inputs.ConnectClusterGcpConfigAccessConfigArgs.Builder]):
        com.pulumi.gcp.managedkafka.inputs.ConnectClusterGcpConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.managedkafka.inputs.ConnectClusterGcpConfigAccessConfigArgs.builder
      builder.accessConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.managedkafka.inputs.ClusterGcpConfigArgs.Builder)
    /**
     * @param accessConfig The configuration of access to the Kafka cluster.
     *  Structure is documented below.
     * @return builder
     */
    def accessConfig(args: Endofunction[com.pulumi.gcp.managedkafka.inputs.ClusterGcpConfigAccessConfigArgs.Builder]):
        com.pulumi.gcp.managedkafka.inputs.ClusterGcpConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.managedkafka.inputs.ClusterGcpConfigAccessConfigArgs.builder
      builder.accessConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.managedkafka.inputs.AclState.Builder)
    /**
     * @param aclEntries The acl entries that apply to the resource pattern. The maximum number of allowed entries is 100.
     *  Structure is documented below.
     * @return builder
     */
    def aclEntries(args: Endofunction[com.pulumi.gcp.managedkafka.inputs.AclAclEntryArgs.Builder]*):
        com.pulumi.gcp.managedkafka.inputs.AclState.Builder =
      def argsBuilder = com.pulumi.gcp.managedkafka.inputs.AclAclEntryArgs.builder
      builder.aclEntries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.managedkafka.inputs.ClusterTlsConfigTrustConfigArgs.Builder)
    /**
     * @param casConfigs Configuration for the Google Certificate Authority Service. To support mTLS, you must specify at least one `casConfigs` block. A maximum of 10 CA pools can be specified. Additional CA pools may be specified with additional `casConfigs` blocks.
     *  Structure is documented below.
     * @return builder
     */
    def casConfigs(args: Endofunction[com.pulumi.gcp.managedkafka.inputs.ClusterTlsConfigTrustConfigCasConfigArgs.Builder]*):
        com.pulumi.gcp.managedkafka.inputs.ClusterTlsConfigTrustConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.managedkafka.inputs.ClusterTlsConfigTrustConfigCasConfigArgs.builder
      builder.casConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.managedkafka.inputs.ConnectorState.Builder)
    /**
     * @param taskRestartPolicy A policy that specifies how to restart the failed connectors/tasks in a Cluster resource. If not set, the failed connectors/tasks won&#39;t be restarted.
     *  Structure is documented below.
     * @return builder
     */
    def taskRestartPolicy(args: Endofunction[com.pulumi.gcp.managedkafka.inputs.ConnectorTaskRestartPolicyArgs.Builder]):
        com.pulumi.gcp.managedkafka.inputs.ConnectorState.Builder =
      val argsBuilder = com.pulumi.gcp.managedkafka.inputs.ConnectorTaskRestartPolicyArgs.builder
      builder.taskRestartPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.managedkafka.inputs.ConnectClusterGcpConfigAccessConfigArgs.Builder)
    /**
     * @param networkConfigs Virtual Private Cloud (VPC) subnets where IP addresses for the Kafka Connect cluster are allocated. To make the connect cluster available in a VPC, you must specify at least one subnet per network. You must specify between 1 and 10 subnets. Additional subnets may be specified with additional `networkConfigs` blocks.
     *  Structure is documented below.
     * @return builder
     */
    def networkConfigs(args: Endofunction[com.pulumi.gcp.managedkafka.inputs.ConnectClusterGcpConfigAccessConfigNetworkConfigArgs.Builder]*):
        com.pulumi.gcp.managedkafka.inputs.ConnectClusterGcpConfigAccessConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.managedkafka.inputs.ConnectClusterGcpConfigAccessConfigNetworkConfigArgs.builder
      builder.networkConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.managedkafka.inputs.ClusterGcpConfigAccessConfigArgs.Builder)
    /**
     * @param networkConfigs Virtual Private Cloud (VPC) subnets where IP addresses for the Kafka cluster are allocated. To make the cluster available in a VPC, you must specify at least one `networkConfigs` block. Max of 10 subnets per cluster. Additional subnets may be specified with additional `networkConfigs` blocks.
     *  Structure is documented below.
     * @return builder
     */
    def networkConfigs(args: Endofunction[com.pulumi.gcp.managedkafka.inputs.ClusterGcpConfigAccessConfigNetworkConfigArgs.Builder]*):
        com.pulumi.gcp.managedkafka.inputs.ClusterGcpConfigAccessConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.managedkafka.inputs.ClusterGcpConfigAccessConfigNetworkConfigArgs.builder
      builder.networkConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.managedkafka.inputs.ClusterTlsConfigArgs.Builder)
    /**
     * @param trustConfig The configuration of the broker truststore. If specified, clients can use mTLS for authentication.
     *  Structure is documented below.
     * @return builder
     */
    def trustConfig(args: Endofunction[com.pulumi.gcp.managedkafka.inputs.ClusterTlsConfigTrustConfigArgs.Builder]):
        com.pulumi.gcp.managedkafka.inputs.ClusterTlsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.managedkafka.inputs.ClusterTlsConfigTrustConfigArgs.builder
      builder.trustConfig(args(argsBuilder).build)
