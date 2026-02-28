package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object budgets:
  type BudgetsFunctions = com.pulumi.aws.budgets.BudgetsFunctions
  object BudgetsFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.budgets.BudgetsFunctions.*
  extension (self: BudgetsFunctions.type)
    /** Data source for managing an AWS Web Services Budgets Budget. */
    def getBudget(args: Endofunction[com.pulumi.aws.budgets.inputs.GetBudgetArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.budgets.outputs.GetBudgetResult] =
      val argsBuilder = com.pulumi.aws.budgets.inputs.GetBudgetArgs.builder
      com.pulumi.aws.budgets.BudgetsFunctions.getBudget(args(argsBuilder).build)

    /** Data source for managing an AWS Web Services Budgets Budget. */
    def getBudgetPlain(args: Endofunction[com.pulumi.aws.budgets.inputs.GetBudgetPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.budgets.outputs.GetBudgetResult] =
      val argsBuilder = com.pulumi.aws.budgets.inputs.GetBudgetPlainArgs.builder
      com.pulumi.aws.budgets.BudgetsFunctions.getBudgetPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.budgets.BudgetArgs.Builder)
    /**
     * @param autoAdjustData Object containing AutoAdjustData which determines the budget amount for an auto-adjusting budget.
     * @return builder
     */
    def autoAdjustData(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetAutoAdjustDataArgs.Builder]):
        com.pulumi.aws.budgets.BudgetArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetAutoAdjustDataArgs.builder
      builder.autoAdjustData(args(argsBuilder).build)

    /**
     * @param costFilters A list of CostFilter name/values pair to apply to budget.
     * @return builder
     */
    def costFilters(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetCostFilterArgs.Builder]*):
        com.pulumi.aws.budgets.BudgetArgs.Builder =
      def argsBuilder = com.pulumi.aws.budgets.inputs.BudgetCostFilterArgs.builder
      builder.costFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param costTypes Object containing CostTypes The types of cost included in a budget, such as tax and subscriptions.
     * @return builder
     */
    def costTypes(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetCostTypesArgs.Builder]):
        com.pulumi.aws.budgets.BudgetArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetCostTypesArgs.builder
      builder.costTypes(args(argsBuilder).build)

    /**
     * @param notifications Object containing Budget Notifications. Can be used multiple times to define more than one budget notification.
     * @return builder
     */
    def notifications(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetNotificationArgs.Builder]*):
        com.pulumi.aws.budgets.BudgetArgs.Builder =
      def argsBuilder = com.pulumi.aws.budgets.inputs.BudgetNotificationArgs.builder
      builder.notifications(args.map(_(argsBuilder).build)*)

    /**
     * @param plannedLimits Object containing Planned Budget Limits. Can be used multiple times to plan more than one budget limit. See [PlannedBudgetLimits](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_budgets_Budget.html#awscostmanagement-Type-budgets_Budget-PlannedBudgetLimits) documentation.
     * @return builder
     */
    def plannedLimits(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetPlannedLimitArgs.Builder]*):
        com.pulumi.aws.budgets.BudgetArgs.Builder =
      def argsBuilder = com.pulumi.aws.budgets.inputs.BudgetPlannedLimitArgs.builder
      builder.plannedLimits(args.map(_(argsBuilder).build)*)

  /** Provides a budgets budget resource. Budgets use the cost visualization provided by Cost Explorer to show you the status of your budgets, to provide forecasts of your estimated costs, and to track your AWS usage, including your free tier usage. */
  def Budget(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.budgets.BudgetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.budgets.BudgetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.budgets.Budget(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a budget action resource. Budget actions are cost savings controls that run either automatically on your behalf or by using a workflow approval process. */
  def BudgetAction(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.budgets.BudgetActionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.budgets.BudgetActionArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.budgets.BudgetAction(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.budgets.BudgetActionArgs.Builder)
    /**
     * @param actionThreshold The trigger threshold of the action. See Action Threshold.
     * @return builder
     */
    def actionThreshold(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetActionActionThresholdArgs.Builder]):
        com.pulumi.aws.budgets.BudgetActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetActionActionThresholdArgs.builder
      builder.actionThreshold(args(argsBuilder).build)

    /**
     * @param definition Specifies all of the type-specific parameters. See Definition.
     * @return builder
     */
    def definition(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetActionDefinitionArgs.Builder]):
        com.pulumi.aws.budgets.BudgetActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetActionDefinitionArgs.builder
      builder.definition(args(argsBuilder).build)

    /**
     * @param subscribers A list of subscribers. See Subscriber.
     * @return builder
     */
    def subscribers(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetActionSubscriberArgs.Builder]*):
        com.pulumi.aws.budgets.BudgetActionArgs.Builder =
      def argsBuilder = com.pulumi.aws.budgets.inputs.BudgetActionSubscriberArgs.builder
      builder.subscribers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.budgets.inputs.BudgetActionDefinitionArgs.Builder)
    /**
     * @param iamActionDefinition The AWS Identity and Access Management (IAM) action definition details. See IAM Action Definition.
     * @return builder
     */
    def iamActionDefinition(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetActionDefinitionIamActionDefinitionArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetActionDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetActionDefinitionIamActionDefinitionArgs.builder
      builder.iamActionDefinition(args(argsBuilder).build)

    /**
     * @param scpActionDefinition The service control policies (SCPs) action definition details. See SCP Action Definition.
     * @return builder
     */
    def scpActionDefinition(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetActionDefinitionScpActionDefinitionArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetActionDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetActionDefinitionScpActionDefinitionArgs.builder
      builder.scpActionDefinition(args(argsBuilder).build)

    /**
     * @param ssmActionDefinition The AWS Systems Manager (SSM) action definition details. See SSM Action Definition.
     * @return builder
     */
    def ssmActionDefinition(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetActionDefinitionSsmActionDefinitionArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetActionDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetActionDefinitionSsmActionDefinitionArgs.builder
      builder.ssmActionDefinition(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.budgets.inputs.BudgetAutoAdjustDataArgs.Builder)
    /**
     * @param historicalOptions (Optional) - Configuration block of Historical Options. Required for `autoAdjustType` of `HISTORICAL` Configuration block that defines the historical data that your auto-adjusting budget is based on.
     * @return builder
     */
    def historicalOptions(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetAutoAdjustDataHistoricalOptionsArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetAutoAdjustDataArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetAutoAdjustDataHistoricalOptionsArgs.builder
      builder.historicalOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.budgets.inputs.BudgetState.Builder)
    /**
     * @param autoAdjustData Object containing AutoAdjustData which determines the budget amount for an auto-adjusting budget.
     * @return builder
     */
    def autoAdjustData(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetAutoAdjustDataArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetState.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetAutoAdjustDataArgs.builder
      builder.autoAdjustData(args(argsBuilder).build)

    /**
     * @param costFilters A list of CostFilter name/values pair to apply to budget.
     * @return builder
     */
    def costFilters(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetCostFilterArgs.Builder]*):
        com.pulumi.aws.budgets.inputs.BudgetState.Builder =
      def argsBuilder = com.pulumi.aws.budgets.inputs.BudgetCostFilterArgs.builder
      builder.costFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param costTypes Object containing CostTypes The types of cost included in a budget, such as tax and subscriptions.
     * @return builder
     */
    def costTypes(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetCostTypesArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetState.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetCostTypesArgs.builder
      builder.costTypes(args(argsBuilder).build)

    /**
     * @param notifications Object containing Budget Notifications. Can be used multiple times to define more than one budget notification.
     * @return builder
     */
    def notifications(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetNotificationArgs.Builder]*):
        com.pulumi.aws.budgets.inputs.BudgetState.Builder =
      def argsBuilder = com.pulumi.aws.budgets.inputs.BudgetNotificationArgs.builder
      builder.notifications(args.map(_(argsBuilder).build)*)

    /**
     * @param plannedLimits Object containing Planned Budget Limits. Can be used multiple times to plan more than one budget limit. See [PlannedBudgetLimits](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_budgets_Budget.html#awscostmanagement-Type-budgets_Budget-PlannedBudgetLimits) documentation.
     * @return builder
     */
    def plannedLimits(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetPlannedLimitArgs.Builder]*):
        com.pulumi.aws.budgets.inputs.BudgetState.Builder =
      def argsBuilder = com.pulumi.aws.budgets.inputs.BudgetPlannedLimitArgs.builder
      builder.plannedLimits(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.budgets.inputs.BudgetActionState.Builder)
    /**
     * @param actionThreshold The trigger threshold of the action. See Action Threshold.
     * @return builder
     */
    def actionThreshold(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetActionActionThresholdArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetActionState.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetActionActionThresholdArgs.builder
      builder.actionThreshold(args(argsBuilder).build)

    /**
     * @param definition Specifies all of the type-specific parameters. See Definition.
     * @return builder
     */
    def definition(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetActionDefinitionArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetActionState.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetActionDefinitionArgs.builder
      builder.definition(args(argsBuilder).build)

    /**
     * @param subscribers A list of subscribers. See Subscriber.
     * @return builder
     */
    def subscribers(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetActionSubscriberArgs.Builder]*):
        com.pulumi.aws.budgets.inputs.BudgetActionState.Builder =
      def argsBuilder = com.pulumi.aws.budgets.inputs.BudgetActionSubscriberArgs.builder
      builder.subscribers(args.map(_(argsBuilder).build)*)
