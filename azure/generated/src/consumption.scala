package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object consumption:
  /** Manages a Consumption Budget for a Management Group. */
  inline def BudgetManagementGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.consumption.BudgetManagementGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.consumption.BudgetManagementGroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.consumption.BudgetManagementGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Resource Group Consumption Budget. */
  inline def BudgetResourceGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.consumption.BudgetResourceGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.consumption.BudgetResourceGroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.consumption.BudgetResourceGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Subscription Consumption Budget. */
  inline def BudgetSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.consumption.BudgetSubscriptionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.consumption.BudgetSubscriptionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.consumption.BudgetSubscription(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object ConsumptionFunctions:
    /** Use this data source to access information about an existing Consumption Budget for a specific resource group. */
    inline def getBudgetResourceGroup(args: Endofunction[com.pulumi.azure.consumption.inputs.GetBudgetResourceGroupArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.consumption.outputs.GetBudgetResourceGroupResult] =
      val argsBuilder = com.pulumi.azure.consumption.inputs.GetBudgetResourceGroupArgs.builder
      com.pulumi.azure.consumption.ConsumptionFunctions.getBudgetResourceGroup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Consumption Budget for a specific resource group. */
    inline def getBudgetResourceGroupPlain(args: Endofunction[com.pulumi.azure.consumption.inputs.GetBudgetResourceGroupPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.consumption.outputs.GetBudgetResourceGroupResult] =
      val argsBuilder = com.pulumi.azure.consumption.inputs.GetBudgetResourceGroupPlainArgs.builder
      com.pulumi.azure.consumption.ConsumptionFunctions.getBudgetResourceGroupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Consumption Budget for a specific subscription. */
    inline def getBudgetSubscription(args: Endofunction[com.pulumi.azure.consumption.inputs.GetBudgetSubscriptionArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.consumption.outputs.GetBudgetSubscriptionResult] =
      val argsBuilder = com.pulumi.azure.consumption.inputs.GetBudgetSubscriptionArgs.builder
      com.pulumi.azure.consumption.ConsumptionFunctions.getBudgetSubscription(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Consumption Budget for a specific subscription. */
    inline def getBudgetSubscriptionPlain(args: Endofunction[com.pulumi.azure.consumption.inputs.GetBudgetSubscriptionPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.consumption.outputs.GetBudgetSubscriptionResult] =
      val argsBuilder = com.pulumi.azure.consumption.inputs.GetBudgetSubscriptionPlainArgs.builder
      com.pulumi.azure.consumption.ConsumptionFunctions.getBudgetSubscriptionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
