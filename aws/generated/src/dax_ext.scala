package jp.ukiba.ko_pulumi
package aws

object dax_ext:
  extension (builder: com.pulumi.aws.dax.ClusterArgs.Builder)
    /**
     * @param serverSideEncryption Encrypt at rest options
     * @return builder
     */
    inline def serverSideEncryption(args: Endofunction[com.pulumi.aws.dax.inputs.ClusterServerSideEncryptionArgs.Builder]):
        com.pulumi.aws.dax.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.aws.dax.inputs.ClusterServerSideEncryptionArgs.builder
      builder.serverSideEncryption(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dax.ParameterGroupArgs.Builder)
    /**
     * @param parameters The parameters of the parameter group.
     * @return builder
     */
    inline def parameters(args: Endofunction[com.pulumi.aws.dax.inputs.ParameterGroupParameterArgs.Builder]*):
        com.pulumi.aws.dax.ParameterGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.dax.inputs.ParameterGroupParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.dax.inputs.ClusterState.Builder)
    /**
     * @param nodes List of node objects including `id`, `address`, `port` and
     * `availabilityZone`. Referenceable e.g., as
     * `\${aws_dax_cluster.test.nodes.0.address}`
     * @return builder
     */
    inline def nodes(args: Endofunction[com.pulumi.aws.dax.inputs.ClusterNodeArgs.Builder]*):
        com.pulumi.aws.dax.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.aws.dax.inputs.ClusterNodeArgs.builder
      builder.nodes(args.map(_(argsBuilder).build)*)

    /**
     * @param serverSideEncryption Encrypt at rest options
     * @return builder
     */
    inline def serverSideEncryption(args: Endofunction[com.pulumi.aws.dax.inputs.ClusterServerSideEncryptionArgs.Builder]):
        com.pulumi.aws.dax.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.aws.dax.inputs.ClusterServerSideEncryptionArgs.builder
      builder.serverSideEncryption(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dax.inputs.ParameterGroupState.Builder)
    /**
     * @param parameters The parameters of the parameter group.
     * @return builder
     */
    inline def parameters(args: Endofunction[com.pulumi.aws.dax.inputs.ParameterGroupParameterArgs.Builder]*):
        com.pulumi.aws.dax.inputs.ParameterGroupState.Builder =
      def argsBuilder = com.pulumi.aws.dax.inputs.ParameterGroupParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)
