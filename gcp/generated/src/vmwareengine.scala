package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object vmwareengine:
  extension (builder: com.pulumi.gcp.vmwareengine.NetworkPolicyArgs.Builder)
    /**
     * @param externalIp Network service that allows External IP addresses to be assigned to VMware workloads.
     *  This service can only be enabled when internetAccess is also enabled.
     *  Structure is documented below.
     * @return builder
     */
    def externalIp(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.NetworkPolicyExternalIpArgs.Builder]):
        com.pulumi.gcp.vmwareengine.NetworkPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.NetworkPolicyExternalIpArgs.builder
      builder.externalIp(args(argsBuilder).build)

    /**
     * @param internetAccess Network service that allows VMware workloads to access the internet.
     *  Structure is documented below.
     * @return builder
     */
    def internetAccess(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.NetworkPolicyInternetAccessArgs.Builder]):
        com.pulumi.gcp.vmwareengine.NetworkPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.NetworkPolicyInternetAccessArgs.builder
      builder.internetAccess(args(argsBuilder).build)

  type VmwareengineFunctions = com.pulumi.gcp.vmwareengine.VmwareengineFunctions
  object VmwareengineFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.vmwareengine.VmwareengineFunctions.*
  extension (self: VmwareengineFunctions.type)
    /** Use this data source to list announcements in a region. */
    def getAnnouncements(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetAnnouncementsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.vmwareengine.outputs.GetAnnouncementsResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetAnnouncementsArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getAnnouncements(args(argsBuilder).build)

    /** Use this data source to list announcements in a region. */
    def getAnnouncementsPlain(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetAnnouncementsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vmwareengine.outputs.GetAnnouncementsResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetAnnouncementsPlainArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getAnnouncementsPlain(args(argsBuilder).build)

    /**
     * Use this data source to get details about a cluster resource.
     * 
     *  To get more information about private cloud cluster, see:
     *  * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds.clusters)
     */
    def getCluster(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetClusterArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.vmwareengine.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetClusterArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getCluster(args(argsBuilder).build)

    /**
     * Use this data source to get details about a cluster resource.
     * 
     *  To get more information about private cloud cluster, see:
     *  * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds.clusters)
     */
    def getClusterPlain(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetClusterPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vmwareengine.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetClusterPlainArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getClusterPlain(args(argsBuilder).build)

    /**
     * Use this data source to get details about a datastore resource.
     * 
     *  To get more information about datastore, see:
     *  * [API documentation](https://docs.cloud.google.com/vmware-engine/docs/vmware-ecosystem/concepts-nfs-datastores-overview)
     */
    def getDatastore(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetDatastoreArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.vmwareengine.outputs.GetDatastoreResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetDatastoreArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getDatastore(args(argsBuilder).build)

    /**
     * Use this data source to get details about a datastore resource.
     * 
     *  To get more information about datastore, see:
     *  * [API documentation](https://docs.cloud.google.com/vmware-engine/docs/vmware-ecosystem/concepts-nfs-datastores-overview)
     */
    def getDatastorePlain(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetDatastorePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vmwareengine.outputs.GetDatastoreResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetDatastorePlainArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getDatastorePlain(args(argsBuilder).build)

    /**
     * Use this data source to get details about a external access rule resource.
     * 
     *  To get more information about external address, see:
     *  * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.networkPolicies.externalAccessRules)
     */
    def getExternalAccessRule(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetExternalAccessRuleArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.vmwareengine.outputs.GetExternalAccessRuleResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetExternalAccessRuleArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getExternalAccessRule(args(argsBuilder).build)

    /**
     * Use this data source to get details about a external access rule resource.
     * 
     *  To get more information about external address, see:
     *  * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.networkPolicies.externalAccessRules)
     */
    def getExternalAccessRulePlain(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetExternalAccessRulePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vmwareengine.outputs.GetExternalAccessRuleResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetExternalAccessRulePlainArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getExternalAccessRulePlain(args(argsBuilder).build)

    /**
     * Use this data source to get details about a external address resource.
     * 
     *  To get more information about external address, see:
     *  * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds.externalAddresses)
     */
    def getExternalAddress(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetExternalAddressArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.vmwareengine.outputs.GetExternalAddressResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetExternalAddressArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getExternalAddress(args(argsBuilder).build)

    /**
     * Use this data source to get details about a external address resource.
     * 
     *  To get more information about external address, see:
     *  * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds.externalAddresses)
     */
    def getExternalAddressPlain(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetExternalAddressPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vmwareengine.outputs.GetExternalAddressResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetExternalAddressPlainArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getExternalAddressPlain(args(argsBuilder).build)

    /**
     * Use this data source to get details about a VMwareEngine network resource.
     * 
     *  To get more information about VMwareEngine Network, see:
     *  * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.vmwareEngineNetworks)
     */
    def getNetwork(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetNetworkArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.vmwareengine.outputs.GetNetworkResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetNetworkArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getNetwork(args(argsBuilder).build)

    /**
     * Use this data source to get details about a VMwareEngine network resource.
     * 
     *  To get more information about VMwareEngine Network, see:
     *  * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.vmwareEngineNetworks)
     */
    def getNetworkPlain(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetNetworkPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vmwareengine.outputs.GetNetworkResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetNetworkPlainArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getNetworkPlain(args(argsBuilder).build)

    /**
     * Use this data source to get details about a network peering resource.
     * 
     *  To get more information about network peering, see:
     *  * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.networkPeerings)
     */
    def getNetworkPeering(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetNetworkPeeringArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.vmwareengine.outputs.GetNetworkPeeringResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetNetworkPeeringArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getNetworkPeering(args(argsBuilder).build)

    /**
     * Use this data source to get details about a network peering resource.
     * 
     *  To get more information about network peering, see:
     *  * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.networkPeerings)
     */
    def getNetworkPeeringPlain(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetNetworkPeeringPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vmwareengine.outputs.GetNetworkPeeringResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetNetworkPeeringPlainArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getNetworkPeeringPlain(args(argsBuilder).build)

    /**
     * Use this data source to get details about a network policy resource.
     * 
     *  To get more information about network policy, see:
     *  * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.networkPolicies)
     */
    def getNetworkPolicy(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetNetworkPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.vmwareengine.outputs.GetNetworkPolicyResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetNetworkPolicyArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getNetworkPolicy(args(argsBuilder).build)

    /**
     * Use this data source to get details about a network policy resource.
     * 
     *  To get more information about network policy, see:
     *  * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.networkPolicies)
     */
    def getNetworkPolicyPlain(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetNetworkPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vmwareengine.outputs.GetNetworkPolicyResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetNetworkPolicyPlainArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getNetworkPolicyPlain(args(argsBuilder).build)

    /**
     * Use this data source to get NSX credentials for a Private Cloud.
     * 
     *  To get more information about private cloud NSX credentials, see:
     *  * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds/showNsxCredentials)
     */
    def getNsxCredentials(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetNsxCredentialsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.vmwareengine.outputs.GetNsxCredentialsResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetNsxCredentialsArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getNsxCredentials(args(argsBuilder).build)

    /**
     * Use this data source to get NSX credentials for a Private Cloud.
     * 
     *  To get more information about private cloud NSX credentials, see:
     *  * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds/showNsxCredentials)
     */
    def getNsxCredentialsPlain(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetNsxCredentialsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vmwareengine.outputs.GetNsxCredentialsResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetNsxCredentialsPlainArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getNsxCredentialsPlain(args(argsBuilder).build)

    /**
     * Use this data source to get details about a private cloud resource.
     * 
     *  To get more information about private cloud, see:
     *  * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds)
     */
    def getPrivateCloud(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetPrivateCloudArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.vmwareengine.outputs.GetPrivateCloudResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetPrivateCloudArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getPrivateCloud(args(argsBuilder).build)

    /**
     * Use this data source to get details about a private cloud resource.
     * 
     *  To get more information about private cloud, see:
     *  * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds)
     */
    def getPrivateCloudPlain(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetPrivateCloudPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vmwareengine.outputs.GetPrivateCloudResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetPrivateCloudPlainArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getPrivateCloudPlain(args(argsBuilder).build)

    /**
     * Use this data source to get details about a subnet. Management subnets support only read operations and should be configured through this data source. User defined subnets can be configured using the resource as well as the datasource.
     * 
     *  To get more information about private cloud subnet, see:
     *  * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds.subnets)
     */
    def getSubnet(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetSubnetArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.vmwareengine.outputs.GetSubnetResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetSubnetArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getSubnet(args(argsBuilder).build)

    /**
     * Use this data source to get details about a subnet. Management subnets support only read operations and should be configured through this data source. User defined subnets can be configured using the resource as well as the datasource.
     * 
     *  To get more information about private cloud subnet, see:
     *  * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds.subnets)
     */
    def getSubnetPlain(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetSubnetPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vmwareengine.outputs.GetSubnetResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetSubnetPlainArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getSubnetPlain(args(argsBuilder).build)

    /** Use this data source to list upgrades for a Private Cloud. */
    def getUpgrades(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetUpgradesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.vmwareengine.outputs.GetUpgradesResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetUpgradesArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getUpgrades(args(argsBuilder).build)

    /** Use this data source to list upgrades for a Private Cloud. */
    def getUpgradesPlain(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetUpgradesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vmwareengine.outputs.GetUpgradesResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetUpgradesPlainArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getUpgradesPlain(args(argsBuilder).build)

    /**
     * Use this data source to get Vcenter credentials for a Private Cloud.
     * 
     *  To get more information about private cloud Vcenter credentials, see:
     *  * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds/showVcenterCredentials)
     */
    def getVcenterCredentials(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetVcenterCredentialsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.vmwareengine.outputs.GetVcenterCredentialsResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetVcenterCredentialsArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getVcenterCredentials(args(argsBuilder).build)

    /**
     * Use this data source to get Vcenter credentials for a Private Cloud.
     * 
     *  To get more information about private cloud Vcenter credentials, see:
     *  * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds/showVcenterCredentials)
     */
    def getVcenterCredentialsPlain(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetVcenterCredentialsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vmwareengine.outputs.GetVcenterCredentialsResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetVcenterCredentialsPlainArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getVcenterCredentialsPlain(args(argsBuilder).build)

  /**
   * An allocated external IP address and its corresponding internal IP address in a private cloud.
   * 
   *  To get more information about ExternalAddress, see:
   * 
   *  * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds.externalAddresses)
   */
  def ExternalAddress(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vmwareengine.ExternalAddressArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vmwareengine.ExternalAddressArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vmwareengine.ExternalAddress(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * External access firewall rules for filtering incoming traffic destined to `ExternalAddress` resources.
   * 
   *  To get more information about ExternalAccessRule, see:
   * 
   *  * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.networkPolicies.externalAccessRules)
   */
  def ExternalAccessRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vmwareengine.ExternalAccessRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vmwareengine.ExternalAccessRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vmwareengine.ExternalAccessRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Represents a network policy resource. Network policies are regional resources.
   * 
   *  To get more information about NetworkPolicy, see:
   * 
   *  * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.networkPolicies)
   */
  def NetworkPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vmwareengine.NetworkPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vmwareengine.NetworkPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vmwareengine.NetworkPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides connectivity for VMware Engine private clouds.
   * 
   *  To get more information about Network, see:
   * 
   *  * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.vmwareEngineNetworks)
   */
  def Network(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vmwareengine.NetworkArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vmwareengine.NetworkArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vmwareengine.Network(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.vmwareengine.DatastoreArgs.Builder)
    /**
     * @param nfsDatastore The NFS datastore configuration.
     *  Structure is documented below.
     * @return builder
     */
    def nfsDatastore(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.DatastoreNfsDatastoreArgs.Builder]):
        com.pulumi.gcp.vmwareengine.DatastoreArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.DatastoreNfsDatastoreArgs.builder
      builder.nfsDatastore(args(argsBuilder).build)

  /**
   * A cluster in a private cloud.
   * 
   *  To get more information about Cluster, see:
   * 
   *  * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds.clusters)
   */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vmwareengine.ClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vmwareengine.ClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vmwareengine.Cluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.vmwareengine.ExternalAccessRuleArgs.Builder)
    /**
     * @param destinationIpRanges If destination ranges are specified, the external access rule applies only to
     *  traffic that has a destination IP address in these ranges.
     *  Structure is documented below.
     * @return builder
     */
    def destinationIpRanges(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.ExternalAccessRuleDestinationIpRangeArgs.Builder]*):
        com.pulumi.gcp.vmwareengine.ExternalAccessRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vmwareengine.inputs.ExternalAccessRuleDestinationIpRangeArgs.builder
      builder.destinationIpRanges(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceIpRanges If source ranges are specified, the external access rule applies only to
     *  traffic that has a source IP address in these ranges.
     *  Structure is documented below.
     * @return builder
     */
    def sourceIpRanges(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.ExternalAccessRuleSourceIpRangeArgs.Builder]*):
        com.pulumi.gcp.vmwareengine.ExternalAccessRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vmwareengine.inputs.ExternalAccessRuleSourceIpRangeArgs.builder
      builder.sourceIpRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vmwareengine.ClusterArgs.Builder)
    /**
     * @param autoscalingSettings Configuration of the autoscaling applied to this cluster
     *  Structure is documented below.
     * @return builder
     */
    def autoscalingSettings(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.ClusterAutoscalingSettingsArgs.Builder]):
        com.pulumi.gcp.vmwareengine.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.ClusterAutoscalingSettingsArgs.builder
      builder.autoscalingSettings(args(argsBuilder).build)

    /**
     * @param datastoreMountConfigs Optional. Configuration to mount a datastore.
     *  Mount can be done along with cluster create or during cluster update
     *  Since service subnet is not configured with ip range on mgmt cluster creation, mount on management cluster is done as update only
     *  for unmount remove &#39;datastore_mount_config&#39; config from the update of cluster resource
     *  Structure is documented below.
     * @return builder
     */
    def datastoreMountConfigs(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.ClusterDatastoreMountConfigArgs.Builder]*):
        com.pulumi.gcp.vmwareengine.ClusterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vmwareengine.inputs.ClusterDatastoreMountConfigArgs.builder
      builder.datastoreMountConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param nodeTypeConfigs The map of cluster node types in this cluster,
     *  where the key is canonical identifier of the node type (corresponds to the NodeType).
     *  Structure is documented below.
     * @return builder
     */
    def nodeTypeConfigs(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.ClusterNodeTypeConfigArgs.Builder]*):
        com.pulumi.gcp.vmwareengine.ClusterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vmwareengine.inputs.ClusterNodeTypeConfigArgs.builder
      builder.nodeTypeConfigs(args.map(_(argsBuilder).build)*)

  /**
   * Subnet in a private cloud. A Private Cloud contains two types of subnets: `management` subnets (such as vMotion) that
   *  are read-only,and `userDefined`, which can also be updated. This resource should be used to read and update `userDefined`
   *  subnets. To read `management` subnets, please utilize the subnet data source.
   * 
   *  To get more information about Subnet, see:
   * 
   *  * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds.subnets)
   */
  def Subnet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vmwareengine.SubnetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vmwareengine.SubnetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vmwareengine.Subnet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Represents a private cloud resource. Private clouds are zonal resources.
   * 
   *  To get more information about PrivateCloud, see:
   * 
   *  * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds)
   */
  def PrivateCloud(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vmwareengine.PrivateCloudArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vmwareengine.PrivateCloudArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vmwareengine.PrivateCloud(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** A datastore resource that can be mounted on a privatecloud cluster */
  def Datastore(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vmwareengine.DatastoreArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vmwareengine.DatastoreArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vmwareengine.Datastore(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Represents a network peering resource. Network peerings are global resources.
   * 
   *  To get more information about NetworkPeering, see:
   * 
   *  * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/networks/addPeering)
   */
  def NetworkPeering(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vmwareengine.NetworkPeeringArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vmwareengine.NetworkPeeringArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vmwareengine.NetworkPeering(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.vmwareengine.PrivateCloudArgs.Builder)
    /**
     * @param managementCluster The management cluster for this private cloud. This used for creating and managing the default cluster.
     *  Structure is documented below.
     * @return builder
     */
    def managementCluster(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterArgs.Builder]):
        com.pulumi.gcp.vmwareengine.PrivateCloudArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterArgs.builder
      builder.managementCluster(args(argsBuilder).build)

    /**
     * @param networkConfig Network configuration in the consumer project with which the peering has to be done.
     *  Structure is documented below.
     * @return builder
     */
    def networkConfig(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.PrivateCloudNetworkConfigArgs.Builder]):
        com.pulumi.gcp.vmwareengine.PrivateCloudArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.PrivateCloudNetworkConfigArgs.builder
      builder.networkConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vmwareengine.inputs.PrivateCloudState.Builder)
    /**
     * @param hcxes Details about a HCX Cloud Manager appliance.
     *  Structure is documented below.
     * @return builder
     */
    def hcxes(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.PrivateCloudHcxArgs.Builder]*):
        com.pulumi.gcp.vmwareengine.inputs.PrivateCloudState.Builder =
      def argsBuilder = com.pulumi.gcp.vmwareengine.inputs.PrivateCloudHcxArgs.builder
      builder.hcxes(args.map(_(argsBuilder).build)*)

    /**
     * @param managementCluster The management cluster for this private cloud. This used for creating and managing the default cluster.
     *  Structure is documented below.
     * @return builder
     */
    def managementCluster(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterArgs.Builder]):
        com.pulumi.gcp.vmwareengine.inputs.PrivateCloudState.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterArgs.builder
      builder.managementCluster(args(argsBuilder).build)

    /**
     * @param networkConfig Network configuration in the consumer project with which the peering has to be done.
     *  Structure is documented below.
     * @return builder
     */
    def networkConfig(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.PrivateCloudNetworkConfigArgs.Builder]):
        com.pulumi.gcp.vmwareengine.inputs.PrivateCloudState.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.PrivateCloudNetworkConfigArgs.builder
      builder.networkConfig(args(argsBuilder).build)

    /**
     * @param nsxes Details about a NSX Manager appliance.
     *  Structure is documented below.
     * @return builder
     */
    def nsxes(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.PrivateCloudNsxArgs.Builder]*):
        com.pulumi.gcp.vmwareengine.inputs.PrivateCloudState.Builder =
      def argsBuilder = com.pulumi.gcp.vmwareengine.inputs.PrivateCloudNsxArgs.builder
      builder.nsxes(args.map(_(argsBuilder).build)*)

    /**
     * @param vcenters Details about a vCenter Server management appliance.
     *  Structure is documented below.
     * @return builder
     */
    def vcenters(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.PrivateCloudVcenterArgs.Builder]*):
        com.pulumi.gcp.vmwareengine.inputs.PrivateCloudState.Builder =
      def argsBuilder = com.pulumi.gcp.vmwareengine.inputs.PrivateCloudVcenterArgs.builder
      builder.vcenters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vmwareengine.inputs.ClusterState.Builder)
    /**
     * @param autoscalingSettings Configuration of the autoscaling applied to this cluster
     *  Structure is documented below.
     * @return builder
     */
    def autoscalingSettings(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.ClusterAutoscalingSettingsArgs.Builder]):
        com.pulumi.gcp.vmwareengine.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.ClusterAutoscalingSettingsArgs.builder
      builder.autoscalingSettings(args(argsBuilder).build)

    /**
     * @param datastoreMountConfigs Optional. Configuration to mount a datastore.
     *  Mount can be done along with cluster create or during cluster update
     *  Since service subnet is not configured with ip range on mgmt cluster creation, mount on management cluster is done as update only
     *  for unmount remove &#39;datastore_mount_config&#39; config from the update of cluster resource
     *  Structure is documented below.
     * @return builder
     */
    def datastoreMountConfigs(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.ClusterDatastoreMountConfigArgs.Builder]*):
        com.pulumi.gcp.vmwareengine.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.vmwareengine.inputs.ClusterDatastoreMountConfigArgs.builder
      builder.datastoreMountConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param nodeTypeConfigs The map of cluster node types in this cluster,
     *  where the key is canonical identifier of the node type (corresponds to the NodeType).
     *  Structure is documented below.
     * @return builder
     */
    def nodeTypeConfigs(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.ClusterNodeTypeConfigArgs.Builder]*):
        com.pulumi.gcp.vmwareengine.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.vmwareengine.inputs.ClusterNodeTypeConfigArgs.builder
      builder.nodeTypeConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vmwareengine.inputs.ClusterDatastoreMountConfigArgs.Builder)
    /**
     * @param datastoreNetwork The network configuration for the datastore.
     *  Structure is documented below.
     * @return builder
     */
    def datastoreNetwork(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.ClusterDatastoreMountConfigDatastoreNetworkArgs.Builder]):
        com.pulumi.gcp.vmwareengine.inputs.ClusterDatastoreMountConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.ClusterDatastoreMountConfigDatastoreNetworkArgs.builder
      builder.datastoreNetwork(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vmwareengine.inputs.ClusterAutoscalingSettingsAutoscalingPolicyArgs.Builder)
    /**
     * @param consumedMemoryThresholds Utilization thresholds pertaining to amount of consumed memory.
     *  Structure is documented below.
     * @return builder
     */
    def consumedMemoryThresholds(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.ClusterAutoscalingSettingsAutoscalingPolicyConsumedMemoryThresholdsArgs.Builder]):
        com.pulumi.gcp.vmwareengine.inputs.ClusterAutoscalingSettingsAutoscalingPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.ClusterAutoscalingSettingsAutoscalingPolicyConsumedMemoryThresholdsArgs.builder
      builder.consumedMemoryThresholds(args(argsBuilder).build)

    /**
     * @param cpuThresholds Utilization thresholds pertaining to CPU utilization.
     *  Structure is documented below.
     * @return builder
     */
    def cpuThresholds(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.ClusterAutoscalingSettingsAutoscalingPolicyCpuThresholdsArgs.Builder]):
        com.pulumi.gcp.vmwareengine.inputs.ClusterAutoscalingSettingsAutoscalingPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.ClusterAutoscalingSettingsAutoscalingPolicyCpuThresholdsArgs.builder
      builder.cpuThresholds(args(argsBuilder).build)

    /**
     * @param storageThresholds Utilization thresholds pertaining to amount of consumed storage.
     *  Structure is documented below.
     * @return builder
     */
    def storageThresholds(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.ClusterAutoscalingSettingsAutoscalingPolicyStorageThresholdsArgs.Builder]):
        com.pulumi.gcp.vmwareengine.inputs.ClusterAutoscalingSettingsAutoscalingPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.ClusterAutoscalingSettingsAutoscalingPolicyStorageThresholdsArgs.builder
      builder.storageThresholds(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterAutoscalingSettingsArgs.Builder)
    /**
     * @param autoscalingPolicies The map with autoscaling policies applied to the cluster.
     *  The key is the identifier of the policy.
     *  It must meet the following requirements:
     *  * Only contains 1-63 alphanumeric characters and hyphens
     *  * Begins with an alphabetical character
     *  * Ends with a non-hyphen character
     *  * Not formatted as a UUID
     *  * Complies with [RFC 1034](https://datatracker.ietf.org/doc/html/rfc1034) (section 3.5)
     *    Currently the map must contain only one element
     *    that describes the autoscaling policy for compute nodes.
     *    Structure is documented below.
     * @return builder
     */
    def autoscalingPolicies(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyArgs.Builder]*):
        com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterAutoscalingSettingsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyArgs.builder
      builder.autoscalingPolicies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vmwareengine.inputs.ClusterAutoscalingSettingsArgs.Builder)
    /**
     * @param autoscalingPolicies The map with autoscaling policies applied to the cluster.
     *  The key is the identifier of the policy.
     *  It must meet the following requirements:
     *  * Only contains 1-63 alphanumeric characters and hyphens
     *  * Begins with an alphabetical character
     *  * Ends with a non-hyphen character
     *  * Not formatted as a UUID
     *  * Complies with [RFC 1034](https://datatracker.ietf.org/doc/html/rfc1034) (section 3.5)
     *    Currently the map must contain only one element
     *    that describes the autoscaling policy for compute nodes.
     *    Structure is documented below.
     * @return builder
     */
    def autoscalingPolicies(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.ClusterAutoscalingSettingsAutoscalingPolicyArgs.Builder]*):
        com.pulumi.gcp.vmwareengine.inputs.ClusterAutoscalingSettingsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vmwareengine.inputs.ClusterAutoscalingSettingsAutoscalingPolicyArgs.builder
      builder.autoscalingPolicies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vmwareengine.inputs.NetworkPolicyState.Builder)
    /**
     * @param externalIp Network service that allows External IP addresses to be assigned to VMware workloads.
     *  This service can only be enabled when internetAccess is also enabled.
     *  Structure is documented below.
     * @return builder
     */
    def externalIp(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.NetworkPolicyExternalIpArgs.Builder]):
        com.pulumi.gcp.vmwareengine.inputs.NetworkPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.NetworkPolicyExternalIpArgs.builder
      builder.externalIp(args(argsBuilder).build)

    /**
     * @param internetAccess Network service that allows VMware workloads to access the internet.
     *  Structure is documented below.
     * @return builder
     */
    def internetAccess(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.NetworkPolicyInternetAccessArgs.Builder]):
        com.pulumi.gcp.vmwareengine.inputs.NetworkPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.NetworkPolicyInternetAccessArgs.builder
      builder.internetAccess(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterArgs.Builder)
    /**
     * @param autoscalingSettings Configuration of the autoscaling applied to this cluster
     *  Private cloud must have a minimum of 3 nodes to add autoscale settings
     *  Structure is documented below.
     * @return builder
     */
    def autoscalingSettings(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterAutoscalingSettingsArgs.Builder]):
        com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterAutoscalingSettingsArgs.builder
      builder.autoscalingSettings(args(argsBuilder).build)

    /**
     * @param nodeTypeConfigs The map of cluster node types in this cluster,
     *  where the key is canonical identifier of the node type (corresponds to the NodeType).
     *  Structure is documented below.
     * @return builder
     */
    def nodeTypeConfigs(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterNodeTypeConfigArgs.Builder]*):
        com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterNodeTypeConfigArgs.builder
      builder.nodeTypeConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param stretchedClusterConfig The stretched cluster configuration for the private cloud.
     *  Structure is documented below.
     * @return builder
     */
    def stretchedClusterConfig(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterStretchedClusterConfigArgs.Builder]):
        com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterStretchedClusterConfigArgs.builder
      builder.stretchedClusterConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vmwareengine.inputs.ExternalAccessRuleState.Builder)
    /**
     * @param destinationIpRanges If destination ranges are specified, the external access rule applies only to
     *  traffic that has a destination IP address in these ranges.
     *  Structure is documented below.
     * @return builder
     */
    def destinationIpRanges(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.ExternalAccessRuleDestinationIpRangeArgs.Builder]*):
        com.pulumi.gcp.vmwareengine.inputs.ExternalAccessRuleState.Builder =
      def argsBuilder = com.pulumi.gcp.vmwareengine.inputs.ExternalAccessRuleDestinationIpRangeArgs.builder
      builder.destinationIpRanges(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceIpRanges If source ranges are specified, the external access rule applies only to
     *  traffic that has a source IP address in these ranges.
     *  Structure is documented below.
     * @return builder
     */
    def sourceIpRanges(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.ExternalAccessRuleSourceIpRangeArgs.Builder]*):
        com.pulumi.gcp.vmwareengine.inputs.ExternalAccessRuleState.Builder =
      def argsBuilder = com.pulumi.gcp.vmwareengine.inputs.ExternalAccessRuleSourceIpRangeArgs.builder
      builder.sourceIpRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vmwareengine.inputs.NetworkState.Builder)
    /**
     * @param vpcNetworks VMware Engine service VPC networks that provide connectivity from a private cloud to customer projects,
     *  the internet, and other Google Cloud services.
     *  Structure is documented below.
     * @return builder
     */
    def vpcNetworks(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.NetworkVpcNetworkArgs.Builder]*):
        com.pulumi.gcp.vmwareengine.inputs.NetworkState.Builder =
      def argsBuilder = com.pulumi.gcp.vmwareengine.inputs.NetworkVpcNetworkArgs.builder
      builder.vpcNetworks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vmwareengine.inputs.DatastoreState.Builder)
    /**
     * @param nfsDatastore The NFS datastore configuration.
     *  Structure is documented below.
     * @return builder
     */
    def nfsDatastore(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.DatastoreNfsDatastoreArgs.Builder]):
        com.pulumi.gcp.vmwareengine.inputs.DatastoreState.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.DatastoreNfsDatastoreArgs.builder
      builder.nfsDatastore(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vmwareengine.inputs.DatastoreNfsDatastoreArgs.Builder)
    /**
     * @param googleFileService Google service file service configuration
     *  Structure is documented below.
     * @return builder
     */
    def googleFileService(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.DatastoreNfsDatastoreGoogleFileServiceArgs.Builder]):
        com.pulumi.gcp.vmwareengine.inputs.DatastoreNfsDatastoreArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.DatastoreNfsDatastoreGoogleFileServiceArgs.builder
      builder.googleFileService(args(argsBuilder).build)

    /**
     * @param thirdPartyFileService Third party file service configuration
     *  Structure is documented below.
     * @return builder
     */
    def thirdPartyFileService(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.DatastoreNfsDatastoreThirdPartyFileServiceArgs.Builder]):
        com.pulumi.gcp.vmwareengine.inputs.DatastoreNfsDatastoreArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.DatastoreNfsDatastoreThirdPartyFileServiceArgs.builder
      builder.thirdPartyFileService(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vmwareengine.inputs.SubnetState.Builder)
    /**
     * @param dhcpAddressRanges DHCP address ranges.
     *  Structure is documented below.
     * @return builder
     */
    def dhcpAddressRanges(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.SubnetDhcpAddressRangeArgs.Builder]*):
        com.pulumi.gcp.vmwareengine.inputs.SubnetState.Builder =
      def argsBuilder = com.pulumi.gcp.vmwareengine.inputs.SubnetDhcpAddressRangeArgs.builder
      builder.dhcpAddressRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyArgs.Builder)
    /**
     * @param consumedMemoryThresholds Utilization thresholds pertaining to amount of consumed memory.
     *  Structure is documented below.
     * @return builder
     */
    def consumedMemoryThresholds(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyConsumedMemoryThresholdsArgs.Builder]):
        com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyConsumedMemoryThresholdsArgs.builder
      builder.consumedMemoryThresholds(args(argsBuilder).build)

    /**
     * @param cpuThresholds Utilization thresholds pertaining to CPU utilization.
     *  Structure is documented below.
     * @return builder
     */
    def cpuThresholds(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyCpuThresholdsArgs.Builder]):
        com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyCpuThresholdsArgs.builder
      builder.cpuThresholds(args(argsBuilder).build)

    /**
     * @param storageThresholds Utilization thresholds pertaining to amount of consumed storage.
     *  Structure is documented below.
     * @return builder
     */
    def storageThresholds(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyStorageThresholdsArgs.Builder]):
        com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.PrivateCloudManagementClusterAutoscalingSettingsAutoscalingPolicyStorageThresholdsArgs.builder
      builder.storageThresholds(args(argsBuilder).build)
