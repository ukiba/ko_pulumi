package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object systemcenter:
  /** Manages a System Center Virtual Machine Manager Availability Set. */
  def VirtualMachineManagerAvailabilitySet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.systemcenter.VirtualMachineManagerAvailabilitySetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.systemcenter.VirtualMachineManagerAvailabilitySetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.systemcenter.VirtualMachineManagerAvailabilitySet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.systemcenter.VirtualMachineManagerVirtualMachineInstanceArgs.Builder)
    /**
     * @param hardware A `hardware` block as defined below. Changing this forces a new resource to be created.
     * 
     *  &gt; **Note:** This resource will be restarted while updating `hardware`.
     * @return builder
     */
    def hardware(args: Endofunction[com.pulumi.azure.systemcenter.inputs.VirtualMachineManagerVirtualMachineInstanceHardwareArgs.Builder]):
        com.pulumi.azure.systemcenter.VirtualMachineManagerVirtualMachineInstanceArgs.Builder =
      val argsBuilder = com.pulumi.azure.systemcenter.inputs.VirtualMachineManagerVirtualMachineInstanceHardwareArgs.builder
      builder.hardware(args(argsBuilder).build)

    /**
     * @param infrastructure An `infrastructure` block as defined below.
     * @return builder
     */
    def infrastructure(args: Endofunction[com.pulumi.azure.systemcenter.inputs.VirtualMachineManagerVirtualMachineInstanceInfrastructureArgs.Builder]):
        com.pulumi.azure.systemcenter.VirtualMachineManagerVirtualMachineInstanceArgs.Builder =
      val argsBuilder = com.pulumi.azure.systemcenter.inputs.VirtualMachineManagerVirtualMachineInstanceInfrastructureArgs.builder
      builder.infrastructure(args(argsBuilder).build)

    /**
     * @param networkInterfaces A `networkInterface` block as defined below.
     * 
     *  &gt; **Note:** This resource will be restarted while updating `networkInterface`.
     * @return builder
     */
    def networkInterfaces(args: Endofunction[com.pulumi.azure.systemcenter.inputs.VirtualMachineManagerVirtualMachineInstanceNetworkInterfaceArgs.Builder]*):
        com.pulumi.azure.systemcenter.VirtualMachineManagerVirtualMachineInstanceArgs.Builder =
      def argsBuilder = com.pulumi.azure.systemcenter.inputs.VirtualMachineManagerVirtualMachineInstanceNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param operatingSystem An `operatingSystem` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def operatingSystem(args: Endofunction[com.pulumi.azure.systemcenter.inputs.VirtualMachineManagerVirtualMachineInstanceOperatingSystemArgs.Builder]):
        com.pulumi.azure.systemcenter.VirtualMachineManagerVirtualMachineInstanceArgs.Builder =
      val argsBuilder = com.pulumi.azure.systemcenter.inputs.VirtualMachineManagerVirtualMachineInstanceOperatingSystemArgs.builder
      builder.operatingSystem(args(argsBuilder).build)

    /**
     * @param storageDisks A `storageDisk` block as defined below.
     * 
     *  &gt; **Note:** This resource will be restarted while updating `storageDisk`.
     * @return builder
     */
    def storageDisks(args: Endofunction[com.pulumi.azure.systemcenter.inputs.VirtualMachineManagerVirtualMachineInstanceStorageDiskArgs.Builder]*):
        com.pulumi.azure.systemcenter.VirtualMachineManagerVirtualMachineInstanceArgs.Builder =
      def argsBuilder = com.pulumi.azure.systemcenter.inputs.VirtualMachineManagerVirtualMachineInstanceStorageDiskArgs.builder
      builder.storageDisks(args.map(_(argsBuilder).build)*)

  /** Manages a System Center Virtual Machine Manager Virtual Machine Instance. */
  def VirtualMachineManagerVirtualMachineInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.systemcenter.VirtualMachineManagerVirtualMachineInstanceArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.systemcenter.VirtualMachineManagerVirtualMachineInstanceArgs.builder
    com.pulumi.azure.systemcenter.VirtualMachineManagerVirtualMachineInstance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a System Center Virtual Machine Manager Cloud. */
  def VirtualMachineManagerCloud(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.systemcenter.VirtualMachineManagerCloudArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.systemcenter.VirtualMachineManagerCloudArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.systemcenter.VirtualMachineManagerCloud(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a System Center Virtual Machine Manager Virtual Machine Instance Guest Agent.
   * 
   *  &gt; **Note:** By request of the service team the provider is no longer automatically registering the `Microsoft.ScVmm` Resource Provider for this resource. To register it you can run `az provider register --namespace Microsoft.ScVmm`.
   */
  def VirtualMachineManagerVirtualMachineInstanceGuestAgent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.systemcenter.VirtualMachineManagerVirtualMachineInstanceGuestAgentArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.systemcenter.VirtualMachineManagerVirtualMachineInstanceGuestAgentArgs.builder
    com.pulumi.azure.systemcenter.VirtualMachineManagerVirtualMachineInstanceGuestAgent(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a System Center Virtual Machine Manager Virtual Network. */
  def VirtualMachineManagerVirtualNetwork(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.systemcenter.VirtualMachineManagerVirtualNetworkArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.systemcenter.VirtualMachineManagerVirtualNetworkArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.systemcenter.VirtualMachineManagerVirtualNetwork(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type SystemcenterFunctions = com.pulumi.azure.systemcenter.SystemcenterFunctions
  object SystemcenterFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.systemcenter.SystemcenterFunctions.*
  extension (self: SystemcenterFunctions.type)
    /** Use this data source to access information about existing System Center Virtual Machine Manager Inventory Items. */
    def getVirtualMachineManagerInventoryItems(args: Endofunction[com.pulumi.azure.systemcenter.inputs.GetVirtualMachineManagerInventoryItemsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.systemcenter.outputs.GetVirtualMachineManagerInventoryItemsResult] =
      val argsBuilder = com.pulumi.azure.systemcenter.inputs.GetVirtualMachineManagerInventoryItemsArgs.builder
      com.pulumi.azure.systemcenter.SystemcenterFunctions.getVirtualMachineManagerInventoryItems(args(argsBuilder).build)

    /** Use this data source to access information about existing System Center Virtual Machine Manager Inventory Items. */
    def getVirtualMachineManagerInventoryItemsPlain(args: Endofunction[com.pulumi.azure.systemcenter.inputs.GetVirtualMachineManagerInventoryItemsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.systemcenter.outputs.GetVirtualMachineManagerInventoryItemsResult] =
      val argsBuilder = com.pulumi.azure.systemcenter.inputs.GetVirtualMachineManagerInventoryItemsPlainArgs.builder
      com.pulumi.azure.systemcenter.SystemcenterFunctions.getVirtualMachineManagerInventoryItemsPlain(args(argsBuilder).build)

  /**
   * Manages a System Center Virtual Machine Manager Server.
   * 
   *  &gt; **Note:** By request of the service team the provider no longer automatically registering the `Microsoft.ScVmm` Resource Provider for this resource. To register it you can run `az provider register --namespace Microsoft.ScVmm`.
   * 
   *  &gt; **Note:** This resource depends on an existing `System Center Virtual Machine Manager Host Machine`, `Arc Resource Bridge` and `Custom Location`. Installing and configuring these dependencies is outside the scope of this document. See [Virtual Machine Manager documentation](https://learn.microsoft.com/en-us/system-center/vmm/?view=sc-vmm-2022) and [Install VMM](https://learn.microsoft.com/en-us/system-center/vmm/install?view=sc-vmm-2022) for more details of `System Center Virtual Machine Manager Host Machine`. See [What is Azure Arc resource bridge](https://learn.microsoft.com/en-us/azure/azure-arc/resource-bridge/overview) and [Overview of Arc-enabled System Center Virtual Machine Manager](https://learn.microsoft.com/en-us/azure/azure-arc/system-center-virtual-machine-manager/overview) for more details of `Arc Resource Bridge/Appliance`. See [Create and manage custom locations on Azure Arc-enabled Kubernetes](https://learn.microsoft.com/en-us/azure/azure-arc/kubernetes/custom-locations) for more details of `Custom Location`. If you encounter issues while configuring, we&#39;d recommend opening a ticket with Microsoft Support.
   */
  def VirtualMachineManagerServer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.systemcenter.VirtualMachineManagerServerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.systemcenter.VirtualMachineManagerServerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.systemcenter.VirtualMachineManagerServer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a System Center Virtual Machine Manager Virtual Machine Template. */
  def VirtualMachineManagerVirtualMachineTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.systemcenter.VirtualMachineManagerVirtualMachineTemplateArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.systemcenter.VirtualMachineManagerVirtualMachineTemplateArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.systemcenter.VirtualMachineManagerVirtualMachineTemplate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.systemcenter.inputs.VirtualMachineManagerVirtualMachineInstanceState.Builder)
    /**
     * @param hardware A `hardware` block as defined below. Changing this forces a new resource to be created.
     * 
     *  &gt; **Note:** This resource will be restarted while updating `hardware`.
     * @return builder
     */
    def hardware(args: Endofunction[com.pulumi.azure.systemcenter.inputs.VirtualMachineManagerVirtualMachineInstanceHardwareArgs.Builder]):
        com.pulumi.azure.systemcenter.inputs.VirtualMachineManagerVirtualMachineInstanceState.Builder =
      val argsBuilder = com.pulumi.azure.systemcenter.inputs.VirtualMachineManagerVirtualMachineInstanceHardwareArgs.builder
      builder.hardware(args(argsBuilder).build)

    /**
     * @param infrastructure An `infrastructure` block as defined below.
     * @return builder
     */
    def infrastructure(args: Endofunction[com.pulumi.azure.systemcenter.inputs.VirtualMachineManagerVirtualMachineInstanceInfrastructureArgs.Builder]):
        com.pulumi.azure.systemcenter.inputs.VirtualMachineManagerVirtualMachineInstanceState.Builder =
      val argsBuilder = com.pulumi.azure.systemcenter.inputs.VirtualMachineManagerVirtualMachineInstanceInfrastructureArgs.builder
      builder.infrastructure(args(argsBuilder).build)

    /**
     * @param networkInterfaces A `networkInterface` block as defined below.
     * 
     *  &gt; **Note:** This resource will be restarted while updating `networkInterface`.
     * @return builder
     */
    def networkInterfaces(args: Endofunction[com.pulumi.azure.systemcenter.inputs.VirtualMachineManagerVirtualMachineInstanceNetworkInterfaceArgs.Builder]*):
        com.pulumi.azure.systemcenter.inputs.VirtualMachineManagerVirtualMachineInstanceState.Builder =
      def argsBuilder = com.pulumi.azure.systemcenter.inputs.VirtualMachineManagerVirtualMachineInstanceNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param operatingSystem An `operatingSystem` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def operatingSystem(args: Endofunction[com.pulumi.azure.systemcenter.inputs.VirtualMachineManagerVirtualMachineInstanceOperatingSystemArgs.Builder]):
        com.pulumi.azure.systemcenter.inputs.VirtualMachineManagerVirtualMachineInstanceState.Builder =
      val argsBuilder = com.pulumi.azure.systemcenter.inputs.VirtualMachineManagerVirtualMachineInstanceOperatingSystemArgs.builder
      builder.operatingSystem(args(argsBuilder).build)

    /**
     * @param storageDisks A `storageDisk` block as defined below.
     * 
     *  &gt; **Note:** This resource will be restarted while updating `storageDisk`.
     * @return builder
     */
    def storageDisks(args: Endofunction[com.pulumi.azure.systemcenter.inputs.VirtualMachineManagerVirtualMachineInstanceStorageDiskArgs.Builder]*):
        com.pulumi.azure.systemcenter.inputs.VirtualMachineManagerVirtualMachineInstanceState.Builder =
      def argsBuilder = com.pulumi.azure.systemcenter.inputs.VirtualMachineManagerVirtualMachineInstanceStorageDiskArgs.builder
      builder.storageDisks(args.map(_(argsBuilder).build)*)
