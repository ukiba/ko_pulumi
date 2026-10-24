package jp.ukiba.ko_pulumi
package gcp

object spanner_ext:
  extension (builder: com.pulumi.gcp.spanner.BackupScheduleArgs.Builder)
    /**
     * @param encryptionConfig Configuration for the encryption of the backup schedule.
     * Structure is documented below.
     * @return builder
     */
    def encryptionConfig(args: Endofunction[com.pulumi.gcp.spanner.inputs.BackupScheduleEncryptionConfigArgs.Builder]):
        com.pulumi.gcp.spanner.BackupScheduleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.BackupScheduleEncryptionConfigArgs.builder
      builder.encryptionConfig(args(argsBuilder).build)

    /**
     * @param fullBackupSpec The schedule creates only full backups..
     * @return builder
     */
    def fullBackupSpec(args: Endofunction[com.pulumi.gcp.spanner.inputs.BackupScheduleFullBackupSpecArgs.Builder]):
        com.pulumi.gcp.spanner.BackupScheduleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.BackupScheduleFullBackupSpecArgs.builder
      builder.fullBackupSpec(args(argsBuilder).build)

    /**
     * @param incrementalBackupSpec The schedule creates incremental backup chains.
     * @return builder
     */
    def incrementalBackupSpec(args: Endofunction[com.pulumi.gcp.spanner.inputs.BackupScheduleIncrementalBackupSpecArgs.Builder]):
        com.pulumi.gcp.spanner.BackupScheduleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.BackupScheduleIncrementalBackupSpecArgs.builder
      builder.incrementalBackupSpec(args(argsBuilder).build)

    /**
     * @param spec Defines specifications of the backup schedule.
     * Structure is documented below.
     * @return builder
     */
    def spec(args: Endofunction[com.pulumi.gcp.spanner.inputs.BackupScheduleSpecArgs.Builder]):
        com.pulumi.gcp.spanner.BackupScheduleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.BackupScheduleSpecArgs.builder
      builder.spec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.spanner.DatabaseArgs.Builder)
    /**
     * @param encryptionConfig Encryption configuration for the database
     * Structure is documented below.
     * @return builder
     */
    def encryptionConfig(args: Endofunction[com.pulumi.gcp.spanner.inputs.DatabaseEncryptionConfigArgs.Builder]):
        com.pulumi.gcp.spanner.DatabaseArgs.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.DatabaseEncryptionConfigArgs.builder
      builder.encryptionConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.spanner.DatabaseIAMBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.spanner.inputs.DatabaseIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.spanner.DatabaseIAMBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.DatabaseIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.spanner.DatabaseIAMMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.spanner.inputs.DatabaseIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.spanner.DatabaseIAMMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.DatabaseIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.spanner.InstanceArgs.Builder)
    /**
     * @param autoscalingConfig The autoscaling configuration. Autoscaling is enabled if this field is set.
     * Exactly one of either num_nodes, processingUnits or autoscalingConfig must be
     * present in terraform except when instanceType = FREE_INSTANCE.
     * When autoscaling is enabled, numNodes and processingUnits are treated as,
     * OUTPUT_ONLY fields and reflect the current compute capacity allocated to
     * the instance.
     * Structure is documented below.
     * @return builder
     */
    def autoscalingConfig(args: Endofunction[com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigArgs.Builder]):
        com.pulumi.gcp.spanner.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigArgs.builder
      builder.autoscalingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.spanner.InstanceConfigArgs.Builder)
    /**
     * @param replicas The geographic placement of nodes in this instance configuration and their replication properties.
     * Structure is documented below.
     * @return builder
     */
    def replicas(args: Endofunction[com.pulumi.gcp.spanner.inputs.InstanceConfigReplicaArgs.Builder]*):
        com.pulumi.gcp.spanner.InstanceConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.spanner.inputs.InstanceConfigReplicaArgs.builder
      builder.replicas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.spanner.InstanceIAMBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.spanner.inputs.InstanceIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.spanner.InstanceIAMBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.InstanceIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.spanner.InstanceIAMMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.spanner.inputs.InstanceIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.spanner.InstanceIAMMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.InstanceIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.spanner.InstancePartitionArgs.Builder)
    /**
     * @param autoscalingConfig The autoscaling configuration. Autoscaling is enabled if this field is set.
     * Exactly one of either node_count, processing_units, or autoscalingConfig must be
     * present. When autoscaling is enabled, nodeCount and processingUnits are treated as
     * OUTPUT_ONLY fields and reflect the current compute capacity allocated to the
     * instance partition.
     * Structure is documented below.
     * @return builder
     */
    def autoscalingConfig(args: Endofunction[com.pulumi.gcp.spanner.inputs.InstancePartitionAutoscalingConfigArgs.Builder]):
        com.pulumi.gcp.spanner.InstancePartitionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.InstancePartitionAutoscalingConfigArgs.builder
      builder.autoscalingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.spanner.inputs.BackupScheduleSpecArgs.Builder)
    /**
     * @param cronSpec Cron style schedule specification..
     * Structure is documented below.
     * @return builder
     */
    def cronSpec(args: Endofunction[com.pulumi.gcp.spanner.inputs.BackupScheduleSpecCronSpecArgs.Builder]):
        com.pulumi.gcp.spanner.inputs.BackupScheduleSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.BackupScheduleSpecCronSpecArgs.builder
      builder.cronSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.spanner.inputs.BackupScheduleState.Builder)
    /**
     * @param encryptionConfig Configuration for the encryption of the backup schedule.
     * Structure is documented below.
     * @return builder
     */
    def encryptionConfig(args: Endofunction[com.pulumi.gcp.spanner.inputs.BackupScheduleEncryptionConfigArgs.Builder]):
        com.pulumi.gcp.spanner.inputs.BackupScheduleState.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.BackupScheduleEncryptionConfigArgs.builder
      builder.encryptionConfig(args(argsBuilder).build)

    /**
     * @param fullBackupSpec The schedule creates only full backups..
     * @return builder
     */
    def fullBackupSpec(args: Endofunction[com.pulumi.gcp.spanner.inputs.BackupScheduleFullBackupSpecArgs.Builder]):
        com.pulumi.gcp.spanner.inputs.BackupScheduleState.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.BackupScheduleFullBackupSpecArgs.builder
      builder.fullBackupSpec(args(argsBuilder).build)

    /**
     * @param incrementalBackupSpec The schedule creates incremental backup chains.
     * @return builder
     */
    def incrementalBackupSpec(args: Endofunction[com.pulumi.gcp.spanner.inputs.BackupScheduleIncrementalBackupSpecArgs.Builder]):
        com.pulumi.gcp.spanner.inputs.BackupScheduleState.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.BackupScheduleIncrementalBackupSpecArgs.builder
      builder.incrementalBackupSpec(args(argsBuilder).build)

    /**
     * @param spec Defines specifications of the backup schedule.
     * Structure is documented below.
     * @return builder
     */
    def spec(args: Endofunction[com.pulumi.gcp.spanner.inputs.BackupScheduleSpecArgs.Builder]):
        com.pulumi.gcp.spanner.inputs.BackupScheduleState.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.BackupScheduleSpecArgs.builder
      builder.spec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.spanner.inputs.DatabaseIAMBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.spanner.inputs.DatabaseIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.spanner.inputs.DatabaseIAMBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.DatabaseIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.spanner.inputs.DatabaseIAMMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.spanner.inputs.DatabaseIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.spanner.inputs.DatabaseIAMMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.DatabaseIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.spanner.inputs.DatabaseState.Builder)
    /**
     * @param encryptionConfig Encryption configuration for the database
     * Structure is documented below.
     * @return builder
     */
    def encryptionConfig(args: Endofunction[com.pulumi.gcp.spanner.inputs.DatabaseEncryptionConfigArgs.Builder]):
        com.pulumi.gcp.spanner.inputs.DatabaseState.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.DatabaseEncryptionConfigArgs.builder
      builder.encryptionConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigArgs.Builder)
    /**
     * @param asymmetricAutoscalingOptions Asymmetric autoscaling options for specific replicas.
     * Structure is documented below.
     * @return builder
     */
    def asymmetricAutoscalingOptions(args: Endofunction[com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigAsymmetricAutoscalingOptionArgs.Builder]*):
        com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigAsymmetricAutoscalingOptionArgs.builder
      builder.asymmetricAutoscalingOptions(args.map(_(argsBuilder).build)*)

    /**
     * @param autoscalingLimits Defines scale in controls to reduce the risk of response latency
     * and outages due to abrupt scale-in events. Users can define the minimum and
     * maximum compute capacity allocated to the instance, and the autoscaler will
     * only scale within that range. Users can either use nodes or processing
     * units to specify the limits, but should use the same unit to set both the
     * minLimit and max_limit.
     * Structure is documented below.
     * @return builder
     */
    def autoscalingLimits(args: Endofunction[com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigAutoscalingLimitsArgs.Builder]):
        com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigAutoscalingLimitsArgs.builder
      builder.autoscalingLimits(args(argsBuilder).build)

    /**
     * @param autoscalingTargets Defines scale in controls to reduce the risk of response latency
     * and outages due to abrupt scale-in events
     * Structure is documented below.
     * @return builder
     */
    def autoscalingTargets(args: Endofunction[com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigAutoscalingTargetsArgs.Builder]):
        com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigAutoscalingTargetsArgs.builder
      builder.autoscalingTargets(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigAsymmetricAutoscalingOptionArgs.Builder)
    /**
     * @param overrides A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    def overrides(args: Endofunction[com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigAsymmetricAutoscalingOptionOverridesArgs.Builder]):
        com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigAsymmetricAutoscalingOptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigAsymmetricAutoscalingOptionOverridesArgs.builder
      builder.overrides(args(argsBuilder).build)

    /**
     * @param replicaSelection A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    def replicaSelection(args: Endofunction[com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigAsymmetricAutoscalingOptionReplicaSelectionArgs.Builder]):
        com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigAsymmetricAutoscalingOptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigAsymmetricAutoscalingOptionReplicaSelectionArgs.builder
      builder.replicaSelection(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigAsymmetricAutoscalingOptionOverridesArgs.Builder)
    /**
     * @param autoscalingLimits A nested object resource.
     * Structure is documented below.
     * @return builder
     */
    def autoscalingLimits(args: Endofunction[com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigAsymmetricAutoscalingOptionOverridesAutoscalingLimitsArgs.Builder]):
        com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigAsymmetricAutoscalingOptionOverridesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigAsymmetricAutoscalingOptionOverridesAutoscalingLimitsArgs.builder
      builder.autoscalingLimits(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.spanner.inputs.InstanceConfigState.Builder)
    /**
     * @param replicas The geographic placement of nodes in this instance configuration and their replication properties.
     * Structure is documented below.
     * @return builder
     */
    def replicas(args: Endofunction[com.pulumi.gcp.spanner.inputs.InstanceConfigReplicaArgs.Builder]*):
        com.pulumi.gcp.spanner.inputs.InstanceConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.spanner.inputs.InstanceConfigReplicaArgs.builder
      builder.replicas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.spanner.inputs.InstanceIAMBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.spanner.inputs.InstanceIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.spanner.inputs.InstanceIAMBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.InstanceIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.spanner.inputs.InstanceIAMMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.spanner.inputs.InstanceIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.spanner.inputs.InstanceIAMMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.InstanceIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.spanner.inputs.InstancePartitionAutoscalingConfigArgs.Builder)
    /**
     * @param autoscalingLimits Defines scale in controls to reduce the risk of response latency
     * and outages due to abrupt scale-in events. Users can define the minimum and
     * maximum compute capacity allocated to the instance partition, and the autoscaler will
     * only scale within that range. Users can either use nodes or processing
     * units to specify the limits, but should use the same unit to set both the
     * minLimit and max_limit.
     * Structure is documented below.
     * @return builder
     */
    def autoscalingLimits(args: Endofunction[com.pulumi.gcp.spanner.inputs.InstancePartitionAutoscalingConfigAutoscalingLimitsArgs.Builder]):
        com.pulumi.gcp.spanner.inputs.InstancePartitionAutoscalingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.InstancePartitionAutoscalingConfigAutoscalingLimitsArgs.builder
      builder.autoscalingLimits(args(argsBuilder).build)

    /**
     * @param autoscalingTargets Defines scale in controls to reduce the risk of response latency
     * and outages due to abrupt scale-in events
     * Structure is documented below.
     * @return builder
     */
    def autoscalingTargets(args: Endofunction[com.pulumi.gcp.spanner.inputs.InstancePartitionAutoscalingConfigAutoscalingTargetsArgs.Builder]):
        com.pulumi.gcp.spanner.inputs.InstancePartitionAutoscalingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.InstancePartitionAutoscalingConfigAutoscalingTargetsArgs.builder
      builder.autoscalingTargets(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.spanner.inputs.InstancePartitionState.Builder)
    /**
     * @param autoscalingConfig The autoscaling configuration. Autoscaling is enabled if this field is set.
     * Exactly one of either node_count, processing_units, or autoscalingConfig must be
     * present. When autoscaling is enabled, nodeCount and processingUnits are treated as
     * OUTPUT_ONLY fields and reflect the current compute capacity allocated to the
     * instance partition.
     * Structure is documented below.
     * @return builder
     */
    def autoscalingConfig(args: Endofunction[com.pulumi.gcp.spanner.inputs.InstancePartitionAutoscalingConfigArgs.Builder]):
        com.pulumi.gcp.spanner.inputs.InstancePartitionState.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.InstancePartitionAutoscalingConfigArgs.builder
      builder.autoscalingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.spanner.inputs.InstanceState.Builder)
    /**
     * @param autoscalingConfig The autoscaling configuration. Autoscaling is enabled if this field is set.
     * Exactly one of either num_nodes, processingUnits or autoscalingConfig must be
     * present in terraform except when instanceType = FREE_INSTANCE.
     * When autoscaling is enabled, numNodes and processingUnits are treated as,
     * OUTPUT_ONLY fields and reflect the current compute capacity allocated to
     * the instance.
     * Structure is documented below.
     * @return builder
     */
    def autoscalingConfig(args: Endofunction[com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigArgs.Builder]):
        com.pulumi.gcp.spanner.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigArgs.builder
      builder.autoscalingConfig(args(argsBuilder).build)
