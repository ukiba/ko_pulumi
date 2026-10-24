package jp.ukiba.ko_pulumi
package azure

object siterecovery_ext:
  extension (builder: com.pulumi.azure.siterecovery.ProtectionContainerMappingArgs.Builder)
    /**
     * @param automaticUpdate a `automaticUpdate` block defined as below.
     * @return builder
     */
    inline def automaticUpdate(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ProtectionContainerMappingAutomaticUpdateArgs.Builder]):
        com.pulumi.azure.siterecovery.ProtectionContainerMappingArgs.Builder =
      val argsBuilder = com.pulumi.azure.siterecovery.inputs.ProtectionContainerMappingAutomaticUpdateArgs.builder
      builder.automaticUpdate(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.siterecovery.ReplicatedVMArgs.Builder)
    /**
     * @param managedDisks One or more `managedDisk` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def managedDisks(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicatedVMManagedDiskArgs.Builder]*):
        com.pulumi.azure.siterecovery.ReplicatedVMArgs.Builder =
      def argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicatedVMManagedDiskArgs.builder
      builder.managedDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param networkInterfaces One or more `networkInterface` block as defined below.
     * @return builder
     */
    inline def networkInterfaces(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicatedVMNetworkInterfaceArgs.Builder]*):
        com.pulumi.azure.siterecovery.ReplicatedVMArgs.Builder =
      def argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicatedVMNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param unmanagedDisks One or more `unmanagedDisk` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def unmanagedDisks(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicatedVMUnmanagedDiskArgs.Builder]*):
        com.pulumi.azure.siterecovery.ReplicatedVMArgs.Builder =
      def argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicatedVMUnmanagedDiskArgs.builder
      builder.unmanagedDisks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.siterecovery.ReplicationRecoveryPlanArgs.Builder)
    /**
     * @param azureToAzureSettings An `azureToAzureSettings` block as defined below.
     * @return builder
     */
    inline def azureToAzureSettings(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanAzureToAzureSettingsArgs.Builder]):
        com.pulumi.azure.siterecovery.ReplicationRecoveryPlanArgs.Builder =
      val argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanAzureToAzureSettingsArgs.builder
      builder.azureToAzureSettings(args(argsBuilder).build)

    /**
     * @param bootRecoveryGroups One or more `bootRecoveryGroup` blocks as defined below.
     * @return builder
     */
    inline def bootRecoveryGroups(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanBootRecoveryGroupArgs.Builder]*):
        com.pulumi.azure.siterecovery.ReplicationRecoveryPlanArgs.Builder =
      def argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanBootRecoveryGroupArgs.builder
      builder.bootRecoveryGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param failoverRecoveryGroup One `failoverRecoveryGroup` block as defined below.
     * @return builder
     */
    inline def failoverRecoveryGroup(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanFailoverRecoveryGroupArgs.Builder]):
        com.pulumi.azure.siterecovery.ReplicationRecoveryPlanArgs.Builder =
      val argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanFailoverRecoveryGroupArgs.builder
      builder.failoverRecoveryGroup(args(argsBuilder).build)

    /**
     * @param shutdownRecoveryGroup One `shutdownRecoveryGroup` block as defined below.
     * @return builder
     */
    inline def shutdownRecoveryGroup(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanShutdownRecoveryGroupArgs.Builder]):
        com.pulumi.azure.siterecovery.ReplicationRecoveryPlanArgs.Builder =
      val argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanShutdownRecoveryGroupArgs.builder
      builder.shutdownRecoveryGroup(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.siterecovery.VmwareReplicatedVmArgs.Builder)
    /**
     * @param managedDisks One or more `managedDisk` block as defined below. It&#39;s available only if mobility service is already installed on the source VM.
     * 
     * &gt; **Note:** A replicated VM could be created without `managedDisk` block, once the block has been specified, changing it expect removing it forces a new resource to be created.
     * @return builder
     */
    inline def managedDisks(args: Endofunction[com.pulumi.azure.siterecovery.inputs.VmwareReplicatedVmManagedDiskArgs.Builder]*):
        com.pulumi.azure.siterecovery.VmwareReplicatedVmArgs.Builder =
      def argsBuilder = com.pulumi.azure.siterecovery.inputs.VmwareReplicatedVmManagedDiskArgs.builder
      builder.managedDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param networkInterfaces One or more `networkInterface` block as defined below.
     * @return builder
     */
    inline def networkInterfaces(args: Endofunction[com.pulumi.azure.siterecovery.inputs.VmwareReplicatedVmNetworkInterfaceArgs.Builder]*):
        com.pulumi.azure.siterecovery.VmwareReplicatedVmArgs.Builder =
      def argsBuilder = com.pulumi.azure.siterecovery.inputs.VmwareReplicatedVmNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.siterecovery.inputs.ProtectionContainerMappingState.Builder)
    /**
     * @param automaticUpdate a `automaticUpdate` block defined as below.
     * @return builder
     */
    inline def automaticUpdate(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ProtectionContainerMappingAutomaticUpdateArgs.Builder]):
        com.pulumi.azure.siterecovery.inputs.ProtectionContainerMappingState.Builder =
      val argsBuilder = com.pulumi.azure.siterecovery.inputs.ProtectionContainerMappingAutomaticUpdateArgs.builder
      builder.automaticUpdate(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.siterecovery.inputs.ReplicatedVMManagedDiskArgs.Builder)
    /**
     * @param targetDiskEncryption A `targetDiskEncryption` block as defined below.
     * @return builder
     */
    inline def targetDiskEncryption(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicatedVMManagedDiskTargetDiskEncryptionArgs.Builder]):
        com.pulumi.azure.siterecovery.inputs.ReplicatedVMManagedDiskArgs.Builder =
      val argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicatedVMManagedDiskTargetDiskEncryptionArgs.builder
      builder.targetDiskEncryption(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.siterecovery.inputs.ReplicatedVMManagedDiskTargetDiskEncryptionArgs.Builder)
    /**
     * @param diskEncryptionKey A `diskEncryptionKey` block as defined below.
     * @return builder
     */
    inline def diskEncryptionKey(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicatedVMManagedDiskTargetDiskEncryptionDiskEncryptionKeyArgs.Builder]):
        com.pulumi.azure.siterecovery.inputs.ReplicatedVMManagedDiskTargetDiskEncryptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicatedVMManagedDiskTargetDiskEncryptionDiskEncryptionKeyArgs.builder
      builder.diskEncryptionKey(args(argsBuilder).build)

    /**
     * @param keyEncryptionKey A `keyEncryptionKey` block as defined below.
     * @return builder
     */
    inline def keyEncryptionKey(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicatedVMManagedDiskTargetDiskEncryptionKeyEncryptionKeyArgs.Builder]):
        com.pulumi.azure.siterecovery.inputs.ReplicatedVMManagedDiskTargetDiskEncryptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicatedVMManagedDiskTargetDiskEncryptionKeyEncryptionKeyArgs.builder
      builder.keyEncryptionKey(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.siterecovery.inputs.ReplicatedVMState.Builder)
    /**
     * @param managedDisks One or more `managedDisk` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def managedDisks(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicatedVMManagedDiskArgs.Builder]*):
        com.pulumi.azure.siterecovery.inputs.ReplicatedVMState.Builder =
      def argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicatedVMManagedDiskArgs.builder
      builder.managedDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param networkInterfaces One or more `networkInterface` block as defined below.
     * @return builder
     */
    inline def networkInterfaces(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicatedVMNetworkInterfaceArgs.Builder]*):
        com.pulumi.azure.siterecovery.inputs.ReplicatedVMState.Builder =
      def argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicatedVMNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param unmanagedDisks One or more `unmanagedDisk` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def unmanagedDisks(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicatedVMUnmanagedDiskArgs.Builder]*):
        com.pulumi.azure.siterecovery.inputs.ReplicatedVMState.Builder =
      def argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicatedVMUnmanagedDiskArgs.builder
      builder.unmanagedDisks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanBootRecoveryGroupArgs.Builder)
    /**
     * @param postActions one or more `action` block as defined below. which will be executed after the group recovery.
     * @return builder
     */
    inline def postActions(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanBootRecoveryGroupPostActionArgs.Builder]*):
        com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanBootRecoveryGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanBootRecoveryGroupPostActionArgs.builder
      builder.postActions(args.map(_(argsBuilder).build)*)

    /**
     * @param preActions one or more `action` block as defined below. which will be executed before the group recovery.
     * @return builder
     */
    inline def preActions(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanBootRecoveryGroupPreActionArgs.Builder]*):
        com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanBootRecoveryGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanBootRecoveryGroupPreActionArgs.builder
      builder.preActions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanFailoverRecoveryGroupArgs.Builder)
    /**
     * @param postActions one or more `action` block as defined below. which will be executed after the group recovery.
     * @return builder
     */
    inline def postActions(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanFailoverRecoveryGroupPostActionArgs.Builder]*):
        com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanFailoverRecoveryGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanFailoverRecoveryGroupPostActionArgs.builder
      builder.postActions(args.map(_(argsBuilder).build)*)

    /**
     * @param preActions one or more `action` block as defined below. which will be executed before the group recovery.
     * @return builder
     */
    inline def preActions(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanFailoverRecoveryGroupPreActionArgs.Builder]*):
        com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanFailoverRecoveryGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanFailoverRecoveryGroupPreActionArgs.builder
      builder.preActions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanShutdownRecoveryGroupArgs.Builder)
    /**
     * @param postActions one or more `action` block as defined below. which will be executed after the group recovery.
     * @return builder
     */
    inline def postActions(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanShutdownRecoveryGroupPostActionArgs.Builder]*):
        com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanShutdownRecoveryGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanShutdownRecoveryGroupPostActionArgs.builder
      builder.postActions(args.map(_(argsBuilder).build)*)

    /**
     * @param preActions one or more `action` block as defined below. which will be executed before the group recovery.
     * @return builder
     */
    inline def preActions(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanShutdownRecoveryGroupPreActionArgs.Builder]*):
        com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanShutdownRecoveryGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanShutdownRecoveryGroupPreActionArgs.builder
      builder.preActions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanState.Builder)
    /**
     * @param azureToAzureSettings An `azureToAzureSettings` block as defined below.
     * @return builder
     */
    inline def azureToAzureSettings(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanAzureToAzureSettingsArgs.Builder]):
        com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanState.Builder =
      val argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanAzureToAzureSettingsArgs.builder
      builder.azureToAzureSettings(args(argsBuilder).build)

    /**
     * @param bootRecoveryGroups One or more `bootRecoveryGroup` blocks as defined below.
     * @return builder
     */
    inline def bootRecoveryGroups(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanBootRecoveryGroupArgs.Builder]*):
        com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanState.Builder =
      def argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanBootRecoveryGroupArgs.builder
      builder.bootRecoveryGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param failoverRecoveryGroup One `failoverRecoveryGroup` block as defined below.
     * @return builder
     */
    inline def failoverRecoveryGroup(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanFailoverRecoveryGroupArgs.Builder]):
        com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanState.Builder =
      val argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanFailoverRecoveryGroupArgs.builder
      builder.failoverRecoveryGroup(args(argsBuilder).build)

    /**
     * @param shutdownRecoveryGroup One `shutdownRecoveryGroup` block as defined below.
     * @return builder
     */
    inline def shutdownRecoveryGroup(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanShutdownRecoveryGroupArgs.Builder]):
        com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanState.Builder =
      val argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanShutdownRecoveryGroupArgs.builder
      builder.shutdownRecoveryGroup(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.siterecovery.inputs.VmwareReplicatedVmState.Builder)
    /**
     * @param managedDisks One or more `managedDisk` block as defined below. It&#39;s available only if mobility service is already installed on the source VM.
     * 
     * &gt; **Note:** A replicated VM could be created without `managedDisk` block, once the block has been specified, changing it expect removing it forces a new resource to be created.
     * @return builder
     */
    inline def managedDisks(args: Endofunction[com.pulumi.azure.siterecovery.inputs.VmwareReplicatedVmManagedDiskArgs.Builder]*):
        com.pulumi.azure.siterecovery.inputs.VmwareReplicatedVmState.Builder =
      def argsBuilder = com.pulumi.azure.siterecovery.inputs.VmwareReplicatedVmManagedDiskArgs.builder
      builder.managedDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param networkInterfaces One or more `networkInterface` block as defined below.
     * @return builder
     */
    inline def networkInterfaces(args: Endofunction[com.pulumi.azure.siterecovery.inputs.VmwareReplicatedVmNetworkInterfaceArgs.Builder]*):
        com.pulumi.azure.siterecovery.inputs.VmwareReplicatedVmState.Builder =
      def argsBuilder = com.pulumi.azure.siterecovery.inputs.VmwareReplicatedVmNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)
