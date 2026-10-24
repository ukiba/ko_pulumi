package jp.ukiba.ko_pulumi
package aws

object wafregional_ext:
  extension (builder: com.pulumi.aws.wafregional.ByteMatchSetArgs.Builder)
    /**
     * @param byteMatchTuples Settings for the ByteMatchSet, such as the bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to search for in web requests. ByteMatchTuple documented below.
     * @return builder
     */
    inline def byteMatchTuples(args: Endofunction[com.pulumi.aws.wafregional.inputs.ByteMatchSetByteMatchTupleArgs.Builder]*):
        com.pulumi.aws.wafregional.ByteMatchSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafregional.inputs.ByteMatchSetByteMatchTupleArgs.builder
      builder.byteMatchTuples(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafregional.GeoMatchSetArgs.Builder)
    /**
     * @param geoMatchConstraints Geo Match Constraint objects which contain the country that you want AWS WAF to search for.
     * @return builder
     */
    inline def geoMatchConstraints(args: Endofunction[com.pulumi.aws.wafregional.inputs.GeoMatchSetGeoMatchConstraintArgs.Builder]*):
        com.pulumi.aws.wafregional.GeoMatchSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafregional.inputs.GeoMatchSetGeoMatchConstraintArgs.builder
      builder.geoMatchConstraints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafregional.IpSetArgs.Builder)
    /**
     * @param ipSetDescriptors One or more pairs specifying the IP address type (IPV4 or IPV6) and the IP address range (in CIDR notation) from which web requests originate.
     * @return builder
     */
    inline def ipSetDescriptors(args: Endofunction[com.pulumi.aws.wafregional.inputs.IpSetIpSetDescriptorArgs.Builder]*):
        com.pulumi.aws.wafregional.IpSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafregional.inputs.IpSetIpSetDescriptorArgs.builder
      builder.ipSetDescriptors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafregional.RateBasedRuleArgs.Builder)
    /**
     * @param predicates The objects to include in a rule (documented below).
     * @return builder
     */
    inline def predicates(args: Endofunction[com.pulumi.aws.wafregional.inputs.RateBasedRulePredicateArgs.Builder]*):
        com.pulumi.aws.wafregional.RateBasedRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafregional.inputs.RateBasedRulePredicateArgs.builder
      builder.predicates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafregional.RegexMatchSetArgs.Builder)
    /**
     * @param regexMatchTuples The regular expression pattern that you want AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search, and other settings. See below.
     * @return builder
     */
    inline def regexMatchTuples(args: Endofunction[com.pulumi.aws.wafregional.inputs.RegexMatchSetRegexMatchTupleArgs.Builder]*):
        com.pulumi.aws.wafregional.RegexMatchSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafregional.inputs.RegexMatchSetRegexMatchTupleArgs.builder
      builder.regexMatchTuples(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafregional.RuleArgs.Builder)
    /**
     * @param predicates The objects to include in a rule (documented below).
     * @return builder
     */
    inline def predicates(args: Endofunction[com.pulumi.aws.wafregional.inputs.RulePredicateArgs.Builder]*):
        com.pulumi.aws.wafregional.RuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafregional.inputs.RulePredicateArgs.builder
      builder.predicates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafregional.RuleGroupArgs.Builder)
    /**
     * @param activatedRules A list of activated rules, see below
     * @return builder
     */
    inline def activatedRules(args: Endofunction[com.pulumi.aws.wafregional.inputs.RuleGroupActivatedRuleArgs.Builder]*):
        com.pulumi.aws.wafregional.RuleGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafregional.inputs.RuleGroupActivatedRuleArgs.builder
      builder.activatedRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafregional.SizeConstraintSetArgs.Builder)
    /**
     * @param sizeConstraints Specifies the parts of web requests that you want to inspect the size of.
     * @return builder
     */
    inline def sizeConstraints(args: Endofunction[com.pulumi.aws.wafregional.inputs.SizeConstraintSetSizeConstraintArgs.Builder]*):
        com.pulumi.aws.wafregional.SizeConstraintSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafregional.inputs.SizeConstraintSetSizeConstraintArgs.builder
      builder.sizeConstraints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafregional.SqlInjectionMatchSetArgs.Builder)
    /**
     * @param sqlInjectionMatchTuples The parts of web requests that you want AWS WAF to inspect for malicious SQL code and, if you want AWS WAF to inspect a header, the name of the header.
     * @return builder
     */
    inline def sqlInjectionMatchTuples(args: Endofunction[com.pulumi.aws.wafregional.inputs.SqlInjectionMatchSetSqlInjectionMatchTupleArgs.Builder]*):
        com.pulumi.aws.wafregional.SqlInjectionMatchSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafregional.inputs.SqlInjectionMatchSetSqlInjectionMatchTupleArgs.builder
      builder.sqlInjectionMatchTuples(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafregional.WebAclArgs.Builder)
    /**
     * @param defaultAction The action that you want AWS WAF Regional to take when a request doesn&#39;t match the criteria in any of the rules that are associated with the web ACL.
     * @return builder
     */
    inline def defaultAction(args: Endofunction[com.pulumi.aws.wafregional.inputs.WebAclDefaultActionArgs.Builder]):
        com.pulumi.aws.wafregional.WebAclArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafregional.inputs.WebAclDefaultActionArgs.builder
      builder.defaultAction(args(argsBuilder).build)

    /**
     * @param loggingConfiguration Configuration block to enable WAF logging. Detailed below.
     * @return builder
     */
    inline def loggingConfiguration(args: Endofunction[com.pulumi.aws.wafregional.inputs.WebAclLoggingConfigurationArgs.Builder]):
        com.pulumi.aws.wafregional.WebAclArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafregional.inputs.WebAclLoggingConfigurationArgs.builder
      builder.loggingConfiguration(args(argsBuilder).build)

    /**
     * @param rules Set of configuration blocks containing rules for the web ACL. Detailed below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.aws.wafregional.inputs.WebAclRuleArgs.Builder]*):
        com.pulumi.aws.wafregional.WebAclArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafregional.inputs.WebAclRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafregional.XssMatchSetArgs.Builder)
    /**
     * @param xssMatchTuples The parts of web requests that you want to inspect for cross-site scripting attacks.
     * @return builder
     */
    inline def xssMatchTuples(args: Endofunction[com.pulumi.aws.wafregional.inputs.XssMatchSetXssMatchTupleArgs.Builder]*):
        com.pulumi.aws.wafregional.XssMatchSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafregional.inputs.XssMatchSetXssMatchTupleArgs.builder
      builder.xssMatchTuples(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafregional.inputs.ByteMatchSetByteMatchTupleArgs.Builder)
    /**
     * @param fieldToMatch Settings for the ByteMatchTuple. FieldToMatch documented below.
     * @return builder
     */
    inline def fieldToMatch(args: Endofunction[com.pulumi.aws.wafregional.inputs.ByteMatchSetByteMatchTupleFieldToMatchArgs.Builder]):
        com.pulumi.aws.wafregional.inputs.ByteMatchSetByteMatchTupleArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafregional.inputs.ByteMatchSetByteMatchTupleFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafregional.inputs.ByteMatchSetState.Builder)
    /**
     * @param byteMatchTuples Settings for the ByteMatchSet, such as the bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to search for in web requests. ByteMatchTuple documented below.
     * @return builder
     */
    inline def byteMatchTuples(args: Endofunction[com.pulumi.aws.wafregional.inputs.ByteMatchSetByteMatchTupleArgs.Builder]*):
        com.pulumi.aws.wafregional.inputs.ByteMatchSetState.Builder =
      def argsBuilder = com.pulumi.aws.wafregional.inputs.ByteMatchSetByteMatchTupleArgs.builder
      builder.byteMatchTuples(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafregional.inputs.GeoMatchSetState.Builder)
    /**
     * @param geoMatchConstraints Geo Match Constraint objects which contain the country that you want AWS WAF to search for.
     * @return builder
     */
    inline def geoMatchConstraints(args: Endofunction[com.pulumi.aws.wafregional.inputs.GeoMatchSetGeoMatchConstraintArgs.Builder]*):
        com.pulumi.aws.wafregional.inputs.GeoMatchSetState.Builder =
      def argsBuilder = com.pulumi.aws.wafregional.inputs.GeoMatchSetGeoMatchConstraintArgs.builder
      builder.geoMatchConstraints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafregional.inputs.IpSetState.Builder)
    /**
     * @param ipSetDescriptors One or more pairs specifying the IP address type (IPV4 or IPV6) and the IP address range (in CIDR notation) from which web requests originate.
     * @return builder
     */
    inline def ipSetDescriptors(args: Endofunction[com.pulumi.aws.wafregional.inputs.IpSetIpSetDescriptorArgs.Builder]*):
        com.pulumi.aws.wafregional.inputs.IpSetState.Builder =
      def argsBuilder = com.pulumi.aws.wafregional.inputs.IpSetIpSetDescriptorArgs.builder
      builder.ipSetDescriptors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafregional.inputs.RateBasedRuleState.Builder)
    /**
     * @param predicates The objects to include in a rule (documented below).
     * @return builder
     */
    inline def predicates(args: Endofunction[com.pulumi.aws.wafregional.inputs.RateBasedRulePredicateArgs.Builder]*):
        com.pulumi.aws.wafregional.inputs.RateBasedRuleState.Builder =
      def argsBuilder = com.pulumi.aws.wafregional.inputs.RateBasedRulePredicateArgs.builder
      builder.predicates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafregional.inputs.RegexMatchSetRegexMatchTupleArgs.Builder)
    /**
     * @param fieldToMatch The part of a web request that you want to search, such as a specified header or a query string.
     * @return builder
     */
    inline def fieldToMatch(args: Endofunction[com.pulumi.aws.wafregional.inputs.RegexMatchSetRegexMatchTupleFieldToMatchArgs.Builder]):
        com.pulumi.aws.wafregional.inputs.RegexMatchSetRegexMatchTupleArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafregional.inputs.RegexMatchSetRegexMatchTupleFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafregional.inputs.RegexMatchSetState.Builder)
    /**
     * @param regexMatchTuples The regular expression pattern that you want AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search, and other settings. See below.
     * @return builder
     */
    inline def regexMatchTuples(args: Endofunction[com.pulumi.aws.wafregional.inputs.RegexMatchSetRegexMatchTupleArgs.Builder]*):
        com.pulumi.aws.wafregional.inputs.RegexMatchSetState.Builder =
      def argsBuilder = com.pulumi.aws.wafregional.inputs.RegexMatchSetRegexMatchTupleArgs.builder
      builder.regexMatchTuples(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafregional.inputs.RuleGroupActivatedRuleArgs.Builder)
    /**
     * @param action Specifies the action that CloudFront or AWS WAF takes when a web request matches the conditions in the rule.
     * @return builder
     */
    inline def action(args: Endofunction[com.pulumi.aws.wafregional.inputs.RuleGroupActivatedRuleActionArgs.Builder]):
        com.pulumi.aws.wafregional.inputs.RuleGroupActivatedRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafregional.inputs.RuleGroupActivatedRuleActionArgs.builder
      builder.action(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafregional.inputs.RuleGroupState.Builder)
    /**
     * @param activatedRules A list of activated rules, see below
     * @return builder
     */
    inline def activatedRules(args: Endofunction[com.pulumi.aws.wafregional.inputs.RuleGroupActivatedRuleArgs.Builder]*):
        com.pulumi.aws.wafregional.inputs.RuleGroupState.Builder =
      def argsBuilder = com.pulumi.aws.wafregional.inputs.RuleGroupActivatedRuleArgs.builder
      builder.activatedRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafregional.inputs.RuleState.Builder)
    /**
     * @param predicates The objects to include in a rule (documented below).
     * @return builder
     */
    inline def predicates(args: Endofunction[com.pulumi.aws.wafregional.inputs.RulePredicateArgs.Builder]*):
        com.pulumi.aws.wafregional.inputs.RuleState.Builder =
      def argsBuilder = com.pulumi.aws.wafregional.inputs.RulePredicateArgs.builder
      builder.predicates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafregional.inputs.SizeConstraintSetSizeConstraintArgs.Builder)
    /**
     * @param fieldToMatch Specifies where in a web request to look for the size constraint.
     * @return builder
     */
    inline def fieldToMatch(args: Endofunction[com.pulumi.aws.wafregional.inputs.SizeConstraintSetSizeConstraintFieldToMatchArgs.Builder]):
        com.pulumi.aws.wafregional.inputs.SizeConstraintSetSizeConstraintArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafregional.inputs.SizeConstraintSetSizeConstraintFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafregional.inputs.SizeConstraintSetState.Builder)
    /**
     * @param sizeConstraints Specifies the parts of web requests that you want to inspect the size of.
     * @return builder
     */
    inline def sizeConstraints(args: Endofunction[com.pulumi.aws.wafregional.inputs.SizeConstraintSetSizeConstraintArgs.Builder]*):
        com.pulumi.aws.wafregional.inputs.SizeConstraintSetState.Builder =
      def argsBuilder = com.pulumi.aws.wafregional.inputs.SizeConstraintSetSizeConstraintArgs.builder
      builder.sizeConstraints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafregional.inputs.SqlInjectionMatchSetSqlInjectionMatchTupleArgs.Builder)
    /**
     * @param fieldToMatch Specifies where in a web request to look for snippets of malicious SQL code.
     * @return builder
     */
    inline def fieldToMatch(args: Endofunction[com.pulumi.aws.wafregional.inputs.SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatchArgs.Builder]):
        com.pulumi.aws.wafregional.inputs.SqlInjectionMatchSetSqlInjectionMatchTupleArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafregional.inputs.SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafregional.inputs.SqlInjectionMatchSetState.Builder)
    /**
     * @param sqlInjectionMatchTuples The parts of web requests that you want AWS WAF to inspect for malicious SQL code and, if you want AWS WAF to inspect a header, the name of the header.
     * @return builder
     */
    inline def sqlInjectionMatchTuples(args: Endofunction[com.pulumi.aws.wafregional.inputs.SqlInjectionMatchSetSqlInjectionMatchTupleArgs.Builder]*):
        com.pulumi.aws.wafregional.inputs.SqlInjectionMatchSetState.Builder =
      def argsBuilder = com.pulumi.aws.wafregional.inputs.SqlInjectionMatchSetSqlInjectionMatchTupleArgs.builder
      builder.sqlInjectionMatchTuples(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafregional.inputs.WebAclLoggingConfigurationArgs.Builder)
    /**
     * @param redactedFields Configuration block containing parts of the request that you want redacted from the logs. Detailed below.
     * @return builder
     */
    inline def redactedFields(args: Endofunction[com.pulumi.aws.wafregional.inputs.WebAclLoggingConfigurationRedactedFieldsArgs.Builder]):
        com.pulumi.aws.wafregional.inputs.WebAclLoggingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafregional.inputs.WebAclLoggingConfigurationRedactedFieldsArgs.builder
      builder.redactedFields(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafregional.inputs.WebAclLoggingConfigurationRedactedFieldsArgs.Builder)
    /**
     * @param fieldToMatches Set of configuration blocks for fields to redact. Detailed below.
     * @return builder
     */
    inline def fieldToMatches(args: Endofunction[com.pulumi.aws.wafregional.inputs.WebAclLoggingConfigurationRedactedFieldsFieldToMatchArgs.Builder]*):
        com.pulumi.aws.wafregional.inputs.WebAclLoggingConfigurationRedactedFieldsArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafregional.inputs.WebAclLoggingConfigurationRedactedFieldsFieldToMatchArgs.builder
      builder.fieldToMatches(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafregional.inputs.WebAclRuleArgs.Builder)
    /**
     * @param action Configuration block of the action that CloudFront or AWS WAF takes when a web request matches the conditions in the rule.  Not used if `type` is `GROUP`. Detailed below.
     * @return builder
     */
    inline def action(args: Endofunction[com.pulumi.aws.wafregional.inputs.WebAclRuleActionArgs.Builder]):
        com.pulumi.aws.wafregional.inputs.WebAclRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafregional.inputs.WebAclRuleActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param overrideAction Configuration block of the override the action that a group requests CloudFront or AWS WAF takes when a web request matches the conditions in the rule.  Only used if `type` is `GROUP`. Detailed below.
     * @return builder
     */
    inline def overrideAction(args: Endofunction[com.pulumi.aws.wafregional.inputs.WebAclRuleOverrideActionArgs.Builder]):
        com.pulumi.aws.wafregional.inputs.WebAclRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafregional.inputs.WebAclRuleOverrideActionArgs.builder
      builder.overrideAction(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafregional.inputs.WebAclState.Builder)
    /**
     * @param defaultAction The action that you want AWS WAF Regional to take when a request doesn&#39;t match the criteria in any of the rules that are associated with the web ACL.
     * @return builder
     */
    inline def defaultAction(args: Endofunction[com.pulumi.aws.wafregional.inputs.WebAclDefaultActionArgs.Builder]):
        com.pulumi.aws.wafregional.inputs.WebAclState.Builder =
      val argsBuilder = com.pulumi.aws.wafregional.inputs.WebAclDefaultActionArgs.builder
      builder.defaultAction(args(argsBuilder).build)

    /**
     * @param loggingConfiguration Configuration block to enable WAF logging. Detailed below.
     * @return builder
     */
    inline def loggingConfiguration(args: Endofunction[com.pulumi.aws.wafregional.inputs.WebAclLoggingConfigurationArgs.Builder]):
        com.pulumi.aws.wafregional.inputs.WebAclState.Builder =
      val argsBuilder = com.pulumi.aws.wafregional.inputs.WebAclLoggingConfigurationArgs.builder
      builder.loggingConfiguration(args(argsBuilder).build)

    /**
     * @param rules Set of configuration blocks containing rules for the web ACL. Detailed below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.aws.wafregional.inputs.WebAclRuleArgs.Builder]*):
        com.pulumi.aws.wafregional.inputs.WebAclState.Builder =
      def argsBuilder = com.pulumi.aws.wafregional.inputs.WebAclRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafregional.inputs.XssMatchSetState.Builder)
    /**
     * @param xssMatchTuples The parts of web requests that you want to inspect for cross-site scripting attacks.
     * @return builder
     */
    inline def xssMatchTuples(args: Endofunction[com.pulumi.aws.wafregional.inputs.XssMatchSetXssMatchTupleArgs.Builder]*):
        com.pulumi.aws.wafregional.inputs.XssMatchSetState.Builder =
      def argsBuilder = com.pulumi.aws.wafregional.inputs.XssMatchSetXssMatchTupleArgs.builder
      builder.xssMatchTuples(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafregional.inputs.XssMatchSetXssMatchTupleArgs.Builder)
    /**
     * @param fieldToMatch Specifies where in a web request to look for cross-site scripting attacks.
     * @return builder
     */
    inline def fieldToMatch(args: Endofunction[com.pulumi.aws.wafregional.inputs.XssMatchSetXssMatchTupleFieldToMatchArgs.Builder]):
        com.pulumi.aws.wafregional.inputs.XssMatchSetXssMatchTupleArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafregional.inputs.XssMatchSetXssMatchTupleFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)
