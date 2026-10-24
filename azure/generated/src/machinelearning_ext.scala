package jp.ukiba.ko_pulumi
package azure

object machinelearning_ext:
  extension (builder: com.pulumi.azure.machinelearning.ComputeClusterArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.machinelearning.inputs.ComputeClusterIdentityArgs.Builder]):
        com.pulumi.azure.machinelearning.ComputeClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.machinelearning.inputs.ComputeClusterIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param scaleSettings A `scaleSettings` block as defined below.
     * @return builder
     */
    def scaleSettings(args: Endofunction[com.pulumi.azure.machinelearning.inputs.ComputeClusterScaleSettingsArgs.Builder]):
        com.pulumi.azure.machinelearning.ComputeClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.machinelearning.inputs.ComputeClusterScaleSettingsArgs.builder
      builder.scaleSettings(args(argsBuilder).build)

    /**
     * @param ssh Credentials for an administrator user account that will be created on each compute node. A `ssh` block as defined below. Changing this forces a new Machine Learning Compute Cluster to be created.
     * @return builder
     */
    def ssh(args: Endofunction[com.pulumi.azure.machinelearning.inputs.ComputeClusterSshArgs.Builder]):
        com.pulumi.azure.machinelearning.ComputeClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.machinelearning.inputs.ComputeClusterSshArgs.builder
      builder.ssh(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.machinelearning.ComputeInstanceArgs.Builder)
    /**
     * @param assignToUser A `assignToUser` block as defined below. A user explicitly assigned to a personal compute instance. Changing this forces a new Machine Learning Compute Instance to be created.
     * @return builder
     */
    def assignToUser(args: Endofunction[com.pulumi.azure.machinelearning.inputs.ComputeInstanceAssignToUserArgs.Builder]):
        com.pulumi.azure.machinelearning.ComputeInstanceArgs.Builder =
      val argsBuilder = com.pulumi.azure.machinelearning.inputs.ComputeInstanceAssignToUserArgs.builder
      builder.assignToUser(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below. Changing this forces a new Machine Learning Compute Instance to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.machinelearning.inputs.ComputeInstanceIdentityArgs.Builder]):
        com.pulumi.azure.machinelearning.ComputeInstanceArgs.Builder =
      val argsBuilder = com.pulumi.azure.machinelearning.inputs.ComputeInstanceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param ssh A `ssh` block as defined below. Specifies policy and settings for SSH access. Changing this forces a new Machine Learning Compute Instance to be created.
     * @return builder
     */
    def ssh(args: Endofunction[com.pulumi.azure.machinelearning.inputs.ComputeInstanceSshArgs.Builder]):
        com.pulumi.azure.machinelearning.ComputeInstanceArgs.Builder =
      val argsBuilder = com.pulumi.azure.machinelearning.inputs.ComputeInstanceSshArgs.builder
      builder.ssh(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.machinelearning.InferenceClusterArgs.Builder)
    /**
     * @param identity An `identity` block as defined below. Changing this forces a new Machine Learning Inference Cluster to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.machinelearning.inputs.InferenceClusterIdentityArgs.Builder]):
        com.pulumi.azure.machinelearning.InferenceClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.machinelearning.inputs.InferenceClusterIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param ssl A `ssl` block as defined below. Changing this forces a new Machine Learning Inference Cluster to be created.
     * @return builder
     */
    def ssl(args: Endofunction[com.pulumi.azure.machinelearning.inputs.InferenceClusterSslArgs.Builder]):
        com.pulumi.azure.machinelearning.InferenceClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.machinelearning.inputs.InferenceClusterSslArgs.builder
      builder.ssl(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.machinelearning.SynapseSparkArgs.Builder)
    /**
     * @param identity An `identity` block as defined below. Changing this forces a new Machine Learning Synapse Spark to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.machinelearning.inputs.SynapseSparkIdentityArgs.Builder]):
        com.pulumi.azure.machinelearning.SynapseSparkArgs.Builder =
      val argsBuilder = com.pulumi.azure.machinelearning.inputs.SynapseSparkIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.machinelearning.WorkspaceArgs.Builder)
    /**
     * @param encryption An `encryption` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def encryption(args: Endofunction[com.pulumi.azure.machinelearning.inputs.WorkspaceEncryptionArgs.Builder]):
        com.pulumi.azure.machinelearning.WorkspaceArgs.Builder =
      val argsBuilder = com.pulumi.azure.machinelearning.inputs.WorkspaceEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

    /**
     * @param featureStore A `featureStore` block as defined below.
     * @return builder
     */
    def featureStore(args: Endofunction[com.pulumi.azure.machinelearning.inputs.WorkspaceFeatureStoreArgs.Builder]):
        com.pulumi.azure.machinelearning.WorkspaceArgs.Builder =
      val argsBuilder = com.pulumi.azure.machinelearning.inputs.WorkspaceFeatureStoreArgs.builder
      builder.featureStore(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.machinelearning.inputs.WorkspaceIdentityArgs.Builder]):
        com.pulumi.azure.machinelearning.WorkspaceArgs.Builder =
      val argsBuilder = com.pulumi.azure.machinelearning.inputs.WorkspaceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param managedNetwork A `managedNetwork` block as defined below.
     * @return builder
     */
    def managedNetwork(args: Endofunction[com.pulumi.azure.machinelearning.inputs.WorkspaceManagedNetworkArgs.Builder]):
        com.pulumi.azure.machinelearning.WorkspaceArgs.Builder =
      val argsBuilder = com.pulumi.azure.machinelearning.inputs.WorkspaceManagedNetworkArgs.builder
      builder.managedNetwork(args(argsBuilder).build)

    /**
     * @param serverlessCompute A `serverlessCompute` block as defined below.
     * @return builder
     */
    def serverlessCompute(args: Endofunction[com.pulumi.azure.machinelearning.inputs.WorkspaceServerlessComputeArgs.Builder]):
        com.pulumi.azure.machinelearning.WorkspaceArgs.Builder =
      val argsBuilder = com.pulumi.azure.machinelearning.inputs.WorkspaceServerlessComputeArgs.builder
      builder.serverlessCompute(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.machinelearning.inputs.ComputeClusterState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.machinelearning.inputs.ComputeClusterIdentityArgs.Builder]):
        com.pulumi.azure.machinelearning.inputs.ComputeClusterState.Builder =
      val argsBuilder = com.pulumi.azure.machinelearning.inputs.ComputeClusterIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param scaleSettings A `scaleSettings` block as defined below.
     * @return builder
     */
    def scaleSettings(args: Endofunction[com.pulumi.azure.machinelearning.inputs.ComputeClusterScaleSettingsArgs.Builder]):
        com.pulumi.azure.machinelearning.inputs.ComputeClusterState.Builder =
      val argsBuilder = com.pulumi.azure.machinelearning.inputs.ComputeClusterScaleSettingsArgs.builder
      builder.scaleSettings(args(argsBuilder).build)

    /**
     * @param ssh Credentials for an administrator user account that will be created on each compute node. A `ssh` block as defined below. Changing this forces a new Machine Learning Compute Cluster to be created.
     * @return builder
     */
    def ssh(args: Endofunction[com.pulumi.azure.machinelearning.inputs.ComputeClusterSshArgs.Builder]):
        com.pulumi.azure.machinelearning.inputs.ComputeClusterState.Builder =
      val argsBuilder = com.pulumi.azure.machinelearning.inputs.ComputeClusterSshArgs.builder
      builder.ssh(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.machinelearning.inputs.ComputeInstanceState.Builder)
    /**
     * @param assignToUser A `assignToUser` block as defined below. A user explicitly assigned to a personal compute instance. Changing this forces a new Machine Learning Compute Instance to be created.
     * @return builder
     */
    def assignToUser(args: Endofunction[com.pulumi.azure.machinelearning.inputs.ComputeInstanceAssignToUserArgs.Builder]):
        com.pulumi.azure.machinelearning.inputs.ComputeInstanceState.Builder =
      val argsBuilder = com.pulumi.azure.machinelearning.inputs.ComputeInstanceAssignToUserArgs.builder
      builder.assignToUser(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below. Changing this forces a new Machine Learning Compute Instance to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.machinelearning.inputs.ComputeInstanceIdentityArgs.Builder]):
        com.pulumi.azure.machinelearning.inputs.ComputeInstanceState.Builder =
      val argsBuilder = com.pulumi.azure.machinelearning.inputs.ComputeInstanceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param ssh A `ssh` block as defined below. Specifies policy and settings for SSH access. Changing this forces a new Machine Learning Compute Instance to be created.
     * @return builder
     */
    def ssh(args: Endofunction[com.pulumi.azure.machinelearning.inputs.ComputeInstanceSshArgs.Builder]):
        com.pulumi.azure.machinelearning.inputs.ComputeInstanceState.Builder =
      val argsBuilder = com.pulumi.azure.machinelearning.inputs.ComputeInstanceSshArgs.builder
      builder.ssh(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.machinelearning.inputs.InferenceClusterState.Builder)
    /**
     * @param identity An `identity` block as defined below. Changing this forces a new Machine Learning Inference Cluster to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.machinelearning.inputs.InferenceClusterIdentityArgs.Builder]):
        com.pulumi.azure.machinelearning.inputs.InferenceClusterState.Builder =
      val argsBuilder = com.pulumi.azure.machinelearning.inputs.InferenceClusterIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param ssl A `ssl` block as defined below. Changing this forces a new Machine Learning Inference Cluster to be created.
     * @return builder
     */
    def ssl(args: Endofunction[com.pulumi.azure.machinelearning.inputs.InferenceClusterSslArgs.Builder]):
        com.pulumi.azure.machinelearning.inputs.InferenceClusterState.Builder =
      val argsBuilder = com.pulumi.azure.machinelearning.inputs.InferenceClusterSslArgs.builder
      builder.ssl(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.machinelearning.inputs.SynapseSparkState.Builder)
    /**
     * @param identity An `identity` block as defined below. Changing this forces a new Machine Learning Synapse Spark to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.machinelearning.inputs.SynapseSparkIdentityArgs.Builder]):
        com.pulumi.azure.machinelearning.inputs.SynapseSparkState.Builder =
      val argsBuilder = com.pulumi.azure.machinelearning.inputs.SynapseSparkIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.machinelearning.inputs.WorkspaceState.Builder)
    /**
     * @param encryption An `encryption` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def encryption(args: Endofunction[com.pulumi.azure.machinelearning.inputs.WorkspaceEncryptionArgs.Builder]):
        com.pulumi.azure.machinelearning.inputs.WorkspaceState.Builder =
      val argsBuilder = com.pulumi.azure.machinelearning.inputs.WorkspaceEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

    /**
     * @param featureStore A `featureStore` block as defined below.
     * @return builder
     */
    def featureStore(args: Endofunction[com.pulumi.azure.machinelearning.inputs.WorkspaceFeatureStoreArgs.Builder]):
        com.pulumi.azure.machinelearning.inputs.WorkspaceState.Builder =
      val argsBuilder = com.pulumi.azure.machinelearning.inputs.WorkspaceFeatureStoreArgs.builder
      builder.featureStore(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.machinelearning.inputs.WorkspaceIdentityArgs.Builder]):
        com.pulumi.azure.machinelearning.inputs.WorkspaceState.Builder =
      val argsBuilder = com.pulumi.azure.machinelearning.inputs.WorkspaceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param managedNetwork A `managedNetwork` block as defined below.
     * @return builder
     */
    def managedNetwork(args: Endofunction[com.pulumi.azure.machinelearning.inputs.WorkspaceManagedNetworkArgs.Builder]):
        com.pulumi.azure.machinelearning.inputs.WorkspaceState.Builder =
      val argsBuilder = com.pulumi.azure.machinelearning.inputs.WorkspaceManagedNetworkArgs.builder
      builder.managedNetwork(args(argsBuilder).build)

    /**
     * @param serverlessCompute A `serverlessCompute` block as defined below.
     * @return builder
     */
    def serverlessCompute(args: Endofunction[com.pulumi.azure.machinelearning.inputs.WorkspaceServerlessComputeArgs.Builder]):
        com.pulumi.azure.machinelearning.inputs.WorkspaceState.Builder =
      val argsBuilder = com.pulumi.azure.machinelearning.inputs.WorkspaceServerlessComputeArgs.builder
      builder.serverlessCompute(args(argsBuilder).build)
