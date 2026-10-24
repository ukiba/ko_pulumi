package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object redis:
  /**
   * Manages a Redis Cache.
   * 
   * &gt; **Note:** Redis version 4 is being retired and no longer supports creating new instances. Version 4 will be removed in a future release. [Redis Version 4 Retirement](https://learn.microsoft.com/azure/azure-cache-for-redis/cache-retired-features#important-upgrade-timelines)
   */
  inline def Cache(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.redis.CacheArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.redis.CacheArgs.builder
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
    com.pulumi.azure.redis.Cache(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Redis Cache Access Policy */
  inline def CacheAccessPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.redis.CacheAccessPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.redis.CacheAccessPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.redis.CacheAccessPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Redis Cache Access Policy Assignment */
  inline def CacheAccessPolicyAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.redis.CacheAccessPolicyAssignmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.redis.CacheAccessPolicyAssignmentArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.redis.CacheAccessPolicyAssignment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Redis Enterprise Cluster.
   * 
   * &gt; **Note:** This resource has been deprecated in favor of azurerm_managed_redis.
   */
  inline def EnterpriseCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.redis.EnterpriseClusterArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.redis.EnterpriseClusterArgs.builder
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
    com.pulumi.azure.redis.EnterpriseCluster(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Redis Enterprise Database.
   * 
   * &gt; **Note:** This resource has been deprecated in favor of azurerm_managed_redis.
   */
  inline def EnterpriseDatabase(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.redis.EnterpriseDatabaseArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.redis.EnterpriseDatabaseArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.redis.EnterpriseDatabase(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Firewall Rule associated with a Redis Cache. */
  inline def FirewallRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.redis.FirewallRuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.redis.FirewallRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.redis.FirewallRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Redis Linked Server (ie Geo Location) */
  inline def LinkedServer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.redis.LinkedServerArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.redis.LinkedServerArgs.builder
    com.pulumi.azure.redis.LinkedServer(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object RedisFunctions:
    /** Use this data source to access information about an existing Redis Cache */
    inline def getCache(args: Endofunction[com.pulumi.azure.redis.inputs.GetCacheArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.redis.outputs.GetCacheResult] =
      val argsBuilder = com.pulumi.azure.redis.inputs.GetCacheArgs.builder
      com.pulumi.azure.redis.RedisFunctions.getCache(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Redis Cache */
    inline def getCachePlain(args: Endofunction[com.pulumi.azure.redis.inputs.GetCachePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.redis.outputs.GetCacheResult] =
      val argsBuilder = com.pulumi.azure.redis.inputs.GetCachePlainArgs.builder
      com.pulumi.azure.redis.RedisFunctions.getCachePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Use this data source to access information about an existing Redis Enterprise Database
     * 
     * &gt; **Note:** This data source has been deprecated in favor of azurerm_managed_redis.
     */
    inline def getEnterpriseDatabase(args: Endofunction[com.pulumi.azure.redis.inputs.GetEnterpriseDatabaseArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.redis.outputs.GetEnterpriseDatabaseResult] =
      val argsBuilder = com.pulumi.azure.redis.inputs.GetEnterpriseDatabaseArgs.builder
      com.pulumi.azure.redis.RedisFunctions.getEnterpriseDatabase(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to access information about an existing Redis Enterprise Database
     * 
     * &gt; **Note:** This data source has been deprecated in favor of azurerm_managed_redis.
     */
    inline def getEnterpriseDatabasePlain(args: Endofunction[com.pulumi.azure.redis.inputs.GetEnterpriseDatabasePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.redis.outputs.GetEnterpriseDatabaseResult] =
      val argsBuilder = com.pulumi.azure.redis.inputs.GetEnterpriseDatabasePlainArgs.builder
      com.pulumi.azure.redis.RedisFunctions.getEnterpriseDatabasePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
