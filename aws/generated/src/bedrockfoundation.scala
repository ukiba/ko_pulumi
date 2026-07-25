package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

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

    /** Provides details about AWS Bedrock Foundation Model Agreement Offers. */
    inline def getModelAgreementOffers(args: Endofunction[com.pulumi.aws.bedrockfoundation.inputs.GetModelAgreementOffersArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.bedrockfoundation.outputs.GetModelAgreementOffersResult] =
      val argsBuilder = com.pulumi.aws.bedrockfoundation.inputs.GetModelAgreementOffersArgs.builder
      com.pulumi.aws.bedrockfoundation.BedrockfoundationFunctions.getModelAgreementOffers(args(argsBuilder).build)

    /** Provides details about AWS Bedrock Foundation Model Agreement Offers. */
    inline def getModelAgreementOffersPlain(args: Endofunction[com.pulumi.aws.bedrockfoundation.inputs.GetModelAgreementOffersPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.bedrockfoundation.outputs.GetModelAgreementOffersResult] =
      val argsBuilder = com.pulumi.aws.bedrockfoundation.inputs.GetModelAgreementOffersPlainArgs.builder
      com.pulumi.aws.bedrockfoundation.BedrockfoundationFunctions.getModelAgreementOffersPlain(args(argsBuilder).build)

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

  /** Manages an AWS Bedrock Foundation Model Agreement. */
  def ModelAgreement(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.bedrockfoundation.ModelAgreementArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.bedrockfoundation.ModelAgreementArgs.builder
    com.pulumi.aws.bedrockfoundation.ModelAgreement(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.bedrockfoundation.ModelAgreementArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.bedrockfoundation.inputs.ModelAgreementTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrockfoundation.ModelAgreementArgs.Builder =
      val argsBuilder = com.pulumi.aws.bedrockfoundation.inputs.ModelAgreementTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bedrockfoundation.inputs.ModelAgreementState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.bedrockfoundation.inputs.ModelAgreementTimeoutsArgs.Builder]):
        com.pulumi.aws.bedrockfoundation.inputs.ModelAgreementState.Builder =
      val argsBuilder = com.pulumi.aws.bedrockfoundation.inputs.ModelAgreementTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
