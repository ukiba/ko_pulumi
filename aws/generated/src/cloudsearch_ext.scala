package jp.ukiba.ko_pulumi
package aws

object cloudsearch_ext:
  extension (builder: com.pulumi.aws.cloudsearch.DomainArgs.Builder)
    /**
     * @param endpointOptions Domain endpoint options. Documented below.
     * @return builder
     */
    inline def endpointOptions(args: Endofunction[com.pulumi.aws.cloudsearch.inputs.DomainEndpointOptionsArgs.Builder]):
        com.pulumi.aws.cloudsearch.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudsearch.inputs.DomainEndpointOptionsArgs.builder
      builder.endpointOptions(args(argsBuilder).build)

    /**
     * @param indexFields The index fields for documents added to the domain. Documented below.
     * @return builder
     */
    inline def indexFields(args: Endofunction[com.pulumi.aws.cloudsearch.inputs.DomainIndexFieldArgs.Builder]*):
        com.pulumi.aws.cloudsearch.DomainArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudsearch.inputs.DomainIndexFieldArgs.builder
      builder.indexFields(args.map(_(argsBuilder).build)*)

    /**
     * @param scalingParameters Domain scaling parameters. Documented below.
     * @return builder
     */
    inline def scalingParameters(args: Endofunction[com.pulumi.aws.cloudsearch.inputs.DomainScalingParametersArgs.Builder]):
        com.pulumi.aws.cloudsearch.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudsearch.inputs.DomainScalingParametersArgs.builder
      builder.scalingParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudsearch.inputs.DomainState.Builder)
    /**
     * @param endpointOptions Domain endpoint options. Documented below.
     * @return builder
     */
    inline def endpointOptions(args: Endofunction[com.pulumi.aws.cloudsearch.inputs.DomainEndpointOptionsArgs.Builder]):
        com.pulumi.aws.cloudsearch.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.cloudsearch.inputs.DomainEndpointOptionsArgs.builder
      builder.endpointOptions(args(argsBuilder).build)

    /**
     * @param indexFields The index fields for documents added to the domain. Documented below.
     * @return builder
     */
    inline def indexFields(args: Endofunction[com.pulumi.aws.cloudsearch.inputs.DomainIndexFieldArgs.Builder]*):
        com.pulumi.aws.cloudsearch.inputs.DomainState.Builder =
      def argsBuilder = com.pulumi.aws.cloudsearch.inputs.DomainIndexFieldArgs.builder
      builder.indexFields(args.map(_(argsBuilder).build)*)

    /**
     * @param scalingParameters Domain scaling parameters. Documented below.
     * @return builder
     */
    inline def scalingParameters(args: Endofunction[com.pulumi.aws.cloudsearch.inputs.DomainScalingParametersArgs.Builder]):
        com.pulumi.aws.cloudsearch.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.cloudsearch.inputs.DomainScalingParametersArgs.builder
      builder.scalingParameters(args(argsBuilder).build)
