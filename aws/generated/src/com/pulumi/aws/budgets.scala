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
     * @param costFilters A list of CostFilter name/values pair to apply to budget. Conflicts with `filterExpression`.
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
     * @param filterExpression Object containing Filter Expression to apply to budget. Conflicts with `costFilter`.
     * @return builder
     */
    def filterExpression(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionArgs.Builder]):
        com.pulumi.aws.budgets.BudgetArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionArgs.builder
      builder.filterExpression(args(argsBuilder).build)

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

  extension (builder: com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrArgs.Builder)
    /**
     * @param ands (Optional) A list of filter expressions to combine with AND logic. Each `and` block is one operand and must itself contain exactly one root.
     * @return builder
     */
    def ands(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrAndArgs.Builder]*):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrArgs.Builder =
      def argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrAndArgs.builder
      builder.ands(args.map(_(argsBuilder).build)*)

    /**
     * @param costCategories (Optional) A Cost Category Filter block.
     * @return builder
     */
    def costCategories(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrCostCategoriesArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrCostCategoriesArgs.builder
      builder.costCategories(args(argsBuilder).build)

    /**
     * @param dimensions (Optional) A Dimension Filter block.
     * @return builder
     */
    def dimensions(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrDimensionsArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrDimensionsArgs.builder
      builder.dimensions(args(argsBuilder).build)

    /**
     * @param not (Optional) A single filter expression to negate. Must contain exactly one root.
     * @return builder
     */
    def not(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrNotArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrNotArgs.builder
      builder.not(args(argsBuilder).build)

    /**
     * @param ors (Optional) A list of filter expressions to combine with OR logic. Each `or` block is one operand and must itself contain exactly one root.
     * @return builder
     */
    def ors(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrOrArgs.Builder]*):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrArgs.Builder =
      def argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrOrArgs.builder
      builder.ors(args.map(_(argsBuilder).build)*)

    /**
     * @param tags Map of tags assigned to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrTagsArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrTagsArgs.builder
      builder.tags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.budgets.inputs.BudgetFilterExpressionArgs.Builder)
    /**
     * @param ands (Optional) A list of filter expressions to combine with AND logic. Each `and` block is one operand and must itself contain exactly one root.
     * @return builder
     */
    def ands(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndArgs.Builder]*):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionArgs.Builder =
      def argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndArgs.builder
      builder.ands(args.map(_(argsBuilder).build)*)

    /**
     * @param costCategories (Optional) A Cost Category Filter block.
     * @return builder
     */
    def costCategories(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionCostCategoriesArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionCostCategoriesArgs.builder
      builder.costCategories(args(argsBuilder).build)

    /**
     * @param dimensions (Optional) A Dimension Filter block.
     * @return builder
     */
    def dimensions(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionDimensionsArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionDimensionsArgs.builder
      builder.dimensions(args(argsBuilder).build)

    /**
     * @param not (Optional) A single filter expression to negate. Must contain exactly one root.
     * @return builder
     */
    def not(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotArgs.builder
      builder.not(args(argsBuilder).build)

    /**
     * @param ors (Optional) A list of filter expressions to combine with OR logic. Each `or` block is one operand and must itself contain exactly one root.
     * @return builder
     */
    def ors(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrArgs.Builder]*):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionArgs.Builder =
      def argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrArgs.builder
      builder.ors(args.map(_(argsBuilder).build)*)

    /**
     * @param tags Map of tags assigned to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionTagsArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionTagsArgs.builder
      builder.tags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotOrArgs.Builder)
    /**
     * @param costCategories (Optional) A Cost Category Filter block.
     * @return builder
     */
    def costCategories(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotOrCostCategoriesArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotOrArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotOrCostCategoriesArgs.builder
      builder.costCategories(args(argsBuilder).build)

    /**
     * @param dimensions (Optional) A Dimension Filter block.
     * @return builder
     */
    def dimensions(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotOrDimensionsArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotOrArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotOrDimensionsArgs.builder
      builder.dimensions(args(argsBuilder).build)

    /**
     * @param tags Map of tags assigned to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotOrTagsArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotOrArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotOrTagsArgs.builder
      builder.tags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrNotArgs.Builder)
    /**
     * @param costCategories (Optional) A Cost Category Filter block.
     * @return builder
     */
    def costCategories(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrNotCostCategoriesArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrNotArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrNotCostCategoriesArgs.builder
      builder.costCategories(args(argsBuilder).build)

    /**
     * @param dimensions (Optional) A Dimension Filter block.
     * @return builder
     */
    def dimensions(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrNotDimensionsArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrNotArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrNotDimensionsArgs.builder
      builder.dimensions(args(argsBuilder).build)

    /**
     * @param tags Map of tags assigned to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrNotTagsArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrNotArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrNotTagsArgs.builder
      builder.tags(args(argsBuilder).build)

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

  extension (builder: com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrOrArgs.Builder)
    /**
     * @param costCategories (Optional) A Cost Category Filter block.
     * @return builder
     */
    def costCategories(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrOrCostCategoriesArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrOrArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrOrCostCategoriesArgs.builder
      builder.costCategories(args(argsBuilder).build)

    /**
     * @param dimensions (Optional) A Dimension Filter block.
     * @return builder
     */
    def dimensions(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrOrDimensionsArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrOrArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrOrDimensionsArgs.builder
      builder.dimensions(args(argsBuilder).build)

    /**
     * @param tags Map of tags assigned to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrOrTagsArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrOrArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrOrTagsArgs.builder
      builder.tags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotArgs.Builder)
    /**
     * @param ands (Optional) A list of filter expressions to combine with AND logic. Each `and` block is one operand and must itself contain exactly one root.
     * @return builder
     */
    def ands(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotAndArgs.Builder]*):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotArgs.Builder =
      def argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotAndArgs.builder
      builder.ands(args.map(_(argsBuilder).build)*)

    /**
     * @param costCategories (Optional) A Cost Category Filter block.
     * @return builder
     */
    def costCategories(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotCostCategoriesArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotCostCategoriesArgs.builder
      builder.costCategories(args(argsBuilder).build)

    /**
     * @param dimensions (Optional) A Dimension Filter block.
     * @return builder
     */
    def dimensions(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotDimensionsArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotDimensionsArgs.builder
      builder.dimensions(args(argsBuilder).build)

    /**
     * @param not (Optional) A single filter expression to negate. Must contain exactly one root.
     * @return builder
     */
    def not(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotNotArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotNotArgs.builder
      builder.not(args(argsBuilder).build)

    /**
     * @param ors (Optional) A list of filter expressions to combine with OR logic. Each `or` block is one operand and must itself contain exactly one root.
     * @return builder
     */
    def ors(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotOrArgs.Builder]*):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotArgs.Builder =
      def argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotOrArgs.builder
      builder.ors(args.map(_(argsBuilder).build)*)

    /**
     * @param tags Map of tags assigned to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotTagsArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotTagsArgs.builder
      builder.tags(args(argsBuilder).build)

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
     * @param costFilters A list of CostFilter name/values pair to apply to budget. Conflicts with `filterExpression`.
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
     * @param filterExpression Object containing Filter Expression to apply to budget. Conflicts with `costFilter`.
     * @return builder
     */
    def filterExpression(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetState.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionArgs.builder
      builder.filterExpression(args(argsBuilder).build)

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

  extension (builder: com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotAndArgs.Builder)
    /**
     * @param costCategories (Optional) A Cost Category Filter block.
     * @return builder
     */
    def costCategories(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotAndCostCategoriesArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotAndCostCategoriesArgs.builder
      builder.costCategories(args(argsBuilder).build)

    /**
     * @param dimensions (Optional) A Dimension Filter block.
     * @return builder
     */
    def dimensions(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotAndDimensionsArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotAndDimensionsArgs.builder
      builder.dimensions(args(argsBuilder).build)

    /**
     * @param tags Map of tags assigned to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotAndTagsArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotAndTagsArgs.builder
      builder.tags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndNotArgs.Builder)
    /**
     * @param costCategories (Optional) A Cost Category Filter block.
     * @return builder
     */
    def costCategories(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndNotCostCategoriesArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndNotArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndNotCostCategoriesArgs.builder
      builder.costCategories(args(argsBuilder).build)

    /**
     * @param dimensions (Optional) A Dimension Filter block.
     * @return builder
     */
    def dimensions(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndNotDimensionsArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndNotArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndNotDimensionsArgs.builder
      builder.dimensions(args(argsBuilder).build)

    /**
     * @param tags Map of tags assigned to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndNotTagsArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndNotArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndNotTagsArgs.builder
      builder.tags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndArgs.Builder)
    /**
     * @param ands (Optional) A list of filter expressions to combine with AND logic. Each `and` block is one operand and must itself contain exactly one root.
     * @return builder
     */
    def ands(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndAndArgs.Builder]*):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndArgs.Builder =
      def argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndAndArgs.builder
      builder.ands(args.map(_(argsBuilder).build)*)

    /**
     * @param costCategories (Optional) A Cost Category Filter block.
     * @return builder
     */
    def costCategories(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndCostCategoriesArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndCostCategoriesArgs.builder
      builder.costCategories(args(argsBuilder).build)

    /**
     * @param dimensions (Optional) A Dimension Filter block.
     * @return builder
     */
    def dimensions(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndDimensionsArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndDimensionsArgs.builder
      builder.dimensions(args(argsBuilder).build)

    /**
     * @param not (Optional) A single filter expression to negate. Must contain exactly one root.
     * @return builder
     */
    def not(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndNotArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndNotArgs.builder
      builder.not(args(argsBuilder).build)

    /**
     * @param ors (Optional) A list of filter expressions to combine with OR logic. Each `or` block is one operand and must itself contain exactly one root.
     * @return builder
     */
    def ors(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndOrArgs.Builder]*):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndArgs.Builder =
      def argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndOrArgs.builder
      builder.ors(args.map(_(argsBuilder).build)*)

    /**
     * @param tags Map of tags assigned to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndTagsArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndTagsArgs.builder
      builder.tags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndAndArgs.Builder)
    /**
     * @param costCategories (Optional) A Cost Category Filter block.
     * @return builder
     */
    def costCategories(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndAndCostCategoriesArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndAndCostCategoriesArgs.builder
      builder.costCategories(args(argsBuilder).build)

    /**
     * @param dimensions (Optional) A Dimension Filter block.
     * @return builder
     */
    def dimensions(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndAndDimensionsArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndAndDimensionsArgs.builder
      builder.dimensions(args(argsBuilder).build)

    /**
     * @param tags Map of tags assigned to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndAndTagsArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndAndTagsArgs.builder
      builder.tags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotNotArgs.Builder)
    /**
     * @param costCategories (Optional) A Cost Category Filter block.
     * @return builder
     */
    def costCategories(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotNotCostCategoriesArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotNotArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotNotCostCategoriesArgs.builder
      builder.costCategories(args(argsBuilder).build)

    /**
     * @param dimensions (Optional) A Dimension Filter block.
     * @return builder
     */
    def dimensions(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotNotDimensionsArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotNotArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotNotDimensionsArgs.builder
      builder.dimensions(args(argsBuilder).build)

    /**
     * @param tags Map of tags assigned to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotNotTagsArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotNotArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionNotNotTagsArgs.builder
      builder.tags(args(argsBuilder).build)

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

  extension (builder: com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrAndArgs.Builder)
    /**
     * @param costCategories (Optional) A Cost Category Filter block.
     * @return builder
     */
    def costCategories(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrAndCostCategoriesArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrAndCostCategoriesArgs.builder
      builder.costCategories(args(argsBuilder).build)

    /**
     * @param dimensions (Optional) A Dimension Filter block.
     * @return builder
     */
    def dimensions(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrAndDimensionsArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrAndDimensionsArgs.builder
      builder.dimensions(args(argsBuilder).build)

    /**
     * @param tags Map of tags assigned to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrAndTagsArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrAndArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionOrAndTagsArgs.builder
      builder.tags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndOrArgs.Builder)
    /**
     * @param costCategories (Optional) A Cost Category Filter block.
     * @return builder
     */
    def costCategories(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndOrCostCategoriesArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndOrArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndOrCostCategoriesArgs.builder
      builder.costCategories(args(argsBuilder).build)

    /**
     * @param dimensions (Optional) A Dimension Filter block.
     * @return builder
     */
    def dimensions(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndOrDimensionsArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndOrArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndOrDimensionsArgs.builder
      builder.dimensions(args(argsBuilder).build)

    /**
     * @param tags Map of tags assigned to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndOrTagsArgs.Builder]):
        com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndOrArgs.Builder =
      val argsBuilder = com.pulumi.aws.budgets.inputs.BudgetFilterExpressionAndOrTagsArgs.builder
      builder.tags(args(argsBuilder).build)
