package jp.ukiba.ko_pulumi
package azure

object oracle_ext:
  extension (builder: com.pulumi.azure.oracle.AutonomousDatabaseArgs.Builder)
    def longTermBackupSchedule(args: Endofunction[com.pulumi.azure.oracle.inputs.AutonomousDatabaseLongTermBackupScheduleArgs.Builder]):
        com.pulumi.azure.oracle.AutonomousDatabaseArgs.Builder =
      val argsBuilder = com.pulumi.azure.oracle.inputs.AutonomousDatabaseLongTermBackupScheduleArgs.builder
      builder.longTermBackupSchedule(args(argsBuilder).build)

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

  extension (builder: com.pulumi.azure.oracle.ExadataInfrastructureArgs.Builder)
    /**
     * @param maintenanceWindows One or more `maintenanceWindow` blocks as defined below. Changing this forces a new Cloud Exadata Infrastructure to be created.
     * @return builder
     */
    def maintenanceWindows(args: Endofunction[com.pulumi.azure.oracle.inputs.ExadataInfrastructureMaintenanceWindowArgs.Builder]*):
        com.pulumi.azure.oracle.ExadataInfrastructureArgs.Builder =
      def argsBuilder = com.pulumi.azure.oracle.inputs.ExadataInfrastructureMaintenanceWindowArgs.builder
      builder.maintenanceWindows(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.oracle.ExascaleDatabaseStorageVaultArgs.Builder)
    /**
     * @param highCapacityDatabaseStorage A `highCapacityDatabaseStorage` block as defined below. Changing this forces a new Exadata Database Storage Vault to be created.
     * @return builder
     */
    def highCapacityDatabaseStorage(args: Endofunction[com.pulumi.azure.oracle.inputs.ExascaleDatabaseStorageVaultHighCapacityDatabaseStorageArgs.Builder]):
        com.pulumi.azure.oracle.ExascaleDatabaseStorageVaultArgs.Builder =
      val argsBuilder = com.pulumi.azure.oracle.inputs.ExascaleDatabaseStorageVaultHighCapacityDatabaseStorageArgs.builder
      builder.highCapacityDatabaseStorage(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.oracle.inputs.AutonomousDatabaseState.Builder)
    def longTermBackupSchedule(args: Endofunction[com.pulumi.azure.oracle.inputs.AutonomousDatabaseLongTermBackupScheduleArgs.Builder]):
        com.pulumi.azure.oracle.inputs.AutonomousDatabaseState.Builder =
      val argsBuilder = com.pulumi.azure.oracle.inputs.AutonomousDatabaseLongTermBackupScheduleArgs.builder
      builder.longTermBackupSchedule(args(argsBuilder).build)

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

  extension (builder: com.pulumi.azure.oracle.inputs.ExadataInfrastructureState.Builder)
    /**
     * @param maintenanceWindows One or more `maintenanceWindow` blocks as defined below. Changing this forces a new Cloud Exadata Infrastructure to be created.
     * @return builder
     */
    def maintenanceWindows(args: Endofunction[com.pulumi.azure.oracle.inputs.ExadataInfrastructureMaintenanceWindowArgs.Builder]*):
        com.pulumi.azure.oracle.inputs.ExadataInfrastructureState.Builder =
      def argsBuilder = com.pulumi.azure.oracle.inputs.ExadataInfrastructureMaintenanceWindowArgs.builder
      builder.maintenanceWindows(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.oracle.inputs.ExascaleDatabaseStorageVaultState.Builder)
    /**
     * @param highCapacityDatabaseStorage A `highCapacityDatabaseStorage` block as defined below. Changing this forces a new Exadata Database Storage Vault to be created.
     * @return builder
     */
    def highCapacityDatabaseStorage(args: Endofunction[com.pulumi.azure.oracle.inputs.ExascaleDatabaseStorageVaultHighCapacityDatabaseStorageArgs.Builder]):
        com.pulumi.azure.oracle.inputs.ExascaleDatabaseStorageVaultState.Builder =
      val argsBuilder = com.pulumi.azure.oracle.inputs.ExascaleDatabaseStorageVaultHighCapacityDatabaseStorageArgs.builder
      builder.highCapacityDatabaseStorage(args(argsBuilder).build)
