package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object core:
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

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.core.CustomProviderArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages an Azure Subscription Policy Remediation. */
  def SubscriptionPolicyRemediation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.core.SubscriptionPolicyRemediationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.core.SubscriptionPolicyRemediationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.core.SubscriptionPolicyRemediation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

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

  /** Manages a Resource Group Policy Exemption. */
  def ResourceGroupPolicyExemption(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.core.ResourceGroupPolicyExemptionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.core.ResourceGroupPolicyExemptionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.core.ResourceGroupPolicyExemption(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Azure Custom Provider. */
  def CustomProvider(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.core.CustomProviderArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.core.CustomProviderArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.core.CustomProvider(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

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

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.core.ResourceDeploymentScriptAzureCliArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Manages the registration of a Resource Provider - which allows access to the API&#39;s supported by this Resource Provider.
   * 
   *  &gt; **Note:** The Azure Provider will automatically register all of the Resource Providers which it supports on launch (unless opted-out using the `skipProviderRegistration` field within the provider block).
   * 
   *  !&gt; **Note:** The errors returned from the Azure API when a Resource Provider is unregistered are unclear (example `API version &#39;2019-01-01&#39; was not found for &#39;Microsoft.Foo&#39;`) - please ensure that all of the necessary Resource Providers you&#39;re using are registered - if in doubt **we strongly recommend letting the provider register these for you**.
   * 
   *  &gt; **Note:** Adding or Removing a Preview Feature will re-register the Resource Provider.
   */
  def ResourceProviderRegistration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.core.ResourceProviderRegistrationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.core.ResourceProviderRegistrationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.core.ResourceProviderRegistration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Azure Cost Management View for a Resource Group. */
  def ResourceGroupCostManagementView(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.core.ResourceGroupCostManagementViewArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.core.ResourceGroupCostManagementViewArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.core.ResourceGroupCostManagementView(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Resource Group Template Deployment.
   * 
   *  &gt; **Note:** This resource will automatically attempt to delete resources deployed by the ARM Template when it is deleted. This behavior can be disabled in the provider `features` block by setting the `deleteNestedItemsDuringDeletion` field to `false` within the `templateDeployment` block.
   */
  def ResourceGroupTemplateDeployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.core.ResourceGroupTemplateDeploymentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.core.ResourceGroupTemplateDeploymentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.core.ResourceGroupTemplateDeployment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Policy Assignment to a Resource. */
  def ResourcePolicyAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.core.ResourcePolicyAssignmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.core.ResourcePolicyAssignmentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.core.ResourcePolicyAssignment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages the registration of a feature within a Resource Provider.
   * 
   *  &gt; **Note:** The Resource Provider must be registered before a feature can be registered.
   * 
   *  &gt; **Note:** Only Preview Features which have an `ApprovalType` of `AutoApproval` can be managed in Terraform, features which require manual approval by Service Teams are unsupported. [More information on Resource Provider Preview Features can be found in this document](https://docs.microsoft.com/rest/api/resources/features)
   */
  def ResourceProviderFeatureRegistration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.core.ResourceProviderFeatureRegistrationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.core.ResourceProviderFeatureRegistrationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.core.ResourceProviderFeatureRegistration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.core.ResourcePolicyAssignmentArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * 
     *  &gt; **Note:** The `location` field must also be specified when `identity` is specified.
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

  /** Manages a Resource Deployment Script of Azure Cli. */
  def ResourceDeploymentScriptAzureCli(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.core.ResourceDeploymentScriptAzureCliArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.core.ResourceDeploymentScriptAzureCliArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.core.ResourceDeploymentScriptAzureCli(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Template Deployment at the Tenant Scope.
   * 
   *  &gt; **Note:** Deleting a Deployment at the Tenant Scope will not delete any resources created by the deployment.
   * 
   *  &gt; **Note:** Deployments to a Tenant are always Incrementally applied. Existing resources that are not part of the template will not be removed.
   * 
   *  &gt; **Note:** Tenant Template Deployments are always targeted at the Tenant in which the current User, Managed Identity, or Service Principal being used by Terraform is homed.
   */
  def TenantTemplateDeployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.core.TenantTemplateDeploymentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.core.TenantTemplateDeploymentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.core.TenantTemplateDeployment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object CoreFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** This data source return the available Extended Locations for a specific Azure Region. */
    inline def getExtendedLocations(args: Endofunction[com.pulumi.azure.core.inputs.GetExtendedLocationsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.core.outputs.GetExtendedLocationsResult] =
      val argsBuilder = com.pulumi.azure.core.inputs.GetExtendedLocationsArgs.builder
      com.pulumi.azure.core.CoreFunctions.getExtendedLocations(args(argsBuilder).build)

    /** This data source return the available Extended Locations for a specific Azure Region. */
    inline def getExtendedLocationsPlain(args: Endofunction[com.pulumi.azure.core.inputs.GetExtendedLocationsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.core.outputs.GetExtendedLocationsResult] =
      val argsBuilder = com.pulumi.azure.core.inputs.GetExtendedLocationsPlainArgs.builder
      com.pulumi.azure.core.CoreFunctions.getExtendedLocationsPlain(args(argsBuilder).build)

    /** Use this data source to access information of a specific physical location. */
    inline def getLocation(args: Endofunction[com.pulumi.azure.core.inputs.GetLocationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.core.outputs.GetLocationResult] =
      val argsBuilder = com.pulumi.azure.core.inputs.GetLocationArgs.builder
      com.pulumi.azure.core.CoreFunctions.getLocation(args(argsBuilder).build)

    /** Use this data source to access information of a specific physical location. */
    inline def getLocationPlain(args: Endofunction[com.pulumi.azure.core.inputs.GetLocationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.core.outputs.GetLocationResult] =
      val argsBuilder = com.pulumi.azure.core.inputs.GetLocationPlainArgs.builder
      com.pulumi.azure.core.CoreFunctions.getLocationPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Resource Group. */
    inline def getResourceGroup(args: Endofunction[com.pulumi.azure.core.inputs.GetResourceGroupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.core.outputs.GetResourceGroupResult] =
      val argsBuilder = com.pulumi.azure.core.inputs.GetResourceGroupArgs.builder
      com.pulumi.azure.core.CoreFunctions.getResourceGroup(args(argsBuilder).build)

    /** Use this data source to access information about an existing Resource Group. */
    inline def getResourceGroupPlain(args: Endofunction[com.pulumi.azure.core.inputs.GetResourceGroupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.core.outputs.GetResourceGroupResult] =
      val argsBuilder = com.pulumi.azure.core.inputs.GetResourceGroupPlainArgs.builder
      com.pulumi.azure.core.CoreFunctions.getResourceGroupPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Resource Group Template Deployment. */
    inline def getResourceGroupTemplateDeployment(args: Endofunction[com.pulumi.azure.core.inputs.GetResourceGroupTemplateDeploymentArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.core.outputs.GetResourceGroupTemplateDeploymentResult] =
      val argsBuilder = com.pulumi.azure.core.inputs.GetResourceGroupTemplateDeploymentArgs.builder
      com.pulumi.azure.core.CoreFunctions.getResourceGroupTemplateDeployment(args(argsBuilder).build)

    /** Use this data source to access information about an existing Resource Group Template Deployment. */
    inline def getResourceGroupTemplateDeploymentPlain(args: Endofunction[com.pulumi.azure.core.inputs.GetResourceGroupTemplateDeploymentPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.core.outputs.GetResourceGroupTemplateDeploymentResult] =
      val argsBuilder = com.pulumi.azure.core.inputs.GetResourceGroupTemplateDeploymentPlainArgs.builder
      com.pulumi.azure.core.CoreFunctions.getResourceGroupTemplateDeploymentPlain(args(argsBuilder).build)

    /** Use this data source to access information about existing resources. */
    inline def getResources(args: Endofunction[com.pulumi.azure.core.inputs.GetResourcesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.core.outputs.GetResourcesResult] =
      val argsBuilder = com.pulumi.azure.core.inputs.GetResourcesArgs.builder
      com.pulumi.azure.core.CoreFunctions.getResources(args(argsBuilder).build)

    /** Use this data source to access information about existing resources. */
    inline def getResourcesPlain(args: Endofunction[com.pulumi.azure.core.inputs.GetResourcesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.core.outputs.GetResourcesResult] =
      val argsBuilder = com.pulumi.azure.core.inputs.GetResourcesPlainArgs.builder
      com.pulumi.azure.core.CoreFunctions.getResourcesPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Subscription. */
    inline def getSubscription(args: Endofunction[com.pulumi.azure.core.inputs.GetSubscriptionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.core.outputs.GetSubscriptionResult] =
      val argsBuilder = com.pulumi.azure.core.inputs.GetSubscriptionArgs.builder
      com.pulumi.azure.core.CoreFunctions.getSubscription(args(argsBuilder).build)

    /** Use this data source to access information about an existing Subscription. */
    inline def getSubscriptionPlain(args: Endofunction[com.pulumi.azure.core.inputs.GetSubscriptionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.core.outputs.GetSubscriptionResult] =
      val argsBuilder = com.pulumi.azure.core.inputs.GetSubscriptionPlainArgs.builder
      com.pulumi.azure.core.CoreFunctions.getSubscriptionPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Subscription Template Deployment. */
    inline def getSubscriptionTemplateDeployment(args: Endofunction[com.pulumi.azure.core.inputs.GetSubscriptionTemplateDeploymentArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.core.outputs.GetSubscriptionTemplateDeploymentResult] =
      val argsBuilder = com.pulumi.azure.core.inputs.GetSubscriptionTemplateDeploymentArgs.builder
      com.pulumi.azure.core.CoreFunctions.getSubscriptionTemplateDeployment(args(argsBuilder).build)

    /** Use this data source to access information about an existing Subscription Template Deployment. */
    inline def getSubscriptionTemplateDeploymentPlain(args: Endofunction[com.pulumi.azure.core.inputs.GetSubscriptionTemplateDeploymentPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.core.outputs.GetSubscriptionTemplateDeploymentResult] =
      val argsBuilder = com.pulumi.azure.core.inputs.GetSubscriptionTemplateDeploymentPlainArgs.builder
      com.pulumi.azure.core.CoreFunctions.getSubscriptionTemplateDeploymentPlain(args(argsBuilder).build)

    /** Use this data source to access information about all the Subscriptions currently available. */
    inline def getSubscriptions(args: Endofunction[com.pulumi.azure.core.inputs.GetSubscriptionsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.core.outputs.GetSubscriptionsResult] =
      val argsBuilder = com.pulumi.azure.core.inputs.GetSubscriptionsArgs.builder
      com.pulumi.azure.core.CoreFunctions.getSubscriptions(args(argsBuilder).build)

    /** Use this data source to access information about all the Subscriptions currently available. */
    inline def getSubscriptionsPlain(args: Endofunction[com.pulumi.azure.core.inputs.GetSubscriptionsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.core.outputs.GetSubscriptionsResult] =
      val argsBuilder = com.pulumi.azure.core.inputs.GetSubscriptionsPlainArgs.builder
      com.pulumi.azure.core.CoreFunctions.getSubscriptionsPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Template Spec Version. */
    inline def getTemplateSpecVersion(args: Endofunction[com.pulumi.azure.core.inputs.GetTemplateSpecVersionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.core.outputs.GetTemplateSpecVersionResult] =
      val argsBuilder = com.pulumi.azure.core.inputs.GetTemplateSpecVersionArgs.builder
      com.pulumi.azure.core.CoreFunctions.getTemplateSpecVersion(args(argsBuilder).build)

    /** Use this data source to access information about an existing Template Spec Version. */
    inline def getTemplateSpecVersionPlain(args: Endofunction[com.pulumi.azure.core.inputs.GetTemplateSpecVersionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.core.outputs.GetTemplateSpecVersionResult] =
      val argsBuilder = com.pulumi.azure.core.inputs.GetTemplateSpecVersionPlainArgs.builder
      com.pulumi.azure.core.CoreFunctions.getTemplateSpecVersionPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Tenant Template Deployment. */
    inline def getTenantTemplateDeployment(args: Endofunction[com.pulumi.azure.core.inputs.GetTenantTemplateDeploymentArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.core.outputs.GetTenantTemplateDeploymentResult] =
      val argsBuilder = com.pulumi.azure.core.inputs.GetTenantTemplateDeploymentArgs.builder
      com.pulumi.azure.core.CoreFunctions.getTenantTemplateDeployment(args(argsBuilder).build)

    /** Use this data source to access information about an existing Tenant Template Deployment. */
    inline def getTenantTemplateDeploymentPlain(args: Endofunction[com.pulumi.azure.core.inputs.GetTenantTemplateDeploymentPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.core.outputs.GetTenantTemplateDeploymentResult] =
      val argsBuilder = com.pulumi.azure.core.inputs.GetTenantTemplateDeploymentPlainArgs.builder
      com.pulumi.azure.core.CoreFunctions.getTenantTemplateDeploymentPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing User Assigned Identity. */
    @deprecated inline def getUserAssignedIdentity(args: Endofunction[com.pulumi.azure.core.inputs.GetUserAssignedIdentityArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.core.outputs.GetUserAssignedIdentityResult] =
      val argsBuilder = com.pulumi.azure.core.inputs.GetUserAssignedIdentityArgs.builder
      com.pulumi.azure.core.CoreFunctions.getUserAssignedIdentity(args(argsBuilder).build)

    /** Use this data source to access information about an existing User Assigned Identity. */
    @deprecated inline def getUserAssignedIdentityPlain(args: Endofunction[com.pulumi.azure.core.inputs.GetUserAssignedIdentityPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.core.outputs.GetUserAssignedIdentityResult] =
      val argsBuilder = com.pulumi.azure.core.inputs.GetUserAssignedIdentityPlainArgs.builder
      com.pulumi.azure.core.CoreFunctions.getUserAssignedIdentityPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.core.SubscriptionPolicyAssignmentArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * 
     *  &gt; **Note:** The `location` field must also be specified when `identity` is specified.
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

  /** Manages an Azure Resource Group Policy Remediation. */
  def ResourceGroupPolicyRemediation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.core.ResourceGroupPolicyRemediationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.core.ResourceGroupPolicyRemediationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.core.ResourceGroupPolicyRemediation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages Portal Tenant Configuration.
   * 
   *  &gt; **Note:** User has to be `Contributor` or `Owner` at scope `/` for managing this resource.
   * 
   *  &gt; **Note:** The Service Principal with Tenant Admin can be created by `az ad sp create-for-rbac --name &#34;&lt;sp name&gt;&#34; --role=&#34;Contributor&#34; --scopes=&#34;/&#34;`.
   * 
   *  &gt; **Note:** The Service Principal can be granted Tenant Admin permission by `az role assignment create --assignee &#34;&lt;app id&gt;&#34; --role &#34;Contributor&#34; --scope &#34;/&#34;`.
   * 
   *  &gt; **Note:** While assigning the role to the existing/new Service Principal at the Tenant Scope, the user assigning role must already have the `Owner` role assigned at the Tenant Scope.
   */
  def PortalTenantConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.core.PortalTenantConfigurationArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.core.PortalTenantConfigurationArgs.builder
    com.pulumi.azure.core.PortalTenantConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Resource Deployment Script of Azure PowerShell. */
  def ResourceDeploymentScriptPowerShell(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.core.ResourceDeploymentScriptPowerShellArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.core.ResourceDeploymentScriptPowerShellArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.core.ResourceDeploymentScriptPowerShell(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Azure Resource Policy Remediation. */
  def ResourcePolicyRemediation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.core.ResourcePolicyRemediationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.core.ResourcePolicyRemediationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.core.ResourcePolicyRemediation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Subscription Template Deployment. */
  def SubscriptionTemplateDeployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.core.SubscriptionTemplateDeploymentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.core.SubscriptionTemplateDeploymentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.core.SubscriptionTemplateDeployment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Subscription Policy Exemption. */
  def SubscriptionPolicyExemption(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.core.SubscriptionPolicyExemptionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.core.SubscriptionPolicyExemptionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.core.SubscriptionPolicyExemption(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Cost Management Export for a Subscription. */
  def SubscriptionCostManagementExport(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.core.SubscriptionCostManagementExportArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.core.SubscriptionCostManagementExportArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.core.SubscriptionCostManagementExport(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Resource Group Policy Assignment. */
  def ResourceGroupPolicyAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.core.ResourceGroupPolicyAssignmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.core.ResourceGroupPolicyAssignmentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.core.ResourceGroupPolicyAssignment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.core.ResourceProviderRegistrationArgs.Builder)
    /**
     * @param features A list of `feature` blocks as defined below.
     * 
     *  &gt; **Note:** The `feature` block allows a Preview Feature to be explicitly Registered or Unregistered for this Resource Provider - once a Feature has been explicitly Registered or Unregistered, it must be specified in the Terraform Configuration (it&#39;s not possible to reset this to the default, unspecified, state).
     * @return builder
     */
    def features(args: Endofunction[com.pulumi.azure.core.inputs.ResourceProviderRegistrationFeatureArgs.Builder]*):
        com.pulumi.azure.core.ResourceProviderRegistrationArgs.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.ResourceProviderRegistrationFeatureArgs.builder
      builder.features(args.map(_(argsBuilder).build)*)

  /** Manages a Resource Policy Exemption. */
  def ResourcePolicyExemption(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.core.ResourcePolicyExemptionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.core.ResourcePolicyExemptionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.core.ResourcePolicyExemption(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Azure Cost Management View for a Subscription. */
  def SubscriptionCostManagementView(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.core.SubscriptionCostManagementViewArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.core.SubscriptionCostManagementViewArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.core.SubscriptionCostManagementView(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Cost Management Export for a Resource Group. */
  def ResourceGroupCostManagementExport(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.core.ResourceGroupCostManagementExportArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.core.ResourceGroupCostManagementExportArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.core.ResourceGroupCostManagementExport(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an Alias for a Subscription - which adds an Alias to an existing Subscription, allowing it to be managed in the provider - or create a new Subscription with a new Alias.
   * 
   *  &gt; **NOTE:** Destroying a Subscription controlled by this resource will place the Subscription into a cancelled state. It is possible to re-activate a subscription within 90-days of cancellation, after which time the Subscription is irrevocably deleted, and the Subscription ID cannot be re-used. For further information see [here](https://docs.microsoft.com/azure/cost-management-billing/manage/cancel-azure-subscription#what-happens-after-subscription-cancellation). Users can optionally delete a Subscription once 72 hours have passed, however, this functionality is not suitable for this provider. A `Deleted` subscription cannot be reactivated.
   * 
   *  &gt; **NOTE:** It is not possible to destroy (cancel) a subscription if it contains resources. If resources are present that are not managed by the provider then these will need to be removed before the Subscription can be destroyed.
   * 
   *  &gt; **Note:** This resource will automatically attempt to cancel a subscription when it is deleted. This behavior can be disabled in the provider `features` block by setting the `preventCancellationOnDestroy` field to `true` within the `subscription` block.
   * 
   *  &gt; **NOTE:** Azure supports Multiple Aliases per Subscription, however, to reliably manage this resource in Terraform only a single Alias is supported.
   * 
   *  &gt; **NOTE:** Subscription Aliases have their own RBAC scope, separate from the underlying Subscription. If an Alias already exists and the Service Principal lacks read/write permissions on that Alias, you may encounter a `401 Unauthorized` error. To resolve this, the Alias creator or a Global Administrator must assign the `Owner` role on the Alias scope to the Service Principal. Global Administrators may need to [elevate access](https://learn.microsoft.com/en-us/azure/role-based-access-control/elevate-access-global-admin) to gain visibility over all subscriptions before performing the role assignment.
   * 
   *  &gt; **NOTE:** When using this resource across tenants the `clientId` and `tenantId` of the `provider` config block should be for the home tenant details for the SPN / User or a permissions error will likely be encountered. See [the official documentation](https://learn.microsoft.com/en-us/azure/cost-management-billing/manage/programmatically-create-subscription) for more details.
   */
  def Subscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.core.SubscriptionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.core.SubscriptionArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.core.Subscription(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Resource Group.
   * 
   *  &gt; **Note:** Azure automatically deletes any Resources nested within the Resource Group when a Resource Group is deleted.
   * 
   *  &gt; **Note:** Version 2.72 and later of the Azure Provider include a Feature Toggle which can error if there are any Resources left within the Resource Group at deletion time. This Feature Toggle is disabled in 2.x but enabled by default from 3.0 onwards, and is intended to avoid the unintentional destruction of resources managed outside of Terraform (for example, provisioned by an ARM Template). See the Features block documentation for more information on Feature Toggles within Terraform.
   */
  def ResourceGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.core.ResourceGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.core.ResourceGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.core.ResourceGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Subscription Policy Assignment. */
  def SubscriptionPolicyAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.core.SubscriptionPolicyAssignmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.core.SubscriptionPolicyAssignmentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.core.SubscriptionPolicyAssignment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.core.ResourceGroupPolicyAssignmentArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * 
     *  &gt; **Note:** The `location` field must also be specified when `identity` is specified.
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

  extension (builder: com.pulumi.azure.core.inputs.ResourceGroupPolicyAssignmentResourceSelectorArgs.Builder)
    /**
     * @param selectors One or more `resourceSelector` block as defined below.
     * @return builder
     */
    def selectors(args: Endofunction[com.pulumi.azure.core.inputs.ResourceGroupPolicyAssignmentResourceSelectorSelectorArgs.Builder]*):
        com.pulumi.azure.core.inputs.ResourceGroupPolicyAssignmentResourceSelectorArgs.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.ResourceGroupPolicyAssignmentResourceSelectorSelectorArgs.builder
      builder.selectors(args.map(_(argsBuilder).build)*)

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

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.core.inputs.ResourceDeploymentScriptPowerShellState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.core.inputs.SubscriptionPolicyAssignmentResourceSelectorArgs.Builder)
    /**
     * @param selectors One or more `resourceSelector` block as defined below.
     * @return builder
     */
    def selectors(args: Endofunction[com.pulumi.azure.core.inputs.SubscriptionPolicyAssignmentResourceSelectorSelectorArgs.Builder]*):
        com.pulumi.azure.core.inputs.SubscriptionPolicyAssignmentResourceSelectorArgs.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.SubscriptionPolicyAssignmentResourceSelectorSelectorArgs.builder
      builder.selectors(args.map(_(argsBuilder).build)*)

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

  extension (builder: com.pulumi.azure.core.inputs.ResourcePolicyAssignmentResourceSelectorArgs.Builder)
    /**
     * @param selectors One or more `resourceSelector` block as defined below.
     * @return builder
     */
    def selectors(args: Endofunction[com.pulumi.azure.core.inputs.ResourcePolicyAssignmentResourceSelectorSelectorArgs.Builder]*):
        com.pulumi.azure.core.inputs.ResourcePolicyAssignmentResourceSelectorArgs.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.ResourcePolicyAssignmentResourceSelectorSelectorArgs.builder
      builder.selectors(args.map(_(argsBuilder).build)*)

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

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.core.inputs.CustomProviderState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.core.inputs.ResourceGroupPolicyAssignmentState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * 
     *  &gt; **Note:** The `location` field must also be specified when `identity` is specified.
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

  extension (builder: com.pulumi.azure.core.inputs.ResourcePolicyAssignmentState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * 
     *  &gt; **Note:** The `location` field must also be specified when `identity` is specified.
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

  extension (builder: com.pulumi.azure.core.inputs.SubscriptionPolicyAssignmentState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * 
     *  &gt; **Note:** The `location` field must also be specified when `identity` is specified.
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

  extension (builder: com.pulumi.azure.core.inputs.ResourceGroupPolicyAssignmentOverrideArgs.Builder)
    /**
     * @param selectors One or more `overrideSelector` block as defined below.
     * @return builder
     */
    def selectors(args: Endofunction[com.pulumi.azure.core.inputs.ResourceGroupPolicyAssignmentOverrideSelectorArgs.Builder]*):
        com.pulumi.azure.core.inputs.ResourceGroupPolicyAssignmentOverrideArgs.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.ResourceGroupPolicyAssignmentOverrideSelectorArgs.builder
      builder.selectors(args.map(_(argsBuilder).build)*)

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

  extension (builder: com.pulumi.azure.core.inputs.ResourceProviderRegistrationState.Builder)
    /**
     * @param features A list of `feature` blocks as defined below.
     * 
     *  &gt; **Note:** The `feature` block allows a Preview Feature to be explicitly Registered or Unregistered for this Resource Provider - once a Feature has been explicitly Registered or Unregistered, it must be specified in the Terraform Configuration (it&#39;s not possible to reset this to the default, unspecified, state).
     * @return builder
     */
    def features(args: Endofunction[com.pulumi.azure.core.inputs.ResourceProviderRegistrationFeatureArgs.Builder]*):
        com.pulumi.azure.core.inputs.ResourceProviderRegistrationState.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.ResourceProviderRegistrationFeatureArgs.builder
      builder.features(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.core.inputs.SubscriptionPolicyAssignmentOverrideArgs.Builder)
    /**
     * @param selectors One or more `overrideSelector` block as defined below.
     * @return builder
     */
    def selectors(args: Endofunction[com.pulumi.azure.core.inputs.SubscriptionPolicyAssignmentOverrideSelectorArgs.Builder]*):
        com.pulumi.azure.core.inputs.SubscriptionPolicyAssignmentOverrideArgs.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.SubscriptionPolicyAssignmentOverrideSelectorArgs.builder
      builder.selectors(args.map(_(argsBuilder).build)*)

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

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.core.inputs.ResourceDeploymentScriptAzureCliState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.core.inputs.ResourcePolicyAssignmentOverrideArgs.Builder)
    /**
     * @param selectors One or more `overrideSelector` block as defined below.
     * @return builder
     */
    def selectors(args: Endofunction[com.pulumi.azure.core.inputs.ResourcePolicyAssignmentOverrideSelectorArgs.Builder]*):
        com.pulumi.azure.core.inputs.ResourcePolicyAssignmentOverrideArgs.Builder =
      def argsBuilder = com.pulumi.azure.core.inputs.ResourcePolicyAssignmentOverrideSelectorArgs.builder
      builder.selectors(args.map(_(argsBuilder).build)*)

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

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.core.ResourceDeploymentScriptPowerShellArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
