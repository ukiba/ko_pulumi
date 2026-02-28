package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object elasticache:
  /**
   * Associate an existing ElastiCache user and an existing user group.
   *  
   *  &gt; Pulumi will detect changes in the `aws.elasticache.UserGroup` since `aws.elasticache.UserGroupAssociation` changes the user IDs associated with the user group. You can ignore these changes with the `lifecycle` `ignoreChanges` meta argument as shown in the example.
   */
  def UserGroupAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.elasticache.UserGroupAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.elasticache.UserGroupAssociationArgs.builder
    
    com.pulumi.aws.elasticache.UserGroupAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.elasticache.UserArgs.Builder)
    /**
     * @param authenticationMode Denotes the user&#39;s authentication properties. Detailed below.
     * @return builder
     */
    def authenticationMode(args: Endofunction[com.pulumi.aws.elasticache.inputs.UserAuthenticationModeArgs.Builder]):
        com.pulumi.aws.elasticache.UserArgs.Builder =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.UserAuthenticationModeArgs.builder
      builder.authenticationMode(args(argsBuilder).build)

  /**
   * Provides an ElastiCache parameter group resource.
   *  
   *  &gt; **NOTE:** Attempting to remove the `reserved-memory` parameter when `family` is set to `redis2.6` or `redis2.8` may show a perpetual difference in this provider due to an ElastiCache API limitation. Leave that parameter configured with any value to workaround the issue.
   */
  def ParameterGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.elasticache.ParameterGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.elasticache.ParameterGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.elasticache.ParameterGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an ElastiCache Subnet Group resource. */
  def SubnetGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.elasticache.SubnetGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.elasticache.SubnetGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.elasticache.SubnetGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an ElastiCache Cluster resource, which manages a Memcached cluster, a single-node Redis instance,
   *  or a read replica in a Redis (Cluster Mode Enabled) replication group. For more information, refer to
   *  the AWS document [What is Amazon ElastiCache?](https://docs.aws.amazon.com/AmazonElastiCache/latest/dg/WhatIs.html).
   *  
   *  For working with Redis (Cluster Mode Enabled) replication groups, see the
   *  `aws.elasticache.ReplicationGroup` resource.
   *  
   *  &gt; **Note:** When you change an attribute, such as `numCacheNodes`, by default
   *  it is applied in the next maintenance window. Because of this, this provider may report
   *  a difference in its planning phase because the actual modification has not yet taken
   *  place. You can use the `applyImmediately` flag to instruct the service to apply the
   *  change immediately. Using `applyImmediately` can result in a brief downtime as the server reboots.
   *  See the &#34;Changes take effect&#34; section of the &#34;Details&#34; column in the AWS Documentation on Engine specific parameters for
   *  [ElastiCache for Memcached](https://docs.aws.amazon.com/AmazonElastiCache/latest/dg/ParameterGroups.Engine.html#ParameterGroups.Memcached) or
   *  [ElastiCache for Valkey and Redis OSS](https://docs.aws.amazon.com/AmazonElastiCache/latest/dg/ParameterGroups.Engine.html#ParameterGroups.Redis)
   *  for more information.
   *  
   *  &gt; **Note:** Any attribute changes that re-create the resource will be applied immediately, regardless of the value of `applyImmediately`.
   */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.elasticache.ClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.elasticache.ClusterArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.elasticache.Cluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an ElastiCache user resource.
   *  
   *  &gt; **Note:** All arguments including the username and passwords will be stored in the raw state as plain-text.
   */
  def User(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.elasticache.UserArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.elasticache.UserArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.elasticache.User(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an ElastiCache user group resource. */
  def UserGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.elasticache.UserGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.elasticache.UserGroupArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.elasticache.UserGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.elasticache.ParameterGroupArgs.Builder)
    /**
     * @param parameters A list of ElastiCache parameters to apply.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.elasticache.inputs.ParameterGroupParameterArgs.Builder]*):
        com.pulumi.aws.elasticache.ParameterGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.elasticache.inputs.ParameterGroupParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.elasticache.ClusterArgs.Builder)
    /**
     * @param logDeliveryConfigurations Specifies the destination and format of Redis [SLOWLOG](https://redis.io/commands/slowlog) or Redis [Engine Log](https://docs.aws.amazon.com/AmazonElastiCache/latest/dg/Log_Delivery.html#Log_contents-engine-log). See the documentation on [Amazon ElastiCache](https://docs.aws.amazon.com/AmazonElastiCache/latest/dg/Log_Delivery.html). See Log Delivery Configuration below for more details.
     * @return builder
     */
    def logDeliveryConfigurations(args: Endofunction[com.pulumi.aws.elasticache.inputs.ClusterLogDeliveryConfigurationArgs.Builder]*):
        com.pulumi.aws.elasticache.ClusterArgs.Builder =
      def argsBuilder = com.pulumi.aws.elasticache.inputs.ClusterLogDeliveryConfigurationArgs.builder
      builder.logDeliveryConfigurations(args.map(_(argsBuilder).build)*)

  /** Provides an ElastiCache Serverless Cache resource which manages memcached, redis or valkey. */
  def ServerlessCache(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.elasticache.ServerlessCacheArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.elasticache.ServerlessCacheArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.elasticache.ServerlessCache(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.elasticache.ReservedCacheNodeArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.elasticache.inputs.ReservedCacheNodeTimeoutsArgs.Builder]):
        com.pulumi.aws.elasticache.ReservedCacheNodeArgs.Builder =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.ReservedCacheNodeTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  type ElasticacheFunctions = com.pulumi.aws.elasticache.ElasticacheFunctions
  object ElasticacheFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.elasticache.ElasticacheFunctions.*
  extension (self: ElasticacheFunctions.type)
    /** Use this data source to get information about an ElastiCache Cluster */
    def getCluster(args: Endofunction[com.pulumi.aws.elasticache.inputs.GetClusterArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.elasticache.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.GetClusterArgs.builder
      com.pulumi.aws.elasticache.ElasticacheFunctions.getCluster(args(argsBuilder).build)

    /** Use this data source to get information about an ElastiCache Cluster */
    def getClusterPlain(args: Endofunction[com.pulumi.aws.elasticache.inputs.GetClusterPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.elasticache.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.GetClusterPlainArgs.builder
      com.pulumi.aws.elasticache.ElasticacheFunctions.getClusterPlain(args(argsBuilder).build)

    /** Use this data source to get information about an ElastiCache Replication Group. */
    def getReplicationGroup(args: Endofunction[com.pulumi.aws.elasticache.inputs.GetReplicationGroupArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.elasticache.outputs.GetReplicationGroupResult] =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.GetReplicationGroupArgs.builder
      com.pulumi.aws.elasticache.ElasticacheFunctions.getReplicationGroup(args(argsBuilder).build)

    /** Use this data source to get information about an ElastiCache Replication Group. */
    def getReplicationGroupPlain(args: Endofunction[com.pulumi.aws.elasticache.inputs.GetReplicationGroupPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.elasticache.outputs.GetReplicationGroupResult] =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.GetReplicationGroupPlainArgs.builder
      com.pulumi.aws.elasticache.ElasticacheFunctions.getReplicationGroupPlain(args(argsBuilder).build)

    /** Information about a single ElastiCache Reserved Cache Node Offering. */
    def getReservedCacheNodeOffering(args: Endofunction[com.pulumi.aws.elasticache.inputs.GetReservedCacheNodeOfferingArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.elasticache.outputs.GetReservedCacheNodeOfferingResult] =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.GetReservedCacheNodeOfferingArgs.builder
      com.pulumi.aws.elasticache.ElasticacheFunctions.getReservedCacheNodeOffering(args(argsBuilder).build)

    /** Information about a single ElastiCache Reserved Cache Node Offering. */
    def getReservedCacheNodeOfferingPlain(args: Endofunction[com.pulumi.aws.elasticache.inputs.GetReservedCacheNodeOfferingPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.elasticache.outputs.GetReservedCacheNodeOfferingResult] =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.GetReservedCacheNodeOfferingPlainArgs.builder
      com.pulumi.aws.elasticache.ElasticacheFunctions.getReservedCacheNodeOfferingPlain(args(argsBuilder).build)

    /** Use this data source to get information about an ElastiCache Serverless Cache. */
    def getServerlessCache(args: Endofunction[com.pulumi.aws.elasticache.inputs.GetServerlessCacheArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.elasticache.outputs.GetServerlessCacheResult] =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.GetServerlessCacheArgs.builder
      com.pulumi.aws.elasticache.ElasticacheFunctions.getServerlessCache(args(argsBuilder).build)

    /** Use this data source to get information about an ElastiCache Serverless Cache. */
    def getServerlessCachePlain(args: Endofunction[com.pulumi.aws.elasticache.inputs.GetServerlessCachePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.elasticache.outputs.GetServerlessCacheResult] =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.GetServerlessCachePlainArgs.builder
      com.pulumi.aws.elasticache.ElasticacheFunctions.getServerlessCachePlain(args(argsBuilder).build)

    /** Provides information about a ElastiCache Subnet Group. */
    def getSubnetGroup(args: Endofunction[com.pulumi.aws.elasticache.inputs.GetSubnetGroupArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.elasticache.outputs.GetSubnetGroupResult] =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.GetSubnetGroupArgs.builder
      com.pulumi.aws.elasticache.ElasticacheFunctions.getSubnetGroup(args(argsBuilder).build)

    /** Provides information about a ElastiCache Subnet Group. */
    def getSubnetGroupPlain(args: Endofunction[com.pulumi.aws.elasticache.inputs.GetSubnetGroupPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.elasticache.outputs.GetSubnetGroupResult] =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.GetSubnetGroupPlainArgs.builder
      com.pulumi.aws.elasticache.ElasticacheFunctions.getSubnetGroupPlain(args(argsBuilder).build)

    /** Use this data source to get information about an ElastiCache User. */
    def getUser(args: Endofunction[com.pulumi.aws.elasticache.inputs.GetUserArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.elasticache.outputs.GetUserResult] =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.GetUserArgs.builder
      com.pulumi.aws.elasticache.ElasticacheFunctions.getUser(args(argsBuilder).build)

    /** Use this data source to get information about an ElastiCache User. */
    def getUserPlain(args: Endofunction[com.pulumi.aws.elasticache.inputs.GetUserPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.elasticache.outputs.GetUserResult] =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.GetUserPlainArgs.builder
      com.pulumi.aws.elasticache.ElasticacheFunctions.getUserPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.elasticache.ReplicationGroupArgs.Builder)
    /**
     * @param logDeliveryConfigurations Specifies the destination and format of Redis OSS/Valkey [SLOWLOG](https://redis.io/commands/slowlog) or Redis OSS/Valkey [Engine Log](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Log_Delivery.html#Log_contents-engine-log). See the documentation on [Amazon ElastiCache](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Log_Delivery.html#Log_contents-engine-log). See Log Delivery Configuration below for more details.
     * @return builder
     */
    def logDeliveryConfigurations(args: Endofunction[com.pulumi.aws.elasticache.inputs.ReplicationGroupLogDeliveryConfigurationArgs.Builder]*):
        com.pulumi.aws.elasticache.ReplicationGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.elasticache.inputs.ReplicationGroupLogDeliveryConfigurationArgs.builder
      builder.logDeliveryConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param nodeGroupConfigurations Configuration block for node groups (shards). Can be specified only if `numNodeGroups` is set. Conflicts with `preferredCacheClusterAzs`. See Node Group Configuration below for more details.
     * @return builder
     */
    def nodeGroupConfigurations(args: Endofunction[com.pulumi.aws.elasticache.inputs.ReplicationGroupNodeGroupConfigurationArgs.Builder]*):
        com.pulumi.aws.elasticache.ReplicationGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.elasticache.inputs.ReplicationGroupNodeGroupConfigurationArgs.builder
      builder.nodeGroupConfigurations(args.map(_(argsBuilder).build)*)

  /**
   * Provides an ElastiCache Replication Group resource.
   *  
   *  For working with a [Memcached cluster](https://docs.aws.amazon.com/AmazonElastiCache/latest/mem-ug/WhatIs.html) or a
   *  [single-node Redis instance (Cluster Mode Disabled)](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/WhatIs.html),
   *  see the `aws.elasticache.Cluster` resource.
   *  
   *  &gt; **Note:** When you change an attribute, such as `engineVersion`, by
   *  default the ElastiCache API applies it in the next maintenance window. Because
   *  of this, this provider may report a difference in its planning phase because the
   *  actual modification has not yet taken place. You can use the
   *  `applyImmediately` flag to instruct the service to apply the change
   *  immediately. Using `applyImmediately` can result in a brief downtime as
   *  servers reboots.
   *  See the AWS Documentation on
   *  [Modifying an ElastiCache Cache Cluster](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.Modify.html)
   *  for more information.
   *  
   *  &gt; **Note:** Any attribute changes that re-create the resource will be applied immediately, regardless of the value of `applyImmediately`.
   *  
   *  &gt; **Note:** Be aware of the terminology collision around &#34;cluster&#34; for `aws.elasticache.ReplicationGroup`. For example, it is possible to create a [&#34;Cluster Mode Disabled [Redis] Cluster&#34;](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.Create.CON.Redis.html). With &#34;Cluster Mode Enabled&#34;, the data will be stored in shards (called &#34;node groups&#34;). See [Redis Cluster Configuration](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/cluster-create-determine-requirements.html#redis-cluster-configuration) for a diagram of the differences. To enable cluster mode, use a parameter group that has cluster mode enabled. The default parameter groups provided by AWS end with &#34;.cluster.on&#34;, for example `default.redis6.x.cluster.on`.
   */
  def ReplicationGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.elasticache.ReplicationGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.elasticache.ReplicationGroupArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.elasticache.ReplicationGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.elasticache.ServerlessCacheArgs.Builder)
    /**
     * @param cacheUsageLimits Sets the cache usage limits for storage and ElastiCache Processing Units for the cache. See `cacheUsageLimits` Block for details.
     * @return builder
     */
    def cacheUsageLimits(args: Endofunction[com.pulumi.aws.elasticache.inputs.ServerlessCacheCacheUsageLimitsArgs.Builder]):
        com.pulumi.aws.elasticache.ServerlessCacheArgs.Builder =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.ServerlessCacheCacheUsageLimitsArgs.builder
      builder.cacheUsageLimits(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.elasticache.inputs.ServerlessCacheTimeoutsArgs.Builder]):
        com.pulumi.aws.elasticache.ServerlessCacheArgs.Builder =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.ServerlessCacheTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /**
   * Manages an ElastiCache Reserved Cache Node.
   *  
   *  &gt; **NOTE:** Once created, a reservation is valid for the `duration` of the provided `offeringId` and cannot be deleted. Performing a `destroy` will only remove the resource from state. For more information see [ElastiCache Reserved Nodes Documentation](https://aws.amazon.com/elasticache/reserved-cache-nodes/) and [PurchaseReservedCacheNodesOffering](https://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_PurchaseReservedCacheNodesOffering.html).
   *  
   *  &gt; **NOTE:** Due to the expense of testing this resource, we provide it as best effort. If you find it useful, and have the ability to help test or notice issues, consider reaching out to us on GitHub.
   */
  def ReservedCacheNode(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.elasticache.ReservedCacheNodeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.elasticache.ReservedCacheNodeArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.elasticache.ReservedCacheNode(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an ElastiCache Global Replication Group resource, which manages replication between two or more Replication Groups in different regions. For more information, see the [ElastiCache User Guide](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Redis-Global-Datastore.html). */
  def GlobalReplicationGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.elasticache.GlobalReplicationGroupArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.elasticache.GlobalReplicationGroupArgs.builder
    
    com.pulumi.aws.elasticache.GlobalReplicationGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.elasticache.inputs.GlobalReplicationGroupState.Builder)
    /**
     * @param globalNodeGroups Set of node groups (shards) on the global replication group.
     *  Has the values:
     * @return builder
     */
    def globalNodeGroups(args: Endofunction[com.pulumi.aws.elasticache.inputs.GlobalReplicationGroupGlobalNodeGroupArgs.Builder]*):
        com.pulumi.aws.elasticache.inputs.GlobalReplicationGroupState.Builder =
      def argsBuilder = com.pulumi.aws.elasticache.inputs.GlobalReplicationGroupGlobalNodeGroupArgs.builder
      builder.globalNodeGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.elasticache.inputs.ParameterGroupState.Builder)
    /**
     * @param parameters A list of ElastiCache parameters to apply.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.elasticache.inputs.ParameterGroupParameterArgs.Builder]*):
        com.pulumi.aws.elasticache.inputs.ParameterGroupState.Builder =
      def argsBuilder = com.pulumi.aws.elasticache.inputs.ParameterGroupParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.elasticache.inputs.ClusterState.Builder)
    /**
     * @param cacheNodes List of node objects including `id`, `address`, `port` and `availabilityZone`.
     * @return builder
     */
    def cacheNodes(args: Endofunction[com.pulumi.aws.elasticache.inputs.ClusterCacheNodeArgs.Builder]*):
        com.pulumi.aws.elasticache.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.aws.elasticache.inputs.ClusterCacheNodeArgs.builder
      builder.cacheNodes(args.map(_(argsBuilder).build)*)

    /**
     * @param logDeliveryConfigurations Specifies the destination and format of Redis [SLOWLOG](https://redis.io/commands/slowlog) or Redis [Engine Log](https://docs.aws.amazon.com/AmazonElastiCache/latest/dg/Log_Delivery.html#Log_contents-engine-log). See the documentation on [Amazon ElastiCache](https://docs.aws.amazon.com/AmazonElastiCache/latest/dg/Log_Delivery.html). See Log Delivery Configuration below for more details.
     * @return builder
     */
    def logDeliveryConfigurations(args: Endofunction[com.pulumi.aws.elasticache.inputs.ClusterLogDeliveryConfigurationArgs.Builder]*):
        com.pulumi.aws.elasticache.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.aws.elasticache.inputs.ClusterLogDeliveryConfigurationArgs.builder
      builder.logDeliveryConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.elasticache.inputs.ServerlessCacheState.Builder)
    /**
     * @param cacheUsageLimits Sets the cache usage limits for storage and ElastiCache Processing Units for the cache. See `cacheUsageLimits` Block for details.
     * @return builder
     */
    def cacheUsageLimits(args: Endofunction[com.pulumi.aws.elasticache.inputs.ServerlessCacheCacheUsageLimitsArgs.Builder]):
        com.pulumi.aws.elasticache.inputs.ServerlessCacheState.Builder =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.ServerlessCacheCacheUsageLimitsArgs.builder
      builder.cacheUsageLimits(args(argsBuilder).build)

    /**
     * @param endpoints Represents the information required for client programs to connect to a cache node. See `endpoint` Block for details.
     * @return builder
     */
    def endpoints(args: Endofunction[com.pulumi.aws.elasticache.inputs.ServerlessCacheEndpointArgs.Builder]*):
        com.pulumi.aws.elasticache.inputs.ServerlessCacheState.Builder =
      def argsBuilder = com.pulumi.aws.elasticache.inputs.ServerlessCacheEndpointArgs.builder
      builder.endpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param readerEndpoints Represents the information required for client programs to connect to a cache node. See `readerEndpoint` Block for details.
     * @return builder
     */
    def readerEndpoints(args: Endofunction[com.pulumi.aws.elasticache.inputs.ServerlessCacheReaderEndpointArgs.Builder]*):
        com.pulumi.aws.elasticache.inputs.ServerlessCacheState.Builder =
      def argsBuilder = com.pulumi.aws.elasticache.inputs.ServerlessCacheReaderEndpointArgs.builder
      builder.readerEndpoints(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.elasticache.inputs.ServerlessCacheTimeoutsArgs.Builder]):
        com.pulumi.aws.elasticache.inputs.ServerlessCacheState.Builder =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.ServerlessCacheTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.elasticache.inputs.ReplicationGroupState.Builder)
    /**
     * @param logDeliveryConfigurations Specifies the destination and format of Redis OSS/Valkey [SLOWLOG](https://redis.io/commands/slowlog) or Redis OSS/Valkey [Engine Log](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Log_Delivery.html#Log_contents-engine-log). See the documentation on [Amazon ElastiCache](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Log_Delivery.html#Log_contents-engine-log). See Log Delivery Configuration below for more details.
     * @return builder
     */
    def logDeliveryConfigurations(args: Endofunction[com.pulumi.aws.elasticache.inputs.ReplicationGroupLogDeliveryConfigurationArgs.Builder]*):
        com.pulumi.aws.elasticache.inputs.ReplicationGroupState.Builder =
      def argsBuilder = com.pulumi.aws.elasticache.inputs.ReplicationGroupLogDeliveryConfigurationArgs.builder
      builder.logDeliveryConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param nodeGroupConfigurations Configuration block for node groups (shards). Can be specified only if `numNodeGroups` is set. Conflicts with `preferredCacheClusterAzs`. See Node Group Configuration below for more details.
     * @return builder
     */
    def nodeGroupConfigurations(args: Endofunction[com.pulumi.aws.elasticache.inputs.ReplicationGroupNodeGroupConfigurationArgs.Builder]*):
        com.pulumi.aws.elasticache.inputs.ReplicationGroupState.Builder =
      def argsBuilder = com.pulumi.aws.elasticache.inputs.ReplicationGroupNodeGroupConfigurationArgs.builder
      builder.nodeGroupConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.elasticache.inputs.ServerlessCacheCacheUsageLimitsArgs.Builder)
    /**
     * @param dataStorage The maximum data storage limit in the cache, expressed in Gigabytes. See `dataStorage` Block for details.
     * @return builder
     */
    def dataStorage(args: Endofunction[com.pulumi.aws.elasticache.inputs.ServerlessCacheCacheUsageLimitsDataStorageArgs.Builder]):
        com.pulumi.aws.elasticache.inputs.ServerlessCacheCacheUsageLimitsArgs.Builder =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.ServerlessCacheCacheUsageLimitsDataStorageArgs.builder
      builder.dataStorage(args(argsBuilder).build)

    /**
     * @param ecpuPerSeconds The configuration for the number of ElastiCache Processing Units (ECPU) the cache can consume per second. See `ecpuPerSecond` Block for details.
     * @return builder
     */
    def ecpuPerSeconds(args: Endofunction[com.pulumi.aws.elasticache.inputs.ServerlessCacheCacheUsageLimitsEcpuPerSecondArgs.Builder]*):
        com.pulumi.aws.elasticache.inputs.ServerlessCacheCacheUsageLimitsArgs.Builder =
      def argsBuilder = com.pulumi.aws.elasticache.inputs.ServerlessCacheCacheUsageLimitsEcpuPerSecondArgs.builder
      builder.ecpuPerSeconds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.elasticache.inputs.ReservedCacheNodeState.Builder)
    /**
     * @param recurringCharges Recurring price charged to run this reserved cache node.
     * @return builder
     */
    def recurringCharges(args: Endofunction[com.pulumi.aws.elasticache.inputs.ReservedCacheNodeRecurringChargeArgs.Builder]*):
        com.pulumi.aws.elasticache.inputs.ReservedCacheNodeState.Builder =
      def argsBuilder = com.pulumi.aws.elasticache.inputs.ReservedCacheNodeRecurringChargeArgs.builder
      builder.recurringCharges(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.elasticache.inputs.ReservedCacheNodeTimeoutsArgs.Builder]):
        com.pulumi.aws.elasticache.inputs.ReservedCacheNodeState.Builder =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.ReservedCacheNodeTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.elasticache.inputs.GetUserArgs.Builder)
    def authenticationModes(args: Endofunction[com.pulumi.aws.elasticache.inputs.GetUserAuthenticationModeArgs.Builder]*):
        com.pulumi.aws.elasticache.inputs.GetUserArgs.Builder =
      def argsBuilder = com.pulumi.aws.elasticache.inputs.GetUserAuthenticationModeArgs.builder
      builder.authenticationModes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.elasticache.inputs.UserState.Builder)
    /**
     * @param authenticationMode Denotes the user&#39;s authentication properties. Detailed below.
     * @return builder
     */
    def authenticationMode(args: Endofunction[com.pulumi.aws.elasticache.inputs.UserAuthenticationModeArgs.Builder]):
        com.pulumi.aws.elasticache.inputs.UserState.Builder =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.UserAuthenticationModeArgs.builder
      builder.authenticationMode(args(argsBuilder).build)
