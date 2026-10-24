package jp.ukiba.ko_pulumi
package gcp

object vmwareengine_ext:
  extension (builder: com.pulumi.gcp.vmwareengine.ClusterArgs.Builder)
    /**
     * @param autoscalingSettings Configuration of the autoscaling applied to this cluster
     * Structure is documented below.
     * @return builder
     */
    def autoscalingSettings(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.ClusterAutoscalingSettingsArgs.Builder]):
        com.pulumi.gcp.vmwareengine.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.ClusterAutoscalingSettingsArgs.builder
      builder.autoscalingSettings(args(argsBuilder).build)

    /**
     * @param datastoreMountConfigs Optional. Configuration to mount a datastore.
     * Mount can be done along with cluster create or during cluster update
     * Since service subnet is not configured with ip range on mgmt cluster creation, mount on management cluster is done as update only
     * for unmount remove &#39;datastore_mount_config&#39; config from the update of cluster resource
     * Structure is documented below.
     * @return builder
     */
    def datastoreMountConfigs(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.ClusterDatastoreMountConfigArgs.Builder]*):
        com.pulumi.gcp.vmwareengine.ClusterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vmwareengine.inputs.ClusterDatastoreMountConfigArgs.builder
      builder.datastoreMountConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param nodeTypeConfigs The map of cluster node types in this cluster,
     * where the key is canonical identifier of the node type (corresponds to the NodeType).
     * Structure is documented below.
     * @return builder
     */
    def nodeTypeConfigs(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.ClusterNodeTypeConfigArgs.Builder]*):
        com.pulumi.gcp.vmwareengine.ClusterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vmwareengine.inputs.ClusterNodeTypeConfigArgs.builder
      builder.nodeTypeConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vmwareengine.DatastoreArgs.Builder)
    /**
     * @param nfsDatastore The NFS datastore configuration.
     * Structure is documented below.
     * @return builder
     */
    def nfsDatastore(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.DatastoreNfsDatastoreArgs.Builder]):
        com.pulumi.gcp.vmwareengine.DatastoreArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.DatastoreNfsDatastoreArgs.builder
      builder.nfsDatastore(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vmwareengine.ExternalAccessRuleArgs.Builder)
    /**
     * @param destinationIpRanges If destination ranges are specified, the external access rule applies only to
     * traffic that has a destination IP address in these ranges.
     * Structure is documented below.
     * @return builder
     */
    def destinationIpRanges(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.ExternalAccessRuleDestinationIpRangeArgs.Builder]*):
        com.pulumi.gcp.vmwareengine.ExternalAccessRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vmwareengine.inputs.ExternalAccessRuleDestinationIpRangeArgs.builder
      builder.destinationIpRanges(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceIpRanges If source ranges are specified, the external access rule applies only to
     * traffic that has a source IP address in these ranges.
     * Structure is documented below.
     * @return builder
     */
    def sourceIpRanges(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.ExternalAccessRuleSourceIpRangeArgs.Builder]*):
        com.pulumi.gcp.vmwareengine.ExternalAccessRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vmwareengine.inputs.ExternalAccessRuleSourceIpRangeArgs.builder
      builder.sourceIpRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vmwareengine.NetworkPolicyArgs.Builder)
    /**
     * @param externalIp Network service that allows External IP addresses to be assigned to VMware workloads.
     * This service can only be enabled when internetAccess is also enabled.
     * Structure is documented below.
     * @return builder
     */
    def externalIp(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.NetworkPolicyExternalIpArgs.Builder]):
        com.pulumi.gcp.vmwareengine.NetworkPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.NetworkPolicyExternalIpArgs.builder
      builder.externalIp(args(argsBuilder).build)

    /**
     * @param internetAccess Network service that allows VMware workloads to access the internet.
     * Structure is documented below.
     * @return builder
     */
    def internetAccess(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.NetworkPolicyInternetAccessArgs.Builder]):
        com.pulumi.gcp.vmwareengine.NetworkPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.NetworkPolicyInternetAccessArgs.builder
      builder.internetAccess(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vmwareengine.PrivateCloudArgs.Builder)
    /**
     * @param managementCluster The management cluster for this private cloud. This used for creating and managing the default cluster.
     * Structure is documented below.
     * @return builder
     */
    def managementCluster(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterArgs.Builder]):
        com.pulumi.gcp.vmwareengine.PrivateCloudArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterArgs.builder
      builder.managementCluster(args(argsBuilder).build)

    /**
     * @param networkConfig Network configuration in the consumer project with which the peering has to be done.
     * Structure is documented below.
     * @return builder
     */
    def networkConfig(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.PrivateCloudNetworkConfigArgs.Builder]):
        com.pulumi.gcp.vmwareengine.PrivateCloudArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.PrivateCloudNetworkConfigArgs.builder
      builder.networkConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vmwareengine.inputs.ClusterAutoscalingSettingsArgs.Builder)
    /**
     * @param autoscalingPolicies The map with autoscaling policies applied to the cluster.
     * The key is the identifier of the policy.
     * It must meet the following requirements:
     * * Only contains 1-63 alphanumeric characters and hyphens
     * * Begins with an alphabetical character
     * * Ends with a non-hyphen character
     * * Not formatted as a UUID
     * * Complies with [RFC 1034](https://datatracker.ietf.org/doc/html/rfc1034) (section 3.5)
     *   Currently the map must contain only one element
     *   that describes the autoscaling policy for compute nodes.
     *   Structure is documented below.
     * @return builder
     */
    def autoscalingPolicies(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.ClusterAutoscalingSettingsAutoscalingPolicyArgs.Builder]*):
        com.pulumi.gcp.vmwareengine.inputs.ClusterAutoscalingSettingsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vmwareengine.inputs.ClusterAutoscalingSettingsAutoscalingPolicyArgs.builder
      builder.autoscalingPolicies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vmwareengine.inputs.ClusterAutoscalingSettingsAutoscalingPolicyArgs.Builder)
    /**
     * @param consumedMemoryThresholds Utilization thresholds pertaining to amount of consumed memory.
     * Structure is documented below.
     * @return builder
     */
    def consumedMemoryThresholds(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.ClusterAutoscalingSettingsAutoscalingPolicyConsumedMemoryThresholdsArgs.Builder]):
        com.pulumi.gcp.vmwareengine.inputs.ClusterAutoscalingSettingsAutoscalingPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.ClusterAutoscalingSettingsAutoscalingPolicyConsumedMemoryThresholdsArgs.builder
      builder.consumedMemoryThresholds(args(argsBuilder).build)

    /**
     * @param cpuThresholds Utilization thresholds pertaining to CPU utilization.
     * Structure is documented below.
     * @return builder
     */
    def cpuThresholds(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.ClusterAutoscalingSettingsAutoscalingPolicyCpuThresholdsArgs.Builder]):
        com.pulumi.gcp.vmwareengine.inputs.ClusterAutoscalingSettingsAutoscalingPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.ClusterAutoscalingSettingsAutoscalingPolicyCpuThresholdsArgs.builder
      builder.cpuThresholds(args(argsBuilder).build)

    /**
     * @param storageThresholds Utilization thresholds pertaining to amount of consumed storage.
     * Structure is documented below.
     * @return builder
     */
    def storageThresholds(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.ClusterAutoscalingSettingsAutoscalingPolicyStorageThresholdsArgs.Builder]):
        com.pulumi.gcp.vmwareengine.inputs.ClusterAutoscalingSettingsAutoscalingPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.ClusterAutoscalingSettingsAutoscalingPolicyStorageThresholdsArgs.builder
      builder.storageThresholds(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vmwareengine.inputs.ClusterDatastoreMountConfigArgs.Builder)
    /**
     * @param datastoreNetwork The network configuration for the datastore.
     * Structure is documented below.
     * @return builder
     */
    def datastoreNetwork(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.ClusterDatastoreMountConfigDatastoreNetworkArgs.Builder]):
        com.pulumi.gcp.vmwareengine.inputs.ClusterDatastoreMountConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.ClusterDatastoreMountConfigDatastoreNetworkArgs.builder
      builder.datastoreNetwork(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vmwareengine.inputs.ClusterState.Builder)
    /**
     * @param autoscalingSettings Configuration of the autoscaling applied to this cluster
     * Structure is documented below.
     * @return builder
     */
    def autoscalingSettings(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.ClusterAutoscalingSettingsArgs.Builder]):
        com.pulumi.gcp.vmwareengine.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.ClusterAutoscalingSettingsArgs.builder
      builder.autoscalingSettings(args(argsBuilder).build)

    /**
     * @param datastoreMountConfigs Optional. Configuration to mount a datastore.
     * Mount can be done along with cluster create or during cluster update
     * Since service subnet is not configured with ip range on mgmt cluster creation, mount on management cluster is done as update only
     * for unmount remove &#39;datastore_mount_config&#39; config from the update of cluster resource
     * Structure is documented below.
     * @return builder
     */
    def datastoreMountConfigs(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.ClusterDatastoreMountConfigArgs.Builder]*):
        com.pulumi.gcp.vmwareengine.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.vmwareengine.inputs.ClusterDatastoreMountConfigArgs.builder
      builder.datastoreMountConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param nodeTypeConfigs The map of cluster node types in this cluster,
     * where the key is canonical identifier of the node type (corresponds to the NodeType).
     * Structure is documented below.
     * @return builder
     */
    def nodeTypeConfigs(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.ClusterNodeTypeConfigArgs.Builder]*):
        com.pulumi.gcp.vmwareengine.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.vmwareengine.inputs.ClusterNodeTypeConfigArgs.builder
      builder.nodeTypeConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vmwareengine.inputs.DatastoreNfsDatastoreArgs.Builder)
    /**
     * @param googleFileService Google service file service configuration
     * Structure is documented below.
     * @return builder
     */
    def googleFileService(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.DatastoreNfsDatastoreGoogleFileServiceArgs.Builder]):
        com.pulumi.gcp.vmwareengine.inputs.DatastoreNfsDatastoreArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.DatastoreNfsDatastoreGoogleFileServiceArgs.builder
      builder.googleFileService(args(argsBuilder).build)

    /**
     * @param thirdPartyFileService Third party file service configuration
     * Structure is documented below.
     * @return builder
     */
    def thirdPartyFileService(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.DatastoreNfsDatastoreThirdPartyFileServiceArgs.Builder]):
        com.pulumi.gcp.vmwareengine.inputs.DatastoreNfsDatastoreArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.DatastoreNfsDatastoreThirdPartyFileServiceArgs.builder
      builder.thirdPartyFileService(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vmwareengine.inputs.DatastoreState.Builder)
    /**
     * @param nfsDatastore The NFS datastore configuration.
     * Structure is documented below.
     * @return builder
     */
    def nfsDatastore(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.DatastoreNfsDatastoreArgs.Builder]):
        com.pulumi.gcp.vmwareengine.inputs.DatastoreState.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.DatastoreNfsDatastoreArgs.builder
      builder.nfsDatastore(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vmwareengine.inputs.ExternalAccessRuleState.Builder)
    /**
     * @param destinationIpRanges If destination ranges are specified, the external access rule applies only to
     * traffic that has a destination IP address in these ranges.
     * Structure is documented below.
     * @return builder
     */
    def destinationIpRanges(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.ExternalAccessRuleDestinationIpRangeArgs.Builder]*):
        com.pulumi.gcp.vmwareengine.inputs.ExternalAccessRuleState.Builder =
      def argsBuilder = com.pulumi.gcp.vmwareengine.inputs.ExternalAccessRuleDestinationIpRangeArgs.builder
      builder.destinationIpRanges(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceIpRanges If source ranges are specified, the external access rule applies only to
     * traffic that has a source IP address in these ranges.
     * Structure is documented below.
     * @return builder
     */
    def sourceIpRanges(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.ExternalAccessRuleSourceIpRangeArgs.Builder]*):
        com.pulumi.gcp.vmwareengine.inputs.ExternalAccessRuleState.Builder =
      def argsBuilder = com.pulumi.gcp.vmwareengine.inputs.ExternalAccessRuleSourceIpRangeArgs.builder
      builder.sourceIpRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vmwareengine.inputs.NetworkPolicyState.Builder)
    /**
     * @param externalIp Network service that allows External IP addresses to be assigned to VMware workloads.
     * This service can only be enabled when internetAccess is also enabled.
     * Structure is documented below.
     * @return builder
     */
    def externalIp(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.NetworkPolicyExternalIpArgs.Builder]):
        com.pulumi.gcp.vmwareengine.inputs.NetworkPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.NetworkPolicyExternalIpArgs.builder
      builder.externalIp(args(argsBuilder).build)

    /**
     * @param internetAccess Network service that allows VMware workloads to access the internet.
     * Structure is documented below.
     * @return builder
     */
    def internetAccess(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.NetworkPolicyInternetAccessArgs.Builder]):
        com.pulumi.gcp.vmwareengine.inputs.NetworkPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.NetworkPolicyInternetAccessArgs.builder
      builder.internetAccess(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vmwareengine.inputs.NetworkState.Builder)
    /**
     * @param vpcNetworks VMware Engine service VPC networks that provide connectivity from a private cloud to customer projects,
     * the internet, and other Google Cloud services.
     * Structure is documented below.
     * @return builder
     */
    def vpcNetworks(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.NetworkVpcNetworkArgs.Builder]*):
        com.pulumi.gcp.vmwareengine.inputs.NetworkState.Builder =
      def argsBuilder = com.pulumi.gcp.vmwareengine.inputs.NetworkVpcNetworkArgs.builder
      builder.vpcNetworks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterArgs.Builder)
    /**
     * @param autoscalingSettings Configuration of the autoscaling applied to this cluster
     * Private cloud must have a minimum of 3 nodes to add autoscale settings
     * Structure is documented below.
     * @return builder
     */
    def autoscalingSettings(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterAutoscalingSettingsArgs.Builder]):
        com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterAutoscalingSettingsArgs.builder
      builder.autoscalingSettings(args(argsBuilder).build)

    /**
     * @param nodeTypeConfigs The map of cluster node types in this cluster,
     * where the key is canonical identifier of the node type (corresponds to the NodeType).
     * Structure is documented below.
     * @return builder
     */
    def nodeTypeConfigs(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterNodeTypeConfigArgs.Builder]*):
        com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterNodeTypeConfigArgs.builder
      builder.nodeTypeConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param stretchedClusterConfig The stretched cluster configuration for the private cloud.
     * Structure is documented below.
     * @return builder
     */
    def stretchedClusterConfig(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterStretchedClusterConfigArgs.Builder]):
        com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterStretchedClusterConfigArgs.builder
      builder.stretchedClusterConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterAutoscalingSettingsArgs.Builder)
    /**
     * @param autoscalingPolicies The map with autoscaling policies applied to the cluster.
     * The key is the identifier of the policy.
     * It must meet the following requirements:
     * * Only contains 1-63 alphanumeric characters and hyphens
     * * Begins with an alphabetical character
     * * Ends with a non-hyphen character
     * * Not formatted as a UUID
     * * Complies with [RFC 1034](https://datatracker.ietf.org/doc/html/rfc1034) (section 3.5)
     *   Currently the map must contain only one element
     *   that describes the autoscaling policy for compute nodes.
     *   Structure is documented below.
     * @return builder
     */
    def autoscalingPolicies(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyArgs.Builder]*):
        com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterAutoscalingSettingsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyArgs.builder
      builder.autoscalingPolicies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyArgs.Builder)
    /**
     * @param consumedMemoryThresholds Utilization thresholds pertaining to amount of consumed memory.
     * Structure is documented below.
     * @return builder
     */
    def consumedMemoryThresholds(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyConsumedMemoryThresholdsArgs.Builder]):
        com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyConsumedMemoryThresholdsArgs.builder
      builder.consumedMemoryThresholds(args(argsBuilder).build)

    /**
     * @param cpuThresholds Utilization thresholds pertaining to CPU utilization.
     * Structure is documented below.
     * @return builder
     */
    def cpuThresholds(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyCpuThresholdsArgs.Builder]):
        com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyCpuThresholdsArgs.builder
      builder.cpuThresholds(args(argsBuilder).build)

    /**
     * @param storageThresholds Utilization thresholds pertaining to amount of consumed storage.
     * Structure is documented below.
     * @return builder
     */
    def storageThresholds(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyStorageThresholdsArgs.Builder]):
        com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyStorageThresholdsArgs.builder
      builder.storageThresholds(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vmwareengine.inputs.PrivateCloudState.Builder)
    /**
     * @param hcxes Details about a HCX Cloud Manager appliance.
     * Structure is documented below.
     * @return builder
     */
    def hcxes(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.PrivateCloudHcxArgs.Builder]*):
        com.pulumi.gcp.vmwareengine.inputs.PrivateCloudState.Builder =
      def argsBuilder = com.pulumi.gcp.vmwareengine.inputs.PrivateCloudHcxArgs.builder
      builder.hcxes(args.map(_(argsBuilder).build)*)

    /**
     * @param managementCluster The management cluster for this private cloud. This used for creating and managing the default cluster.
     * Structure is documented below.
     * @return builder
     */
    def managementCluster(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterArgs.Builder]):
        com.pulumi.gcp.vmwareengine.inputs.PrivateCloudState.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterArgs.builder
      builder.managementCluster(args(argsBuilder).build)

    /**
     * @param networkConfig Network configuration in the consumer project with which the peering has to be done.
     * Structure is documented below.
     * @return builder
     */
    def networkConfig(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.PrivateCloudNetworkConfigArgs.Builder]):
        com.pulumi.gcp.vmwareengine.inputs.PrivateCloudState.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.PrivateCloudNetworkConfigArgs.builder
      builder.networkConfig(args(argsBuilder).build)

    /**
     * @param nsxes Details about a NSX Manager appliance.
     * Structure is documented below.
     * @return builder
     */
    def nsxes(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.PrivateCloudNsxArgs.Builder]*):
        com.pulumi.gcp.vmwareengine.inputs.PrivateCloudState.Builder =
      def argsBuilder = com.pulumi.gcp.vmwareengine.inputs.PrivateCloudNsxArgs.builder
      builder.nsxes(args.map(_(argsBuilder).build)*)

    /**
     * @param vcenters Details about a vCenter Server management appliance.
     * Structure is documented below.
     * @return builder
     */
    def vcenters(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.PrivateCloudVcenterArgs.Builder]*):
        com.pulumi.gcp.vmwareengine.inputs.PrivateCloudState.Builder =
      def argsBuilder = com.pulumi.gcp.vmwareengine.inputs.PrivateCloudVcenterArgs.builder
      builder.vcenters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vmwareengine.inputs.SubnetState.Builder)
    /**
     * @param dhcpAddressRanges DHCP address ranges.
     * Structure is documented below.
     * @return builder
     */
    def dhcpAddressRanges(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.SubnetDhcpAddressRangeArgs.Builder]*):
        com.pulumi.gcp.vmwareengine.inputs.SubnetState.Builder =
      def argsBuilder = com.pulumi.gcp.vmwareengine.inputs.SubnetDhcpAddressRangeArgs.builder
      builder.dhcpAddressRanges(args.map(_(argsBuilder).build)*)
