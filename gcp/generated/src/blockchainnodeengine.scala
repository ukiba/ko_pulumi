package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object blockchainnodeengine:
  extension (builder: com.pulumi.gcp.blockchainnodeengine.BlockchainNodesArgs.Builder)
    /**
     * @param ethereumDetails User-provided key-value pairs
     *  Structure is documented below.
     * @return builder
     */
    def ethereumDetails(args: Endofunction[com.pulumi.gcp.blockchainnodeengine.inputs.BlockchainNodesEthereumDetailsArgs.Builder]):
        com.pulumi.gcp.blockchainnodeengine.BlockchainNodesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.blockchainnodeengine.inputs.BlockchainNodesEthereumDetailsArgs.builder
      builder.ethereumDetails(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.blockchainnodeengine.inputs.BlockchainNodesState.Builder)
    /**
     * @param connectionInfos The connection information through which to interact with a blockchain node.
     *  Structure is documented below.
     * @return builder
     */
    def connectionInfos(args: Endofunction[com.pulumi.gcp.blockchainnodeengine.inputs.BlockchainNodesConnectionInfoArgs.Builder]*):
        com.pulumi.gcp.blockchainnodeengine.inputs.BlockchainNodesState.Builder =
      def argsBuilder = com.pulumi.gcp.blockchainnodeengine.inputs.BlockchainNodesConnectionInfoArgs.builder
      builder.connectionInfos(args.map(_(argsBuilder).build)*)

    /**
     * @param ethereumDetails User-provided key-value pairs
     *  Structure is documented below.
     * @return builder
     */
    def ethereumDetails(args: Endofunction[com.pulumi.gcp.blockchainnodeengine.inputs.BlockchainNodesEthereumDetailsArgs.Builder]):
        com.pulumi.gcp.blockchainnodeengine.inputs.BlockchainNodesState.Builder =
      val argsBuilder = com.pulumi.gcp.blockchainnodeengine.inputs.BlockchainNodesEthereumDetailsArgs.builder
      builder.ethereumDetails(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.blockchainnodeengine.inputs.BlockchainNodesConnectionInfoArgs.Builder)
    /**
     * @param endpointInfos (Output)
     *  The endpoint information through which to interact with a blockchain node.
     *  Structure is documented below.
     * @return builder
     */
    def endpointInfos(args: Endofunction[com.pulumi.gcp.blockchainnodeengine.inputs.BlockchainNodesConnectionInfoEndpointInfoArgs.Builder]*):
        com.pulumi.gcp.blockchainnodeengine.inputs.BlockchainNodesConnectionInfoArgs.Builder =
      def argsBuilder = com.pulumi.gcp.blockchainnodeengine.inputs.BlockchainNodesConnectionInfoEndpointInfoArgs.builder
      builder.endpointInfos(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.blockchainnodeengine.inputs.BlockchainNodesEthereumDetailsArgs.Builder)
    /**
     * @param additionalEndpoints (Output)
     *  User-provided key-value pairs
     *  Structure is documented below.
     * @return builder
     */
    def additionalEndpoints(args: Endofunction[com.pulumi.gcp.blockchainnodeengine.inputs.BlockchainNodesEthereumDetailsAdditionalEndpointArgs.Builder]*):
        com.pulumi.gcp.blockchainnodeengine.inputs.BlockchainNodesEthereumDetailsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.blockchainnodeengine.inputs.BlockchainNodesEthereumDetailsAdditionalEndpointArgs.builder
      builder.additionalEndpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param gethDetails User-provided key-value pairs
     *  Structure is documented below.
     * @return builder
     */
    def gethDetails(args: Endofunction[com.pulumi.gcp.blockchainnodeengine.inputs.BlockchainNodesEthereumDetailsGethDetailsArgs.Builder]):
        com.pulumi.gcp.blockchainnodeengine.inputs.BlockchainNodesEthereumDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.blockchainnodeengine.inputs.BlockchainNodesEthereumDetailsGethDetailsArgs.builder
      builder.gethDetails(args(argsBuilder).build)

    /**
     * @param validatorConfig Configuration for validator-related parameters on the beacon client, and for any managed validator client.
     *  Structure is documented below.
     * @return builder
     */
    def validatorConfig(args: Endofunction[com.pulumi.gcp.blockchainnodeengine.inputs.BlockchainNodesEthereumDetailsValidatorConfigArgs.Builder]):
        com.pulumi.gcp.blockchainnodeengine.inputs.BlockchainNodesEthereumDetailsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.blockchainnodeengine.inputs.BlockchainNodesEthereumDetailsValidatorConfigArgs.builder
      builder.validatorConfig(args(argsBuilder).build)

  /**
   * A representation of a blockchain node.
   * 
   *  To get more information about BlockchainNodes, see:
   * 
   *  * [API documentation](https://cloud.google.com/blockchain-node-engine/docs/reference/rest/v1/projects.locations.blockchainNodes)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/blockchain-node-engine)
   */
  def BlockchainNodes(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.blockchainnodeengine.BlockchainNodesArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.blockchainnodeengine.BlockchainNodesArgs.builder
    com.pulumi.gcp.blockchainnodeengine.BlockchainNodes(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
