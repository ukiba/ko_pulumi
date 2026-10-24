package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object maintenance:
  /** Manages a maintenance assignment to Dedicated Host. */
  def AssignmentDedicatedHost(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.maintenance.AssignmentDedicatedHostArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.maintenance.AssignmentDedicatedHostArgs.builder
    com.pulumi.azure.maintenance.AssignmentDedicatedHost(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Dynamic Maintenance Assignment.
   * 
   * &gt; **Note:** Only valid for `InGuestPatch` Maintenance Configuration Scopes.
   * 
   * ## Import
   * 
   * Dynamic Maintenance Assignments can be imported using the `resource id`, e.g.
   * 
   * ```sh
   * \$ pulumi import azure:maintenance/assignmentDynamicScope:AssignmentDynamicScope example /subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.Maintenance/configurationAssignments/assignmentName
   * ```
   */
  def AssignmentDynamicScope(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.maintenance.AssignmentDynamicScopeArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.maintenance.AssignmentDynamicScopeArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.maintenance.AssignmentDynamicScope(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a maintenance assignment to virtual machine. */
  def AssignmentVirtualMachine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.maintenance.AssignmentVirtualMachineArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.maintenance.AssignmentVirtualMachineArgs.builder
    com.pulumi.azure.maintenance.AssignmentVirtualMachine(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a maintenance assignment to a virtual machine scale set. */
  def AssignmentVirtualMachineScaleSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.maintenance.AssignmentVirtualMachineScaleSetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.maintenance.AssignmentVirtualMachineScaleSetArgs.builder
    com.pulumi.azure.maintenance.AssignmentVirtualMachineScaleSet(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a maintenance configuration. */
  def Configuration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.maintenance.ConfigurationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.maintenance.ConfigurationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.maintenance.Configuration(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object MaintenanceFunctions:
    /** Use this data source to access information about an existing Maintenance Configuration. */
    inline def getConfiguration(args: Endofunction[com.pulumi.azure.maintenance.inputs.GetConfigurationArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.maintenance.outputs.GetConfigurationResult] =
      val argsBuilder = com.pulumi.azure.maintenance.inputs.GetConfigurationArgs.builder
      com.pulumi.azure.maintenance.MaintenanceFunctions.getConfiguration(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Maintenance Configuration. */
    inline def getConfigurationPlain(args: Endofunction[com.pulumi.azure.maintenance.inputs.GetConfigurationPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.maintenance.outputs.GetConfigurationResult] =
      val argsBuilder = com.pulumi.azure.maintenance.inputs.GetConfigurationPlainArgs.builder
      com.pulumi.azure.maintenance.MaintenanceFunctions.getConfigurationPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about existing Public Maintenance Configurations. */
    inline def getPublicConfigurations(args: Endofunction[com.pulumi.azure.maintenance.inputs.GetPublicConfigurationsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.maintenance.outputs.GetPublicConfigurationsResult] =
      val argsBuilder = com.pulumi.azure.maintenance.inputs.GetPublicConfigurationsArgs.builder
      com.pulumi.azure.maintenance.MaintenanceFunctions.getPublicConfigurations(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about existing Public Maintenance Configurations. */
    inline def getPublicConfigurationsPlain(args: Endofunction[com.pulumi.azure.maintenance.inputs.GetPublicConfigurationsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.maintenance.outputs.GetPublicConfigurationsResult] =
      val argsBuilder = com.pulumi.azure.maintenance.inputs.GetPublicConfigurationsPlainArgs.builder
      com.pulumi.azure.maintenance.MaintenanceFunctions.getPublicConfigurationsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
