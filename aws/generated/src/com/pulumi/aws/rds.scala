package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object rds:
  /** Manages an RDS database instance snapshot copy. For managing RDS database cluster snapshots, see the `aws.rds.ClusterSnapshot` resource. */
  def SnapshotCopy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.rds.SnapshotCopyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.rds.SnapshotCopyArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.rds.SnapshotCopy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a DB event subscription resource. */
  def EventSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.rds.EventSubscriptionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.rds.EventSubscriptionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.rds.EventSubscription(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an Amazon Aurora Limitless Database DB shard group */
  def ShardGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.rds.ShardGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.rds.ShardGroupArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.rds.ShardGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.rds.InstanceDesiredStateArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.rds.inputs.InstanceDesiredStateTimeoutsArgs.Builder]):
        com.pulumi.aws.rds.InstanceDesiredStateArgs.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.InstanceDesiredStateTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Provides an custom engine version (CEV) resource for Amazon RDS Custom. For additional information, see [Working with CEVs for RDS Custom for Oracle](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-cev.html) and [Working with CEVs for RDS Custom for SQL Server](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-cev-sqlserver.html) in the the [RDS User Guide](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Welcome.html). */
  def CustomDbEngineVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.rds.CustomDbEngineVersionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.rds.CustomDbEngineVersionArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.rds.CustomDbEngineVersion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS RDS (Relational Database) zero-ETL integration. You can refer to the [User Guide](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/zero-etl.setting-up.html). */
  def Integration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.rds.IntegrationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.rds.IntegrationArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.rds.Integration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.rds.ShardGroupArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.rds.inputs.ShardGroupTimeoutsArgs.Builder]):
        com.pulumi.aws.rds.ShardGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.ShardGroupTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  type RdsFunctions = com.pulumi.aws.rds.RdsFunctions
  object RdsFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.rds.RdsFunctions.*
  extension (self: RdsFunctions.type)
    /** Information about an RDS Certificate. */
    def getCertificate(args: Endofunction[com.pulumi.aws.rds.inputs.GetCertificateArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.rds.outputs.GetCertificateResult] =
      val argsBuilder = com.pulumi.aws.rds.inputs.GetCertificateArgs.builder
      com.pulumi.aws.rds.RdsFunctions.getCertificate(args(argsBuilder).build)

    /** Information about an RDS Certificate. */
    def getCertificatePlain(args: Endofunction[com.pulumi.aws.rds.inputs.GetCertificatePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.rds.outputs.GetCertificateResult] =
      val argsBuilder = com.pulumi.aws.rds.inputs.GetCertificatePlainArgs.builder
      com.pulumi.aws.rds.RdsFunctions.getCertificatePlain(args(argsBuilder).build)

    /** Provides information about an RDS cluster. */
    def getCluster(args: Endofunction[com.pulumi.aws.rds.inputs.GetClusterArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.rds.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.aws.rds.inputs.GetClusterArgs.builder
      com.pulumi.aws.rds.RdsFunctions.getCluster(args(argsBuilder).build)

    /** Provides information about an RDS cluster. */
    def getClusterPlain(args: Endofunction[com.pulumi.aws.rds.inputs.GetClusterPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.rds.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.aws.rds.inputs.GetClusterPlainArgs.builder
      com.pulumi.aws.rds.RdsFunctions.getClusterPlain(args(argsBuilder).build)

    /** Information about an RDS cluster parameter group. */
    def getClusterParameterGroup(args: Endofunction[com.pulumi.aws.rds.inputs.GetClusterParameterGroupArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.rds.outputs.GetClusterParameterGroupResult] =
      val argsBuilder = com.pulumi.aws.rds.inputs.GetClusterParameterGroupArgs.builder
      com.pulumi.aws.rds.RdsFunctions.getClusterParameterGroup(args(argsBuilder).build)

    /** Information about an RDS cluster parameter group. */
    def getClusterParameterGroupPlain(args: Endofunction[com.pulumi.aws.rds.inputs.GetClusterParameterGroupPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.rds.outputs.GetClusterParameterGroupResult] =
      val argsBuilder = com.pulumi.aws.rds.inputs.GetClusterParameterGroupPlainArgs.builder
      com.pulumi.aws.rds.RdsFunctions.getClusterParameterGroupPlain(args(argsBuilder).build)

    /**
     * Use this data source to get information about a DB Cluster Snapshot for use when provisioning DB clusters.
     *  
     *  &gt; **NOTE:** This data source does not apply to snapshots created on DB Instances.
     *  See the `aws.rds.Snapshot` data source for DB Instance snapshots.
     */
    def getClusterSnapshot(args: Endofunction[com.pulumi.aws.rds.inputs.GetClusterSnapshotArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.rds.outputs.GetClusterSnapshotResult] =
      val argsBuilder = com.pulumi.aws.rds.inputs.GetClusterSnapshotArgs.builder
      com.pulumi.aws.rds.RdsFunctions.getClusterSnapshot(args(argsBuilder).build)

    /**
     * Use this data source to get information about a DB Cluster Snapshot for use when provisioning DB clusters.
     *  
     *  &gt; **NOTE:** This data source does not apply to snapshots created on DB Instances.
     *  See the `aws.rds.Snapshot` data source for DB Instance snapshots.
     */
    def getClusterSnapshotPlain(args: Endofunction[com.pulumi.aws.rds.inputs.GetClusterSnapshotPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.rds.outputs.GetClusterSnapshotResult] =
      val argsBuilder = com.pulumi.aws.rds.inputs.GetClusterSnapshotPlainArgs.builder
      com.pulumi.aws.rds.RdsFunctions.getClusterSnapshotPlain(args(argsBuilder).build)

    /** Data source for managing an AWS RDS (Relational Database) Clusters. */
    def getClusters(args: Endofunction[com.pulumi.aws.rds.inputs.GetClustersArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.rds.outputs.GetClustersResult] =
      val argsBuilder = com.pulumi.aws.rds.inputs.GetClustersArgs.builder
      com.pulumi.aws.rds.RdsFunctions.getClusters(args(argsBuilder).build)

    /** Data source for managing an AWS RDS (Relational Database) Clusters. */
    def getClustersPlain(args: Endofunction[com.pulumi.aws.rds.inputs.GetClustersPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.rds.outputs.GetClustersResult] =
      val argsBuilder = com.pulumi.aws.rds.inputs.GetClustersPlainArgs.builder
      com.pulumi.aws.rds.RdsFunctions.getClustersPlain(args(argsBuilder).build)

    /** Information about an RDS engine version. */
    def getEngineVersion(args: Endofunction[com.pulumi.aws.rds.inputs.GetEngineVersionArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.rds.outputs.GetEngineVersionResult] =
      val argsBuilder = com.pulumi.aws.rds.inputs.GetEngineVersionArgs.builder
      com.pulumi.aws.rds.RdsFunctions.getEngineVersion(args(argsBuilder).build)

    /** Information about an RDS engine version. */
    def getEngineVersionPlain(args: Endofunction[com.pulumi.aws.rds.inputs.GetEngineVersionPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.rds.outputs.GetEngineVersionResult] =
      val argsBuilder = com.pulumi.aws.rds.inputs.GetEngineVersionPlainArgs.builder
      com.pulumi.aws.rds.RdsFunctions.getEngineVersionPlain(args(argsBuilder).build)

    /**
     * 
     */
    def getEventCategories(args: Endofunction[com.pulumi.aws.rds.inputs.GetEventCategoriesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.rds.outputs.GetEventCategoriesResult] =
      val argsBuilder = com.pulumi.aws.rds.inputs.GetEventCategoriesArgs.builder
      com.pulumi.aws.rds.RdsFunctions.getEventCategories(args(argsBuilder).build)

    /**
     * 
     */
    def getEventCategoriesPlain(args: Endofunction[com.pulumi.aws.rds.inputs.GetEventCategoriesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.rds.outputs.GetEventCategoriesResult] =
      val argsBuilder = com.pulumi.aws.rds.inputs.GetEventCategoriesPlainArgs.builder
      com.pulumi.aws.rds.RdsFunctions.getEventCategoriesPlain(args(argsBuilder).build)

    /** Data source for managing an AWS RDS (Relational Database) Global Cluster. */
    def getGlobalCluster(args: Endofunction[com.pulumi.aws.rds.inputs.GetGlobalClusterArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.rds.outputs.GetGlobalClusterResult] =
      val argsBuilder = com.pulumi.aws.rds.inputs.GetGlobalClusterArgs.builder
      com.pulumi.aws.rds.RdsFunctions.getGlobalCluster(args(argsBuilder).build)

    /** Data source for managing an AWS RDS (Relational Database) Global Cluster. */
    def getGlobalClusterPlain(args: Endofunction[com.pulumi.aws.rds.inputs.GetGlobalClusterPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.rds.outputs.GetGlobalClusterResult] =
      val argsBuilder = com.pulumi.aws.rds.inputs.GetGlobalClusterPlainArgs.builder
      com.pulumi.aws.rds.RdsFunctions.getGlobalClusterPlain(args(argsBuilder).build)

    /** Use this data source to get information about an RDS instance */
    def getInstance(args: Endofunction[com.pulumi.aws.rds.inputs.GetInstanceArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.rds.outputs.GetInstanceResult] =
      val argsBuilder = com.pulumi.aws.rds.inputs.GetInstanceArgs.builder
      com.pulumi.aws.rds.RdsFunctions.getInstance(args(argsBuilder).build)

    /** Use this data source to get information about an RDS instance */
    def getInstancePlain(args: Endofunction[com.pulumi.aws.rds.inputs.GetInstancePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.rds.outputs.GetInstanceResult] =
      val argsBuilder = com.pulumi.aws.rds.inputs.GetInstancePlainArgs.builder
      com.pulumi.aws.rds.RdsFunctions.getInstancePlain(args(argsBuilder).build)

    /** Data source for listing RDS Database Instances. */
    def getInstances(args: Endofunction[com.pulumi.aws.rds.inputs.GetInstancesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.rds.outputs.GetInstancesResult] =
      val argsBuilder = com.pulumi.aws.rds.inputs.GetInstancesArgs.builder
      com.pulumi.aws.rds.RdsFunctions.getInstances(args(argsBuilder).build)

    /** Data source for listing RDS Database Instances. */
    def getInstancesPlain(args: Endofunction[com.pulumi.aws.rds.inputs.GetInstancesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.rds.outputs.GetInstancesResult] =
      val argsBuilder = com.pulumi.aws.rds.inputs.GetInstancesPlainArgs.builder
      com.pulumi.aws.rds.RdsFunctions.getInstancesPlain(args(argsBuilder).build)

    /** Information about RDS orderable DB instances and valid parameter combinations. */
    def getOrderableDbInstance(args: Endofunction[com.pulumi.aws.rds.inputs.GetOrderableDbInstanceArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.rds.outputs.GetOrderableDbInstanceResult] =
      val argsBuilder = com.pulumi.aws.rds.inputs.GetOrderableDbInstanceArgs.builder
      com.pulumi.aws.rds.RdsFunctions.getOrderableDbInstance(args(argsBuilder).build)

    /** Information about RDS orderable DB instances and valid parameter combinations. */
    def getOrderableDbInstancePlain(args: Endofunction[com.pulumi.aws.rds.inputs.GetOrderableDbInstancePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.rds.outputs.GetOrderableDbInstanceResult] =
      val argsBuilder = com.pulumi.aws.rds.inputs.GetOrderableDbInstancePlainArgs.builder
      com.pulumi.aws.rds.RdsFunctions.getOrderableDbInstancePlain(args(argsBuilder).build)

    /** Information about a database parameter group. */
    def getParameterGroup(args: Endofunction[com.pulumi.aws.rds.inputs.GetParameterGroupArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.rds.outputs.GetParameterGroupResult] =
      val argsBuilder = com.pulumi.aws.rds.inputs.GetParameterGroupArgs.builder
      com.pulumi.aws.rds.RdsFunctions.getParameterGroup(args(argsBuilder).build)

    /** Information about a database parameter group. */
    def getParameterGroupPlain(args: Endofunction[com.pulumi.aws.rds.inputs.GetParameterGroupPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.rds.outputs.GetParameterGroupResult] =
      val argsBuilder = com.pulumi.aws.rds.inputs.GetParameterGroupPlainArgs.builder
      com.pulumi.aws.rds.RdsFunctions.getParameterGroupPlain(args(argsBuilder).build)

    /** Use this data source to get information about a DB Proxy. */
    def getProxy(args: Endofunction[com.pulumi.aws.rds.inputs.GetProxyArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.rds.outputs.GetProxyResult] =
      val argsBuilder = com.pulumi.aws.rds.inputs.GetProxyArgs.builder
      com.pulumi.aws.rds.RdsFunctions.getProxy(args(argsBuilder).build)

    /** Use this data source to get information about a DB Proxy. */
    def getProxyPlain(args: Endofunction[com.pulumi.aws.rds.inputs.GetProxyPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.rds.outputs.GetProxyResult] =
      val argsBuilder = com.pulumi.aws.rds.inputs.GetProxyPlainArgs.builder
      com.pulumi.aws.rds.RdsFunctions.getProxyPlain(args(argsBuilder).build)

    /** Information about a single RDS Reserved Instance Offering. */
    def getReservedInstanceOffering(args: Endofunction[com.pulumi.aws.rds.inputs.GetReservedInstanceOfferingArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.rds.outputs.GetReservedInstanceOfferingResult] =
      val argsBuilder = com.pulumi.aws.rds.inputs.GetReservedInstanceOfferingArgs.builder
      com.pulumi.aws.rds.RdsFunctions.getReservedInstanceOffering(args(argsBuilder).build)

    /** Information about a single RDS Reserved Instance Offering. */
    def getReservedInstanceOfferingPlain(args: Endofunction[com.pulumi.aws.rds.inputs.GetReservedInstanceOfferingPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.rds.outputs.GetReservedInstanceOfferingResult] =
      val argsBuilder = com.pulumi.aws.rds.inputs.GetReservedInstanceOfferingPlainArgs.builder
      com.pulumi.aws.rds.RdsFunctions.getReservedInstanceOfferingPlain(args(argsBuilder).build)

    /**
     * Use this data source to get information about a DB Snapshot for use when provisioning DB instances
     *  
     *  &gt; **NOTE:** This data source does not apply to snapshots created on Aurora DB clusters.
     *  See the `aws.rds.ClusterSnapshot` data source for DB Cluster snapshots.
     */
    def getSnapshot(args: Endofunction[com.pulumi.aws.rds.inputs.GetSnapshotArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.rds.outputs.GetSnapshotResult] =
      val argsBuilder = com.pulumi.aws.rds.inputs.GetSnapshotArgs.builder
      com.pulumi.aws.rds.RdsFunctions.getSnapshot(args(argsBuilder).build)

    /**
     * Use this data source to get information about a DB Snapshot for use when provisioning DB instances
     *  
     *  &gt; **NOTE:** This data source does not apply to snapshots created on Aurora DB clusters.
     *  See the `aws.rds.ClusterSnapshot` data source for DB Cluster snapshots.
     */
    def getSnapshotPlain(args: Endofunction[com.pulumi.aws.rds.inputs.GetSnapshotPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.rds.outputs.GetSnapshotResult] =
      val argsBuilder = com.pulumi.aws.rds.inputs.GetSnapshotPlainArgs.builder
      com.pulumi.aws.rds.RdsFunctions.getSnapshotPlain(args(argsBuilder).build)

    /** Use this data source to get information about an RDS subnet group. */
    def getSubnetGroup(args: Endofunction[com.pulumi.aws.rds.inputs.GetSubnetGroupArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.rds.outputs.GetSubnetGroupResult] =
      val argsBuilder = com.pulumi.aws.rds.inputs.GetSubnetGroupArgs.builder
      com.pulumi.aws.rds.RdsFunctions.getSubnetGroup(args(argsBuilder).build)

    /** Use this data source to get information about an RDS subnet group. */
    def getSubnetGroupPlain(args: Endofunction[com.pulumi.aws.rds.inputs.GetSubnetGroupPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.rds.outputs.GetSubnetGroupResult] =
      val argsBuilder = com.pulumi.aws.rds.inputs.GetSubnetGroupPlainArgs.builder
      com.pulumi.aws.rds.RdsFunctions.getSubnetGroupPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.rds.ProxyArgs.Builder)
    /**
     * @param auths Configuration block(s) with authorization mechanisms to connect to the associated instances or clusters. Required when `defaultAuthScheme` is `NONE` or unspecified. Described below.
     * @return builder
     */
    def auths(args: Endofunction[com.pulumi.aws.rds.inputs.ProxyAuthArgs.Builder]*):
        com.pulumi.aws.rds.ProxyArgs.Builder =
      def argsBuilder = com.pulumi.aws.rds.inputs.ProxyAuthArgs.builder
      builder.auths(args.map(_(argsBuilder).build)*)

  /**
   * ## Import
   *  
   *  Using `pulumi import`, import DB Parameter groups using the `name`. For example:
   *  
   *  ```sh
   *  $ pulumi import aws:rds/parameterGroup:ParameterGroup rds_pg rds-pg
   *  ```
   */
  def ParameterGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.rds.ParameterGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.rds.ParameterGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.rds.ParameterGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.rds.InstanceArgs.Builder)
    /**
     * @param blueGreenUpdate Enables low-downtime updates using [RDS Blue/Green deployments][blue-green].
     *  See `blueGreenUpdate` below.
     * @return builder
     */
    def blueGreenUpdate(args: Endofunction[com.pulumi.aws.rds.inputs.InstanceBlueGreenUpdateArgs.Builder]):
        com.pulumi.aws.rds.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.InstanceBlueGreenUpdateArgs.builder
      builder.blueGreenUpdate(args(argsBuilder).build)

    /**
     * @param restoreToPointInTime A configuration block for restoring a DB instance to an arbitrary point in time.
     *  Requires the `identifier` argument to be set with the name of the new DB instance to be created.
     *  See Restore To Point In Time below for details.
     * @return builder
     */
    def restoreToPointInTime(args: Endofunction[com.pulumi.aws.rds.inputs.InstanceRestoreToPointInTimeArgs.Builder]):
        com.pulumi.aws.rds.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.InstanceRestoreToPointInTimeArgs.builder
      builder.restoreToPointInTime(args(argsBuilder).build)

    /**
     * @param s3Import Restore from a Percona Xtrabackup in S3.  See [Importing Data into an Amazon RDS MySQL DB Instance](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/MySQL.Procedural.Importing.html)
     * @return builder
     */
    def s3Import(args: Endofunction[com.pulumi.aws.rds.inputs.InstanceS3ImportArgs.Builder]):
        com.pulumi.aws.rds.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.InstanceS3ImportArgs.builder
      builder.s3Import(args(argsBuilder).build)

  /** Provides an RDS DB subnet group resource. */
  def SubnetGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.rds.SubnetGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.rds.SubnetGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.rds.SubnetGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.rds.OptionGroupArgs.Builder)
    /**
     * @param options The options to apply. See `option` Block below for more details.
     * @return builder
     */
    def options(args: Endofunction[com.pulumi.aws.rds.inputs.OptionGroupOptionArgs.Builder]*):
        com.pulumi.aws.rds.OptionGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.rds.inputs.OptionGroupOptionArgs.builder
      builder.options(args.map(_(argsBuilder).build)*)

  /**
   * Provides a resource to manage an RDS DB proxy default target group resource.
   *  
   *  The `aws.rds.ProxyDefaultTargetGroup` behaves differently from normal resources, in that the provider does not _create_ or _destroy_ this resource, since it implicitly exists as part of an RDS DB Proxy. On the provider resource creation it is automatically imported and on resource destruction, the provider performs no actions in RDS.
   */
  def ProxyDefaultTargetGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.rds.ProxyDefaultTargetGroupArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.rds.ProxyDefaultTargetGroupArgs.builder
    
    com.pulumi.aws.rds.ProxyDefaultTargetGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an RDS DB proxy endpoint resource. For additional information, see the [RDS User Guide](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-proxy-endpoints.html). */
  def ProxyEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.rds.ProxyEndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.rds.ProxyEndpointArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.rds.ProxyEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.rds.ClusterSnapshotCopyArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.rds.inputs.ClusterSnapshotCopyTimeoutsArgs.Builder]):
        com.pulumi.aws.rds.ClusterSnapshotCopyArgs.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.ClusterSnapshotCopyTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Resource for managing an AWS RDS (Relational Database) Export Task. */
  def ExportTask(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.rds.ExportTaskArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.rds.ExportTaskArgs.builder
    
    com.pulumi.aws.rds.ExportTask(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an RDS database cluster snapshot copy. For managing RDS database instance snapshot copies, see the `aws.rds.SnapshotCopy` resource. */
  def ClusterSnapshotCopy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.rds.ClusterSnapshotCopyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.rds.ClusterSnapshotCopyArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.rds.ClusterSnapshotCopy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a [RDS Aurora Cluster](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_Aurora.html) or a [RDS Multi-AZ DB Cluster](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/multi-az-db-clusters-concepts.html). To manage cluster instances that inherit configuration from the cluster (when not running the cluster in `serverless` engine mode), see the `aws.rds.ClusterInstance` resource. To manage non-Aurora DB instances (e.g., MySQL, PostgreSQL, SQL Server, etc.), see the `aws.rds.Instance` resource.
   *  
   *  For information on the difference between the available Aurora MySQL engines see [Comparison between Aurora MySQL 1 and Aurora MySQL 2](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AuroraMySQL.Updates.20180206.html) in the Amazon RDS User Guide.
   *  
   *  Changes to an RDS Cluster can occur when you manually change a parameter, such as `port`, and are reflected in the next maintenance window. Because of this, this provider may report a difference in its planning phase because a modification has not yet taken place. You can use the `applyImmediately` flag to instruct the service to apply the change immediately (see documentation below).
   *  
   *  &gt; **Note:** Multi-AZ DB clusters are supported only for the MySQL and PostgreSQL DB engines.
   *  
   *  &gt; **Note:** `caCertificateIdentifier` is only supported for Multi-AZ DB clusters.
   *  
   *  &gt; **Note:** using `applyImmediately` can result in a brief downtime as the server reboots. See the AWS Docs on [RDS Maintenance](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html) for more information.
   *  
   *  &gt; **Note:** All arguments including the username and password will be stored in the raw state as plain-text.
   *  **NOTE on RDS Clusters and RDS Cluster Role Associations:** Pulumi provides both a standalone RDS Cluster Role Association - (an association between an RDS Cluster and a single IAM Role) and an RDS Cluster resource with `iamRoles` attributes. Use one resource or the other to associate IAM Roles and RDS Clusters. Not doing so will cause a conflict of associations and will result in the association being overwritten.
   */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.rds.ClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.rds.ClusterArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.rds.Cluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * 
   */
  def Certificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.rds.CertificateArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.rds.CertificateArgs.builder
    
    com.pulumi.aws.rds.Certificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Resource for managing an AWS RDS (Relational Database) RDS Instance State.
   *  
   *  &gt; Destruction of this resource is a no-op and **will not** modify the instance state
   */
  def InstanceDesiredState(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.rds.InstanceDesiredStateArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.rds.InstanceDesiredStateArgs.builder
    
    com.pulumi.aws.rds.InstanceDesiredState(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an RDS DB proxy target resource. */
  def ProxyTarget(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.rds.ProxyTargetArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.rds.ProxyTargetArgs.builder
    
    com.pulumi.aws.rds.ProxyTarget(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.rds.ParameterGroupArgs.Builder)
    /**
     * @param parameters The DB parameters to apply. See `parameter` Block below for more details. Note that parameters may differ from a family to an other. Full list of all parameters can be discovered via [`aws rds describe-db-parameters`](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-parameters.html) after initial creation of the group.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.rds.inputs.ParameterGroupParameterArgs.Builder]*):
        com.pulumi.aws.rds.ParameterGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.rds.inputs.ParameterGroupParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  /**
   * Manages an RDS Global Cluster, which is an Aurora global database spread across multiple regions. The global database contains a single primary cluster with read-write capability, and a read-only secondary cluster that receives data from the primary cluster through high-speed replication performed by the Aurora storage subsystem.
   *  
   *  More information about Aurora global databases can be found in the [Aurora User Guide](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database.html#aurora-global-database-creating).
   */
  def GlobalCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.rds.GlobalClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.rds.GlobalClusterArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.rds.GlobalCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.rds.ClusterArgs.Builder)
    /**
     * @param restoreToPointInTime Nested attribute for [point in time restore](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-pitr.html). More details below.
     * @return builder
     */
    def restoreToPointInTime(args: Endofunction[com.pulumi.aws.rds.inputs.ClusterRestoreToPointInTimeArgs.Builder]):
        com.pulumi.aws.rds.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.ClusterRestoreToPointInTimeArgs.builder
      builder.restoreToPointInTime(args(argsBuilder).build)

    def s3Import(args: Endofunction[com.pulumi.aws.rds.inputs.ClusterS3ImportArgs.Builder]):
        com.pulumi.aws.rds.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.ClusterS3ImportArgs.builder
      builder.s3Import(args(argsBuilder).build)

    /**
     * @param scalingConfiguration Nested attribute with scaling properties. Only valid when `engineMode` is set to `serverless`. More details below.
     * @return builder
     */
    def scalingConfiguration(args: Endofunction[com.pulumi.aws.rds.inputs.ClusterScalingConfigurationArgs.Builder]):
        com.pulumi.aws.rds.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.ClusterScalingConfigurationArgs.builder
      builder.scalingConfiguration(args(argsBuilder).build)

    /**
     * @param serverlessv2ScalingConfiguration Nested attribute with scaling properties for ServerlessV2. Only valid when `engineMode` is set to `provisioned`. More details below.
     * @return builder
     */
    def serverlessv2ScalingConfiguration(args: Endofunction[com.pulumi.aws.rds.inputs.ClusterServerlessv2ScalingConfigurationArgs.Builder]):
        com.pulumi.aws.rds.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.ClusterServerlessv2ScalingConfigurationArgs.builder
      builder.serverlessv2ScalingConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.rds.ExportTaskArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.rds.inputs.ExportTaskTimeoutsArgs.Builder]):
        com.pulumi.aws.rds.ExportTaskArgs.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.ExportTaskTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Manages an RDS database instance snapshot. For managing RDS database cluster snapshots, see the `aws.rds.ClusterSnapshot` resource. */
  def Snapshot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.rds.SnapshotArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.rds.SnapshotArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.rds.Snapshot(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an RDS DB option group resource. Documentation of the available options for various RDS engines can be found at:
   *  
   *  * [MariaDB Options](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.MariaDB.Options.html)
   *  * [Microsoft SQL Server Options](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.SQLServer.Options.html)
   *  * [MySQL Options](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.MySQL.Options.html)
   *  * [Oracle Options](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.Oracle.Options.html)
   */
  def OptionGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.rds.OptionGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.rds.OptionGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.rds.OptionGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manage cross-region replication of automated backups to a different AWS Region. Documentation for cross-region automated backup replication can be found at:
   *  
   *  * [Replicating automated backups to another AWS Region](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_ReplicateBackups.html)
   *  
   *  &gt; **Note:** This resource has to be created in the destination region.
   */
  def InstanceAutomatedBackupsReplication(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.rds.InstanceAutomatedBackupsReplicationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.rds.InstanceAutomatedBackupsReplicationArgs.builder
    
    com.pulumi.aws.rds.InstanceAutomatedBackupsReplication(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.rds.ProxyDefaultTargetGroupArgs.Builder)
    /**
     * @param connectionPoolConfig The settings that determine the size and behavior of the connection pool for the target group.
     * @return builder
     */
    def connectionPoolConfig(args: Endofunction[com.pulumi.aws.rds.inputs.ProxyDefaultTargetGroupConnectionPoolConfigArgs.Builder]):
        com.pulumi.aws.rds.ProxyDefaultTargetGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.ProxyDefaultTargetGroupConnectionPoolConfigArgs.builder
      builder.connectionPoolConfig(args(argsBuilder).build)

  /**
   * Provides an RDS DB cluster parameter group resource. Documentation of the available parameters for various Aurora engines can be found at:
   *  
   *  * [Aurora MySQL Parameters](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AuroraMySQL.Reference.html)
   *  * [Aurora PostgreSQL Parameters](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AuroraPostgreSQL.Reference.html)
   */
  def ClusterParameterGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.rds.ClusterParameterGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.rds.ClusterParameterGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.rds.ClusterParameterGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an RDS instance resource.  A DB instance is an isolated database
   *  environment in the cloud.  A DB instance can contain multiple user-created
   *  databases.
   *  
   *  Changes to a DB instance can occur when you manually change a parameter, such as
   *  `allocatedStorage`, and are reflected in the next maintenance window. Because
   *  of this, this provider may report a difference in its planning phase because a
   *  modification has not yet taken place. You can use the `applyImmediately` flag
   *  to instruct the service to apply the change immediately (see documentation
   *  below).
   *  
   *  When upgrading the major version of an engine, `allowMajorVersionUpgrade` must be set to `true`.
   *  
   *  &gt; **Note:** using `applyImmediately` can result in a brief downtime as the server reboots.
   *  See the AWS Docs on [RDS Instance Maintenance][instance-maintenance] for more information.
   *  
   *  &gt; **Note:** All arguments including the username and password will be stored in the raw state as plain-text.
   *  Read more about sensitive data instate.
   *  
   *  ## RDS Instance Class Types
   *  
   *  Amazon RDS supports instance classes for the following use cases: General-purpose, Memory-optimized, Burstable Performance, and Optimized-reads.
   *  For more information please read the AWS RDS documentation about [DB Instance Class Types](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html)
   *  
   *  ## Low-Downtime Updates
   *  
   *  By default, RDS applies updates to DB Instances in-place, which can lead to service interruptions.
   *  Low-downtime updates minimize service interruptions by performing the updates with an [RDS Blue/Green deployment][blue-green] and switching over the instances when complete.
   *  
   *  Low-downtime updates are only available for DB Instances using MySQL, MariaDB and PostgreSQL,
   *  as other engines are not supported by RDS Blue/Green deployments.
   *  They cannot be used with DB Instances with replicas.
   *  
   *  Backups must be enabled to use low-downtime updates.
   *  
   *  Enable low-downtime updates by setting `blue_green_update.enabled` to `true`.
   */
  def Instance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.rds.InstanceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.rds.InstanceArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.rds.Instance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * ## Import
   *  
   *  Using `pulumi import`, import DB proxies using the `name`. For example:
   *  
   *  ```sh
   *  $ pulumi import aws:rds/proxy:Proxy example example
   *  ```
   */
  def Proxy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.rds.ProxyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.rds.ProxyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.rds.Proxy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an RDS DB Instance association with an IAM Role. Example use cases:
   *  
   *  * [Amazon RDS Oracle integration with Amazon S3](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-s3-integration.html)
   *  * [Importing Amazon S3 Data into an RDS PostgreSQL DB Instance](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PostgreSQL.S3Import.html)
   *  
   *  &gt; To manage the RDS DB Instance IAM Role for [Enhanced Monitoring](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html), see the `aws.rds.Instance` resource `monitoringRoleArn` argument instead.
   *  
   *  ## Import
   *  
   *  Using `pulumi import`, import `aws_db_instance_role_association` using the DB Instance Identifier and IAM Role ARN separated by a comma (`,`). For example:
   *  
   *  ```sh
   *  $ pulumi import aws:rds/roleAssociation:RoleAssociation example my-db-instance,arn:aws:iam::123456789012:role/my-role
   *  ```
   */
  def RoleAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.rds.RoleAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.rds.RoleAssociationArgs.builder
    
    com.pulumi.aws.rds.RoleAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.rds.IntegrationArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.rds.inputs.IntegrationTimeoutsArgs.Builder]):
        com.pulumi.aws.rds.IntegrationArgs.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.IntegrationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.rds.ClusterParameterGroupArgs.Builder)
    /**
     * @param parameters A list of DB parameters to apply. Note that parameters may differ from a family to an other. Full list of all parameters can be discovered via [`aws rds describe-db-cluster-parameters`](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-cluster-parameters.html) after initial creation of the group.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.rds.inputs.ClusterParameterGroupParameterArgs.Builder]*):
        com.pulumi.aws.rds.ClusterParameterGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.rds.inputs.ClusterParameterGroupParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  /**
   * Provides an RDS Cluster Instance Resource. A Cluster Instance Resource defines
   *  attributes that are specific to a single instance in a RDS Cluster,
   *  specifically running Amazon Aurora.
   *  
   *  Unlike other RDS resources that support replication, with Amazon Aurora you do
   *  not designate a primary and subsequent replicas. Instead, you simply add RDS
   *  Instances and Aurora manages the replication. You can use the [count][5]
   *  meta-parameter to make multiple instances and join them all to the same RDS
   *  Cluster, or you may specify different Cluster Instance resources with various
   *  `instanceClass` sizes.
   *  
   *  For more information on Amazon Aurora, see [Aurora on Amazon RDS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html) in the Amazon RDS User Guide.
   *  
   *  &gt; **NOTE:** Deletion Protection from the RDS service can only be enabled at the cluster level, not for individual cluster instances. You can still add the [`protect` CustomResourceOption](https://www.pulumi.com/docs/intro/concepts/programming-model/#protect) to this resource configuration if you desire protection from accidental deletion.
   *  
   *  &gt; **NOTE:** `aurora` is no longer a valid `engine` because of [Amazon Aurora&#39;s MySQL-Compatible Edition version 1 end of life](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.MySQL56.EOL.html).
   */
  def ClusterInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.rds.ClusterInstanceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.rds.ClusterInstanceArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.rds.ClusterInstance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an RDS Aurora Cluster Custom Endpoint.
   *  You can refer to the [User Guide](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Overview.Endpoints.html#Aurora.Endpoints.Cluster).
   */
  def ClusterEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.rds.ClusterEndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.rds.ClusterEndpointArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.rds.ClusterEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a RDS DB Cluster association with an IAM Role. Example use cases:
   *  
   *  * [Creating an IAM Role to Allow Amazon Aurora to Access AWS Services](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Integrating.Authorizing.IAM.CreateRole.html)
   *  * [Importing Amazon S3 Data into an RDS PostgreSQL DB Cluster](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PostgreSQL.S3Import.html)
   */
  def ClusterRoleAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.rds.ClusterRoleAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.rds.ClusterRoleAssociationArgs.builder
    
    com.pulumi.aws.rds.ClusterRoleAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an RDS DB Reserved Instance.
   *  
   *  &gt; **NOTE:** Once created, a reservation is valid for the `duration` of the provided `offeringId` and cannot be deleted. Performing a `destroy` will only remove the resource from state. For more information see [RDS Reserved Instances Documentation](https://aws.amazon.com/rds/reserved-instances/) and [PurchaseReservedDBInstancesOffering](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_PurchaseReservedDBInstancesOffering.html).
   *  
   *  &gt; **NOTE:** Due to the expense of testing this resource, we provide it as best effort. If you find it useful, and have the ability to help test or notice issues, consider reaching out to us on GitHub.
   */
  def ReservedInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.rds.ReservedInstanceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.rds.ReservedInstanceArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.rds.ReservedInstance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an RDS database cluster snapshot for Aurora clusters. For managing RDS database instance snapshots, see the `aws.rds.Snapshot` resource. */
  def ClusterSnapshot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.rds.ClusterSnapshotArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.rds.ClusterSnapshotArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.rds.ClusterSnapshot(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.rds.inputs.ClusterParameterGroupState.Builder)
    /**
     * @param parameters A list of DB parameters to apply. Note that parameters may differ from a family to an other. Full list of all parameters can be discovered via [`aws rds describe-db-cluster-parameters`](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-cluster-parameters.html) after initial creation of the group.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.rds.inputs.ClusterParameterGroupParameterArgs.Builder]*):
        com.pulumi.aws.rds.inputs.ClusterParameterGroupState.Builder =
      def argsBuilder = com.pulumi.aws.rds.inputs.ClusterParameterGroupParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.rds.inputs.GetEngineVersionArgs.Builder)
    /**
     * @param filters One or more name/value pairs to use in filtering versions. There are several valid keys; for a full reference, check out [describe-db-engine-versions in the AWS CLI reference](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/rds/describe-db-engine-versions.html).
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.rds.inputs.GetEngineVersionFilterArgs.Builder]*):
        com.pulumi.aws.rds.inputs.GetEngineVersionArgs.Builder =
      def argsBuilder = com.pulumi.aws.rds.inputs.GetEngineVersionFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.rds.inputs.ParameterGroupState.Builder)
    /**
     * @param parameters The DB parameters to apply. See `parameter` Block below for more details. Note that parameters may differ from a family to an other. Full list of all parameters can be discovered via [`aws rds describe-db-parameters`](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-parameters.html) after initial creation of the group.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.rds.inputs.ParameterGroupParameterArgs.Builder]*):
        com.pulumi.aws.rds.inputs.ParameterGroupState.Builder =
      def argsBuilder = com.pulumi.aws.rds.inputs.ParameterGroupParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.rds.inputs.GlobalClusterState.Builder)
    /**
     * @param globalClusterMembers Set of objects containing Global Cluster members.
     * @return builder
     */
    def globalClusterMembers(args: Endofunction[com.pulumi.aws.rds.inputs.GlobalClusterGlobalClusterMemberArgs.Builder]*):
        com.pulumi.aws.rds.inputs.GlobalClusterState.Builder =
      def argsBuilder = com.pulumi.aws.rds.inputs.GlobalClusterGlobalClusterMemberArgs.builder
      builder.globalClusterMembers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.rds.inputs.ClusterSnapshotCopyState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.rds.inputs.ClusterSnapshotCopyTimeoutsArgs.Builder]):
        com.pulumi.aws.rds.inputs.ClusterSnapshotCopyState.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.ClusterSnapshotCopyTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.rds.inputs.ClusterState.Builder)
    /**
     * @param masterUserSecrets Block that specifies the master user secret. Only available when `manageMasterUserPassword` is set to true. Documented below.
     * @return builder
     */
    def masterUserSecrets(args: Endofunction[com.pulumi.aws.rds.inputs.ClusterMasterUserSecretArgs.Builder]*):
        com.pulumi.aws.rds.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.aws.rds.inputs.ClusterMasterUserSecretArgs.builder
      builder.masterUserSecrets(args.map(_(argsBuilder).build)*)

    /**
     * @param restoreToPointInTime Nested attribute for [point in time restore](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-pitr.html). More details below.
     * @return builder
     */
    def restoreToPointInTime(args: Endofunction[com.pulumi.aws.rds.inputs.ClusterRestoreToPointInTimeArgs.Builder]):
        com.pulumi.aws.rds.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.ClusterRestoreToPointInTimeArgs.builder
      builder.restoreToPointInTime(args(argsBuilder).build)

    def s3Import(args: Endofunction[com.pulumi.aws.rds.inputs.ClusterS3ImportArgs.Builder]):
        com.pulumi.aws.rds.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.ClusterS3ImportArgs.builder
      builder.s3Import(args(argsBuilder).build)

    /**
     * @param scalingConfiguration Nested attribute with scaling properties. Only valid when `engineMode` is set to `serverless`. More details below.
     * @return builder
     */
    def scalingConfiguration(args: Endofunction[com.pulumi.aws.rds.inputs.ClusterScalingConfigurationArgs.Builder]):
        com.pulumi.aws.rds.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.ClusterScalingConfigurationArgs.builder
      builder.scalingConfiguration(args(argsBuilder).build)

    /**
     * @param serverlessv2ScalingConfiguration Nested attribute with scaling properties for ServerlessV2. Only valid when `engineMode` is set to `provisioned`. More details below.
     * @return builder
     */
    def serverlessv2ScalingConfiguration(args: Endofunction[com.pulumi.aws.rds.inputs.ClusterServerlessv2ScalingConfigurationArgs.Builder]):
        com.pulumi.aws.rds.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.ClusterServerlessv2ScalingConfigurationArgs.builder
      builder.serverlessv2ScalingConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.rds.inputs.IntegrationState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.rds.inputs.IntegrationTimeoutsArgs.Builder]):
        com.pulumi.aws.rds.inputs.IntegrationState.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.IntegrationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.rds.inputs.InstanceDesiredStateState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.rds.inputs.InstanceDesiredStateTimeoutsArgs.Builder]):
        com.pulumi.aws.rds.inputs.InstanceDesiredStateState.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.InstanceDesiredStateTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.rds.inputs.ProxyState.Builder)
    /**
     * @param auths Configuration block(s) with authorization mechanisms to connect to the associated instances or clusters. Required when `defaultAuthScheme` is `NONE` or unspecified. Described below.
     * @return builder
     */
    def auths(args: Endofunction[com.pulumi.aws.rds.inputs.ProxyAuthArgs.Builder]*):
        com.pulumi.aws.rds.inputs.ProxyState.Builder =
      def argsBuilder = com.pulumi.aws.rds.inputs.ProxyAuthArgs.builder
      builder.auths(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.rds.inputs.ReservedInstanceState.Builder)
    /**
     * @param recurringCharges Recurring price charged to run this reserved DB instance.
     * @return builder
     */
    def recurringCharges(args: Endofunction[com.pulumi.aws.rds.inputs.ReservedInstanceRecurringChargeArgs.Builder]*):
        com.pulumi.aws.rds.inputs.ReservedInstanceState.Builder =
      def argsBuilder = com.pulumi.aws.rds.inputs.ReservedInstanceRecurringChargeArgs.builder
      builder.recurringCharges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.rds.inputs.GetInstancesArgs.Builder)
    /**
     * @param filters Configuration block(s) used to filter instances with AWS supported attributes, such as `engine`, `db-cluster-id` or `db-instance-id` for example. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.rds.inputs.GetInstancesFilterArgs.Builder]*):
        com.pulumi.aws.rds.inputs.GetInstancesArgs.Builder =
      def argsBuilder = com.pulumi.aws.rds.inputs.GetInstancesFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.rds.inputs.ExportTaskState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.rds.inputs.ExportTaskTimeoutsArgs.Builder]):
        com.pulumi.aws.rds.inputs.ExportTaskState.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.ExportTaskTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.rds.inputs.ProxyDefaultTargetGroupState.Builder)
    /**
     * @param connectionPoolConfig The settings that determine the size and behavior of the connection pool for the target group.
     * @return builder
     */
    def connectionPoolConfig(args: Endofunction[com.pulumi.aws.rds.inputs.ProxyDefaultTargetGroupConnectionPoolConfigArgs.Builder]):
        com.pulumi.aws.rds.inputs.ProxyDefaultTargetGroupState.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.ProxyDefaultTargetGroupConnectionPoolConfigArgs.builder
      builder.connectionPoolConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.rds.inputs.OptionGroupState.Builder)
    /**
     * @param options The options to apply. See `option` Block below for more details.
     * @return builder
     */
    def options(args: Endofunction[com.pulumi.aws.rds.inputs.OptionGroupOptionArgs.Builder]*):
        com.pulumi.aws.rds.inputs.OptionGroupState.Builder =
      def argsBuilder = com.pulumi.aws.rds.inputs.OptionGroupOptionArgs.builder
      builder.options(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.rds.inputs.GetClustersArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.rds.inputs.GetClustersFilterArgs.Builder]*):
        com.pulumi.aws.rds.inputs.GetClustersArgs.Builder =
      def argsBuilder = com.pulumi.aws.rds.inputs.GetClustersFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.rds.inputs.ShardGroupState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.rds.inputs.ShardGroupTimeoutsArgs.Builder]):
        com.pulumi.aws.rds.inputs.ShardGroupState.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.ShardGroupTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.rds.inputs.OptionGroupOptionArgs.Builder)
    /**
     * @param optionSettings The option settings to apply. See `optionSettings` Block below for more details.
     * @return builder
     */
    def optionSettings(args: Endofunction[com.pulumi.aws.rds.inputs.OptionGroupOptionOptionSettingArgs.Builder]*):
        com.pulumi.aws.rds.inputs.OptionGroupOptionArgs.Builder =
      def argsBuilder = com.pulumi.aws.rds.inputs.OptionGroupOptionOptionSettingArgs.builder
      builder.optionSettings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.rds.inputs.InstanceState.Builder)
    /**
     * @param blueGreenUpdate Enables low-downtime updates using [RDS Blue/Green deployments][blue-green].
     *  See `blueGreenUpdate` below.
     * @return builder
     */
    def blueGreenUpdate(args: Endofunction[com.pulumi.aws.rds.inputs.InstanceBlueGreenUpdateArgs.Builder]):
        com.pulumi.aws.rds.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.InstanceBlueGreenUpdateArgs.builder
      builder.blueGreenUpdate(args(argsBuilder).build)

    /**
     * @param listenerEndpoints Specifies the listener connection endpoint for SQL Server Always On. See endpoint below.
     * @return builder
     */
    def listenerEndpoints(args: Endofunction[com.pulumi.aws.rds.inputs.InstanceListenerEndpointArgs.Builder]*):
        com.pulumi.aws.rds.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.aws.rds.inputs.InstanceListenerEndpointArgs.builder
      builder.listenerEndpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param masterUserSecrets A block that specifies the master user secret. Only available when `manageMasterUserPassword` is set to true. Documented below.
     * @return builder
     */
    def masterUserSecrets(args: Endofunction[com.pulumi.aws.rds.inputs.InstanceMasterUserSecretArgs.Builder]*):
        com.pulumi.aws.rds.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.aws.rds.inputs.InstanceMasterUserSecretArgs.builder
      builder.masterUserSecrets(args.map(_(argsBuilder).build)*)

    /**
     * @param restoreToPointInTime A configuration block for restoring a DB instance to an arbitrary point in time.
     *  Requires the `identifier` argument to be set with the name of the new DB instance to be created.
     *  See Restore To Point In Time below for details.
     * @return builder
     */
    def restoreToPointInTime(args: Endofunction[com.pulumi.aws.rds.inputs.InstanceRestoreToPointInTimeArgs.Builder]):
        com.pulumi.aws.rds.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.InstanceRestoreToPointInTimeArgs.builder
      builder.restoreToPointInTime(args(argsBuilder).build)

    /**
     * @param s3Import Restore from a Percona Xtrabackup in S3.  See [Importing Data into an Amazon RDS MySQL DB Instance](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/MySQL.Procedural.Importing.html)
     * @return builder
     */
    def s3Import(args: Endofunction[com.pulumi.aws.rds.inputs.InstanceS3ImportArgs.Builder]):
        com.pulumi.aws.rds.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.InstanceS3ImportArgs.builder
      builder.s3Import(args(argsBuilder).build)

  /**
   * Manages RDS Aurora Cluster Database Activity Streams.
   *  
   *  Database Activity Streams have some limits and requirements, refer to the [Monitoring Amazon Aurora using Database Activity Streams](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/DBActivityStreams.html) documentation for detailed limitations and requirements.
   *  
   *  &gt; **Note:** This resource always calls the RDS [`StartActivityStream`][2] API with the `ApplyImmediately` parameter set to `true`. This is because the provider needs the activity stream to be started in order for it to get the associated attributes.
   *  
   *  &gt; **Note:** This resource depends on having at least one `aws.rds.ClusterInstance` created. To avoid race conditions when all resources are being created together, add an explicit resource reference using the resource `dependsOn` meta-argument.
   *  
   *  &gt; **Note:** This resource is available in all regions except the following: `cn-north-1`, `cn-northwest-1`, `us-gov-east-1`, `us-gov-west-1`
   */
  def ClusterActivityStream(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.rds.ClusterActivityStreamArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.rds.ClusterActivityStreamArgs.builder
    
    com.pulumi.aws.rds.ClusterActivityStream(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
