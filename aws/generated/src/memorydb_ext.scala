package jp.ukiba.ko_pulumi
package aws

object memorydb_ext:
  extension (builder: com.pulumi.aws.memorydb.MultiRegionClusterArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.memorydb.inputs.MultiRegionClusterTimeoutsArgs.Builder]):
        com.pulumi.aws.memorydb.MultiRegionClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.memorydb.inputs.MultiRegionClusterTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.memorydb.ParameterGroupArgs.Builder)
    /**
     * @param parameters Set of MemoryDB parameters to apply. Any parameters not specified will fall back to their family defaults. Detailed below.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.memorydb.inputs.ParameterGroupParameterArgs.Builder]*):
        com.pulumi.aws.memorydb.ParameterGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.memorydb.inputs.ParameterGroupParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.memorydb.UserArgs.Builder)
    /**
     * @param authenticationMode Authentication properties for the user. Detailed below.
     * @return builder
     */
    def authenticationMode(args: Endofunction[com.pulumi.aws.memorydb.inputs.UserAuthenticationModeArgs.Builder]):
        com.pulumi.aws.memorydb.UserArgs.Builder =
      val argsBuilder = com.pulumi.aws.memorydb.inputs.UserAuthenticationModeArgs.builder
      builder.authenticationMode(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.memorydb.inputs.ClusterShardArgs.Builder)
    /**
     * @param nodes Set of nodes in this shard.
     * @return builder
     */
    def nodes(args: Endofunction[com.pulumi.aws.memorydb.inputs.ClusterShardNodeArgs.Builder]*):
        com.pulumi.aws.memorydb.inputs.ClusterShardArgs.Builder =
      def argsBuilder = com.pulumi.aws.memorydb.inputs.ClusterShardNodeArgs.builder
      builder.nodes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.memorydb.inputs.ClusterShardNodeArgs.Builder)
    def endpoints(args: Endofunction[com.pulumi.aws.memorydb.inputs.ClusterShardNodeEndpointArgs.Builder]*):
        com.pulumi.aws.memorydb.inputs.ClusterShardNodeArgs.Builder =
      def argsBuilder = com.pulumi.aws.memorydb.inputs.ClusterShardNodeEndpointArgs.builder
      builder.endpoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.memorydb.inputs.ClusterState.Builder)
    def clusterEndpoints(args: Endofunction[com.pulumi.aws.memorydb.inputs.ClusterClusterEndpointArgs.Builder]*):
        com.pulumi.aws.memorydb.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.aws.memorydb.inputs.ClusterClusterEndpointArgs.builder
      builder.clusterEndpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param shards Set of shards in this cluster.
     * @return builder
     */
    def shards(args: Endofunction[com.pulumi.aws.memorydb.inputs.ClusterShardArgs.Builder]*):
        com.pulumi.aws.memorydb.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.aws.memorydb.inputs.ClusterShardArgs.builder
      builder.shards(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.memorydb.inputs.MultiRegionClusterState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.memorydb.inputs.MultiRegionClusterTimeoutsArgs.Builder]):
        com.pulumi.aws.memorydb.inputs.MultiRegionClusterState.Builder =
      val argsBuilder = com.pulumi.aws.memorydb.inputs.MultiRegionClusterTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.memorydb.inputs.ParameterGroupState.Builder)
    /**
     * @param parameters Set of MemoryDB parameters to apply. Any parameters not specified will fall back to their family defaults. Detailed below.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.memorydb.inputs.ParameterGroupParameterArgs.Builder]*):
        com.pulumi.aws.memorydb.inputs.ParameterGroupState.Builder =
      def argsBuilder = com.pulumi.aws.memorydb.inputs.ParameterGroupParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.memorydb.inputs.SnapshotState.Builder)
    /**
     * @param clusterConfigurations Configuration of the cluster from which the snapshot was taken.
     * @return builder
     */
    def clusterConfigurations(args: Endofunction[com.pulumi.aws.memorydb.inputs.SnapshotClusterConfigurationArgs.Builder]*):
        com.pulumi.aws.memorydb.inputs.SnapshotState.Builder =
      def argsBuilder = com.pulumi.aws.memorydb.inputs.SnapshotClusterConfigurationArgs.builder
      builder.clusterConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.memorydb.inputs.UserState.Builder)
    /**
     * @param authenticationMode Authentication properties for the user. Detailed below.
     * @return builder
     */
    def authenticationMode(args: Endofunction[com.pulumi.aws.memorydb.inputs.UserAuthenticationModeArgs.Builder]):
        com.pulumi.aws.memorydb.inputs.UserState.Builder =
      val argsBuilder = com.pulumi.aws.memorydb.inputs.UserAuthenticationModeArgs.builder
      builder.authenticationMode(args(argsBuilder).build)
