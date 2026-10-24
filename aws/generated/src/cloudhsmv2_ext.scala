package jp.ukiba.ko_pulumi
package aws

object cloudhsmv2_ext:
  extension (builder: com.pulumi.aws.cloudhsmv2.inputs.ClusterState.Builder)
    /**
     * @param clusterCertificates The list of cluster certificates.
     * @return builder
     */
    inline def clusterCertificates(args: Endofunction[com.pulumi.aws.cloudhsmv2.inputs.ClusterClusterCertificateArgs.Builder]*):
        com.pulumi.aws.cloudhsmv2.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.aws.cloudhsmv2.inputs.ClusterClusterCertificateArgs.builder
      builder.clusterCertificates(args.map(_(argsBuilder).build)*)
