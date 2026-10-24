package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object oracledatabase:
  /**
   * An AutonomousDatabase resource.
   * 
   * To get more information about AutonomousDatabase, see:
   * 
   * * [API documentation](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.autonomousDatabases)
   * * How-to Guides
   *     * [Create Autonomous databases](https://cloud.google.com/oracle/database/docs/create-databases)
   */
  def AutonomousDatabase(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.oracledatabase.AutonomousDatabaseArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.oracledatabase.AutonomousDatabaseArgs.builder
    com.pulumi.gcp.oracledatabase.AutonomousDatabase(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A CloudExadataInfrastructure resource.
   * 
   * To get more information about CloudExadataInfrastructure, see:
   * 
   * * [API documentation](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.cloudExadataInfrastructures)
   * * How-to Guides
   *     * [Create Exadata Infrastructure instances](https://cloud.google.com/oracle/database/docs/create-instances)
   */
  def CloudExadataInfrastructure(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.oracledatabase.CloudExadataInfrastructureArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.oracledatabase.CloudExadataInfrastructureArgs.builder
    com.pulumi.gcp.oracledatabase.CloudExadataInfrastructure(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A resource to configure Exascale storage on an Oracle Cloud Exadata Infrastructure.
   * 
   * &gt; **Note:** Oracle Database {@literal @} Google Cloud does not support deconfiguring Exascale storage on an Exadata Infrastructure.
   * Deleting this resource from Terraform state will only remove it from Terraform management; it will not delete or reset the Exascale configuration on the actual Exadata Infrastructure.
   */
  def CloudExadataInfrastructureExascaleConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.oracledatabase.CloudExadataInfrastructureExascaleConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.oracledatabase.CloudExadataInfrastructureExascaleConfigArgs.builder
    com.pulumi.gcp.oracledatabase.CloudExadataInfrastructureExascaleConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A CloudVmCluster resource.
   * 
   * To get more information about CloudVmCluster, see:
   * 
   * * [API documentation](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.cloudVmClusters)
   * * How-to Guides
   *     * [Create VM clusters](https://cloud.google.com/oracle/database/docs/create-clusters)
   */
  def CloudVmCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.oracledatabase.CloudVmClusterArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.oracledatabase.CloudVmClusterArgs.builder
    com.pulumi.gcp.oracledatabase.CloudVmCluster(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** A DbSystem Resource */
  def DbSystem(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.oracledatabase.DbSystemArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.oracledatabase.DbSystemArgs.builder
    com.pulumi.gcp.oracledatabase.DbSystem(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Description */
  def ExadbVmCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.oracledatabase.ExadbVmClusterArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.oracledatabase.ExadbVmClusterArgs.builder
    com.pulumi.gcp.oracledatabase.ExadbVmCluster(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** An Exascale Storage Vault Resource */
  def ExascaleDbStorageVault(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.oracledatabase.ExascaleDbStorageVaultArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.oracledatabase.ExascaleDbStorageVaultArgs.builder
    com.pulumi.gcp.oracledatabase.ExascaleDbStorageVault(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** GoldengateConnection is a resource that represents metadata to establish a connection to a source or target data. */
  def GoldengateConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.oracledatabase.GoldengateConnectionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.oracledatabase.GoldengateConnectionArgs.builder
    com.pulumi.gcp.oracledatabase.GoldengateConnection(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** This resource helps to assign a GoldengateConnection to a GoldengateDeployment used for actual data replication and transformations. */
  def GoldengateConnectionAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.oracledatabase.GoldengateConnectionAssignmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.oracledatabase.GoldengateConnectionAssignmentArgs.builder
    com.pulumi.gcp.oracledatabase.GoldengateConnectionAssignment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** This resource helps to create a GoldengateDeployment which enables running Oracle GoldenGate in Google Cloud. */
  def GoldengateDeployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.oracledatabase.GoldengateDeploymentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.oracledatabase.GoldengateDeploymentArgs.builder
    com.pulumi.gcp.oracledatabase.GoldengateDeployment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * An OdbNetwork resource which represents a private network providing connectivity between OracleDatabase resources and Google Cloud VPC network.
   * 
   * To get more information about OdbNetwork, see:
   * * How-to Guides
   *     * [OracleDatabase{@literal @}Google Cloud](https://cloud.google.com/oracle/database/docs/overview&#39;)
   */
  def OdbNetwork(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.oracledatabase.OdbNetworkArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.oracledatabase.OdbNetworkArgs.builder
    com.pulumi.gcp.oracledatabase.OdbNetwork(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * An OdbSubnet resource which represents a subnet under an OdbNetwork.
   * 
   * To get more information about OdbSubnet, see:
   * * How-to Guides
   *     * [OracleDatabase{@literal @}Google Cloud](https://cloud.google.com/oracle/database/docs/overview&#39;)
   */
  def OdbSubnet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.oracledatabase.OdbSubnetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.oracledatabase.OdbSubnetArgs.builder
    com.pulumi.gcp.oracledatabase.OdbSubnet(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object OracledatabaseFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Get information about an AutonomousDatabase.
     * 
     * For more information see the
     * [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.autonomousDatabases).
     */
    inline def getAutonomousDatabase(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetAutonomousDatabaseArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.oracledatabase.outputs.GetAutonomousDatabaseResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetAutonomousDatabaseArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getAutonomousDatabase(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Get information about an AutonomousDatabase.
     * 
     * For more information see the
     * [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.autonomousDatabases).
     */
    inline def getAutonomousDatabasePlain(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetAutonomousDatabasePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.oracledatabase.outputs.GetAutonomousDatabaseResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetAutonomousDatabasePlainArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getAutonomousDatabasePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * List all AutonomousDatabases.
     * 
     * For more information see the
     * [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.autonomousDatabases).
     */
    inline def getAutonomousDatabases(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetAutonomousDatabasesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.oracledatabase.outputs.GetAutonomousDatabasesResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetAutonomousDatabasesArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getAutonomousDatabases(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * List all AutonomousDatabases.
     * 
     * For more information see the
     * [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.autonomousDatabases).
     */
    inline def getAutonomousDatabasesPlain(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetAutonomousDatabasesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.oracledatabase.outputs.GetAutonomousDatabasesResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetAutonomousDatabasesPlainArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getAutonomousDatabasesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Get information about an ExadataInfrastructure.
     * 
     * For more information see the
     * [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.cloudExadataInfrastructures).
     */
    inline def getCloudExadataInfrastructure(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetCloudExadataInfrastructureArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.oracledatabase.outputs.GetCloudExadataInfrastructureResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetCloudExadataInfrastructureArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getCloudExadataInfrastructure(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Get information about an ExadataInfrastructure.
     * 
     * For more information see the
     * [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.cloudExadataInfrastructures).
     */
    inline def getCloudExadataInfrastructurePlain(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetCloudExadataInfrastructurePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.oracledatabase.outputs.GetCloudExadataInfrastructureResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetCloudExadataInfrastructurePlainArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getCloudExadataInfrastructurePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * List all ExadataInfrastructures.
     * 
     * For more information see the
     * [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.cloudExadataInfrastructures).
     */
    inline def getCloudExadataInfrastructures(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetCloudExadataInfrastructuresArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.oracledatabase.outputs.GetCloudExadataInfrastructuresResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetCloudExadataInfrastructuresArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getCloudExadataInfrastructures(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * List all ExadataInfrastructures.
     * 
     * For more information see the
     * [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.cloudExadataInfrastructures).
     */
    inline def getCloudExadataInfrastructuresPlain(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetCloudExadataInfrastructuresPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.oracledatabase.outputs.GetCloudExadataInfrastructuresResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetCloudExadataInfrastructuresPlainArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getCloudExadataInfrastructuresPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Get information about a CloudVmCluster.
     * 
     * For more information see the
     * [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.cloudVmClusters).
     */
    inline def getCloudVmCluster(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetCloudVmClusterArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.oracledatabase.outputs.GetCloudVmClusterResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetCloudVmClusterArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getCloudVmCluster(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Get information about a CloudVmCluster.
     * 
     * For more information see the
     * [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.cloudVmClusters).
     */
    inline def getCloudVmClusterPlain(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetCloudVmClusterPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.oracledatabase.outputs.GetCloudVmClusterResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetCloudVmClusterPlainArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getCloudVmClusterPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * List all CloudVmClusters.
     * 
     * For more information see the
     * [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.cloudVmClusters).
     */
    inline def getCloudVmClusters(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetCloudVmClustersArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.oracledatabase.outputs.GetCloudVmClustersResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetCloudVmClustersArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getCloudVmClusters(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * List all CloudVmClusters.
     * 
     * For more information see the
     * [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.cloudVmClusters).
     */
    inline def getCloudVmClustersPlain(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetCloudVmClustersPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.oracledatabase.outputs.GetCloudVmClustersResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetCloudVmClustersPlainArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getCloudVmClustersPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * List all DbNodes of a Cloud VmCluster.
     * 
     * For more information see the
     * [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.cloudVmClusters.dbNodes).
     */
    inline def getDbNodes(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetDbNodesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.oracledatabase.outputs.GetDbNodesResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetDbNodesArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getDbNodes(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * List all DbNodes of a Cloud VmCluster.
     * 
     * For more information see the
     * [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.cloudVmClusters.dbNodes).
     */
    inline def getDbNodesPlain(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetDbNodesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.oracledatabase.outputs.GetDbNodesResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetDbNodesPlainArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getDbNodesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * List all DbServers of a Cloud Exdata Infrastructure.
     * 
     * For more information see the
     * [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.cloudExadataInfrastructures.dbServers).
     */
    inline def getDbServers(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetDbServersArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.oracledatabase.outputs.GetDbServersResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetDbServersArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getDbServers(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * List all DbServers of a Cloud Exdata Infrastructure.
     * 
     * For more information see the
     * [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.cloudExadataInfrastructures.dbServers).
     */
    inline def getDbServersPlain(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetDbServersPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.oracledatabase.outputs.GetDbServersResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetDbServersPlainArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getDbServersPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Get information about an ExascaleDbStorageVault.
     * 
     * For more information see the
     * [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.exascaleDbStorageVaults).
     */
    inline def getExascaleDbStorageVault(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetExascaleDbStorageVaultArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.oracledatabase.outputs.GetExascaleDbStorageVaultResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetExascaleDbStorageVaultArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getExascaleDbStorageVault(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Get information about an ExascaleDbStorageVault.
     * 
     * For more information see the
     * [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.exascaleDbStorageVaults).
     */
    inline def getExascaleDbStorageVaultPlain(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetExascaleDbStorageVaultPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.oracledatabase.outputs.GetExascaleDbStorageVaultResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetExascaleDbStorageVaultPlainArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getExascaleDbStorageVaultPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * List all ExascaleDbStorageVaults.
     * 
     * For more information see the
     * [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.exascaleDbStorageVaults).
     */
    inline def getExascaleDbStorageVaults(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetExascaleDbStorageVaultsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.oracledatabase.outputs.GetExascaleDbStorageVaultsResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetExascaleDbStorageVaultsArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getExascaleDbStorageVaults(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * List all ExascaleDbStorageVaults.
     * 
     * For more information see the
     * [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.exascaleDbStorageVaults).
     */
    inline def getExascaleDbStorageVaultsPlain(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetExascaleDbStorageVaultsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.oracledatabase.outputs.GetExascaleDbStorageVaultsResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetExascaleDbStorageVaultsPlainArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getExascaleDbStorageVaultsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * List all GoldenGate Connection Types in a location.
     * 
     * For more information see the
     * [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.goldengateConnectionTypes).
     */
    inline def getGoldengateConnectionTypes(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetGoldengateConnectionTypesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.oracledatabase.outputs.GetGoldengateConnectionTypesResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetGoldengateConnectionTypesArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getGoldengateConnectionTypes(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * List all GoldenGate Connection Types in a location.
     * 
     * For more information see the
     * [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.goldengateConnectionTypes).
     */
    inline def getGoldengateConnectionTypesPlain(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetGoldengateConnectionTypesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.oracledatabase.outputs.GetGoldengateConnectionTypesResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetGoldengateConnectionTypesPlainArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getGoldengateConnectionTypesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * List all GoldenGate Deployment Environments in a location.
     * 
     * For more information see the
     * [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.goldengateDeploymentEnvironments).
     */
    inline def getGoldengateDeploymentEnvironments(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetGoldengateDeploymentEnvironmentsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.oracledatabase.outputs.GetGoldengateDeploymentEnvironmentsResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetGoldengateDeploymentEnvironmentsArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getGoldengateDeploymentEnvironments(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * List all GoldenGate Deployment Environments in a location.
     * 
     * For more information see the
     * [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.goldengateDeploymentEnvironments).
     */
    inline def getGoldengateDeploymentEnvironmentsPlain(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetGoldengateDeploymentEnvironmentsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.oracledatabase.outputs.GetGoldengateDeploymentEnvironmentsResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetGoldengateDeploymentEnvironmentsPlainArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getGoldengateDeploymentEnvironmentsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * List all GoldenGate Deployment Types in a location.
     * 
     * For more information see the
     * [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.goldengateDeploymentTypes).
     */
    inline def getGoldengateDeploymentTypes(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetGoldengateDeploymentTypesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.oracledatabase.outputs.GetGoldengateDeploymentTypesResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetGoldengateDeploymentTypesArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getGoldengateDeploymentTypes(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * List all GoldenGate Deployment Types in a location.
     * 
     * For more information see the
     * [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.goldengateDeploymentTypes).
     */
    inline def getGoldengateDeploymentTypesPlain(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetGoldengateDeploymentTypesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.oracledatabase.outputs.GetGoldengateDeploymentTypesResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetGoldengateDeploymentTypesPlainArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getGoldengateDeploymentTypesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * List all Goldengate Deployment Versions in a location.
     * 
     * For more information see the
     * [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.goldengateDeploymentVersions).
     */
    inline def getGoldengateDeploymentVersions(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetGoldengateDeploymentVersionsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.oracledatabase.outputs.GetGoldengateDeploymentVersionsResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetGoldengateDeploymentVersionsArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getGoldengateDeploymentVersions(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * List all Goldengate Deployment Versions in a location.
     * 
     * For more information see the
     * [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.goldengateDeploymentVersions).
     */
    inline def getGoldengateDeploymentVersionsPlain(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetGoldengateDeploymentVersionsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.oracledatabase.outputs.GetGoldengateDeploymentVersionsResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetGoldengateDeploymentVersionsPlainArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getGoldengateDeploymentVersionsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Get information about an ODB Network.
     * 
     * For more information see the
     * [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.odbNetworks).
     */
    inline def getOdbNetwork(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetOdbNetworkArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.oracledatabase.outputs.GetOdbNetworkResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetOdbNetworkArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getOdbNetwork(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Get information about an ODB Network.
     * 
     * For more information see the
     * [API](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.odbNetworks).
     */
    inline def getOdbNetworkPlain(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetOdbNetworkPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.oracledatabase.outputs.GetOdbNetworkResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetOdbNetworkPlainArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getOdbNetworkPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Get information about an ODB Subnet.
     * 
     * For more information see the
     * * [API documentation](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.odbNetworks.odbSubnets)
     */
    inline def getOdbSubnet(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetOdbSubnetArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.oracledatabase.outputs.GetOdbSubnetResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetOdbSubnetArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getOdbSubnet(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Get information about an ODB Subnet.
     * 
     * For more information see the
     * * [API documentation](https://cloud.google.com/oracle/database/docs/reference/rest/v1/projects.locations.odbNetworks.odbSubnets)
     */
    inline def getOdbSubnetPlain(args: Endofunction[com.pulumi.gcp.oracledatabase.inputs.GetOdbSubnetPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.oracledatabase.outputs.GetOdbSubnetResult] =
      val argsBuilder = com.pulumi.gcp.oracledatabase.inputs.GetOdbSubnetPlainArgs.builder
      com.pulumi.gcp.oracledatabase.OracledatabaseFunctions.getOdbSubnetPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
