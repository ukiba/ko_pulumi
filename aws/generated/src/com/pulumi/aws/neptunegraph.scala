package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object neptunegraph:
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

  /** The `aws.neptunegraph.Graph` resource creates an Amazon Analytics Graph. */
  def Graph(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.neptunegraph.GraphArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.neptunegraph.GraphArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.neptunegraph.Graph(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

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
