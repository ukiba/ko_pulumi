package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object odb:
  type OdbFunctions = com.pulumi.aws.odb.OdbFunctions
  object OdbFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.odb.OdbFunctions.*
  extension (self: OdbFunctions.type)
    /**
     * Data source for managing cloud autonomous vm cluster resource in AWS for Oracle Database{@literal @}AWS.
     *  
     *  You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    def getCloudAutonomousVmCluster(args: Endofunction[com.pulumi.aws.odb.inputs.GetCloudAutonomousVmClusterArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetCloudAutonomousVmClusterResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetCloudAutonomousVmClusterArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getCloudAutonomousVmCluster(args(argsBuilder).build)

    /**
     * Data source for managing cloud autonomous vm cluster resource in AWS for Oracle Database{@literal @}AWS.
     *  
     *  You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    def getCloudAutonomousVmClusterPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetCloudAutonomousVmClusterPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetCloudAutonomousVmClusterResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetCloudAutonomousVmClusterPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getCloudAutonomousVmClusterPlain(args(argsBuilder).build)

    /**
     * Data source for managing cloud autonomous vm clusters in AWS for Oracle Database{@literal @}AWS.
     *  
     *  You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    def getCloudAutonomousVmClusters(args: Endofunction[com.pulumi.aws.odb.inputs.GetCloudAutonomousVmClustersArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetCloudAutonomousVmClustersResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetCloudAutonomousVmClustersArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getCloudAutonomousVmClusters(args(argsBuilder).build)

    /**
     * Data source for managing cloud autonomous vm clusters in AWS for Oracle Database{@literal @}AWS.
     *  
     *  You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    def getCloudAutonomousVmClustersPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetCloudAutonomousVmClustersPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetCloudAutonomousVmClustersResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetCloudAutonomousVmClustersPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getCloudAutonomousVmClustersPlain(args(argsBuilder).build)

    /**
     * Data source for exadata infrastructure resource in AWS for Oracle Database{@literal @}AWS.
     *  
     *  You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    def getCloudExadataInfrastructure(args: Endofunction[com.pulumi.aws.odb.inputs.GetCloudExadataInfrastructureArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetCloudExadataInfrastructureResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetCloudExadataInfrastructureArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getCloudExadataInfrastructure(args(argsBuilder).build)

    /**
     * Data source for exadata infrastructure resource in AWS for Oracle Database{@literal @}AWS.
     *  
     *  You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    def getCloudExadataInfrastructurePlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetCloudExadataInfrastructurePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetCloudExadataInfrastructureResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetCloudExadataInfrastructurePlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getCloudExadataInfrastructurePlain(args(argsBuilder).build)

    /**
     * Data source for exadata infrastructures in AWS for Oracle Database{@literal @}AWS.
     *  
     *  You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    def getCloudExadataInfrastructures(args: Endofunction[com.pulumi.aws.odb.inputs.GetCloudExadataInfrastructuresArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetCloudExadataInfrastructuresResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetCloudExadataInfrastructuresArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getCloudExadataInfrastructures(args(argsBuilder).build)

    /**
     * Data source for exadata infrastructures in AWS for Oracle Database{@literal @}AWS.
     *  
     *  You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    def getCloudExadataInfrastructuresPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetCloudExadataInfrastructuresPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetCloudExadataInfrastructuresResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetCloudExadataInfrastructuresPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getCloudExadataInfrastructuresPlain(args(argsBuilder).build)

    /**
     * Data source for cloud vm cluster in AWS for Oracle Database{@literal @}AWS.
     *  
     *  You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    def getCloudVmCluster(args: Endofunction[com.pulumi.aws.odb.inputs.GetCloudVmClusterArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetCloudVmClusterResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetCloudVmClusterArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getCloudVmCluster(args(argsBuilder).build)

    /**
     * Data source for cloud vm cluster in AWS for Oracle Database{@literal @}AWS.
     *  
     *  You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    def getCloudVmClusterPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetCloudVmClusterPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetCloudVmClusterResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetCloudVmClusterPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getCloudVmClusterPlain(args(argsBuilder).build)

    /**
     * Data source for retrieving all cloud vm clusters AWS for Oracle Database{@literal @}AWS.
     *  
     *  You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    def getCloudVmClusters(args: Endofunction[com.pulumi.aws.odb.inputs.GetCloudVmClustersArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetCloudVmClustersResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetCloudVmClustersArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getCloudVmClusters(args(argsBuilder).build)

    /**
     * Data source for retrieving all cloud vm clusters AWS for Oracle Database{@literal @}AWS.
     *  
     *  You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    def getCloudVmClustersPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetCloudVmClustersPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetCloudVmClustersResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetCloudVmClustersPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getCloudVmClustersPlain(args(argsBuilder).build)

    /**
     * Data source for manging db nodes linked to cloud vm cluster of Oracle Database{@literal @}AWS.
     *  
     *  You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    def getDbNode(args: Endofunction[com.pulumi.aws.odb.inputs.GetDbNodeArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetDbNodeResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetDbNodeArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getDbNode(args(argsBuilder).build)

    /**
     * Data source for manging db nodes linked to cloud vm cluster of Oracle Database{@literal @}AWS.
     *  
     *  You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    def getDbNodePlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetDbNodePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetDbNodeResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetDbNodePlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getDbNodePlain(args(argsBuilder).build)

    /**
     * Data source for manging db nodes linked to cloud vm cluster of Oracle Database{@literal @}AWS.
     *  
     *  You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    def getDbNodes(args: Endofunction[com.pulumi.aws.odb.inputs.GetDbNodesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetDbNodesResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetDbNodesArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getDbNodes(args(argsBuilder).build)

    /**
     * Data source for manging db nodes linked to cloud vm cluster of Oracle Database{@literal @}AWS.
     *  
     *  You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    def getDbNodesPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetDbNodesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetDbNodesResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetDbNodesPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getDbNodesPlain(args(argsBuilder).build)

    /**
     * Data source for manging db server linked to exadata infrastructure of Oracle Database{@literal @}AWS.
     *  
     *  You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    def getDbServer(args: Endofunction[com.pulumi.aws.odb.inputs.GetDbServerArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetDbServerResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetDbServerArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getDbServer(args(argsBuilder).build)

    /**
     * Data source for manging db server linked to exadata infrastructure of Oracle Database{@literal @}AWS.
     *  
     *  You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    def getDbServerPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetDbServerPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetDbServerResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetDbServerPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getDbServerPlain(args(argsBuilder).build)

    /**
     * Data source for manging db servers linked to exadata infrastructure of Oracle Database{@literal @}AWS.
     *  
     *  You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    def getDbServers(args: Endofunction[com.pulumi.aws.odb.inputs.GetDbServersArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetDbServersResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetDbServersArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getDbServers(args(argsBuilder).build)

    /**
     * Data source for manging db servers linked to exadata infrastructure of Oracle Database{@literal @}AWS.
     *  
     *  You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    def getDbServersPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetDbServersPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetDbServersResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetDbServersPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getDbServersPlain(args(argsBuilder).build)

    /**
     * Data source to retrieve available system shapes Oracle Database{@literal @}AWS.
     *  
     *  You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    def getDbSystemShapes(args: Endofunction[com.pulumi.aws.odb.inputs.GetDbSystemShapesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetDbSystemShapesResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetDbSystemShapesArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getDbSystemShapes(args(argsBuilder).build)

    /**
     * Data source to retrieve available system shapes Oracle Database{@literal @}AWS.
     *  
     *  You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    def getDbSystemShapesPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetDbSystemShapesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetDbSystemShapesResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetDbSystemShapesPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getDbSystemShapesPlain(args(argsBuilder).build)

    /**
     * Data source to retrieve available Grid Infrastructure versions of Oracle Database{@literal @}AWS.
     *  
     *  You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    def getGiVersions(args: Endofunction[com.pulumi.aws.odb.inputs.GetGiVersionsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetGiVersionsResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetGiVersionsArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getGiVersions(args(argsBuilder).build)

    /**
     * Data source to retrieve available Grid Infrastructure versions of Oracle Database{@literal @}AWS.
     *  
     *  You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    def getGiVersionsPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetGiVersionsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetGiVersionsResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetGiVersionsPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getGiVersionsPlain(args(argsBuilder).build)

    /** Data source for to retrieve network resource in AWS for Oracle Database{@literal @}AWS. */
    def getNetwork(args: Endofunction[com.pulumi.aws.odb.inputs.GetNetworkArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetNetworkResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetNetworkArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getNetwork(args(argsBuilder).build)

    /** Data source for to retrieve network resource in AWS for Oracle Database{@literal @}AWS. */
    def getNetworkPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetNetworkPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetNetworkResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetNetworkPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getNetworkPlain(args(argsBuilder).build)

    /**
     * Data source for managing oracle database network peering resource in AWS.
     *  
     *  You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    def getNetworkPeeringConnection(args: Endofunction[com.pulumi.aws.odb.inputs.GetNetworkPeeringConnectionArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetNetworkPeeringConnectionResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetNetworkPeeringConnectionArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getNetworkPeeringConnection(args(argsBuilder).build)

    /**
     * Data source for managing oracle database network peering resource in AWS.
     *  
     *  You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    def getNetworkPeeringConnectionPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetNetworkPeeringConnectionPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetNetworkPeeringConnectionResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetNetworkPeeringConnectionPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getNetworkPeeringConnectionPlain(args(argsBuilder).build)

    /**
     * Data source for retrieving all oracle database network peering resource in Oracle Database{@literal @}AWS.
     *  
     *  You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    def getNetworkPeeringConnections(args: Endofunction[com.pulumi.aws.odb.inputs.GetNetworkPeeringConnectionsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetNetworkPeeringConnectionsResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetNetworkPeeringConnectionsArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getNetworkPeeringConnections(args(argsBuilder).build)

    /**
     * Data source for retrieving all oracle database network peering resource in Oracle Database{@literal @}AWS.
     *  
     *  You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    def getNetworkPeeringConnectionsPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetNetworkPeeringConnectionsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetNetworkPeeringConnectionsResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetNetworkPeeringConnectionsPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getNetworkPeeringConnectionsPlain(args(argsBuilder).build)

    /** Data source for to retrieve networks from AWS for Oracle Database{@literal @}AWS. */
    def getNetworks(args: Endofunction[com.pulumi.aws.odb.inputs.GetNetworksArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetNetworksResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetNetworksArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getNetworks(args(argsBuilder).build)

    /** Data source for to retrieve networks from AWS for Oracle Database{@literal @}AWS. */
    def getNetworksPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetNetworksPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetNetworksResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetNetworksPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getNetworksPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.odb.CloudAutonomousVmClusterArgs.Builder)
    /**
     * @param maintenanceWindow The maintenance window of the Autonomous VM cluster. Changing this will force terraform to create new resource.
     *  
     *  The following arguments are optional:
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

  extension (builder: com.pulumi.aws.odb.CloudVmClusterArgs.Builder)
    /**
     * @param dataCollectionOptions The set of preferences for the various diagnostic collection options for the VM cluster.
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

  /** Resource for managing odb Network resource in AWS for Oracle Database{@literal @}AWS. */
  def Network(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.odb.NetworkArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.odb.NetworkArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.odb.Network(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Resource managing cloud autonomous vm cluster in AWS for Oracle Database{@literal @}AWS.
   *  
   *  You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
   */
  def CloudAutonomousVmCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.odb.CloudAutonomousVmClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.odb.CloudAutonomousVmClusterArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.odb.CloudAutonomousVmCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Terraform  resource for managing oracle database network peering resource in AWS. If underlying odb network is shared, ARN must be used while creating network peering.
   *  
   *  You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
   */
  def NetworkPeeringConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.odb.NetworkPeeringConnectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.odb.NetworkPeeringConnectionArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.odb.NetworkPeeringConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing exadata infrastructure resource in AWS for Oracle Database{@literal @}AWS. */
  def CloudExadataInfrastructure(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.odb.CloudExadataInfrastructureArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.odb.CloudExadataInfrastructureArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.odb.CloudExadataInfrastructure(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Terraform to manage cloud vm cluster resource in AWS for Oracle Database{@literal @}AWS. If underlying odb network and cloud exadata infrastructure is shared, ARN must be used while creating VM cluster.
   *  
   *  You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
   */
  def CloudVmCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.odb.CloudVmClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.odb.CloudVmClusterArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.odb.CloudVmCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.odb.CloudExadataInfrastructureArgs.Builder)
    /**
     * @param customerContactsToSendToOcis The email addresses of contacts to receive notification from Oracle about maintenance updates for the Exadata infrastructure. Changing this will force terraform to create new resource.
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

  extension (builder: com.pulumi.aws.odb.NetworkPeeringConnectionArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.odb.inputs.NetworkPeeringConnectionTimeoutsArgs.Builder]):
        com.pulumi.aws.odb.NetworkPeeringConnectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.NetworkPeeringConnectionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.odb.NetworkArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.odb.inputs.NetworkTimeoutsArgs.Builder]):
        com.pulumi.aws.odb.NetworkArgs.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.NetworkTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.odb.inputs.NetworkPeeringConnectionState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.odb.inputs.NetworkPeeringConnectionTimeoutsArgs.Builder]):
        com.pulumi.aws.odb.inputs.NetworkPeeringConnectionState.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.NetworkPeeringConnectionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.odb.inputs.CloudExadataInfrastructureMaintenanceWindowArgs.Builder)
    /**
     * @param daysOfWeeks The days of the week when maintenance can be performed.
     * @return builder
     */
    def daysOfWeeks(args: Endofunction[com.pulumi.aws.odb.inputs.CloudExadataInfrastructureMaintenanceWindowDaysOfWeekArgs.Builder]*):
        com.pulumi.aws.odb.inputs.CloudExadataInfrastructureMaintenanceWindowArgs.Builder =
      def argsBuilder = com.pulumi.aws.odb.inputs.CloudExadataInfrastructureMaintenanceWindowDaysOfWeekArgs.builder
      builder.daysOfWeeks(args.map(_(argsBuilder).build)*)

    /**
     * @param months The months when maintenance can be performed.
     * @return builder
     */
    def months(args: Endofunction[com.pulumi.aws.odb.inputs.CloudExadataInfrastructureMaintenanceWindowMonthArgs.Builder]*):
        com.pulumi.aws.odb.inputs.CloudExadataInfrastructureMaintenanceWindowArgs.Builder =
      def argsBuilder = com.pulumi.aws.odb.inputs.CloudExadataInfrastructureMaintenanceWindowMonthArgs.builder
      builder.months(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.odb.inputs.CloudExadataInfrastructureState.Builder)
    /**
     * @param customerContactsToSendToOcis The email addresses of contacts to receive notification from Oracle about maintenance updates for the Exadata infrastructure. Changing this will force terraform to create new resource.
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

  extension (builder: com.pulumi.aws.odb.inputs.CloudAutonomousVmClusterState.Builder)
    /**
     * @param maintenanceWindow The maintenance window of the Autonomous VM cluster. Changing this will force terraform to create new resource.
     *  
     *  The following arguments are optional:
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

  extension (builder: com.pulumi.aws.odb.inputs.CloudAutonomousVmClusterMaintenanceWindowArgs.Builder)
    /**
     * @param daysOfWeeks The days of the week when maintenance can be performed. Changing this will force terraform to create new resource.
     * @return builder
     */
    def daysOfWeeks(args: Endofunction[com.pulumi.aws.odb.inputs.CloudAutonomousVmClusterMaintenanceWindowDaysOfWeekArgs.Builder]*):
        com.pulumi.aws.odb.inputs.CloudAutonomousVmClusterMaintenanceWindowArgs.Builder =
      def argsBuilder = com.pulumi.aws.odb.inputs.CloudAutonomousVmClusterMaintenanceWindowDaysOfWeekArgs.builder
      builder.daysOfWeeks(args.map(_(argsBuilder).build)*)

    /**
     * @param months The months when maintenance can be performed. Changing this will force terraform to create new resource.
     * @return builder
     */
    def months(args: Endofunction[com.pulumi.aws.odb.inputs.CloudAutonomousVmClusterMaintenanceWindowMonthArgs.Builder]*):
        com.pulumi.aws.odb.inputs.CloudAutonomousVmClusterMaintenanceWindowArgs.Builder =
      def argsBuilder = com.pulumi.aws.odb.inputs.CloudAutonomousVmClusterMaintenanceWindowMonthArgs.builder
      builder.months(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.odb.inputs.CloudVmClusterState.Builder)
    /**
     * @param dataCollectionOptions The set of preferences for the various diagnostic collection options for the VM cluster.
     * @return builder
     */
    def dataCollectionOptions(args: Endofunction[com.pulumi.aws.odb.inputs.CloudVmClusterDataCollectionOptionsArgs.Builder]):
        com.pulumi.aws.odb.inputs.CloudVmClusterState.Builder =
      val argsBuilder = com.pulumi.aws.odb.inputs.CloudVmClusterDataCollectionOptionsArgs.builder
      builder.dataCollectionOptions(args(argsBuilder).build)

    /**
     * @param iormConfigCaches The Exadata IORM (I/O Resource Manager) configuration cache details for the VM cluster.
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

  extension (builder: com.pulumi.aws.odb.inputs.NetworkState.Builder)
    /**
     * @param managedServices The name of the OCI resource anchor for the Exadata infrastructure.
     * @return builder
     */
    def managedServices(args: Endofunction[com.pulumi.aws.odb.inputs.NetworkManagedServiceArgs.Builder]*):
        com.pulumi.aws.odb.inputs.NetworkState.Builder =
      def argsBuilder = com.pulumi.aws.odb.inputs.NetworkManagedServiceArgs.builder
      builder.managedServices(args.map(_(argsBuilder).build)*)

    /**
     * @param ociDnsForwardingConfigs The number of storage servers requested for the Exadata infrastructure.
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

  extension (builder: com.pulumi.aws.odb.inputs.CloudVmClusterIormConfigCacheArgs.Builder)
    def dbPlans(args: Endofunction[com.pulumi.aws.odb.inputs.CloudVmClusterIormConfigCacheDbPlanArgs.Builder]*):
        com.pulumi.aws.odb.inputs.CloudVmClusterIormConfigCacheArgs.Builder =
      def argsBuilder = com.pulumi.aws.odb.inputs.CloudVmClusterIormConfigCacheDbPlanArgs.builder
      builder.dbPlans(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.odb.inputs.NetworkManagedServiceArgs.Builder)
    /**
     * @param kmsAccesses Specifies the configuration for KMS access from the ODB network.
     * @return builder
     */
    def kmsAccesses(args: Endofunction[com.pulumi.aws.odb.inputs.NetworkManagedServiceKmsAccessArgs.Builder]*):
        com.pulumi.aws.odb.inputs.NetworkManagedServiceArgs.Builder =
      def argsBuilder = com.pulumi.aws.odb.inputs.NetworkManagedServiceKmsAccessArgs.builder
      builder.kmsAccesses(args.map(_(argsBuilder).build)*)

    def managedS3BackupAccesses(args: Endofunction[com.pulumi.aws.odb.inputs.NetworkManagedServiceManagedS3BackupAccessArgs.Builder]*):
        com.pulumi.aws.odb.inputs.NetworkManagedServiceArgs.Builder =
      def argsBuilder = com.pulumi.aws.odb.inputs.NetworkManagedServiceManagedS3BackupAccessArgs.builder
      builder.managedS3BackupAccesses(args.map(_(argsBuilder).build)*)

    /**
     * @param s3Accesses Specifies the configuration for Amazon S3 access from the ODB network.
     * @return builder
     */
    def s3Accesses(args: Endofunction[com.pulumi.aws.odb.inputs.NetworkManagedServiceS3AccessArgs.Builder]*):
        com.pulumi.aws.odb.inputs.NetworkManagedServiceArgs.Builder =
      def argsBuilder = com.pulumi.aws.odb.inputs.NetworkManagedServiceS3AccessArgs.builder
      builder.s3Accesses(args.map(_(argsBuilder).build)*)

    def serviceNetworkEndpoints(args: Endofunction[com.pulumi.aws.odb.inputs.NetworkManagedServiceServiceNetworkEndpointArgs.Builder]*):
        com.pulumi.aws.odb.inputs.NetworkManagedServiceArgs.Builder =
      def argsBuilder = com.pulumi.aws.odb.inputs.NetworkManagedServiceServiceNetworkEndpointArgs.builder
      builder.serviceNetworkEndpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param stsAccesses Specifies the configuration for STS access from the ODB network.
     * @return builder
     */
    def stsAccesses(args: Endofunction[com.pulumi.aws.odb.inputs.NetworkManagedServiceStsAccessArgs.Builder]*):
        com.pulumi.aws.odb.inputs.NetworkManagedServiceArgs.Builder =
      def argsBuilder = com.pulumi.aws.odb.inputs.NetworkManagedServiceStsAccessArgs.builder
      builder.stsAccesses(args.map(_(argsBuilder).build)*)

    /**
     * @param zeroEtlAccesses Specifies the configuration for Zero-ETL access from the ODB network.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def zeroEtlAccesses(args: Endofunction[com.pulumi.aws.odb.inputs.NetworkManagedServiceZeroEtlAccessArgs.Builder]*):
        com.pulumi.aws.odb.inputs.NetworkManagedServiceArgs.Builder =
      def argsBuilder = com.pulumi.aws.odb.inputs.NetworkManagedServiceZeroEtlAccessArgs.builder
      builder.zeroEtlAccesses(args.map(_(argsBuilder).build)*)
