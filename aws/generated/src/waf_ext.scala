package jp.ukiba.ko_pulumi
package aws

object waf_ext:
  extension (builder: com.pulumi.aws.waf.ByteMatchSetArgs.Builder)
    /**
     * @param byteMatchTuples Specifies the bytes (typically a string that corresponds
     * with ASCII characters) that you want to search for in web requests,
     * the location in requests that you want to search, and other settings.
     * @return builder
     */
    def byteMatchTuples(args: Endofunction[com.pulumi.aws.waf.inputs.ByteMatchSetByteMatchTupleArgs.Builder]*):
        com.pulumi.aws.waf.ByteMatchSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.waf.inputs.ByteMatchSetByteMatchTupleArgs.builder
      builder.byteMatchTuples(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.waf.GeoMatchSetArgs.Builder)
    /**
     * @param geoMatchConstraints The GeoMatchConstraint objects which contain the country that you want AWS WAF to search for.
     * @return builder
     */
    def geoMatchConstraints(args: Endofunction[com.pulumi.aws.waf.inputs.GeoMatchSetGeoMatchConstraintArgs.Builder]*):
        com.pulumi.aws.waf.GeoMatchSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.waf.inputs.GeoMatchSetGeoMatchConstraintArgs.builder
      builder.geoMatchConstraints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.waf.IpSetArgs.Builder)
    /**
     * @param ipSetDescriptors One or more pairs specifying the IP address type (IPV4 or IPV6) and the IP address range (in CIDR format) from which web requests originate.
     * @return builder
     */
    def ipSetDescriptors(args: Endofunction[com.pulumi.aws.waf.inputs.IpSetIpSetDescriptorArgs.Builder]*):
        com.pulumi.aws.waf.IpSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.waf.inputs.IpSetIpSetDescriptorArgs.builder
      builder.ipSetDescriptors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.waf.RateBasedRuleArgs.Builder)
    /**
     * @param predicates The objects to include in a rule (documented below).
     * @return builder
     */
    def predicates(args: Endofunction[com.pulumi.aws.waf.inputs.RateBasedRulePredicateArgs.Builder]*):
        com.pulumi.aws.waf.RateBasedRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.waf.inputs.RateBasedRulePredicateArgs.builder
      builder.predicates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.waf.RegexMatchSetArgs.Builder)
    /**
     * @param regexMatchTuples The regular expression pattern that you want AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search, and other settings. See below.
     * @return builder
     */
    def regexMatchTuples(args: Endofunction[com.pulumi.aws.waf.inputs.RegexMatchSetRegexMatchTupleArgs.Builder]*):
        com.pulumi.aws.waf.RegexMatchSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.waf.inputs.RegexMatchSetRegexMatchTupleArgs.builder
      builder.regexMatchTuples(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.waf.RuleArgs.Builder)
    /**
     * @param predicates The objects to include in a rule (documented below).
     * @return builder
     */
    def predicates(args: Endofunction[com.pulumi.aws.waf.inputs.RulePredicateArgs.Builder]*):
        com.pulumi.aws.waf.RuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.waf.inputs.RulePredicateArgs.builder
      builder.predicates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.waf.RuleGroupArgs.Builder)
    /**
     * @param activatedRules A list of activated rules, see below
     * @return builder
     */
    def activatedRules(args: Endofunction[com.pulumi.aws.waf.inputs.RuleGroupActivatedRuleArgs.Builder]*):
        com.pulumi.aws.waf.RuleGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.waf.inputs.RuleGroupActivatedRuleArgs.builder
      builder.activatedRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.waf.SizeConstraintSetArgs.Builder)
    /**
     * @param sizeConstraints Parts of web requests that you want to inspect the size of.
     * @return builder
     */
    def sizeConstraints(args: Endofunction[com.pulumi.aws.waf.inputs.SizeConstraintSetSizeConstraintArgs.Builder]*):
        com.pulumi.aws.waf.SizeConstraintSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.waf.inputs.SizeConstraintSetSizeConstraintArgs.builder
      builder.sizeConstraints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.waf.SqlInjectionMatchSetArgs.Builder)
    /**
     * @param sqlInjectionMatchTuples The parts of web requests that you want AWS WAF to inspect for malicious SQL code and, if you want AWS WAF to inspect a header, the name of the header.
     * @return builder
     */
    def sqlInjectionMatchTuples(args: Endofunction[com.pulumi.aws.waf.inputs.SqlInjectionMatchSetSqlInjectionMatchTupleArgs.Builder]*):
        com.pulumi.aws.waf.SqlInjectionMatchSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.waf.inputs.SqlInjectionMatchSetSqlInjectionMatchTupleArgs.builder
      builder.sqlInjectionMatchTuples(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.waf.WebAclArgs.Builder)
    /**
     * @param defaultAction Configuration block with action that you want AWS WAF to take when a request doesn&#39;t match the criteria in any of the rules that are associated with the web ACL. Detailed below.
     * @return builder
     */
    def defaultAction(args: Endofunction[com.pulumi.aws.waf.inputs.WebAclDefaultActionArgs.Builder]):
        com.pulumi.aws.waf.WebAclArgs.Builder =
      val argsBuilder = com.pulumi.aws.waf.inputs.WebAclDefaultActionArgs.builder
      builder.defaultAction(args(argsBuilder).build)

    /**
     * @param loggingConfiguration Configuration block to enable WAF logging. Detailed below.
     * @return builder
     */
    def loggingConfiguration(args: Endofunction[com.pulumi.aws.waf.inputs.WebAclLoggingConfigurationArgs.Builder]):
        com.pulumi.aws.waf.WebAclArgs.Builder =
      val argsBuilder = com.pulumi.aws.waf.inputs.WebAclLoggingConfigurationArgs.builder
      builder.loggingConfiguration(args(argsBuilder).build)

    /**
     * @param rules Configuration blocks containing rules to associate with the web ACL and the settings for each rule. Detailed below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.waf.inputs.WebAclRuleArgs.Builder]*):
        com.pulumi.aws.waf.WebAclArgs.Builder =
      def argsBuilder = com.pulumi.aws.waf.inputs.WebAclRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.waf.XssMatchSetArgs.Builder)
    /**
     * @param xssMatchTuples The parts of web requests that you want to inspect for cross-site scripting attacks.
     * @return builder
     */
    def xssMatchTuples(args: Endofunction[com.pulumi.aws.waf.inputs.XssMatchSetXssMatchTupleArgs.Builder]*):
        com.pulumi.aws.waf.XssMatchSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.waf.inputs.XssMatchSetXssMatchTupleArgs.builder
      builder.xssMatchTuples(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.waf.inputs.ByteMatchSetByteMatchTupleArgs.Builder)
    /**
     * @param fieldToMatch The part of a web request that you want to search, such as a specified header or a query string.
     * @return builder
     */
    def fieldToMatch(args: Endofunction[com.pulumi.aws.waf.inputs.ByteMatchSetByteMatchTupleFieldToMatchArgs.Builder]):
        com.pulumi.aws.waf.inputs.ByteMatchSetByteMatchTupleArgs.Builder =
      val argsBuilder = com.pulumi.aws.waf.inputs.ByteMatchSetByteMatchTupleFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.waf.inputs.ByteMatchSetState.Builder)
    /**
     * @param byteMatchTuples Specifies the bytes (typically a string that corresponds
     * with ASCII characters) that you want to search for in web requests,
     * the location in requests that you want to search, and other settings.
     * @return builder
     */
    def byteMatchTuples(args: Endofunction[com.pulumi.aws.waf.inputs.ByteMatchSetByteMatchTupleArgs.Builder]*):
        com.pulumi.aws.waf.inputs.ByteMatchSetState.Builder =
      def argsBuilder = com.pulumi.aws.waf.inputs.ByteMatchSetByteMatchTupleArgs.builder
      builder.byteMatchTuples(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.waf.inputs.GeoMatchSetState.Builder)
    /**
     * @param geoMatchConstraints The GeoMatchConstraint objects which contain the country that you want AWS WAF to search for.
     * @return builder
     */
    def geoMatchConstraints(args: Endofunction[com.pulumi.aws.waf.inputs.GeoMatchSetGeoMatchConstraintArgs.Builder]*):
        com.pulumi.aws.waf.inputs.GeoMatchSetState.Builder =
      def argsBuilder = com.pulumi.aws.waf.inputs.GeoMatchSetGeoMatchConstraintArgs.builder
      builder.geoMatchConstraints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.waf.inputs.IpSetState.Builder)
    /**
     * @param ipSetDescriptors One or more pairs specifying the IP address type (IPV4 or IPV6) and the IP address range (in CIDR format) from which web requests originate.
     * @return builder
     */
    def ipSetDescriptors(args: Endofunction[com.pulumi.aws.waf.inputs.IpSetIpSetDescriptorArgs.Builder]*):
        com.pulumi.aws.waf.inputs.IpSetState.Builder =
      def argsBuilder = com.pulumi.aws.waf.inputs.IpSetIpSetDescriptorArgs.builder
      builder.ipSetDescriptors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.waf.inputs.RateBasedRuleState.Builder)
    /**
     * @param predicates The objects to include in a rule (documented below).
     * @return builder
     */
    def predicates(args: Endofunction[com.pulumi.aws.waf.inputs.RateBasedRulePredicateArgs.Builder]*):
        com.pulumi.aws.waf.inputs.RateBasedRuleState.Builder =
      def argsBuilder = com.pulumi.aws.waf.inputs.RateBasedRulePredicateArgs.builder
      builder.predicates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.waf.inputs.RegexMatchSetRegexMatchTupleArgs.Builder)
    /**
     * @param fieldToMatch The part of a web request that you want to search, such as a specified header or a query string.
     * @return builder
     */
    def fieldToMatch(args: Endofunction[com.pulumi.aws.waf.inputs.RegexMatchSetRegexMatchTupleFieldToMatchArgs.Builder]):
        com.pulumi.aws.waf.inputs.RegexMatchSetRegexMatchTupleArgs.Builder =
      val argsBuilder = com.pulumi.aws.waf.inputs.RegexMatchSetRegexMatchTupleFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.waf.inputs.RegexMatchSetState.Builder)
    /**
     * @param regexMatchTuples The regular expression pattern that you want AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search, and other settings. See below.
     * @return builder
     */
    def regexMatchTuples(args: Endofunction[com.pulumi.aws.waf.inputs.RegexMatchSetRegexMatchTupleArgs.Builder]*):
        com.pulumi.aws.waf.inputs.RegexMatchSetState.Builder =
      def argsBuilder = com.pulumi.aws.waf.inputs.RegexMatchSetRegexMatchTupleArgs.builder
      builder.regexMatchTuples(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.waf.inputs.RuleGroupActivatedRuleArgs.Builder)
    /**
     * @param action Specifies the action that CloudFront or AWS WAF takes when a web request matches the conditions in the rule.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.aws.waf.inputs.RuleGroupActivatedRuleActionArgs.Builder]):
        com.pulumi.aws.waf.inputs.RuleGroupActivatedRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.waf.inputs.RuleGroupActivatedRuleActionArgs.builder
      builder.action(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.waf.inputs.RuleGroupState.Builder)
    /**
     * @param activatedRules A list of activated rules, see below
     * @return builder
     */
    def activatedRules(args: Endofunction[com.pulumi.aws.waf.inputs.RuleGroupActivatedRuleArgs.Builder]*):
        com.pulumi.aws.waf.inputs.RuleGroupState.Builder =
      def argsBuilder = com.pulumi.aws.waf.inputs.RuleGroupActivatedRuleArgs.builder
      builder.activatedRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.waf.inputs.RuleState.Builder)
    /**
     * @param predicates The objects to include in a rule (documented below).
     * @return builder
     */
    def predicates(args: Endofunction[com.pulumi.aws.waf.inputs.RulePredicateArgs.Builder]*):
        com.pulumi.aws.waf.inputs.RuleState.Builder =
      def argsBuilder = com.pulumi.aws.waf.inputs.RulePredicateArgs.builder
      builder.predicates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.waf.inputs.SizeConstraintSetSizeConstraintArgs.Builder)
    /**
     * @param fieldToMatch Parameter that specifies where in a web request to look for the size constraint.
     * @return builder
     */
    def fieldToMatch(args: Endofunction[com.pulumi.aws.waf.inputs.SizeConstraintSetSizeConstraintFieldToMatchArgs.Builder]):
        com.pulumi.aws.waf.inputs.SizeConstraintSetSizeConstraintArgs.Builder =
      val argsBuilder = com.pulumi.aws.waf.inputs.SizeConstraintSetSizeConstraintFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.waf.inputs.SizeConstraintSetState.Builder)
    /**
     * @param sizeConstraints Parts of web requests that you want to inspect the size of.
     * @return builder
     */
    def sizeConstraints(args: Endofunction[com.pulumi.aws.waf.inputs.SizeConstraintSetSizeConstraintArgs.Builder]*):
        com.pulumi.aws.waf.inputs.SizeConstraintSetState.Builder =
      def argsBuilder = com.pulumi.aws.waf.inputs.SizeConstraintSetSizeConstraintArgs.builder
      builder.sizeConstraints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.waf.inputs.SqlInjectionMatchSetSqlInjectionMatchTupleArgs.Builder)
    /**
     * @param fieldToMatch Specifies where in a web request to look for snippets of malicious SQL code.
     * @return builder
     */
    def fieldToMatch(args: Endofunction[com.pulumi.aws.waf.inputs.SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatchArgs.Builder]):
        com.pulumi.aws.waf.inputs.SqlInjectionMatchSetSqlInjectionMatchTupleArgs.Builder =
      val argsBuilder = com.pulumi.aws.waf.inputs.SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.waf.inputs.SqlInjectionMatchSetState.Builder)
    /**
     * @param sqlInjectionMatchTuples The parts of web requests that you want AWS WAF to inspect for malicious SQL code and, if you want AWS WAF to inspect a header, the name of the header.
     * @return builder
     */
    def sqlInjectionMatchTuples(args: Endofunction[com.pulumi.aws.waf.inputs.SqlInjectionMatchSetSqlInjectionMatchTupleArgs.Builder]*):
        com.pulumi.aws.waf.inputs.SqlInjectionMatchSetState.Builder =
      def argsBuilder = com.pulumi.aws.waf.inputs.SqlInjectionMatchSetSqlInjectionMatchTupleArgs.builder
      builder.sqlInjectionMatchTuples(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.waf.inputs.WebAclLoggingConfigurationArgs.Builder)
    /**
     * @param redactedFields Configuration block containing parts of the request that you want redacted from the logs. Detailed below.
     * @return builder
     */
    def redactedFields(args: Endofunction[com.pulumi.aws.waf.inputs.WebAclLoggingConfigurationRedactedFieldsArgs.Builder]):
        com.pulumi.aws.waf.inputs.WebAclLoggingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.waf.inputs.WebAclLoggingConfigurationRedactedFieldsArgs.builder
      builder.redactedFields(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.waf.inputs.WebAclLoggingConfigurationRedactedFieldsArgs.Builder)
    /**
     * @param fieldToMatches Set of configuration blocks for fields to redact. Detailed below.
     * @return builder
     */
    def fieldToMatches(args: Endofunction[com.pulumi.aws.waf.inputs.WebAclLoggingConfigurationRedactedFieldsFieldToMatchArgs.Builder]*):
        com.pulumi.aws.waf.inputs.WebAclLoggingConfigurationRedactedFieldsArgs.Builder =
      def argsBuilder = com.pulumi.aws.waf.inputs.WebAclLoggingConfigurationRedactedFieldsFieldToMatchArgs.builder
      builder.fieldToMatches(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.waf.inputs.WebAclRuleArgs.Builder)
    /**
     * @param action The action that CloudFront or AWS WAF takes when a web request matches the conditions in the rule. Not used if `type` is `GROUP`.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.aws.waf.inputs.WebAclRuleActionArgs.Builder]):
        com.pulumi.aws.waf.inputs.WebAclRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.waf.inputs.WebAclRuleActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param overrideAction Override the action that a group requests CloudFront or AWS WAF takes when a web request matches the conditions in the rule. Only used if `type` is `GROUP`.
     * @return builder
     */
    def overrideAction(args: Endofunction[com.pulumi.aws.waf.inputs.WebAclRuleOverrideActionArgs.Builder]):
        com.pulumi.aws.waf.inputs.WebAclRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.waf.inputs.WebAclRuleOverrideActionArgs.builder
      builder.overrideAction(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.waf.inputs.WebAclState.Builder)
    /**
     * @param defaultAction Configuration block with action that you want AWS WAF to take when a request doesn&#39;t match the criteria in any of the rules that are associated with the web ACL. Detailed below.
     * @return builder
     */
    def defaultAction(args: Endofunction[com.pulumi.aws.waf.inputs.WebAclDefaultActionArgs.Builder]):
        com.pulumi.aws.waf.inputs.WebAclState.Builder =
      val argsBuilder = com.pulumi.aws.waf.inputs.WebAclDefaultActionArgs.builder
      builder.defaultAction(args(argsBuilder).build)

    /**
     * @param loggingConfiguration Configuration block to enable WAF logging. Detailed below.
     * @return builder
     */
    def loggingConfiguration(args: Endofunction[com.pulumi.aws.waf.inputs.WebAclLoggingConfigurationArgs.Builder]):
        com.pulumi.aws.waf.inputs.WebAclState.Builder =
      val argsBuilder = com.pulumi.aws.waf.inputs.WebAclLoggingConfigurationArgs.builder
      builder.loggingConfiguration(args(argsBuilder).build)

    /**
     * @param rules Configuration blocks containing rules to associate with the web ACL and the settings for each rule. Detailed below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.waf.inputs.WebAclRuleArgs.Builder]*):
        com.pulumi.aws.waf.inputs.WebAclState.Builder =
      def argsBuilder = com.pulumi.aws.waf.inputs.WebAclRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.waf.inputs.XssMatchSetState.Builder)
    /**
     * @param xssMatchTuples The parts of web requests that you want to inspect for cross-site scripting attacks.
     * @return builder
     */
    def xssMatchTuples(args: Endofunction[com.pulumi.aws.waf.inputs.XssMatchSetXssMatchTupleArgs.Builder]*):
        com.pulumi.aws.waf.inputs.XssMatchSetState.Builder =
      def argsBuilder = com.pulumi.aws.waf.inputs.XssMatchSetXssMatchTupleArgs.builder
      builder.xssMatchTuples(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.waf.inputs.XssMatchSetXssMatchTupleArgs.Builder)
    /**
     * @param fieldToMatch Specifies where in a web request to look for cross-site scripting attacks.
     * @return builder
     */
    def fieldToMatch(args: Endofunction[com.pulumi.aws.waf.inputs.XssMatchSetXssMatchTupleFieldToMatchArgs.Builder]):
        com.pulumi.aws.waf.inputs.XssMatchSetXssMatchTupleArgs.Builder =
      val argsBuilder = com.pulumi.aws.waf.inputs.XssMatchSetXssMatchTupleFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)
