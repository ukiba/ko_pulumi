package jp.ukiba.ko_pulumi
package azure

object core_ext:
  extension (builder: com.pulumi.azure.core.CustomProviderArgs.Builder)
    /**
     * @param actions Any number of `action` block as defined below. One of `resourceType` or `action` must be specified.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.azure.core.inputs.CustomProviderActionArgs.Builder]*):
        com.pulumi.azure.core.CustomProviderArgs.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.CustomProviderActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceTypes Any number of `resourceType` block as defined below. One of `resourceType` or `action` must be specified.
     * @return builder
     */
    def resourceTypes(args: Endofunction[com.pulumi.azure.core.inputs.CustomProviderResourceTypeArgs.Builder]*):
        com.pulumi.azure.core.CustomProviderArgs.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.CustomProviderResourceTypeArgs.builder
      builder.resourceTypes(args.map(_(argsBuilder).build)*)

    /**
     * @param validations Any number of `validation` block as defined below.
     * @return builder
     */
    def validations(args: Endofunction[com.pulumi.azure.core.inputs.CustomProviderValidationArgs.Builder]*):
        com.pulumi.azure.core.CustomProviderArgs.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.CustomProviderValidationArgs.builder
      builder.validations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.core.ResourceDeploymentScriptAzureCliArgs.Builder)
    /**
     * @param container A `container` block as defined below. Changing this forces a new Resource Deployment Script to be created.
     * @return builder
     */
    def container(args: Endofunction[com.pulumi.azure.core.inputs.ResourceDeploymentScriptAzureCliContainerArgs.Builder]):
        com.pulumi.azure.core.ResourceDeploymentScriptAzureCliArgs.Builder =
      val argsBuilder = com.pulumi.azure.core.inputs.ResourceDeploymentScriptAzureCliContainerArgs.builder
      builder.container(args(argsBuilder).build)

    /**
     * @param environmentVariables An `environmentVariable` block as defined below. Changing this forces a new Resource Deployment Script to be created.
     * @return builder
     */
    def environmentVariables(args: Endofunction[com.pulumi.azure.core.inputs.ResourceDeploymentScriptAzureCliEnvironmentVariableArgs.Builder]*):
        com.pulumi.azure.core.ResourceDeploymentScriptAzureCliArgs.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.ResourceDeploymentScriptAzureCliEnvironmentVariableArgs.builder
      builder.environmentVariables(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below. Changing this forces a new Resource Deployment Script to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.core.inputs.ResourceDeploymentScriptAzureCliIdentityArgs.Builder]):
        com.pulumi.azure.core.ResourceDeploymentScriptAzureCliArgs.Builder =
      val argsBuilder = com.pulumi.azure.core.inputs.ResourceDeploymentScriptAzureCliIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param storageAccount A `storageAccount` block as defined below. Changing this forces a new Resource Deployment Script to be created.
     * @return builder
     */
    def storageAccount(args: Endofunction[com.pulumi.azure.core.inputs.ResourceDeploymentScriptAzureCliStorageAccountArgs.Builder]):
        com.pulumi.azure.core.ResourceDeploymentScriptAzureCliArgs.Builder =
      val argsBuilder = com.pulumi.azure.core.inputs.ResourceDeploymentScriptAzureCliStorageAccountArgs.builder
      builder.storageAccount(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.core.ResourceDeploymentScriptPowerShellArgs.Builder)
    /**
     * @param container A `container` block as defined below. Changing this forces a new Resource Deployment Script to be created.
     * @return builder
     */
    def container(args: Endofunction[com.pulumi.azure.core.inputs.ResourceDeploymentScriptPowerShellContainerArgs.Builder]):
        com.pulumi.azure.core.ResourceDeploymentScriptPowerShellArgs.Builder =
      val argsBuilder = com.pulumi.azure.core.inputs.ResourceDeploymentScriptPowerShellContainerArgs.builder
      builder.container(args(argsBuilder).build)

    /**
     * @param environmentVariables An `environmentVariable` block as defined below. Changing this forces a new Resource Deployment Script to be created.
     * @return builder
     */
    def environmentVariables(args: Endofunction[com.pulumi.azure.core.inputs.ResourceDeploymentScriptPowerShellEnvironmentVariableArgs.Builder]*):
        com.pulumi.azure.core.ResourceDeploymentScriptPowerShellArgs.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.ResourceDeploymentScriptPowerShellEnvironmentVariableArgs.builder
      builder.environmentVariables(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below. Changing this forces a new Resource Deployment Script to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.core.inputs.ResourceDeploymentScriptPowerShellIdentityArgs.Builder]):
        com.pulumi.azure.core.ResourceDeploymentScriptPowerShellArgs.Builder =
      val argsBuilder = com.pulumi.azure.core.inputs.ResourceDeploymentScriptPowerShellIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param storageAccount A `storageAccount` block as defined below. Changing this forces a new Resource Deployment Script to be created.
     * @return builder
     */
    def storageAccount(args: Endofunction[com.pulumi.azure.core.inputs.ResourceDeploymentScriptPowerShellStorageAccountArgs.Builder]):
        com.pulumi.azure.core.ResourceDeploymentScriptPowerShellArgs.Builder =
      val argsBuilder = com.pulumi.azure.core.inputs.ResourceDeploymentScriptPowerShellStorageAccountArgs.builder
      builder.storageAccount(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.core.ResourceGroupCostManagementExportArgs.Builder)
    /**
     * @param exportDataOptions A `exportDataOptions` block as defined below.
     * @return builder
     */
    def exportDataOptions(args: Endofunction[com.pulumi.azure.core.inputs.ResourceGroupCostManagementExportExportDataOptionsArgs.Builder]):
        com.pulumi.azure.core.ResourceGroupCostManagementExportArgs.Builder =
      val argsBuilder = com.pulumi.azure.core.inputs.ResourceGroupCostManagementExportExportDataOptionsArgs.builder
      builder.exportDataOptions(args(argsBuilder).build)

    /**
     * @param exportDataStorageLocation A `exportDataStorageLocation` block as defined below.
     * @return builder
     */
    def exportDataStorageLocation(args: Endofunction[com.pulumi.azure.core.inputs.ResourceGroupCostManagementExportExportDataStorageLocationArgs.Builder]):
        com.pulumi.azure.core.ResourceGroupCostManagementExportArgs.Builder =
      val argsBuilder = com.pulumi.azure.core.inputs.ResourceGroupCostManagementExportExportDataStorageLocationArgs.builder
      builder.exportDataStorageLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.core.ResourceGroupCostManagementViewArgs.Builder)
    /**
     * @param dataset A `dataset` block as defined below.
     * @return builder
     */
    def dataset(args: Endofunction[com.pulumi.azure.core.inputs.ResourceGroupCostManagementViewDatasetArgs.Builder]):
        com.pulumi.azure.core.ResourceGroupCostManagementViewArgs.Builder =
      val argsBuilder = com.pulumi.azure.core.inputs.ResourceGroupCostManagementViewDatasetArgs.builder
      builder.dataset(args(argsBuilder).build)

    /**
     * @param kpis One or more `kpi` blocks as defined below, to show in Cost Analysis UI.
     * @return builder
     */
    def kpis(args: Endofunction[com.pulumi.azure.core.inputs.ResourceGroupCostManagementViewKpiArgs.Builder]*):
        com.pulumi.azure.core.ResourceGroupCostManagementViewArgs.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.ResourceGroupCostManagementViewKpiArgs.builder
      builder.kpis(args.map(_(argsBuilder).build)*)

    /**
     * @param pivots One or more `pivot` blocks as defined below, containing the configuration of 3 sub-views in the Cost Analysis UI. Non table views should have three pivots.
     * @return builder
     */
    def pivots(args: Endofunction[com.pulumi.azure.core.inputs.ResourceGroupCostManagementViewPivotArgs.Builder]*):
        com.pulumi.azure.core.ResourceGroupCostManagementViewArgs.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.ResourceGroupCostManagementViewPivotArgs.builder
      builder.pivots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.core.ResourceGroupPolicyAssignmentArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * 
     * &gt; **Note:** The `location` field must also be specified when `identity` is specified.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.core.inputs.ResourceGroupPolicyAssignmentIdentityArgs.Builder]):
        com.pulumi.azure.core.ResourceGroupPolicyAssignmentArgs.Builder =
      val argsBuilder = com.pulumi.azure.core.inputs.ResourceGroupPolicyAssignmentIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param nonComplianceMessages One or more `nonComplianceMessage` blocks as defined below.
     * @return builder
     */
    def nonComplianceMessages(args: Endofunction[com.pulumi.azure.core.inputs.ResourceGroupPolicyAssignmentNonComplianceMessageArgs.Builder]*):
        com.pulumi.azure.core.ResourceGroupPolicyAssignmentArgs.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.ResourceGroupPolicyAssignmentNonComplianceMessageArgs.builder
      builder.nonComplianceMessages(args.map(_(argsBuilder).build)*)

    /**
     * @param overrides One or more `overrides` blocks as defined below. More detail about `overrides` and `resourceSelectors` see [policy assignment structure](https://learn.microsoft.com/en-us/azure/governance/policy/concepts/assignment-structure)
     * @return builder
     */
    def overrides(args: Endofunction[com.pulumi.azure.core.inputs.ResourceGroupPolicyAssignmentOverrideArgs.Builder]*):
        com.pulumi.azure.core.ResourceGroupPolicyAssignmentArgs.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.ResourceGroupPolicyAssignmentOverrideArgs.builder
      builder.overrides(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceSelectors One or more `resourceSelectors` blocks as defined below to filter polices by resource properties.
     * @return builder
     */
    def resourceSelectors(args: Endofunction[com.pulumi.azure.core.inputs.ResourceGroupPolicyAssignmentResourceSelectorArgs.Builder]*):
        com.pulumi.azure.core.ResourceGroupPolicyAssignmentArgs.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.ResourceGroupPolicyAssignmentResourceSelectorArgs.builder
      builder.resourceSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.core.ResourcePolicyAssignmentArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * 
     * &gt; **Note:** The `location` field must also be specified when `identity` is specified.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.core.inputs.ResourcePolicyAssignmentIdentityArgs.Builder]):
        com.pulumi.azure.core.ResourcePolicyAssignmentArgs.Builder =
      val argsBuilder = com.pulumi.azure.core.inputs.ResourcePolicyAssignmentIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param nonComplianceMessages One or more `nonComplianceMessage` blocks as defined below.
     * @return builder
     */
    def nonComplianceMessages(args: Endofunction[com.pulumi.azure.core.inputs.ResourcePolicyAssignmentNonComplianceMessageArgs.Builder]*):
        com.pulumi.azure.core.ResourcePolicyAssignmentArgs.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.ResourcePolicyAssignmentNonComplianceMessageArgs.builder
      builder.nonComplianceMessages(args.map(_(argsBuilder).build)*)

    /**
     * @param overrides One or more `overrides` blocks as defined below. More detail about `overrides` and `resourceSelectors` see [policy assignment structure](https://learn.microsoft.com/en-us/azure/governance/policy/concepts/assignment-structure)
     * @return builder
     */
    def overrides(args: Endofunction[com.pulumi.azure.core.inputs.ResourcePolicyAssignmentOverrideArgs.Builder]*):
        com.pulumi.azure.core.ResourcePolicyAssignmentArgs.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.ResourcePolicyAssignmentOverrideArgs.builder
      builder.overrides(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceSelectors One or more `resourceSelectors` blocks as defined below to filter polices by resource properties.
     * @return builder
     */
    def resourceSelectors(args: Endofunction[com.pulumi.azure.core.inputs.ResourcePolicyAssignmentResourceSelectorArgs.Builder]*):
        com.pulumi.azure.core.ResourcePolicyAssignmentArgs.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.ResourcePolicyAssignmentResourceSelectorArgs.builder
      builder.resourceSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.core.ResourceProviderRegistrationArgs.Builder)
    /**
     * @param features A list of `feature` blocks as defined below.
     * 
     * &gt; **Note:** The `feature` block allows a Preview Feature to be explicitly Registered or Unregistered for this Resource Provider - once a Feature has been explicitly Registered or Unregistered, it must be specified in the Terraform Configuration (it&#39;s not possible to reset this to the default, unspecified, state).
     * @return builder
     */
    def features(args: Endofunction[com.pulumi.azure.core.inputs.ResourceProviderRegistrationFeatureArgs.Builder]*):
        com.pulumi.azure.core.ResourceProviderRegistrationArgs.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.ResourceProviderRegistrationFeatureArgs.builder
      builder.features(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.core.SubscriptionCostManagementExportArgs.Builder)
    /**
     * @param exportDataOptions A `exportDataOptions` block as defined below.
     * @return builder
     */
    def exportDataOptions(args: Endofunction[com.pulumi.azure.core.inputs.SubscriptionCostManagementExportExportDataOptionsArgs.Builder]):
        com.pulumi.azure.core.SubscriptionCostManagementExportArgs.Builder =
      val argsBuilder = com.pulumi.azure.core.inputs.SubscriptionCostManagementExportExportDataOptionsArgs.builder
      builder.exportDataOptions(args(argsBuilder).build)

    /**
     * @param exportDataStorageLocation A `exportDataStorageLocation` block as defined below.
     * @return builder
     */
    def exportDataStorageLocation(args: Endofunction[com.pulumi.azure.core.inputs.SubscriptionCostManagementExportExportDataStorageLocationArgs.Builder]):
        com.pulumi.azure.core.SubscriptionCostManagementExportArgs.Builder =
      val argsBuilder = com.pulumi.azure.core.inputs.SubscriptionCostManagementExportExportDataStorageLocationArgs.builder
      builder.exportDataStorageLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.core.SubscriptionCostManagementViewArgs.Builder)
    /**
     * @param dataset A `dataset` block as defined below.
     * @return builder
     */
    def dataset(args: Endofunction[com.pulumi.azure.core.inputs.SubscriptionCostManagementViewDatasetArgs.Builder]):
        com.pulumi.azure.core.SubscriptionCostManagementViewArgs.Builder =
      val argsBuilder = com.pulumi.azure.core.inputs.SubscriptionCostManagementViewDatasetArgs.builder
      builder.dataset(args(argsBuilder).build)

    /**
     * @param kpis One or more `kpi` blocks as defined below, to show in Cost Analysis UI.
     * @return builder
     */
    def kpis(args: Endofunction[com.pulumi.azure.core.inputs.SubscriptionCostManagementViewKpiArgs.Builder]*):
        com.pulumi.azure.core.SubscriptionCostManagementViewArgs.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.SubscriptionCostManagementViewKpiArgs.builder
      builder.kpis(args.map(_(argsBuilder).build)*)

    /**
     * @param pivots One or more `pivot` blocks as defined below, containing the configuration of 3 sub-views in the Cost Analysis UI. Non table views should have three pivots.
     * @return builder
     */
    def pivots(args: Endofunction[com.pulumi.azure.core.inputs.SubscriptionCostManagementViewPivotArgs.Builder]*):
        com.pulumi.azure.core.SubscriptionCostManagementViewArgs.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.SubscriptionCostManagementViewPivotArgs.builder
      builder.pivots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.core.SubscriptionPolicyAssignmentArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * 
     * &gt; **Note:** The `location` field must also be specified when `identity` is specified.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.core.inputs.SubscriptionPolicyAssignmentIdentityArgs.Builder]):
        com.pulumi.azure.core.SubscriptionPolicyAssignmentArgs.Builder =
      val argsBuilder = com.pulumi.azure.core.inputs.SubscriptionPolicyAssignmentIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param nonComplianceMessages One or more `nonComplianceMessage` blocks as defined below.
     * @return builder
     */
    def nonComplianceMessages(args: Endofunction[com.pulumi.azure.core.inputs.SubscriptionPolicyAssignmentNonComplianceMessageArgs.Builder]*):
        com.pulumi.azure.core.SubscriptionPolicyAssignmentArgs.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.SubscriptionPolicyAssignmentNonComplianceMessageArgs.builder
      builder.nonComplianceMessages(args.map(_(argsBuilder).build)*)

    /**
     * @param overrides One or more `overrides` blocks as defined below. More detail about `overrides` and `resourceSelectors` see [policy assignment structure](https://learn.microsoft.com/en-us/azure/governance/policy/concepts/assignment-structure)
     * @return builder
     */
    def overrides(args: Endofunction[com.pulumi.azure.core.inputs.SubscriptionPolicyAssignmentOverrideArgs.Builder]*):
        com.pulumi.azure.core.SubscriptionPolicyAssignmentArgs.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.SubscriptionPolicyAssignmentOverrideArgs.builder
      builder.overrides(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceSelectors One or more `resourceSelectors` blocks as defined below to filter polices by resource properties.
     * @return builder
     */
    def resourceSelectors(args: Endofunction[com.pulumi.azure.core.inputs.SubscriptionPolicyAssignmentResourceSelectorArgs.Builder]*):
        com.pulumi.azure.core.SubscriptionPolicyAssignmentArgs.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.SubscriptionPolicyAssignmentResourceSelectorArgs.builder
      builder.resourceSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.core.inputs.CustomProviderState.Builder)
    /**
     * @param actions Any number of `action` block as defined below. One of `resourceType` or `action` must be specified.
     * @return builder
     */
    def actions(args: Endofunction[com.pulumi.azure.core.inputs.CustomProviderActionArgs.Builder]*):
        com.pulumi.azure.core.inputs.CustomProviderState.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.CustomProviderActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceTypes Any number of `resourceType` block as defined below. One of `resourceType` or `action` must be specified.
     * @return builder
     */
    def resourceTypes(args: Endofunction[com.pulumi.azure.core.inputs.CustomProviderResourceTypeArgs.Builder]*):
        com.pulumi.azure.core.inputs.CustomProviderState.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.CustomProviderResourceTypeArgs.builder
      builder.resourceTypes(args.map(_(argsBuilder).build)*)

    /**
     * @param validations Any number of `validation` block as defined below.
     * @return builder
     */
    def validations(args: Endofunction[com.pulumi.azure.core.inputs.CustomProviderValidationArgs.Builder]*):
        com.pulumi.azure.core.inputs.CustomProviderState.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.CustomProviderValidationArgs.builder
      builder.validations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.core.inputs.ResourceDeploymentScriptAzureCliState.Builder)
    /**
     * @param container A `container` block as defined below. Changing this forces a new Resource Deployment Script to be created.
     * @return builder
     */
    def container(args: Endofunction[com.pulumi.azure.core.inputs.ResourceDeploymentScriptAzureCliContainerArgs.Builder]):
        com.pulumi.azure.core.inputs.ResourceDeploymentScriptAzureCliState.Builder =
      val argsBuilder = com.pulumi.azure.core.inputs.ResourceDeploymentScriptAzureCliContainerArgs.builder
      builder.container(args(argsBuilder).build)

    /**
     * @param environmentVariables An `environmentVariable` block as defined below. Changing this forces a new Resource Deployment Script to be created.
     * @return builder
     */
    def environmentVariables(args: Endofunction[com.pulumi.azure.core.inputs.ResourceDeploymentScriptAzureCliEnvironmentVariableArgs.Builder]*):
        com.pulumi.azure.core.inputs.ResourceDeploymentScriptAzureCliState.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.ResourceDeploymentScriptAzureCliEnvironmentVariableArgs.builder
      builder.environmentVariables(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below. Changing this forces a new Resource Deployment Script to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.core.inputs.ResourceDeploymentScriptAzureCliIdentityArgs.Builder]):
        com.pulumi.azure.core.inputs.ResourceDeploymentScriptAzureCliState.Builder =
      val argsBuilder = com.pulumi.azure.core.inputs.ResourceDeploymentScriptAzureCliIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param storageAccount A `storageAccount` block as defined below. Changing this forces a new Resource Deployment Script to be created.
     * @return builder
     */
    def storageAccount(args: Endofunction[com.pulumi.azure.core.inputs.ResourceDeploymentScriptAzureCliStorageAccountArgs.Builder]):
        com.pulumi.azure.core.inputs.ResourceDeploymentScriptAzureCliState.Builder =
      val argsBuilder = com.pulumi.azure.core.inputs.ResourceDeploymentScriptAzureCliStorageAccountArgs.builder
      builder.storageAccount(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.core.inputs.ResourceDeploymentScriptPowerShellState.Builder)
    /**
     * @param container A `container` block as defined below. Changing this forces a new Resource Deployment Script to be created.
     * @return builder
     */
    def container(args: Endofunction[com.pulumi.azure.core.inputs.ResourceDeploymentScriptPowerShellContainerArgs.Builder]):
        com.pulumi.azure.core.inputs.ResourceDeploymentScriptPowerShellState.Builder =
      val argsBuilder = com.pulumi.azure.core.inputs.ResourceDeploymentScriptPowerShellContainerArgs.builder
      builder.container(args(argsBuilder).build)

    /**
     * @param environmentVariables An `environmentVariable` block as defined below. Changing this forces a new Resource Deployment Script to be created.
     * @return builder
     */
    def environmentVariables(args: Endofunction[com.pulumi.azure.core.inputs.ResourceDeploymentScriptPowerShellEnvironmentVariableArgs.Builder]*):
        com.pulumi.azure.core.inputs.ResourceDeploymentScriptPowerShellState.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.ResourceDeploymentScriptPowerShellEnvironmentVariableArgs.builder
      builder.environmentVariables(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below. Changing this forces a new Resource Deployment Script to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.core.inputs.ResourceDeploymentScriptPowerShellIdentityArgs.Builder]):
        com.pulumi.azure.core.inputs.ResourceDeploymentScriptPowerShellState.Builder =
      val argsBuilder = com.pulumi.azure.core.inputs.ResourceDeploymentScriptPowerShellIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param storageAccount A `storageAccount` block as defined below. Changing this forces a new Resource Deployment Script to be created.
     * @return builder
     */
    def storageAccount(args: Endofunction[com.pulumi.azure.core.inputs.ResourceDeploymentScriptPowerShellStorageAccountArgs.Builder]):
        com.pulumi.azure.core.inputs.ResourceDeploymentScriptPowerShellState.Builder =
      val argsBuilder = com.pulumi.azure.core.inputs.ResourceDeploymentScriptPowerShellStorageAccountArgs.builder
      builder.storageAccount(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.core.inputs.ResourceGroupCostManagementExportState.Builder)
    /**
     * @param exportDataOptions A `exportDataOptions` block as defined below.
     * @return builder
     */
    def exportDataOptions(args: Endofunction[com.pulumi.azure.core.inputs.ResourceGroupCostManagementExportExportDataOptionsArgs.Builder]):
        com.pulumi.azure.core.inputs.ResourceGroupCostManagementExportState.Builder =
      val argsBuilder = com.pulumi.azure.core.inputs.ResourceGroupCostManagementExportExportDataOptionsArgs.builder
      builder.exportDataOptions(args(argsBuilder).build)

    /**
     * @param exportDataStorageLocation A `exportDataStorageLocation` block as defined below.
     * @return builder
     */
    def exportDataStorageLocation(args: Endofunction[com.pulumi.azure.core.inputs.ResourceGroupCostManagementExportExportDataStorageLocationArgs.Builder]):
        com.pulumi.azure.core.inputs.ResourceGroupCostManagementExportState.Builder =
      val argsBuilder = com.pulumi.azure.core.inputs.ResourceGroupCostManagementExportExportDataStorageLocationArgs.builder
      builder.exportDataStorageLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.core.inputs.ResourceGroupCostManagementViewDatasetArgs.Builder)
    /**
     * @param aggregations One or more `aggregation` blocks as defined above.
     * @return builder
     */
    def aggregations(args: Endofunction[com.pulumi.azure.core.inputs.ResourceGroupCostManagementViewDatasetAggregationArgs.Builder]*):
        com.pulumi.azure.core.inputs.ResourceGroupCostManagementViewDatasetArgs.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.ResourceGroupCostManagementViewDatasetAggregationArgs.builder
      builder.aggregations(args.map(_(argsBuilder).build)*)

    /**
     * @param groupings One or more `grouping` blocks as defined below.
     * @return builder
     */
    def groupings(args: Endofunction[com.pulumi.azure.core.inputs.ResourceGroupCostManagementViewDatasetGroupingArgs.Builder]*):
        com.pulumi.azure.core.inputs.ResourceGroupCostManagementViewDatasetArgs.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.ResourceGroupCostManagementViewDatasetGroupingArgs.builder
      builder.groupings(args.map(_(argsBuilder).build)*)

    /**
     * @param sortings One or more `sorting` blocks as defined below, containing the order by expression to be used in the report
     * @return builder
     */
    def sortings(args: Endofunction[com.pulumi.azure.core.inputs.ResourceGroupCostManagementViewDatasetSortingArgs.Builder]*):
        com.pulumi.azure.core.inputs.ResourceGroupCostManagementViewDatasetArgs.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.ResourceGroupCostManagementViewDatasetSortingArgs.builder
      builder.sortings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.core.inputs.ResourceGroupCostManagementViewState.Builder)
    /**
     * @param dataset A `dataset` block as defined below.
     * @return builder
     */
    def dataset(args: Endofunction[com.pulumi.azure.core.inputs.ResourceGroupCostManagementViewDatasetArgs.Builder]):
        com.pulumi.azure.core.inputs.ResourceGroupCostManagementViewState.Builder =
      val argsBuilder = com.pulumi.azure.core.inputs.ResourceGroupCostManagementViewDatasetArgs.builder
      builder.dataset(args(argsBuilder).build)

    /**
     * @param kpis One or more `kpi` blocks as defined below, to show in Cost Analysis UI.
     * @return builder
     */
    def kpis(args: Endofunction[com.pulumi.azure.core.inputs.ResourceGroupCostManagementViewKpiArgs.Builder]*):
        com.pulumi.azure.core.inputs.ResourceGroupCostManagementViewState.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.ResourceGroupCostManagementViewKpiArgs.builder
      builder.kpis(args.map(_(argsBuilder).build)*)

    /**
     * @param pivots One or more `pivot` blocks as defined below, containing the configuration of 3 sub-views in the Cost Analysis UI. Non table views should have three pivots.
     * @return builder
     */
    def pivots(args: Endofunction[com.pulumi.azure.core.inputs.ResourceGroupCostManagementViewPivotArgs.Builder]*):
        com.pulumi.azure.core.inputs.ResourceGroupCostManagementViewState.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.ResourceGroupCostManagementViewPivotArgs.builder
      builder.pivots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.core.inputs.ResourceGroupPolicyAssignmentOverrideArgs.Builder)
    /**
     * @param selectors One or more `overrideSelector` block as defined below.
     * @return builder
     */
    def selectors(args: Endofunction[com.pulumi.azure.core.inputs.ResourceGroupPolicyAssignmentOverrideSelectorArgs.Builder]*):
        com.pulumi.azure.core.inputs.ResourceGroupPolicyAssignmentOverrideArgs.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.ResourceGroupPolicyAssignmentOverrideSelectorArgs.builder
      builder.selectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.core.inputs.ResourceGroupPolicyAssignmentResourceSelectorArgs.Builder)
    /**
     * @param selectors One or more `resourceSelector` block as defined below.
     * @return builder
     */
    def selectors(args: Endofunction[com.pulumi.azure.core.inputs.ResourceGroupPolicyAssignmentResourceSelectorSelectorArgs.Builder]*):
        com.pulumi.azure.core.inputs.ResourceGroupPolicyAssignmentResourceSelectorArgs.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.ResourceGroupPolicyAssignmentResourceSelectorSelectorArgs.builder
      builder.selectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.core.inputs.ResourceGroupPolicyAssignmentState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * 
     * &gt; **Note:** The `location` field must also be specified when `identity` is specified.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.core.inputs.ResourceGroupPolicyAssignmentIdentityArgs.Builder]):
        com.pulumi.azure.core.inputs.ResourceGroupPolicyAssignmentState.Builder =
      val argsBuilder = com.pulumi.azure.core.inputs.ResourceGroupPolicyAssignmentIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param nonComplianceMessages One or more `nonComplianceMessage` blocks as defined below.
     * @return builder
     */
    def nonComplianceMessages(args: Endofunction[com.pulumi.azure.core.inputs.ResourceGroupPolicyAssignmentNonComplianceMessageArgs.Builder]*):
        com.pulumi.azure.core.inputs.ResourceGroupPolicyAssignmentState.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.ResourceGroupPolicyAssignmentNonComplianceMessageArgs.builder
      builder.nonComplianceMessages(args.map(_(argsBuilder).build)*)

    /**
     * @param overrides One or more `overrides` blocks as defined below. More detail about `overrides` and `resourceSelectors` see [policy assignment structure](https://learn.microsoft.com/en-us/azure/governance/policy/concepts/assignment-structure)
     * @return builder
     */
    def overrides(args: Endofunction[com.pulumi.azure.core.inputs.ResourceGroupPolicyAssignmentOverrideArgs.Builder]*):
        com.pulumi.azure.core.inputs.ResourceGroupPolicyAssignmentState.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.ResourceGroupPolicyAssignmentOverrideArgs.builder
      builder.overrides(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceSelectors One or more `resourceSelectors` blocks as defined below to filter polices by resource properties.
     * @return builder
     */
    def resourceSelectors(args: Endofunction[com.pulumi.azure.core.inputs.ResourceGroupPolicyAssignmentResourceSelectorArgs.Builder]*):
        com.pulumi.azure.core.inputs.ResourceGroupPolicyAssignmentState.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.ResourceGroupPolicyAssignmentResourceSelectorArgs.builder
      builder.resourceSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.core.inputs.ResourcePolicyAssignmentOverrideArgs.Builder)
    /**
     * @param selectors One or more `overrideSelector` block as defined below.
     * @return builder
     */
    def selectors(args: Endofunction[com.pulumi.azure.core.inputs.ResourcePolicyAssignmentOverrideSelectorArgs.Builder]*):
        com.pulumi.azure.core.inputs.ResourcePolicyAssignmentOverrideArgs.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.ResourcePolicyAssignmentOverrideSelectorArgs.builder
      builder.selectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.core.inputs.ResourcePolicyAssignmentResourceSelectorArgs.Builder)
    /**
     * @param selectors One or more `resourceSelector` block as defined below.
     * @return builder
     */
    def selectors(args: Endofunction[com.pulumi.azure.core.inputs.ResourcePolicyAssignmentResourceSelectorSelectorArgs.Builder]*):
        com.pulumi.azure.core.inputs.ResourcePolicyAssignmentResourceSelectorArgs.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.ResourcePolicyAssignmentResourceSelectorSelectorArgs.builder
      builder.selectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.core.inputs.ResourcePolicyAssignmentState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * 
     * &gt; **Note:** The `location` field must also be specified when `identity` is specified.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.core.inputs.ResourcePolicyAssignmentIdentityArgs.Builder]):
        com.pulumi.azure.core.inputs.ResourcePolicyAssignmentState.Builder =
      val argsBuilder = com.pulumi.azure.core.inputs.ResourcePolicyAssignmentIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param nonComplianceMessages One or more `nonComplianceMessage` blocks as defined below.
     * @return builder
     */
    def nonComplianceMessages(args: Endofunction[com.pulumi.azure.core.inputs.ResourcePolicyAssignmentNonComplianceMessageArgs.Builder]*):
        com.pulumi.azure.core.inputs.ResourcePolicyAssignmentState.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.ResourcePolicyAssignmentNonComplianceMessageArgs.builder
      builder.nonComplianceMessages(args.map(_(argsBuilder).build)*)

    /**
     * @param overrides One or more `overrides` blocks as defined below. More detail about `overrides` and `resourceSelectors` see [policy assignment structure](https://learn.microsoft.com/en-us/azure/governance/policy/concepts/assignment-structure)
     * @return builder
     */
    def overrides(args: Endofunction[com.pulumi.azure.core.inputs.ResourcePolicyAssignmentOverrideArgs.Builder]*):
        com.pulumi.azure.core.inputs.ResourcePolicyAssignmentState.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.ResourcePolicyAssignmentOverrideArgs.builder
      builder.overrides(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceSelectors One or more `resourceSelectors` blocks as defined below to filter polices by resource properties.
     * @return builder
     */
    def resourceSelectors(args: Endofunction[com.pulumi.azure.core.inputs.ResourcePolicyAssignmentResourceSelectorArgs.Builder]*):
        com.pulumi.azure.core.inputs.ResourcePolicyAssignmentState.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.ResourcePolicyAssignmentResourceSelectorArgs.builder
      builder.resourceSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.core.inputs.ResourceProviderRegistrationState.Builder)
    /**
     * @param features A list of `feature` blocks as defined below.
     * 
     * &gt; **Note:** The `feature` block allows a Preview Feature to be explicitly Registered or Unregistered for this Resource Provider - once a Feature has been explicitly Registered or Unregistered, it must be specified in the Terraform Configuration (it&#39;s not possible to reset this to the default, unspecified, state).
     * @return builder
     */
    def features(args: Endofunction[com.pulumi.azure.core.inputs.ResourceProviderRegistrationFeatureArgs.Builder]*):
        com.pulumi.azure.core.inputs.ResourceProviderRegistrationState.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.ResourceProviderRegistrationFeatureArgs.builder
      builder.features(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.core.inputs.SubscriptionCostManagementExportState.Builder)
    /**
     * @param exportDataOptions A `exportDataOptions` block as defined below.
     * @return builder
     */
    def exportDataOptions(args: Endofunction[com.pulumi.azure.core.inputs.SubscriptionCostManagementExportExportDataOptionsArgs.Builder]):
        com.pulumi.azure.core.inputs.SubscriptionCostManagementExportState.Builder =
      val argsBuilder = com.pulumi.azure.core.inputs.SubscriptionCostManagementExportExportDataOptionsArgs.builder
      builder.exportDataOptions(args(argsBuilder).build)

    /**
     * @param exportDataStorageLocation A `exportDataStorageLocation` block as defined below.
     * @return builder
     */
    def exportDataStorageLocation(args: Endofunction[com.pulumi.azure.core.inputs.SubscriptionCostManagementExportExportDataStorageLocationArgs.Builder]):
        com.pulumi.azure.core.inputs.SubscriptionCostManagementExportState.Builder =
      val argsBuilder = com.pulumi.azure.core.inputs.SubscriptionCostManagementExportExportDataStorageLocationArgs.builder
      builder.exportDataStorageLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.core.inputs.SubscriptionCostManagementViewDatasetArgs.Builder)
    /**
     * @param aggregations One or more `aggregation` blocks as defined above.
     * @return builder
     */
    def aggregations(args: Endofunction[com.pulumi.azure.core.inputs.SubscriptionCostManagementViewDatasetAggregationArgs.Builder]*):
        com.pulumi.azure.core.inputs.SubscriptionCostManagementViewDatasetArgs.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.SubscriptionCostManagementViewDatasetAggregationArgs.builder
      builder.aggregations(args.map(_(argsBuilder).build)*)

    /**
     * @param groupings One or more `grouping` blocks as defined below.
     * @return builder
     */
    def groupings(args: Endofunction[com.pulumi.azure.core.inputs.SubscriptionCostManagementViewDatasetGroupingArgs.Builder]*):
        com.pulumi.azure.core.inputs.SubscriptionCostManagementViewDatasetArgs.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.SubscriptionCostManagementViewDatasetGroupingArgs.builder
      builder.groupings(args.map(_(argsBuilder).build)*)

    /**
     * @param sortings One or more `sorting` blocks as defined below, containing the order by expression to be used in the report
     * @return builder
     */
    def sortings(args: Endofunction[com.pulumi.azure.core.inputs.SubscriptionCostManagementViewDatasetSortingArgs.Builder]*):
        com.pulumi.azure.core.inputs.SubscriptionCostManagementViewDatasetArgs.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.SubscriptionCostManagementViewDatasetSortingArgs.builder
      builder.sortings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.core.inputs.SubscriptionCostManagementViewState.Builder)
    /**
     * @param dataset A `dataset` block as defined below.
     * @return builder
     */
    def dataset(args: Endofunction[com.pulumi.azure.core.inputs.SubscriptionCostManagementViewDatasetArgs.Builder]):
        com.pulumi.azure.core.inputs.SubscriptionCostManagementViewState.Builder =
      val argsBuilder = com.pulumi.azure.core.inputs.SubscriptionCostManagementViewDatasetArgs.builder
      builder.dataset(args(argsBuilder).build)

    /**
     * @param kpis One or more `kpi` blocks as defined below, to show in Cost Analysis UI.
     * @return builder
     */
    def kpis(args: Endofunction[com.pulumi.azure.core.inputs.SubscriptionCostManagementViewKpiArgs.Builder]*):
        com.pulumi.azure.core.inputs.SubscriptionCostManagementViewState.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.SubscriptionCostManagementViewKpiArgs.builder
      builder.kpis(args.map(_(argsBuilder).build)*)

    /**
     * @param pivots One or more `pivot` blocks as defined below, containing the configuration of 3 sub-views in the Cost Analysis UI. Non table views should have three pivots.
     * @return builder
     */
    def pivots(args: Endofunction[com.pulumi.azure.core.inputs.SubscriptionCostManagementViewPivotArgs.Builder]*):
        com.pulumi.azure.core.inputs.SubscriptionCostManagementViewState.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.SubscriptionCostManagementViewPivotArgs.builder
      builder.pivots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.core.inputs.SubscriptionPolicyAssignmentOverrideArgs.Builder)
    /**
     * @param selectors One or more `overrideSelector` block as defined below.
     * @return builder
     */
    def selectors(args: Endofunction[com.pulumi.azure.core.inputs.SubscriptionPolicyAssignmentOverrideSelectorArgs.Builder]*):
        com.pulumi.azure.core.inputs.SubscriptionPolicyAssignmentOverrideArgs.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.SubscriptionPolicyAssignmentOverrideSelectorArgs.builder
      builder.selectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.core.inputs.SubscriptionPolicyAssignmentResourceSelectorArgs.Builder)
    /**
     * @param selectors One or more `resourceSelector` block as defined below.
     * @return builder
     */
    def selectors(args: Endofunction[com.pulumi.azure.core.inputs.SubscriptionPolicyAssignmentResourceSelectorSelectorArgs.Builder]*):
        com.pulumi.azure.core.inputs.SubscriptionPolicyAssignmentResourceSelectorArgs.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.SubscriptionPolicyAssignmentResourceSelectorSelectorArgs.builder
      builder.selectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.core.inputs.SubscriptionPolicyAssignmentState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * 
     * &gt; **Note:** The `location` field must also be specified when `identity` is specified.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.core.inputs.SubscriptionPolicyAssignmentIdentityArgs.Builder]):
        com.pulumi.azure.core.inputs.SubscriptionPolicyAssignmentState.Builder =
      val argsBuilder = com.pulumi.azure.core.inputs.SubscriptionPolicyAssignmentIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param nonComplianceMessages One or more `nonComplianceMessage` blocks as defined below.
     * @return builder
     */
    def nonComplianceMessages(args: Endofunction[com.pulumi.azure.core.inputs.SubscriptionPolicyAssignmentNonComplianceMessageArgs.Builder]*):
        com.pulumi.azure.core.inputs.SubscriptionPolicyAssignmentState.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.SubscriptionPolicyAssignmentNonComplianceMessageArgs.builder
      builder.nonComplianceMessages(args.map(_(argsBuilder).build)*)

    /**
     * @param overrides One or more `overrides` blocks as defined below. More detail about `overrides` and `resourceSelectors` see [policy assignment structure](https://learn.microsoft.com/en-us/azure/governance/policy/concepts/assignment-structure)
     * @return builder
     */
    def overrides(args: Endofunction[com.pulumi.azure.core.inputs.SubscriptionPolicyAssignmentOverrideArgs.Builder]*):
        com.pulumi.azure.core.inputs.SubscriptionPolicyAssignmentState.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.SubscriptionPolicyAssignmentOverrideArgs.builder
      builder.overrides(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceSelectors One or more `resourceSelectors` blocks as defined below to filter polices by resource properties.
     * @return builder
     */
    def resourceSelectors(args: Endofunction[com.pulumi.azure.core.inputs.SubscriptionPolicyAssignmentResourceSelectorArgs.Builder]*):
        com.pulumi.azure.core.inputs.SubscriptionPolicyAssignmentState.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.SubscriptionPolicyAssignmentResourceSelectorArgs.builder
      builder.resourceSelectors(args.map(_(argsBuilder).build)*)
