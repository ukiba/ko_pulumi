package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object dataprotection:
  /** Manages a Resource Guard. */
  def ResourceGuard(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dataprotection.ResourceGuardArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dataprotection.ResourceGuardArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.dataprotection.ResourceGuard(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Backup Instance to back up Disk. */
  def BackupInstanceDisk(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dataprotection.BackupInstanceDiskArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dataprotection.BackupInstanceDiskArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.dataprotection.BackupInstanceDisk(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.dataprotection.BackupVaultArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupVaultIdentityArgs.Builder]):
        com.pulumi.azure.dataprotection.BackupVaultArgs.Builder =
      val argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupVaultIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.dataprotection.BackupVaultArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Backup Policy to back up Kubernetes Cluster. */
  def BackupPolicyKubernetesCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dataprotection.BackupPolicyKubernetesClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dataprotection.BackupPolicyKubernetesClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.dataprotection.BackupPolicyKubernetesCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.dataprotection.BackupPolicyKubernetesClusterArgs.Builder)
    /**
     * @param defaultRetentionRule A `defaultRetentionRule` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def defaultRetentionRule(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterDefaultRetentionRuleArgs.Builder]):
        com.pulumi.azure.dataprotection.BackupPolicyKubernetesClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterDefaultRetentionRuleArgs.builder
      builder.defaultRetentionRule(args(argsBuilder).build)

    /**
     * @param retentionRules One or more `retentionRule` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def retentionRules(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterRetentionRuleArgs.Builder]*):
        com.pulumi.azure.dataprotection.BackupPolicyKubernetesClusterArgs.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterRetentionRuleArgs.builder
      builder.retentionRules(args.map(_(argsBuilder).build)*)

  /** Manages a Backup Policy to back up MySQL Flexible Server. */
  def BackupPolicyMysqlFlexibleServer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dataprotection.BackupPolicyMysqlFlexibleServerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dataprotection.BackupPolicyMysqlFlexibleServerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.dataprotection.BackupPolicyMysqlFlexibleServer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.dataprotection.BackupPolicyBlobStorageArgs.Builder)
    /**
     * @param retentionRules One or more `retentionRule` blocks as defined below. Changing this forces a new Backup Policy Blob Storage to be created.
     * 
     *  &gt; **Note:** Setting `retentionRule` also requires setting `vaultDefaultRetentionDuration`.
     * @return builder
     */
    def retentionRules(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyBlobStorageRetentionRuleArgs.Builder]*):
        com.pulumi.azure.dataprotection.BackupPolicyBlobStorageArgs.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyBlobStorageRetentionRuleArgs.builder
      builder.retentionRules(args.map(_(argsBuilder).build)*)

  /** Manages a Backup Instance Blob Storage. */
  def BackupInstanceBlogStorage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dataprotection.BackupInstanceBlogStorageArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dataprotection.BackupInstanceBlogStorageArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.dataprotection.BackupInstanceBlogStorage(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.dataprotection.BackupInstanceKubernetesClusterArgs.Builder)
    /**
     * @param backupDatasourceParameters A `backupDatasourceParameters` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def backupDatasourceParameters(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupInstanceKubernetesClusterBackupDatasourceParametersArgs.Builder]):
        com.pulumi.azure.dataprotection.BackupInstanceKubernetesClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupInstanceKubernetesClusterBackupDatasourceParametersArgs.builder
      builder.backupDatasourceParameters(args(argsBuilder).build)

  /** Manages a Backup Instance to back up Data Lake Storage. */
  def BackupInstanceDataLakeStorage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dataprotection.BackupInstanceDataLakeStorageArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dataprotection.BackupInstanceDataLakeStorageArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.dataprotection.BackupInstanceDataLakeStorage(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Backup Policy Disk. */
  def BackupPolicyDisk(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dataprotection.BackupPolicyDiskArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dataprotection.BackupPolicyDiskArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.dataprotection.BackupPolicyDisk(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.dataprotection.BackupPolicyDiskArgs.Builder)
    /**
     * @param retentionRules One or more `retentionRule` blocks as defined below. Changing this forces a new Backup Policy Disk to be created.
     * @return builder
     */
    def retentionRules(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyDiskRetentionRuleArgs.Builder]*):
        com.pulumi.azure.dataprotection.BackupPolicyDiskArgs.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyDiskRetentionRuleArgs.builder
      builder.retentionRules(args.map(_(argsBuilder).build)*)

  /**
   * Manages a Backup Instance to back up PostgreSQL Flexible Server.
   * 
   *  &gt; **Note:** Before using this resource, there are some prerequisite permissions for configure backup and restore. See more details from &lt;https://learn.microsoft.com/azure/backup/backup-azure-database-postgresql-flex-overview&gt;.
   */
  def BackupInstancePostgresqlFlexibleServer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dataprotection.BackupInstancePostgresqlFlexibleServerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dataprotection.BackupInstancePostgresqlFlexibleServerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.dataprotection.BackupInstancePostgresqlFlexibleServer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Backup Instance to back up PostgreSQL.
   * 
   *  &gt; **Note:** The `azure.dataprotection.BackupInstancePostgresql` resource has been deprecated because Azure Database for PostgreSQL Single Server has been retired as of 2025-03-28 and will be removed in v5.0 of the AzureRM Provider.
   * 
   *  &gt; **Note:** Before using this resource, there are some prerequisite permissions for configure backup and restore. See more details from &lt;https://docs.microsoft.com/azure/backup/backup-azure-database-postgresql#prerequisite-permissions-for-configure-backup-and-restore&gt;.
   */
  def BackupInstancePostgresql(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dataprotection.BackupInstancePostgresqlArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dataprotection.BackupInstancePostgresqlArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.dataprotection.BackupInstancePostgresql(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Backup Policy Blob Storage. */
  def BackupPolicyBlobStorage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dataprotection.BackupPolicyBlobStorageArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dataprotection.BackupPolicyBlobStorageArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.dataprotection.BackupPolicyBlobStorage(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Backup Policy to back up PostgreSQL Flexible Server. */
  def BackupPolicyPostgresqlFlexibleServer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dataprotection.BackupPolicyPostgresqlFlexibleServerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dataprotection.BackupPolicyPostgresqlFlexibleServerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.dataprotection.BackupPolicyPostgresqlFlexibleServer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Backup Instance to back up a Kubernetes Cluster. */
  def BackupInstanceKubernetesCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dataprotection.BackupInstanceKubernetesClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dataprotection.BackupInstanceKubernetesClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.dataprotection.BackupInstanceKubernetesCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object DataprotectionFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Backup Vault. */
    inline def getBackupVault(args: Endofunction[com.pulumi.azure.dataprotection.inputs.GetBackupVaultArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.dataprotection.outputs.GetBackupVaultResult] =
      val argsBuilder = com.pulumi.azure.dataprotection.inputs.GetBackupVaultArgs.builder
      com.pulumi.azure.dataprotection.DataprotectionFunctions.getBackupVault(args(argsBuilder).build)

    /** Use this data source to access information about an existing Backup Vault. */
    inline def getBackupVaultPlain(args: Endofunction[com.pulumi.azure.dataprotection.inputs.GetBackupVaultPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.dataprotection.outputs.GetBackupVaultResult] =
      val argsBuilder = com.pulumi.azure.dataprotection.inputs.GetBackupVaultPlainArgs.builder
      com.pulumi.azure.dataprotection.DataprotectionFunctions.getBackupVaultPlain(args(argsBuilder).build)

  /**
   * Manages a Backup Policy to back up PostgreSQL.
   * 
   *  &gt; **Note:** The `azure.dataprotection.BackupPolicyPostgresql` resource has been deprecated because Azure Database for PostgreSQL Single Server has been retired as of 2025-03-28 and will be removed in v5.0 of the AzureRM Provider.
   */
  def BackupPolicyPostgresql(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dataprotection.BackupPolicyPostgresqlArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dataprotection.BackupPolicyPostgresqlArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.dataprotection.BackupPolicyPostgresql(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Backup Policy to Azure Data Lake Storage. */
  def BackupPolicyDataLakeStorage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dataprotection.BackupPolicyDataLakeStorageArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dataprotection.BackupPolicyDataLakeStorageArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.dataprotection.BackupPolicyDataLakeStorage(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.dataprotection.BackupPolicyMysqlFlexibleServerArgs.Builder)
    /**
     * @param defaultRetentionRule A `defaultRetentionRule` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def defaultRetentionRule(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerDefaultRetentionRuleArgs.Builder]):
        com.pulumi.azure.dataprotection.BackupPolicyMysqlFlexibleServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerDefaultRetentionRuleArgs.builder
      builder.defaultRetentionRule(args(argsBuilder).build)

    /**
     * @param retentionRules One or more `retentionRule` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def retentionRules(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerRetentionRuleArgs.Builder]*):
        com.pulumi.azure.dataprotection.BackupPolicyMysqlFlexibleServerArgs.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerRetentionRuleArgs.builder
      builder.retentionRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dataprotection.BackupPolicyPostgresqlArgs.Builder)
    /**
     * @param retentionRules One or more `retentionRule` blocks as defined below. Changing this forces a new Backup Policy PostgreSQL to be created.
     * @return builder
     */
    def retentionRules(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlRetentionRuleArgs.Builder]*):
        com.pulumi.azure.dataprotection.BackupPolicyPostgresqlArgs.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlRetentionRuleArgs.builder
      builder.retentionRules(args.map(_(argsBuilder).build)*)

  /**
   * Manages a Backup Vault Customer Managed Key.
   * 
   *  !&gt; **Note:** It is not possible to remove the Customer Managed Key from the Backup Vault once it&#39;s been added. To remove the Customer Managed Key, the parent Data Protection Backup Vault must be deleted and recreated.
   */
  def BackupVaultCustomerManagedKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dataprotection.BackupVaultCustomerManagedKeyArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.dataprotection.BackupVaultCustomerManagedKeyArgs.builder
    com.pulumi.azure.dataprotection.BackupVaultCustomerManagedKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.dataprotection.BackupPolicyPostgresqlFlexibleServerArgs.Builder)
    /**
     * @param defaultRetentionRule A `defaultRetentionRule` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def defaultRetentionRule(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerDefaultRetentionRuleArgs.Builder]):
        com.pulumi.azure.dataprotection.BackupPolicyPostgresqlFlexibleServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerDefaultRetentionRuleArgs.builder
      builder.defaultRetentionRule(args(argsBuilder).build)

    /**
     * @param retentionRules One or more `retentionRule` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def retentionRules(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerRetentionRuleArgs.Builder]*):
        com.pulumi.azure.dataprotection.BackupPolicyPostgresqlFlexibleServerArgs.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerRetentionRuleArgs.builder
      builder.retentionRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dataprotection.BackupPolicyDataLakeStorageArgs.Builder)
    /**
     * @param retentionRules One or more `retentionRule` blocks as defined below. The priority of each rule is determined by its order in the list, where the first rule has the highest priority. Changing this forces a new resource to be created.
     * @return builder
     */
    def retentionRules(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyDataLakeStorageRetentionRuleArgs.Builder]*):
        com.pulumi.azure.dataprotection.BackupPolicyDataLakeStorageArgs.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyDataLakeStorageRetentionRuleArgs.builder
      builder.retentionRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerDefaultRetentionRuleArgs.Builder)
    /**
     * @param lifeCycles A `lifeCycle` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def lifeCycles(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerDefaultRetentionRuleLifeCycleArgs.Builder]*):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerDefaultRetentionRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerDefaultRetentionRuleLifeCycleArgs.builder
      builder.lifeCycles(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dataprotection.inputs.BackupInstanceKubernetesClusterState.Builder)
    /**
     * @param backupDatasourceParameters A `backupDatasourceParameters` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def backupDatasourceParameters(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupInstanceKubernetesClusterBackupDatasourceParametersArgs.Builder]):
        com.pulumi.azure.dataprotection.inputs.BackupInstanceKubernetesClusterState.Builder =
      val argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupInstanceKubernetesClusterBackupDatasourceParametersArgs.builder
      builder.backupDatasourceParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.dataprotection.inputs.BackupPolicyBlobStorageRetentionRuleArgs.Builder)
    /**
     * @param criteria A `criteria` block as defined below. Changing this forces a new Backup Policy Blob Storage to be created.
     * @return builder
     */
    def criteria(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyBlobStorageRetentionRuleCriteriaArgs.Builder]):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyBlobStorageRetentionRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyBlobStorageRetentionRuleCriteriaArgs.builder
      builder.criteria(args(argsBuilder).build)

    /**
     * @param lifeCycle A `lifeCycle` block as defined below. Changing this forces a new Backup Policy Blob Storage to be created.
     * @return builder
     */
    def lifeCycle(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyBlobStorageRetentionRuleLifeCycleArgs.Builder]):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyBlobStorageRetentionRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyBlobStorageRetentionRuleLifeCycleArgs.builder
      builder.lifeCycle(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlState.Builder)
    /**
     * @param retentionRules One or more `retentionRule` blocks as defined below. Changing this forces a new Backup Policy PostgreSQL to be created.
     * @return builder
     */
    def retentionRules(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlRetentionRuleArgs.Builder]*):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlState.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlRetentionRuleArgs.builder
      builder.retentionRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dataprotection.inputs.BackupPolicyDataLakeStorageState.Builder)
    /**
     * @param retentionRules One or more `retentionRule` blocks as defined below. The priority of each rule is determined by its order in the list, where the first rule has the highest priority. Changing this forces a new resource to be created.
     * @return builder
     */
    def retentionRules(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyDataLakeStorageRetentionRuleArgs.Builder]*):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyDataLakeStorageState.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyDataLakeStorageRetentionRuleArgs.builder
      builder.retentionRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerRetentionRuleArgs.Builder)
    /**
     * @param criteria A `criteria` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def criteria(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerRetentionRuleCriteriaArgs.Builder]):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerRetentionRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerRetentionRuleCriteriaArgs.builder
      builder.criteria(args(argsBuilder).build)

    /**
     * @param lifeCycles A `lifeCycle` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def lifeCycles(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerRetentionRuleLifeCycleArgs.Builder]*):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerRetentionRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerRetentionRuleLifeCycleArgs.builder
      builder.lifeCycles(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterDefaultRetentionRuleArgs.Builder)
    /**
     * @param lifeCycles A `lifeCycle` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def lifeCycles(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterDefaultRetentionRuleLifeCycleArgs.Builder]*):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterDefaultRetentionRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterDefaultRetentionRuleLifeCycleArgs.builder
      builder.lifeCycles(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerState.Builder)
    /**
     * @param defaultRetentionRule A `defaultRetentionRule` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def defaultRetentionRule(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerDefaultRetentionRuleArgs.Builder]):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerState.Builder =
      val argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerDefaultRetentionRuleArgs.builder
      builder.defaultRetentionRule(args(argsBuilder).build)

    /**
     * @param retentionRules One or more `retentionRule` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def retentionRules(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerRetentionRuleArgs.Builder]*):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerState.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerRetentionRuleArgs.builder
      builder.retentionRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dataprotection.inputs.BackupPolicyBlobStorageState.Builder)
    /**
     * @param retentionRules One or more `retentionRule` blocks as defined below. Changing this forces a new Backup Policy Blob Storage to be created.
     * 
     *  &gt; **Note:** Setting `retentionRule` also requires setting `vaultDefaultRetentionDuration`.
     * @return builder
     */
    def retentionRules(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyBlobStorageRetentionRuleArgs.Builder]*):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyBlobStorageState.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyBlobStorageRetentionRuleArgs.builder
      builder.retentionRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterRetentionRuleArgs.Builder)
    /**
     * @param criteria A `criteria` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def criteria(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterRetentionRuleCriteriaArgs.Builder]):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterRetentionRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterRetentionRuleCriteriaArgs.builder
      builder.criteria(args(argsBuilder).build)

    /**
     * @param lifeCycles A `lifeCycle` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def lifeCycles(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterRetentionRuleLifeCycleArgs.Builder]*):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterRetentionRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterRetentionRuleLifeCycleArgs.builder
      builder.lifeCycles(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlRetentionRuleArgs.Builder)
    /**
     * @param criteria A `criteria` block as defined below. Changing this forces a new Backup Policy PostgreSQL to be created.
     * @return builder
     */
    def criteria(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlRetentionRuleCriteriaArgs.Builder]):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlRetentionRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlRetentionRuleCriteriaArgs.builder
      builder.criteria(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerRetentionRuleArgs.Builder)
    /**
     * @param criteria A `criteria` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def criteria(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerRetentionRuleCriteriaArgs.Builder]):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerRetentionRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerRetentionRuleCriteriaArgs.builder
      builder.criteria(args(argsBuilder).build)

    /**
     * @param lifeCycles A `lifeCycle` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def lifeCycles(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerRetentionRuleLifeCycleArgs.Builder]*):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerRetentionRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerRetentionRuleLifeCycleArgs.builder
      builder.lifeCycles(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dataprotection.inputs.BackupPolicyDiskState.Builder)
    /**
     * @param retentionRules One or more `retentionRule` blocks as defined below. Changing this forces a new Backup Policy Disk to be created.
     * @return builder
     */
    def retentionRules(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyDiskRetentionRuleArgs.Builder]*):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyDiskState.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyDiskRetentionRuleArgs.builder
      builder.retentionRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerState.Builder)
    /**
     * @param defaultRetentionRule A `defaultRetentionRule` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def defaultRetentionRule(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerDefaultRetentionRuleArgs.Builder]):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerState.Builder =
      val argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerDefaultRetentionRuleArgs.builder
      builder.defaultRetentionRule(args(argsBuilder).build)

    /**
     * @param retentionRules One or more `retentionRule` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def retentionRules(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerRetentionRuleArgs.Builder]*):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerState.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyPostgresqlFlexibleServerRetentionRuleArgs.builder
      builder.retentionRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dataprotection.inputs.BackupVaultState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupVaultIdentityArgs.Builder]):
        com.pulumi.azure.dataprotection.inputs.BackupVaultState.Builder =
      val argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupVaultIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.dataprotection.inputs.BackupVaultState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.dataprotection.inputs.BackupPolicyDiskRetentionRuleArgs.Builder)
    /**
     * @param criteria A `criteria` block as defined below. Changing this forces a new Backup Policy Disk to be created.
     * @return builder
     */
    def criteria(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyDiskRetentionRuleCriteriaArgs.Builder]):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyDiskRetentionRuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyDiskRetentionRuleCriteriaArgs.builder
      builder.criteria(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterState.Builder)
    /**
     * @param defaultRetentionRule A `defaultRetentionRule` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def defaultRetentionRule(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterDefaultRetentionRuleArgs.Builder]):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterState.Builder =
      val argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterDefaultRetentionRuleArgs.builder
      builder.defaultRetentionRule(args(argsBuilder).build)

    /**
     * @param retentionRules One or more `retentionRule` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def retentionRules(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterRetentionRuleArgs.Builder]*):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterState.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyKubernetesClusterRetentionRuleArgs.builder
      builder.retentionRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerDefaultRetentionRuleArgs.Builder)
    /**
     * @param lifeCycles A `lifeCycle` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def lifeCycles(args: Endofunction[com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerDefaultRetentionRuleLifeCycleArgs.Builder]*):
        com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerDefaultRetentionRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.dataprotection.inputs.BackupPolicyMysqlFlexibleServerDefaultRetentionRuleLifeCycleArgs.builder
      builder.lifeCycles(args.map(_(argsBuilder).build)*)

  /** Manages a Backup Vault. */
  def BackupVault(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dataprotection.BackupVaultArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dataprotection.BackupVaultArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.dataprotection.BackupVault(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Backup Instance to back up MySQL Flexible Server. */
  def BackupInstanceMysqlFlexibleServer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dataprotection.BackupInstanceMysqlFlexibleServerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dataprotection.BackupInstanceMysqlFlexibleServerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.dataprotection.BackupInstanceMysqlFlexibleServer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
