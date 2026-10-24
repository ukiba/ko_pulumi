package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object datapipeline:
  object DatapipelineFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Provides details about a specific DataPipeline Pipeline. */
    inline def getPipeline(args: Endofunction[com.pulumi.aws.datapipeline.inputs.GetPipelineArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.datapipeline.outputs.GetPipelineResult] =
      val argsBuilder = com.pulumi.aws.datapipeline.inputs.GetPipelineArgs.builder
      com.pulumi.aws.datapipeline.DatapipelineFunctions.getPipeline(args(argsBuilder).build)

    /** Provides details about a specific DataPipeline Pipeline. */
    inline def getPipelinePlain(args: Endofunction[com.pulumi.aws.datapipeline.inputs.GetPipelinePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.datapipeline.outputs.GetPipelineResult] =
      val argsBuilder = com.pulumi.aws.datapipeline.inputs.GetPipelinePlainArgs.builder
      com.pulumi.aws.datapipeline.DatapipelineFunctions.getPipelinePlain(args(argsBuilder).build)

    /** Provides details about a specific DataPipeline Pipeline Definition. */
    inline def getPipelineDefinition(args: Endofunction[com.pulumi.aws.datapipeline.inputs.GetPipelineDefinitionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.datapipeline.outputs.GetPipelineDefinitionResult] =
      val argsBuilder = com.pulumi.aws.datapipeline.inputs.GetPipelineDefinitionArgs.builder
      com.pulumi.aws.datapipeline.DatapipelineFunctions.getPipelineDefinition(args(argsBuilder).build)

    /** Provides details about a specific DataPipeline Pipeline Definition. */
    inline def getPipelineDefinitionPlain(args: Endofunction[com.pulumi.aws.datapipeline.inputs.GetPipelineDefinitionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.datapipeline.outputs.GetPipelineDefinitionResult] =
      val argsBuilder = com.pulumi.aws.datapipeline.inputs.GetPipelineDefinitionPlainArgs.builder
      com.pulumi.aws.datapipeline.DatapipelineFunctions.getPipelineDefinitionPlain(args(argsBuilder).build)

  /** Provides a DataPipeline Pipeline resource. */
  def Pipeline(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.datapipeline.PipelineArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
  def PipelineDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.datapipeline.PipelineDefinitionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.datapipeline.PipelineDefinitionArgs.builder
    com.pulumi.aws.datapipeline.PipelineDefinition(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
