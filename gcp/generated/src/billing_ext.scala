package jp.ukiba.ko_pulumi
package gcp

object billing_ext:
  extension (builder: com.pulumi.gcp.billing.AccountIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.billing.inputs.AccountIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.billing.AccountIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.billing.inputs.AccountIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.billing.AccountIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.billing.inputs.AccountIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.billing.AccountIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.billing.inputs.AccountIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.billing.BudgetArgs.Builder)
    /**
     * @param allUpdatesRule Defines notifications that are sent on every update to the
     * billing account&#39;s spend, regardless of the thresholds defined
     * using threshold rules.
     * Structure is documented below.
     * @return builder
     */
    inline def allUpdatesRule(args: Endofunction[com.pulumi.gcp.billing.inputs.BudgetAllUpdatesRuleArgs.Builder]):
        com.pulumi.gcp.billing.BudgetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.billing.inputs.BudgetAllUpdatesRuleArgs.builder
      builder.allUpdatesRule(args(argsBuilder).build)

    /**
     * @param amount The budgeted amount for each usage period.
     * Structure is documented below.
     * @return builder
     */
    inline def amount(args: Endofunction[com.pulumi.gcp.billing.inputs.BudgetAmountArgs.Builder]):
        com.pulumi.gcp.billing.BudgetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.billing.inputs.BudgetAmountArgs.builder
      builder.amount(args(argsBuilder).build)

    /**
     * @param budgetFilter Filters that define which resources are used to compute the actual
     * spend against the budget.
     * Structure is documented below.
     * @return builder
     */
    inline def budgetFilter(args: Endofunction[com.pulumi.gcp.billing.inputs.BudgetBudgetFilterArgs.Builder]):
        com.pulumi.gcp.billing.BudgetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.billing.inputs.BudgetBudgetFilterArgs.builder
      builder.budgetFilter(args(argsBuilder).build)

    /**
     * @param thresholdRules Rules that trigger alerts (notifications of thresholds being
     * crossed) when spend exceeds the specified percentages of the
     * budget.
     * Structure is documented below.
     * @return builder
     */
    inline def thresholdRules(args: Endofunction[com.pulumi.gcp.billing.inputs.BudgetThresholdRuleArgs.Builder]*):
        com.pulumi.gcp.billing.BudgetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.billing.inputs.BudgetThresholdRuleArgs.builder
      builder.thresholdRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.billing.inputs.AccountIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.billing.inputs.AccountIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.billing.inputs.AccountIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.billing.inputs.AccountIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.billing.inputs.AccountIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.billing.inputs.AccountIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.billing.inputs.AccountIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.billing.inputs.AccountIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.billing.inputs.BudgetAmountArgs.Builder)
    /**
     * @param specifiedAmount A specified amount to use as the budget. currencyCode is
     * optional. If specified, it must match the currency of the
     * billing account. The currencyCode is provided on output.
     * Structure is documented below.
     * @return builder
     */
    inline def specifiedAmount(args: Endofunction[com.pulumi.gcp.billing.inputs.BudgetAmountSpecifiedAmountArgs.Builder]):
        com.pulumi.gcp.billing.inputs.BudgetAmountArgs.Builder =
      val argsBuilder = com.pulumi.gcp.billing.inputs.BudgetAmountSpecifiedAmountArgs.builder
      builder.specifiedAmount(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.billing.inputs.BudgetBudgetFilterArgs.Builder)
    /**
     * @param customPeriod Specifies to track usage from any start date (required) to any end date (optional).
     * This time period is static, it does not recur.
     * Exactly one of `calendarPeriod`, `customPeriod` must be provided.
     * Structure is documented below.
     * @return builder
     */
    inline def customPeriod(args: Endofunction[com.pulumi.gcp.billing.inputs.BudgetBudgetFilterCustomPeriodArgs.Builder]):
        com.pulumi.gcp.billing.inputs.BudgetBudgetFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.billing.inputs.BudgetBudgetFilterCustomPeriodArgs.builder
      builder.customPeriod(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.billing.inputs.BudgetBudgetFilterCustomPeriodArgs.Builder)
    /**
     * @param endDate Optional. The end date of the time period. Budgets with elapsed end date won&#39;t be processed.
     * If unset, specifies to track all usage incurred since the startDate.
     * Structure is documented below.
     * @return builder
     */
    inline def endDate(args: Endofunction[com.pulumi.gcp.billing.inputs.BudgetBudgetFilterCustomPeriodEndDateArgs.Builder]):
        com.pulumi.gcp.billing.inputs.BudgetBudgetFilterCustomPeriodArgs.Builder =
      val argsBuilder = com.pulumi.gcp.billing.inputs.BudgetBudgetFilterCustomPeriodEndDateArgs.builder
      builder.endDate(args(argsBuilder).build)

    /**
     * @param startDate A start date is required. The start date must be after January 1, 2017.
     * Structure is documented below.
     * @return builder
     */
    inline def startDate(args: Endofunction[com.pulumi.gcp.billing.inputs.BudgetBudgetFilterCustomPeriodStartDateArgs.Builder]):
        com.pulumi.gcp.billing.inputs.BudgetBudgetFilterCustomPeriodArgs.Builder =
      val argsBuilder = com.pulumi.gcp.billing.inputs.BudgetBudgetFilterCustomPeriodStartDateArgs.builder
      builder.startDate(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.billing.inputs.BudgetState.Builder)
    /**
     * @param allUpdatesRule Defines notifications that are sent on every update to the
     * billing account&#39;s spend, regardless of the thresholds defined
     * using threshold rules.
     * Structure is documented below.
     * @return builder
     */
    inline def allUpdatesRule(args: Endofunction[com.pulumi.gcp.billing.inputs.BudgetAllUpdatesRuleArgs.Builder]):
        com.pulumi.gcp.billing.inputs.BudgetState.Builder =
      val argsBuilder = com.pulumi.gcp.billing.inputs.BudgetAllUpdatesRuleArgs.builder
      builder.allUpdatesRule(args(argsBuilder).build)

    /**
     * @param amount The budgeted amount for each usage period.
     * Structure is documented below.
     * @return builder
     */
    inline def amount(args: Endofunction[com.pulumi.gcp.billing.inputs.BudgetAmountArgs.Builder]):
        com.pulumi.gcp.billing.inputs.BudgetState.Builder =
      val argsBuilder = com.pulumi.gcp.billing.inputs.BudgetAmountArgs.builder
      builder.amount(args(argsBuilder).build)

    /**
     * @param budgetFilter Filters that define which resources are used to compute the actual
     * spend against the budget.
     * Structure is documented below.
     * @return builder
     */
    inline def budgetFilter(args: Endofunction[com.pulumi.gcp.billing.inputs.BudgetBudgetFilterArgs.Builder]):
        com.pulumi.gcp.billing.inputs.BudgetState.Builder =
      val argsBuilder = com.pulumi.gcp.billing.inputs.BudgetBudgetFilterArgs.builder
      builder.budgetFilter(args(argsBuilder).build)

    /**
     * @param thresholdRules Rules that trigger alerts (notifications of thresholds being
     * crossed) when spend exceeds the specified percentages of the
     * budget.
     * Structure is documented below.
     * @return builder
     */
    inline def thresholdRules(args: Endofunction[com.pulumi.gcp.billing.inputs.BudgetThresholdRuleArgs.Builder]*):
        com.pulumi.gcp.billing.inputs.BudgetState.Builder =
      def argsBuilder = com.pulumi.gcp.billing.inputs.BudgetThresholdRuleArgs.builder
      builder.thresholdRules(args.map(_(argsBuilder).build)*)
