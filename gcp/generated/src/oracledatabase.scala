package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object oracledatabase:
  extension (builder: com.pulumi.gcp.oracledatabase.CloudVmClusterArgs.Builder)
    /**
     * @param properties Various properties and settings associated with Exadata VM cluster.
     *  Structure is documented below.
     * @return builder
     */
    def properties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.CloudVmClusterPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.CloudVmClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.CloudVmClusterPropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  /**
   * An OdbSubnet resource which represents a subnet under an OdbNetwork.
   * 
   *  To get more information about OdbSubnet, see:
   *  * How-to Guides
   *      * [OracleDatabase{@literal @}Google Cloud](https://cloud.google.com/oracle/database/docs/overview&#39;)
   */
  def OdbSubnet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.oracledatabase.OdbSubnetArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.oracledatabase.OdbSubnetArgs.builder
    com.pulumi.gcp.oracledatabase.OdbSubnet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.ExadbVmClusterArgs.Builder)
    /**
     * @param properties The properties of an ExadbVmCluster.
     *  Structure is documented below.
     * @return builder
     */
    def properties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.ExadbVmClusterPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.ExadbVmClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.ExadbVmClusterPropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  object OracledatabaseFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Get information about an AutonomousDatabase.
     * 
     *  For more information see the
     *  [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.autonomousDatabases).
     */
    inline def getAutonomousDatabase(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetAutonomousDatabaseArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.oracledatabase.outputs.GetAutonomousDatabaseResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetAutonomousDatabaseArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getAutonomousDatabase(args(argsBuilder).build)

    /**
     * Get information about an AutonomousDatabase.
     * 
     *  For more information see the
     *  [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.autonomousDatabases).
     */
    inline def getAutonomousDatabasePlain(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetAutonomousDatabasePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.oracledatabase.outputs.GetAutonomousDatabaseResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetAutonomousDatabasePlainArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getAutonomousDatabasePlain(args(argsBuilder).build)

    /**
     * List all AutonomousDatabases.
     * 
     *  For more information see the
     *  [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.autonomousDatabases).
     */
    inline def getAutonomousDatabases(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetAutonomousDatabasesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.oracledatabase.outputs.GetAutonomousDatabasesResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetAutonomousDatabasesArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getAutonomousDatabases(args(argsBuilder).build)

    /**
     * List all AutonomousDatabases.
     * 
     *  For more information see the
     *  [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.autonomousDatabases).
     */
    inline def getAutonomousDatabasesPlain(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetAutonomousDatabasesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.oracledatabase.outputs.GetAutonomousDatabasesResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetAutonomousDatabasesPlainArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getAutonomousDatabasesPlain(args(argsBuilder).build)

    /**
     * Get information about an ExadataInfrastructure.
     * 
     *  For more information see the
     *  [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.cloudExadataInfrastructures).
     */
    inline def getCloudExadataInfrastructure(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetCloudExadataInfrastructureArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.oracledatabase.outputs.GetCloudExadataInfrastructureResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetCloudExadataInfrastructureArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getCloudExadataInfrastructure(args(argsBuilder).build)

    /**
     * Get information about an ExadataInfrastructure.
     * 
     *  For more information see the
     *  [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.cloudExadataInfrastructures).
     */
    inline def getCloudExadataInfrastructurePlain(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetCloudExadataInfrastructurePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.oracledatabase.outputs.GetCloudExadataInfrastructureResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetCloudExadataInfrastructurePlainArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getCloudExadataInfrastructurePlain(args(argsBuilder).build)

    /**
     * List all ExadataInfrastructures.
     * 
     *  For more information see the
     *  [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.cloudExadataInfrastructures).
     */
    inline def getCloudExadataInfrastructures(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetCloudExadataInfrastructuresArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.oracledatabase.outputs.GetCloudExadataInfrastructuresResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetCloudExadataInfrastructuresArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getCloudExadataInfrastructures(args(argsBuilder).build)

    /**
     * List all ExadataInfrastructures.
     * 
     *  For more information see the
     *  [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.cloudExadataInfrastructures).
     */
    inline def getCloudExadataInfrastructuresPlain(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetCloudExadataInfrastructuresPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.oracledatabase.outputs.GetCloudExadataInfrastructuresResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetCloudExadataInfrastructuresPlainArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getCloudExadataInfrastructuresPlain(args(argsBuilder).build)

    /**
     * Get information about a CloudVmCluster.
     * 
     *  For more information see the
     *  [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.cloudVmClusters).
     */
    inline def getCloudVmCluster(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetCloudVmClusterArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.oracledatabase.outputs.GetCloudVmClusterResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetCloudVmClusterArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getCloudVmCluster(args(argsBuilder).build)

    /**
     * Get information about a CloudVmCluster.
     * 
     *  For more information see the
     *  [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.cloudVmClusters).
     */
    inline def getCloudVmClusterPlain(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetCloudVmClusterPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.oracledatabase.outputs.GetCloudVmClusterResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetCloudVmClusterPlainArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getCloudVmClusterPlain(args(argsBuilder).build)

    /**
     * List all CloudVmClusters.
     * 
     *  For more information see the
     *  [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.cloudVmClusters).
     */
    inline def getCloudVmClusters(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetCloudVmClustersArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.oracledatabase.outputs.GetCloudVmClustersResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetCloudVmClustersArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getCloudVmClusters(args(argsBuilder).build)

    /**
     * List all CloudVmClusters.
     * 
     *  For more information see the
     *  [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.cloudVmClusters).
     */
    inline def getCloudVmClustersPlain(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetCloudVmClustersPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.oracledatabase.outputs.GetCloudVmClustersResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetCloudVmClustersPlainArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getCloudVmClustersPlain(args(argsBuilder).build)

    /**
     * List all DbNodes of a Cloud VmCluster.
     * 
     *  For more information see the
     *  [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.cloudVmClusters.dbNodes).
     */
    inline def getDbNodes(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetDbNodesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.oracledatabase.outputs.GetDbNodesResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetDbNodesArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getDbNodes(args(argsBuilder).build)

    /**
     * List all DbNodes of a Cloud VmCluster.
     * 
     *  For more information see the
     *  [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.cloudVmClusters.dbNodes).
     */
    inline def getDbNodesPlain(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetDbNodesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.oracledatabase.outputs.GetDbNodesResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetDbNodesPlainArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getDbNodesPlain(args(argsBuilder).build)

    /**
     * List all DbServers of a Cloud Exdata Infrastructure.
     * 
     *  For more information see the
     *  [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.cloudExadataInfrastructures.dbServers).
     */
    inline def getDbServers(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetDbServersArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.oracledatabase.outputs.GetDbServersResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetDbServersArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getDbServers(args(argsBuilder).build)

    /**
     * List all DbServers of a Cloud Exdata Infrastructure.
     * 
     *  For more information see the
     *  [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.cloudExadataInfrastructures.dbServers).
     */
    inline def getDbServersPlain(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetDbServersPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.oracledatabase.outputs.GetDbServersResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetDbServersPlainArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getDbServersPlain(args(argsBuilder).build)

    /**
     * Get information about an ODB Network.
     * 
     *  For more information see the
     *  [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.odbNetworks).
     */
    inline def getOdbNetwork(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetOdbNetworkArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.oracledatabase.outputs.GetOdbNetworkResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetOdbNetworkArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getOdbNetwork(args(argsBuilder).build)

    /**
     * Get information about an ODB Network.
     * 
     *  For more information see the
     *  [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.odbNetworks).
     */
    inline def getOdbNetworkPlain(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetOdbNetworkPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.oracledatabase.outputs.GetOdbNetworkResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetOdbNetworkPlainArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getOdbNetworkPlain(args(argsBuilder).build)

    /**
     * Get information about an ODB Subnet.
     * 
     *  For more information see the
     *  * [API documentation](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.odbNetworks.odbSubnets)
     */
    inline def getOdbSubnet(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetOdbSubnetArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.oracledatabase.outputs.GetOdbSubnetResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetOdbSubnetArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getOdbSubnet(args(argsBuilder).build)

    /**
     * Get information about an ODB Subnet.
     * 
     *  For more information see the
     *  * [API documentation](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.odbNetworks.odbSubnets)
     */
    inline def getOdbSubnetPlain(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetOdbSubnetPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.oracledatabase.outputs.GetOdbSubnetResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetOdbSubnetPlainArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getOdbSubnetPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.DbSystemArgs.Builder)
    /**
     * @param properties The properties of a DbSystem.
     *  Structure is documented below.
     * @return builder
     */
    def properties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.DbSystemArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  /**
   * An AutonomousDatabase resource.
   * 
   *  To get more information about AutonomousDatabase, see:
   * 
   *  * [API documentation](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.autonomousDatabases)
   *  * How-to Guides
   *      * [Create Autonomous databases](https://cloud.google.com/oracle/database/docs/create-databases)
   */
  def AutonomousDatabase(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.oracledatabase.AutonomousDatabaseArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.oracledatabase.AutonomousDatabaseArgs.builder
    com.pulumi.gcp.oracledatabase.AutonomousDatabase(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** An Exascale Storage Vault Resource */
  def ExascaleDbStorageVault(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.oracledatabase.ExascaleDbStorageVaultArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.oracledatabase.ExascaleDbStorageVaultArgs.builder
    com.pulumi.gcp.oracledatabase.ExascaleDbStorageVault(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * An OdbNetwork resource which represents a private network providing connectivity between OracleDatabase resources and Google Cloud VPC network.
   * 
   *  To get more information about OdbNetwork, see:
   *  * How-to Guides
   *      * [OracleDatabase{@literal @}Google Cloud](https://cloud.google.com/oracle/database/docs/overview&#39;)
   */
  def OdbNetwork(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.oracledatabase.OdbNetworkArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.oracledatabase.OdbNetworkArgs.builder
    com.pulumi.gcp.oracledatabase.OdbNetwork(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A CloudExadataInfrastructure resource.
   * 
   *  To get more information about CloudExadataInfrastructure, see:
   * 
   *  * [API documentation](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.cloudExadataInfrastructures)
   *  * How-to Guides
   *      * [Create Exadata Infrastructure instances](https://cloud.google.com/oracle/database/docs/create-instances)
   */
  def CloudExadataInfrastructure(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.oracledatabase.CloudExadataInfrastructureArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.oracledatabase.CloudExadataInfrastructureArgs.builder
    com.pulumi.gcp.oracledatabase.CloudExadataInfrastructure(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.AutonomousDatabaseArgs.Builder)
    /**
     * @param properties The properties of an Autonomous Database.
     *  Structure is documented below.
     * @return builder
     */
    def properties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.AutonomousDatabaseArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

    /**
     * @param sourceConfig The source Autonomous Database configuration for the standby Autonomous Database.
     *  Structure is documented below.
     * @return builder
     */
    def sourceConfig(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabaseSourceConfigArgs.Builder]):
        com.pulumi.gcp.oracledatabase.AutonomousDatabaseArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabaseSourceConfigArgs.builder
      builder.sourceConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.ExascaleDbStorageVaultArgs.Builder)
    /**
     * @param properties The properties of the ExascaleDbStorageVault.
     *  next ID: 12
     *  Structure is documented below.
     * @return builder
     */
    def properties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.ExascaleDbStorageVaultPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.ExascaleDbStorageVaultArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.ExascaleDbStorageVaultPropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  /**
   * A CloudVmCluster resource.
   * 
   *  To get more information about CloudVmCluster, see:
   * 
   *  * [API documentation](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.cloudVmClusters)
   *  * How-to Guides
   *      * [Create VM clusters](https://cloud.google.com/oracle/database/docs/create-clusters)
   */
  def CloudVmCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.oracledatabase.CloudVmClusterArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.oracledatabase.CloudVmClusterArgs.builder
    com.pulumi.gcp.oracledatabase.CloudVmCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.CloudExadataInfrastructureArgs.Builder)
    /**
     * @param properties Various properties of Exadata Infrastructure.
     *  Structure is documented below.
     * @return builder
     */
    def properties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.CloudExadataInfrastructurePropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.CloudExadataInfrastructureArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.CloudExadataInfrastructurePropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  /** Description */
  def ExadbVmCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.oracledatabase.ExadbVmClusterArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.oracledatabase.ExadbVmClusterArgs.builder
    com.pulumi.gcp.oracledatabase.ExadbVmCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeDatabasePropertiesDbBackupConfigArgs.Builder)
    /**
     * @param backupDestinationDetails Details of the database backup destinations.
     *  Structure is documented below.
     * @return builder
     */
    def backupDestinationDetails(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeDatabasePropertiesDbBackupConfigBackupDestinationDetailArgs.Builder]*):
        com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeDatabasePropertiesDbBackupConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeDatabasePropertiesDbBackupConfigBackupDestinationDetailArgs.builder
      builder.backupDestinationDetails(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.CloudVmClusterPropertiesArgs.Builder)
    /**
     * @param diagnosticsDataCollectionOptions Data collection options for diagnostics.
     *  Structure is documented below.
     * @return builder
     */
    def diagnosticsDataCollectionOptions(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.CloudVmClusterPropertiesDiagnosticsDataCollectionOptionsArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.CloudVmClusterPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.CloudVmClusterPropertiesDiagnosticsDataCollectionOptionsArgs.builder
      builder.diagnosticsDataCollectionOptions(args(argsBuilder).build)

    /**
     * @param timeZone Represents a time zone from the
     *  [IANA Time Zone Database](https://www.iana.org/time-zones).
     *  Structure is documented below.
     * @return builder
     */
    def timeZone(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.CloudVmClusterPropertiesTimeZoneArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.CloudVmClusterPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.CloudVmClusterPropertiesTimeZoneArgs.builder
      builder.timeZone(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.CloudExadataInfrastructureState.Builder)
    /**
     * @param properties Various properties of Exadata Infrastructure.
     *  Structure is documented below.
     * @return builder
     */
    def properties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.CloudExadataInfrastructurePropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.CloudExadataInfrastructureState.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.CloudExadataInfrastructurePropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeDatabaseArgs.Builder)
    /**
     * @param properties The properties of a Database.
     *  Structure is documented below.
     * @return builder
     */
    def properties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeDatabasePropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeDatabaseArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeDatabasePropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesArgs.Builder)
    /**
     * @param dataCollectionOptions Data collection options for DbSystem.
     *  Structure is documented below.
     * @return builder
     */
    def dataCollectionOptions(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDataCollectionOptionsArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDataCollectionOptionsArgs.builder
      builder.dataCollectionOptions(args(argsBuilder).build)

    /**
     * @param dbHome Details of the Database Home resource.
     *  Structure is documented below.
     * @return builder
     */
    def dbHome(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeArgs.builder
      builder.dbHome(args(argsBuilder).build)

    /**
     * @param dbSystemOptions Details of the DbSystem Options.
     *  Structure is documented below.
     * @return builder
     */
    def dbSystemOptions(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbSystemOptionsArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbSystemOptionsArgs.builder
      builder.dbSystemOptions(args(argsBuilder).build)

    /**
     * @param timeZone Represents a time zone from the
     *  [IANA Time Zone Database](https://www.iana.org/time-zones).
     *  Structure is documented below.
     * @return builder
     */
    def timeZone(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesTimeZoneArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesTimeZoneArgs.builder
      builder.timeZone(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.CloudVmClusterState.Builder)
    /**
     * @param properties Various properties and settings associated with Exadata VM cluster.
     *  Structure is documented below.
     * @return builder
     */
    def properties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.CloudVmClusterPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.CloudVmClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.CloudVmClusterPropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.ExadbVmClusterPropertiesArgs.Builder)
    /**
     * @param dataCollectionOptions Data collection options for diagnostics.
     *  https://docs.oracle.com/en-us/iaas/api/#/en/database/20160918/datatypes/DataCollectionOptions
     *  Structure is documented below.
     * @return builder
     */
    def dataCollectionOptions(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.ExadbVmClusterPropertiesDataCollectionOptionsArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.ExadbVmClusterPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.ExadbVmClusterPropertiesDataCollectionOptionsArgs.builder
      builder.dataCollectionOptions(args(argsBuilder).build)

    /**
     * @param timeZone Represents a time zone from the
     *  [IANA Time Zone Database](https://www.iana.org/time-zones).
     *  Structure is documented below.
     * @return builder
     */
    def timeZone(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.ExadbVmClusterPropertiesTimeZoneArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.ExadbVmClusterPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.ExadbVmClusterPropertiesTimeZoneArgs.builder
      builder.timeZone(args(argsBuilder).build)

    /**
     * @param vmFileSystemStorage The storage allocation for the exadbvmcluster, in gigabytes (GB).
     *  Structure is documented below.
     * @return builder
     */
    def vmFileSystemStorage(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.ExadbVmClusterPropertiesVmFileSystemStorageArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.ExadbVmClusterPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.ExadbVmClusterPropertiesVmFileSystemStorageArgs.builder
      builder.vmFileSystemStorage(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeDatabasePropertiesArgs.Builder)
    /**
     * @param databaseManagementConfig The configuration of the Database Management service.
     *  Structure is documented below.
     * @return builder
     */
    def databaseManagementConfig(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeDatabasePropertiesDatabaseManagementConfigArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeDatabasePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeDatabasePropertiesDatabaseManagementConfigArgs.builder
      builder.databaseManagementConfig(args(argsBuilder).build)

    /**
     * @param dbBackupConfig Backup Options for the Database.
     *  Structure is documented below.
     * @return builder
     */
    def dbBackupConfig(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeDatabasePropertiesDbBackupConfigArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeDatabasePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeDatabasePropertiesDbBackupConfigArgs.builder
      builder.dbBackupConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeArgs.Builder)
    /**
     * @param database Details of the Database resource.
     *  https://docs.oracle.com/en-us/iaas/api/#/en/database/20160918/Database/
     *  Structure is documented below.
     * @return builder
     */
    def database(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeDatabaseArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesDbHomeDatabaseArgs.builder
      builder.database(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.ExascaleDbStorageVaultPropertiesArgs.Builder)
    /**
     * @param exascaleDbStorageDetails The storage details of the ExascaleDbStorageVault.
     *  Structure is documented below.
     * @return builder
     */
    def exascaleDbStorageDetails(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.ExascaleDbStorageVaultPropertiesExascaleDbStorageDetailsArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.ExascaleDbStorageVaultPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.ExascaleDbStorageVaultPropertiesExascaleDbStorageDetailsArgs.builder
      builder.exascaleDbStorageDetails(args(argsBuilder).build)

    /**
     * @param timeZone Represents a time zone from the
     *  [IANA Time Zone Database](https://www.iana.org/time-zones).
     *  Structure is documented below.
     * @return builder
     */
    def timeZone(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.ExascaleDbStorageVaultPropertiesTimeZoneArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.ExascaleDbStorageVaultPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.ExascaleDbStorageVaultPropertiesTimeZoneArgs.builder
      builder.timeZone(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesArgs.Builder)
    /**
     * @param apexDetails (Output)
     *  Oracle APEX Application Development.
     *  https://docs.oracle.com/en-us/iaas/api/#/en/database/20160918/datatypes/AutonomousDatabaseApex
     *  Structure is documented below.
     * @return builder
     */
    def apexDetails(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesApexDetailArgs.Builder]*):
        com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesApexDetailArgs.builder
      builder.apexDetails(args.map(_(argsBuilder).build)*)

    /**
     * @param connectionStrings (Output)
     *  The connection string used to connect to the Autonomous Database.
     *  https://docs.oracle.com/en-us/iaas/api/#/en/database/20160918/datatypes/AutonomousDatabaseConnectionStrings
     *  Structure is documented below.
     * @return builder
     */
    def connectionStrings(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesConnectionStringArgs.Builder]*):
        com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesConnectionStringArgs.builder
      builder.connectionStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param connectionUrls (Output)
     *  The URLs for accessing Oracle Application Express (APEX) and SQL Developer
     *  Web with a browser from a Compute instance.
     *  https://docs.oracle.com/en-us/iaas/api/#/en/database/20160918/datatypes/AutonomousDatabaseConnectionUrls
     *  Structure is documented below.
     * @return builder
     */
    def connectionUrls(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesConnectionUrlArgs.Builder]*):
        com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesConnectionUrlArgs.builder
      builder.connectionUrls(args.map(_(argsBuilder).build)*)

    /**
     * @param customerContacts The list of customer contacts.
     *  Structure is documented below.
     * @return builder
     */
    def customerContacts(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesCustomerContactArgs.Builder]*):
        com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesCustomerContactArgs.builder
      builder.customerContacts(args.map(_(argsBuilder).build)*)

    /**
     * @param localStandbyDbs (Output)
     *  Autonomous Data Guard standby database details.
     *  https://docs.oracle.com/en-us/iaas/api/#/en/database/20160918/datatypes/AutonomousDatabaseStandbySummary
     *  Structure is documented below.
     * @return builder
     */
    def localStandbyDbs(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesLocalStandbyDbArgs.Builder]*):
        com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesLocalStandbyDbArgs.builder
      builder.localStandbyDbs(args.map(_(argsBuilder).build)*)

    /**
     * @param scheduledOperationDetails (Output)
     *  The list and details of the scheduled operations of the Autonomous
     *  Database.
     *  Structure is documented below.
     * @return builder
     */
    def scheduledOperationDetails(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesScheduledOperationDetailArgs.Builder]*):
        com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesScheduledOperationDetailArgs.builder
      builder.scheduledOperationDetails(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesScheduledOperationDetailArgs.Builder)
    /**
     * @param startTimes Represents a time of day. The date and time zone are either not significant
     *  or are specified elsewhere. An API may choose to allow leap seconds. Related
     *  types are google.type.Date and &#39;google.protobuf.Timestamp&#39;.
     * @return builder
     */
    def startTimes(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesScheduledOperationDetailStartTimeArgs.Builder]*):
        com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesScheduledOperationDetailArgs.Builder =
      def argsBuilder = com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesScheduledOperationDetailStartTimeArgs.builder
      builder.startTimes(args.map(_(argsBuilder).build)*)

    /**
     * @param stopTimes Represents a time of day. The date and time zone are either not significant
     *  or are specified elsewhere. An API may choose to allow leap seconds. Related
     *  types are google.type.Date and &#39;google.protobuf.Timestamp&#39;.
     * @return builder
     */
    def stopTimes(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesScheduledOperationDetailStopTimeArgs.Builder]*):
        com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesScheduledOperationDetailArgs.Builder =
      def argsBuilder = com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesScheduledOperationDetailStopTimeArgs.builder
      builder.stopTimes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabaseState.Builder)
    /**
     * @param properties The properties of an Autonomous Database.
     *  Structure is documented below.
     * @return builder
     */
    def properties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabaseState.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

    /**
     * @param sourceConfig The source Autonomous Database configuration for the standby Autonomous Database.
     *  Structure is documented below.
     * @return builder
     */
    def sourceConfig(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabaseSourceConfigArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabaseState.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabaseSourceConfigArgs.builder
      builder.sourceConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.CloudExadataInfrastructurePropertiesArgs.Builder)
    /**
     * @param customerContacts The list of customer contacts.
     *  Structure is documented below.
     * @return builder
     */
    def customerContacts(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.CloudExadataInfrastructurePropertiesCustomerContactArgs.Builder]*):
        com.pulumi.gcp.oracledatabase.inputs.CloudExadataInfrastructurePropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.oracledatabase.inputs.CloudExadataInfrastructurePropertiesCustomerContactArgs.builder
      builder.customerContacts(args.map(_(argsBuilder).build)*)

    /**
     * @param maintenanceWindow Maintenance window as defined by Oracle.
     *  https://docs.oracle.com/en-us/iaas/api/#/en/database/20160918/datatypes/MaintenanceWindow
     *  Structure is documented below.
     * @return builder
     */
    def maintenanceWindow(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.CloudExadataInfrastructurePropertiesMaintenanceWindowArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.CloudExadataInfrastructurePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.CloudExadataInfrastructurePropertiesMaintenanceWindowArgs.builder
      builder.maintenanceWindow(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.DbSystemState.Builder)
    /**
     * @param properties The properties of a DbSystem.
     *  Structure is documented below.
     * @return builder
     */
    def properties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.DbSystemState.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.DbSystemPropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesConnectionStringArgs.Builder)
    /**
     * @param allConnectionStrings A list of all connection strings that can be used to connect to the
     *  Autonomous Database.
     * @return builder
     */
    def allConnectionStrings(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesConnectionStringAllConnectionStringArgs.Builder]*):
        com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesConnectionStringArgs.Builder =
      def argsBuilder = com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesConnectionStringAllConnectionStringArgs.builder
      builder.allConnectionStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param profiles A list of connection string profiles to allow clients to group, filter, and
     *  select values based on the structured metadata.
     * @return builder
     */
    def profiles(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesConnectionStringProfileArgs.Builder]*):
        com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesConnectionStringArgs.Builder =
      def argsBuilder = com.pulumi.gcp.oracledatabase.inputs.AutonomousDatabasePropertiesConnectionStringProfileArgs.builder
      builder.profiles(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.ExadbVmClusterState.Builder)
    /**
     * @param properties The properties of an ExadbVmCluster.
     *  Structure is documented below.
     * @return builder
     */
    def properties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.ExadbVmClusterPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.ExadbVmClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.ExadbVmClusterPropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.oracledatabase.inputs.ExascaleDbStorageVaultState.Builder)
    /**
     * @param properties The properties of the ExascaleDbStorageVault.
     *  next ID: 12
     *  Structure is documented below.
     * @return builder
     */
    def properties(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.ExascaleDbStorageVaultPropertiesArgs.Builder]):
        com.pulumi.gcp.oracledatabase.inputs.ExascaleDbStorageVaultState.Builder =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.ExascaleDbStorageVaultPropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  /** A DbSystem Resource */
  def DbSystem(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.oracledatabase.DbSystemArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.oracledatabase.DbSystemArgs.builder
    com.pulumi.gcp.oracledatabase.DbSystem(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
