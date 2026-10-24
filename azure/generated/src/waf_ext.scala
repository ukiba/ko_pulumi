package jp.ukiba.ko_pulumi
package azure

object waf_ext:
  extension (builder: com.pulumi.azure.waf.PolicyArgs.Builder)
    /**
     * @param customRules One or more `customRules` blocks as defined below.
     * @return builder
     */
    def customRules(args: Endofunction[com.pulumi.azure.waf.inputs.PolicyCustomRuleArgs.Builder]*):
        com.pulumi.azure.waf.PolicyArgs.Builder =
      def argsBuilder = com.pulumi.azure.waf.inputs.PolicyCustomRuleArgs.builder
      builder.customRules(args.map(_(argsBuilder).build)*)

    /**
     * @param managedRules A `managedRules` blocks as defined below.
     * @return builder
     */
    def managedRules(args: Endofunction[com.pulumi.azure.waf.inputs.PolicyManagedRulesArgs.Builder]):
        com.pulumi.azure.waf.PolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.waf.inputs.PolicyManagedRulesArgs.builder
      builder.managedRules(args(argsBuilder).build)

    /**
     * @param policySettings A `policySettings` block as defined below.
     * @return builder
     */
    def policySettings(args: Endofunction[com.pulumi.azure.waf.inputs.PolicyPolicySettingsArgs.Builder]):
        com.pulumi.azure.waf.PolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.waf.inputs.PolicyPolicySettingsArgs.builder
      builder.policySettings(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.waf.inputs.PolicyCustomRuleArgs.Builder)
    /**
     * @param matchConditions One or more `matchConditions` blocks as defined below.
     * @return builder
     */
    def matchConditions(args: Endofunction[com.pulumi.azure.waf.inputs.PolicyCustomRuleMatchConditionArgs.Builder]*):
        com.pulumi.azure.waf.inputs.PolicyCustomRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.waf.inputs.PolicyCustomRuleMatchConditionArgs.builder
      builder.matchConditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.waf.inputs.PolicyCustomRuleMatchConditionArgs.Builder)
    /**
     * @param matchVariables One or more `matchVariables` blocks as defined below.
     * @return builder
     */
    def matchVariables(args: Endofunction[com.pulumi.azure.waf.inputs.PolicyCustomRuleMatchConditionMatchVariableArgs.Builder]*):
        com.pulumi.azure.waf.inputs.PolicyCustomRuleMatchConditionArgs.Builder =
      def argsBuilder = com.pulumi.azure.waf.inputs.PolicyCustomRuleMatchConditionMatchVariableArgs.builder
      builder.matchVariables(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.waf.inputs.PolicyManagedRulesArgs.Builder)
    /**
     * @param exclusions One or more `exclusion` block defined below.
     * @return builder
     */
    def exclusions(args: Endofunction[com.pulumi.azure.waf.inputs.PolicyManagedRulesExclusionArgs.Builder]*):
        com.pulumi.azure.waf.inputs.PolicyManagedRulesArgs.Builder =
      def argsBuilder = com.pulumi.azure.waf.inputs.PolicyManagedRulesExclusionArgs.builder
      builder.exclusions(args.map(_(argsBuilder).build)*)

    /**
     * @param managedRuleSets One or more `managedRuleSet` block defined below.
     * @return builder
     */
    def managedRuleSets(args: Endofunction[com.pulumi.azure.waf.inputs.PolicyManagedRulesManagedRuleSetArgs.Builder]*):
        com.pulumi.azure.waf.inputs.PolicyManagedRulesArgs.Builder =
      def argsBuilder = com.pulumi.azure.waf.inputs.PolicyManagedRulesManagedRuleSetArgs.builder
      builder.managedRuleSets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.waf.inputs.PolicyManagedRulesExclusionArgs.Builder)
    /**
     * @param excludedRuleSet One or more `excludedRuleSet` block defined below.
     * @return builder
     */
    def excludedRuleSet(args: Endofunction[com.pulumi.azure.waf.inputs.PolicyManagedRulesExclusionExcludedRuleSetArgs.Builder]):
        com.pulumi.azure.waf.inputs.PolicyManagedRulesExclusionArgs.Builder =
      val argsBuilder = com.pulumi.azure.waf.inputs.PolicyManagedRulesExclusionExcludedRuleSetArgs.builder
      builder.excludedRuleSet(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.waf.inputs.PolicyManagedRulesExclusionExcludedRuleSetArgs.Builder)
    /**
     * @param ruleGroups One or more `ruleGroup` block defined below.
     * @return builder
     */
    def ruleGroups(args: Endofunction[com.pulumi.azure.waf.inputs.PolicyManagedRulesExclusionExcludedRuleSetRuleGroupArgs.Builder]*):
        com.pulumi.azure.waf.inputs.PolicyManagedRulesExclusionExcludedRuleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.waf.inputs.PolicyManagedRulesExclusionExcludedRuleSetRuleGroupArgs.builder
      builder.ruleGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.waf.inputs.PolicyManagedRulesManagedRuleSetArgs.Builder)
    /**
     * @param ruleGroupOverrides One or more `ruleGroupOverride` block defined below.
     * @return builder
     */
    def ruleGroupOverrides(args: Endofunction[com.pulumi.azure.waf.inputs.PolicyManagedRulesManagedRuleSetRuleGroupOverrideArgs.Builder]*):
        com.pulumi.azure.waf.inputs.PolicyManagedRulesManagedRuleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.waf.inputs.PolicyManagedRulesManagedRuleSetRuleGroupOverrideArgs.builder
      builder.ruleGroupOverrides(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.waf.inputs.PolicyManagedRulesManagedRuleSetRuleGroupOverrideArgs.Builder)
    /**
     * @param rules One or more `rule` block defined below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.azure.waf.inputs.PolicyManagedRulesManagedRuleSetRuleGroupOverrideRuleArgs.Builder]*):
        com.pulumi.azure.waf.inputs.PolicyManagedRulesManagedRuleSetRuleGroupOverrideArgs.Builder =
      def argsBuilder = com.pulumi.azure.waf.inputs.PolicyManagedRulesManagedRuleSetRuleGroupOverrideRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.waf.inputs.PolicyPolicySettingsArgs.Builder)
    /**
     * @param logScrubbing One `logScrubbing` block as defined below.
     * @return builder
     */
    def logScrubbing(args: Endofunction[com.pulumi.azure.waf.inputs.PolicyPolicySettingsLogScrubbingArgs.Builder]):
        com.pulumi.azure.waf.inputs.PolicyPolicySettingsArgs.Builder =
      val argsBuilder = com.pulumi.azure.waf.inputs.PolicyPolicySettingsLogScrubbingArgs.builder
      builder.logScrubbing(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.waf.inputs.PolicyPolicySettingsLogScrubbingArgs.Builder)
    /**
     * @param rules One or more `scrubbingRule` blocks as define below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.azure.waf.inputs.PolicyPolicySettingsLogScrubbingRuleArgs.Builder]*):
        com.pulumi.azure.waf.inputs.PolicyPolicySettingsLogScrubbingArgs.Builder =
      def argsBuilder = com.pulumi.azure.waf.inputs.PolicyPolicySettingsLogScrubbingRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.waf.inputs.PolicyState.Builder)
    /**
     * @param customRules One or more `customRules` blocks as defined below.
     * @return builder
     */
    def customRules(args: Endofunction[com.pulumi.azure.waf.inputs.PolicyCustomRuleArgs.Builder]*):
        com.pulumi.azure.waf.inputs.PolicyState.Builder =
      def argsBuilder = com.pulumi.azure.waf.inputs.PolicyCustomRuleArgs.builder
      builder.customRules(args.map(_(argsBuilder).build)*)

    /**
     * @param managedRules A `managedRules` blocks as defined below.
     * @return builder
     */
    def managedRules(args: Endofunction[com.pulumi.azure.waf.inputs.PolicyManagedRulesArgs.Builder]):
        com.pulumi.azure.waf.inputs.PolicyState.Builder =
      val argsBuilder = com.pulumi.azure.waf.inputs.PolicyManagedRulesArgs.builder
      builder.managedRules(args(argsBuilder).build)

    /**
     * @param policySettings A `policySettings` block as defined below.
     * @return builder
     */
    def policySettings(args: Endofunction[com.pulumi.azure.waf.inputs.PolicyPolicySettingsArgs.Builder]):
        com.pulumi.azure.waf.inputs.PolicyState.Builder =
      val argsBuilder = com.pulumi.azure.waf.inputs.PolicyPolicySettingsArgs.builder
      builder.policySettings(args(argsBuilder).build)
