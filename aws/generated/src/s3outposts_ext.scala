package jp.ukiba.ko_pulumi
package aws

object s3outposts_ext:
  extension (builder: com.pulumi.aws.s3outposts.inputs.EndpointState.Builder)
    /**
     * @param networkInterfaces Set of nested attributes for associated Elastic Network Interfaces (ENIs).
     * @return builder
     */
    inline def networkInterfaces(args: Endofunction[com.pulumi.aws.s3outposts.inputs.EndpointNetworkInterfaceArgs.Builder]*):
        com.pulumi.aws.s3outposts.inputs.EndpointState.Builder =
      def argsBuilder = com.pulumi.aws.s3outposts.inputs.EndpointNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)
