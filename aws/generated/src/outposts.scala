package jp.ukiba.ko_pulumi
package aws


object outposts:
  type OutpostsFunctions = com.pulumi.aws.outposts.OutpostsFunctions
  object OutpostsFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.outposts.OutpostsFunctions.*
  extension (self: OutpostsFunctions.type)
    /** Information about a specific hardware asset in an Outpost. */
    def getAsset(args: Endofunction[com.pulumi.aws.outposts.inputs.GetAssetArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.outposts.outputs.GetAssetResult] =
      val argsBuilder = com.pulumi.aws.outposts.inputs.GetAssetArgs.builder
      com.pulumi.aws.outposts.OutpostsFunctions.getAsset(args(argsBuilder).build)

    /** Information about a specific hardware asset in an Outpost. */
    def getAssetPlain(args: Endofunction[com.pulumi.aws.outposts.inputs.GetAssetPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.outposts.outputs.GetAssetResult] =
      val argsBuilder = com.pulumi.aws.outposts.inputs.GetAssetPlainArgs.builder
      com.pulumi.aws.outposts.OutpostsFunctions.getAssetPlain(args(argsBuilder).build)

    /** Information about hardware assets in an Outpost. */
    def getAssets(args: Endofunction[com.pulumi.aws.outposts.inputs.GetAssetsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.outposts.outputs.GetAssetsResult] =
      val argsBuilder = com.pulumi.aws.outposts.inputs.GetAssetsArgs.builder
      com.pulumi.aws.outposts.OutpostsFunctions.getAssets(args(argsBuilder).build)

    /** Information about hardware assets in an Outpost. */
    def getAssetsPlain(args: Endofunction[com.pulumi.aws.outposts.inputs.GetAssetsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.outposts.outputs.GetAssetsResult] =
      val argsBuilder = com.pulumi.aws.outposts.inputs.GetAssetsPlainArgs.builder
      com.pulumi.aws.outposts.OutpostsFunctions.getAssetsPlain(args(argsBuilder).build)

    /** Provides details about an Outposts Outpost. */
    def getOutpost(args: Endofunction[com.pulumi.aws.outposts.inputs.GetOutpostArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.outposts.outputs.GetOutpostResult] =
      val argsBuilder = com.pulumi.aws.outposts.inputs.GetOutpostArgs.builder
      com.pulumi.aws.outposts.OutpostsFunctions.getOutpost(args(argsBuilder).build)

    /** Provides details about an Outposts Outpost. */
    def getOutpostPlain(args: Endofunction[com.pulumi.aws.outposts.inputs.GetOutpostPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.outposts.outputs.GetOutpostResult] =
      val argsBuilder = com.pulumi.aws.outposts.inputs.GetOutpostPlainArgs.builder
      com.pulumi.aws.outposts.OutpostsFunctions.getOutpostPlain(args(argsBuilder).build)

    /** Information about single Outpost Instance Type. */
    def getOutpostInstanceType(args: Endofunction[com.pulumi.aws.outposts.inputs.GetOutpostInstanceTypeArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.outposts.outputs.GetOutpostInstanceTypeResult] =
      val argsBuilder = com.pulumi.aws.outposts.inputs.GetOutpostInstanceTypeArgs.builder
      com.pulumi.aws.outposts.OutpostsFunctions.getOutpostInstanceType(args(argsBuilder).build)

    /** Information about single Outpost Instance Type. */
    def getOutpostInstanceTypePlain(args: Endofunction[com.pulumi.aws.outposts.inputs.GetOutpostInstanceTypePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.outposts.outputs.GetOutpostInstanceTypeResult] =
      val argsBuilder = com.pulumi.aws.outposts.inputs.GetOutpostInstanceTypePlainArgs.builder
      com.pulumi.aws.outposts.OutpostsFunctions.getOutpostInstanceTypePlain(args(argsBuilder).build)

    /** Information about Outposts Instance Types. */
    def getOutpostInstanceTypes(args: Endofunction[com.pulumi.aws.outposts.inputs.GetOutpostInstanceTypesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.outposts.outputs.GetOutpostInstanceTypesResult] =
      val argsBuilder = com.pulumi.aws.outposts.inputs.GetOutpostInstanceTypesArgs.builder
      com.pulumi.aws.outposts.OutpostsFunctions.getOutpostInstanceTypes(args(argsBuilder).build)

    /** Information about Outposts Instance Types. */
    def getOutpostInstanceTypesPlain(args: Endofunction[com.pulumi.aws.outposts.inputs.GetOutpostInstanceTypesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.outposts.outputs.GetOutpostInstanceTypesResult] =
      val argsBuilder = com.pulumi.aws.outposts.inputs.GetOutpostInstanceTypesPlainArgs.builder
      com.pulumi.aws.outposts.OutpostsFunctions.getOutpostInstanceTypesPlain(args(argsBuilder).build)

    /** Provides details about multiple Outposts. */
    def getOutposts(args: Endofunction[com.pulumi.aws.outposts.inputs.GetOutpostsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.outposts.outputs.GetOutpostsResult] =
      val argsBuilder = com.pulumi.aws.outposts.inputs.GetOutpostsArgs.builder
      com.pulumi.aws.outposts.OutpostsFunctions.getOutposts(args(argsBuilder).build)

    /** Provides details about multiple Outposts. */
    def getOutpostsPlain(args: Endofunction[com.pulumi.aws.outposts.inputs.GetOutpostsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.outposts.outputs.GetOutpostsResult] =
      val argsBuilder = com.pulumi.aws.outposts.inputs.GetOutpostsPlainArgs.builder
      com.pulumi.aws.outposts.OutpostsFunctions.getOutpostsPlain(args(argsBuilder).build)

    /** Provides details about an Outposts Site. */
    def getSite(args: Endofunction[com.pulumi.aws.outposts.inputs.GetSiteArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.outposts.outputs.GetSiteResult] =
      val argsBuilder = com.pulumi.aws.outposts.inputs.GetSiteArgs.builder
      com.pulumi.aws.outposts.OutpostsFunctions.getSite(args(argsBuilder).build)

    /** Provides details about an Outposts Site. */
    def getSitePlain(args: Endofunction[com.pulumi.aws.outposts.inputs.GetSitePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.outposts.outputs.GetSiteResult] =
      val argsBuilder = com.pulumi.aws.outposts.inputs.GetSitePlainArgs.builder
      com.pulumi.aws.outposts.OutpostsFunctions.getSitePlain(args(argsBuilder).build)

    /** Provides details about multiple Outposts Sites. */
    def getSites(args: Endofunction[com.pulumi.aws.outposts.inputs.GetSitesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.outposts.outputs.GetSitesResult] =
      val argsBuilder = com.pulumi.aws.outposts.inputs.GetSitesArgs.builder
      com.pulumi.aws.outposts.OutpostsFunctions.getSites(args(argsBuilder).build)

    /** Provides details about multiple Outposts Sites. */
    def getSitesPlain(args: Endofunction[com.pulumi.aws.outposts.inputs.GetSitesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.outposts.outputs.GetSitesResult] =
      val argsBuilder = com.pulumi.aws.outposts.inputs.GetSitesPlainArgs.builder
      com.pulumi.aws.outposts.OutpostsFunctions.getSitesPlain(args(argsBuilder).build)
