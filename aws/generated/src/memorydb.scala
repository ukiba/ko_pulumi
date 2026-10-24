package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object memorydb:
  /**
   * Provides a MemoryDB ACL.
   * 
   * More information about users and ACL-s can be found in the [MemoryDB User Guide](https://docs.aws.amazon.com/memorydb/latest/devguide/clusters.acls.html).
   */
  def Acl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.memorydb.AclArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.memorydb.AclArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.memorydb.Acl(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a MemoryDB Cluster.
   * 
   * More information about MemoryDB can be found in the [Developer Guide](https://docs.aws.amazon.com/memorydb/latest/devguide/what-is-memorydb-for-redis.html).
   */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.memorydb.ClusterArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.memorydb.ClusterArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.memorydb.Cluster(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object MemorydbFunctions:
    /** Provides information about a MemoryDB ACL. */
    inline def getAcl(args: Endofunction[com.pulumi.aws.memorydb.inputs.GetAclArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.memorydb.outputs.GetAclResult] =
      val argsBuilder = com.pulumi.aws.memorydb.inputs.GetAclArgs.builder
      com.pulumi.aws.memorydb.MemorydbFunctions.getAcl(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides information about a MemoryDB ACL. */
    inline def getAclPlain(args: Endofunction[com.pulumi.aws.memorydb.inputs.GetAclPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.memorydb.outputs.GetAclResult] =
      val argsBuilder = com.pulumi.aws.memorydb.inputs.GetAclPlainArgs.builder
      com.pulumi.aws.memorydb.MemorydbFunctions.getAclPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides information about a MemoryDB Cluster. */
    inline def getCluster(args: Endofunction[com.pulumi.aws.memorydb.inputs.GetClusterArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.memorydb.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.aws.memorydb.inputs.GetClusterArgs.builder
      com.pulumi.aws.memorydb.MemorydbFunctions.getCluster(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides information about a MemoryDB Cluster. */
    inline def getClusterPlain(args: Endofunction[com.pulumi.aws.memorydb.inputs.GetClusterPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.memorydb.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.aws.memorydb.inputs.GetClusterPlainArgs.builder
      com.pulumi.aws.memorydb.MemorydbFunctions.getClusterPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides information about a MemoryDB Parameter Group. */
    inline def getParameterGroup(args: Endofunction[com.pulumi.aws.memorydb.inputs.GetParameterGroupArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.memorydb.outputs.GetParameterGroupResult] =
      val argsBuilder = com.pulumi.aws.memorydb.inputs.GetParameterGroupArgs.builder
      com.pulumi.aws.memorydb.MemorydbFunctions.getParameterGroup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides information about a MemoryDB Parameter Group. */
    inline def getParameterGroupPlain(args: Endofunction[com.pulumi.aws.memorydb.inputs.GetParameterGroupPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.memorydb.outputs.GetParameterGroupResult] =
      val argsBuilder = com.pulumi.aws.memorydb.inputs.GetParameterGroupPlainArgs.builder
      com.pulumi.aws.memorydb.MemorydbFunctions.getParameterGroupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides information about a MemoryDB Snapshot. */
    inline def getSnapshot(args: Endofunction[com.pulumi.aws.memorydb.inputs.GetSnapshotArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.memorydb.outputs.GetSnapshotResult] =
      val argsBuilder = com.pulumi.aws.memorydb.inputs.GetSnapshotArgs.builder
      com.pulumi.aws.memorydb.MemorydbFunctions.getSnapshot(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides information about a MemoryDB Snapshot. */
    inline def getSnapshotPlain(args: Endofunction[com.pulumi.aws.memorydb.inputs.GetSnapshotPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.memorydb.outputs.GetSnapshotResult] =
      val argsBuilder = com.pulumi.aws.memorydb.inputs.GetSnapshotPlainArgs.builder
      com.pulumi.aws.memorydb.MemorydbFunctions.getSnapshotPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides information about a MemoryDB Subnet Group. */
    inline def getSubnetGroup(args: Endofunction[com.pulumi.aws.memorydb.inputs.GetSubnetGroupArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.memorydb.outputs.GetSubnetGroupResult] =
      val argsBuilder = com.pulumi.aws.memorydb.inputs.GetSubnetGroupArgs.builder
      com.pulumi.aws.memorydb.MemorydbFunctions.getSubnetGroup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides information about a MemoryDB Subnet Group. */
    inline def getSubnetGroupPlain(args: Endofunction[com.pulumi.aws.memorydb.inputs.GetSubnetGroupPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.memorydb.outputs.GetSubnetGroupResult] =
      val argsBuilder = com.pulumi.aws.memorydb.inputs.GetSubnetGroupPlainArgs.builder
      com.pulumi.aws.memorydb.MemorydbFunctions.getSubnetGroupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides information about a MemoryDB User. */
    inline def getUser(args: Endofunction[com.pulumi.aws.memorydb.inputs.GetUserArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.memorydb.outputs.GetUserResult] =
      val argsBuilder = com.pulumi.aws.memorydb.inputs.GetUserArgs.builder
      com.pulumi.aws.memorydb.MemorydbFunctions.getUser(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides information about a MemoryDB User. */
    inline def getUserPlain(args: Endofunction[com.pulumi.aws.memorydb.inputs.GetUserPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.memorydb.outputs.GetUserResult] =
      val argsBuilder = com.pulumi.aws.memorydb.inputs.GetUserPlainArgs.builder
      com.pulumi.aws.memorydb.MemorydbFunctions.getUserPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Provides a MemoryDB Multi Region Cluster.
   * 
   * More information about MemoryDB can be found in the [Developer Guide](https://docs.aws.amazon.com/memorydb/latest/devguide/what-is-memorydb-for-redis.html).
   */
  def MultiRegionCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.memorydb.MultiRegionClusterArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.memorydb.MultiRegionClusterArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.memorydb.MultiRegionCluster(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a MemoryDB Parameter Group.
   * 
   * More information about parameter groups can be found in the [MemoryDB User Guide](https://docs.aws.amazon.com/memorydb/latest/devguide/parametergroups.html).
   */
  def ParameterGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.memorydb.ParameterGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.memorydb.ParameterGroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.memorydb.ParameterGroup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a MemoryDB Snapshot.
   * 
   * More information about snapshot and restore can be found in the [MemoryDB User Guide](https://docs.aws.amazon.com/memorydb/latest/devguide/snapshots.html).
   */
  def Snapshot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.memorydb.SnapshotArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.memorydb.SnapshotArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.memorydb.Snapshot(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a MemoryDB Subnet Group.
   * 
   * More information about subnet groups can be found in the [MemoryDB User Guide](https://docs.aws.amazon.com/memorydb/latest/devguide/subnetgroups.html).
   */
  def SubnetGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.memorydb.SubnetGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.memorydb.SubnetGroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.memorydb.SubnetGroup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a MemoryDB User.
   * 
   * More information about users and ACL-s can be found in the [MemoryDB User Guide](https://docs.aws.amazon.com/memorydb/latest/devguide/clusters.acls.html).
   * 
   * &gt; **Note:** All arguments including the username and passwords will be stored in the raw state as plain-text.
   */
  def User(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.memorydb.UserArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.memorydb.UserArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.memorydb.User(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
