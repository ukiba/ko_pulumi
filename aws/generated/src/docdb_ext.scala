package jp.ukiba.ko_pulumi
package aws

object docdb_ext:
  extension (builder: com.pulumi.aws.docdb.ClusterArgs.Builder)
    /**
     * @param restoreToPointInTime A configuration block for restoring a DB instance to an arbitrary point in time. Requires the `identifier` argument to be set with the name of the new DB instance to be created. See Restore To Point In Time below for details.
     * @return builder
     */
    def restoreToPointInTime(args: Endofunction[com.pulumi.aws.docdb.inputs.ClusterRestoreToPointInTimeArgs.Builder]):
        com.pulumi.aws.docdb.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.docdb.inputs.ClusterRestoreToPointInTimeArgs.builder
      builder.restoreToPointInTime(args(argsBuilder).build)

    /**
     * @param serverlessV2ScalingConfiguration Scaling configuration of an Amazon DocumentDB Serverless cluster. See Serverless V2 Scaling Configuration below for details.
     * @return builder
     */
    def serverlessV2ScalingConfiguration(args: Endofunction[com.pulumi.aws.docdb.inputs.ClusterServerlessV2ScalingConfigurationArgs.Builder]):
        com.pulumi.aws.docdb.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.docdb.inputs.ClusterServerlessV2ScalingConfigurationArgs.builder
      builder.serverlessV2ScalingConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.docdb.ClusterParameterGroupArgs.Builder)
    /**
     * @param parameters A list of DocumentDB parameters to apply. Setting parameters to system default values may show a difference on imported resources.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.docdb.inputs.ClusterParameterGroupParameterArgs.Builder]*):
        com.pulumi.aws.docdb.ClusterParameterGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.docdb.inputs.ClusterParameterGroupParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.docdb.ElasticClusterArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.docdb.inputs.ElasticClusterTimeoutsArgs.Builder]):
        com.pulumi.aws.docdb.ElasticClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.docdb.inputs.ElasticClusterTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.docdb.inputs.ClusterParameterGroupState.Builder)
    /**
     * @param parameters A list of DocumentDB parameters to apply. Setting parameters to system default values may show a difference on imported resources.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.docdb.inputs.ClusterParameterGroupParameterArgs.Builder]*):
        com.pulumi.aws.docdb.inputs.ClusterParameterGroupState.Builder =
      def argsBuilder = com.pulumi.aws.docdb.inputs.ClusterParameterGroupParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.docdb.inputs.ClusterState.Builder)
    def masterUserSecrets(args: Endofunction[com.pulumi.aws.docdb.inputs.ClusterMasterUserSecretArgs.Builder]*):
        com.pulumi.aws.docdb.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.aws.docdb.inputs.ClusterMasterUserSecretArgs.builder
      builder.masterUserSecrets(args.map(_(argsBuilder).build)*)

    /**
     * @param restoreToPointInTime A configuration block for restoring a DB instance to an arbitrary point in time. Requires the `identifier` argument to be set with the name of the new DB instance to be created. See Restore To Point In Time below for details.
     * @return builder
     */
    def restoreToPointInTime(args: Endofunction[com.pulumi.aws.docdb.inputs.ClusterRestoreToPointInTimeArgs.Builder]):
        com.pulumi.aws.docdb.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.docdb.inputs.ClusterRestoreToPointInTimeArgs.builder
      builder.restoreToPointInTime(args(argsBuilder).build)

    /**
     * @param serverlessV2ScalingConfiguration Scaling configuration of an Amazon DocumentDB Serverless cluster. See Serverless V2 Scaling Configuration below for details.
     * @return builder
     */
    def serverlessV2ScalingConfiguration(args: Endofunction[com.pulumi.aws.docdb.inputs.ClusterServerlessV2ScalingConfigurationArgs.Builder]):
        com.pulumi.aws.docdb.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.docdb.inputs.ClusterServerlessV2ScalingConfigurationArgs.builder
      builder.serverlessV2ScalingConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.docdb.inputs.ElasticClusterState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.docdb.inputs.ElasticClusterTimeoutsArgs.Builder]):
        com.pulumi.aws.docdb.inputs.ElasticClusterState.Builder =
      val argsBuilder = com.pulumi.aws.docdb.inputs.ElasticClusterTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.docdb.inputs.GlobalClusterState.Builder)
    /**
     * @param globalClusterMembers Set of objects containing Global Cluster members.
     * @return builder
     */
    def globalClusterMembers(args: Endofunction[com.pulumi.aws.docdb.inputs.GlobalClusterGlobalClusterMemberArgs.Builder]*):
        com.pulumi.aws.docdb.inputs.GlobalClusterState.Builder =
      def argsBuilder = com.pulumi.aws.docdb.inputs.GlobalClusterGlobalClusterMemberArgs.builder
      builder.globalClusterMembers(args.map(_(argsBuilder).build)*)
