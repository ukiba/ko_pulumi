package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object maintenance:
  extension (builder: com.pulumi.azure.maintenance.ConfigurationArgs.Builder)
    /**
     * @param installPatches An `installPatches` block as defined below.
     * 
     *  &gt; **Note:** `installPatches` must be specified when `scope` is `InGuestPatch`.
     * @return builder
     */
    def installPatches(args: Endofunction[com.pulumi.azure.maintenance.inputs.ConfigurationInstallPatchesArgs.Builder]):
        com.pulumi.azure.maintenance.ConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.maintenance.inputs.ConfigurationInstallPatchesArgs.builder
      builder.installPatches(args(argsBuilder).build)

    /**
     * @param window A `window` block as defined below.
     * @return builder
     */
    def window(args: Endofunction[com.pulumi.azure.maintenance.inputs.ConfigurationWindowArgs.Builder]):
        com.pulumi.azure.maintenance.ConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.maintenance.inputs.ConfigurationWindowArgs.builder
      builder.window(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.maintenance.ConfigurationArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.maintenance.AssignmentDynamicScopeArgs.Builder)
    /**
     * @param filter A `filter` block as defined below.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.azure.maintenance.inputs.AssignmentDynamicScopeFilterArgs.Builder]):
        com.pulumi.azure.maintenance.AssignmentDynamicScopeArgs.Builder =
      val argsBuilder = com.pulumi.azure.maintenance.inputs.AssignmentDynamicScopeFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  /** Manages a maintenance assignment to virtual machine. */
  def AssignmentVirtualMachine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.maintenance.AssignmentVirtualMachineArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.maintenance.AssignmentVirtualMachineArgs.builder
    com.pulumi.azure.maintenance.AssignmentVirtualMachine(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a maintenance configuration. */
  def Configuration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.maintenance.ConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.maintenance.ConfigurationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.maintenance.Configuration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Dynamic Maintenance Assignment.
   * 
   *  &gt; **Note:** Only valid for `InGuestPatch` Maintenance Configuration Scopes.
   * 
   *  ## Import
   * 
   *  Dynamic Maintenance Assignments can be imported using the `resource id`, e.g.
   * 
   *  ```sh
   *  $ pulumi import azure:maintenance/assignmentDynamicScope:AssignmentDynamicScope example /subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.Maintenance/configurationAssignments/assignmentName
   *  ```
   */
  def AssignmentDynamicScope(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.maintenance.AssignmentDynamicScopeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.maintenance.AssignmentDynamicScopeArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.maintenance.AssignmentDynamicScope(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type MaintenanceFunctions = com.pulumi.azure.maintenance.MaintenanceFunctions
  object MaintenanceFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.maintenance.MaintenanceFunctions.*
  extension (self: MaintenanceFunctions.type)
    /** Use this data source to access information about an existing Maintenance Configuration. */
    def getConfiguration(args: Endofunction[com.pulumi.azure.maintenance.inputs.GetConfigurationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.maintenance.outputs.GetConfigurationResult] =
      val argsBuilder = com.pulumi.azure.maintenance.inputs.GetConfigurationArgs.builder
      com.pulumi.azure.maintenance.MaintenanceFunctions.getConfiguration(args(argsBuilder).build)

    /** Use this data source to access information about an existing Maintenance Configuration. */
    def getConfigurationPlain(args: Endofunction[com.pulumi.azure.maintenance.inputs.GetConfigurationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.maintenance.outputs.GetConfigurationResult] =
      val argsBuilder = com.pulumi.azure.maintenance.inputs.GetConfigurationPlainArgs.builder
      com.pulumi.azure.maintenance.MaintenanceFunctions.getConfigurationPlain(args(argsBuilder).build)

    /** Use this data source to access information about existing Public Maintenance Configurations. */
    def getPublicConfigurations(args: Endofunction[com.pulumi.azure.maintenance.inputs.GetPublicConfigurationsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.maintenance.outputs.GetPublicConfigurationsResult] =
      val argsBuilder = com.pulumi.azure.maintenance.inputs.GetPublicConfigurationsArgs.builder
      com.pulumi.azure.maintenance.MaintenanceFunctions.getPublicConfigurations(args(argsBuilder).build)

    /** Use this data source to access information about existing Public Maintenance Configurations. */
    def getPublicConfigurationsPlain(args: Endofunction[com.pulumi.azure.maintenance.inputs.GetPublicConfigurationsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.maintenance.outputs.GetPublicConfigurationsResult] =
      val argsBuilder = com.pulumi.azure.maintenance.inputs.GetPublicConfigurationsPlainArgs.builder
      com.pulumi.azure.maintenance.MaintenanceFunctions.getPublicConfigurationsPlain(args(argsBuilder).build)

  /** Manages a maintenance assignment to Dedicated Host. */
  def AssignmentDedicatedHost(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.maintenance.AssignmentDedicatedHostArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.maintenance.AssignmentDedicatedHostArgs.builder
    com.pulumi.azure.maintenance.AssignmentDedicatedHost(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a maintenance assignment to a virtual machine scale set. */
  def AssignmentVirtualMachineScaleSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.maintenance.AssignmentVirtualMachineScaleSetArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.maintenance.AssignmentVirtualMachineScaleSetArgs.builder
    com.pulumi.azure.maintenance.AssignmentVirtualMachineScaleSet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.maintenance.inputs.ConfigurationState.Builder)
    /**
     * @param installPatches An `installPatches` block as defined below.
     * 
     *  &gt; **Note:** `installPatches` must be specified when `scope` is `InGuestPatch`.
     * @return builder
     */
    def installPatches(args: Endofunction[com.pulumi.azure.maintenance.inputs.ConfigurationInstallPatchesArgs.Builder]):
        com.pulumi.azure.maintenance.inputs.ConfigurationState.Builder =
      val argsBuilder = com.pulumi.azure.maintenance.inputs.ConfigurationInstallPatchesArgs.builder
      builder.installPatches(args(argsBuilder).build)

    /**
     * @param window A `window` block as defined below.
     * @return builder
     */
    def window(args: Endofunction[com.pulumi.azure.maintenance.inputs.ConfigurationWindowArgs.Builder]):
        com.pulumi.azure.maintenance.inputs.ConfigurationState.Builder =
      val argsBuilder = com.pulumi.azure.maintenance.inputs.ConfigurationWindowArgs.builder
      builder.window(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.maintenance.inputs.ConfigurationState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.maintenance.inputs.ConfigurationInstallPatchesArgs.Builder)
    /**
     * @param linuxes A `linux` block as defined above. This property only applies when `scope` is set to `InGuestPatch`
     * @return builder
     */
    def linuxes(args: Endofunction[com.pulumi.azure.maintenance.inputs.ConfigurationInstallPatchesLinuxArgs.Builder]*):
        com.pulumi.azure.maintenance.inputs.ConfigurationInstallPatchesArgs.Builder =
      def argsBuilder = com.pulumi.azure.maintenance.inputs.ConfigurationInstallPatchesLinuxArgs.builder
      builder.linuxes(args.map(_(argsBuilder).build)*)

    /**
     * @param windows A `windows` block as defined above. This property only applies when `scope` is set to `InGuestPatch`
     * @return builder
     */
    def windows(args: Endofunction[com.pulumi.azure.maintenance.inputs.ConfigurationInstallPatchesWindowArgs.Builder]*):
        com.pulumi.azure.maintenance.inputs.ConfigurationInstallPatchesArgs.Builder =
      def argsBuilder = com.pulumi.azure.maintenance.inputs.ConfigurationInstallPatchesWindowArgs.builder
      builder.windows(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.maintenance.inputs.AssignmentDynamicScopeFilterArgs.Builder)
    /**
     * @param tags One or more `tags` blocks as defined below.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.azure.maintenance.inputs.AssignmentDynamicScopeFilterTagArgs.Builder]*):
        com.pulumi.azure.maintenance.inputs.AssignmentDynamicScopeFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.maintenance.inputs.AssignmentDynamicScopeFilterTagArgs.builder
      builder.tags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.maintenance.inputs.AssignmentDynamicScopeState.Builder)
    /**
     * @param filter A `filter` block as defined below.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.azure.maintenance.inputs.AssignmentDynamicScopeFilterArgs.Builder]):
        com.pulumi.azure.maintenance.inputs.AssignmentDynamicScopeState.Builder =
      val argsBuilder = com.pulumi.azure.maintenance.inputs.AssignmentDynamicScopeFilterArgs.builder
      builder.filter(args(argsBuilder).build)
