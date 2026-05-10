package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object nginx:
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

  /** Manages the configuration for a Nginx Deployment. */
  def Configuration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.nginx.ConfigurationArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.nginx.ConfigurationArgs.builder
    com.pulumi.azure.nginx.Configuration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Certificate for an NGINX Deployment. */
  def Certificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.nginx.CertificateArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.nginx.CertificateArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.nginx.Certificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages the Dataplane API Key for an Nginx Deployment. */
  def ApiKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.nginx.ApiKeyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.nginx.ApiKeyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.nginx.ApiKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

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
    @deprecated def loggingStorageAccounts(args: Endofunction[com.pulumi.azure.nginx.inputs.DeploymentLoggingStorageAccountArgs.Builder]*):
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

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.nginx.DeploymentArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  type NginxFunctions = com.pulumi.azure.nginx.NginxFunctions
  object NginxFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.nginx.NginxFunctions.*
  extension (self: NginxFunctions.type)
    /** Use this data source to access information about an existing NGINX Dataplane API Key. */
    def getApiKey(args: Endofunction[com.pulumi.azure.nginx.inputs.GetApiKeyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.nginx.outputs.GetApiKeyResult] =
      val argsBuilder = com.pulumi.azure.nginx.inputs.GetApiKeyArgs.builder
      com.pulumi.azure.nginx.NginxFunctions.getApiKey(args(argsBuilder).build)

    /** Use this data source to access information about an existing NGINX Dataplane API Key. */
    def getApiKeyPlain(args: Endofunction[com.pulumi.azure.nginx.inputs.GetApiKeyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.nginx.outputs.GetApiKeyResult] =
      val argsBuilder = com.pulumi.azure.nginx.inputs.GetApiKeyPlainArgs.builder
      com.pulumi.azure.nginx.NginxFunctions.getApiKeyPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing NGINX Certificate. */
    def getCertificate(args: Endofunction[com.pulumi.azure.nginx.inputs.GetCertificateArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.nginx.outputs.GetCertificateResult] =
      val argsBuilder = com.pulumi.azure.nginx.inputs.GetCertificateArgs.builder
      com.pulumi.azure.nginx.NginxFunctions.getCertificate(args(argsBuilder).build)

    /** Use this data source to access information about an existing NGINX Certificate. */
    def getCertificatePlain(args: Endofunction[com.pulumi.azure.nginx.inputs.GetCertificatePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.nginx.outputs.GetCertificateResult] =
      val argsBuilder = com.pulumi.azure.nginx.inputs.GetCertificatePlainArgs.builder
      com.pulumi.azure.nginx.NginxFunctions.getCertificatePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Nginx Configuration. */
    def getConfiguration(args: Endofunction[com.pulumi.azure.nginx.inputs.GetConfigurationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.nginx.outputs.GetConfigurationResult] =
      val argsBuilder = com.pulumi.azure.nginx.inputs.GetConfigurationArgs.builder
      com.pulumi.azure.nginx.NginxFunctions.getConfiguration(args(argsBuilder).build)

    /** Use this data source to access information about an existing Nginx Configuration. */
    def getConfigurationPlain(args: Endofunction[com.pulumi.azure.nginx.inputs.GetConfigurationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.nginx.outputs.GetConfigurationResult] =
      val argsBuilder = com.pulumi.azure.nginx.inputs.GetConfigurationPlainArgs.builder
      com.pulumi.azure.nginx.NginxFunctions.getConfigurationPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing NGINX Deployment. */
    def getDeployment(args: Endofunction[com.pulumi.azure.nginx.inputs.GetDeploymentArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.nginx.outputs.GetDeploymentResult] =
      val argsBuilder = com.pulumi.azure.nginx.inputs.GetDeploymentArgs.builder
      com.pulumi.azure.nginx.NginxFunctions.getDeployment(args(argsBuilder).build)

    /** Use this data source to access information about an existing NGINX Deployment. */
    def getDeploymentPlain(args: Endofunction[com.pulumi.azure.nginx.inputs.GetDeploymentPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.nginx.outputs.GetDeploymentResult] =
      val argsBuilder = com.pulumi.azure.nginx.inputs.GetDeploymentPlainArgs.builder
      com.pulumi.azure.nginx.NginxFunctions.getDeploymentPlain(args(argsBuilder).build)

  /** Manages an NGINX Deployment. */
  def Deployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.nginx.DeploymentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.nginx.DeploymentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.nginx.Deployment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

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

  extension (builder: com.pulumi.azure.nginx.inputs.DeploymentWebApplicationFirewallArgs.Builder)
    /**
     * @param statuses A `status` block as defined below.
     * @return builder
     */
    def statuses(args: Endofunction[com.pulumi.azure.nginx.inputs.DeploymentWebApplicationFirewallStatusArgs.Builder]*):
        com.pulumi.azure.nginx.inputs.DeploymentWebApplicationFirewallArgs.Builder =
      def argsBuilder = com.pulumi.azure.nginx.inputs.DeploymentWebApplicationFirewallStatusArgs.builder
      builder.statuses(args.map(_(argsBuilder).build)*)

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
    @deprecated def loggingStorageAccounts(args: Endofunction[com.pulumi.azure.nginx.inputs.DeploymentLoggingStorageAccountArgs.Builder]*):
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

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.nginx.inputs.DeploymentState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
