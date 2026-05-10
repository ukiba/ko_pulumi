package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object redis:
  /** Manages a Firewall Rule associated with a Redis Cache. */
  def FirewallRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.redis.FirewallRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.redis.FirewallRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.redis.FirewallRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Redis Enterprise Cluster.
   * 
   *  &gt; **Note:** This resource has been deprecated in favor of azurerm_managed_redis.
   */
  def EnterpriseCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.redis.EnterpriseClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.redis.EnterpriseClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.redis.EnterpriseCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Redis Cache Access Policy */
  def CacheAccessPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.redis.CacheAccessPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.redis.CacheAccessPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.redis.CacheAccessPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type RedisFunctions = com.pulumi.azure.redis.RedisFunctions
  object RedisFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.redis.RedisFunctions.*
  extension (self: RedisFunctions.type)
    /** Use this data source to access information about an existing Redis Cache */
    def getCache(args: Endofunction[com.pulumi.azure.redis.inputs.GetCacheArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.redis.outputs.GetCacheResult] =
      val argsBuilder = com.pulumi.azure.redis.inputs.GetCacheArgs.builder
      com.pulumi.azure.redis.RedisFunctions.getCache(args(argsBuilder).build)

    /** Use this data source to access information about an existing Redis Cache */
    def getCachePlain(args: Endofunction[com.pulumi.azure.redis.inputs.GetCachePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.redis.outputs.GetCacheResult] =
      val argsBuilder = com.pulumi.azure.redis.inputs.GetCachePlainArgs.builder
      com.pulumi.azure.redis.RedisFunctions.getCachePlain(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing Redis Enterprise Database
     * 
     *  &gt; **Note:** This data source has been deprecated in favor of azurerm_managed_redis.
     */
    def getEnterpriseDatabase(args: Endofunction[com.pulumi.azure.redis.inputs.GetEnterpriseDatabaseArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.redis.outputs.GetEnterpriseDatabaseResult] =
      val argsBuilder = com.pulumi.azure.redis.inputs.GetEnterpriseDatabaseArgs.builder
      com.pulumi.azure.redis.RedisFunctions.getEnterpriseDatabase(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing Redis Enterprise Database
     * 
     *  &gt; **Note:** This data source has been deprecated in favor of azurerm_managed_redis.
     */
    def getEnterpriseDatabasePlain(args: Endofunction[com.pulumi.azure.redis.inputs.GetEnterpriseDatabasePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.redis.outputs.GetEnterpriseDatabaseResult] =
      val argsBuilder = com.pulumi.azure.redis.inputs.GetEnterpriseDatabasePlainArgs.builder
      com.pulumi.azure.redis.RedisFunctions.getEnterpriseDatabasePlain(args(argsBuilder).build)

  /**
   * Manages a Redis Enterprise Database.
   * 
   *  &gt; **Note:** This resource has been deprecated in favor of azurerm_managed_redis.
   */
  def EnterpriseDatabase(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.redis.EnterpriseDatabaseArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.redis.EnterpriseDatabaseArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.redis.EnterpriseDatabase(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Redis Cache.
   * 
   *  &gt; **Note:** Redis version 4 is being retired and no longer supports creating new instances. Version 4 will be removed in a future release. [Redis Version 4 Retirement](https://learn.microsoft.com/azure/azure-cache-for-redis/cache-retired-features#important-upgrade-timelines)
   */
  def Cache(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.redis.CacheArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.redis.CacheArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.redis.Cache(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.redis.CacheArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.redis.inputs.CacheIdentityArgs.Builder]):
        com.pulumi.azure.redis.CacheArgs.Builder =
      val argsBuilder = com.pulumi.azure.redis.inputs.CacheIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param patchSchedules A list of `patchSchedule` blocks as defined below.
     * @return builder
     */
    def patchSchedules(args: Endofunction[com.pulumi.azure.redis.inputs.CachePatchScheduleArgs.Builder]*):
        com.pulumi.azure.redis.CacheArgs.Builder =
      def argsBuilder = com.pulumi.azure.redis.inputs.CachePatchScheduleArgs.builder
      builder.patchSchedules(args.map(_(argsBuilder).build)*)

    /**
     * @param redisConfiguration A `redisConfiguration` block as defined below - with some limitations by SKU - defaults/details are shown below.
     * @return builder
     */
    def redisConfiguration(args: Endofunction[com.pulumi.azure.redis.inputs.CacheRedisConfigurationArgs.Builder]):
        com.pulumi.azure.redis.CacheArgs.Builder =
      val argsBuilder = com.pulumi.azure.redis.inputs.CacheRedisConfigurationArgs.builder
      builder.redisConfiguration(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.redis.CacheArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Redis Cache Access Policy Assignment */
  def CacheAccessPolicyAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.redis.CacheAccessPolicyAssignmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.redis.CacheAccessPolicyAssignmentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.redis.CacheAccessPolicyAssignment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Redis Linked Server (ie Geo Location) */
  def LinkedServer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.redis.LinkedServerArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.redis.LinkedServerArgs.builder
    com.pulumi.azure.redis.LinkedServer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.redis.EnterpriseDatabaseArgs.Builder)
    /**
     * @param modules A `module` block as defined below. Changing this forces a new resource to be created.
     * 
     *  &gt; **Note:** Only `RediSearch` and `RedisJSON` modules are allowed with geo-replication
     * @return builder
     */
    def modules(args: Endofunction[com.pulumi.azure.redis.inputs.EnterpriseDatabaseModuleArgs.Builder]*):
        com.pulumi.azure.redis.EnterpriseDatabaseArgs.Builder =
      def argsBuilder = com.pulumi.azure.redis.inputs.EnterpriseDatabaseModuleArgs.builder
      builder.modules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.redis.inputs.CacheState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.redis.inputs.CacheIdentityArgs.Builder]):
        com.pulumi.azure.redis.inputs.CacheState.Builder =
      val argsBuilder = com.pulumi.azure.redis.inputs.CacheIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param patchSchedules A list of `patchSchedule` blocks as defined below.
     * @return builder
     */
    def patchSchedules(args: Endofunction[com.pulumi.azure.redis.inputs.CachePatchScheduleArgs.Builder]*):
        com.pulumi.azure.redis.inputs.CacheState.Builder =
      def argsBuilder = com.pulumi.azure.redis.inputs.CachePatchScheduleArgs.builder
      builder.patchSchedules(args.map(_(argsBuilder).build)*)

    /**
     * @param redisConfiguration A `redisConfiguration` block as defined below - with some limitations by SKU - defaults/details are shown below.
     * @return builder
     */
    def redisConfiguration(args: Endofunction[com.pulumi.azure.redis.inputs.CacheRedisConfigurationArgs.Builder]):
        com.pulumi.azure.redis.inputs.CacheState.Builder =
      val argsBuilder = com.pulumi.azure.redis.inputs.CacheRedisConfigurationArgs.builder
      builder.redisConfiguration(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.redis.inputs.CacheState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.redis.inputs.EnterpriseDatabaseState.Builder)
    /**
     * @param modules A `module` block as defined below. Changing this forces a new resource to be created.
     * 
     *  &gt; **Note:** Only `RediSearch` and `RedisJSON` modules are allowed with geo-replication
     * @return builder
     */
    def modules(args: Endofunction[com.pulumi.azure.redis.inputs.EnterpriseDatabaseModuleArgs.Builder]*):
        com.pulumi.azure.redis.inputs.EnterpriseDatabaseState.Builder =
      def argsBuilder = com.pulumi.azure.redis.inputs.EnterpriseDatabaseModuleArgs.builder
      builder.modules(args.map(_(argsBuilder).build)*)
