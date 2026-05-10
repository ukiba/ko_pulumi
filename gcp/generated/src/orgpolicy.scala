package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object orgpolicy:
  /**
   * Custom constraints are created by administrators to provide more granular and customizable control over the specific fields that are restricted by your organization policies.
   * 
   *  To get more information about CustomConstraint, see:
   * 
   *  * [API documentation](https://docs.cloud.google.com/resource-manager/docs/reference/orgpolicy/rest/v2/organizations.constraints)
   *  * How-to Guides
   *      * [Official Documentation](https://docs.cloud.google.com/resource-manager/docs/organization-policy/creating-managing-custom-constraints)
   *      * [Supported Services](https://docs.cloud.google.com/resource-manager/docs/organization-policy/custom-constraint-supported-services)
   */
  def CustomConstraint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.orgpolicy.CustomConstraintArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.orgpolicy.CustomConstraintArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.orgpolicy.CustomConstraint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.orgpolicy.PolicyArgs.Builder)
    /**
     * @param dryRunSpec Dry-run policy. Audit-only policy, can be used to monitor how the policy would have impacted the existing and future resources if it&#39;s enforced.
     *  Structure is documented below.
     * @return builder
     */
    def dryRunSpec(args: Endofunction[com.pulumi.gcp.orgpolicy.inputs.PolicyDryRunSpecArgs.Builder]):
        com.pulumi.gcp.orgpolicy.PolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.orgpolicy.inputs.PolicyDryRunSpecArgs.builder
      builder.dryRunSpec(args(argsBuilder).build)

    /**
     * @param spec Basic information about the Organization Policy.
     *  Structure is documented below.
     * @return builder
     */
    def spec(args: Endofunction[com.pulumi.gcp.orgpolicy.inputs.PolicySpecArgs.Builder]):
        com.pulumi.gcp.orgpolicy.PolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.orgpolicy.inputs.PolicySpecArgs.builder
      builder.spec(args(argsBuilder).build)

  /**
   * Defines an organization policy which is used to specify constraints for configurations of Google Cloud resources.
   * 
   *  To get more information about Policy, see:
   * 
   *  * [API documentation](https://docs.cloud.google.com/resource-manager/docs/reference/orgpolicy/rest/v2/organizations.policies)
   *  * How-to Guides
   *      * [Official Documentation](https://docs.cloud.google.com/resource-manager/docs/organization-policy/creating-managing-custom-constraints)
   *      * [Supported Services](https://docs.cloud.google.com/resource-manager/docs/organization-policy/custom-constraint-supported-services)
   */
  def Policy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.orgpolicy.PolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.orgpolicy.PolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.orgpolicy.Policy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.orgpolicy.inputs.PolicyDryRunSpecArgs.Builder)
    /**
     * @param rules In policies for boolean constraints, the following requirements apply: - There must be one and only one policy rule where condition is unset. - Boolean policy rules with conditions must set `enforced` to the opposite of the policy rule without a condition. - During policy evaluation, policy rules with conditions that are true for a target resource take precedence.
     *  Structure is documented below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.gcp.orgpolicy.inputs.PolicyDryRunSpecRuleArgs.Builder]*):
        com.pulumi.gcp.orgpolicy.inputs.PolicyDryRunSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.orgpolicy.inputs.PolicyDryRunSpecRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.orgpolicy.inputs.PolicySpecArgs.Builder)
    /**
     * @param rules In Policies for boolean constraints, the following requirements apply: - There must be one and only one PolicyRule where condition is unset. - BooleanPolicyRules with conditions must set `enforced` to the opposite of the PolicyRule without a condition. - During policy evaluation, PolicyRules with conditions that are true for a target resource take precedence.
     *  Structure is documented below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.gcp.orgpolicy.inputs.PolicySpecRuleArgs.Builder]*):
        com.pulumi.gcp.orgpolicy.inputs.PolicySpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.orgpolicy.inputs.PolicySpecRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.orgpolicy.inputs.PolicySpecRuleArgs.Builder)
    /**
     * @param condition A condition which determines whether this rule is used in the evaluation of the policy. When set, the `expression` field in the `Expr&#39; must include from 1 to 10 subexpressions, joined by the &#34;||&#34; or &#34;&amp;&amp;&#34; operators. Each subexpression must be of the form &#34;resource.matchTag(&#39;/tag_key_short_name, &#39;tag_value_short_name&#39;)&#34;. or &#34;resource.matchTagId(&#39;tagKeys/key_id&#39;, &#39;tagValues/value_id&#39;)&#34;. where keyName and valueName are the resource names for Label Keys and Values. These names are available from the Tag Manager Service. An example expression is: &#34;resource.matchTag(&#39;123456789/environment, &#39;prod&#39;)&#34;. or &#34;resource.matchTagId(&#39;tagKeys/123&#39;, &#39;tagValues/456&#39;)&#34;.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.orgpolicy.inputs.PolicySpecRuleConditionArgs.Builder]):
        com.pulumi.gcp.orgpolicy.inputs.PolicySpecRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.orgpolicy.inputs.PolicySpecRuleConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param values List of values to be used for this policy rule. This field can be set only in policies for list constraints.
     *  Structure is documented below.
     * @return builder
     */
    def values(args: Endofunction[com.pulumi.gcp.orgpolicy.inputs.PolicySpecRuleValuesArgs.Builder]):
        com.pulumi.gcp.orgpolicy.inputs.PolicySpecRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.orgpolicy.inputs.PolicySpecRuleValuesArgs.builder
      builder.values(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.orgpolicy.inputs.PolicyState.Builder)
    /**
     * @param dryRunSpec Dry-run policy. Audit-only policy, can be used to monitor how the policy would have impacted the existing and future resources if it&#39;s enforced.
     *  Structure is documented below.
     * @return builder
     */
    def dryRunSpec(args: Endofunction[com.pulumi.gcp.orgpolicy.inputs.PolicyDryRunSpecArgs.Builder]):
        com.pulumi.gcp.orgpolicy.inputs.PolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.orgpolicy.inputs.PolicyDryRunSpecArgs.builder
      builder.dryRunSpec(args(argsBuilder).build)

    /**
     * @param spec Basic information about the Organization Policy.
     *  Structure is documented below.
     * @return builder
     */
    def spec(args: Endofunction[com.pulumi.gcp.orgpolicy.inputs.PolicySpecArgs.Builder]):
        com.pulumi.gcp.orgpolicy.inputs.PolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.orgpolicy.inputs.PolicySpecArgs.builder
      builder.spec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.orgpolicy.inputs.PolicyDryRunSpecRuleArgs.Builder)
    /**
     * @param condition A condition which determines whether this rule is used in the evaluation of the policy. When set, the `expression` field in the `Expr&#39; must include from 1 to 10 subexpressions, joined by the &#34;||&#34; or &#34;&amp;&amp;&#34; operators. Each subexpression must be of the form &#34;resource.matchTag(&#39;/tag_key_short_name, &#39;tag_value_short_name&#39;)&#34;. or &#34;resource.matchTagId(&#39;tagKeys/key_id&#39;, &#39;tagValues/value_id&#39;)&#34;. where keyName and valueName are the resource names for Label Keys and Values. These names are available from the Tag Manager Service. An example expression is: &#34;resource.matchTag(&#39;123456789/environment, &#39;prod&#39;)&#34;. or &#34;resource.matchTagId(&#39;tagKeys/123&#39;, &#39;tagValues/456&#39;)&#34;.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.orgpolicy.inputs.PolicyDryRunSpecRuleConditionArgs.Builder]):
        com.pulumi.gcp.orgpolicy.inputs.PolicyDryRunSpecRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.orgpolicy.inputs.PolicyDryRunSpecRuleConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param values List of values to be used for this policy rule. This field can be set only in policies for list constraints.
     *  Structure is documented below.
     * @return builder
     */
    def values(args: Endofunction[com.pulumi.gcp.orgpolicy.inputs.PolicyDryRunSpecRuleValuesArgs.Builder]):
        com.pulumi.gcp.orgpolicy.inputs.PolicyDryRunSpecRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.orgpolicy.inputs.PolicyDryRunSpecRuleValuesArgs.builder
      builder.values(args(argsBuilder).build)
