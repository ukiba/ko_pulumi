package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object backupdisasterrecovery:
  /**
   * An AutoProtectionPolicy automates backup management by applying a backup plan to all
   * eligible resources that match the policy&#39;s criteria, instead of protecting each resource
   * individually. A policy takes effect only after it is attached to a scope, such as a
   * project, with a `googleBackupDrAutoProtectionPolicyBinding`.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about AutoProtectionPolicy, see:
   * 
   * * [API documentation](https://cloud.google.com/backup-disaster-recovery/docs/reference/rest/v1beta/projects.locations.autoProtectionPolicies)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/backup-disaster-recovery/docs)
   */
  def AutoProtectionPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.AutoProtectionPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.AutoProtectionPolicyArgs.builder
    com.pulumi.gcp.backupdisasterrecovery.AutoProtectionPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A backup plan defines when and how to back up a resource, including the backup&#39;s schedule, retention, and location.
   * 
   * To get more information about BackupPlan, see:
   * 
   * * [API documentation](https://cloud.google.com/backup-disaster-recovery/docs/reference/rest)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/backup-disaster-recovery/docs)
   */
  def BackupPlan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.BackupPlanArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.BackupPlanArgs.builder
    com.pulumi.gcp.backupdisasterrecovery.BackupPlan(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * A Backup and DR BackupPlanAssociation.
   * 
   * To get more information about BackupPlanAssociation, see:
   * 
   * * [API documentation](https://cloud.google.com/backup-disaster-recovery/docs/reference/rest)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/backup-disaster-recovery/docs)
   */
  def BackupPlanAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.BackupPlanAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.BackupPlanAssociationArgs.builder
    com.pulumi.gcp.backupdisasterrecovery.BackupPlanAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Container to store and organize immutable and indelible backups. */
  def BackupVault(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.BackupVaultArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.BackupVaultArgs.builder
    com.pulumi.gcp.backupdisasterrecovery.BackupVault(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object BackupdisasterrecoveryFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** A Backup and DR Backup. */
    inline def getBackup(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.backupdisasterrecovery.outputs.GetBackupResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getBackup(args(argsBuilder).build)

    /** A Backup and DR Backup. */
    inline def getBackupPlain(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.backupdisasterrecovery.outputs.GetBackupResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupPlainArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getBackupPlain(args(argsBuilder).build)

    inline def getBackupPlan(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupPlanArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.backupdisasterrecovery.outputs.GetBackupPlanResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupPlanArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getBackupPlan(args(argsBuilder).build)

    inline def getBackupPlanPlain(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupPlanPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.backupdisasterrecovery.outputs.GetBackupPlanResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupPlanPlainArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getBackupPlanPlain(args(argsBuilder).build)

    /** A Backup and DR BackupPlanAssociation. */
    inline def getBackupPlanAssociation(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupPlanAssociationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.backupdisasterrecovery.outputs.GetBackupPlanAssociationResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupPlanAssociationArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getBackupPlanAssociation(args(argsBuilder).build)

    /** A Backup and DR BackupPlanAssociation. */
    inline def getBackupPlanAssociationPlain(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupPlanAssociationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.backupdisasterrecovery.outputs.GetBackupPlanAssociationResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupPlanAssociationPlainArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getBackupPlanAssociationPlain(args(argsBuilder).build)

    /** Provides a list of Backup and DR BackupPlanAssociations. */
    inline def getBackupPlanAssociations(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupPlanAssociationsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.backupdisasterrecovery.outputs.GetBackupPlanAssociationsResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupPlanAssociationsArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getBackupPlanAssociations(args(argsBuilder).build)

    /** Provides a list of Backup and DR BackupPlanAssociations. */
    inline def getBackupPlanAssociationsPlain(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupPlanAssociationsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.backupdisasterrecovery.outputs.GetBackupPlanAssociationsResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupPlanAssociationsPlainArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getBackupPlanAssociationsPlain(args(argsBuilder).build)

    /** A Backup and DRBackupVault. */
    inline def getBackupVault(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupVaultArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.backupdisasterrecovery.outputs.GetBackupVaultResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupVaultArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getBackupVault(args(argsBuilder).build)

    /** A Backup and DRBackupVault. */
    inline def getBackupVaultPlain(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupVaultPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.backupdisasterrecovery.outputs.GetBackupVaultResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupVaultPlainArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getBackupVaultPlain(args(argsBuilder).build)

    /** A Backup and DR Data Source. */
    inline def getDataSource(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetDataSourceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.backupdisasterrecovery.outputs.GetDataSourceResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetDataSourceArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getDataSource(args(argsBuilder).build)

    /** A Backup and DR Data Source. */
    inline def getDataSourcePlain(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetDataSourcePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.backupdisasterrecovery.outputs.GetDataSourceResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetDataSourcePlainArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getDataSourcePlain(args(argsBuilder).build)

    /** Get information about a specific Backup and DR data source reference. */
    inline def getDataSourceReference(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetDataSourceReferenceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.backupdisasterrecovery.outputs.GetDataSourceReferenceResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetDataSourceReferenceArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getDataSourceReference(args(argsBuilder).build)

    /** Get information about a specific Backup and DR data source reference. */
    inline def getDataSourceReferencePlain(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetDataSourceReferencePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.backupdisasterrecovery.outputs.GetDataSourceReferenceResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetDataSourceReferencePlainArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getDataSourceReferencePlain(args(argsBuilder).build)

    /** A list of Backup and DR data source references. */
    inline def getDataSourceReferences(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetDataSourceReferencesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.backupdisasterrecovery.outputs.GetDataSourceReferencesResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetDataSourceReferencesArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getDataSourceReferences(args(argsBuilder).build)

    /** A list of Backup and DR data source references. */
    inline def getDataSourceReferencesPlain(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetDataSourceReferencesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.backupdisasterrecovery.outputs.GetDataSourceReferencesResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetDataSourceReferencesPlainArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getDataSourceReferencesPlain(args(argsBuilder).build)

    /** A Backup and DR Data Sources. */
    inline def getDataSources(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetDataSourcesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.backupdisasterrecovery.outputs.GetDataSourcesResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetDataSourcesArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getDataSources(args(argsBuilder).build)

    /** A Backup and DR Data Sources. */
    inline def getDataSourcesPlain(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetDataSourcesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.backupdisasterrecovery.outputs.GetDataSourcesResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetDataSourcesPlainArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getDataSourcesPlain(args(argsBuilder).build)

    /**
     * Get information about a Google Backup DR Management server.
     * 
     * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     */
    inline def getManagementServer(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetManagementServerArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.backupdisasterrecovery.outputs.GetManagementServerResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetManagementServerArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getManagementServer(args(argsBuilder).build)

    /**
     * Get information about a Google Backup DR Management server.
     * 
     * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     */
    inline def getManagementServerPlain(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetManagementServerPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.backupdisasterrecovery.outputs.GetManagementServerResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetManagementServerPlainArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getManagementServerPlain(args(argsBuilder).build)

  /**
   * A Backup and DR Management Server (Also referred as Management Console)
   * 
   * To get more information about ManagementServer, see:
   * 
   * * [API documentation](https://cloud.google.com/backup-disaster-recovery/docs/deployment/deployment-plan)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/backup-disaster-recovery/docs)
   */
  def ManagementServer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.ManagementServerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.backupdisasterrecovery.ManagementServerArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.backupdisasterrecovery.ManagementServer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * An imperative resource that triggers a GCBDR restoration event.
   * Creating this resource will initiate a restore operation from a specified backup.
   * The resource represents the restore operation and its result.
   */
  @deprecated("calls deprecated com.pulumi.gcp.backupdisasterrecovery.RestoreWorkloadArgs.Builder.name: `name` is deprecated and will be removed in a future major release. The backup is identified by the parameters (location, backup_vault_id, data_source_id, backup_id).") def RestoreWorkload(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.RestoreWorkloadArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.backupdisasterrecovery.RestoreWorkloadArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.backupdisasterrecovery.RestoreWorkload(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Initializes a Project-level default Backupdr config. It creates default Backupvault and default Backup Plan in same project for customers to protect instances.
   * 
   * To get more information about ServiceConfig, see:
   * 
   * * [API documentation](https://cloud.google.com/backup-disaster-recovery/docs/reference/rest/v1/projects.locations.serviceConfig)
   */
  def ServiceConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.ServiceConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.ServiceConfigArgs.builder
    com.pulumi.gcp.backupdisasterrecovery.ServiceConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
