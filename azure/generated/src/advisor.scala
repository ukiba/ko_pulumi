package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object advisor:
  type AdvisorFunctions = com.pulumi.azure.advisor.AdvisorFunctions
  object AdvisorFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.advisor.AdvisorFunctions.*
  extension (self: AdvisorFunctions.type)
    /** Use this data source to access information about an existing Advisor Recommendations. */
    def getRecommendations(args: Endofunction[com.pulumi.azure.advisor.inputs.GetRecommendationsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.advisor.outputs.GetRecommendationsResult] =
      val argsBuilder = com.pulumi.azure.advisor.inputs.GetRecommendationsArgs.builder
      com.pulumi.azure.advisor.AdvisorFunctions.getRecommendations(args(argsBuilder).build)

    /** Use this data source to access information about an existing Advisor Recommendations. */
    def getRecommendationsPlain(args: Endofunction[com.pulumi.azure.advisor.inputs.GetRecommendationsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.advisor.outputs.GetRecommendationsResult] =
      val argsBuilder = com.pulumi.azure.advisor.inputs.GetRecommendationsPlainArgs.builder
      com.pulumi.azure.advisor.AdvisorFunctions.getRecommendationsPlain(args(argsBuilder).build)

  /** Specifies a suppression for an Azure Advisor recommendation. */
  def Suppression(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.advisor.SuppressionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.advisor.SuppressionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.advisor.Suppression(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
