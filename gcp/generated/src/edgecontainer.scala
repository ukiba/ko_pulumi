package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object edgecontainer:
  /**
   * A VPN connection
   * 
   *  To get more information about VpnConnection, see:
   * 
   *  * [API documentation](https://cloud.google.com/distributed-cloud/edge/latest/docs/reference/container/rest/v1/projects.locations.vpnConnections)
   *  * How-to Guides
   *      * [Google Distributed Cloud Edge](https://cloud.google.com/distributed-cloud/edge/latest/docs)
   */
  def VpnConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.edgecontainer.VpnConnectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.edgecontainer.VpnConnectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.edgecontainer.VpnConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.edgecontainer.VpnConnectionArgs.Builder)
    /**
     * @param vpcProject Project detail of the VPC network. Required if VPC is in a different project than the cluster project.
     *  Structure is documented below.
     * @return builder
     */
    def vpcProject(args: Endofunction[com.pulumi.gcp.edgecontainer.inputs.VpnConnectionVpcProjectArgs.Builder]):
        com.pulumi.gcp.edgecontainer.VpnConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.edgecontainer.inputs.VpnConnectionVpcProjectArgs.builder
      builder.vpcProject(args(argsBuilder).build)

  /**
   * Cluster contains information about a Google Distributed Cloud Edge Kubernetes cluster.
   * 
   *  To get more information about Cluster, see:
   * 
   *  * [API documentation](https://cloud.google.com/distributed-cloud/edge/latest/docs/reference/container/rest/v1/projects.locations.clusters)
   *  * How-to Guides
   *      * [Create and manage clusters](https://cloud.google.com/distributed-cloud/edge/latest/docs/clusters)
   */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.edgecontainer.ClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.edgecontainer.ClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.edgecontainer.Cluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.edgecontainer.ClusterArgs.Builder)
    /**
     * @param authorization RBAC policy that will be applied and managed by GEC.
     *  Structure is documented below.
     * @return builder
     */
    def authorization(args: Endofunction[com.pulumi.gcp.edgecontainer.inputs.ClusterAuthorizationArgs.Builder]):
        com.pulumi.gcp.edgecontainer.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.edgecontainer.inputs.ClusterAuthorizationArgs.builder
      builder.authorization(args(argsBuilder).build)

    /**
     * @param controlPlane The configuration of the cluster control plane.
     *  Structure is documented below.
     * @return builder
     */
    def controlPlane(args: Endofunction[com.pulumi.gcp.edgecontainer.inputs.ClusterControlPlaneArgs.Builder]):
        com.pulumi.gcp.edgecontainer.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.edgecontainer.inputs.ClusterControlPlaneArgs.builder
      builder.controlPlane(args(argsBuilder).build)

    /**
     * @param controlPlaneEncryption Remote control plane disk encryption options. This field is only used when
     *  enabling CMEK support.
     *  Structure is documented below.
     * @return builder
     */
    def controlPlaneEncryption(args: Endofunction[com.pulumi.gcp.edgecontainer.inputs.ClusterControlPlaneEncryptionArgs.Builder]):
        com.pulumi.gcp.edgecontainer.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.edgecontainer.inputs.ClusterControlPlaneEncryptionArgs.builder
      builder.controlPlaneEncryption(args(argsBuilder).build)

    /**
     * @param fleet Fleet related configuration.
     *  Fleets are a Google Cloud concept for logically organizing clusters,
     *  letting you use and manage multi-cluster capabilities and apply
     *  consistent policies across your systems.
     *  Structure is documented below.
     * @return builder
     */
    def fleet(args: Endofunction[com.pulumi.gcp.edgecontainer.inputs.ClusterFleetArgs.Builder]):
        com.pulumi.gcp.edgecontainer.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.edgecontainer.inputs.ClusterFleetArgs.builder
      builder.fleet(args(argsBuilder).build)

    /**
     * @param maintenancePolicy Cluster-wide maintenance policy configuration.
     *  Structure is documented below.
     * @return builder
     */
    def maintenancePolicy(args: Endofunction[com.pulumi.gcp.edgecontainer.inputs.ClusterMaintenancePolicyArgs.Builder]):
        com.pulumi.gcp.edgecontainer.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.edgecontainer.inputs.ClusterMaintenancePolicyArgs.builder
      builder.maintenancePolicy(args(argsBuilder).build)

    /**
     * @param networking Fleet related configuration.
     *  Fleets are a Google Cloud concept for logically organizing clusters,
     *  letting you use and manage multi-cluster capabilities and apply
     *  consistent policies across your systems.
     *  Structure is documented below.
     * @return builder
     */
    def networking(args: Endofunction[com.pulumi.gcp.edgecontainer.inputs.ClusterNetworkingArgs.Builder]):
        com.pulumi.gcp.edgecontainer.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.edgecontainer.inputs.ClusterNetworkingArgs.builder
      builder.networking(args(argsBuilder).build)

    /**
     * @param systemAddonsConfig Config that customers are allowed to define for GDCE system add-ons.
     *  Structure is documented below.
     * @return builder
     */
    def systemAddonsConfig(args: Endofunction[com.pulumi.gcp.edgecontainer.inputs.ClusterSystemAddonsConfigArgs.Builder]):
        com.pulumi.gcp.edgecontainer.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.edgecontainer.inputs.ClusterSystemAddonsConfigArgs.builder
      builder.systemAddonsConfig(args(argsBuilder).build)

  /**
   * &#34;A set of Kubernetes nodes in a cluster with common configuration and specification.&#34;
   * 
   *  To get more information about NodePool, see:
   * 
   *  * [API documentation](https://cloud.google.com/distributed-cloud/edge/latest/docs/reference/container/rest/v1/projects.locations.clusters.nodePools)
   *  * How-to Guides
   *      * [Google Distributed Cloud Edge](https://cloud.google.com/distributed-cloud/edge/latest/docs)
   */
  def NodePool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.edgecontainer.NodePoolArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.edgecontainer.NodePoolArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.edgecontainer.NodePool(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.edgecontainer.NodePoolArgs.Builder)
    /**
     * @param localDiskEncryption Local disk encryption options. This field is only used when enabling CMEK support.
     *  Structure is documented below.
     * @return builder
     */
    def localDiskEncryption(args: Endofunction[com.pulumi.gcp.edgecontainer.inputs.NodePoolLocalDiskEncryptionArgs.Builder]):
        com.pulumi.gcp.edgecontainer.NodePoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.edgecontainer.inputs.NodePoolLocalDiskEncryptionArgs.builder
      builder.localDiskEncryption(args(argsBuilder).build)

    /**
     * @param nodeConfig Configuration for each node in the NodePool
     *  Structure is documented below.
     * @return builder
     */
    def nodeConfig(args: Endofunction[com.pulumi.gcp.edgecontainer.inputs.NodePoolNodeConfigArgs.Builder]):
        com.pulumi.gcp.edgecontainer.NodePoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.edgecontainer.inputs.NodePoolNodeConfigArgs.builder
      builder.nodeConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.edgecontainer.inputs.ClusterAuthorizationArgs.Builder)
    /**
     * @param adminUsers User that will be granted the cluster-admin role on the cluster, providing
     *  full access to the cluster. Currently, this is a singular field, but will
     *  be expanded to allow multiple admins in the future.
     *  Structure is documented below.
     * @return builder
     */
    def adminUsers(args: Endofunction[com.pulumi.gcp.edgecontainer.inputs.ClusterAuthorizationAdminUsersArgs.Builder]):
        com.pulumi.gcp.edgecontainer.inputs.ClusterAuthorizationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.edgecontainer.inputs.ClusterAuthorizationAdminUsersArgs.builder
      builder.adminUsers(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.edgecontainer.inputs.VpnConnectionDetailArgs.Builder)
    /**
     * @param cloudRouters (Output)
     *  The Cloud Router info.
     *  Structure is documented below.
     * @return builder
     */
    def cloudRouters(args: Endofunction[com.pulumi.gcp.edgecontainer.inputs.VpnConnectionDetailCloudRouterArgs.Builder]*):
        com.pulumi.gcp.edgecontainer.inputs.VpnConnectionDetailArgs.Builder =
      def argsBuilder = com.pulumi.gcp.edgecontainer.inputs.VpnConnectionDetailCloudRouterArgs.builder
      builder.cloudRouters(args.map(_(argsBuilder).build)*)

    /**
     * @param cloudVpns (Output)
     *  Each connection has multiple Cloud VPN gateways.
     *  Structure is documented below.
     * @return builder
     */
    def cloudVpns(args: Endofunction[com.pulumi.gcp.edgecontainer.inputs.VpnConnectionDetailCloudVpnArgs.Builder]*):
        com.pulumi.gcp.edgecontainer.inputs.VpnConnectionDetailArgs.Builder =
      def argsBuilder = com.pulumi.gcp.edgecontainer.inputs.VpnConnectionDetailCloudVpnArgs.builder
      builder.cloudVpns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.edgecontainer.inputs.ClusterState.Builder)
    /**
     * @param authorization RBAC policy that will be applied and managed by GEC.
     *  Structure is documented below.
     * @return builder
     */
    def authorization(args: Endofunction[com.pulumi.gcp.edgecontainer.inputs.ClusterAuthorizationArgs.Builder]):
        com.pulumi.gcp.edgecontainer.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.edgecontainer.inputs.ClusterAuthorizationArgs.builder
      builder.authorization(args(argsBuilder).build)

    /**
     * @param controlPlane The configuration of the cluster control plane.
     *  Structure is documented below.
     * @return builder
     */
    def controlPlane(args: Endofunction[com.pulumi.gcp.edgecontainer.inputs.ClusterControlPlaneArgs.Builder]):
        com.pulumi.gcp.edgecontainer.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.edgecontainer.inputs.ClusterControlPlaneArgs.builder
      builder.controlPlane(args(argsBuilder).build)

    /**
     * @param controlPlaneEncryption Remote control plane disk encryption options. This field is only used when
     *  enabling CMEK support.
     *  Structure is documented below.
     * @return builder
     */
    def controlPlaneEncryption(args: Endofunction[com.pulumi.gcp.edgecontainer.inputs.ClusterControlPlaneEncryptionArgs.Builder]):
        com.pulumi.gcp.edgecontainer.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.edgecontainer.inputs.ClusterControlPlaneEncryptionArgs.builder
      builder.controlPlaneEncryption(args(argsBuilder).build)

    /**
     * @param fleet Fleet related configuration.
     *  Fleets are a Google Cloud concept for logically organizing clusters,
     *  letting you use and manage multi-cluster capabilities and apply
     *  consistent policies across your systems.
     *  Structure is documented below.
     * @return builder
     */
    def fleet(args: Endofunction[com.pulumi.gcp.edgecontainer.inputs.ClusterFleetArgs.Builder]):
        com.pulumi.gcp.edgecontainer.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.edgecontainer.inputs.ClusterFleetArgs.builder
      builder.fleet(args(argsBuilder).build)

    /**
     * @param maintenanceEvents All the maintenance events scheduled for the cluster, including the ones
     *  ongoing, planned for the future and done in the past (up to 90 days).
     *  Structure is documented below.
     * @return builder
     */
    def maintenanceEvents(args: Endofunction[com.pulumi.gcp.edgecontainer.inputs.ClusterMaintenanceEventArgs.Builder]*):
        com.pulumi.gcp.edgecontainer.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.edgecontainer.inputs.ClusterMaintenanceEventArgs.builder
      builder.maintenanceEvents(args.map(_(argsBuilder).build)*)

    /**
     * @param maintenancePolicy Cluster-wide maintenance policy configuration.
     *  Structure is documented below.
     * @return builder
     */
    def maintenancePolicy(args: Endofunction[com.pulumi.gcp.edgecontainer.inputs.ClusterMaintenancePolicyArgs.Builder]):
        com.pulumi.gcp.edgecontainer.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.edgecontainer.inputs.ClusterMaintenancePolicyArgs.builder
      builder.maintenancePolicy(args(argsBuilder).build)

    /**
     * @param networking Fleet related configuration.
     *  Fleets are a Google Cloud concept for logically organizing clusters,
     *  letting you use and manage multi-cluster capabilities and apply
     *  consistent policies across your systems.
     *  Structure is documented below.
     * @return builder
     */
    def networking(args: Endofunction[com.pulumi.gcp.edgecontainer.inputs.ClusterNetworkingArgs.Builder]):
        com.pulumi.gcp.edgecontainer.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.edgecontainer.inputs.ClusterNetworkingArgs.builder
      builder.networking(args(argsBuilder).build)

    /**
     * @param systemAddonsConfig Config that customers are allowed to define for GDCE system add-ons.
     *  Structure is documented below.
     * @return builder
     */
    def systemAddonsConfig(args: Endofunction[com.pulumi.gcp.edgecontainer.inputs.ClusterSystemAddonsConfigArgs.Builder]):
        com.pulumi.gcp.edgecontainer.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.edgecontainer.inputs.ClusterSystemAddonsConfigArgs.builder
      builder.systemAddonsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.edgecontainer.inputs.ClusterMaintenancePolicyWindowRecurringWindowArgs.Builder)
    /**
     * @param window Represents an arbitrary window of time.
     *  Structure is documented below.
     * @return builder
     */
    def window(args: Endofunction[com.pulumi.gcp.edgecontainer.inputs.ClusterMaintenancePolicyWindowRecurringWindowWindowArgs.Builder]):
        com.pulumi.gcp.edgecontainer.inputs.ClusterMaintenancePolicyWindowRecurringWindowArgs.Builder =
      val argsBuilder = com.pulumi.gcp.edgecontainer.inputs.ClusterMaintenancePolicyWindowRecurringWindowWindowArgs.builder
      builder.window(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.edgecontainer.inputs.ClusterMaintenancePolicyArgs.Builder)
    /**
     * @param maintenanceExclusions Exclusions to automatic maintenance. Non-emergency maintenance should not occur
     *  in these windows. Each exclusion has a unique name and may be active or expired.
     *  The max number of maintenance exclusions allowed at a given time is 3.
     *  Structure is documented below.
     * @return builder
     */
    def maintenanceExclusions(args: Endofunction[com.pulumi.gcp.edgecontainer.inputs.ClusterMaintenancePolicyMaintenanceExclusionArgs.Builder]*):
        com.pulumi.gcp.edgecontainer.inputs.ClusterMaintenancePolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.edgecontainer.inputs.ClusterMaintenancePolicyMaintenanceExclusionArgs.builder
      builder.maintenanceExclusions(args.map(_(argsBuilder).build)*)

    /**
     * @param window Specifies the maintenance window in which maintenance may be performed.
     *  Structure is documented below.
     * @return builder
     */
    def window(args: Endofunction[com.pulumi.gcp.edgecontainer.inputs.ClusterMaintenancePolicyWindowArgs.Builder]):
        com.pulumi.gcp.edgecontainer.inputs.ClusterMaintenancePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.edgecontainer.inputs.ClusterMaintenancePolicyWindowArgs.builder
      builder.window(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.edgecontainer.inputs.ClusterSystemAddonsConfigArgs.Builder)
    /**
     * @param ingress Config for the Ingress add-on which allows customers to create an Ingress
     *  object to manage external access to the servers in a cluster. The add-on
     *  consists of istiod and istio-ingress.
     *  Structure is documented below.
     * @return builder
     */
    def ingress(args: Endofunction[com.pulumi.gcp.edgecontainer.inputs.ClusterSystemAddonsConfigIngressArgs.Builder]):
        com.pulumi.gcp.edgecontainer.inputs.ClusterSystemAddonsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.edgecontainer.inputs.ClusterSystemAddonsConfigIngressArgs.builder
      builder.ingress(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.edgecontainer.inputs.VpnConnectionState.Builder)
    /**
     * @param details A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def details(args: Endofunction[com.pulumi.gcp.edgecontainer.inputs.VpnConnectionDetailArgs.Builder]*):
        com.pulumi.gcp.edgecontainer.inputs.VpnConnectionState.Builder =
      def argsBuilder = com.pulumi.gcp.edgecontainer.inputs.VpnConnectionDetailArgs.builder
      builder.details(args.map(_(argsBuilder).build)*)

    /**
     * @param vpcProject Project detail of the VPC network. Required if VPC is in a different project than the cluster project.
     *  Structure is documented below.
     * @return builder
     */
    def vpcProject(args: Endofunction[com.pulumi.gcp.edgecontainer.inputs.VpnConnectionVpcProjectArgs.Builder]):
        com.pulumi.gcp.edgecontainer.inputs.VpnConnectionState.Builder =
      val argsBuilder = com.pulumi.gcp.edgecontainer.inputs.VpnConnectionVpcProjectArgs.builder
      builder.vpcProject(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.edgecontainer.inputs.ClusterMaintenancePolicyWindowArgs.Builder)
    /**
     * @param recurringWindow Represents an arbitrary window of time that recurs.
     *  Structure is documented below.
     * @return builder
     */
    def recurringWindow(args: Endofunction[com.pulumi.gcp.edgecontainer.inputs.ClusterMaintenancePolicyWindowRecurringWindowArgs.Builder]):
        com.pulumi.gcp.edgecontainer.inputs.ClusterMaintenancePolicyWindowArgs.Builder =
      val argsBuilder = com.pulumi.gcp.edgecontainer.inputs.ClusterMaintenancePolicyWindowRecurringWindowArgs.builder
      builder.recurringWindow(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.edgecontainer.inputs.ClusterControlPlaneArgs.Builder)
    /**
     * @param local Local control plane configuration.
     *  Structure is documented below.
     * @return builder
     */
    def local(args: Endofunction[com.pulumi.gcp.edgecontainer.inputs.ClusterControlPlaneLocalArgs.Builder]):
        com.pulumi.gcp.edgecontainer.inputs.ClusterControlPlaneArgs.Builder =
      val argsBuilder = com.pulumi.gcp.edgecontainer.inputs.ClusterControlPlaneLocalArgs.builder
      builder.local(args(argsBuilder).build)

    /**
     * @param remote Remote control plane configuration.
     *  Structure is documented below.
     * @return builder
     */
    def remote(args: Endofunction[com.pulumi.gcp.edgecontainer.inputs.ClusterControlPlaneRemoteArgs.Builder]):
        com.pulumi.gcp.edgecontainer.inputs.ClusterControlPlaneArgs.Builder =
      val argsBuilder = com.pulumi.gcp.edgecontainer.inputs.ClusterControlPlaneRemoteArgs.builder
      builder.remote(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.edgecontainer.inputs.ClusterMaintenancePolicyMaintenanceExclusionArgs.Builder)
    /**
     * @param window Represents an arbitrary window of time.
     *  Structure is documented below.
     * @return builder
     */
    def window(args: Endofunction[com.pulumi.gcp.edgecontainer.inputs.ClusterMaintenancePolicyMaintenanceExclusionWindowArgs.Builder]):
        com.pulumi.gcp.edgecontainer.inputs.ClusterMaintenancePolicyMaintenanceExclusionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.edgecontainer.inputs.ClusterMaintenancePolicyMaintenanceExclusionWindowArgs.builder
      builder.window(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.edgecontainer.inputs.NodePoolState.Builder)
    /**
     * @param localDiskEncryption Local disk encryption options. This field is only used when enabling CMEK support.
     *  Structure is documented below.
     * @return builder
     */
    def localDiskEncryption(args: Endofunction[com.pulumi.gcp.edgecontainer.inputs.NodePoolLocalDiskEncryptionArgs.Builder]):
        com.pulumi.gcp.edgecontainer.inputs.NodePoolState.Builder =
      val argsBuilder = com.pulumi.gcp.edgecontainer.inputs.NodePoolLocalDiskEncryptionArgs.builder
      builder.localDiskEncryption(args(argsBuilder).build)

    /**
     * @param nodeConfig Configuration for each node in the NodePool
     *  Structure is documented below.
     * @return builder
     */
    def nodeConfig(args: Endofunction[com.pulumi.gcp.edgecontainer.inputs.NodePoolNodeConfigArgs.Builder]):
        com.pulumi.gcp.edgecontainer.inputs.NodePoolState.Builder =
      val argsBuilder = com.pulumi.gcp.edgecontainer.inputs.NodePoolNodeConfigArgs.builder
      builder.nodeConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.edgecontainer.inputs.ClusterControlPlaneEncryptionArgs.Builder)
    /**
     * @param kmsStatuses (Output)
     *  Error status returned by Cloud KMS when using this key. This field may be
     *  populated only if `kmsKeyState` is not `KMS_KEY_STATE_KEY_AVAILABLE`.
     *  If populated, this field contains the error status reported by Cloud KMS.
     *  Structure is documented below.
     * 
     *  &lt;a name=&#34;nestedControlPlaneEncryptionKmsStatus&#34;&gt;&lt;/a&gt;The `kmsStatus` block contains:
     * @return builder
     */
    def kmsStatuses(args: Endofunction[com.pulumi.gcp.edgecontainer.inputs.ClusterControlPlaneEncryptionKmsStatusArgs.Builder]*):
        com.pulumi.gcp.edgecontainer.inputs.ClusterControlPlaneEncryptionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.edgecontainer.inputs.ClusterControlPlaneEncryptionKmsStatusArgs.builder
      builder.kmsStatuses(args.map(_(argsBuilder).build)*)
