package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object siterecovery:
  /** Manages a Azure Site Recovery Replication Fabric within a Recovery Services vault. Only Azure fabrics are supported at this time. Replication Fabrics serve as a container within an Azure region for other Site Recovery resources such as protection containers, protected items, network mappings. */
  def Fabric(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.siterecovery.FabricArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.siterecovery.FabricArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.siterecovery.Fabric(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Azure Site Recovery replication policy for HyperV within a Recovery Vault. Replication policies define the frequency at which recovery points are created and how long they are stored. */
  def HyperVReplicationPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.siterecovery.HyperVReplicationPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.siterecovery.HyperVReplicationPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.siterecovery.HyperVReplicationPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Azure Site Recovery replication policy for HyperV within a Recovery Vault. */
  def HyperVReplicationPolicyAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.siterecovery.HyperVReplicationPolicyAssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.siterecovery.HyperVReplicationPolicyAssociationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.siterecovery.HyperVReplicationPolicyAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a HyperV Site in Recovery Service Vault. */
  def HyperVSite(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.siterecovery.HyperVSiteArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.siterecovery.HyperVSiteArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.siterecovery.HyperVSite(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a HyperV site recovery network mapping on Azure. A HyperV network mapping decides how to translate connected networks when a VM is migrated from HyperV VMM Center to Azure. */
  def HypervNetworkMapping(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.siterecovery.HypervNetworkMappingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.siterecovery.HypervNetworkMappingArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.siterecovery.HypervNetworkMapping(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a site recovery network mapping on Azure. A network mapping decides how to translate connected networks when a VM is migrated from one region to another. */
  def NetworkMapping(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.siterecovery.NetworkMappingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.siterecovery.NetworkMappingArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.siterecovery.NetworkMapping(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Azure Site Recovery protection container. Protection containers serve as containers for replicated VMs and belong to a single region / recovery fabric. Protection containers can contain more than one replicated VM. To replicate a VM, a container must exist in both the source and target Azure regions. */
  def ProtectionContainer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.siterecovery.ProtectionContainerArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.siterecovery.ProtectionContainerArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.siterecovery.ProtectionContainer(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Azure recovery vault protection container mapping. A protection container mapping decides how to translate the protection container when a VM is migrated from one region to another. */
  def ProtectionContainerMapping(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.siterecovery.ProtectionContainerMappingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.siterecovery.ProtectionContainerMappingArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.siterecovery.ProtectionContainerMapping(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a VM replicated using Azure Site Recovery (Azure to Azure only). A replicated VM keeps a copiously updated image of the VM in another region in order to be able to start the VM in that region in case of a disaster. */
  def ReplicatedVM(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.siterecovery.ReplicatedVMArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.siterecovery.ReplicatedVMArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.siterecovery.ReplicatedVM(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Azure Site Recovery replication policy within a recovery vault. Replication policies define the frequency at which recovery points are created and how long they are stored. */
  def ReplicationPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.siterecovery.ReplicationPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.siterecovery.ReplicationPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.siterecovery.ReplicationPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Site Recovery Replication Recovery Plan within a Recovery Services vault. A recovery plan gathers machines into recovery groups for the purpose of failover. */
  def ReplicationRecoveryPlan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.siterecovery.ReplicationRecoveryPlanArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.siterecovery.ReplicationRecoveryPlanArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.siterecovery.ReplicationRecoveryPlan(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object SiterecoveryFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Site Recovery Replication Fabric. */
    inline def getFabric(args: Endofunction[com.pulumi.azure.siterecovery.inputs.GetFabricArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.siterecovery.outputs.GetFabricResult] =
      val argsBuilder = com.pulumi.azure.siterecovery.inputs.GetFabricArgs.builder
      com.pulumi.azure.siterecovery.SiterecoveryFunctions.getFabric(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Site Recovery Replication Fabric. */
    inline def getFabricPlain(args: Endofunction[com.pulumi.azure.siterecovery.inputs.GetFabricPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.siterecovery.outputs.GetFabricResult] =
      val argsBuilder = com.pulumi.azure.siterecovery.inputs.GetFabricPlainArgs.builder
      com.pulumi.azure.siterecovery.SiterecoveryFunctions.getFabricPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing site recovery services protection container. */
    inline def getProtectionContainer(args: Endofunction[com.pulumi.azure.siterecovery.inputs.GetProtectionContainerArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.siterecovery.outputs.GetProtectionContainerResult] =
      val argsBuilder = com.pulumi.azure.siterecovery.inputs.GetProtectionContainerArgs.builder
      com.pulumi.azure.siterecovery.SiterecoveryFunctions.getProtectionContainer(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing site recovery services protection container. */
    inline def getProtectionContainerPlain(args: Endofunction[com.pulumi.azure.siterecovery.inputs.GetProtectionContainerPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.siterecovery.outputs.GetProtectionContainerResult] =
      val argsBuilder = com.pulumi.azure.siterecovery.inputs.GetProtectionContainerPlainArgs.builder
      com.pulumi.azure.siterecovery.SiterecoveryFunctions.getProtectionContainerPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Azure Site Recovery replication policy. */
    inline def getReplicationPolicy(args: Endofunction[com.pulumi.azure.siterecovery.inputs.GetReplicationPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.siterecovery.outputs.GetReplicationPolicyResult] =
      val argsBuilder = com.pulumi.azure.siterecovery.inputs.GetReplicationPolicyArgs.builder
      com.pulumi.azure.siterecovery.SiterecoveryFunctions.getReplicationPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Azure Site Recovery replication policy. */
    inline def getReplicationPolicyPlain(args: Endofunction[com.pulumi.azure.siterecovery.inputs.GetReplicationPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.siterecovery.outputs.GetReplicationPolicyResult] =
      val argsBuilder = com.pulumi.azure.siterecovery.inputs.GetReplicationPolicyPlainArgs.builder
      com.pulumi.azure.siterecovery.SiterecoveryFunctions.getReplicationPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Get information about an Azure Site Recovery Plan within a Recovery Services vault. A recovery plan gathers machines into recovery groups for the purpose of failover. */
    inline def getReplicationRecoveryPlan(args: Endofunction[com.pulumi.azure.siterecovery.inputs.GetReplicationRecoveryPlanArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.siterecovery.outputs.GetReplicationRecoveryPlanResult] =
      val argsBuilder = com.pulumi.azure.siterecovery.inputs.GetReplicationRecoveryPlanArgs.builder
      com.pulumi.azure.siterecovery.SiterecoveryFunctions.getReplicationRecoveryPlan(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Get information about an Azure Site Recovery Plan within a Recovery Services vault. A recovery plan gathers machines into recovery groups for the purpose of failover. */
    inline def getReplicationRecoveryPlanPlain(args: Endofunction[com.pulumi.azure.siterecovery.inputs.GetReplicationRecoveryPlanPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.siterecovery.outputs.GetReplicationRecoveryPlanResult] =
      val argsBuilder = com.pulumi.azure.siterecovery.inputs.GetReplicationRecoveryPlanPlainArgs.builder
      com.pulumi.azure.siterecovery.SiterecoveryFunctions.getReplicationRecoveryPlanPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages a VMWare Replication Policy. */
  def VMWareReplicationPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.siterecovery.VMWareReplicationPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.siterecovery.VMWareReplicationPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.siterecovery.VMWareReplicationPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a VMWare replicated VM using Azure Site Recovery (VMWare to Azure only). A replicated VM keeps a copiously updated image of the VM in Azure in order to be able to start the VM in Azure in case of a disaster. */
  def VmwareReplicatedVm(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.siterecovery.VmwareReplicatedVmArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.siterecovery.VmwareReplicatedVmArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.siterecovery.VmwareReplicatedVm(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Azure Site Recovery replication policy for VMWare within a Recovery Vault. */
  def VmwareReplicationPolicyAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.siterecovery.VmwareReplicationPolicyAssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.siterecovery.VmwareReplicationPolicyAssociationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.siterecovery.VmwareReplicationPolicyAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
