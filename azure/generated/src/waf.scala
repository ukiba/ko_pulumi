package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object waf:
  object WafFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Web Application Firewall Policy. */
    inline def getFirewallPolicy(args: Endofunction[com.pulumi.azure.waf.inputs.GetFirewallPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.waf.outputs.GetFirewallPolicyResult] =
      val argsBuilder = com.pulumi.azure.waf.inputs.GetFirewallPolicyArgs.builder
      com.pulumi.azure.waf.WafFunctions.getFirewallPolicy(args(argsBuilder).build)

    /** Use this data source to access information about an existing Web Application Firewall Policy. */
    inline def getFirewallPolicyPlain(args: Endofunction[com.pulumi.azure.waf.inputs.GetFirewallPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.waf.outputs.GetFirewallPolicyResult] =
      val argsBuilder = com.pulumi.azure.waf.inputs.GetFirewallPolicyPlainArgs.builder
      com.pulumi.azure.waf.WafFunctions.getFirewallPolicyPlain(args(argsBuilder).build)

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

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.waf.PolicyArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Azure Web Application Firewall Policy instance. */
  def Policy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.waf.PolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.waf.PolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.waf.Policy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.waf.inputs.PolicyCustomRuleMatchConditionArgs.Builder)
    /**
     * @param matchVariables One or more `matchVariables` blocks as defined below.
     * @return builder
     */
    def matchVariables(args: Endofunction[com.pulumi.azure.waf.inputs.PolicyCustomRuleMatchConditionMatchVariableArgs.Builder]*):
        com.pulumi.azure.waf.inputs.PolicyCustomRuleMatchConditionArgs.Builder =
      def argsBuilder = com.pulumi.azure.waf.inputs.PolicyCustomRuleMatchConditionMatchVariableArgs.builder
      builder.matchVariables(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.waf.inputs.PolicyPolicySettingsLogScrubbingArgs.Builder)
    /**
     * @param rules One or more `scrubbingRule` blocks as define below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.azure.waf.inputs.PolicyPolicySettingsLogScrubbingRuleArgs.Builder]*):
        com.pulumi.azure.waf.inputs.PolicyPolicySettingsLogScrubbingArgs.Builder =
      def argsBuilder = com.pulumi.azure.waf.inputs.PolicyPolicySettingsLogScrubbingRuleArgs.builder
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

  extension (builder: com.pulumi.azure.waf.inputs.PolicyCustomRuleArgs.Builder)
    /**
     * @param matchConditions One or more `matchConditions` blocks as defined below.
     * @return builder
     */
    def matchConditions(args: Endofunction[com.pulumi.azure.waf.inputs.PolicyCustomRuleMatchConditionArgs.Builder]*):
        com.pulumi.azure.waf.inputs.PolicyCustomRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.waf.inputs.PolicyCustomRuleMatchConditionArgs.builder
      builder.matchConditions(args.map(_(argsBuilder).build)*)

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

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.waf.inputs.PolicyState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.waf.inputs.PolicyManagedRulesManagedRuleSetArgs.Builder)
    /**
     * @param ruleGroupOverrides One or more `ruleGroupOverride` block defined below.
     * @return builder
     */
    def ruleGroupOverrides(args: Endofunction[com.pulumi.azure.waf.inputs.PolicyManagedRulesManagedRuleSetRuleGroupOverrideArgs.Builder]*):
        com.pulumi.azure.waf.inputs.PolicyManagedRulesManagedRuleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.waf.inputs.PolicyManagedRulesManagedRuleSetRuleGroupOverrideArgs.builder
      builder.ruleGroupOverrides(args.map(_(argsBuilder).build)*)

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

  extension (builder: com.pulumi.azure.waf.inputs.PolicyManagedRulesManagedRuleSetRuleGroupOverrideArgs.Builder)
    /**
     * @param rules One or more `rule` block defined below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.azure.waf.inputs.PolicyManagedRulesManagedRuleSetRuleGroupOverrideRuleArgs.Builder]*):
        com.pulumi.azure.waf.inputs.PolicyManagedRulesManagedRuleSetRuleGroupOverrideArgs.Builder =
      def argsBuilder = com.pulumi.azure.waf.inputs.PolicyManagedRulesManagedRuleSetRuleGroupOverrideRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)
