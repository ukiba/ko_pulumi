package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object oracle:
  /** Manages an Autonomous Database. */
  def AutonomousDatabase(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.oracle.AutonomousDatabaseArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.oracle.AutonomousDatabaseArgs.builder
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
    com.pulumi.azure.oracle.AutonomousDatabase(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Oracle Autonomous Database Backup in Azure. */
  def AutonomousDatabaseBackup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.oracle.AutonomousDatabaseBackupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.oracle.AutonomousDatabaseBackupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.oracle.AutonomousDatabaseBackup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manage an autonomous database clone from backup. */
  def AutonomousDatabaseCloneFromBackup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.oracle.AutonomousDatabaseCloneFromBackupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.oracle.AutonomousDatabaseCloneFromBackupArgs.builder
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
    com.pulumi.azure.oracle.AutonomousDatabaseCloneFromBackup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an autonomous database clone from database. */
  def AutonomousDatabaseCloneFromDatabase(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.oracle.AutonomousDatabaseCloneFromDatabaseArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.oracle.AutonomousDatabaseCloneFromDatabaseArgs.builder
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
    com.pulumi.azure.oracle.AutonomousDatabaseCloneFromDatabase(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Cloud VM Cluster. */
  def CloudVmCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.oracle.CloudVmClusterArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.oracle.CloudVmClusterArgs.builder
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
    com.pulumi.azure.oracle.CloudVmCluster(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Cloud Exadata Infrastructure. */
  def ExadataInfrastructure(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.oracle.ExadataInfrastructureArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.oracle.ExadataInfrastructureArgs.builder
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
    com.pulumi.azure.oracle.ExadataInfrastructure(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Exadata Database Storage Vault. */
  def ExascaleDatabaseStorageVault(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.oracle.ExascaleDatabaseStorageVaultArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.oracle.ExascaleDatabaseStorageVaultArgs.builder
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
    com.pulumi.azure.oracle.ExascaleDatabaseStorageVault(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object OracleFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Gets a list of supported character sets. */
    inline def getAdbsCharacterSets(args: Endofunction[com.pulumi.azure.oracle.inputs.GetAdbsCharacterSetsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.oracle.outputs.GetAdbsCharacterSetsResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetAdbsCharacterSetsArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getAdbsCharacterSets(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Gets a list of supported character sets. */
    inline def getAdbsCharacterSetsPlain(args: Endofunction[com.pulumi.azure.oracle.inputs.GetAdbsCharacterSetsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.oracle.outputs.GetAdbsCharacterSetsResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetAdbsCharacterSetsPlainArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getAdbsCharacterSetsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Gets a list of supported national character sets. */
    inline def getAdbsNationalCharacterSets(args: Endofunction[com.pulumi.azure.oracle.inputs.GetAdbsNationalCharacterSetsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.oracle.outputs.GetAdbsNationalCharacterSetsResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetAdbsNationalCharacterSetsArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getAdbsNationalCharacterSets(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Gets a list of supported national character sets. */
    inline def getAdbsNationalCharacterSetsPlain(args: Endofunction[com.pulumi.azure.oracle.inputs.GetAdbsNationalCharacterSetsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.oracle.outputs.GetAdbsNationalCharacterSetsResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetAdbsNationalCharacterSetsPlainArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getAdbsNationalCharacterSetsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Autonomous Database. */
    inline def getAutonomousDatabase(args: Endofunction[com.pulumi.azure.oracle.inputs.GetAutonomousDatabaseArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.oracle.outputs.GetAutonomousDatabaseResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetAutonomousDatabaseArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getAutonomousDatabase(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Autonomous Database. */
    inline def getAutonomousDatabasePlain(args: Endofunction[com.pulumi.azure.oracle.inputs.GetAutonomousDatabasePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.oracle.outputs.GetAutonomousDatabaseResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetAutonomousDatabasePlainArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getAutonomousDatabasePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about existing Autonomous Database Backups. */
    inline def getAutonomousDatabaseBackup(args: Endofunction[com.pulumi.azure.oracle.inputs.GetAutonomousDatabaseBackupArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.oracle.outputs.GetAutonomousDatabaseBackupResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetAutonomousDatabaseBackupArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getAutonomousDatabaseBackup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about existing Autonomous Database Backups. */
    inline def getAutonomousDatabaseBackupPlain(args: Endofunction[com.pulumi.azure.oracle.inputs.GetAutonomousDatabaseBackupPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.oracle.outputs.GetAutonomousDatabaseBackupResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetAutonomousDatabaseBackupPlainArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getAutonomousDatabaseBackupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about existing Autonomous Database Backups. */
    inline def getAutonomousDatabaseBackups(args: Endofunction[com.pulumi.azure.oracle.inputs.GetAutonomousDatabaseBackupsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.oracle.outputs.GetAutonomousDatabaseBackupsResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetAutonomousDatabaseBackupsArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getAutonomousDatabaseBackups(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about existing Autonomous Database Backups. */
    inline def getAutonomousDatabaseBackupsPlain(args: Endofunction[com.pulumi.azure.oracle.inputs.GetAutonomousDatabaseBackupsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.oracle.outputs.GetAutonomousDatabaseBackupsResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetAutonomousDatabaseBackupsPlainArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getAutonomousDatabaseBackupsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing autonomous database clone from backup. */
    inline def getAutonomousDatabaseCloneFromBackup(args: Endofunction[com.pulumi.azure.oracle.inputs.GetAutonomousDatabaseCloneFromBackupArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.oracle.outputs.GetAutonomousDatabaseCloneFromBackupResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetAutonomousDatabaseCloneFromBackupArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getAutonomousDatabaseCloneFromBackup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing autonomous database clone from backup. */
    inline def getAutonomousDatabaseCloneFromBackupPlain(args: Endofunction[com.pulumi.azure.oracle.inputs.GetAutonomousDatabaseCloneFromBackupPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.oracle.outputs.GetAutonomousDatabaseCloneFromBackupResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetAutonomousDatabaseCloneFromBackupPlainArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getAutonomousDatabaseCloneFromBackupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing autonomous database clone from database. */
    inline def getAutonomousDatabaseCloneFromDatabase(args: Endofunction[com.pulumi.azure.oracle.inputs.GetAutonomousDatabaseCloneFromDatabaseArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.oracle.outputs.GetAutonomousDatabaseCloneFromDatabaseResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetAutonomousDatabaseCloneFromDatabaseArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getAutonomousDatabaseCloneFromDatabase(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing autonomous database clone from database. */
    inline def getAutonomousDatabaseCloneFromDatabasePlain(args: Endofunction[com.pulumi.azure.oracle.inputs.GetAutonomousDatabaseCloneFromDatabasePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.oracle.outputs.GetAutonomousDatabaseCloneFromDatabaseResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetAutonomousDatabaseCloneFromDatabasePlainArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getAutonomousDatabaseCloneFromDatabasePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Cloud VM Cluster. */
    inline def getCloudVmCluster(args: Endofunction[com.pulumi.azure.oracle.inputs.GetCloudVmClusterArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.oracle.outputs.GetCloudVmClusterResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetCloudVmClusterArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getCloudVmCluster(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Cloud VM Cluster. */
    inline def getCloudVmClusterPlain(args: Endofunction[com.pulumi.azure.oracle.inputs.GetCloudVmClusterPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.oracle.outputs.GetCloudVmClusterResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetCloudVmClusterPlainArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getCloudVmClusterPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about existing Oracle Database Systems Versions. */
    inline def getDatabaseSystemVersions(args: Endofunction[com.pulumi.azure.oracle.inputs.GetDatabaseSystemVersionsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.oracle.outputs.GetDatabaseSystemVersionsResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetDatabaseSystemVersionsArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getDatabaseSystemVersions(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about existing Oracle Database Systems Versions. */
    inline def getDatabaseSystemVersionsPlain(args: Endofunction[com.pulumi.azure.oracle.inputs.GetDatabaseSystemVersionsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.oracle.outputs.GetDatabaseSystemVersionsResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetDatabaseSystemVersionsPlainArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getDatabaseSystemVersionsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Lists the database nodes for the specified Cloud VM Cluster. */
    inline def getDbNodes(args: Endofunction[com.pulumi.azure.oracle.inputs.GetDbNodesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.oracle.outputs.GetDbNodesResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetDbNodesArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getDbNodes(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Lists the database nodes for the specified Cloud VM Cluster. */
    inline def getDbNodesPlain(args: Endofunction[com.pulumi.azure.oracle.inputs.GetDbNodesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.oracle.outputs.GetDbNodesResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetDbNodesPlainArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getDbNodesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about existing DB Servers. */
    inline def getDbServers(args: Endofunction[com.pulumi.azure.oracle.inputs.GetDbServersArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.oracle.outputs.GetDbServersResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetDbServersArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getDbServers(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about existing DB Servers. */
    inline def getDbServersPlain(args: Endofunction[com.pulumi.azure.oracle.inputs.GetDbServersPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.oracle.outputs.GetDbServersResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetDbServersPlainArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getDbServersPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * This data source provides the list of DB System Shapes in Oracle Cloud Infrastructure Database service.
     * 
     * Gets a list of the shapes that can be used to launch a new DB system. The shape determines resources to allocate to the DB system - CPU cores and memory for VM shapes; CPU cores, memory and storage for non-VM (or bare metal) shapes.
     */
    inline def getDbSystemShapes(args: Endofunction[com.pulumi.azure.oracle.inputs.GetDbSystemShapesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.oracle.outputs.GetDbSystemShapesResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetDbSystemShapesArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getDbSystemShapes(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * This data source provides the list of DB System Shapes in Oracle Cloud Infrastructure Database service.
     * 
     * Gets a list of the shapes that can be used to launch a new DB system. The shape determines resources to allocate to the DB system - CPU cores and memory for VM shapes; CPU cores, memory and storage for non-VM (or bare metal) shapes.
     */
    inline def getDbSystemShapesPlain(args: Endofunction[com.pulumi.azure.oracle.inputs.GetDbSystemShapesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.oracle.outputs.GetDbSystemShapesResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetDbSystemShapesPlainArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getDbSystemShapesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Cloud Exadata Infrastructure. */
    inline def getExadataInfrastructure(args: Endofunction[com.pulumi.azure.oracle.inputs.GetExadataInfrastructureArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.oracle.outputs.GetExadataInfrastructureResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetExadataInfrastructureArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getExadataInfrastructure(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Cloud Exadata Infrastructure. */
    inline def getExadataInfrastructurePlain(args: Endofunction[com.pulumi.azure.oracle.inputs.GetExadataInfrastructurePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.oracle.outputs.GetExadataInfrastructureResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetExadataInfrastructurePlainArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getExadataInfrastructurePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Exadata Database Storage Vault */
    inline def getExascaleDatabaseStorageVault(args: Endofunction[com.pulumi.azure.oracle.inputs.GetExascaleDatabaseStorageVaultArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.oracle.outputs.GetExascaleDatabaseStorageVaultResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetExascaleDatabaseStorageVaultArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getExascaleDatabaseStorageVault(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Exadata Database Storage Vault */
    inline def getExascaleDatabaseStorageVaultPlain(args: Endofunction[com.pulumi.azure.oracle.inputs.GetExascaleDatabaseStorageVaultPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.oracle.outputs.GetExascaleDatabaseStorageVaultResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetExascaleDatabaseStorageVaultPlainArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getExascaleDatabaseStorageVaultPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * This data source provides the list of GI Versions in Oracle Cloud Infrastructure Database service.
     * 
     * Gets a list of supported GI versions.
     */
    inline def getGiVersions(args: Endofunction[com.pulumi.azure.oracle.inputs.GetGiVersionsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.oracle.outputs.GetGiVersionsResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetGiVersionsArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getGiVersions(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * This data source provides the list of GI Versions in Oracle Cloud Infrastructure Database service.
     * 
     * Gets a list of supported GI versions.
     */
    inline def getGiVersionsPlain(args: Endofunction[com.pulumi.azure.oracle.inputs.GetGiVersionsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.oracle.outputs.GetGiVersionsResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetGiVersionsPlainArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getGiVersionsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Oracle Resource Anchor. */
    inline def getResourceAnchor(args: Endofunction[com.pulumi.azure.oracle.inputs.GetResourceAnchorArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.oracle.outputs.GetResourceAnchorResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetResourceAnchorArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getResourceAnchor(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Oracle Resource Anchor. */
    inline def getResourceAnchorPlain(args: Endofunction[com.pulumi.azure.oracle.inputs.GetResourceAnchorPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.oracle.outputs.GetResourceAnchorResult] =
      val argsBuilder = com.pulumi.azure.oracle.inputs.GetResourceAnchorPlainArgs.builder
      com.pulumi.azure.oracle.OracleFunctions.getResourceAnchorPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages an Oracle Resource Anchor. */
  def ResourceAnchor(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.oracle.ResourceAnchorArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.oracle.ResourceAnchorArgs.builder
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
    com.pulumi.azure.oracle.ResourceAnchor(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
