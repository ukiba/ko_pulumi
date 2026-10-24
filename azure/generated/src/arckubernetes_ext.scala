package jp.ukiba.ko_pulumi
package azure

object arckubernetes_ext:
  extension (builder: com.pulumi.azure.arckubernetes.ClusterArgs.Builder)
    /**
     * @param identity An `identity` block as defined below. Changing this forces a new Arc Kubernetes Cluster to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.arckubernetes.inputs.ClusterIdentityArgs.Builder]):
        com.pulumi.azure.arckubernetes.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.arckubernetes.inputs.ClusterIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.arckubernetes.ClusterExtensionArgs.Builder)
    /**
     * @param identity An `identity` block as defined below. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.arckubernetes.inputs.ClusterExtensionIdentityArgs.Builder]):
        com.pulumi.azure.arckubernetes.ClusterExtensionArgs.Builder =
      val argsBuilder = com.pulumi.azure.arckubernetes.inputs.ClusterExtensionIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.arckubernetes.FluxConfigurationArgs.Builder)
    /**
     * @param blobStorage An `blobStorage` block as defined below.
     * @return builder
     */
    def blobStorage(args: Endofunction[com.pulumi.azure.arckubernetes.inputs.FluxConfigurationBlobStorageArgs.Builder]):
        com.pulumi.azure.arckubernetes.FluxConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.arckubernetes.inputs.FluxConfigurationBlobStorageArgs.builder
      builder.blobStorage(args(argsBuilder).build)

    /**
     * @param bucket A `bucket` block as defined below.
     * @return builder
     */
    def bucket(args: Endofunction[com.pulumi.azure.arckubernetes.inputs.FluxConfigurationBucketArgs.Builder]):
        com.pulumi.azure.arckubernetes.FluxConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.arckubernetes.inputs.FluxConfigurationBucketArgs.builder
      builder.bucket(args(argsBuilder).build)

    /**
     * @param gitRepository A `gitRepository` block as defined below.
     * @return builder
     */
    def gitRepository(args: Endofunction[com.pulumi.azure.arckubernetes.inputs.FluxConfigurationGitRepositoryArgs.Builder]):
        com.pulumi.azure.arckubernetes.FluxConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.arckubernetes.inputs.FluxConfigurationGitRepositoryArgs.builder
      builder.gitRepository(args(argsBuilder).build)

    /**
     * @param kustomizations A `kustomizations` block as defined below.
     * @return builder
     */
    def kustomizations(args: Endofunction[com.pulumi.azure.arckubernetes.inputs.FluxConfigurationKustomizationArgs.Builder]*):
        com.pulumi.azure.arckubernetes.FluxConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.azure.arckubernetes.inputs.FluxConfigurationKustomizationArgs.builder
      builder.kustomizations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.arckubernetes.ProvisionedClusterArgs.Builder)
    /**
     * @param azureActiveDirectory An `azureActiveDirectory` block as defined below.
     * @return builder
     */
    def azureActiveDirectory(args: Endofunction[com.pulumi.azure.arckubernetes.inputs.ProvisionedClusterAzureActiveDirectoryArgs.Builder]):
        com.pulumi.azure.arckubernetes.ProvisionedClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.arckubernetes.inputs.ProvisionedClusterAzureActiveDirectoryArgs.builder
      builder.azureActiveDirectory(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below. Changing this forces a new Arc Kubernetes Provisioned Cluster to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.arckubernetes.inputs.ProvisionedClusterIdentityArgs.Builder]):
        com.pulumi.azure.arckubernetes.ProvisionedClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.arckubernetes.inputs.ProvisionedClusterIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.arckubernetes.inputs.ClusterExtensionState.Builder)
    /**
     * @param identity An `identity` block as defined below. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.arckubernetes.inputs.ClusterExtensionIdentityArgs.Builder]):
        com.pulumi.azure.arckubernetes.inputs.ClusterExtensionState.Builder =
      val argsBuilder = com.pulumi.azure.arckubernetes.inputs.ClusterExtensionIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.arckubernetes.inputs.ClusterState.Builder)
    /**
     * @param identity An `identity` block as defined below. Changing this forces a new Arc Kubernetes Cluster to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.arckubernetes.inputs.ClusterIdentityArgs.Builder]):
        com.pulumi.azure.arckubernetes.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.azure.arckubernetes.inputs.ClusterIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.arckubernetes.inputs.FluxConfigurationBlobStorageArgs.Builder)
    /**
     * @param servicePrincipal A `servicePrincipal` block as defined below.
     * @return builder
     */
    def servicePrincipal(args: Endofunction[com.pulumi.azure.arckubernetes.inputs.FluxConfigurationBlobStorageServicePrincipalArgs.Builder]):
        com.pulumi.azure.arckubernetes.inputs.FluxConfigurationBlobStorageArgs.Builder =
      val argsBuilder = com.pulumi.azure.arckubernetes.inputs.FluxConfigurationBlobStorageServicePrincipalArgs.builder
      builder.servicePrincipal(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.arckubernetes.inputs.FluxConfigurationState.Builder)
    /**
     * @param blobStorage An `blobStorage` block as defined below.
     * @return builder
     */
    def blobStorage(args: Endofunction[com.pulumi.azure.arckubernetes.inputs.FluxConfigurationBlobStorageArgs.Builder]):
        com.pulumi.azure.arckubernetes.inputs.FluxConfigurationState.Builder =
      val argsBuilder = com.pulumi.azure.arckubernetes.inputs.FluxConfigurationBlobStorageArgs.builder
      builder.blobStorage(args(argsBuilder).build)

    /**
     * @param bucket A `bucket` block as defined below.
     * @return builder
     */
    def bucket(args: Endofunction[com.pulumi.azure.arckubernetes.inputs.FluxConfigurationBucketArgs.Builder]):
        com.pulumi.azure.arckubernetes.inputs.FluxConfigurationState.Builder =
      val argsBuilder = com.pulumi.azure.arckubernetes.inputs.FluxConfigurationBucketArgs.builder
      builder.bucket(args(argsBuilder).build)

    /**
     * @param gitRepository A `gitRepository` block as defined below.
     * @return builder
     */
    def gitRepository(args: Endofunction[com.pulumi.azure.arckubernetes.inputs.FluxConfigurationGitRepositoryArgs.Builder]):
        com.pulumi.azure.arckubernetes.inputs.FluxConfigurationState.Builder =
      val argsBuilder = com.pulumi.azure.arckubernetes.inputs.FluxConfigurationGitRepositoryArgs.builder
      builder.gitRepository(args(argsBuilder).build)

    /**
     * @param kustomizations A `kustomizations` block as defined below.
     * @return builder
     */
    def kustomizations(args: Endofunction[com.pulumi.azure.arckubernetes.inputs.FluxConfigurationKustomizationArgs.Builder]*):
        com.pulumi.azure.arckubernetes.inputs.FluxConfigurationState.Builder =
      def argsBuilder = com.pulumi.azure.arckubernetes.inputs.FluxConfigurationKustomizationArgs.builder
      builder.kustomizations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.arckubernetes.inputs.ProvisionedClusterState.Builder)
    /**
     * @param azureActiveDirectory An `azureActiveDirectory` block as defined below.
     * @return builder
     */
    def azureActiveDirectory(args: Endofunction[com.pulumi.azure.arckubernetes.inputs.ProvisionedClusterAzureActiveDirectoryArgs.Builder]):
        com.pulumi.azure.arckubernetes.inputs.ProvisionedClusterState.Builder =
      val argsBuilder = com.pulumi.azure.arckubernetes.inputs.ProvisionedClusterAzureActiveDirectoryArgs.builder
      builder.azureActiveDirectory(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below. Changing this forces a new Arc Kubernetes Provisioned Cluster to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.arckubernetes.inputs.ProvisionedClusterIdentityArgs.Builder]):
        com.pulumi.azure.arckubernetes.inputs.ProvisionedClusterState.Builder =
      val argsBuilder = com.pulumi.azure.arckubernetes.inputs.ProvisionedClusterIdentityArgs.builder
      builder.identity(args(argsBuilder).build)
