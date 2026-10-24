package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object dataprotection:
  /** Manages a Backup Instance Blob Storage. */
  def BackupInstanceBlogStorage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dataprotection.BackupInstanceBlogStorageArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dataprotection.BackupInstanceBlogStorageArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.dataprotection.BackupInstanceBlogStorage(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Backup Instance to back up Data Lake Storage. */
  def BackupInstanceDataLakeStorage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dataprotection.BackupInstanceDataLakeStorageArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dataprotection.BackupInstanceDataLakeStorageArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.dataprotection.BackupInstanceDataLakeStorage(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Backup Instance to back up Disk. */
  def BackupInstanceDisk(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dataprotection.BackupInstanceDiskArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dataprotection.BackupInstanceDiskArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.dataprotection.BackupInstanceDisk(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Backup Instance to back up a Kubernetes Cluster. */
  def BackupInstanceKubernetesCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dataprotection.BackupInstanceKubernetesClusterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dataprotection.BackupInstanceKubernetesClusterArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.dataprotection.BackupInstanceKubernetesCluster(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Backup Instance to back up MySQL Flexible Server. */
  def BackupInstanceMysqlFlexibleServer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dataprotection.BackupInstanceMysqlFlexibleServerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dataprotection.BackupInstanceMysqlFlexibleServerArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.dataprotection.BackupInstanceMysqlFlexibleServer(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Backup Instance to back up PostgreSQL.
   * 
   * &gt; **Note:** The `azure.dataprotection.BackupInstancePostgresql` resource has been deprecated because Azure Database for PostgreSQL Single Server has been retired as of 2025-03-28 and will be removed in v5.0 of the AzureRM Provider.
   * 
   * &gt; **Note:** Before using this resource, there are some prerequisite permissions for configure backup and restore. See more details from &lt;https://docs.microsoft.com/azure/backup/backup-azure-database-postgresql#prerequisite-permissions-for-configure-backup-and-restore&gt;.
   */
  def BackupInstancePostgresql(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dataprotection.BackupInstancePostgresqlArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dataprotection.BackupInstancePostgresqlArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.dataprotection.BackupInstancePostgresql(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Backup Instance to back up PostgreSQL Flexible Server.
   * 
   * &gt; **Note:** Before using this resource, there are some prerequisite permissions for configure backup and restore. See more details from &lt;https://learn.microsoft.com/azure/backup/backup-azure-database-postgresql-flex-overview&gt;.
   */
  def BackupInstancePostgresqlFlexibleServer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dataprotection.BackupInstancePostgresqlFlexibleServerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dataprotection.BackupInstancePostgresqlFlexibleServerArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.dataprotection.BackupInstancePostgresqlFlexibleServer(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Backup Policy Blob Storage. */
  def BackupPolicyBlobStorage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dataprotection.BackupPolicyBlobStorageArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dataprotection.BackupPolicyBlobStorageArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.dataprotection.BackupPolicyBlobStorage(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Backup Policy to Azure Data Lake Storage. */
  def BackupPolicyDataLakeStorage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dataprotection.BackupPolicyDataLakeStorageArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dataprotection.BackupPolicyDataLakeStorageArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.dataprotection.BackupPolicyDataLakeStorage(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Backup Policy Disk. */
  def BackupPolicyDisk(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dataprotection.BackupPolicyDiskArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dataprotection.BackupPolicyDiskArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.dataprotection.BackupPolicyDisk(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Backup Policy to back up Kubernetes Cluster. */
  def BackupPolicyKubernetesCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dataprotection.BackupPolicyKubernetesClusterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dataprotection.BackupPolicyKubernetesClusterArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.dataprotection.BackupPolicyKubernetesCluster(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Backup Policy to back up MySQL Flexible Server. */
  def BackupPolicyMysqlFlexibleServer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dataprotection.BackupPolicyMysqlFlexibleServerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dataprotection.BackupPolicyMysqlFlexibleServerArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.dataprotection.BackupPolicyMysqlFlexibleServer(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Backup Policy to back up PostgreSQL.
   * 
   * &gt; **Note:** The `azure.dataprotection.BackupPolicyPostgresql` resource has been deprecated because Azure Database for PostgreSQL Single Server has been retired as of 2025-03-28 and will be removed in v5.0 of the AzureRM Provider.
   */
  def BackupPolicyPostgresql(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dataprotection.BackupPolicyPostgresqlArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dataprotection.BackupPolicyPostgresqlArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.dataprotection.BackupPolicyPostgresql(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Backup Policy to back up PostgreSQL Flexible Server. */
  def BackupPolicyPostgresqlFlexibleServer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dataprotection.BackupPolicyPostgresqlFlexibleServerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dataprotection.BackupPolicyPostgresqlFlexibleServerArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.dataprotection.BackupPolicyPostgresqlFlexibleServer(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Backup Vault. */
  def BackupVault(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dataprotection.BackupVaultArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dataprotection.BackupVaultArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.dataprotection.BackupVault(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Backup Vault Customer Managed Key.
   * 
   * &gt; **Note:** It is not possible to remove the Customer Managed Key from the Backup Vault once it&#39;s been added. To remove the Customer Managed Key, the parent Data Protection Backup Vault must be deleted and recreated.
   */
  def BackupVaultCustomerManagedKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dataprotection.BackupVaultCustomerManagedKeyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.dataprotection.BackupVaultCustomerManagedKeyArgs.builder
    com.pulumi.azure.dataprotection.BackupVaultCustomerManagedKey(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

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

  /** Manages a Resource Guard. */
  def ResourceGuard(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dataprotection.ResourceGuardArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dataprotection.ResourceGuardArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.dataprotection.ResourceGuard(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
