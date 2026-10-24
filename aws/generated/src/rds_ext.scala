package jp.ukiba.ko_pulumi
package aws

object rds_ext:
  extension (builder: com.pulumi.aws.rds.ClusterArgs.Builder)
    /**
     * @param restoreToPointInTime Nested attribute for [point in time restore](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-pitr.html). More details below.
     * @return builder
     */
    inline def restoreToPointInTime(args: Endofunction[com.pulumi.aws.rds.inputs.ClusterRestoreToPointInTimeArgs.Builder]):
        com.pulumi.aws.rds.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.ClusterRestoreToPointInTimeArgs.builder
      builder.restoreToPointInTime(args(argsBuilder).build)

    inline def s3Import(args: Endofunction[com.pulumi.aws.rds.inputs.ClusterS3ImportArgs.Builder]):
        com.pulumi.aws.rds.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.ClusterS3ImportArgs.builder
      builder.s3Import(args(argsBuilder).build)

    /**
     * @param scalingConfiguration Nested attribute with scaling properties. Only valid when `engineMode` is set to `serverless`. More details below.
     * @return builder
     */
    inline def scalingConfiguration(args: Endofunction[com.pulumi.aws.rds.inputs.ClusterScalingConfigurationArgs.Builder]):
        com.pulumi.aws.rds.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.ClusterScalingConfigurationArgs.builder
      builder.scalingConfiguration(args(argsBuilder).build)

    /**
     * @param serverlessv2ScalingConfiguration Nested attribute with scaling properties for ServerlessV2. Only valid when `engineMode` is set to `provisioned`. More details below.
     * @return builder
     */
    inline def serverlessv2ScalingConfiguration(args: Endofunction[com.pulumi.aws.rds.inputs.ClusterServerlessv2ScalingConfigurationArgs.Builder]):
        com.pulumi.aws.rds.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.ClusterServerlessv2ScalingConfigurationArgs.builder
      builder.serverlessv2ScalingConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.rds.ClusterParameterGroupArgs.Builder)
    /**
     * @param parameters Set of DB parameters to apply. Note that parameters may differ from a family to an other. Full list of all parameters can be discovered via [`aws rds describe-db-cluster-parameters`](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-cluster-parameters.html) after initial creation of the group. See `parameter` Block below for details.
     * @return builder
     */
    inline def parameters(args: Endofunction[com.pulumi.aws.rds.inputs.ClusterParameterGroupParameterArgs.Builder]*):
        com.pulumi.aws.rds.ClusterParameterGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.rds.inputs.ClusterParameterGroupParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.rds.ClusterSnapshotCopyArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.rds.inputs.ClusterSnapshotCopyTimeoutsArgs.Builder]):
        com.pulumi.aws.rds.ClusterSnapshotCopyArgs.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.ClusterSnapshotCopyTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.rds.ExportTaskArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.rds.inputs.ExportTaskTimeoutsArgs.Builder]):
        com.pulumi.aws.rds.ExportTaskArgs.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.ExportTaskTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.rds.InstanceArgs.Builder)
    /**
     * @param blueGreenUpdate Enables low-downtime updates using [RDS Blue/Green deployments](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/blue-green-deployments.html). See `blueGreenUpdate` Block below.
     * @return builder
     */
    inline def blueGreenUpdate(args: Endofunction[com.pulumi.aws.rds.inputs.InstanceBlueGreenUpdateArgs.Builder]):
        com.pulumi.aws.rds.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.InstanceBlueGreenUpdateArgs.builder
      builder.blueGreenUpdate(args(argsBuilder).build)

    /**
     * @param restoreToPointInTime Configuration block for restoring a DB instance to an arbitrary point in time. Requires the `identifier` argument to be set with the name of the new DB instance to be created. See `restoreToPointInTime` Block below for details.
     * @return builder
     */
    inline def restoreToPointInTime(args: Endofunction[com.pulumi.aws.rds.inputs.InstanceRestoreToPointInTimeArgs.Builder]):
        com.pulumi.aws.rds.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.InstanceRestoreToPointInTimeArgs.builder
      builder.restoreToPointInTime(args(argsBuilder).build)

    /**
     * @param s3Import Restore from a Percona XtraBackup in S3. See [Importing Data into an Amazon RDS MySQL DB Instance](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/MySQL.Procedural.Importing.html). See `s3Import` Block below.
     * @return builder
     */
    inline def s3Import(args: Endofunction[com.pulumi.aws.rds.inputs.InstanceS3ImportArgs.Builder]):
        com.pulumi.aws.rds.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.InstanceS3ImportArgs.builder
      builder.s3Import(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.rds.InstanceDesiredStateArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.rds.inputs.InstanceDesiredStateTimeoutsArgs.Builder]):
        com.pulumi.aws.rds.InstanceDesiredStateArgs.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.InstanceDesiredStateTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.rds.IntegrationArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.rds.inputs.IntegrationTimeoutsArgs.Builder]):
        com.pulumi.aws.rds.IntegrationArgs.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.IntegrationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.rds.OptionGroupArgs.Builder)
    /**
     * @param options Options to apply. See `option` Block below for more details.
     * @return builder
     */
    inline def options(args: Endofunction[com.pulumi.aws.rds.inputs.OptionGroupOptionArgs.Builder]*):
        com.pulumi.aws.rds.OptionGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.rds.inputs.OptionGroupOptionArgs.builder
      builder.options(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.rds.ParameterGroupArgs.Builder)
    /**
     * @param parameters DB parameters to apply. See `parameter` Block below for more details. Note that parameters may differ from a family to an other. Full list of all parameters can be discovered via [`aws rds describe-db-parameters`](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-parameters.html) after initial creation of the group.
     * @return builder
     */
    inline def parameters(args: Endofunction[com.pulumi.aws.rds.inputs.ParameterGroupParameterArgs.Builder]*):
        com.pulumi.aws.rds.ParameterGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.rds.inputs.ParameterGroupParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.rds.ProxyArgs.Builder)
    /**
     * @param auths Configuration block(s) with authorization mechanisms to connect to the associated instances or clusters. Required when `defaultAuthScheme` is `NONE` or unspecified. See the `auth` block below.
     * @return builder
     */
    inline def auths(args: Endofunction[com.pulumi.aws.rds.inputs.ProxyAuthArgs.Builder]*):
        com.pulumi.aws.rds.ProxyArgs.Builder =
      def argsBuilder = com.pulumi.aws.rds.inputs.ProxyAuthArgs.builder
      builder.auths(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.rds.ProxyDefaultTargetGroupArgs.Builder)
    /**
     * @param connectionPoolConfig Settings that determine the size and behavior of the connection pool for the target group. See `connectionPoolConfig` Block for details.
     * @return builder
     */
    inline def connectionPoolConfig(args: Endofunction[com.pulumi.aws.rds.inputs.ProxyDefaultTargetGroupConnectionPoolConfigArgs.Builder]):
        com.pulumi.aws.rds.ProxyDefaultTargetGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.ProxyDefaultTargetGroupConnectionPoolConfigArgs.builder
      builder.connectionPoolConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.rds.ShardGroupArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.rds.inputs.ShardGroupTimeoutsArgs.Builder]):
        com.pulumi.aws.rds.ShardGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.ShardGroupTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.rds.inputs.ClusterParameterGroupState.Builder)
    /**
     * @param parameters Set of DB parameters to apply. Note that parameters may differ from a family to an other. Full list of all parameters can be discovered via [`aws rds describe-db-cluster-parameters`](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-cluster-parameters.html) after initial creation of the group. See `parameter` Block below for details.
     * @return builder
     */
    inline def parameters(args: Endofunction[com.pulumi.aws.rds.inputs.ClusterParameterGroupParameterArgs.Builder]*):
        com.pulumi.aws.rds.inputs.ClusterParameterGroupState.Builder =
      def argsBuilder = com.pulumi.aws.rds.inputs.ClusterParameterGroupParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.rds.inputs.ClusterSnapshotCopyState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.rds.inputs.ClusterSnapshotCopyTimeoutsArgs.Builder]):
        com.pulumi.aws.rds.inputs.ClusterSnapshotCopyState.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.ClusterSnapshotCopyTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.rds.inputs.ClusterState.Builder)
    /**
     * @param masterUserSecrets Block that specifies the master user secret. Only available when `manageMasterUserPassword` is set to true. Documented below.
     * @return builder
     */
    inline def masterUserSecrets(args: Endofunction[com.pulumi.aws.rds.inputs.ClusterMasterUserSecretArgs.Builder]*):
        com.pulumi.aws.rds.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.aws.rds.inputs.ClusterMasterUserSecretArgs.builder
      builder.masterUserSecrets(args.map(_(argsBuilder).build)*)

    /**
     * @param restoreToPointInTime Nested attribute for [point in time restore](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-pitr.html). More details below.
     * @return builder
     */
    inline def restoreToPointInTime(args: Endofunction[com.pulumi.aws.rds.inputs.ClusterRestoreToPointInTimeArgs.Builder]):
        com.pulumi.aws.rds.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.ClusterRestoreToPointInTimeArgs.builder
      builder.restoreToPointInTime(args(argsBuilder).build)

    inline def s3Import(args: Endofunction[com.pulumi.aws.rds.inputs.ClusterS3ImportArgs.Builder]):
        com.pulumi.aws.rds.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.ClusterS3ImportArgs.builder
      builder.s3Import(args(argsBuilder).build)

    /**
     * @param scalingConfiguration Nested attribute with scaling properties. Only valid when `engineMode` is set to `serverless`. More details below.
     * @return builder
     */
    inline def scalingConfiguration(args: Endofunction[com.pulumi.aws.rds.inputs.ClusterScalingConfigurationArgs.Builder]):
        com.pulumi.aws.rds.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.ClusterScalingConfigurationArgs.builder
      builder.scalingConfiguration(args(argsBuilder).build)

    /**
     * @param serverlessv2ScalingConfiguration Nested attribute with scaling properties for ServerlessV2. Only valid when `engineMode` is set to `provisioned`. More details below.
     * @return builder
     */
    inline def serverlessv2ScalingConfiguration(args: Endofunction[com.pulumi.aws.rds.inputs.ClusterServerlessv2ScalingConfigurationArgs.Builder]):
        com.pulumi.aws.rds.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.ClusterServerlessv2ScalingConfigurationArgs.builder
      builder.serverlessv2ScalingConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.rds.inputs.ExportTaskState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.rds.inputs.ExportTaskTimeoutsArgs.Builder]):
        com.pulumi.aws.rds.inputs.ExportTaskState.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.ExportTaskTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.rds.inputs.GetClustersArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.rds.inputs.GetClustersFilterArgs.Builder]*):
        com.pulumi.aws.rds.inputs.GetClustersArgs.Builder =
      def argsBuilder = com.pulumi.aws.rds.inputs.GetClustersFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.rds.inputs.GetClustersPlainArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.rds.inputs.GetClustersFilter.Builder]*):
        com.pulumi.aws.rds.inputs.GetClustersPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.rds.inputs.GetClustersFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.rds.inputs.GetEngineVersionArgs.Builder)
    /**
     * @param filters Configuration block for filtering versions. See `filter` Block below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.rds.inputs.GetEngineVersionFilterArgs.Builder]*):
        com.pulumi.aws.rds.inputs.GetEngineVersionArgs.Builder =
      def argsBuilder = com.pulumi.aws.rds.inputs.GetEngineVersionFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.rds.inputs.GetEngineVersionPlainArgs.Builder)
    /**
     * @param filters Configuration block for filtering versions. See `filter` Block below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.rds.inputs.GetEngineVersionFilter.Builder]*):
        com.pulumi.aws.rds.inputs.GetEngineVersionPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.rds.inputs.GetEngineVersionFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.rds.inputs.GetInstancesArgs.Builder)
    /**
     * @param filters Configuration block(s) used to filter instances with AWS supported attributes, such as `engine`, `db-cluster-id` or `db-instance-id` for example. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.rds.inputs.GetInstancesFilterArgs.Builder]*):
        com.pulumi.aws.rds.inputs.GetInstancesArgs.Builder =
      def argsBuilder = com.pulumi.aws.rds.inputs.GetInstancesFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.rds.inputs.GetInstancesPlainArgs.Builder)
    /**
     * @param filters Configuration block(s) used to filter instances with AWS supported attributes, such as `engine`, `db-cluster-id` or `db-instance-id` for example. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.rds.inputs.GetInstancesFilter.Builder]*):
        com.pulumi.aws.rds.inputs.GetInstancesPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.rds.inputs.GetInstancesFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.rds.inputs.GetSnapshotsArgs.Builder)
    /**
     * @param filters Configuration block(s) used to filter snapshots with AWS supported attributes. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.rds.inputs.GetSnapshotsFilterArgs.Builder]*):
        com.pulumi.aws.rds.inputs.GetSnapshotsArgs.Builder =
      def argsBuilder = com.pulumi.aws.rds.inputs.GetSnapshotsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.rds.inputs.GetSnapshotsPlainArgs.Builder)
    /**
     * @param filters Configuration block(s) used to filter snapshots with AWS supported attributes. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.rds.inputs.GetSnapshotsFilter.Builder]*):
        com.pulumi.aws.rds.inputs.GetSnapshotsPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.rds.inputs.GetSnapshotsFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.rds.inputs.GlobalClusterState.Builder)
    /**
     * @param globalClusterMembers Set of objects containing Global Cluster members.
     * @return builder
     */
    inline def globalClusterMembers(args: Endofunction[com.pulumi.aws.rds.inputs.GlobalClusterGlobalClusterMemberArgs.Builder]*):
        com.pulumi.aws.rds.inputs.GlobalClusterState.Builder =
      def argsBuilder = com.pulumi.aws.rds.inputs.GlobalClusterGlobalClusterMemberArgs.builder
      builder.globalClusterMembers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.rds.inputs.InstanceDesiredStateState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.rds.inputs.InstanceDesiredStateTimeoutsArgs.Builder]):
        com.pulumi.aws.rds.inputs.InstanceDesiredStateState.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.InstanceDesiredStateTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.rds.inputs.InstanceState.Builder)
    /**
     * @param blueGreenUpdate Enables low-downtime updates using [RDS Blue/Green deployments](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/blue-green-deployments.html). See `blueGreenUpdate` Block below.
     * @return builder
     */
    inline def blueGreenUpdate(args: Endofunction[com.pulumi.aws.rds.inputs.InstanceBlueGreenUpdateArgs.Builder]):
        com.pulumi.aws.rds.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.InstanceBlueGreenUpdateArgs.builder
      builder.blueGreenUpdate(args(argsBuilder).build)

    /**
     * @param listenerEndpoints Listener connection endpoint for SQL Server Always On. See `listenerEndpoint` Block below.
     * @return builder
     */
    inline def listenerEndpoints(args: Endofunction[com.pulumi.aws.rds.inputs.InstanceListenerEndpointArgs.Builder]*):
        com.pulumi.aws.rds.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.aws.rds.inputs.InstanceListenerEndpointArgs.builder
      builder.listenerEndpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param masterUserSecrets Block that specifies the master user secret. Only available when `manageMasterUserPassword` is set to true. See `masterUserSecret` Block below.
     * @return builder
     */
    inline def masterUserSecrets(args: Endofunction[com.pulumi.aws.rds.inputs.InstanceMasterUserSecretArgs.Builder]*):
        com.pulumi.aws.rds.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.aws.rds.inputs.InstanceMasterUserSecretArgs.builder
      builder.masterUserSecrets(args.map(_(argsBuilder).build)*)

    /**
     * @param restoreToPointInTime Configuration block for restoring a DB instance to an arbitrary point in time. Requires the `identifier` argument to be set with the name of the new DB instance to be created. See `restoreToPointInTime` Block below for details.
     * @return builder
     */
    inline def restoreToPointInTime(args: Endofunction[com.pulumi.aws.rds.inputs.InstanceRestoreToPointInTimeArgs.Builder]):
        com.pulumi.aws.rds.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.InstanceRestoreToPointInTimeArgs.builder
      builder.restoreToPointInTime(args(argsBuilder).build)

    /**
     * @param s3Import Restore from a Percona XtraBackup in S3. See [Importing Data into an Amazon RDS MySQL DB Instance](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/MySQL.Procedural.Importing.html). See `s3Import` Block below.
     * @return builder
     */
    inline def s3Import(args: Endofunction[com.pulumi.aws.rds.inputs.InstanceS3ImportArgs.Builder]):
        com.pulumi.aws.rds.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.InstanceS3ImportArgs.builder
      builder.s3Import(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.rds.inputs.IntegrationState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.rds.inputs.IntegrationTimeoutsArgs.Builder]):
        com.pulumi.aws.rds.inputs.IntegrationState.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.IntegrationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.rds.inputs.OptionGroupOptionArgs.Builder)
    /**
     * @param optionSettings Option settings to apply. See `optionSettings` Block below for more details.
     * @return builder
     */
    inline def optionSettings(args: Endofunction[com.pulumi.aws.rds.inputs.OptionGroupOptionOptionSettingArgs.Builder]*):
        com.pulumi.aws.rds.inputs.OptionGroupOptionArgs.Builder =
      def argsBuilder = com.pulumi.aws.rds.inputs.OptionGroupOptionOptionSettingArgs.builder
      builder.optionSettings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.rds.inputs.OptionGroupState.Builder)
    /**
     * @param options Options to apply. See `option` Block below for more details.
     * @return builder
     */
    inline def options(args: Endofunction[com.pulumi.aws.rds.inputs.OptionGroupOptionArgs.Builder]*):
        com.pulumi.aws.rds.inputs.OptionGroupState.Builder =
      def argsBuilder = com.pulumi.aws.rds.inputs.OptionGroupOptionArgs.builder
      builder.options(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.rds.inputs.ParameterGroupState.Builder)
    /**
     * @param parameters DB parameters to apply. See `parameter` Block below for more details. Note that parameters may differ from a family to an other. Full list of all parameters can be discovered via [`aws rds describe-db-parameters`](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-parameters.html) after initial creation of the group.
     * @return builder
     */
    inline def parameters(args: Endofunction[com.pulumi.aws.rds.inputs.ParameterGroupParameterArgs.Builder]*):
        com.pulumi.aws.rds.inputs.ParameterGroupState.Builder =
      def argsBuilder = com.pulumi.aws.rds.inputs.ParameterGroupParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.rds.inputs.ProxyDefaultTargetGroupState.Builder)
    /**
     * @param connectionPoolConfig Settings that determine the size and behavior of the connection pool for the target group. See `connectionPoolConfig` Block for details.
     * @return builder
     */
    inline def connectionPoolConfig(args: Endofunction[com.pulumi.aws.rds.inputs.ProxyDefaultTargetGroupConnectionPoolConfigArgs.Builder]):
        com.pulumi.aws.rds.inputs.ProxyDefaultTargetGroupState.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.ProxyDefaultTargetGroupConnectionPoolConfigArgs.builder
      builder.connectionPoolConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.rds.inputs.ProxyState.Builder)
    /**
     * @param auths Configuration block(s) with authorization mechanisms to connect to the associated instances or clusters. Required when `defaultAuthScheme` is `NONE` or unspecified. See the `auth` block below.
     * @return builder
     */
    inline def auths(args: Endofunction[com.pulumi.aws.rds.inputs.ProxyAuthArgs.Builder]*):
        com.pulumi.aws.rds.inputs.ProxyState.Builder =
      def argsBuilder = com.pulumi.aws.rds.inputs.ProxyAuthArgs.builder
      builder.auths(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.rds.inputs.ReservedInstanceState.Builder)
    /**
     * @param recurringCharges Recurring price charged to run this reserved DB instance. See `recurringCharges` below.
     * @return builder
     */
    inline def recurringCharges(args: Endofunction[com.pulumi.aws.rds.inputs.ReservedInstanceRecurringChargeArgs.Builder]*):
        com.pulumi.aws.rds.inputs.ReservedInstanceState.Builder =
      def argsBuilder = com.pulumi.aws.rds.inputs.ReservedInstanceRecurringChargeArgs.builder
      builder.recurringCharges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.rds.inputs.ShardGroupState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.rds.inputs.ShardGroupTimeoutsArgs.Builder]):
        com.pulumi.aws.rds.inputs.ShardGroupState.Builder =
      val argsBuilder = com.pulumi.aws.rds.inputs.ShardGroupTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
