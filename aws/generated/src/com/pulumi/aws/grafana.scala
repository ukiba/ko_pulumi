package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object grafana:
  extension (builder: com.pulumi.aws.grafana.WorkspaceArgs.Builder)
    /**
     * @param networkAccessControl Configuration for network access to your workspace.See Network Access Control below.
     * @return builder
     */
    def networkAccessControl(args: Endofunction[com.pulumi.aws.grafana.inputs.WorkspaceNetworkAccessControlArgs.Builder]):
        com.pulumi.aws.grafana.WorkspaceArgs.Builder =
      val argsBuilder = com.pulumi.aws.grafana.inputs.WorkspaceNetworkAccessControlArgs.builder
      builder.networkAccessControl(args(argsBuilder).build)

    /**
     * @param vpcConfiguration The configuration settings for an Amazon VPC that contains data sources for your Grafana workspace to connect to. See VPC Configuration below.
     * @return builder
     */
    def vpcConfiguration(args: Endofunction[com.pulumi.aws.grafana.inputs.WorkspaceVpcConfigurationArgs.Builder]):
        com.pulumi.aws.grafana.WorkspaceArgs.Builder =
      val argsBuilder = com.pulumi.aws.grafana.inputs.WorkspaceVpcConfigurationArgs.builder
      builder.vpcConfiguration(args(argsBuilder).build)

  /** Provides an Amazon Managed Grafana workspace SAML configuration resource. */
  def WorkspaceSamlConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.grafana.WorkspaceSamlConfigurationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.grafana.WorkspaceSamlConfigurationArgs.builder
    
    com.pulumi.aws.grafana.WorkspaceSamlConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &gt; **Note:** You cannot update a service account token. If you change any attribute, Terraform
   *  will delete the current and create a new one.
   *  
   *  Read about Service Accounts Tokens in the [Amazon Managed Grafana user guide](https://docs.aws.amazon.com/grafana/latest/userguide/service-accounts.html#service-account-tokens).
   */
  def WorkspaceServiceAccountToken(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.grafana.WorkspaceServiceAccountTokenArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.grafana.WorkspaceServiceAccountTokenArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.grafana.WorkspaceServiceAccountToken(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &gt; **Note:** You cannot update a service account. If you change any attribute, Terraform
   *  will delete the current and create a new one.
   *  
   *  Read about Service Accounts in the [Amazon Managed Grafana user guide](https://docs.aws.amazon.com/grafana/latest/userguide/service-accounts.html).
   */
  def WorkspaceServiceAccount(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.grafana.WorkspaceServiceAccountArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.grafana.WorkspaceServiceAccountArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.grafana.WorkspaceServiceAccount(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type GrafanaFunctions = com.pulumi.aws.grafana.GrafanaFunctions
  object GrafanaFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.grafana.GrafanaFunctions.*
  extension (self: GrafanaFunctions.type)
    /** Provides an Amazon Managed Grafana workspace data source. */
    def getWorkspace(args: Endofunction[com.pulumi.aws.grafana.inputs.GetWorkspaceArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.grafana.outputs.GetWorkspaceResult] =
      val argsBuilder = com.pulumi.aws.grafana.inputs.GetWorkspaceArgs.builder
      com.pulumi.aws.grafana.GrafanaFunctions.getWorkspace(args(argsBuilder).build)

    /** Provides an Amazon Managed Grafana workspace data source. */
    def getWorkspacePlain(args: Endofunction[com.pulumi.aws.grafana.inputs.GetWorkspacePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.grafana.outputs.GetWorkspaceResult] =
      val argsBuilder = com.pulumi.aws.grafana.inputs.GetWorkspacePlainArgs.builder
      com.pulumi.aws.grafana.GrafanaFunctions.getWorkspacePlain(args(argsBuilder).build)

  /** Provides an Amazon Managed Grafana workspace API Key resource. */
  def WorkspaceApiKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.grafana.WorkspaceApiKeyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.grafana.WorkspaceApiKeyArgs.builder
    
    com.pulumi.aws.grafana.WorkspaceApiKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an Amazon Managed Grafana workspace role association resource. */
  def RoleAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.grafana.RoleAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.grafana.RoleAssociationArgs.builder
    
    com.pulumi.aws.grafana.RoleAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an Amazon Managed Grafana workspace resource. */
  def Workspace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.grafana.WorkspaceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.grafana.WorkspaceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.grafana.Workspace(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.grafana.inputs.WorkspaceState.Builder)
    /**
     * @param networkAccessControl Configuration for network access to your workspace.See Network Access Control below.
     * @return builder
     */
    def networkAccessControl(args: Endofunction[com.pulumi.aws.grafana.inputs.WorkspaceNetworkAccessControlArgs.Builder]):
        com.pulumi.aws.grafana.inputs.WorkspaceState.Builder =
      val argsBuilder = com.pulumi.aws.grafana.inputs.WorkspaceNetworkAccessControlArgs.builder
      builder.networkAccessControl(args(argsBuilder).build)

    /**
     * @param vpcConfiguration The configuration settings for an Amazon VPC that contains data sources for your Grafana workspace to connect to. See VPC Configuration below.
     * @return builder
     */
    def vpcConfiguration(args: Endofunction[com.pulumi.aws.grafana.inputs.WorkspaceVpcConfigurationArgs.Builder]):
        com.pulumi.aws.grafana.inputs.WorkspaceState.Builder =
      val argsBuilder = com.pulumi.aws.grafana.inputs.WorkspaceVpcConfigurationArgs.builder
      builder.vpcConfiguration(args(argsBuilder).build)

  /** Provides an Amazon Managed Grafana workspace license association resource. */
  def LicenseAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.grafana.LicenseAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.grafana.LicenseAssociationArgs.builder
    
    com.pulumi.aws.grafana.LicenseAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
