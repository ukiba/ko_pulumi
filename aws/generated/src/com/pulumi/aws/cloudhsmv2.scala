package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object cloudhsmv2:
  /**
   * Creates an Amazon CloudHSM v2 cluster.
   *  
   *  For information about CloudHSM v2, see the
   *  [AWS CloudHSM User Guide](https://docs.aws.amazon.com/cloudhsm/latest/userguide/introduction.html) and the [Amazon
   *  CloudHSM API Reference][2].
   *  
   *  &gt; **NOTE:** A CloudHSM Cluster can take several minutes to set up.
   *  Practically no single attribute can be updated, except for `tags`.
   *  If you need to delete a cluster, you have to remove its HSM modules first.
   *  To initialize cluster, you have to add an HSM instance to the cluster, then sign CSR and upload it.
   */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudhsmv2.ClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudhsmv2.ClusterArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.cloudhsmv2.Cluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type Cloudhsmv2Functions = com.pulumi.aws.cloudhsmv2.Cloudhsmv2Functions
  object Cloudhsmv2Functions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.cloudhsmv2.Cloudhsmv2Functions.*
  extension (self: Cloudhsmv2Functions.type)
    /** Use this data source to get information about a CloudHSM v2 cluster */
    def getCluster(args: Endofunction[com.pulumi.aws.cloudhsmv2.inputs.GetClusterArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudhsmv2.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.aws.cloudhsmv2.inputs.GetClusterArgs.builder
      com.pulumi.aws.cloudhsmv2.Cloudhsmv2Functions.getCluster(args(argsBuilder).build)

    /** Use this data source to get information about a CloudHSM v2 cluster */
    def getClusterPlain(args: Endofunction[com.pulumi.aws.cloudhsmv2.inputs.GetClusterPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudhsmv2.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.aws.cloudhsmv2.inputs.GetClusterPlainArgs.builder
      com.pulumi.aws.cloudhsmv2.Cloudhsmv2Functions.getClusterPlain(args(argsBuilder).build)

  /** Creates an HSM module in Amazon CloudHSM v2 cluster. */
  def Hsm(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudhsmv2.HsmArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.cloudhsmv2.HsmArgs.builder
    
    com.pulumi.aws.cloudhsmv2.Hsm(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.cloudhsmv2.inputs.ClusterState.Builder)
    /**
     * @param clusterCertificates The list of cluster certificates.
     * @return builder
     */
    def clusterCertificates(args: Endofunction[com.pulumi.aws.cloudhsmv2.inputs.ClusterClusterCertificateArgs.Builder]*):
        com.pulumi.aws.cloudhsmv2.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.aws.cloudhsmv2.inputs.ClusterClusterCertificateArgs.builder
      builder.clusterCertificates(args.map(_(argsBuilder).build)*)
