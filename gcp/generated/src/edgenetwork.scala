package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object edgenetwork:
  /**
   * A Distributed Cloud Edge network, which provides L3 isolation within a zone.
   * 
   *  To get more information about Network, see:
   * 
   *  * [API documentation](https://cloud.google.com/distributed-cloud/edge/latest/docs/reference/network/rest/v1/projects.locations.zones.networks)
   *  * How-to Guides
   *      * [Create and manage networks](https://cloud.google.com/distributed-cloud/edge/latest/docs/networks#api)
   */
  def Network(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.edgenetwork.NetworkArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.edgenetwork.NetworkArgs.builder
    com.pulumi.gcp.edgenetwork.Network(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Distributed Cloud Edge subnet, which provides L2 isolation within a network.
   * 
   *  To get more information about Subnet, see:
   * 
   *  * [API documentation](https://cloud.google.com/distributed-cloud/edge/latest/docs/reference/network/rest/v1/projects.locations.zones.subnets)
   *  * How-to Guides
   *      * [Create and manage subnetworks](https://cloud.google.com/distributed-cloud/edge/latest/docs/subnetworks#api)
   */
  def Subnet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.edgenetwork.SubnetArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.edgenetwork.SubnetArgs.builder
    com.pulumi.gcp.edgenetwork.Subnet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Distributed Cloud Edge interconnect attachment, which connects routers to the northbound network.
   * 
   *  To get more information about InterconnectAttachment, see:
   * 
   *  * [API documentation](https://cloud.google.com/distributed-cloud/edge/latest/docs/reference/network/rest/v1/projects.locations.zones.interconnectAttachments)
   *  * How-to Guides
   *      * [Create and manage interconnect attachments](https://cloud.google.com/distributed-cloud/edge/latest/docs/attachments#api)
   */
  def InterconnectAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.edgenetwork.InterconnectAttachmentArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.edgenetwork.InterconnectAttachmentArgs.builder
    com.pulumi.gcp.edgenetwork.InterconnectAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
