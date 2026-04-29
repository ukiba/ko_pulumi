package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object redshift:
  /** Resource for managing an AWS Redshift Snapshot Copy. */
  def SnapshotCopy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.SnapshotCopyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.redshift.SnapshotCopyArgs.builder
    
    com.pulumi.aws.redshift.SnapshotCopy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Redshift event subscription resource. */
  def EventSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.EventSubscriptionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.redshift.EventSubscriptionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.redshift.EventSubscription(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Creates a new Amazon Redshift IDC application. */
  def IdcApplication(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.IdcApplicationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.redshift.IdcApplicationArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.redshift.IdcApplication(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing a DynamoDB zero-ETL integration or S3 event integration with Amazon Redshift. You can refer to the [User Guide](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/RedshiftforDynamoDB-zero-etl.html) for a DynamoDB zero-ETL integration or the [User Guide](https://docs.aws.amazon.com/redshift/latest/dg/loading-data-copy-job.html) for a S3 event integration. */
  def Integration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.IntegrationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.redshift.IntegrationArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.redshift.Integration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Creates a new Amazon Redshift endpoint authorization. */
  def EndpointAuthorization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.EndpointAuthorizationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.redshift.EndpointAuthorizationArgs.builder
    
    com.pulumi.aws.redshift.EndpointAuthorization(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Redshift Cluster parameter group resource. */
  def ParameterGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.ParameterGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.redshift.ParameterGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.redshift.ParameterGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Creates an HSM client certificate that an Amazon Redshift cluster will use to connect to the client&#39;s HSM in order to store and retrieve the keys used to encrypt the cluster databases. */
  def HsmClientCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.HsmClientCertificateArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.redshift.HsmClientCertificateArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.redshift.HsmClientCertificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Creates a new Amazon Redshift subnet group. You must provide a list of one or more subnets in your existing Amazon Virtual Private Cloud (Amazon VPC) when creating Amazon Redshift subnet group. */
  def SubnetGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.SubnetGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.redshift.SubnetGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.redshift.SubnetGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a Redshift Cluster Resource.
   *  
   *  &gt; **NOTE:** A Redshift cluster&#39;s default IAM role can be managed both by this resource&#39;s `defaultIamRoleArn` argument and the `aws.redshift.ClusterIamRoles` resource&#39;s `defaultIamRoleArn` argument. Do not configure different values for both arguments. Doing so will cause a conflict of default IAM roles.
   *  
   *  &gt; **Note:** Write-Only argument `masterPasswordWo` is available to use in place of `masterPassword`. Write-Only arguments are supported in HashiCorp Terraform 1.11.0 and later. Learn more.
   */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.ClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.redshift.ClusterArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.redshift.Cluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type RedshiftFunctions = com.pulumi.aws.redshift.RedshiftFunctions
  object RedshiftFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.redshift.RedshiftFunctions.*
  extension (self: RedshiftFunctions.type)
    /** Provides details about a specific redshift cluster. */
    def getCluster(args: Endofunction[com.pulumi.aws.redshift.inputs.GetClusterArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.redshift.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.aws.redshift.inputs.GetClusterArgs.builder
      com.pulumi.aws.redshift.RedshiftFunctions.getCluster(args(argsBuilder).build)

    /** Provides details about a specific redshift cluster. */
    def getClusterPlain(args: Endofunction[com.pulumi.aws.redshift.inputs.GetClusterPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.redshift.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.aws.redshift.inputs.GetClusterPlainArgs.builder
      com.pulumi.aws.redshift.RedshiftFunctions.getClusterPlain(args(argsBuilder).build)

    /** Provides redshift cluster temporary credentials. */
    def getClusterCredentials(args: Endofunction[com.pulumi.aws.redshift.inputs.GetClusterCredentialsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.redshift.outputs.GetClusterCredentialsResult] =
      val argsBuilder = com.pulumi.aws.redshift.inputs.GetClusterCredentialsArgs.builder
      com.pulumi.aws.redshift.RedshiftFunctions.getClusterCredentials(args(argsBuilder).build)

    /** Provides redshift cluster temporary credentials. */
    def getClusterCredentialsPlain(args: Endofunction[com.pulumi.aws.redshift.inputs.GetClusterCredentialsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.redshift.outputs.GetClusterCredentialsResult] =
      val argsBuilder = com.pulumi.aws.redshift.inputs.GetClusterCredentialsPlainArgs.builder
      com.pulumi.aws.redshift.RedshiftFunctions.getClusterCredentialsPlain(args(argsBuilder).build)

    /** Data source for managing AWS Redshift Data Shares. */
    def getDataShares(args: Endofunction[com.pulumi.aws.redshift.inputs.GetDataSharesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.redshift.outputs.GetDataSharesResult] =
      val argsBuilder = com.pulumi.aws.redshift.inputs.GetDataSharesArgs.builder
      com.pulumi.aws.redshift.RedshiftFunctions.getDataShares(args(argsBuilder).build)

    /** Data source for managing AWS Redshift Data Shares. */
    def getDataSharesPlain(args: Endofunction[com.pulumi.aws.redshift.inputs.GetDataSharesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.redshift.outputs.GetDataSharesResult] =
      val argsBuilder = com.pulumi.aws.redshift.inputs.GetDataSharesPlainArgs.builder
      com.pulumi.aws.redshift.RedshiftFunctions.getDataSharesPlain(args(argsBuilder).build)

    /** Information about Redshift Orderable Clusters and valid parameter combinations. */
    def getOrderableCluster(args: Endofunction[com.pulumi.aws.redshift.inputs.GetOrderableClusterArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.redshift.outputs.GetOrderableClusterResult] =
      val argsBuilder = com.pulumi.aws.redshift.inputs.GetOrderableClusterArgs.builder
      com.pulumi.aws.redshift.RedshiftFunctions.getOrderableCluster(args(argsBuilder).build)

    /** Information about Redshift Orderable Clusters and valid parameter combinations. */
    def getOrderableClusterPlain(args: Endofunction[com.pulumi.aws.redshift.inputs.GetOrderableClusterPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.redshift.outputs.GetOrderableClusterResult] =
      val argsBuilder = com.pulumi.aws.redshift.inputs.GetOrderableClusterPlainArgs.builder
      com.pulumi.aws.redshift.RedshiftFunctions.getOrderableClusterPlain(args(argsBuilder).build)

    /** Data source for managing AWS Redshift Producer Data Shares. */
    def getProducerDataShares(args: Endofunction[com.pulumi.aws.redshift.inputs.GetProducerDataSharesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.redshift.outputs.GetProducerDataSharesResult] =
      val argsBuilder = com.pulumi.aws.redshift.inputs.GetProducerDataSharesArgs.builder
      com.pulumi.aws.redshift.RedshiftFunctions.getProducerDataShares(args(argsBuilder).build)

    /** Data source for managing AWS Redshift Producer Data Shares. */
    def getProducerDataSharesPlain(args: Endofunction[com.pulumi.aws.redshift.inputs.GetProducerDataSharesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.redshift.outputs.GetProducerDataSharesResult] =
      val argsBuilder = com.pulumi.aws.redshift.inputs.GetProducerDataSharesPlainArgs.builder
      com.pulumi.aws.redshift.RedshiftFunctions.getProducerDataSharesPlain(args(argsBuilder).build)

    /** Provides details about a specific redshift subnet group. */
    def getSubnetGroup(args: Endofunction[com.pulumi.aws.redshift.inputs.GetSubnetGroupArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.redshift.outputs.GetSubnetGroupResult] =
      val argsBuilder = com.pulumi.aws.redshift.inputs.GetSubnetGroupArgs.builder
      com.pulumi.aws.redshift.RedshiftFunctions.getSubnetGroup(args(argsBuilder).build)

    /** Provides details about a specific redshift subnet group. */
    def getSubnetGroupPlain(args: Endofunction[com.pulumi.aws.redshift.inputs.GetSubnetGroupPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.redshift.outputs.GetSubnetGroupResult] =
      val argsBuilder = com.pulumi.aws.redshift.inputs.GetSubnetGroupPlainArgs.builder
      com.pulumi.aws.redshift.RedshiftFunctions.getSubnetGroupPlain(args(argsBuilder).build)

  /** Creates a new Amazon Redshift Resource Policy. */
  def ResourcePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.ResourcePolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.redshift.ResourcePolicyArgs.builder
    
    com.pulumi.aws.redshift.ResourcePolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Creates a Redshift authentication profile */
  def AuthenticationProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.AuthenticationProfileArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.redshift.AuthenticationProfileArgs.builder
    
    com.pulumi.aws.redshift.AuthenticationProfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.redshift.ParameterGroupArgs.Builder)
    /**
     * @param parameters A list of Redshift parameters to apply.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.redshift.inputs.ParameterGroupParameterArgs.Builder]*):
        com.pulumi.aws.redshift.ParameterGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.redshift.inputs.ParameterGroupParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  /**
   * 
   */
  def ScheduledAction(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.ScheduledActionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.redshift.ScheduledActionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.redshift.ScheduledAction(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.redshift.ScheduledActionArgs.Builder)
    /**
     * @param targetAction Target action. Documented below.
     * @return builder
     */
    def targetAction(args: Endofunction[com.pulumi.aws.redshift.inputs.ScheduledActionTargetActionArgs.Builder]):
        com.pulumi.aws.redshift.ScheduledActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.redshift.inputs.ScheduledActionTargetActionArgs.builder
      builder.targetAction(args(argsBuilder).build)

  /**
   * 
   */
  def SnapshotScheduleAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.SnapshotScheduleAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.redshift.SnapshotScheduleAssociationArgs.builder
    
    com.pulumi.aws.redshift.SnapshotScheduleAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS Redshift Data Share Authorization. */
  def DataShareAuthorization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.DataShareAuthorizationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.redshift.DataShareAuthorizationArgs.builder
    
    com.pulumi.aws.redshift.DataShareAuthorization(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS Redshift Data Share Consumer Association. */
  def DataShareConsumerAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.DataShareConsumerAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.redshift.DataShareConsumerAssociationArgs.builder
    
    com.pulumi.aws.redshift.DataShareConsumerAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Creates a new Amazon Redshift Partner Integration. */
  def Partner(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.PartnerArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.redshift.PartnerArgs.builder
    
    com.pulumi.aws.redshift.Partner(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a Redshift Cluster IAM Roles resource.
   *  
   *  &gt; **NOTE:** A Redshift cluster&#39;s default IAM role can be managed both by this resource&#39;s `defaultIamRoleArn` argument and the `aws.redshift.Cluster` resource&#39;s `defaultIamRoleArn` argument. Do not configure different values for both arguments. Doing so will cause a conflict of default IAM roles.
   */
  def ClusterIamRoles(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.ClusterIamRolesArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.redshift.ClusterIamRolesArgs.builder
    
    com.pulumi.aws.redshift.ClusterIamRoles(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * 
   */
  def SnapshotSchedule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.SnapshotScheduleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.redshift.SnapshotScheduleArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.redshift.SnapshotSchedule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.redshift.IntegrationArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.redshift.inputs.IntegrationTimeoutsArgs.Builder]):
        com.pulumi.aws.redshift.IntegrationArgs.Builder =
      val argsBuilder = com.pulumi.aws.redshift.inputs.IntegrationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.redshift.IdcApplicationArgs.Builder)
    /**
     * @param authorizedTokenIssuer Token issuer list for the Amazon Redshift IAM Identity Center application instance. Refer to the authorizedTokenIssuer documentation for more details.
     * @return builder
     */
    def authorizedTokenIssuer(args: Endofunction[com.pulumi.aws.redshift.inputs.IdcApplicationAuthorizedTokenIssuerArgs.Builder]):
        com.pulumi.aws.redshift.IdcApplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.redshift.inputs.IdcApplicationAuthorizedTokenIssuerArgs.builder
      builder.authorizedTokenIssuer(args(argsBuilder).build)

    /**
     * @param serviceIntegration Collection of service integrations for the Redshift IAM Identity Center application. Refer to the serviceIntegration documentation for more details.
     * @return builder
     */
    def serviceIntegration(args: Endofunction[com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationArgs.Builder]):
        com.pulumi.aws.redshift.IdcApplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationArgs.builder
      builder.serviceIntegration(args(argsBuilder).build)

  /** Creates a new Amazon Redshift endpoint access. */
  def EndpointAccess(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.EndpointAccessArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.redshift.EndpointAccessArgs.builder
    
    com.pulumi.aws.redshift.EndpointAccess(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Creates an HSM configuration that contains the information required by an Amazon Redshift cluster to store and use database encryption keys in a Hardware Security Module (HSM). */
  def HsmConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.HsmConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.redshift.HsmConfigurationArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.redshift.HsmConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Creates a new Amazon Redshift Usage Limit. */
  def UsageLimit(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.UsageLimitArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.redshift.UsageLimitArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.redshift.UsageLimit(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS Redshift Logging configuration. */
  def Logging(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.LoggingArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.redshift.LoggingArgs.builder
    
    com.pulumi.aws.redshift.Logging(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Creates a Redshift cluster snapshot */
  def ClusterSnapshot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.ClusterSnapshotArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.redshift.ClusterSnapshotArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.redshift.ClusterSnapshot(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.redshift.inputs.ParameterGroupState.Builder)
    /**
     * @param parameters A list of Redshift parameters to apply.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.redshift.inputs.ParameterGroupParameterArgs.Builder]*):
        com.pulumi.aws.redshift.inputs.ParameterGroupState.Builder =
      def argsBuilder = com.pulumi.aws.redshift.inputs.ParameterGroupParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.redshift.inputs.ClusterState.Builder)
    /**
     * @param clusterNodes The nodes in the cluster. Cluster node blocks are documented below
     * @return builder
     */
    def clusterNodes(args: Endofunction[com.pulumi.aws.redshift.inputs.ClusterClusterNodeArgs.Builder]*):
        com.pulumi.aws.redshift.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.aws.redshift.inputs.ClusterClusterNodeArgs.builder
      builder.clusterNodes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.redshift.inputs.IntegrationState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.redshift.inputs.IntegrationTimeoutsArgs.Builder]):
        com.pulumi.aws.redshift.inputs.IntegrationState.Builder =
      val argsBuilder = com.pulumi.aws.redshift.inputs.IntegrationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.redshift.inputs.EndpointAccessState.Builder)
    /**
     * @param vpcEndpoints The connection endpoint for connecting to an Amazon Redshift cluster through the proxy. See details below.
     * @return builder
     */
    def vpcEndpoints(args: Endofunction[com.pulumi.aws.redshift.inputs.EndpointAccessVpcEndpointArgs.Builder]*):
        com.pulumi.aws.redshift.inputs.EndpointAccessState.Builder =
      def argsBuilder = com.pulumi.aws.redshift.inputs.EndpointAccessVpcEndpointArgs.builder
      builder.vpcEndpoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.redshift.inputs.EndpointAccessVpcEndpointArgs.Builder)
    /**
     * @param networkInterfaces One or more network interfaces of the endpoint. Also known as an interface endpoint. See details below.
     * @return builder
     */
    def networkInterfaces(args: Endofunction[com.pulumi.aws.redshift.inputs.EndpointAccessVpcEndpointNetworkInterfaceArgs.Builder]*):
        com.pulumi.aws.redshift.inputs.EndpointAccessVpcEndpointArgs.Builder =
      def argsBuilder = com.pulumi.aws.redshift.inputs.EndpointAccessVpcEndpointNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationLakeFormationArgs.Builder)
    /**
     * @param lakeFormationQuery Lake formation scope.
     * @return builder
     */
    def lakeFormationQuery(args: Endofunction[com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationLakeFormationLakeFormationQueryArgs.Builder]):
        com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationLakeFormationArgs.Builder =
      val argsBuilder = com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationLakeFormationLakeFormationQueryArgs.builder
      builder.lakeFormationQuery(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationArgs.Builder)
    /**
     * @param lakeFormation List of scopes set up for Lake Formation integration. Refer to the lakeFormation documentation for more details.
     * @return builder
     */
    def lakeFormation(args: Endofunction[com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationLakeFormationArgs.Builder]):
        com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationArgs.Builder =
      val argsBuilder = com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationLakeFormationArgs.builder
      builder.lakeFormation(args(argsBuilder).build)

    /**
     * @param redshift List of scopes set up for Redshift integration. Refer to the redshift documentation for more details.
     * @return builder
     */
    def redshift(args: Endofunction[com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationRedshiftArgs.Builder]):
        com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationArgs.Builder =
      val argsBuilder = com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationRedshiftArgs.builder
      builder.redshift(args(argsBuilder).build)

    /**
     * @param s3AccessGrants List of scopes set up for S3 Access Grants integration. Refer to the s3AccessGrants documentation for more details.
     * @return builder
     */
    def s3AccessGrants(args: Endofunction[com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationS3AccessGrantsArgs.Builder]):
        com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationArgs.Builder =
      val argsBuilder = com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationS3AccessGrantsArgs.builder
      builder.s3AccessGrants(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.redshift.inputs.IdcApplicationState.Builder)
    /**
     * @param authorizedTokenIssuer Token issuer list for the Amazon Redshift IAM Identity Center application instance. Refer to the authorizedTokenIssuer documentation for more details.
     * @return builder
     */
    def authorizedTokenIssuer(args: Endofunction[com.pulumi.aws.redshift.inputs.IdcApplicationAuthorizedTokenIssuerArgs.Builder]):
        com.pulumi.aws.redshift.inputs.IdcApplicationState.Builder =
      val argsBuilder = com.pulumi.aws.redshift.inputs.IdcApplicationAuthorizedTokenIssuerArgs.builder
      builder.authorizedTokenIssuer(args(argsBuilder).build)

    /**
     * @param serviceIntegration Collection of service integrations for the Redshift IAM Identity Center application. Refer to the serviceIntegration documentation for more details.
     * @return builder
     */
    def serviceIntegration(args: Endofunction[com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationArgs.Builder]):
        com.pulumi.aws.redshift.inputs.IdcApplicationState.Builder =
      val argsBuilder = com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationArgs.builder
      builder.serviceIntegration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.redshift.inputs.ScheduledActionTargetActionArgs.Builder)
    /**
     * @param pauseCluster An action that runs a `PauseCluster` API operation. Documented below.
     * @return builder
     */
    def pauseCluster(args: Endofunction[com.pulumi.aws.redshift.inputs.ScheduledActionTargetActionPauseClusterArgs.Builder]):
        com.pulumi.aws.redshift.inputs.ScheduledActionTargetActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.redshift.inputs.ScheduledActionTargetActionPauseClusterArgs.builder
      builder.pauseCluster(args(argsBuilder).build)

    /**
     * @param resizeCluster An action that runs a `ResizeCluster` API operation. Documented below.
     * @return builder
     */
    def resizeCluster(args: Endofunction[com.pulumi.aws.redshift.inputs.ScheduledActionTargetActionResizeClusterArgs.Builder]):
        com.pulumi.aws.redshift.inputs.ScheduledActionTargetActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.redshift.inputs.ScheduledActionTargetActionResizeClusterArgs.builder
      builder.resizeCluster(args(argsBuilder).build)

    /**
     * @param resumeCluster An action that runs a `ResumeCluster` API operation. Documented below.
     * @return builder
     */
    def resumeCluster(args: Endofunction[com.pulumi.aws.redshift.inputs.ScheduledActionTargetActionResumeClusterArgs.Builder]):
        com.pulumi.aws.redshift.inputs.ScheduledActionTargetActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.redshift.inputs.ScheduledActionTargetActionResumeClusterArgs.builder
      builder.resumeCluster(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.redshift.inputs.ScheduledActionState.Builder)
    /**
     * @param targetAction Target action. Documented below.
     * @return builder
     */
    def targetAction(args: Endofunction[com.pulumi.aws.redshift.inputs.ScheduledActionTargetActionArgs.Builder]):
        com.pulumi.aws.redshift.inputs.ScheduledActionState.Builder =
      val argsBuilder = com.pulumi.aws.redshift.inputs.ScheduledActionTargetActionArgs.builder
      builder.targetAction(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationS3AccessGrantsArgs.Builder)
    /**
     * @param readWriteAccess S3 Access grants integration scope.
     * @return builder
     */
    def readWriteAccess(args: Endofunction[com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationS3AccessGrantsReadWriteAccessArgs.Builder]):
        com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationS3AccessGrantsArgs.Builder =
      val argsBuilder = com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationS3AccessGrantsReadWriteAccessArgs.builder
      builder.readWriteAccess(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationRedshiftArgs.Builder)
    /**
     * @param connect Amazon Redshift connect service integration scope.
     * @return builder
     */
    def connect(args: Endofunction[com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationRedshiftConnectArgs.Builder]):
        com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationRedshiftArgs.Builder =
      val argsBuilder = com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationRedshiftConnectArgs.builder
      builder.connect(args(argsBuilder).build)

  /**
   * Creates a snapshot copy grant that allows AWS Redshift to encrypt copied snapshots with a customer master key from AWS KMS in a destination region.
   *  
   *  Note that the grant must exist in the destination region, and not in the region of the cluster.
   */
  def SnapshotCopyGrant(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.SnapshotCopyGrantArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.redshift.SnapshotCopyGrantArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.redshift.SnapshotCopyGrant(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
