package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object edgenetwork:
  /**
   * A Distributed Cloud Edge interconnect attachment, which connects routers to the northbound network.
   * 
   * To get more information about InterconnectAttachment, see:
   * 
   * * [API documentation](https://cloud.google.com/distributed-cloud/edge/latest/docs/reference/network/rest/v1/projects.locations.zones.interconnectAttachments)
   * * How-to Guides
   *     * [Create and manage interconnect attachments](https://cloud.google.com/distributed-cloud/edge/latest/docs/attachments#api)
   */
  inline def InterconnectAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.edgenetwork.InterconnectAttachmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.edgenetwork.InterconnectAttachmentArgs.builder
    com.pulumi.gcp.edgenetwork.InterconnectAttachment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A Distributed Cloud Edge network, which provides L3 isolation within a zone.
   * 
   * To get more information about Network, see:
   * 
   * * [API documentation](https://cloud.google.com/distributed-cloud/edge/latest/docs/reference/network/rest/v1/projects.locations.zones.networks)
   * * How-to Guides
   *     * [Create and manage networks](https://cloud.google.com/distributed-cloud/edge/latest/docs/networks#api)
   */
  inline def Network(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.edgenetwork.NetworkArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.edgenetwork.NetworkArgs.builder
    com.pulumi.gcp.edgenetwork.Network(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A Distributed Cloud Edge subnet, which provides L2 isolation within a network.
   * 
   * To get more information about Subnet, see:
   * 
   * * [API documentation](https://cloud.google.com/distributed-cloud/edge/latest/docs/reference/network/rest/v1/projects.locations.zones.subnets)
   * * How-to Guides
   *     * [Create and manage subnetworks](https://cloud.google.com/distributed-cloud/edge/latest/docs/subnetworks#api)
   */
  inline def Subnet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.edgenetwork.SubnetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.edgenetwork.SubnetArgs.builder
    com.pulumi.gcp.edgenetwork.Subnet(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
