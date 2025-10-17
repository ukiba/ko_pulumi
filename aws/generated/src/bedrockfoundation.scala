package jp.ukiba.ko_pulumi
package aws


object bedrockfoundation:
  object BedrockfoundationFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Data source for managing an AWS Bedrock Foundation Model. */
    inline def getModel(args: Endofunction[com.pulumi.aws.bedrockfoundation.inputs.GetModelArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.bedrockfoundation.outputs.GetModelResult] =
      val argsBuilder = com.pulumi.aws.bedrockfoundation.inputs.GetModelArgs.builder
      com.pulumi.aws.bedrockfoundation.BedrockfoundationFunctions.getModel(args(argsBuilder).build)

    /** Data source for managing an AWS Bedrock Foundation Model. */
    inline def getModelPlain(args: Endofunction[com.pulumi.aws.bedrockfoundation.inputs.GetModelPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.bedrockfoundation.outputs.GetModelResult] =
      val argsBuilder = com.pulumi.aws.bedrockfoundation.inputs.GetModelPlainArgs.builder
      com.pulumi.aws.bedrockfoundation.BedrockfoundationFunctions.getModelPlain(args(argsBuilder).build)

    /** Data source for managing AWS Bedrock Foundation Models. */
    inline def getModels(args: Endofunction[com.pulumi.aws.bedrockfoundation.inputs.GetModelsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.bedrockfoundation.outputs.GetModelsResult] =
      val argsBuilder = com.pulumi.aws.bedrockfoundation.inputs.GetModelsArgs.builder
      com.pulumi.aws.bedrockfoundation.BedrockfoundationFunctions.getModels(args(argsBuilder).build)

    /** Data source for managing AWS Bedrock Foundation Models. */
    inline def getModelsPlain(args: Endofunction[com.pulumi.aws.bedrockfoundation.inputs.GetModelsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.bedrockfoundation.outputs.GetModelsResult] =
      val argsBuilder = com.pulumi.aws.bedrockfoundation.inputs.GetModelsPlainArgs.builder
      com.pulumi.aws.bedrockfoundation.BedrockfoundationFunctions.getModelsPlain(args(argsBuilder).build)
