package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object oracle:
  /** Manages an Exadata Database Storage Vault. */
  def ExascaleDatabaseStorageVault(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.oracle.ExascaleDatabaseStorageVaultArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.oracle.ExascaleDatabaseStorageVaultArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.oracle.ExascaleDatabaseStorageVault(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.oracle.CloudVmClusterArgs.Builder)
    /**
     * @param dataCollectionOptions A `dataCollectionOptions` block as defined below. Changing this forces a new Cloud VM Cluster to be created.
     * @return builder
     */
    def dataCollectionOptions(args: Endofunction[com.pulumi.azure.oracle.inputs.CloudVmClusterDataCollectionOptionsArgs.Builder]):
        com.pulumi.azure.oracle.CloudVmClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.oracle.inputs.CloudVmClusterDataCollectionOptionsArgs.builder
      builder.dataCollectionOptions(args(argsBuilder).build)

    /**
     * @param fileSystemConfigurations A `fileSystemConfiguration` block as defined below.
     * @return builder
     */
    def fileSystemConfigurations(args: Endofunction[com.pulumi.azure.oracle.inputs.CloudVmClusterFileSystemConfigurationArgs.Builder]*):
        com.pulumi.azure.oracle.CloudVmClusterArgs.Builder =
      def argsBuilder = com.pulumi.azure.oracle.inputs.CloudVmClusterFileSystemConfigurationArgs.builder
      builder.fileSystemConfigurations(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.oracle.CloudVmClusterArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manage an autonomous database clone from backup. */
  def AutonomousDatabaseCloneFromBackup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.oracle.AutonomousDatabaseCloneFromBackupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.oracle.AutonomousDatabaseCloneFromBackupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.oracle.AutonomousDatabaseCloneFromBackup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an autonomous database clone from database. */
  def AutonomousDatabaseCloneFromDatabase(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.oracle.AutonomousDatabaseCloneFromDatabaseArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.oracle.AutonomousDatabaseCloneFromDatabaseArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.oracle.AutonomousDatabaseCloneFromDatabase(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Autonomous Database. */
  def AutonomousDatabase(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.oracle.AutonomousDatabaseArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.oracle.AutonomousDatabaseArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.oracle.AutonomousDatabase(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object OracleFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Gets a list of supported character sets. */
    inline def getAdbsCharacterSets(args: Endofunction[com.pulumi.azure.oracle.inputs.GetAdbsCharacterSetsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.oracle.outputs.GetAdbsCharacterSetsResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetAdbsCharacterSetsArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getAdbsCharacterSets(args(argsBuilder).build)

    /** Gets a list of supported character sets. */
    inline def getAdbsCharacterSetsPlain(args: Endofunction[com.pulumi.azure.oracle.inputs.GetAdbsCharacterSetsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.oracle.outputs.GetAdbsCharacterSetsResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetAdbsCharacterSetsPlainArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getAdbsCharacterSetsPlain(args(argsBuilder).build)

    /** Gets a list of supported national character sets. */
    inline def getAdbsNationalCharacterSets(args: Endofunction[com.pulumi.azure.oracle.inputs.GetAdbsNationalCharacterSetsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.oracle.outputs.GetAdbsNationalCharacterSetsResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetAdbsNationalCharacterSetsArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getAdbsNationalCharacterSets(args(argsBuilder).build)

    /** Gets a list of supported national character sets. */
    inline def getAdbsNationalCharacterSetsPlain(args: Endofunction[com.pulumi.azure.oracle.inputs.GetAdbsNationalCharacterSetsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.oracle.outputs.GetAdbsNationalCharacterSetsResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetAdbsNationalCharacterSetsPlainArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getAdbsNationalCharacterSetsPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Autonomous Database. */
    inline def getAutonomousDatabase(args: Endofunction[com.pulumi.azure.oracle.inputs.GetAutonomousDatabaseArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.oracle.outputs.GetAutonomousDatabaseResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetAutonomousDatabaseArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getAutonomousDatabase(args(argsBuilder).build)

    /** Use this data source to access information about an existing Autonomous Database. */
    inline def getAutonomousDatabasePlain(args: Endofunction[com.pulumi.azure.oracle.inputs.GetAutonomousDatabasePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.oracle.outputs.GetAutonomousDatabaseResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetAutonomousDatabasePlainArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getAutonomousDatabasePlain(args(argsBuilder).build)

    /** Use this data source to access information about existing Autonomous Database Backups. */
    inline def getAutonomousDatabaseBackup(args: Endofunction[com.pulumi.azure.oracle.inputs.GetAutonomousDatabaseBackupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.oracle.outputs.GetAutonomousDatabaseBackupResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetAutonomousDatabaseBackupArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getAutonomousDatabaseBackup(args(argsBuilder).build)

    /** Use this data source to access information about existing Autonomous Database Backups. */
    inline def getAutonomousDatabaseBackupPlain(args: Endofunction[com.pulumi.azure.oracle.inputs.GetAutonomousDatabaseBackupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.oracle.outputs.GetAutonomousDatabaseBackupResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetAutonomousDatabaseBackupPlainArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getAutonomousDatabaseBackupPlain(args(argsBuilder).build)

    /** Use this data source to access information about existing Autonomous Database Backups. */
    inline def getAutonomousDatabaseBackups(args: Endofunction[com.pulumi.azure.oracle.inputs.GetAutonomousDatabaseBackupsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.oracle.outputs.GetAutonomousDatabaseBackupsResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetAutonomousDatabaseBackupsArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getAutonomousDatabaseBackups(args(argsBuilder).build)

    /** Use this data source to access information about existing Autonomous Database Backups. */
    inline def getAutonomousDatabaseBackupsPlain(args: Endofunction[com.pulumi.azure.oracle.inputs.GetAutonomousDatabaseBackupsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.oracle.outputs.GetAutonomousDatabaseBackupsResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetAutonomousDatabaseBackupsPlainArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getAutonomousDatabaseBackupsPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing autonomous database clone from backup. */
    inline def getAutonomousDatabaseCloneFromBackup(args: Endofunction[com.pulumi.azure.oracle.inputs.GetAutonomousDatabaseCloneFromBackupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.oracle.outputs.GetAutonomousDatabaseCloneFromBackupResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetAutonomousDatabaseCloneFromBackupArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getAutonomousDatabaseCloneFromBackup(args(argsBuilder).build)

    /** Use this data source to access information about an existing autonomous database clone from backup. */
    inline def getAutonomousDatabaseCloneFromBackupPlain(args: Endofunction[com.pulumi.azure.oracle.inputs.GetAutonomousDatabaseCloneFromBackupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.oracle.outputs.GetAutonomousDatabaseCloneFromBackupResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetAutonomousDatabaseCloneFromBackupPlainArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getAutonomousDatabaseCloneFromBackupPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing autonomous database clone from database. */
    inline def getAutonomousDatabaseCloneFromDatabase(args: Endofunction[com.pulumi.azure.oracle.inputs.GetAutonomousDatabaseCloneFromDatabaseArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.oracle.outputs.GetAutonomousDatabaseCloneFromDatabaseResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetAutonomousDatabaseCloneFromDatabaseArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getAutonomousDatabaseCloneFromDatabase(args(argsBuilder).build)

    /** Use this data source to access information about an existing autonomous database clone from database. */
    inline def getAutonomousDatabaseCloneFromDatabasePlain(args: Endofunction[com.pulumi.azure.oracle.inputs.GetAutonomousDatabaseCloneFromDatabasePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.oracle.outputs.GetAutonomousDatabaseCloneFromDatabaseResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetAutonomousDatabaseCloneFromDatabasePlainArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getAutonomousDatabaseCloneFromDatabasePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Cloud VM Cluster. */
    inline def getCloudVmCluster(args: Endofunction[com.pulumi.azure.oracle.inputs.GetCloudVmClusterArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.oracle.outputs.GetCloudVmClusterResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetCloudVmClusterArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getCloudVmCluster(args(argsBuilder).build)

    /** Use this data source to access information about an existing Cloud VM Cluster. */
    inline def getCloudVmClusterPlain(args: Endofunction[com.pulumi.azure.oracle.inputs.GetCloudVmClusterPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.oracle.outputs.GetCloudVmClusterResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetCloudVmClusterPlainArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getCloudVmClusterPlain(args(argsBuilder).build)

    /** Use this data source to access information about existing Oracle Database Systems Versions. */
    inline def getDatabaseSystemVersions(args: Endofunction[com.pulumi.azure.oracle.inputs.GetDatabaseSystemVersionsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.oracle.outputs.GetDatabaseSystemVersionsResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetDatabaseSystemVersionsArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getDatabaseSystemVersions(args(argsBuilder).build)

    /** Use this data source to access information about existing Oracle Database Systems Versions. */
    inline def getDatabaseSystemVersionsPlain(args: Endofunction[com.pulumi.azure.oracle.inputs.GetDatabaseSystemVersionsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.oracle.outputs.GetDatabaseSystemVersionsResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetDatabaseSystemVersionsPlainArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getDatabaseSystemVersionsPlain(args(argsBuilder).build)

    /** Lists the database nodes for the specified Cloud VM Cluster. */
    inline def getDbNodes(args: Endofunction[com.pulumi.azure.oracle.inputs.GetDbNodesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.oracle.outputs.GetDbNodesResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetDbNodesArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getDbNodes(args(argsBuilder).build)

    /** Lists the database nodes for the specified Cloud VM Cluster. */
    inline def getDbNodesPlain(args: Endofunction[com.pulumi.azure.oracle.inputs.GetDbNodesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.oracle.outputs.GetDbNodesResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetDbNodesPlainArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getDbNodesPlain(args(argsBuilder).build)

    /** Use this data source to access information about existing DB Servers. */
    inline def getDbServers(args: Endofunction[com.pulumi.azure.oracle.inputs.GetDbServersArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.oracle.outputs.GetDbServersResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetDbServersArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getDbServers(args(argsBuilder).build)

    /** Use this data source to access information about existing DB Servers. */
    inline def getDbServersPlain(args: Endofunction[com.pulumi.azure.oracle.inputs.GetDbServersPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.oracle.outputs.GetDbServersResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetDbServersPlainArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getDbServersPlain(args(argsBuilder).build)

    /**
     * This data source provides the list of DB System Shapes in Oracle Cloud Infrastructure Database service.
     * 
     *  Gets a list of the shapes that can be used to launch a new DB system. The shape determines resources to allocate to the DB system - CPU cores and memory for VM shapes; CPU cores, memory and storage for non-VM (or bare metal) shapes.
     */
    inline def getDbSystemShapes(args: Endofunction[com.pulumi.azure.oracle.inputs.GetDbSystemShapesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.oracle.outputs.GetDbSystemShapesResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetDbSystemShapesArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getDbSystemShapes(args(argsBuilder).build)

    /**
     * This data source provides the list of DB System Shapes in Oracle Cloud Infrastructure Database service.
     * 
     *  Gets a list of the shapes that can be used to launch a new DB system. The shape determines resources to allocate to the DB system - CPU cores and memory for VM shapes; CPU cores, memory and storage for non-VM (or bare metal) shapes.
     */
    inline def getDbSystemShapesPlain(args: Endofunction[com.pulumi.azure.oracle.inputs.GetDbSystemShapesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.oracle.outputs.GetDbSystemShapesResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetDbSystemShapesPlainArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getDbSystemShapesPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Cloud Exadata Infrastructure. */
    inline def getExadataInfrastructure(args: Endofunction[com.pulumi.azure.oracle.inputs.GetExadataInfrastructureArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.oracle.outputs.GetExadataInfrastructureResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetExadataInfrastructureArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getExadataInfrastructure(args(argsBuilder).build)

    /** Use this data source to access information about an existing Cloud Exadata Infrastructure. */
    inline def getExadataInfrastructurePlain(args: Endofunction[com.pulumi.azure.oracle.inputs.GetExadataInfrastructurePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.oracle.outputs.GetExadataInfrastructureResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetExadataInfrastructurePlainArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getExadataInfrastructurePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Exadata Database Storage Vault */
    inline def getExascaleDatabaseStorageVault(args: Endofunction[com.pulumi.azure.oracle.inputs.GetExascaleDatabaseStorageVaultArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.oracle.outputs.GetExascaleDatabaseStorageVaultResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetExascaleDatabaseStorageVaultArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getExascaleDatabaseStorageVault(args(argsBuilder).build)

    /** Use this data source to access information about an existing Exadata Database Storage Vault */
    inline def getExascaleDatabaseStorageVaultPlain(args: Endofunction[com.pulumi.azure.oracle.inputs.GetExascaleDatabaseStorageVaultPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.oracle.outputs.GetExascaleDatabaseStorageVaultResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetExascaleDatabaseStorageVaultPlainArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getExascaleDatabaseStorageVaultPlain(args(argsBuilder).build)

    /**
     * This data source provides the list of GI Versions in Oracle Cloud Infrastructure Database service.
     * 
     *  Gets a list of supported GI versions.
     */
    inline def getGiVersions(args: Endofunction[com.pulumi.azure.oracle.inputs.GetGiVersionsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.oracle.outputs.GetGiVersionsResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetGiVersionsArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getGiVersions(args(argsBuilder).build)

    /**
     * This data source provides the list of GI Versions in Oracle Cloud Infrastructure Database service.
     * 
     *  Gets a list of supported GI versions.
     */
    inline def getGiVersionsPlain(args: Endofunction[com.pulumi.azure.oracle.inputs.GetGiVersionsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.oracle.outputs.GetGiVersionsResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetGiVersionsPlainArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getGiVersionsPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Oracle Resource Anchor. */
    inline def getResourceAnchor(args: Endofunction[com.pulumi.azure.oracle.inputs.GetResourceAnchorArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.oracle.outputs.GetResourceAnchorResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetResourceAnchorArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getResourceAnchor(args(argsBuilder).build)

    /** Use this data source to access information about an existing Oracle Resource Anchor. */
    inline def getResourceAnchorPlain(args: Endofunction[com.pulumi.azure.oracle.inputs.GetResourceAnchorPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.oracle.outputs.GetResourceAnchorResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetResourceAnchorPlainArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getResourceAnchorPlain(args(argsBuilder).build)

  /** Manages an Oracle Resource Anchor. */
  def ResourceAnchor(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.oracle.ResourceAnchorArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.oracle.ResourceAnchorArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.oracle.ResourceAnchor(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.oracle.AutonomousDatabaseArgs.Builder)
    def longTermBackupSchedule(args: Endofunction[com.pulumi.azure.oracle.inputs.AutonomousDatabaseLongTermBackupScheduleArgs.Builder]):
        com.pulumi.azure.oracle.AutonomousDatabaseArgs.Builder =
      val argsBuilder = com.pulumi.azure.oracle.inputs.AutonomousDatabaseLongTermBackupScheduleArgs.builder
      builder.longTermBackupSchedule(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.oracle.AutonomousDatabaseArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Cloud VM Cluster. */
  def CloudVmCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.oracle.CloudVmClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.oracle.CloudVmClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.oracle.CloudVmCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.oracle.ExadataInfrastructureArgs.Builder)
    /**
     * @param maintenanceWindows One or more `maintenanceWindow` blocks as defined below. Changing this forces a new Cloud Exadata Infrastructure to be created.
     * @return builder
     */
    def maintenanceWindows(args: Endofunction[com.pulumi.azure.oracle.inputs.ExadataInfrastructureMaintenanceWindowArgs.Builder]*):
        com.pulumi.azure.oracle.ExadataInfrastructureArgs.Builder =
      def argsBuilder = com.pulumi.azure.oracle.inputs.ExadataInfrastructureMaintenanceWindowArgs.builder
      builder.maintenanceWindows(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.oracle.ExadataInfrastructureArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages an Oracle Autonomous Database Backup in Azure. */
  def AutonomousDatabaseBackup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.oracle.AutonomousDatabaseBackupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.oracle.AutonomousDatabaseBackupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.oracle.AutonomousDatabaseBackup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Cloud Exadata Infrastructure. */
  def ExadataInfrastructure(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.oracle.ExadataInfrastructureArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.oracle.ExadataInfrastructureArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.oracle.ExadataInfrastructure(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.oracle.ExascaleDatabaseStorageVaultArgs.Builder)
    /**
     * @param highCapacityDatabaseStorage A `highCapacityDatabaseStorage` block as defined below. Changing this forces a new Exadata Database Storage Vault to be created.
     * @return builder
     */
    def highCapacityDatabaseStorage(args: Endofunction[com.pulumi.azure.oracle.inputs.ExascaleDatabaseStorageVaultHighCapacityDatabaseStorageArgs.Builder]):
        com.pulumi.azure.oracle.ExascaleDatabaseStorageVaultArgs.Builder =
      val argsBuilder = com.pulumi.azure.oracle.inputs.ExascaleDatabaseStorageVaultHighCapacityDatabaseStorageArgs.builder
      builder.highCapacityDatabaseStorage(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.oracle.ExascaleDatabaseStorageVaultArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.oracle.inputs.ExadataInfrastructureState.Builder)
    /**
     * @param maintenanceWindows One or more `maintenanceWindow` blocks as defined below. Changing this forces a new Cloud Exadata Infrastructure to be created.
     * @return builder
     */
    def maintenanceWindows(args: Endofunction[com.pulumi.azure.oracle.inputs.ExadataInfrastructureMaintenanceWindowArgs.Builder]*):
        com.pulumi.azure.oracle.inputs.ExadataInfrastructureState.Builder =
      def argsBuilder = com.pulumi.azure.oracle.inputs.ExadataInfrastructureMaintenanceWindowArgs.builder
      builder.maintenanceWindows(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.oracle.inputs.ExadataInfrastructureState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.oracle.inputs.CloudVmClusterState.Builder)
    /**
     * @param dataCollectionOptions A `dataCollectionOptions` block as defined below. Changing this forces a new Cloud VM Cluster to be created.
     * @return builder
     */
    def dataCollectionOptions(args: Endofunction[com.pulumi.azure.oracle.inputs.CloudVmClusterDataCollectionOptionsArgs.Builder]):
        com.pulumi.azure.oracle.inputs.CloudVmClusterState.Builder =
      val argsBuilder = com.pulumi.azure.oracle.inputs.CloudVmClusterDataCollectionOptionsArgs.builder
      builder.dataCollectionOptions(args(argsBuilder).build)

    /**
     * @param fileSystemConfigurations A `fileSystemConfiguration` block as defined below.
     * @return builder
     */
    def fileSystemConfigurations(args: Endofunction[com.pulumi.azure.oracle.inputs.CloudVmClusterFileSystemConfigurationArgs.Builder]*):
        com.pulumi.azure.oracle.inputs.CloudVmClusterState.Builder =
      def argsBuilder = com.pulumi.azure.oracle.inputs.CloudVmClusterFileSystemConfigurationArgs.builder
      builder.fileSystemConfigurations(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.oracle.inputs.CloudVmClusterState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.oracle.inputs.ExascaleDatabaseStorageVaultState.Builder)
    /**
     * @param highCapacityDatabaseStorage A `highCapacityDatabaseStorage` block as defined below. Changing this forces a new Exadata Database Storage Vault to be created.
     * @return builder
     */
    def highCapacityDatabaseStorage(args: Endofunction[com.pulumi.azure.oracle.inputs.ExascaleDatabaseStorageVaultHighCapacityDatabaseStorageArgs.Builder]):
        com.pulumi.azure.oracle.inputs.ExascaleDatabaseStorageVaultState.Builder =
      val argsBuilder = com.pulumi.azure.oracle.inputs.ExascaleDatabaseStorageVaultHighCapacityDatabaseStorageArgs.builder
      builder.highCapacityDatabaseStorage(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.oracle.inputs.ExascaleDatabaseStorageVaultState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.oracle.inputs.AutonomousDatabaseState.Builder)
    def longTermBackupSchedule(args: Endofunction[com.pulumi.azure.oracle.inputs.AutonomousDatabaseLongTermBackupScheduleArgs.Builder]):
        com.pulumi.azure.oracle.inputs.AutonomousDatabaseState.Builder =
      val argsBuilder = com.pulumi.azure.oracle.inputs.AutonomousDatabaseLongTermBackupScheduleArgs.builder
      builder.longTermBackupSchedule(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.oracle.inputs.AutonomousDatabaseState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
