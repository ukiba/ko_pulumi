package jp.ukiba.ko_pulumi
package aws

object odb_ext:
  extension (builder: com.pulumi.aws.odb.AutonomousDatabaseArgs.Builder)
    /**
     * @param adminPasswordSource Source of the `ADMIN` password. Conflicts with `adminPassword` and `adminPasswordWo`. See `adminPasswordSource` Block below.
     * @return builder
     */
    def adminPasswordSource(args: Endofunction[com.pulumi.aws.odb.inputs.AutonomousDatabaseAdminPasswordSourceArgs.Builder]):
        com.pulumi.aws.odb.AutonomousDatabaseArgs.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.AutonomousDatabaseAdminPasswordSourceArgs.builder
      builder.adminPasswordSource(args(argsBuilder).build)

    /**
     * @param customerContactsToSendToOcis Customer contacts that receive operational notifications from OCI. See `customerContactsToSendToOci` Block below.
     * @return builder
     */
    def customerContactsToSendToOcis(args: Endofunction[com.pulumi.aws.odb.inputs.AutonomousDatabaseCustomerContactsToSendToOciArgs.Builder]*):
        com.pulumi.aws.odb.AutonomousDatabaseArgs.Builder =
      def argsBuilder = com.pulumi.aws.odb.inputs.AutonomousDatabaseCustomerContactsToSendToOciArgs.builder
      builder.customerContactsToSendToOcis(args.map(_(argsBuilder).build)*)

    /**
     * @param dbToolsDetails Database management tools to enable. See `dbToolsDetails` Block below.
     * @return builder
     */
    def dbToolsDetails(args: Endofunction[com.pulumi.aws.odb.inputs.AutonomousDatabaseDbToolsDetailArgs.Builder]*):
        com.pulumi.aws.odb.AutonomousDatabaseArgs.Builder =
      def argsBuilder = com.pulumi.aws.odb.inputs.AutonomousDatabaseDbToolsDetailArgs.builder
      builder.dbToolsDetails(args.map(_(argsBuilder).build)*)

    /**
     * @param longTermBackupSchedule Long-term backup schedule. See `longTermBackupSchedule` Block below.
     * @return builder
     */
    def longTermBackupSchedule(args: Endofunction[com.pulumi.aws.odb.inputs.AutonomousDatabaseLongTermBackupScheduleArgs.Builder]):
        com.pulumi.aws.odb.AutonomousDatabaseArgs.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.AutonomousDatabaseLongTermBackupScheduleArgs.builder
      builder.longTermBackupSchedule(args(argsBuilder).build)

    /**
     * @param resourcePoolSummary Resource pool configuration. See `resourcePoolSummary` Block below.
     * @return builder
     */
    def resourcePoolSummary(args: Endofunction[com.pulumi.aws.odb.inputs.AutonomousDatabaseResourcePoolSummaryArgs.Builder]):
        com.pulumi.aws.odb.AutonomousDatabaseArgs.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.AutonomousDatabaseResourcePoolSummaryArgs.builder
      builder.resourcePoolSummary(args(argsBuilder).build)

    /**
     * @param scheduledOperations Scheduled database start and stop times. See `scheduledOperations` Block below.
     * @return builder
     */
    def scheduledOperations(args: Endofunction[com.pulumi.aws.odb.inputs.AutonomousDatabaseScheduledOperationArgs.Builder]*):
        com.pulumi.aws.odb.AutonomousDatabaseArgs.Builder =
      def argsBuilder = com.pulumi.aws.odb.inputs.AutonomousDatabaseScheduledOperationArgs.builder
      builder.scheduledOperations(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceConfiguration Source-specific configuration used during creation. See `sourceConfiguration` Block below. Changing this value creates a new resource.
     * @return builder
     */
    def sourceConfiguration(args: Endofunction[com.pulumi.aws.odb.inputs.AutonomousDatabaseSourceConfigurationArgs.Builder]):
        com.pulumi.aws.odb.AutonomousDatabaseArgs.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.AutonomousDatabaseSourceConfigurationArgs.builder
      builder.sourceConfiguration(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.odb.inputs.AutonomousDatabaseTimeoutsArgs.Builder]):
        com.pulumi.aws.odb.AutonomousDatabaseArgs.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.AutonomousDatabaseTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param transportableTablespace Transportable tablespace configuration. See `transportableTablespace` Block below. Changing this value creates a new resource.
     * @return builder
     */
    def transportableTablespace(args: Endofunction[com.pulumi.aws.odb.inputs.AutonomousDatabaseTransportableTablespaceArgs.Builder]):
        com.pulumi.aws.odb.AutonomousDatabaseArgs.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.AutonomousDatabaseTransportableTablespaceArgs.builder
      builder.transportableTablespace(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.odb.AutonomousDatabaseSecretsManagerIntegrationArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.odb.inputs.AutonomousDatabaseSecretsManagerIntegrationTimeoutsArgs.Builder]):
        com.pulumi.aws.odb.AutonomousDatabaseSecretsManagerIntegrationArgs.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.AutonomousDatabaseSecretsManagerIntegrationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.odb.CloudAutonomousVmClusterArgs.Builder)
    /**
     * @param maintenanceWindow Maintenance window of the Autonomous VM cluster. Changing this will force terraform to create new resource.
     * @return builder
     */
    def maintenanceWindow(args: Endofunction[com.pulumi.aws.odb.inputs.CloudAutonomousVmClusterMaintenanceWindowArgs.Builder]):
        com.pulumi.aws.odb.CloudAutonomousVmClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.CloudAutonomousVmClusterMaintenanceWindowArgs.builder
      builder.maintenanceWindow(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.odb.inputs.CloudAutonomousVmClusterTimeoutsArgs.Builder]):
        com.pulumi.aws.odb.CloudAutonomousVmClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.CloudAutonomousVmClusterTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.odb.CloudExadataInfrastructureArgs.Builder)
    /**
     * @param customerContactsToSendToOcis Email addresses of contacts to receive notification from Oracle about maintenance updates for the Exadata infrastructure. Changing this will force terraform to create new resource. See `customerContactsToSendToOci` Block below.
     * @return builder
     */
    def customerContactsToSendToOcis(args: Endofunction[com.pulumi.aws.odb.inputs.CloudExadataInfrastructureCustomerContactsToSendToOciArgs.Builder]*):
        com.pulumi.aws.odb.CloudExadataInfrastructureArgs.Builder =
      def argsBuilder = com.pulumi.aws.odb.inputs.CloudExadataInfrastructureCustomerContactsToSendToOciArgs.builder
      builder.customerContactsToSendToOcis(args.map(_(argsBuilder).build)*)

    /**
     * @param maintenanceWindow The scheduling details for the maintenance window. Patching and system updates take place during the maintenance window
     * @return builder
     */
    def maintenanceWindow(args: Endofunction[com.pulumi.aws.odb.inputs.CloudExadataInfrastructureMaintenanceWindowArgs.Builder]):
        com.pulumi.aws.odb.CloudExadataInfrastructureArgs.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.CloudExadataInfrastructureMaintenanceWindowArgs.builder
      builder.maintenanceWindow(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.odb.inputs.CloudExadataInfrastructureTimeoutsArgs.Builder]):
        com.pulumi.aws.odb.CloudExadataInfrastructureArgs.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.CloudExadataInfrastructureTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.odb.CloudVmClusterArgs.Builder)
    /**
     * @param dataCollectionOptions Set of preferences for the various diagnostic collection options for the VM cluster. See `dataCollectionOptions` Block below. Changing this will create a new resource.
     * @return builder
     */
    def dataCollectionOptions(args: Endofunction[com.pulumi.aws.odb.inputs.CloudVmClusterDataCollectionOptionsArgs.Builder]):
        com.pulumi.aws.odb.CloudVmClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.CloudVmClusterDataCollectionOptionsArgs.builder
      builder.dataCollectionOptions(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.odb.inputs.CloudVmClusterTimeoutsArgs.Builder]):
        com.pulumi.aws.odb.CloudVmClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.CloudVmClusterTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.odb.IamRoleAssociationArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.odb.inputs.IamRoleAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.odb.IamRoleAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.IamRoleAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.odb.NetworkArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.odb.inputs.NetworkTimeoutsArgs.Builder]):
        com.pulumi.aws.odb.NetworkArgs.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.NetworkTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.odb.NetworkPeeringConnectionArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.odb.inputs.NetworkPeeringConnectionTimeoutsArgs.Builder]):
        com.pulumi.aws.odb.NetworkPeeringConnectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.NetworkPeeringConnectionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.odb.inputs.AutonomousDatabaseAdminPasswordSourceArgs.Builder)
    def customerManagedAwsSecret(args: Endofunction[com.pulumi.aws.odb.inputs.AutonomousDatabaseAdminPasswordSourceCustomerManagedAwsSecretArgs.Builder]):
        com.pulumi.aws.odb.inputs.AutonomousDatabaseAdminPasswordSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.AutonomousDatabaseAdminPasswordSourceCustomerManagedAwsSecretArgs.builder
      builder.customerManagedAwsSecret(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.odb.inputs.AutonomousDatabaseSecretsManagerIntegrationState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.odb.inputs.AutonomousDatabaseSecretsManagerIntegrationTimeoutsArgs.Builder]):
        com.pulumi.aws.odb.inputs.AutonomousDatabaseSecretsManagerIntegrationState.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.AutonomousDatabaseSecretsManagerIntegrationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.odb.inputs.AutonomousDatabaseSourceConfigurationArgs.Builder)
    def cloneToRefreshable(args: Endofunction[com.pulumi.aws.odb.inputs.AutonomousDatabaseSourceConfigurationCloneToRefreshableArgs.Builder]):
        com.pulumi.aws.odb.inputs.AutonomousDatabaseSourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.AutonomousDatabaseSourceConfigurationCloneToRefreshableArgs.builder
      builder.cloneToRefreshable(args(argsBuilder).build)

    def crossRegionDataGuard(args: Endofunction[com.pulumi.aws.odb.inputs.AutonomousDatabaseSourceConfigurationCrossRegionDataGuardArgs.Builder]):
        com.pulumi.aws.odb.inputs.AutonomousDatabaseSourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.AutonomousDatabaseSourceConfigurationCrossRegionDataGuardArgs.builder
      builder.crossRegionDataGuard(args(argsBuilder).build)

    def crossRegionDisasterRecovery(args: Endofunction[com.pulumi.aws.odb.inputs.AutonomousDatabaseSourceConfigurationCrossRegionDisasterRecoveryArgs.Builder]):
        com.pulumi.aws.odb.inputs.AutonomousDatabaseSourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.AutonomousDatabaseSourceConfigurationCrossRegionDisasterRecoveryArgs.builder
      builder.crossRegionDisasterRecovery(args(argsBuilder).build)

    def databaseClone(args: Endofunction[com.pulumi.aws.odb.inputs.AutonomousDatabaseSourceConfigurationDatabaseCloneArgs.Builder]):
        com.pulumi.aws.odb.inputs.AutonomousDatabaseSourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.AutonomousDatabaseSourceConfigurationDatabaseCloneArgs.builder
      builder.databaseClone(args(argsBuilder).build)

    def pointInTimeRestore(args: Endofunction[com.pulumi.aws.odb.inputs.AutonomousDatabaseSourceConfigurationPointInTimeRestoreArgs.Builder]):
        com.pulumi.aws.odb.inputs.AutonomousDatabaseSourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.AutonomousDatabaseSourceConfigurationPointInTimeRestoreArgs.builder
      builder.pointInTimeRestore(args(argsBuilder).build)

    def restoreFromBackup(args: Endofunction[com.pulumi.aws.odb.inputs.AutonomousDatabaseSourceConfigurationRestoreFromBackupArgs.Builder]):
        com.pulumi.aws.odb.inputs.AutonomousDatabaseSourceConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.AutonomousDatabaseSourceConfigurationRestoreFromBackupArgs.builder
      builder.restoreFromBackup(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.odb.inputs.AutonomousDatabaseState.Builder)
    /**
     * @param adminPasswordSource Source of the `ADMIN` password. Conflicts with `adminPassword` and `adminPasswordWo`. See `adminPasswordSource` Block below.
     * @return builder
     */
    def adminPasswordSource(args: Endofunction[com.pulumi.aws.odb.inputs.AutonomousDatabaseAdminPasswordSourceArgs.Builder]):
        com.pulumi.aws.odb.inputs.AutonomousDatabaseState.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.AutonomousDatabaseAdminPasswordSourceArgs.builder
      builder.adminPasswordSource(args(argsBuilder).build)

    /**
     * @param customerContactsToSendToOcis Customer contacts that receive operational notifications from OCI. See `customerContactsToSendToOci` Block below.
     * @return builder
     */
    def customerContactsToSendToOcis(args: Endofunction[com.pulumi.aws.odb.inputs.AutonomousDatabaseCustomerContactsToSendToOciArgs.Builder]*):
        com.pulumi.aws.odb.inputs.AutonomousDatabaseState.Builder =
      def argsBuilder = com.pulumi.aws.odb.inputs.AutonomousDatabaseCustomerContactsToSendToOciArgs.builder
      builder.customerContactsToSendToOcis(args.map(_(argsBuilder).build)*)

    /**
     * @param dbToolsDetails Database management tools to enable. See `dbToolsDetails` Block below.
     * @return builder
     */
    def dbToolsDetails(args: Endofunction[com.pulumi.aws.odb.inputs.AutonomousDatabaseDbToolsDetailArgs.Builder]*):
        com.pulumi.aws.odb.inputs.AutonomousDatabaseState.Builder =
      def argsBuilder = com.pulumi.aws.odb.inputs.AutonomousDatabaseDbToolsDetailArgs.builder
      builder.dbToolsDetails(args.map(_(argsBuilder).build)*)

    /**
     * @param longTermBackupSchedule Long-term backup schedule. See `longTermBackupSchedule` Block below.
     * @return builder
     */
    def longTermBackupSchedule(args: Endofunction[com.pulumi.aws.odb.inputs.AutonomousDatabaseLongTermBackupScheduleArgs.Builder]):
        com.pulumi.aws.odb.inputs.AutonomousDatabaseState.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.AutonomousDatabaseLongTermBackupScheduleArgs.builder
      builder.longTermBackupSchedule(args(argsBuilder).build)

    /**
     * @param resourcePoolSummary Resource pool configuration. See `resourcePoolSummary` Block below.
     * @return builder
     */
    def resourcePoolSummary(args: Endofunction[com.pulumi.aws.odb.inputs.AutonomousDatabaseResourcePoolSummaryArgs.Builder]):
        com.pulumi.aws.odb.inputs.AutonomousDatabaseState.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.AutonomousDatabaseResourcePoolSummaryArgs.builder
      builder.resourcePoolSummary(args(argsBuilder).build)

    /**
     * @param scheduledOperations Scheduled database start and stop times. See `scheduledOperations` Block below.
     * @return builder
     */
    def scheduledOperations(args: Endofunction[com.pulumi.aws.odb.inputs.AutonomousDatabaseScheduledOperationArgs.Builder]*):
        com.pulumi.aws.odb.inputs.AutonomousDatabaseState.Builder =
      def argsBuilder = com.pulumi.aws.odb.inputs.AutonomousDatabaseScheduledOperationArgs.builder
      builder.scheduledOperations(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceConfiguration Source-specific configuration used during creation. See `sourceConfiguration` Block below. Changing this value creates a new resource.
     * @return builder
     */
    def sourceConfiguration(args: Endofunction[com.pulumi.aws.odb.inputs.AutonomousDatabaseSourceConfigurationArgs.Builder]):
        com.pulumi.aws.odb.inputs.AutonomousDatabaseState.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.AutonomousDatabaseSourceConfigurationArgs.builder
      builder.sourceConfiguration(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.odb.inputs.AutonomousDatabaseTimeoutsArgs.Builder]):
        com.pulumi.aws.odb.inputs.AutonomousDatabaseState.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.AutonomousDatabaseTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param transportableTablespace Transportable tablespace configuration. See `transportableTablespace` Block below. Changing this value creates a new resource.
     * @return builder
     */
    def transportableTablespace(args: Endofunction[com.pulumi.aws.odb.inputs.AutonomousDatabaseTransportableTablespaceArgs.Builder]):
        com.pulumi.aws.odb.inputs.AutonomousDatabaseState.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.AutonomousDatabaseTransportableTablespaceArgs.builder
      builder.transportableTablespace(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.odb.inputs.CloudAutonomousVmClusterMaintenanceWindowArgs.Builder)
    /**
     * @param daysOfWeeks Days of the week when maintenance can be performed. Changing this will force terraform to create new resource. See `daysOfWeek` Block below.
     * @return builder
     */
    def daysOfWeeks(args: Endofunction[com.pulumi.aws.odb.inputs.CloudAutonomousVmClusterMaintenanceWindowDaysOfWeekArgs.Builder]*):
        com.pulumi.aws.odb.inputs.CloudAutonomousVmClusterMaintenanceWindowArgs.Builder =
      def argsBuilder = com.pulumi.aws.odb.inputs.CloudAutonomousVmClusterMaintenanceWindowDaysOfWeekArgs.builder
      builder.daysOfWeeks(args.map(_(argsBuilder).build)*)

    /**
     * @param months Months when maintenance can be performed. Changing this will force terraform to create new resource. See `months` Block below.
     * @return builder
     */
    def months(args: Endofunction[com.pulumi.aws.odb.inputs.CloudAutonomousVmClusterMaintenanceWindowMonthArgs.Builder]*):
        com.pulumi.aws.odb.inputs.CloudAutonomousVmClusterMaintenanceWindowArgs.Builder =
      def argsBuilder = com.pulumi.aws.odb.inputs.CloudAutonomousVmClusterMaintenanceWindowMonthArgs.builder
      builder.months(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.odb.inputs.CloudAutonomousVmClusterState.Builder)
    /**
     * @param maintenanceWindow Maintenance window of the Autonomous VM cluster. Changing this will force terraform to create new resource.
     * @return builder
     */
    def maintenanceWindow(args: Endofunction[com.pulumi.aws.odb.inputs.CloudAutonomousVmClusterMaintenanceWindowArgs.Builder]):
        com.pulumi.aws.odb.inputs.CloudAutonomousVmClusterState.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.CloudAutonomousVmClusterMaintenanceWindowArgs.builder
      builder.maintenanceWindow(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.odb.inputs.CloudAutonomousVmClusterTimeoutsArgs.Builder]):
        com.pulumi.aws.odb.inputs.CloudAutonomousVmClusterState.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.CloudAutonomousVmClusterTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.odb.inputs.CloudExadataInfrastructureMaintenanceWindowArgs.Builder)
    /**
     * @param daysOfWeeks Days of the week when maintenance can be performed. See `daysOfWeek` Block below.
     * @return builder
     */
    def daysOfWeeks(args: Endofunction[com.pulumi.aws.odb.inputs.CloudExadataInfrastructureMaintenanceWindowDaysOfWeekArgs.Builder]*):
        com.pulumi.aws.odb.inputs.CloudExadataInfrastructureMaintenanceWindowArgs.Builder =
      def argsBuilder = com.pulumi.aws.odb.inputs.CloudExadataInfrastructureMaintenanceWindowDaysOfWeekArgs.builder
      builder.daysOfWeeks(args.map(_(argsBuilder).build)*)

    /**
     * @param months Months when maintenance can be performed. See `months` Block below.
     * @return builder
     */
    def months(args: Endofunction[com.pulumi.aws.odb.inputs.CloudExadataInfrastructureMaintenanceWindowMonthArgs.Builder]*):
        com.pulumi.aws.odb.inputs.CloudExadataInfrastructureMaintenanceWindowArgs.Builder =
      def argsBuilder = com.pulumi.aws.odb.inputs.CloudExadataInfrastructureMaintenanceWindowMonthArgs.builder
      builder.months(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.odb.inputs.CloudExadataInfrastructureState.Builder)
    /**
     * @param customerContactsToSendToOcis Email addresses of contacts to receive notification from Oracle about maintenance updates for the Exadata infrastructure. Changing this will force terraform to create new resource. See `customerContactsToSendToOci` Block below.
     * @return builder
     */
    def customerContactsToSendToOcis(args: Endofunction[com.pulumi.aws.odb.inputs.CloudExadataInfrastructureCustomerContactsToSendToOciArgs.Builder]*):
        com.pulumi.aws.odb.inputs.CloudExadataInfrastructureState.Builder =
      def argsBuilder = com.pulumi.aws.odb.inputs.CloudExadataInfrastructureCustomerContactsToSendToOciArgs.builder
      builder.customerContactsToSendToOcis(args.map(_(argsBuilder).build)*)

    /**
     * @param maintenanceWindow The scheduling details for the maintenance window. Patching and system updates take place during the maintenance window
     * @return builder
     */
    def maintenanceWindow(args: Endofunction[com.pulumi.aws.odb.inputs.CloudExadataInfrastructureMaintenanceWindowArgs.Builder]):
        com.pulumi.aws.odb.inputs.CloudExadataInfrastructureState.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.CloudExadataInfrastructureMaintenanceWindowArgs.builder
      builder.maintenanceWindow(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.odb.inputs.CloudExadataInfrastructureTimeoutsArgs.Builder]):
        com.pulumi.aws.odb.inputs.CloudExadataInfrastructureState.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.CloudExadataInfrastructureTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.odb.inputs.CloudVmClusterIormConfigCacheArgs.Builder)
    /**
     * @param dbPlans List of IORM (I/O Resource Manager) database plans for the VM cluster. See `dbPlans` Block below.
     * @return builder
     */
    def dbPlans(args: Endofunction[com.pulumi.aws.odb.inputs.CloudVmClusterIormConfigCacheDbPlanArgs.Builder]*):
        com.pulumi.aws.odb.inputs.CloudVmClusterIormConfigCacheArgs.Builder =
      def argsBuilder = com.pulumi.aws.odb.inputs.CloudVmClusterIormConfigCacheDbPlanArgs.builder
      builder.dbPlans(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.odb.inputs.CloudVmClusterState.Builder)
    /**
     * @param dataCollectionOptions Set of preferences for the various diagnostic collection options for the VM cluster. See `dataCollectionOptions` Block below. Changing this will create a new resource.
     * @return builder
     */
    def dataCollectionOptions(args: Endofunction[com.pulumi.aws.odb.inputs.CloudVmClusterDataCollectionOptionsArgs.Builder]):
        com.pulumi.aws.odb.inputs.CloudVmClusterState.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.CloudVmClusterDataCollectionOptionsArgs.builder
      builder.dataCollectionOptions(args(argsBuilder).build)

    /**
     * @param iormConfigCaches Exadata IORM (I/O Resource Manager) configuration cache details for the VM cluster. See `iormConfigCache` Block below.
     * @return builder
     */
    def iormConfigCaches(args: Endofunction[com.pulumi.aws.odb.inputs.CloudVmClusterIormConfigCacheArgs.Builder]*):
        com.pulumi.aws.odb.inputs.CloudVmClusterState.Builder =
      def argsBuilder = com.pulumi.aws.odb.inputs.CloudVmClusterIormConfigCacheArgs.builder
      builder.iormConfigCaches(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.odb.inputs.CloudVmClusterTimeoutsArgs.Builder]):
        com.pulumi.aws.odb.inputs.CloudVmClusterState.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.CloudVmClusterTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.odb.inputs.IamRoleAssociationState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.odb.inputs.IamRoleAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.odb.inputs.IamRoleAssociationState.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.IamRoleAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.odb.inputs.NetworkManagedServiceArgs.Builder)
    /**
     * @param crossRegionS3RestoreSourcesAccesses List of regions enabled for cross-region restore in the ODB network.
     * @return builder
     */
    def crossRegionS3RestoreSourcesAccesses(args: Endofunction[com.pulumi.aws.odb.inputs.NetworkManagedServiceCrossRegionS3RestoreSourcesAccessArgs.Builder]*):
        com.pulumi.aws.odb.inputs.NetworkManagedServiceArgs.Builder =
      def argsBuilder = com.pulumi.aws.odb.inputs.NetworkManagedServiceCrossRegionS3RestoreSourcesAccessArgs.builder
      builder.crossRegionS3RestoreSourcesAccesses(args.map(_(argsBuilder).build)*)

    /**
     * @param kmsAccesses Configuration for KMS access from the ODB network.
     * @return builder
     */
    def kmsAccesses(args: Endofunction[com.pulumi.aws.odb.inputs.NetworkManagedServiceKmsAccessArgs.Builder]*):
        com.pulumi.aws.odb.inputs.NetworkManagedServiceArgs.Builder =
      def argsBuilder = com.pulumi.aws.odb.inputs.NetworkManagedServiceKmsAccessArgs.builder
      builder.kmsAccesses(args.map(_(argsBuilder).build)*)

    /**
     * @param managedS3BackupAccesses Managed S3 backup access configuration. See `managedS3BackupAccess` Block below.
     * @return builder
     */
    def managedS3BackupAccesses(args: Endofunction[com.pulumi.aws.odb.inputs.NetworkManagedServiceManagedS3BackupAccessArgs.Builder]*):
        com.pulumi.aws.odb.inputs.NetworkManagedServiceArgs.Builder =
      def argsBuilder = com.pulumi.aws.odb.inputs.NetworkManagedServiceManagedS3BackupAccessArgs.builder
      builder.managedS3BackupAccesses(args.map(_(argsBuilder).build)*)

    /**
     * @param s3Accesses Configuration for Amazon S3 access from the ODB network.
     * @return builder
     */
    def s3Accesses(args: Endofunction[com.pulumi.aws.odb.inputs.NetworkManagedServiceS3AccessArgs.Builder]*):
        com.pulumi.aws.odb.inputs.NetworkManagedServiceArgs.Builder =
      def argsBuilder = com.pulumi.aws.odb.inputs.NetworkManagedServiceS3AccessArgs.builder
      builder.s3Accesses(args.map(_(argsBuilder).build)*)

    /**
     * @param serviceNetworkEndpoints Service network endpoint configuration. See `serviceNetworkEndpoint` Block below.
     * @return builder
     */
    def serviceNetworkEndpoints(args: Endofunction[com.pulumi.aws.odb.inputs.NetworkManagedServiceServiceNetworkEndpointArgs.Builder]*):
        com.pulumi.aws.odb.inputs.NetworkManagedServiceArgs.Builder =
      def argsBuilder = com.pulumi.aws.odb.inputs.NetworkManagedServiceServiceNetworkEndpointArgs.builder
      builder.serviceNetworkEndpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param stsAccesses Configuration for STS access from the ODB network.
     * @return builder
     */
    def stsAccesses(args: Endofunction[com.pulumi.aws.odb.inputs.NetworkManagedServiceStsAccessArgs.Builder]*):
        com.pulumi.aws.odb.inputs.NetworkManagedServiceArgs.Builder =
      def argsBuilder = com.pulumi.aws.odb.inputs.NetworkManagedServiceStsAccessArgs.builder
      builder.stsAccesses(args.map(_(argsBuilder).build)*)

    /**
     * @param zeroEtlAccesses Configuration for Zero-ETL access from the ODB network.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def zeroEtlAccesses(args: Endofunction[com.pulumi.aws.odb.inputs.NetworkManagedServiceZeroEtlAccessArgs.Builder]*):
        com.pulumi.aws.odb.inputs.NetworkManagedServiceArgs.Builder =
      def argsBuilder = com.pulumi.aws.odb.inputs.NetworkManagedServiceZeroEtlAccessArgs.builder
      builder.zeroEtlAccesses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.odb.inputs.NetworkPeeringConnectionState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.odb.inputs.NetworkPeeringConnectionTimeoutsArgs.Builder]):
        com.pulumi.aws.odb.inputs.NetworkPeeringConnectionState.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.NetworkPeeringConnectionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.odb.inputs.NetworkState.Builder)
    /**
     * @param managedServices Managed services configuration for the ODB network. See `managedServices` Block below.
     * @return builder
     */
    def managedServices(args: Endofunction[com.pulumi.aws.odb.inputs.NetworkManagedServiceArgs.Builder]*):
        com.pulumi.aws.odb.inputs.NetworkState.Builder =
      def argsBuilder = com.pulumi.aws.odb.inputs.NetworkManagedServiceArgs.builder
      builder.managedServices(args.map(_(argsBuilder).build)*)

    /**
     * @param ociDnsForwardingConfigs DNS resolver endpoints in OCI for forwarding DNS queries for the `ociPrivateZone` domain. See `ociDnsForwardingConfigs` Block below.
     * @return builder
     */
    def ociDnsForwardingConfigs(args: Endofunction[com.pulumi.aws.odb.inputs.NetworkOciDnsForwardingConfigArgs.Builder]*):
        com.pulumi.aws.odb.inputs.NetworkState.Builder =
      def argsBuilder = com.pulumi.aws.odb.inputs.NetworkOciDnsForwardingConfigArgs.builder
      builder.ociDnsForwardingConfigs(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.odb.inputs.NetworkTimeoutsArgs.Builder]):
        com.pulumi.aws.odb.inputs.NetworkState.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.NetworkTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
