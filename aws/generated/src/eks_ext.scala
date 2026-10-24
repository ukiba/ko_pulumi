package jp.ukiba.ko_pulumi
package aws

object eks_ext:
  extension (builder: com.pulumi.aws.eks.AccessPolicyAssociationArgs.Builder)
    /**
     * @param accessScope The configuration block to determine the scope of the access. See `accessScope` Block below.
     * @return builder
     */
    def accessScope(args: Endofunction[com.pulumi.aws.eks.inputs.AccessPolicyAssociationAccessScopeArgs.Builder]):
        com.pulumi.aws.eks.AccessPolicyAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.AccessPolicyAssociationAccessScopeArgs.builder
      builder.accessScope(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.eks.AddonArgs.Builder)
    /**
     * @param namespaceConfig Namespace configuration for the add-on. See `namespaceConfig` below for details.
     * @return builder
     */
    def namespaceConfig(args: Endofunction[com.pulumi.aws.eks.inputs.AddonNamespaceConfigArgs.Builder]):
        com.pulumi.aws.eks.AddonArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.AddonNamespaceConfigArgs.builder
      builder.namespaceConfig(args(argsBuilder).build)

    /**
     * @param podIdentityAssociations Configuration block with EKS Pod Identity association settings. See `podIdentityAssociation` below for details.
     * @return builder
     */
    def podIdentityAssociations(args: Endofunction[com.pulumi.aws.eks.inputs.AddonPodIdentityAssociationArgs.Builder]*):
        com.pulumi.aws.eks.AddonArgs.Builder =
      def argsBuilder = com.pulumi.aws.eks.inputs.AddonPodIdentityAssociationArgs.builder
      builder.podIdentityAssociations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.eks.CapabilityArgs.Builder)
    /**
     * @param configuration Configuration for the capability. See `configuration` below.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.eks.inputs.CapabilityConfigurationArgs.Builder]):
        com.pulumi.aws.eks.CapabilityArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.CapabilityConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.eks.inputs.CapabilityTimeoutsArgs.Builder]):
        com.pulumi.aws.eks.CapabilityArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.CapabilityTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

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
     * @param controlPlaneScalingConfig Configuration block for the control plane scaling tier. See [EKS Provisioned Control Plane](https://docs.aws.amazon.com/eks/latest/userguide/eks-provisioned-control-plane-getting-started.html) for more information. Detailed below.
     * @return builder
     */
    def controlPlaneScalingConfig(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterControlPlaneScalingConfigArgs.Builder]):
        com.pulumi.aws.eks.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterControlPlaneScalingConfigArgs.builder
      builder.controlPlaneScalingConfig(args(argsBuilder).build)

    /**
     * @param encryptionConfig Configuration block with encryption configuration for the cluster. Detailed below.
     * @return builder
     */
    def encryptionConfig(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterEncryptionConfigArgs.Builder]):
        com.pulumi.aws.eks.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterEncryptionConfigArgs.builder
      builder.encryptionConfig(args(argsBuilder).build)

    /**
     * @param kubeApiServerConfig Configuration block for customizing the Kubernetes API server. Detailed below.
     * @return builder
     */
    def kubeApiServerConfig(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterKubeApiServerConfigArgs.Builder]):
        com.pulumi.aws.eks.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterKubeApiServerConfigArgs.builder
      builder.kubeApiServerConfig(args(argsBuilder).build)

    /**
     * @param kubeControllerManagerConfig Configuration block for customizing the Kubernetes controller manager. Detailed below.
     * @return builder
     */
    def kubeControllerManagerConfig(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterKubeControllerManagerConfigArgs.Builder]):
        com.pulumi.aws.eks.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterKubeControllerManagerConfigArgs.builder
      builder.kubeControllerManagerConfig(args(argsBuilder).build)

    /**
     * @param kubeSchedulerConfig Configuration block for customizing the Kubernetes scheduler. Detailed below.
     * @return builder
     */
    def kubeSchedulerConfig(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterKubeSchedulerConfigArgs.Builder]):
        com.pulumi.aws.eks.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterKubeSchedulerConfigArgs.builder
      builder.kubeSchedulerConfig(args(argsBuilder).build)

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
     * The following arguments are optional:
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

  extension (builder: com.pulumi.aws.eks.FargateProfileArgs.Builder)
    /**
     * @param selectors Configuration block(s) for selecting Kubernetes Pods to execute with this EKS Fargate Profile. Detailed below.
     * @return builder
     */
    def selectors(args: Endofunction[com.pulumi.aws.eks.inputs.FargateProfileSelectorArgs.Builder]*):
        com.pulumi.aws.eks.FargateProfileArgs.Builder =
      def argsBuilder = com.pulumi.aws.eks.inputs.FargateProfileSelectorArgs.builder
      builder.selectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.eks.IdentityProviderConfigArgs.Builder)
    /**
     * @param oidc Nested attribute containing [OpenID Connect](https://openid.net/connect/) identity provider information for the cluster. Detailed below.
     * @return builder
     */
    def oidc(args: Endofunction[com.pulumi.aws.eks.inputs.IdentityProviderConfigOidcArgs.Builder]):
        com.pulumi.aws.eks.IdentityProviderConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.IdentityProviderConfigOidcArgs.builder
      builder.oidc(args(argsBuilder).build)

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
     * @param warmPoolConfig Configuration block with EC2 Auto Scaling warm pool settings. Including this block enables the warm pool; removing it disables and removes the warm pool. See `warmPoolConfig` below for details.
     * @return builder
     */
    def warmPoolConfig(args: Endofunction[com.pulumi.aws.eks.inputs.NodeGroupWarmPoolConfigArgs.Builder]):
        com.pulumi.aws.eks.NodeGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.NodeGroupWarmPoolConfigArgs.builder
      builder.warmPoolConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.eks.inputs.AccessPolicyAssociationState.Builder)
    /**
     * @param accessScope The configuration block to determine the scope of the access. See `accessScope` Block below.
     * @return builder
     */
    def accessScope(args: Endofunction[com.pulumi.aws.eks.inputs.AccessPolicyAssociationAccessScopeArgs.Builder]):
        com.pulumi.aws.eks.inputs.AccessPolicyAssociationState.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.AccessPolicyAssociationAccessScopeArgs.builder
      builder.accessScope(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.eks.inputs.AddonState.Builder)
    /**
     * @param namespaceConfig Namespace configuration for the add-on. See `namespaceConfig` below for details.
     * @return builder
     */
    def namespaceConfig(args: Endofunction[com.pulumi.aws.eks.inputs.AddonNamespaceConfigArgs.Builder]):
        com.pulumi.aws.eks.inputs.AddonState.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.AddonNamespaceConfigArgs.builder
      builder.namespaceConfig(args(argsBuilder).build)

    /**
     * @param podIdentityAssociations Configuration block with EKS Pod Identity association settings. See `podIdentityAssociation` below for details.
     * @return builder
     */
    def podIdentityAssociations(args: Endofunction[com.pulumi.aws.eks.inputs.AddonPodIdentityAssociationArgs.Builder]*):
        com.pulumi.aws.eks.inputs.AddonState.Builder =
      def argsBuilder = com.pulumi.aws.eks.inputs.AddonPodIdentityAssociationArgs.builder
      builder.podIdentityAssociations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.eks.inputs.CapabilityConfigurationArgoCdArgs.Builder)
    /**
     * @param awsIdc AWS IAM Identity Center configuration. See `awsIdc` below.
     * @return builder
     */
    def awsIdc(args: Endofunction[com.pulumi.aws.eks.inputs.CapabilityConfigurationArgoCdAwsIdcArgs.Builder]):
        com.pulumi.aws.eks.inputs.CapabilityConfigurationArgoCdArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.CapabilityConfigurationArgoCdAwsIdcArgs.builder
      builder.awsIdc(args(argsBuilder).build)

    /**
     * @param networkAccess Network access configuration. See `networkAccess` below.
     * @return builder
     */
    def networkAccess(args: Endofunction[com.pulumi.aws.eks.inputs.CapabilityConfigurationArgoCdNetworkAccessArgs.Builder]):
        com.pulumi.aws.eks.inputs.CapabilityConfigurationArgoCdArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.CapabilityConfigurationArgoCdNetworkAccessArgs.builder
      builder.networkAccess(args(argsBuilder).build)

    /**
     * @param rbacRoleMappings RBAC role mappings. See `rbacRoleMapping` below.
     * @return builder
     */
    def rbacRoleMappings(args: Endofunction[com.pulumi.aws.eks.inputs.CapabilityConfigurationArgoCdRbacRoleMappingArgs.Builder]*):
        com.pulumi.aws.eks.inputs.CapabilityConfigurationArgoCdArgs.Builder =
      def argsBuilder = com.pulumi.aws.eks.inputs.CapabilityConfigurationArgoCdRbacRoleMappingArgs.builder
      builder.rbacRoleMappings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.eks.inputs.CapabilityConfigurationArgoCdRbacRoleMappingArgs.Builder)
    /**
     * @param identities List of identities. See `identity` below.
     * @return builder
     */
    def identities(args: Endofunction[com.pulumi.aws.eks.inputs.CapabilityConfigurationArgoCdRbacRoleMappingIdentityArgs.Builder]*):
        com.pulumi.aws.eks.inputs.CapabilityConfigurationArgoCdRbacRoleMappingArgs.Builder =
      def argsBuilder = com.pulumi.aws.eks.inputs.CapabilityConfigurationArgoCdRbacRoleMappingIdentityArgs.builder
      builder.identities(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.eks.inputs.CapabilityConfigurationArgs.Builder)
    /**
     * @param argoCd ArgoCD configuration. See `argoCd` below.
     * @return builder
     */
    def argoCd(args: Endofunction[com.pulumi.aws.eks.inputs.CapabilityConfigurationArgoCdArgs.Builder]):
        com.pulumi.aws.eks.inputs.CapabilityConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.CapabilityConfigurationArgoCdArgs.builder
      builder.argoCd(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.eks.inputs.CapabilityState.Builder)
    /**
     * @param configuration Configuration for the capability. See `configuration` below.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.eks.inputs.CapabilityConfigurationArgs.Builder]):
        com.pulumi.aws.eks.inputs.CapabilityState.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.CapabilityConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.eks.inputs.CapabilityTimeoutsArgs.Builder]):
        com.pulumi.aws.eks.inputs.CapabilityState.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.CapabilityTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.eks.inputs.ClusterEncryptionConfigArgs.Builder)
    /**
     * @param provider Configuration block with provider for encryption. Detailed below.
     * @return builder
     */
    def provider(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterEncryptionConfigProviderArgs.Builder]):
        com.pulumi.aws.eks.inputs.ClusterEncryptionConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterEncryptionConfigProviderArgs.builder
      builder.provider(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.eks.inputs.ClusterIdentityArgs.Builder)
    /**
     * @param oidcs Nested block containing [OpenID Connect](https://openid.net/connect/) identity provider information for the cluster. Detailed below.
     * @return builder
     */
    def oidcs(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterIdentityOidcArgs.Builder]*):
        com.pulumi.aws.eks.inputs.ClusterIdentityArgs.Builder =
      def argsBuilder = com.pulumi.aws.eks.inputs.ClusterIdentityOidcArgs.builder
      builder.oidcs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.eks.inputs.ClusterKubeApiServerConfigArgs.Builder)
    /**
     * @param serviceNodePortRange Configuration block for the port range available for NodePort services. Detailed below.
     * @return builder
     */
    def serviceNodePortRange(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterKubeApiServerConfigServiceNodePortRangeArgs.Builder]):
        com.pulumi.aws.eks.inputs.ClusterKubeApiServerConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterKubeApiServerConfigServiceNodePortRangeArgs.builder
      builder.serviceNodePortRange(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.eks.inputs.ClusterKubeControllerManagerConfigArgs.Builder)
    /**
     * @param horizontalPodAutoscalerControllerConfig Configuration block for the horizontal pod autoscaler controller. Detailed below.
     * @return builder
     */
    def horizontalPodAutoscalerControllerConfig(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterKubeControllerManagerConfigHorizontalPodAutoscalerControllerConfigArgs.Builder]):
        com.pulumi.aws.eks.inputs.ClusterKubeControllerManagerConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterKubeControllerManagerConfigHorizontalPodAutoscalerControllerConfigArgs.builder
      builder.horizontalPodAutoscalerControllerConfig(args(argsBuilder).build)

    /**
     * @param podGcControllerConfig Configuration block for the pod garbage collection controller. Detailed below.
     * 
     * &gt; **NOTE:** The `horizontalPodAutoscalerControllerConfig` requires a Provisioned Control Plane scaling tier (e.g., `tier-xl` or higher). It cannot be configured on clusters using the `standard` tier.
     * @return builder
     */
    def podGcControllerConfig(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterKubeControllerManagerConfigPodGcControllerConfigArgs.Builder]):
        com.pulumi.aws.eks.inputs.ClusterKubeControllerManagerConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterKubeControllerManagerConfigPodGcControllerConfigArgs.builder
      builder.podGcControllerConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.eks.inputs.ClusterKubeSchedulerConfigArgs.Builder)
    /**
     * @param nodeResourcesFit Configuration block for the NodeResourcesFit scheduler plugin. Detailed below.
     * @return builder
     */
    def nodeResourcesFit(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterKubeSchedulerConfigNodeResourcesFitArgs.Builder]):
        com.pulumi.aws.eks.inputs.ClusterKubeSchedulerConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterKubeSchedulerConfigNodeResourcesFitArgs.builder
      builder.nodeResourcesFit(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.eks.inputs.ClusterKubeSchedulerConfigNodeResourcesFitArgs.Builder)
    /**
     * @param scoringStrategy Configuration block for the scoring strategy used to rank nodes during scheduling. Detailed below.
     * @return builder
     */
    def scoringStrategy(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterKubeSchedulerConfigNodeResourcesFitScoringStrategyArgs.Builder]):
        com.pulumi.aws.eks.inputs.ClusterKubeSchedulerConfigNodeResourcesFitArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterKubeSchedulerConfigNodeResourcesFitScoringStrategyArgs.builder
      builder.scoringStrategy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.eks.inputs.ClusterKubeSchedulerConfigNodeResourcesFitScoringStrategyArgs.Builder)
    /**
     * @param resources List of resource weight configuration blocks for scoring nodes. Detailed below.
     * @return builder
     */
    def resources(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterKubeSchedulerConfigNodeResourcesFitScoringStrategyResourceArgs.Builder]*):
        com.pulumi.aws.eks.inputs.ClusterKubeSchedulerConfigNodeResourcesFitScoringStrategyArgs.Builder =
      def argsBuilder = com.pulumi.aws.eks.inputs.ClusterKubeSchedulerConfigNodeResourcesFitScoringStrategyResourceArgs.builder
      builder.resources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.eks.inputs.ClusterKubernetesNetworkConfigArgs.Builder)
    /**
     * @param elasticLoadBalancing Configuration block with elastic load balancing configuration for the cluster. Detailed below.
     * @return builder
     */
    def elasticLoadBalancing(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterKubernetesNetworkConfigElasticLoadBalancingArgs.Builder]):
        com.pulumi.aws.eks.inputs.ClusterKubernetesNetworkConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterKubernetesNetworkConfigElasticLoadBalancingArgs.builder
      builder.elasticLoadBalancing(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.eks.inputs.ClusterOutpostConfigArgs.Builder)
    /**
     * @param controlPlanePlacement An object representing the placement configuration for all the control plane instances of your local Amazon EKS cluster on AWS Outpost.
     * The `controlPlanePlacement` configuration block supports the following arguments:
     * @return builder
     */
    def controlPlanePlacement(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterOutpostConfigControlPlanePlacementArgs.Builder]):
        com.pulumi.aws.eks.inputs.ClusterOutpostConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterOutpostConfigControlPlanePlacementArgs.builder
      builder.controlPlanePlacement(args(argsBuilder).build)

    /**
     * @param etcdPlacement Placement configuration for the etcd instances of your local Amazon EKS cluster on an AWS Outpost.
     * The `etcdPlacement` configuration block supports the following arguments:
     * @return builder
     */
    def etcdPlacement(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterOutpostConfigEtcdPlacementArgs.Builder]):
        com.pulumi.aws.eks.inputs.ClusterOutpostConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterOutpostConfigEtcdPlacementArgs.builder
      builder.etcdPlacement(args(argsBuilder).build)

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
     * @param controlPlaneScalingConfig Configuration block for the control plane scaling tier. See [EKS Provisioned Control Plane](https://docs.aws.amazon.com/eks/latest/userguide/eks-provisioned-control-plane-getting-started.html) for more information. Detailed below.
     * @return builder
     */
    def controlPlaneScalingConfig(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterControlPlaneScalingConfigArgs.Builder]):
        com.pulumi.aws.eks.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterControlPlaneScalingConfigArgs.builder
      builder.controlPlaneScalingConfig(args(argsBuilder).build)

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
     * @param kubeApiServerConfig Configuration block for customizing the Kubernetes API server. Detailed below.
     * @return builder
     */
    def kubeApiServerConfig(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterKubeApiServerConfigArgs.Builder]):
        com.pulumi.aws.eks.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterKubeApiServerConfigArgs.builder
      builder.kubeApiServerConfig(args(argsBuilder).build)

    /**
     * @param kubeControllerManagerConfig Configuration block for customizing the Kubernetes controller manager. Detailed below.
     * @return builder
     */
    def kubeControllerManagerConfig(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterKubeControllerManagerConfigArgs.Builder]):
        com.pulumi.aws.eks.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterKubeControllerManagerConfigArgs.builder
      builder.kubeControllerManagerConfig(args(argsBuilder).build)

    /**
     * @param kubeSchedulerConfig Configuration block for customizing the Kubernetes scheduler. Detailed below.
     * @return builder
     */
    def kubeSchedulerConfig(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterKubeSchedulerConfigArgs.Builder]):
        com.pulumi.aws.eks.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterKubeSchedulerConfigArgs.builder
      builder.kubeSchedulerConfig(args(argsBuilder).build)

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
     * The following arguments are optional:
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

  extension (builder: com.pulumi.aws.eks.inputs.ClusterStorageConfigArgs.Builder)
    /**
     * @param blockStorage Configuration block with block storage configuration for the cluster. Detailed below.
     * @return builder
     */
    def blockStorage(args: Endofunction[com.pulumi.aws.eks.inputs.ClusterStorageConfigBlockStorageArgs.Builder]):
        com.pulumi.aws.eks.inputs.ClusterStorageConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.ClusterStorageConfigBlockStorageArgs.builder
      builder.blockStorage(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.eks.inputs.FargateProfileState.Builder)
    /**
     * @param selectors Configuration block(s) for selecting Kubernetes Pods to execute with this EKS Fargate Profile. Detailed below.
     * @return builder
     */
    def selectors(args: Endofunction[com.pulumi.aws.eks.inputs.FargateProfileSelectorArgs.Builder]*):
        com.pulumi.aws.eks.inputs.FargateProfileState.Builder =
      def argsBuilder = com.pulumi.aws.eks.inputs.FargateProfileSelectorArgs.builder
      builder.selectors(args.map(_(argsBuilder).build)*)

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

  extension (builder: com.pulumi.aws.eks.inputs.NodeGroupResourceArgs.Builder)
    /**
     * @param autoscalingGroups List of objects containing information about Auto Scaling groups.
     * @return builder
     */
    def autoscalingGroups(args: Endofunction[com.pulumi.aws.eks.inputs.NodeGroupResourceAutoscalingGroupArgs.Builder]*):
        com.pulumi.aws.eks.inputs.NodeGroupResourceArgs.Builder =
      def argsBuilder = com.pulumi.aws.eks.inputs.NodeGroupResourceAutoscalingGroupArgs.builder
      builder.autoscalingGroups(args.map(_(argsBuilder).build)*)

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

    /**
     * @param warmPoolConfig Configuration block with EC2 Auto Scaling warm pool settings. Including this block enables the warm pool; removing it disables and removes the warm pool. See `warmPoolConfig` below for details.
     * @return builder
     */
    def warmPoolConfig(args: Endofunction[com.pulumi.aws.eks.inputs.NodeGroupWarmPoolConfigArgs.Builder]):
        com.pulumi.aws.eks.inputs.NodeGroupState.Builder =
      val argsBuilder = com.pulumi.aws.eks.inputs.NodeGroupWarmPoolConfigArgs.builder
      builder.warmPoolConfig(args(argsBuilder).build)
