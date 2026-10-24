package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object dashboard:
  object DashboardFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing shared dashboard in the Azure Portal. This is the data source of the `azurermDashboard` resource. */
    @deprecated("azure.dashboard/azurerm_portal_dashboard.azurerm_portal_dashboard has been deprecated in favor of azure.portal/azurerm_portal_dashboard.azurerm_portal_dashboard") inline def azurerm_portal_dashboard(args: Endofunction[com.pulumi.azure.dashboard.inputs.Azurerm_portal_dashboardArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.dashboard.outputs.Azurerm_portal_dashboardResult] =
      val argsBuilder = com.pulumi.azure.dashboard.inputs.Azurerm_portal_dashboardArgs.builder
      com.pulumi.azure.dashboard.DashboardFunctions.azurerm_portal_dashboard(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing shared dashboard in the Azure Portal. This is the data source of the `azurermDashboard` resource. */
    @deprecated("azure.dashboard/azurerm_portal_dashboard.azurerm_portal_dashboard has been deprecated in favor of azure.portal/azurerm_portal_dashboard.azurerm_portal_dashboard") inline def azurerm_portal_dashboardPlain(args: Endofunction[com.pulumi.azure.dashboard.inputs.Azurerm_portal_dashboardPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.dashboard.outputs.Azurerm_portal_dashboardResult] =
      val argsBuilder = com.pulumi.azure.dashboard.inputs.Azurerm_portal_dashboardPlainArgs.builder
      com.pulumi.azure.dashboard.DashboardFunctions.azurerm_portal_dashboardPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Grafana Dashboard. */
    inline def getGrafana(args: Endofunction[com.pulumi.azure.dashboard.inputs.GetGrafanaArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.dashboard.outputs.GetGrafanaResult] =
      val argsBuilder = com.pulumi.azure.dashboard.inputs.GetGrafanaArgs.builder
      com.pulumi.azure.dashboard.DashboardFunctions.getGrafana(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Grafana Dashboard. */
    inline def getGrafanaPlain(args: Endofunction[com.pulumi.azure.dashboard.inputs.GetGrafanaPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.dashboard.outputs.GetGrafanaResult] =
      val argsBuilder = com.pulumi.azure.dashboard.inputs.GetGrafanaPlainArgs.builder
      com.pulumi.azure.dashboard.DashboardFunctions.getGrafanaPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages a Dashboard Grafana. */
  def Grafana(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.dashboard.GrafanaArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dashboard.GrafanaArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.dashboard.Grafana(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Dashboard Grafana Managed Private Endpoint.
   * 
   * &gt; **Note:** This resource will _not_ approve the managed private endpoint connection on the linked resource. This will need to be done manually via Azure CLI, PowerShell, or AzAPI resources. See here for an example that uses AzAPI.
   */
  def GrafanaManagedPrivateEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.dashboard.GrafanaManagedPrivateEndpointArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dashboard.GrafanaManagedPrivateEndpointArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.dashboard.GrafanaManagedPrivateEndpoint(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
