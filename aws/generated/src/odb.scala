package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object odb:
  /**
   * Manages an Oracle Database{@literal @}AWS Autonomous Database Serverless (ADB-S) instance. ADB-S uses shared Exadata infrastructure managed by Oracle and requires an existing ODB network; it does not require a customer-managed Exadata infrastructure or VM cluster.
   * 
   * Provisioning, updating, and deleting an Autonomous Database are asynchronous and can take several hours. The AWS account and Region must be onboarded for Oracle Database{@literal @}AWS and have sufficient service quotas.
   * 
   * The AWS API defines all create parameters as optional because the valid combination depends on `source`. For a new database (`source = &#34;NONE&#34;`), configure the ODB network, database identity, workload, compute, storage, license, and ADMIN password values required by your Oracle Database{@literal @}AWS tenancy.
   */
  inline def AutonomousDatabase(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.odb.AutonomousDatabaseArgs.Builder] = identity)(using conf: KoPulumiConf) =
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
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages the Oracle Database{@literal @}AWS Autonomous Database Serverless integration with AWS Secrets Manager. The resource provisions an Oracle-managed service role that can assume a customer-managed role to read an administrator-password secret.
   * 
   * &gt; **Note:** This integration is shared by all databases in the AWS account and Region. Creating this resource manages the existing integration if it is already enabled. Destroying this resource disables the integration for the entire account and Region, which can disrupt databases outside this Terraform configuration that use AWS Secrets Manager credentials. Manage the integration in only one Terraform configuration and coordinate changes with all database owners that depend on it.
   * 
   * For accounts with a resource anchor, creating or destroying this resource preserves an existing OCI identity domain. If no identity domain exists, the service creates one when enabling or disabling the integration. This resource does not delete the identity domain.
   * 
   * Create the customer-managed IAM role separately. Its trust policy must allow the exported `roleArn` to assume it, and its permissions must grant access to the selected secret. See the [AWS Secrets Manager documentation](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access.html) for IAM permission guidance.
   */
  inline def AutonomousDatabaseSecretsManagerIntegration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.odb.AutonomousDatabaseSecretsManagerIntegrationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.odb.AutonomousDatabaseSecretsManagerIntegrationArgs.builder
    com.pulumi.aws.odb.AutonomousDatabaseSecretsManagerIntegration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Resource managing cloud autonomous vm cluster in AWS for Oracle Database{@literal @}AWS.
   * 
   * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
   */
  inline def CloudAutonomousVmCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.odb.CloudAutonomousVmClusterArgs.Builder] = identity)(using conf: KoPulumiConf) =
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
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing exadata infrastructure resource in AWS for Oracle Database{@literal @}AWS. */
  inline def CloudExadataInfrastructure(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.odb.CloudExadataInfrastructureArgs.Builder] = identity)(using conf: KoPulumiConf) =
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
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Terraform to manage cloud vm cluster resource in AWS for Oracle Database{@literal @}AWS. If underlying odb network and cloud exadata infrastructure is shared, ARN must be used while creating VM cluster.
   * 
   * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
   */
  inline def CloudVmCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.odb.CloudVmClusterArgs.Builder] = identity)(using conf: KoPulumiConf) =
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
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an AWS Oracle Database{@literal @}AWS Associate Disassociate IAM Role.
   * 
   * Currently supported `resourceArn` targets are Cloud VM Clusters and Cloud Autonomous VM Clusters.
   */
  inline def IamRoleAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.odb.IamRoleAssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.odb.IamRoleAssociationArgs.builder
    com.pulumi.aws.odb.IamRoleAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing odb Network resource in AWS for Oracle Database{@literal @}AWS. */
  inline def Network(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.odb.NetworkArgs.Builder] = identity)(using conf: KoPulumiConf) =
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
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Terraform  resource for managing oracle database network peering resource in AWS. If underlying odb network is shared, ARN must be used while creating network peering.
   * 
   * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
   */
  inline def NetworkPeeringConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.odb.NetworkPeeringConnectionArgs.Builder] = identity)(using conf: KoPulumiConf) =
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
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object OdbFunctions:
    /** Provides details about an Oracle Database{@literal @}AWS Autonomous Database Serverless (ADB-S) instance by its unique identifier. */
    inline def getAutonomousDatabase(args: Endofunction[com.pulumi.aws.odb.inputs.GetAutonomousDatabaseArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetAutonomousDatabaseResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetAutonomousDatabaseArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getAutonomousDatabase(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about an Oracle Database{@literal @}AWS Autonomous Database Serverless (ADB-S) instance by its unique identifier. */
    inline def getAutonomousDatabasePlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetAutonomousDatabasePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetAutonomousDatabaseResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetAutonomousDatabasePlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getAutonomousDatabasePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Data source for managing cloud autonomous vm cluster resource in AWS for Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getCloudAutonomousVmCluster(args: Endofunction[com.pulumi.aws.odb.inputs.GetCloudAutonomousVmClusterArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetCloudAutonomousVmClusterResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetCloudAutonomousVmClusterArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getCloudAutonomousVmCluster(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Data source for managing cloud autonomous vm cluster resource in AWS for Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getCloudAutonomousVmClusterPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetCloudAutonomousVmClusterPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetCloudAutonomousVmClusterResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetCloudAutonomousVmClusterPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getCloudAutonomousVmClusterPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Data source for managing cloud autonomous vm clusters in AWS for Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getCloudAutonomousVmClusters(args: Endofunction[com.pulumi.aws.odb.inputs.GetCloudAutonomousVmClustersArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetCloudAutonomousVmClustersResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetCloudAutonomousVmClustersArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getCloudAutonomousVmClusters(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Data source for managing cloud autonomous vm clusters in AWS for Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getCloudAutonomousVmClustersPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetCloudAutonomousVmClustersPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetCloudAutonomousVmClustersResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetCloudAutonomousVmClustersPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getCloudAutonomousVmClustersPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Data source for exadata infrastructure resource in AWS for Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getCloudExadataInfrastructure(args: Endofunction[com.pulumi.aws.odb.inputs.GetCloudExadataInfrastructureArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetCloudExadataInfrastructureResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetCloudExadataInfrastructureArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getCloudExadataInfrastructure(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Data source for exadata infrastructure resource in AWS for Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getCloudExadataInfrastructurePlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetCloudExadataInfrastructurePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetCloudExadataInfrastructureResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetCloudExadataInfrastructurePlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getCloudExadataInfrastructurePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Data source for exadata infrastructures in AWS for Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getCloudExadataInfrastructures(args: Endofunction[com.pulumi.aws.odb.inputs.GetCloudExadataInfrastructuresArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetCloudExadataInfrastructuresResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetCloudExadataInfrastructuresArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getCloudExadataInfrastructures(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Data source for exadata infrastructures in AWS for Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getCloudExadataInfrastructuresPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetCloudExadataInfrastructuresPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetCloudExadataInfrastructuresResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetCloudExadataInfrastructuresPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getCloudExadataInfrastructuresPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Data source for cloud vm cluster in AWS for Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getCloudVmCluster(args: Endofunction[com.pulumi.aws.odb.inputs.GetCloudVmClusterArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetCloudVmClusterResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetCloudVmClusterArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getCloudVmCluster(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Data source for cloud vm cluster in AWS for Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getCloudVmClusterPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetCloudVmClusterPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetCloudVmClusterResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetCloudVmClusterPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getCloudVmClusterPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Data source for retrieving all cloud vm clusters AWS for Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getCloudVmClusters(args: Endofunction[com.pulumi.aws.odb.inputs.GetCloudVmClustersArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetCloudVmClustersResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetCloudVmClustersArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getCloudVmClusters(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Data source for retrieving all cloud vm clusters AWS for Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getCloudVmClustersPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetCloudVmClustersPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetCloudVmClustersResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetCloudVmClustersPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getCloudVmClustersPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Data source for managing DB nodes linked to cloud vm cluster of Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getDbNode(args: Endofunction[com.pulumi.aws.odb.inputs.GetDbNodeArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetDbNodeResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetDbNodeArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getDbNode(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Data source for managing DB nodes linked to cloud vm cluster of Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getDbNodePlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetDbNodePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetDbNodeResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetDbNodePlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getDbNodePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Data source for managing DB nodes linked to cloud vm cluster of Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getDbNodes(args: Endofunction[com.pulumi.aws.odb.inputs.GetDbNodesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetDbNodesResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetDbNodesArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getDbNodes(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Data source for managing DB nodes linked to cloud vm cluster of Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getDbNodesPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetDbNodesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetDbNodesResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetDbNodesPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getDbNodesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Data source for managing DB server linked to exadata infrastructure of Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getDbServer(args: Endofunction[com.pulumi.aws.odb.inputs.GetDbServerArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetDbServerResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetDbServerArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getDbServer(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Data source for managing DB server linked to exadata infrastructure of Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getDbServerPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetDbServerPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetDbServerResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetDbServerPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getDbServerPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Data source for managing DB servers linked to exadata infrastructure of Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getDbServers(args: Endofunction[com.pulumi.aws.odb.inputs.GetDbServersArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetDbServersResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetDbServersArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getDbServers(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Data source for managing DB servers linked to exadata infrastructure of Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getDbServersPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetDbServersPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetDbServersResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetDbServersPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getDbServersPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Data source to retrieve available system shapes Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getDbSystemShapes(args: Endofunction[com.pulumi.aws.odb.inputs.GetDbSystemShapesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetDbSystemShapesResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetDbSystemShapesArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getDbSystemShapes(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Data source to retrieve available system shapes Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getDbSystemShapesPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetDbSystemShapesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetDbSystemShapesResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetDbSystemShapesPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getDbSystemShapesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Data source to retrieve available Grid Infrastructure versions of Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getGiVersions(args: Endofunction[com.pulumi.aws.odb.inputs.GetGiVersionsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetGiVersionsResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetGiVersionsArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getGiVersions(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Data source to retrieve available Grid Infrastructure versions of Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getGiVersionsPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetGiVersionsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetGiVersionsResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetGiVersionsPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getGiVersionsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides details about an AWS Oracle Database{@literal @}AWS Associate Disassociate IAM Role. */
    inline def getIamRoleAssociation(args: Endofunction[com.pulumi.aws.odb.inputs.GetIamRoleAssociationArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetIamRoleAssociationResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetIamRoleAssociationArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getIamRoleAssociation(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about an AWS Oracle Database{@literal @}AWS Associate Disassociate IAM Role. */
    inline def getIamRoleAssociationPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetIamRoleAssociationPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetIamRoleAssociationResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetIamRoleAssociationPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getIamRoleAssociationPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for to retrieve network resource in AWS for Oracle Database{@literal @}AWS. */
    inline def getNetwork(args: Endofunction[com.pulumi.aws.odb.inputs.GetNetworkArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetNetworkResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetNetworkArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getNetwork(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for to retrieve network resource in AWS for Oracle Database{@literal @}AWS. */
    inline def getNetworkPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetNetworkPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetNetworkResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetNetworkPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getNetworkPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Data source for managing oracle database network peering resource in AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getNetworkPeeringConnection(args: Endofunction[com.pulumi.aws.odb.inputs.GetNetworkPeeringConnectionArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetNetworkPeeringConnectionResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetNetworkPeeringConnectionArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getNetworkPeeringConnection(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Data source for managing oracle database network peering resource in AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getNetworkPeeringConnectionPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetNetworkPeeringConnectionPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetNetworkPeeringConnectionResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetNetworkPeeringConnectionPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getNetworkPeeringConnectionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Data source for retrieving all oracle database network peering resource in Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getNetworkPeeringConnections(args: Endofunction[com.pulumi.aws.odb.inputs.GetNetworkPeeringConnectionsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetNetworkPeeringConnectionsResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetNetworkPeeringConnectionsArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getNetworkPeeringConnections(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Data source for retrieving all oracle database network peering resource in Oracle Database{@literal @}AWS.
     * 
     * You can find out more about Oracle Database{@literal @}AWS from [User Guide](https://docs.aws.amazon.com/odb/latest/UserGuide/what-is-odb.html).
     */
    inline def getNetworkPeeringConnectionsPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetNetworkPeeringConnectionsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetNetworkPeeringConnectionsResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetNetworkPeeringConnectionsPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getNetworkPeeringConnectionsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for to retrieve networks from AWS for Oracle Database{@literal @}AWS. */
    inline def getNetworks(args: Endofunction[com.pulumi.aws.odb.inputs.GetNetworksArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.odb.outputs.GetNetworksResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetNetworksArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getNetworks(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for to retrieve networks from AWS for Oracle Database{@literal @}AWS. */
    inline def getNetworksPlain(args: Endofunction[com.pulumi.aws.odb.inputs.GetNetworksPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.odb.outputs.GetNetworksResult] =
      val argsBuilder = com.pulumi.aws.odb.inputs.GetNetworksPlainArgs.builder
      com.pulumi.aws.odb.OdbFunctions.getNetworksPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
