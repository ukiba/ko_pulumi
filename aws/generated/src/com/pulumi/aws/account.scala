package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object account:
  /** Manages the specified alternate contact attached to an AWS Account. */
  def AlternativeContact(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.account.AlternativeContactArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.account.AlternativeContactArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.account.AlternativeContact(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Enable (Opt-In) or Disable (Opt-Out) a particular Region for an AWS account. */
  def Region(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.account.RegionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.account.RegionArgs.builder
    
    com.pulumi.aws.account.Region(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages the specified primary contact information associated with an AWS Account. */
  def PrimaryContact(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.account.PrimaryContactArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.account.PrimaryContactArgs.builder
    
    com.pulumi.aws.account.PrimaryContact(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type AccountFunctions = com.pulumi.aws.account.AccountFunctions
  object AccountFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.account.AccountFunctions.*
  extension (self: AccountFunctions.type)
    /** Data source for the primary contact information associated with an AWS Account. */
    def getPrimaryContact(args: Endofunction[com.pulumi.aws.account.inputs.GetPrimaryContactArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.account.outputs.GetPrimaryContactResult] =
      val argsBuilder = com.pulumi.aws.account.inputs.GetPrimaryContactArgs.builder
      com.pulumi.aws.account.AccountFunctions.getPrimaryContact(args(argsBuilder).build)

    /** Data source for the primary contact information associated with an AWS Account. */
    def getPrimaryContactPlain(args: Endofunction[com.pulumi.aws.account.inputs.GetPrimaryContactPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.account.outputs.GetPrimaryContactResult] =
      val argsBuilder = com.pulumi.aws.account.inputs.GetPrimaryContactPlainArgs.builder
      com.pulumi.aws.account.AccountFunctions.getPrimaryContactPlain(args(argsBuilder).build)
