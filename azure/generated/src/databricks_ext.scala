package jp.ukiba.ko_pulumi
package azure

object databricks_ext:
  extension (builder: com.pulumi.azure.databricks.AccessConnectorArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.databricks.inputs.AccessConnectorIdentityArgs.Builder]):
        com.pulumi.azure.databricks.AccessConnectorArgs.Builder =
      val argsBuilder = com.pulumi.azure.databricks.inputs.AccessConnectorIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.databricks.WorkspaceArgs.Builder)
    /**
     * @param customParameters A `customParameters` block as documented below.
     * @return builder
     */
    inline def customParameters(args: Endofunction[com.pulumi.azure.databricks.inputs.WorkspaceCustomParametersArgs.Builder]):
        com.pulumi.azure.databricks.WorkspaceArgs.Builder =
      val argsBuilder = com.pulumi.azure.databricks.inputs.WorkspaceCustomParametersArgs.builder
      builder.customParameters(args(argsBuilder).build)

    /**
     * @param enhancedSecurityCompliance An `enhancedSecurityCompliance` block as documented below. This feature is only valid if `sku` is set to `premium`.
     * @return builder
     */
    inline def enhancedSecurityCompliance(args: Endofunction[com.pulumi.azure.databricks.inputs.WorkspaceEnhancedSecurityComplianceArgs.Builder]):
        com.pulumi.azure.databricks.WorkspaceArgs.Builder =
      val argsBuilder = com.pulumi.azure.databricks.inputs.WorkspaceEnhancedSecurityComplianceArgs.builder
      builder.enhancedSecurityCompliance(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.databricks.inputs.AccessConnectorState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.databricks.inputs.AccessConnectorIdentityArgs.Builder]):
        com.pulumi.azure.databricks.inputs.AccessConnectorState.Builder =
      val argsBuilder = com.pulumi.azure.databricks.inputs.AccessConnectorIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.databricks.inputs.WorkspaceState.Builder)
    /**
     * @param customParameters A `customParameters` block as documented below.
     * @return builder
     */
    inline def customParameters(args: Endofunction[com.pulumi.azure.databricks.inputs.WorkspaceCustomParametersArgs.Builder]):
        com.pulumi.azure.databricks.inputs.WorkspaceState.Builder =
      val argsBuilder = com.pulumi.azure.databricks.inputs.WorkspaceCustomParametersArgs.builder
      builder.customParameters(args(argsBuilder).build)

    /**
     * @param enhancedSecurityCompliance An `enhancedSecurityCompliance` block as documented below. This feature is only valid if `sku` is set to `premium`.
     * @return builder
     */
    inline def enhancedSecurityCompliance(args: Endofunction[com.pulumi.azure.databricks.inputs.WorkspaceEnhancedSecurityComplianceArgs.Builder]):
        com.pulumi.azure.databricks.inputs.WorkspaceState.Builder =
      val argsBuilder = com.pulumi.azure.databricks.inputs.WorkspaceEnhancedSecurityComplianceArgs.builder
      builder.enhancedSecurityCompliance(args(argsBuilder).build)

    /**
     * @param managedDiskIdentities A `managedDiskIdentity` block as documented below.
     * @return builder
     */
    inline def managedDiskIdentities(args: Endofunction[com.pulumi.azure.databricks.inputs.WorkspaceManagedDiskIdentityArgs.Builder]*):
        com.pulumi.azure.databricks.inputs.WorkspaceState.Builder =
      def argsBuilder = com.pulumi.azure.databricks.inputs.WorkspaceManagedDiskIdentityArgs.builder
      builder.managedDiskIdentities(args.map(_(argsBuilder).build)*)

    /**
     * @param storageAccountIdentities A `storageAccountIdentity` block as documented below.
     * @return builder
     */
    inline def storageAccountIdentities(args: Endofunction[com.pulumi.azure.databricks.inputs.WorkspaceStorageAccountIdentityArgs.Builder]*):
        com.pulumi.azure.databricks.inputs.WorkspaceState.Builder =
      def argsBuilder = com.pulumi.azure.databricks.inputs.WorkspaceStorageAccountIdentityArgs.builder
      builder.storageAccountIdentities(args.map(_(argsBuilder).build)*)
