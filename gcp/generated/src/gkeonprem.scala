package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object gkeonprem:
  /**
   * A Google Bare Metal Admin Cluster.
   * 
   *  To get more information about BareMetalAdminCluster, see:
   * 
   *  * [API documentation](https://cloud.google.com/kubernetes-engine/distributed-cloud/reference/on-prem-api/rest/v1/projects.locations.bareMetalAdminClusters)
   */
  def BareMetalAdminCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkeonprem.BareMetalAdminClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.gkeonprem.BareMetalAdminClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.gkeonprem.BareMetalAdminCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.gkeonprem.BareMetalNodePoolArgs.Builder)
    /**
     * @param nodePoolConfig Node pool configuration.
     *  Structure is documented below.
     * @return builder
     */
    def nodePoolConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalNodePoolNodePoolConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.BareMetalNodePoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalNodePoolNodePoolConfigArgs.builder
      builder.nodePoolConfig(args(argsBuilder).build)

  /**
   * A Google Bare Metal Node Pool.
   * 
   *  To get more information about BareMetalNodePool, see:
   * 
   *  * [API documentation](https://cloud.google.com/kubernetes-engine/distributed-cloud/reference/on-prem-api/rest/v1/projects.locations.bareMetalClusters.bareMetalNodePools)
   */
  def BareMetalNodePool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkeonprem.BareMetalNodePoolArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.gkeonprem.BareMetalNodePoolArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.gkeonprem.BareMetalNodePool(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.gkeonprem.VmwareAdminClusterArgs.Builder)
    /**
     * @param addonNode The VMware admin cluster addon node configuration.
     *  Structure is documented below.
     * @return builder
     */
    def addonNode(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterAddonNodeArgs.Builder]):
        com.pulumi.gcp.gkeonprem.VmwareAdminClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterAddonNodeArgs.builder
      builder.addonNode(args(argsBuilder).build)

    /**
     * @param antiAffinityGroups AAGConfig specifies whether to spread VMware Admin Cluster nodes across at
     *  least three physical hosts in the datacenter.
     *  Structure is documented below.
     * @return builder
     */
    def antiAffinityGroups(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterAntiAffinityGroupsArgs.Builder]):
        com.pulumi.gcp.gkeonprem.VmwareAdminClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterAntiAffinityGroupsArgs.builder
      builder.antiAffinityGroups(args(argsBuilder).build)

    /**
     * @param authorization The VMware admin cluster authorization configuration.
     *  Structure is documented below.
     * @return builder
     */
    def authorization(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterAuthorizationArgs.Builder]):
        com.pulumi.gcp.gkeonprem.VmwareAdminClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterAuthorizationArgs.builder
      builder.authorization(args(argsBuilder).build)

    /**
     * @param autoRepairConfig Configuration for auto repairing.
     *  Structure is documented below.
     * @return builder
     */
    def autoRepairConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterAutoRepairConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.VmwareAdminClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterAutoRepairConfigArgs.builder
      builder.autoRepairConfig(args(argsBuilder).build)

    /**
     * @param controlPlaneNode The VMware admin cluster control plane node configuration.
     *  Structure is documented below.
     * @return builder
     */
    def controlPlaneNode(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterControlPlaneNodeArgs.Builder]):
        com.pulumi.gcp.gkeonprem.VmwareAdminClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterControlPlaneNodeArgs.builder
      builder.controlPlaneNode(args(argsBuilder).build)

    /**
     * @param loadBalancer Specifies the load balancer configuration for VMware admin cluster.
     *  Structure is documented below.
     * @return builder
     */
    def loadBalancer(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterLoadBalancerArgs.Builder]):
        com.pulumi.gcp.gkeonprem.VmwareAdminClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterLoadBalancerArgs.builder
      builder.loadBalancer(args(argsBuilder).build)

    /**
     * @param networkConfig The VMware admin cluster network configuration.
     *  Structure is documented below.
     * @return builder
     */
    def networkConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterNetworkConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.VmwareAdminClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterNetworkConfigArgs.builder
      builder.networkConfig(args(argsBuilder).build)

    /**
     * @param platformConfig The VMware platform configuration.
     *  Structure is documented below.
     * @return builder
     */
    def platformConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterPlatformConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.VmwareAdminClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterPlatformConfigArgs.builder
      builder.platformConfig(args(argsBuilder).build)

    /**
     * @param privateRegistryConfig Configuration for private registry.
     *  Structure is documented below.
     * @return builder
     */
    def privateRegistryConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterPrivateRegistryConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.VmwareAdminClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterPrivateRegistryConfigArgs.builder
      builder.privateRegistryConfig(args(argsBuilder).build)

    /**
     * @param proxy Configuration for proxy.
     *  Structure is documented below.
     * @return builder
     */
    def proxy(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterProxyArgs.Builder]):
        com.pulumi.gcp.gkeonprem.VmwareAdminClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterProxyArgs.builder
      builder.proxy(args(argsBuilder).build)

    /**
     * @param vcenter Specifies vCenter config for the admin cluster.
     *  Structure is documented below.
     * @return builder
     */
    def vcenter(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterVcenterArgs.Builder]):
        com.pulumi.gcp.gkeonprem.VmwareAdminClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterVcenterArgs.builder
      builder.vcenter(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkeonprem.VMwareClusterArgs.Builder)
    /**
     * @param antiAffinityGroups AAGConfig specifies whether to spread VMware User Cluster nodes across at
     *  least three physical hosts in the datacenter.
     *  Structure is documented below.
     * @return builder
     */
    def antiAffinityGroups(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterAntiAffinityGroupsArgs.Builder]):
        com.pulumi.gcp.gkeonprem.VMwareClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterAntiAffinityGroupsArgs.builder
      builder.antiAffinityGroups(args(argsBuilder).build)

    /**
     * @param authorization RBAC policy that will be applied and managed by GKE On-Prem.
     *  Structure is documented below.
     * @return builder
     */
    def authorization(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterAuthorizationArgs.Builder]):
        com.pulumi.gcp.gkeonprem.VMwareClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterAuthorizationArgs.builder
      builder.authorization(args(argsBuilder).build)

    /**
     * @param autoRepairConfig Configuration for auto repairing.
     *  Structure is documented below.
     * @return builder
     */
    def autoRepairConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterAutoRepairConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.VMwareClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterAutoRepairConfigArgs.builder
      builder.autoRepairConfig(args(argsBuilder).build)

    /**
     * @param controlPlaneNode VMware User Cluster control plane nodes must have either 1 or 3 replicas.
     *  Structure is documented below.
     * @return builder
     */
    def controlPlaneNode(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterControlPlaneNodeArgs.Builder]):
        com.pulumi.gcp.gkeonprem.VMwareClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterControlPlaneNodeArgs.builder
      builder.controlPlaneNode(args(argsBuilder).build)

    /**
     * @param dataplaneV2 VmwareDataplaneV2Config specifies configuration for Dataplane V2.
     *  Structure is documented below.
     * @return builder
     */
    def dataplaneV2(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterDataplaneV2Args.Builder]):
        com.pulumi.gcp.gkeonprem.VMwareClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterDataplaneV2Args.builder
      builder.dataplaneV2(args(argsBuilder).build)

    /**
     * @param loadBalancer Load Balancer configuration.
     *  Structure is documented below.
     * @return builder
     */
    def loadBalancer(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterLoadBalancerArgs.Builder]):
        com.pulumi.gcp.gkeonprem.VMwareClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterLoadBalancerArgs.builder
      builder.loadBalancer(args(argsBuilder).build)

    /**
     * @param networkConfig The VMware User Cluster network configuration.
     *  Structure is documented below.
     * @return builder
     */
    def networkConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.VMwareClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigArgs.builder
      builder.networkConfig(args(argsBuilder).build)

    /**
     * @param storage Storage configuration.
     *  Structure is documented below.
     * @return builder
     */
    def storage(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterStorageArgs.Builder]):
        com.pulumi.gcp.gkeonprem.VMwareClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterStorageArgs.builder
      builder.storage(args(argsBuilder).build)

    /**
     * @param upgradePolicy Specifies upgrade policy for the cluster.
     *  Structure is documented below.
     * @return builder
     */
    def upgradePolicy(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterUpgradePolicyArgs.Builder]):
        com.pulumi.gcp.gkeonprem.VMwareClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterUpgradePolicyArgs.builder
      builder.upgradePolicy(args(argsBuilder).build)

    /**
     * @param vcenter VmwareVCenterConfig specifies vCenter config for the user cluster.
     *  Inherited from the admin cluster.
     *  Structure is documented below.
     * @return builder
     */
    def vcenter(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterVcenterArgs.Builder]):
        com.pulumi.gcp.gkeonprem.VMwareClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterVcenterArgs.builder
      builder.vcenter(args(argsBuilder).build)

  /**
   * A Google VMware User Cluster.
   * 
   *  To get more information about VmwareCluster, see:
   * 
   *  * [API documentation](https://cloud.google.com/kubernetes-engine/distributed-cloud/reference/on-prem-api/rest/v1/projects.locations.vmwareClusters)
   */
  def VMwareCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkeonprem.VMwareClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.gkeonprem.VMwareClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.gkeonprem.VMwareCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Google Bare Metal User Cluster.
   * 
   *  To get more information about BareMetalCluster, see:
   * 
   *  * [API documentation](https://cloud.google.com/kubernetes-engine/distributed-cloud/reference/on-prem-api/rest/v1/projects.locations.bareMetalClusters)
   */
  def BareMetalCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkeonprem.BareMetalClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.gkeonprem.BareMetalClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.gkeonprem.BareMetalCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Google Vmware Node Pool.
   * 
   *  To get more information about VmwareNodePool, see:
   * 
   *  * [API documentation](https://cloud.google.com/kubernetes-engine/distributed-cloud/reference/on-prem-api/rest/v1/projects.locations.vmwareClusters.vmwareNodePools)
   */
  def VMwareNodePool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkeonprem.VMwareNodePoolArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.gkeonprem.VMwareNodePoolArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.gkeonprem.VMwareNodePool(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.gkeonprem.VMwareNodePoolArgs.Builder)
    /**
     * @param config The node configuration of the node pool.
     *  Structure is documented below.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareNodePoolConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.VMwareNodePoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareNodePoolConfigArgs.builder
      builder.config(args(argsBuilder).build)

    /**
     * @param nodePoolAutoscaling Node Pool autoscaling config for the node pool.
     *  Structure is documented below.
     * @return builder
     */
    def nodePoolAutoscaling(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareNodePoolNodePoolAutoscalingArgs.Builder]):
        com.pulumi.gcp.gkeonprem.VMwareNodePoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareNodePoolNodePoolAutoscalingArgs.builder
      builder.nodePoolAutoscaling(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkeonprem.BareMetalClusterArgs.Builder)
    /**
     * @param binaryAuthorization Binary Authorization related configurations.
     *  Structure is documented below.
     * @return builder
     */
    def binaryAuthorization(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterBinaryAuthorizationArgs.Builder]):
        com.pulumi.gcp.gkeonprem.BareMetalClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterBinaryAuthorizationArgs.builder
      builder.binaryAuthorization(args(argsBuilder).build)

    /**
     * @param clusterOperations Specifies the User Cluster&#39;s observability infrastructure.
     *  Structure is documented below.
     * @return builder
     */
    def clusterOperations(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterClusterOperationsArgs.Builder]):
        com.pulumi.gcp.gkeonprem.BareMetalClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterClusterOperationsArgs.builder
      builder.clusterOperations(args(argsBuilder).build)

    /**
     * @param controlPlane Specifies the control plane configuration.
     *  Structure is documented below.
     * @return builder
     */
    def controlPlane(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterControlPlaneArgs.Builder]):
        com.pulumi.gcp.gkeonprem.BareMetalClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterControlPlaneArgs.builder
      builder.controlPlane(args(argsBuilder).build)

    /**
     * @param loadBalancer Specifies the load balancer configuration.
     *  Structure is documented below.
     * @return builder
     */
    def loadBalancer(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerArgs.Builder]):
        com.pulumi.gcp.gkeonprem.BareMetalClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerArgs.builder
      builder.loadBalancer(args(argsBuilder).build)

    /**
     * @param maintenanceConfig Specifies the workload node configurations.
     *  Structure is documented below.
     * @return builder
     */
    def maintenanceConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterMaintenanceConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.BareMetalClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterMaintenanceConfigArgs.builder
      builder.maintenanceConfig(args(argsBuilder).build)

    /**
     * @param networkConfig Network configuration.
     *  Structure is documented below.
     * @return builder
     */
    def networkConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterNetworkConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.BareMetalClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterNetworkConfigArgs.builder
      builder.networkConfig(args(argsBuilder).build)

    /**
     * @param nodeAccessConfig Specifies the node access related settings for the bare metal user cluster.
     *  Structure is documented below.
     * @return builder
     */
    def nodeAccessConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterNodeAccessConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.BareMetalClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterNodeAccessConfigArgs.builder
      builder.nodeAccessConfig(args(argsBuilder).build)

    /**
     * @param nodeConfig Specifies the workload node configurations.
     *  Structure is documented below.
     * @return builder
     */
    def nodeConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterNodeConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.BareMetalClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterNodeConfigArgs.builder
      builder.nodeConfig(args(argsBuilder).build)

    /**
     * @param osEnvironmentConfig OS environment related configurations.
     *  Structure is documented below.
     * @return builder
     */
    def osEnvironmentConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterOsEnvironmentConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.BareMetalClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterOsEnvironmentConfigArgs.builder
      builder.osEnvironmentConfig(args(argsBuilder).build)

    /**
     * @param proxy Specifies the cluster proxy configuration.
     *  Structure is documented below.
     * @return builder
     */
    def proxy(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterProxyArgs.Builder]):
        com.pulumi.gcp.gkeonprem.BareMetalClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterProxyArgs.builder
      builder.proxy(args(argsBuilder).build)

    /**
     * @param securityConfig Specifies the security related settings for the Bare Metal User Cluster.
     *  Structure is documented below.
     * @return builder
     */
    def securityConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterSecurityConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.BareMetalClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterSecurityConfigArgs.builder
      builder.securityConfig(args(argsBuilder).build)

    /**
     * @param storage Specifies the cluster storage configuration.
     *  Structure is documented below.
     * @return builder
     */
    def storage(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterStorageArgs.Builder]):
        com.pulumi.gcp.gkeonprem.BareMetalClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterStorageArgs.builder
      builder.storage(args(argsBuilder).build)

    /**
     * @param upgradePolicy The cluster upgrade policy.
     *  Structure is documented below.
     * @return builder
     */
    def upgradePolicy(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterUpgradePolicyArgs.Builder]):
        com.pulumi.gcp.gkeonprem.BareMetalClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterUpgradePolicyArgs.builder
      builder.upgradePolicy(args(argsBuilder).build)

  /**
   * A Google VMware Admin Cluster.
   * 
   *  To get more information about VmwareAdminCluster, see:
   * 
   *  * [API documentation](https://cloud.google.com/kubernetes-engine/distributed-cloud/reference/on-prem-api/rest/v1/projects.locations.vmwareAdminClusters)
   */
  def VmwareAdminCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkeonprem.VmwareAdminClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.gkeonprem.VmwareAdminClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.gkeonprem.VmwareAdminCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.gkeonprem.BareMetalAdminClusterArgs.Builder)
    /**
     * @param clusterOperations Specifies the Admin Cluster&#39;s observability infrastructure.
     *  Structure is documented below.
     * @return builder
     */
    def clusterOperations(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterClusterOperationsArgs.Builder]):
        com.pulumi.gcp.gkeonprem.BareMetalAdminClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterClusterOperationsArgs.builder
      builder.clusterOperations(args(argsBuilder).build)

    /**
     * @param controlPlane Specifies the control plane configuration.
     *  Structure is documented below.
     * @return builder
     */
    def controlPlane(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterControlPlaneArgs.Builder]):
        com.pulumi.gcp.gkeonprem.BareMetalAdminClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterControlPlaneArgs.builder
      builder.controlPlane(args(argsBuilder).build)

    /**
     * @param loadBalancer Specifies the load balancer configuration.
     *  Structure is documented below.
     * @return builder
     */
    def loadBalancer(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerArgs.Builder]):
        com.pulumi.gcp.gkeonprem.BareMetalAdminClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerArgs.builder
      builder.loadBalancer(args(argsBuilder).build)

    /**
     * @param maintenanceConfig Specifies the workload node configurations.
     *  Structure is documented below.
     * @return builder
     */
    def maintenanceConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterMaintenanceConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.BareMetalAdminClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterMaintenanceConfigArgs.builder
      builder.maintenanceConfig(args(argsBuilder).build)

    /**
     * @param networkConfig Network configuration.
     *  Structure is documented below.
     * @return builder
     */
    def networkConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterNetworkConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.BareMetalAdminClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterNetworkConfigArgs.builder
      builder.networkConfig(args(argsBuilder).build)

    /**
     * @param nodeAccessConfig Specifies the node access related settings for the bare metal user cluster.
     *  Structure is documented below.
     * @return builder
     */
    def nodeAccessConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterNodeAccessConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.BareMetalAdminClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterNodeAccessConfigArgs.builder
      builder.nodeAccessConfig(args(argsBuilder).build)

    /**
     * @param nodeConfig Specifies the workload node configurations.
     *  Structure is documented below.
     * @return builder
     */
    def nodeConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterNodeConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.BareMetalAdminClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterNodeConfigArgs.builder
      builder.nodeConfig(args(argsBuilder).build)

    /**
     * @param proxy Specifies the cluster proxy configuration.
     *  Structure is documented below.
     * @return builder
     */
    def proxy(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterProxyArgs.Builder]):
        com.pulumi.gcp.gkeonprem.BareMetalAdminClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterProxyArgs.builder
      builder.proxy(args(argsBuilder).build)

    /**
     * @param securityConfig Specifies the security related settings for the Bare Metal User Cluster.
     *  Structure is documented below.
     * @return builder
     */
    def securityConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterSecurityConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.BareMetalAdminClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterSecurityConfigArgs.builder
      builder.securityConfig(args(argsBuilder).build)

    /**
     * @param storage Specifies the cluster storage configuration.
     *  Structure is documented below.
     * @return builder
     */
    def storage(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterStorageArgs.Builder]):
        com.pulumi.gcp.gkeonprem.BareMetalAdminClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterStorageArgs.builder
      builder.storage(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterStatusArgs.Builder)
    /**
     * @param conditions (Output)
     *  ResourceConditions provide a standard mechanism for higher-level status reporting from admin cluster controller.
     *  Structure is documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterStatusConditionArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterStatusConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerArgs.Builder)
    /**
     * @param bgpLbConfig A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def bgpLbConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerBgpLbConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerBgpLbConfigArgs.builder
      builder.bgpLbConfig(args(argsBuilder).build)

    /**
     * @param manualLbConfig A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def manualLbConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerManualLbConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerManualLbConfigArgs.builder
      builder.manualLbConfig(args(argsBuilder).build)

    /**
     * @param portConfig Specifies the load balancer ports.
     *  Structure is documented below.
     * @return builder
     */
    def portConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerPortConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerPortConfigArgs.builder
      builder.portConfig(args(argsBuilder).build)

    /**
     * @param vipConfig Specified the Bare Metal Load Balancer Config
     *  Structure is documented below.
     * @return builder
     */
    def vipConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerVipConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerVipConfigArgs.builder
      builder.vipConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterLoadBalancerArgs.Builder)
    /**
     * @param f5Config Configuration for F5 Big IP typed load balancers.
     *  Structure is documented below.
     * @return builder
     */
    def f5Config(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterLoadBalancerF5ConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterLoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterLoadBalancerF5ConfigArgs.builder
      builder.f5Config(args(argsBuilder).build)

    /**
     * @param manualLbConfig Manually configured load balancers.
     *  Structure is documented below.
     * @return builder
     */
    def manualLbConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterLoadBalancerManualLbConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterLoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterLoadBalancerManualLbConfigArgs.builder
      builder.manualLbConfig(args(argsBuilder).build)

    /**
     * @param metalLbConfig Metal LB load balancers.
     *  Structure is documented below.
     * @return builder
     */
    def metalLbConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterLoadBalancerMetalLbConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterLoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterLoadBalancerMetalLbConfigArgs.builder
      builder.metalLbConfig(args(argsBuilder).build)

    /**
     * @param vipConfig Specified the VMware Load Balancer Config
     *  Structure is documented below.
     * @return builder
     */
    def vipConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterLoadBalancerVipConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterLoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterLoadBalancerVipConfigArgs.builder
      builder.vipConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerMetalLbConfigLoadBalancerNodePoolConfigArgs.Builder)
    /**
     * @param nodePoolConfig The generic configuration for a node pool running a load balancer.
     *  Structure is documented below.
     * @return builder
     */
    def nodePoolConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerMetalLbConfigLoadBalancerNodePoolConfigNodePoolConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerMetalLbConfigLoadBalancerNodePoolConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerMetalLbConfigLoadBalancerNodePoolConfigNodePoolConfigArgs.builder
      builder.nodePoolConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterState.Builder)
    /**
     * @param addonNode The VMware admin cluster addon node configuration.
     *  Structure is documented below.
     * @return builder
     */
    def addonNode(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterAddonNodeArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterAddonNodeArgs.builder
      builder.addonNode(args(argsBuilder).build)

    /**
     * @param antiAffinityGroups AAGConfig specifies whether to spread VMware Admin Cluster nodes across at
     *  least three physical hosts in the datacenter.
     *  Structure is documented below.
     * @return builder
     */
    def antiAffinityGroups(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterAntiAffinityGroupsArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterAntiAffinityGroupsArgs.builder
      builder.antiAffinityGroups(args(argsBuilder).build)

    /**
     * @param authorization The VMware admin cluster authorization configuration.
     *  Structure is documented below.
     * @return builder
     */
    def authorization(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterAuthorizationArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterAuthorizationArgs.builder
      builder.authorization(args(argsBuilder).build)

    /**
     * @param autoRepairConfig Configuration for auto repairing.
     *  Structure is documented below.
     * @return builder
     */
    def autoRepairConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterAutoRepairConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterAutoRepairConfigArgs.builder
      builder.autoRepairConfig(args(argsBuilder).build)

    /**
     * @param controlPlaneNode The VMware admin cluster control plane node configuration.
     *  Structure is documented below.
     * @return builder
     */
    def controlPlaneNode(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterControlPlaneNodeArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterControlPlaneNodeArgs.builder
      builder.controlPlaneNode(args(argsBuilder).build)

    /**
     * @param fleets Fleet configuration for the cluster.
     *  Structure is documented below.
     * @return builder
     */
    def fleets(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterFleetArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterFleetArgs.builder
      builder.fleets(args.map(_(argsBuilder).build)*)

    /**
     * @param loadBalancer Specifies the load balancer configuration for VMware admin cluster.
     *  Structure is documented below.
     * @return builder
     */
    def loadBalancer(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterLoadBalancerArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterLoadBalancerArgs.builder
      builder.loadBalancer(args(argsBuilder).build)

    /**
     * @param networkConfig The VMware admin cluster network configuration.
     *  Structure is documented below.
     * @return builder
     */
    def networkConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterNetworkConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterNetworkConfigArgs.builder
      builder.networkConfig(args(argsBuilder).build)

    /**
     * @param platformConfig The VMware platform configuration.
     *  Structure is documented below.
     * @return builder
     */
    def platformConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterPlatformConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterPlatformConfigArgs.builder
      builder.platformConfig(args(argsBuilder).build)

    /**
     * @param privateRegistryConfig Configuration for private registry.
     *  Structure is documented below.
     * @return builder
     */
    def privateRegistryConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterPrivateRegistryConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterPrivateRegistryConfigArgs.builder
      builder.privateRegistryConfig(args(argsBuilder).build)

    /**
     * @param proxy Configuration for proxy.
     *  Structure is documented below.
     * @return builder
     */
    def proxy(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterProxyArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterProxyArgs.builder
      builder.proxy(args(argsBuilder).build)

    /**
     * @param statuses ResourceStatus representing detailed cluster state.
     *  Structure is documented below.
     * @return builder
     */
    def statuses(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterStatusArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterStatusArgs.builder
      builder.statuses(args.map(_(argsBuilder).build)*)

    /**
     * @param vcenter Specifies vCenter config for the admin cluster.
     *  Structure is documented below.
     * @return builder
     */
    def vcenter(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterVcenterArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterVcenterArgs.builder
      builder.vcenter(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterControlPlaneArgs.Builder)
    /**
     * @param apiServerArgs Customizes the default API server args. Only a subset of
     *  customized flags are supported. Please refer to the API server
     *  documentation below to know the exact format:
     *  https://kubernetes.io/docs/reference/command-line-tools-reference/kube-apiserver/
     *  Structure is documented below.
     * @return builder
     */
    def apiServerArgs(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterControlPlaneApiServerArgArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterControlPlaneArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterControlPlaneApiServerArgArgs.builder
      builder.apiServerArgs(args.map(_(argsBuilder).build)*)

    /**
     * @param controlPlaneNodePoolConfig Configures the node pool running the control plane. If specified the corresponding NodePool will be created for the cluster&#39;s control plane. The NodePool will have the same name and namespace as the cluster.
     *  Structure is documented below.
     * @return builder
     */
    def controlPlaneNodePoolConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterControlPlaneControlPlaneNodePoolConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterControlPlaneArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterControlPlaneControlPlaneNodePoolConfigArgs.builder
      builder.controlPlaneNodePoolConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterSecurityConfigArgs.Builder)
    /**
     * @param authorization Configures user access to the Bare Metal User cluster.
     *  Structure is documented below.
     * @return builder
     */
    def authorization(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterSecurityConfigAuthorizationArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterSecurityConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterSecurityConfigAuthorizationArgs.builder
      builder.authorization(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterPlatformConfigBundleArgs.Builder)
    /**
     * @param statuses ResourceStatus representing detailed cluster state.
     *  Structure is documented below.
     * @return builder
     */
    def statuses(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterPlatformConfigBundleStatusArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterPlatformConfigBundleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterPlatformConfigBundleStatusArgs.builder
      builder.statuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterState.Builder)
    /**
     * @param clusterOperations Specifies the Admin Cluster&#39;s observability infrastructure.
     *  Structure is documented below.
     * @return builder
     */
    def clusterOperations(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterClusterOperationsArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterClusterOperationsArgs.builder
      builder.clusterOperations(args(argsBuilder).build)

    /**
     * @param controlPlane Specifies the control plane configuration.
     *  Structure is documented below.
     * @return builder
     */
    def controlPlane(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterControlPlaneArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterControlPlaneArgs.builder
      builder.controlPlane(args(argsBuilder).build)

    /**
     * @param fleets Fleet related configuration.
     *  Fleets are a Google Cloud concept for logically organizing clusters,
     *  letting you use and manage multi-cluster capabilities and apply
     *  consistent policies across your systems.
     *  See [Anthos Fleets](https://cloud.google.com/anthos/multicluster-management/fleets) for
     *  more details on Anthos multi-cluster capabilities using Fleets.
     *  Structure is documented below.
     * @return builder
     */
    def fleets(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterFleetArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterFleetArgs.builder
      builder.fleets(args.map(_(argsBuilder).build)*)

    /**
     * @param loadBalancer Specifies the load balancer configuration.
     *  Structure is documented below.
     * @return builder
     */
    def loadBalancer(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerArgs.builder
      builder.loadBalancer(args(argsBuilder).build)

    /**
     * @param maintenanceConfig Specifies the workload node configurations.
     *  Structure is documented below.
     * @return builder
     */
    def maintenanceConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterMaintenanceConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterMaintenanceConfigArgs.builder
      builder.maintenanceConfig(args(argsBuilder).build)

    /**
     * @param networkConfig Network configuration.
     *  Structure is documented below.
     * @return builder
     */
    def networkConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterNetworkConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterNetworkConfigArgs.builder
      builder.networkConfig(args(argsBuilder).build)

    /**
     * @param nodeAccessConfig Specifies the node access related settings for the bare metal user cluster.
     *  Structure is documented below.
     * @return builder
     */
    def nodeAccessConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterNodeAccessConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterNodeAccessConfigArgs.builder
      builder.nodeAccessConfig(args(argsBuilder).build)

    /**
     * @param nodeConfig Specifies the workload node configurations.
     *  Structure is documented below.
     * @return builder
     */
    def nodeConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterNodeConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterNodeConfigArgs.builder
      builder.nodeConfig(args(argsBuilder).build)

    /**
     * @param proxy Specifies the cluster proxy configuration.
     *  Structure is documented below.
     * @return builder
     */
    def proxy(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterProxyArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterProxyArgs.builder
      builder.proxy(args(argsBuilder).build)

    /**
     * @param securityConfig Specifies the security related settings for the Bare Metal User Cluster.
     *  Structure is documented below.
     * @return builder
     */
    def securityConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterSecurityConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterSecurityConfigArgs.builder
      builder.securityConfig(args(argsBuilder).build)

    /**
     * @param statuses (Output)
     *  Specifies the detailed validation check status
     *  Structure is documented below.
     * @return builder
     */
    def statuses(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterStatusArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterStatusArgs.builder
      builder.statuses(args.map(_(argsBuilder).build)*)

    /**
     * @param storage Specifies the cluster storage configuration.
     *  Structure is documented below.
     * @return builder
     */
    def storage(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterStorageArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterStorageArgs.builder
      builder.storage(args(argsBuilder).build)

    /**
     * @param validationChecks Specifies the security related settings for the Bare Metal Admin Cluster.
     *  Structure is documented below.
     * @return builder
     */
    def validationChecks(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterValidationCheckArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterValidationCheckArgs.builder
      builder.validationChecks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterSecurityConfigArgs.Builder)
    /**
     * @param authorization Configures user access to the Bare Metal User cluster.
     *  Structure is documented below.
     * @return builder
     */
    def authorization(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterSecurityConfigAuthorizationArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterSecurityConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterSecurityConfigAuthorizationArgs.builder
      builder.authorization(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigNodePoolConfigArgs.Builder)
    /**
     * @param kubeletConfig The modifiable kubelet configurations for the baremetal machines.
     *  Structure is documented below.
     * @return builder
     */
    def kubeletConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigNodePoolConfigKubeletConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigNodePoolConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigNodePoolConfigKubeletConfigArgs.builder
      builder.kubeletConfig(args(argsBuilder).build)

    /**
     * @param nodeConfigs The list of machine addresses in the Bare Metal Node Pool.
     *  Structure is documented below.
     * @return builder
     */
    def nodeConfigs(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigNodePoolConfigNodeConfigArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigNodePoolConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigNodePoolConfigNodeConfigArgs.builder
      builder.nodeConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param taints The initial taints assigned to nodes of this node pool.
     *  Structure is documented below.
     * @return builder
     */
    def taints(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigNodePoolConfigTaintArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigNodePoolConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigNodePoolConfigTaintArgs.builder
      builder.taints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterValidationCheckStatusArgs.Builder)
    /**
     * @param results (Output)
     *  Individual checks which failed as part of the Preflight check execution.
     *  Structure is documented below.
     * @return builder
     */
    def results(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterValidationCheckStatusResultArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterValidationCheckStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterValidationCheckStatusResultArgs.builder
      builder.results(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerBgpLbConfigArgs.Builder)
    /**
     * @param addressPools AddressPools is a list of non-overlapping IP pools used by load balancer
     *  typed services. All addresses must be routable to load balancer nodes.
     *  IngressVIP must be included in the pools.
     *  Structure is documented below.
     * @return builder
     */
    def addressPools(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerBgpLbConfigAddressPoolArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerBgpLbConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerBgpLbConfigAddressPoolArgs.builder
      builder.addressPools(args.map(_(argsBuilder).build)*)

    /**
     * @param bgpPeerConfigs The list of BGP peers that the cluster will connect to.
     *  At least one peer must be configured for each control plane node.
     *  Control plane nodes will connect to these peers to advertise the control
     *  plane VIP. The Services load balancer also uses these peers by default.
     *  This field can be updated after cluster creation.
     *  Structure is documented below.
     * @return builder
     */
    def bgpPeerConfigs(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerBgpLbConfigBgpPeerConfigArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerBgpLbConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerBgpLbConfigBgpPeerConfigArgs.builder
      builder.bgpPeerConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param loadBalancerNodePoolConfig Specifies the node pool running data plane load balancing. L2 connectivity
     *  is required among nodes in this pool. If missing, the control plane node
     *  pool is used for data plane load balancing.
     *  Structure is documented below.
     * @return builder
     */
    def loadBalancerNodePoolConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerBgpLbConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigArgs.builder
      builder.loadBalancerNodePoolConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterControlPlaneControlPlaneNodePoolConfigArgs.Builder)
    /**
     * @param nodePoolConfig The generic configuration for a node pool running the control plane.
     *  Structure is documented below.
     * @return builder
     */
    def nodePoolConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterControlPlaneControlPlaneNodePoolConfigNodePoolConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterControlPlaneControlPlaneNodePoolConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterControlPlaneControlPlaneNodePoolConfigNodePoolConfigArgs.builder
      builder.nodePoolConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterStorageArgs.Builder)
    /**
     * @param lvpNodeMountsConfig Specifies the config for local PersistentVolumes backed
     *  by mounted node disks. These disks need to be formatted and mounted by the
     *  user, which can be done before or after cluster creation.
     *  Structure is documented below.
     * @return builder
     */
    def lvpNodeMountsConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterStorageLvpNodeMountsConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterStorageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterStorageLvpNodeMountsConfigArgs.builder
      builder.lvpNodeMountsConfig(args(argsBuilder).build)

    /**
     * @param lvpShareConfig Specifies the config for local PersistentVolumes backed by
     *  subdirectories in a shared filesystem. These subdirectores are
     *  automatically created during cluster creation.
     *  Structure is documented below.
     * @return builder
     */
    def lvpShareConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterStorageLvpShareConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterStorageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterStorageLvpShareConfigArgs.builder
      builder.lvpShareConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterNetworkConfigHaControlPlaneConfigControlPlaneIpBlockArgs.Builder)
    /**
     * @param ips The node&#39;s network configurations used by the VMware Admin Cluster.
     *  Structure is documented below.
     * @return builder
     */
    def ips(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterNetworkConfigHaControlPlaneConfigControlPlaneIpBlockIpArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterNetworkConfigHaControlPlaneConfigControlPlaneIpBlockArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterNetworkConfigHaControlPlaneConfigControlPlaneIpBlockIpArgs.builder
      builder.ips(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.VMwareClusterLoadBalancerMetalLbConfigArgs.Builder)
    /**
     * @param addressPools AddressPools is a list of non-overlapping IP pools used by load balancer
     *  typed services. All addresses must be routable to load balancer nodes.
     *  IngressVIP must be included in the pools.
     *  Structure is documented below.
     * @return builder
     */
    def addressPools(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterLoadBalancerMetalLbConfigAddressPoolArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.VMwareClusterLoadBalancerMetalLbConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterLoadBalancerMetalLbConfigAddressPoolArgs.builder
      builder.addressPools(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.VMwareClusterLoadBalancerArgs.Builder)
    /**
     * @param f5Config Configuration for F5 Big IP typed load balancers.
     *  Structure is documented below.
     * @return builder
     */
    def f5Config(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterLoadBalancerF5ConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VMwareClusterLoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterLoadBalancerF5ConfigArgs.builder
      builder.f5Config(args(argsBuilder).build)

    /**
     * @param manualLbConfig Manually configured load balancers.
     *  Structure is documented below.
     * @return builder
     */
    def manualLbConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterLoadBalancerManualLbConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VMwareClusterLoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterLoadBalancerManualLbConfigArgs.builder
      builder.manualLbConfig(args(argsBuilder).build)

    /**
     * @param metalLbConfig Configuration for MetalLB typed load balancers.
     *  Structure is documented below.
     * @return builder
     */
    def metalLbConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterLoadBalancerMetalLbConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VMwareClusterLoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterLoadBalancerMetalLbConfigArgs.builder
      builder.metalLbConfig(args(argsBuilder).build)

    /**
     * @param vipConfig The VIPs used by the load balancer.
     *  Structure is documented below.
     * @return builder
     */
    def vipConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterLoadBalancerVipConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VMwareClusterLoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterLoadBalancerVipConfigArgs.builder
      builder.vipConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterAddonNodeArgs.Builder)
    /**
     * @param autoResizeConfig Specifies auto resize config.
     *  Structure is documented below.
     * @return builder
     */
    def autoResizeConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterAddonNodeAutoResizeConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterAddonNodeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterAddonNodeAutoResizeConfigArgs.builder
      builder.autoResizeConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterControlPlaneControlPlaneNodePoolConfigNodePoolConfigArgs.Builder)
    /**
     * @param nodeConfigs The list of machine addresses in the Bare Metal Node Pool.
     *  Structure is documented below.
     * @return builder
     */
    def nodeConfigs(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterControlPlaneControlPlaneNodePoolConfigNodePoolConfigNodeConfigArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterControlPlaneControlPlaneNodePoolConfigNodePoolConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterControlPlaneControlPlaneNodePoolConfigNodePoolConfigNodeConfigArgs.builder
      builder.nodeConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param taints The initial taints assigned to nodes of this node pool.
     *  Structure is documented below.
     * @return builder
     */
    def taints(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterControlPlaneControlPlaneNodePoolConfigNodePoolConfigTaintArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterControlPlaneControlPlaneNodePoolConfigNodePoolConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterControlPlaneControlPlaneNodePoolConfigNodePoolConfigTaintArgs.builder
      builder.taints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.VMwareClusterControlPlaneNodeArgs.Builder)
    /**
     * @param autoResizeConfig AutoResizeConfig provides auto resizing configurations.
     *  Structure is documented below.
     * @return builder
     */
    def autoResizeConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterControlPlaneNodeAutoResizeConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VMwareClusterControlPlaneNodeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterControlPlaneNodeAutoResizeConfigArgs.builder
      builder.autoResizeConfig(args(argsBuilder).build)

    /**
     * @param vsphereConfigs (Output)
     *  Vsphere-specific config.
     *  Structure is documented below.
     * @return builder
     */
    def vsphereConfigs(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterControlPlaneNodeVsphereConfigArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.VMwareClusterControlPlaneNodeArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterControlPlaneNodeVsphereConfigArgs.builder
      builder.vsphereConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigArgs.Builder)
    /**
     * @param nodePoolConfig The generic configuration for a node pool running a load balancer.
     *  Structure is documented below.
     * @return builder
     */
    def nodePoolConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigNodePoolConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigNodePoolConfigArgs.builder
      builder.nodePoolConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterStatusArgs.Builder)
    /**
     * @param conditions (Output)
     *  ResourceConditions provide a standard mechanism for higher-level status reporting from admin cluster controller.
     *  Structure is documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterStatusConditionArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterStatusConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterNetworkConfigStaticIpConfigArgs.Builder)
    /**
     * @param ipBlocks Represents the configuration values for static IP allocation to nodes.
     *  Structure is documented below.
     * @return builder
     */
    def ipBlocks(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterNetworkConfigStaticIpConfigIpBlockArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterNetworkConfigStaticIpConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterNetworkConfigStaticIpConfigIpBlockArgs.builder
      builder.ipBlocks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.VMwareClusterValidationCheckArgs.Builder)
    /**
     * @param statuses (Output)
     *  Specifies the detailed validation check status
     *  Structure is documented below.
     * @return builder
     */
    def statuses(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterValidationCheckStatusArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.VMwareClusterValidationCheckArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterValidationCheckStatusArgs.builder
      builder.statuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerMetalLbConfigLoadBalancerNodePoolConfigNodePoolConfigArgs.Builder)
    /**
     * @param nodeConfigs The list of machine addresses in the Bare Metal Node Pool.
     *  Structure is documented below.
     * @return builder
     */
    def nodeConfigs(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerMetalLbConfigLoadBalancerNodePoolConfigNodePoolConfigNodeConfigArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerMetalLbConfigLoadBalancerNodePoolConfigNodePoolConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerMetalLbConfigLoadBalancerNodePoolConfigNodePoolConfigNodeConfigArgs.builder
      builder.nodeConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param taints The initial taints assigned to nodes of this node pool.
     *  Structure is documented below.
     * @return builder
     */
    def taints(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerMetalLbConfigLoadBalancerNodePoolConfigNodePoolConfigTaintArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerMetalLbConfigLoadBalancerNodePoolConfigNodePoolConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerMetalLbConfigLoadBalancerNodePoolConfigNodePoolConfigTaintArgs.builder
      builder.taints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigArgs.Builder)
    /**
     * @param nodePoolConfig The generic configuration for a node pool running the control plane.
     *  Structure is documented below.
     * @return builder
     */
    def nodePoolConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigNodePoolConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigNodePoolConfigArgs.builder
      builder.nodePoolConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterPlatformConfigArgs.Builder)
    /**
     * @param bundles (Output)
     *  The list of bundles installed in the admin cluster.
     *  Structure is documented below.
     * @return builder
     */
    def bundles(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterPlatformConfigBundleArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterPlatformConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterPlatformConfigBundleArgs.builder
      builder.bundles(args.map(_(argsBuilder).build)*)

    /**
     * @param statuses (Output)
     *  ResourceStatus representing detailed cluster state.
     *  Structure is documented below.
     * 
     *  &lt;a name=&#34;nestedPlatformConfigBundlesStatus&#34;&gt;&lt;/a&gt;The `status` block contains:
     * @return builder
     */
    def statuses(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterPlatformConfigStatusArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterPlatformConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterPlatformConfigStatusArgs.builder
      builder.statuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigControlPlaneV2ConfigControlPlaneIpBlockArgs.Builder)
    /**
     * @param ips The node&#39;s network configurations used by the VMware User Cluster.
     *  Structure is documented below.
     * @return builder
     */
    def ips(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigControlPlaneV2ConfigControlPlaneIpBlockIpArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigControlPlaneV2ConfigControlPlaneIpBlockArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigControlPlaneV2ConfigControlPlaneIpBlockIpArgs.builder
      builder.ips(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.VMwareClusterState.Builder)
    /**
     * @param antiAffinityGroups AAGConfig specifies whether to spread VMware User Cluster nodes across at
     *  least three physical hosts in the datacenter.
     *  Structure is documented below.
     * @return builder
     */
    def antiAffinityGroups(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterAntiAffinityGroupsArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VMwareClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterAntiAffinityGroupsArgs.builder
      builder.antiAffinityGroups(args(argsBuilder).build)

    /**
     * @param authorization RBAC policy that will be applied and managed by GKE On-Prem.
     *  Structure is documented below.
     * @return builder
     */
    def authorization(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterAuthorizationArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VMwareClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterAuthorizationArgs.builder
      builder.authorization(args(argsBuilder).build)

    /**
     * @param autoRepairConfig Configuration for auto repairing.
     *  Structure is documented below.
     * @return builder
     */
    def autoRepairConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterAutoRepairConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VMwareClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterAutoRepairConfigArgs.builder
      builder.autoRepairConfig(args(argsBuilder).build)

    /**
     * @param controlPlaneNode VMware User Cluster control plane nodes must have either 1 or 3 replicas.
     *  Structure is documented below.
     * @return builder
     */
    def controlPlaneNode(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterControlPlaneNodeArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VMwareClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterControlPlaneNodeArgs.builder
      builder.controlPlaneNode(args(argsBuilder).build)

    /**
     * @param dataplaneV2 VmwareDataplaneV2Config specifies configuration for Dataplane V2.
     *  Structure is documented below.
     * @return builder
     */
    def dataplaneV2(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterDataplaneV2Args.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VMwareClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterDataplaneV2Args.builder
      builder.dataplaneV2(args(argsBuilder).build)

    /**
     * @param fleets Fleet configuration for the cluster.
     *  Structure is documented below.
     * @return builder
     */
    def fleets(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterFleetArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.VMwareClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterFleetArgs.builder
      builder.fleets(args.map(_(argsBuilder).build)*)

    /**
     * @param loadBalancer Load Balancer configuration.
     *  Structure is documented below.
     * @return builder
     */
    def loadBalancer(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterLoadBalancerArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VMwareClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterLoadBalancerArgs.builder
      builder.loadBalancer(args(argsBuilder).build)

    /**
     * @param networkConfig The VMware User Cluster network configuration.
     *  Structure is documented below.
     * @return builder
     */
    def networkConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VMwareClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigArgs.builder
      builder.networkConfig(args(argsBuilder).build)

    /**
     * @param statuses (Output)
     *  Specifies the detailed validation check status
     *  Structure is documented below.
     * @return builder
     */
    def statuses(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterStatusArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.VMwareClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterStatusArgs.builder
      builder.statuses(args.map(_(argsBuilder).build)*)

    /**
     * @param storage Storage configuration.
     *  Structure is documented below.
     * @return builder
     */
    def storage(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterStorageArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VMwareClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterStorageArgs.builder
      builder.storage(args(argsBuilder).build)

    /**
     * @param upgradePolicy Specifies upgrade policy for the cluster.
     *  Structure is documented below.
     * @return builder
     */
    def upgradePolicy(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterUpgradePolicyArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VMwareClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterUpgradePolicyArgs.builder
      builder.upgradePolicy(args(argsBuilder).build)

    /**
     * @param validationChecks ValidationCheck represents the result of the preflight check job.
     *  Structure is documented below.
     * @return builder
     */
    def validationChecks(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterValidationCheckArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.VMwareClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterValidationCheckArgs.builder
      builder.validationChecks(args.map(_(argsBuilder).build)*)

    /**
     * @param vcenter VmwareVCenterConfig specifies vCenter config for the user cluster.
     *  Inherited from the admin cluster.
     *  Structure is documented below.
     * @return builder
     */
    def vcenter(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterVcenterArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VMwareClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterVcenterArgs.builder
      builder.vcenter(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.VMwareNodePoolState.Builder)
    /**
     * @param config The node configuration of the node pool.
     *  Structure is documented below.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareNodePoolConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VMwareNodePoolState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareNodePoolConfigArgs.builder
      builder.config(args(argsBuilder).build)

    /**
     * @param nodePoolAutoscaling Node Pool autoscaling config for the node pool.
     *  Structure is documented below.
     * @return builder
     */
    def nodePoolAutoscaling(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareNodePoolNodePoolAutoscalingArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VMwareNodePoolState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareNodePoolNodePoolAutoscalingArgs.builder
      builder.nodePoolAutoscaling(args(argsBuilder).build)

    /**
     * @param statuses ResourceStatus representing detailed cluster state.
     *  Structure is documented below.
     * @return builder
     */
    def statuses(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareNodePoolStatusArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.VMwareNodePoolState.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareNodePoolStatusArgs.builder
      builder.statuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigStaticIpConfigIpBlockArgs.Builder)
    /**
     * @param ips The node&#39;s network configurations used by the VMware User Cluster.
     *  Structure is documented below.
     * @return builder
     */
    def ips(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigStaticIpConfigIpBlockIpArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigStaticIpConfigIpBlockArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigStaticIpConfigIpBlockIpArgs.builder
      builder.ips(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterStorageLvpShareConfigArgs.Builder)
    /**
     * @param lvpConfig Defines the machine path and storage class for the LVP Share.
     *  Structure is documented below.
     * @return builder
     */
    def lvpConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterStorageLvpShareConfigLvpConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterStorageLvpShareConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterStorageLvpShareConfigLvpConfigArgs.builder
      builder.lvpConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterNetworkConfigArgs.Builder)
    /**
     * @param islandModeCidr A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def islandModeCidr(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterNetworkConfigIslandModeCidrArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterNetworkConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterNetworkConfigIslandModeCidrArgs.builder
      builder.islandModeCidr(args(argsBuilder).build)

    /**
     * @param multipleNetworkInterfacesConfig Configuration for multiple network interfaces.
     *  Structure is documented below.
     * @return builder
     */
    def multipleNetworkInterfacesConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterNetworkConfigMultipleNetworkInterfacesConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterNetworkConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterNetworkConfigMultipleNetworkInterfacesConfigArgs.builder
      builder.multipleNetworkInterfacesConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterAuthorizationArgs.Builder)
    /**
     * @param viewerUsers Users that will be granted the cluster-admin role on the cluster, providing
     *  full access to the cluster.
     *  Structure is documented below.
     * @return builder
     */
    def viewerUsers(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterAuthorizationViewerUserArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterAuthorizationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterAuthorizationViewerUserArgs.builder
      builder.viewerUsers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigArgs.Builder)
    /**
     * @param controlPlaneV2Config Configuration for control plane V2 mode.
     *  Structure is documented below.
     * @return builder
     */
    def controlPlaneV2Config(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigControlPlaneV2ConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigControlPlaneV2ConfigArgs.builder
      builder.controlPlaneV2Config(args(argsBuilder).build)

    /**
     * @param dhcpIpConfig Configuration settings for a DHCP IP configuration.
     *  Structure is documented below.
     * @return builder
     */
    def dhcpIpConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigDhcpIpConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigDhcpIpConfigArgs.builder
      builder.dhcpIpConfig(args(argsBuilder).build)

    /**
     * @param hostConfig Represents common network settings irrespective of the host&#39;s IP address.
     *  Structure is documented below.
     * @return builder
     */
    def hostConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigHostConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigHostConfigArgs.builder
      builder.hostConfig(args(argsBuilder).build)

    /**
     * @param staticIpConfig Configuration settings for a static IP configuration.
     *  Structure is documented below.
     * @return builder
     */
    def staticIpConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigStaticIpConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigStaticIpConfigArgs.builder
      builder.staticIpConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterPlatformConfigStatusArgs.Builder)
    /**
     * @param conditions (Output)
     *  ResourceConditions provide a standard mechanism for higher-level status reporting from admin cluster controller.
     *  Structure is documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterPlatformConfigStatusConditionArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterPlatformConfigStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterPlatformConfigStatusConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigStaticIpConfigArgs.Builder)
    /**
     * @param ipBlocks Represents the configuration values for static IP allocation to nodes.
     *  Structure is documented below.
     * @return builder
     */
    def ipBlocks(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigStaticIpConfigIpBlockArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigStaticIpConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigStaticIpConfigIpBlockArgs.builder
      builder.ipBlocks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterStorageLvpShareConfigArgs.Builder)
    /**
     * @param lvpConfig Defines the machine path and storage class for the LVP Share.
     *  Structure is documented below.
     * @return builder
     */
    def lvpConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterStorageLvpShareConfigLvpConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterStorageLvpShareConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterStorageLvpShareConfigLvpConfigArgs.builder
      builder.lvpConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterNetworkConfigArgs.Builder)
    /**
     * @param islandModeCidr A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def islandModeCidr(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterNetworkConfigIslandModeCidrArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterNetworkConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterNetworkConfigIslandModeCidrArgs.builder
      builder.islandModeCidr(args(argsBuilder).build)

    /**
     * @param multipleNetworkInterfacesConfig Configuration for multiple network interfaces.
     *  Structure is documented below.
     * @return builder
     */
    def multipleNetworkInterfacesConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterNetworkConfigMultipleNetworkInterfacesConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterNetworkConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterNetworkConfigMultipleNetworkInterfacesConfigArgs.builder
      builder.multipleNetworkInterfacesConfig(args(argsBuilder).build)

    /**
     * @param srIovConfig Configuration for SR-IOV.
     *  Structure is documented below.
     * @return builder
     */
    def srIovConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterNetworkConfigSrIovConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterNetworkConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterNetworkConfigSrIovConfigArgs.builder
      builder.srIovConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterValidationCheckArgs.Builder)
    /**
     * @param statuses (Output)
     *  Specifies the detailed validation check status
     *  Structure is documented below.
     * @return builder
     */
    def statuses(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterValidationCheckStatusArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterValidationCheckArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterValidationCheckStatusArgs.builder
      builder.statuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterPlatformConfigBundleStatusArgs.Builder)
    /**
     * @param conditions (Output)
     *  ResourceConditions provide a standard mechanism for higher-level status reporting from admin cluster controller.
     *  Structure is documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterPlatformConfigBundleStatusConditionArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterPlatformConfigBundleStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterPlatformConfigBundleStatusConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigControlPlaneV2ConfigArgs.Builder)
    /**
     * @param controlPlaneIpBlock Static IP addresses for the control plane nodes.
     * @return builder
     */
    def controlPlaneIpBlock(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigControlPlaneV2ConfigControlPlaneIpBlockArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigControlPlaneV2ConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigControlPlaneV2ConfigControlPlaneIpBlockArgs.builder
      builder.controlPlaneIpBlock(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterStorageArgs.Builder)
    /**
     * @param lvpNodeMountsConfig Specifies the config for local PersistentVolumes backed
     *  by mounted node disks. These disks need to be formatted and mounted by the
     *  user, which can be done before or after cluster creation.
     *  Structure is documented below.
     * @return builder
     */
    def lvpNodeMountsConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterStorageLvpNodeMountsConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterStorageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterStorageLvpNodeMountsConfigArgs.builder
      builder.lvpNodeMountsConfig(args(argsBuilder).build)

    /**
     * @param lvpShareConfig Specifies the config for local PersistentVolumes backed by
     *  subdirectories in a shared filesystem. These subdirectores are
     *  automatically created during cluster creation.
     *  Structure is documented below.
     * @return builder
     */
    def lvpShareConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterStorageLvpShareConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterStorageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterStorageLvpShareConfigArgs.builder
      builder.lvpShareConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterControlPlaneArgs.Builder)
    /**
     * @param apiServerArgs Customizes the default API server args. Only a subset of
     *  customized flags are supported. Please refer to the API server
     *  documentation below to know the exact format:
     *  https://kubernetes.io/docs/reference/command-line-tools-reference/kube-apiserver/
     *  Structure is documented below.
     * @return builder
     */
    def apiServerArgs(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterControlPlaneApiServerArgArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterControlPlaneArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterControlPlaneApiServerArgArgs.builder
      builder.apiServerArgs(args.map(_(argsBuilder).build)*)

    /**
     * @param controlPlaneNodePoolConfig Configures the node pool running the control plane. If specified the corresponding NodePool will be created for the cluster&#39;s control plane. The NodePool will have the same name and namespace as the cluster.
     *  Structure is documented below.
     * @return builder
     */
    def controlPlaneNodePoolConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterControlPlaneArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigArgs.builder
      builder.controlPlaneNodePoolConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerArgs.Builder)
    /**
     * @param bgpLbConfig Configuration for BGP typed load balancers.
     *  Structure is documented below.
     * @return builder
     */
    def bgpLbConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerBgpLbConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerBgpLbConfigArgs.builder
      builder.bgpLbConfig(args(argsBuilder).build)

    /**
     * @param manualLbConfig A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def manualLbConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerManualLbConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerManualLbConfigArgs.builder
      builder.manualLbConfig(args(argsBuilder).build)

    /**
     * @param metalLbConfig A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def metalLbConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerMetalLbConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerMetalLbConfigArgs.builder
      builder.metalLbConfig(args(argsBuilder).build)

    /**
     * @param portConfig Specifies the load balancer ports.
     *  Structure is documented below.
     * @return builder
     */
    def portConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerPortConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerPortConfigArgs.builder
      builder.portConfig(args(argsBuilder).build)

    /**
     * @param vipConfig Specified the Bare Metal Load Balancer Config
     *  Structure is documented below.
     * @return builder
     */
    def vipConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerVipConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerVipConfigArgs.builder
      builder.vipConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterValidationCheckArgs.Builder)
    /**
     * @param statuses (Output)
     *  Specifies the detailed validation check status
     *  Structure is documented below.
     * @return builder
     */
    def statuses(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterValidationCheckStatusArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterValidationCheckArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterValidationCheckStatusArgs.builder
      builder.statuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.VMwareNodePoolConfigArgs.Builder)
    /**
     * @param taints The initial taints assigned to nodes of this node pool.
     *  Structure is documented below.
     * @return builder
     */
    def taints(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareNodePoolConfigTaintArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.VMwareNodePoolConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareNodePoolConfigTaintArgs.builder
      builder.taints(args.map(_(argsBuilder).build)*)

    /**
     * @param vsphereConfig Specifies the vSphere config for node pool.
     *  Structure is documented below.
     * @return builder
     */
    def vsphereConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareNodePoolConfigVsphereConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VMwareNodePoolConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareNodePoolConfigVsphereConfigArgs.builder
      builder.vsphereConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerBgpLbConfigArgs.Builder)
    /**
     * @param addressPools a list of non-overlapping IP pools used
     *  by load balancer typed services.
     *  Structure is documented below.
     * @return builder
     */
    def addressPools(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerBgpLbConfigAddressPoolArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerBgpLbConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerBgpLbConfigAddressPoolArgs.builder
      builder.addressPools(args.map(_(argsBuilder).build)*)

    /**
     * @param bgpPeerConfigs BGP autonomous system number (ASN) of the cluster.
     *  Structure is documented below.
     * @return builder
     */
    def bgpPeerConfigs(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerBgpLbConfigBgpPeerConfigArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerBgpLbConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerBgpLbConfigBgpPeerConfigArgs.builder
      builder.bgpPeerConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param loadBalancerNodePoolConfig A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def loadBalancerNodePoolConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerBgpLbConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigArgs.builder
      builder.loadBalancerNodePoolConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.BareMetalNodePoolNodePoolConfigArgs.Builder)
    /**
     * @param nodeConfigs The list of machine addresses in the Bare Metal Node Pool.
     *  Structure is documented below.
     * @return builder
     */
    def nodeConfigs(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalNodePoolNodePoolConfigNodeConfigArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalNodePoolNodePoolConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalNodePoolNodePoolConfigNodeConfigArgs.builder
      builder.nodeConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param taints The initial taints assigned to nodes of this node pool.
     *  Structure is documented below.
     * @return builder
     */
    def taints(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalNodePoolNodePoolConfigTaintArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalNodePoolNodePoolConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalNodePoolNodePoolConfigTaintArgs.builder
      builder.taints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.VMwareClusterValidationCheckStatusArgs.Builder)
    /**
     * @param results (Output)
     *  Individual checks which failed as part of the Preflight check execution.
     *  Structure is documented below.
     * @return builder
     */
    def results(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterValidationCheckStatusResultArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.VMwareClusterValidationCheckStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterValidationCheckStatusResultArgs.builder
      builder.results(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterNetworkConfigStaticIpConfigIpBlockArgs.Builder)
    /**
     * @param ips The node&#39;s network configurations used by the VMware Admin Cluster.
     *  Structure is documented below.
     * @return builder
     */
    def ips(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterNetworkConfigStaticIpConfigIpBlockIpArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterNetworkConfigStaticIpConfigIpBlockArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterNetworkConfigStaticIpConfigIpBlockIpArgs.builder
      builder.ips(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerMetalLbConfigArgs.Builder)
    /**
     * @param addressPools AddressPools is a list of non-overlapping IP pools used by load balancer
     *  typed services. All addresses must be routable to load balancer nodes.
     *  IngressVIP must be included in the pools.
     *  Structure is documented below.
     * @return builder
     */
    def addressPools(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerMetalLbConfigAddressPoolArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerMetalLbConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerMetalLbConfigAddressPoolArgs.builder
      builder.addressPools(args.map(_(argsBuilder).build)*)

    /**
     * @param loadBalancerNodePoolConfig Specifies the load balancer&#39;s node pool configuration.
     *  Structure is documented below.
     * @return builder
     */
    def loadBalancerNodePoolConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerMetalLbConfigLoadBalancerNodePoolConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerMetalLbConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerMetalLbConfigLoadBalancerNodePoolConfigArgs.builder
      builder.loadBalancerNodePoolConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterState.Builder)
    /**
     * @param binaryAuthorization Binary Authorization related configurations.
     *  Structure is documented below.
     * @return builder
     */
    def binaryAuthorization(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterBinaryAuthorizationArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterBinaryAuthorizationArgs.builder
      builder.binaryAuthorization(args(argsBuilder).build)

    /**
     * @param clusterOperations Specifies the User Cluster&#39;s observability infrastructure.
     *  Structure is documented below.
     * @return builder
     */
    def clusterOperations(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterClusterOperationsArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterClusterOperationsArgs.builder
      builder.clusterOperations(args(argsBuilder).build)

    /**
     * @param controlPlane Specifies the control plane configuration.
     *  Structure is documented below.
     * @return builder
     */
    def controlPlane(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterControlPlaneArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterControlPlaneArgs.builder
      builder.controlPlane(args(argsBuilder).build)

    /**
     * @param fleets Fleet related configuration.
     *  Fleets are a Google Cloud concept for logically organizing clusters,
     *  letting you use and manage multi-cluster capabilities and apply
     *  consistent policies across your systems.
     *  See [Anthos Fleets](https://cloud.google.com/anthos/multicluster-management/fleets) for
     *  more details on Anthos multi-cluster capabilities using Fleets.
     *  Structure is documented below.
     * @return builder
     */
    def fleets(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterFleetArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterFleetArgs.builder
      builder.fleets(args.map(_(argsBuilder).build)*)

    /**
     * @param loadBalancer Specifies the load balancer configuration.
     *  Structure is documented below.
     * @return builder
     */
    def loadBalancer(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterLoadBalancerArgs.builder
      builder.loadBalancer(args(argsBuilder).build)

    /**
     * @param maintenanceConfig Specifies the workload node configurations.
     *  Structure is documented below.
     * @return builder
     */
    def maintenanceConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterMaintenanceConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterMaintenanceConfigArgs.builder
      builder.maintenanceConfig(args(argsBuilder).build)

    /**
     * @param networkConfig Network configuration.
     *  Structure is documented below.
     * @return builder
     */
    def networkConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterNetworkConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterNetworkConfigArgs.builder
      builder.networkConfig(args(argsBuilder).build)

    /**
     * @param nodeAccessConfig Specifies the node access related settings for the bare metal user cluster.
     *  Structure is documented below.
     * @return builder
     */
    def nodeAccessConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterNodeAccessConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterNodeAccessConfigArgs.builder
      builder.nodeAccessConfig(args(argsBuilder).build)

    /**
     * @param nodeConfig Specifies the workload node configurations.
     *  Structure is documented below.
     * @return builder
     */
    def nodeConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterNodeConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterNodeConfigArgs.builder
      builder.nodeConfig(args(argsBuilder).build)

    /**
     * @param osEnvironmentConfig OS environment related configurations.
     *  Structure is documented below.
     * @return builder
     */
    def osEnvironmentConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterOsEnvironmentConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterOsEnvironmentConfigArgs.builder
      builder.osEnvironmentConfig(args(argsBuilder).build)

    /**
     * @param proxy Specifies the cluster proxy configuration.
     *  Structure is documented below.
     * @return builder
     */
    def proxy(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterProxyArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterProxyArgs.builder
      builder.proxy(args(argsBuilder).build)

    /**
     * @param securityConfig Specifies the security related settings for the Bare Metal User Cluster.
     *  Structure is documented below.
     * @return builder
     */
    def securityConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterSecurityConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterSecurityConfigArgs.builder
      builder.securityConfig(args(argsBuilder).build)

    /**
     * @param statuses (Output)
     *  Specifies the detailed validation check status
     *  Structure is documented below.
     * @return builder
     */
    def statuses(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterStatusArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterStatusArgs.builder
      builder.statuses(args.map(_(argsBuilder).build)*)

    /**
     * @param storage Specifies the cluster storage configuration.
     *  Structure is documented below.
     * @return builder
     */
    def storage(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterStorageArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterStorageArgs.builder
      builder.storage(args(argsBuilder).build)

    /**
     * @param upgradePolicy The cluster upgrade policy.
     *  Structure is documented below.
     * @return builder
     */
    def upgradePolicy(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterUpgradePolicyArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterUpgradePolicyArgs.builder
      builder.upgradePolicy(args(argsBuilder).build)

    /**
     * @param validationChecks Specifies the security related settings for the Bare Metal User Cluster.
     *  Structure is documented below.
     * @return builder
     */
    def validationChecks(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterValidationCheckArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterValidationCheckArgs.builder
      builder.validationChecks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterValidationCheckStatusArgs.Builder)
    /**
     * @param results (Output)
     *  Individual checks which failed as part of the Preflight check execution.
     *  Structure is documented below.
     * @return builder
     */
    def results(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterValidationCheckStatusResultArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterValidationCheckStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterValidationCheckStatusResultArgs.builder
      builder.results(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.VMwareNodePoolConfigVsphereConfigArgs.Builder)
    /**
     * @param tags Tags to apply to VMs.
     *  Structure is documented below.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareNodePoolConfigVsphereConfigTagArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.VMwareNodePoolConfigVsphereConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareNodePoolConfigVsphereConfigTagArgs.builder
      builder.tags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterNetworkConfigArgs.Builder)
    /**
     * @param dhcpIpConfig Configuration settings for a DHCP IP configuration.
     *  Structure is documented below.
     * @return builder
     */
    def dhcpIpConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterNetworkConfigDhcpIpConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterNetworkConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterNetworkConfigDhcpIpConfigArgs.builder
      builder.dhcpIpConfig(args(argsBuilder).build)

    /**
     * @param haControlPlaneConfig Configuration for HA admin cluster control plane.
     *  Structure is documented below.
     * @return builder
     */
    def haControlPlaneConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterNetworkConfigHaControlPlaneConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterNetworkConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterNetworkConfigHaControlPlaneConfigArgs.builder
      builder.haControlPlaneConfig(args(argsBuilder).build)

    /**
     * @param hostConfig Represents common network settings irrespective of the host&#39;s IP address.
     *  Structure is documented below.
     * @return builder
     */
    def hostConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterNetworkConfigHostConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterNetworkConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterNetworkConfigHostConfigArgs.builder
      builder.hostConfig(args(argsBuilder).build)

    /**
     * @param staticIpConfig Configuration settings for a static IP configuration.
     *  Structure is documented below.
     * @return builder
     */
    def staticIpConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterNetworkConfigStaticIpConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterNetworkConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterNetworkConfigStaticIpConfigArgs.builder
      builder.staticIpConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterNetworkConfigHaControlPlaneConfigArgs.Builder)
    /**
     * @param controlPlaneIpBlock Static IP addresses for the control plane nodes.
     *  Structure is documented below.
     * @return builder
     */
    def controlPlaneIpBlock(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterNetworkConfigHaControlPlaneConfigControlPlaneIpBlockArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterNetworkConfigHaControlPlaneConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VmwareAdminClusterNetworkConfigHaControlPlaneConfigControlPlaneIpBlockArgs.builder
      builder.controlPlaneIpBlock(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.VMwareClusterAuthorizationArgs.Builder)
    /**
     * @param adminUsers Users that will be granted the cluster-admin role on the cluster, providing
     *  full access to the cluster.
     *  Structure is documented below.
     * @return builder
     */
    def adminUsers(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterAuthorizationAdminUserArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.VMwareClusterAuthorizationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterAuthorizationAdminUserArgs.builder
      builder.adminUsers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigNodePoolConfigArgs.Builder)
    /**
     * @param nodeConfigs Structure is documented below.
     * @return builder
     */
    def nodeConfigs(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigNodePoolConfigNodeConfigArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigNodePoolConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigNodePoolConfigNodeConfigArgs.builder
      builder.nodeConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param taints Structure is documented below.
     * @return builder
     */
    def taints(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigNodePoolConfigTaintArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigNodePoolConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterControlPlaneControlPlaneNodePoolConfigNodePoolConfigTaintArgs.builder
      builder.taints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.BareMetalNodePoolState.Builder)
    /**
     * @param nodePoolConfig Node pool configuration.
     *  Structure is documented below.
     * @return builder
     */
    def nodePoolConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalNodePoolNodePoolConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalNodePoolState.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalNodePoolNodePoolConfigArgs.builder
      builder.nodePoolConfig(args(argsBuilder).build)

    /**
     * @param statuses Specifies detailed node pool status.
     *  Structure is documented below.
     * @return builder
     */
    def statuses(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalNodePoolStatusArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalNodePoolState.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalNodePoolStatusArgs.builder
      builder.statuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigArgs.Builder)
    /**
     * @param nodePoolConfig A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def nodePoolConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigNodePoolConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigNodePoolConfigArgs.builder
      builder.nodePoolConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.VMwareNodePoolStatusArgs.Builder)
    /**
     * @param conditions (Output)
     *  ResourceConditions provide a standard mechanism for higher-level status reporting from user cluster controller.
     *  Structure is documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareNodePoolStatusConditionArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.VMwareNodePoolStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareNodePoolStatusConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterSecurityConfigAuthorizationArgs.Builder)
    /**
     * @param adminUsers Users that will be granted the cluster-admin role on the cluster, providing full access to the cluster.
     *  Structure is documented below.
     * @return builder
     */
    def adminUsers(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterSecurityConfigAuthorizationAdminUserArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterSecurityConfigAuthorizationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterSecurityConfigAuthorizationAdminUserArgs.builder
      builder.adminUsers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.BareMetalNodePoolStatusArgs.Builder)
    /**
     * @param conditions (Output)
     *  ResourceConditions provide a standard mechanism for higher-level status reporting from user cluster controller.
     *  Structure is documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalNodePoolStatusConditionArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalNodePoolStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalNodePoolStatusConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.VMwareClusterStatusArgs.Builder)
    /**
     * @param conditions (Output)
     *  ResourceConditions provide a standard mechanism for higher-level status reporting from user cluster controller.
     *  Structure is documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.VMwareClusterStatusConditionArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.VMwareClusterStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.VMwareClusterStatusConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterSecurityConfigAuthorizationArgs.Builder)
    /**
     * @param adminUsers Users that will be granted the cluster-admin role on the cluster, providing full access to the cluster.
     *  Structure is documented below.
     * @return builder
     */
    def adminUsers(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterSecurityConfigAuthorizationAdminUserArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterSecurityConfigAuthorizationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterSecurityConfigAuthorizationAdminUserArgs.builder
      builder.adminUsers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigNodePoolConfigArgs.Builder)
    /**
     * @param kubeletConfig A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def kubeletConfig(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigNodePoolConfigKubeletConfigArgs.Builder]):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigNodePoolConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigNodePoolConfigKubeletConfigArgs.builder
      builder.kubeletConfig(args(argsBuilder).build)

    /**
     * @param nodeConfigs Structure is documented below.
     * @return builder
     */
    def nodeConfigs(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigNodePoolConfigNodeConfigArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigNodePoolConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigNodePoolConfigNodeConfigArgs.builder
      builder.nodeConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param taints Structure is documented below.
     * @return builder
     */
    def taints(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigNodePoolConfigTaintArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigNodePoolConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalAdminClusterLoadBalancerBgpLbConfigLoadBalancerNodePoolConfigNodePoolConfigTaintArgs.builder
      builder.taints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterStatusArgs.Builder)
    /**
     * @param conditions (Output)
     *  ResourceConditions provide a standard mechanism for higher-level status reporting from user cluster controller.
     *  Structure is documented below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterStatusConditionArgs.Builder]*):
        com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterStatusConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)
