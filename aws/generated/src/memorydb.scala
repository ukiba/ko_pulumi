package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object memorydb:
  object MemorydbFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Provides information about a MemoryDB ACL. */
    inline def getAcl(args: Endofunction[com.pulumi.aws.memorydb.inputs.GetAclArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.memorydb.outputs.GetAclResult] =
      val argsBuilder = com.pulumi.aws.memorydb.inputs.GetAclArgs.builder
      com.pulumi.aws.memorydb.MemorydbFunctions.getAcl(args(argsBuilder).build)

    /** Provides information about a MemoryDB ACL. */
    inline def getAclPlain(args: Endofunction[com.pulumi.aws.memorydb.inputs.GetAclPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.memorydb.outputs.GetAclResult] =
      val argsBuilder = com.pulumi.aws.memorydb.inputs.GetAclPlainArgs.builder
      com.pulumi.aws.memorydb.MemorydbFunctions.getAclPlain(args(argsBuilder).build)

    /** Provides information about a MemoryDB Cluster. */
    inline def getCluster(args: Endofunction[com.pulumi.aws.memorydb.inputs.GetClusterArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.memorydb.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.aws.memorydb.inputs.GetClusterArgs.builder
      com.pulumi.aws.memorydb.MemorydbFunctions.getCluster(args(argsBuilder).build)

    /** Provides information about a MemoryDB Cluster. */
    inline def getClusterPlain(args: Endofunction[com.pulumi.aws.memorydb.inputs.GetClusterPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.memorydb.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.aws.memorydb.inputs.GetClusterPlainArgs.builder
      com.pulumi.aws.memorydb.MemorydbFunctions.getClusterPlain(args(argsBuilder).build)

    /** Provides information about a MemoryDB Parameter Group. */
    inline def getParameterGroup(args: Endofunction[com.pulumi.aws.memorydb.inputs.GetParameterGroupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.memorydb.outputs.GetParameterGroupResult] =
      val argsBuilder = com.pulumi.aws.memorydb.inputs.GetParameterGroupArgs.builder
      com.pulumi.aws.memorydb.MemorydbFunctions.getParameterGroup(args(argsBuilder).build)

    /** Provides information about a MemoryDB Parameter Group. */
    inline def getParameterGroupPlain(args: Endofunction[com.pulumi.aws.memorydb.inputs.GetParameterGroupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.memorydb.outputs.GetParameterGroupResult] =
      val argsBuilder = com.pulumi.aws.memorydb.inputs.GetParameterGroupPlainArgs.builder
      com.pulumi.aws.memorydb.MemorydbFunctions.getParameterGroupPlain(args(argsBuilder).build)

    /** Provides information about a MemoryDB Snapshot. */
    inline def getSnapshot(args: Endofunction[com.pulumi.aws.memorydb.inputs.GetSnapshotArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.memorydb.outputs.GetSnapshotResult] =
      val argsBuilder = com.pulumi.aws.memorydb.inputs.GetSnapshotArgs.builder
      com.pulumi.aws.memorydb.MemorydbFunctions.getSnapshot(args(argsBuilder).build)

    /** Provides information about a MemoryDB Snapshot. */
    inline def getSnapshotPlain(args: Endofunction[com.pulumi.aws.memorydb.inputs.GetSnapshotPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.memorydb.outputs.GetSnapshotResult] =
      val argsBuilder = com.pulumi.aws.memorydb.inputs.GetSnapshotPlainArgs.builder
      com.pulumi.aws.memorydb.MemorydbFunctions.getSnapshotPlain(args(argsBuilder).build)

    /** Provides information about a MemoryDB Subnet Group. */
    inline def getSubnetGroup(args: Endofunction[com.pulumi.aws.memorydb.inputs.GetSubnetGroupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.memorydb.outputs.GetSubnetGroupResult] =
      val argsBuilder = com.pulumi.aws.memorydb.inputs.GetSubnetGroupArgs.builder
      com.pulumi.aws.memorydb.MemorydbFunctions.getSubnetGroup(args(argsBuilder).build)

    /** Provides information about a MemoryDB Subnet Group. */
    inline def getSubnetGroupPlain(args: Endofunction[com.pulumi.aws.memorydb.inputs.GetSubnetGroupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.memorydb.outputs.GetSubnetGroupResult] =
      val argsBuilder = com.pulumi.aws.memorydb.inputs.GetSubnetGroupPlainArgs.builder
      com.pulumi.aws.memorydb.MemorydbFunctions.getSubnetGroupPlain(args(argsBuilder).build)

    /** Provides information about a MemoryDB User. */
    inline def getUser(args: Endofunction[com.pulumi.aws.memorydb.inputs.GetUserArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.memorydb.outputs.GetUserResult] =
      val argsBuilder = com.pulumi.aws.memorydb.inputs.GetUserArgs.builder
      com.pulumi.aws.memorydb.MemorydbFunctions.getUser(args(argsBuilder).build)

    /** Provides information about a MemoryDB User. */
    inline def getUserPlain(args: Endofunction[com.pulumi.aws.memorydb.inputs.GetUserPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.memorydb.outputs.GetUserResult] =
      val argsBuilder = com.pulumi.aws.memorydb.inputs.GetUserPlainArgs.builder
      com.pulumi.aws.memorydb.MemorydbFunctions.getUserPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.memorydb.UserArgs.Builder)
    /**
     * @param authenticationMode Denotes the user&#39;s authentication properties. Detailed below.
     * @return builder
     */
    def authenticationMode(args: Endofunction[com.pulumi.aws.memorydb.inputs.UserAuthenticationModeArgs.Builder]):
        com.pulumi.aws.memorydb.UserArgs.Builder =
      val argsBuilder = com.pulumi.aws.memorydb.inputs.UserAuthenticationModeArgs.builder
      builder.authenticationMode(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.aws.memorydb.UserArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Provides a MemoryDB Parameter Group.
   * 
   *  More information about parameter groups can be found in the [MemoryDB User Guide](https://docs.aws.amazon.com/memorydb/latest/devguide/parametergroups.html).
   */
  def ParameterGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.memorydb.ParameterGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.memorydb.ParameterGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.aws.memorydb.ParameterGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a MemoryDB Subnet Group.
   * 
   *  More information about subnet groups can be found in the [MemoryDB User Guide](https://docs.aws.amazon.com/memorydb/latest/devguide/subnetgroups.html).
   */
  def SubnetGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.memorydb.SubnetGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.memorydb.SubnetGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.aws.memorydb.SubnetGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.memorydb.MultiRegionClusterArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.memorydb.inputs.MultiRegionClusterTimeoutsArgs.Builder]):
        com.pulumi.aws.memorydb.MultiRegionClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.memorydb.inputs.MultiRegionClusterTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.aws.memorydb.MultiRegionClusterArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Provides a MemoryDB Cluster.
   * 
   *  More information about MemoryDB can be found in the [Developer Guide](https://docs.aws.amazon.com/memorydb/latest/devguide/what-is-memorydb-for-redis.html).
   */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.memorydb.ClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.memorydb.ClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.aws.memorydb.Cluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a MemoryDB User.
   * 
   *  More information about users and ACL-s can be found in the [MemoryDB User Guide](https://docs.aws.amazon.com/memorydb/latest/devguide/clusters.acls.html).
   * 
   *  &gt; **Note:** All arguments including the username and passwords will be stored in the raw state as plain-text.
   */
  def User(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.memorydb.UserArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.memorydb.UserArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.aws.memorydb.User(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.memorydb.ParameterGroupArgs.Builder)
    /**
     * @param parameters Set of MemoryDB parameters to apply. Any parameters not specified will fall back to their family defaults. Detailed below.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.memorydb.inputs.ParameterGroupParameterArgs.Builder]*):
        com.pulumi.aws.memorydb.ParameterGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.memorydb.inputs.ParameterGroupParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.aws.memorydb.ParameterGroupArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Provides a MemoryDB Snapshot.
   * 
   *  More information about snapshot and restore can be found in the [MemoryDB User Guide](https://docs.aws.amazon.com/memorydb/latest/devguide/snapshots.html).
   */
  def Snapshot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.memorydb.SnapshotArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.memorydb.SnapshotArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.aws.memorydb.Snapshot(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a MemoryDB ACL.
   * 
   *  More information about users and ACL-s can be found in the [MemoryDB User Guide](https://docs.aws.amazon.com/memorydb/latest/devguide/clusters.acls.html).
   */
  def Acl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.memorydb.AclArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.memorydb.AclArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.aws.memorydb.Acl(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a MemoryDB Multi Region Cluster.
   * 
   *  More information about MemoryDB can be found in the [Developer Guide](https://docs.aws.amazon.com/memorydb/latest/devguide/what-is-memorydb-for-redis.html).
   */
  def MultiRegionCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.memorydb.MultiRegionClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.memorydb.MultiRegionClusterArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.aws.memorydb.MultiRegionCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.memorydb.inputs.ParameterGroupState.Builder)
    /**
     * @param parameters Set of MemoryDB parameters to apply. Any parameters not specified will fall back to their family defaults. Detailed below.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.memorydb.inputs.ParameterGroupParameterArgs.Builder]*):
        com.pulumi.aws.memorydb.inputs.ParameterGroupState.Builder =
      def argsBuilder = com.pulumi.aws.memorydb.inputs.ParameterGroupParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.aws.memorydb.inputs.ParameterGroupState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.aws.memorydb.inputs.ClusterState.Builder)
    def clusterEndpoints(args: Endofunction[com.pulumi.aws.memorydb.inputs.ClusterClusterEndpointArgs.Builder]*):
        com.pulumi.aws.memorydb.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.aws.memorydb.inputs.ClusterClusterEndpointArgs.builder
      builder.clusterEndpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param shards Set of shards in this cluster.
     * @return builder
     */
    def shards(args: Endofunction[com.pulumi.aws.memorydb.inputs.ClusterShardArgs.Builder]*):
        com.pulumi.aws.memorydb.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.aws.memorydb.inputs.ClusterShardArgs.builder
      builder.shards(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.aws.memorydb.inputs.ClusterState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.aws.memorydb.inputs.MultiRegionClusterState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.memorydb.inputs.MultiRegionClusterTimeoutsArgs.Builder]):
        com.pulumi.aws.memorydb.inputs.MultiRegionClusterState.Builder =
      val argsBuilder = com.pulumi.aws.memorydb.inputs.MultiRegionClusterTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.aws.memorydb.inputs.MultiRegionClusterState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.aws.memorydb.inputs.ClusterShardNodeArgs.Builder)
    def endpoints(args: Endofunction[com.pulumi.aws.memorydb.inputs.ClusterShardNodeEndpointArgs.Builder]*):
        com.pulumi.aws.memorydb.inputs.ClusterShardNodeArgs.Builder =
      def argsBuilder = com.pulumi.aws.memorydb.inputs.ClusterShardNodeEndpointArgs.builder
      builder.endpoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.memorydb.inputs.SnapshotState.Builder)
    /**
     * @param clusterConfigurations The configuration of the cluster from which the snapshot was taken.
     * @return builder
     */
    def clusterConfigurations(args: Endofunction[com.pulumi.aws.memorydb.inputs.SnapshotClusterConfigurationArgs.Builder]*):
        com.pulumi.aws.memorydb.inputs.SnapshotState.Builder =
      def argsBuilder = com.pulumi.aws.memorydb.inputs.SnapshotClusterConfigurationArgs.builder
      builder.clusterConfigurations(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.aws.memorydb.inputs.SnapshotState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.aws.memorydb.inputs.UserState.Builder)
    /**
     * @param authenticationMode Denotes the user&#39;s authentication properties. Detailed below.
     * @return builder
     */
    def authenticationMode(args: Endofunction[com.pulumi.aws.memorydb.inputs.UserAuthenticationModeArgs.Builder]):
        com.pulumi.aws.memorydb.inputs.UserState.Builder =
      val argsBuilder = com.pulumi.aws.memorydb.inputs.UserAuthenticationModeArgs.builder
      builder.authenticationMode(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.aws.memorydb.inputs.UserState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.aws.memorydb.inputs.ClusterShardArgs.Builder)
    /**
     * @param nodes Set of nodes in this shard.
     * @return builder
     */
    def nodes(args: Endofunction[com.pulumi.aws.memorydb.inputs.ClusterShardNodeArgs.Builder]*):
        com.pulumi.aws.memorydb.inputs.ClusterShardArgs.Builder =
      def argsBuilder = com.pulumi.aws.memorydb.inputs.ClusterShardNodeArgs.builder
      builder.nodes(args.map(_(argsBuilder).build)*)
