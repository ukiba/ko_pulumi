package jp.ukiba.ko_pulumi
package gcp

object oracledatabase_ext:
  extension (builder: com.pulumi.gcp.oracledatabase.AutonomousDatabaseArgs.Builder)
    /**
     * @param properties The properties of an Autonomous Database.
     * Structure is documented below.
     * @return builder
     */
    inline def properties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.AutonomousDatabaseArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

    /**
     * @param sourceConfig The source Autonomous Database configuration for the standby Autonomous Database.
     * Structure is documented below.
     * @return builder
     */
    inline def sourceConfig(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabaseSourceConfigArgs.Builder]):
        com.pulumi.gcp.oracledatabase.AutonomousDatabaseArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabaseSourceConfigArgs.builder
      builder.sourceConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.CloudExadataInfrastructureArgs.Builder)
    /**
     * @param properties Various properties of Exadata Infrastructure.
     * Structure is documented below.
     * @return builder
     */
    inline def properties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.CloudExadataInfrastructurePropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.CloudExadataInfrastructureArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.CloudExadataInfrastructurePropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.CloudVmClusterArgs.Builder)
    /**
     * @param properties Various properties and settings associated with Exadata VM cluster.
     * Structure is documented below.
     * @return builder
     */
    inline def properties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.CloudVmClusterPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.CloudVmClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.CloudVmClusterPropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.DbSystemArgs.Builder)
    /**
     * @param properties The properties of a DbSystem.
     * Structure is documented below.
     * @return builder
     */
    inline def properties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.DbSystemArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.ExadbVmClusterArgs.Builder)
    /**
     * @param properties The properties of an ExadbVmCluster.
     * Structure is documented below.
     * @return builder
     */
    inline def properties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.ExadbVmClusterPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.ExadbVmClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.ExadbVmClusterPropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.ExascaleDbStorageVaultArgs.Builder)
    /**
     * @param properties The properties of the ExascaleDbStorageVault.
     * next ID: 12
     * Structure is documented below.
     * @return builder
     */
    inline def properties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.ExascaleDbStorageVaultPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.ExascaleDbStorageVaultArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.ExascaleDbStorageVaultPropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.GoldengateConnectionArgs.Builder)
    /**
     * @param properties The properties of a GoldengateConnection.
     * Structure is documented below.
     * @return builder
     */
    inline def properties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.GoldengateConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.GoldengateConnectionAssignmentArgs.Builder)
    /**
     * @param properties The properties of a GoldengateConnectionAssignment.
     * Structure is documented below.
     * @return builder
     */
    inline def properties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionAssignmentPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.GoldengateConnectionAssignmentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionAssignmentPropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.GoldengateDeploymentArgs.Builder)
    /**
     * @param properties Properties of GoldengateDeployment.
     * Structure is documented below.
     * @return builder
     */
    inline def properties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateDeploymentPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.GoldengateDeploymentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateDeploymentPropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesArgs.Builder)
    /**
     * @param apexDetails (Output)
     * Oracle APEX Application Development.
     * https://docs.oracle.com/en-us/iaas/api/#/en/database/20160918/datatypes/AutonomousDatabaseApex
     * Structure is documented below.
     * @return builder
     */
    inline def apexDetails(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesApexDetailArgs.Builder]*):
        com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesApexDetailArgs.builder
      builder.apexDetails(args.map(_(argsBuilder).build)*)

    /**
     * @param connectionStrings (Output)
     * The connection string used to connect to the Autonomous Database.
     * https://docs.oracle.com/en-us/iaas/api/#/en/database/20160918/datatypes/AutonomousDatabaseConnectionStrings
     * Structure is documented below.
     * @return builder
     */
    inline def connectionStrings(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesConnectionStringArgs.Builder]*):
        com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesConnectionStringArgs.builder
      builder.connectionStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param connectionUrls (Output)
     * The URLs for accessing Oracle Application Express (APEX) and SQL Developer
     * Web with a browser from a Compute instance.
     * https://docs.oracle.com/en-us/iaas/api/#/en/database/20160918/datatypes/AutonomousDatabaseConnectionUrls
     * Structure is documented below.
     * @return builder
     */
    inline def connectionUrls(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesConnectionUrlArgs.Builder]*):
        com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesConnectionUrlArgs.builder
      builder.connectionUrls(args.map(_(argsBuilder).build)*)

    /**
     * @param customerContacts The list of customer contacts.
     * Structure is documented below.
     * @return builder
     */
    inline def customerContacts(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesCustomerContactArgs.Builder]*):
        com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesCustomerContactArgs.builder
      builder.customerContacts(args.map(_(argsBuilder).build)*)

    /**
     * @param localStandbyDbs (Output)
     * Autonomous Data Guard standby database details.
     * https://docs.oracle.com/en-us/iaas/api/#/en/database/20160918/datatypes/AutonomousDatabaseStandbySummary
     * Structure is documented below.
     * @return builder
     */
    inline def localStandbyDbs(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesLocalStandbyDbArgs.Builder]*):
        com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesLocalStandbyDbArgs.builder
      builder.localStandbyDbs(args.map(_(argsBuilder).build)*)

    /**
     * @param scheduledOperationDetails (Output)
     * The list and details of the scheduled operations of the Autonomous
     * Database.
     * Structure is documented below.
     * @return builder
     */
    inline def scheduledOperationDetails(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesScheduledOperationDetailArgs.Builder]*):
        com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesScheduledOperationDetailArgs.builder
      builder.scheduledOperationDetails(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesConnectionStringArgs.Builder)
    /**
     * @param allConnectionStrings A list of all connection strings that can be used to connect to the
     * Autonomous Database.
     * @return builder
     */
    inline def allConnectionStrings(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesConnectionStringAllConnectionStringArgs.Builder]*):
        com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesConnectionStringArgs.Builder =
      def argsBuilder = com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesConnectionStringAllConnectionStringArgs.builder
      builder.allConnectionStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param profiles A list of connection string profiles to allow clients to group, filter, and
     * select values based on the structured metadata.
     * @return builder
     */
    inline def profiles(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesConnectionStringProfileArgs.Builder]*):
        com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesConnectionStringArgs.Builder =
      def argsBuilder = com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesConnectionStringProfileArgs.builder
      builder.profiles(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesScheduledOperationDetailArgs.Builder)
    /**
     * @param startTimes Represents a time of day. The date and time zone are either not significant
     * or are specified elsewhere. An API may choose to allow leap seconds. Related
     * types are google.type.Date and &#39;google.protobuf.Timestamp&#39;.
     * @return builder
     */
    inline def startTimes(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesScheduledOperationDetailStartTimeArgs.Builder]*):
        com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesScheduledOperationDetailArgs.Builder =
      def argsBuilder = com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesScheduledOperationDetailStartTimeArgs.builder
      builder.startTimes(args.map(_(argsBuilder).build)*)

    /**
     * @param stopTimes Represents a time of day. The date and time zone are either not significant
     * or are specified elsewhere. An API may choose to allow leap seconds. Related
     * types are google.type.Date and &#39;google.protobuf.Timestamp&#39;.
     * @return builder
     */
    inline def stopTimes(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesScheduledOperationDetailStopTimeArgs.Builder]*):
        com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesScheduledOperationDetailArgs.Builder =
      def argsBuilder = com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesScheduledOperationDetailStopTimeArgs.builder
      builder.stopTimes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabaseState.Builder)
    /**
     * @param properties The properties of an Autonomous Database.
     * Structure is documented below.
     * @return builder
     */
    inline def properties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabaseState.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

    /**
     * @param sourceConfig The source Autonomous Database configuration for the standby Autonomous Database.
     * Structure is documented below.
     * @return builder
     */
    inline def sourceConfig(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabaseSourceConfigArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabaseState.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabaseSourceConfigArgs.builder
      builder.sourceConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.CloudExadataInfrastructurePropertiesArgs.Builder)
    /**
     * @param customerContacts The list of customer contacts.
     * Structure is documented below.
     * @return builder
     */
    inline def customerContacts(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.CloudExadataInfrastructurePropertiesCustomerContactArgs.Builder]*):
        com.pulumi.gcp.oracledatabase.inputs.CloudExadataInfrastructurePropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.oracledatabase.inputs.CloudExadataInfrastructurePropertiesCustomerContactArgs.builder
      builder.customerContacts(args.map(_(argsBuilder).build)*)

    /**
     * @param exascaleConfigs (Output)
     * The Exascale configuration for the Exadata Infrastructure.
     * Structure is documented below.
     * @return builder
     */
    inline def exascaleConfigs(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.CloudExadataInfrastructurePropertiesExascaleConfigArgs.Builder]*):
        com.pulumi.gcp.oracledatabase.inputs.CloudExadataInfrastructurePropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.oracledatabase.inputs.CloudExadataInfrastructurePropertiesExascaleConfigArgs.builder
      builder.exascaleConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param maintenanceWindow Maintenance window as defined by Oracle.
     * https://docs.oracle.com/en-us/iaas/api/#/en/database/20160918/datatypes/MaintenanceWindow
     * Structure is documented below.
     * @return builder
     */
    inline def maintenanceWindow(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.CloudExadataInfrastructurePropertiesMaintenanceWindowArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.CloudExadataInfrastructurePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.CloudExadataInfrastructurePropertiesMaintenanceWindowArgs.builder
      builder.maintenanceWindow(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.CloudExadataInfrastructureState.Builder)
    /**
     * @param properties Various properties of Exadata Infrastructure.
     * Structure is documented below.
     * @return builder
     */
    inline def properties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.CloudExadataInfrastructurePropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.CloudExadataInfrastructureState.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.CloudExadataInfrastructurePropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.CloudVmClusterPropertiesArgs.Builder)
    /**
     * @param diagnosticsDataCollectionOptions Data collection options for diagnostics.
     * Structure is documented below.
     * @return builder
     */
    inline def diagnosticsDataCollectionOptions(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.CloudVmClusterPropertiesDiagnosticsDataCollectionOptionsArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.CloudVmClusterPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.CloudVmClusterPropertiesDiagnosticsDataCollectionOptionsArgs.builder
      builder.diagnosticsDataCollectionOptions(args(argsBuilder).build)

    /**
     * @param timeZone Represents a time zone from the
     * [IANA Time Zone Database](https://www.iana.org/time-zones).
     * Structure is documented below.
     * @return builder
     */
    inline def timeZone(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.CloudVmClusterPropertiesTimeZoneArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.CloudVmClusterPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.CloudVmClusterPropertiesTimeZoneArgs.builder
      builder.timeZone(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.CloudVmClusterState.Builder)
    /**
     * @param identityConnectors The identity connector details which will allow OCI to securely access
     * the resources in the customer project.
     * Structure is documented below.
     * @return builder
     */
    inline def identityConnectors(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.CloudVmClusterIdentityConnectorArgs.Builder]*):
        com.pulumi.gcp.oracledatabase.inputs.CloudVmClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.oracledatabase.inputs.CloudVmClusterIdentityConnectorArgs.builder
      builder.identityConnectors(args.map(_(argsBuilder).build)*)

    /**
     * @param properties Various properties and settings associated with Exadata VM cluster.
     * Structure is documented below.
     * @return builder
     */
    inline def properties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.CloudVmClusterPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.CloudVmClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.CloudVmClusterPropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesArgs.Builder)
    /**
     * @param dataCollectionOptions Data collection options for DbSystem.
     * Structure is documented below.
     * @return builder
     */
    inline def dataCollectionOptions(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDataCollectionOptionsArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDataCollectionOptionsArgs.builder
      builder.dataCollectionOptions(args(argsBuilder).build)

    /**
     * @param dbHome Details of the Database Home resource.
     * Structure is documented below.
     * @return builder
     */
    inline def dbHome(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeArgs.builder
      builder.dbHome(args(argsBuilder).build)

    /**
     * @param dbSystemOptions Details of the DbSystem Options.
     * Structure is documented below.
     * @return builder
     */
    inline def dbSystemOptions(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbSystemOptionsArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbSystemOptionsArgs.builder
      builder.dbSystemOptions(args(argsBuilder).build)

    /**
     * @param timeZone Represents a time zone from the
     * [IANA Time Zone Database](https://www.iana.org/time-zones).
     * Structure is documented below.
     * @return builder
     */
    inline def timeZone(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesTimeZoneArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesTimeZoneArgs.builder
      builder.timeZone(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeArgs.Builder)
    /**
     * @param database Details of the Database resource.
     * https://docs.oracle.com/en-us/iaas/api/#/en/database/20160918/Database/
     * Structure is documented below.
     * @return builder
     */
    inline def database(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeDatabaseArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeDatabaseArgs.builder
      builder.database(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeDatabaseArgs.Builder)
    /**
     * @param properties The properties of a Database.
     * Structure is documented below.
     * @return builder
     */
    inline def properties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeDatabasePropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeDatabaseArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeDatabasePropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeDatabasePropertiesArgs.Builder)
    /**
     * @param databaseManagementConfig The configuration of the Database Management service.
     * Structure is documented below.
     * @return builder
     */
    inline def databaseManagementConfig(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeDatabasePropertiesDatabaseManagementConfigArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeDatabasePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeDatabasePropertiesDatabaseManagementConfigArgs.builder
      builder.databaseManagementConfig(args(argsBuilder).build)

    /**
     * @param dbBackupConfig Backup Options for the Database.
     * Structure is documented below.
     * @return builder
     */
    inline def dbBackupConfig(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeDatabasePropertiesDbBackupConfigArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeDatabasePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeDatabasePropertiesDbBackupConfigArgs.builder
      builder.dbBackupConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeDatabasePropertiesDbBackupConfigArgs.Builder)
    /**
     * @param backupDestinationDetails Details of the database backup destinations.
     * Structure is documented below.
     * @return builder
     */
    inline def backupDestinationDetails(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeDatabasePropertiesDbBackupConfigBackupDestinationDetailArgs.Builder]*):
        com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeDatabasePropertiesDbBackupConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeDatabasePropertiesDbBackupConfigBackupDestinationDetailArgs.builder
      builder.backupDestinationDetails(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.DbSystemState.Builder)
    /**
     * @param properties The properties of a DbSystem.
     * Structure is documented below.
     * @return builder
     */
    inline def properties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.DbSystemState.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.ExadbVmClusterPropertiesArgs.Builder)
    /**
     * @param dataCollectionOptions Data collection options for diagnostics.
     * https://docs.oracle.com/en-us/iaas/api/#/en/database/20160918/datatypes/DataCollectionOptions
     * Structure is documented below.
     * @return builder
     */
    inline def dataCollectionOptions(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.ExadbVmClusterPropertiesDataCollectionOptionsArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.ExadbVmClusterPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.ExadbVmClusterPropertiesDataCollectionOptionsArgs.builder
      builder.dataCollectionOptions(args(argsBuilder).build)

    /**
     * @param timeZone Represents a time zone from the
     * [IANA Time Zone Database](https://www.iana.org/time-zones).
     * Structure is documented below.
     * @return builder
     */
    inline def timeZone(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.ExadbVmClusterPropertiesTimeZoneArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.ExadbVmClusterPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.ExadbVmClusterPropertiesTimeZoneArgs.builder
      builder.timeZone(args(argsBuilder).build)

    /**
     * @param vmFileSystemStorage The storage allocation for the exadbvmcluster, in gigabytes (GB).
     * Structure is documented below.
     * @return builder
     */
    inline def vmFileSystemStorage(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.ExadbVmClusterPropertiesVmFileSystemStorageArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.ExadbVmClusterPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.ExadbVmClusterPropertiesVmFileSystemStorageArgs.builder
      builder.vmFileSystemStorage(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.ExadbVmClusterState.Builder)
    /**
     * @param identityConnectors The identity connector details which will allow OCI to securely access
     * the resources in the customer project.
     * Structure is documented below.
     * @return builder
     */
    inline def identityConnectors(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.ExadbVmClusterIdentityConnectorArgs.Builder]*):
        com.pulumi.gcp.oracledatabase.inputs.ExadbVmClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.oracledatabase.inputs.ExadbVmClusterIdentityConnectorArgs.builder
      builder.identityConnectors(args.map(_(argsBuilder).build)*)

    /**
     * @param properties The properties of an ExadbVmCluster.
     * Structure is documented below.
     * @return builder
     */
    inline def properties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.ExadbVmClusterPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.ExadbVmClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.ExadbVmClusterPropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.ExascaleDbStorageVaultPropertiesArgs.Builder)
    /**
     * @param exascaleDbStorageDetails The storage details of the ExascaleDbStorageVault.
     * Structure is documented below.
     * @return builder
     */
    inline def exascaleDbStorageDetails(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.ExascaleDbStorageVaultPropertiesExascaleDbStorageDetailsArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.ExascaleDbStorageVaultPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.ExascaleDbStorageVaultPropertiesExascaleDbStorageDetailsArgs.builder
      builder.exascaleDbStorageDetails(args(argsBuilder).build)

    /**
     * @param timeZone Represents a time zone from the
     * [IANA Time Zone Database](https://www.iana.org/time-zones).
     * Structure is documented below.
     * @return builder
     */
    inline def timeZone(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.ExascaleDbStorageVaultPropertiesTimeZoneArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.ExascaleDbStorageVaultPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.ExascaleDbStorageVaultPropertiesTimeZoneArgs.builder
      builder.timeZone(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.ExascaleDbStorageVaultState.Builder)
    /**
     * @param properties The properties of the ExascaleDbStorageVault.
     * next ID: 12
     * Structure is documented below.
     * @return builder
     */
    inline def properties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.ExascaleDbStorageVaultPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.ExascaleDbStorageVaultState.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.ExascaleDbStorageVaultPropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionAssignmentState.Builder)
    /**
     * @param properties The properties of a GoldengateConnectionAssignment.
     * Structure is documented below.
     * @return builder
     */
    inline def properties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionAssignmentPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionAssignmentState.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionAssignmentPropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesArgs.Builder)
    /**
     * @param amazonKinesisConnectionProperties The properties of GoldengateAmazonKinesisConnection.
     * Structure is documented below.
     * @return builder
     */
    inline def amazonKinesisConnectionProperties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesAmazonKinesisConnectionPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesAmazonKinesisConnectionPropertiesArgs.builder
      builder.amazonKinesisConnectionProperties(args(argsBuilder).build)

    /**
     * @param amazonRedshiftConnectionProperties The properties of GoldengateAmazonRedshiftConnection.
     * Structure is documented below.
     * @return builder
     */
    inline def amazonRedshiftConnectionProperties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesAmazonRedshiftConnectionPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesAmazonRedshiftConnectionPropertiesArgs.builder
      builder.amazonRedshiftConnectionProperties(args(argsBuilder).build)

    /**
     * @param amazonS3ConnectionProperties The properties of GoldengateAmazonS3Connection.
     * Structure is documented below.
     * @return builder
     */
    inline def amazonS3ConnectionProperties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesAmazonS3ConnectionPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesAmazonS3ConnectionPropertiesArgs.builder
      builder.amazonS3ConnectionProperties(args(argsBuilder).build)

    /**
     * @param azureDataLakeStorageConnectionProperties The properties of GoldengateAzureDataLakeStorageConnection.
     * Structure is documented below.
     * @return builder
     */
    inline def azureDataLakeStorageConnectionProperties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesAzureDataLakeStorageConnectionPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesAzureDataLakeStorageConnectionPropertiesArgs.builder
      builder.azureDataLakeStorageConnectionProperties(args(argsBuilder).build)

    /**
     * @param azureSynapseAnalyticsConnectionProperties The properties of GoldengateAzureSynapseAnalyticsConnection.
     * Structure is documented below.
     * @return builder
     */
    inline def azureSynapseAnalyticsConnectionProperties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesAzureSynapseAnalyticsConnectionPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesAzureSynapseAnalyticsConnectionPropertiesArgs.builder
      builder.azureSynapseAnalyticsConnectionProperties(args(argsBuilder).build)

    /**
     * @param databricksConnectionProperties The properties of GoldengateDatabricksConnection.
     * Structure is documented below.
     * @return builder
     */
    inline def databricksConnectionProperties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesDatabricksConnectionPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesDatabricksConnectionPropertiesArgs.builder
      builder.databricksConnectionProperties(args(argsBuilder).build)

    /**
     * @param db2ConnectionProperties The properties of GoldengateDb2Connection.
     * Structure is documented below.
     * @return builder
     */
    inline def db2ConnectionProperties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesDb2ConnectionPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesDb2ConnectionPropertiesArgs.builder
      builder.db2ConnectionProperties(args(argsBuilder).build)

    /**
     * @param elasticsearchConnectionProperties The properties of GoldengateElasticsearchConnection.
     * Structure is documented below.
     * @return builder
     */
    inline def elasticsearchConnectionProperties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesElasticsearchConnectionPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesElasticsearchConnectionPropertiesArgs.builder
      builder.elasticsearchConnectionProperties(args(argsBuilder).build)

    /**
     * @param genericConnectionProperties The properties of GoldengateGenericConnectionProperties.
     * Structure is documented below.
     * @return builder
     */
    inline def genericConnectionProperties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesGenericConnectionPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesGenericConnectionPropertiesArgs.builder
      builder.genericConnectionProperties(args(argsBuilder).build)

    /**
     * @param goldengateConnectionProperties The properties of GoldengateGoldengateConnectionProperties.
     * Structure is documented below.
     * @return builder
     */
    inline def goldengateConnectionProperties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesGoldengateConnectionPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesGoldengateConnectionPropertiesArgs.builder
      builder.goldengateConnectionProperties(args(argsBuilder).build)

    /**
     * @param googleBigQueryConnectionProperties The properties of GoldengateGoogleBigQueryConnectionProperties.
     * Structure is documented below.
     * @return builder
     */
    inline def googleBigQueryConnectionProperties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesGoogleBigQueryConnectionPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesGoogleBigQueryConnectionPropertiesArgs.builder
      builder.googleBigQueryConnectionProperties(args(argsBuilder).build)

    /**
     * @param googleCloudStorageConnectionProperties The properties of GoldengateGoogleCloudStorageConnectionProperties.
     * Structure is documented below.
     * @return builder
     */
    inline def googleCloudStorageConnectionProperties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesGoogleCloudStorageConnectionPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesGoogleCloudStorageConnectionPropertiesArgs.builder
      builder.googleCloudStorageConnectionProperties(args(argsBuilder).build)

    /**
     * @param googlePubsubConnectionProperties The properties of GoldengateGooglePubsubConnection.
     * Structure is documented below.
     * @return builder
     */
    inline def googlePubsubConnectionProperties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesGooglePubsubConnectionPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesGooglePubsubConnectionPropertiesArgs.builder
      builder.googlePubsubConnectionProperties(args(argsBuilder).build)

    /**
     * @param hdfsConnectionProperties The properties of GoldengateHdfsConnection.
     * Structure is documented below.
     * @return builder
     */
    inline def hdfsConnectionProperties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesHdfsConnectionPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesHdfsConnectionPropertiesArgs.builder
      builder.hdfsConnectionProperties(args(argsBuilder).build)

    /**
     * @param icebergConnectionProperties The properties of GoldengateIcebergConnection.
     * Structure is documented below.
     * @return builder
     */
    inline def icebergConnectionProperties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesIcebergConnectionPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesIcebergConnectionPropertiesArgs.builder
      builder.icebergConnectionProperties(args(argsBuilder).build)

    /**
     * @param javaMessageServiceConnectionProperties The properties of GoldengateJavaMessageServiceConnection.
     * Structure is documented below.
     * @return builder
     */
    inline def javaMessageServiceConnectionProperties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesJavaMessageServiceConnectionPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesJavaMessageServiceConnectionPropertiesArgs.builder
      builder.javaMessageServiceConnectionProperties(args(argsBuilder).build)

    /**
     * @param kafkaConnectionProperties The properties of GoldengateKafkaConnection.
     * Structure is documented below.
     * @return builder
     */
    inline def kafkaConnectionProperties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesKafkaConnectionPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesKafkaConnectionPropertiesArgs.builder
      builder.kafkaConnectionProperties(args(argsBuilder).build)

    /**
     * @param kafkaSchemaRegistryConnectionProperties The properties of GoldengateKafkaSchemaRegistryConnection.
     * Structure is documented below.
     * @return builder
     */
    inline def kafkaSchemaRegistryConnectionProperties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesKafkaSchemaRegistryConnectionPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesKafkaSchemaRegistryConnectionPropertiesArgs.builder
      builder.kafkaSchemaRegistryConnectionProperties(args(argsBuilder).build)

    /**
     * @param microsoftFabricConnectionProperties The properties of GoldengateMicrosoftFabricConnection.
     * Structure is documented below.
     * @return builder
     */
    inline def microsoftFabricConnectionProperties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesMicrosoftFabricConnectionPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesMicrosoftFabricConnectionPropertiesArgs.builder
      builder.microsoftFabricConnectionProperties(args(argsBuilder).build)

    /**
     * @param microsoftSqlserverConnectionProperties The properties of GoldengateMicrosoftSqlserverConnection.
     * Structure is documented below.
     * @return builder
     */
    inline def microsoftSqlserverConnectionProperties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesMicrosoftSqlserverConnectionPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesMicrosoftSqlserverConnectionPropertiesArgs.builder
      builder.microsoftSqlserverConnectionProperties(args(argsBuilder).build)

    /**
     * @param mongodbConnectionProperties The properties of GoldengateMongodbConnection.
     * Structure is documented below.
     * @return builder
     */
    inline def mongodbConnectionProperties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesMongodbConnectionPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesMongodbConnectionPropertiesArgs.builder
      builder.mongodbConnectionProperties(args(argsBuilder).build)

    /**
     * @param mysqlConnectionProperties Properties of GoldengateMysqlConnection.
     * Structure is documented below.
     * @return builder
     */
    inline def mysqlConnectionProperties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesMysqlConnectionPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesMysqlConnectionPropertiesArgs.builder
      builder.mysqlConnectionProperties(args(argsBuilder).build)

    /**
     * @param ociObjectStorageConnectionProperties The properties of GoldengateOciObjectStorageConnection.
     * Structure is documented below.
     * @return builder
     */
    inline def ociObjectStorageConnectionProperties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesOciObjectStorageConnectionPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesOciObjectStorageConnectionPropertiesArgs.builder
      builder.ociObjectStorageConnectionProperties(args(argsBuilder).build)

    /**
     * @param oracleAiDataPlatformConnectionProperties The properties of GoldengateOracleAIDataPlatformConnection.
     * Structure is documented below.
     * @return builder
     */
    inline def oracleAiDataPlatformConnectionProperties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesOracleAiDataPlatformConnectionPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesOracleAiDataPlatformConnectionPropertiesArgs.builder
      builder.oracleAiDataPlatformConnectionProperties(args(argsBuilder).build)

    /**
     * @param oracleConnectionProperties The properties of Goldengate Oracle Database Connection.
     * Structure is documented below.
     * @return builder
     */
    inline def oracleConnectionProperties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesOracleConnectionPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesOracleConnectionPropertiesArgs.builder
      builder.oracleConnectionProperties(args(argsBuilder).build)

    /**
     * @param oracleNosqlConnectionProperties The properties of GoldengateOracleNosqlConnection.
     * Structure is documented below.
     * @return builder
     */
    inline def oracleNosqlConnectionProperties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesOracleNosqlConnectionPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesOracleNosqlConnectionPropertiesArgs.builder
      builder.oracleNosqlConnectionProperties(args(argsBuilder).build)

    /**
     * @param postgresqlConnectionProperties The properties of GoldengatePostgresqlConnection.
     * Structure is documented below.
     * @return builder
     */
    inline def postgresqlConnectionProperties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesPostgresqlConnectionPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesPostgresqlConnectionPropertiesArgs.builder
      builder.postgresqlConnectionProperties(args(argsBuilder).build)

    /**
     * @param redisConnectionProperties The properties of GoldengateRedisConnection.
     * Structure is documented below.
     * @return builder
     */
    inline def redisConnectionProperties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesRedisConnectionPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesRedisConnectionPropertiesArgs.builder
      builder.redisConnectionProperties(args(argsBuilder).build)

    /**
     * @param snowflakeConnectionProperties The properties of GoldengateSnowflakeConnection.
     * Structure is documented below.
     * @return builder
     */
    inline def snowflakeConnectionProperties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesSnowflakeConnectionPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesSnowflakeConnectionPropertiesArgs.builder
      builder.snowflakeConnectionProperties(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesDb2ConnectionPropertiesArgs.Builder)
    /**
     * @param additionalAttributes An array of name-value pair attribute entries.
     * Used as additional parameters in connection string.
     * @return builder
     */
    inline def additionalAttributes(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesDb2ConnectionPropertiesAdditionalAttributeArgs.Builder]*):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesDb2ConnectionPropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesDb2ConnectionPropertiesAdditionalAttributeArgs.builder
      builder.additionalAttributes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesIcebergConnectionPropertiesArgs.Builder)
    /**
     * @param catalog The Iceberg catalog details.
     * Structure is documented below.
     * @return builder
     */
    inline def catalog(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesIcebergConnectionPropertiesCatalogArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesIcebergConnectionPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesIcebergConnectionPropertiesCatalogArgs.builder
      builder.catalog(args(argsBuilder).build)

    /**
     * @param storage The Iceberg storage details.
     * Structure is documented below.
     * @return builder
     */
    inline def storage(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesIcebergConnectionPropertiesStorageArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesIcebergConnectionPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesIcebergConnectionPropertiesStorageArgs.builder
      builder.storage(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesIcebergConnectionPropertiesCatalogArgs.Builder)
    /**
     * @param glueIcebergCatalog The Glue Iceberg catalog.
     * Structure is documented below.
     * @return builder
     */
    inline def glueIcebergCatalog(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesIcebergConnectionPropertiesCatalogGlueIcebergCatalogArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesIcebergConnectionPropertiesCatalogArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesIcebergConnectionPropertiesCatalogGlueIcebergCatalogArgs.builder
      builder.glueIcebergCatalog(args(argsBuilder).build)

    /**
     * @param nessieIcebergCatalog The Nessie Iceberg catalog.
     * Structure is documented below.
     * @return builder
     */
    inline def nessieIcebergCatalog(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesIcebergConnectionPropertiesCatalogNessieIcebergCatalogArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesIcebergConnectionPropertiesCatalogArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesIcebergConnectionPropertiesCatalogNessieIcebergCatalogArgs.builder
      builder.nessieIcebergCatalog(args(argsBuilder).build)

    /**
     * @param polarisIcebergCatalog The Polaris Iceberg catalog.
     * Structure is documented below.
     * @return builder
     */
    inline def polarisIcebergCatalog(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesIcebergConnectionPropertiesCatalogPolarisIcebergCatalogArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesIcebergConnectionPropertiesCatalogArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesIcebergConnectionPropertiesCatalogPolarisIcebergCatalogArgs.builder
      builder.polarisIcebergCatalog(args(argsBuilder).build)

    /**
     * @param restIcebergCatalog The REST Iceberg catalog.
     * Structure is documented below.
     * @return builder
     */
    inline def restIcebergCatalog(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesIcebergConnectionPropertiesCatalogRestIcebergCatalogArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesIcebergConnectionPropertiesCatalogArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesIcebergConnectionPropertiesCatalogRestIcebergCatalogArgs.builder
      builder.restIcebergCatalog(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesIcebergConnectionPropertiesStorageArgs.Builder)
    /**
     * @param amazonS3IcebergStorage The Amazon S3 Iceberg storage.
     * Structure is documented below.
     * @return builder
     */
    inline def amazonS3IcebergStorage(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesIcebergConnectionPropertiesStorageAmazonS3IcebergStorageArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesIcebergConnectionPropertiesStorageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesIcebergConnectionPropertiesStorageAmazonS3IcebergStorageArgs.builder
      builder.amazonS3IcebergStorage(args(argsBuilder).build)

    /**
     * @param azureDataLakeStorageIcebergStorage The Azure Data Lake Storage Iceberg storage.
     * Structure is documented below.
     * @return builder
     */
    inline def azureDataLakeStorageIcebergStorage(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesIcebergConnectionPropertiesStorageAzureDataLakeStorageIcebergStorageArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesIcebergConnectionPropertiesStorageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesIcebergConnectionPropertiesStorageAzureDataLakeStorageIcebergStorageArgs.builder
      builder.azureDataLakeStorageIcebergStorage(args(argsBuilder).build)

    /**
     * @param googleCloudStorageIcebergStorage The Google Cloud Storage Iceberg storage.
     * Structure is documented below.
     * @return builder
     */
    inline def googleCloudStorageIcebergStorage(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesIcebergConnectionPropertiesStorageGoogleCloudStorageIcebergStorageArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesIcebergConnectionPropertiesStorageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesIcebergConnectionPropertiesStorageGoogleCloudStorageIcebergStorageArgs.builder
      builder.googleCloudStorageIcebergStorage(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesKafkaConnectionPropertiesArgs.Builder)
    /**
     * @param bootstrapServers Kafka bootstrap. Equivalent of bootstrap.servers configuration property
     * in Kafka: list of KafkaBootstrapServer objects specified by host/port.
     * Used for establishing the initial connection to the Kafka cluster.
     * Example: &#34;server1.example.com:9092,server2.example.com:9092&#34;
     * Structure is documented below.
     * @return builder
     */
    inline def bootstrapServers(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesKafkaConnectionPropertiesBootstrapServerArgs.Builder]*):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesKafkaConnectionPropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesKafkaConnectionPropertiesBootstrapServerArgs.builder
      builder.bootstrapServers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesMicrosoftSqlserverConnectionPropertiesArgs.Builder)
    /**
     * @param additionalAttributes An array of name-value pair attribute entries.
     * Used as additional parameters in connection string.
     * Structure is documented below.
     * @return builder
     */
    inline def additionalAttributes(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesMicrosoftSqlserverConnectionPropertiesAdditionalAttributeArgs.Builder]*):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesMicrosoftSqlserverConnectionPropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesMicrosoftSqlserverConnectionPropertiesAdditionalAttributeArgs.builder
      builder.additionalAttributes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesMysqlConnectionPropertiesArgs.Builder)
    /**
     * @param additionalAttributes An array of name-value pair attribute entries.
     * Used as additional parameters in connection string.
     * Structure is documented below.
     * @return builder
     */
    inline def additionalAttributes(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesMysqlConnectionPropertiesAdditionalAttributeArgs.Builder]*):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesMysqlConnectionPropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesMysqlConnectionPropertiesAdditionalAttributeArgs.builder
      builder.additionalAttributes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesPostgresqlConnectionPropertiesArgs.Builder)
    /**
     * @param additionalAttributes An array of name-value pair attribute entries.
     * Used as additional parameters in connection string.
     * Structure is documented below.
     * @return builder
     */
    inline def additionalAttributes(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesPostgresqlConnectionPropertiesAdditionalAttributeArgs.Builder]*):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesPostgresqlConnectionPropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesPostgresqlConnectionPropertiesAdditionalAttributeArgs.builder
      builder.additionalAttributes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionState.Builder)
    /**
     * @param properties The properties of a GoldengateConnection.
     * Structure is documented below.
     * @return builder
     */
    inline def properties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionState.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateConnectionPropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.GoldengateDeploymentPropertiesArgs.Builder)
    /**
     * @param backupSchedule The backup schedule of the GoldengateDeployment.
     * Structure is documented below.
     * @return builder
     */
    inline def backupSchedule(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateDeploymentPropertiesBackupScheduleArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateDeploymentPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateDeploymentPropertiesBackupScheduleArgs.builder
      builder.backupSchedule(args(argsBuilder).build)

    /**
     * @param deploymentDiagnosticData The deployment diagnostic data.
     * Structure is documented below.
     * @return builder
     */
    inline def deploymentDiagnosticData(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateDeploymentPropertiesDeploymentDiagnosticDataArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateDeploymentPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateDeploymentPropertiesDeploymentDiagnosticDataArgs.builder
      builder.deploymentDiagnosticData(args(argsBuilder).build)

    /**
     * @param ingressIps (Output)
     * The ingress ips of the GoldengateDeployment.
     * Structure is documented below.
     * @return builder
     */
    inline def ingressIps(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateDeploymentPropertiesIngressIpArgs.Builder]*):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateDeploymentPropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateDeploymentPropertiesIngressIpArgs.builder
      builder.ingressIps(args.map(_(argsBuilder).build)*)

    /**
     * @param locks (Output)
     * The locks of the GoldengateDeployment.
     * Structure is documented below.
     * @return builder
     */
    inline def locks(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateDeploymentPropertiesLockArgs.Builder]*):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateDeploymentPropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateDeploymentPropertiesLockArgs.builder
      builder.locks(args.map(_(argsBuilder).build)*)

    /**
     * @param maintenanceConfig The maintenance configuration of the GoldengateDeployment.
     * Structure is documented below.
     * @return builder
     */
    inline def maintenanceConfig(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateDeploymentPropertiesMaintenanceConfigArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateDeploymentPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateDeploymentPropertiesMaintenanceConfigArgs.builder
      builder.maintenanceConfig(args(argsBuilder).build)

    /**
     * @param maintenanceWindow The maintenance window of the GoldengateDeployment.
     * Structure is documented below.
     * @return builder
     */
    inline def maintenanceWindow(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateDeploymentPropertiesMaintenanceWindowArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateDeploymentPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateDeploymentPropertiesMaintenanceWindowArgs.builder
      builder.maintenanceWindow(args(argsBuilder).build)

    /**
     * @param oggData The Ogg data of the GoldengateDeployment.
     * Structure is documented below.
     * @return builder
     */
    inline def oggData(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateDeploymentPropertiesOggDataArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateDeploymentPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateDeploymentPropertiesOggDataArgs.builder
      builder.oggData(args(argsBuilder).build)

    /**
     * @param placements (Output)
     * The placements of the GoldengateDeployment.
     * Structure is documented below.
     * @return builder
     */
    inline def placements(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateDeploymentPropertiesPlacementArgs.Builder]*):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateDeploymentPropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateDeploymentPropertiesPlacementArgs.builder
      builder.placements(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.GoldengateDeploymentPropertiesOggDataArgs.Builder)
    /**
     * @param groupRolesMapping The group to roles mapping of the GoldengateDeployment.
     * Structure is documented below.
     * @return builder
     */
    inline def groupRolesMapping(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateDeploymentPropertiesOggDataGroupRolesMappingArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateDeploymentPropertiesOggDataArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateDeploymentPropertiesOggDataGroupRolesMappingArgs.builder
      builder.groupRolesMapping(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.GoldengateDeploymentState.Builder)
    /**
     * @param properties Properties of GoldengateDeployment.
     * Structure is documented below.
     * @return builder
     */
    inline def properties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GoldengateDeploymentPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.GoldengateDeploymentState.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GoldengateDeploymentPropertiesArgs.builder
      builder.properties(args(argsBuilder).build)
