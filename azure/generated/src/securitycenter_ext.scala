package jp.ukiba.ko_pulumi
package azure

object securitycenter_ext:
  extension (builder: com.pulumi.azure.securitycenter.AssessmentArgs.Builder)
    /**
     * @param status A `status` block as defined below.
     * @return builder
     */
    inline def status(args: Endofunction[com.pulumi.azure.securitycenter.inputs.AssessmentStatusArgs.Builder]):
        com.pulumi.azure.securitycenter.AssessmentArgs.Builder =
      val argsBuilder = com.pulumi.azure.securitycenter.inputs.AssessmentStatusArgs.builder
      builder.status(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.securitycenter.AutomationArgs.Builder)
    /**
     * @param actions One or more `action` blocks as defined below. An `action` tells this automation where the data is to be sent to upon being evaluated by the rules in the `source`.
     * @return builder
     */
    inline def actions(args: Endofunction[com.pulumi.azure.securitycenter.inputs.AutomationActionArgs.Builder]*):
        com.pulumi.azure.securitycenter.AutomationArgs.Builder =
      def argsBuilder = com.pulumi.azure.securitycenter.inputs.AutomationActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param sources One or more `source` blocks as defined below. A `source` defines what data types will be processed and a set of rules to filter that data.
     * @return builder
     */
    inline def sources(args: Endofunction[com.pulumi.azure.securitycenter.inputs.AutomationSourceArgs.Builder]*):
        com.pulumi.azure.securitycenter.AutomationArgs.Builder =
      def argsBuilder = com.pulumi.azure.securitycenter.inputs.AutomationSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.securitycenter.SubscriptionPricingArgs.Builder)
    /**
     * @param extensions One or more `extension` blocks as defined below.
     * @return builder
     */
    inline def extensions(args: Endofunction[com.pulumi.azure.securitycenter.inputs.SubscriptionPricingExtensionArgs.Builder]*):
        com.pulumi.azure.securitycenter.SubscriptionPricingArgs.Builder =
      def argsBuilder = com.pulumi.azure.securitycenter.inputs.SubscriptionPricingExtensionArgs.builder
      builder.extensions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.securitycenter.inputs.AssessmentState.Builder)
    /**
     * @param status A `status` block as defined below.
     * @return builder
     */
    inline def status(args: Endofunction[com.pulumi.azure.securitycenter.inputs.AssessmentStatusArgs.Builder]):
        com.pulumi.azure.securitycenter.inputs.AssessmentState.Builder =
      val argsBuilder = com.pulumi.azure.securitycenter.inputs.AssessmentStatusArgs.builder
      builder.status(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.securitycenter.inputs.AutomationSourceArgs.Builder)
    /**
     * @param ruleSets A set of rules which evaluate upon event and data interception. This is defined in one or more `ruleSet` blocks as defined below.
     * 
     * &gt; **Note:** When multiple `ruleSet` block are provided, a logical &#39;OR&#39; is applied to the evaluation of them.
     * @return builder
     */
    inline def ruleSets(args: Endofunction[com.pulumi.azure.securitycenter.inputs.AutomationSourceRuleSetArgs.Builder]*):
        com.pulumi.azure.securitycenter.inputs.AutomationSourceArgs.Builder =
      def argsBuilder = com.pulumi.azure.securitycenter.inputs.AutomationSourceRuleSetArgs.builder
      builder.ruleSets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.securitycenter.inputs.AutomationSourceRuleSetArgs.Builder)
    /**
     * @param rules One or more `rule` blocks as defined below.
     * 
     * &gt; **Note:** This automation will trigger when all of the `rule`s in this `ruleSet` are evaluated as &#39;true&#39;. This is equivalent to a logical &#39;AND&#39;.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.azure.securitycenter.inputs.AutomationSourceRuleSetRuleArgs.Builder]*):
        com.pulumi.azure.securitycenter.inputs.AutomationSourceRuleSetArgs.Builder =
      def argsBuilder = com.pulumi.azure.securitycenter.inputs.AutomationSourceRuleSetRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.securitycenter.inputs.AutomationState.Builder)
    /**
     * @param actions One or more `action` blocks as defined below. An `action` tells this automation where the data is to be sent to upon being evaluated by the rules in the `source`.
     * @return builder
     */
    inline def actions(args: Endofunction[com.pulumi.azure.securitycenter.inputs.AutomationActionArgs.Builder]*):
        com.pulumi.azure.securitycenter.inputs.AutomationState.Builder =
      def argsBuilder = com.pulumi.azure.securitycenter.inputs.AutomationActionArgs.builder
      builder.actions(args.map(_(argsBuilder).build)*)

    /**
     * @param sources One or more `source` blocks as defined below. A `source` defines what data types will be processed and a set of rules to filter that data.
     * @return builder
     */
    inline def sources(args: Endofunction[com.pulumi.azure.securitycenter.inputs.AutomationSourceArgs.Builder]*):
        com.pulumi.azure.securitycenter.inputs.AutomationState.Builder =
      def argsBuilder = com.pulumi.azure.securitycenter.inputs.AutomationSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.securitycenter.inputs.SubscriptionPricingState.Builder)
    /**
     * @param extensions One or more `extension` blocks as defined below.
     * @return builder
     */
    inline def extensions(args: Endofunction[com.pulumi.azure.securitycenter.inputs.SubscriptionPricingExtensionArgs.Builder]*):
        com.pulumi.azure.securitycenter.inputs.SubscriptionPricingState.Builder =
      def argsBuilder = com.pulumi.azure.securitycenter.inputs.SubscriptionPricingExtensionArgs.builder
      builder.extensions(args.map(_(argsBuilder).build)*)
