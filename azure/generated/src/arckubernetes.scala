package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object arckubernetes:
  /** Manages an Arc Kubernetes Provisioned Cluster. */
  def ProvisionedCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.arckubernetes.ProvisionedClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.arckubernetes.ProvisionedClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.arckubernetes.ProvisionedCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

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

  extension (builder: com.pulumi.azure.arckubernetes.ClusterExtensionArgs.Builder)
    /**
     * @param identity An `identity` block as defined below. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.arckubernetes.inputs.ClusterExtensionIdentityArgs.Builder]):
        com.pulumi.azure.arckubernetes.ClusterExtensionArgs.Builder =
      val argsBuilder = com.pulumi.azure.arckubernetes.inputs.ClusterExtensionIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  /**
   * Manages an Arc Kubernetes Cluster.
   * 
   *  &gt; **Note:** Installing and configuring the Azure Arc Agent on your Kubernetes Cluster to establish connectivity is outside the scope of this document. For more details refer to [Deploy agents to your cluster](https://learn.microsoft.com/en-us/azure/azure-arc/kubernetes/conceptual-agent-overview#deploy-agents-to-your-cluster) and [Connect an existing Kubernetes Cluster](https://learn.microsoft.com/en-us/azure/azure-arc/kubernetes/quickstart-connect-cluster?tabs=azure-cli#connect-an-existing-kubernetes-cluster). If you encounter issues connecting your Kubernetes Cluster to Azure Arc, we&#39;d recommend opening a ticket with Microsoft Support.
   */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.arckubernetes.ClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.arckubernetes.ClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.arckubernetes.Cluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Arc Kubernetes Cluster Extension. */
  def ClusterExtension(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.arckubernetes.ClusterExtensionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.arckubernetes.ClusterExtensionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.arckubernetes.ClusterExtension(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.arckubernetes.ClusterArgs.Builder)
    /**
     * @param identity An `identity` block as defined below. Changing this forces a new Arc Kubernetes Cluster to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.arckubernetes.inputs.ClusterIdentityArgs.Builder]):
        com.pulumi.azure.arckubernetes.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.arckubernetes.inputs.ClusterIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.arckubernetes.ClusterArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

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

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.arckubernetes.ProvisionedClusterArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages an Arc Kubernetes Flux Configuration. */
  def FluxConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.arckubernetes.FluxConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.arckubernetes.FluxConfigurationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.arckubernetes.FluxConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.arckubernetes.inputs.ClusterState.Builder)
    /**
     * @param identity An `identity` block as defined below. Changing this forces a new Arc Kubernetes Cluster to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.arckubernetes.inputs.ClusterIdentityArgs.Builder]):
        com.pulumi.azure.arckubernetes.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.azure.arckubernetes.inputs.ClusterIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.arckubernetes.inputs.ClusterState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

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

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.arckubernetes.inputs.ProvisionedClusterState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

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

  extension (builder: com.pulumi.azure.arckubernetes.inputs.ClusterExtensionState.Builder)
    /**
     * @param identity An `identity` block as defined below. Changing this forces a new Arc Kubernetes Cluster Extension to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.arckubernetes.inputs.ClusterExtensionIdentityArgs.Builder]):
        com.pulumi.azure.arckubernetes.inputs.ClusterExtensionState.Builder =
      val argsBuilder = com.pulumi.azure.arckubernetes.inputs.ClusterExtensionIdentityArgs.builder
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
