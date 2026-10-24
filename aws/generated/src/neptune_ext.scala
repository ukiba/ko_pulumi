package jp.ukiba.ko_pulumi
package aws

object neptune_ext:
  extension (builder: com.pulumi.aws.neptune.ClusterArgs.Builder)
    /**
     * @param serverlessV2ScalingConfiguration If set, create the Neptune cluster as a serverless one. See Serverless for example block attributes.
     * @return builder
     */
    def serverlessV2ScalingConfiguration(args: Endofunction[com.pulumi.aws.neptune.inputs.ClusterServerlessV2ScalingConfigurationArgs.Builder]):
        com.pulumi.aws.neptune.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.neptune.inputs.ClusterServerlessV2ScalingConfigurationArgs.builder
      builder.serverlessV2ScalingConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.neptune.ClusterParameterGroupArgs.Builder)
    /**
     * @param parameters A list of neptune parameters to apply.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.neptune.inputs.ClusterParameterGroupParameterArgs.Builder]*):
        com.pulumi.aws.neptune.ClusterParameterGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.neptune.inputs.ClusterParameterGroupParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.neptune.ParameterGroupArgs.Builder)
    /**
     * @param parameters A list of Neptune parameters to apply.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.neptune.inputs.ParameterGroupParameterArgs.Builder]*):
        com.pulumi.aws.neptune.ParameterGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.neptune.inputs.ParameterGroupParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.neptune.inputs.ClusterParameterGroupState.Builder)
    /**
     * @param parameters A list of neptune parameters to apply.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.neptune.inputs.ClusterParameterGroupParameterArgs.Builder]*):
        com.pulumi.aws.neptune.inputs.ClusterParameterGroupState.Builder =
      def argsBuilder = com.pulumi.aws.neptune.inputs.ClusterParameterGroupParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.neptune.inputs.ClusterState.Builder)
    /**
     * @param serverlessV2ScalingConfiguration If set, create the Neptune cluster as a serverless one. See Serverless for example block attributes.
     * @return builder
     */
    def serverlessV2ScalingConfiguration(args: Endofunction[com.pulumi.aws.neptune.inputs.ClusterServerlessV2ScalingConfigurationArgs.Builder]):
        com.pulumi.aws.neptune.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.neptune.inputs.ClusterServerlessV2ScalingConfigurationArgs.builder
      builder.serverlessV2ScalingConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.neptune.inputs.GlobalClusterState.Builder)
    /**
     * @param globalClusterMembers Set of objects containing Global Cluster members.
     * @return builder
     */
    def globalClusterMembers(args: Endofunction[com.pulumi.aws.neptune.inputs.GlobalClusterGlobalClusterMemberArgs.Builder]*):
        com.pulumi.aws.neptune.inputs.GlobalClusterState.Builder =
      def argsBuilder = com.pulumi.aws.neptune.inputs.GlobalClusterGlobalClusterMemberArgs.builder
      builder.globalClusterMembers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.neptune.inputs.ParameterGroupState.Builder)
    /**
     * @param parameters A list of Neptune parameters to apply.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.neptune.inputs.ParameterGroupParameterArgs.Builder]*):
        com.pulumi.aws.neptune.inputs.ParameterGroupState.Builder =
      def argsBuilder = com.pulumi.aws.neptune.inputs.ParameterGroupParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)
