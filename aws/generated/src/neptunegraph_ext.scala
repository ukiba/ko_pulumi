package jp.ukiba.ko_pulumi
package aws

object neptunegraph_ext:
  extension (builder: com.pulumi.aws.neptunegraph.GraphArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.neptunegraph.inputs.GraphTimeoutsArgs.Builder]):
        com.pulumi.aws.neptunegraph.GraphArgs.Builder =
      val argsBuilder = com.pulumi.aws.neptunegraph.inputs.GraphTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param vectorSearchConfiguration Vector Search Configuration (see below for nested schema of vector_search_configuration)
     * @return builder
     */
    def vectorSearchConfiguration(args: Endofunction[com.pulumi.aws.neptunegraph.inputs.GraphVectorSearchConfigurationArgs.Builder]):
        com.pulumi.aws.neptunegraph.GraphArgs.Builder =
      val argsBuilder = com.pulumi.aws.neptunegraph.inputs.GraphVectorSearchConfigurationArgs.builder
      builder.vectorSearchConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.neptunegraph.PrivateGraphEndpointArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.neptunegraph.inputs.PrivateGraphEndpointTimeoutsArgs.Builder]):
        com.pulumi.aws.neptunegraph.PrivateGraphEndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.neptunegraph.inputs.PrivateGraphEndpointTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.neptunegraph.inputs.GraphState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.neptunegraph.inputs.GraphTimeoutsArgs.Builder]):
        com.pulumi.aws.neptunegraph.inputs.GraphState.Builder =
      val argsBuilder = com.pulumi.aws.neptunegraph.inputs.GraphTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param vectorSearchConfiguration Vector Search Configuration (see below for nested schema of vector_search_configuration)
     * @return builder
     */
    def vectorSearchConfiguration(args: Endofunction[com.pulumi.aws.neptunegraph.inputs.GraphVectorSearchConfigurationArgs.Builder]):
        com.pulumi.aws.neptunegraph.inputs.GraphState.Builder =
      val argsBuilder = com.pulumi.aws.neptunegraph.inputs.GraphVectorSearchConfigurationArgs.builder
      builder.vectorSearchConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.neptunegraph.inputs.PrivateGraphEndpointState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.neptunegraph.inputs.PrivateGraphEndpointTimeoutsArgs.Builder]):
        com.pulumi.aws.neptunegraph.inputs.PrivateGraphEndpointState.Builder =
      val argsBuilder = com.pulumi.aws.neptunegraph.inputs.PrivateGraphEndpointTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
