package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object account:
  object AccountFunctions:
    /** Data source for the primary contact information associated with an AWS Account. */
    inline def getPrimaryContact(args: Endofunction[com.pulumi.aws.account.inputs.GetPrimaryContactArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.account.outputs.GetPrimaryContactResult] =
      val argsBuilder = com.pulumi.aws.account.inputs.GetPrimaryContactArgs.builder
      com.pulumi.aws.account.AccountFunctions.getPrimaryContact(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for the primary contact information associated with an AWS Account. */
    inline def getPrimaryContactPlain(args: Endofunction[com.pulumi.aws.account.inputs.GetPrimaryContactPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.account.outputs.GetPrimaryContactResult] =
      val argsBuilder = com.pulumi.aws.account.inputs.GetPrimaryContactPlainArgs.builder
      com.pulumi.aws.account.AccountFunctions.getPrimaryContactPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * The `aws.account.getRegions` data source lets you query AWS region information for any account in your AWS Organization. It uses the AWS Account REST Service to show all regions, including those that are enabled, disabled, or in the process of being enabled or disabled. You can list regions for any organization account, see all possible region opt-in statuses (`ENABLED`, `ENABLING`, `DISABLING`, `DISABLED`, `ENABLED_BY_DEFAULT`), and check which regions are being enabled or disabled.
     * 
     * This is more comprehensive than the aws.getRegions data source, which only uses the EC2 REST service and is limited to the current account and a subset of region statuses.
     */
    inline def getRegions(args: Endofunction[com.pulumi.aws.account.inputs.GetRegionsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.account.outputs.GetRegionsResult] =
      val argsBuilder = com.pulumi.aws.account.inputs.GetRegionsArgs.builder
      com.pulumi.aws.account.AccountFunctions.getRegions(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * The `aws.account.getRegions` data source lets you query AWS region information for any account in your AWS Organization. It uses the AWS Account REST Service to show all regions, including those that are enabled, disabled, or in the process of being enabled or disabled. You can list regions for any organization account, see all possible region opt-in statuses (`ENABLED`, `ENABLING`, `DISABLING`, `DISABLED`, `ENABLED_BY_DEFAULT`), and check which regions are being enabled or disabled.
     * 
     * This is more comprehensive than the aws.getRegions data source, which only uses the EC2 REST service and is limited to the current account and a subset of region statuses.
     */
    inline def getRegionsPlain(args: Endofunction[com.pulumi.aws.account.inputs.GetRegionsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.account.outputs.GetRegionsResult] =
      val argsBuilder = com.pulumi.aws.account.inputs.GetRegionsPlainArgs.builder
      com.pulumi.aws.account.AccountFunctions.getRegionsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages the specified alternate contact attached to an AWS Account. */
  def AlternativeContact(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.account.AlternativeContactArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.account.AlternativeContactArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.account.AlternativeContact(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages the specified primary contact information associated with an AWS Account. */
  def PrimaryContact(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.account.PrimaryContactArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.account.PrimaryContactArgs.builder
    com.pulumi.aws.account.PrimaryContact(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Enable (Opt-In) or Disable (Opt-Out) a particular Region for an AWS account. */
  def Region(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.account.RegionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.account.RegionArgs.builder
    com.pulumi.aws.account.Region(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
