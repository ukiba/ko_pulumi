package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object budgets:
  /** Manages a budgets budget resource. Budgets use the cost visualization provided by Cost Explorer to show you the status of your budgets, to provide forecasts of your estimated costs, and to track your AWS usage, including your free tier usage. For more detailed documentation about each argument, refer to the [AWS official documentation](http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/data-type-budget.html). */
  def Budget(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.budgets.BudgetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.budgets.BudgetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.budgets.Budget(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a budget action resource. Budget actions are cost savings controls that run either automatically on your behalf or by using a workflow approval process. */
  def BudgetAction(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.budgets.BudgetActionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.budgets.BudgetActionArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.budgets.BudgetAction(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object BudgetsFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Data source for managing an AWS Web Services Budgets Budget. */
    inline def getBudget(args: Endofunction[com.pulumi.aws.budgets.inputs.GetBudgetArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.budgets.outputs.GetBudgetResult] =
      val argsBuilder = com.pulumi.aws.budgets.inputs.GetBudgetArgs.builder
      com.pulumi.aws.budgets.BudgetsFunctions.getBudget(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS Web Services Budgets Budget. */
    inline def getBudgetPlain(args: Endofunction[com.pulumi.aws.budgets.inputs.GetBudgetPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.budgets.outputs.GetBudgetResult] =
      val argsBuilder = com.pulumi.aws.budgets.inputs.GetBudgetPlainArgs.builder
      com.pulumi.aws.budgets.BudgetsFunctions.getBudgetPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
