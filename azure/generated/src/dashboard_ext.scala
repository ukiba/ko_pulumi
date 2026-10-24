package jp.ukiba.ko_pulumi
package azure

object dashboard_ext:
  extension (builder: com.pulumi.azure.dashboard.GrafanaArgs.Builder)
    /**
     * @param azureMonitorWorkspaceIntegrations A `azureMonitorWorkspaceIntegrations` block as defined below.
     * @return builder
     */
    inline def azureMonitorWorkspaceIntegrations(args: Endofunction[com.pulumi.azure.dashboard.inputs.GrafanaAzureMonitorWorkspaceIntegrationArgs.Builder]*):
        com.pulumi.azure.dashboard.GrafanaArgs.Builder =
      def argsBuilder = com.pulumi.azure.dashboard.inputs.GrafanaAzureMonitorWorkspaceIntegrationArgs.builder
      builder.azureMonitorWorkspaceIntegrations(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below. Changing this forces a new Dashboard Grafana to be created.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.dashboard.inputs.GrafanaIdentityArgs.Builder]):
        com.pulumi.azure.dashboard.GrafanaArgs.Builder =
      val argsBuilder = com.pulumi.azure.dashboard.inputs.GrafanaIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param smtp A `smtp` block as defined below.
     * @return builder
     */
    inline def smtp(args: Endofunction[com.pulumi.azure.dashboard.inputs.GrafanaSmtpArgs.Builder]):
        com.pulumi.azure.dashboard.GrafanaArgs.Builder =
      val argsBuilder = com.pulumi.azure.dashboard.inputs.GrafanaSmtpArgs.builder
      builder.smtp(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.dashboard.inputs.GetGrafanaArgs.Builder)
    /**
     * @param identity The managed identity of the grafana resource.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.dashboard.inputs.GetGrafanaIdentityArgs.Builder]):
        com.pulumi.azure.dashboard.inputs.GetGrafanaArgs.Builder =
      val argsBuilder = com.pulumi.azure.dashboard.inputs.GetGrafanaIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.dashboard.inputs.GetGrafanaPlainArgs.Builder)
    /**
     * @param identity The managed identity of the grafana resource.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.dashboard.inputs.GetGrafanaIdentity.Builder]):
        com.pulumi.azure.dashboard.inputs.GetGrafanaPlainArgs.Builder =
      val argsBuilder = com.pulumi.azure.dashboard.inputs.GetGrafanaIdentity.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.dashboard.inputs.GrafanaState.Builder)
    /**
     * @param azureMonitorWorkspaceIntegrations A `azureMonitorWorkspaceIntegrations` block as defined below.
     * @return builder
     */
    inline def azureMonitorWorkspaceIntegrations(args: Endofunction[com.pulumi.azure.dashboard.inputs.GrafanaAzureMonitorWorkspaceIntegrationArgs.Builder]*):
        com.pulumi.azure.dashboard.inputs.GrafanaState.Builder =
      def argsBuilder = com.pulumi.azure.dashboard.inputs.GrafanaAzureMonitorWorkspaceIntegrationArgs.builder
      builder.azureMonitorWorkspaceIntegrations(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below. Changing this forces a new Dashboard Grafana to be created.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.dashboard.inputs.GrafanaIdentityArgs.Builder]):
        com.pulumi.azure.dashboard.inputs.GrafanaState.Builder =
      val argsBuilder = com.pulumi.azure.dashboard.inputs.GrafanaIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param smtp A `smtp` block as defined below.
     * @return builder
     */
    inline def smtp(args: Endofunction[com.pulumi.azure.dashboard.inputs.GrafanaSmtpArgs.Builder]):
        com.pulumi.azure.dashboard.inputs.GrafanaState.Builder =
      val argsBuilder = com.pulumi.azure.dashboard.inputs.GrafanaSmtpArgs.builder
      builder.smtp(args(argsBuilder).build)
