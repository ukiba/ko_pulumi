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
      (args: Endofunction[com.pulumi.aws.datapipeline.PipelineArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.datapipeline.PipelineArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.aws.datapipeline.Pipeline(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a DataPipeline Pipeline Definition resource. */
  def PipelineDefinition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.datapipeline.PipelineDefinitionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.datapipeline.PipelineDefinitionArgs.builder
    com.pulumi.aws.datapipeline.PipelineDefinition(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.datapipeline.PipelineDefinitionArgs.Builder)
    /**
     * @param parameterObjects Configuration block for the parameter objects used in the pipeline definition. See below
     * @return builder
     */
    def parameterObjects(args: Endofunction[com.pulumi.aws.datapipeline.inputs.PipelineDefinitionParameterObjectArgs.Builder]*):
        com.pulumi.aws.datapipeline.PipelineDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.aws.datapipeline.inputs.PipelineDefinitionParameterObjectArgs.builder
      builder.parameterObjects(args.map(_(argsBuilder).build)*)

    /**
     * @param parameterValues Configuration block for the parameter values used in the pipeline definition. See below
     * @return builder
     */
    def parameterValues(args: Endofunction[com.pulumi.aws.datapipeline.inputs.PipelineDefinitionParameterValueArgs.Builder]*):
        com.pulumi.aws.datapipeline.PipelineDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.aws.datapipeline.inputs.PipelineDefinitionParameterValueArgs.builder
      builder.parameterValues(args.map(_(argsBuilder).build)*)

    /**
     * @param pipelineObjects Configuration block for the objects that define the pipeline. See below
     * 
     *  The following arguments are optional:
     * @return builder
     */
    def pipelineObjects(args: Endofunction[com.pulumi.aws.datapipeline.inputs.PipelineDefinitionPipelineObjectArgs.Builder]*):
        com.pulumi.aws.datapipeline.PipelineDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.aws.datapipeline.inputs.PipelineDefinitionPipelineObjectArgs.builder
      builder.pipelineObjects(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.datapipeline.inputs.GetPipelineDefinitionArgs.Builder)
    /**
     * @param parameterValues Parameter values used in the pipeline definition. See below
     * @return builder
     */
    def parameterValues(args: Endofunction[com.pulumi.aws.datapipeline.inputs.GetPipelineDefinitionParameterValueArgs.Builder]*):
        com.pulumi.aws.datapipeline.inputs.GetPipelineDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.aws.datapipeline.inputs.GetPipelineDefinitionParameterValueArgs.builder
      builder.parameterValues(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.datapipeline.inputs.PipelineDefinitionPipelineObjectArgs.Builder)
    /**
     * @param fields Configuration block for Key-value pairs that define the properties of the object. See below
     * @return builder
     */
    def fields(args: Endofunction[com.pulumi.aws.datapipeline.inputs.PipelineDefinitionPipelineObjectFieldArgs.Builder]*):
        com.pulumi.aws.datapipeline.inputs.PipelineDefinitionPipelineObjectArgs.Builder =
      def argsBuilder = com.pulumi.aws.datapipeline.inputs.PipelineDefinitionPipelineObjectFieldArgs.builder
      builder.fields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.datapipeline.inputs.PipelineDefinitionParameterObjectArgs.Builder)
    /**
     * @param attributes Configuration block for attributes of the parameter object. See below
     * @return builder
     */
    def attributes(args: Endofunction[com.pulumi.aws.datapipeline.inputs.PipelineDefinitionParameterObjectAttributeArgs.Builder]*):
        com.pulumi.aws.datapipeline.inputs.PipelineDefinitionParameterObjectArgs.Builder =
      def argsBuilder = com.pulumi.aws.datapipeline.inputs.PipelineDefinitionParameterObjectAttributeArgs.builder
      builder.attributes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.datapipeline.inputs.PipelineDefinitionState.Builder)
    /**
     * @param parameterObjects Configuration block for the parameter objects used in the pipeline definition. See below
     * @return builder
     */
    def parameterObjects(args: Endofunction[com.pulumi.aws.datapipeline.inputs.PipelineDefinitionParameterObjectArgs.Builder]*):
        com.pulumi.aws.datapipeline.inputs.PipelineDefinitionState.Builder =
      def argsBuilder = com.pulumi.aws.datapipeline.inputs.PipelineDefinitionParameterObjectArgs.builder
      builder.parameterObjects(args.map(_(argsBuilder).build)*)

    /**
     * @param parameterValues Configuration block for the parameter values used in the pipeline definition. See below
     * @return builder
     */
    def parameterValues(args: Endofunction[com.pulumi.aws.datapipeline.inputs.PipelineDefinitionParameterValueArgs.Builder]*):
        com.pulumi.aws.datapipeline.inputs.PipelineDefinitionState.Builder =
      def argsBuilder = com.pulumi.aws.datapipeline.inputs.PipelineDefinitionParameterValueArgs.builder
      builder.parameterValues(args.map(_(argsBuilder).build)*)

    /**
     * @param pipelineObjects Configuration block for the objects that define the pipeline. See below
     * 
     *  The following arguments are optional:
     * @return builder
     */
    def pipelineObjects(args: Endofunction[com.pulumi.aws.datapipeline.inputs.PipelineDefinitionPipelineObjectArgs.Builder]*):
        com.pulumi.aws.datapipeline.inputs.PipelineDefinitionState.Builder =
      def argsBuilder = com.pulumi.aws.datapipeline.inputs.PipelineDefinitionPipelineObjectArgs.builder
      builder.pipelineObjects(args.map(_(argsBuilder).build)*)
