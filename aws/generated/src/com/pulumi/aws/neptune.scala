package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object neptune:
  /**
   * 
   */
  def EventSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.neptune.EventSubscriptionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.neptune.EventSubscriptionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.neptune.EventSubscription(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Neptune Parameter Group */
  def ParameterGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.neptune.ParameterGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.neptune.ParameterGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.neptune.ParameterGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an Neptune subnet group resource. */
  def SubnetGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.neptune.SubnetGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.neptune.SubnetGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.neptune.SubnetGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an Neptune Cluster Resource. A Cluster Resource defines attributes that are
   *  applied to the entire cluster of Neptune Cluster Instances.
   *  
   *  Changes to a Neptune Cluster can occur when you manually change a
   *  parameter, such as `backupRetentionPeriod`, and are reflected in the next maintenance
   *  window. Because of this, this provider may report a difference in its planning
   *  phase because a modification has not yet taken place. You can use the
   *  `applyImmediately` flag to instruct the service to apply the change immediately
   *  (see documentation below).
   */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.neptune.ClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.neptune.ClusterArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.neptune.Cluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.neptune.ParameterGroupArgs.Builder)
    /**
     * @param parameters A list of Neptune parameters to apply.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.neptune.inputs.ParameterGroupParameterArgs.Builder]*):
        com.pulumi.aws.neptune.ParameterGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.neptune.inputs.ParameterGroupParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  /**
   * Manages a Neptune Global Cluster. A global cluster consists of one primary region and up to five read-only secondary regions. You issue write operations directly to the primary cluster in the primary region and Amazon Neptune automatically replicates the data to the secondary regions using dedicated infrastructure.
   *  
   *  More information about Neptune Global Clusters can be found in the [Neptune User Guide](https://docs.aws.amazon.com/neptune/latest/userguide/neptune-global-database.html).
   */
  def GlobalCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.neptune.GlobalClusterArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.neptune.GlobalClusterArgs.builder
    
    com.pulumi.aws.neptune.GlobalCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.neptune.ClusterArgs.Builder)
    /**
     * @param serverlessV2ScalingConfiguration If set, create the Neptune cluster as a serverless one. See Serverless for example block attributes.
     * @return builder
     */
    def serverlessV2ScalingConfiguration(args: Endofunction[com.pulumi.aws.neptune.inputs.ClusterServerlessV2ScalingConfigurationArgs.Builder]):
        com.pulumi.aws.neptune.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.neptune.inputs.ClusterServerlessV2ScalingConfigurationArgs.builder
      builder.serverlessV2ScalingConfiguration(args(argsBuilder).build)

  type NeptuneFunctions = com.pulumi.aws.neptune.NeptuneFunctions
  object NeptuneFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.neptune.NeptuneFunctions.*
  extension (self: NeptuneFunctions.type)
    /**
     * Information about a Neptune engine version.
     *  
     *  &gt; **Note:** If AWS returns multiple matching engine versions, this data source will produce a `multiple Neptune engine versions` error. To avoid this, provide additional criteria to narrow the results or use the `latest` argument to select a single version. See the Argument Reference for details.
     */
    def getEngineVersion(args: Endofunction[com.pulumi.aws.neptune.inputs.GetEngineVersionArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.neptune.outputs.GetEngineVersionResult] =
      val argsBuilder = com.pulumi.aws.neptune.inputs.GetEngineVersionArgs.builder
      com.pulumi.aws.neptune.NeptuneFunctions.getEngineVersion(args(argsBuilder).build)

    /**
     * Information about a Neptune engine version.
     *  
     *  &gt; **Note:** If AWS returns multiple matching engine versions, this data source will produce a `multiple Neptune engine versions` error. To avoid this, provide additional criteria to narrow the results or use the `latest` argument to select a single version. See the Argument Reference for details.
     */
    def getEngineVersionPlain(args: Endofunction[com.pulumi.aws.neptune.inputs.GetEngineVersionPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.neptune.outputs.GetEngineVersionResult] =
      val argsBuilder = com.pulumi.aws.neptune.inputs.GetEngineVersionPlainArgs.builder
      com.pulumi.aws.neptune.NeptuneFunctions.getEngineVersionPlain(args(argsBuilder).build)

    /** Information about Neptune orderable DB instances. */
    def getOrderableDbInstance(args: Endofunction[com.pulumi.aws.neptune.inputs.GetOrderableDbInstanceArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.neptune.outputs.GetOrderableDbInstanceResult] =
      val argsBuilder = com.pulumi.aws.neptune.inputs.GetOrderableDbInstanceArgs.builder
      com.pulumi.aws.neptune.NeptuneFunctions.getOrderableDbInstance(args(argsBuilder).build)

    /** Information about Neptune orderable DB instances. */
    def getOrderableDbInstancePlain(args: Endofunction[com.pulumi.aws.neptune.inputs.GetOrderableDbInstancePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.neptune.outputs.GetOrderableDbInstanceResult] =
      val argsBuilder = com.pulumi.aws.neptune.inputs.GetOrderableDbInstancePlainArgs.builder
      com.pulumi.aws.neptune.NeptuneFunctions.getOrderableDbInstancePlain(args(argsBuilder).build)

  /** Manages a Neptune Cluster Parameter Group */
  def ClusterParameterGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.neptune.ClusterParameterGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.neptune.ClusterParameterGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.neptune.ClusterParameterGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.neptune.ClusterParameterGroupArgs.Builder)
    /**
     * @param parameters A list of neptune parameters to apply.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.neptune.inputs.ClusterParameterGroupParameterArgs.Builder]*):
        com.pulumi.aws.neptune.ClusterParameterGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.neptune.inputs.ClusterParameterGroupParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  /**
   * A Cluster Instance Resource defines attributes that are specific to a single instance in a Neptune Cluster.
   *  
   *  You can simply add neptune instances and Neptune manages the replication. You can use the count
   *  meta-parameter to make multiple instances and join them all to the same Neptune Cluster, or you may specify different Cluster Instance resources with various `instanceClass` sizes.
   */
  def ClusterInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.neptune.ClusterInstanceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.neptune.ClusterInstanceArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.neptune.ClusterInstance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an Neptune Cluster Endpoint Resource. */
  def ClusterEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.neptune.ClusterEndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.neptune.ClusterEndpointArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.neptune.ClusterEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Neptune database cluster snapshot. */
  def ClusterSnapshot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.neptune.ClusterSnapshotArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.neptune.ClusterSnapshotArgs.builder
    
    com.pulumi.aws.neptune.ClusterSnapshot(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.neptune.inputs.ClusterParameterGroupState.Builder)
    /**
     * @param parameters A list of neptune parameters to apply.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.neptune.inputs.ClusterParameterGroupParameterArgs.Builder]*):
        com.pulumi.aws.neptune.inputs.ClusterParameterGroupState.Builder =
      def argsBuilder = com.pulumi.aws.neptune.inputs.ClusterParameterGroupParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.neptune.inputs.ParameterGroupState.Builder)
    /**
     * @param parameters A list of Neptune parameters to apply.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.neptune.inputs.ParameterGroupParameterArgs.Builder]*):
        com.pulumi.aws.neptune.inputs.ParameterGroupState.Builder =
      def argsBuilder = com.pulumi.aws.neptune.inputs.ParameterGroupParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.neptune.inputs.GlobalClusterState.Builder)
    /**
     * @param globalClusterMembers Set of objects containing Global Cluster members.
     * @return builder
     */
    def globalClusterMembers(args: Endofunction[com.pulumi.aws.neptune.inputs.GlobalClusterGlobalClusterMemberArgs.Builder]*):
        com.pulumi.aws.neptune.inputs.GlobalClusterState.Builder =
      def argsBuilder = com.pulumi.aws.neptune.inputs.GlobalClusterGlobalClusterMemberArgs.builder
      builder.globalClusterMembers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.neptune.inputs.ClusterState.Builder)
    /**
     * @param serverlessV2ScalingConfiguration If set, create the Neptune cluster as a serverless one. See Serverless for example block attributes.
     * @return builder
     */
    def serverlessV2ScalingConfiguration(args: Endofunction[com.pulumi.aws.neptune.inputs.ClusterServerlessV2ScalingConfigurationArgs.Builder]):
        com.pulumi.aws.neptune.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.neptune.inputs.ClusterServerlessV2ScalingConfigurationArgs.builder
      builder.serverlessV2ScalingConfiguration(args(argsBuilder).build)
