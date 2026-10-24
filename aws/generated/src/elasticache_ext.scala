package jp.ukiba.ko_pulumi
package aws

object elasticache_ext:
  extension (builder: com.pulumi.aws.elasticache.ClusterArgs.Builder)
    /**
     * @param logDeliveryConfigurations Specifies the destination and format of Redis [SLOWLOG](https://redis.io/commands/slowlog) or Redis [Engine Log](https://docs.aws.amazon.com/AmazonElastiCache/latest/dg/Log_Delivery.html#Log_contents-engine-log). See the documentation on [Amazon ElastiCache](https://docs.aws.amazon.com/AmazonElastiCache/latest/dg/Log_Delivery.html). See Log Delivery Configuration below for more details.
     * @return builder
     */
    def logDeliveryConfigurations(args: Endofunction[com.pulumi.aws.elasticache.inputs.ClusterLogDeliveryConfigurationArgs.Builder]*):
        com.pulumi.aws.elasticache.ClusterArgs.Builder =
      def argsBuilder = com.pulumi.aws.elasticache.inputs.ClusterLogDeliveryConfigurationArgs.builder
      builder.logDeliveryConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.elasticache.ParameterGroupArgs.Builder)
    /**
     * @param parameters A list of ElastiCache parameters to apply.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.elasticache.inputs.ParameterGroupParameterArgs.Builder]*):
        com.pulumi.aws.elasticache.ParameterGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.elasticache.inputs.ParameterGroupParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

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

  extension (builder: com.pulumi.aws.elasticache.ReservedCacheNodeArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.elasticache.inputs.ReservedCacheNodeTimeoutsArgs.Builder]):
        com.pulumi.aws.elasticache.ReservedCacheNodeArgs.Builder =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.ReservedCacheNodeTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

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

  extension (builder: com.pulumi.aws.elasticache.UserArgs.Builder)
    /**
     * @param authenticationMode Denotes the user&#39;s authentication properties. Detailed below.
     * @return builder
     */
    def authenticationMode(args: Endofunction[com.pulumi.aws.elasticache.inputs.UserAuthenticationModeArgs.Builder]):
        com.pulumi.aws.elasticache.UserArgs.Builder =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.UserAuthenticationModeArgs.builder
      builder.authenticationMode(args(argsBuilder).build)

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

  extension (builder: com.pulumi.aws.elasticache.inputs.GetUserArgs.Builder)
    def authenticationModes(args: Endofunction[com.pulumi.aws.elasticache.inputs.GetUserAuthenticationModeArgs.Builder]*):
        com.pulumi.aws.elasticache.inputs.GetUserArgs.Builder =
      def argsBuilder = com.pulumi.aws.elasticache.inputs.GetUserAuthenticationModeArgs.builder
      builder.authenticationModes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.elasticache.inputs.GetUserPlainArgs.Builder)
    def authenticationModes(args: Endofunction[com.pulumi.aws.elasticache.inputs.GetUserAuthenticationMode.Builder]*):
        com.pulumi.aws.elasticache.inputs.GetUserPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.elasticache.inputs.GetUserAuthenticationMode.builder
      builder.authenticationModes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.elasticache.inputs.GlobalReplicationGroupState.Builder)
    /**
     * @param globalNodeGroups Set of node groups (shards) on the global replication group.
     * Has the values:
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

  extension (builder: com.pulumi.aws.elasticache.inputs.UserState.Builder)
    /**
     * @param authenticationMode Denotes the user&#39;s authentication properties. Detailed below.
     * @return builder
     */
    def authenticationMode(args: Endofunction[com.pulumi.aws.elasticache.inputs.UserAuthenticationModeArgs.Builder]):
        com.pulumi.aws.elasticache.inputs.UserState.Builder =
      val argsBuilder = com.pulumi.aws.elasticache.inputs.UserAuthenticationModeArgs.builder
      builder.authenticationMode(args(argsBuilder).build)
