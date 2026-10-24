package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object edgecontainer:
  /**
   * Cluster contains information about a Google Distributed Cloud Edge Kubernetes cluster.
   * 
   * To get more information about Cluster, see:
   * 
   * * [API documentation](https://cloud.google.com/distributed-cloud/edge/latest/docs/reference/container/rest/v1/projects.locations.clusters)
   * * How-to Guides
   *     * [Create and manage clusters](https://cloud.google.com/distributed-cloud/edge/latest/docs/clusters)
   */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.edgecontainer.ClusterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.edgecontainer.ClusterArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.edgecontainer.Cluster(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * &#34;A set of Kubernetes nodes in a cluster with common configuration and specification.&#34;
   * 
   * To get more information about NodePool, see:
   * 
   * * [API documentation](https://cloud.google.com/distributed-cloud/edge/latest/docs/reference/container/rest/v1/projects.locations.clusters.nodePools)
   * * How-to Guides
   *     * [Google Distributed Cloud Edge](https://cloud.google.com/distributed-cloud/edge/latest/docs)
   */
  def NodePool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.edgecontainer.NodePoolArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.edgecontainer.NodePoolArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.edgecontainer.NodePool(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A VPN connection
   * 
   * To get more information about VpnConnection, see:
   * 
   * * [API documentation](https://cloud.google.com/distributed-cloud/edge/latest/docs/reference/container/rest/v1/projects.locations.vpnConnections)
   * * How-to Guides
   *     * [Google Distributed Cloud Edge](https://cloud.google.com/distributed-cloud/edge/latest/docs)
   */
  def VpnConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.edgecontainer.VpnConnectionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.edgecontainer.VpnConnectionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.edgecontainer.VpnConnection(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
