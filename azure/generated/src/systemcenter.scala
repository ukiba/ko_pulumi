package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object systemcenter:
  object SystemcenterFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about existing System Center Virtual Machine Manager Inventory Items. */
    inline def getVirtualMachineManagerInventoryItems(args: Endofunction[com.pulumi.azure.systemcenter.inputs.GetVirtualMachineManagerInventoryItemsArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.systemcenter.outputs.GetVirtualMachineManagerInventoryItemsResult] =
      val argsBuilder = com.pulumi.azure.systemcenter.inputs.GetVirtualMachineManagerInventoryItemsArgs.builder
      com.pulumi.azure.systemcenter.SystemcenterFunctions.getVirtualMachineManagerInventoryItems(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about existing System Center Virtual Machine Manager Inventory Items. */
    inline def getVirtualMachineManagerInventoryItemsPlain(args: Endofunction[com.pulumi.azure.systemcenter.inputs.GetVirtualMachineManagerInventoryItemsPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.systemcenter.outputs.GetVirtualMachineManagerInventoryItemsResult] =
      val argsBuilder = com.pulumi.azure.systemcenter.inputs.GetVirtualMachineManagerInventoryItemsPlainArgs.builder
      com.pulumi.azure.systemcenter.SystemcenterFunctions.getVirtualMachineManagerInventoryItemsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages a System Center Virtual Machine Manager Availability Set. */
  def VirtualMachineManagerAvailabilitySet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.systemcenter.VirtualMachineManagerAvailabilitySetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.systemcenter.VirtualMachineManagerAvailabilitySetArgs.builder
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
    com.pulumi.azure.systemcenter.VirtualMachineManagerAvailabilitySet(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a System Center Virtual Machine Manager Cloud. */
  def VirtualMachineManagerCloud(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.systemcenter.VirtualMachineManagerCloudArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.systemcenter.VirtualMachineManagerCloudArgs.builder
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
    com.pulumi.azure.systemcenter.VirtualMachineManagerCloud(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a System Center Virtual Machine Manager Server.
   * 
   * &gt; **Note:** By request of the service team the provider no longer automatically registering the `Microsoft.ScVmm` Resource Provider for this resource. To register it you can run `az provider register --namespace Microsoft.ScVmm`.
   * 
   * &gt; **Note:** This resource depends on an existing `System Center Virtual Machine Manager Host Machine`, `Arc Resource Bridge` and `Custom Location`. Installing and configuring these dependencies is outside the scope of this document. See [Virtual Machine Manager documentation](https://learn.microsoft.com/en-us/system-center/vmm/?view=sc-vmm-2022) and [Install VMM](https://learn.microsoft.com/en-us/system-center/vmm/install?view=sc-vmm-2022) for more details of `System Center Virtual Machine Manager Host Machine`. See [What is Azure Arc resource bridge](https://learn.microsoft.com/en-us/azure/azure-arc/resource-bridge/overview) and [Overview of Arc-enabled System Center Virtual Machine Manager](https://learn.microsoft.com/en-us/azure/azure-arc/system-center-virtual-machine-manager/overview) for more details of `Arc Resource Bridge/Appliance`. See [Create and manage custom locations on Azure Arc-enabled Kubernetes](https://learn.microsoft.com/en-us/azure/azure-arc/kubernetes/custom-locations) for more details of `Custom Location`. If you encounter issues while configuring, we&#39;d recommend opening a ticket with Microsoft Support.
   */
  def VirtualMachineManagerServer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.systemcenter.VirtualMachineManagerServerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.systemcenter.VirtualMachineManagerServerArgs.builder
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
    com.pulumi.azure.systemcenter.VirtualMachineManagerServer(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a System Center Virtual Machine Manager Virtual Machine Instance. */
  def VirtualMachineManagerVirtualMachineInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.systemcenter.VirtualMachineManagerVirtualMachineInstanceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.systemcenter.VirtualMachineManagerVirtualMachineInstanceArgs.builder
    com.pulumi.azure.systemcenter.VirtualMachineManagerVirtualMachineInstance(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a System Center Virtual Machine Manager Virtual Machine Instance Guest Agent.
   * 
   * &gt; **Note:** By request of the service team the provider is no longer automatically registering the `Microsoft.ScVmm` Resource Provider for this resource. To register it you can run `az provider register --namespace Microsoft.ScVmm`.
   */
  def VirtualMachineManagerVirtualMachineInstanceGuestAgent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.systemcenter.VirtualMachineManagerVirtualMachineInstanceGuestAgentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.systemcenter.VirtualMachineManagerVirtualMachineInstanceGuestAgentArgs.builder
    com.pulumi.azure.systemcenter.VirtualMachineManagerVirtualMachineInstanceGuestAgent(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a System Center Virtual Machine Manager Virtual Machine Template. */
  def VirtualMachineManagerVirtualMachineTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.systemcenter.VirtualMachineManagerVirtualMachineTemplateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.systemcenter.VirtualMachineManagerVirtualMachineTemplateArgs.builder
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
    com.pulumi.azure.systemcenter.VirtualMachineManagerVirtualMachineTemplate(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a System Center Virtual Machine Manager Virtual Network. */
  def VirtualMachineManagerVirtualNetwork(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.systemcenter.VirtualMachineManagerVirtualNetworkArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.systemcenter.VirtualMachineManagerVirtualNetworkArgs.builder
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
    com.pulumi.azure.systemcenter.VirtualMachineManagerVirtualNetwork(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
