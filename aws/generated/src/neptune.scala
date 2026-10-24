package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object neptune:
  /**
   * Provides an Neptune Cluster Resource. A Cluster Resource defines attributes that are
   * applied to the entire cluster of Neptune Cluster Instances.
   * 
   * Changes to a Neptune Cluster can occur when you manually change a
   * parameter, such as `backupRetentionPeriod`, and are reflected in the next maintenance
   * window. Because of this, this provider may report a difference in its planning
   * phase because a modification has not yet taken place. You can use the
   * `applyImmediately` flag to instruct the service to apply the change immediately
   * (see documentation below).
   */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.neptune.ClusterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.neptune.ClusterArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.neptune.Cluster(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an Neptune Cluster Endpoint Resource. */
  def ClusterEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.neptune.ClusterEndpointArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.neptune.ClusterEndpointArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.neptune.ClusterEndpoint(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A Cluster Instance Resource defines attributes that are specific to a single instance in a Neptune Cluster.
   * 
   * You can simply add neptune instances and Neptune manages the replication. You can use the count
   * meta-parameter to make multiple instances and join them all to the same Neptune Cluster, or you may specify different Cluster Instance resources with various `instanceClass` sizes.
   */
  def ClusterInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.neptune.ClusterInstanceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.neptune.ClusterInstanceArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.neptune.ClusterInstance(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Neptune Cluster Parameter Group */
  def ClusterParameterGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.neptune.ClusterParameterGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.neptune.ClusterParameterGroupArgs.builder
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
    com.pulumi.aws.neptune.ClusterParameterGroup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Neptune database cluster snapshot. */
  def ClusterSnapshot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.neptune.ClusterSnapshotArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.neptune.ClusterSnapshotArgs.builder
    com.pulumi.aws.neptune.ClusterSnapshot(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  def EventSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.neptune.EventSubscriptionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.neptune.EventSubscriptionArgs.builder
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
    com.pulumi.aws.neptune.EventSubscription(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Neptune Global Cluster. A global cluster consists of one primary region and up to five read-only secondary regions. You issue write operations directly to the primary cluster in the primary region and Amazon Neptune automatically replicates the data to the secondary regions using dedicated infrastructure.
   * 
   * More information about Neptune Global Clusters can be found in the [Neptune User Guide](https://docs.aws.amazon.com/neptune/latest/userguide/neptune-global-database.html).
   */
  def GlobalCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.neptune.GlobalClusterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.neptune.GlobalClusterArgs.builder
    com.pulumi.aws.neptune.GlobalCluster(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object NeptuneFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Information about a Neptune engine version.
     * 
     * &gt; **Note:** If AWS returns multiple matching engine versions, this data source will produce a `multiple Neptune engine versions` error. To avoid this, provide additional criteria to narrow the results or use the `latest` argument to select a single version. See the Argument Reference for details.
     */
    inline def getEngineVersion(args: Endofunction[com.pulumi.aws.neptune.inputs.GetEngineVersionArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.neptune.outputs.GetEngineVersionResult] =
      val argsBuilder = com.pulumi.aws.neptune.inputs.GetEngineVersionArgs.builder
      com.pulumi.aws.neptune.NeptuneFunctions.getEngineVersion(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Information about a Neptune engine version.
     * 
     * &gt; **Note:** If AWS returns multiple matching engine versions, this data source will produce a `multiple Neptune engine versions` error. To avoid this, provide additional criteria to narrow the results or use the `latest` argument to select a single version. See the Argument Reference for details.
     */
    inline def getEngineVersionPlain(args: Endofunction[com.pulumi.aws.neptune.inputs.GetEngineVersionPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.neptune.outputs.GetEngineVersionResult] =
      val argsBuilder = com.pulumi.aws.neptune.inputs.GetEngineVersionPlainArgs.builder
      com.pulumi.aws.neptune.NeptuneFunctions.getEngineVersionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Information about Neptune orderable DB instances. */
    inline def getOrderableDbInstance(args: Endofunction[com.pulumi.aws.neptune.inputs.GetOrderableDbInstanceArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.neptune.outputs.GetOrderableDbInstanceResult] =
      val argsBuilder = com.pulumi.aws.neptune.inputs.GetOrderableDbInstanceArgs.builder
      com.pulumi.aws.neptune.NeptuneFunctions.getOrderableDbInstance(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Information about Neptune orderable DB instances. */
    inline def getOrderableDbInstancePlain(args: Endofunction[com.pulumi.aws.neptune.inputs.GetOrderableDbInstancePlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.neptune.outputs.GetOrderableDbInstanceResult] =
      val argsBuilder = com.pulumi.aws.neptune.inputs.GetOrderableDbInstancePlainArgs.builder
      com.pulumi.aws.neptune.NeptuneFunctions.getOrderableDbInstancePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages a Neptune Parameter Group */
  def ParameterGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.neptune.ParameterGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.neptune.ParameterGroupArgs.builder
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
    com.pulumi.aws.neptune.ParameterGroup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an Neptune subnet group resource. */
  def SubnetGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.neptune.SubnetGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.neptune.SubnetGroupArgs.builder
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
    com.pulumi.aws.neptune.SubnetGroup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
