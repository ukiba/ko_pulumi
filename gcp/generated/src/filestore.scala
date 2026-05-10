package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object filestore:
  extension (builder: com.pulumi.gcp.filestore.InstanceArgs.Builder)
    /**
     * @param directoryServices Directory Services configuration.
     *  Should only be set if protocol is &#34;NFS_V4_1&#34;.
     *  Structure is documented below.
     * @return builder
     */
    def directoryServices(args: Endofunction[com.pulumi.gcp.filestore.inputs.InstanceDirectoryServicesArgs.Builder]):
        com.pulumi.gcp.filestore.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.filestore.inputs.InstanceDirectoryServicesArgs.builder
      builder.directoryServices(args(argsBuilder).build)

    /**
     * @param fileShares File system shares on the instance. For this version, only a
     *  single file share is supported.
     *  Structure is documented below.
     * @return builder
     */
    def fileShares(args: Endofunction[com.pulumi.gcp.filestore.inputs.InstanceFileSharesArgs.Builder]):
        com.pulumi.gcp.filestore.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.filestore.inputs.InstanceFileSharesArgs.builder
      builder.fileShares(args(argsBuilder).build)

    /**
     * @param initialReplication Replication configuration, once set, this cannot be updated.
     *  Additionally this should be specified on the replica instance only, indicating the active as the peerInstance
     *  Structure is documented below.
     * @return builder
     */
    def initialReplication(args: Endofunction[com.pulumi.gcp.filestore.inputs.InstanceInitialReplicationArgs.Builder]):
        com.pulumi.gcp.filestore.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.filestore.inputs.InstanceInitialReplicationArgs.builder
      builder.initialReplication(args(argsBuilder).build)

    /**
     * @param networks VPC networks to which the instance is connected. For this version,
     *  only a single network is supported.
     *  Structure is documented below.
     * @return builder
     */
    def networks(args: Endofunction[com.pulumi.gcp.filestore.inputs.InstanceNetworkArgs.Builder]*):
        com.pulumi.gcp.filestore.InstanceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.filestore.inputs.InstanceNetworkArgs.builder
      builder.networks(args.map(_(argsBuilder).build)*)

    /**
     * @param performanceConfig Performance configuration for the instance. If not provided,
     *  the default performance settings will be used.
     *  Structure is documented below.
     * @return builder
     */
    def performanceConfig(args: Endofunction[com.pulumi.gcp.filestore.inputs.InstancePerformanceConfigArgs.Builder]):
        com.pulumi.gcp.filestore.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.filestore.inputs.InstancePerformanceConfigArgs.builder
      builder.performanceConfig(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.gcp.filestore.InstanceArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * A Google Cloud Filestore snapshot.
   * 
   *  To get more information about Snapshot, see:
   * 
   *  * [API documentation](https://cloud.google.com/filestore/docs/reference/rest/v1/projects.locations.instances.snapshots)
   *  * How-to Guides
   *      * [Creating Snapshots](https://cloud.google.com/filestore/docs/create-snapshots)
   *      * [Official Documentation](https://cloud.google.com/filestore/docs/snapshots)
   */
  def Snapshot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.filestore.SnapshotArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.filestore.SnapshotArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.filestore.Snapshot(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Google Cloud Filestore instance.
   * 
   *  To get more information about Instance, see:
   * 
   *  * [API documentation](https://cloud.google.com/filestore/docs/reference/rest/v1beta1/projects.locations.instances/create)
   *  * How-to Guides
   *      * [Copying Data In/Out](https://cloud.google.com/filestore/docs/copying-data)
   *      * [Official Documentation](https://cloud.google.com/filestore/docs/creating-instances)
   *      * [Use with Kubernetes](https://cloud.google.com/filestore/docs/accessing-fileshares)
   */
  def Instance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.filestore.InstanceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.filestore.InstanceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.gcp.filestore.Instance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type FilestoreFunctions = com.pulumi.gcp.filestore.FilestoreFunctions
  object FilestoreFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.filestore.FilestoreFunctions.*
  extension (self: FilestoreFunctions.type)
    /** Get info about a Google Cloud Filestore instance. */
    def getInstance(args: Endofunction[com.pulumi.gcp.filestore.inputs.GetInstanceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.filestore.outputs.GetInstanceResult] =
      val argsBuilder = com.pulumi.gcp.filestore.inputs.GetInstanceArgs.builder
      com.pulumi.gcp.filestore.FilestoreFunctions.getInstance(args(argsBuilder).build)

    /** Get info about a Google Cloud Filestore instance. */
    def getInstancePlain(args: Endofunction[com.pulumi.gcp.filestore.inputs.GetInstancePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.filestore.outputs.GetInstanceResult] =
      val argsBuilder = com.pulumi.gcp.filestore.inputs.GetInstancePlainArgs.builder
      com.pulumi.gcp.filestore.FilestoreFunctions.getInstancePlain(args(argsBuilder).build)

  /**
   * A Google Cloud Filestore backup.
   * 
   *  To get more information about Backup, see:
   * 
   *  * [API documentation](https://cloud.google.com/filestore/docs/reference/rest/v1/projects.locations.backups)
   *  * How-to Guides
   *      * [Creating Backups](https://cloud.google.com/filestore/docs/create-backups)
   *      * [Official Documentation](https://cloud.google.com/filestore/docs/backups)
   */
  def Backup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.filestore.BackupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.filestore.BackupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.gcp.filestore.Backup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.filestore.inputs.InstanceInitialReplicationArgs.Builder)
    /**
     * @param replicas The replication role.
     *  Structure is documented below.
     * @return builder
     */
    def replicas(args: Endofunction[com.pulumi.gcp.filestore.inputs.InstanceInitialReplicationReplicaArgs.Builder]*):
        com.pulumi.gcp.filestore.inputs.InstanceInitialReplicationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.filestore.inputs.InstanceInitialReplicationReplicaArgs.builder
      builder.replicas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.filestore.inputs.InstancePerformanceConfigArgs.Builder)
    /**
     * @param fixedIops The instance will have a fixed provisioned IOPS value,
     *  which will remain constant regardless of instance
     *  capacity.
     *  Structure is documented below.
     * @return builder
     */
    def fixedIops(args: Endofunction[com.pulumi.gcp.filestore.inputs.InstancePerformanceConfigFixedIopsArgs.Builder]):
        com.pulumi.gcp.filestore.inputs.InstancePerformanceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.filestore.inputs.InstancePerformanceConfigFixedIopsArgs.builder
      builder.fixedIops(args(argsBuilder).build)

    /**
     * @param iopsPerTb The instance provisioned IOPS will change dynamically
     *  based on the capacity of the instance.
     *  Structure is documented below.
     * @return builder
     */
    def iopsPerTb(args: Endofunction[com.pulumi.gcp.filestore.inputs.InstancePerformanceConfigIopsPerTbArgs.Builder]):
        com.pulumi.gcp.filestore.inputs.InstancePerformanceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.filestore.inputs.InstancePerformanceConfigIopsPerTbArgs.builder
      builder.iopsPerTb(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.filestore.inputs.InstanceFileSharesArgs.Builder)
    /**
     * @param nfsExportOptions Nfs Export Options. There is a limit of 10 export options per file share.
     *  Structure is documented below.
     * @return builder
     */
    def nfsExportOptions(args: Endofunction[com.pulumi.gcp.filestore.inputs.InstanceFileSharesNfsExportOptionArgs.Builder]*):
        com.pulumi.gcp.filestore.inputs.InstanceFileSharesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.filestore.inputs.InstanceFileSharesNfsExportOptionArgs.builder
      builder.nfsExportOptions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.filestore.inputs.InstanceDirectoryServicesArgs.Builder)
    /**
     * @param ldap Configuration for LDAP servers.
     *  Structure is documented below.
     * @return builder
     */
    def ldap(args: Endofunction[com.pulumi.gcp.filestore.inputs.InstanceDirectoryServicesLdapArgs.Builder]):
        com.pulumi.gcp.filestore.inputs.InstanceDirectoryServicesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.filestore.inputs.InstanceDirectoryServicesLdapArgs.builder
      builder.ldap(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.filestore.inputs.InstanceEffectiveReplicationArgs.Builder)
    /**
     * @param replicas The replication role.
     *  Structure is documented below.
     * @return builder
     */
    def replicas(args: Endofunction[com.pulumi.gcp.filestore.inputs.InstanceEffectiveReplicationReplicaArgs.Builder]*):
        com.pulumi.gcp.filestore.inputs.InstanceEffectiveReplicationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.filestore.inputs.InstanceEffectiveReplicationReplicaArgs.builder
      builder.replicas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.filestore.inputs.InstanceNetworkArgs.Builder)
    /**
     * @param pscConfig Private Service Connect configuration.
     *  Should only be set when connectMode is PRIVATE_SERVICE_CONNECT.
     *  Structure is documented below.
     * @return builder
     */
    def pscConfig(args: Endofunction[com.pulumi.gcp.filestore.inputs.InstanceNetworkPscConfigArgs.Builder]):
        com.pulumi.gcp.filestore.inputs.InstanceNetworkArgs.Builder =
      val argsBuilder = com.pulumi.gcp.filestore.inputs.InstanceNetworkPscConfigArgs.builder
      builder.pscConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.filestore.inputs.InstanceState.Builder)
    /**
     * @param directoryServices Directory Services configuration.
     *  Should only be set if protocol is &#34;NFS_V4_1&#34;.
     *  Structure is documented below.
     * @return builder
     */
    def directoryServices(args: Endofunction[com.pulumi.gcp.filestore.inputs.InstanceDirectoryServicesArgs.Builder]):
        com.pulumi.gcp.filestore.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.filestore.inputs.InstanceDirectoryServicesArgs.builder
      builder.directoryServices(args(argsBuilder).build)

    /**
     * @param effectiveReplications Output only fields for replication configuration.
     *  Structure is documented below.
     * @return builder
     */
    def effectiveReplications(args: Endofunction[com.pulumi.gcp.filestore.inputs.InstanceEffectiveReplicationArgs.Builder]*):
        com.pulumi.gcp.filestore.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.filestore.inputs.InstanceEffectiveReplicationArgs.builder
      builder.effectiveReplications(args.map(_(argsBuilder).build)*)

    /**
     * @param fileShares File system shares on the instance. For this version, only a
     *  single file share is supported.
     *  Structure is documented below.
     * @return builder
     */
    def fileShares(args: Endofunction[com.pulumi.gcp.filestore.inputs.InstanceFileSharesArgs.Builder]):
        com.pulumi.gcp.filestore.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.filestore.inputs.InstanceFileSharesArgs.builder
      builder.fileShares(args(argsBuilder).build)

    /**
     * @param initialReplication Replication configuration, once set, this cannot be updated.
     *  Additionally this should be specified on the replica instance only, indicating the active as the peerInstance
     *  Structure is documented below.
     * @return builder
     */
    def initialReplication(args: Endofunction[com.pulumi.gcp.filestore.inputs.InstanceInitialReplicationArgs.Builder]):
        com.pulumi.gcp.filestore.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.filestore.inputs.InstanceInitialReplicationArgs.builder
      builder.initialReplication(args(argsBuilder).build)

    /**
     * @param networks VPC networks to which the instance is connected. For this version,
     *  only a single network is supported.
     *  Structure is documented below.
     * @return builder
     */
    def networks(args: Endofunction[com.pulumi.gcp.filestore.inputs.InstanceNetworkArgs.Builder]*):
        com.pulumi.gcp.filestore.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.filestore.inputs.InstanceNetworkArgs.builder
      builder.networks(args.map(_(argsBuilder).build)*)

    /**
     * @param performanceConfig Performance configuration for the instance. If not provided,
     *  the default performance settings will be used.
     *  Structure is documented below.
     * @return builder
     */
    def performanceConfig(args: Endofunction[com.pulumi.gcp.filestore.inputs.InstancePerformanceConfigArgs.Builder]):
        com.pulumi.gcp.filestore.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.filestore.inputs.InstancePerformanceConfigArgs.builder
      builder.performanceConfig(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.gcp.filestore.inputs.InstanceState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
