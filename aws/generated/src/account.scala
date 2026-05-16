package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object account:
  /** Manages the specified alternate contact attached to an AWS Account. */
  def AlternativeContact(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.account.AlternativeContactArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.account.AlternativeContactArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.account.AlternativeContact(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Enable (Opt-In) or Disable (Opt-Out) a particular Region for an AWS account. */
  def Region(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.account.RegionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.account.RegionArgs.builder
    com.pulumi.aws.account.Region(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages the specified primary contact information associated with an AWS Account. */
  def PrimaryContact(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.account.PrimaryContactArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.account.PrimaryContactArgs.builder
    com.pulumi.aws.account.PrimaryContact(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object AccountFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Data source for the primary contact information associated with an AWS Account. */
    inline def getPrimaryContact(args: Endofunction[com.pulumi.aws.account.inputs.GetPrimaryContactArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.account.outputs.GetPrimaryContactResult] =
      val argsBuilder = com.pulumi.aws.account.inputs.GetPrimaryContactArgs.builder
      com.pulumi.aws.account.AccountFunctions.getPrimaryContact(args(argsBuilder).build)

    /** Data source for the primary contact information associated with an AWS Account. */
    inline def getPrimaryContactPlain(args: Endofunction[com.pulumi.aws.account.inputs.GetPrimaryContactPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.account.outputs.GetPrimaryContactResult] =
      val argsBuilder = com.pulumi.aws.account.inputs.GetPrimaryContactPlainArgs.builder
      com.pulumi.aws.account.AccountFunctions.getPrimaryContactPlain(args(argsBuilder).build)

    /**
     * The `aws.account.getRegions` data source lets you query AWS region information for any account in your AWS Organization. It uses the AWS Account REST Service to show all regions, including those that are enabled, disabled, or in the process of being enabled or disabled. You can list regions for any organization account, see all possible region opt-in statuses (`ENABLED`, `ENABLING`, `DISABLING`, `DISABLED`, `ENABLED_BY_DEFAULT`), and check which regions are being enabled or disabled.
     * 
     *  This is more comprehensive than the aws.getRegions data source, which only uses the EC2 REST service and is limited to the current account and a subset of region statuses.
     */
    inline def getRegions(args: Endofunction[com.pulumi.aws.account.inputs.GetRegionsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.account.outputs.GetRegionsResult] =
      val argsBuilder = com.pulumi.aws.account.inputs.GetRegionsArgs.builder
      com.pulumi.aws.account.AccountFunctions.getRegions(args(argsBuilder).build)

    /**
     * The `aws.account.getRegions` data source lets you query AWS region information for any account in your AWS Organization. It uses the AWS Account REST Service to show all regions, including those that are enabled, disabled, or in the process of being enabled or disabled. You can list regions for any organization account, see all possible region opt-in statuses (`ENABLED`, `ENABLING`, `DISABLING`, `DISABLED`, `ENABLED_BY_DEFAULT`), and check which regions are being enabled or disabled.
     * 
     *  This is more comprehensive than the aws.getRegions data source, which only uses the EC2 REST service and is limited to the current account and a subset of region statuses.
     */
    inline def getRegionsPlain(args: Endofunction[com.pulumi.aws.account.inputs.GetRegionsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.account.outputs.GetRegionsResult] =
      val argsBuilder = com.pulumi.aws.account.inputs.GetRegionsPlainArgs.builder
      com.pulumi.aws.account.AccountFunctions.getRegionsPlain(args(argsBuilder).build)
