package jp.ukiba.ko_pulumi
package azure

object redis_ext:
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

  extension (builder: com.pulumi.azure.redis.EnterpriseDatabaseArgs.Builder)
    /**
     * @param modules A `module` block as defined below. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** Only `RediSearch` and `RedisJSON` modules are allowed with geo-replication
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

  extension (builder: com.pulumi.azure.redis.inputs.EnterpriseDatabaseState.Builder)
    /**
     * @param modules A `module` block as defined below. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** Only `RediSearch` and `RedisJSON` modules are allowed with geo-replication
     * @return builder
     */
    def modules(args: Endofunction[com.pulumi.azure.redis.inputs.EnterpriseDatabaseModuleArgs.Builder]*):
        com.pulumi.azure.redis.inputs.EnterpriseDatabaseState.Builder =
      def argsBuilder = com.pulumi.azure.redis.inputs.EnterpriseDatabaseModuleArgs.builder
      builder.modules(args.map(_(argsBuilder).build)*)
