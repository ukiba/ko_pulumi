package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object billing:
  type BillingFunctions = com.pulumi.azure.billing.BillingFunctions
  object BillingFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.billing.BillingFunctions.*
  extension (self: BillingFunctions.type)
    /** Use this data source to access information about an existing Enrollment Account Billing Scope. */
    def getEnrollmentAccountScope(args: Endofunction[com.pulumi.azure.billing.inputs.GetEnrollmentAccountScopeArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.billing.outputs.GetEnrollmentAccountScopeResult] =
      val argsBuilder = com.pulumi.azure.billing.inputs.GetEnrollmentAccountScopeArgs.builder
      com.pulumi.azure.billing.BillingFunctions.getEnrollmentAccountScope(args(argsBuilder).build)

    /** Use this data source to access information about an existing Enrollment Account Billing Scope. */
    def getEnrollmentAccountScopePlain(args: Endofunction[com.pulumi.azure.billing.inputs.GetEnrollmentAccountScopePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.billing.outputs.GetEnrollmentAccountScopeResult] =
      val argsBuilder = com.pulumi.azure.billing.inputs.GetEnrollmentAccountScopePlainArgs.builder
      com.pulumi.azure.billing.BillingFunctions.getEnrollmentAccountScopePlain(args(argsBuilder).build)

    /** Use this data source to access an ID for your MCA Account billing scope. */
    def getMcaAccountScope(args: Endofunction[com.pulumi.azure.billing.inputs.GetMcaAccountScopeArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.billing.outputs.GetMcaAccountScopeResult] =
      val argsBuilder = com.pulumi.azure.billing.inputs.GetMcaAccountScopeArgs.builder
      com.pulumi.azure.billing.BillingFunctions.getMcaAccountScope(args(argsBuilder).build)

    /** Use this data source to access an ID for your MCA Account billing scope. */
    def getMcaAccountScopePlain(args: Endofunction[com.pulumi.azure.billing.inputs.GetMcaAccountScopePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.billing.outputs.GetMcaAccountScopeResult] =
      val argsBuilder = com.pulumi.azure.billing.inputs.GetMcaAccountScopePlainArgs.builder
      com.pulumi.azure.billing.BillingFunctions.getMcaAccountScopePlain(args(argsBuilder).build)

    /** Use this data source to access an ID for your MPA Account billing scope. */
    def getMpaAccountScope(args: Endofunction[com.pulumi.azure.billing.inputs.GetMpaAccountScopeArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.billing.outputs.GetMpaAccountScopeResult] =
      val argsBuilder = com.pulumi.azure.billing.inputs.GetMpaAccountScopeArgs.builder
      com.pulumi.azure.billing.BillingFunctions.getMpaAccountScope(args(argsBuilder).build)

    /** Use this data source to access an ID for your MPA Account billing scope. */
    def getMpaAccountScopePlain(args: Endofunction[com.pulumi.azure.billing.inputs.GetMpaAccountScopePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.billing.outputs.GetMpaAccountScopeResult] =
      val argsBuilder = com.pulumi.azure.billing.inputs.GetMpaAccountScopePlainArgs.builder
      com.pulumi.azure.billing.BillingFunctions.getMpaAccountScopePlain(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.billing.AccountCostManagementExportArgs.Builder)
    /**
     * @param exportDataOptions A `exportDataOptions` block as defined below.
     * @return builder
     */
    def exportDataOptions(args: Endofunction[com.pulumi.azure.billing.inputs.AccountCostManagementExportExportDataOptionsArgs.Builder]):
        com.pulumi.azure.billing.AccountCostManagementExportArgs.Builder =
      val argsBuilder = com.pulumi.azure.billing.inputs.AccountCostManagementExportExportDataOptionsArgs.builder
      builder.exportDataOptions(args(argsBuilder).build)

    /**
     * @param exportDataStorageLocation A `exportDataStorageLocation` block as defined below.
     * @return builder
     */
    def exportDataStorageLocation(args: Endofunction[com.pulumi.azure.billing.inputs.AccountCostManagementExportExportDataStorageLocationArgs.Builder]):
        com.pulumi.azure.billing.AccountCostManagementExportArgs.Builder =
      val argsBuilder = com.pulumi.azure.billing.inputs.AccountCostManagementExportExportDataStorageLocationArgs.builder
      builder.exportDataStorageLocation(args(argsBuilder).build)

  /** Manages a Cost Management Export for a Billing Account. */
  def AccountCostManagementExport(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.billing.AccountCostManagementExportArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.billing.AccountCostManagementExportArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.billing.AccountCostManagementExport(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.billing.inputs.AccountCostManagementExportState.Builder)
    /**
     * @param exportDataOptions A `exportDataOptions` block as defined below.
     * @return builder
     */
    def exportDataOptions(args: Endofunction[com.pulumi.azure.billing.inputs.AccountCostManagementExportExportDataOptionsArgs.Builder]):
        com.pulumi.azure.billing.inputs.AccountCostManagementExportState.Builder =
      val argsBuilder = com.pulumi.azure.billing.inputs.AccountCostManagementExportExportDataOptionsArgs.builder
      builder.exportDataOptions(args(argsBuilder).build)

    /**
     * @param exportDataStorageLocation A `exportDataStorageLocation` block as defined below.
     * @return builder
     */
    def exportDataStorageLocation(args: Endofunction[com.pulumi.azure.billing.inputs.AccountCostManagementExportExportDataStorageLocationArgs.Builder]):
        com.pulumi.azure.billing.inputs.AccountCostManagementExportState.Builder =
      val argsBuilder = com.pulumi.azure.billing.inputs.AccountCostManagementExportExportDataStorageLocationArgs.builder
      builder.exportDataStorageLocation(args(argsBuilder).build)
