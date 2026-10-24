package jp.ukiba.ko_pulumi
package azure

object appplatform_ext:
  extension (builder: com.pulumi.azure.appplatform.SpringCloudApiPortalArgs.Builder)
    /**
     * @param sso A `sso` block as defined below.
     * @return builder
     */
    inline def sso(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudApiPortalSsoArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudApiPortalArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudApiPortalSsoArgs.builder
      builder.sso(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.SpringCloudAppArgs.Builder)
    /**
     * @param customPersistentDisks A `customPersistentDisk` block as defined below.
     * @return builder
     */
    inline def customPersistentDisks(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudAppCustomPersistentDiskArgs.Builder]*):
        com.pulumi.azure.appplatform.SpringCloudAppArgs.Builder =
      def argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudAppCustomPersistentDiskArgs.builder
      builder.customPersistentDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudAppIdentityArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudAppArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudAppIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param ingressSettings An `ingressSettings` block as defined below.
     * @return builder
     */
    inline def ingressSettings(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudAppIngressSettingsArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudAppArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudAppIngressSettingsArgs.builder
      builder.ingressSettings(args(argsBuilder).build)

    /**
     * @param persistentDisk An `persistentDisk` block as defined below.
     * @return builder
     */
    inline def persistentDisk(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudAppPersistentDiskArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudAppArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudAppPersistentDiskArgs.builder
      builder.persistentDisk(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.SpringCloudBuildDeploymentArgs.Builder)
    /**
     * @param quota A `quota` block as defined below.
     * @return builder
     */
    inline def quota(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudBuildDeploymentQuotaArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudBuildDeploymentArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudBuildDeploymentQuotaArgs.builder
      builder.quota(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.SpringCloudBuildPackBindingArgs.Builder)
    /**
     * @param launch A `launch` block as defined below.
     * @return builder
     */
    inline def launch(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudBuildPackBindingLaunchArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudBuildPackBindingArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudBuildPackBindingLaunchArgs.builder
      builder.launch(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.SpringCloudBuilderArgs.Builder)
    /**
     * @param buildPackGroups One or more `buildPackGroup` blocks as defined below.
     * @return builder
     */
    inline def buildPackGroups(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudBuilderBuildPackGroupArgs.Builder]*):
        com.pulumi.azure.appplatform.SpringCloudBuilderArgs.Builder =
      def argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudBuilderBuildPackGroupArgs.builder
      builder.buildPackGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param stack A `stack` block as defined below.
     * @return builder
     */
    inline def stack(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudBuilderStackArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudBuilderArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudBuilderStackArgs.builder
      builder.stack(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.SpringCloudConfigurationServiceArgs.Builder)
    /**
     * @param repositories One or more `repository` blocks as defined below.
     * @return builder
     */
    inline def repositories(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudConfigurationServiceRepositoryArgs.Builder]*):
        com.pulumi.azure.appplatform.SpringCloudConfigurationServiceArgs.Builder =
      def argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudConfigurationServiceRepositoryArgs.builder
      builder.repositories(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appplatform.SpringCloudConnectionArgs.Builder)
    /**
     * @param authentication The authentication info. An `authentication` block as defined below.
     * @return builder
     */
    inline def authentication(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudConnectionAuthenticationArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudConnectionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudConnectionAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

    inline def secretStore(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudConnectionSecretStoreArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudConnectionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudConnectionSecretStoreArgs.builder
      builder.secretStore(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.SpringCloudContainerDeploymentArgs.Builder)
    /**
     * @param quota A `quota` block as defined below.
     * @return builder
     */
    inline def quota(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudContainerDeploymentQuotaArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudContainerDeploymentArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudContainerDeploymentQuotaArgs.builder
      builder.quota(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.SpringCloudCustomizedAcceleratorArgs.Builder)
    /**
     * @param gitRepository A `gitRepository` block as defined below.
     * @return builder
     */
    inline def gitRepository(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudCustomizedAcceleratorGitRepositoryArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudCustomizedAcceleratorArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudCustomizedAcceleratorGitRepositoryArgs.builder
      builder.gitRepository(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.SpringCloudDevToolPortalArgs.Builder)
    /**
     * @param sso A `sso` block as defined below.
     * @return builder
     */
    inline def sso(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudDevToolPortalSsoArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudDevToolPortalArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudDevToolPortalSsoArgs.builder
      builder.sso(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.SpringCloudGatewayArgs.Builder)
    /**
     * @param apiMetadata A `apiMetadata` block as defined below.
     * @return builder
     */
    inline def apiMetadata(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudGatewayApiMetadataArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudGatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudGatewayApiMetadataArgs.builder
      builder.apiMetadata(args(argsBuilder).build)

    /**
     * @param clientAuthorization A `clientAuthorization` block as defined below.
     * @return builder
     */
    inline def clientAuthorization(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudGatewayClientAuthorizationArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudGatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudGatewayClientAuthorizationArgs.builder
      builder.clientAuthorization(args(argsBuilder).build)

    /**
     * @param cors A `cors` block as defined below.
     * @return builder
     */
    inline def cors(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudGatewayCorsArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudGatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudGatewayCorsArgs.builder
      builder.cors(args(argsBuilder).build)

    /**
     * @param localResponseCachePerInstance A `localResponseCachePerInstance` block as defined below. Only one of `localResponseCachePerInstance` or `localResponseCachePerRoute` can be specified.
     * @return builder
     */
    inline def localResponseCachePerInstance(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudGatewayLocalResponseCachePerInstanceArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudGatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudGatewayLocalResponseCachePerInstanceArgs.builder
      builder.localResponseCachePerInstance(args(argsBuilder).build)

    /**
     * @param localResponseCachePerRoute A `localResponseCachePerRoute` block as defined below. Only one of `localResponseCachePerInstance` or `localResponseCachePerRoute` can be specified.
     * @return builder
     */
    inline def localResponseCachePerRoute(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudGatewayLocalResponseCachePerRouteArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudGatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudGatewayLocalResponseCachePerRouteArgs.builder
      builder.localResponseCachePerRoute(args(argsBuilder).build)

    /**
     * @param quota A `quota` block as defined below.
     * @return builder
     */
    inline def quota(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudGatewayQuotaArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudGatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudGatewayQuotaArgs.builder
      builder.quota(args(argsBuilder).build)

    /**
     * @param sso A `sso` block as defined below.
     * @return builder
     */
    inline def sso(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudGatewaySsoArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudGatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudGatewaySsoArgs.builder
      builder.sso(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.SpringCloudGatewayRouteConfigArgs.Builder)
    /**
     * @param openApi One or more `openApi` blocks as defined below.
     * @return builder
     */
    inline def openApi(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudGatewayRouteConfigOpenApiArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudGatewayRouteConfigArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudGatewayRouteConfigOpenApiArgs.builder
      builder.openApi(args(argsBuilder).build)

    /**
     * @param routes One or more `route` blocks as defined below.
     * @return builder
     */
    inline def routes(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudGatewayRouteConfigRouteArgs.Builder]*):
        com.pulumi.azure.appplatform.SpringCloudGatewayRouteConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudGatewayRouteConfigRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appplatform.SpringCloudJavaDeploymentArgs.Builder)
    /**
     * @param quota A `quota` block as defined below.
     * @return builder
     */
    inline def quota(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudJavaDeploymentQuotaArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudJavaDeploymentArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudJavaDeploymentQuotaArgs.builder
      builder.quota(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.SpringCloudServiceArgs.Builder)
    /**
     * @param configServerGitSetting A `configServerGitSetting` block as defined below. This field is applicable only for Spring Cloud Service with basic and standard tier.
     * @return builder
     */
    inline def configServerGitSetting(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingArgs.builder
      builder.configServerGitSetting(args(argsBuilder).build)

    /**
     * @param containerRegistries One or more `containerRegistry` block as defined below. This field is applicable only for Spring Cloud Service with enterprise tier.
     * @return builder
     */
    inline def containerRegistries(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudServiceContainerRegistryArgs.Builder]*):
        com.pulumi.azure.appplatform.SpringCloudServiceArgs.Builder =
      def argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudServiceContainerRegistryArgs.builder
      builder.containerRegistries(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultBuildService A `defaultBuildService` block as defined below. This field is applicable only for Spring Cloud Service with enterprise tier.
     * @return builder
     */
    inline def defaultBuildService(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudServiceDefaultBuildServiceArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudServiceDefaultBuildServiceArgs.builder
      builder.defaultBuildService(args(argsBuilder).build)

    /**
     * @param marketplace A `marketplace` block as defined below. Can only be specified when `sku` is set to `E0`.
     * @return builder
     */
    inline def marketplace(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudServiceMarketplaceArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudServiceMarketplaceArgs.builder
      builder.marketplace(args(argsBuilder).build)

    /**
     * @param network A `network` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def network(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudServiceNetworkArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudServiceNetworkArgs.builder
      builder.network(args(argsBuilder).build)

    /**
     * @param trace A `trace` block as defined below.
     * @return builder
     */
    inline def trace(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudServiceTraceArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudServiceTraceArgs.builder
      builder.trace(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.inputs.SpringCloudApiPortalState.Builder)
    /**
     * @param sso A `sso` block as defined below.
     * @return builder
     */
    inline def sso(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudApiPortalSsoArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudApiPortalState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudApiPortalSsoArgs.builder
      builder.sso(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.inputs.SpringCloudAppState.Builder)
    /**
     * @param customPersistentDisks A `customPersistentDisk` block as defined below.
     * @return builder
     */
    inline def customPersistentDisks(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudAppCustomPersistentDiskArgs.Builder]*):
        com.pulumi.azure.appplatform.inputs.SpringCloudAppState.Builder =
      def argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudAppCustomPersistentDiskArgs.builder
      builder.customPersistentDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudAppIdentityArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudAppState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudAppIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param ingressSettings An `ingressSettings` block as defined below.
     * @return builder
     */
    inline def ingressSettings(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudAppIngressSettingsArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudAppState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudAppIngressSettingsArgs.builder
      builder.ingressSettings(args(argsBuilder).build)

    /**
     * @param persistentDisk An `persistentDisk` block as defined below.
     * @return builder
     */
    inline def persistentDisk(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudAppPersistentDiskArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudAppState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudAppPersistentDiskArgs.builder
      builder.persistentDisk(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.inputs.SpringCloudBuildDeploymentState.Builder)
    /**
     * @param quota A `quota` block as defined below.
     * @return builder
     */
    inline def quota(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudBuildDeploymentQuotaArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudBuildDeploymentState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudBuildDeploymentQuotaArgs.builder
      builder.quota(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.inputs.SpringCloudBuildPackBindingState.Builder)
    /**
     * @param launch A `launch` block as defined below.
     * @return builder
     */
    inline def launch(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudBuildPackBindingLaunchArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudBuildPackBindingState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudBuildPackBindingLaunchArgs.builder
      builder.launch(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.inputs.SpringCloudBuilderState.Builder)
    /**
     * @param buildPackGroups One or more `buildPackGroup` blocks as defined below.
     * @return builder
     */
    inline def buildPackGroups(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudBuilderBuildPackGroupArgs.Builder]*):
        com.pulumi.azure.appplatform.inputs.SpringCloudBuilderState.Builder =
      def argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudBuilderBuildPackGroupArgs.builder
      builder.buildPackGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param stack A `stack` block as defined below.
     * @return builder
     */
    inline def stack(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudBuilderStackArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudBuilderState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudBuilderStackArgs.builder
      builder.stack(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.inputs.SpringCloudConfigurationServiceState.Builder)
    /**
     * @param repositories One or more `repository` blocks as defined below.
     * @return builder
     */
    inline def repositories(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudConfigurationServiceRepositoryArgs.Builder]*):
        com.pulumi.azure.appplatform.inputs.SpringCloudConfigurationServiceState.Builder =
      def argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudConfigurationServiceRepositoryArgs.builder
      builder.repositories(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appplatform.inputs.SpringCloudConnectionState.Builder)
    /**
     * @param authentication The authentication info. An `authentication` block as defined below.
     * @return builder
     */
    inline def authentication(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudConnectionAuthenticationArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudConnectionState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudConnectionAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

    inline def secretStore(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudConnectionSecretStoreArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudConnectionState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudConnectionSecretStoreArgs.builder
      builder.secretStore(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.inputs.SpringCloudContainerDeploymentState.Builder)
    /**
     * @param quota A `quota` block as defined below.
     * @return builder
     */
    inline def quota(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudContainerDeploymentQuotaArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudContainerDeploymentState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudContainerDeploymentQuotaArgs.builder
      builder.quota(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.inputs.SpringCloudCustomizedAcceleratorGitRepositoryArgs.Builder)
    /**
     * @param basicAuth A `basicAuth` block as defined below. Conflicts with `git_repository[0].ssh_auth`. Changing this forces a new Spring Cloud Customized Accelerator to be created.
     * @return builder
     */
    inline def basicAuth(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudCustomizedAcceleratorGitRepositoryBasicAuthArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudCustomizedAcceleratorGitRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudCustomizedAcceleratorGitRepositoryBasicAuthArgs.builder
      builder.basicAuth(args(argsBuilder).build)

    /**
     * @param sshAuth A `sshAuth` block as defined below. Conflicts with `git_repository[0].basic_auth`. Changing this forces a new Spring Cloud Customized Accelerator to be created.
     * @return builder
     */
    inline def sshAuth(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudCustomizedAcceleratorGitRepositorySshAuthArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudCustomizedAcceleratorGitRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudCustomizedAcceleratorGitRepositorySshAuthArgs.builder
      builder.sshAuth(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.inputs.SpringCloudCustomizedAcceleratorState.Builder)
    /**
     * @param gitRepository A `gitRepository` block as defined below.
     * @return builder
     */
    inline def gitRepository(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudCustomizedAcceleratorGitRepositoryArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudCustomizedAcceleratorState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudCustomizedAcceleratorGitRepositoryArgs.builder
      builder.gitRepository(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.inputs.SpringCloudDevToolPortalState.Builder)
    /**
     * @param sso A `sso` block as defined below.
     * @return builder
     */
    inline def sso(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudDevToolPortalSsoArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudDevToolPortalState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudDevToolPortalSsoArgs.builder
      builder.sso(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.inputs.SpringCloudGatewayRouteConfigState.Builder)
    /**
     * @param openApi One or more `openApi` blocks as defined below.
     * @return builder
     */
    inline def openApi(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudGatewayRouteConfigOpenApiArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudGatewayRouteConfigState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudGatewayRouteConfigOpenApiArgs.builder
      builder.openApi(args(argsBuilder).build)

    /**
     * @param routes One or more `route` blocks as defined below.
     * @return builder
     */
    inline def routes(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudGatewayRouteConfigRouteArgs.Builder]*):
        com.pulumi.azure.appplatform.inputs.SpringCloudGatewayRouteConfigState.Builder =
      def argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudGatewayRouteConfigRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appplatform.inputs.SpringCloudGatewayState.Builder)
    /**
     * @param apiMetadata A `apiMetadata` block as defined below.
     * @return builder
     */
    inline def apiMetadata(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudGatewayApiMetadataArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudGatewayState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudGatewayApiMetadataArgs.builder
      builder.apiMetadata(args(argsBuilder).build)

    /**
     * @param clientAuthorization A `clientAuthorization` block as defined below.
     * @return builder
     */
    inline def clientAuthorization(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudGatewayClientAuthorizationArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudGatewayState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudGatewayClientAuthorizationArgs.builder
      builder.clientAuthorization(args(argsBuilder).build)

    /**
     * @param cors A `cors` block as defined below.
     * @return builder
     */
    inline def cors(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudGatewayCorsArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudGatewayState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudGatewayCorsArgs.builder
      builder.cors(args(argsBuilder).build)

    /**
     * @param localResponseCachePerInstance A `localResponseCachePerInstance` block as defined below. Only one of `localResponseCachePerInstance` or `localResponseCachePerRoute` can be specified.
     * @return builder
     */
    inline def localResponseCachePerInstance(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudGatewayLocalResponseCachePerInstanceArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudGatewayState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudGatewayLocalResponseCachePerInstanceArgs.builder
      builder.localResponseCachePerInstance(args(argsBuilder).build)

    /**
     * @param localResponseCachePerRoute A `localResponseCachePerRoute` block as defined below. Only one of `localResponseCachePerInstance` or `localResponseCachePerRoute` can be specified.
     * @return builder
     */
    inline def localResponseCachePerRoute(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudGatewayLocalResponseCachePerRouteArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudGatewayState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudGatewayLocalResponseCachePerRouteArgs.builder
      builder.localResponseCachePerRoute(args(argsBuilder).build)

    /**
     * @param quota A `quota` block as defined below.
     * @return builder
     */
    inline def quota(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudGatewayQuotaArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudGatewayState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudGatewayQuotaArgs.builder
      builder.quota(args(argsBuilder).build)

    /**
     * @param sso A `sso` block as defined below.
     * @return builder
     */
    inline def sso(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudGatewaySsoArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudGatewayState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudGatewaySsoArgs.builder
      builder.sso(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.inputs.SpringCloudJavaDeploymentState.Builder)
    /**
     * @param quota A `quota` block as defined below.
     * @return builder
     */
    inline def quota(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudJavaDeploymentQuotaArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudJavaDeploymentState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudJavaDeploymentQuotaArgs.builder
      builder.quota(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingArgs.Builder)
    /**
     * @param httpBasicAuth A `httpBasicAuth` block as defined below.
     * @return builder
     */
    inline def httpBasicAuth(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingHttpBasicAuthArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingHttpBasicAuthArgs.builder
      builder.httpBasicAuth(args(argsBuilder).build)

    /**
     * @param repositories One or more `repository` blocks as defined below.
     * @return builder
     */
    inline def repositories(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingRepositoryArgs.Builder]*):
        com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingArgs.Builder =
      def argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingRepositoryArgs.builder
      builder.repositories(args.map(_(argsBuilder).build)*)

    /**
     * @param sshAuth A `sshAuth` block as defined below.
     * @return builder
     */
    inline def sshAuth(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingSshAuthArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingSshAuthArgs.builder
      builder.sshAuth(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingRepositoryArgs.Builder)
    /**
     * @param httpBasicAuth A `httpBasicAuth` block as defined below.
     * @return builder
     */
    inline def httpBasicAuth(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingRepositoryHttpBasicAuthArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingRepositoryHttpBasicAuthArgs.builder
      builder.httpBasicAuth(args(argsBuilder).build)

    /**
     * @param sshAuth A `sshAuth` block as defined below.
     * @return builder
     */
    inline def sshAuth(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingRepositorySshAuthArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingRepositorySshAuthArgs.builder
      builder.sshAuth(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.inputs.SpringCloudServiceState.Builder)
    /**
     * @param configServerGitSetting A `configServerGitSetting` block as defined below. This field is applicable only for Spring Cloud Service with basic and standard tier.
     * @return builder
     */
    inline def configServerGitSetting(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudServiceState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingArgs.builder
      builder.configServerGitSetting(args(argsBuilder).build)

    /**
     * @param containerRegistries One or more `containerRegistry` block as defined below. This field is applicable only for Spring Cloud Service with enterprise tier.
     * @return builder
     */
    inline def containerRegistries(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudServiceContainerRegistryArgs.Builder]*):
        com.pulumi.azure.appplatform.inputs.SpringCloudServiceState.Builder =
      def argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudServiceContainerRegistryArgs.builder
      builder.containerRegistries(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultBuildService A `defaultBuildService` block as defined below. This field is applicable only for Spring Cloud Service with enterprise tier.
     * @return builder
     */
    inline def defaultBuildService(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudServiceDefaultBuildServiceArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudServiceState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudServiceDefaultBuildServiceArgs.builder
      builder.defaultBuildService(args(argsBuilder).build)

    /**
     * @param marketplace A `marketplace` block as defined below. Can only be specified when `sku` is set to `E0`.
     * @return builder
     */
    inline def marketplace(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudServiceMarketplaceArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudServiceState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudServiceMarketplaceArgs.builder
      builder.marketplace(args(argsBuilder).build)

    /**
     * @param network A `network` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def network(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudServiceNetworkArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudServiceState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudServiceNetworkArgs.builder
      builder.network(args(argsBuilder).build)

    /**
     * @param requiredNetworkTrafficRules A list of `requiredNetworkTrafficRules` blocks as defined below.
     * @return builder
     */
    inline def requiredNetworkTrafficRules(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudServiceRequiredNetworkTrafficRuleArgs.Builder]*):
        com.pulumi.azure.appplatform.inputs.SpringCloudServiceState.Builder =
      def argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudServiceRequiredNetworkTrafficRuleArgs.builder
      builder.requiredNetworkTrafficRules(args.map(_(argsBuilder).build)*)

    /**
     * @param trace A `trace` block as defined below.
     * @return builder
     */
    inline def trace(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudServiceTraceArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudServiceState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudServiceTraceArgs.builder
      builder.trace(args(argsBuilder).build)
