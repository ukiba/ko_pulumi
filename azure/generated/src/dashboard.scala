package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object dashboard:
  object DashboardFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing shared dashboard in the Azure Portal. This is the data source of the `azurermDashboard` resource. */
    @deprecated inline def azurerm_portal_dashboard(args: Endofunction[com.pulumi.azure.dashboard.inputs.Azurerm_portal_dashboardArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.dashboard.outputs.Azurerm_portal_dashboardResult] =
      val argsBuilder = com.pulumi.azure.dashboard.inputs.Azurerm_portal_dashboardArgs.builder
      com.pulumi.azure.dashboard.DashboardFunctions.azurerm_portal_dashboard(args(argsBuilder).build)

    /** Use this data source to access information about an existing shared dashboard in the Azure Portal. This is the data source of the `azurermDashboard` resource. */
    @deprecated inline def azurerm_portal_dashboardPlain(args: Endofunction[com.pulumi.azure.dashboard.inputs.Azurerm_portal_dashboardPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.dashboard.outputs.Azurerm_portal_dashboardResult] =
      val argsBuilder = com.pulumi.azure.dashboard.inputs.Azurerm_portal_dashboardPlainArgs.builder
      com.pulumi.azure.dashboard.DashboardFunctions.azurerm_portal_dashboardPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Grafana Dashboard. */
    inline def getGrafana(args: Endofunction[com.pulumi.azure.dashboard.inputs.GetGrafanaArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.dashboard.outputs.GetGrafanaResult] =
      val argsBuilder = com.pulumi.azure.dashboard.inputs.GetGrafanaArgs.builder
      com.pulumi.azure.dashboard.DashboardFunctions.getGrafana(args(argsBuilder).build)

    /** Use this data source to access information about an existing Grafana Dashboard. */
    inline def getGrafanaPlain(args: Endofunction[com.pulumi.azure.dashboard.inputs.GetGrafanaPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.dashboard.outputs.GetGrafanaResult] =
      val argsBuilder = com.pulumi.azure.dashboard.inputs.GetGrafanaPlainArgs.builder
      com.pulumi.azure.dashboard.DashboardFunctions.getGrafanaPlain(args(argsBuilder).build)

  /** Manages a Dashboard Grafana. */
  def Grafana(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dashboard.GrafanaArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dashboard.GrafanaArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.dashboard.Grafana(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.dashboard.GrafanaArgs.Builder)
    /**
     * @param azureMonitorWorkspaceIntegrations A `azureMonitorWorkspaceIntegrations` block as defined below.
     * @return builder
     */
    def azureMonitorWorkspaceIntegrations(args: Endofunction[com.pulumi.azure.dashboard.inputs.GrafanaAzureMonitorWorkspaceIntegrationArgs.Builder]*):
        com.pulumi.azure.dashboard.GrafanaArgs.Builder =
      def argsBuilder = com.pulumi.azure.dashboard.inputs.GrafanaAzureMonitorWorkspaceIntegrationArgs.builder
      builder.azureMonitorWorkspaceIntegrations(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below. Changing this forces a new Dashboard Grafana to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.dashboard.inputs.GrafanaIdentityArgs.Builder]):
        com.pulumi.azure.dashboard.GrafanaArgs.Builder =
      val argsBuilder = com.pulumi.azure.dashboard.inputs.GrafanaIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param smtp A `smtp` block as defined below.
     * @return builder
     */
    def smtp(args: Endofunction[com.pulumi.azure.dashboard.inputs.GrafanaSmtpArgs.Builder]):
        com.pulumi.azure.dashboard.GrafanaArgs.Builder =
      val argsBuilder = com.pulumi.azure.dashboard.inputs.GrafanaSmtpArgs.builder
      builder.smtp(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.dashboard.GrafanaArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Manages a Dashboard Grafana Managed Private Endpoint.
   * 
   *  &gt; **Note:** This resource will _not_ approve the managed private endpoint connection on the linked resource. This will need to be done manually via Azure CLI, PowerShell, or AzAPI resources. See here for an example that uses AzAPI.
   */
  def GrafanaManagedPrivateEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dashboard.GrafanaManagedPrivateEndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dashboard.GrafanaManagedPrivateEndpointArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.dashboard.GrafanaManagedPrivateEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.dashboard.inputs.GrafanaState.Builder)
    /**
     * @param azureMonitorWorkspaceIntegrations A `azureMonitorWorkspaceIntegrations` block as defined below.
     * @return builder
     */
    def azureMonitorWorkspaceIntegrations(args: Endofunction[com.pulumi.azure.dashboard.inputs.GrafanaAzureMonitorWorkspaceIntegrationArgs.Builder]*):
        com.pulumi.azure.dashboard.inputs.GrafanaState.Builder =
      def argsBuilder = com.pulumi.azure.dashboard.inputs.GrafanaAzureMonitorWorkspaceIntegrationArgs.builder
      builder.azureMonitorWorkspaceIntegrations(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below. Changing this forces a new Dashboard Grafana to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.dashboard.inputs.GrafanaIdentityArgs.Builder]):
        com.pulumi.azure.dashboard.inputs.GrafanaState.Builder =
      val argsBuilder = com.pulumi.azure.dashboard.inputs.GrafanaIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param smtp A `smtp` block as defined below.
     * @return builder
     */
    def smtp(args: Endofunction[com.pulumi.azure.dashboard.inputs.GrafanaSmtpArgs.Builder]):
        com.pulumi.azure.dashboard.inputs.GrafanaState.Builder =
      val argsBuilder = com.pulumi.azure.dashboard.inputs.GrafanaSmtpArgs.builder
      builder.smtp(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.dashboard.inputs.GrafanaState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.dashboard.inputs.GetGrafanaArgs.Builder)
    /**
     * @param identity The managed identity of the grafana resource.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.dashboard.inputs.GetGrafanaIdentityArgs.Builder]):
        com.pulumi.azure.dashboard.inputs.GetGrafanaArgs.Builder =
      val argsBuilder = com.pulumi.azure.dashboard.inputs.GetGrafanaIdentityArgs.builder
      builder.identity(args(argsBuilder).build)
