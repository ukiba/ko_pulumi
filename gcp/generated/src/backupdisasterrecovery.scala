package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object backupdisasterrecovery:
  type BackupdisasterrecoveryFunctions = com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions
  object BackupdisasterrecoveryFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.*
  extension (self: BackupdisasterrecoveryFunctions.type)
    /** A Backup and DR Backup. */
    def getBackup(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.backupdisasterrecovery.outputs.GetBackupResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getBackup(args(argsBuilder).build)

    /** A Backup and DR Backup. */
    def getBackupPlain(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.backupdisasterrecovery.outputs.GetBackupResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupPlainArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getBackupPlain(args(argsBuilder).build)

    def getBackupPlan(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupPlanArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.backupdisasterrecovery.outputs.GetBackupPlanResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupPlanArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getBackupPlan(args(argsBuilder).build)

    def getBackupPlanPlain(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupPlanPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.backupdisasterrecovery.outputs.GetBackupPlanResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupPlanPlainArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getBackupPlanPlain(args(argsBuilder).build)

    /** A Backup and DR BackupPlanAssociation. */
    def getBackupPlanAssociation(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupPlanAssociationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.backupdisasterrecovery.outputs.GetBackupPlanAssociationResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupPlanAssociationArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getBackupPlanAssociation(args(argsBuilder).build)

    /** A Backup and DR BackupPlanAssociation. */
    def getBackupPlanAssociationPlain(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupPlanAssociationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.backupdisasterrecovery.outputs.GetBackupPlanAssociationResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupPlanAssociationPlainArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getBackupPlanAssociationPlain(args(argsBuilder).build)

    /** Provides a list of Backup and DR BackupPlanAssociations. */
    def getBackupPlanAssociations(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupPlanAssociationsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.backupdisasterrecovery.outputs.GetBackupPlanAssociationsResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupPlanAssociationsArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getBackupPlanAssociations(args(argsBuilder).build)

    /** Provides a list of Backup and DR BackupPlanAssociations. */
    def getBackupPlanAssociationsPlain(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupPlanAssociationsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.backupdisasterrecovery.outputs.GetBackupPlanAssociationsResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupPlanAssociationsPlainArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getBackupPlanAssociationsPlain(args(argsBuilder).build)

    /** A Backup and DRBackupVault. */
    def getBackupVault(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupVaultArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.backupdisasterrecovery.outputs.GetBackupVaultResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupVaultArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getBackupVault(args(argsBuilder).build)

    /** A Backup and DRBackupVault. */
    def getBackupVaultPlain(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupVaultPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.backupdisasterrecovery.outputs.GetBackupVaultResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetBackupVaultPlainArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getBackupVaultPlain(args(argsBuilder).build)

    /** A Backup and DR Data Source. */
    def getDataSource(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetDataSourceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.backupdisasterrecovery.outputs.GetDataSourceResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetDataSourceArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getDataSource(args(argsBuilder).build)

    /** A Backup and DR Data Source. */
    def getDataSourcePlain(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetDataSourcePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.backupdisasterrecovery.outputs.GetDataSourceResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetDataSourcePlainArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getDataSourcePlain(args(argsBuilder).build)

    /** Get information about a specific Backup and DR data source reference. */
    def getDataSourceReference(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetDataSourceReferenceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.backupdisasterrecovery.outputs.GetDataSourceReferenceResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetDataSourceReferenceArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getDataSourceReference(args(argsBuilder).build)

    /** Get information about a specific Backup and DR data source reference. */
    def getDataSourceReferencePlain(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetDataSourceReferencePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.backupdisasterrecovery.outputs.GetDataSourceReferenceResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetDataSourceReferencePlainArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getDataSourceReferencePlain(args(argsBuilder).build)

    /** A list of Backup and DR data source references. */
    def getDataSourceReferences(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetDataSourceReferencesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.backupdisasterrecovery.outputs.GetDataSourceReferencesResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetDataSourceReferencesArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getDataSourceReferences(args(argsBuilder).build)

    /** A list of Backup and DR data source references. */
    def getDataSourceReferencesPlain(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetDataSourceReferencesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.backupdisasterrecovery.outputs.GetDataSourceReferencesResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetDataSourceReferencesPlainArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getDataSourceReferencesPlain(args(argsBuilder).build)

    /** A Backup and DR Data Sources. */
    def getDataSources(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetDataSourcesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.backupdisasterrecovery.outputs.GetDataSourcesResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetDataSourcesArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getDataSources(args(argsBuilder).build)

    /** A Backup and DR Data Sources. */
    def getDataSourcesPlain(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetDataSourcesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.backupdisasterrecovery.outputs.GetDataSourcesResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetDataSourcesPlainArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getDataSourcesPlain(args(argsBuilder).build)

    /**
     * Get information about a Google Backup DR Management server.
     * 
     *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    def getManagementServer(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetManagementServerArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.backupdisasterrecovery.outputs.GetManagementServerResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetManagementServerArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getManagementServer(args(argsBuilder).build)

    /**
     * Get information about a Google Backup DR Management server.
     * 
     *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    def getManagementServerPlain(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.GetManagementServerPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.backupdisasterrecovery.outputs.GetManagementServerResult] =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.GetManagementServerPlainArgs.builder
      com.pulumi.gcp.backupdisasterrecovery.BackupdisasterrecoveryFunctions.getManagementServerPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.backupdisasterrecovery.BackupVaultArgs.Builder)
    /**
     * @param encryptionConfig Encryption configuration for the backup vault.
     *  Structure is documented below.
     * @return builder
     */
    def encryptionConfig(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.BackupVaultEncryptionConfigArgs.Builder]):
        com.pulumi.gcp.backupdisasterrecovery.BackupVaultArgs.Builder =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.BackupVaultEncryptionConfigArgs.builder
      builder.encryptionConfig(args(argsBuilder).build)

  /**
   * Initializes a Project-level default Backupdr config. It creates default Backupvault and default Backup Plan in same project for customers to protect instances.
   * 
   *  To get more information about ServiceConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/backup-disaster-recovery/docs/reference/rest/v1/projects.locations.serviceConfig)
   */
  def ServiceConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.ServiceConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.ServiceConfigArgs.builder
    com.pulumi.gcp.backupdisasterrecovery.ServiceConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A backup plan defines when and how to back up a resource, including the backup&#39;s schedule, retention, and location.
   * 
   *  To get more information about BackupPlan, see:
   * 
   *  * [API documentation](https://cloud.google.com/backup-disaster-recovery/docs/reference/rest)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/backup-disaster-recovery/docs)
   */
  def BackupPlan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.BackupPlanArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.BackupPlanArgs.builder
    com.pulumi.gcp.backupdisasterrecovery.BackupPlan(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.backupdisasterrecovery.ManagementServerArgs.Builder)
    /**
     * @param networks Network details to create management server (management console).
     *  Structure is documented below.
     * @return builder
     */
    def networks(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.ManagementServerNetworkArgs.Builder]*):
        com.pulumi.gcp.backupdisasterrecovery.ManagementServerArgs.Builder =
      def argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.ManagementServerNetworkArgs.builder
      builder.networks(args.map(_(argsBuilder).build)*)

  /**
   * An imperative resource that triggers a GCBDR restoration event.
   *  Creating this resource will initiate a restore operation from a specified backup.
   *  The resource represents the restore operation and its result.
   */
  def RestoreWorkload(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.RestoreWorkloadArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.backupdisasterrecovery.RestoreWorkloadArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.backupdisasterrecovery.RestoreWorkload(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.backupdisasterrecovery.BackupPlanArgs.Builder)
    /**
     * @param backupRules The backup rules for this `BackupPlan`.
     *  Structure is documented below.
     * @return builder
     */
    def backupRules(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.BackupPlanBackupRuleArgs.Builder]*):
        com.pulumi.gcp.backupdisasterrecovery.BackupPlanArgs.Builder =
      def argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.BackupPlanBackupRuleArgs.builder
      builder.backupRules(args.map(_(argsBuilder).build)*)

    /**
     * @param diskBackupPlanProperties Defines optional disk related properties for backups generated by this plan.
     *  Structure is documented below.
     * @return builder
     */
    def diskBackupPlanProperties(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.BackupPlanDiskBackupPlanPropertiesArgs.Builder]):
        com.pulumi.gcp.backupdisasterrecovery.BackupPlanArgs.Builder =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.BackupPlanDiskBackupPlanPropertiesArgs.builder
      builder.diskBackupPlanProperties(args(argsBuilder).build)

  /**
   * A Backup and DR BackupPlanAssociation.
   * 
   *  To get more information about BackupPlanAssociation, see:
   * 
   *  * [API documentation](https://cloud.google.com/backup-disaster-recovery/docs/reference/rest)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/backup-disaster-recovery/docs)
   */
  def BackupPlanAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.BackupPlanAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.BackupPlanAssociationArgs.builder
    com.pulumi.gcp.backupdisasterrecovery.BackupPlanAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Backup and DR Management Server (Also referred as Management Console)
   * 
   *  To get more information about ManagementServer, see:
   * 
   *  * [API documentation](https://cloud.google.com/backup-disaster-recovery/docs/deployment/deployment-plan)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/backup-disaster-recovery/docs)
   */
  def ManagementServer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.ManagementServerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.backupdisasterrecovery.ManagementServerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.backupdisasterrecovery.ManagementServer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.backupdisasterrecovery.RestoreWorkloadArgs.Builder)
    /**
     * @param computeInstanceRestoreProperties Optional. Compute Engine instance properties to be overridden during restore.
     *  Structure is documented below.
     * @return builder
     */
    def computeInstanceRestoreProperties(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesArgs.Builder]):
        com.pulumi.gcp.backupdisasterrecovery.RestoreWorkloadArgs.Builder =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesArgs.builder
      builder.computeInstanceRestoreProperties(args(argsBuilder).build)

    /**
     * @param computeInstanceTargetEnvironment Optional. The destination environment for GCE VM restoration.
     *  Structure is documented below.
     * @return builder
     */
    def computeInstanceTargetEnvironment(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceTargetEnvironmentArgs.Builder]):
        com.pulumi.gcp.backupdisasterrecovery.RestoreWorkloadArgs.Builder =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceTargetEnvironmentArgs.builder
      builder.computeInstanceTargetEnvironment(args(argsBuilder).build)

    /**
     * @param diskRestoreProperties Optional. Disk properties to be overridden during restore.
     *  Structure is documented below.
     * @return builder
     */
    def diskRestoreProperties(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadDiskRestorePropertiesArgs.Builder]):
        com.pulumi.gcp.backupdisasterrecovery.RestoreWorkloadArgs.Builder =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadDiskRestorePropertiesArgs.builder
      builder.diskRestoreProperties(args(argsBuilder).build)

    /**
     * @param diskTargetEnvironment Optional. The destination environment for zonal disk restoration.
     *  Structure is documented below.
     * @return builder
     */
    def diskTargetEnvironment(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadDiskTargetEnvironmentArgs.Builder]):
        com.pulumi.gcp.backupdisasterrecovery.RestoreWorkloadArgs.Builder =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadDiskTargetEnvironmentArgs.builder
      builder.diskTargetEnvironment(args(argsBuilder).build)

    /**
     * @param regionDiskTargetEnvironment Optional. The destination environment for regional disk restoration.
     *  Structure is documented below.
     * @return builder
     */
    def regionDiskTargetEnvironment(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadRegionDiskTargetEnvironmentArgs.Builder]):
        com.pulumi.gcp.backupdisasterrecovery.RestoreWorkloadArgs.Builder =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadRegionDiskTargetEnvironmentArgs.builder
      builder.regionDiskTargetEnvironment(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesArgs.Builder)
    /**
     * @param advancedMachineFeatures Optional. Controls for advanced machine-related behavior features.
     *  Structure is documented below.
     * @return builder
     */
    def advancedMachineFeatures(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesAdvancedMachineFeaturesArgs.Builder]):
        com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesAdvancedMachineFeaturesArgs.builder
      builder.advancedMachineFeatures(args(argsBuilder).build)

    /**
     * @param allocationAffinity Optional. Specifies the reservations that this instance can consume from.
     *  Structure is documented below.
     * @return builder
     */
    def allocationAffinity(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesAllocationAffinityArgs.Builder]):
        com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesAllocationAffinityArgs.builder
      builder.allocationAffinity(args(argsBuilder).build)

    /**
     * @param confidentialInstanceConfig Optional. Controls Confidential compute options on the instance.
     *  Structure is documented below.
     * @return builder
     */
    def confidentialInstanceConfig(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesConfidentialInstanceConfigArgs.Builder]):
        com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesConfidentialInstanceConfigArgs.builder
      builder.confidentialInstanceConfig(args(argsBuilder).build)

    /**
     * @param disks Optional. Array of disks associated with this instance.
     *  Structure is documented below.
     * @return builder
     */
    def disks(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesDiskArgs.Builder]*):
        com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesDiskArgs.builder
      builder.disks(args.map(_(argsBuilder).build)*)

    /**
     * @param displayDevice Optional. Enables display device for the instance.
     *  Structure is documented below.
     * @return builder
     */
    def displayDevice(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesDisplayDeviceArgs.Builder]):
        com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesDisplayDeviceArgs.builder
      builder.displayDevice(args(argsBuilder).build)

    /**
     * @param guestAccelerators Optional. A list of the type and count of accelerator cards attached to the instance.
     *  Structure is documented below.
     * @return builder
     */
    def guestAccelerators(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesGuestAcceleratorArgs.Builder]*):
        com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesGuestAcceleratorArgs.builder
      builder.guestAccelerators(args.map(_(argsBuilder).build)*)

    /**
     * @param instanceEncryptionKey Optional. Encrypts suspended data for an instance with a customer-managed encryption key.
     *  Structure is documented below.
     * @return builder
     */
    def instanceEncryptionKey(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesInstanceEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesInstanceEncryptionKeyArgs.builder
      builder.instanceEncryptionKey(args(argsBuilder).build)

    /**
     * @param labels Optional. Labels to apply to this instance.
     *  Structure is documented below.
     * @return builder
     */
    def labels(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesLabelArgs.Builder]*):
        com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesLabelArgs.builder
      builder.labels(args.map(_(argsBuilder).build)*)

    /**
     * @param metadata Optional. This includes custom metadata and predefined keys.
     *  Structure is documented below.
     * @return builder
     */
    def metadata(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesMetadataArgs.Builder]):
        com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesMetadataArgs.builder
      builder.metadata(args(argsBuilder).build)

    /**
     * @param networkInterfaces Optional. An array of network configurations for this instance.
     *  Structure is documented below.
     * @return builder
     */
    def networkInterfaces(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesNetworkInterfaceArgs.Builder]*):
        com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param networkPerformanceConfig Optional. Configure network performance such as egress bandwidth tier.
     *  Structure is documented below.
     * @return builder
     */
    def networkPerformanceConfig(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesNetworkPerformanceConfigArgs.Builder]):
        com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesNetworkPerformanceConfigArgs.builder
      builder.networkPerformanceConfig(args(argsBuilder).build)

    /**
     * @param params Input only. Additional params passed with the request.
     *  Structure is documented below.
     * @return builder
     */
    def params(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesParamsArgs.Builder]):
        com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesParamsArgs.builder
      builder.params(args(argsBuilder).build)

    /**
     * @param scheduling Optional. Sets the scheduling options for this instance.
     *  Structure is documented below.
     * @return builder
     */
    def scheduling(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesSchedulingArgs.Builder]):
        com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesSchedulingArgs.builder
      builder.scheduling(args(argsBuilder).build)

    /**
     * @param serviceAccounts Optional. A list of service accounts, with their specified scopes, authorized for this instance.
     *  Structure is documented below.
     * @return builder
     */
    def serviceAccounts(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesServiceAccountArgs.Builder]*):
        com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesServiceAccountArgs.builder
      builder.serviceAccounts(args.map(_(argsBuilder).build)*)

    /**
     * @param shieldedInstanceConfig Optional. Controls Shielded compute options on the instance.
     *  Structure is documented below.
     * @return builder
     */
    def shieldedInstanceConfig(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesShieldedInstanceConfigArgs.Builder]):
        com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesShieldedInstanceConfigArgs.builder
      builder.shieldedInstanceConfig(args(argsBuilder).build)

    /**
     * @param tags Optional. Tags to apply to this instance.
     *  Structure is documented below.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesTagsArgs.Builder]):
        com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesTagsArgs.builder
      builder.tags(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.backupdisasterrecovery.inputs.ManagementServerState.Builder)
    /**
     * @param managementUris The management console URI
     *  Structure is documented below.
     * @return builder
     */
    def managementUris(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.ManagementServerManagementUriArgs.Builder]*):
        com.pulumi.gcp.backupdisasterrecovery.inputs.ManagementServerState.Builder =
      def argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.ManagementServerManagementUriArgs.builder
      builder.managementUris(args.map(_(argsBuilder).build)*)

    /**
     * @param networks Network details to create management server (management console).
     *  Structure is documented below.
     * @return builder
     */
    def networks(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.ManagementServerNetworkArgs.Builder]*):
        com.pulumi.gcp.backupdisasterrecovery.inputs.ManagementServerState.Builder =
      def argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.ManagementServerNetworkArgs.builder
      builder.networks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesParamsArgs.Builder)
    /**
     * @param resourceManagerTags Structure is documented below.
     * @return builder
     */
    def resourceManagerTags(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesParamsResourceManagerTagArgs.Builder]*):
        com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesParamsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesParamsResourceManagerTagArgs.builder
      builder.resourceManagerTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadDiskRestorePropertiesArgs.Builder)
    /**
     * @param diskEncryptionKey Optional. Encrypts the disk using a customer-supplied encryption key.
     *  Structure is documented below.
     * @return builder
     */
    def diskEncryptionKey(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadDiskRestorePropertiesDiskEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadDiskRestorePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadDiskRestorePropertiesDiskEncryptionKeyArgs.builder
      builder.diskEncryptionKey(args(argsBuilder).build)

    /**
     * @param guestOsFeatures Optional. A list of features to enable in the guest operating system.
     *  Structure is documented below.
     * @return builder
     */
    def guestOsFeatures(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadDiskRestorePropertiesGuestOsFeatureArgs.Builder]*):
        com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadDiskRestorePropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadDiskRestorePropertiesGuestOsFeatureArgs.builder
      builder.guestOsFeatures(args.map(_(argsBuilder).build)*)

    /**
     * @param labels Optional. Labels to apply to this disk.
     *  Structure is documented below.
     * @return builder
     */
    def labels(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadDiskRestorePropertiesLabelArgs.Builder]*):
        com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadDiskRestorePropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadDiskRestorePropertiesLabelArgs.builder
      builder.labels(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceManagerTags Optional. Resource manager tags to be bound to the disk.
     *  Structure is documented below.
     * @return builder
     */
    def resourceManagerTags(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadDiskRestorePropertiesResourceManagerTagArgs.Builder]*):
        com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadDiskRestorePropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadDiskRestorePropertiesResourceManagerTagArgs.builder
      builder.resourceManagerTags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.backupdisasterrecovery.inputs.BackupPlanBackupRuleArgs.Builder)
    /**
     * @param standardSchedule StandardSchedule defines a schedule that runs within the confines of a defined window of days.
     *  Structure is documented below.
     * @return builder
     */
    def standardSchedule(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.BackupPlanBackupRuleStandardScheduleArgs.Builder]):
        com.pulumi.gcp.backupdisasterrecovery.inputs.BackupPlanBackupRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.BackupPlanBackupRuleStandardScheduleArgs.builder
      builder.standardSchedule(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.backupdisasterrecovery.inputs.BackupPlanAssociationState.Builder)
    /**
     * @param rulesConfigInfos Message for rules config info
     *  Structure is documented below.
     * @return builder
     */
    def rulesConfigInfos(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.BackupPlanAssociationRulesConfigInfoArgs.Builder]*):
        com.pulumi.gcp.backupdisasterrecovery.inputs.BackupPlanAssociationState.Builder =
      def argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.BackupPlanAssociationRulesConfigInfoArgs.builder
      builder.rulesConfigInfos(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesNetworkInterfaceArgs.Builder)
    /**
     * @param accessConfigs Structure is documented below.
     * @return builder
     */
    def accessConfigs(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesNetworkInterfaceAccessConfigArgs.Builder]*):
        com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesNetworkInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesNetworkInterfaceAccessConfigArgs.builder
      builder.accessConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param aliasIpRanges Structure is documented below.
     * @return builder
     */
    def aliasIpRanges(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesNetworkInterfaceAliasIpRangeArgs.Builder]*):
        com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesNetworkInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesNetworkInterfaceAliasIpRangeArgs.builder
      builder.aliasIpRanges(args.map(_(argsBuilder).build)*)

    /**
     * @param ipv6AccessConfigs Structure is documented below.
     * @return builder
     */
    def ipv6AccessConfigs(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesNetworkInterfaceIpv6AccessConfigArgs.Builder]*):
        com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesNetworkInterfaceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesNetworkInterfaceIpv6AccessConfigArgs.builder
      builder.ipv6AccessConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesDiskArgs.Builder)
    /**
     * @param diskEncryptionKey Optional. Encrypts or decrypts a disk using a customer-supplied encryption key.
     *  Structure is documented below.
     * @return builder
     */
    def diskEncryptionKey(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesDiskDiskEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesDiskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesDiskDiskEncryptionKeyArgs.builder
      builder.diskEncryptionKey(args(argsBuilder).build)

    /**
     * @param guestOsFeatures Optional. A list of features to enable on the guest operating system.
     *  Structure is documented below.
     * @return builder
     */
    def guestOsFeatures(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesDiskGuestOsFeatureArgs.Builder]*):
        com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesDiskArgs.Builder =
      def argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesDiskGuestOsFeatureArgs.builder
      builder.guestOsFeatures(args.map(_(argsBuilder).build)*)

    /**
     * @param initializeParams Optional. Specifies the parameters to initialize this disk.
     *  Structure is documented below.
     * @return builder
     */
    def initializeParams(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesDiskInitializeParamsArgs.Builder]):
        com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesDiskArgs.Builder =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesDiskInitializeParamsArgs.builder
      builder.initializeParams(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadState.Builder)
    /**
     * @param computeInstanceRestoreProperties Optional. Compute Engine instance properties to be overridden during restore.
     *  Structure is documented below.
     * @return builder
     */
    def computeInstanceRestoreProperties(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesArgs.Builder]):
        com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadState.Builder =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesArgs.builder
      builder.computeInstanceRestoreProperties(args(argsBuilder).build)

    /**
     * @param computeInstanceTargetEnvironment Optional. The destination environment for GCE VM restoration.
     *  Structure is documented below.
     * @return builder
     */
    def computeInstanceTargetEnvironment(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceTargetEnvironmentArgs.Builder]):
        com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadState.Builder =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceTargetEnvironmentArgs.builder
      builder.computeInstanceTargetEnvironment(args(argsBuilder).build)

    /**
     * @param diskRestoreProperties Optional. Disk properties to be overridden during restore.
     *  Structure is documented below.
     * @return builder
     */
    def diskRestoreProperties(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadDiskRestorePropertiesArgs.Builder]):
        com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadState.Builder =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadDiskRestorePropertiesArgs.builder
      builder.diskRestoreProperties(args(argsBuilder).build)

    /**
     * @param diskTargetEnvironment Optional. The destination environment for zonal disk restoration.
     *  Structure is documented below.
     * @return builder
     */
    def diskTargetEnvironment(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadDiskTargetEnvironmentArgs.Builder]):
        com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadState.Builder =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadDiskTargetEnvironmentArgs.builder
      builder.diskTargetEnvironment(args(argsBuilder).build)

    /**
     * @param regionDiskTargetEnvironment Optional. The destination environment for regional disk restoration.
     *  Structure is documented below.
     * @return builder
     */
    def regionDiskTargetEnvironment(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadRegionDiskTargetEnvironmentArgs.Builder]):
        com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadState.Builder =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadRegionDiskTargetEnvironmentArgs.builder
      builder.regionDiskTargetEnvironment(args(argsBuilder).build)

    /**
     * @param targetResources Output only. Details of the target resource created/modified as part of restore.
     *  Structure is documented below.
     * @return builder
     */
    def targetResources(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadTargetResourceArgs.Builder]*):
        com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadState.Builder =
      def argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadTargetResourceArgs.builder
      builder.targetResources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadTargetResourceArgs.Builder)
    /**
     * @param gcpResource Output only. Details of the native Google Cloud resource created as part of restore.
     *  Structure is documented below.
     * @return builder
     */
    def gcpResource(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadTargetResourceGcpResourceArgs.Builder]):
        com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadTargetResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadTargetResourceGcpResourceArgs.builder
      builder.gcpResource(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.backupdisasterrecovery.inputs.BackupPlanBackupRuleStandardScheduleArgs.Builder)
    /**
     * @param backupWindow A BackupWindow defines the window of the day during which backup jobs will run. Jobs are queued at the beginning of the window and will be marked as
     *  `NOT_RUN` if they do not start by the end of the window.
     *  Structure is documented below.
     * @return builder
     */
    def backupWindow(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.BackupPlanBackupRuleStandardScheduleBackupWindowArgs.Builder]):
        com.pulumi.gcp.backupdisasterrecovery.inputs.BackupPlanBackupRuleStandardScheduleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.BackupPlanBackupRuleStandardScheduleBackupWindowArgs.builder
      builder.backupWindow(args(argsBuilder).build)

    /**
     * @param weekDayOfMonth Specifies a week day of the month like FIRST SUNDAY or LAST MONDAY, on which jobs will run.
     *  Structure is documented below.
     * @return builder
     */
    def weekDayOfMonth(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.BackupPlanBackupRuleStandardScheduleWeekDayOfMonthArgs.Builder]):
        com.pulumi.gcp.backupdisasterrecovery.inputs.BackupPlanBackupRuleStandardScheduleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.BackupPlanBackupRuleStandardScheduleWeekDayOfMonthArgs.builder
      builder.weekDayOfMonth(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.backupdisasterrecovery.inputs.BackupPlanState.Builder)
    /**
     * @param backupRules The backup rules for this `BackupPlan`.
     *  Structure is documented below.
     * @return builder
     */
    def backupRules(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.BackupPlanBackupRuleArgs.Builder]*):
        com.pulumi.gcp.backupdisasterrecovery.inputs.BackupPlanState.Builder =
      def argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.BackupPlanBackupRuleArgs.builder
      builder.backupRules(args.map(_(argsBuilder).build)*)

    /**
     * @param diskBackupPlanProperties Defines optional disk related properties for backups generated by this plan.
     *  Structure is documented below.
     * @return builder
     */
    def diskBackupPlanProperties(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.BackupPlanDiskBackupPlanPropertiesArgs.Builder]):
        com.pulumi.gcp.backupdisasterrecovery.inputs.BackupPlanState.Builder =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.BackupPlanDiskBackupPlanPropertiesArgs.builder
      builder.diskBackupPlanProperties(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.backupdisasterrecovery.inputs.BackupVaultState.Builder)
    /**
     * @param encryptionConfig Encryption configuration for the backup vault.
     *  Structure is documented below.
     * @return builder
     */
    def encryptionConfig(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.BackupVaultEncryptionConfigArgs.Builder]):
        com.pulumi.gcp.backupdisasterrecovery.inputs.BackupVaultState.Builder =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.BackupVaultEncryptionConfigArgs.builder
      builder.encryptionConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesSchedulingArgs.Builder)
    /**
     * @param localSsdRecoveryTimeout A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def localSsdRecoveryTimeout(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesSchedulingLocalSsdRecoveryTimeoutArgs.Builder]):
        com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesSchedulingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesSchedulingLocalSsdRecoveryTimeoutArgs.builder
      builder.localSsdRecoveryTimeout(args(argsBuilder).build)

    /**
     * @param maxRunDuration A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def maxRunDuration(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesSchedulingMaxRunDurationArgs.Builder]):
        com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesSchedulingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesSchedulingMaxRunDurationArgs.builder
      builder.maxRunDuration(args(argsBuilder).build)

    /**
     * @param nodeAffinities Structure is documented below.
     * @return builder
     */
    def nodeAffinities(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesSchedulingNodeAffinityArgs.Builder]*):
        com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesSchedulingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesSchedulingNodeAffinityArgs.builder
      builder.nodeAffinities(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesMetadataArgs.Builder)
    /**
     * @param items Structure is documented below.
     * @return builder
     */
    def items(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesMetadataItemArgs.Builder]*):
        com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesMetadataArgs.Builder =
      def argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.RestoreWorkloadComputeInstanceRestorePropertiesMetadataItemArgs.builder
      builder.items(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.backupdisasterrecovery.inputs.BackupPlanAssociationRulesConfigInfoArgs.Builder)
    /**
     * @param lastBackupErrors (Output)
     *  google.rpc.Status object to store the last backup error
     *  Structure is documented below.
     * @return builder
     */
    def lastBackupErrors(args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.inputs.BackupPlanAssociationRulesConfigInfoLastBackupErrorArgs.Builder]*):
        com.pulumi.gcp.backupdisasterrecovery.inputs.BackupPlanAssociationRulesConfigInfoArgs.Builder =
      def argsBuilder = com.pulumi.gcp.backupdisasterrecovery.inputs.BackupPlanAssociationRulesConfigInfoLastBackupErrorArgs.builder
      builder.lastBackupErrors(args.map(_(argsBuilder).build)*)

  /** Container to store and organize immutable and indelible backups. */
  def BackupVault(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.backupdisasterrecovery.BackupVaultArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.backupdisasterrecovery.BackupVaultArgs.builder
    com.pulumi.gcp.backupdisasterrecovery.BackupVault(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
