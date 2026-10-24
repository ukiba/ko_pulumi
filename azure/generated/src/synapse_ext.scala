package jp.ukiba.ko_pulumi
package azure

object synapse_ext:
  extension (builder: com.pulumi.azure.synapse.LinkedServiceArgs.Builder)
    /**
     * @param integrationRuntime A `integrationRuntime` block as defined below.
     * @return builder
     */
    inline def integrationRuntime(args: Endofunction[com.pulumi.azure.synapse.inputs.LinkedServiceIntegrationRuntimeArgs.Builder]):
        com.pulumi.azure.synapse.LinkedServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.LinkedServiceIntegrationRuntimeArgs.builder
      builder.integrationRuntime(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.synapse.SparkPoolArgs.Builder)
    /**
     * @param autoPause An `autoPause` block as defined below.
     * @return builder
     */
    inline def autoPause(args: Endofunction[com.pulumi.azure.synapse.inputs.SparkPoolAutoPauseArgs.Builder]):
        com.pulumi.azure.synapse.SparkPoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.SparkPoolAutoPauseArgs.builder
      builder.autoPause(args(argsBuilder).build)

    /**
     * @param autoScale An `autoScale` block as defined below. Exactly one of `nodeCount` or `autoScale` must be specified.
     * @return builder
     */
    inline def autoScale(args: Endofunction[com.pulumi.azure.synapse.inputs.SparkPoolAutoScaleArgs.Builder]):
        com.pulumi.azure.synapse.SparkPoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.SparkPoolAutoScaleArgs.builder
      builder.autoScale(args(argsBuilder).build)

    inline def libraryRequirement(args: Endofunction[com.pulumi.azure.synapse.inputs.SparkPoolLibraryRequirementArgs.Builder]):
        com.pulumi.azure.synapse.SparkPoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.SparkPoolLibraryRequirementArgs.builder
      builder.libraryRequirement(args(argsBuilder).build)

    inline def sparkConfig(args: Endofunction[com.pulumi.azure.synapse.inputs.SparkPoolSparkConfigArgs.Builder]):
        com.pulumi.azure.synapse.SparkPoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.SparkPoolSparkConfigArgs.builder
      builder.sparkConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.synapse.SqlPoolArgs.Builder)
    /**
     * @param restore A `restore` block as defined below. Only applicable when `createMode` is set to `PointInTimeRestore`. Changing this forces a new Synapse SQL Pool to be created.
     * @return builder
     */
    inline def restore(args: Endofunction[com.pulumi.azure.synapse.inputs.SqlPoolRestoreArgs.Builder]):
        com.pulumi.azure.synapse.SqlPoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.SqlPoolRestoreArgs.builder
      builder.restore(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.synapse.SqlPoolVulnerabilityAssessmentArgs.Builder)
    /**
     * @param recurringScans The recurring scans settings. The `recurringScans` block supports fields documented below.
     * @return builder
     */
    inline def recurringScans(args: Endofunction[com.pulumi.azure.synapse.inputs.SqlPoolVulnerabilityAssessmentRecurringScansArgs.Builder]):
        com.pulumi.azure.synapse.SqlPoolVulnerabilityAssessmentArgs.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.SqlPoolVulnerabilityAssessmentRecurringScansArgs.builder
      builder.recurringScans(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.synapse.SqlPoolVulnerabilityAssessmentBaselineArgs.Builder)
    /**
     * @param baselines One or more `baseline` blocks as defined below.
     * @return builder
     */
    inline def baselines(args: Endofunction[com.pulumi.azure.synapse.inputs.SqlPoolVulnerabilityAssessmentBaselineBaselineArgs.Builder]*):
        com.pulumi.azure.synapse.SqlPoolVulnerabilityAssessmentBaselineArgs.Builder =
      def argsBuilder = com.pulumi.azure.synapse.inputs.SqlPoolVulnerabilityAssessmentBaselineBaselineArgs.builder
      builder.baselines(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.synapse.WorkspaceArgs.Builder)
    /**
     * @param azureDevopsRepo An `azureDevopsRepo` block as defined below.
     * @return builder
     */
    inline def azureDevopsRepo(args: Endofunction[com.pulumi.azure.synapse.inputs.WorkspaceAzureDevopsRepoArgs.Builder]):
        com.pulumi.azure.synapse.WorkspaceArgs.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.WorkspaceAzureDevopsRepoArgs.builder
      builder.azureDevopsRepo(args(argsBuilder).build)

    /**
     * @param customerManagedKey A `customerManagedKey` block as defined below.
     * @return builder
     */
    inline def customerManagedKey(args: Endofunction[com.pulumi.azure.synapse.inputs.WorkspaceCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.synapse.WorkspaceArgs.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.WorkspaceCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param githubRepo A `githubRepo` block as defined below.
     * @return builder
     */
    inline def githubRepo(args: Endofunction[com.pulumi.azure.synapse.inputs.WorkspaceGithubRepoArgs.Builder]):
        com.pulumi.azure.synapse.WorkspaceArgs.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.WorkspaceGithubRepoArgs.builder
      builder.githubRepo(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.synapse.inputs.WorkspaceIdentityArgs.Builder]):
        com.pulumi.azure.synapse.WorkspaceArgs.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.WorkspaceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.synapse.WorkspaceVulnerabilityAssessmentArgs.Builder)
    /**
     * @param recurringScans The recurring scans settings. The `recurringScans` block supports fields documented below.
     * @return builder
     */
    inline def recurringScans(args: Endofunction[com.pulumi.azure.synapse.inputs.WorkspaceVulnerabilityAssessmentRecurringScansArgs.Builder]):
        com.pulumi.azure.synapse.WorkspaceVulnerabilityAssessmentArgs.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.WorkspaceVulnerabilityAssessmentRecurringScansArgs.builder
      builder.recurringScans(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.synapse.inputs.LinkedServiceState.Builder)
    /**
     * @param integrationRuntime A `integrationRuntime` block as defined below.
     * @return builder
     */
    inline def integrationRuntime(args: Endofunction[com.pulumi.azure.synapse.inputs.LinkedServiceIntegrationRuntimeArgs.Builder]):
        com.pulumi.azure.synapse.inputs.LinkedServiceState.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.LinkedServiceIntegrationRuntimeArgs.builder
      builder.integrationRuntime(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.synapse.inputs.SparkPoolState.Builder)
    /**
     * @param autoPause An `autoPause` block as defined below.
     * @return builder
     */
    inline def autoPause(args: Endofunction[com.pulumi.azure.synapse.inputs.SparkPoolAutoPauseArgs.Builder]):
        com.pulumi.azure.synapse.inputs.SparkPoolState.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.SparkPoolAutoPauseArgs.builder
      builder.autoPause(args(argsBuilder).build)

    /**
     * @param autoScale An `autoScale` block as defined below. Exactly one of `nodeCount` or `autoScale` must be specified.
     * @return builder
     */
    inline def autoScale(args: Endofunction[com.pulumi.azure.synapse.inputs.SparkPoolAutoScaleArgs.Builder]):
        com.pulumi.azure.synapse.inputs.SparkPoolState.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.SparkPoolAutoScaleArgs.builder
      builder.autoScale(args(argsBuilder).build)

    inline def libraryRequirement(args: Endofunction[com.pulumi.azure.synapse.inputs.SparkPoolLibraryRequirementArgs.Builder]):
        com.pulumi.azure.synapse.inputs.SparkPoolState.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.SparkPoolLibraryRequirementArgs.builder
      builder.libraryRequirement(args(argsBuilder).build)

    inline def sparkConfig(args: Endofunction[com.pulumi.azure.synapse.inputs.SparkPoolSparkConfigArgs.Builder]):
        com.pulumi.azure.synapse.inputs.SparkPoolState.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.SparkPoolSparkConfigArgs.builder
      builder.sparkConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.synapse.inputs.SqlPoolState.Builder)
    /**
     * @param restore A `restore` block as defined below. Only applicable when `createMode` is set to `PointInTimeRestore`. Changing this forces a new Synapse SQL Pool to be created.
     * @return builder
     */
    inline def restore(args: Endofunction[com.pulumi.azure.synapse.inputs.SqlPoolRestoreArgs.Builder]):
        com.pulumi.azure.synapse.inputs.SqlPoolState.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.SqlPoolRestoreArgs.builder
      builder.restore(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.synapse.inputs.SqlPoolVulnerabilityAssessmentBaselineState.Builder)
    /**
     * @param baselines One or more `baseline` blocks as defined below.
     * @return builder
     */
    inline def baselines(args: Endofunction[com.pulumi.azure.synapse.inputs.SqlPoolVulnerabilityAssessmentBaselineBaselineArgs.Builder]*):
        com.pulumi.azure.synapse.inputs.SqlPoolVulnerabilityAssessmentBaselineState.Builder =
      def argsBuilder = com.pulumi.azure.synapse.inputs.SqlPoolVulnerabilityAssessmentBaselineBaselineArgs.builder
      builder.baselines(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.synapse.inputs.SqlPoolVulnerabilityAssessmentState.Builder)
    /**
     * @param recurringScans The recurring scans settings. The `recurringScans` block supports fields documented below.
     * @return builder
     */
    inline def recurringScans(args: Endofunction[com.pulumi.azure.synapse.inputs.SqlPoolVulnerabilityAssessmentRecurringScansArgs.Builder]):
        com.pulumi.azure.synapse.inputs.SqlPoolVulnerabilityAssessmentState.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.SqlPoolVulnerabilityAssessmentRecurringScansArgs.builder
      builder.recurringScans(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.synapse.inputs.WorkspaceState.Builder)
    /**
     * @param azureDevopsRepo An `azureDevopsRepo` block as defined below.
     * @return builder
     */
    inline def azureDevopsRepo(args: Endofunction[com.pulumi.azure.synapse.inputs.WorkspaceAzureDevopsRepoArgs.Builder]):
        com.pulumi.azure.synapse.inputs.WorkspaceState.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.WorkspaceAzureDevopsRepoArgs.builder
      builder.azureDevopsRepo(args(argsBuilder).build)

    /**
     * @param customerManagedKey A `customerManagedKey` block as defined below.
     * @return builder
     */
    inline def customerManagedKey(args: Endofunction[com.pulumi.azure.synapse.inputs.WorkspaceCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.synapse.inputs.WorkspaceState.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.WorkspaceCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param githubRepo A `githubRepo` block as defined below.
     * @return builder
     */
    inline def githubRepo(args: Endofunction[com.pulumi.azure.synapse.inputs.WorkspaceGithubRepoArgs.Builder]):
        com.pulumi.azure.synapse.inputs.WorkspaceState.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.WorkspaceGithubRepoArgs.builder
      builder.githubRepo(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.synapse.inputs.WorkspaceIdentityArgs.Builder]):
        com.pulumi.azure.synapse.inputs.WorkspaceState.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.WorkspaceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.synapse.inputs.WorkspaceVulnerabilityAssessmentState.Builder)
    /**
     * @param recurringScans The recurring scans settings. The `recurringScans` block supports fields documented below.
     * @return builder
     */
    inline def recurringScans(args: Endofunction[com.pulumi.azure.synapse.inputs.WorkspaceVulnerabilityAssessmentRecurringScansArgs.Builder]):
        com.pulumi.azure.synapse.inputs.WorkspaceVulnerabilityAssessmentState.Builder =
      val argsBuilder = com.pulumi.azure.synapse.inputs.WorkspaceVulnerabilityAssessmentRecurringScansArgs.builder
      builder.recurringScans(args(argsBuilder).build)
