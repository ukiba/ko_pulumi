package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object datapipeline:
  object DatapipelineFunctions:
    /** Provides details about a specific DataPipeline Pipeline. */
    inline def getPipeline(args: Endofunction[com.pulumi.aws.datapipeline.inputs.GetPipelineArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.datapipeline.outputs.GetPipelineResult] =
      val argsBuilder = com.pulumi.aws.datapipeline.inputs.GetPipelineArgs.builder
      com.pulumi.aws.datapipeline.DatapipelineFunctions.getPipeline(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about a specific DataPipeline Pipeline. */
    inline def getPipelinePlain(args: Endofunction[com.pulumi.aws.datapipeline.inputs.GetPipelinePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.datapipeline.outputs.GetPipelineResult] =
      val argsBuilder = com.pulumi.aws.datapipeline.inputs.GetPipelinePlainArgs.builder
      com.pulumi.aws.datapipeline.DatapipelineFunctions.getPipelinePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides details about a specific DataPipeline Pipeline Definition. */
    inline def getPipelineDefinition(args: Endofunction[com.pulumi.aws.datapipeline.inputs.GetPipelineDefinitionArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.datapipeline.outputs.GetPipelineDefinitionResult] =
      val argsBuilder = com.pulumi.aws.datapipeline.inputs.GetPipelineDefinitionArgs.builder
      com.pulumi.aws.datapipeline.DatapipelineFunctions.getPipelineDefinition(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about a specific DataPipeline Pipeline Definition. */
    inline def getPipelineDefinitionPlain(args: Endofunction[com.pulumi.aws.datapipeline.inputs.GetPipelineDefinitionPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.datapipeline.outputs.GetPipelineDefinitionResult] =
      val argsBuilder = com.pulumi.aws.datapipeline.inputs.GetPipelineDefinitionPlainArgs.builder
      com.pulumi.aws.datapipeline.DatapipelineFunctions.getPipelineDefinitionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Provides a DataPipeline Pipeline resource. */
  def Pipeline(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.datapipeline.PipelineArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.datapipeline.PipelineArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.datapipeline.Pipeline(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a DataPipeline Pipeline Definition resource. */
  def PipelineDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.datapipeline.PipelineDefinitionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.datapipeline.PipelineDefinitionArgs.builder
    com.pulumi.aws.datapipeline.PipelineDefinition(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
