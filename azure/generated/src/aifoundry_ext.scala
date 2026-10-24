package jp.ukiba.ko_pulumi
package azure

object aifoundry_ext:
  extension (builder: com.pulumi.azure.aifoundry.HubArgs.Builder)
    /**
     * @param encryption An `encryption` block as defined below. Changing this forces a new AI Foundry Hub to be created.
     * @return builder
     */
    inline def encryption(args: Endofunction[com.pulumi.azure.aifoundry.inputs.HubEncryptionArgs.Builder]):
        com.pulumi.azure.aifoundry.HubArgs.Builder =
      val argsBuilder = com.pulumi.azure.aifoundry.inputs.HubEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

    /**
     * @param identity A `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.aifoundry.inputs.HubIdentityArgs.Builder]):
        com.pulumi.azure.aifoundry.HubArgs.Builder =
      val argsBuilder = com.pulumi.azure.aifoundry.inputs.HubIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param managedNetwork A `managedNetwork` block as defined below.
     * @return builder
     */
    inline def managedNetwork(args: Endofunction[com.pulumi.azure.aifoundry.inputs.HubManagedNetworkArgs.Builder]):
        com.pulumi.azure.aifoundry.HubArgs.Builder =
      val argsBuilder = com.pulumi.azure.aifoundry.inputs.HubManagedNetworkArgs.builder
      builder.managedNetwork(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.aifoundry.ProjectArgs.Builder)
    /**
     * @param identity A `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.aifoundry.inputs.ProjectIdentityArgs.Builder]):
        com.pulumi.azure.aifoundry.ProjectArgs.Builder =
      val argsBuilder = com.pulumi.azure.aifoundry.inputs.ProjectIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.aifoundry.inputs.HubState.Builder)
    /**
     * @param encryption An `encryption` block as defined below. Changing this forces a new AI Foundry Hub to be created.
     * @return builder
     */
    inline def encryption(args: Endofunction[com.pulumi.azure.aifoundry.inputs.HubEncryptionArgs.Builder]):
        com.pulumi.azure.aifoundry.inputs.HubState.Builder =
      val argsBuilder = com.pulumi.azure.aifoundry.inputs.HubEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

    /**
     * @param identity A `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.aifoundry.inputs.HubIdentityArgs.Builder]):
        com.pulumi.azure.aifoundry.inputs.HubState.Builder =
      val argsBuilder = com.pulumi.azure.aifoundry.inputs.HubIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param managedNetwork A `managedNetwork` block as defined below.
     * @return builder
     */
    inline def managedNetwork(args: Endofunction[com.pulumi.azure.aifoundry.inputs.HubManagedNetworkArgs.Builder]):
        com.pulumi.azure.aifoundry.inputs.HubState.Builder =
      val argsBuilder = com.pulumi.azure.aifoundry.inputs.HubManagedNetworkArgs.builder
      builder.managedNetwork(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.aifoundry.inputs.ProjectState.Builder)
    /**
     * @param identity A `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.aifoundry.inputs.ProjectIdentityArgs.Builder]):
        com.pulumi.azure.aifoundry.inputs.ProjectState.Builder =
      val argsBuilder = com.pulumi.azure.aifoundry.inputs.ProjectIdentityArgs.builder
      builder.identity(args(argsBuilder).build)
