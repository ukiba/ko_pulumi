package jp.ukiba.ko_pulumi
package gcp

object filestore_ext:
  extension (builder: com.pulumi.gcp.filestore.InstanceArgs.Builder)
    /**
     * @param directoryServices Directory Services configuration.
     * Should only be set if protocol is &#34;NFS_V4_1&#34;.
     * Structure is documented below.
     * @return builder
     */
    inline def directoryServices(args: Endofunction[com.pulumi.gcp.filestore.inputs.InstanceDirectoryServicesArgs.Builder]):
        com.pulumi.gcp.filestore.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.filestore.inputs.InstanceDirectoryServicesArgs.builder
      builder.directoryServices(args(argsBuilder).build)

    /**
     * @param fileShares File system shares on the instance. For this version, only a
     * single file share is supported.
     * Structure is documented below.
     * @return builder
     */
    inline def fileShares(args: Endofunction[com.pulumi.gcp.filestore.inputs.InstanceFileSharesArgs.Builder]):
        com.pulumi.gcp.filestore.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.filestore.inputs.InstanceFileSharesArgs.builder
      builder.fileShares(args(argsBuilder).build)

    /**
     * @param initialReplication Replication configuration, once set, this cannot be updated.
     * Additionally this should be specified on the replica instance only, indicating the active as the peerInstance
     * Structure is documented below.
     * @return builder
     */
    inline def initialReplication(args: Endofunction[com.pulumi.gcp.filestore.inputs.InstanceInitialReplicationArgs.Builder]):
        com.pulumi.gcp.filestore.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.filestore.inputs.InstanceInitialReplicationArgs.builder
      builder.initialReplication(args(argsBuilder).build)

    /**
     * @param networks VPC networks to which the instance is connected. For this version,
     * only a single network is supported.
     * Structure is documented below.
     * @return builder
     */
    inline def networks(args: Endofunction[com.pulumi.gcp.filestore.inputs.InstanceNetworkArgs.Builder]*):
        com.pulumi.gcp.filestore.InstanceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.filestore.inputs.InstanceNetworkArgs.builder
      builder.networks(args.map(_(argsBuilder).build)*)

    /**
     * @param performanceConfig Performance configuration for the instance. If not provided,
     * the default performance settings will be used.
     * Structure is documented below.
     * @return builder
     */
    inline def performanceConfig(args: Endofunction[com.pulumi.gcp.filestore.inputs.InstancePerformanceConfigArgs.Builder]):
        com.pulumi.gcp.filestore.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.filestore.inputs.InstancePerformanceConfigArgs.builder
      builder.performanceConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.filestore.inputs.InstanceDirectoryServicesArgs.Builder)
    /**
     * @param ldap Configuration for LDAP servers.
     * Structure is documented below.
     * @return builder
     */
    inline def ldap(args: Endofunction[com.pulumi.gcp.filestore.inputs.InstanceDirectoryServicesLdapArgs.Builder]):
        com.pulumi.gcp.filestore.inputs.InstanceDirectoryServicesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.filestore.inputs.InstanceDirectoryServicesLdapArgs.builder
      builder.ldap(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.filestore.inputs.InstanceEffectiveReplicationArgs.Builder)
    /**
     * @param replicas The replication role.
     * Structure is documented below.
     * @return builder
     */
    inline def replicas(args: Endofunction[com.pulumi.gcp.filestore.inputs.InstanceEffectiveReplicationReplicaArgs.Builder]*):
        com.pulumi.gcp.filestore.inputs.InstanceEffectiveReplicationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.filestore.inputs.InstanceEffectiveReplicationReplicaArgs.builder
      builder.replicas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.filestore.inputs.InstanceFileSharesArgs.Builder)
    /**
     * @param nfsExportOptions Nfs Export Options. There is a limit of 10 export options per file share.
     * Structure is documented below.
     * @return builder
     */
    inline def nfsExportOptions(args: Endofunction[com.pulumi.gcp.filestore.inputs.InstanceFileSharesNfsExportOptionArgs.Builder]*):
        com.pulumi.gcp.filestore.inputs.InstanceFileSharesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.filestore.inputs.InstanceFileSharesNfsExportOptionArgs.builder
      builder.nfsExportOptions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.filestore.inputs.InstanceInitialReplicationArgs.Builder)
    /**
     * @param replicas The replication role.
     * Structure is documented below.
     * @return builder
     */
    inline def replicas(args: Endofunction[com.pulumi.gcp.filestore.inputs.InstanceInitialReplicationReplicaArgs.Builder]*):
        com.pulumi.gcp.filestore.inputs.InstanceInitialReplicationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.filestore.inputs.InstanceInitialReplicationReplicaArgs.builder
      builder.replicas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.filestore.inputs.InstanceNetworkArgs.Builder)
    /**
     * @param pscConfig Private Service Connect configuration.
     * Should only be set when connectMode is PRIVATE_SERVICE_CONNECT.
     * Structure is documented below.
     * @return builder
     */
    inline def pscConfig(args: Endofunction[com.pulumi.gcp.filestore.inputs.InstanceNetworkPscConfigArgs.Builder]):
        com.pulumi.gcp.filestore.inputs.InstanceNetworkArgs.Builder =
      val argsBuilder = com.pulumi.gcp.filestore.inputs.InstanceNetworkPscConfigArgs.builder
      builder.pscConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.filestore.inputs.InstancePerformanceConfigArgs.Builder)
    /**
     * @param fixedIops The instance will have a fixed provisioned IOPS value,
     * which will remain constant regardless of instance
     * capacity.
     * Structure is documented below.
     * @return builder
     */
    inline def fixedIops(args: Endofunction[com.pulumi.gcp.filestore.inputs.InstancePerformanceConfigFixedIopsArgs.Builder]):
        com.pulumi.gcp.filestore.inputs.InstancePerformanceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.filestore.inputs.InstancePerformanceConfigFixedIopsArgs.builder
      builder.fixedIops(args(argsBuilder).build)

    /**
     * @param iopsPerTb The instance provisioned IOPS will change dynamically
     * based on the capacity of the instance.
     * Structure is documented below.
     * @return builder
     */
    inline def iopsPerTb(args: Endofunction[com.pulumi.gcp.filestore.inputs.InstancePerformanceConfigIopsPerTbArgs.Builder]):
        com.pulumi.gcp.filestore.inputs.InstancePerformanceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.filestore.inputs.InstancePerformanceConfigIopsPerTbArgs.builder
      builder.iopsPerTb(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.filestore.inputs.InstanceState.Builder)
    /**
     * @param directoryServices Directory Services configuration.
     * Should only be set if protocol is &#34;NFS_V4_1&#34;.
     * Structure is documented below.
     * @return builder
     */
    inline def directoryServices(args: Endofunction[com.pulumi.gcp.filestore.inputs.InstanceDirectoryServicesArgs.Builder]):
        com.pulumi.gcp.filestore.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.filestore.inputs.InstanceDirectoryServicesArgs.builder
      builder.directoryServices(args(argsBuilder).build)

    /**
     * @param effectiveReplications Output only fields for replication configuration.
     * Structure is documented below.
     * @return builder
     */
    inline def effectiveReplications(args: Endofunction[com.pulumi.gcp.filestore.inputs.InstanceEffectiveReplicationArgs.Builder]*):
        com.pulumi.gcp.filestore.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.filestore.inputs.InstanceEffectiveReplicationArgs.builder
      builder.effectiveReplications(args.map(_(argsBuilder).build)*)

    /**
     * @param fileShares File system shares on the instance. For this version, only a
     * single file share is supported.
     * Structure is documented below.
     * @return builder
     */
    inline def fileShares(args: Endofunction[com.pulumi.gcp.filestore.inputs.InstanceFileSharesArgs.Builder]):
        com.pulumi.gcp.filestore.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.filestore.inputs.InstanceFileSharesArgs.builder
      builder.fileShares(args(argsBuilder).build)

    /**
     * @param initialReplication Replication configuration, once set, this cannot be updated.
     * Additionally this should be specified on the replica instance only, indicating the active as the peerInstance
     * Structure is documented below.
     * @return builder
     */
    inline def initialReplication(args: Endofunction[com.pulumi.gcp.filestore.inputs.InstanceInitialReplicationArgs.Builder]):
        com.pulumi.gcp.filestore.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.filestore.inputs.InstanceInitialReplicationArgs.builder
      builder.initialReplication(args(argsBuilder).build)

    /**
     * @param networks VPC networks to which the instance is connected. For this version,
     * only a single network is supported.
     * Structure is documented below.
     * @return builder
     */
    inline def networks(args: Endofunction[com.pulumi.gcp.filestore.inputs.InstanceNetworkArgs.Builder]*):
        com.pulumi.gcp.filestore.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.filestore.inputs.InstanceNetworkArgs.builder
      builder.networks(args.map(_(argsBuilder).build)*)

    /**
     * @param performanceConfig Performance configuration for the instance. If not provided,
     * the default performance settings will be used.
     * Structure is documented below.
     * @return builder
     */
    inline def performanceConfig(args: Endofunction[com.pulumi.gcp.filestore.inputs.InstancePerformanceConfigArgs.Builder]):
        com.pulumi.gcp.filestore.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.filestore.inputs.InstancePerformanceConfigArgs.builder
      builder.performanceConfig(args(argsBuilder).build)
