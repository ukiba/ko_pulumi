package jp.ukiba.ko_pulumi
package azure

object systemcenter_ext:
  extension (builder: com.pulumi.azure.systemcenter.VirtualMachineManagerVirtualMachineInstanceArgs.Builder)
    /**
     * @param hardware A `hardware` block as defined below. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** This resource will be restarted while updating `hardware`.
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
     * &gt; **Note:** This resource will be restarted while updating `networkInterface`.
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
     * &gt; **Note:** This resource will be restarted while updating `storageDisk`.
     * @return builder
     */
    def storageDisks(args: Endofunction[com.pulumi.azure.systemcenter.inputs.VirtualMachineManagerVirtualMachineInstanceStorageDiskArgs.Builder]*):
        com.pulumi.azure.systemcenter.VirtualMachineManagerVirtualMachineInstanceArgs.Builder =
      def argsBuilder = com.pulumi.azure.systemcenter.inputs.VirtualMachineManagerVirtualMachineInstanceStorageDiskArgs.builder
      builder.storageDisks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.systemcenter.inputs.VirtualMachineManagerVirtualMachineInstanceState.Builder)
    /**
     * @param hardware A `hardware` block as defined below. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** This resource will be restarted while updating `hardware`.
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
     * &gt; **Note:** This resource will be restarted while updating `networkInterface`.
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
     * &gt; **Note:** This resource will be restarted while updating `storageDisk`.
     * @return builder
     */
    def storageDisks(args: Endofunction[com.pulumi.azure.systemcenter.inputs.VirtualMachineManagerVirtualMachineInstanceStorageDiskArgs.Builder]*):
        com.pulumi.azure.systemcenter.inputs.VirtualMachineManagerVirtualMachineInstanceState.Builder =
      def argsBuilder = com.pulumi.azure.systemcenter.inputs.VirtualMachineManagerVirtualMachineInstanceStorageDiskArgs.builder
      builder.storageDisks(args.map(_(argsBuilder).build)*)
