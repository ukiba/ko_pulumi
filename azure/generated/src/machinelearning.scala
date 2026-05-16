package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object machinelearning:
  /** Manages a Machine Learning Blob Storage DataStore. */
  def DatastoreBlobstorage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.machinelearning.DatastoreBlobstorageArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.machinelearning.DatastoreBlobstorageArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.machinelearning.DatastoreBlobstorage(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Machine Learning Inference Cluster.
   * 
   *  &gt; **Note:** The Machine Learning Inference Cluster resource is used to attach an existing AKS cluster to the Machine Learning Workspace, it doesn&#39;t create the AKS cluster itself. Therefore it can only be created and deleted, not updated. Any change to the configuration will recreate the resource.
   */
  def InferenceCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.machinelearning.InferenceClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.machinelearning.InferenceClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.machinelearning.InferenceCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.machinelearning.SynapseSparkArgs.Builder)
    /**
     * @param identity An `identity` block as defined below. Changing this forces a new Machine Learning Synapse Spark to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.machinelearning.inputs.SynapseSparkIdentityArgs.Builder]):
        com.pulumi.azure.machinelearning.SynapseSparkArgs.Builder =
      val argsBuilder = com.pulumi.azure.machinelearning.inputs.SynapseSparkIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.machinelearning.SynapseSparkArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Machine Learning File Share DataStore. */
  def DatastoreFileshare(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.machinelearning.DatastoreFileshareArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.machinelearning.DatastoreFileshareArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.machinelearning.DatastoreFileshare(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages the linked service to link an Azure Machine learning workspace to an Azure Synapse workspace. */
  def SynapseSpark(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.machinelearning.SynapseSparkArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.machinelearning.SynapseSparkArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.machinelearning.SynapseSpark(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Machine Learning Data Lake Gen2 DataStore. */
  def DatastoreDatalakeGen2(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.machinelearning.DatastoreDatalakeGen2Args.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.machinelearning.DatastoreDatalakeGen2Args.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.machinelearning.DatastoreDatalakeGen2(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Machine Learning Compute Instance. */
  def ComputeInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.machinelearning.ComputeInstanceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.machinelearning.ComputeInstanceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.machinelearning.ComputeInstance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

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

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.machinelearning.WorkspaceArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  object MachinelearningFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Machine Learning Workspace. */
    inline def getWorkspace(args: Endofunction[com.pulumi.azure.machinelearning.inputs.GetWorkspaceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.machinelearning.outputs.GetWorkspaceResult] =
      val argsBuilder = com.pulumi.azure.machinelearning.inputs.GetWorkspaceArgs.builder
      com.pulumi.azure.machinelearning.MachinelearningFunctions.getWorkspace(args(argsBuilder).build)

    /** Use this data source to access information about an existing Machine Learning Workspace. */
    inline def getWorkspacePlain(args: Endofunction[com.pulumi.azure.machinelearning.inputs.GetWorkspacePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.machinelearning.outputs.GetWorkspaceResult] =
      val argsBuilder = com.pulumi.azure.machinelearning.inputs.GetWorkspacePlainArgs.builder
      com.pulumi.azure.machinelearning.MachinelearningFunctions.getWorkspacePlain(args(argsBuilder).build)

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

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.machinelearning.ComputeInstanceArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Machine Learning Compute Cluster. */
  def ComputeCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.machinelearning.ComputeClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.machinelearning.ComputeClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.machinelearning.ComputeCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

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

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.machinelearning.ComputeClusterArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

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

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.machinelearning.InferenceClusterArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages an Azure Machine Learning Workspace FQDN Network Outbound Rule. */
  def WorkspaceNetworkOutboundRuleFqdn(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.machinelearning.WorkspaceNetworkOutboundRuleFqdnArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.machinelearning.WorkspaceNetworkOutboundRuleFqdnArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.machinelearning.WorkspaceNetworkOutboundRuleFqdn(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Azure Machine Learning Workspace Network Outbound Rule Service Tag. */
  def WorkspaceNetworkOutboundRuleServiceTag(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.machinelearning.WorkspaceNetworkOutboundRuleServiceTagArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.machinelearning.WorkspaceNetworkOutboundRuleServiceTagArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.machinelearning.WorkspaceNetworkOutboundRuleServiceTag(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Azure Machine Learning Workspace
   * 
   *  &gt; **Note:** For examples on how to set up the Azure Machine Learning workspace, together with compute and integrated services, see Terraform Quickstart
   */
  def Workspace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.machinelearning.WorkspaceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.machinelearning.WorkspaceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.machinelearning.Workspace(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Azure Machine Learning Workspace Network Outbound Rule Private Endpoint. */
  def WorkspaceNetworkOutboundRulePrivateEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.machinelearning.WorkspaceNetworkOutboundRulePrivateEndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.machinelearning.WorkspaceNetworkOutboundRulePrivateEndpointArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.machinelearning.WorkspaceNetworkOutboundRulePrivateEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

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

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.machinelearning.inputs.WorkspaceState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

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

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.machinelearning.inputs.InferenceClusterState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

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

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.machinelearning.inputs.ComputeClusterState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.machinelearning.inputs.SynapseSparkState.Builder)
    /**
     * @param identity An `identity` block as defined below. Changing this forces a new Machine Learning Synapse Spark to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.machinelearning.inputs.SynapseSparkIdentityArgs.Builder]):
        com.pulumi.azure.machinelearning.inputs.SynapseSparkState.Builder =
      val argsBuilder = com.pulumi.azure.machinelearning.inputs.SynapseSparkIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.machinelearning.inputs.SynapseSparkState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

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

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.machinelearning.inputs.ComputeInstanceState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
