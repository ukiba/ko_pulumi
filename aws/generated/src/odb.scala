package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object odb:
  /**
   * Manages an Oracle Database{@literal @}AWS Autonomous Database Serverless (ADB-S) instance. ADB-S uses shared Exadata infrastructure managed by Oracle and requires an existing ODB network; it does not require a customer-managed Exadata infrastructure or VM cluster.
   * 
   * Provisioning, updating, and deleting an Autonomous Database are asynchronous and can take several hours. The AWS account and Region must be onboarded for Oracle Database{@literal @}AWS and have sufficient service quotas.
   * 
   * The AWS API defines all create parameters as optional because the valid combination depends on `source`. For a new database (`source = &#34;NONE&#34;`), configure the ODB network, database identity, workload, compute, storage, license, and ADMIN password values required by your Oracle Database{@literal @}AWS tenancy.
   */
  def AutonomousDatabase(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.odb.AutonomousDatabaseArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.odb.AutonomousDatabaseArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.odb.AutonomousDatabase(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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

  /**
   * Manages the Oracle Database{@literal @}AWS Autonomous Database Serverless integration with AWS Secrets Manager. The resource provisions an Oracle-managed service role that can assume a customer-managed role to read an administrator-password secret.
   * 
   * &gt; **Note:** This integration is shared by all databases in the AWS account and Region. Creating this resource manages the existing integration if it is already enabled. Destroying this resource disables the integration for the entire account and Region, which can disrupt databases outside this Terraform configuration that use AWS Secrets Manager credentials. Manage the integration in only one Terraform configuration and coordinate changes with all database owners that depend on it.
   * 
   * For accounts with a resource anchor, creating or destroying this resource preserves an existing OCI identity domain. If no identity domain exists, the service creates one when enabling or disabling the integration. This resource does not delete the identity domain.
   * 
   * Create the customer-managed IAM role separately. Its trust policy must allow the exported `roleArn` to assume it, and its permissions must grant access to the selected secret. See the [AWS Secrets Manager documentation](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html) for IAM permission guidance.
   */
  def AutonomousDatabaseSecretsManagerIntegration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.odb.AutonomousDatabaseSecretsManagerIntegrationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.odb.AutonomousDatabaseSecretsManagerIntegrationArgs.builder
    com.pulumi.aws.odb.AutonomousDatabaseSecretsManagerIntegration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.odb.AutonomousDatabaseSecretsManagerIntegrationArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.odb.inputs.AutonomousDatabaseSecretsManagerIntegrationTimeoutsArgs.Builder]):
        com.pulumi.aws.odb.AutonomousDatabaseSecretsManagerIntegrationArgs.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.AutonomousDatabaseSecretsManagerIntegrationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /**
   * Resource managing cloud autonomous vm cluster in AWS for Oracle Database{@literal @}AWS.
   * 
   * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
   */
  def CloudAutonomousVmCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.odb.CloudAutonomousVmClusterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.odb.CloudAutonomousVmClusterArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.odb.CloudAutonomousVmCluster(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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

  /** Resource for managing exadata infrastructure resource in AWS for Oracle Database{@literal @}AWS. */
  def CloudExadataInfrastructure(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.odb.CloudExadataInfrastructureArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.odb.CloudExadataInfrastructureArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.odb.CloudExadataInfrastructure(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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

  /**
   * Terraform to manage cloud vm cluster resource in AWS for Oracle Database{@literal @}AWS. If underlying odb network and cloud exadata infrastructure is shared, ARN must be used while creating VM cluster.
   * 
   * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
   */
  def CloudVmCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.odb.CloudVmClusterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.odb.CloudVmClusterArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.odb.CloudVmCluster(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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

  /**
   * Manages an AWS Oracle Database{@literal @}AWS Associate Disassociate IAM Role.
   * 
   * Currently supported `resourceArn` targets are Cloud VM Clusters and Cloud Autonomous VM Clusters.
   */
  def IamRoleAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.odb.IamRoleAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.odb.IamRoleAssociationArgs.builder
    com.pulumi.aws.odb.IamRoleAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.odb.IamRoleAssociationArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.odb.inputs.IamRoleAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.odb.IamRoleAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.IamRoleAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Resource for managing odb Network resource in AWS for Oracle Database{@literal @}AWS. */
  def Network(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.odb.NetworkArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.odb.NetworkArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.odb.Network(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.odb.NetworkArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.odb.inputs.NetworkTimeoutsArgs.Builder]):
        com.pulumi.aws.odb.NetworkArgs.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.NetworkTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /**
   * Terraform  resource for managing oracle database network peering resource in AWS. If underlying odb network is shared, ARN must be used while creating network peering.
   * 
   * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
   */
  def NetworkPeeringConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.odb.NetworkPeeringConnectionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.odb.NetworkPeeringConnectionArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.odb.NetworkPeeringConnection(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.odb.NetworkPeeringConnectionArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.odb.inputs.NetworkPeeringConnectionTimeoutsArgs.Builder]):
        com.pulumi.aws.odb.NetworkPeeringConnectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.NetworkPeeringConnectionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  object OdbFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Provides details about an Oracle Database{@literal @}AWS Autonomous Database Serverless (ADB-S) instance by its unique identifier. */
    inline def getAutonomousDatabase(args: Endofunction[com.pulumi.aws.odb.inputs.GetAutonomousDatabaseArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetAutonomousDatabaseResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetAutonomousDatabaseArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getAutonomousDatabase(args(argsBuilder).build)

    /** Provides details about an Oracle Database{@literal @}AWS Autonomous Database Serverless (ADB-S) instance by its unique identifier. */
    inline def getAutonomousDatabasePlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetAutonomousDatabasePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetAutonomousDatabaseResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetAutonomousDatabasePlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getAutonomousDatabasePlain(args(argsBuilder).build)

    /**
     * Data source for managing cloud autonomous vm cluster resource in AWS for Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getCloudAutonomousVmCluster(args: Endofunction[com.pulumi.aws.odb.inputs.GetCloudAutonomousVmClusterArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetCloudAutonomousVmClusterResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetCloudAutonomousVmClusterArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getCloudAutonomousVmCluster(args(argsBuilder).build)

    /**
     * Data source for managing cloud autonomous vm cluster resource in AWS for Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getCloudAutonomousVmClusterPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetCloudAutonomousVmClusterPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetCloudAutonomousVmClusterResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetCloudAutonomousVmClusterPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getCloudAutonomousVmClusterPlain(args(argsBuilder).build)

    /**
     * Data source for managing cloud autonomous vm clusters in AWS for Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getCloudAutonomousVmClusters(args: Endofunction[com.pulumi.aws.odb.inputs.GetCloudAutonomousVmClustersArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetCloudAutonomousVmClustersResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetCloudAutonomousVmClustersArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getCloudAutonomousVmClusters(args(argsBuilder).build)

    /**
     * Data source for managing cloud autonomous vm clusters in AWS for Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getCloudAutonomousVmClustersPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetCloudAutonomousVmClustersPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetCloudAutonomousVmClustersResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetCloudAutonomousVmClustersPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getCloudAutonomousVmClustersPlain(args(argsBuilder).build)

    /**
     * Data source for exadata infrastructure resource in AWS for Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getCloudExadataInfrastructure(args: Endofunction[com.pulumi.aws.odb.inputs.GetCloudExadataInfrastructureArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetCloudExadataInfrastructureResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetCloudExadataInfrastructureArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getCloudExadataInfrastructure(args(argsBuilder).build)

    /**
     * Data source for exadata infrastructure resource in AWS for Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getCloudExadataInfrastructurePlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetCloudExadataInfrastructurePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetCloudExadataInfrastructureResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetCloudExadataInfrastructurePlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getCloudExadataInfrastructurePlain(args(argsBuilder).build)

    /**
     * Data source for exadata infrastructures in AWS for Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getCloudExadataInfrastructures(args: Endofunction[com.pulumi.aws.odb.inputs.GetCloudExadataInfrastructuresArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetCloudExadataInfrastructuresResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetCloudExadataInfrastructuresArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getCloudExadataInfrastructures(args(argsBuilder).build)

    /**
     * Data source for exadata infrastructures in AWS for Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getCloudExadataInfrastructuresPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetCloudExadataInfrastructuresPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetCloudExadataInfrastructuresResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetCloudExadataInfrastructuresPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getCloudExadataInfrastructuresPlain(args(argsBuilder).build)

    /**
     * Data source for cloud vm cluster in AWS for Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getCloudVmCluster(args: Endofunction[com.pulumi.aws.odb.inputs.GetCloudVmClusterArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetCloudVmClusterResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetCloudVmClusterArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getCloudVmCluster(args(argsBuilder).build)

    /**
     * Data source for cloud vm cluster in AWS for Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getCloudVmClusterPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetCloudVmClusterPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetCloudVmClusterResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetCloudVmClusterPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getCloudVmClusterPlain(args(argsBuilder).build)

    /**
     * Data source for retrieving all cloud vm clusters AWS for Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getCloudVmClusters(args: Endofunction[com.pulumi.aws.odb.inputs.GetCloudVmClustersArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetCloudVmClustersResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetCloudVmClustersArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getCloudVmClusters(args(argsBuilder).build)

    /**
     * Data source for retrieving all cloud vm clusters AWS for Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getCloudVmClustersPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetCloudVmClustersPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetCloudVmClustersResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetCloudVmClustersPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getCloudVmClustersPlain(args(argsBuilder).build)

    /**
     * Data source for managing db nodes linked to cloud vm cluster of Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getDbNode(args: Endofunction[com.pulumi.aws.odb.inputs.GetDbNodeArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetDbNodeResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetDbNodeArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getDbNode(args(argsBuilder).build)

    /**
     * Data source for managing db nodes linked to cloud vm cluster of Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getDbNodePlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetDbNodePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetDbNodeResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetDbNodePlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getDbNodePlain(args(argsBuilder).build)

    /**
     * Data source for managing db nodes linked to cloud vm cluster of Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getDbNodes(args: Endofunction[com.pulumi.aws.odb.inputs.GetDbNodesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetDbNodesResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetDbNodesArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getDbNodes(args(argsBuilder).build)

    /**
     * Data source for managing db nodes linked to cloud vm cluster of Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getDbNodesPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetDbNodesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetDbNodesResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetDbNodesPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getDbNodesPlain(args(argsBuilder).build)

    /**
     * Data source for managing db server linked to exadata infrastructure of Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getDbServer(args: Endofunction[com.pulumi.aws.odb.inputs.GetDbServerArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetDbServerResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetDbServerArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getDbServer(args(argsBuilder).build)

    /**
     * Data source for managing db server linked to exadata infrastructure of Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getDbServerPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetDbServerPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetDbServerResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetDbServerPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getDbServerPlain(args(argsBuilder).build)

    /**
     * Data source for managing db servers linked to exadata infrastructure of Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getDbServers(args: Endofunction[com.pulumi.aws.odb.inputs.GetDbServersArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetDbServersResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetDbServersArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getDbServers(args(argsBuilder).build)

    /**
     * Data source for managing db servers linked to exadata infrastructure of Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getDbServersPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetDbServersPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetDbServersResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetDbServersPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getDbServersPlain(args(argsBuilder).build)

    /**
     * Data source to retrieve available system shapes Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getDbSystemShapes(args: Endofunction[com.pulumi.aws.odb.inputs.GetDbSystemShapesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetDbSystemShapesResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetDbSystemShapesArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getDbSystemShapes(args(argsBuilder).build)

    /**
     * Data source to retrieve available system shapes Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getDbSystemShapesPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetDbSystemShapesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetDbSystemShapesResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetDbSystemShapesPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getDbSystemShapesPlain(args(argsBuilder).build)

    /**
     * Data source to retrieve available Grid Infrastructure versions of Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getGiVersions(args: Endofunction[com.pulumi.aws.odb.inputs.GetGiVersionsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetGiVersionsResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetGiVersionsArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getGiVersions(args(argsBuilder).build)

    /**
     * Data source to retrieve available Grid Infrastructure versions of Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getGiVersionsPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetGiVersionsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetGiVersionsResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetGiVersionsPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getGiVersionsPlain(args(argsBuilder).build)

    /** Provides details about an AWS Oracle Database{@literal @}AWS Associate Disassociate IAM Role. */
    inline def getIamRoleAssociation(args: Endofunction[com.pulumi.aws.odb.inputs.GetIamRoleAssociationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetIamRoleAssociationResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetIamRoleAssociationArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getIamRoleAssociation(args(argsBuilder).build)

    /** Provides details about an AWS Oracle Database{@literal @}AWS Associate Disassociate IAM Role. */
    inline def getIamRoleAssociationPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetIamRoleAssociationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetIamRoleAssociationResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetIamRoleAssociationPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getIamRoleAssociationPlain(args(argsBuilder).build)

    /** Data source for to retrieve network resource in AWS for Oracle Database{@literal @}AWS. */
    inline def getNetwork(args: Endofunction[com.pulumi.aws.odb.inputs.GetNetworkArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetNetworkResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetNetworkArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getNetwork(args(argsBuilder).build)

    /** Data source for to retrieve network resource in AWS for Oracle Database{@literal @}AWS. */
    inline def getNetworkPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetNetworkPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetNetworkResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetNetworkPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getNetworkPlain(args(argsBuilder).build)

    /**
     * Data source for managing oracle database network peering resource in AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getNetworkPeeringConnection(args: Endofunction[com.pulumi.aws.odb.inputs.GetNetworkPeeringConnectionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetNetworkPeeringConnectionResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetNetworkPeeringConnectionArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getNetworkPeeringConnection(args(argsBuilder).build)

    /**
     * Data source for managing oracle database network peering resource in AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getNetworkPeeringConnectionPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetNetworkPeeringConnectionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetNetworkPeeringConnectionResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetNetworkPeeringConnectionPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getNetworkPeeringConnectionPlain(args(argsBuilder).build)

    /**
     * Data source for retrieving all oracle database network peering resource in Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getNetworkPeeringConnections(args: Endofunction[com.pulumi.aws.odb.inputs.GetNetworkPeeringConnectionsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetNetworkPeeringConnectionsResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetNetworkPeeringConnectionsArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getNetworkPeeringConnections(args(argsBuilder).build)

    /**
     * Data source for retrieving all oracle database network peering resource in Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getNetworkPeeringConnectionsPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetNetworkPeeringConnectionsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetNetworkPeeringConnectionsResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetNetworkPeeringConnectionsPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getNetworkPeeringConnectionsPlain(args(argsBuilder).build)

    /** Data source for to retrieve networks from AWS for Oracle Database{@literal @}AWS. */
    inline def getNetworks(args: Endofunction[com.pulumi.aws.odb.inputs.GetNetworksArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetNetworksResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetNetworksArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getNetworks(args(argsBuilder).build)

    /** Data source for to retrieve networks from AWS for Oracle Database{@literal @}AWS. */
    inline def getNetworksPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetNetworksPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetNetworksResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetNetworksPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getNetworksPlain(args(argsBuilder).build)

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
