package jp.ukiba.ko_pulumi
package aws

object redshift_ext:
  extension (builder: com.pulumi.aws.redshift.IdcApplicationArgs.Builder)
    /**
     * @param authorizedTokenIssuer Token issuer list for the Amazon Redshift IAM Identity Center application instance. Refer to the authorizedTokenIssuer documentation for more details.
     * @return builder
     */
    inline def authorizedTokenIssuer(args: Endofunction[com.pulumi.aws.redshift.inputs.IdcApplicationAuthorizedTokenIssuerArgs.Builder]):
        com.pulumi.aws.redshift.IdcApplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.redshift.inputs.IdcApplicationAuthorizedTokenIssuerArgs.builder
      builder.authorizedTokenIssuer(args(argsBuilder).build)

    /**
     * @param serviceIntegration Collection of service integrations for the Redshift IAM Identity Center application. Refer to the serviceIntegration documentation for more details.
     * @return builder
     */
    inline def serviceIntegration(args: Endofunction[com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationArgs.Builder]):
        com.pulumi.aws.redshift.IdcApplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationArgs.builder
      builder.serviceIntegration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.redshift.IntegrationArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.redshift.inputs.IntegrationTimeoutsArgs.Builder]):
        com.pulumi.aws.redshift.IntegrationArgs.Builder =
      val argsBuilder = com.pulumi.aws.redshift.inputs.IntegrationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.redshift.ParameterGroupArgs.Builder)
    /**
     * @param parameters A list of Redshift parameters to apply.
     * @return builder
     */
    inline def parameters(args: Endofunction[com.pulumi.aws.redshift.inputs.ParameterGroupParameterArgs.Builder]*):
        com.pulumi.aws.redshift.ParameterGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.redshift.inputs.ParameterGroupParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.redshift.ScheduledActionArgs.Builder)
    /**
     * @param targetAction Target action. Documented below.
     * @return builder
     */
    inline def targetAction(args: Endofunction[com.pulumi.aws.redshift.inputs.ScheduledActionTargetActionArgs.Builder]):
        com.pulumi.aws.redshift.ScheduledActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.redshift.inputs.ScheduledActionTargetActionArgs.builder
      builder.targetAction(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.redshift.inputs.ClusterState.Builder)
    /**
     * @param clusterNodes The nodes in the cluster. Cluster node blocks are documented below
     * @return builder
     */
    inline def clusterNodes(args: Endofunction[com.pulumi.aws.redshift.inputs.ClusterClusterNodeArgs.Builder]*):
        com.pulumi.aws.redshift.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.aws.redshift.inputs.ClusterClusterNodeArgs.builder
      builder.clusterNodes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.redshift.inputs.EndpointAccessState.Builder)
    /**
     * @param vpcEndpoints The connection endpoint for connecting to an Amazon Redshift cluster through the proxy. See details below.
     * @return builder
     */
    inline def vpcEndpoints(args: Endofunction[com.pulumi.aws.redshift.inputs.EndpointAccessVpcEndpointArgs.Builder]*):
        com.pulumi.aws.redshift.inputs.EndpointAccessState.Builder =
      def argsBuilder = com.pulumi.aws.redshift.inputs.EndpointAccessVpcEndpointArgs.builder
      builder.vpcEndpoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.redshift.inputs.EndpointAccessVpcEndpointArgs.Builder)
    /**
     * @param networkInterfaces One or more network interfaces of the endpoint. Also known as an interface endpoint. See details below.
     * @return builder
     */
    inline def networkInterfaces(args: Endofunction[com.pulumi.aws.redshift.inputs.EndpointAccessVpcEndpointNetworkInterfaceArgs.Builder]*):
        com.pulumi.aws.redshift.inputs.EndpointAccessVpcEndpointArgs.Builder =
      def argsBuilder = com.pulumi.aws.redshift.inputs.EndpointAccessVpcEndpointNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationArgs.Builder)
    /**
     * @param lakeFormation List of scopes set up for Lake Formation integration. Refer to the lakeFormation documentation for more details.
     * @return builder
     */
    inline def lakeFormation(args: Endofunction[com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationLakeFormationArgs.Builder]):
        com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationArgs.Builder =
      val argsBuilder = com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationLakeFormationArgs.builder
      builder.lakeFormation(args(argsBuilder).build)

    /**
     * @param redshift List of scopes set up for Redshift integration. Refer to the redshift documentation for more details.
     * @return builder
     */
    inline def redshift(args: Endofunction[com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationRedshiftArgs.Builder]):
        com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationArgs.Builder =
      val argsBuilder = com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationRedshiftArgs.builder
      builder.redshift(args(argsBuilder).build)

    /**
     * @param s3AccessGrants List of scopes set up for S3 Access Grants integration. Refer to the s3AccessGrants documentation for more details.
     * @return builder
     */
    inline def s3AccessGrants(args: Endofunction[com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationS3AccessGrantsArgs.Builder]):
        com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationArgs.Builder =
      val argsBuilder = com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationS3AccessGrantsArgs.builder
      builder.s3AccessGrants(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationLakeFormationArgs.Builder)
    /**
     * @param lakeFormationQuery Lake Formation scope.
     * @return builder
     */
    inline def lakeFormationQuery(args: Endofunction[com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationLakeFormationLakeFormationQueryArgs.Builder]):
        com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationLakeFormationArgs.Builder =
      val argsBuilder = com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationLakeFormationLakeFormationQueryArgs.builder
      builder.lakeFormationQuery(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationRedshiftArgs.Builder)
    /**
     * @param connect Amazon Redshift connect service integration scope.
     * @return builder
     */
    inline def connect(args: Endofunction[com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationRedshiftConnectArgs.Builder]):
        com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationRedshiftArgs.Builder =
      val argsBuilder = com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationRedshiftConnectArgs.builder
      builder.connect(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationS3AccessGrantsArgs.Builder)
    /**
     * @param readWriteAccess S3 Access grants integration scope.
     * @return builder
     */
    inline def readWriteAccess(args: Endofunction[com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationS3AccessGrantsReadWriteAccessArgs.Builder]):
        com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationS3AccessGrantsArgs.Builder =
      val argsBuilder = com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationS3AccessGrantsReadWriteAccessArgs.builder
      builder.readWriteAccess(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.redshift.inputs.IdcApplicationState.Builder)
    /**
     * @param authorizedTokenIssuer Token issuer list for the Amazon Redshift IAM Identity Center application instance. Refer to the authorizedTokenIssuer documentation for more details.
     * @return builder
     */
    inline def authorizedTokenIssuer(args: Endofunction[com.pulumi.aws.redshift.inputs.IdcApplicationAuthorizedTokenIssuerArgs.Builder]):
        com.pulumi.aws.redshift.inputs.IdcApplicationState.Builder =
      val argsBuilder = com.pulumi.aws.redshift.inputs.IdcApplicationAuthorizedTokenIssuerArgs.builder
      builder.authorizedTokenIssuer(args(argsBuilder).build)

    /**
     * @param serviceIntegration Collection of service integrations for the Redshift IAM Identity Center application. Refer to the serviceIntegration documentation for more details.
     * @return builder
     */
    inline def serviceIntegration(args: Endofunction[com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationArgs.Builder]):
        com.pulumi.aws.redshift.inputs.IdcApplicationState.Builder =
      val argsBuilder = com.pulumi.aws.redshift.inputs.IdcApplicationServiceIntegrationArgs.builder
      builder.serviceIntegration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.redshift.inputs.IntegrationState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.redshift.inputs.IntegrationTimeoutsArgs.Builder]):
        com.pulumi.aws.redshift.inputs.IntegrationState.Builder =
      val argsBuilder = com.pulumi.aws.redshift.inputs.IntegrationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.redshift.inputs.ParameterGroupState.Builder)
    /**
     * @param parameters A list of Redshift parameters to apply.
     * @return builder
     */
    inline def parameters(args: Endofunction[com.pulumi.aws.redshift.inputs.ParameterGroupParameterArgs.Builder]*):
        com.pulumi.aws.redshift.inputs.ParameterGroupState.Builder =
      def argsBuilder = com.pulumi.aws.redshift.inputs.ParameterGroupParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.redshift.inputs.ScheduledActionState.Builder)
    /**
     * @param targetAction Target action. Documented below.
     * @return builder
     */
    inline def targetAction(args: Endofunction[com.pulumi.aws.redshift.inputs.ScheduledActionTargetActionArgs.Builder]):
        com.pulumi.aws.redshift.inputs.ScheduledActionState.Builder =
      val argsBuilder = com.pulumi.aws.redshift.inputs.ScheduledActionTargetActionArgs.builder
      builder.targetAction(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.redshift.inputs.ScheduledActionTargetActionArgs.Builder)
    /**
     * @param pauseCluster An action that runs a `PauseCluster` API operation. Documented below.
     * @return builder
     */
    inline def pauseCluster(args: Endofunction[com.pulumi.aws.redshift.inputs.ScheduledActionTargetActionPauseClusterArgs.Builder]):
        com.pulumi.aws.redshift.inputs.ScheduledActionTargetActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.redshift.inputs.ScheduledActionTargetActionPauseClusterArgs.builder
      builder.pauseCluster(args(argsBuilder).build)

    /**
     * @param resizeCluster An action that runs a `ResizeCluster` API operation. Documented below.
     * @return builder
     */
    inline def resizeCluster(args: Endofunction[com.pulumi.aws.redshift.inputs.ScheduledActionTargetActionResizeClusterArgs.Builder]):
        com.pulumi.aws.redshift.inputs.ScheduledActionTargetActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.redshift.inputs.ScheduledActionTargetActionResizeClusterArgs.builder
      builder.resizeCluster(args(argsBuilder).build)

    /**
     * @param resumeCluster An action that runs a `ResumeCluster` API operation. Documented below.
     * @return builder
     */
    inline def resumeCluster(args: Endofunction[com.pulumi.aws.redshift.inputs.ScheduledActionTargetActionResumeClusterArgs.Builder]):
        com.pulumi.aws.redshift.inputs.ScheduledActionTargetActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.redshift.inputs.ScheduledActionTargetActionResumeClusterArgs.builder
      builder.resumeCluster(args(argsBuilder).build)
