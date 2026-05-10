package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object marketplace:
  type MarketplaceFunctions = com.pulumi.azure.marketplace.MarketplaceFunctions
  object MarketplaceFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.marketplace.MarketplaceFunctions.*
  extension (self: MarketplaceFunctions.type)
    /** Uses this data source to access information about an existing Marketplace Agreement. */
    def getAgreement(args: Endofunction[com.pulumi.azure.marketplace.inputs.GetAgreementArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.marketplace.outputs.GetAgreementResult] =
      val argsBuilder = com.pulumi.azure.marketplace.inputs.GetAgreementArgs.builder
      com.pulumi.azure.marketplace.MarketplaceFunctions.getAgreement(args(argsBuilder).build)

    /** Uses this data source to access information about an existing Marketplace Agreement. */
    def getAgreementPlain(args: Endofunction[com.pulumi.azure.marketplace.inputs.GetAgreementPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.marketplace.outputs.GetAgreementResult] =
      val argsBuilder = com.pulumi.azure.marketplace.inputs.GetAgreementPlainArgs.builder
      com.pulumi.azure.marketplace.MarketplaceFunctions.getAgreementPlain(args(argsBuilder).build)

  /** Assigns a given Principal (User or Group) to a given Role in a Private Azure Marketplace. */
  def RoleAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.marketplace.RoleAssignmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.marketplace.RoleAssignmentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.marketplace.RoleAssignment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Allows accepting the Legal Terms for a Marketplace Image. */
  def Agreement(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.marketplace.AgreementArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.marketplace.AgreementArgs.builder
    com.pulumi.azure.marketplace.Agreement(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
