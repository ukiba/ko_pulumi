package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object blockchainnodeengine:
  /**
   * A representation of a blockchain node.
   * 
   * To get more information about BlockchainNodes, see:
   * 
   * * [API documentation](https://cloud.google.com/blockchain-node-engine/docs/reference/rest/v1/projects.locations.blockchainNodes)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/blockchain-node-engine)
   */
  def BlockchainNodes(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.blockchainnodeengine.BlockchainNodesArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.blockchainnodeengine.BlockchainNodesArgs.builder
    com.pulumi.gcp.blockchainnodeengine.BlockchainNodes(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
