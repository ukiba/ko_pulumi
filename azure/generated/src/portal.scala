package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object portal:
  /** Manages a shared dashboard in the Azure Portal. */
  def PortalDashboard(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.portal.PortalDashboardArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.portal.PortalDashboardArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.portal.PortalDashboard(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type PortalFunctions = com.pulumi.azure.portal.PortalFunctions
  object PortalFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.portal.PortalFunctions.*
  extension (self: PortalFunctions.type)
    /** Use this data source to access information about an existing shared dashboard in the Azure Portal. This is the data source of the `azurermDashboard` resource. */
    def azurerm_portal_dashboard(args: Endofunction[com.pulumi.azure.portal.inputs.Azurerm_portal_dashboardArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.portal.outputs.Azurerm_portal_dashboardResult] =
      val argsBuilder = com.pulumi.azure.portal.inputs.Azurerm_portal_dashboardArgs.builder
      com.pulumi.azure.portal.PortalFunctions.azurerm_portal_dashboard(args(argsBuilder).build)

    /** Use this data source to access information about an existing shared dashboard in the Azure Portal. This is the data source of the `azurermDashboard` resource. */
    def azurerm_portal_dashboardPlain(args: Endofunction[com.pulumi.azure.portal.inputs.Azurerm_portal_dashboardPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.portal.outputs.Azurerm_portal_dashboardResult] =
      val argsBuilder = com.pulumi.azure.portal.inputs.Azurerm_portal_dashboardPlainArgs.builder
      com.pulumi.azure.portal.PortalFunctions.azurerm_portal_dashboardPlain(args(argsBuilder).build)
