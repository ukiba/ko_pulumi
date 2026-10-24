package jp.ukiba.ko_pulumi
package azure

object batch_ext:
  extension (builder: com.pulumi.azure.batch.AccountArgs.Builder)
    /**
     * @param encryption Specifies if customer managed key encryption should be used to encrypt batch account data. One `encryption` block as defined below.
     * @return builder
     */
    inline def encryption(args: Endofunction[com.pulumi.azure.batch.inputs.AccountEncryptionArgs.Builder]):
        com.pulumi.azure.batch.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.batch.inputs.AccountEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.batch.inputs.AccountIdentityArgs.Builder]):
        com.pulumi.azure.batch.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.batch.inputs.AccountIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param keyVaultReference A `keyVaultReference` block, as defined below, that describes the Azure KeyVault reference to use when deploying the Azure Batch account using the `UserSubscription` pool allocation mode.
     * @return builder
     */
    inline def keyVaultReference(args: Endofunction[com.pulumi.azure.batch.inputs.AccountKeyVaultReferenceArgs.Builder]):
        com.pulumi.azure.batch.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.batch.inputs.AccountKeyVaultReferenceArgs.builder
      builder.keyVaultReference(args(argsBuilder).build)

    /**
     * @param networkProfile A `networkProfile` block as defined below.
     * @return builder
     */
    inline def networkProfile(args: Endofunction[com.pulumi.azure.batch.inputs.AccountNetworkProfileArgs.Builder]):
        com.pulumi.azure.batch.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.batch.inputs.AccountNetworkProfileArgs.builder
      builder.networkProfile(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.batch.PoolArgs.Builder)
    /**
     * @param autoScale A `autoScale` block that describes the scale settings when using auto scale as defined below.
     * 
     * &gt; **Note:** `fixedScale` and `autoScale` blocks cannot be used both at the same time.
     * @return builder
     */
    inline def autoScale(args: Endofunction[com.pulumi.azure.batch.inputs.PoolAutoScaleArgs.Builder]):
        com.pulumi.azure.batch.PoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.batch.inputs.PoolAutoScaleArgs.builder
      builder.autoScale(args(argsBuilder).build)

    /**
     * @return builder
     * @deprecated the `certificate` property has been deprecated and will be removed in v5.0 of the AzureRM provider.
     */
    @deprecated("the `certificate` property has been deprecated and will be removed in v5.0 of the AzureRM provider.") inline def certificates(args: Endofunction[com.pulumi.azure.batch.inputs.PoolCertificateArgs.Builder]*):
        com.pulumi.azure.batch.PoolArgs.Builder =
      def argsBuilder = com.pulumi.azure.batch.inputs.PoolCertificateArgs.builder
      builder.certificates(args.map(_(argsBuilder).build)*)

    /**
     * @param containerConfiguration The container configuration used in the pool&#39;s VMs. One `containerConfiguration` block as defined below.
     * @return builder
     */
    inline def containerConfiguration(args: Endofunction[com.pulumi.azure.batch.inputs.PoolContainerConfigurationArgs.Builder]):
        com.pulumi.azure.batch.PoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.batch.inputs.PoolContainerConfigurationArgs.builder
      builder.containerConfiguration(args(argsBuilder).build)

    /**
     * @param dataDisks A `dataDisks` block describes the data disk settings as defined below.
     * @return builder
     */
    inline def dataDisks(args: Endofunction[com.pulumi.azure.batch.inputs.PoolDataDiskArgs.Builder]*):
        com.pulumi.azure.batch.PoolArgs.Builder =
      def argsBuilder = com.pulumi.azure.batch.inputs.PoolDataDiskArgs.builder
      builder.dataDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param diskEncryptions A `diskEncryption` block, as defined below, describes the disk encryption configuration applied on compute nodes in the pool. Disk encryption configuration is not supported on Linux pool created with Virtual Machine Image or Shared Image Gallery Image.
     * @return builder
     */
    inline def diskEncryptions(args: Endofunction[com.pulumi.azure.batch.inputs.PoolDiskEncryptionArgs.Builder]*):
        com.pulumi.azure.batch.PoolArgs.Builder =
      def argsBuilder = com.pulumi.azure.batch.inputs.PoolDiskEncryptionArgs.builder
      builder.diskEncryptions(args.map(_(argsBuilder).build)*)

    /**
     * @param extensions An `extensions` block as defined below.
     * @return builder
     */
    inline def extensions(args: Endofunction[com.pulumi.azure.batch.inputs.PoolExtensionArgs.Builder]*):
        com.pulumi.azure.batch.PoolArgs.Builder =
      def argsBuilder = com.pulumi.azure.batch.inputs.PoolExtensionArgs.builder
      builder.extensions(args.map(_(argsBuilder).build)*)

    /**
     * @param fixedScale A `fixedScale` block that describes the scale settings when using fixed scale as defined below.
     * @return builder
     */
    inline def fixedScale(args: Endofunction[com.pulumi.azure.batch.inputs.PoolFixedScaleArgs.Builder]):
        com.pulumi.azure.batch.PoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.batch.inputs.PoolFixedScaleArgs.builder
      builder.fixedScale(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.batch.inputs.PoolIdentityArgs.Builder]):
        com.pulumi.azure.batch.PoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.batch.inputs.PoolIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param mounts A `mount` block defined as below.
     * @return builder
     */
    inline def mounts(args: Endofunction[com.pulumi.azure.batch.inputs.PoolMountArgs.Builder]*):
        com.pulumi.azure.batch.PoolArgs.Builder =
      def argsBuilder = com.pulumi.azure.batch.inputs.PoolMountArgs.builder
      builder.mounts(args.map(_(argsBuilder).build)*)

    /**
     * @param networkConfiguration A `networkConfiguration` block that describes the network configurations for the Batch pool as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def networkConfiguration(args: Endofunction[com.pulumi.azure.batch.inputs.PoolNetworkConfigurationArgs.Builder]):
        com.pulumi.azure.batch.PoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.batch.inputs.PoolNetworkConfigurationArgs.builder
      builder.networkConfiguration(args(argsBuilder).build)

    /**
     * @param nodePlacements A `nodePlacement` block that describes the placement policy for allocating nodes in the pool as defined below.
     * @return builder
     */
    inline def nodePlacements(args: Endofunction[com.pulumi.azure.batch.inputs.PoolNodePlacementArgs.Builder]*):
        com.pulumi.azure.batch.PoolArgs.Builder =
      def argsBuilder = com.pulumi.azure.batch.inputs.PoolNodePlacementArgs.builder
      builder.nodePlacements(args.map(_(argsBuilder).build)*)

    /**
     * @param securityProfile A `securityProfile` block that describes the security settings for the Batch pool as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def securityProfile(args: Endofunction[com.pulumi.azure.batch.inputs.PoolSecurityProfileArgs.Builder]):
        com.pulumi.azure.batch.PoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.batch.inputs.PoolSecurityProfileArgs.builder
      builder.securityProfile(args(argsBuilder).build)

    /**
     * @param startTask A `startTask` block that describes the start task settings for the Batch pool as defined below.
     * @return builder
     */
    inline def startTask(args: Endofunction[com.pulumi.azure.batch.inputs.PoolStartTaskArgs.Builder]):
        com.pulumi.azure.batch.PoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.batch.inputs.PoolStartTaskArgs.builder
      builder.startTask(args(argsBuilder).build)

    /**
     * @param storageImageReference A `storageImageReference` block for the virtual machines that will compose the Batch pool as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def storageImageReference(args: Endofunction[com.pulumi.azure.batch.inputs.PoolStorageImageReferenceArgs.Builder]):
        com.pulumi.azure.batch.PoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.batch.inputs.PoolStorageImageReferenceArgs.builder
      builder.storageImageReference(args(argsBuilder).build)

    /**
     * @param taskSchedulingPolicies A `taskSchedulingPolicy` block that describes how tasks are distributed across compute nodes in a pool as defined below. If not specified, the default is spread as defined below.
     * @return builder
     */
    inline def taskSchedulingPolicies(args: Endofunction[com.pulumi.azure.batch.inputs.PoolTaskSchedulingPolicyArgs.Builder]*):
        com.pulumi.azure.batch.PoolArgs.Builder =
      def argsBuilder = com.pulumi.azure.batch.inputs.PoolTaskSchedulingPolicyArgs.builder
      builder.taskSchedulingPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param userAccounts A `userAccounts` block that describes the list of user accounts to be created on each node in the pool as defined below.
     * @return builder
     */
    inline def userAccounts(args: Endofunction[com.pulumi.azure.batch.inputs.PoolUserAccountArgs.Builder]*):
        com.pulumi.azure.batch.PoolArgs.Builder =
      def argsBuilder = com.pulumi.azure.batch.inputs.PoolUserAccountArgs.builder
      builder.userAccounts(args.map(_(argsBuilder).build)*)

    /**
     * @param windows A `windows` block that describes the Windows configuration in the pool as defined below.
     * @return builder
     */
    inline def windows(args: Endofunction[com.pulumi.azure.batch.inputs.PoolWindowArgs.Builder]*):
        com.pulumi.azure.batch.PoolArgs.Builder =
      def argsBuilder = com.pulumi.azure.batch.inputs.PoolWindowArgs.builder
      builder.windows(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.batch.inputs.AccountNetworkProfileAccountAccessArgs.Builder)
    /**
     * @param ipRules One or more `ipRule` blocks as defined below.
     * @return builder
     */
    inline def ipRules(args: Endofunction[com.pulumi.azure.batch.inputs.AccountNetworkProfileAccountAccessIpRuleArgs.Builder]*):
        com.pulumi.azure.batch.inputs.AccountNetworkProfileAccountAccessArgs.Builder =
      def argsBuilder = com.pulumi.azure.batch.inputs.AccountNetworkProfileAccountAccessIpRuleArgs.builder
      builder.ipRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.batch.inputs.AccountNetworkProfileArgs.Builder)
    /**
     * @param accountAccess An `accountAccess` block as defined below.
     * @return builder
     */
    inline def accountAccess(args: Endofunction[com.pulumi.azure.batch.inputs.AccountNetworkProfileAccountAccessArgs.Builder]):
        com.pulumi.azure.batch.inputs.AccountNetworkProfileArgs.Builder =
      val argsBuilder = com.pulumi.azure.batch.inputs.AccountNetworkProfileAccountAccessArgs.builder
      builder.accountAccess(args(argsBuilder).build)

    /**
     * @param nodeManagementAccess A `nodeManagementAccess` block as defined below.
     * 
     * &gt; **NOTE:** At least one of `accountAccess` or `nodeManagementAccess` must be specified.
     * @return builder
     */
    inline def nodeManagementAccess(args: Endofunction[com.pulumi.azure.batch.inputs.AccountNetworkProfileNodeManagementAccessArgs.Builder]):
        com.pulumi.azure.batch.inputs.AccountNetworkProfileArgs.Builder =
      val argsBuilder = com.pulumi.azure.batch.inputs.AccountNetworkProfileNodeManagementAccessArgs.builder
      builder.nodeManagementAccess(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.batch.inputs.AccountNetworkProfileNodeManagementAccessArgs.Builder)
    /**
     * @param ipRules One or more `ipRule` blocks as defined below.
     * @return builder
     */
    inline def ipRules(args: Endofunction[com.pulumi.azure.batch.inputs.AccountNetworkProfileNodeManagementAccessIpRuleArgs.Builder]*):
        com.pulumi.azure.batch.inputs.AccountNetworkProfileNodeManagementAccessArgs.Builder =
      def argsBuilder = com.pulumi.azure.batch.inputs.AccountNetworkProfileNodeManagementAccessIpRuleArgs.builder
      builder.ipRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.batch.inputs.AccountState.Builder)
    /**
     * @param encryption Specifies if customer managed key encryption should be used to encrypt batch account data. One `encryption` block as defined below.
     * @return builder
     */
    inline def encryption(args: Endofunction[com.pulumi.azure.batch.inputs.AccountEncryptionArgs.Builder]):
        com.pulumi.azure.batch.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.batch.inputs.AccountEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.batch.inputs.AccountIdentityArgs.Builder]):
        com.pulumi.azure.batch.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.batch.inputs.AccountIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param keyVaultReference A `keyVaultReference` block, as defined below, that describes the Azure KeyVault reference to use when deploying the Azure Batch account using the `UserSubscription` pool allocation mode.
     * @return builder
     */
    inline def keyVaultReference(args: Endofunction[com.pulumi.azure.batch.inputs.AccountKeyVaultReferenceArgs.Builder]):
        com.pulumi.azure.batch.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.batch.inputs.AccountKeyVaultReferenceArgs.builder
      builder.keyVaultReference(args(argsBuilder).build)

    /**
     * @param networkProfile A `networkProfile` block as defined below.
     * @return builder
     */
    inline def networkProfile(args: Endofunction[com.pulumi.azure.batch.inputs.AccountNetworkProfileArgs.Builder]):
        com.pulumi.azure.batch.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.batch.inputs.AccountNetworkProfileArgs.builder
      builder.networkProfile(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.batch.inputs.PoolContainerConfigurationArgs.Builder)
    /**
     * @param containerRegistries One or more `containerRegistries` blocks as defined below. Additional container registries from which container images can be pulled by the pool&#39;s VMs. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def containerRegistries(args: Endofunction[com.pulumi.azure.batch.inputs.PoolContainerConfigurationContainerRegistryArgs.Builder]*):
        com.pulumi.azure.batch.inputs.PoolContainerConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.batch.inputs.PoolContainerConfigurationContainerRegistryArgs.builder
      builder.containerRegistries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.batch.inputs.PoolMountArgs.Builder)
    /**
     * @param azureBlobFileSystem A `azureBlobFileSystem` block defined as below.
     * @return builder
     */
    inline def azureBlobFileSystem(args: Endofunction[com.pulumi.azure.batch.inputs.PoolMountAzureBlobFileSystemArgs.Builder]):
        com.pulumi.azure.batch.inputs.PoolMountArgs.Builder =
      val argsBuilder = com.pulumi.azure.batch.inputs.PoolMountAzureBlobFileSystemArgs.builder
      builder.azureBlobFileSystem(args(argsBuilder).build)

    /**
     * @param azureFileShares A `azureFileShare` block defined as below.
     * @return builder
     */
    inline def azureFileShares(args: Endofunction[com.pulumi.azure.batch.inputs.PoolMountAzureFileShareArgs.Builder]*):
        com.pulumi.azure.batch.inputs.PoolMountArgs.Builder =
      def argsBuilder = com.pulumi.azure.batch.inputs.PoolMountAzureFileShareArgs.builder
      builder.azureFileShares(args.map(_(argsBuilder).build)*)

    /**
     * @param cifsMounts A `cifsMount` block defined as below.
     * @return builder
     */
    inline def cifsMounts(args: Endofunction[com.pulumi.azure.batch.inputs.PoolMountCifsMountArgs.Builder]*):
        com.pulumi.azure.batch.inputs.PoolMountArgs.Builder =
      def argsBuilder = com.pulumi.azure.batch.inputs.PoolMountCifsMountArgs.builder
      builder.cifsMounts(args.map(_(argsBuilder).build)*)

    /**
     * @param nfsMounts A `nfsMount` block defined as below.
     * @return builder
     */
    inline def nfsMounts(args: Endofunction[com.pulumi.azure.batch.inputs.PoolMountNfsMountArgs.Builder]*):
        com.pulumi.azure.batch.inputs.PoolMountArgs.Builder =
      def argsBuilder = com.pulumi.azure.batch.inputs.PoolMountNfsMountArgs.builder
      builder.nfsMounts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.batch.inputs.PoolNetworkConfigurationArgs.Builder)
    /**
     * @param endpointConfigurations A list of `endpointConfiguration` blocks that can be used to address specific ports on an individual compute node externally as defined below. Set as documented in the inboundNatPools block below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def endpointConfigurations(args: Endofunction[com.pulumi.azure.batch.inputs.PoolNetworkConfigurationEndpointConfigurationArgs.Builder]*):
        com.pulumi.azure.batch.inputs.PoolNetworkConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.batch.inputs.PoolNetworkConfigurationEndpointConfigurationArgs.builder
      builder.endpointConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.batch.inputs.PoolNetworkConfigurationEndpointConfigurationArgs.Builder)
    /**
     * @param networkSecurityGroupRules A list of `networkSecurityGroupRules` blocks as defined below that will be applied to the endpoint. The maximum number of rules that can be specified across all the endpoints on a Batch pool is `25`. If no network security group rules are specified, a default rule will be created to allow inbound access to the specified backendPort. Set as documented in the networkSecurityGroupRules block below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def networkSecurityGroupRules(args: Endofunction[com.pulumi.azure.batch.inputs.PoolNetworkConfigurationEndpointConfigurationNetworkSecurityGroupRuleArgs.Builder]*):
        com.pulumi.azure.batch.inputs.PoolNetworkConfigurationEndpointConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.batch.inputs.PoolNetworkConfigurationEndpointConfigurationNetworkSecurityGroupRuleArgs.builder
      builder.networkSecurityGroupRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.batch.inputs.PoolStartTaskArgs.Builder)
    /**
     * @param containers A `container` block is the settings for the container under which the start task runs as defined below. When this is specified, all directories recursively below the `AZ_BATCH_NODE_ROOT_DIR` (the root of Azure Batch directories on the node) are mapped into the container, all task environment variables are mapped into the container, and the task command line is executed in the container.
     * @return builder
     */
    inline def containers(args: Endofunction[com.pulumi.azure.batch.inputs.PoolStartTaskContainerArgs.Builder]*):
        com.pulumi.azure.batch.inputs.PoolStartTaskArgs.Builder =
      def argsBuilder = com.pulumi.azure.batch.inputs.PoolStartTaskContainerArgs.builder
      builder.containers(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceFiles One or more `resourceFile` blocks that describe the files to be downloaded to a compute node as defined below.
     * @return builder
     */
    inline def resourceFiles(args: Endofunction[com.pulumi.azure.batch.inputs.PoolStartTaskResourceFileArgs.Builder]*):
        com.pulumi.azure.batch.inputs.PoolStartTaskArgs.Builder =
      def argsBuilder = com.pulumi.azure.batch.inputs.PoolStartTaskResourceFileArgs.builder
      builder.resourceFiles(args.map(_(argsBuilder).build)*)

    /**
     * @param userIdentity A `userIdentity` block that describes the user identity under which the start task runs as defined below.
     * @return builder
     */
    inline def userIdentity(args: Endofunction[com.pulumi.azure.batch.inputs.PoolStartTaskUserIdentityArgs.Builder]):
        com.pulumi.azure.batch.inputs.PoolStartTaskArgs.Builder =
      val argsBuilder = com.pulumi.azure.batch.inputs.PoolStartTaskUserIdentityArgs.builder
      builder.userIdentity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.batch.inputs.PoolStartTaskContainerArgs.Builder)
    /**
     * @param registries The `containerRegistries` block defined as below.
     * @return builder
     */
    inline def registries(args: Endofunction[com.pulumi.azure.batch.inputs.PoolStartTaskContainerRegistryArgs.Builder]*):
        com.pulumi.azure.batch.inputs.PoolStartTaskContainerArgs.Builder =
      def argsBuilder = com.pulumi.azure.batch.inputs.PoolStartTaskContainerRegistryArgs.builder
      builder.registries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.batch.inputs.PoolStartTaskUserIdentityArgs.Builder)
    /**
     * @param autoUser A `autoUser` block that describes the user identity under which the start task runs as defined below.
     * 
     * &gt; **Note:** `userName` and `autoUser` blocks cannot be used both at the same time, but you need to define one or the other.
     * @return builder
     */
    inline def autoUser(args: Endofunction[com.pulumi.azure.batch.inputs.PoolStartTaskUserIdentityAutoUserArgs.Builder]):
        com.pulumi.azure.batch.inputs.PoolStartTaskUserIdentityArgs.Builder =
      val argsBuilder = com.pulumi.azure.batch.inputs.PoolStartTaskUserIdentityAutoUserArgs.builder
      builder.autoUser(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.batch.inputs.PoolState.Builder)
    /**
     * @param autoScale A `autoScale` block that describes the scale settings when using auto scale as defined below.
     * 
     * &gt; **Note:** `fixedScale` and `autoScale` blocks cannot be used both at the same time.
     * @return builder
     */
    inline def autoScale(args: Endofunction[com.pulumi.azure.batch.inputs.PoolAutoScaleArgs.Builder]):
        com.pulumi.azure.batch.inputs.PoolState.Builder =
      val argsBuilder = com.pulumi.azure.batch.inputs.PoolAutoScaleArgs.builder
      builder.autoScale(args(argsBuilder).build)

    /**
     * @return builder
     * @deprecated the `certificate` property has been deprecated and will be removed in v5.0 of the AzureRM provider.
     */
    @deprecated("the `certificate` property has been deprecated and will be removed in v5.0 of the AzureRM provider.") inline def certificates(args: Endofunction[com.pulumi.azure.batch.inputs.PoolCertificateArgs.Builder]*):
        com.pulumi.azure.batch.inputs.PoolState.Builder =
      def argsBuilder = com.pulumi.azure.batch.inputs.PoolCertificateArgs.builder
      builder.certificates(args.map(_(argsBuilder).build)*)

    /**
     * @param containerConfiguration The container configuration used in the pool&#39;s VMs. One `containerConfiguration` block as defined below.
     * @return builder
     */
    inline def containerConfiguration(args: Endofunction[com.pulumi.azure.batch.inputs.PoolContainerConfigurationArgs.Builder]):
        com.pulumi.azure.batch.inputs.PoolState.Builder =
      val argsBuilder = com.pulumi.azure.batch.inputs.PoolContainerConfigurationArgs.builder
      builder.containerConfiguration(args(argsBuilder).build)

    /**
     * @param dataDisks A `dataDisks` block describes the data disk settings as defined below.
     * @return builder
     */
    inline def dataDisks(args: Endofunction[com.pulumi.azure.batch.inputs.PoolDataDiskArgs.Builder]*):
        com.pulumi.azure.batch.inputs.PoolState.Builder =
      def argsBuilder = com.pulumi.azure.batch.inputs.PoolDataDiskArgs.builder
      builder.dataDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param diskEncryptions A `diskEncryption` block, as defined below, describes the disk encryption configuration applied on compute nodes in the pool. Disk encryption configuration is not supported on Linux pool created with Virtual Machine Image or Shared Image Gallery Image.
     * @return builder
     */
    inline def diskEncryptions(args: Endofunction[com.pulumi.azure.batch.inputs.PoolDiskEncryptionArgs.Builder]*):
        com.pulumi.azure.batch.inputs.PoolState.Builder =
      def argsBuilder = com.pulumi.azure.batch.inputs.PoolDiskEncryptionArgs.builder
      builder.diskEncryptions(args.map(_(argsBuilder).build)*)

    /**
     * @param extensions An `extensions` block as defined below.
     * @return builder
     */
    inline def extensions(args: Endofunction[com.pulumi.azure.batch.inputs.PoolExtensionArgs.Builder]*):
        com.pulumi.azure.batch.inputs.PoolState.Builder =
      def argsBuilder = com.pulumi.azure.batch.inputs.PoolExtensionArgs.builder
      builder.extensions(args.map(_(argsBuilder).build)*)

    /**
     * @param fixedScale A `fixedScale` block that describes the scale settings when using fixed scale as defined below.
     * @return builder
     */
    inline def fixedScale(args: Endofunction[com.pulumi.azure.batch.inputs.PoolFixedScaleArgs.Builder]):
        com.pulumi.azure.batch.inputs.PoolState.Builder =
      val argsBuilder = com.pulumi.azure.batch.inputs.PoolFixedScaleArgs.builder
      builder.fixedScale(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.batch.inputs.PoolIdentityArgs.Builder]):
        com.pulumi.azure.batch.inputs.PoolState.Builder =
      val argsBuilder = com.pulumi.azure.batch.inputs.PoolIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param mounts A `mount` block defined as below.
     * @return builder
     */
    inline def mounts(args: Endofunction[com.pulumi.azure.batch.inputs.PoolMountArgs.Builder]*):
        com.pulumi.azure.batch.inputs.PoolState.Builder =
      def argsBuilder = com.pulumi.azure.batch.inputs.PoolMountArgs.builder
      builder.mounts(args.map(_(argsBuilder).build)*)

    /**
     * @param networkConfiguration A `networkConfiguration` block that describes the network configurations for the Batch pool as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def networkConfiguration(args: Endofunction[com.pulumi.azure.batch.inputs.PoolNetworkConfigurationArgs.Builder]):
        com.pulumi.azure.batch.inputs.PoolState.Builder =
      val argsBuilder = com.pulumi.azure.batch.inputs.PoolNetworkConfigurationArgs.builder
      builder.networkConfiguration(args(argsBuilder).build)

    /**
     * @param nodePlacements A `nodePlacement` block that describes the placement policy for allocating nodes in the pool as defined below.
     * @return builder
     */
    inline def nodePlacements(args: Endofunction[com.pulumi.azure.batch.inputs.PoolNodePlacementArgs.Builder]*):
        com.pulumi.azure.batch.inputs.PoolState.Builder =
      def argsBuilder = com.pulumi.azure.batch.inputs.PoolNodePlacementArgs.builder
      builder.nodePlacements(args.map(_(argsBuilder).build)*)

    /**
     * @param securityProfile A `securityProfile` block that describes the security settings for the Batch pool as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def securityProfile(args: Endofunction[com.pulumi.azure.batch.inputs.PoolSecurityProfileArgs.Builder]):
        com.pulumi.azure.batch.inputs.PoolState.Builder =
      val argsBuilder = com.pulumi.azure.batch.inputs.PoolSecurityProfileArgs.builder
      builder.securityProfile(args(argsBuilder).build)

    /**
     * @param startTask A `startTask` block that describes the start task settings for the Batch pool as defined below.
     * @return builder
     */
    inline def startTask(args: Endofunction[com.pulumi.azure.batch.inputs.PoolStartTaskArgs.Builder]):
        com.pulumi.azure.batch.inputs.PoolState.Builder =
      val argsBuilder = com.pulumi.azure.batch.inputs.PoolStartTaskArgs.builder
      builder.startTask(args(argsBuilder).build)

    /**
     * @param storageImageReference A `storageImageReference` block for the virtual machines that will compose the Batch pool as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def storageImageReference(args: Endofunction[com.pulumi.azure.batch.inputs.PoolStorageImageReferenceArgs.Builder]):
        com.pulumi.azure.batch.inputs.PoolState.Builder =
      val argsBuilder = com.pulumi.azure.batch.inputs.PoolStorageImageReferenceArgs.builder
      builder.storageImageReference(args(argsBuilder).build)

    /**
     * @param taskSchedulingPolicies A `taskSchedulingPolicy` block that describes how tasks are distributed across compute nodes in a pool as defined below. If not specified, the default is spread as defined below.
     * @return builder
     */
    inline def taskSchedulingPolicies(args: Endofunction[com.pulumi.azure.batch.inputs.PoolTaskSchedulingPolicyArgs.Builder]*):
        com.pulumi.azure.batch.inputs.PoolState.Builder =
      def argsBuilder = com.pulumi.azure.batch.inputs.PoolTaskSchedulingPolicyArgs.builder
      builder.taskSchedulingPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param userAccounts A `userAccounts` block that describes the list of user accounts to be created on each node in the pool as defined below.
     * @return builder
     */
    inline def userAccounts(args: Endofunction[com.pulumi.azure.batch.inputs.PoolUserAccountArgs.Builder]*):
        com.pulumi.azure.batch.inputs.PoolState.Builder =
      def argsBuilder = com.pulumi.azure.batch.inputs.PoolUserAccountArgs.builder
      builder.userAccounts(args.map(_(argsBuilder).build)*)

    /**
     * @param windows A `windows` block that describes the Windows configuration in the pool as defined below.
     * @return builder
     */
    inline def windows(args: Endofunction[com.pulumi.azure.batch.inputs.PoolWindowArgs.Builder]*):
        com.pulumi.azure.batch.inputs.PoolState.Builder =
      def argsBuilder = com.pulumi.azure.batch.inputs.PoolWindowArgs.builder
      builder.windows(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.batch.inputs.PoolUserAccountArgs.Builder)
    /**
     * @param linuxUserConfigurations The `linuxUserConfiguration` block defined below is a linux-specific user configuration for the user account. This property is ignored if specified on a Windows pool. If not specified, the user is created with the default options.
     * @return builder
     */
    inline def linuxUserConfigurations(args: Endofunction[com.pulumi.azure.batch.inputs.PoolUserAccountLinuxUserConfigurationArgs.Builder]*):
        com.pulumi.azure.batch.inputs.PoolUserAccountArgs.Builder =
      def argsBuilder = com.pulumi.azure.batch.inputs.PoolUserAccountLinuxUserConfigurationArgs.builder
      builder.linuxUserConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param windowsUserConfigurations The `windowsUserConfiguration` block defined below is a windows-specific user configuration for the user account. This property can only be specified if the user is on a Windows pool. If not specified and on a Windows pool, the user is created with the default options.
     * @return builder
     */
    inline def windowsUserConfigurations(args: Endofunction[com.pulumi.azure.batch.inputs.PoolUserAccountWindowsUserConfigurationArgs.Builder]*):
        com.pulumi.azure.batch.inputs.PoolUserAccountArgs.Builder =
      def argsBuilder = com.pulumi.azure.batch.inputs.PoolUserAccountWindowsUserConfigurationArgs.builder
      builder.windowsUserConfigurations(args.map(_(argsBuilder).build)*)
