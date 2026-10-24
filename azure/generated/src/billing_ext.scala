package jp.ukiba.ko_pulumi
package azure

object billing_ext:
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
