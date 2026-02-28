package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object docdb:
  /** Provides a DocumentDB event subscription resource. */
  def EventSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.docdb.EventSubscriptionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.docdb.EventSubscriptionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.docdb.EventSubscription(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an DocumentDB subnet group resource. */
  def SubnetGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.docdb.SubnetGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.docdb.SubnetGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.docdb.SubnetGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a DocumentDB Cluster.
   *  
   *  Changes to a DocumentDB Cluster can occur when you manually change a
   *  parameter, such as `port`, and are reflected in the next maintenance
   *  window. Because of this, this provider may report a difference in its planning
   *  phase because a modification has not yet taken place. You can use the
   *  `applyImmediately` flag to instruct the service to apply the change immediately
   *  (see documentation below).
   *  
   *  &gt; **Note:** using `applyImmediately` can result in a brief downtime as the server reboots.
   */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.docdb.ClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.docdb.ClusterArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.docdb.Cluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an DocumentDB Global Cluster. A global cluster consists of one primary region and up to five read-only secondary regions. You issue write operations directly to the primary cluster in the primary region and Amazon DocumentDB automatically replicates the data to the secondary regions using dedicated infrastructure.
   *  
   *  More information about DocumentDB Global Clusters can be found in the [DocumentDB Developer Guide](https://docs.aws.amazon.com/documentdb/latest/developerguide/global-clusters.html).
   */
  def GlobalCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.docdb.GlobalClusterArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.docdb.GlobalClusterArgs.builder
    
    com.pulumi.aws.docdb.GlobalCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.docdb.ClusterArgs.Builder)
    /**
     * @param restoreToPointInTime A configuration block for restoring a DB instance to an arbitrary point in time. Requires the `identifier` argument to be set with the name of the new DB instance to be created. See Restore To Point In Time below for details.
     * @return builder
     */
    def restoreToPointInTime(args: Endofunction[com.pulumi.aws.docdb.inputs.ClusterRestoreToPointInTimeArgs.Builder]):
        com.pulumi.aws.docdb.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.docdb.inputs.ClusterRestoreToPointInTimeArgs.builder
      builder.restoreToPointInTime(args(argsBuilder).build)

    /**
     * @param serverlessV2ScalingConfiguration Scaling configuration of an Amazon DocumentDB Serverless cluster. See Serverless V2 Scaling Configuration below for details.
     * @return builder
     */
    def serverlessV2ScalingConfiguration(args: Endofunction[com.pulumi.aws.docdb.inputs.ClusterServerlessV2ScalingConfigurationArgs.Builder]):
        com.pulumi.aws.docdb.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.docdb.inputs.ClusterServerlessV2ScalingConfigurationArgs.builder
      builder.serverlessV2ScalingConfiguration(args(argsBuilder).build)

  type DocdbFunctions = com.pulumi.aws.docdb.DocdbFunctions
  object DocdbFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.docdb.DocdbFunctions.*
  extension (self: DocdbFunctions.type)
    /** Information about a DocumentDB engine version. */
    def getEngineVersion(args: Endofunction[com.pulumi.aws.docdb.inputs.GetEngineVersionArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.docdb.outputs.GetEngineVersionResult] =
      val argsBuilder = com.pulumi.aws.docdb.inputs.GetEngineVersionArgs.builder
      com.pulumi.aws.docdb.DocdbFunctions.getEngineVersion(args(argsBuilder).build)

    /** Information about a DocumentDB engine version. */
    def getEngineVersionPlain(args: Endofunction[com.pulumi.aws.docdb.inputs.GetEngineVersionPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.docdb.outputs.GetEngineVersionResult] =
      val argsBuilder = com.pulumi.aws.docdb.inputs.GetEngineVersionPlainArgs.builder
      com.pulumi.aws.docdb.DocdbFunctions.getEngineVersionPlain(args(argsBuilder).build)

    /** Information about DocumentDB orderable DB instances. */
    def getOrderableDbInstance(args: Endofunction[com.pulumi.aws.docdb.inputs.GetOrderableDbInstanceArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.docdb.outputs.GetOrderableDbInstanceResult] =
      val argsBuilder = com.pulumi.aws.docdb.inputs.GetOrderableDbInstanceArgs.builder
      com.pulumi.aws.docdb.DocdbFunctions.getOrderableDbInstance(args(argsBuilder).build)

    /** Information about DocumentDB orderable DB instances. */
    def getOrderableDbInstancePlain(args: Endofunction[com.pulumi.aws.docdb.inputs.GetOrderableDbInstancePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.docdb.outputs.GetOrderableDbInstanceResult] =
      val argsBuilder = com.pulumi.aws.docdb.inputs.GetOrderableDbInstancePlainArgs.builder
      com.pulumi.aws.docdb.DocdbFunctions.getOrderableDbInstancePlain(args(argsBuilder).build)

  /** Manages an AWS DocDB (DocumentDB) Elastic Cluster. */
  def ElasticCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.docdb.ElasticClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.docdb.ElasticClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.docdb.ElasticCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a DocumentDB Cluster Parameter Group */
  def ClusterParameterGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.docdb.ClusterParameterGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.docdb.ClusterParameterGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.docdb.ClusterParameterGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.docdb.ElasticClusterArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.docdb.inputs.ElasticClusterTimeoutsArgs.Builder]):
        com.pulumi.aws.docdb.ElasticClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.docdb.inputs.ElasticClusterTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.docdb.ClusterParameterGroupArgs.Builder)
    /**
     * @param parameters A list of DocumentDB parameters to apply. Setting parameters to system default values may show a difference on imported resources.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.docdb.inputs.ClusterParameterGroupParameterArgs.Builder]*):
        com.pulumi.aws.docdb.ClusterParameterGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.docdb.inputs.ClusterParameterGroupParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  /**
   * Provides an DocumentDB Cluster Resource Instance. A Cluster Instance Resource defines attributes that are specific to a single instance in a DocumentDB Cluster.
   *  
   *  You do not designate a primary and subsequent replicas. Instead, you simply add DocumentDB Instances and DocumentDB manages the replication. You can use the count meta-parameter to make multiple instances and join them all to the same DocumentDB Cluster, or you may specify different Cluster Instance resources with various `instanceClass` sizes.
   */
  def ClusterInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.docdb.ClusterInstanceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.docdb.ClusterInstanceArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.docdb.ClusterInstance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a DocumentDB database cluster snapshot for DocumentDB clusters. */
  def ClusterSnapshot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.docdb.ClusterSnapshotArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.docdb.ClusterSnapshotArgs.builder
    
    com.pulumi.aws.docdb.ClusterSnapshot(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.docdb.inputs.ClusterParameterGroupState.Builder)
    /**
     * @param parameters A list of DocumentDB parameters to apply. Setting parameters to system default values may show a difference on imported resources.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.docdb.inputs.ClusterParameterGroupParameterArgs.Builder]*):
        com.pulumi.aws.docdb.inputs.ClusterParameterGroupState.Builder =
      def argsBuilder = com.pulumi.aws.docdb.inputs.ClusterParameterGroupParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.docdb.inputs.GlobalClusterState.Builder)
    /**
     * @param globalClusterMembers Set of objects containing Global Cluster members.
     * @return builder
     */
    def globalClusterMembers(args: Endofunction[com.pulumi.aws.docdb.inputs.GlobalClusterGlobalClusterMemberArgs.Builder]*):
        com.pulumi.aws.docdb.inputs.GlobalClusterState.Builder =
      def argsBuilder = com.pulumi.aws.docdb.inputs.GlobalClusterGlobalClusterMemberArgs.builder
      builder.globalClusterMembers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.docdb.inputs.ClusterState.Builder)
    def masterUserSecrets(args: Endofunction[com.pulumi.aws.docdb.inputs.ClusterMasterUserSecretArgs.Builder]*):
        com.pulumi.aws.docdb.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.aws.docdb.inputs.ClusterMasterUserSecretArgs.builder
      builder.masterUserSecrets(args.map(_(argsBuilder).build)*)

    /**
     * @param restoreToPointInTime A configuration block for restoring a DB instance to an arbitrary point in time. Requires the `identifier` argument to be set with the name of the new DB instance to be created. See Restore To Point In Time below for details.
     * @return builder
     */
    def restoreToPointInTime(args: Endofunction[com.pulumi.aws.docdb.inputs.ClusterRestoreToPointInTimeArgs.Builder]):
        com.pulumi.aws.docdb.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.docdb.inputs.ClusterRestoreToPointInTimeArgs.builder
      builder.restoreToPointInTime(args(argsBuilder).build)

    /**
     * @param serverlessV2ScalingConfiguration Scaling configuration of an Amazon DocumentDB Serverless cluster. See Serverless V2 Scaling Configuration below for details.
     * @return builder
     */
    def serverlessV2ScalingConfiguration(args: Endofunction[com.pulumi.aws.docdb.inputs.ClusterServerlessV2ScalingConfigurationArgs.Builder]):
        com.pulumi.aws.docdb.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.docdb.inputs.ClusterServerlessV2ScalingConfigurationArgs.builder
      builder.serverlessV2ScalingConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.docdb.inputs.ElasticClusterState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.docdb.inputs.ElasticClusterTimeoutsArgs.Builder]):
        com.pulumi.aws.docdb.inputs.ElasticClusterState.Builder =
      val argsBuilder = com.pulumi.aws.docdb.inputs.ElasticClusterTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
