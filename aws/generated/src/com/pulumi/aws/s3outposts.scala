package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object s3outposts:
  /** Provides a resource to manage an S3 Outposts Endpoint. */
  def Endpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.s3outposts.EndpointArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.s3outposts.EndpointArgs.builder
    
    com.pulumi.aws.s3outposts.Endpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.s3outposts.inputs.EndpointState.Builder)
    /**
     * @param networkInterfaces Set of nested attributes for associated Elastic Network Interfaces (ENIs).
     * @return builder
     */
    def networkInterfaces(args: Endofunction[com.pulumi.aws.s3outposts.inputs.EndpointNetworkInterfaceArgs.Builder]*):
        com.pulumi.aws.s3outposts.inputs.EndpointState.Builder =
      def argsBuilder = com.pulumi.aws.s3outposts.inputs.EndpointNetworkInterfaceArgs.builder
      builder.networkInterfaces(args.map(_(argsBuilder).build)*)
