package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object elasticache:
  /**
   * Provides an ElastiCache Cluster resource, which manages a Memcached cluster, a single-node Redis instance,
   * or a read replica in a Redis (Cluster Mode Enabled) replication group. For more information, refer to
   * the AWS document [What is Amazon ElastiCache?](https://docs.aws.amazon.com/AmazonElastiCache/latest/dg/WhatIs.html).
   * 
   * For working with Redis (Cluster Mode Enabled) replication groups, see the
   * `aws.elasticache.ReplicationGroup` resource.
   * 
   * &gt; **Note:** When you change an attribute, such as `numCacheNodes`, by default
   * it is applied in the next maintenance window. Because of this, this provider may report
   * a difference in its planning phase because the actual modification has not yet taken
   * place. You can use the `applyImmediately` flag to instruct the service to apply the
   * change immediately. Using `applyImmediately` can result in a brief downtime as the server reboots.
   * See the &#34;Changes take effect&#34; section of the &#34;Details&#34; column in the AWS Documentation on Engine specific parameters for
   * [ElastiCache for Memcached](https://docs.aws.amazon.com/AmazonElastiCache/latest/dg/ParameterGroups.Engine.html#ParameterGroups.Memcached) or
   * [ElastiCache for Redis OSS](https://docs.aws.amazon.com/AmazonElastiCache/latest/dg/ParameterGroups.Engine.html#ParameterGroups.Redis)
   * for more information.
   * 
   * &gt; **Note:** Any attribute changes that re-create the resource will be applied immediately, regardless of the value of `applyImmediately`.
   */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.elasticache.ClusterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.elasticache.ClusterArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.elasticache.Cluster(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object ElasticacheFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to get information about an ElastiCache Cluster */
    inline def getCluster(args: Endofunction[com.pulumi.aws.elasticache.inputs.GetClusterArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.elasticache.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.GetClusterArgs.builder
      com.pulumi.aws.elasticache.ElasticacheFunctions.getCluster(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get information about an ElastiCache Cluster */
    inline def getClusterPlain(args: Endofunction[com.pulumi.aws.elasticache.inputs.GetClusterPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.elasticache.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.GetClusterPlainArgs.builder
      com.pulumi.aws.elasticache.ElasticacheFunctions.getClusterPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to get information about an ElastiCache Replication Group. */
    inline def getReplicationGroup(args: Endofunction[com.pulumi.aws.elasticache.inputs.GetReplicationGroupArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.elasticache.outputs.GetReplicationGroupResult] =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.GetReplicationGroupArgs.builder
      com.pulumi.aws.elasticache.ElasticacheFunctions.getReplicationGroup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get information about an ElastiCache Replication Group. */
    inline def getReplicationGroupPlain(args: Endofunction[com.pulumi.aws.elasticache.inputs.GetReplicationGroupPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.elasticache.outputs.GetReplicationGroupResult] =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.GetReplicationGroupPlainArgs.builder
      com.pulumi.aws.elasticache.ElasticacheFunctions.getReplicationGroupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Information about a single ElastiCache Reserved Cache Node Offering. */
    inline def getReservedCacheNodeOffering(args: Endofunction[com.pulumi.aws.elasticache.inputs.GetReservedCacheNodeOfferingArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.elasticache.outputs.GetReservedCacheNodeOfferingResult] =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.GetReservedCacheNodeOfferingArgs.builder
      com.pulumi.aws.elasticache.ElasticacheFunctions.getReservedCacheNodeOffering(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Information about a single ElastiCache Reserved Cache Node Offering. */
    inline def getReservedCacheNodeOfferingPlain(args: Endofunction[com.pulumi.aws.elasticache.inputs.GetReservedCacheNodeOfferingPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.elasticache.outputs.GetReservedCacheNodeOfferingResult] =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.GetReservedCacheNodeOfferingPlainArgs.builder
      com.pulumi.aws.elasticache.ElasticacheFunctions.getReservedCacheNodeOfferingPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to get information about an ElastiCache Serverless Cache. */
    inline def getServerlessCache(args: Endofunction[com.pulumi.aws.elasticache.inputs.GetServerlessCacheArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.elasticache.outputs.GetServerlessCacheResult] =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.GetServerlessCacheArgs.builder
      com.pulumi.aws.elasticache.ElasticacheFunctions.getServerlessCache(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get information about an ElastiCache Serverless Cache. */
    inline def getServerlessCachePlain(args: Endofunction[com.pulumi.aws.elasticache.inputs.GetServerlessCachePlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.elasticache.outputs.GetServerlessCacheResult] =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.GetServerlessCachePlainArgs.builder
      com.pulumi.aws.elasticache.ElasticacheFunctions.getServerlessCachePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Provides details about an AWS ElastiCache Service Update Actions for a given Cache Cluster or Replication Group.
     * 
     * When creating a new Cache Cluster or Replication Group, it takes approximately 10 minutes for Update Actions to be listed.
     */
    inline def getServiceUpdateActions(args: Endofunction[com.pulumi.aws.elasticache.inputs.GetServiceUpdateActionsArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.elasticache.outputs.GetServiceUpdateActionsResult] =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.GetServiceUpdateActionsArgs.builder
      com.pulumi.aws.elasticache.ElasticacheFunctions.getServiceUpdateActions(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Provides details about an AWS ElastiCache Service Update Actions for a given Cache Cluster or Replication Group.
     * 
     * When creating a new Cache Cluster or Replication Group, it takes approximately 10 minutes for Update Actions to be listed.
     */
    inline def getServiceUpdateActionsPlain(args: Endofunction[com.pulumi.aws.elasticache.inputs.GetServiceUpdateActionsPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.elasticache.outputs.GetServiceUpdateActionsResult] =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.GetServiceUpdateActionsPlainArgs.builder
      com.pulumi.aws.elasticache.ElasticacheFunctions.getServiceUpdateActionsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides details about AWS ElastiCache Service Updates. */
    inline def getServiceUpdates(args: Endofunction[com.pulumi.aws.elasticache.inputs.GetServiceUpdatesArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.elasticache.outputs.GetServiceUpdatesResult] =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.GetServiceUpdatesArgs.builder
      com.pulumi.aws.elasticache.ElasticacheFunctions.getServiceUpdates(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about AWS ElastiCache Service Updates. */
    inline def getServiceUpdatesPlain(args: Endofunction[com.pulumi.aws.elasticache.inputs.GetServiceUpdatesPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.elasticache.outputs.GetServiceUpdatesResult] =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.GetServiceUpdatesPlainArgs.builder
      com.pulumi.aws.elasticache.ElasticacheFunctions.getServiceUpdatesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides information about a ElastiCache Subnet Group. */
    inline def getSubnetGroup(args: Endofunction[com.pulumi.aws.elasticache.inputs.GetSubnetGroupArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.elasticache.outputs.GetSubnetGroupResult] =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.GetSubnetGroupArgs.builder
      com.pulumi.aws.elasticache.ElasticacheFunctions.getSubnetGroup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides information about a ElastiCache Subnet Group. */
    inline def getSubnetGroupPlain(args: Endofunction[com.pulumi.aws.elasticache.inputs.GetSubnetGroupPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.elasticache.outputs.GetSubnetGroupResult] =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.GetSubnetGroupPlainArgs.builder
      com.pulumi.aws.elasticache.ElasticacheFunctions.getSubnetGroupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to get information about an ElastiCache User. */
    inline def getUser(args: Endofunction[com.pulumi.aws.elasticache.inputs.GetUserArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.elasticache.outputs.GetUserResult] =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.GetUserArgs.builder
      com.pulumi.aws.elasticache.ElasticacheFunctions.getUser(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get information about an ElastiCache User. */
    inline def getUserPlain(args: Endofunction[com.pulumi.aws.elasticache.inputs.GetUserPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.elasticache.outputs.GetUserResult] =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.GetUserPlainArgs.builder
      com.pulumi.aws.elasticache.ElasticacheFunctions.getUserPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Provides an ElastiCache Global Replication Group resource, which manages replication between two or more Replication Groups in different regions. For more information, see the [ElastiCache User Guide](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Redis-Global-Datastore.html). */
  def GlobalReplicationGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.elasticache.GlobalReplicationGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.elasticache.GlobalReplicationGroupArgs.builder
    com.pulumi.aws.elasticache.GlobalReplicationGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an ElastiCache parameter group resource.
   * 
   * &gt; **NOTE:** Attempting to remove the `reserved-memory` parameter when `family` is set to `redis2.6` or `redis2.8` may show a perpetual difference in this provider due to an ElastiCache API limitation. Leave that parameter configured with any value to workaround the issue.
   */
  def ParameterGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.elasticache.ParameterGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.elasticache.ParameterGroupArgs.builder
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
    com.pulumi.aws.elasticache.ParameterGroup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an ElastiCache Replication Group resource.
   * 
   * For working with a [Memcached cluster](https://docs.aws.amazon.com/AmazonElastiCache/latest/mem-ug/WhatIs.html) or a
   * [single-node Redis instance (Cluster Mode Disabled)](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/WhatIs.html),
   * see the `aws.elasticache.Cluster` resource.
   * 
   * &gt; **Note:** When you change an attribute, such as `engineVersion`, by
   * default the ElastiCache API applies it in the next maintenance window. Because
   * of this, this provider may report a difference in its planning phase because the
   * actual modification has not yet taken place. You can use the
   * `applyImmediately` flag to instruct the service to apply the change
   * immediately. Using `applyImmediately` can result in a brief downtime as
   * servers reboots.
   * See the AWS Documentation on
   * [Modifying an ElastiCache Cache Cluster](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.Modify.html)
   * for more information.
   * 
   * &gt; **Note:** Any attribute changes that re-create the resource will be applied immediately, regardless of the value of `applyImmediately`.
   * 
   * &gt; **Note:** Be aware of the terminology collision around &#34;cluster&#34; for `aws.elasticache.ReplicationGroup`. For example, it is possible to create a [&#34;Cluster Mode Disabled [Redis] Cluster&#34;](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Clusters.Create.CON.Redis.html). With &#34;Cluster Mode Enabled&#34;, the data will be stored in shards (called &#34;node groups&#34;). See [Redis Cluster Configuration](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/cluster-create-determine-requirements.html#redis-cluster-configuration) for a diagram of the differences. To enable cluster mode, use a parameter group that has cluster mode enabled. The default parameter groups provided by AWS end with &#34;.cluster.on&#34;, for example `default.redis6.x.cluster.on`.
   */
  def ReplicationGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.elasticache.ReplicationGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.elasticache.ReplicationGroupArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.elasticache.ReplicationGroup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an ElastiCache Reserved Cache Node.
   * 
   * &gt; **NOTE:** Once created, a reservation is valid for the `duration` of the provided `offeringId` and cannot be deleted. Performing a `destroy` will only remove the resource from state. For more information see [ElastiCache Reserved Nodes Documentation](https://aws.amazon.com/elasticache/reserved-cache-nodes/) and [PurchaseReservedCacheNodesOffering](https://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_PurchaseReservedCacheNodesOffering.html).
   * 
   * &gt; **NOTE:** Due to the expense of testing this resource, we provide it as best effort. If you find it useful, and have the ability to help test or notice issues, consider reaching out to us on GitHub.
   */
  def ReservedCacheNode(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.elasticache.ReservedCacheNodeArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.elasticache.ReservedCacheNodeArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.elasticache.ReservedCacheNode(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an ElastiCache Serverless Cache resource which manages memcached, redis or valkey. */
  def ServerlessCache(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.elasticache.ServerlessCacheArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.elasticache.ServerlessCacheArgs.builder
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
    com.pulumi.aws.elasticache.ServerlessCache(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an ElastiCache Subnet Group resource. */
  def SubnetGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.elasticache.SubnetGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.elasticache.SubnetGroupArgs.builder
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
    com.pulumi.aws.elasticache.SubnetGroup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an ElastiCache user resource.
   * 
   * &gt; **Note:** All arguments including the username and passwords will be stored in the raw state as plain-text unless you use the write-only `passwordsWo` argument.
   */
  def User(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.elasticache.UserArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.elasticache.UserArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.elasticache.User(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an ElastiCache user group resource. */
  def UserGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.elasticache.UserGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.elasticache.UserGroupArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.elasticache.UserGroup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Associate an existing ElastiCache user and an existing user group.
   * 
   * &gt; Pulumi will detect changes in the `aws.elasticache.UserGroup` since `aws.elasticache.UserGroupAssociation` changes the user IDs associated with the user group. You can ignore these changes with the `lifecycle` `ignoreChanges` meta argument as shown in the example.
   */
  def UserGroupAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.elasticache.UserGroupAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.elasticache.UserGroupAssociationArgs.builder
    com.pulumi.aws.elasticache.UserGroupAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
