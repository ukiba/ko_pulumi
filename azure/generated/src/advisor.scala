package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object advisor:
  object AdvisorFunctions:
    /** Use this data source to access information about an existing Advisor Recommendations. */
    inline def getRecommendations(args: Endofunction[com.pulumi.azure.advisor.inputs.GetRecommendationsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.advisor.outputs.GetRecommendationsResult] =
      val argsBuilder = com.pulumi.azure.advisor.inputs.GetRecommendationsArgs.builder
      com.pulumi.azure.advisor.AdvisorFunctions.getRecommendations(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Advisor Recommendations. */
    inline def getRecommendationsPlain(args: Endofunction[com.pulumi.azure.advisor.inputs.GetRecommendationsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.advisor.outputs.GetRecommendationsResult] =
      val argsBuilder = com.pulumi.azure.advisor.inputs.GetRecommendationsPlainArgs.builder
      com.pulumi.azure.advisor.AdvisorFunctions.getRecommendationsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Specifies a suppression for an Azure Advisor recommendation. */
  inline def Suppression(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.advisor.SuppressionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.advisor.SuppressionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.advisor.Suppression(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
