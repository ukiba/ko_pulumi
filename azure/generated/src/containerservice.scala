package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object containerservice:
  extension (builder: com.pulumi.azure.containerservice.GroupArgs.Builder)
    /**
     * @param containers The definition of a container that is part of the group as documented in the `container` block below. Changing this forces a new resource to be created.
     * @return builder
     */
    def containers(args: Endofunction[com.pulumi.azure.containerservice.inputs.GroupContainerArgs.Builder]*):
        com.pulumi.azure.containerservice.GroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.GroupContainerArgs.builder
      builder.containers(args.map(_(argsBuilder).build)*)

    /**
     * @param diagnostics A `diagnostics` block as documented below. Changing this forces a new resource to be created.
     * @return builder
     */
    def diagnostics(args: Endofunction[com.pulumi.azure.containerservice.inputs.GroupDiagnosticsArgs.Builder]):
        com.pulumi.azure.containerservice.GroupArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GroupDiagnosticsArgs.builder
      builder.diagnostics(args(argsBuilder).build)

    /**
     * @param dnsConfig A `dnsConfig` block as documented below. Changing this forces a new resource to be created.
     * @return builder
     */
    def dnsConfig(args: Endofunction[com.pulumi.azure.containerservice.inputs.GroupDnsConfigArgs.Builder]):
        com.pulumi.azure.containerservice.GroupArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GroupDnsConfigArgs.builder
      builder.dnsConfig(args(argsBuilder).build)

    /**
     * @param exposedPorts Zero or more `exposedPort` blocks as defined below. Changing this forces a new resource to be created.
     * 
     *  &gt; **Note:** The `exposedPort` can only contain ports that are also exposed on one or more containers in the group.
     * @return builder
     */
    def exposedPorts(args: Endofunction[com.pulumi.azure.containerservice.inputs.GroupExposedPortArgs.Builder]*):
        com.pulumi.azure.containerservice.GroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.GroupExposedPortArgs.builder
      builder.exposedPorts(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.containerservice.inputs.GroupIdentityArgs.Builder]):
        com.pulumi.azure.containerservice.GroupArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GroupIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param imageRegistryCredentials An `imageRegistryCredential` block as documented below. Changing this forces a new resource to be created.
     * @return builder
     */
    def imageRegistryCredentials(args: Endofunction[com.pulumi.azure.containerservice.inputs.GroupImageRegistryCredentialArgs.Builder]*):
        com.pulumi.azure.containerservice.GroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.GroupImageRegistryCredentialArgs.builder
      builder.imageRegistryCredentials(args.map(_(argsBuilder).build)*)

    /**
     * @param initContainers The definition of an init container that is part of the group as documented in the `initContainer` block below. Changing this forces a new resource to be created.
     * @return builder
     */
    def initContainers(args: Endofunction[com.pulumi.azure.containerservice.inputs.GroupInitContainerArgs.Builder]*):
        com.pulumi.azure.containerservice.GroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.GroupInitContainerArgs.builder
      builder.initContainers(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.containerservice.GroupArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.containerservice.ConnectedRegistryArgs.Builder)
    /**
     * @param notifications One or more `notification` blocks as defined below.
     * @return builder
     */
    def notifications(args: Endofunction[com.pulumi.azure.containerservice.inputs.ConnectedRegistryNotificationArgs.Builder]*):
        com.pulumi.azure.containerservice.ConnectedRegistryArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.ConnectedRegistryNotificationArgs.builder
      builder.notifications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerservice.KubernetesClusterExtensionArgs.Builder)
    /**
     * @param plan A `plan` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def plan(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterExtensionPlanArgs.Builder]):
        com.pulumi.azure.containerservice.KubernetesClusterExtensionArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterExtensionPlanArgs.builder
      builder.plan(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.containerservice.FluxConfigurationArgs.Builder)
    /**
     * @param blobStorage An `blobStorage` block as defined below.
     * @return builder
     */
    def blobStorage(args: Endofunction[com.pulumi.azure.containerservice.inputs.FluxConfigurationBlobStorageArgs.Builder]):
        com.pulumi.azure.containerservice.FluxConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.FluxConfigurationBlobStorageArgs.builder
      builder.blobStorage(args(argsBuilder).build)

    /**
     * @param bucket A `bucket` block as defined below.
     * @return builder
     */
    def bucket(args: Endofunction[com.pulumi.azure.containerservice.inputs.FluxConfigurationBucketArgs.Builder]):
        com.pulumi.azure.containerservice.FluxConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.FluxConfigurationBucketArgs.builder
      builder.bucket(args(argsBuilder).build)

    /**
     * @param gitRepository A `gitRepository` block as defined below.
     * @return builder
     */
    def gitRepository(args: Endofunction[com.pulumi.azure.containerservice.inputs.FluxConfigurationGitRepositoryArgs.Builder]):
        com.pulumi.azure.containerservice.FluxConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.FluxConfigurationGitRepositoryArgs.builder
      builder.gitRepository(args(argsBuilder).build)

    /**
     * @param kustomizations A `kustomizations` block as defined below.
     * @return builder
     */
    def kustomizations(args: Endofunction[com.pulumi.azure.containerservice.inputs.FluxConfigurationKustomizationArgs.Builder]*):
        com.pulumi.azure.containerservice.FluxConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.FluxConfigurationKustomizationArgs.builder
      builder.kustomizations(args.map(_(argsBuilder).build)*)

  /** Manages a Kubernetes Fleet Manager. */
  def KubernetesFleetManager(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.KubernetesFleetManagerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.KubernetesFleetManagerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.containerservice.KubernetesFleetManager(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.containerservice.RegistryArgs.Builder)
    /**
     * @param encryption An `encryption` block as documented below.
     * @return builder
     */
    def encryption(args: Endofunction[com.pulumi.azure.containerservice.inputs.RegistryEncryptionArgs.Builder]):
        com.pulumi.azure.containerservice.RegistryArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.RegistryEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

    /**
     * @param georeplications One or more `georeplications` blocks as documented below.
     * 
     *  &gt; **Note:** The `georeplications` is only supported on new resources with the `Premium` SKU.
     * 
     *  &gt; **Note:** The `georeplications` list cannot contain the location where the Container Registry exists.
     * 
     *  &gt; **Note:** If more than one `georeplications` block is specified, they are expected to follow the alphabetic order on the `location` property.
     * @return builder
     */
    def georeplications(args: Endofunction[com.pulumi.azure.containerservice.inputs.RegistryGeoreplicationArgs.Builder]*):
        com.pulumi.azure.containerservice.RegistryArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.RegistryGeoreplicationArgs.builder
      builder.georeplications(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.containerservice.inputs.RegistryIdentityArgs.Builder]):
        com.pulumi.azure.containerservice.RegistryArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.RegistryIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkRuleSet A `networkRuleSet` block as documented below.
     * @return builder
     */
    def networkRuleSet(args: Endofunction[com.pulumi.azure.containerservice.inputs.RegistryNetworkRuleSetArgs.Builder]):
        com.pulumi.azure.containerservice.RegistryArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.RegistryNetworkRuleSetArgs.builder
      builder.networkRuleSet(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.containerservice.RegistryArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages as an Azure Container Group instance. */
  def Group(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.GroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.GroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.containerservice.Group(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Azure Container Registry Webhook. */
  def RegistryWebhook(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.RegistryWebhookArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.RegistryWebhookArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.containerservice.RegistryWebhook(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Azure Container Registry Webhook. */
  @deprecated() def RegistryWebook(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.RegistryWebookArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.RegistryWebookArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.containerservice.RegistryWebook(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Node Pool within a Kubernetes Cluster
   * 
   *  &gt; **NOTE:** Multiple Node Pools are only supported when the Kubernetes Cluster is using Virtual Machine Scale Sets.
   * 
   *  &gt; **Note:** Changing certain properties is done by cycling the node pool. When cycling it, it doesn\u2019t perform cordon and drain, and it will disrupt rescheduling pods currently running on the previous node pool. `temporaryNameForRotation` must be specified when changing any of the following properties: `fipsEnabled`, `hostEncryptionEnabled`, `kubeletConfig`, `kubeletDiskType`, `linuxOsConfig`, `maxPods`, `nodePublicIpEnabled`, `osDiskSizeGb`, `osDiskType`, `podSubnetId`, `snapshotId`, `ultraSsdEnabled`, `vmSize`, `vnetSubnetId`, `zones`.
   */
  def KubernetesClusterNodePool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.KubernetesClusterNodePoolArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.KubernetesClusterNodePoolArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.containerservice.KubernetesClusterNodePool(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Kubernetes Fleet Update Run. */
  def FleetUpdateRun(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.FleetUpdateRunArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.FleetUpdateRunArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.containerservice.FleetUpdateRun(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.containerservice.KubernetesClusterNodePoolArgs.Builder)
    /**
     * @param kubeletConfig A `kubeletConfig` block as defined below. Changing this requires specifying `temporaryNameForRotation`.
     * @return builder
     */
    def kubeletConfig(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterNodePoolKubeletConfigArgs.Builder]):
        com.pulumi.azure.containerservice.KubernetesClusterNodePoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterNodePoolKubeletConfigArgs.builder
      builder.kubeletConfig(args(argsBuilder).build)

    /**
     * @param linuxOsConfig A `linuxOsConfig` block as defined below. Changing this requires specifying `temporaryNameForRotation`.
     * @return builder
     */
    def linuxOsConfig(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterNodePoolLinuxOsConfigArgs.Builder]):
        com.pulumi.azure.containerservice.KubernetesClusterNodePoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterNodePoolLinuxOsConfigArgs.builder
      builder.linuxOsConfig(args(argsBuilder).build)

    /**
     * @param nodeNetworkProfile A `nodeNetworkProfile` block as documented below.
     * @return builder
     */
    def nodeNetworkProfile(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterNodePoolNodeNetworkProfileArgs.Builder]):
        com.pulumi.azure.containerservice.KubernetesClusterNodePoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterNodePoolNodeNetworkProfileArgs.builder
      builder.nodeNetworkProfile(args(argsBuilder).build)

    /**
     * @param upgradeSettings A `upgradeSettings` block as documented below.
     * @return builder
     */
    def upgradeSettings(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterNodePoolUpgradeSettingsArgs.Builder]):
        com.pulumi.azure.containerservice.KubernetesClusterNodePoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterNodePoolUpgradeSettingsArgs.builder
      builder.upgradeSettings(args(argsBuilder).build)

    /**
     * @param windowsProfile A `windowsProfile` block as documented below. Changing this forces a new resource to be created.
     * @return builder
     */
    def windowsProfile(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterNodePoolWindowsProfileArgs.Builder]):
        com.pulumi.azure.containerservice.KubernetesClusterNodePoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterNodePoolWindowsProfileArgs.builder
      builder.windowsProfile(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.containerservice.KubernetesClusterNodePoolArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages an Azure Container Registry Agent Pool. */
  def RegistryAgentPool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.RegistryAgentPoolArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.RegistryAgentPoolArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.containerservice.RegistryAgentPool(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.containerservice.KubernetesClusterArgs.Builder)
    /**
     * @param aciConnectorLinux A `aciConnectorLinux` block as defined below. For more details, please visit [Create and configure an AKS cluster to use virtual nodes](https://docs.microsoft.com/azure/aks/virtual-nodes-portal).
     * @return builder
     */
    def aciConnectorLinux(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterAciConnectorLinuxArgs.Builder]):
        com.pulumi.azure.containerservice.KubernetesClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterAciConnectorLinuxArgs.builder
      builder.aciConnectorLinux(args(argsBuilder).build)

    /**
     * @param apiServerAccessProfile An `apiServerAccessProfile` block as defined below.
     * @return builder
     */
    def apiServerAccessProfile(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterApiServerAccessProfileArgs.Builder]):
        com.pulumi.azure.containerservice.KubernetesClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterApiServerAccessProfileArgs.builder
      builder.apiServerAccessProfile(args(argsBuilder).build)

    /**
     * @param autoScalerProfile A `autoScalerProfile` block as defined below.
     * @return builder
     */
    def autoScalerProfile(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterAutoScalerProfileArgs.Builder]):
        com.pulumi.azure.containerservice.KubernetesClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterAutoScalerProfileArgs.builder
      builder.autoScalerProfile(args(argsBuilder).build)

    /**
     * @param azureActiveDirectoryRoleBasedAccessControl A `azureActiveDirectoryRoleBasedAccessControl` block as defined below.
     * @return builder
     */
    def azureActiveDirectoryRoleBasedAccessControl(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterAzureActiveDirectoryRoleBasedAccessControlArgs.Builder]):
        com.pulumi.azure.containerservice.KubernetesClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterAzureActiveDirectoryRoleBasedAccessControlArgs.builder
      builder.azureActiveDirectoryRoleBasedAccessControl(args(argsBuilder).build)

    /**
     * @param bootstrapProfile A `bootstrapProfile` block as defined below.
     * @return builder
     */
    def bootstrapProfile(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterBootstrapProfileArgs.Builder]):
        com.pulumi.azure.containerservice.KubernetesClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterBootstrapProfileArgs.builder
      builder.bootstrapProfile(args(argsBuilder).build)

    /**
     * @param confidentialComputing A `confidentialComputing` block as defined below. For more details please [the documentation](https://learn.microsoft.com/en-us/azure/confidential-computing/confidential-nodes-aks-overview)
     * @return builder
     */
    def confidentialComputing(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterConfidentialComputingArgs.Builder]):
        com.pulumi.azure.containerservice.KubernetesClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterConfidentialComputingArgs.builder
      builder.confidentialComputing(args(argsBuilder).build)

    /**
     * @param defaultNodePool Specifies configuration for &#34;System&#34; mode node pool. A `defaultNodePool` block as defined below.
     * @return builder
     */
    def defaultNodePool(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterDefaultNodePoolArgs.Builder]):
        com.pulumi.azure.containerservice.KubernetesClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterDefaultNodePoolArgs.builder
      builder.defaultNodePool(args(argsBuilder).build)

    /**
     * @param httpProxyConfig A `httpProxyConfig` block as defined below.
     * @return builder
     */
    def httpProxyConfig(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterHttpProxyConfigArgs.Builder]):
        com.pulumi.azure.containerservice.KubernetesClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterHttpProxyConfigArgs.builder
      builder.httpProxyConfig(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below. One of either `identity` or `servicePrincipal` must be specified.
     * 
     *  !&gt; **Note:** A migration scenario from `servicePrincipal` to `identity` is supported. When upgrading `servicePrincipal` to `identity`, your cluster&#39;s control plane and addon pods will switch to use managed identity, but the kubelets will keep using your configured `servicePrincipal` until you upgrade your Node Pool.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterIdentityArgs.Builder]):
        com.pulumi.azure.containerservice.KubernetesClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param ingressApplicationGateway A `ingressApplicationGateway` block as defined below.
     * 
     *  &gt; **Note:** Since the Application Gateway is deployed inside a Virtual Network, users (and Service Principals) that are operating the Application Gateway must have the `Microsoft.Network/virtualNetworks/subnets/join/action` permission on the Virtual Network or Subnet. For more details, please visit [Virtual Network Permission](https://learn.microsoft.com/en-us/azure/application-gateway/configuration-infrastructure#virtual-network-permission).
     * @return builder
     */
    def ingressApplicationGateway(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterIngressApplicationGatewayArgs.Builder]):
        com.pulumi.azure.containerservice.KubernetesClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterIngressApplicationGatewayArgs.builder
      builder.ingressApplicationGateway(args(argsBuilder).build)

    /**
     * @param keyManagementService A `keyManagementService` block as defined below. For more details, please visit [Key Management Service (KMS) etcd encryption to an AKS cluster](https://learn.microsoft.com/en-us/azure/aks/use-kms-etcd-encryption).
     * @return builder
     */
    def keyManagementService(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterKeyManagementServiceArgs.Builder]):
        com.pulumi.azure.containerservice.KubernetesClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterKeyManagementServiceArgs.builder
      builder.keyManagementService(args(argsBuilder).build)

    /**
     * @param keyVaultSecretsProvider A `keyVaultSecretsProvider` block as defined below. For more details, please visit [Azure Keyvault Secrets Provider for AKS](https://docs.microsoft.com/azure/aks/csi-secrets-store-driver).
     * @return builder
     */
    def keyVaultSecretsProvider(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterKeyVaultSecretsProviderArgs.Builder]):
        com.pulumi.azure.containerservice.KubernetesClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterKeyVaultSecretsProviderArgs.builder
      builder.keyVaultSecretsProvider(args(argsBuilder).build)

    /**
     * @param kubeletIdentity A `kubeletIdentity` block as defined below.
     * @return builder
     */
    def kubeletIdentity(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterKubeletIdentityArgs.Builder]):
        com.pulumi.azure.containerservice.KubernetesClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterKubeletIdentityArgs.builder
      builder.kubeletIdentity(args(argsBuilder).build)

    /**
     * @param linuxProfile A `linuxProfile` block as defined below.
     * @return builder
     */
    def linuxProfile(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterLinuxProfileArgs.Builder]):
        com.pulumi.azure.containerservice.KubernetesClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterLinuxProfileArgs.builder
      builder.linuxProfile(args(argsBuilder).build)

    /**
     * @param maintenanceWindow A `maintenanceWindow` block as defined below.
     * @return builder
     */
    def maintenanceWindow(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterMaintenanceWindowArgs.Builder]):
        com.pulumi.azure.containerservice.KubernetesClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterMaintenanceWindowArgs.builder
      builder.maintenanceWindow(args(argsBuilder).build)

    /**
     * @param maintenanceWindowAutoUpgrade A `maintenanceWindowAutoUpgrade` block as defined below.
     * @return builder
     */
    def maintenanceWindowAutoUpgrade(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterMaintenanceWindowAutoUpgradeArgs.Builder]):
        com.pulumi.azure.containerservice.KubernetesClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterMaintenanceWindowAutoUpgradeArgs.builder
      builder.maintenanceWindowAutoUpgrade(args(argsBuilder).build)

    /**
     * @param maintenanceWindowNodeOs A `maintenanceWindowNodeOs` block as defined below.
     * @return builder
     */
    def maintenanceWindowNodeOs(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterMaintenanceWindowNodeOsArgs.Builder]):
        com.pulumi.azure.containerservice.KubernetesClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterMaintenanceWindowNodeOsArgs.builder
      builder.maintenanceWindowNodeOs(args(argsBuilder).build)

    /**
     * @param microsoftDefender A `microsoftDefender` block as defined below.
     * @return builder
     */
    def microsoftDefender(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterMicrosoftDefenderArgs.Builder]):
        com.pulumi.azure.containerservice.KubernetesClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterMicrosoftDefenderArgs.builder
      builder.microsoftDefender(args(argsBuilder).build)

    /**
     * @param monitorMetrics Specifies a Prometheus add-on profile for the Kubernetes Cluster. A `monitorMetrics` block as defined below.
     * 
     *  &gt; **Note:** If deploying Managed Prometheus, the `monitorMetrics` properties are required to configure the cluster for metrics collection. If no value is needed, set properties to `null`.
     * @return builder
     */
    def monitorMetrics(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterMonitorMetricsArgs.Builder]):
        com.pulumi.azure.containerservice.KubernetesClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterMonitorMetricsArgs.builder
      builder.monitorMetrics(args(argsBuilder).build)

    /**
     * @param networkProfile A `networkProfile` block as defined below. Changing this forces a new resource to be created.
     * 
     *  &gt; **Note:** If `networkProfile` is not defined, `kubenet` profile will be used by default.
     * @return builder
     */
    def networkProfile(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterNetworkProfileArgs.Builder]):
        com.pulumi.azure.containerservice.KubernetesClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterNetworkProfileArgs.builder
      builder.networkProfile(args(argsBuilder).build)

    /**
     * @param nodeProvisioningProfile A `nodeProvisioningProfile` block as defined below.
     * @return builder
     */
    def nodeProvisioningProfile(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterNodeProvisioningProfileArgs.Builder]):
        com.pulumi.azure.containerservice.KubernetesClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterNodeProvisioningProfileArgs.builder
      builder.nodeProvisioningProfile(args(argsBuilder).build)

    /**
     * @param omsAgent A `omsAgent` block as defined below.
     * @return builder
     */
    def omsAgent(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterOmsAgentArgs.Builder]):
        com.pulumi.azure.containerservice.KubernetesClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterOmsAgentArgs.builder
      builder.omsAgent(args(argsBuilder).build)

    /**
     * @param serviceMeshProfile A `serviceMeshProfile` block as defined below.
     * @return builder
     */
    def serviceMeshProfile(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterServiceMeshProfileArgs.Builder]):
        com.pulumi.azure.containerservice.KubernetesClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterServiceMeshProfileArgs.builder
      builder.serviceMeshProfile(args(argsBuilder).build)

    /**
     * @param servicePrincipal A `servicePrincipal` block as documented below. One of either `identity` or `servicePrincipal` must be specified.
     * 
     *  !&gt; **Note:** A migration scenario from `servicePrincipal` to `identity` is supported. When upgrading `servicePrincipal` to `identity`, your cluster&#39;s control plane and addon pods will switch to use managed identity, but the kubelets will keep using your configured `servicePrincipal` until you upgrade your Node Pool.
     * @return builder
     */
    def servicePrincipal(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterServicePrincipalArgs.Builder]):
        com.pulumi.azure.containerservice.KubernetesClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterServicePrincipalArgs.builder
      builder.servicePrincipal(args(argsBuilder).build)

    /**
     * @param storageProfile A `storageProfile` block as defined below.
     * @return builder
     */
    def storageProfile(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterStorageProfileArgs.Builder]):
        com.pulumi.azure.containerservice.KubernetesClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterStorageProfileArgs.builder
      builder.storageProfile(args(argsBuilder).build)

    /**
     * @param upgradeOverride A `upgradeOverride` block as defined below.
     * @return builder
     */
    def upgradeOverride(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterUpgradeOverrideArgs.Builder]):
        com.pulumi.azure.containerservice.KubernetesClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterUpgradeOverrideArgs.builder
      builder.upgradeOverride(args(argsBuilder).build)

    /**
     * @param webAppRouting A `webAppRouting` block as defined below.
     * @return builder
     */
    def webAppRouting(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterWebAppRoutingArgs.Builder]):
        com.pulumi.azure.containerservice.KubernetesClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterWebAppRoutingArgs.builder
      builder.webAppRouting(args(argsBuilder).build)

    /**
     * @param windowsProfile A `windowsProfile` block as defined below.
     * @return builder
     */
    def windowsProfile(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterWindowsProfileArgs.Builder]):
        com.pulumi.azure.containerservice.KubernetesClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterWindowsProfileArgs.builder
      builder.windowsProfile(args(argsBuilder).build)

    /**
     * @param workloadAutoscalerProfile A `workloadAutoscalerProfile` block defined below.
     * @return builder
     */
    def workloadAutoscalerProfile(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterWorkloadAutoscalerProfileArgs.Builder]):
        com.pulumi.azure.containerservice.KubernetesClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterWorkloadAutoscalerProfileArgs.builder
      builder.workloadAutoscalerProfile(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.containerservice.KubernetesClusterArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Manages an Azure Container Registry Cache Rule.
   * 
   *  &gt; **Note:** All arguments including the access key will be stored in the raw state as plain-text.
   *  [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
   */
  def RegistryCacheRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.RegistryCacheRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.RegistryCacheRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.containerservice.RegistryCacheRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Container Registry Credential Set. */
  def RegistryCredentialSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.RegistryCredentialSetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.RegistryCredentialSetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.containerservice.RegistryCredentialSet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Container Registry Token Password associated with a scope map.  For more information on scope maps and their tokens see the [product documentation](https://learn.microsoft.com/en-us/azure/container-registry/container-registry-repository-scoped-permissions). */
  def TokenPassword(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.TokenPasswordArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.containerservice.TokenPasswordArgs.builder
    com.pulumi.azure.containerservice.TokenPassword(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Container Registry Task. */
  def RegistryTask(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.RegistryTaskArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.RegistryTaskArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.containerservice.RegistryTask(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.containerservice.FleetUpdateRunArgs.Builder)
    /**
     * @param managedClusterUpdate A `managedClusterUpdate` block as defined below.
     * @return builder
     */
    def managedClusterUpdate(args: Endofunction[com.pulumi.azure.containerservice.inputs.FleetUpdateRunManagedClusterUpdateArgs.Builder]):
        com.pulumi.azure.containerservice.FleetUpdateRunArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.FleetUpdateRunManagedClusterUpdateArgs.builder
      builder.managedClusterUpdate(args(argsBuilder).build)

    /**
     * @param stages One or more `stage` blocks as defined below. Only one of `stage` or `fleetUpdateStrategyId` can be specified.
     * @return builder
     */
    def stages(args: Endofunction[com.pulumi.azure.containerservice.inputs.FleetUpdateRunStageArgs.Builder]*):
        com.pulumi.azure.containerservice.FleetUpdateRunArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.FleetUpdateRunStageArgs.builder
      builder.stages(args.map(_(argsBuilder).build)*)

  type ContainerserviceFunctions = com.pulumi.azure.containerservice.ContainerserviceFunctions
  object ContainerserviceFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.containerservice.ContainerserviceFunctions.*
  extension (self: ContainerserviceFunctions.type)
    /** Use this data source to access information about an existing Kubernetes Cluster Node Pool. */
    def getClusterNodePool(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetClusterNodePoolArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.containerservice.outputs.GetClusterNodePoolResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetClusterNodePoolArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getClusterNodePool(args(argsBuilder).build)

    /** Use this data source to access information about an existing Kubernetes Cluster Node Pool. */
    def getClusterNodePoolPlain(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetClusterNodePoolPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.containerservice.outputs.GetClusterNodePoolResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetClusterNodePoolPlainArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getClusterNodePoolPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Kubernetes Fleet Manager. */
    def getFleetManager(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetFleetManagerArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.containerservice.outputs.GetFleetManagerResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetFleetManagerArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getFleetManager(args(argsBuilder).build)

    /** Use this data source to access information about an existing Kubernetes Fleet Manager. */
    def getFleetManagerPlain(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetFleetManagerPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.containerservice.outputs.GetFleetManagerResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetFleetManagerPlainArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getFleetManagerPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Container Group instance. */
    def getGroup(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetGroupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.containerservice.outputs.GetGroupResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetGroupArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getGroup(args(argsBuilder).build)

    /** Use this data source to access information about an existing Container Group instance. */
    def getGroupPlain(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetGroupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.containerservice.outputs.GetGroupResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetGroupPlainArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getGroupPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Managed Kubernetes Cluster (AKS). */
    def getKubernetesCluster(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetKubernetesClusterArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.containerservice.outputs.GetKubernetesClusterResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetKubernetesClusterArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getKubernetesCluster(args(argsBuilder).build)

    /** Use this data source to access information about an existing Managed Kubernetes Cluster (AKS). */
    def getKubernetesClusterPlain(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetKubernetesClusterPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.containerservice.outputs.GetKubernetesClusterResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetKubernetesClusterPlainArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getKubernetesClusterPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Kubernetes Node Pool Snapshot. */
    def getKubernetesNodePoolSnapshot(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetKubernetesNodePoolSnapshotArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.containerservice.outputs.GetKubernetesNodePoolSnapshotResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetKubernetesNodePoolSnapshotArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getKubernetesNodePoolSnapshot(args(argsBuilder).build)

    /** Use this data source to access information about an existing Kubernetes Node Pool Snapshot. */
    def getKubernetesNodePoolSnapshotPlain(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetKubernetesNodePoolSnapshotPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.containerservice.outputs.GetKubernetesNodePoolSnapshotResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetKubernetesNodePoolSnapshotPlainArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getKubernetesNodePoolSnapshotPlain(args(argsBuilder).build)

    /** Use this data source to retrieve the version of Kubernetes supported by Azure Kubernetes Service. */
    def getKubernetesServiceVersions(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetKubernetesServiceVersionsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.containerservice.outputs.GetKubernetesServiceVersionsResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetKubernetesServiceVersionsArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getKubernetesServiceVersions(args(argsBuilder).build)

    /** Use this data source to retrieve the version of Kubernetes supported by Azure Kubernetes Service. */
    def getKubernetesServiceVersionsPlain(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetKubernetesServiceVersionsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.containerservice.outputs.GetKubernetesServiceVersionsResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetKubernetesServiceVersionsPlainArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getKubernetesServiceVersionsPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Container Registry. */
    def getRegistry(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetRegistryArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.containerservice.outputs.GetRegistryResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetRegistryArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getRegistry(args(argsBuilder).build)

    /** Use this data source to access information about an existing Container Registry. */
    def getRegistryPlain(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetRegistryPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.containerservice.outputs.GetRegistryResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetRegistryPlainArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getRegistryPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Container Registry Cache Rule. */
    def getRegistryCacheRule(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetRegistryCacheRuleArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.containerservice.outputs.GetRegistryCacheRuleResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetRegistryCacheRuleArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getRegistryCacheRule(args(argsBuilder).build)

    /** Use this data source to access information about an existing Container Registry Cache Rule. */
    def getRegistryCacheRulePlain(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetRegistryCacheRulePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.containerservice.outputs.GetRegistryCacheRuleResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetRegistryCacheRulePlainArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getRegistryCacheRulePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Container Registry scope map. */
    def getRegistryScopeMap(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetRegistryScopeMapArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.containerservice.outputs.GetRegistryScopeMapResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetRegistryScopeMapArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getRegistryScopeMap(args(argsBuilder).build)

    /** Use this data source to access information about an existing Container Registry scope map. */
    def getRegistryScopeMapPlain(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetRegistryScopeMapPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.containerservice.outputs.GetRegistryScopeMapResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetRegistryScopeMapPlainArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getRegistryScopeMapPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Container Registry token. */
    def getRegistryToken(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetRegistryTokenArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.containerservice.outputs.GetRegistryTokenResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetRegistryTokenArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getRegistryToken(args(argsBuilder).build)

    /** Use this data source to access information about an existing Container Registry token. */
    def getRegistryTokenPlain(args: Endofunction[com.pulumi.azure.containerservice.inputs.GetRegistryTokenPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.containerservice.outputs.GetRegistryTokenResult] =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GetRegistryTokenPlainArgs.builder
      com.pulumi.azure.containerservice.ContainerserviceFunctions.getRegistryTokenPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.containerservice.FleetUpdateStrategyArgs.Builder)
    /**
     * @param stages One or more `stage` blocks as defined below.
     * @return builder
     */
    def stages(args: Endofunction[com.pulumi.azure.containerservice.inputs.FleetUpdateStrategyStageArgs.Builder]*):
        com.pulumi.azure.containerservice.FleetUpdateStrategyArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.FleetUpdateStrategyStageArgs.builder
      builder.stages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerservice.KubernetesFleetManagerArgs.Builder)
    /**
     * @return builder
     * @deprecated The service team has indicated this field is now deprecated and not to be used, as such we are marking it as such and no longer sending it to the API, please see url: https://learn.microsoft.com/en-us/azure/kubernetes-fleet/architectural-overview
     */
    @deprecated def hubProfile(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesFleetManagerHubProfileArgs.Builder]):
        com.pulumi.azure.containerservice.KubernetesFleetManagerArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesFleetManagerHubProfileArgs.builder
      builder.hubProfile(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.containerservice.KubernetesFleetManagerArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages an Azure Container Registry scope map.  For more information on scope maps see the [product documentation](https://learn.microsoft.com/en-us/azure/container-registry/container-registry-repository-scoped-permissions). */
  def RegistryScopeMap(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.RegistryScopeMapArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.RegistryScopeMapArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.containerservice.RegistryScopeMap(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.containerservice.RegistryTaskArgs.Builder)
    /**
     * @param agentSetting A `agentSetting` block as defined below.
     * 
     *  &gt; **Note:** Only one of `agentPoolName` and `agentSetting` can be specified.
     * @return builder
     */
    def agentSetting(args: Endofunction[com.pulumi.azure.containerservice.inputs.RegistryTaskAgentSettingArgs.Builder]):
        com.pulumi.azure.containerservice.RegistryTaskArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.RegistryTaskAgentSettingArgs.builder
      builder.agentSetting(args(argsBuilder).build)

    /**
     * @param baseImageTrigger A `baseImageTrigger` block as defined below.
     * @return builder
     */
    def baseImageTrigger(args: Endofunction[com.pulumi.azure.containerservice.inputs.RegistryTaskBaseImageTriggerArgs.Builder]):
        com.pulumi.azure.containerservice.RegistryTaskArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.RegistryTaskBaseImageTriggerArgs.builder
      builder.baseImageTrigger(args(argsBuilder).build)

    /**
     * @param dockerStep A `dockerStep` block as defined below.
     * @return builder
     */
    def dockerStep(args: Endofunction[com.pulumi.azure.containerservice.inputs.RegistryTaskDockerStepArgs.Builder]):
        com.pulumi.azure.containerservice.RegistryTaskArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.RegistryTaskDockerStepArgs.builder
      builder.dockerStep(args(argsBuilder).build)

    /**
     * @param encodedStep A `encodedStep` block as defined below.
     * @return builder
     */
    def encodedStep(args: Endofunction[com.pulumi.azure.containerservice.inputs.RegistryTaskEncodedStepArgs.Builder]):
        com.pulumi.azure.containerservice.RegistryTaskArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.RegistryTaskEncodedStepArgs.builder
      builder.encodedStep(args(argsBuilder).build)

    /**
     * @param fileStep A `fileStep` block as defined below.
     * 
     *  &gt; **Note:** For non-system task (when `isSystemTask` is set to `false`), one and only one of the `dockerStep`, `encodedStep` and `fileStep` should be specified.
     * @return builder
     */
    def fileStep(args: Endofunction[com.pulumi.azure.containerservice.inputs.RegistryTaskFileStepArgs.Builder]):
        com.pulumi.azure.containerservice.RegistryTaskArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.RegistryTaskFileStepArgs.builder
      builder.fileStep(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.containerservice.inputs.RegistryTaskIdentityArgs.Builder]):
        com.pulumi.azure.containerservice.RegistryTaskArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.RegistryTaskIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param platform A `platform` block as defined below.
     * 
     *  &gt; **Note:** The `platform` is required for non-system task (when `isSystemTask` is set to `false`).
     * @return builder
     */
    def platform(args: Endofunction[com.pulumi.azure.containerservice.inputs.RegistryTaskPlatformArgs.Builder]):
        com.pulumi.azure.containerservice.RegistryTaskArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.RegistryTaskPlatformArgs.builder
      builder.platform(args(argsBuilder).build)

    def registryCredential(args: Endofunction[com.pulumi.azure.containerservice.inputs.RegistryTaskRegistryCredentialArgs.Builder]):
        com.pulumi.azure.containerservice.RegistryTaskArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.RegistryTaskRegistryCredentialArgs.builder
      builder.registryCredential(args(argsBuilder).build)

    /**
     * @param sourceTriggers One or more `sourceTrigger` blocks as defined below.
     * @return builder
     */
    def sourceTriggers(args: Endofunction[com.pulumi.azure.containerservice.inputs.RegistryTaskSourceTriggerArgs.Builder]*):
        com.pulumi.azure.containerservice.RegistryTaskArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.RegistryTaskSourceTriggerArgs.builder
      builder.sourceTriggers(args.map(_(argsBuilder).build)*)

    /**
     * @param timerTriggers One or more `timerTrigger` blocks as defined below.
     * @return builder
     */
    def timerTriggers(args: Endofunction[com.pulumi.azure.containerservice.inputs.RegistryTaskTimerTriggerArgs.Builder]*):
        com.pulumi.azure.containerservice.RegistryTaskArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.RegistryTaskTimerTriggerArgs.builder
      builder.timerTriggers(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.containerservice.RegistryTaskArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Kubernetes Flux Configuration. */
  def FluxConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.FluxConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.FluxConfigurationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.containerservice.FluxConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &lt;!-- Note: This documentation is generated. Any manual changes will be overwritten --&gt;
   * 
   *  Manages a Kubernetes Fleet Member.
   */
  def FleetMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.FleetMemberArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.FleetMemberArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.containerservice.FleetMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Container Connected Registry. */
  def ConnectedRegistry(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.ConnectedRegistryArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.ConnectedRegistryArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.containerservice.ConnectedRegistry(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Kubernetes Fleet Update Strategy. */
  def FleetUpdateStrategy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.FleetUpdateStrategyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.FleetUpdateStrategyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.containerservice.FleetUpdateStrategy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Kubernetes Cluster Extension. */
  def KubernetesClusterExtension(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.KubernetesClusterExtensionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.KubernetesClusterExtensionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.containerservice.KubernetesClusterExtension(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Azure Container Registry token associated to a scope map. For more information on scope maps and their tokens see the [product documentation](https://learn.microsoft.com/en-us/azure/container-registry/container-registry-repository-scoped-permissions). */
  def RegistryToken(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.RegistryTokenArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.RegistryTokenArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.containerservice.RegistryToken(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * 
   */
  def ClusterTrustedAccessRoleBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.ClusterTrustedAccessRoleBindingArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.ClusterTrustedAccessRoleBindingArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.containerservice.ClusterTrustedAccessRoleBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Runs a Container Registry Task Schedule. */
  def RegistryTaskScheduleRunNow(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.RegistryTaskScheduleRunNowArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.containerservice.RegistryTaskScheduleRunNowArgs.builder
    com.pulumi.azure.containerservice.RegistryTaskScheduleRunNow(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Managed Kubernetes Cluster (also known as AKS / Azure Kubernetes Service)
   * 
   *  &gt; **Note:** Due to the fast-moving nature of AKS, we recommend using the latest version of the Azure Provider when using AKS.
   */
  def KubernetesCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.KubernetesClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.KubernetesClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.containerservice.KubernetesCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Azure Container Registry. */
  def Registry(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.RegistryArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerservice.RegistryArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.containerservice.Registry(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.containerservice.TokenPasswordArgs.Builder)
    /**
     * @param password1 One `password` block as defined below.
     * @return builder
     */
    def password1(args: Endofunction[com.pulumi.azure.containerservice.inputs.TokenPasswordPassword1Args.Builder]):
        com.pulumi.azure.containerservice.TokenPasswordArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.TokenPasswordPassword1Args.builder
      builder.password1(args(argsBuilder).build)

    /**
     * @param password2 One `password` block as defined below.
     * @return builder
     */
    def password2(args: Endofunction[com.pulumi.azure.containerservice.inputs.TokenPasswordPassword2Args.Builder]):
        com.pulumi.azure.containerservice.TokenPasswordArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.TokenPasswordPassword2Args.builder
      builder.password2(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.containerservice.inputs.FleetUpdateRunManagedClusterUpdateArgs.Builder)
    /**
     * @param nodeImageSelection A `nodeImageSelection` block as defined below.
     * @return builder
     */
    def nodeImageSelection(args: Endofunction[com.pulumi.azure.containerservice.inputs.FleetUpdateRunManagedClusterUpdateNodeImageSelectionArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.FleetUpdateRunManagedClusterUpdateArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.FleetUpdateRunManagedClusterUpdateNodeImageSelectionArgs.builder
      builder.nodeImageSelection(args(argsBuilder).build)

    /**
     * @param upgrade A `upgrade` block as defined below.
     * @return builder
     */
    def upgrade(args: Endofunction[com.pulumi.azure.containerservice.inputs.FleetUpdateRunManagedClusterUpdateUpgradeArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.FleetUpdateRunManagedClusterUpdateArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.FleetUpdateRunManagedClusterUpdateUpgradeArgs.builder
      builder.upgrade(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.containerservice.inputs.KubernetesFleetManagerState.Builder)
    /**
     * @return builder
     * @deprecated The service team has indicated this field is now deprecated and not to be used, as such we are marking it as such and no longer sending it to the API, please see url: https://learn.microsoft.com/en-us/azure/kubernetes-fleet/architectural-overview
     */
    @deprecated def hubProfile(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesFleetManagerHubProfileArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesFleetManagerState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesFleetManagerHubProfileArgs.builder
      builder.hubProfile(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.containerservice.inputs.KubernetesFleetManagerState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.containerservice.inputs.KubernetesClusterExtensionState.Builder)
    /**
     * @param aksAssignedIdentities An `aksAssignedIdentity` block as defined below.
     * @return builder
     */
    def aksAssignedIdentities(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterExtensionAksAssignedIdentityArgs.Builder]*):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterExtensionState.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterExtensionAksAssignedIdentityArgs.builder
      builder.aksAssignedIdentities(args.map(_(argsBuilder).build)*)

    /**
     * @param plan A `plan` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def plan(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterExtensionPlanArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterExtensionState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterExtensionPlanArgs.builder
      builder.plan(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.containerservice.inputs.RegistryTaskRegistryCredentialArgs.Builder)
    /**
     * @param customs One or more `custom` blocks as defined above.
     * @return builder
     */
    def customs(args: Endofunction[com.pulumi.azure.containerservice.inputs.RegistryTaskRegistryCredentialCustomArgs.Builder]*):
        com.pulumi.azure.containerservice.inputs.RegistryTaskRegistryCredentialArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.RegistryTaskRegistryCredentialCustomArgs.builder
      builder.customs(args.map(_(argsBuilder).build)*)

    /**
     * @param source One `source` block as defined below.
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.azure.containerservice.inputs.RegistryTaskRegistryCredentialSourceArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.RegistryTaskRegistryCredentialArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.RegistryTaskRegistryCredentialSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.containerservice.inputs.GroupContainerVolumeArgs.Builder)
    /**
     * @param gitRepo A `gitRepo` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def gitRepo(args: Endofunction[com.pulumi.azure.containerservice.inputs.GroupContainerVolumeGitRepoArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.GroupContainerVolumeArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GroupContainerVolumeGitRepoArgs.builder
      builder.gitRepo(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.containerservice.inputs.GroupState.Builder)
    /**
     * @param containers The definition of a container that is part of the group as documented in the `container` block below. Changing this forces a new resource to be created.
     * @return builder
     */
    def containers(args: Endofunction[com.pulumi.azure.containerservice.inputs.GroupContainerArgs.Builder]*):
        com.pulumi.azure.containerservice.inputs.GroupState.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.GroupContainerArgs.builder
      builder.containers(args.map(_(argsBuilder).build)*)

    /**
     * @param diagnostics A `diagnostics` block as documented below. Changing this forces a new resource to be created.
     * @return builder
     */
    def diagnostics(args: Endofunction[com.pulumi.azure.containerservice.inputs.GroupDiagnosticsArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.GroupState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GroupDiagnosticsArgs.builder
      builder.diagnostics(args(argsBuilder).build)

    /**
     * @param dnsConfig A `dnsConfig` block as documented below. Changing this forces a new resource to be created.
     * @return builder
     */
    def dnsConfig(args: Endofunction[com.pulumi.azure.containerservice.inputs.GroupDnsConfigArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.GroupState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GroupDnsConfigArgs.builder
      builder.dnsConfig(args(argsBuilder).build)

    /**
     * @param exposedPorts Zero or more `exposedPort` blocks as defined below. Changing this forces a new resource to be created.
     * 
     *  &gt; **Note:** The `exposedPort` can only contain ports that are also exposed on one or more containers in the group.
     * @return builder
     */
    def exposedPorts(args: Endofunction[com.pulumi.azure.containerservice.inputs.GroupExposedPortArgs.Builder]*):
        com.pulumi.azure.containerservice.inputs.GroupState.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.GroupExposedPortArgs.builder
      builder.exposedPorts(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.containerservice.inputs.GroupIdentityArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.GroupState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GroupIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param imageRegistryCredentials An `imageRegistryCredential` block as documented below. Changing this forces a new resource to be created.
     * @return builder
     */
    def imageRegistryCredentials(args: Endofunction[com.pulumi.azure.containerservice.inputs.GroupImageRegistryCredentialArgs.Builder]*):
        com.pulumi.azure.containerservice.inputs.GroupState.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.GroupImageRegistryCredentialArgs.builder
      builder.imageRegistryCredentials(args.map(_(argsBuilder).build)*)

    /**
     * @param initContainers The definition of an init container that is part of the group as documented in the `initContainer` block below. Changing this forces a new resource to be created.
     * @return builder
     */
    def initContainers(args: Endofunction[com.pulumi.azure.containerservice.inputs.GroupInitContainerArgs.Builder]*):
        com.pulumi.azure.containerservice.inputs.GroupState.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.GroupInitContainerArgs.builder
      builder.initContainers(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.containerservice.inputs.GroupState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.containerservice.inputs.KubernetesClusterDefaultNodePoolNodeNetworkProfileArgs.Builder)
    /**
     * @param allowedHostPorts One or more `allowedHostPorts` blocks as defined below.
     * @return builder
     */
    def allowedHostPorts(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterDefaultNodePoolNodeNetworkProfileAllowedHostPortArgs.Builder]*):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterDefaultNodePoolNodeNetworkProfileArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterDefaultNodePoolNodeNetworkProfileAllowedHostPortArgs.builder
      builder.allowedHostPorts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerservice.inputs.KubernetesClusterAciConnectorLinuxArgs.Builder)
    /**
     * @param connectorIdentities A `connectorIdentity` block is exported. The exported attributes are defined below.
     * @return builder
     */
    def connectorIdentities(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterAciConnectorLinuxConnectorIdentityArgs.Builder]*):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterAciConnectorLinuxArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterAciConnectorLinuxConnectorIdentityArgs.builder
      builder.connectorIdentities(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerservice.inputs.KubernetesClusterKeyVaultSecretsProviderArgs.Builder)
    /**
     * @param secretIdentities An `secretIdentity` block is exported. The exported attributes are defined below.
     * @return builder
     */
    def secretIdentities(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterKeyVaultSecretsProviderSecretIdentityArgs.Builder]*):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterKeyVaultSecretsProviderArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterKeyVaultSecretsProviderSecretIdentityArgs.builder
      builder.secretIdentities(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerservice.inputs.KubernetesClusterLinuxProfileArgs.Builder)
    /**
     * @param sshKey An `sshKey` block as defined below.
     * @return builder
     */
    def sshKey(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterLinuxProfileSshKeyArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterLinuxProfileArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterLinuxProfileSshKeyArgs.builder
      builder.sshKey(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.containerservice.inputs.KubernetesClusterNetworkProfileArgs.Builder)
    /**
     * @param advancedNetworking An `advancedNetworking` block as defined below.
     * @return builder
     */
    def advancedNetworking(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterNetworkProfileAdvancedNetworkingArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterNetworkProfileArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterNetworkProfileAdvancedNetworkingArgs.builder
      builder.advancedNetworking(args(argsBuilder).build)

    /**
     * @param loadBalancerProfile A `loadBalancerProfile` block as defined below. This can only be specified when `loadBalancerSku` is set to `standard`. Changing this forces a new resource to be created.
     * @return builder
     */
    def loadBalancerProfile(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterNetworkProfileLoadBalancerProfileArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterNetworkProfileArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterNetworkProfileLoadBalancerProfileArgs.builder
      builder.loadBalancerProfile(args(argsBuilder).build)

    /**
     * @param natGatewayProfile A `natGatewayProfile` block as defined below. This can only be specified when `loadBalancerSku` is set to `standard` and `outboundType` is set to `managedNATGateway` or `userAssignedNATGateway`. Changing this forces a new resource to be created.
     * @return builder
     */
    def natGatewayProfile(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterNetworkProfileNatGatewayProfileArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterNetworkProfileArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterNetworkProfileNatGatewayProfileArgs.builder
      builder.natGatewayProfile(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.containerservice.inputs.RegistryCredentialSetState.Builder)
    /**
     * @param authenticationCredentials A `authenticationCredentials` block as defined below.
     * @return builder
     */
    def authenticationCredentials(args: Endofunction[com.pulumi.azure.containerservice.inputs.RegistryCredentialSetAuthenticationCredentialsArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.RegistryCredentialSetState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.RegistryCredentialSetAuthenticationCredentialsArgs.builder
      builder.authenticationCredentials(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.containerservice.inputs.RegistryCredentialSetIdentityArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.RegistryCredentialSetState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.RegistryCredentialSetIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.containerservice.inputs.FleetUpdateRunState.Builder)
    /**
     * @param managedClusterUpdate A `managedClusterUpdate` block as defined below.
     * @return builder
     */
    def managedClusterUpdate(args: Endofunction[com.pulumi.azure.containerservice.inputs.FleetUpdateRunManagedClusterUpdateArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.FleetUpdateRunState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.FleetUpdateRunManagedClusterUpdateArgs.builder
      builder.managedClusterUpdate(args(argsBuilder).build)

    /**
     * @param stages One or more `stage` blocks as defined below. Only one of `stage` or `fleetUpdateStrategyId` can be specified.
     * @return builder
     */
    def stages(args: Endofunction[com.pulumi.azure.containerservice.inputs.FleetUpdateRunStageArgs.Builder]*):
        com.pulumi.azure.containerservice.inputs.FleetUpdateRunState.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.FleetUpdateRunStageArgs.builder
      builder.stages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerservice.inputs.RegistryNetworkRuleSetArgs.Builder)
    /**
     * @param ipRules One or more `ipRule` blocks as defined below.
     * 
     *  &gt; **Note:** `networkRuleSet` is only supported with the `Premium` SKU at this time.
     * 
     *  &gt; **Note:** Azure automatically configures Network Rules - to remove these, you&#39;ll need to specify an `networkRuleSet` block with `defaultAction` set to `Deny`.
     * @return builder
     */
    def ipRules(args: Endofunction[com.pulumi.azure.containerservice.inputs.RegistryNetworkRuleSetIpRuleArgs.Builder]*):
        com.pulumi.azure.containerservice.inputs.RegistryNetworkRuleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.RegistryNetworkRuleSetIpRuleArgs.builder
      builder.ipRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerservice.inputs.KubernetesClusterNodePoolState.Builder)
    /**
     * @param kubeletConfig A `kubeletConfig` block as defined below. Changing this requires specifying `temporaryNameForRotation`.
     * @return builder
     */
    def kubeletConfig(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterNodePoolKubeletConfigArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterNodePoolState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterNodePoolKubeletConfigArgs.builder
      builder.kubeletConfig(args(argsBuilder).build)

    /**
     * @param linuxOsConfig A `linuxOsConfig` block as defined below. Changing this requires specifying `temporaryNameForRotation`.
     * @return builder
     */
    def linuxOsConfig(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterNodePoolLinuxOsConfigArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterNodePoolState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterNodePoolLinuxOsConfigArgs.builder
      builder.linuxOsConfig(args(argsBuilder).build)

    /**
     * @param nodeNetworkProfile A `nodeNetworkProfile` block as documented below.
     * @return builder
     */
    def nodeNetworkProfile(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterNodePoolNodeNetworkProfileArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterNodePoolState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterNodePoolNodeNetworkProfileArgs.builder
      builder.nodeNetworkProfile(args(argsBuilder).build)

    /**
     * @param upgradeSettings A `upgradeSettings` block as documented below.
     * @return builder
     */
    def upgradeSettings(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterNodePoolUpgradeSettingsArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterNodePoolState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterNodePoolUpgradeSettingsArgs.builder
      builder.upgradeSettings(args(argsBuilder).build)

    /**
     * @param windowsProfile A `windowsProfile` block as documented below. Changing this forces a new resource to be created.
     * @return builder
     */
    def windowsProfile(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterNodePoolWindowsProfileArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterNodePoolState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterNodePoolWindowsProfileArgs.builder
      builder.windowsProfile(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterNodePoolState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.containerservice.inputs.FluxConfigurationState.Builder)
    /**
     * @param blobStorage An `blobStorage` block as defined below.
     * @return builder
     */
    def blobStorage(args: Endofunction[com.pulumi.azure.containerservice.inputs.FluxConfigurationBlobStorageArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.FluxConfigurationState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.FluxConfigurationBlobStorageArgs.builder
      builder.blobStorage(args(argsBuilder).build)

    /**
     * @param bucket A `bucket` block as defined below.
     * @return builder
     */
    def bucket(args: Endofunction[com.pulumi.azure.containerservice.inputs.FluxConfigurationBucketArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.FluxConfigurationState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.FluxConfigurationBucketArgs.builder
      builder.bucket(args(argsBuilder).build)

    /**
     * @param gitRepository A `gitRepository` block as defined below.
     * @return builder
     */
    def gitRepository(args: Endofunction[com.pulumi.azure.containerservice.inputs.FluxConfigurationGitRepositoryArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.FluxConfigurationState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.FluxConfigurationGitRepositoryArgs.builder
      builder.gitRepository(args(argsBuilder).build)

    /**
     * @param kustomizations A `kustomizations` block as defined below.
     * @return builder
     */
    def kustomizations(args: Endofunction[com.pulumi.azure.containerservice.inputs.FluxConfigurationKustomizationArgs.Builder]*):
        com.pulumi.azure.containerservice.inputs.FluxConfigurationState.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.FluxConfigurationKustomizationArgs.builder
      builder.kustomizations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerservice.inputs.KubernetesClusterIngressApplicationGatewayArgs.Builder)
    /**
     * @param ingressApplicationGatewayIdentities An `ingressApplicationGatewayIdentity` block is exported. The exported attributes are defined below.
     * @return builder
     */
    def ingressApplicationGatewayIdentities(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterIngressApplicationGatewayIngressApplicationGatewayIdentityArgs.Builder]*):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterIngressApplicationGatewayArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterIngressApplicationGatewayIngressApplicationGatewayIdentityArgs.builder
      builder.ingressApplicationGatewayIdentities(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerservice.inputs.KubernetesClusterNodePoolLinuxOsConfigArgs.Builder)
    /**
     * @param sysctlConfig A `sysctlConfig` block as defined below.
     * @return builder
     */
    def sysctlConfig(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterNodePoolLinuxOsConfigSysctlConfigArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterNodePoolLinuxOsConfigArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterNodePoolLinuxOsConfigSysctlConfigArgs.builder
      builder.sysctlConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.containerservice.inputs.KubernetesClusterState.Builder)
    /**
     * @param aciConnectorLinux A `aciConnectorLinux` block as defined below. For more details, please visit [Create and configure an AKS cluster to use virtual nodes](https://docs.microsoft.com/azure/aks/virtual-nodes-portal).
     * @return builder
     */
    def aciConnectorLinux(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterAciConnectorLinuxArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterAciConnectorLinuxArgs.builder
      builder.aciConnectorLinux(args(argsBuilder).build)

    /**
     * @param apiServerAccessProfile An `apiServerAccessProfile` block as defined below.
     * @return builder
     */
    def apiServerAccessProfile(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterApiServerAccessProfileArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterApiServerAccessProfileArgs.builder
      builder.apiServerAccessProfile(args(argsBuilder).build)

    /**
     * @param autoScalerProfile A `autoScalerProfile` block as defined below.
     * @return builder
     */
    def autoScalerProfile(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterAutoScalerProfileArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterAutoScalerProfileArgs.builder
      builder.autoScalerProfile(args(argsBuilder).build)

    /**
     * @param azureActiveDirectoryRoleBasedAccessControl A `azureActiveDirectoryRoleBasedAccessControl` block as defined below.
     * @return builder
     */
    def azureActiveDirectoryRoleBasedAccessControl(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterAzureActiveDirectoryRoleBasedAccessControlArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterAzureActiveDirectoryRoleBasedAccessControlArgs.builder
      builder.azureActiveDirectoryRoleBasedAccessControl(args(argsBuilder).build)

    /**
     * @param bootstrapProfile A `bootstrapProfile` block as defined below.
     * @return builder
     */
    def bootstrapProfile(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterBootstrapProfileArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterBootstrapProfileArgs.builder
      builder.bootstrapProfile(args(argsBuilder).build)

    /**
     * @param confidentialComputing A `confidentialComputing` block as defined below. For more details please [the documentation](https://learn.microsoft.com/en-us/azure/confidential-computing/confidential-nodes-aks-overview)
     * @return builder
     */
    def confidentialComputing(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterConfidentialComputingArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterConfidentialComputingArgs.builder
      builder.confidentialComputing(args(argsBuilder).build)

    /**
     * @param defaultNodePool Specifies configuration for &#34;System&#34; mode node pool. A `defaultNodePool` block as defined below.
     * @return builder
     */
    def defaultNodePool(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterDefaultNodePoolArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterDefaultNodePoolArgs.builder
      builder.defaultNodePool(args(argsBuilder).build)

    /**
     * @param httpProxyConfig A `httpProxyConfig` block as defined below.
     * @return builder
     */
    def httpProxyConfig(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterHttpProxyConfigArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterHttpProxyConfigArgs.builder
      builder.httpProxyConfig(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below. One of either `identity` or `servicePrincipal` must be specified.
     * 
     *  !&gt; **Note:** A migration scenario from `servicePrincipal` to `identity` is supported. When upgrading `servicePrincipal` to `identity`, your cluster&#39;s control plane and addon pods will switch to use managed identity, but the kubelets will keep using your configured `servicePrincipal` until you upgrade your Node Pool.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterIdentityArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param ingressApplicationGateway A `ingressApplicationGateway` block as defined below.
     * 
     *  &gt; **Note:** Since the Application Gateway is deployed inside a Virtual Network, users (and Service Principals) that are operating the Application Gateway must have the `Microsoft.Network/virtualNetworks/subnets/join/action` permission on the Virtual Network or Subnet. For more details, please visit [Virtual Network Permission](https://learn.microsoft.com/en-us/azure/application-gateway/configuration-infrastructure#virtual-network-permission).
     * @return builder
     */
    def ingressApplicationGateway(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterIngressApplicationGatewayArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterIngressApplicationGatewayArgs.builder
      builder.ingressApplicationGateway(args(argsBuilder).build)

    /**
     * @param keyManagementService A `keyManagementService` block as defined below. For more details, please visit [Key Management Service (KMS) etcd encryption to an AKS cluster](https://learn.microsoft.com/en-us/azure/aks/use-kms-etcd-encryption).
     * @return builder
     */
    def keyManagementService(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterKeyManagementServiceArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterKeyManagementServiceArgs.builder
      builder.keyManagementService(args(argsBuilder).build)

    /**
     * @param keyVaultSecretsProvider A `keyVaultSecretsProvider` block as defined below. For more details, please visit [Azure Keyvault Secrets Provider for AKS](https://docs.microsoft.com/azure/aks/csi-secrets-store-driver).
     * @return builder
     */
    def keyVaultSecretsProvider(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterKeyVaultSecretsProviderArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterKeyVaultSecretsProviderArgs.builder
      builder.keyVaultSecretsProvider(args(argsBuilder).build)

    /**
     * @param kubeAdminConfigs A `kubeAdminConfig` block as defined below. This is only available when Role Based Access Control with Azure Active Directory is enabled and local accounts enabled.
     * @return builder
     */
    def kubeAdminConfigs(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterKubeAdminConfigArgs.Builder]*):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterState.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterKubeAdminConfigArgs.builder
      builder.kubeAdminConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param kubeConfigs A `kubeConfig` block as defined below.
     * @return builder
     */
    def kubeConfigs(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterKubeConfigArgs.Builder]*):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterState.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterKubeConfigArgs.builder
      builder.kubeConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param kubeletIdentity A `kubeletIdentity` block as defined below.
     * @return builder
     */
    def kubeletIdentity(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterKubeletIdentityArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterKubeletIdentityArgs.builder
      builder.kubeletIdentity(args(argsBuilder).build)

    /**
     * @param linuxProfile A `linuxProfile` block as defined below.
     * @return builder
     */
    def linuxProfile(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterLinuxProfileArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterLinuxProfileArgs.builder
      builder.linuxProfile(args(argsBuilder).build)

    /**
     * @param maintenanceWindow A `maintenanceWindow` block as defined below.
     * @return builder
     */
    def maintenanceWindow(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterMaintenanceWindowArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterMaintenanceWindowArgs.builder
      builder.maintenanceWindow(args(argsBuilder).build)

    /**
     * @param maintenanceWindowAutoUpgrade A `maintenanceWindowAutoUpgrade` block as defined below.
     * @return builder
     */
    def maintenanceWindowAutoUpgrade(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterMaintenanceWindowAutoUpgradeArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterMaintenanceWindowAutoUpgradeArgs.builder
      builder.maintenanceWindowAutoUpgrade(args(argsBuilder).build)

    /**
     * @param maintenanceWindowNodeOs A `maintenanceWindowNodeOs` block as defined below.
     * @return builder
     */
    def maintenanceWindowNodeOs(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterMaintenanceWindowNodeOsArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterMaintenanceWindowNodeOsArgs.builder
      builder.maintenanceWindowNodeOs(args(argsBuilder).build)

    /**
     * @param microsoftDefender A `microsoftDefender` block as defined below.
     * @return builder
     */
    def microsoftDefender(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterMicrosoftDefenderArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterMicrosoftDefenderArgs.builder
      builder.microsoftDefender(args(argsBuilder).build)

    /**
     * @param monitorMetrics Specifies a Prometheus add-on profile for the Kubernetes Cluster. A `monitorMetrics` block as defined below.
     * 
     *  &gt; **Note:** If deploying Managed Prometheus, the `monitorMetrics` properties are required to configure the cluster for metrics collection. If no value is needed, set properties to `null`.
     * @return builder
     */
    def monitorMetrics(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterMonitorMetricsArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterMonitorMetricsArgs.builder
      builder.monitorMetrics(args(argsBuilder).build)

    /**
     * @param networkProfile A `networkProfile` block as defined below. Changing this forces a new resource to be created.
     * 
     *  &gt; **Note:** If `networkProfile` is not defined, `kubenet` profile will be used by default.
     * @return builder
     */
    def networkProfile(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterNetworkProfileArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterNetworkProfileArgs.builder
      builder.networkProfile(args(argsBuilder).build)

    /**
     * @param nodeProvisioningProfile A `nodeProvisioningProfile` block as defined below.
     * @return builder
     */
    def nodeProvisioningProfile(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterNodeProvisioningProfileArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterNodeProvisioningProfileArgs.builder
      builder.nodeProvisioningProfile(args(argsBuilder).build)

    /**
     * @param omsAgent A `omsAgent` block as defined below.
     * @return builder
     */
    def omsAgent(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterOmsAgentArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterOmsAgentArgs.builder
      builder.omsAgent(args(argsBuilder).build)

    /**
     * @param serviceMeshProfile A `serviceMeshProfile` block as defined below.
     * @return builder
     */
    def serviceMeshProfile(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterServiceMeshProfileArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterServiceMeshProfileArgs.builder
      builder.serviceMeshProfile(args(argsBuilder).build)

    /**
     * @param servicePrincipal A `servicePrincipal` block as documented below. One of either `identity` or `servicePrincipal` must be specified.
     * 
     *  !&gt; **Note:** A migration scenario from `servicePrincipal` to `identity` is supported. When upgrading `servicePrincipal` to `identity`, your cluster&#39;s control plane and addon pods will switch to use managed identity, but the kubelets will keep using your configured `servicePrincipal` until you upgrade your Node Pool.
     * @return builder
     */
    def servicePrincipal(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterServicePrincipalArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterServicePrincipalArgs.builder
      builder.servicePrincipal(args(argsBuilder).build)

    /**
     * @param storageProfile A `storageProfile` block as defined below.
     * @return builder
     */
    def storageProfile(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterStorageProfileArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterStorageProfileArgs.builder
      builder.storageProfile(args(argsBuilder).build)

    /**
     * @param upgradeOverride A `upgradeOverride` block as defined below.
     * @return builder
     */
    def upgradeOverride(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterUpgradeOverrideArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterUpgradeOverrideArgs.builder
      builder.upgradeOverride(args(argsBuilder).build)

    /**
     * @param webAppRouting A `webAppRouting` block as defined below.
     * @return builder
     */
    def webAppRouting(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterWebAppRoutingArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterWebAppRoutingArgs.builder
      builder.webAppRouting(args(argsBuilder).build)

    /**
     * @param windowsProfile A `windowsProfile` block as defined below.
     * @return builder
     */
    def windowsProfile(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterWindowsProfileArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterWindowsProfileArgs.builder
      builder.windowsProfile(args(argsBuilder).build)

    /**
     * @param workloadAutoscalerProfile A `workloadAutoscalerProfile` block defined below.
     * @return builder
     */
    def workloadAutoscalerProfile(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterWorkloadAutoscalerProfileArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterWorkloadAutoscalerProfileArgs.builder
      builder.workloadAutoscalerProfile(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.containerservice.inputs.FluxConfigurationKustomizationArgs.Builder)
    /**
     * @param postBuild A `postBuild` block as defined below.
     * @return builder
     */
    def postBuild(args: Endofunction[com.pulumi.azure.containerservice.inputs.FluxConfigurationKustomizationPostBuildArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.FluxConfigurationKustomizationArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.FluxConfigurationKustomizationPostBuildArgs.builder
      builder.postBuild(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.containerservice.inputs.KubernetesClusterOmsAgentArgs.Builder)
    /**
     * @param omsAgentIdentities An `omsAgentIdentity` block is exported. The exported attributes are defined below.
     * @return builder
     */
    def omsAgentIdentities(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterOmsAgentOmsAgentIdentityArgs.Builder]*):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterOmsAgentArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterOmsAgentOmsAgentIdentityArgs.builder
      builder.omsAgentIdentities(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerservice.inputs.TokenPasswordState.Builder)
    /**
     * @param password1 One `password` block as defined below.
     * @return builder
     */
    def password1(args: Endofunction[com.pulumi.azure.containerservice.inputs.TokenPasswordPassword1Args.Builder]):
        com.pulumi.azure.containerservice.inputs.TokenPasswordState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.TokenPasswordPassword1Args.builder
      builder.password1(args(argsBuilder).build)

    /**
     * @param password2 One `password` block as defined below.
     * @return builder
     */
    def password2(args: Endofunction[com.pulumi.azure.containerservice.inputs.TokenPasswordPassword2Args.Builder]):
        com.pulumi.azure.containerservice.inputs.TokenPasswordState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.TokenPasswordPassword2Args.builder
      builder.password2(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.containerservice.inputs.KubernetesClusterMaintenanceWindowNodeOsArgs.Builder)
    /**
     * @param notAlloweds One or more `notAllowed` block as defined below.
     * @return builder
     */
    def notAlloweds(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterMaintenanceWindowNodeOsNotAllowedArgs.Builder]*):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterMaintenanceWindowNodeOsArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterMaintenanceWindowNodeOsNotAllowedArgs.builder
      builder.notAlloweds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerservice.inputs.RegistryState.Builder)
    /**
     * @param encryption An `encryption` block as documented below.
     * @return builder
     */
    def encryption(args: Endofunction[com.pulumi.azure.containerservice.inputs.RegistryEncryptionArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.RegistryState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.RegistryEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

    /**
     * @param georeplications One or more `georeplications` blocks as documented below.
     * 
     *  &gt; **Note:** The `georeplications` is only supported on new resources with the `Premium` SKU.
     * 
     *  &gt; **Note:** The `georeplications` list cannot contain the location where the Container Registry exists.
     * 
     *  &gt; **Note:** If more than one `georeplications` block is specified, they are expected to follow the alphabetic order on the `location` property.
     * @return builder
     */
    def georeplications(args: Endofunction[com.pulumi.azure.containerservice.inputs.RegistryGeoreplicationArgs.Builder]*):
        com.pulumi.azure.containerservice.inputs.RegistryState.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.RegistryGeoreplicationArgs.builder
      builder.georeplications(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.containerservice.inputs.RegistryIdentityArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.RegistryState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.RegistryIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param networkRuleSet A `networkRuleSet` block as documented below.
     * @return builder
     */
    def networkRuleSet(args: Endofunction[com.pulumi.azure.containerservice.inputs.RegistryNetworkRuleSetArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.RegistryState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.RegistryNetworkRuleSetArgs.builder
      builder.networkRuleSet(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.containerservice.inputs.RegistryState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.containerservice.inputs.KubernetesClusterMaintenanceWindowAutoUpgradeArgs.Builder)
    /**
     * @param notAlloweds One or more `notAllowed` block as defined below.
     * @return builder
     */
    def notAlloweds(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterMaintenanceWindowAutoUpgradeNotAllowedArgs.Builder]*):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterMaintenanceWindowAutoUpgradeArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterMaintenanceWindowAutoUpgradeNotAllowedArgs.builder
      builder.notAlloweds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerservice.inputs.RegistryTaskSourceTriggerArgs.Builder)
    /**
     * @param authentication A `authentication` block as defined above.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.azure.containerservice.inputs.RegistryTaskSourceTriggerAuthenticationArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.RegistryTaskSourceTriggerArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.RegistryTaskSourceTriggerAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.containerservice.inputs.KubernetesClusterServiceMeshProfileArgs.Builder)
    /**
     * @param certificateAuthority A `certificateAuthority` block as defined below. When this property is specified, `keyVaultSecretsProvider` is also required to be set. This configuration allows you to bring your own root certificate and keys for Istio CA in the Istio-based service mesh add-on for Azure Kubernetes Service.
     * @return builder
     */
    def certificateAuthority(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterServiceMeshProfileCertificateAuthorityArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterServiceMeshProfileArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterServiceMeshProfileCertificateAuthorityArgs.builder
      builder.certificateAuthority(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.containerservice.inputs.GroupInitContainerVolumeArgs.Builder)
    /**
     * @param gitRepo A `gitRepo` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def gitRepo(args: Endofunction[com.pulumi.azure.containerservice.inputs.GroupInitContainerVolumeGitRepoArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.GroupInitContainerVolumeArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GroupInitContainerVolumeGitRepoArgs.builder
      builder.gitRepo(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.containerservice.inputs.RegistryTaskState.Builder)
    /**
     * @param agentSetting A `agentSetting` block as defined below.
     * 
     *  &gt; **Note:** Only one of `agentPoolName` and `agentSetting` can be specified.
     * @return builder
     */
    def agentSetting(args: Endofunction[com.pulumi.azure.containerservice.inputs.RegistryTaskAgentSettingArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.RegistryTaskState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.RegistryTaskAgentSettingArgs.builder
      builder.agentSetting(args(argsBuilder).build)

    /**
     * @param baseImageTrigger A `baseImageTrigger` block as defined below.
     * @return builder
     */
    def baseImageTrigger(args: Endofunction[com.pulumi.azure.containerservice.inputs.RegistryTaskBaseImageTriggerArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.RegistryTaskState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.RegistryTaskBaseImageTriggerArgs.builder
      builder.baseImageTrigger(args(argsBuilder).build)

    /**
     * @param dockerStep A `dockerStep` block as defined below.
     * @return builder
     */
    def dockerStep(args: Endofunction[com.pulumi.azure.containerservice.inputs.RegistryTaskDockerStepArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.RegistryTaskState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.RegistryTaskDockerStepArgs.builder
      builder.dockerStep(args(argsBuilder).build)

    /**
     * @param encodedStep A `encodedStep` block as defined below.
     * @return builder
     */
    def encodedStep(args: Endofunction[com.pulumi.azure.containerservice.inputs.RegistryTaskEncodedStepArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.RegistryTaskState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.RegistryTaskEncodedStepArgs.builder
      builder.encodedStep(args(argsBuilder).build)

    /**
     * @param fileStep A `fileStep` block as defined below.
     * 
     *  &gt; **Note:** For non-system task (when `isSystemTask` is set to `false`), one and only one of the `dockerStep`, `encodedStep` and `fileStep` should be specified.
     * @return builder
     */
    def fileStep(args: Endofunction[com.pulumi.azure.containerservice.inputs.RegistryTaskFileStepArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.RegistryTaskState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.RegistryTaskFileStepArgs.builder
      builder.fileStep(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.containerservice.inputs.RegistryTaskIdentityArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.RegistryTaskState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.RegistryTaskIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param platform A `platform` block as defined below.
     * 
     *  &gt; **Note:** The `platform` is required for non-system task (when `isSystemTask` is set to `false`).
     * @return builder
     */
    def platform(args: Endofunction[com.pulumi.azure.containerservice.inputs.RegistryTaskPlatformArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.RegistryTaskState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.RegistryTaskPlatformArgs.builder
      builder.platform(args(argsBuilder).build)

    def registryCredential(args: Endofunction[com.pulumi.azure.containerservice.inputs.RegistryTaskRegistryCredentialArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.RegistryTaskState.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.RegistryTaskRegistryCredentialArgs.builder
      builder.registryCredential(args(argsBuilder).build)

    /**
     * @param sourceTriggers One or more `sourceTrigger` blocks as defined below.
     * @return builder
     */
    def sourceTriggers(args: Endofunction[com.pulumi.azure.containerservice.inputs.RegistryTaskSourceTriggerArgs.Builder]*):
        com.pulumi.azure.containerservice.inputs.RegistryTaskState.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.RegistryTaskSourceTriggerArgs.builder
      builder.sourceTriggers(args.map(_(argsBuilder).build)*)

    /**
     * @param timerTriggers One or more `timerTrigger` blocks as defined below.
     * @return builder
     */
    def timerTriggers(args: Endofunction[com.pulumi.azure.containerservice.inputs.RegistryTaskTimerTriggerArgs.Builder]*):
        com.pulumi.azure.containerservice.inputs.RegistryTaskState.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.RegistryTaskTimerTriggerArgs.builder
      builder.timerTriggers(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.containerservice.inputs.RegistryTaskState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.containerservice.inputs.KubernetesClusterDefaultNodePoolArgs.Builder)
    /**
     * @param kubeletConfig A `kubeletConfig` block as defined below. `temporaryNameForRotation` must be specified when changing this block.
     * @return builder
     */
    def kubeletConfig(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterDefaultNodePoolKubeletConfigArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterDefaultNodePoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterDefaultNodePoolKubeletConfigArgs.builder
      builder.kubeletConfig(args(argsBuilder).build)

    /**
     * @param linuxOsConfig A `linuxOsConfig` block as defined below. `temporaryNameForRotation` must be specified when changing this block.
     * @return builder
     */
    def linuxOsConfig(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterDefaultNodePoolLinuxOsConfigArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterDefaultNodePoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterDefaultNodePoolLinuxOsConfigArgs.builder
      builder.linuxOsConfig(args(argsBuilder).build)

    /**
     * @param nodeNetworkProfile A `nodeNetworkProfile` block as documented below.
     * @return builder
     */
    def nodeNetworkProfile(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterDefaultNodePoolNodeNetworkProfileArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterDefaultNodePoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterDefaultNodePoolNodeNetworkProfileArgs.builder
      builder.nodeNetworkProfile(args(argsBuilder).build)

    /**
     * @param upgradeSettings A `upgradeSettings` block as documented below.
     * @return builder
     */
    def upgradeSettings(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterDefaultNodePoolUpgradeSettingsArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterDefaultNodePoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterDefaultNodePoolUpgradeSettingsArgs.builder
      builder.upgradeSettings(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterDefaultNodePoolArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.containerservice.inputs.GroupDiagnosticsArgs.Builder)
    /**
     * @param logAnalytics A `logAnalytics` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def logAnalytics(args: Endofunction[com.pulumi.azure.containerservice.inputs.GroupDiagnosticsLogAnalyticsArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.GroupDiagnosticsArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GroupDiagnosticsLogAnalyticsArgs.builder
      builder.logAnalytics(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.containerservice.inputs.ConnectedRegistryState.Builder)
    /**
     * @param notifications One or more `notification` blocks as defined below.
     * @return builder
     */
    def notifications(args: Endofunction[com.pulumi.azure.containerservice.inputs.ConnectedRegistryNotificationArgs.Builder]*):
        com.pulumi.azure.containerservice.inputs.ConnectedRegistryState.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.ConnectedRegistryNotificationArgs.builder
      builder.notifications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerservice.inputs.KubernetesClusterNodePoolNodeNetworkProfileArgs.Builder)
    /**
     * @param allowedHostPorts One or more `allowedHostPorts` blocks as defined below.
     * @return builder
     */
    def allowedHostPorts(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterNodePoolNodeNetworkProfileAllowedHostPortArgs.Builder]*):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterNodePoolNodeNetworkProfileArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterNodePoolNodeNetworkProfileAllowedHostPortArgs.builder
      builder.allowedHostPorts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerservice.inputs.KubernetesClusterDefaultNodePoolLinuxOsConfigArgs.Builder)
    /**
     * @param sysctlConfig A `sysctlConfig` block as defined below.
     * @return builder
     */
    def sysctlConfig(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterDefaultNodePoolLinuxOsConfigSysctlConfigArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterDefaultNodePoolLinuxOsConfigArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterDefaultNodePoolLinuxOsConfigSysctlConfigArgs.builder
      builder.sysctlConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.containerservice.inputs.KubernetesClusterMaintenanceWindowArgs.Builder)
    /**
     * @param alloweds One or more `allowed` blocks as defined below.
     * @return builder
     */
    def alloweds(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterMaintenanceWindowAllowedArgs.Builder]*):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterMaintenanceWindowArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterMaintenanceWindowAllowedArgs.builder
      builder.alloweds(args.map(_(argsBuilder).build)*)

    /**
     * @param notAlloweds One or more `notAllowed` block as defined below.
     * @return builder
     */
    def notAlloweds(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterMaintenanceWindowNotAllowedArgs.Builder]*):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterMaintenanceWindowArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterMaintenanceWindowNotAllowedArgs.builder
      builder.notAlloweds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerservice.inputs.GroupContainerArgs.Builder)
    /**
     * @param livenessProbe The definition of a readiness probe for this container as documented in the `livenessProbe` block below. Changing this forces a new resource to be created.
     * @return builder
     */
    def livenessProbe(args: Endofunction[com.pulumi.azure.containerservice.inputs.GroupContainerLivenessProbeArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.GroupContainerArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GroupContainerLivenessProbeArgs.builder
      builder.livenessProbe(args(argsBuilder).build)

    /**
     * @param ports A set of public ports for the container. Changing this forces a new resource to be created. Set as documented in the `ports` block below.
     * @return builder
     */
    def ports(args: Endofunction[com.pulumi.azure.containerservice.inputs.GroupContainerPortArgs.Builder]*):
        com.pulumi.azure.containerservice.inputs.GroupContainerArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.GroupContainerPortArgs.builder
      builder.ports(args.map(_(argsBuilder).build)*)

    /**
     * @param readinessProbe The definition of a readiness probe for this container as documented in the `readinessProbe` block below. Changing this forces a new resource to be created.
     * @return builder
     */
    def readinessProbe(args: Endofunction[com.pulumi.azure.containerservice.inputs.GroupContainerReadinessProbeArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.GroupContainerArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.GroupContainerReadinessProbeArgs.builder
      builder.readinessProbe(args(argsBuilder).build)

    /**
     * @param securities The definition of the security context for this container as documented in the `security` block below. Changing this forces a new resource to be created.
     * @return builder
     */
    def securities(args: Endofunction[com.pulumi.azure.containerservice.inputs.GroupContainerSecurityArgs.Builder]*):
        com.pulumi.azure.containerservice.inputs.GroupContainerArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.GroupContainerSecurityArgs.builder
      builder.securities(args.map(_(argsBuilder).build)*)

    /**
     * @param volumes The definition of a volume mount for this container as documented in the `volume` block below. Changing this forces a new resource to be created.
     * @return builder
     */
    def volumes(args: Endofunction[com.pulumi.azure.containerservice.inputs.GroupContainerVolumeArgs.Builder]*):
        com.pulumi.azure.containerservice.inputs.GroupContainerArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.GroupContainerVolumeArgs.builder
      builder.volumes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerservice.inputs.GroupContainerLivenessProbeArgs.Builder)
    /**
     * @param httpGets The definition of the httpGet for this container as documented in the `httpGet` block below. Changing this forces a new resource to be created.
     * @return builder
     */
    def httpGets(args: Endofunction[com.pulumi.azure.containerservice.inputs.GroupContainerLivenessProbeHttpGetArgs.Builder]*):
        com.pulumi.azure.containerservice.inputs.GroupContainerLivenessProbeArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.GroupContainerLivenessProbeHttpGetArgs.builder
      builder.httpGets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerservice.inputs.GroupInitContainerArgs.Builder)
    /**
     * @param securities The definition of the security context for this container as documented in the `security` block below. Changing this forces a new resource to be created.
     * @return builder
     */
    def securities(args: Endofunction[com.pulumi.azure.containerservice.inputs.GroupInitContainerSecurityArgs.Builder]*):
        com.pulumi.azure.containerservice.inputs.GroupInitContainerArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.GroupInitContainerSecurityArgs.builder
      builder.securities(args.map(_(argsBuilder).build)*)

    /**
     * @param volumes The definition of a volume mount for this container as documented in the `volume` block below. Changing this forces a new resource to be created.
     * @return builder
     */
    def volumes(args: Endofunction[com.pulumi.azure.containerservice.inputs.GroupInitContainerVolumeArgs.Builder]*):
        com.pulumi.azure.containerservice.inputs.GroupInitContainerArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.GroupInitContainerVolumeArgs.builder
      builder.volumes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerservice.inputs.FleetUpdateStrategyState.Builder)
    /**
     * @param stages One or more `stage` blocks as defined below.
     * @return builder
     */
    def stages(args: Endofunction[com.pulumi.azure.containerservice.inputs.FleetUpdateStrategyStageArgs.Builder]*):
        com.pulumi.azure.containerservice.inputs.FleetUpdateStrategyState.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.FleetUpdateStrategyStageArgs.builder
      builder.stages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerservice.inputs.KubernetesClusterWebAppRoutingArgs.Builder)
    /**
     * @param webAppRoutingIdentities A `webAppRoutingIdentity` block is exported. The exported attributes are defined below.
     * @return builder
     */
    def webAppRoutingIdentities(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterWebAppRoutingWebAppRoutingIdentityArgs.Builder]*):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterWebAppRoutingArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterWebAppRoutingWebAppRoutingIdentityArgs.builder
      builder.webAppRoutingIdentities(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerservice.inputs.FluxConfigurationKustomizationPostBuildArgs.Builder)
    /**
     * @param substituteFroms A `substituteFrom` block as defined below.
     * @return builder
     */
    def substituteFroms(args: Endofunction[com.pulumi.azure.containerservice.inputs.FluxConfigurationKustomizationPostBuildSubstituteFromArgs.Builder]*):
        com.pulumi.azure.containerservice.inputs.FluxConfigurationKustomizationPostBuildArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.FluxConfigurationKustomizationPostBuildSubstituteFromArgs.builder
      builder.substituteFroms(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerservice.inputs.FluxConfigurationBlobStorageArgs.Builder)
    /**
     * @param managedIdentity A `managedIdentity` block as defined below.
     * @return builder
     */
    def managedIdentity(args: Endofunction[com.pulumi.azure.containerservice.inputs.FluxConfigurationBlobStorageManagedIdentityArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.FluxConfigurationBlobStorageArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.FluxConfigurationBlobStorageManagedIdentityArgs.builder
      builder.managedIdentity(args(argsBuilder).build)

    /**
     * @param servicePrincipal A `servicePrincipal` block as defined below.
     * @return builder
     */
    def servicePrincipal(args: Endofunction[com.pulumi.azure.containerservice.inputs.FluxConfigurationBlobStorageServicePrincipalArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.FluxConfigurationBlobStorageArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.FluxConfigurationBlobStorageServicePrincipalArgs.builder
      builder.servicePrincipal(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.containerservice.inputs.GroupContainerReadinessProbeArgs.Builder)
    /**
     * @param httpGets The definition of the httpGet for this container as documented in the `httpGet` block below. Changing this forces a new resource to be created.
     * @return builder
     */
    def httpGets(args: Endofunction[com.pulumi.azure.containerservice.inputs.GroupContainerReadinessProbeHttpGetArgs.Builder]*):
        com.pulumi.azure.containerservice.inputs.GroupContainerReadinessProbeArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.GroupContainerReadinessProbeHttpGetArgs.builder
      builder.httpGets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerservice.inputs.FleetUpdateRunStageArgs.Builder)
    /**
     * @param groups One or more `group` blocks as defined below.
     * @return builder
     */
    def groups(args: Endofunction[com.pulumi.azure.containerservice.inputs.FleetUpdateRunStageGroupArgs.Builder]*):
        com.pulumi.azure.containerservice.inputs.FleetUpdateRunStageArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.FleetUpdateRunStageGroupArgs.builder
      builder.groups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerservice.inputs.KubernetesClusterWindowsProfileArgs.Builder)
    /**
     * @param gmsa A `gmsa` block as defined below.
     * @return builder
     */
    def gmsa(args: Endofunction[com.pulumi.azure.containerservice.inputs.KubernetesClusterWindowsProfileGmsaArgs.Builder]):
        com.pulumi.azure.containerservice.inputs.KubernetesClusterWindowsProfileArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.KubernetesClusterWindowsProfileGmsaArgs.builder
      builder.gmsa(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.containerservice.inputs.FleetUpdateStrategyStageArgs.Builder)
    /**
     * @param groups One or more `group` blocks as defined below.
     * @return builder
     */
    def groups(args: Endofunction[com.pulumi.azure.containerservice.inputs.FleetUpdateStrategyStageGroupArgs.Builder]*):
        com.pulumi.azure.containerservice.inputs.FleetUpdateStrategyStageArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerservice.inputs.FleetUpdateStrategyStageGroupArgs.builder
      builder.groups(args.map(_(argsBuilder).build)*)

  /** Manages a Deployment Safeguard for a Kubernetes Cluster. */
  def ClusterDeploymentSafeguard(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerservice.ClusterDeploymentSafeguardArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.containerservice.ClusterDeploymentSafeguardArgs.builder
    com.pulumi.azure.containerservice.ClusterDeploymentSafeguard(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.containerservice.RegistryCredentialSetArgs.Builder)
    /**
     * @param authenticationCredentials A `authenticationCredentials` block as defined below.
     * @return builder
     */
    def authenticationCredentials(args: Endofunction[com.pulumi.azure.containerservice.inputs.RegistryCredentialSetAuthenticationCredentialsArgs.Builder]):
        com.pulumi.azure.containerservice.RegistryCredentialSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.RegistryCredentialSetAuthenticationCredentialsArgs.builder
      builder.authenticationCredentials(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.containerservice.inputs.RegistryCredentialSetIdentityArgs.Builder]):
        com.pulumi.azure.containerservice.RegistryCredentialSetArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerservice.inputs.RegistryCredentialSetIdentityArgs.builder
      builder.identity(args(argsBuilder).build)
