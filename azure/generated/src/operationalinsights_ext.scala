package jp.ukiba.ko_pulumi
package azure

object operationalinsights_ext:
  extension (builder: com.pulumi.azure.operationalinsights.AnalyticsSolutionArgs.Builder)
    /**
     * @param plan A `plan` block as documented below.
     * @return builder
     */
    inline def plan(args: Endofunction[com.pulumi.azure.operationalinsights.inputs.AnalyticsSolutionPlanArgs.Builder]):
        com.pulumi.azure.operationalinsights.AnalyticsSolutionArgs.Builder =
      val argsBuilder = com.pulumi.azure.operationalinsights.inputs.AnalyticsSolutionPlanArgs.builder
      builder.plan(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.operationalinsights.AnalyticsWorkspaceArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.operationalinsights.inputs.AnalyticsWorkspaceIdentityArgs.Builder]):
        com.pulumi.azure.operationalinsights.AnalyticsWorkspaceArgs.Builder =
      val argsBuilder = com.pulumi.azure.operationalinsights.inputs.AnalyticsWorkspaceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.operationalinsights.inputs.AnalyticsSolutionState.Builder)
    /**
     * @param plan A `plan` block as documented below.
     * @return builder
     */
    inline def plan(args: Endofunction[com.pulumi.azure.operationalinsights.inputs.AnalyticsSolutionPlanArgs.Builder]):
        com.pulumi.azure.operationalinsights.inputs.AnalyticsSolutionState.Builder =
      val argsBuilder = com.pulumi.azure.operationalinsights.inputs.AnalyticsSolutionPlanArgs.builder
      builder.plan(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.operationalinsights.inputs.AnalyticsWorkspaceState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.operationalinsights.inputs.AnalyticsWorkspaceIdentityArgs.Builder]):
        com.pulumi.azure.operationalinsights.inputs.AnalyticsWorkspaceState.Builder =
      val argsBuilder = com.pulumi.azure.operationalinsights.inputs.AnalyticsWorkspaceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)
