package jp.ukiba.ko_pulumi
package azure

object nginx_ext:
  extension (builder: com.pulumi.azure.nginx.ConfigurationArgs.Builder)
    /**
     * @param configFiles One or more `configFile` blocks as defined below.
     * @return builder
     */
    def configFiles(args: Endofunction[com.pulumi.azure.nginx.inputs.ConfigurationConfigFileArgs.Builder]*):
        com.pulumi.azure.nginx.ConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.nginx.inputs.ConfigurationConfigFileArgs.builder
      builder.configFiles(args.map(_(argsBuilder).build)*)

    /**
     * @param protectedFiles One or more `protectedFile` blocks with sensitive information as defined below. If specified `configFile` must also be specified.
     * @return builder
     */
    def protectedFiles(args: Endofunction[com.pulumi.azure.nginx.inputs.ConfigurationProtectedFileArgs.Builder]*):
        com.pulumi.azure.nginx.ConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.nginx.inputs.ConfigurationProtectedFileArgs.builder
      builder.protectedFiles(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.nginx.DeploymentArgs.Builder)
    /**
     * @param autoScaleProfiles An `autoScaleProfile` block as defined below.
     * @return builder
     */
    def autoScaleProfiles(args: Endofunction[com.pulumi.azure.nginx.inputs.DeploymentAutoScaleProfileArgs.Builder]*):
        com.pulumi.azure.nginx.DeploymentArgs.Builder =
      def argsBuilder = com.pulumi.azure.nginx.inputs.DeploymentAutoScaleProfileArgs.builder
      builder.autoScaleProfiles(args.map(_(argsBuilder).build)*)

    /**
     * @param frontendPrivates One or more `frontendPrivate` blocks as defined below.
     * @return builder
     */
    def frontendPrivates(args: Endofunction[com.pulumi.azure.nginx.inputs.DeploymentFrontendPrivateArgs.Builder]*):
        com.pulumi.azure.nginx.DeploymentArgs.Builder =
      def argsBuilder = com.pulumi.azure.nginx.inputs.DeploymentFrontendPrivateArgs.builder
      builder.frontendPrivates(args.map(_(argsBuilder).build)*)

    /**
     * @param frontendPublic A `frontendPublic` block as defined below.
     * @return builder
     */
    def frontendPublic(args: Endofunction[com.pulumi.azure.nginx.inputs.DeploymentFrontendPublicArgs.Builder]):
        com.pulumi.azure.nginx.DeploymentArgs.Builder =
      val argsBuilder = com.pulumi.azure.nginx.inputs.DeploymentFrontendPublicArgs.builder
      builder.frontendPublic(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.nginx.inputs.DeploymentIdentityArgs.Builder]):
        com.pulumi.azure.nginx.DeploymentArgs.Builder =
      val argsBuilder = com.pulumi.azure.nginx.inputs.DeploymentIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @return builder
     * @deprecated The `loggingStorageAccount` block has been deprecated and will be removed in v5.0 of the AzureRM Provider. To enable logs, use the `azure.monitoring.DiagnosticSetting` resource instead.
     */
    @deprecated("The `loggingStorageAccount` block has been deprecated and will be removed in v5.0 of the AzureRM Provider. To enable logs, use the `azure.monitoring.DiagnosticSetting` resource instead.") def loggingStorageAccounts(args: Endofunction[com.pulumi.azure.nginx.inputs.DeploymentLoggingStorageAccountArgs.Builder]*):
        com.pulumi.azure.nginx.DeploymentArgs.Builder =
      def argsBuilder = com.pulumi.azure.nginx.inputs.DeploymentLoggingStorageAccountArgs.builder
      builder.loggingStorageAccounts(args.map(_(argsBuilder).build)*)

    /**
     * @param networkInterfaces One or more `networkInterface` blocks as defined below.
     * @return builder
     */
    def networkInterfaces(args: Endofunction[com.pulumi.azure.nginx.inputs.DeploymentNetworkInterfaceArgs.Builder]*):
        com.pulumi.azure.nginx.DeploymentArgs.Builder =
      def argsBuilder = com.pulumi.azure.nginx.inputs.DeploymentNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param webApplicationFirewall A `webApplicationFirewall` blocks as defined below.
     * @return builder
     */
    def webApplicationFirewall(args: Endofunction[com.pulumi.azure.nginx.inputs.DeploymentWebApplicationFirewallArgs.Builder]):
        com.pulumi.azure.nginx.DeploymentArgs.Builder =
      val argsBuilder = com.pulumi.azure.nginx.inputs.DeploymentWebApplicationFirewallArgs.builder
      builder.webApplicationFirewall(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.nginx.inputs.ConfigurationState.Builder)
    /**
     * @param configFiles One or more `configFile` blocks as defined below.
     * @return builder
     */
    def configFiles(args: Endofunction[com.pulumi.azure.nginx.inputs.ConfigurationConfigFileArgs.Builder]*):
        com.pulumi.azure.nginx.inputs.ConfigurationState.Builder =
      def argsBuilder = com.pulumi.azure.nginx.inputs.ConfigurationConfigFileArgs.builder
      builder.configFiles(args.map(_(argsBuilder).build)*)

    /**
     * @param protectedFiles One or more `protectedFile` blocks with sensitive information as defined below. If specified `configFile` must also be specified.
     * @return builder
     */
    def protectedFiles(args: Endofunction[com.pulumi.azure.nginx.inputs.ConfigurationProtectedFileArgs.Builder]*):
        com.pulumi.azure.nginx.inputs.ConfigurationState.Builder =
      def argsBuilder = com.pulumi.azure.nginx.inputs.ConfigurationProtectedFileArgs.builder
      builder.protectedFiles(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.nginx.inputs.DeploymentState.Builder)
    /**
     * @param autoScaleProfiles An `autoScaleProfile` block as defined below.
     * @return builder
     */
    def autoScaleProfiles(args: Endofunction[com.pulumi.azure.nginx.inputs.DeploymentAutoScaleProfileArgs.Builder]*):
        com.pulumi.azure.nginx.inputs.DeploymentState.Builder =
      def argsBuilder = com.pulumi.azure.nginx.inputs.DeploymentAutoScaleProfileArgs.builder
      builder.autoScaleProfiles(args.map(_(argsBuilder).build)*)

    /**
     * @param frontendPrivates One or more `frontendPrivate` blocks as defined below.
     * @return builder
     */
    def frontendPrivates(args: Endofunction[com.pulumi.azure.nginx.inputs.DeploymentFrontendPrivateArgs.Builder]*):
        com.pulumi.azure.nginx.inputs.DeploymentState.Builder =
      def argsBuilder = com.pulumi.azure.nginx.inputs.DeploymentFrontendPrivateArgs.builder
      builder.frontendPrivates(args.map(_(argsBuilder).build)*)

    /**
     * @param frontendPublic A `frontendPublic` block as defined below.
     * @return builder
     */
    def frontendPublic(args: Endofunction[com.pulumi.azure.nginx.inputs.DeploymentFrontendPublicArgs.Builder]):
        com.pulumi.azure.nginx.inputs.DeploymentState.Builder =
      val argsBuilder = com.pulumi.azure.nginx.inputs.DeploymentFrontendPublicArgs.builder
      builder.frontendPublic(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.nginx.inputs.DeploymentIdentityArgs.Builder]):
        com.pulumi.azure.nginx.inputs.DeploymentState.Builder =
      val argsBuilder = com.pulumi.azure.nginx.inputs.DeploymentIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @return builder
     * @deprecated The `loggingStorageAccount` block has been deprecated and will be removed in v5.0 of the AzureRM Provider. To enable logs, use the `azure.monitoring.DiagnosticSetting` resource instead.
     */
    @deprecated("The `loggingStorageAccount` block has been deprecated and will be removed in v5.0 of the AzureRM Provider. To enable logs, use the `azure.monitoring.DiagnosticSetting` resource instead.") def loggingStorageAccounts(args: Endofunction[com.pulumi.azure.nginx.inputs.DeploymentLoggingStorageAccountArgs.Builder]*):
        com.pulumi.azure.nginx.inputs.DeploymentState.Builder =
      def argsBuilder = com.pulumi.azure.nginx.inputs.DeploymentLoggingStorageAccountArgs.builder
      builder.loggingStorageAccounts(args.map(_(argsBuilder).build)*)

    /**
     * @param networkInterfaces One or more `networkInterface` blocks as defined below.
     * @return builder
     */
    def networkInterfaces(args: Endofunction[com.pulumi.azure.nginx.inputs.DeploymentNetworkInterfaceArgs.Builder]*):
        com.pulumi.azure.nginx.inputs.DeploymentState.Builder =
      def argsBuilder = com.pulumi.azure.nginx.inputs.DeploymentNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param webApplicationFirewall A `webApplicationFirewall` blocks as defined below.
     * @return builder
     */
    def webApplicationFirewall(args: Endofunction[com.pulumi.azure.nginx.inputs.DeploymentWebApplicationFirewallArgs.Builder]):
        com.pulumi.azure.nginx.inputs.DeploymentState.Builder =
      val argsBuilder = com.pulumi.azure.nginx.inputs.DeploymentWebApplicationFirewallArgs.builder
      builder.webApplicationFirewall(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.nginx.inputs.DeploymentWebApplicationFirewallArgs.Builder)
    /**
     * @param statuses A `status` block as defined below.
     * @return builder
     */
    def statuses(args: Endofunction[com.pulumi.azure.nginx.inputs.DeploymentWebApplicationFirewallStatusArgs.Builder]*):
        com.pulumi.azure.nginx.inputs.DeploymentWebApplicationFirewallArgs.Builder =
      def argsBuilder = com.pulumi.azure.nginx.inputs.DeploymentWebApplicationFirewallStatusArgs.builder
      builder.statuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.nginx.inputs.DeploymentWebApplicationFirewallStatusArgs.Builder)
    /**
     * @param attackSignaturesPackages One or more `attackSignaturesPackage` blocks as defined below.
     * @return builder
     */
    def attackSignaturesPackages(args: Endofunction[com.pulumi.azure.nginx.inputs.DeploymentWebApplicationFirewallStatusAttackSignaturesPackageArgs.Builder]*):
        com.pulumi.azure.nginx.inputs.DeploymentWebApplicationFirewallStatusArgs.Builder =
      def argsBuilder = com.pulumi.azure.nginx.inputs.DeploymentWebApplicationFirewallStatusAttackSignaturesPackageArgs.builder
      builder.attackSignaturesPackages(args.map(_(argsBuilder).build)*)

    /**
     * @param botSignaturesPackages One or more `botSignaturesPackage` blocks as defined below.
     * @return builder
     */
    def botSignaturesPackages(args: Endofunction[com.pulumi.azure.nginx.inputs.DeploymentWebApplicationFirewallStatusBotSignaturesPackageArgs.Builder]*):
        com.pulumi.azure.nginx.inputs.DeploymentWebApplicationFirewallStatusArgs.Builder =
      def argsBuilder = com.pulumi.azure.nginx.inputs.DeploymentWebApplicationFirewallStatusBotSignaturesPackageArgs.builder
      builder.botSignaturesPackages(args.map(_(argsBuilder).build)*)

    /**
     * @param componentVersions One or more `componentVersions` blocks as defined below.
     * @return builder
     */
    def componentVersions(args: Endofunction[com.pulumi.azure.nginx.inputs.DeploymentWebApplicationFirewallStatusComponentVersionArgs.Builder]*):
        com.pulumi.azure.nginx.inputs.DeploymentWebApplicationFirewallStatusArgs.Builder =
      def argsBuilder = com.pulumi.azure.nginx.inputs.DeploymentWebApplicationFirewallStatusComponentVersionArgs.builder
      builder.componentVersions(args.map(_(argsBuilder).build)*)

    /**
     * @param threatCampaignsPackages One or more `threatCampaignsPackage` blocks as defined below.
     * @return builder
     */
    def threatCampaignsPackages(args: Endofunction[com.pulumi.azure.nginx.inputs.DeploymentWebApplicationFirewallStatusThreatCampaignsPackageArgs.Builder]*):
        com.pulumi.azure.nginx.inputs.DeploymentWebApplicationFirewallStatusArgs.Builder =
      def argsBuilder = com.pulumi.azure.nginx.inputs.DeploymentWebApplicationFirewallStatusThreatCampaignsPackageArgs.builder
      builder.threatCampaignsPackages(args.map(_(argsBuilder).build)*)
