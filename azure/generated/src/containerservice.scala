package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object containerservice:
  /**
   * Manages a Managed Kubernetes Automatic Cluster (a special SKU of AKS / Azure Kubernetes Service)
   * 
   * &gt; **Note:** Due to the fast-moving nature of AKS, we recommend using the latest version of the Azure Provider when using AKS - you can find the latest version of the Azure Provider here.
   * 
   * &gt; **Note:** All arguments including the client secret will be stored in the raw state as plain-text. [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
   */
  def AutomaticCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.AutomaticClusterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.AutomaticClusterArgs.builder
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
    com.pulumi.azure.containerservice.AutomaticCluster(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Deployment Safeguard for a Kubernetes Cluster. */
  def ClusterDeploymentSafeguard(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.ClusterDeploymentSafeguardArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.containerservice.ClusterDeploymentSafeguardArgs.builder
    com.pulumi.azure.containerservice.ClusterDeploymentSafeguard(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  def ClusterTrustedAccessRoleBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.ClusterTrustedAccessRoleBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.ClusterTrustedAccessRoleBindingArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.containerservice.ClusterTrustedAccessRoleBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Container Connected Registry. */
  def ConnectedRegistry(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.ConnectedRegistryArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.ConnectedRegistryArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.containerservice.ConnectedRegistry(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object ContainerserviceFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Kubernetes Cluster Node Pool. */
    inline def getClusterNodePool(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetClusterNodePoolArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.containerservice.outputs.GetClusterNodePoolResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetClusterNodePoolArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getClusterNodePool(args(argsBuilder).build)

    /** Use this data source to access information about an existing Kubernetes Cluster Node Pool. */
    inline def getClusterNodePoolPlain(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetClusterNodePoolPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.containerservice.outputs.GetClusterNodePoolResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetClusterNodePoolPlainArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getClusterNodePoolPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Kubernetes Fleet Manager. */
    inline def getFleetManager(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetFleetManagerArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.containerservice.outputs.GetFleetManagerResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetFleetManagerArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getFleetManager(args(argsBuilder).build)

    /** Use this data source to access information about an existing Kubernetes Fleet Manager. */
    inline def getFleetManagerPlain(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetFleetManagerPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.containerservice.outputs.GetFleetManagerResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetFleetManagerPlainArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getFleetManagerPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Container Group instance. */
    inline def getGroup(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetGroupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.containerservice.outputs.GetGroupResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetGroupArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getGroup(args(argsBuilder).build)

    /** Use this data source to access information about an existing Container Group instance. */
    inline def getGroupPlain(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetGroupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.containerservice.outputs.GetGroupResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetGroupPlainArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getGroupPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Managed Kubernetes Cluster (AKS). */
    inline def getKubernetesCluster(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetKubernetesClusterArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.containerservice.outputs.GetKubernetesClusterResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetKubernetesClusterArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getKubernetesCluster(args(argsBuilder).build)

    /** Use this data source to access information about an existing Managed Kubernetes Cluster (AKS). */
    inline def getKubernetesClusterPlain(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetKubernetesClusterPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.containerservice.outputs.GetKubernetesClusterResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetKubernetesClusterPlainArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getKubernetesClusterPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Kubernetes Node Pool Snapshot. */
    inline def getKubernetesNodePoolSnapshot(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetKubernetesNodePoolSnapshotArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.containerservice.outputs.GetKubernetesNodePoolSnapshotResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetKubernetesNodePoolSnapshotArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getKubernetesNodePoolSnapshot(args(argsBuilder).build)

    /** Use this data source to access information about an existing Kubernetes Node Pool Snapshot. */
    inline def getKubernetesNodePoolSnapshotPlain(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetKubernetesNodePoolSnapshotPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.containerservice.outputs.GetKubernetesNodePoolSnapshotResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetKubernetesNodePoolSnapshotPlainArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getKubernetesNodePoolSnapshotPlain(args(argsBuilder).build)

    /** Use this data source to retrieve the version of Kubernetes supported by Azure Kubernetes Service. */
    inline def getKubernetesServiceVersions(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetKubernetesServiceVersionsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.containerservice.outputs.GetKubernetesServiceVersionsResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetKubernetesServiceVersionsArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getKubernetesServiceVersions(args(argsBuilder).build)

    /** Use this data source to retrieve the version of Kubernetes supported by Azure Kubernetes Service. */
    inline def getKubernetesServiceVersionsPlain(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetKubernetesServiceVersionsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.containerservice.outputs.GetKubernetesServiceVersionsResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetKubernetesServiceVersionsPlainArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getKubernetesServiceVersionsPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Container Registry. */
    inline def getRegistry(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetRegistryArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.containerservice.outputs.GetRegistryResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetRegistryArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getRegistry(args(argsBuilder).build)

    /** Use this data source to access information about an existing Container Registry. */
    inline def getRegistryPlain(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetRegistryPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.containerservice.outputs.GetRegistryResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetRegistryPlainArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getRegistryPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Container Registry Cache Rule. */
    inline def getRegistryCacheRule(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetRegistryCacheRuleArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.containerservice.outputs.GetRegistryCacheRuleResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetRegistryCacheRuleArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getRegistryCacheRule(args(argsBuilder).build)

    /** Use this data source to access information about an existing Container Registry Cache Rule. */
    inline def getRegistryCacheRulePlain(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetRegistryCacheRulePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.containerservice.outputs.GetRegistryCacheRuleResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetRegistryCacheRulePlainArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getRegistryCacheRulePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Container Registry scope map. */
    inline def getRegistryScopeMap(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetRegistryScopeMapArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.containerservice.outputs.GetRegistryScopeMapResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetRegistryScopeMapArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getRegistryScopeMap(args(argsBuilder).build)

    /** Use this data source to access information about an existing Container Registry scope map. */
    inline def getRegistryScopeMapPlain(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetRegistryScopeMapPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.containerservice.outputs.GetRegistryScopeMapResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetRegistryScopeMapPlainArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getRegistryScopeMapPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Container Registry token. */
    inline def getRegistryToken(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetRegistryTokenArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.containerservice.outputs.GetRegistryTokenResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetRegistryTokenArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getRegistryToken(args(argsBuilder).build)

    /** Use this data source to access information about an existing Container Registry token. */
    inline def getRegistryTokenPlain(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetRegistryTokenPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.containerservice.outputs.GetRegistryTokenResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetRegistryTokenPlainArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getRegistryTokenPlain(args(argsBuilder).build)

  /**
   * &lt;!-- Note: This documentation is generated. Any manual changes will be overwritten --&gt;
   * 
   * Manages a Kubernetes Fleet Member.
   */
  def FleetMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.FleetMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.FleetMemberArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.containerservice.FleetMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Kubernetes Fleet Update Run. */
  def FleetUpdateRun(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.FleetUpdateRunArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.FleetUpdateRunArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.containerservice.FleetUpdateRun(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Kubernetes Fleet Update Strategy. */
  def FleetUpdateStrategy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.FleetUpdateStrategyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.FleetUpdateStrategyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.containerservice.FleetUpdateStrategy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Kubernetes Flux Configuration. */
  def FluxConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.FluxConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.FluxConfigurationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.containerservice.FluxConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages as an Azure Container Group instance. */
  def Group(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.GroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.GroupArgs.builder
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
    com.pulumi.azure.containerservice.Group(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Managed Kubernetes Cluster (also known as AKS / Azure Kubernetes Service)
   * 
   * &gt; **Note:** Due to the fast-moving nature of AKS, we recommend using the latest version of the Azure Provider when using AKS.
   */
  def KubernetesCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.KubernetesClusterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.KubernetesClusterArgs.builder
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
    com.pulumi.azure.containerservice.KubernetesCluster(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Kubernetes Cluster Extension. */
  def KubernetesClusterExtension(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.KubernetesClusterExtensionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.KubernetesClusterExtensionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.containerservice.KubernetesClusterExtension(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Node Pool within a Kubernetes Cluster
   * 
   * &gt; **NOTE:** Multiple Node Pools are only supported when the Kubernetes Cluster is using Virtual Machine Scale Sets.
   * 
   * &gt; **Note:** Changing certain properties is done by cycling the node pool. When cycling it, it doesn\u2019t perform cordon and drain, and it will disrupt rescheduling pods currently running on the previous node pool. `temporaryNameForRotation` must be specified when changing any of the following properties: `fipsEnabled`, `hostEncryptionEnabled`, `kubeletConfig`, `kubeletDiskType`, `linuxOsConfig`, `maxPods`, `nodePublicIpEnabled`, `osDiskSizeGb`, `osDiskType`, `podSubnetId`, `snapshotId`, `ultraSsdEnabled`, `vmSize`, `vnetSubnetId`, `zones`.
   */
  def KubernetesClusterNodePool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.KubernetesClusterNodePoolArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.KubernetesClusterNodePoolArgs.builder
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
    com.pulumi.azure.containerservice.KubernetesClusterNodePool(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Kubernetes Fleet Manager. */
  def KubernetesFleetManager(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.KubernetesFleetManagerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.KubernetesFleetManagerArgs.builder
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
    com.pulumi.azure.containerservice.KubernetesFleetManager(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Azure Container Registry. */
  def Registry(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.RegistryArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.RegistryArgs.builder
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
    com.pulumi.azure.containerservice.Registry(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Azure Container Registry Agent Pool. */
  def RegistryAgentPool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.RegistryAgentPoolArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.RegistryAgentPoolArgs.builder
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
    com.pulumi.azure.containerservice.RegistryAgentPool(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an Azure Container Registry Cache Rule.
   * 
   * &gt; **Note:** All arguments including the access key will be stored in the raw state as plain-text.
   * [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
   */
  def RegistryCacheRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.RegistryCacheRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.RegistryCacheRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.containerservice.RegistryCacheRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Container Registry Credential Set. */
  def RegistryCredentialSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.RegistryCredentialSetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.RegistryCredentialSetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.containerservice.RegistryCredentialSet(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Azure Container Registry scope map.  For more information on scope maps see the [product documentation](https://learn.microsoft.com/en-us/azure/container-registry/container-registry-repository-scoped-permissions). */
  def RegistryScopeMap(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.RegistryScopeMapArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.RegistryScopeMapArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.containerservice.RegistryScopeMap(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Container Registry Task. */
  def RegistryTask(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.RegistryTaskArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.RegistryTaskArgs.builder
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
    com.pulumi.azure.containerservice.RegistryTask(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Runs a Container Registry Task Schedule. */
  def RegistryTaskScheduleRunNow(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.RegistryTaskScheduleRunNowArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.containerservice.RegistryTaskScheduleRunNowArgs.builder
    com.pulumi.azure.containerservice.RegistryTaskScheduleRunNow(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Azure Container Registry token associated to a scope map. For more information on scope maps and their tokens see the [product documentation](https://learn.microsoft.com/en-us/azure/container-registry/container-registry-repository-scoped-permissions). */
  def RegistryToken(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.RegistryTokenArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.RegistryTokenArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.containerservice.RegistryToken(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Azure Container Registry Webhook. */
  def RegistryWebhook(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.RegistryWebhookArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.RegistryWebhookArgs.builder
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
    com.pulumi.azure.containerservice.RegistryWebhook(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Azure Container Registry Webhook. */
  @deprecated("azure.containerservice.RegistryWebook has been deprecated in favor of azure.containerservice.RegistryWebhook") def RegistryWebook(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.RegistryWebookArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.RegistryWebookArgs.builder
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
    com.pulumi.azure.containerservice.RegistryWebook(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Container Registry Token Password associated with a scope map.  For more information on scope maps and their tokens see the [product documentation](https://learn.microsoft.com/en-us/azure/container-registry/container-registry-repository-scoped-permissions). */
  def TokenPassword(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.TokenPasswordArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.containerservice.TokenPasswordArgs.builder
    com.pulumi.azure.containerservice.TokenPassword(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
