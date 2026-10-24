package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object maintenance:
  /** Manages a maintenance assignment to Dedicated Host. */
  def AssignmentDedicatedHost(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.maintenance.AssignmentDedicatedHostArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.maintenance.AssignmentDedicatedHostArgs.builder
    com.pulumi.azure.maintenance.AssignmentDedicatedHost(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
  def AssignmentDynamicScope(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.maintenance.AssignmentDynamicScopeArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.maintenance.AssignmentDynamicScopeArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.maintenance.AssignmentDynamicScope(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a maintenance assignment to virtual machine. */
  def AssignmentVirtualMachine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.maintenance.AssignmentVirtualMachineArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.maintenance.AssignmentVirtualMachineArgs.builder
    com.pulumi.azure.maintenance.AssignmentVirtualMachine(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a maintenance assignment to a virtual machine scale set. */
  def AssignmentVirtualMachineScaleSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.maintenance.AssignmentVirtualMachineScaleSetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.maintenance.AssignmentVirtualMachineScaleSetArgs.builder
    com.pulumi.azure.maintenance.AssignmentVirtualMachineScaleSet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a maintenance configuration. */
  def Configuration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.maintenance.ConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object MaintenanceFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Maintenance Configuration. */
    inline def getConfiguration(args: Endofunction[com.pulumi.azure.maintenance.inputs.GetConfigurationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.maintenance.outputs.GetConfigurationResult] =
      val argsBuilder = com.pulumi.azure.maintenance.inputs.GetConfigurationArgs.builder
      com.pulumi.azure.maintenance.MaintenanceFunctions.getConfiguration(args(argsBuilder).build)

    /** Use this data source to access information about an existing Maintenance Configuration. */
    inline def getConfigurationPlain(args: Endofunction[com.pulumi.azure.maintenance.inputs.GetConfigurationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.maintenance.outputs.GetConfigurationResult] =
      val argsBuilder = com.pulumi.azure.maintenance.inputs.GetConfigurationPlainArgs.builder
      com.pulumi.azure.maintenance.MaintenanceFunctions.getConfigurationPlain(args(argsBuilder).build)

    /** Use this data source to access information about existing Public Maintenance Configurations. */
    inline def getPublicConfigurations(args: Endofunction[com.pulumi.azure.maintenance.inputs.GetPublicConfigurationsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.maintenance.outputs.GetPublicConfigurationsResult] =
      val argsBuilder = com.pulumi.azure.maintenance.inputs.GetPublicConfigurationsArgs.builder
      com.pulumi.azure.maintenance.MaintenanceFunctions.getPublicConfigurations(args(argsBuilder).build)

    /** Use this data source to access information about existing Public Maintenance Configurations. */
    inline def getPublicConfigurationsPlain(args: Endofunction[com.pulumi.azure.maintenance.inputs.GetPublicConfigurationsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.maintenance.outputs.GetPublicConfigurationsResult] =
      val argsBuilder = com.pulumi.azure.maintenance.inputs.GetPublicConfigurationsPlainArgs.builder
      com.pulumi.azure.maintenance.MaintenanceFunctions.getPublicConfigurationsPlain(args(argsBuilder).build)
