package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object eks:
  /** Manages an EKS Identity Provider Configuration. */
  def IdentityProviderConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.eks.IdentityProviderConfigArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.eks.IdentityProviderConfigArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.eks.IdentityProviderConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Access Entry Policy Association for an EKS Cluster. */
  def AccessPolicyAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.eks.AccessPolicyAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.eks.AccessPolicyAssociationArgs.builder
    
    com.pulumi.aws.eks.AccessPolicyAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an EKS Fargate Profile. */
  def FargateProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.eks.FargateProfileArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.eks.FargateProfileArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.eks.FargateProfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.eks.IdentityProviderConfigArgs.Builder)
    /**
     * @param oidc Nested attribute containing [OpenID Connect](https://openid.net/connect/) identity provider information for the cluster. Detailed below.
     * @return builder
     */
    def oidc(args: Endofunction[com.pulumi.aws.eks.inputs.IdentityProviderConfigOidcArgs.Builder]):
        com.pulumi.aws.eks.IdentityProviderConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.IdentityProviderConfigOidcArgs.builder
      builder.oidc(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.eks.AddonArgs.Builder)
    /**
     * @param podIdentityAssociations Configuration block with EKS Pod Identity association settings. See `podIdentityAssociation` below for details.
     * @return builder
     */
    def podIdentityAssociations(args: Endofunction[com.pulumi.aws.eks.inputs.AddonPodIdentityAssociationArgs.Builder]*):
        com.pulumi.aws.eks.AddonArgs.Builder =
      def argsBuilder = com.pulumi.aws.eks.inputs.AddonPodIdentityAssociationArgs.builder
      builder.podIdentityAssociations(args.map(_(argsBuilder).build)*)

  /** Manages an EKS Cluster. */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.eks.ClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.eks.ClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.eks.Cluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.eks.ClusterArgs.Builder)
    /**
     * @param accessConfig Configuration block for the access config associated with your cluster, see [Amazon EKS Access Entries](https://docs.aws.amazon.com/eks/latest/userguide/access-entries.html). Detailed below.
     * @return builder
     */
    def accessConfig(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterAccessConfigArgs.Builder]):
        com.pulumi.aws.eks.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterAccessConfigArgs.builder
      builder.accessConfig(args(argsBuilder).build)

    /**
     * @param computeConfig Configuration block with compute configuration for EKS Auto Mode. Detailed below.
     * @return builder
     */
    def computeConfig(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterComputeConfigArgs.Builder]):
        com.pulumi.aws.eks.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterComputeConfigArgs.builder
      builder.computeConfig(args(argsBuilder).build)

    /**
     * @param encryptionConfig Configuration block with encryption configuration for the cluster. Detailed below.
     * @return builder
     */
    def encryptionConfig(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterEncryptionConfigArgs.Builder]):
        com.pulumi.aws.eks.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterEncryptionConfigArgs.builder
      builder.encryptionConfig(args(argsBuilder).build)

    /**
     * @param kubernetesNetworkConfig Configuration block with kubernetes network configuration for the cluster. Detailed below. If removed, the provider will only perform drift detection if a configuration value is provided.
     * @return builder
     */
    def kubernetesNetworkConfig(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterKubernetesNetworkConfigArgs.Builder]):
        com.pulumi.aws.eks.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterKubernetesNetworkConfigArgs.builder
      builder.kubernetesNetworkConfig(args(argsBuilder).build)

    /**
     * @param outpostConfig Configuration block representing the configuration of your local Amazon EKS cluster on an AWS Outpost. This block isn&#39;t available for creating Amazon EKS clusters on the AWS cloud.
     * @return builder
     */
    def outpostConfig(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterOutpostConfigArgs.Builder]):
        com.pulumi.aws.eks.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterOutpostConfigArgs.builder
      builder.outpostConfig(args(argsBuilder).build)

    /**
     * @param remoteNetworkConfig Configuration block with remote network configuration for EKS Hybrid Nodes. Detailed below.
     * @return builder
     */
    def remoteNetworkConfig(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterRemoteNetworkConfigArgs.Builder]):
        com.pulumi.aws.eks.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterRemoteNetworkConfigArgs.builder
      builder.remoteNetworkConfig(args(argsBuilder).build)

    /**
     * @param storageConfig Configuration block with storage configuration for EKS Auto Mode. Detailed below.
     * @return builder
     */
    def storageConfig(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterStorageConfigArgs.Builder]):
        com.pulumi.aws.eks.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterStorageConfigArgs.builder
      builder.storageConfig(args(argsBuilder).build)

    /**
     * @param upgradePolicy Configuration block for the support policy to use for the cluster.  See upgradePolicy for details.
     * @return builder
     */
    def upgradePolicy(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterUpgradePolicyArgs.Builder]):
        com.pulumi.aws.eks.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterUpgradePolicyArgs.builder
      builder.upgradePolicy(args(argsBuilder).build)

    /**
     * @param vpcConfig Configuration block for the VPC associated with your cluster. Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For more information, see [Cluster VPC Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html) and [Cluster Security Group Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the Amazon EKS User Guide. Detailed below. Also contains attributes detailed in the Attributes section.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def vpcConfig(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterVpcConfigArgs.Builder]):
        com.pulumi.aws.eks.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

    /**
     * @param zonalShiftConfig Configuration block with zonal shift configuration for the cluster. Detailed below.
     * @return builder
     */
    def zonalShiftConfig(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterZonalShiftConfigArgs.Builder]):
        com.pulumi.aws.eks.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterZonalShiftConfigArgs.builder
      builder.zonalShiftConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.eks.AccessPolicyAssociationArgs.Builder)
    /**
     * @param accessScope The configuration block to determine the scope of the access. See `accessScope` Block below.
     * @return builder
     */
    def accessScope(args: Endofunction[com.pulumi.aws.eks.inputs.AccessPolicyAssociationAccessScopeArgs.Builder]):
        com.pulumi.aws.eks.AccessPolicyAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.AccessPolicyAssociationAccessScopeArgs.builder
      builder.accessScope(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.eks.NodeGroupArgs.Builder)
    /**
     * @param launchTemplate Configuration block with Launch Template settings. See `launchTemplate` below for details. Conflicts with `remoteAccess`.
     * @return builder
     */
    def launchTemplate(args: Endofunction[com.pulumi.aws.eks.inputs.NodeGroupLaunchTemplateArgs.Builder]):
        com.pulumi.aws.eks.NodeGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.NodeGroupLaunchTemplateArgs.builder
      builder.launchTemplate(args(argsBuilder).build)

    /**
     * @param nodeRepairConfig The node auto repair configuration for the node group. See `nodeRepairConfig` below for details.
     * @return builder
     */
    def nodeRepairConfig(args: Endofunction[com.pulumi.aws.eks.inputs.NodeGroupNodeRepairConfigArgs.Builder]):
        com.pulumi.aws.eks.NodeGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.NodeGroupNodeRepairConfigArgs.builder
      builder.nodeRepairConfig(args(argsBuilder).build)

    /**
     * @param remoteAccess Configuration block with remote access settings. See `remoteAccess` below for details. Conflicts with `launchTemplate`.
     * @return builder
     */
    def remoteAccess(args: Endofunction[com.pulumi.aws.eks.inputs.NodeGroupRemoteAccessArgs.Builder]):
        com.pulumi.aws.eks.NodeGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.NodeGroupRemoteAccessArgs.builder
      builder.remoteAccess(args(argsBuilder).build)

    /**
     * @param scalingConfig Configuration block with scaling settings. See `scalingConfig` below for details.
     * @return builder
     */
    def scalingConfig(args: Endofunction[com.pulumi.aws.eks.inputs.NodeGroupScalingConfigArgs.Builder]):
        com.pulumi.aws.eks.NodeGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.NodeGroupScalingConfigArgs.builder
      builder.scalingConfig(args(argsBuilder).build)

    /**
     * @param taints The Kubernetes taints to be applied to the nodes in the node group. Maximum of 50 taints per node group. See taint below for details.
     * @return builder
     */
    def taints(args: Endofunction[com.pulumi.aws.eks.inputs.NodeGroupTaintArgs.Builder]*):
        com.pulumi.aws.eks.NodeGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.eks.inputs.NodeGroupTaintArgs.builder
      builder.taints(args.map(_(argsBuilder).build)*)

    /**
     * @param updateConfig Configuration block with update settings. See `updateConfig` below for details.
     * @return builder
     */
    def updateConfig(args: Endofunction[com.pulumi.aws.eks.inputs.NodeGroupUpdateConfigArgs.Builder]):
        com.pulumi.aws.eks.NodeGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.NodeGroupUpdateConfigArgs.builder
      builder.updateConfig(args(argsBuilder).build)

  /**
   * Resource for managing an AWS EKS (Elastic Kubernetes) Pod Identity Association.
   *  
   *  Creates an EKS Pod Identity association between a service account in an Amazon EKS cluster and an IAM role with EKS Pod Identity. Use EKS Pod Identity to give temporary IAM credentials to pods and the credentials are rotated automatically.
   *  
   *  Amazon EKS Pod Identity associations provide the ability to manage credentials for your applications, similar to the way that EC2 instance profiles provide credentials to Amazon EC2 instances.
   *  
   *  If a pod uses a service account that has an association, Amazon EKS sets environment variables in the containers of the pod. The environment variables configure the Amazon Web Services SDKs, including the Command Line Interface, to use the EKS Pod Identity credentials.
   *  
   *  Pod Identity is a simpler method than IAM roles for service accounts, as this method doesn\u2019t use OIDC identity providers. Additionally, you can configure a role for Pod Identity once, and reuse it across clusters.
   */
  def PodIdentityAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.eks.PodIdentityAssociationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.eks.PodIdentityAssociationArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.eks.PodIdentityAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Access Entry Configurations for an EKS Cluster. */
  def AccessEntry(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.eks.AccessEntryArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.eks.AccessEntryArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.eks.AccessEntry(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.eks.FargateProfileArgs.Builder)
    /**
     * @param selectors Configuration block(s) for selecting Kubernetes Pods to execute with this EKS Fargate Profile. Detailed below.
     * @return builder
     */
    def selectors(args: Endofunction[com.pulumi.aws.eks.inputs.FargateProfileSelectorArgs.Builder]*):
        com.pulumi.aws.eks.FargateProfileArgs.Builder =
      def argsBuilder = com.pulumi.aws.eks.inputs.FargateProfileSelectorArgs.builder
      builder.selectors(args.map(_(argsBuilder).build)*)

  /** Manages an EKS add-on. */
  def Addon(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.eks.AddonArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.eks.AddonArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.eks.Addon(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type EksFunctions = com.pulumi.aws.eks.EksFunctions
  object EksFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.eks.EksFunctions.*
  extension (self: EksFunctions.type)
    /** Access Entry Configurations for an EKS Cluster. */
    def getAccessEntry(args: Endofunction[com.pulumi.aws.eks.inputs.GetAccessEntryArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.eks.outputs.GetAccessEntryResult] =
      val argsBuilder = com.pulumi.aws.eks.inputs.GetAccessEntryArgs.builder
      com.pulumi.aws.eks.EksFunctions.getAccessEntry(args(argsBuilder).build)

    /** Access Entry Configurations for an EKS Cluster. */
    def getAccessEntryPlain(args: Endofunction[com.pulumi.aws.eks.inputs.GetAccessEntryPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.eks.outputs.GetAccessEntryResult] =
      val argsBuilder = com.pulumi.aws.eks.inputs.GetAccessEntryPlainArgs.builder
      com.pulumi.aws.eks.EksFunctions.getAccessEntryPlain(args(argsBuilder).build)

    /** Retrieve information about an EKS add-on. */
    def getAddon(args: Endofunction[com.pulumi.aws.eks.inputs.GetAddonArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.eks.outputs.GetAddonResult] =
      val argsBuilder = com.pulumi.aws.eks.inputs.GetAddonArgs.builder
      com.pulumi.aws.eks.EksFunctions.getAddon(args(argsBuilder).build)

    /** Retrieve information about an EKS add-on. */
    def getAddonPlain(args: Endofunction[com.pulumi.aws.eks.inputs.GetAddonPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.eks.outputs.GetAddonResult] =
      val argsBuilder = com.pulumi.aws.eks.inputs.GetAddonPlainArgs.builder
      com.pulumi.aws.eks.EksFunctions.getAddonPlain(args(argsBuilder).build)

    /** Retrieve information about a specific EKS add-on version compatible with an EKS cluster version. */
    def getAddonVersion(args: Endofunction[com.pulumi.aws.eks.inputs.GetAddonVersionArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.eks.outputs.GetAddonVersionResult] =
      val argsBuilder = com.pulumi.aws.eks.inputs.GetAddonVersionArgs.builder
      com.pulumi.aws.eks.EksFunctions.getAddonVersion(args(argsBuilder).build)

    /** Retrieve information about a specific EKS add-on version compatible with an EKS cluster version. */
    def getAddonVersionPlain(args: Endofunction[com.pulumi.aws.eks.inputs.GetAddonVersionPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.eks.outputs.GetAddonVersionResult] =
      val argsBuilder = com.pulumi.aws.eks.inputs.GetAddonVersionPlainArgs.builder
      com.pulumi.aws.eks.EksFunctions.getAddonVersionPlain(args(argsBuilder).build)

    /** Retrieve information about an EKS Cluster. */
    def getCluster(args: Endofunction[com.pulumi.aws.eks.inputs.GetClusterArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.eks.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.aws.eks.inputs.GetClusterArgs.builder
      com.pulumi.aws.eks.EksFunctions.getCluster(args(argsBuilder).build)

    /** Retrieve information about an EKS Cluster. */
    def getClusterPlain(args: Endofunction[com.pulumi.aws.eks.inputs.GetClusterPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.eks.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.aws.eks.inputs.GetClusterPlainArgs.builder
      com.pulumi.aws.eks.EksFunctions.getClusterPlain(args(argsBuilder).build)

    /**
     * Get an authentication token to communicate with an EKS cluster.
     *  
     *  Uses IAM credentials from the AWS provider to generate a temporary token that is compatible with
     *  [AWS IAM Authenticator](https://github.com/kubernetes-sigs/aws-iam-authenticator) authentication.
     *  This can be used to authenticate to an EKS cluster or to a cluster that has the AWS IAM Authenticator
     *  server configured.
     */
    def getClusterAuth(args: Endofunction[com.pulumi.aws.eks.inputs.GetClusterAuthArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.eks.outputs.GetClusterAuthResult] =
      val argsBuilder = com.pulumi.aws.eks.inputs.GetClusterAuthArgs.builder
      com.pulumi.aws.eks.EksFunctions.getClusterAuth(args(argsBuilder).build)

    /**
     * Get an authentication token to communicate with an EKS cluster.
     *  
     *  Uses IAM credentials from the AWS provider to generate a temporary token that is compatible with
     *  [AWS IAM Authenticator](https://github.com/kubernetes-sigs/aws-iam-authenticator) authentication.
     *  This can be used to authenticate to an EKS cluster or to a cluster that has the AWS IAM Authenticator
     *  server configured.
     */
    def getClusterAuthPlain(args: Endofunction[com.pulumi.aws.eks.inputs.GetClusterAuthPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.eks.outputs.GetClusterAuthResult] =
      val argsBuilder = com.pulumi.aws.eks.inputs.GetClusterAuthPlainArgs.builder
      com.pulumi.aws.eks.EksFunctions.getClusterAuthPlain(args(argsBuilder).build)

    /** Data source for managing AWS EKS (Elastic Kubernetes) Cluster Versions. */
    def getClusterVersions(args: Endofunction[com.pulumi.aws.eks.inputs.GetClusterVersionsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.eks.outputs.GetClusterVersionsResult] =
      val argsBuilder = com.pulumi.aws.eks.inputs.GetClusterVersionsArgs.builder
      com.pulumi.aws.eks.EksFunctions.getClusterVersions(args(argsBuilder).build)

    /** Data source for managing AWS EKS (Elastic Kubernetes) Cluster Versions. */
    def getClusterVersionsPlain(args: Endofunction[com.pulumi.aws.eks.inputs.GetClusterVersionsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.eks.outputs.GetClusterVersionsResult] =
      val argsBuilder = com.pulumi.aws.eks.inputs.GetClusterVersionsPlainArgs.builder
      com.pulumi.aws.eks.EksFunctions.getClusterVersionsPlain(args(argsBuilder).build)

    /** Retrieve EKS Clusters list */
    def getClusters(args: Endofunction[com.pulumi.aws.eks.inputs.GetClustersArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.eks.outputs.GetClustersResult] =
      val argsBuilder = com.pulumi.aws.eks.inputs.GetClustersArgs.builder
      com.pulumi.aws.eks.EksFunctions.getClusters(args(argsBuilder).build)

    /** Retrieve EKS Clusters list */
    def getClustersPlain(args: Endofunction[com.pulumi.aws.eks.inputs.GetClustersPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.eks.outputs.GetClustersResult] =
      val argsBuilder = com.pulumi.aws.eks.inputs.GetClustersPlainArgs.builder
      com.pulumi.aws.eks.EksFunctions.getClustersPlain(args(argsBuilder).build)

    /** Retrieve information about an EKS Node Group. */
    def getNodeGroup(args: Endofunction[com.pulumi.aws.eks.inputs.GetNodeGroupArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.eks.outputs.GetNodeGroupResult] =
      val argsBuilder = com.pulumi.aws.eks.inputs.GetNodeGroupArgs.builder
      com.pulumi.aws.eks.EksFunctions.getNodeGroup(args(argsBuilder).build)

    /** Retrieve information about an EKS Node Group. */
    def getNodeGroupPlain(args: Endofunction[com.pulumi.aws.eks.inputs.GetNodeGroupPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.eks.outputs.GetNodeGroupResult] =
      val argsBuilder = com.pulumi.aws.eks.inputs.GetNodeGroupPlainArgs.builder
      com.pulumi.aws.eks.EksFunctions.getNodeGroupPlain(args(argsBuilder).build)

    /** Retrieve the EKS Node Groups associated with a named EKS cluster. This will allow you to pass a list of Node Group names to other resources. */
    def getNodeGroups(args: Endofunction[com.pulumi.aws.eks.inputs.GetNodeGroupsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.eks.outputs.GetNodeGroupsResult] =
      val argsBuilder = com.pulumi.aws.eks.inputs.GetNodeGroupsArgs.builder
      com.pulumi.aws.eks.EksFunctions.getNodeGroups(args(argsBuilder).build)

    /** Retrieve the EKS Node Groups associated with a named EKS cluster. This will allow you to pass a list of Node Group names to other resources. */
    def getNodeGroupsPlain(args: Endofunction[com.pulumi.aws.eks.inputs.GetNodeGroupsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.eks.outputs.GetNodeGroupsResult] =
      val argsBuilder = com.pulumi.aws.eks.inputs.GetNodeGroupsPlainArgs.builder
      com.pulumi.aws.eks.EksFunctions.getNodeGroupsPlain(args(argsBuilder).build)

  /** Manages an EKS Node Group, which can provision and optionally update an Auto Scaling Group of Kubernetes worker nodes compatible with EKS. Additional documentation about this functionality can be found in the [EKS User Guide](https://docs.aws.amazon.com/eks/latest/userguide/managed-node-groups.html). */
  def NodeGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.eks.NodeGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.eks.NodeGroupArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.eks.NodeGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.eks.inputs.FargateProfileState.Builder)
    /**
     * @param selectors Configuration block(s) for selecting Kubernetes Pods to execute with this EKS Fargate Profile. Detailed below.
     * @return builder
     */
    def selectors(args: Endofunction[com.pulumi.aws.eks.inputs.FargateProfileSelectorArgs.Builder]*):
        com.pulumi.aws.eks.inputs.FargateProfileState.Builder =
      def argsBuilder = com.pulumi.aws.eks.inputs.FargateProfileSelectorArgs.builder
      builder.selectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.eks.inputs.ClusterKubernetesNetworkConfigArgs.Builder)
    /**
     * @param elasticLoadBalancing Configuration block with elastic load balancing configuration for the cluster. Detailed below.
     * @return builder
     */
    def elasticLoadBalancing(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterKubernetesNetworkConfigElasticLoadBalancingArgs.Builder]):
        com.pulumi.aws.eks.inputs.ClusterKubernetesNetworkConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterKubernetesNetworkConfigElasticLoadBalancingArgs.builder
      builder.elasticLoadBalancing(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.eks.inputs.ClusterState.Builder)
    /**
     * @param accessConfig Configuration block for the access config associated with your cluster, see [Amazon EKS Access Entries](https://docs.aws.amazon.com/eks/latest/userguide/access-entries.html). Detailed below.
     * @return builder
     */
    def accessConfig(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterAccessConfigArgs.Builder]):
        com.pulumi.aws.eks.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterAccessConfigArgs.builder
      builder.accessConfig(args(argsBuilder).build)

    /**
     * @param certificateAuthority Attribute block containing `certificate-authority-data` for your cluster. Detailed below.
     * @return builder
     */
    def certificateAuthority(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterCertificateAuthorityArgs.Builder]):
        com.pulumi.aws.eks.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterCertificateAuthorityArgs.builder
      builder.certificateAuthority(args(argsBuilder).build)

    /**
     * @param computeConfig Configuration block with compute configuration for EKS Auto Mode. Detailed below.
     * @return builder
     */
    def computeConfig(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterComputeConfigArgs.Builder]):
        com.pulumi.aws.eks.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterComputeConfigArgs.builder
      builder.computeConfig(args(argsBuilder).build)

    /**
     * @param encryptionConfig Configuration block with encryption configuration for the cluster. Detailed below.
     * @return builder
     */
    def encryptionConfig(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterEncryptionConfigArgs.Builder]):
        com.pulumi.aws.eks.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterEncryptionConfigArgs.builder
      builder.encryptionConfig(args(argsBuilder).build)

    /**
     * @param identities Attribute block containing identity provider information for your cluster. Only available on Kubernetes version 1.13 and 1.14 clusters created or upgraded on or after September 3, 2019. Detailed below.
     * @return builder
     */
    def identities(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterIdentityArgs.Builder]*):
        com.pulumi.aws.eks.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.aws.eks.inputs.ClusterIdentityArgs.builder
      builder.identities(args.map(_(argsBuilder).build)*)

    /**
     * @param kubernetesNetworkConfig Configuration block with kubernetes network configuration for the cluster. Detailed below. If removed, the provider will only perform drift detection if a configuration value is provided.
     * @return builder
     */
    def kubernetesNetworkConfig(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterKubernetesNetworkConfigArgs.Builder]):
        com.pulumi.aws.eks.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterKubernetesNetworkConfigArgs.builder
      builder.kubernetesNetworkConfig(args(argsBuilder).build)

    /**
     * @param outpostConfig Configuration block representing the configuration of your local Amazon EKS cluster on an AWS Outpost. This block isn&#39;t available for creating Amazon EKS clusters on the AWS cloud.
     * @return builder
     */
    def outpostConfig(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterOutpostConfigArgs.Builder]):
        com.pulumi.aws.eks.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterOutpostConfigArgs.builder
      builder.outpostConfig(args(argsBuilder).build)

    /**
     * @param remoteNetworkConfig Configuration block with remote network configuration for EKS Hybrid Nodes. Detailed below.
     * @return builder
     */
    def remoteNetworkConfig(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterRemoteNetworkConfigArgs.Builder]):
        com.pulumi.aws.eks.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterRemoteNetworkConfigArgs.builder
      builder.remoteNetworkConfig(args(argsBuilder).build)

    /**
     * @param storageConfig Configuration block with storage configuration for EKS Auto Mode. Detailed below.
     * @return builder
     */
    def storageConfig(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterStorageConfigArgs.Builder]):
        com.pulumi.aws.eks.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterStorageConfigArgs.builder
      builder.storageConfig(args(argsBuilder).build)

    /**
     * @param upgradePolicy Configuration block for the support policy to use for the cluster.  See upgradePolicy for details.
     * @return builder
     */
    def upgradePolicy(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterUpgradePolicyArgs.Builder]):
        com.pulumi.aws.eks.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterUpgradePolicyArgs.builder
      builder.upgradePolicy(args(argsBuilder).build)

    /**
     * @param vpcConfig Configuration block for the VPC associated with your cluster. Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For more information, see [Cluster VPC Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html) and [Cluster Security Group Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the Amazon EKS User Guide. Detailed below. Also contains attributes detailed in the Attributes section.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def vpcConfig(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterVpcConfigArgs.Builder]):
        com.pulumi.aws.eks.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

    /**
     * @param zonalShiftConfig Configuration block with zonal shift configuration for the cluster. Detailed below.
     * @return builder
     */
    def zonalShiftConfig(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterZonalShiftConfigArgs.Builder]):
        com.pulumi.aws.eks.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterZonalShiftConfigArgs.builder
      builder.zonalShiftConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.eks.inputs.AddonState.Builder)
    /**
     * @param podIdentityAssociations Configuration block with EKS Pod Identity association settings. See `podIdentityAssociation` below for details.
     * @return builder
     */
    def podIdentityAssociations(args: Endofunction[com.pulumi.aws.eks.inputs.AddonPodIdentityAssociationArgs.Builder]*):
        com.pulumi.aws.eks.inputs.AddonState.Builder =
      def argsBuilder = com.pulumi.aws.eks.inputs.AddonPodIdentityAssociationArgs.builder
      builder.podIdentityAssociations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.eks.inputs.NodeGroupState.Builder)
    /**
     * @param launchTemplate Configuration block with Launch Template settings. See `launchTemplate` below for details. Conflicts with `remoteAccess`.
     * @return builder
     */
    def launchTemplate(args: Endofunction[com.pulumi.aws.eks.inputs.NodeGroupLaunchTemplateArgs.Builder]):
        com.pulumi.aws.eks.inputs.NodeGroupState.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.NodeGroupLaunchTemplateArgs.builder
      builder.launchTemplate(args(argsBuilder).build)

    /**
     * @param nodeRepairConfig The node auto repair configuration for the node group. See `nodeRepairConfig` below for details.
     * @return builder
     */
    def nodeRepairConfig(args: Endofunction[com.pulumi.aws.eks.inputs.NodeGroupNodeRepairConfigArgs.Builder]):
        com.pulumi.aws.eks.inputs.NodeGroupState.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.NodeGroupNodeRepairConfigArgs.builder
      builder.nodeRepairConfig(args(argsBuilder).build)

    /**
     * @param remoteAccess Configuration block with remote access settings. See `remoteAccess` below for details. Conflicts with `launchTemplate`.
     * @return builder
     */
    def remoteAccess(args: Endofunction[com.pulumi.aws.eks.inputs.NodeGroupRemoteAccessArgs.Builder]):
        com.pulumi.aws.eks.inputs.NodeGroupState.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.NodeGroupRemoteAccessArgs.builder
      builder.remoteAccess(args(argsBuilder).build)

    /**
     * @param resources List of objects containing information about underlying resources.
     * @return builder
     */
    def resources(args: Endofunction[com.pulumi.aws.eks.inputs.NodeGroupResourceArgs.Builder]*):
        com.pulumi.aws.eks.inputs.NodeGroupState.Builder =
      def argsBuilder = com.pulumi.aws.eks.inputs.NodeGroupResourceArgs.builder
      builder.resources(args.map(_(argsBuilder).build)*)

    /**
     * @param scalingConfig Configuration block with scaling settings. See `scalingConfig` below for details.
     * @return builder
     */
    def scalingConfig(args: Endofunction[com.pulumi.aws.eks.inputs.NodeGroupScalingConfigArgs.Builder]):
        com.pulumi.aws.eks.inputs.NodeGroupState.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.NodeGroupScalingConfigArgs.builder
      builder.scalingConfig(args(argsBuilder).build)

    /**
     * @param taints The Kubernetes taints to be applied to the nodes in the node group. Maximum of 50 taints per node group. See taint below for details.
     * @return builder
     */
    def taints(args: Endofunction[com.pulumi.aws.eks.inputs.NodeGroupTaintArgs.Builder]*):
        com.pulumi.aws.eks.inputs.NodeGroupState.Builder =
      def argsBuilder = com.pulumi.aws.eks.inputs.NodeGroupTaintArgs.builder
      builder.taints(args.map(_(argsBuilder).build)*)

    /**
     * @param updateConfig Configuration block with update settings. See `updateConfig` below for details.
     * @return builder
     */
    def updateConfig(args: Endofunction[com.pulumi.aws.eks.inputs.NodeGroupUpdateConfigArgs.Builder]):
        com.pulumi.aws.eks.inputs.NodeGroupState.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.NodeGroupUpdateConfigArgs.builder
      builder.updateConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.eks.inputs.AccessPolicyAssociationState.Builder)
    /**
     * @param accessScope The configuration block to determine the scope of the access. See `accessScope` Block below.
     * @return builder
     */
    def accessScope(args: Endofunction[com.pulumi.aws.eks.inputs.AccessPolicyAssociationAccessScopeArgs.Builder]):
        com.pulumi.aws.eks.inputs.AccessPolicyAssociationState.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.AccessPolicyAssociationAccessScopeArgs.builder
      builder.accessScope(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.eks.inputs.NodeGroupResourceArgs.Builder)
    /**
     * @param autoscalingGroups List of objects containing information about AutoScaling Groups.
     * @return builder
     */
    def autoscalingGroups(args: Endofunction[com.pulumi.aws.eks.inputs.NodeGroupResourceAutoscalingGroupArgs.Builder]*):
        com.pulumi.aws.eks.inputs.NodeGroupResourceArgs.Builder =
      def argsBuilder = com.pulumi.aws.eks.inputs.NodeGroupResourceAutoscalingGroupArgs.builder
      builder.autoscalingGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.eks.inputs.ClusterRemoteNetworkConfigArgs.Builder)
    /**
     * @param remoteNodeNetworks Configuration block with remote node network configuration for EKS Hybrid Nodes. Detailed below.
     * @return builder
     */
    def remoteNodeNetworks(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterRemoteNetworkConfigRemoteNodeNetworksArgs.Builder]):
        com.pulumi.aws.eks.inputs.ClusterRemoteNetworkConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterRemoteNetworkConfigRemoteNodeNetworksArgs.builder
      builder.remoteNodeNetworks(args(argsBuilder).build)

    /**
     * @param remotePodNetworks Configuration block with remote pod network configuration for EKS Hybrid Nodes. Detailed below.
     * @return builder
     */
    def remotePodNetworks(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterRemoteNetworkConfigRemotePodNetworksArgs.Builder]):
        com.pulumi.aws.eks.inputs.ClusterRemoteNetworkConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterRemoteNetworkConfigRemotePodNetworksArgs.builder
      builder.remotePodNetworks(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.eks.inputs.ClusterOutpostConfigArgs.Builder)
    /**
     * @param controlPlanePlacement An object representing the placement configuration for all the control plane instances of your local Amazon EKS cluster on AWS Outpost.
     *  The `controlPlanePlacement` configuration block supports the following arguments:
     * @return builder
     */
    def controlPlanePlacement(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterOutpostConfigControlPlanePlacementArgs.Builder]):
        com.pulumi.aws.eks.inputs.ClusterOutpostConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterOutpostConfigControlPlanePlacementArgs.builder
      builder.controlPlanePlacement(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.eks.inputs.ClusterEncryptionConfigArgs.Builder)
    /**
     * @param provider Configuration block with provider for encryption. Detailed below.
     * @return builder
     */
    def provider(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterEncryptionConfigProviderArgs.Builder]):
        com.pulumi.aws.eks.inputs.ClusterEncryptionConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterEncryptionConfigProviderArgs.builder
      builder.provider(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.eks.inputs.IdentityProviderConfigState.Builder)
    /**
     * @param oidc Nested attribute containing [OpenID Connect](https://openid.net/connect/) identity provider information for the cluster. Detailed below.
     * @return builder
     */
    def oidc(args: Endofunction[com.pulumi.aws.eks.inputs.IdentityProviderConfigOidcArgs.Builder]):
        com.pulumi.aws.eks.inputs.IdentityProviderConfigState.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.IdentityProviderConfigOidcArgs.builder
      builder.oidc(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.eks.inputs.NodeGroupNodeRepairConfigArgs.Builder)
    /**
     * @param nodeRepairConfigOverrides Granular overrides for specific repair actions. See `nodeRepairConfigOverrides` below for details.
     * @return builder
     */
    def nodeRepairConfigOverrides(args: Endofunction[com.pulumi.aws.eks.inputs.NodeGroupNodeRepairConfigNodeRepairConfigOverrideArgs.Builder]*):
        com.pulumi.aws.eks.inputs.NodeGroupNodeRepairConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.eks.inputs.NodeGroupNodeRepairConfigNodeRepairConfigOverrideArgs.builder
      builder.nodeRepairConfigOverrides(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.eks.inputs.ClusterStorageConfigArgs.Builder)
    /**
     * @param blockStorage Configuration block with block storage configuration for the cluster. Detailed below.
     * @return builder
     */
    def blockStorage(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterStorageConfigBlockStorageArgs.Builder]):
        com.pulumi.aws.eks.inputs.ClusterStorageConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterStorageConfigBlockStorageArgs.builder
      builder.blockStorage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.eks.inputs.ClusterIdentityArgs.Builder)
    /**
     * @param oidcs Nested block containing [OpenID Connect](https://openid.net/connect/) identity provider information for the cluster. Detailed below.
     * @return builder
     */
    def oidcs(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterIdentityOidcArgs.Builder]*):
        com.pulumi.aws.eks.inputs.ClusterIdentityArgs.Builder =
      def argsBuilder = com.pulumi.aws.eks.inputs.ClusterIdentityOidcArgs.builder
      builder.oidcs(args.map(_(argsBuilder).build)*)
