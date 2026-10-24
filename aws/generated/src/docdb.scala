package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object docdb:
  /**
   * Manages a DocumentDB Cluster.
   * 
   * Changes to a DocumentDB Cluster can occur when you manually change a
   * parameter, such as `port`, and are reflected in the next maintenance
   * window. Because of this, this provider may report a difference in its planning
   * phase because a modification has not yet taken place. You can use the
   * `applyImmediately` flag to instruct the service to apply the change immediately
   * (see documentation below).
   * 
   * &gt; **Note:** using `applyImmediately` can result in a brief downtime as the server reboots.
   */
  inline def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.docdb.ClusterArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.docdb.ClusterArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.docdb.Cluster(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an DocumentDB Cluster Resource Instance. A Cluster Instance Resource defines attributes that are specific to a single instance in a DocumentDB Cluster.
   * 
   * You do not designate a primary and subsequent replicas. Instead, you simply add DocumentDB Instances and DocumentDB manages the replication. You can use the count meta-parameter to make multiple instances and join them all to the same DocumentDB Cluster, or you may specify different Cluster Instance resources with various `instanceClass` sizes.
   */
  inline def ClusterInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.docdb.ClusterInstanceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.docdb.ClusterInstanceArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.docdb.ClusterInstance(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a DocumentDB Cluster Parameter Group */
  inline def ClusterParameterGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.docdb.ClusterParameterGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.docdb.ClusterParameterGroupArgs.builder
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
    com.pulumi.aws.docdb.ClusterParameterGroup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a DocumentDB database cluster snapshot for DocumentDB clusters. */
  inline def ClusterSnapshot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.docdb.ClusterSnapshotArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.docdb.ClusterSnapshotArgs.builder
    com.pulumi.aws.docdb.ClusterSnapshot(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object DocdbFunctions:
    /** Information about a DocumentDB engine version. */
    inline def getEngineVersion(args: Endofunction[com.pulumi.aws.docdb.inputs.GetEngineVersionArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.docdb.outputs.GetEngineVersionResult] =
      val argsBuilder = com.pulumi.aws.docdb.inputs.GetEngineVersionArgs.builder
      com.pulumi.aws.docdb.DocdbFunctions.getEngineVersion(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Information about a DocumentDB engine version. */
    inline def getEngineVersionPlain(args: Endofunction[com.pulumi.aws.docdb.inputs.GetEngineVersionPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.docdb.outputs.GetEngineVersionResult] =
      val argsBuilder = com.pulumi.aws.docdb.inputs.GetEngineVersionPlainArgs.builder
      com.pulumi.aws.docdb.DocdbFunctions.getEngineVersionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Information about DocumentDB orderable DB instances. */
    inline def getOrderableDbInstance(args: Endofunction[com.pulumi.aws.docdb.inputs.GetOrderableDbInstanceArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.docdb.outputs.GetOrderableDbInstanceResult] =
      val argsBuilder = com.pulumi.aws.docdb.inputs.GetOrderableDbInstanceArgs.builder
      com.pulumi.aws.docdb.DocdbFunctions.getOrderableDbInstance(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Information about DocumentDB orderable DB instances. */
    inline def getOrderableDbInstancePlain(args: Endofunction[com.pulumi.aws.docdb.inputs.GetOrderableDbInstancePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.docdb.outputs.GetOrderableDbInstanceResult] =
      val argsBuilder = com.pulumi.aws.docdb.inputs.GetOrderableDbInstancePlainArgs.builder
      com.pulumi.aws.docdb.DocdbFunctions.getOrderableDbInstancePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages an AWS DocDB (DocumentDB) Elastic Cluster. */
  inline def ElasticCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.docdb.ElasticClusterArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.docdb.ElasticClusterArgs.builder
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
    com.pulumi.aws.docdb.ElasticCluster(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a DocumentDB event subscription resource. */
  inline def EventSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.docdb.EventSubscriptionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.docdb.EventSubscriptionArgs.builder
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
    com.pulumi.aws.docdb.EventSubscription(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an DocumentDB Global Cluster. A global cluster consists of one primary region and up to five read-only secondary regions. You issue write operations directly to the primary cluster in the primary region and Amazon DocumentDB automatically replicates the data to the secondary regions using dedicated infrastructure.
   * 
   * More information about DocumentDB Global Clusters can be found in the [DocumentDB Developer Guide](https://docs.aws.amazon.com/documentdb/latest/developerguide/global-clusters.html).
   */
  inline def GlobalCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.docdb.GlobalClusterArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.docdb.GlobalClusterArgs.builder
    com.pulumi.aws.docdb.GlobalCluster(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an DocumentDB subnet group resource. */
  inline def SubnetGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.docdb.SubnetGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.docdb.SubnetGroupArgs.builder
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
    com.pulumi.aws.docdb.SubnetGroup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
