package jp.ukiba.ko_pulumi
package azure

object dataprotection_ext:
  extension (builder: com.pulumi.azure.dataprotection.BackupInstanceKubernetesClusterArgs.Builder)
    /**
     * @param backupDatasourceParameters A `backupDatasourceParameters` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def backupDatasourceParameters(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupInstanceKubernetesClusterBackupDatasourceParametersArgs.Builder]):
        com.pulumi.azure.dataprotection.BackupInstanceKubernetesClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupInstanceKubernetesClusterBackupDatasourceParametersArgs.builder
      builder.backupDatasourceParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.dataprotection.BackupPolicyBlobStorageArgs.Builder)
    /**
     * @param retentionRules One or more `retentionRule` blocks as defined below. Changing this forces a new Backup Policy Blob Storage to be created.
     * 
     * &gt; **Note:** Setting `retentionRule` also requires setting `vaultDefaultRetentionDuration`.
     * @return builder
     */
    inline def retentionRules(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyBlobStorageRetentionRuleArgs.Builder]*):
        com.pulumi.azure.dataprotection.BackupPolicyBlobStorageArgs.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyBlobStorageRetentionRuleArgs.builder
      builder.retentionRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dataprotection.BackupPolicyDataLakeStorageArgs.Builder)
    /**
     * @param retentionRules One or more `retentionRule` blocks as defined below. The priority of each rule is determined by its order in the list, where the first rule has the highest priority. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def retentionRules(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyDataLakeStorageRetentionRuleArgs.Builder]*):
        com.pulumi.azure.dataprotection.BackupPolicyDataLakeStorageArgs.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyDataLakeStorageRetentionRuleArgs.builder
      builder.retentionRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dataprotection.BackupPolicyDiskArgs.Builder)
    /**
     * @param retentionRules One or more `retentionRule` blocks as defined below. Changing this forces a new Backup Policy Disk to be created.
     * @return builder
     */
    inline def retentionRules(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyDiskRetentionRuleArgs.Builder]*):
        com.pulumi.azure.dataprotection.BackupPolicyDiskArgs.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyDiskRetentionRuleArgs.builder
      builder.retentionRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dataprotection.BackupPolicyKubernetesClusterArgs.Builder)
    /**
     * @param defaultRetentionRule A `defaultRetentionRule` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def defaultRetentionRule(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterDefaultRetentionRuleArgs.Builder]):
        com.pulumi.azure.dataprotection.BackupPolicyKubernetesClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterDefaultRetentionRuleArgs.builder
      builder.defaultRetentionRule(args(argsBuilder).build)

    /**
     * @param retentionRules One or more `retentionRule` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def retentionRules(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterRetentionRuleArgs.Builder]*):
        com.pulumi.azure.dataprotection.BackupPolicyKubernetesClusterArgs.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterRetentionRuleArgs.builder
      builder.retentionRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dataprotection.BackupPolicyMysqlFlexibleServerArgs.Builder)
    /**
     * @param defaultRetentionRule A `defaultRetentionRule` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def defaultRetentionRule(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerDefaultRetentionRuleArgs.Builder]):
        com.pulumi.azure.dataprotection.BackupPolicyMysqlFlexibleServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerDefaultRetentionRuleArgs.builder
      builder.defaultRetentionRule(args(argsBuilder).build)

    /**
     * @param retentionRules One or more `retentionRule` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def retentionRules(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerRetentionRuleArgs.Builder]*):
        com.pulumi.azure.dataprotection.BackupPolicyMysqlFlexibleServerArgs.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerRetentionRuleArgs.builder
      builder.retentionRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dataprotection.BackupPolicyPostgresqlArgs.Builder)
    /**
     * @param retentionRules One or more `retentionRule` blocks as defined below. Changing this forces a new Backup Policy PostgreSQL to be created.
     * @return builder
     */
    inline def retentionRules(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlRetentionRuleArgs.Builder]*):
        com.pulumi.azure.dataprotection.BackupPolicyPostgresqlArgs.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlRetentionRuleArgs.builder
      builder.retentionRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dataprotection.BackupPolicyPostgresqlFlexibleServerArgs.Builder)
    /**
     * @param defaultRetentionRule A `defaultRetentionRule` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def defaultRetentionRule(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerDefaultRetentionRuleArgs.Builder]):
        com.pulumi.azure.dataprotection.BackupPolicyPostgresqlFlexibleServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerDefaultRetentionRuleArgs.builder
      builder.defaultRetentionRule(args(argsBuilder).build)

    /**
     * @param retentionRules One or more `retentionRule` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def retentionRules(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerRetentionRuleArgs.Builder]*):
        com.pulumi.azure.dataprotection.BackupPolicyPostgresqlFlexibleServerArgs.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerRetentionRuleArgs.builder
      builder.retentionRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dataprotection.BackupVaultArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupVaultIdentityArgs.Builder]):
        com.pulumi.azure.dataprotection.BackupVaultArgs.Builder =
      val argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupVaultIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.dataprotection.inputs.BackupInstanceKubernetesClusterState.Builder)
    /**
     * @param backupDatasourceParameters A `backupDatasourceParameters` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def backupDatasourceParameters(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupInstanceKubernetesClusterBackupDatasourceParametersArgs.Builder]):
        com.pulumi.azure.dataprotection.inputs.BackupInstanceKubernetesClusterState.Builder =
      val argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupInstanceKubernetesClusterBackupDatasourceParametersArgs.builder
      builder.backupDatasourceParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.dataprotection.inputs.BackupPolicyBlobStorageRetentionRuleArgs.Builder)
    /**
     * @param criteria A `criteria` block as defined below. Changing this forces a new Backup Policy Blob Storage to be created.
     * @return builder
     */
    inline def criteria(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyBlobStorageRetentionRuleCriteriaArgs.Builder]):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyBlobStorageRetentionRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyBlobStorageRetentionRuleCriteriaArgs.builder
      builder.criteria(args(argsBuilder).build)

    /**
     * @param lifeCycle A `lifeCycle` block as defined below. Changing this forces a new Backup Policy Blob Storage to be created.
     * @return builder
     */
    inline def lifeCycle(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyBlobStorageRetentionRuleLifeCycleArgs.Builder]):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyBlobStorageRetentionRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyBlobStorageRetentionRuleLifeCycleArgs.builder
      builder.lifeCycle(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.dataprotection.inputs.BackupPolicyBlobStorageState.Builder)
    /**
     * @param retentionRules One or more `retentionRule` blocks as defined below. Changing this forces a new Backup Policy Blob Storage to be created.
     * 
     * &gt; **Note:** Setting `retentionRule` also requires setting `vaultDefaultRetentionDuration`.
     * @return builder
     */
    inline def retentionRules(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyBlobStorageRetentionRuleArgs.Builder]*):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyBlobStorageState.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyBlobStorageRetentionRuleArgs.builder
      builder.retentionRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dataprotection.inputs.BackupPolicyDataLakeStorageState.Builder)
    /**
     * @param retentionRules One or more `retentionRule` blocks as defined below. The priority of each rule is determined by its order in the list, where the first rule has the highest priority. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def retentionRules(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyDataLakeStorageRetentionRuleArgs.Builder]*):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyDataLakeStorageState.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyDataLakeStorageRetentionRuleArgs.builder
      builder.retentionRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dataprotection.inputs.BackupPolicyDiskRetentionRuleArgs.Builder)
    /**
     * @param criteria A `criteria` block as defined below. Changing this forces a new Backup Policy Disk to be created.
     * @return builder
     */
    inline def criteria(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyDiskRetentionRuleCriteriaArgs.Builder]):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyDiskRetentionRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyDiskRetentionRuleCriteriaArgs.builder
      builder.criteria(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.dataprotection.inputs.BackupPolicyDiskState.Builder)
    /**
     * @param retentionRules One or more `retentionRule` blocks as defined below. Changing this forces a new Backup Policy Disk to be created.
     * @return builder
     */
    inline def retentionRules(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyDiskRetentionRuleArgs.Builder]*):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyDiskState.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyDiskRetentionRuleArgs.builder
      builder.retentionRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterDefaultRetentionRuleArgs.Builder)
    /**
     * @param lifeCycles A `lifeCycle` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def lifeCycles(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterDefaultRetentionRuleLifeCycleArgs.Builder]*):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterDefaultRetentionRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterDefaultRetentionRuleLifeCycleArgs.builder
      builder.lifeCycles(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterRetentionRuleArgs.Builder)
    /**
     * @param criteria A `criteria` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def criteria(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterRetentionRuleCriteriaArgs.Builder]):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterRetentionRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterRetentionRuleCriteriaArgs.builder
      builder.criteria(args(argsBuilder).build)

    /**
     * @param lifeCycles A `lifeCycle` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def lifeCycles(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterRetentionRuleLifeCycleArgs.Builder]*):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterRetentionRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterRetentionRuleLifeCycleArgs.builder
      builder.lifeCycles(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterState.Builder)
    /**
     * @param defaultRetentionRule A `defaultRetentionRule` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def defaultRetentionRule(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterDefaultRetentionRuleArgs.Builder]):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterState.Builder =
      val argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterDefaultRetentionRuleArgs.builder
      builder.defaultRetentionRule(args(argsBuilder).build)

    /**
     * @param retentionRules One or more `retentionRule` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def retentionRules(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterRetentionRuleArgs.Builder]*):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterState.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterRetentionRuleArgs.builder
      builder.retentionRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerDefaultRetentionRuleArgs.Builder)
    /**
     * @param lifeCycles A `lifeCycle` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def lifeCycles(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerDefaultRetentionRuleLifeCycleArgs.Builder]*):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerDefaultRetentionRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerDefaultRetentionRuleLifeCycleArgs.builder
      builder.lifeCycles(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerRetentionRuleArgs.Builder)
    /**
     * @param criteria A `criteria` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def criteria(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerRetentionRuleCriteriaArgs.Builder]):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerRetentionRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerRetentionRuleCriteriaArgs.builder
      builder.criteria(args(argsBuilder).build)

    /**
     * @param lifeCycles A `lifeCycle` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def lifeCycles(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerRetentionRuleLifeCycleArgs.Builder]*):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerRetentionRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerRetentionRuleLifeCycleArgs.builder
      builder.lifeCycles(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerState.Builder)
    /**
     * @param defaultRetentionRule A `defaultRetentionRule` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def defaultRetentionRule(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerDefaultRetentionRuleArgs.Builder]):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerState.Builder =
      val argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerDefaultRetentionRuleArgs.builder
      builder.defaultRetentionRule(args(argsBuilder).build)

    /**
     * @param retentionRules One or more `retentionRule` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def retentionRules(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerRetentionRuleArgs.Builder]*):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerState.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerRetentionRuleArgs.builder
      builder.retentionRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerDefaultRetentionRuleArgs.Builder)
    /**
     * @param lifeCycles A `lifeCycle` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def lifeCycles(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerDefaultRetentionRuleLifeCycleArgs.Builder]*):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerDefaultRetentionRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerDefaultRetentionRuleLifeCycleArgs.builder
      builder.lifeCycles(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerRetentionRuleArgs.Builder)
    /**
     * @param criteria A `criteria` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def criteria(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerRetentionRuleCriteriaArgs.Builder]):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerRetentionRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerRetentionRuleCriteriaArgs.builder
      builder.criteria(args(argsBuilder).build)

    /**
     * @param lifeCycles A `lifeCycle` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def lifeCycles(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerRetentionRuleLifeCycleArgs.Builder]*):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerRetentionRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerRetentionRuleLifeCycleArgs.builder
      builder.lifeCycles(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerState.Builder)
    /**
     * @param defaultRetentionRule A `defaultRetentionRule` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def defaultRetentionRule(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerDefaultRetentionRuleArgs.Builder]):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerState.Builder =
      val argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerDefaultRetentionRuleArgs.builder
      builder.defaultRetentionRule(args(argsBuilder).build)

    /**
     * @param retentionRules One or more `retentionRule` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def retentionRules(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerRetentionRuleArgs.Builder]*):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerState.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerRetentionRuleArgs.builder
      builder.retentionRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlRetentionRuleArgs.Builder)
    /**
     * @param criteria A `criteria` block as defined below. Changing this forces a new Backup Policy PostgreSQL to be created.
     * @return builder
     */
    inline def criteria(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlRetentionRuleCriteriaArgs.Builder]):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlRetentionRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlRetentionRuleCriteriaArgs.builder
      builder.criteria(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlState.Builder)
    /**
     * @param retentionRules One or more `retentionRule` blocks as defined below. Changing this forces a new Backup Policy PostgreSQL to be created.
     * @return builder
     */
    inline def retentionRules(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlRetentionRuleArgs.Builder]*):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlState.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlRetentionRuleArgs.builder
      builder.retentionRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dataprotection.inputs.BackupVaultState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupVaultIdentityArgs.Builder]):
        com.pulumi.azure.dataprotection.inputs.BackupVaultState.Builder =
      val argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupVaultIdentityArgs.builder
      builder.identity(args(argsBuilder).build)
