package jp.ukiba.ko_pulumi
package gcp

object securityposture_ext:
  extension (builder: com.pulumi.gcp.securityposture.PostureArgs.Builder)
    /**
     * @param policySets List of policy sets for the posture.
     * Structure is documented below.
     * @return builder
     */
    inline def policySets(args: Endofunction[com.pulumi.gcp.securityposture.inputs.PosturePolicySetArgs.Builder]*):
        com.pulumi.gcp.securityposture.PostureArgs.Builder =
      def argsBuilder = com.pulumi.gcp.securityposture.inputs.PosturePolicySetArgs.builder
      builder.policySets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.securityposture.inputs.PosturePolicySetArgs.Builder)
    /**
     * @param policies List of security policy
     * Structure is documented below.
     * @return builder
     */
    inline def policies(args: Endofunction[com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyArgs.Builder]*):
        com.pulumi.gcp.securityposture.inputs.PosturePolicySetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyArgs.builder
      builder.policies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyArgs.Builder)
    /**
     * @param complianceStandards Mapping for policy to security standards and controls.
     * Structure is documented below.
     * @return builder
     */
    inline def complianceStandards(args: Endofunction[com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyComplianceStandardArgs.Builder]*):
        com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyComplianceStandardArgs.builder
      builder.complianceStandards(args.map(_(argsBuilder).build)*)

    /**
     * @param constraint Policy constraint definition.It can have the definition of one of following constraints: orgPolicyConstraint orgPolicyConstraintCustom securityHealthAnalyticsModule securityHealthAnalyticsCustomModule
     * Structure is documented below.
     * @return builder
     */
    inline def constraint(args: Endofunction[com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintArgs.Builder]):
        com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintArgs.builder
      builder.constraint(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintArgs.Builder)
    /**
     * @param orgPolicyConstraint Organization policy canned constraint definition.
     * Structure is documented below.
     * @return builder
     */
    inline def orgPolicyConstraint(args: Endofunction[com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintOrgPolicyConstraintArgs.Builder]):
        com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintOrgPolicyConstraintArgs.builder
      builder.orgPolicyConstraint(args(argsBuilder).build)

    /**
     * @param orgPolicyConstraintCustom Organization policy custom constraint policy definition.
     * Structure is documented below.
     * @return builder
     */
    inline def orgPolicyConstraintCustom(args: Endofunction[com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintOrgPolicyConstraintCustomArgs.Builder]):
        com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintOrgPolicyConstraintCustomArgs.builder
      builder.orgPolicyConstraintCustom(args(argsBuilder).build)

    /**
     * @param securityHealthAnalyticsCustomModule Definition of Security Health Analytics Custom Module.
     * Structure is documented below.
     * @return builder
     */
    inline def securityHealthAnalyticsCustomModule(args: Endofunction[com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintSecurityHealthAnalyticsCustomModuleArgs.Builder]):
        com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintSecurityHealthAnalyticsCustomModuleArgs.builder
      builder.securityHealthAnalyticsCustomModule(args(argsBuilder).build)

    /**
     * @param securityHealthAnalyticsModule Security Health Analytics built-in detector definition.
     * Structure is documented below.
     * @return builder
     */
    inline def securityHealthAnalyticsModule(args: Endofunction[com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintSecurityHealthAnalyticsModuleArgs.Builder]):
        com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintSecurityHealthAnalyticsModuleArgs.builder
      builder.securityHealthAnalyticsModule(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintOrgPolicyConstraintArgs.Builder)
    /**
     * @param policyRules Definition of policy rules
     * Structure is documented below.
     * @return builder
     */
    inline def policyRules(args: Endofunction[com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintOrgPolicyConstraintPolicyRuleArgs.Builder]*):
        com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintOrgPolicyConstraintArgs.Builder =
      def argsBuilder = com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintOrgPolicyConstraintPolicyRuleArgs.builder
      builder.policyRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintOrgPolicyConstraintCustomArgs.Builder)
    /**
     * @param customConstraint Organization policy custom constraint definition.
     * Structure is documented below.
     * @return builder
     */
    inline def customConstraint(args: Endofunction[com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintOrgPolicyConstraintCustomCustomConstraintArgs.Builder]):
        com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintOrgPolicyConstraintCustomArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintOrgPolicyConstraintCustomCustomConstraintArgs.builder
      builder.customConstraint(args(argsBuilder).build)

    /**
     * @param policyRules Definition of policy rules
     * Structure is documented below.
     * @return builder
     */
    inline def policyRules(args: Endofunction[com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintOrgPolicyConstraintCustomPolicyRuleArgs.Builder]*):
        com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintOrgPolicyConstraintCustomArgs.Builder =
      def argsBuilder = com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintOrgPolicyConstraintCustomPolicyRuleArgs.builder
      builder.policyRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintOrgPolicyConstraintCustomPolicyRuleArgs.Builder)
    /**
     * @param condition Represents a textual expression in the Common Expression Language (CEL) syntax. CEL is a C-like expression language.
     * This page details the objects and attributes that are used to the build the CEL expressions for
     * custom access levels - https://cloud.google.com/access-context-manager/docs/custom-access-level-spec.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintOrgPolicyConstraintCustomPolicyRuleConditionArgs.Builder]):
        com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintOrgPolicyConstraintCustomPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintOrgPolicyConstraintCustomPolicyRuleConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param values List of values to be used for this policy rule. This field can be set only in policies for list constraints.
     * Structure is documented below.
     * @return builder
     */
    inline def values(args: Endofunction[com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintOrgPolicyConstraintCustomPolicyRuleValuesArgs.Builder]):
        com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintOrgPolicyConstraintCustomPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintOrgPolicyConstraintCustomPolicyRuleValuesArgs.builder
      builder.values(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintOrgPolicyConstraintPolicyRuleArgs.Builder)
    /**
     * @param condition Represents a textual expression in the Common Expression Language (CEL) syntax. CEL is a C-like expression language.
     * This page details the objects and attributes that are used to the build the CEL expressions for
     * custom access levels - https://cloud.google.com/access-context-manager/docs/custom-access-level-spec.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintOrgPolicyConstraintPolicyRuleConditionArgs.Builder]):
        com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintOrgPolicyConstraintPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintOrgPolicyConstraintPolicyRuleConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param values List of values to be used for this policy rule. This field can be set only in policies for list constraints.
     * Structure is documented below.
     * @return builder
     */
    inline def values(args: Endofunction[com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintOrgPolicyConstraintPolicyRuleValuesArgs.Builder]):
        com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintOrgPolicyConstraintPolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintOrgPolicyConstraintPolicyRuleValuesArgs.builder
      builder.values(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintSecurityHealthAnalyticsCustomModuleArgs.Builder)
    /**
     * @param config Custom module details.
     * Structure is documented below.
     * @return builder
     */
    inline def config(args: Endofunction[com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintSecurityHealthAnalyticsCustomModuleConfigArgs.Builder]):
        com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintSecurityHealthAnalyticsCustomModuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintSecurityHealthAnalyticsCustomModuleConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintSecurityHealthAnalyticsCustomModuleConfigArgs.Builder)
    /**
     * @param customOutput Custom output properties. A set of optional name-value pairs that define custom source properties to
     * return with each finding that is generated by the custom module. The custom
     * source properties that are defined here are included in the finding JSON
     * under `sourceProperties`.
     * Structure is documented below.
     * @return builder
     */
    inline def customOutput(args: Endofunction[com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintSecurityHealthAnalyticsCustomModuleConfigCustomOutputArgs.Builder]):
        com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintSecurityHealthAnalyticsCustomModuleConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintSecurityHealthAnalyticsCustomModuleConfigCustomOutputArgs.builder
      builder.customOutput(args(argsBuilder).build)

    /**
     * @param predicate The CEL expression to evaluate to produce findings.When the expression
     * evaluates to true against a resource, a finding is generated.
     * Structure is documented below.
     * @return builder
     */
    inline def predicate(args: Endofunction[com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintSecurityHealthAnalyticsCustomModuleConfigPredicateArgs.Builder]):
        com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintSecurityHealthAnalyticsCustomModuleConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintSecurityHealthAnalyticsCustomModuleConfigPredicateArgs.builder
      builder.predicate(args(argsBuilder).build)

    /**
     * @param resourceSelector The resource types that the custom module operates on. Each custom module
     * can specify up to 5 resource types.
     * Structure is documented below.
     * @return builder
     */
    inline def resourceSelector(args: Endofunction[com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintSecurityHealthAnalyticsCustomModuleConfigResourceSelectorArgs.Builder]):
        com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintSecurityHealthAnalyticsCustomModuleConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintSecurityHealthAnalyticsCustomModuleConfigResourceSelectorArgs.builder
      builder.resourceSelector(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintSecurityHealthAnalyticsCustomModuleConfigCustomOutputArgs.Builder)
    /**
     * @param properties A list of custom output properties to add to the finding.
     * Structure is documented below.
     * @return builder
     */
    inline def properties(args: Endofunction[com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintSecurityHealthAnalyticsCustomModuleConfigCustomOutputPropertyArgs.Builder]*):
        com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintSecurityHealthAnalyticsCustomModuleConfigCustomOutputArgs.Builder =
      def argsBuilder = com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintSecurityHealthAnalyticsCustomModuleConfigCustomOutputPropertyArgs.builder
      builder.properties(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintSecurityHealthAnalyticsCustomModuleConfigCustomOutputPropertyArgs.Builder)
    /**
     * @param valueExpression The CEL expression for the custom output. A resource property can be
     * specified to return the value of the property or a text string enclosed
     * in quotation marks.
     * Structure is documented below.
     * @return builder
     */
    inline def valueExpression(args: Endofunction[com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintSecurityHealthAnalyticsCustomModuleConfigCustomOutputPropertyValueExpressionArgs.Builder]):
        com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintSecurityHealthAnalyticsCustomModuleConfigCustomOutputPropertyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.securityposture.inputs.PosturePolicySetPolicyConstraintSecurityHealthAnalyticsCustomModuleConfigCustomOutputPropertyValueExpressionArgs.builder
      builder.valueExpression(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.securityposture.inputs.PostureState.Builder)
    /**
     * @param policySets List of policy sets for the posture.
     * Structure is documented below.
     * @return builder
     */
    inline def policySets(args: Endofunction[com.pulumi.gcp.securityposture.inputs.PosturePolicySetArgs.Builder]*):
        com.pulumi.gcp.securityposture.inputs.PostureState.Builder =
      def argsBuilder = com.pulumi.gcp.securityposture.inputs.PosturePolicySetArgs.builder
      builder.policySets(args.map(_(argsBuilder).build)*)
