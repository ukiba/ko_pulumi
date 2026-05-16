package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object siterecovery:
  object SiterecoveryFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Site Recovery Replication Fabric. */
    inline def getFabric(args: Endofunction[com.pulumi.azure.siterecovery.inputs.GetFabricArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.siterecovery.outputs.GetFabricResult] =
      val argsBuilder = com.pulumi.azure.siterecovery.inputs.GetFabricArgs.builder
      com.pulumi.azure.siterecovery.SiterecoveryFunctions.getFabric(args(argsBuilder).build)

    /** Use this data source to access information about an existing Site Recovery Replication Fabric. */
    inline def getFabricPlain(args: Endofunction[com.pulumi.azure.siterecovery.inputs.GetFabricPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.siterecovery.outputs.GetFabricResult] =
      val argsBuilder = com.pulumi.azure.siterecovery.inputs.GetFabricPlainArgs.builder
      com.pulumi.azure.siterecovery.SiterecoveryFunctions.getFabricPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing site recovery services protection container. */
    inline def getProtectionContainer(args: Endofunction[com.pulumi.azure.siterecovery.inputs.GetProtectionContainerArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.siterecovery.outputs.GetProtectionContainerResult] =
      val argsBuilder = com.pulumi.azure.siterecovery.inputs.GetProtectionContainerArgs.builder
      com.pulumi.azure.siterecovery.SiterecoveryFunctions.getProtectionContainer(args(argsBuilder).build)

    /** Use this data source to access information about an existing site recovery services protection container. */
    inline def getProtectionContainerPlain(args: Endofunction[com.pulumi.azure.siterecovery.inputs.GetProtectionContainerPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.siterecovery.outputs.GetProtectionContainerResult] =
      val argsBuilder = com.pulumi.azure.siterecovery.inputs.GetProtectionContainerPlainArgs.builder
      com.pulumi.azure.siterecovery.SiterecoveryFunctions.getProtectionContainerPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Azure Site Recovery replication policy. */
    inline def getReplicationPolicy(args: Endofunction[com.pulumi.azure.siterecovery.inputs.GetReplicationPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.siterecovery.outputs.GetReplicationPolicyResult] =
      val argsBuilder = com.pulumi.azure.siterecovery.inputs.GetReplicationPolicyArgs.builder
      com.pulumi.azure.siterecovery.SiterecoveryFunctions.getReplicationPolicy(args(argsBuilder).build)

    /** Use this data source to access information about an existing Azure Site Recovery replication policy. */
    inline def getReplicationPolicyPlain(args: Endofunction[com.pulumi.azure.siterecovery.inputs.GetReplicationPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.siterecovery.outputs.GetReplicationPolicyResult] =
      val argsBuilder = com.pulumi.azure.siterecovery.inputs.GetReplicationPolicyPlainArgs.builder
      com.pulumi.azure.siterecovery.SiterecoveryFunctions.getReplicationPolicyPlain(args(argsBuilder).build)

    /** Get information about an Azure Site Recovery Plan within a Recovery Services vault. A recovery plan gathers machines into recovery groups for the purpose of failover. */
    inline def getReplicationRecoveryPlan(args: Endofunction[com.pulumi.azure.siterecovery.inputs.GetReplicationRecoveryPlanArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.siterecovery.outputs.GetReplicationRecoveryPlanResult] =
      val argsBuilder = com.pulumi.azure.siterecovery.inputs.GetReplicationRecoveryPlanArgs.builder
      com.pulumi.azure.siterecovery.SiterecoveryFunctions.getReplicationRecoveryPlan(args(argsBuilder).build)

    /** Get information about an Azure Site Recovery Plan within a Recovery Services vault. A recovery plan gathers machines into recovery groups for the purpose of failover. */
    inline def getReplicationRecoveryPlanPlain(args: Endofunction[com.pulumi.azure.siterecovery.inputs.GetReplicationRecoveryPlanPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.siterecovery.outputs.GetReplicationRecoveryPlanResult] =
      val argsBuilder = com.pulumi.azure.siterecovery.inputs.GetReplicationRecoveryPlanPlainArgs.builder
      com.pulumi.azure.siterecovery.SiterecoveryFunctions.getReplicationRecoveryPlanPlain(args(argsBuilder).build)

  /** Manages an Azure Site Recovery replication policy for VMWare within a Recovery Vault. */
  def VmwareReplicationPolicyAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.siterecovery.VmwareReplicationPolicyAssociationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.siterecovery.VmwareReplicationPolicyAssociationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.siterecovery.VmwareReplicationPolicyAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a VMWare Replication Policy. */
  def VMWareReplicationPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.siterecovery.VMWareReplicationPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.siterecovery.VMWareReplicationPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.siterecovery.VMWareReplicationPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.siterecovery.VmwareReplicatedVmArgs.Builder)
    /**
     * @param managedDisks One or more `managedDisk` block as defined below. It&#39;s available only if mobility service is already installed on the source VM.
     * 
     *  &gt; **Note:** A replicated VM could be created without `managedDisk` block, once the block has been specified, changing it expect removing it forces a new resource to be created.
     * @return builder
     */
    def managedDisks(args: Endofunction[com.pulumi.azure.siterecovery.inputs.VmwareReplicatedVmManagedDiskArgs.Builder]*):
        com.pulumi.azure.siterecovery.VmwareReplicatedVmArgs.Builder =
      def argsBuilder = com.pulumi.azure.siterecovery.inputs.VmwareReplicatedVmManagedDiskArgs.builder
      builder.managedDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param networkInterfaces One or more `networkInterface` block as defined below.
     * @return builder
     */
    def networkInterfaces(args: Endofunction[com.pulumi.azure.siterecovery.inputs.VmwareReplicatedVmNetworkInterfaceArgs.Builder]*):
        com.pulumi.azure.siterecovery.VmwareReplicatedVmArgs.Builder =
      def argsBuilder = com.pulumi.azure.siterecovery.inputs.VmwareReplicatedVmNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

  /** Manages a Azure Site Recovery protection container. Protection containers serve as containers for replicated VMs and belong to a single region / recovery fabric. Protection containers can contain more than one replicated VM. To replicate a VM, a container must exist in both the source and target Azure regions. */
  def ProtectionContainer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.siterecovery.ProtectionContainerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.siterecovery.ProtectionContainerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.siterecovery.ProtectionContainer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.siterecovery.ProtectionContainerMappingArgs.Builder)
    /**
     * @param automaticUpdate a `automaticUpdate` block defined as below.
     * @return builder
     */
    def automaticUpdate(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ProtectionContainerMappingAutomaticUpdateArgs.Builder]):
        com.pulumi.azure.siterecovery.ProtectionContainerMappingArgs.Builder =
      val argsBuilder = com.pulumi.azure.siterecovery.inputs.ProtectionContainerMappingAutomaticUpdateArgs.builder
      builder.automaticUpdate(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.siterecovery.ReplicatedVMArgs.Builder)
    /**
     * @param managedDisks One or more `managedDisk` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def managedDisks(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicatedVMManagedDiskArgs.Builder]*):
        com.pulumi.azure.siterecovery.ReplicatedVMArgs.Builder =
      def argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicatedVMManagedDiskArgs.builder
      builder.managedDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param networkInterfaces One or more `networkInterface` block as defined below.
     * @return builder
     */
    def networkInterfaces(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicatedVMNetworkInterfaceArgs.Builder]*):
        com.pulumi.azure.siterecovery.ReplicatedVMArgs.Builder =
      def argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicatedVMNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param unmanagedDisks One or more `unmanagedDisk` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def unmanagedDisks(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicatedVMUnmanagedDiskArgs.Builder]*):
        com.pulumi.azure.siterecovery.ReplicatedVMArgs.Builder =
      def argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicatedVMUnmanagedDiskArgs.builder
      builder.unmanagedDisks(args.map(_(argsBuilder).build)*)

  /** Manages a HyperV site recovery network mapping on Azure. A HyperV network mapping decides how to translate connected networks when a VM is migrated from HyperV VMM Center to Azure. */
  def HypervNetworkMapping(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.siterecovery.HypervNetworkMappingArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.siterecovery.HypervNetworkMappingArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.siterecovery.HypervNetworkMapping(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Azure Site Recovery replication policy for HyperV within a Recovery Vault. Replication policies define the frequency at which recovery points are created and how long they are stored. */
  def HyperVReplicationPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.siterecovery.HyperVReplicationPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.siterecovery.HyperVReplicationPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.siterecovery.HyperVReplicationPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Azure Site Recovery replication policy for HyperV within a Recovery Vault. */
  def HyperVReplicationPolicyAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.siterecovery.HyperVReplicationPolicyAssociationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.siterecovery.HyperVReplicationPolicyAssociationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.siterecovery.HyperVReplicationPolicyAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.siterecovery.ReplicationRecoveryPlanArgs.Builder)
    /**
     * @param azureToAzureSettings An `azureToAzureSettings` block as defined below.
     * @return builder
     */
    def azureToAzureSettings(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanAzureToAzureSettingsArgs.Builder]):
        com.pulumi.azure.siterecovery.ReplicationRecoveryPlanArgs.Builder =
      val argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanAzureToAzureSettingsArgs.builder
      builder.azureToAzureSettings(args(argsBuilder).build)

    /**
     * @param bootRecoveryGroups One or more `bootRecoveryGroup` blocks as defined below.
     * @return builder
     */
    def bootRecoveryGroups(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanBootRecoveryGroupArgs.Builder]*):
        com.pulumi.azure.siterecovery.ReplicationRecoveryPlanArgs.Builder =
      def argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanBootRecoveryGroupArgs.builder
      builder.bootRecoveryGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param failoverRecoveryGroup One `failoverRecoveryGroup` block as defined below.
     * @return builder
     */
    def failoverRecoveryGroup(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanFailoverRecoveryGroupArgs.Builder]):
        com.pulumi.azure.siterecovery.ReplicationRecoveryPlanArgs.Builder =
      val argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanFailoverRecoveryGroupArgs.builder
      builder.failoverRecoveryGroup(args(argsBuilder).build)

    /**
     * @param shutdownRecoveryGroup One `shutdownRecoveryGroup` block as defined below.
     * @return builder
     */
    def shutdownRecoveryGroup(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanShutdownRecoveryGroupArgs.Builder]):
        com.pulumi.azure.siterecovery.ReplicationRecoveryPlanArgs.Builder =
      val argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanShutdownRecoveryGroupArgs.builder
      builder.shutdownRecoveryGroup(args(argsBuilder).build)

  /** Manages a Azure recovery vault protection container mapping. A protection container mapping decides how to translate the protection container when a VM is migrated from one region to another. */
  def ProtectionContainerMapping(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.siterecovery.ProtectionContainerMappingArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.siterecovery.ProtectionContainerMappingArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.siterecovery.ProtectionContainerMapping(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a HyperV Site in Recovery Service Vault. */
  def HyperVSite(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.siterecovery.HyperVSiteArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.siterecovery.HyperVSiteArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.siterecovery.HyperVSite(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a VM replicated using Azure Site Recovery (Azure to Azure only). A replicated VM keeps a copiously updated image of the VM in another region in order to be able to start the VM in that region in case of a disaster. */
  def ReplicatedVM(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.siterecovery.ReplicatedVMArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.siterecovery.ReplicatedVMArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.siterecovery.ReplicatedVM(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Site Recovery Replication Recovery Plan within a Recovery Services vault. A recovery plan gathers machines into recovery groups for the purpose of failover. */
  def ReplicationRecoveryPlan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.siterecovery.ReplicationRecoveryPlanArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.siterecovery.ReplicationRecoveryPlanArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.siterecovery.ReplicationRecoveryPlan(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a VMWare replicated VM using Azure Site Recovery (VMWare to Azure only). A replicated VM keeps a copiously updated image of the VM in Azure in order to be able to start the VM in Azure in case of a disaster. */
  def VmwareReplicatedVm(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.siterecovery.VmwareReplicatedVmArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.siterecovery.VmwareReplicatedVmArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.siterecovery.VmwareReplicatedVm(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Azure Site Recovery replication policy within a recovery vault. Replication policies define the frequency at which recovery points are created and how long they are stored. */
  def ReplicationPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.siterecovery.ReplicationPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.siterecovery.ReplicationPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.siterecovery.ReplicationPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Azure Site Recovery Replication Fabric within a Recovery Services vault. Only Azure fabrics are supported at this time. Replication Fabrics serve as a container within an Azure region for other Site Recovery resources such as protection containers, protected items, network mappings. */
  def Fabric(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.siterecovery.FabricArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.siterecovery.FabricArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.siterecovery.Fabric(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a site recovery network mapping on Azure. A network mapping decides how to translate connected networks when a VM is migrated from one region to another. */
  def NetworkMapping(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.siterecovery.NetworkMappingArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.siterecovery.NetworkMappingArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.siterecovery.NetworkMapping(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanFailoverRecoveryGroupArgs.Builder)
    /**
     * @param postActions one or more `action` block as defined below. which will be executed after the group recovery.
     * @return builder
     */
    def postActions(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanFailoverRecoveryGroupPostActionArgs.Builder]*):
        com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanFailoverRecoveryGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanFailoverRecoveryGroupPostActionArgs.builder
      builder.postActions(args.map(_(argsBuilder).build)*)

    /**
     * @param preActions one or more `action` block as defined below. which will be executed before the group recovery.
     * @return builder
     */
    def preActions(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanFailoverRecoveryGroupPreActionArgs.Builder]*):
        com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanFailoverRecoveryGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanFailoverRecoveryGroupPreActionArgs.builder
      builder.preActions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.siterecovery.inputs.ReplicatedVMState.Builder)
    /**
     * @param managedDisks One or more `managedDisk` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def managedDisks(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicatedVMManagedDiskArgs.Builder]*):
        com.pulumi.azure.siterecovery.inputs.ReplicatedVMState.Builder =
      def argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicatedVMManagedDiskArgs.builder
      builder.managedDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param networkInterfaces One or more `networkInterface` block as defined below.
     * @return builder
     */
    def networkInterfaces(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicatedVMNetworkInterfaceArgs.Builder]*):
        com.pulumi.azure.siterecovery.inputs.ReplicatedVMState.Builder =
      def argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicatedVMNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)

    /**
     * @param unmanagedDisks One or more `unmanagedDisk` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def unmanagedDisks(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicatedVMUnmanagedDiskArgs.Builder]*):
        com.pulumi.azure.siterecovery.inputs.ReplicatedVMState.Builder =
      def argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicatedVMUnmanagedDiskArgs.builder
      builder.unmanagedDisks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanShutdownRecoveryGroupArgs.Builder)
    /**
     * @param postActions one or more `action` block as defined below. which will be executed after the group recovery.
     * @return builder
     */
    def postActions(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanShutdownRecoveryGroupPostActionArgs.Builder]*):
        com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanShutdownRecoveryGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanShutdownRecoveryGroupPostActionArgs.builder
      builder.postActions(args.map(_(argsBuilder).build)*)

    /**
     * @param preActions one or more `action` block as defined below. which will be executed before the group recovery.
     * @return builder
     */
    def preActions(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanShutdownRecoveryGroupPreActionArgs.Builder]*):
        com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanShutdownRecoveryGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanShutdownRecoveryGroupPreActionArgs.builder
      builder.preActions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.siterecovery.inputs.ProtectionContainerMappingState.Builder)
    /**
     * @param automaticUpdate a `automaticUpdate` block defined as below.
     * @return builder
     */
    def automaticUpdate(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ProtectionContainerMappingAutomaticUpdateArgs.Builder]):
        com.pulumi.azure.siterecovery.inputs.ProtectionContainerMappingState.Builder =
      val argsBuilder = com.pulumi.azure.siterecovery.inputs.ProtectionContainerMappingAutomaticUpdateArgs.builder
      builder.automaticUpdate(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.siterecovery.inputs.ReplicatedVMManagedDiskTargetDiskEncryptionArgs.Builder)
    /**
     * @param diskEncryptionKey A `diskEncryptionKey` block as defined below.
     * @return builder
     */
    def diskEncryptionKey(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicatedVMManagedDiskTargetDiskEncryptionDiskEncryptionKeyArgs.Builder]):
        com.pulumi.azure.siterecovery.inputs.ReplicatedVMManagedDiskTargetDiskEncryptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicatedVMManagedDiskTargetDiskEncryptionDiskEncryptionKeyArgs.builder
      builder.diskEncryptionKey(args(argsBuilder).build)

    /**
     * @param keyEncryptionKey A `keyEncryptionKey` block as defined below.
     * @return builder
     */
    def keyEncryptionKey(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicatedVMManagedDiskTargetDiskEncryptionKeyEncryptionKeyArgs.Builder]):
        com.pulumi.azure.siterecovery.inputs.ReplicatedVMManagedDiskTargetDiskEncryptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicatedVMManagedDiskTargetDiskEncryptionKeyEncryptionKeyArgs.builder
      builder.keyEncryptionKey(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanState.Builder)
    /**
     * @param azureToAzureSettings An `azureToAzureSettings` block as defined below.
     * @return builder
     */
    def azureToAzureSettings(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanAzureToAzureSettingsArgs.Builder]):
        com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanState.Builder =
      val argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanAzureToAzureSettingsArgs.builder
      builder.azureToAzureSettings(args(argsBuilder).build)

    /**
     * @param bootRecoveryGroups One or more `bootRecoveryGroup` blocks as defined below.
     * @return builder
     */
    def bootRecoveryGroups(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanBootRecoveryGroupArgs.Builder]*):
        com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanState.Builder =
      def argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanBootRecoveryGroupArgs.builder
      builder.bootRecoveryGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param failoverRecoveryGroup One `failoverRecoveryGroup` block as defined below.
     * @return builder
     */
    def failoverRecoveryGroup(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanFailoverRecoveryGroupArgs.Builder]):
        com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanState.Builder =
      val argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanFailoverRecoveryGroupArgs.builder
      builder.failoverRecoveryGroup(args(argsBuilder).build)

    /**
     * @param shutdownRecoveryGroup One `shutdownRecoveryGroup` block as defined below.
     * @return builder
     */
    def shutdownRecoveryGroup(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanShutdownRecoveryGroupArgs.Builder]):
        com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanState.Builder =
      val argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanShutdownRecoveryGroupArgs.builder
      builder.shutdownRecoveryGroup(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.siterecovery.inputs.ReplicatedVMManagedDiskArgs.Builder)
    /**
     * @param targetDiskEncryption A `targetDiskEncryption` block as defined below.
     * @return builder
     */
    def targetDiskEncryption(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicatedVMManagedDiskTargetDiskEncryptionArgs.Builder]):
        com.pulumi.azure.siterecovery.inputs.ReplicatedVMManagedDiskArgs.Builder =
      val argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicatedVMManagedDiskTargetDiskEncryptionArgs.builder
      builder.targetDiskEncryption(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanBootRecoveryGroupArgs.Builder)
    /**
     * @param postActions one or more `action` block as defined below. which will be executed after the group recovery.
     * @return builder
     */
    def postActions(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanBootRecoveryGroupPostActionArgs.Builder]*):
        com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanBootRecoveryGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanBootRecoveryGroupPostActionArgs.builder
      builder.postActions(args.map(_(argsBuilder).build)*)

    /**
     * @param preActions one or more `action` block as defined below. which will be executed before the group recovery.
     * @return builder
     */
    def preActions(args: Endofunction[com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanBootRecoveryGroupPreActionArgs.Builder]*):
        com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanBootRecoveryGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.siterecovery.inputs.ReplicationRecoveryPlanBootRecoveryGroupPreActionArgs.builder
      builder.preActions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.siterecovery.inputs.VmwareReplicatedVmState.Builder)
    /**
     * @param managedDisks One or more `managedDisk` block as defined below. It&#39;s available only if mobility service is already installed on the source VM.
     * 
     *  &gt; **Note:** A replicated VM could be created without `managedDisk` block, once the block has been specified, changing it expect removing it forces a new resource to be created.
     * @return builder
     */
    def managedDisks(args: Endofunction[com.pulumi.azure.siterecovery.inputs.VmwareReplicatedVmManagedDiskArgs.Builder]*):
        com.pulumi.azure.siterecovery.inputs.VmwareReplicatedVmState.Builder =
      def argsBuilder = com.pulumi.azure.siterecovery.inputs.VmwareReplicatedVmManagedDiskArgs.builder
      builder.managedDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param networkInterfaces One or more `networkInterface` block as defined below.
     * @return builder
     */
    def networkInterfaces(args: Endofunction[com.pulumi.azure.siterecovery.inputs.VmwareReplicatedVmNetworkInterfaceArgs.Builder]*):
        com.pulumi.azure.siterecovery.inputs.VmwareReplicatedVmState.Builder =
      def argsBuilder = com.pulumi.azure.siterecovery.inputs.VmwareReplicatedVmNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)
