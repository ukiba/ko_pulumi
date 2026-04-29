package jp.ukiba.ko_pulumi
package aws


object bedrockfoundation:
  type BedrockfoundationFunctions = com.pulumi.aws.bedrockfoundation.BedrockfoundationFunctions
  object BedrockfoundationFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.bedrockfoundation.BedrockfoundationFunctions.*
  extension (self: BedrockfoundationFunctions.type)
    /** Data source for managing an AWS Bedrock Foundation Model. */
    def getModel(args: Endofunction[com.pulumi.aws.bedrockfoundation.inputs.GetModelArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.bedrockfoundation.outputs.GetModelResult] =
      val argsBuilder = com.pulumi.aws.bedrockfoundation.inputs.GetModelArgs.builder
      com.pulumi.aws.bedrockfoundation.BedrockfoundationFunctions.getModel(args(argsBuilder).build)

    /** Data source for managing an AWS Bedrock Foundation Model. */
    def getModelPlain(args: Endofunction[com.pulumi.aws.bedrockfoundation.inputs.GetModelPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.bedrockfoundation.outputs.GetModelResult] =
      val argsBuilder = com.pulumi.aws.bedrockfoundation.inputs.GetModelPlainArgs.builder
      com.pulumi.aws.bedrockfoundation.BedrockfoundationFunctions.getModelPlain(args(argsBuilder).build)

    /** Data source for managing AWS Bedrock Foundation Models. */
    def getModels(args: Endofunction[com.pulumi.aws.bedrockfoundation.inputs.GetModelsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.bedrockfoundation.outputs.GetModelsResult] =
      val argsBuilder = com.pulumi.aws.bedrockfoundation.inputs.GetModelsArgs.builder
      com.pulumi.aws.bedrockfoundation.BedrockfoundationFunctions.getModels(args(argsBuilder).build)

    /** Data source for managing AWS Bedrock Foundation Models. */
    def getModelsPlain(args: Endofunction[com.pulumi.aws.bedrockfoundation.inputs.GetModelsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.bedrockfoundation.outputs.GetModelsResult] =
      val argsBuilder = com.pulumi.aws.bedrockfoundation.inputs.GetModelsPlainArgs.builder
      com.pulumi.aws.bedrockfoundation.BedrockfoundationFunctions.getModelsPlain(args(argsBuilder).build)
