package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object dax:
  /** Provides a DAX Parameter Group resource. */
  def ParameterGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.dax.ParameterGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.dax.ParameterGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.dax.ParameterGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a DAX Subnet Group resource. */
  def SubnetGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.dax.SubnetGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.dax.SubnetGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.dax.SubnetGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a DAX Cluster resource. */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.dax.ClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.dax.ClusterArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.dax.Cluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.dax.ParameterGroupArgs.Builder)
    /**
     * @param parameters The parameters of the parameter group.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.dax.inputs.ParameterGroupParameterArgs.Builder]*):
        com.pulumi.aws.dax.ParameterGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.dax.inputs.ParameterGroupParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.dax.ClusterArgs.Builder)
    /**
     * @param serverSideEncryption Encrypt at rest options
     * @return builder
     */
    def serverSideEncryption(args: Endofunction[com.pulumi.aws.dax.inputs.ClusterServerSideEncryptionArgs.Builder]):
        com.pulumi.aws.dax.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.dax.inputs.ClusterServerSideEncryptionArgs.builder
      builder.serverSideEncryption(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dax.inputs.ParameterGroupState.Builder)
    /**
     * @param parameters The parameters of the parameter group.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.aws.dax.inputs.ParameterGroupParameterArgs.Builder]*):
        com.pulumi.aws.dax.inputs.ParameterGroupState.Builder =
      def argsBuilder = com.pulumi.aws.dax.inputs.ParameterGroupParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.dax.inputs.ClusterState.Builder)
    /**
     * @param nodes List of node objects including `id`, `address`, `port` and
     *  `availabilityZone`. Referenceable e.g., as
     *  `${aws_dax_cluster.test.nodes.0.address}`
     * @return builder
     */
    def nodes(args: Endofunction[com.pulumi.aws.dax.inputs.ClusterNodeArgs.Builder]*):
        com.pulumi.aws.dax.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.aws.dax.inputs.ClusterNodeArgs.builder
      builder.nodes(args.map(_(argsBuilder).build)*)

    /**
     * @param serverSideEncryption Encrypt at rest options
     * @return builder
     */
    def serverSideEncryption(args: Endofunction[com.pulumi.aws.dax.inputs.ClusterServerSideEncryptionArgs.Builder]):
        com.pulumi.aws.dax.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.dax.inputs.ClusterServerSideEncryptionArgs.builder
      builder.serverSideEncryption(args(argsBuilder).build)
