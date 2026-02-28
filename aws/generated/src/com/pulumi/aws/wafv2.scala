package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object wafv2:
  /** Creates a WAFv2 Rule Group resource. */
  def RuleGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.wafv2.RuleGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.wafv2.RuleGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.wafv2.RuleGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.wafv2.RuleGroupArgs.Builder)
    /**
     * @param customResponseBodies Defines custom response bodies that can be referenced by `customResponse` actions. See Custom Response Body below for details.
     * @return builder
     */
    def customResponseBodies(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupCustomResponseBodyArgs.Builder]*):
        com.pulumi.aws.wafv2.RuleGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupCustomResponseBodyArgs.builder
      builder.customResponseBodies(args.map(_(argsBuilder).build)*)

    /**
     * @param rules The rule blocks used to identify the web requests that you want to `allow`, `block`, or `count`. See Rules below for details.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleArgs.Builder]*):
        com.pulumi.aws.wafv2.RuleGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

    /**
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
     * @return builder
     */
    def visibilityConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupVisibilityConfigArgs.Builder]):
        com.pulumi.aws.wafv2.RuleGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupVisibilityConfigArgs.builder
      builder.visibilityConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.WebAclArgs.Builder)
    /**
     * @param associationConfig Specifies custom configurations for the associations between the web ACL and protected resources. See `associationConfig` below for details.
     * @return builder
     */
    def associationConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclAssociationConfigArgs.Builder]):
        com.pulumi.aws.wafv2.WebAclArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclAssociationConfigArgs.builder
      builder.associationConfig(args(argsBuilder).build)

    /**
     * @param captchaConfig Specifies how AWS WAF should handle CAPTCHA evaluations on the ACL level (used by [AWS Bot Control](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html)). See `captchaConfig` below for details.
     * @return builder
     */
    def captchaConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclCaptchaConfigArgs.Builder]):
        com.pulumi.aws.wafv2.WebAclArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclCaptchaConfigArgs.builder
      builder.captchaConfig(args(argsBuilder).build)

    /**
     * @param challengeConfig Specifies how AWS WAF should handle Challenge evaluations on the ACL level (used by [AWS Bot Control](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html)). See `challengeConfig` below for details.
     * @return builder
     */
    def challengeConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclChallengeConfigArgs.Builder]):
        com.pulumi.aws.wafv2.WebAclArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclChallengeConfigArgs.builder
      builder.challengeConfig(args(argsBuilder).build)

    /**
     * @param customResponseBodies Defines custom response bodies that can be referenced by `customResponse` actions. See `customResponseBody` below for details.
     * @return builder
     */
    def customResponseBodies(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclCustomResponseBodyArgs.Builder]*):
        com.pulumi.aws.wafv2.WebAclArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclCustomResponseBodyArgs.builder
      builder.customResponseBodies(args.map(_(argsBuilder).build)*)

    /**
     * @param dataProtectionConfig Specifies data protection to apply to the web request data for the web ACL. This is a web ACL level data protection option. See `dataProtectionConfig` below for details.
     * @return builder
     */
    def dataProtectionConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclDataProtectionConfigArgs.Builder]):
        com.pulumi.aws.wafv2.WebAclArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclDataProtectionConfigArgs.builder
      builder.dataProtectionConfig(args(argsBuilder).build)

    /**
     * @param defaultAction Action to perform if none of the `rules` contained in the WebACL match. See `defaultAction` below for details.
     * @return builder
     */
    def defaultAction(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclDefaultActionArgs.Builder]):
        com.pulumi.aws.wafv2.WebAclArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclDefaultActionArgs.builder
      builder.defaultAction(args(argsBuilder).build)

    /**
     * @param rules Rule blocks used to identify the web requests that you want to `allow`, `block`, or `count`. See `rule` below for details.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleArgs.Builder]*):
        com.pulumi.aws.wafv2.WebAclArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

    /**
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample collection. See `visibilityConfig` below for details.
     * @return builder
     */
    def visibilityConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclVisibilityConfigArgs.Builder]):
        com.pulumi.aws.wafv2.WebAclArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclVisibilityConfigArgs.builder
      builder.visibilityConfig(args(argsBuilder).build)

  /** Provides an AWS WAFv2 Regex Pattern Set Resource */
  def RegexPatternSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.wafv2.RegexPatternSetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.wafv2.RegexPatternSetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.wafv2.RegexPatternSet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.wafv2.WebAclLoggingConfigurationArgs.Builder)
    /**
     * @param loggingFilter Configuration block that specifies which web requests are kept in the logs and which are dropped. It allows filtering based on the rule action and the web request labels applied by matching rules during web ACL evaluation. For more details, refer to the Logging Filter section below.
     * @return builder
     */
    def loggingFilter(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationLoggingFilterArgs.Builder]):
        com.pulumi.aws.wafv2.WebAclLoggingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationLoggingFilterArgs.builder
      builder.loggingFilter(args(argsBuilder).build)

    /**
     * @param redactedFields Configuration for parts of the request that you want to keep out of the logs. Up to 100 `redactedFields` blocks are supported. See Redacted Fields below for more details.
     * @return builder
     */
    def redactedFields(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldArgs.Builder]*):
        com.pulumi.aws.wafv2.WebAclLoggingConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldArgs.builder
      builder.redactedFields(args.map(_(argsBuilder).build)*)

  /**
   * Creates a WAFv2 Web ACL resource.
   *  
   *  &gt; **Note** In `fieldToMatch` blocks, *e.g.*, in `byteMatchStatement`, the `body` block includes an optional argument `oversizeHandling`. AWS indicates this argument will be required starting February 2023. To avoid configurations breaking when that change happens, treat the `oversizeHandling` argument as **required** as soon as possible.
   *  
   *  !&gt; **Warning:** If you use the `aws.wafv2.WebAclRuleGroupAssociation` resource to associate rule groups with this Web ACL, you must add `lifecycle { ignoreChanges = [rule] }` to this resource to prevent configuration drift. The association resource modifies the Web ACL&#39;s rules outside of this resource&#39;s direct management.
   *  
   *  ## Import
   *  
   *  Using `pulumi import`, import WAFv2 Web ACLs using `ID/Name/Scope`. For example:
   *  
   *  ```sh
   *  $ pulumi import aws:wafv2/webAcl:WebAcl example a1b2c3d4-d5f6-7777-8888-9999aaaabbbbcccc/example/REGIONAL
   *  ```
   */
  def WebAcl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.wafv2.WebAclArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.wafv2.WebAclArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.wafv2.WebAcl(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Associates a WAFv2 Rule Group (custom or managed) with a Web ACL by adding a rule that references the Rule Group. Use this resource to apply the rules defined in a Rule Group to a Web ACL without duplicating rule definitions.
   *  
   *  This resource supports both:
   *  
   *  - **Custom Rule Groups**: User-created rule groups that you manage within your AWS account
   *  - **Managed Rule Groups**: Pre-configured rule groups provided by AWS or third-party vendors
   *  
   *  !&gt; **Warning:** Verify the rule names in your `ruleActionOverride`s carefully. With managed rule groups, WAF silently ignores any override that uses an invalid rule name. With customer-owned rule groups, invalid rule names in your overrides will cause web ACL updates to fail. An invalid rule name is any name that doesn&#39;t exactly match the case-sensitive name of an existing rule in the rule group.
   *  
   *  !&gt; **Warning:** Using this resource will cause the associated Web ACL resource to show configuration drift in the `rule` argument unless you add `lifecycle { ignoreChanges = [rule] }` to the Web ACL resource configuration. This is because this resource modifies the Web ACL&#39;s rules outside of the Web ACL resource&#39;s direct management.
   *  
   *  &gt; **Note:** This resource creates a rule within the Web ACL that references the entire Rule Group. The rule group&#39;s individual rules are evaluated as a unit when requests are processed by the Web ACL.
   */
  def WebAclRuleGroupAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.wafv2.WebAclRuleGroupAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.wafv2.WebAclRuleGroupAssociationArgs.builder
    
    com.pulumi.aws.wafv2.WebAclRuleGroupAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Creates a WAFv2 Web ACL Association.
   *  
   *  &gt; **NOTE on associating a WAFv2 Web ACL with a Cloudfront distribution:** Do not use this resource to associate a WAFv2 Web ACL with a Cloudfront Distribution. The [AWS API call backing this resource](https://docs.aws.amazon.com/waf/latest/APIReference/API_AssociateWebACL.html) notes that you should use the `webAclId` property on the `cloudfrontDistribution` instead.
   *  
   *  [1]: https://docs.aws.amazon.com/waf/latest/APIReference/API_AssociateWebACL.html
   *  
   *  ## Import
   *  
   *  Using `pulumi import`, import WAFv2 Web ACL Association using `WEB_ACL_ARN,RESOURCE_ARN`. For example:
   *  
   *  ```sh
   *  $ pulumi import aws:wafv2/webAclAssociation:WebAclAssociation example arn:aws:wafv2:...7ce849ea,arn:aws:apigateway:...ages/name
   *  ```
   */
  def WebAclAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.wafv2.WebAclAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.wafv2.WebAclAssociationArgs.builder
    
    com.pulumi.aws.wafv2.WebAclAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an AWS WAFv2 API Key resource. */
  def ApiKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.wafv2.ApiKeyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.wafv2.ApiKeyArgs.builder
    
    com.pulumi.aws.wafv2.ApiKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type Wafv2Functions = com.pulumi.aws.wafv2.Wafv2Functions
  object Wafv2Functions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.wafv2.Wafv2Functions.*
  extension (self: Wafv2Functions.type)
    /** Retrieves the summary of a WAFv2 IP Set. */
    def getIpSet(args: Endofunction[com.pulumi.aws.wafv2.inputs.GetIpSetArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.wafv2.outputs.GetIpSetResult] =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.GetIpSetArgs.builder
      com.pulumi.aws.wafv2.Wafv2Functions.getIpSet(args(argsBuilder).build)

    /** Retrieves the summary of a WAFv2 IP Set. */
    def getIpSetPlain(args: Endofunction[com.pulumi.aws.wafv2.inputs.GetIpSetPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.wafv2.outputs.GetIpSetResult] =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.GetIpSetPlainArgs.builder
      com.pulumi.aws.wafv2.Wafv2Functions.getIpSetPlain(args(argsBuilder).build)

    /** Retrieves the summary of a WAFv2 Regex Pattern Set. */
    def getRegexPatternSet(args: Endofunction[com.pulumi.aws.wafv2.inputs.GetRegexPatternSetArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.wafv2.outputs.GetRegexPatternSetResult] =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.GetRegexPatternSetArgs.builder
      com.pulumi.aws.wafv2.Wafv2Functions.getRegexPatternSet(args(argsBuilder).build)

    /** Retrieves the summary of a WAFv2 Regex Pattern Set. */
    def getRegexPatternSetPlain(args: Endofunction[com.pulumi.aws.wafv2.inputs.GetRegexPatternSetPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.wafv2.outputs.GetRegexPatternSetResult] =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.GetRegexPatternSetPlainArgs.builder
      com.pulumi.aws.wafv2.Wafv2Functions.getRegexPatternSetPlain(args(argsBuilder).build)

    /** Retrieves the summary of a WAFv2 Rule Group. */
    def getRuleGroup(args: Endofunction[com.pulumi.aws.wafv2.inputs.GetRuleGroupArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.wafv2.outputs.GetRuleGroupResult] =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.GetRuleGroupArgs.builder
      com.pulumi.aws.wafv2.Wafv2Functions.getRuleGroup(args(argsBuilder).build)

    /** Retrieves the summary of a WAFv2 Rule Group. */
    def getRuleGroupPlain(args: Endofunction[com.pulumi.aws.wafv2.inputs.GetRuleGroupPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.wafv2.outputs.GetRuleGroupResult] =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.GetRuleGroupPlainArgs.builder
      com.pulumi.aws.wafv2.Wafv2Functions.getRuleGroupPlain(args(argsBuilder).build)

    /** Retrieves the summary of a WAFv2 Web ACL. */
    def getWebAcl(args: Endofunction[com.pulumi.aws.wafv2.inputs.GetWebAclArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.wafv2.outputs.GetWebAclResult] =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.GetWebAclArgs.builder
      com.pulumi.aws.wafv2.Wafv2Functions.getWebAcl(args(argsBuilder).build)

    /** Retrieves the summary of a WAFv2 Web ACL. */
    def getWebAclPlain(args: Endofunction[com.pulumi.aws.wafv2.inputs.GetWebAclPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.wafv2.outputs.GetWebAclResult] =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.GetWebAclPlainArgs.builder
      com.pulumi.aws.wafv2.Wafv2Functions.getWebAclPlain(args(argsBuilder).build)

  /** Provides a WAFv2 IP Set Resource */
  def IpSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.wafv2.IpSetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.wafv2.IpSetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.wafv2.IpSet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * This resource creates a WAFv2 Web ACL Logging Configuration.
   *  
   *  !&gt; **WARNING:** When logging from a WAFv2 Web ACL to a CloudWatch Log Group, the WAFv2 service tries to create or update a generic Log Resource Policy named `AWSWAF-LOGS`. However, if there are a large number of Web ACLs or if the account frequently creates and deletes Web ACLs, this policy may exceed the maximum policy size. As a result, this resource type will fail to be created. More details about this issue can be found in this issue. To prevent this issue, you can manage a specific resource policy. Please refer to the example below for managing a CloudWatch Log Group with a managed CloudWatch Log Resource Policy.
   */
  def WebAclLoggingConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.wafv2.WebAclLoggingConfigurationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.wafv2.WebAclLoggingConfigurationArgs.builder
    
    com.pulumi.aws.wafv2.WebAclLoggingConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.wafv2.WebAclRuleGroupAssociationArgs.Builder)
    /**
     * @param managedRuleGroup Managed Rule Group configuration. One of `ruleGroupReference` or `managedRuleGroup` is required. Conflicts with `ruleGroupReference`. See below.
     * @return builder
     */
    def managedRuleGroup(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupArgs.Builder]):
        com.pulumi.aws.wafv2.WebAclRuleGroupAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupArgs.builder
      builder.managedRuleGroup(args(argsBuilder).build)

    /**
     * @param ruleGroupReference Custom Rule Group reference configuration. One of `ruleGroupReference` or `managedRuleGroup` is required. Conflicts with `managedRuleGroup`. See below.
     * @return builder
     */
    def ruleGroupReference(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceArgs.Builder]):
        com.pulumi.aws.wafv2.WebAclRuleGroupAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceArgs.builder
      builder.ruleGroupReference(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.wafv2.WebAclRuleGroupAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.RegexPatternSetArgs.Builder)
    /**
     * @param regularExpressions One or more blocks of regular expression patterns that you want AWS WAF to search for, such as `B[a{@literal @}]dB[o0]t`. See Regular Expression below for details.
     * @return builder
     */
    def regularExpressions(args: Endofunction[com.pulumi.aws.wafv2.inputs.RegexPatternSetRegularExpressionArgs.Builder]*):
        com.pulumi.aws.wafv2.RegexPatternSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RegexPatternSetRegularExpressionArgs.builder
      builder.regularExpressions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchCookiesArgs.Builder)
    /**
     * @param matchPatterns The filter to use to identify the subset of cookies to inspect in a web request. You must specify exactly one setting: either `all`, `includedCookies` or `excludedCookies`. More details: [CookieMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_CookieMatchPattern.html)
     * @return builder
     */
    def matchPatterns(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchCookiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternArgs.builder
      builder.matchPatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchCookiesArgs.Builder)
    /**
     * @param matchPatterns The filter to use to identify the subset of cookies to inspect in a web request. You must specify exactly one setting: either `all`, `includedCookies` or `excludedCookies`. More details: [CookieMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_CookieMatchPattern.html)
     * @return builder
     */
    def matchPatterns(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchCookiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchCookiesMatchPatternArgs.builder
      builder.matchPatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchHeaderArgs.Builder)
    /**
     * @param matchPattern The filter to use to identify the subset of headers to inspect in a web request. The `matchPattern` block supports only one of the following arguments:
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchHeaderArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchHeaderMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementArgs.Builder)
    /**
     * @param fieldToMatch Part of a web request that you want AWS WAF to inspect. See `fieldToMatch` below for details.
     * @return builder
     */
    def fieldToMatch(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. At least one transformation is required. See `textTransformation` below for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseAllowCustomRequestHandlingArgs.Builder)
    /**
     * @param insertHeaders The `insertHeader` blocks used to define HTTP headers added to the request. See `insertHeader` below for details.
     * @return builder
     */
    def insertHeaders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseAllowCustomRequestHandlingInsertHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseAllowCustomRequestHandlingArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseAllowCustomRequestHandlingInsertHeaderArgs.builder
      builder.insertHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionCaptchaArgs.Builder)
    /**
     * @param customRequestHandling Defines custom handling for the web request. See Custom Request Handling below for details.
     * @return builder
     */
    def customRequestHandling(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionCaptchaCustomRequestHandlingArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionCaptchaArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionCaptchaCustomRequestHandlingArgs.builder
      builder.customRequestHandling(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyArgs.Builder)
    /**
     * @param matchPattern The patterns to look for in the JSON body. You must specify exactly one setting: either `all` or `includedPaths`. See [JsonMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_JsonMatchPattern.html) for details.
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchCookiesArgs.Builder)
    /**
     * @param matchPatterns The filter to use to identify the subset of cookies to inspect in a web request. You must specify exactly one setting: either `all`, `includedCookies` or `excludedCookies`. More details: [CookieMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_CookieMatchPattern.html)
     * @return builder
     */
    def matchPatterns(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchCookiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchCookiesMatchPatternArgs.builder
      builder.matchPatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementArgs.Builder)
    /**
     * @param fieldToMatch The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * @return builder
     */
    def fieldToMatch(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
     *  At least one required.
     *  See Text Transformation below for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAntiDdosRuleSetClientSideActionConfigArgs.Builder)
    /**
     * @param challenge Configuration for the use of the `AWSManagedRulesAntiDDoSRuleSet` rules `ChallengeAllDuringEvent` and `ChallengeDDoSRequests`.
     * @return builder
     */
    def challenge(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAntiDdosRuleSetClientSideActionConfigChallengeArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAntiDdosRuleSetClientSideActionConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAntiDdosRuleSetClientSideActionConfigChallengeArgs.builder
      builder.challenge(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleActionAllowCustomRequestHandlingArgs.Builder)
    /**
     * @param insertHeaders The `insertHeader` blocks used to define HTTP headers added to the request. See `insertHeader` below for details.
     * @return builder
     */
    def insertHeaders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleActionAllowCustomRequestHandlingInsertHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleActionAllowCustomRequestHandlingArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleActionAllowCustomRequestHandlingInsertHeaderArgs.builder
      builder.insertHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleActionChallengeCustomRequestHandlingArgs.Builder)
    /**
     * @param insertHeaders The `insertHeader` blocks used to define HTTP headers added to the request. See `insertHeader` below for details.
     * @return builder
     */
    def insertHeaders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleActionChallengeCustomRequestHandlingInsertHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleActionChallengeCustomRequestHandlingArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleActionChallengeCustomRequestHandlingInsertHeaderArgs.builder
      builder.insertHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchJsonBodyArgs.Builder)
    /**
     * @param matchPattern The patterns to look for in the JSON body. You must specify exactly one setting: either `all` or `includedPaths`. See [JsonMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_JsonMatchPattern.html) for details.
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchJsonBodyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementArgs.Builder)
    /**
     * @param fieldToMatch Part of a web request that you want AWS WAF to inspect. See `fieldToMatch` below for details.
     * @return builder
     */
    def fieldToMatch(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. At least one transformation is required. See `textTransformation` below for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationLoggingFilterArgs.Builder)
    /**
     * @param filters Filter(s) that you want to apply to the logs. See Filter below for more details.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationLoggingFilterFilterArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationLoggingFilterArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationLoggingFilterFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCaptchaArgs.Builder)
    /**
     * @param customRequestHandling Defines custom handling for the web request. See `customRequestHandling` below for details.
     * @return builder
     */
    def customRequestHandling(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCaptchaCustomRequestHandlingArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCaptchaArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCaptchaCustomRequestHandlingArgs.builder
      builder.customRequestHandling(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementArgs.Builder)
    /**
     * @param fieldToMatch Part of a web request that you want AWS WAF to inspect. See `fieldToMatch` below for details.
     * @return builder
     */
    def fieldToMatch(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. At least one transformation is required. See `textTransformation` below for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementAndStatementArgs.Builder)
    /**
     * @param statements The statements to combine.
     * @return builder
     */
    def statements(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementAndStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementArgs.builder
      builder.statements(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseChallengeCustomRequestHandlingArgs.Builder)
    /**
     * @param insertHeaders Headers to insert into the request. See below.
     * @return builder
     */
    def insertHeaders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseChallengeCustomRequestHandlingInsertHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseChallengeCustomRequestHandlingArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseChallengeCustomRequestHandlingInsertHeaderArgs.builder
      builder.insertHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchJsonBodyArgs.Builder)
    /**
     * @param matchPattern The patterns to look for in the JSON body. You must specify exactly one setting: either `all` or `includedPaths`. See [JsonMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_JsonMatchPattern.html) for details.
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchJsonBodyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchJsonBodyMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchCookiesArgs.Builder)
    /**
     * @param matchPatterns The filter to use to identify the subset of cookies to inspect in a web request. You must specify exactly one setting: either `all`, `includedCookies` or `excludedCookies`. More details: [CookieMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_CookieMatchPattern.html)
     * @return builder
     */
    def matchPatterns(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchCookiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchCookiesMatchPatternArgs.builder
      builder.matchPatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclDefaultActionArgs.Builder)
    /**
     * @param allow Specifies that AWS WAF should allow requests by default. See `allow` below for details.
     * @return builder
     */
    def allow(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclDefaultActionAllowArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclDefaultActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclDefaultActionAllowArgs.builder
      builder.allow(args(argsBuilder).build)

    /**
     * @param block Specifies that AWS WAF should block requests by default. See `block` below for details.
     * @return builder
     */
    def block(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclDefaultActionBlockArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclDefaultActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclDefaultActionBlockArgs.builder
      builder.block(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleActionBlockArgs.Builder)
    /**
     * @param customResponse Defines a custom response for the web request. See `customResponse` below for details.
     * @return builder
     */
    def customResponse(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleActionBlockCustomResponseArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleActionBlockArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleActionBlockCustomResponseArgs.builder
      builder.customResponse(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchJsonBodyArgs.Builder)
    /**
     * @param matchPattern The patterns to look for in the JSON body. You must specify exactly one setting: either `all` or `includedPaths`. See [JsonMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_JsonMatchPattern.html) for details.
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchJsonBodyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder)
    /**
     * @param allQueryArguments Inspect all query arguments.
     * @return builder
     */
    def allQueryArguments(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs.builder
      builder.allQueryArguments(args(argsBuilder).build)

    /**
     * @param body Inspect the request body, which immediately follows the request headers. See `body` below for details.
     * @return builder
     */
    def body(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchBodyArgs.builder
      builder.body(args(argsBuilder).build)

    /**
     * @param cookies Inspect the cookies in the web request. See `cookies` below for details.
     * @return builder
     */
    def cookies(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchCookiesArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchCookiesArgs.builder
      builder.cookies(args(argsBuilder).build)

    /**
     * @param headerOrders Inspect a string containing the list of the request&#39;s header names, ordered as they appear in the web request that AWS WAF receives for inspection. See `headerOrder` below for details.
     * @return builder
     */
    def headerOrders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchHeaderOrderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchHeaderOrderArgs.builder
      builder.headerOrders(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Inspect the request headers. See `headers` below for details.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param ja3Fingerprint Inspect the JA3 fingerprint. See `ja3Fingerprint` below for details.
     * @return builder
     */
    def ja3Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchJa3FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchJa3FingerprintArgs.builder
      builder.ja3Fingerprint(args(argsBuilder).build)

    /**
     * @param ja4Fingerprint Inspect the JA3 fingerprint. See `ja4Fingerprint` below for details.
     * @return builder
     */
    def ja4Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchJa4FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchJa4FingerprintArgs.builder
      builder.ja4Fingerprint(args(argsBuilder).build)

    /**
     * @param jsonBody Inspect the request body as JSON. See `jsonBody` for details.
     * @return builder
     */
    def jsonBody(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchJsonBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchJsonBodyArgs.builder
      builder.jsonBody(args(argsBuilder).build)

    /**
     * @param method Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * @return builder
     */
    def method(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchMethodArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchMethodArgs.builder
      builder.method(args(argsBuilder).build)

    /**
     * @param queryString Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * @return builder
     */
    def queryString(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchQueryStringArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchQueryStringArgs.builder
      builder.queryString(args(argsBuilder).build)

    /**
     * @param singleHeader Inspect a single header. See `singleHeader` below for details.
     * @return builder
     */
    def singleHeader(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchSingleHeaderArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchSingleHeaderArgs.builder
      builder.singleHeader(args(argsBuilder).build)

    /**
     * @param singleQueryArgument Inspect a single query argument. See `singleQueryArgument` below for details.
     * @return builder
     */
    def singleQueryArgument(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs.builder
      builder.singleQueryArgument(args(argsBuilder).build)

    /**
     * @param uriFragment Inspect the part of a URL that follows the &#34;#&#34; symbol, providing additional information about the resource. See `uriFragment` below for details.
     * @return builder
     */
    def uriFragment(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchUriFragmentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchUriFragmentArgs.builder
      builder.uriFragment(args(argsBuilder).build)

    /**
     * @param uriPath Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * @return builder
     */
    def uriPath(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchUriPathArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchUriPathArgs.builder
      builder.uriPath(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchCookiesMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchCookiesMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldArgs.Builder)
    /**
     * @param method HTTP method to be redacted. It must be specified as an empty configuration block `{}`. The method indicates the type of operation that the request is asking the origin to perform.
     * @return builder
     */
    def method(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldMethodArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldMethodArgs.builder
      builder.method(args(argsBuilder).build)

    /**
     * @param queryString Whether to redact the query string. It must be specified as an empty configuration block `{}`. The query string is the part of a URL that appears after a `?` character, if any.
     * @return builder
     */
    def queryString(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldQueryStringArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldQueryStringArgs.builder
      builder.queryString(args(argsBuilder).build)

    /**
     * @param singleHeader &#34;singleHeader&#34; refers to the redaction of a single header. For more information, please see the details below under Single Header.
     * @return builder
     */
    def singleHeader(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldSingleHeaderArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldSingleHeaderArgs.builder
      builder.singleHeader(args(argsBuilder).build)

    /**
     * @param uriPath Configuration block that redacts the request URI path. It should be specified as an empty configuration block `{}`. The URI path is the part of a web request that identifies a resource, such as `/images/daily-ad.jpg`.
     * @return builder
     */
    def uriPath(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldUriPathArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldUriPathArgs.builder
      builder.uriPath(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchJsonBodyArgs.Builder)
    /**
     * @param matchPattern The patterns to look for in the JSON body. You must specify exactly one setting: either `all` or `includedPaths`. See [JsonMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_JsonMatchPattern.html) for details.
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchJsonBodyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchJsonBodyMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchCookiesMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchCookiesMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementArgs.Builder)
    /**
     * @param fieldToMatch The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * @return builder
     */
    def fieldToMatch(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
     *  At least one required.
     *  See Text Transformation below for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAntiDdosRuleSetClientSideActionConfigChallengeArgs.Builder)
    /**
     * @param exemptUriRegularExpressions Block for the list of the regular expressions to match against the web request URI, used to identify requests that can&#39;t handle a silent browser challenge.
     * @return builder
     */
    def exemptUriRegularExpressions(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAntiDdosRuleSetClientSideActionConfigChallengeExemptUriRegularExpressionArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAntiDdosRuleSetClientSideActionConfigChallengeArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAntiDdosRuleSetClientSideActionConfigChallengeExemptUriRegularExpressionArgs.builder
      builder.exemptUriRegularExpressions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchCookiesMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchCookiesMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchArgs.Builder)
    /**
     * @param allQueryArguments Inspect all query arguments.
     * @return builder
     */
    def allQueryArguments(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs.builder
      builder.allQueryArguments(args(argsBuilder).build)

    /**
     * @param body Inspect the request body, which immediately follows the request headers. See `body` below for details.
     * @return builder
     */
    def body(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchBodyArgs.builder
      builder.body(args(argsBuilder).build)

    /**
     * @param cookies Inspect the cookies in the web request. See `cookies` below for details.
     * @return builder
     */
    def cookies(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchCookiesArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchCookiesArgs.builder
      builder.cookies(args(argsBuilder).build)

    /**
     * @param headerOrders Inspect a string containing the list of the request&#39;s header names, ordered as they appear in the web request that AWS WAF receives for inspection. See `headerOrder` below for details.
     * @return builder
     */
    def headerOrders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchHeaderOrderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchHeaderOrderArgs.builder
      builder.headerOrders(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Inspect the request headers. See `headers` below for details.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param ja3Fingerprint Inspect the JA3 fingerprint. See `ja3Fingerprint` below for details.
     * @return builder
     */
    def ja3Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchJa3FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchJa3FingerprintArgs.builder
      builder.ja3Fingerprint(args(argsBuilder).build)

    /**
     * @param ja4Fingerprint Inspect the JA3 fingerprint. See `ja4Fingerprint` below for details.
     * @return builder
     */
    def ja4Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchJa4FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchJa4FingerprintArgs.builder
      builder.ja4Fingerprint(args(argsBuilder).build)

    /**
     * @param jsonBody Inspect the request body as JSON. See `jsonBody` for details.
     * @return builder
     */
    def jsonBody(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchJsonBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchJsonBodyArgs.builder
      builder.jsonBody(args(argsBuilder).build)

    /**
     * @param method Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * @return builder
     */
    def method(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchMethodArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchMethodArgs.builder
      builder.method(args(argsBuilder).build)

    /**
     * @param queryString Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * @return builder
     */
    def queryString(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchQueryStringArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchQueryStringArgs.builder
      builder.queryString(args(argsBuilder).build)

    /**
     * @param singleHeader Inspect a single header. See `singleHeader` below for details.
     * @return builder
     */
    def singleHeader(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchSingleHeaderArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchSingleHeaderArgs.builder
      builder.singleHeader(args(argsBuilder).build)

    /**
     * @param singleQueryArgument Inspect a single query argument. See `singleQueryArgument` below for details.
     * @return builder
     */
    def singleQueryArgument(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs.builder
      builder.singleQueryArgument(args(argsBuilder).build)

    /**
     * @param uriFragment Inspect the part of a URL that follows the &#34;#&#34; symbol, providing additional information about the resource. See `uriFragment` below for details.
     * @return builder
     */
    def uriFragment(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchUriFragmentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchUriFragmentArgs.builder
      builder.uriFragment(args(argsBuilder).build)

    /**
     * @param uriPath Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * @return builder
     */
    def uriPath(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchUriPathArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchUriPathArgs.builder
      builder.uriPath(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchHeaderMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchHeaderMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchCookiesArgs.Builder)
    /**
     * @param matchPatterns The filter to use to identify the subset of cookies to inspect in a web request. You must specify exactly one setting: either `all`, `includedCookies` or `excludedCookies`. More details: [CookieMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_CookieMatchPattern.html)
     * @return builder
     */
    def matchPatterns(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchCookiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchCookiesMatchPatternArgs.builder
      builder.matchPatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchCookiesArgs.Builder)
    /**
     * @param matchPatterns The filter to use to identify the subset of cookies to inspect in a web request. You must specify exactly one setting: either `all`, `includedCookies` or `excludedCookies`. More details: [CookieMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_CookieMatchPattern.html)
     * @return builder
     */
    def matchPatterns(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchCookiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchCookiesMatchPatternArgs.builder
      builder.matchPatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementAsnMatchStatementArgs.Builder)
    /**
     * @param forwardedIpConfig Configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that&#39;s reported by the web request origin. See `forwardedIpConfig` below for more details.
     * @return builder
     */
    def forwardedIpConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementAsnMatchStatementForwardedIpConfigArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementAsnMatchStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementAsnMatchStatementForwardedIpConfigArgs.builder
      builder.forwardedIpConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseBlockCustomResponseArgs.Builder)
    /**
     * @param responseHeaders The `responseHeader` blocks used to define the HTTP response headers added to the response. See `responseHeader` below for details.
     * @return builder
     */
    def responseHeaders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseBlockCustomResponseResponseHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseBlockCustomResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseBlockCustomResponseResponseHeaderArgs.builder
      builder.responseHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder)
    /**
     * @param allQueryArguments Inspect all query arguments.
     * @return builder
     */
    def allQueryArguments(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs.builder
      builder.allQueryArguments(args(argsBuilder).build)

    /**
     * @param body Inspect the request body, which immediately follows the request headers. See `body` below for details.
     * @return builder
     */
    def body(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchBodyArgs.builder
      builder.body(args(argsBuilder).build)

    /**
     * @param cookies Inspect the cookies in the web request. See `cookies` below for details.
     * @return builder
     */
    def cookies(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchCookiesArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchCookiesArgs.builder
      builder.cookies(args(argsBuilder).build)

    /**
     * @param headerOrders Inspect a string containing the list of the request&#39;s header names, ordered as they appear in the web request that AWS WAF receives for inspection. See `headerOrder` below for details.
     * @return builder
     */
    def headerOrders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchHeaderOrderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchHeaderOrderArgs.builder
      builder.headerOrders(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Inspect the request headers. See `headers` below for details.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param ja3Fingerprint Inspect the JA3 fingerprint. See `ja3Fingerprint` below for details.
     * @return builder
     */
    def ja3Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchJa3FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchJa3FingerprintArgs.builder
      builder.ja3Fingerprint(args(argsBuilder).build)

    /**
     * @param ja4Fingerprint Inspect the JA3 fingerprint. See `ja4Fingerprint` below for details.
     * @return builder
     */
    def ja4Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchJa4FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchJa4FingerprintArgs.builder
      builder.ja4Fingerprint(args(argsBuilder).build)

    /**
     * @param jsonBody Inspect the request body as JSON. See `jsonBody` for details.
     * @return builder
     */
    def jsonBody(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchJsonBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchJsonBodyArgs.builder
      builder.jsonBody(args(argsBuilder).build)

    /**
     * @param method Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * @return builder
     */
    def method(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchMethodArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchMethodArgs.builder
      builder.method(args(argsBuilder).build)

    /**
     * @param queryString Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * @return builder
     */
    def queryString(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchQueryStringArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchQueryStringArgs.builder
      builder.queryString(args(argsBuilder).build)

    /**
     * @param singleHeader Inspect a single header. See `singleHeader` below for details.
     * @return builder
     */
    def singleHeader(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchSingleHeaderArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchSingleHeaderArgs.builder
      builder.singleHeader(args(argsBuilder).build)

    /**
     * @param singleQueryArgument Inspect a single query argument. See `singleQueryArgument` below for details.
     * @return builder
     */
    def singleQueryArgument(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs.builder
      builder.singleQueryArgument(args(argsBuilder).build)

    /**
     * @param uriFragment Inspect the part of a URL that follows the &#34;#&#34; symbol, providing additional information about the resource. See `uriFragment` below for details.
     * @return builder
     */
    def uriFragment(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchUriFragmentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchUriFragmentArgs.builder
      builder.uriFragment(args(argsBuilder).build)

    /**
     * @param uriPath Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * @return builder
     */
    def uriPath(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchUriPathArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchUriPathArgs.builder
      builder.uriPath(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementArgs.Builder)
    /**
     * @param customKeys Aggregate the request counts using one or more web request components as the aggregate keys. See `customKey` below for details.
     * @return builder
     */
    def customKeys(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyArgs.builder
      builder.customKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param forwardedIpConfig The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that&#39;s reported by the web request origin. If `aggregateKeyType` is set to `FORWARDED_IP`, this block is required. See Forwarded IP Config below for details.
     * @return builder
     */
    def forwardedIpConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementForwardedIpConfigArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementForwardedIpConfigArgs.builder
      builder.forwardedIpConfig(args(argsBuilder).build)

    /**
     * @param scopeDownStatement An optional nested statement that narrows the scope of the rate-based statement to matching web requests. This can be any nestable statement, and you can nest statements at any level below this scope-down statement. See Statement above for details. If `aggregateKeyType` is set to `CONSTANT`, this block is required.
     * @return builder
     */
    def scopeDownStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementArgs.builder
      builder.scopeDownStatement(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseBlockArgs.Builder)
    /**
     * @param customResponse Custom response for blocked requests. See below.
     * @return builder
     */
    def customResponse(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseBlockCustomResponseArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseBlockArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseBlockCustomResponseArgs.builder
      builder.customResponse(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchArgs.Builder)
    /**
     * @param allQueryArguments Inspect all query arguments.
     * @return builder
     */
    def allQueryArguments(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchAllQueryArgumentsArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchAllQueryArgumentsArgs.builder
      builder.allQueryArguments(args(argsBuilder).build)

    /**
     * @param body Inspect the request body, which immediately follows the request headers. See `body` below for details.
     * @return builder
     */
    def body(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchBodyArgs.builder
      builder.body(args(argsBuilder).build)

    /**
     * @param cookies Inspect the cookies in the web request. See `cookies` below for details.
     * @return builder
     */
    def cookies(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchCookiesArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchCookiesArgs.builder
      builder.cookies(args(argsBuilder).build)

    /**
     * @param headerOrders Inspect a string containing the list of the request&#39;s header names, ordered as they appear in the web request that AWS WAF receives for inspection. See `headerOrder` below for details.
     * @return builder
     */
    def headerOrders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchHeaderOrderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchHeaderOrderArgs.builder
      builder.headerOrders(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Inspect the request headers. See `headers` below for details.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param ja3Fingerprint Inspect the JA3 fingerprint. See `ja3Fingerprint` below for details.
     * @return builder
     */
    def ja3Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchJa3FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchJa3FingerprintArgs.builder
      builder.ja3Fingerprint(args(argsBuilder).build)

    /**
     * @param ja4Fingerprint Inspect the JA3 fingerprint. See `ja4Fingerprint` below for details.
     * @return builder
     */
    def ja4Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchJa4FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchJa4FingerprintArgs.builder
      builder.ja4Fingerprint(args(argsBuilder).build)

    /**
     * @param jsonBody Inspect the request body as JSON. See `jsonBody` for details.
     * @return builder
     */
    def jsonBody(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchJsonBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchJsonBodyArgs.builder
      builder.jsonBody(args(argsBuilder).build)

    /**
     * @param method Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * @return builder
     */
    def method(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchMethodArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchMethodArgs.builder
      builder.method(args(argsBuilder).build)

    /**
     * @param queryString Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * @return builder
     */
    def queryString(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchQueryStringArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchQueryStringArgs.builder
      builder.queryString(args(argsBuilder).build)

    /**
     * @param singleHeader Inspect a single header. See `singleHeader` below for details.
     * @return builder
     */
    def singleHeader(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchSingleHeaderArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchSingleHeaderArgs.builder
      builder.singleHeader(args(argsBuilder).build)

    /**
     * @param singleQueryArgument Inspect a single query argument. See `singleQueryArgument` below for details.
     * @return builder
     */
    def singleQueryArgument(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchSingleQueryArgumentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchSingleQueryArgumentArgs.builder
      builder.singleQueryArgument(args(argsBuilder).build)

    /**
     * @param uriFragment Inspect the part of a URL that follows the &#34;#&#34; symbol, providing additional information about the resource. See `uriFragment` below for details.
     * @return builder
     */
    def uriFragment(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchUriFragmentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchUriFragmentArgs.builder
      builder.uriFragment(args(argsBuilder).build)

    /**
     * @param uriPath Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * @return builder
     */
    def uriPath(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchUriPathArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchUriPathArgs.builder
      builder.uriPath(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchCookiesArgs.Builder)
    /**
     * @param matchPatterns The filter to use to identify the subset of cookies to inspect in a web request. You must specify exactly one setting: either `all`, `includedCookies` or `excludedCookies`. More details: [CookieMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_CookieMatchPattern.html)
     * @return builder
     */
    def matchPatterns(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchCookiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchCookiesMatchPatternArgs.builder
      builder.matchPatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementGeoMatchStatementArgs.Builder)
    /**
     * @param forwardedIpConfig The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that&#39;s reported by the web request origin. See Forwarded IP Config below for details.
     * @return builder
     */
    def forwardedIpConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementGeoMatchStatementForwardedIpConfigArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementGeoMatchStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementGeoMatchStatementForwardedIpConfigArgs.builder
      builder.forwardedIpConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementIpSetReferenceStatementArgs.Builder)
    /**
     * @param ipSetForwardedIpConfig Configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that&#39;s reported by the web request origin. See `ipSetForwardedIpConfig` below for more details.
     * @return builder
     */
    def ipSetForwardedIpConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementIpSetReferenceStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs.builder
      builder.ipSetForwardedIpConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchHeaderArgs.Builder)
    /**
     * @param matchPattern The filter to use to identify the subset of headers to inspect in a web request. The `matchPattern` block supports only one of the following arguments:
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchHeaderArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchHeaderMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementArgs.Builder)
    /**
     * @param fieldToMatch Part of a web request that you want AWS WAF to inspect. See `fieldToMatch` below for details.
     * @return builder
     */
    def fieldToMatch(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. At least one transformation is required. See `textTransformation` below for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseCaptchaArgs.Builder)
    /**
     * @param customRequestHandling Defines custom handling for the web request. See `customRequestHandling` below for details.
     * @return builder
     */
    def customRequestHandling(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseCaptchaCustomRequestHandlingArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseCaptchaArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseCaptchaCustomRequestHandlingArgs.builder
      builder.customRequestHandling(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyQueryArgumentArgs.Builder)
    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. They are used in rate-based rule statements, to transform request components before using them as custom aggregation keys. Atleast one transformation is required. See `textTransformation` above for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyQueryArgumentTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyQueryArgumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyQueryArgumentTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchCookiesArgs.Builder)
    /**
     * @param matchPatterns The filter to use to identify the subset of cookies to inspect in a web request. You must specify exactly one setting: either `all`, `includedCookies` or `excludedCookies`. More details: [CookieMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_CookieMatchPattern.html)
     * @return builder
     */
    def matchPatterns(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchCookiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternArgs.builder
      builder.matchPatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseArgs.Builder)
    def allow(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseAllowArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseAllowArgs.builder
      builder.allow(args(argsBuilder).build)

    def block(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseBlockArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseBlockArgs.builder
      builder.block(args(argsBuilder).build)

    /**
     * @param captcha Instructs AWS WAF to run a Captcha check against the web request. See `captcha` below for details.
     * @return builder
     */
    def captcha(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCaptchaArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCaptchaArgs.builder
      builder.captcha(args(argsBuilder).build)

    def challenge(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseChallengeArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseChallengeArgs.builder
      builder.challenge(args(argsBuilder).build)

    def count(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCountArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCountArgs.builder
      builder.count(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleArgs.Builder)
    /**
     * @param action The action that AWS WAF should take on a web request when it matches the rule&#39;s statement. Settings at the `aws.wafv2.WebAcl` level can override the rule action setting. See Action below for details.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param captchaConfig Specifies how AWS WAF should handle CAPTCHA evaluations. See Captcha Configuration below for details.
     * @return builder
     */
    def captchaConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleCaptchaConfigArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleCaptchaConfigArgs.builder
      builder.captchaConfig(args(argsBuilder).build)

    /**
     * @param ruleLabels Labels to apply to web requests that match the rule match statement. See Rule Label below for details.
     * @return builder
     */
    def ruleLabels(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleRuleLabelArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleRuleLabelArgs.builder
      builder.ruleLabels(args.map(_(argsBuilder).build)*)

    /**
     * @param statement The AWS WAF processing statement for the rule, for example `byteMatchStatement` or `geoMatchStatement`. See Statement below for details.
     * @return builder
     */
    def statement(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementArgs.builder
      builder.statement(args(argsBuilder).build)

    /**
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
     * @return builder
     */
    def visibilityConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleVisibilityConfigArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleVisibilityConfigArgs.builder
      builder.visibilityConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigArgs.Builder)
    /**
     * @param awsManagedRulesAcfpRuleSet Additional configuration for using the Account Creation Fraud Prevention managed rule group. Use this to specify information such as the registration page of your application and the type of content to accept or reject from the client.
     * @return builder
     */
    def awsManagedRulesAcfpRuleSet(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetArgs.builder
      builder.awsManagedRulesAcfpRuleSet(args(argsBuilder).build)

    /**
     * @param awsManagedRulesAntiDdosRuleSet Configuration for using the anti-DDoS managed rule group. See `awsManagedRulesAntiDdosRuleSet` for more details.
     * @return builder
     */
    def awsManagedRulesAntiDdosRuleSet(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAntiDdosRuleSetArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAntiDdosRuleSetArgs.builder
      builder.awsManagedRulesAntiDdosRuleSet(args(argsBuilder).build)

    /**
     * @param awsManagedRulesAtpRuleSet Additional configuration for using the Account Takeover Protection managed rule group. Use this to specify information such as the sign-in page of your application and the type of content to accept or reject from the client.
     * @return builder
     */
    def awsManagedRulesAtpRuleSet(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetArgs.builder
      builder.awsManagedRulesAtpRuleSet(args(argsBuilder).build)

    /**
     * @param awsManagedRulesBotControlRuleSet Additional configuration for using the Bot Control managed rule group. Use this to specify the inspection level that you want to use. See `awsManagedRulesBotControlRuleSet` for more details
     * @return builder
     */
    def awsManagedRulesBotControlRuleSet(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesBotControlRuleSetArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesBotControlRuleSetArgs.builder
      builder.awsManagedRulesBotControlRuleSet(args(argsBuilder).build)

    /**
     * @param passwordField Details about your login page password field. See `passwordField` for more details.
     * @return builder
     */
    def passwordField(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigPasswordFieldArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigPasswordFieldArgs.builder
      builder.passwordField(args(argsBuilder).build)

    /**
     * @param usernameField Details about your login page username field. See `usernameField` for more details.
     * @return builder
     */
    def usernameField(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigUsernameFieldArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigUsernameFieldArgs.builder
      builder.usernameField(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementArgs.Builder)
    /**
     * @param fieldToMatch The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * @return builder
     */
    def fieldToMatch(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
     *  At least one required.
     *  See Text Transformation below for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleActionCaptchaArgs.Builder)
    /**
     * @param customRequestHandling Defines custom handling for the web request. See `customRequestHandling` below for details.
     * @return builder
     */
    def customRequestHandling(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleActionCaptchaCustomRequestHandlingArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleActionCaptchaArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleActionCaptchaCustomRequestHandlingArgs.builder
      builder.customRequestHandling(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchHeaderMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchHeaderMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseBlockArgs.Builder)
    /**
     * @param customResponse Defines a custom response for the web request. See `customResponse` below for details.
     * @return builder
     */
    def customResponse(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseBlockCustomResponseArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseBlockArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseBlockCustomResponseArgs.builder
      builder.customResponse(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclChallengeConfigArgs.Builder)
    /**
     * @param immunityTimeProperty Defines custom immunity time. See `immunityTimeProperty` below for details.
     * @return builder
     */
    def immunityTimeProperty(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclChallengeConfigImmunityTimePropertyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclChallengeConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclChallengeConfigImmunityTimePropertyArgs.builder
      builder.immunityTimeProperty(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleActionCaptchaCustomRequestHandlingArgs.Builder)
    /**
     * @param insertHeaders The `insertHeader` blocks used to define HTTP headers added to the request. See `insertHeader` below for details.
     * @return builder
     */
    def insertHeaders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleActionCaptchaCustomRequestHandlingInsertHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleActionCaptchaCustomRequestHandlingArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleActionCaptchaCustomRequestHandlingInsertHeaderArgs.builder
      builder.insertHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchArgs.Builder)
    /**
     * @param allQueryArguments Inspect all query arguments.
     * @return builder
     */
    def allQueryArguments(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs.builder
      builder.allQueryArguments(args(argsBuilder).build)

    /**
     * @param body Inspect the request body, which immediately follows the request headers. See `body` below for details.
     * @return builder
     */
    def body(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchBodyArgs.builder
      builder.body(args(argsBuilder).build)

    /**
     * @param cookies Inspect the cookies in the web request. See `cookies` below for details.
     * @return builder
     */
    def cookies(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchCookiesArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchCookiesArgs.builder
      builder.cookies(args(argsBuilder).build)

    /**
     * @param headerOrders Inspect a string containing the list of the request&#39;s header names, ordered as they appear in the web request that AWS WAF receives for inspection. See `headerOrder` below for details.
     * @return builder
     */
    def headerOrders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchHeaderOrderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchHeaderOrderArgs.builder
      builder.headerOrders(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Inspect the request headers. See `headers` below for details.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param ja3Fingerprint Inspect the JA3 fingerprint. See `ja3Fingerprint` below for details.
     * @return builder
     */
    def ja3Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchJa3FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchJa3FingerprintArgs.builder
      builder.ja3Fingerprint(args(argsBuilder).build)

    /**
     * @param ja4Fingerprint Inspect the JA3 fingerprint. See `ja4Fingerprint` below for details.
     * @return builder
     */
    def ja4Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchJa4FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchJa4FingerprintArgs.builder
      builder.ja4Fingerprint(args(argsBuilder).build)

    /**
     * @param jsonBody Inspect the request body as JSON. See `jsonBody` for details.
     * @return builder
     */
    def jsonBody(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchJsonBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchJsonBodyArgs.builder
      builder.jsonBody(args(argsBuilder).build)

    /**
     * @param method Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * @return builder
     */
    def method(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchMethodArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchMethodArgs.builder
      builder.method(args(argsBuilder).build)

    /**
     * @param queryString Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * @return builder
     */
    def queryString(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchQueryStringArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchQueryStringArgs.builder
      builder.queryString(args(argsBuilder).build)

    /**
     * @param singleHeader Inspect a single header. See `singleHeader` below for details.
     * @return builder
     */
    def singleHeader(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchSingleHeaderArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchSingleHeaderArgs.builder
      builder.singleHeader(args(argsBuilder).build)

    /**
     * @param singleQueryArgument Inspect a single query argument. See `singleQueryArgument` below for details.
     * @return builder
     */
    def singleQueryArgument(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs.builder
      builder.singleQueryArgument(args(argsBuilder).build)

    /**
     * @param uriFragment Inspect the part of a URL that follows the &#34;#&#34; symbol, providing additional information about the resource. See `uriFragment` below for details.
     * @return builder
     */
    def uriFragment(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchUriFragmentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchUriFragmentArgs.builder
      builder.uriFragment(args(argsBuilder).build)

    /**
     * @param uriPath Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * @return builder
     */
    def uriPath(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchUriPathArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchUriPathArgs.builder
      builder.uriPath(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementArgs.Builder)
    /**
     * @param fieldToMatch The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * @return builder
     */
    def fieldToMatch(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
     *  At least one required.
     *  See Text Transformation below for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseBlockCustomResponseArgs.Builder)
    /**
     * @param responseHeaders Headers to include in the response. See below.
     * @return builder
     */
    def responseHeaders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseBlockCustomResponseResponseHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseBlockCustomResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseBlockCustomResponseResponseHeaderArgs.builder
      builder.responseHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchJsonBodyArgs.Builder)
    /**
     * @param matchPattern The patterns to look for in the JSON body. You must specify exactly one setting: either `all` or `includedPaths`. See [JsonMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_JsonMatchPattern.html) for details.
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchJsonBodyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseCaptchaArgs.Builder)
    /**
     * @param customRequestHandling Custom handling for CAPTCHA requests. See below.
     * @return builder
     */
    def customRequestHandling(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseCaptchaCustomRequestHandlingArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseCaptchaArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseCaptchaCustomRequestHandlingArgs.builder
      builder.customRequestHandling(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesArgs.Builder)
    /**
     * @param matchPatterns The filter to use to identify the subset of cookies to inspect in a web request. You must specify exactly one setting: either `all`, `includedCookies` or `excludedCookies`. More details: [CookieMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_CookieMatchPattern.html)
     * @return builder
     */
    def matchPatterns(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesMatchPatternArgs.builder
      builder.matchPatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder)
    /**
     * @param allQueryArguments Inspect all query arguments.
     * @return builder
     */
    def allQueryArguments(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs.builder
      builder.allQueryArguments(args(argsBuilder).build)

    /**
     * @param body Inspect the request body, which immediately follows the request headers. See `body` below for details.
     * @return builder
     */
    def body(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchBodyArgs.builder
      builder.body(args(argsBuilder).build)

    /**
     * @param cookies Inspect the cookies in the web request. See `cookies` below for details.
     * @return builder
     */
    def cookies(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchCookiesArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchCookiesArgs.builder
      builder.cookies(args(argsBuilder).build)

    /**
     * @param headerOrders Inspect a string containing the list of the request&#39;s header names, ordered as they appear in the web request that AWS WAF receives for inspection. See `headerOrder` below for details.
     * @return builder
     */
    def headerOrders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchHeaderOrderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchHeaderOrderArgs.builder
      builder.headerOrders(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Inspect the request headers. See `headers` below for details.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param ja3Fingerprint Inspect the JA3 fingerprint. See `ja3Fingerprint` below for details.
     * @return builder
     */
    def ja3Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchJa3FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchJa3FingerprintArgs.builder
      builder.ja3Fingerprint(args(argsBuilder).build)

    /**
     * @param ja4Fingerprint Inspect the JA3 fingerprint. See `ja4Fingerprint` below for details.
     * @return builder
     */
    def ja4Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchJa4FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchJa4FingerprintArgs.builder
      builder.ja4Fingerprint(args(argsBuilder).build)

    /**
     * @param jsonBody Inspect the request body as JSON. See `jsonBody` for details.
     * @return builder
     */
    def jsonBody(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchJsonBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchJsonBodyArgs.builder
      builder.jsonBody(args(argsBuilder).build)

    /**
     * @param method Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * @return builder
     */
    def method(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchMethodArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchMethodArgs.builder
      builder.method(args(argsBuilder).build)

    /**
     * @param queryString Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * @return builder
     */
    def queryString(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchQueryStringArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchQueryStringArgs.builder
      builder.queryString(args(argsBuilder).build)

    /**
     * @param singleHeader Inspect a single header. See `singleHeader` below for details.
     * @return builder
     */
    def singleHeader(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchSingleHeaderArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchSingleHeaderArgs.builder
      builder.singleHeader(args(argsBuilder).build)

    /**
     * @param singleQueryArgument Inspect a single query argument. See `singleQueryArgument` below for details.
     * @return builder
     */
    def singleQueryArgument(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs.builder
      builder.singleQueryArgument(args(argsBuilder).build)

    /**
     * @param uriFragment Inspect the part of a URL that follows the &#34;#&#34; symbol, providing additional information about the resource. See `uriFragment` below for details.
     * @return builder
     */
    def uriFragment(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchUriFragmentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchUriFragmentArgs.builder
      builder.uriFragment(args(argsBuilder).build)

    /**
     * @param uriPath Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * @return builder
     */
    def uriPath(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchUriPathArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchUriPathArgs.builder
      builder.uriPath(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchJsonBodyArgs.Builder)
    /**
     * @param matchPattern The patterns to look for in the JSON body. You must specify exactly one setting: either `all` or `includedPaths`. See [JsonMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_JsonMatchPattern.html) for details.
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchJsonBodyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetArgs.Builder)
    /**
     * @param requestInspection The criteria for inspecting login requests, used by the ATP rule group to validate credentials usage. See `requestInspection` for more details.
     * @return builder
     */
    def requestInspection(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetRequestInspectionArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetRequestInspectionArgs.builder
      builder.requestInspection(args(argsBuilder).build)

    /**
     * @param responseInspection The criteria for inspecting responses to login requests, used by the ATP rule group to track login failure rates. Note that Response Inspection is available only on web ACLs that protect CloudFront distributions. See `responseInspection` for more details.
     * @return builder
     */
    def responseInspection(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetResponseInspectionArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetResponseInspectionArgs.builder
      builder.responseInspection(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchJsonBodyArgs.Builder)
    /**
     * @param matchPattern The patterns to look for in the JSON body. You must specify exactly one setting: either `all` or `includedPaths`. See [JsonMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_JsonMatchPattern.html) for details.
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchJsonBodyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchCookiesArgs.Builder)
    /**
     * @param matchPatterns The filter to use to identify the subset of cookies to inspect in a web request. You must specify exactly one setting: either `all`, `includedCookies` or `excludedCookies`. More details: [CookieMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_CookieMatchPattern.html)
     * @return builder
     */
    def matchPatterns(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchCookiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchCookiesMatchPatternArgs.builder
      builder.matchPatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchCookiesMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchCookiesMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementArgs.Builder)
    /**
     * @param statements The statements to combine.
     * @return builder
     */
    def statements(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementArgs.builder
      builder.statements(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder)
    /**
     * @param allQueryArguments Inspect all query arguments.
     * @return builder
     */
    def allQueryArguments(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs.builder
      builder.allQueryArguments(args(argsBuilder).build)

    /**
     * @param body Inspect the request body, which immediately follows the request headers.
     * @return builder
     */
    def body(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchBodyArgs.builder
      builder.body(args(argsBuilder).build)

    /**
     * @param cookies Inspect the cookies in the web request. See Cookies below for details.
     * @return builder
     */
    def cookies(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchCookiesArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchCookiesArgs.builder
      builder.cookies(args(argsBuilder).build)

    /**
     * @param headerOrders Inspect the request headers. See Header Order below for details.
     * @return builder
     */
    def headerOrders(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchHeaderOrderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchHeaderOrderArgs.builder
      builder.headerOrders(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Inspect the request headers. See Headers below for details.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param ja3Fingerprint Inspect the JA3 fingerprint. See `ja3Fingerprint` below for details.
     * @return builder
     */
    def ja3Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchJa3FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchJa3FingerprintArgs.builder
      builder.ja3Fingerprint(args(argsBuilder).build)

    /**
     * @param ja4Fingerprint Inspect the JA4 fingerprint. See `ja4Fingerprint` below for details.
     * @return builder
     */
    def ja4Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchJa4FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchJa4FingerprintArgs.builder
      builder.ja4Fingerprint(args(argsBuilder).build)

    /**
     * @param jsonBody Inspect the request body as JSON. See JSON Body for details.
     * @return builder
     */
    def jsonBody(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchJsonBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchJsonBodyArgs.builder
      builder.jsonBody(args(argsBuilder).build)

    /**
     * @param method Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * @return builder
     */
    def method(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchMethodArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchMethodArgs.builder
      builder.method(args(argsBuilder).build)

    /**
     * @param queryString Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * @return builder
     */
    def queryString(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchQueryStringArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchQueryStringArgs.builder
      builder.queryString(args(argsBuilder).build)

    /**
     * @param singleHeader Inspect a single header. See Single Header below for details.
     * @return builder
     */
    def singleHeader(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs.builder
      builder.singleHeader(args(argsBuilder).build)

    /**
     * @param singleQueryArgument Inspect a single query argument. See Single Query Argument below for details.
     * @return builder
     */
    def singleQueryArgument(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs.builder
      builder.singleQueryArgument(args(argsBuilder).build)

    /**
     * @param uriFragment Inspect the part of a URL that follows the &#34;#&#34; symbol, providing additional information about the resource. See URI Fragment below for details.
     * @return builder
     */
    def uriFragment(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchUriFragmentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchUriFragmentArgs.builder
      builder.uriFragment(args(argsBuilder).build)

    /**
     * @param uriPath Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * @return builder
     */
    def uriPath(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchUriPathArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchUriPathArgs.builder
      builder.uriPath(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyCookieArgs.Builder)
    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. They are used in rate-based rule statements, to transform request components before using them as custom aggregation keys. Atleast one transformation is required. See Text Transformation above for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyCookieTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyCookieArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyCookieTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchHeaderMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchHeaderMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchHeaderMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchHeaderMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementArgs.Builder)
    /**
     * @param fieldToMatch Part of a web request that you want AWS WAF to inspect. See `fieldToMatch` below for details.
     * @return builder
     */
    def fieldToMatch(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. At least one transformation is required. See `textTransformation` below for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseCountCustomRequestHandlingArgs.Builder)
    /**
     * @param insertHeaders The `insertHeader` blocks used to define HTTP headers added to the request. See `insertHeader` below for details.
     * @return builder
     */
    def insertHeaders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseCountCustomRequestHandlingInsertHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseCountCustomRequestHandlingArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseCountCustomRequestHandlingInsertHeaderArgs.builder
      builder.insertHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchHeaderArgs.Builder)
    /**
     * @param matchPattern The filter to use to identify the subset of headers to inspect in a web request. The `matchPattern` block supports only one of the following arguments:
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchHeaderArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleCaptchaConfigArgs.Builder)
    /**
     * @param immunityTimeProperty Defines custom immunity time. See Immunity Time Property below for details.
     * @return builder
     */
    def immunityTimeProperty(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleCaptchaConfigImmunityTimePropertyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleCaptchaConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleCaptchaConfigImmunityTimePropertyArgs.builder
      builder.immunityTimeProperty(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchCookiesMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchCookiesMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesArgs.Builder)
    /**
     * @param matchPatterns The filter to use to identify the subset of cookies to inspect in a web request. You must specify exactly one setting: either `all`, `includedCookies` or `excludedCookies`. More details: [CookieMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_CookieMatchPattern.html)
     * @return builder
     */
    def matchPatterns(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesMatchPatternArgs.builder
      builder.matchPatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchJsonBodyArgs.Builder)
    /**
     * @param matchPattern The patterns to look for in the JSON body. You must specify exactly one setting: either `all` or `includedPaths`. See [JsonMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_JsonMatchPattern.html) for details.
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchJsonBodyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionChallengeArgs.Builder)
    /**
     * @param customRequestHandling Defines custom handling for the web request. See Custom Request Handling below for details.
     * @return builder
     */
    def customRequestHandling(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionChallengeCustomRequestHandlingArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionChallengeArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionChallengeCustomRequestHandlingArgs.builder
      builder.customRequestHandling(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionCountArgs.Builder)
    /**
     * @param customRequestHandling Defines custom handling for the web request. See Custom Request Handling below for details.
     * @return builder
     */
    def customRequestHandling(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionCountCustomRequestHandlingArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionCountArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionCountCustomRequestHandlingArgs.builder
      builder.customRequestHandling(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchHeaderArgs.Builder)
    /**
     * @param matchPattern The filter to use to identify the subset of headers to inspect in a web request. The `matchPattern` block supports only one of the following arguments:
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchHeaderArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchHeaderMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupState.Builder)
    /**
     * @param customResponseBodies Defines custom response bodies that can be referenced by `customResponse` actions. See Custom Response Body below for details.
     * @return builder
     */
    def customResponseBodies(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupCustomResponseBodyArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupState.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupCustomResponseBodyArgs.builder
      builder.customResponseBodies(args.map(_(argsBuilder).build)*)

    /**
     * @param rules The rule blocks used to identify the web requests that you want to `allow`, `block`, or `count`. See Rules below for details.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupState.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

    /**
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
     * @return builder
     */
    def visibilityConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupVisibilityConfigArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupState.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupVisibilityConfigArgs.builder
      builder.visibilityConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseChallengeArgs.Builder)
    /**
     * @param customRequestHandling Defines custom handling for the web request. See `customRequestHandling` below for details.
     * @return builder
     */
    def customRequestHandling(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseChallengeCustomRequestHandlingArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseChallengeArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseChallengeCustomRequestHandlingArgs.builder
      builder.customRequestHandling(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupArgs.Builder)
    /**
     * @param ruleActionOverrides Override actions for specific rules within the rule group. See below.
     * @return builder
     */
    def ruleActionOverrides(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideArgs.builder
      builder.ruleActionOverrides(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchCookiesMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchCookiesMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchHeaderMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchHeaderMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchHeaderArgs.Builder)
    /**
     * @param matchPattern The filter to use to identify the subset of headers to inspect in a web request. The `matchPattern` block supports only one of the following arguments:
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchHeaderArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchHeaderMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclDefaultActionBlockCustomResponseArgs.Builder)
    /**
     * @param responseHeaders The `responseHeader` blocks used to define the HTTP response headers added to the response. See `responseHeader` below for details.
     * @return builder
     */
    def responseHeaders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclDefaultActionBlockCustomResponseResponseHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclDefaultActionBlockCustomResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclDefaultActionBlockCustomResponseResponseHeaderArgs.builder
      builder.responseHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchArgs.Builder)
    /**
     * @param allQueryArguments Inspect all query arguments.
     * @return builder
     */
    def allQueryArguments(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs.builder
      builder.allQueryArguments(args(argsBuilder).build)

    /**
     * @param body Inspect the request body, which immediately follows the request headers.
     * @return builder
     */
    def body(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchBodyArgs.builder
      builder.body(args(argsBuilder).build)

    /**
     * @param cookies Inspect the cookies in the web request. See Cookies below for details.
     * @return builder
     */
    def cookies(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchCookiesArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchCookiesArgs.builder
      builder.cookies(args(argsBuilder).build)

    /**
     * @param headerOrders Inspect the request headers. See Header Order below for details.
     * @return builder
     */
    def headerOrders(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchHeaderOrderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchHeaderOrderArgs.builder
      builder.headerOrders(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Inspect the request headers. See Headers below for details.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param ja3Fingerprint Inspect the JA3 fingerprint. See `ja3Fingerprint` below for details.
     * @return builder
     */
    def ja3Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchJa3FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchJa3FingerprintArgs.builder
      builder.ja3Fingerprint(args(argsBuilder).build)

    /**
     * @param ja4Fingerprint Inspect the JA4 fingerprint. See `ja4Fingerprint` below for details.
     * @return builder
     */
    def ja4Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchJa4FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchJa4FingerprintArgs.builder
      builder.ja4Fingerprint(args(argsBuilder).build)

    /**
     * @param jsonBody Inspect the request body as JSON. See JSON Body for details.
     * @return builder
     */
    def jsonBody(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchJsonBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchJsonBodyArgs.builder
      builder.jsonBody(args(argsBuilder).build)

    /**
     * @param method Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * @return builder
     */
    def method(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchMethodArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchMethodArgs.builder
      builder.method(args(argsBuilder).build)

    /**
     * @param queryString Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * @return builder
     */
    def queryString(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchQueryStringArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchQueryStringArgs.builder
      builder.queryString(args(argsBuilder).build)

    /**
     * @param singleHeader Inspect a single header. See Single Header below for details.
     * @return builder
     */
    def singleHeader(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchSingleHeaderArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchSingleHeaderArgs.builder
      builder.singleHeader(args(argsBuilder).build)

    /**
     * @param singleQueryArgument Inspect a single query argument. See Single Query Argument below for details.
     * @return builder
     */
    def singleQueryArgument(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs.builder
      builder.singleQueryArgument(args(argsBuilder).build)

    /**
     * @param uriFragment Inspect the part of a URL that follows the &#34;#&#34; symbol, providing additional information about the resource. See URI Fragment below for details.
     * @return builder
     */
    def uriFragment(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchUriFragmentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchUriFragmentArgs.builder
      builder.uriFragment(args(argsBuilder).build)

    /**
     * @param uriPath Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * @return builder
     */
    def uriPath(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchUriPathArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchUriPathArgs.builder
      builder.uriPath(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementArgs.Builder)
    /**
     * @param fieldToMatch Part of a web request that you want AWS WAF to inspect. See `fieldToMatch` below for details.
     * @return builder
     */
    def fieldToMatch(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. At least one transformation is required. See `textTransformation` below for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchCookiesMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchCookiesMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementIpSetReferenceStatementArgs.Builder)
    /**
     * @param ipSetForwardedIpConfig Configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that&#39;s reported by the web request origin. See `ipSetForwardedIpConfig` below for more details.
     * @return builder
     */
    def ipSetForwardedIpConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementIpSetReferenceStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs.builder
      builder.ipSetForwardedIpConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseBlockArgs.Builder)
    /**
     * @param customResponse Custom response for blocked requests. See below.
     * @return builder
     */
    def customResponse(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseBlockCustomResponseArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseBlockArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseBlockCustomResponseArgs.builder
      builder.customResponse(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchHeaderArgs.Builder)
    /**
     * @param matchPattern The filter to use to identify the subset of headers to inspect in a web request. The `matchPattern` block supports only one of the following arguments:
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchHeaderArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchHeaderMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchHeaderMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleActionCountCustomRequestHandlingArgs.Builder)
    /**
     * @param insertHeaders The `insertHeader` blocks used to define HTTP headers added to the request. See `insertHeader` below for details.
     * @return builder
     */
    def insertHeaders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleActionCountCustomRequestHandlingInsertHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleActionCountCustomRequestHandlingArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleActionCountCustomRequestHandlingInsertHeaderArgs.builder
      builder.insertHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchHeaderArgs.Builder)
    /**
     * @param matchPattern The filter to use to identify the subset of headers to inspect in a web request. The `matchPattern` block supports only one of the following arguments:
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchHeaderArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchHeaderMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder)
    /**
     * @param allQueryArguments Inspect all query arguments.
     * @return builder
     */
    def allQueryArguments(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs.builder
      builder.allQueryArguments(args(argsBuilder).build)

    /**
     * @param body Inspect the request body, which immediately follows the request headers. See `body` below for details.
     * @return builder
     */
    def body(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchBodyArgs.builder
      builder.body(args(argsBuilder).build)

    /**
     * @param cookies Inspect the cookies in the web request. See `cookies` below for details.
     * @return builder
     */
    def cookies(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchCookiesArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchCookiesArgs.builder
      builder.cookies(args(argsBuilder).build)

    /**
     * @param headerOrders Inspect a string containing the list of the request&#39;s header names, ordered as they appear in the web request that AWS WAF receives for inspection. See `headerOrder` below for details.
     * @return builder
     */
    def headerOrders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchHeaderOrderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchHeaderOrderArgs.builder
      builder.headerOrders(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Inspect the request headers. See `headers` below for details.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param ja3Fingerprint Inspect the JA3 fingerprint. See `ja3Fingerprint` below for details.
     * @return builder
     */
    def ja3Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchJa3FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchJa3FingerprintArgs.builder
      builder.ja3Fingerprint(args(argsBuilder).build)

    /**
     * @param ja4Fingerprint Inspect the JA3 fingerprint. See `ja4Fingerprint` below for details.
     * @return builder
     */
    def ja4Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchJa4FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchJa4FingerprintArgs.builder
      builder.ja4Fingerprint(args(argsBuilder).build)

    /**
     * @param jsonBody Inspect the request body as JSON. See `jsonBody` for details.
     * @return builder
     */
    def jsonBody(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchJsonBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchJsonBodyArgs.builder
      builder.jsonBody(args(argsBuilder).build)

    /**
     * @param method Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * @return builder
     */
    def method(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchMethodArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchMethodArgs.builder
      builder.method(args(argsBuilder).build)

    /**
     * @param queryString Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * @return builder
     */
    def queryString(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchQueryStringArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchQueryStringArgs.builder
      builder.queryString(args(argsBuilder).build)

    /**
     * @param singleHeader Inspect a single header. See `singleHeader` below for details.
     * @return builder
     */
    def singleHeader(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs.builder
      builder.singleHeader(args(argsBuilder).build)

    /**
     * @param singleQueryArgument Inspect a single query argument. See `singleQueryArgument` below for details.
     * @return builder
     */
    def singleQueryArgument(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs.builder
      builder.singleQueryArgument(args(argsBuilder).build)

    /**
     * @param uriFragment Inspect the part of a URL that follows the &#34;#&#34; symbol, providing additional information about the resource. See `uriFragment` below for details.
     * @return builder
     */
    def uriFragment(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchUriFragmentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchUriFragmentArgs.builder
      builder.uriFragment(args(argsBuilder).build)

    /**
     * @param uriPath Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * @return builder
     */
    def uriPath(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchUriPathArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchUriPathArgs.builder
      builder.uriPath(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyCookieArgs.Builder)
    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. They are used in rate-based rule statements, to transform request components before using them as custom aggregation keys. Atleast one transformation is required. See `textTransformation` above for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyCookieTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyCookieArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyCookieTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchCookiesArgs.Builder)
    /**
     * @param matchPatterns The filter to use to identify the subset of cookies to inspect in a web request. You must specify exactly one setting: either `all`, `includedCookies` or `excludedCookies`. More details: [CookieMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_CookieMatchPattern.html)
     * @return builder
     */
    def matchPatterns(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchCookiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternArgs.builder
      builder.matchPatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementArgs.Builder)
    /**
     * @param customKeys Aggregate the request counts using one or more web request components as the aggregate keys. See `customKey` below for details.
     * @return builder
     */
    def customKeys(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyArgs.builder
      builder.customKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param forwardedIpConfig Configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that&#39;s reported by the web request origin. If `aggregateKeyType` is set to `FORWARDED_IP`, this block is required. See `forwardedIpConfig` below for details.
     * @return builder
     */
    def forwardedIpConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementForwardedIpConfigArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementForwardedIpConfigArgs.builder
      builder.forwardedIpConfig(args(argsBuilder).build)

    /**
     * @param scopeDownStatement Optional nested statement that narrows the scope of the rate-based statement to matching web requests. This can be any nestable statement, and you can nest statements at any level below this scope-down statement. See `statement` above for details. If `aggregateKeyType` is set to `CONSTANT`, this block is required.
     * @return builder
     */
    def scopeDownStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementArgs.builder
      builder.scopeDownStatement(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchJsonBodyArgs.Builder)
    /**
     * @param matchPattern The patterns to look for in the JSON body. You must specify exactly one setting: either `all` or `includedPaths`. See [JsonMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_JsonMatchPattern.html) for details.
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchJsonBodyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementArgs.Builder)
    /**
     * @param andStatement A logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
     * @return builder
     */
    def andStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementArgs.builder
      builder.andStatement(args(argsBuilder).build)

    /**
     * @param asnMatchStatement Rule statement that inspects web traffic based on the Autonomous System Number (ASN) associated with the request&#39;s IP address. See `asnMatchStatement` below for details.
     * @return builder
     */
    def asnMatchStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementAsnMatchStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementAsnMatchStatementArgs.builder
      builder.asnMatchStatement(args(argsBuilder).build)

    /**
     * @param byteMatchStatement A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * @return builder
     */
    def byteMatchStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementArgs.builder
      builder.byteMatchStatement(args(argsBuilder).build)

    /**
     * @param geoMatchStatement A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * @return builder
     */
    def geoMatchStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementGeoMatchStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementGeoMatchStatementArgs.builder
      builder.geoMatchStatement(args(argsBuilder).build)

    /**
     * @param ipSetReferenceStatement A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * @return builder
     */
    def ipSetReferenceStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementIpSetReferenceStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementIpSetReferenceStatementArgs.builder
      builder.ipSetReferenceStatement(args(argsBuilder).build)

    /**
     * @param labelMatchStatement A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * @return builder
     */
    def labelMatchStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementLabelMatchStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementLabelMatchStatementArgs.builder
      builder.labelMatchStatement(args(argsBuilder).build)

    /**
     * @param notStatement A logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
     * @return builder
     */
    def notStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementNotStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementNotStatementArgs.builder
      builder.notStatement(args(argsBuilder).build)

    /**
     * @param orStatement A logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
     * @return builder
     */
    def orStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementArgs.builder
      builder.orStatement(args(argsBuilder).build)

    /**
     * @param regexMatchStatement A rule statement used to search web request components for a match against a single regular expression. See Regex Match Statement below for details.
     * @return builder
     */
    def regexMatchStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementArgs.builder
      builder.regexMatchStatement(args(argsBuilder).build)

    /**
     * @param regexPatternSetReferenceStatement A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * @return builder
     */
    def regexPatternSetReferenceStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementArgs.builder
      builder.regexPatternSetReferenceStatement(args(argsBuilder).build)

    /**
     * @param sizeConstraintStatement A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
     * @return builder
     */
    def sizeConstraintStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementArgs.builder
      builder.sizeConstraintStatement(args(argsBuilder).build)

    /**
     * @param sqliMatchStatement An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * @return builder
     */
    def sqliMatchStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementArgs.builder
      builder.sqliMatchStatement(args(argsBuilder).build)

    /**
     * @param xssMatchStatement A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * @return builder
     */
    def xssMatchStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementArgs.builder
      builder.xssMatchStatement(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchJsonBodyArgs.Builder)
    /**
     * @param matchPattern The patterns to look for in the JSON body. You must specify exactly one setting: either `all` or `includedPaths`. See [JsonMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_JsonMatchPattern.html) for details.
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchJsonBodyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchCookiesArgs.Builder)
    /**
     * @param matchPatterns The filter to use to identify the subset of cookies to inspect in a web request. You must specify exactly one setting: either `all`, `includedCookies` or `excludedCookies`. More details: [CookieMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_CookieMatchPattern.html)
     * @return builder
     */
    def matchPatterns(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchCookiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchCookiesMatchPatternArgs.builder
      builder.matchPatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchArgs.Builder)
    /**
     * @param allQueryArguments Inspect all query arguments.
     * @return builder
     */
    def allQueryArguments(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs.builder
      builder.allQueryArguments(args(argsBuilder).build)

    /**
     * @param body Inspect the request body, which immediately follows the request headers.
     * @return builder
     */
    def body(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchBodyArgs.builder
      builder.body(args(argsBuilder).build)

    /**
     * @param cookies Inspect the cookies in the web request. See Cookies below for details.
     * @return builder
     */
    def cookies(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchCookiesArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchCookiesArgs.builder
      builder.cookies(args(argsBuilder).build)

    /**
     * @param headerOrders Inspect the request headers. See Header Order below for details.
     * @return builder
     */
    def headerOrders(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchHeaderOrderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchHeaderOrderArgs.builder
      builder.headerOrders(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Inspect the request headers. See Headers below for details.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param ja3Fingerprint Inspect the JA3 fingerprint. See `ja3Fingerprint` below for details.
     * @return builder
     */
    def ja3Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchJa3FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchJa3FingerprintArgs.builder
      builder.ja3Fingerprint(args(argsBuilder).build)

    /**
     * @param ja4Fingerprint Inspect the JA4 fingerprint. See `ja4Fingerprint` below for details.
     * @return builder
     */
    def ja4Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchJa4FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchJa4FingerprintArgs.builder
      builder.ja4Fingerprint(args(argsBuilder).build)

    /**
     * @param jsonBody Inspect the request body as JSON. See JSON Body for details.
     * @return builder
     */
    def jsonBody(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchJsonBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchJsonBodyArgs.builder
      builder.jsonBody(args(argsBuilder).build)

    /**
     * @param method Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * @return builder
     */
    def method(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchMethodArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchMethodArgs.builder
      builder.method(args(argsBuilder).build)

    /**
     * @param queryString Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * @return builder
     */
    def queryString(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchQueryStringArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchQueryStringArgs.builder
      builder.queryString(args(argsBuilder).build)

    /**
     * @param singleHeader Inspect a single header. See Single Header below for details.
     * @return builder
     */
    def singleHeader(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchSingleHeaderArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchSingleHeaderArgs.builder
      builder.singleHeader(args(argsBuilder).build)

    /**
     * @param singleQueryArgument Inspect a single query argument. See Single Query Argument below for details.
     * @return builder
     */
    def singleQueryArgument(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs.builder
      builder.singleQueryArgument(args(argsBuilder).build)

    /**
     * @param uriFragment Inspect the part of a URL that follows the &#34;#&#34; symbol, providing additional information about the resource. See URI Fragment below for details.
     * @return builder
     */
    def uriFragment(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchUriFragmentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchUriFragmentArgs.builder
      builder.uriFragment(args(argsBuilder).build)

    /**
     * @param uriPath Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * @return builder
     */
    def uriPath(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchUriPathArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchUriPathArgs.builder
      builder.uriPath(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationLoggingFilterFilterArgs.Builder)
    /**
     * @param conditions Match condition(s) for the filter. See Condition below for more details.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationLoggingFilterFilterConditionArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationLoggingFilterFilterArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationLoggingFilterFilterConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetArgs.Builder)
    /**
     * @param requestInspection The criteria for inspecting login requests, used by the ATP rule group to validate credentials usage. See `requestInspection` for more details.
     * @return builder
     */
    def requestInspection(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetRequestInspectionArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetRequestInspectionArgs.builder
      builder.requestInspection(args(argsBuilder).build)

    /**
     * @param responseInspection The criteria for inspecting responses to login requests, used by the ATP rule group to track login failure rates. Note that Response Inspection is available only on web ACLs that protect CloudFront distributions. See `responseInspection` for more details.
     * @return builder
     */
    def responseInspection(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionArgs.builder
      builder.responseInspection(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionAllowArgs.Builder)
    /**
     * @param customRequestHandling Defines custom handling for the web request. See Custom Request Handling below for details.
     * @return builder
     */
    def customRequestHandling(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionAllowCustomRequestHandlingArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionAllowArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionAllowCustomRequestHandlingArgs.builder
      builder.customRequestHandling(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder)
    /**
     * @param allQueryArguments Inspect all query arguments.
     * @return builder
     */
    def allQueryArguments(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsArgs.builder
      builder.allQueryArguments(args(argsBuilder).build)

    /**
     * @param body Inspect the request body, which immediately follows the request headers. See `body` below for details.
     * @return builder
     */
    def body(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchBodyArgs.builder
      builder.body(args(argsBuilder).build)

    /**
     * @param cookies Inspect the cookies in the web request. See `cookies` below for details.
     * @return builder
     */
    def cookies(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchCookiesArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchCookiesArgs.builder
      builder.cookies(args(argsBuilder).build)

    /**
     * @param headerOrders Inspect a string containing the list of the request&#39;s header names, ordered as they appear in the web request that AWS WAF receives for inspection. See `headerOrder` below for details.
     * @return builder
     */
    def headerOrders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchHeaderOrderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchHeaderOrderArgs.builder
      builder.headerOrders(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Inspect the request headers. See `headers` below for details.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param ja3Fingerprint Inspect the JA3 fingerprint. See `ja3Fingerprint` below for details.
     * @return builder
     */
    def ja3Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchJa3FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchJa3FingerprintArgs.builder
      builder.ja3Fingerprint(args(argsBuilder).build)

    /**
     * @param ja4Fingerprint Inspect the JA3 fingerprint. See `ja4Fingerprint` below for details.
     * @return builder
     */
    def ja4Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchJa4FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchJa4FingerprintArgs.builder
      builder.ja4Fingerprint(args(argsBuilder).build)

    /**
     * @param jsonBody Inspect the request body as JSON. See `jsonBody` for details.
     * @return builder
     */
    def jsonBody(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyArgs.builder
      builder.jsonBody(args(argsBuilder).build)

    /**
     * @param method Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * @return builder
     */
    def method(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchMethodArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchMethodArgs.builder
      builder.method(args(argsBuilder).build)

    /**
     * @param queryString Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * @return builder
     */
    def queryString(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringArgs.builder
      builder.queryString(args(argsBuilder).build)

    /**
     * @param singleHeader Inspect a single header. See `singleHeader` below for details.
     * @return builder
     */
    def singleHeader(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderArgs.builder
      builder.singleHeader(args(argsBuilder).build)

    /**
     * @param singleQueryArgument Inspect a single query argument. See `singleQueryArgument` below for details.
     * @return builder
     */
    def singleQueryArgument(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentArgs.builder
      builder.singleQueryArgument(args(argsBuilder).build)

    /**
     * @param uriFragment Inspect the part of a URL that follows the &#34;#&#34; symbol, providing additional information about the resource. See `uriFragment` below for details.
     * @return builder
     */
    def uriFragment(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchUriFragmentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchUriFragmentArgs.builder
      builder.uriFragment(args(argsBuilder).build)

    /**
     * @param uriPath Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * @return builder
     */
    def uriPath(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs.builder
      builder.uriPath(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementArgs.Builder)
    /**
     * @param fieldToMatch Part of a web request that you want AWS WAF to inspect. See `fieldToMatch` below for details.
     * @return builder
     */
    def fieldToMatch(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. At least one transformation is required. See `textTransformation` below for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationState.Builder)
    /**
     * @param loggingFilter Configuration block that specifies which web requests are kept in the logs and which are dropped. It allows filtering based on the rule action and the web request labels applied by matching rules during web ACL evaluation. For more details, refer to the Logging Filter section below.
     * @return builder
     */
    def loggingFilter(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationLoggingFilterArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationLoggingFilterArgs.builder
      builder.loggingFilter(args(argsBuilder).build)

    /**
     * @param redactedFields Configuration for parts of the request that you want to keep out of the logs. Up to 100 `redactedFields` blocks are supported. See Redacted Fields below for more details.
     * @return builder
     */
    def redactedFields(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationRedactedFieldArgs.builder
      builder.redactedFields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchHeaderArgs.Builder)
    /**
     * @param matchPattern The filter to use to identify the subset of headers to inspect in a web request. The `matchPattern` block supports only one of the following arguments:
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchHeaderArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementArgs.Builder)
    /**
     * @param statements The statements to combine.
     * @return builder
     */
    def statements(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementArgs.builder
      builder.statements(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyArgs.Builder)
    /**
     * @param matchPattern The patterns to look for in the JSON body. You must specify exactly one setting: either `all` or `includedPaths`. See [JsonMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_JsonMatchPattern.html) for details.
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseCaptchaArgs.Builder)
    /**
     * @param customRequestHandling Custom handling for CAPTCHA requests. See below.
     * @return builder
     */
    def customRequestHandling(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseCaptchaCustomRequestHandlingArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseCaptchaArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseCaptchaCustomRequestHandlingArgs.builder
      builder.customRequestHandling(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleArgs.Builder)
    /**
     * @param action Action that AWS WAF should take on a web request when it matches the rule&#39;s statement. This is used only for rules whose **statements do not reference a rule group**. See `action` for details.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleActionArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param captchaConfig Specifies how AWS WAF should handle CAPTCHA evaluations. See `captchaConfig` below for details.
     * @return builder
     */
    def captchaConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleCaptchaConfigArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleCaptchaConfigArgs.builder
      builder.captchaConfig(args(argsBuilder).build)

    /**
     * @param challengeConfig Specifies how AWS WAF should handle Challenge evaluations on the rule level. See `challengeConfig` below for details.
     * @return builder
     */
    def challengeConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleChallengeConfigArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleChallengeConfigArgs.builder
      builder.challengeConfig(args(argsBuilder).build)

    /**
     * @param overrideAction Override action to apply to the rules in a rule group. Used only for rule **statements that reference a rule group**, like `ruleGroupReferenceStatement` and `managedRuleGroupStatement`. See `overrideAction` below for details.
     * @return builder
     */
    def overrideAction(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleOverrideActionArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleOverrideActionArgs.builder
      builder.overrideAction(args(argsBuilder).build)

    /**
     * @param ruleLabels Labels to apply to web requests that match the rule match statement. See `ruleLabel` below for details.
     * @return builder
     */
    def ruleLabels(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleRuleLabelArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleRuleLabelArgs.builder
      builder.ruleLabels(args.map(_(argsBuilder).build)*)

    /**
     * @param statement The AWS WAF processing statement for the rule, for example `byteMatchStatement` or `geoMatchStatement`. See `statement` below for details.
     * @return builder
     */
    def statement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementArgs.builder
      builder.statement(args(argsBuilder).build)

    /**
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample collection. See `visibilityConfig` below for details.
     * @return builder
     */
    def visibilityConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleVisibilityConfigArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleVisibilityConfigArgs.builder
      builder.visibilityConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementArgs.Builder)
    /**
     * @param statements The statements to combine.
     * @return builder
     */
    def statements(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementArgs.builder
      builder.statements(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder)
    /**
     * @param allQueryArguments Inspect all query arguments.
     * @return builder
     */
    def allQueryArguments(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchAllQueryArgumentsArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchAllQueryArgumentsArgs.builder
      builder.allQueryArguments(args(argsBuilder).build)

    /**
     * @param body Inspect the request body, which immediately follows the request headers. See `body` below for details.
     * @return builder
     */
    def body(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchBodyArgs.builder
      builder.body(args(argsBuilder).build)

    /**
     * @param cookies Inspect the cookies in the web request. See `cookies` below for details.
     * @return builder
     */
    def cookies(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesArgs.builder
      builder.cookies(args(argsBuilder).build)

    /**
     * @param headerOrders Inspect a string containing the list of the request&#39;s header names, ordered as they appear in the web request that AWS WAF receives for inspection. See `headerOrder` below for details.
     * @return builder
     */
    def headerOrders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchHeaderOrderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchHeaderOrderArgs.builder
      builder.headerOrders(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Inspect the request headers. See `headers` below for details.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param ja3Fingerprint Inspect the JA3 fingerprint. See `ja3Fingerprint` below for details.
     * @return builder
     */
    def ja3Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchJa3FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchJa3FingerprintArgs.builder
      builder.ja3Fingerprint(args(argsBuilder).build)

    /**
     * @param ja4Fingerprint Inspect the JA3 fingerprint. See `ja4Fingerprint` below for details.
     * @return builder
     */
    def ja4Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchJa4FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchJa4FingerprintArgs.builder
      builder.ja4Fingerprint(args(argsBuilder).build)

    /**
     * @param jsonBody Inspect the request body as JSON. See `jsonBody` for details.
     * @return builder
     */
    def jsonBody(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyArgs.builder
      builder.jsonBody(args(argsBuilder).build)

    /**
     * @param method Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * @return builder
     */
    def method(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchMethodArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchMethodArgs.builder
      builder.method(args(argsBuilder).build)

    /**
     * @param queryString Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * @return builder
     */
    def queryString(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchQueryStringArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchQueryStringArgs.builder
      builder.queryString(args(argsBuilder).build)

    /**
     * @param singleHeader Inspect a single header. See `singleHeader` below for details.
     * @return builder
     */
    def singleHeader(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchSingleHeaderArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchSingleHeaderArgs.builder
      builder.singleHeader(args(argsBuilder).build)

    /**
     * @param singleQueryArgument Inspect a single query argument. See `singleQueryArgument` below for details.
     * @return builder
     */
    def singleQueryArgument(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchSingleQueryArgumentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchSingleQueryArgumentArgs.builder
      builder.singleQueryArgument(args(argsBuilder).build)

    /**
     * @param uriFragment Inspect the part of a URL that follows the &#34;#&#34; symbol, providing additional information about the resource. See `uriFragment` below for details.
     * @return builder
     */
    def uriFragment(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchUriFragmentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchUriFragmentArgs.builder
      builder.uriFragment(args(argsBuilder).build)

    /**
     * @param uriPath Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * @return builder
     */
    def uriPath(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchUriPathArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchUriPathArgs.builder
      builder.uriPath(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAsnMatchStatementArgs.Builder)
    /**
     * @param forwardedIpConfig Configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that&#39;s reported by the web request origin. See `forwardedIpConfig` below for more details.
     * @return builder
     */
    def forwardedIpConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAsnMatchStatementForwardedIpConfigArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAsnMatchStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAsnMatchStatementForwardedIpConfigArgs.builder
      builder.forwardedIpConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementArgs.Builder)
    /**
     * @param fieldToMatch Part of a web request that you want AWS WAF to inspect. See `fieldToMatch` below for details.
     * @return builder
     */
    def fieldToMatch(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. At least one transformation is required. See `textTransformation` below for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyArgs.Builder)
    /**
     * @param matchPattern The patterns to look for in the JSON body. You must specify exactly one setting: either `all` or `includedPaths`. See [JsonMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_JsonMatchPattern.html) for details.
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetResponseInspectionArgs.Builder)
    /**
     * @param bodyContains Configures inspection of the response body. See `bodyContains` for more details.
     * @return builder
     */
    def bodyContains(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetResponseInspectionBodyContainsArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetResponseInspectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetResponseInspectionBodyContainsArgs.builder
      builder.bodyContains(args(argsBuilder).build)

    /**
     * @param header Configures inspection of the response header.See `header` for more details.
     * @return builder
     */
    def header(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetResponseInspectionHeaderArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetResponseInspectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetResponseInspectionHeaderArgs.builder
      builder.header(args(argsBuilder).build)

    /**
     * @param json Configures inspection of the response JSON. See `json` for more details.
     * @return builder
     */
    def json(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetResponseInspectionJsonArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetResponseInspectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetResponseInspectionJsonArgs.builder
      builder.json(args(argsBuilder).build)

    /**
     * @param statusCode Configures inspection of the response status code.See `statusCode` for more details.
     * @return builder
     */
    def statusCode(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetResponseInspectionStatusCodeArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetResponseInspectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetResponseInspectionStatusCodeArgs.builder
      builder.statusCode(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementGeoMatchStatementArgs.Builder)
    /**
     * @param forwardedIpConfig Configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that&#39;s reported by the web request origin. See `forwardedIpConfig` below for details.
     * @return builder
     */
    def forwardedIpConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementGeoMatchStatementForwardedIpConfigArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementGeoMatchStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementGeoMatchStatementForwardedIpConfigArgs.builder
      builder.forwardedIpConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchCookiesArgs.Builder)
    /**
     * @param matchPatterns The filter to use to identify the subset of cookies to inspect in a web request. You must specify exactly one setting: either `all`, `includedCookies` or `excludedCookies`. More details: [CookieMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_CookieMatchPattern.html)
     * @return builder
     */
    def matchPatterns(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchCookiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchCookiesMatchPatternArgs.builder
      builder.matchPatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseCountArgs.Builder)
    /**
     * @param customRequestHandling Defines custom handling for the web request. See `customRequestHandling` below for details.
     * @return builder
     */
    def customRequestHandling(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseCountCustomRequestHandlingArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseCountArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseCountCustomRequestHandlingArgs.builder
      builder.customRequestHandling(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclCaptchaConfigArgs.Builder)
    /**
     * @param immunityTimeProperty Defines custom immunity time. See `immunityTimeProperty` below for details.
     * @return builder
     */
    def immunityTimeProperty(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclCaptchaConfigImmunityTimePropertyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclCaptchaConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclCaptchaConfigImmunityTimePropertyArgs.builder
      builder.immunityTimeProperty(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchHeaderArgs.Builder)
    /**
     * @param matchPattern The filter to use to identify the subset of headers to inspect in a web request. The `matchPattern` block supports only one of the following arguments:
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchHeaderArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchHeaderMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchJsonBodyArgs.Builder)
    /**
     * @param matchPattern The patterns to look for in the JSON body. You must specify exactly one setting: either `all` or `includedPaths`. See [JsonMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_JsonMatchPattern.html) for details.
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchJsonBodyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchCookiesMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementFieldToMatchCookiesMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchHeaderArgs.Builder)
    /**
     * @param matchPattern The filter to use to identify the subset of headers to inspect in a web request. The `matchPattern` block supports only one of the following arguments:
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchHeaderArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchHeaderArgs.Builder)
    /**
     * @param matchPattern The filter to use to identify the subset of headers to inspect in a web request. The `matchPattern` block supports only one of the following arguments:
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchHeaderArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchCookiesArgs.Builder)
    /**
     * @param matchPatterns The filter to use to identify the subset of cookies to inspect in a web request. You must specify exactly one setting: either `all`, `includedCookies` or `excludedCookies`. More details: [CookieMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_CookieMatchPattern.html)
     * @return builder
     */
    def matchPatterns(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchCookiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchCookiesMatchPatternArgs.builder
      builder.matchPatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclAssociationConfigRequestBodyArgs.Builder)
    /**
     * @param apiGateway Customizes the request body that your protected Amazon API Gateway REST APIs forward to AWS WAF for inspection. Applicable only when `scope` is set to `CLOUDFRONT`. See `apiGateway` below for details.
     * @return builder
     */
    def apiGateway(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclAssociationConfigRequestBodyApiGatewayArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclAssociationConfigRequestBodyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclAssociationConfigRequestBodyApiGatewayArgs.builder
      builder.apiGateway(args(argsBuilder).build)

    /**
     * @param appRunnerService Customizes the request body that your protected Amazon App Runner services forward to AWS WAF for inspection. Applicable only when `scope` is set to `REGIONAL`. See `appRunnerService` below for details.
     * @return builder
     */
    def appRunnerService(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclAssociationConfigRequestBodyAppRunnerServiceArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclAssociationConfigRequestBodyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclAssociationConfigRequestBodyAppRunnerServiceArgs.builder
      builder.appRunnerService(args(argsBuilder).build)

    /**
     * @param cloudfront Customizes the request body that your protected Amazon CloudFront distributions forward to AWS WAF for inspection. Applicable only when `scope` is set to `REGIONAL`. See `cloudfront` below for details.
     * @return builder
     */
    def cloudfront(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclAssociationConfigRequestBodyCloudfrontArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclAssociationConfigRequestBodyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclAssociationConfigRequestBodyCloudfrontArgs.builder
      builder.cloudfront(args(argsBuilder).build)

    /**
     * @param cognitoUserPool Customizes the request body that your protected Amazon Cognito user pools forward to AWS WAF for inspection. Applicable only when `scope` is set to `REGIONAL`. See `cognitoUserPool` below for details.
     * @return builder
     */
    def cognitoUserPool(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclAssociationConfigRequestBodyCognitoUserPoolArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclAssociationConfigRequestBodyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclAssociationConfigRequestBodyCognitoUserPoolArgs.builder
      builder.cognitoUserPool(args(argsBuilder).build)

    /**
     * @param verifiedAccessInstance Customizes the request body that your protected AWS Verfied Access instances forward to AWS WAF for inspection. Applicable only when `scope` is set to `REGIONAL`. See `verifiedAccessInstance` below for details.
     * @return builder
     */
    def verifiedAccessInstance(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclAssociationConfigRequestBodyVerifiedAccessInstanceArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclAssociationConfigRequestBodyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclAssociationConfigRequestBodyVerifiedAccessInstanceArgs.builder
      builder.verifiedAccessInstance(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyQueryArgumentArgs.Builder)
    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. They are used in rate-based rule statements, to transform request components before using them as custom aggregation keys. Atleast one transformation is required. See Text Transformation above for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyQueryArgumentTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyQueryArgumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyQueryArgumentTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementIpSetReferenceStatementArgs.Builder)
    /**
     * @param ipSetForwardedIpConfig Configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that&#39;s reported by the web request origin. See `ipSetForwardedIpConfig` below for more details.
     * @return builder
     */
    def ipSetForwardedIpConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementIpSetReferenceStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs.builder
      builder.ipSetForwardedIpConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchHeaderArgs.Builder)
    /**
     * @param matchPattern The filter to use to identify the subset of headers to inspect in a web request. The `matchPattern` block supports only one of the following arguments:
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchHeaderArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchHeaderMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchHeaderMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchHeaderMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseAllowArgs.Builder)
    /**
     * @param customRequestHandling Defines custom handling for the web request. See `customRequestHandling` below for details.
     * @return builder
     */
    def customRequestHandling(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseAllowCustomRequestHandlingArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseAllowArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseAllowCustomRequestHandlingArgs.builder
      builder.customRequestHandling(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleCaptchaConfigArgs.Builder)
    /**
     * @param immunityTimeProperty Defines custom immunity time. See `immunityTimeProperty` below for details.
     * @return builder
     */
    def immunityTimeProperty(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleCaptchaConfigImmunityTimePropertyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleCaptchaConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleCaptchaConfigImmunityTimePropertyArgs.builder
      builder.immunityTimeProperty(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseCaptchaCustomRequestHandlingArgs.Builder)
    /**
     * @param insertHeaders Headers to insert into the request. See below.
     * @return builder
     */
    def insertHeaders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseCaptchaCustomRequestHandlingInsertHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseCaptchaCustomRequestHandlingArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseCaptchaCustomRequestHandlingInsertHeaderArgs.builder
      builder.insertHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclDefaultActionAllowArgs.Builder)
    /**
     * @param customRequestHandling Defines custom handling for the web request. See `customRequestHandling` below for details.
     * @return builder
     */
    def customRequestHandling(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclDefaultActionAllowCustomRequestHandlingArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclDefaultActionAllowArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclDefaultActionAllowCustomRequestHandlingArgs.builder
      builder.customRequestHandling(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchHeaderMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchHeaderMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchHeaderArgs.Builder)
    /**
     * @param matchPattern The filter to use to identify the subset of headers to inspect in a web request. The `matchPattern` block supports only one of the following arguments:
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchHeaderArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementAsnMatchStatementArgs.Builder)
    /**
     * @param forwardedIpConfig Configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that&#39;s reported by the web request origin. See Forwarded IP Config below for more details.
     * @return builder
     */
    def forwardedIpConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementAsnMatchStatementForwardedIpConfigArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementAsnMatchStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementAsnMatchStatementForwardedIpConfigArgs.builder
      builder.forwardedIpConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchJsonBodyArgs.Builder)
    /**
     * @param matchPattern The patterns to look for in the JSON body. You must specify exactly one setting: either `all` or `includedPaths`. See [JsonMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_JsonMatchPattern.html) for details.
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchJsonBodyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder)
    /**
     * @param allQueryArguments Inspect all query arguments.
     * @return builder
     */
    def allQueryArguments(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsArgs.builder
      builder.allQueryArguments(args(argsBuilder).build)

    /**
     * @param body Inspect the request body, which immediately follows the request headers. See `body` below for details.
     * @return builder
     */
    def body(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchBodyArgs.builder
      builder.body(args(argsBuilder).build)

    /**
     * @param cookies Inspect the cookies in the web request. See `cookies` below for details.
     * @return builder
     */
    def cookies(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchCookiesArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchCookiesArgs.builder
      builder.cookies(args(argsBuilder).build)

    /**
     * @param headerOrders Inspect a string containing the list of the request&#39;s header names, ordered as they appear in the web request that AWS WAF receives for inspection. See `headerOrder` below for details.
     * @return builder
     */
    def headerOrders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchHeaderOrderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchHeaderOrderArgs.builder
      builder.headerOrders(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Inspect the request headers. See `headers` below for details.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param ja3Fingerprint Inspect the JA3 fingerprint. See `ja3Fingerprint` below for details.
     * @return builder
     */
    def ja3Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJa3FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJa3FingerprintArgs.builder
      builder.ja3Fingerprint(args(argsBuilder).build)

    /**
     * @param ja4Fingerprint Inspect the JA3 fingerprint. See `ja4Fingerprint` below for details.
     * @return builder
     */
    def ja4Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJa4FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJa4FingerprintArgs.builder
      builder.ja4Fingerprint(args(argsBuilder).build)

    /**
     * @param jsonBody Inspect the request body as JSON. See `jsonBody` for details.
     * @return builder
     */
    def jsonBody(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyArgs.builder
      builder.jsonBody(args(argsBuilder).build)

    /**
     * @param method Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * @return builder
     */
    def method(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchMethodArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchMethodArgs.builder
      builder.method(args(argsBuilder).build)

    /**
     * @param queryString Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * @return builder
     */
    def queryString(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringArgs.builder
      builder.queryString(args(argsBuilder).build)

    /**
     * @param singleHeader Inspect a single header. See `singleHeader` below for details.
     * @return builder
     */
    def singleHeader(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderArgs.builder
      builder.singleHeader(args(argsBuilder).build)

    /**
     * @param singleQueryArgument Inspect a single query argument. See `singleQueryArgument` below for details.
     * @return builder
     */
    def singleQueryArgument(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentArgs.builder
      builder.singleQueryArgument(args(argsBuilder).build)

    /**
     * @param uriFragment Inspect the part of a URL that follows the &#34;#&#34; symbol, providing additional information about the resource. See `uriFragment` below for details.
     * @return builder
     */
    def uriFragment(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchUriFragmentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchUriFragmentArgs.builder
      builder.uriFragment(args(argsBuilder).build)

    /**
     * @param uriPath Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * @return builder
     */
    def uriPath(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs.builder
      builder.uriPath(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchHeaderArgs.Builder)
    /**
     * @param matchPattern The filter to use to identify the subset of headers to inspect in a web request. The `matchPattern` block supports only one of the following arguments:
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchHeaderArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchHeaderMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchHeaderArgs.Builder)
    /**
     * @param matchPattern The filter to use to identify the subset of headers to inspect in a web request. The `matchPattern` block supports only one of the following arguments:
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchHeaderArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchHeaderMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchHeaderMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchHeaderMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchHeaderArgs.Builder)
    /**
     * @param matchPattern The filter to use to identify the subset of headers to inspect in a web request. The `matchPattern` block supports only one of the following arguments:
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchHeaderArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchHeaderMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseChallengeCustomRequestHandlingArgs.Builder)
    /**
     * @param insertHeaders Headers to insert into the request. See below.
     * @return builder
     */
    def insertHeaders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseChallengeCustomRequestHandlingInsertHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseChallengeCustomRequestHandlingArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseChallengeCustomRequestHandlingInsertHeaderArgs.builder
      builder.insertHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAntiDdosRuleSetArgs.Builder)
    /**
     * @param clientSideActionConfig Configuration for the request handling that&#39;s applied by the managed rule group rules `ChallengeAllDuringEvent` and `ChallengeDDoSRequests` during a distributed denial of service (DDoS) attack. See `clientSideActionConfig` for more details.
     * @return builder
     */
    def clientSideActionConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAntiDdosRuleSetClientSideActionConfigArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAntiDdosRuleSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAntiDdosRuleSetClientSideActionConfigArgs.builder
      builder.clientSideActionConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyUriPathArgs.Builder)
    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. They are used in rate-based rule statements, to transform request components before using them as custom aggregation keys. Atleast one transformation is required. See `textTransformation` above for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyUriPathTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyUriPathArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyUriPathTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchHeaderMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchHeaderMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyArgs.Builder)
    def asn(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyAsnArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyAsnArgs.builder
      builder.asn(args(argsBuilder).build)

    /**
     * @param cookie (Optional) Use the value of a cookie in the request as an aggregate key. See RateLimit `cookie` below for details.
     * @return builder
     */
    def cookie(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyCookieArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyCookieArgs.builder
      builder.cookie(args(argsBuilder).build)

    /**
     * @param forwardedIp (Optional) Use the first IP address in an HTTP header as an aggregate key. See `forwardedIp` below for details.
     * @return builder
     */
    def forwardedIp(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyForwardedIpArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyForwardedIpArgs.builder
      builder.forwardedIp(args(argsBuilder).build)

    /**
     * @param header (Optional) Use the value of a header in the request as an aggregate key. See RateLimit `header` below for details.
     * @return builder
     */
    def header(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyHeaderArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyHeaderArgs.builder
      builder.header(args(argsBuilder).build)

    /**
     * @param httpMethod (Optional) Use the request&#39;s HTTP method as an aggregate key. See RateLimit `httpMethod` below for details.
     * @return builder
     */
    def httpMethod(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyHttpMethodArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyHttpMethodArgs.builder
      builder.httpMethod(args(argsBuilder).build)

    /**
     * @param ip (Optional) Use the request&#39;s originating IP address as an aggregate key. See `RateLimit ip` below for details.
     * @return builder
     */
    def ip(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyIpArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyIpArgs.builder
      builder.ip(args(argsBuilder).build)

    /**
     * @param ja3Fingerprint (Optional) Use the JA3 fingerprint in the request as an aggregate key. See `RateLimit ip` below for details.
     * @return builder
     */
    def ja3Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyJa3FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyJa3FingerprintArgs.builder
      builder.ja3Fingerprint(args(argsBuilder).build)

    /**
     * @param ja4Fingerprint (Optional) Use the JA3 fingerprint in the request as an aggregate key. See `RateLimit ip` below for details.
     * @return builder
     */
    def ja4Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyJa4FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyJa4FingerprintArgs.builder
      builder.ja4Fingerprint(args(argsBuilder).build)

    /**
     * @param labelNamespace (Optional) Use the specified label namespace as an aggregate key. See RateLimit `labelNamespace` below for details.
     * @return builder
     */
    def labelNamespace(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyLabelNamespaceArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyLabelNamespaceArgs.builder
      builder.labelNamespace(args(argsBuilder).build)

    /**
     * @param queryArgument (Optional) Use the specified query argument as an aggregate key. See RateLimit `queryArgument` below for details.
     * @return builder
     */
    def queryArgument(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyQueryArgumentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyQueryArgumentArgs.builder
      builder.queryArgument(args(argsBuilder).build)

    /**
     * @param queryString (Optional) Use the request&#39;s query string as an aggregate key. See RateLimit `queryString` below for details.
     * @return builder
     */
    def queryString(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyQueryStringArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyQueryStringArgs.builder
      builder.queryString(args(argsBuilder).build)

    /**
     * @param uriPath (Optional) Use the request&#39;s URI path as an aggregate key. See RateLimit `uriPath` below for details.
     * @return builder
     */
    def uriPath(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyUriPathArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyUriPathArgs.builder
      builder.uriPath(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchHeaderMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchHeaderMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchJsonBodyArgs.Builder)
    /**
     * @param matchPattern The patterns to look for in the JSON body. You must specify exactly one setting: either `all` or `includedPaths`. See [JsonMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_JsonMatchPattern.html) for details.
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchJsonBodyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchJsonBodyMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseCaptchaCustomRequestHandlingArgs.Builder)
    /**
     * @param insertHeaders Headers to insert into the request. See below.
     * @return builder
     */
    def insertHeaders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseCaptchaCustomRequestHandlingInsertHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseCaptchaCustomRequestHandlingArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseCaptchaCustomRequestHandlingInsertHeaderArgs.builder
      builder.insertHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchCookiesArgs.Builder)
    /**
     * @param matchPatterns The filter to use to identify the subset of cookies to inspect in a web request. You must specify exactly one setting: either `all`, `includedCookies` or `excludedCookies`. More details: [CookieMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_CookieMatchPattern.html)
     * @return builder
     */
    def matchPatterns(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchCookiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternArgs.builder
      builder.matchPatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementArgs.Builder)
    /**
     * @param statements The statements to combine.
     * @return builder
     */
    def statements(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementArgs.builder
      builder.statements(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideArgs.Builder)
    /**
     * @param actionToUse Override action to use, in place of the configured action of the rule in the rule group. See `action` for details.
     * @return builder
     */
    def actionToUse(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseArgs.builder
      builder.actionToUse(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementGeoMatchStatementArgs.Builder)
    /**
     * @param forwardedIpConfig Configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that&#39;s reported by the web request origin. See `forwardedIpConfig` below for details.
     * @return builder
     */
    def forwardedIpConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementGeoMatchStatementForwardedIpConfigArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementGeoMatchStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementGeoMatchStatementForwardedIpConfigArgs.builder
      builder.forwardedIpConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementIpSetReferenceStatementArgs.Builder)
    /**
     * @param ipSetForwardedIpConfig The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that&#39;s reported by the web request origin. See IPSet Forwarded IP Config below for more details.
     * @return builder
     */
    def ipSetForwardedIpConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementIpSetReferenceStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs.builder
      builder.ipSetForwardedIpConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclDataProtectionConfigArgs.Builder)
    /**
     * @param dataProtections A block for data protection configurations for specific web request field types. See `dataProtection` block for details.
     * @return builder
     */
    def dataProtections(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclDataProtectionConfigDataProtectionArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclDataProtectionConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclDataProtectionConfigDataProtectionArgs.builder
      builder.dataProtections(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder)
    /**
     * @param allQueryArguments Inspect all query arguments.
     * @return builder
     */
    def allQueryArguments(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs.builder
      builder.allQueryArguments(args(argsBuilder).build)

    /**
     * @param body Inspect the request body, which immediately follows the request headers.
     * @return builder
     */
    def body(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchBodyArgs.builder
      builder.body(args(argsBuilder).build)

    /**
     * @param cookies Inspect the cookies in the web request. See Cookies below for details.
     * @return builder
     */
    def cookies(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchCookiesArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchCookiesArgs.builder
      builder.cookies(args(argsBuilder).build)

    /**
     * @param headerOrders Inspect the request headers. See Header Order below for details.
     * @return builder
     */
    def headerOrders(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchHeaderOrderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchHeaderOrderArgs.builder
      builder.headerOrders(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Inspect the request headers. See Headers below for details.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param ja3Fingerprint Inspect the JA3 fingerprint. See `ja3Fingerprint` below for details.
     * @return builder
     */
    def ja3Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchJa3FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchJa3FingerprintArgs.builder
      builder.ja3Fingerprint(args(argsBuilder).build)

    /**
     * @param ja4Fingerprint Inspect the JA4 fingerprint. See `ja4Fingerprint` below for details.
     * @return builder
     */
    def ja4Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchJa4FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchJa4FingerprintArgs.builder
      builder.ja4Fingerprint(args(argsBuilder).build)

    /**
     * @param jsonBody Inspect the request body as JSON. See JSON Body for details.
     * @return builder
     */
    def jsonBody(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchJsonBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchJsonBodyArgs.builder
      builder.jsonBody(args(argsBuilder).build)

    /**
     * @param method Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * @return builder
     */
    def method(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchMethodArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchMethodArgs.builder
      builder.method(args(argsBuilder).build)

    /**
     * @param queryString Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * @return builder
     */
    def queryString(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchQueryStringArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchQueryStringArgs.builder
      builder.queryString(args(argsBuilder).build)

    /**
     * @param singleHeader Inspect a single header. See Single Header below for details.
     * @return builder
     */
    def singleHeader(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs.builder
      builder.singleHeader(args(argsBuilder).build)

    /**
     * @param singleQueryArgument Inspect a single query argument. See Single Query Argument below for details.
     * @return builder
     */
    def singleQueryArgument(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs.builder
      builder.singleQueryArgument(args(argsBuilder).build)

    /**
     * @param uriFragment Inspect the part of a URL that follows the &#34;#&#34; symbol, providing additional information about the resource. See URI Fragment below for details.
     * @return builder
     */
    def uriFragment(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchUriFragmentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchUriFragmentArgs.builder
      builder.uriFragment(args(argsBuilder).build)

    /**
     * @param uriPath Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * @return builder
     */
    def uriPath(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchUriPathArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchUriPathArgs.builder
      builder.uriPath(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementArgs.Builder)
    /**
     * @param ruleActionOverrides Action settings to use in the place of the rule actions that are configured inside the rule group. You specify one override for each rule whose action you want to change. See `ruleActionOverride` below for details.
     * @return builder
     */
    def ruleActionOverrides(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideArgs.builder
      builder.ruleActionOverrides(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementIpSetReferenceStatementArgs.Builder)
    /**
     * @param ipSetForwardedIpConfig The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that&#39;s reported by the web request origin. See IPSet Forwarded IP Config below for more details.
     * @return builder
     */
    def ipSetForwardedIpConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementIpSetReferenceStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs.builder
      builder.ipSetForwardedIpConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCaptchaCustomRequestHandlingArgs.Builder)
    /**
     * @param insertHeaders The `insertHeader` blocks used to define HTTP headers added to the request. See `insertHeader` below for details.
     * @return builder
     */
    def insertHeaders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCaptchaCustomRequestHandlingInsertHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCaptchaCustomRequestHandlingArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCaptchaCustomRequestHandlingInsertHeaderArgs.builder
      builder.insertHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseBlockArgs.Builder)
    /**
     * @param customResponse Defines a custom response for the web request. See `customResponse` below for details.
     * @return builder
     */
    def customResponse(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseBlockCustomResponseArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseBlockArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseBlockCustomResponseArgs.builder
      builder.customResponse(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAsnMatchStatementArgs.Builder)
    /**
     * @param forwardedIpConfig Configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that&#39;s reported by the web request origin. See `forwardedIpConfig` below for more details.
     * @return builder
     */
    def forwardedIpConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAsnMatchStatementForwardedIpConfigArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAsnMatchStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAsnMatchStatementForwardedIpConfigArgs.builder
      builder.forwardedIpConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder)
    /**
     * @param allQueryArguments Inspect all query arguments.
     * @return builder
     */
    def allQueryArguments(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchAllQueryArgumentsArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchAllQueryArgumentsArgs.builder
      builder.allQueryArguments(args(argsBuilder).build)

    /**
     * @param body Inspect the request body, which immediately follows the request headers.
     * @return builder
     */
    def body(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchBodyArgs.builder
      builder.body(args(argsBuilder).build)

    /**
     * @param cookies Inspect the cookies in the web request. See Cookies below for details.
     * @return builder
     */
    def cookies(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesArgs.builder
      builder.cookies(args(argsBuilder).build)

    /**
     * @param headerOrders Inspect the request headers. See Header Order below for details.
     * @return builder
     */
    def headerOrders(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchHeaderOrderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchHeaderOrderArgs.builder
      builder.headerOrders(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Inspect the request headers. See Headers below for details.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param ja3Fingerprint Inspect the JA3 fingerprint. See `ja3Fingerprint` below for details.
     * @return builder
     */
    def ja3Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchJa3FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchJa3FingerprintArgs.builder
      builder.ja3Fingerprint(args(argsBuilder).build)

    /**
     * @param ja4Fingerprint Inspect the JA4 fingerprint. See `ja4Fingerprint` below for details.
     * @return builder
     */
    def ja4Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchJa4FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchJa4FingerprintArgs.builder
      builder.ja4Fingerprint(args(argsBuilder).build)

    /**
     * @param jsonBody Inspect the request body as JSON. See JSON Body for details.
     * @return builder
     */
    def jsonBody(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyArgs.builder
      builder.jsonBody(args(argsBuilder).build)

    /**
     * @param method Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * @return builder
     */
    def method(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchMethodArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchMethodArgs.builder
      builder.method(args(argsBuilder).build)

    /**
     * @param queryString Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * @return builder
     */
    def queryString(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchQueryStringArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchQueryStringArgs.builder
      builder.queryString(args(argsBuilder).build)

    /**
     * @param singleHeader Inspect a single header. See Single Header below for details.
     * @return builder
     */
    def singleHeader(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchSingleHeaderArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchSingleHeaderArgs.builder
      builder.singleHeader(args(argsBuilder).build)

    /**
     * @param singleQueryArgument Inspect a single query argument. See Single Query Argument below for details.
     * @return builder
     */
    def singleQueryArgument(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchSingleQueryArgumentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchSingleQueryArgumentArgs.builder
      builder.singleQueryArgument(args(argsBuilder).build)

    /**
     * @param uriFragment Inspect the part of a URL that follows the &#34;#&#34; symbol, providing additional information about the resource. See URI Fragment below for details.
     * @return builder
     */
    def uriFragment(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchUriFragmentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchUriFragmentArgs.builder
      builder.uriFragment(args(argsBuilder).build)

    /**
     * @param uriPath Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * @return builder
     */
    def uriPath(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchUriPathArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchUriPathArgs.builder
      builder.uriPath(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionArgs.Builder)
    /**
     * @param allow Instructs AWS WAF to allow the web request. See Allow below for details.
     * @return builder
     */
    def allow(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionAllowArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionAllowArgs.builder
      builder.allow(args(argsBuilder).build)

    /**
     * @param block Instructs AWS WAF to block the web request. See Block below for details.
     * @return builder
     */
    def block(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionBlockArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionBlockArgs.builder
      builder.block(args(argsBuilder).build)

    /**
     * @param captcha Instructs AWS WAF to run a `CAPTCHA` check against the web request. See Captcha below for details.
     * @return builder
     */
    def captcha(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionCaptchaArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionCaptchaArgs.builder
      builder.captcha(args(argsBuilder).build)

    /**
     * @param challenge Instructs AWS WAF to run a check against the request to verify that the request is coming from a legitimate client session. See Challenge below for details.
     * @return builder
     */
    def challenge(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionChallengeArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionChallengeArgs.builder
      builder.challenge(args(argsBuilder).build)

    /**
     * @param count Instructs AWS WAF to count the web request and allow it. See Count below for details.
     * @return builder
     */
    def count(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionCountArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionCountArgs.builder
      builder.count(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchJsonBodyArgs.Builder)
    /**
     * @param matchPattern The patterns to look for in the JSON body. You must specify exactly one setting: either `all` or `includedPaths`. See [JsonMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_JsonMatchPattern.html) for details.
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchJsonBodyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchJsonBodyMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclDefaultActionBlockArgs.Builder)
    /**
     * @param customResponse Defines a custom response for the web request. See `customResponse` below for details.
     * @return builder
     */
    def customResponse(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclDefaultActionBlockCustomResponseArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclDefaultActionBlockArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclDefaultActionBlockCustomResponseArgs.builder
      builder.customResponse(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementArgs.Builder)
    /**
     * @param fieldToMatch Part of a web request that you want AWS WAF to inspect. See `fieldToMatch` below for details.
     * @return builder
     */
    def fieldToMatch(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. At least one transformation is required. See `textTransformation` below for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchHeaderMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchHeaderMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchCookiesArgs.Builder)
    /**
     * @param matchPatterns The filter to use to identify the subset of cookies to inspect in a web request. You must specify exactly one setting: either `all`, `includedCookies` or `excludedCookies`. More details: [CookieMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_CookieMatchPattern.html)
     * @return builder
     */
    def matchPatterns(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchCookiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternArgs.builder
      builder.matchPatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementArgs.Builder)
    /**
     * @param fieldToMatch The part of a web request that you want AWS WAF to inspect. See `fieldToMatch` below for details.
     * @return builder
     */
    def fieldToMatch(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. At least one transformation is required. See `textTransformation` below for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder)
    /**
     * @param allQueryArguments Inspect all query arguments.
     * @return builder
     */
    def allQueryArguments(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs.builder
      builder.allQueryArguments(args(argsBuilder).build)

    /**
     * @param body Inspect the request body, which immediately follows the request headers. See `body` below for details.
     * @return builder
     */
    def body(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchBodyArgs.builder
      builder.body(args(argsBuilder).build)

    /**
     * @param cookies Inspect the cookies in the web request. See `cookies` below for details.
     * @return builder
     */
    def cookies(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchCookiesArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchCookiesArgs.builder
      builder.cookies(args(argsBuilder).build)

    /**
     * @param headerOrders Inspect a string containing the list of the request&#39;s header names, ordered as they appear in the web request that AWS WAF receives for inspection. See `headerOrder` below for details.
     * @return builder
     */
    def headerOrders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchHeaderOrderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchHeaderOrderArgs.builder
      builder.headerOrders(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Inspect the request headers. See `headers` below for details.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param ja3Fingerprint Inspect the JA3 fingerprint. See `ja3Fingerprint` below for details.
     * @return builder
     */
    def ja3Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchJa3FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchJa3FingerprintArgs.builder
      builder.ja3Fingerprint(args(argsBuilder).build)

    /**
     * @param ja4Fingerprint Inspect the JA3 fingerprint. See `ja4Fingerprint` below for details.
     * @return builder
     */
    def ja4Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchJa4FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchJa4FingerprintArgs.builder
      builder.ja4Fingerprint(args(argsBuilder).build)

    /**
     * @param jsonBody Inspect the request body as JSON. See `jsonBody` for details.
     * @return builder
     */
    def jsonBody(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchJsonBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchJsonBodyArgs.builder
      builder.jsonBody(args(argsBuilder).build)

    /**
     * @param method Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * @return builder
     */
    def method(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchMethodArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchMethodArgs.builder
      builder.method(args(argsBuilder).build)

    /**
     * @param queryString Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * @return builder
     */
    def queryString(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchQueryStringArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchQueryStringArgs.builder
      builder.queryString(args(argsBuilder).build)

    /**
     * @param singleHeader Inspect a single header. See `singleHeader` below for details.
     * @return builder
     */
    def singleHeader(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchSingleHeaderArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchSingleHeaderArgs.builder
      builder.singleHeader(args(argsBuilder).build)

    /**
     * @param singleQueryArgument Inspect a single query argument. See `singleQueryArgument` below for details.
     * @return builder
     */
    def singleQueryArgument(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs.builder
      builder.singleQueryArgument(args(argsBuilder).build)

    /**
     * @param uriFragment Inspect the part of a URL that follows the &#34;#&#34; symbol, providing additional information about the resource. See `uriFragment` below for details.
     * @return builder
     */
    def uriFragment(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchUriFragmentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchUriFragmentArgs.builder
      builder.uriFragment(args(argsBuilder).build)

    /**
     * @param uriPath Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * @return builder
     */
    def uriPath(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchUriPathArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchUriPathArgs.builder
      builder.uriPath(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchJsonBodyArgs.Builder)
    /**
     * @param matchPattern The patterns to look for in the JSON body. You must specify exactly one setting: either `all` or `includedPaths`. See [JsonMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_JsonMatchPattern.html) for details.
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchJsonBodyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchHeaderMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchHeaderMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetRequestInspectionArgs.Builder)
    def addressFields(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetRequestInspectionAddressFieldsArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetRequestInspectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetRequestInspectionAddressFieldsArgs.builder
      builder.addressFields(args(argsBuilder).build)

    def emailField(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetRequestInspectionEmailFieldArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetRequestInspectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetRequestInspectionEmailFieldArgs.builder
      builder.emailField(args(argsBuilder).build)

    /**
     * @param passwordField Details about your login page password field. See `passwordField` for more details.
     * @return builder
     */
    def passwordField(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetRequestInspectionPasswordFieldArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetRequestInspectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetRequestInspectionPasswordFieldArgs.builder
      builder.passwordField(args(argsBuilder).build)

    def phoneNumberFields(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetRequestInspectionPhoneNumberFieldsArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetRequestInspectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetRequestInspectionPhoneNumberFieldsArgs.builder
      builder.phoneNumberFields(args(argsBuilder).build)

    /**
     * @param usernameField Details about your login page username field. See `usernameField` for more details.
     * @return builder
     */
    def usernameField(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetRequestInspectionUsernameFieldArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetRequestInspectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAcfpRuleSetRequestInspectionUsernameFieldArgs.builder
      builder.usernameField(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder)
    /**
     * @param allQueryArguments Inspect all query arguments.
     * @return builder
     */
    def allQueryArguments(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsArgs.builder
      builder.allQueryArguments(args(argsBuilder).build)

    /**
     * @param body Inspect the request body, which immediately follows the request headers.
     * @return builder
     */
    def body(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchBodyArgs.builder
      builder.body(args(argsBuilder).build)

    /**
     * @param cookies Inspect the cookies in the web request. See Cookies below for details.
     * @return builder
     */
    def cookies(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchCookiesArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchCookiesArgs.builder
      builder.cookies(args(argsBuilder).build)

    /**
     * @param headerOrders Inspect the request headers. See Header Order below for details.
     * @return builder
     */
    def headerOrders(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchHeaderOrderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchHeaderOrderArgs.builder
      builder.headerOrders(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Inspect the request headers. See Headers below for details.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param ja3Fingerprint Inspect the JA3 fingerprint. See `ja3Fingerprint` below for details.
     * @return builder
     */
    def ja3Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchJa3FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchJa3FingerprintArgs.builder
      builder.ja3Fingerprint(args(argsBuilder).build)

    /**
     * @param ja4Fingerprint Inspect the JA4 fingerprint. See `ja4Fingerprint` below for details.
     * @return builder
     */
    def ja4Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchJa4FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchJa4FingerprintArgs.builder
      builder.ja4Fingerprint(args(argsBuilder).build)

    /**
     * @param jsonBody Inspect the request body as JSON. See JSON Body for details.
     * @return builder
     */
    def jsonBody(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyArgs.builder
      builder.jsonBody(args(argsBuilder).build)

    /**
     * @param method Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * @return builder
     */
    def method(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchMethodArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchMethodArgs.builder
      builder.method(args(argsBuilder).build)

    /**
     * @param queryString Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * @return builder
     */
    def queryString(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringArgs.builder
      builder.queryString(args(argsBuilder).build)

    /**
     * @param singleHeader Inspect a single header. See Single Header below for details.
     * @return builder
     */
    def singleHeader(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderArgs.builder
      builder.singleHeader(args(argsBuilder).build)

    /**
     * @param singleQueryArgument Inspect a single query argument. See Single Query Argument below for details.
     * @return builder
     */
    def singleQueryArgument(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentArgs.builder
      builder.singleQueryArgument(args(argsBuilder).build)

    /**
     * @param uriFragment Inspect the part of a URL that follows the &#34;#&#34; symbol, providing additional information about the resource. See URI Fragment below for details.
     * @return builder
     */
    def uriFragment(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchUriFragmentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchUriFragmentArgs.builder
      builder.uriFragment(args(argsBuilder).build)

    /**
     * @param uriPath Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * @return builder
     */
    def uriPath(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs.builder
      builder.uriPath(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyQueryStringArgs.Builder)
    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. They are used in rate-based rule statements, to transform request components before using them as custom aggregation keys. Atleast one transformation is required. See `textTransformation` above for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyQueryStringTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyQueryStringArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyQueryStringTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchHeaderMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchHeaderMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyArgs.Builder)
    /**
     * @param asn Use an Autonomous System Number (ASN) derived from the request&#39;s originating or forwarded IP address as an aggregate key. See RateLimit `asn` below for details.
     * @return builder
     */
    def asn(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyAsnArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyAsnArgs.builder
      builder.asn(args(argsBuilder).build)

    /**
     * @param cookie Use the value of a cookie in the request as an aggregate key. See RateLimit `cookie` below for details.
     * @return builder
     */
    def cookie(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyCookieArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyCookieArgs.builder
      builder.cookie(args(argsBuilder).build)

    /**
     * @param forwardedIp Use the first IP address in an HTTP header as an aggregate key. See `forwardedIp` below for details.
     * @return builder
     */
    def forwardedIp(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyForwardedIpArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyForwardedIpArgs.builder
      builder.forwardedIp(args(argsBuilder).build)

    /**
     * @param header Use the value of a header in the request as an aggregate key. See RateLimit `header` below for details.
     * @return builder
     */
    def header(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyHeaderArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyHeaderArgs.builder
      builder.header(args(argsBuilder).build)

    /**
     * @param httpMethod Use the request&#39;s HTTP method as an aggregate key. See RateLimit `httpMethod` below for details.
     * @return builder
     */
    def httpMethod(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyHttpMethodArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyHttpMethodArgs.builder
      builder.httpMethod(args(argsBuilder).build)

    /**
     * @param ip Use the request&#39;s originating IP address as an aggregate key. See `RateLimit ip` below for details.
     * @return builder
     */
    def ip(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyIpArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyIpArgs.builder
      builder.ip(args(argsBuilder).build)

    /**
     * @param ja3Fingerprint Use the JA3 fingerprint in the request as an aggregate key. See `RateLimit ip` below for details.
     * @return builder
     */
    def ja3Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyJa3FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyJa3FingerprintArgs.builder
      builder.ja3Fingerprint(args(argsBuilder).build)

    /**
     * @param ja4Fingerprint Use the JA3 fingerprint in the request as an aggregate key. See `RateLimit ip` below for details.
     * @return builder
     */
    def ja4Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyJa4FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyJa4FingerprintArgs.builder
      builder.ja4Fingerprint(args(argsBuilder).build)

    /**
     * @param labelNamespace Use the specified label namespace as an aggregate key. See RateLimit `labelNamespace` below for details.
     * @return builder
     */
    def labelNamespace(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyLabelNamespaceArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyLabelNamespaceArgs.builder
      builder.labelNamespace(args(argsBuilder).build)

    /**
     * @param queryArgument Use the specified query argument as an aggregate key. See RateLimit `queryArgument` below for details.
     * @return builder
     */
    def queryArgument(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyQueryArgumentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyQueryArgumentArgs.builder
      builder.queryArgument(args(argsBuilder).build)

    /**
     * @param queryString Use the request&#39;s query string as an aggregate key. See RateLimit `queryString` below for details.
     * @return builder
     */
    def queryString(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyQueryStringArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyQueryStringArgs.builder
      builder.queryString(args(argsBuilder).build)

    /**
     * @param uriPath Use the request&#39;s URI path as an aggregate key. See RateLimit `uriPath` below for details.
     * @return builder
     */
    def uriPath(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyUriPathArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyUriPathArgs.builder
      builder.uriPath(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchCookiesArgs.Builder)
    /**
     * @param matchPatterns The filter to use to identify the subset of cookies to inspect in a web request. You must specify exactly one setting: either `all`, `includedCookies` or `excludedCookies`. More details: [CookieMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_CookieMatchPattern.html)
     * @return builder
     */
    def matchPatterns(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchCookiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchCookiesMatchPatternArgs.builder
      builder.matchPatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchHeaderArgs.Builder)
    /**
     * @param matchPattern The filter to use to identify the subset of headers to inspect in a web request. The `matchPattern` block supports only one of the following arguments:
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchHeaderArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchHeaderMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseBlockCustomResponseArgs.Builder)
    /**
     * @param responseHeaders The `responseHeader` blocks used to define the HTTP response headers added to the response. See `responseHeader` below for details.
     * @return builder
     */
    def responseHeaders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseBlockCustomResponseResponseHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseBlockCustomResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseBlockCustomResponseResponseHeaderArgs.builder
      builder.responseHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseArgs.Builder)
    def allow(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseAllowArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseAllowArgs.builder
      builder.allow(args(argsBuilder).build)

    def block(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseBlockArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseBlockArgs.builder
      builder.block(args(argsBuilder).build)

    /**
     * @param captcha Instructs AWS WAF to run a Captcha check against the web request. See `captcha` below for details.
     * @return builder
     */
    def captcha(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseCaptchaArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseCaptchaArgs.builder
      builder.captcha(args(argsBuilder).build)

    def challenge(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseChallengeArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseChallengeArgs.builder
      builder.challenge(args(argsBuilder).build)

    def count(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseCountArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseCountArgs.builder
      builder.count(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideArgs.Builder)
    /**
     * @param actionToUse Override action to use, in place of the configured action of the rule in the rule group. See `action` for details.
     * @return builder
     */
    def actionToUse(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseArgs.builder
      builder.actionToUse(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementGeoMatchStatementArgs.Builder)
    /**
     * @param forwardedIpConfig The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that&#39;s reported by the web request origin. See Forwarded IP Config below for details.
     * @return builder
     */
    def forwardedIpConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementGeoMatchStatementForwardedIpConfigArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementGeoMatchStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementGeoMatchStatementForwardedIpConfigArgs.builder
      builder.forwardedIpConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyQueryStringArgs.Builder)
    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. They are used in rate-based rule statements, to transform request components before using them as custom aggregation keys. Atleast one transformation is required. See Text Transformation above for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyQueryStringTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyQueryStringArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyQueryStringTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchHeaderArgs.Builder)
    /**
     * @param matchPattern The filter to use to identify the subset of headers to inspect in a web request. The `matchPattern` block supports only one of the following arguments:
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchHeaderArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchHeaderMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCountCustomRequestHandlingArgs.Builder)
    /**
     * @param insertHeaders The `insertHeader` blocks used to define HTTP headers added to the request. See `insertHeader` below for details.
     * @return builder
     */
    def insertHeaders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCountCustomRequestHandlingInsertHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCountCustomRequestHandlingArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCountCustomRequestHandlingInsertHeaderArgs.builder
      builder.insertHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementArgs.Builder)
    /**
     * @param statements The statements to combine.
     * @return builder
     */
    def statements(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementArgs.builder
      builder.statements(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionArgs.Builder)
    /**
     * @param bodyContains Configures inspection of the response body. See `bodyContains` for more details.
     * @return builder
     */
    def bodyContains(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionBodyContainsArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionBodyContainsArgs.builder
      builder.bodyContains(args(argsBuilder).build)

    /**
     * @param header Configures inspection of the response header.See `header` for more details.
     * @return builder
     */
    def header(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionHeaderArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionHeaderArgs.builder
      builder.header(args(argsBuilder).build)

    /**
     * @param json Configures inspection of the response JSON. See `json` for more details.
     * @return builder
     */
    def json(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionJsonArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionJsonArgs.builder
      builder.json(args(argsBuilder).build)

    /**
     * @param statusCode Configures inspection of the response status code.See `statusCode` for more details.
     * @return builder
     */
    def statusCode(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionStatusCodeArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetResponseInspectionStatusCodeArgs.builder
      builder.statusCode(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementArgs.Builder)
    /**
     * @param andStatement Logical rule statement used to combine other rule statements with AND logic. See `andStatement` below for details.
     * @return builder
     */
    def andStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementArgs.builder
      builder.andStatement(args(argsBuilder).build)

    /**
     * @param asnMatchStatement Rule statement that inspects web traffic based on the Autonomous System Number (ASN) associated with the request&#39;s IP address. See `asnMatchStatement` below for details.
     * @return builder
     */
    def asnMatchStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementAsnMatchStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementAsnMatchStatementArgs.builder
      builder.asnMatchStatement(args(argsBuilder).build)

    /**
     * @param byteMatchStatement Rule statement that defines a string match search for AWS WAF to apply to web requests. See `byteMatchStatement` below for details.
     * @return builder
     */
    def byteMatchStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementArgs.builder
      builder.byteMatchStatement(args(argsBuilder).build)

    /**
     * @param geoMatchStatement Rule statement used to identify web requests based on country of origin. See `geoMatchStatement` below for details.
     * @return builder
     */
    def geoMatchStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementGeoMatchStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementGeoMatchStatementArgs.builder
      builder.geoMatchStatement(args(argsBuilder).build)

    /**
     * @param ipSetReferenceStatement Rule statement used to detect web requests coming from particular IP addresses or address ranges. See `ipSetReferenceStatement` below for details.
     * @return builder
     */
    def ipSetReferenceStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementIpSetReferenceStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementIpSetReferenceStatementArgs.builder
      builder.ipSetReferenceStatement(args(argsBuilder).build)

    /**
     * @param labelMatchStatement Rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See `labelMatchStatement` below for details.
     * @return builder
     */
    def labelMatchStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementLabelMatchStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementLabelMatchStatementArgs.builder
      builder.labelMatchStatement(args(argsBuilder).build)

    /**
     * @param notStatement Logical rule statement used to negate the results of another rule statement. See `notStatement` below for details.
     * @return builder
     */
    def notStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementArgs.builder
      builder.notStatement(args(argsBuilder).build)

    /**
     * @param orStatement Logical rule statement used to combine other rule statements with OR logic. See `orStatement` below for details.
     * @return builder
     */
    def orStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementArgs.builder
      builder.orStatement(args(argsBuilder).build)

    /**
     * @param regexMatchStatement Rule statement used to search web request components for a match against a single regular expression. See `regexMatchStatement` below for details.
     * @return builder
     */
    def regexMatchStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementArgs.builder
      builder.regexMatchStatement(args(argsBuilder).build)

    /**
     * @param regexPatternSetReferenceStatement Rule statement used to search web request components for matches with regular expressions. See `regexPatternSetReferenceStatement` below for details.
     * @return builder
     */
    def regexPatternSetReferenceStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementArgs.builder
      builder.regexPatternSetReferenceStatement(args(argsBuilder).build)

    /**
     * @param sizeConstraintStatement Rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See `sizeConstraintStatement` below for more details.
     * @return builder
     */
    def sizeConstraintStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementArgs.builder
      builder.sizeConstraintStatement(args(argsBuilder).build)

    /**
     * @param sqliMatchStatement An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See `sqliMatchStatement` below for details.
     * @return builder
     */
    def sqliMatchStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementArgs.builder
      builder.sqliMatchStatement(args(argsBuilder).build)

    /**
     * @param xssMatchStatement Rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See `xssMatchStatement` below for details.
     * @return builder
     */
    def xssMatchStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementArgs.builder
      builder.xssMatchStatement(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchCookiesArgs.Builder)
    /**
     * @param matchPatterns The filter to use to identify the subset of cookies to inspect in a web request. You must specify exactly one setting: either `all`, `includedCookies` or `excludedCookies`. More details: [CookieMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_CookieMatchPattern.html)
     * @return builder
     */
    def matchPatterns(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchCookiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchCookiesMatchPatternArgs.builder
      builder.matchPatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementArgs.Builder)
    /**
     * @param fieldToMatch Part of a web request that you want AWS WAF to inspect. See `fieldToMatch` below for details.
     * @return builder
     */
    def fieldToMatch(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. At least one transformation is required. See `textTransformation` below for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceArgs.Builder)
    /**
     * @param ruleActionOverrides Override actions for specific rules within the rule group. See below.
     * @return builder
     */
    def ruleActionOverrides(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideArgs.builder
      builder.ruleActionOverrides(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseArgs.Builder)
    /**
     * @param allow Allow the request. See below.
     * @return builder
     */
    def allow(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseAllowArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseAllowArgs.builder
      builder.allow(args(argsBuilder).build)

    /**
     * @param block Block the request. See below.
     * @return builder
     */
    def block(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseBlockArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseBlockArgs.builder
      builder.block(args(argsBuilder).build)

    /**
     * @param captcha Require CAPTCHA verification. See below.
     * @return builder
     */
    def captcha(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseCaptchaArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseCaptchaArgs.builder
      builder.captcha(args(argsBuilder).build)

    /**
     * @param challenge Require challenge verification. See below.
     * @return builder
     */
    def challenge(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseChallengeArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseChallengeArgs.builder
      builder.challenge(args(argsBuilder).build)

    /**
     * @param count Count the request without taking action. See below.
     * @return builder
     */
    def count(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseCountArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseCountArgs.builder
      builder.count(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchJsonBodyArgs.Builder)
    /**
     * @param matchPattern The patterns to look for in the JSON body. You must specify exactly one setting: either `all` or `includedPaths`. See [JsonMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_JsonMatchPattern.html) for details.
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchJsonBodyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchJsonBodyMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationState.Builder)
    /**
     * @param managedRuleGroup Managed Rule Group configuration. One of `ruleGroupReference` or `managedRuleGroup` is required. Conflicts with `ruleGroupReference`. See below.
     * @return builder
     */
    def managedRuleGroup(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationState.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupArgs.builder
      builder.managedRuleGroup(args(argsBuilder).build)

    /**
     * @param ruleGroupReference Custom Rule Group reference configuration. One of `ruleGroupReference` or `managedRuleGroup` is required. Conflicts with `managedRuleGroup`. See below.
     * @return builder
     */
    def ruleGroupReference(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationState.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceArgs.builder
      builder.ruleGroupReference(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationState.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionBlockArgs.Builder)
    /**
     * @param customResponse Defines a custom response for the web request. See Custom Response below for details.
     * @return builder
     */
    def customResponse(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionBlockCustomResponseArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionBlockArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionBlockCustomResponseArgs.builder
      builder.customResponse(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseAllowCustomRequestHandlingArgs.Builder)
    /**
     * @param insertHeaders Headers to insert into the request. See below.
     * @return builder
     */
    def insertHeaders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseAllowCustomRequestHandlingInsertHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseAllowCustomRequestHandlingArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseAllowCustomRequestHandlingInsertHeaderArgs.builder
      builder.insertHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyArgs.Builder)
    /**
     * @param matchPattern The patterns to look for in the JSON body. You must specify exactly one setting: either `all` or `includedPaths`. See [JsonMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_JsonMatchPattern.html) for details.
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseChallengeCustomRequestHandlingArgs.Builder)
    /**
     * @param insertHeaders The `insertHeader` blocks used to define HTTP headers added to the request. See `insertHeader` below for details.
     * @return builder
     */
    def insertHeaders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseChallengeCustomRequestHandlingInsertHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseChallengeCustomRequestHandlingArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseChallengeCustomRequestHandlingInsertHeaderArgs.builder
      builder.insertHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseBlockCustomResponseArgs.Builder)
    /**
     * @param responseHeaders Headers to include in the response. See below.
     * @return builder
     */
    def responseHeaders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseBlockCustomResponseResponseHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseBlockCustomResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseBlockCustomResponseResponseHeaderArgs.builder
      builder.responseHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetRequestInspectionArgs.Builder)
    /**
     * @param passwordField Details about your login page password field. See `passwordField` for more details.
     * @return builder
     */
    def passwordField(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetRequestInspectionPasswordFieldArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetRequestInspectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetRequestInspectionPasswordFieldArgs.builder
      builder.passwordField(args(argsBuilder).build)

    /**
     * @param usernameField Details about your login page username field. See `usernameField` for more details.
     * @return builder
     */
    def usernameField(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetRequestInspectionUsernameFieldArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetRequestInspectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigAwsManagedRulesAtpRuleSetRequestInspectionUsernameFieldArgs.builder
      builder.usernameField(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchJsonBodyArgs.Builder)
    /**
     * @param matchPattern The patterns to look for in the JSON body. You must specify exactly one setting: either `all` or `includedPaths`. See [JsonMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_JsonMatchPattern.html) for details.
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchJsonBodyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyHeaderArgs.Builder)
    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. They are used in rate-based rule statements, to transform request components before using them as custom aggregation keys. Atleast one transformation is required. See Text Transformation above for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyHeaderTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyHeaderArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyHeaderTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleActionBlockCustomResponseArgs.Builder)
    /**
     * @param responseHeaders The `responseHeader` blocks used to define the HTTP response headers added to the response. See `responseHeader` below for details.
     * @return builder
     */
    def responseHeaders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleActionBlockCustomResponseResponseHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleActionBlockCustomResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleActionBlockCustomResponseResponseHeaderArgs.builder
      builder.responseHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleOverrideActionArgs.Builder)
    /**
     * @param count Override the rule action setting to count (i.e., only count matches). Configured as an empty block `{}`.
     * @return builder
     */
    def count(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleOverrideActionCountArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleOverrideActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleOverrideActionCountArgs.builder
      builder.count(args(argsBuilder).build)

    /**
     * @param none Don&#39;t override the rule action setting. Configured as an empty block `{}`.
     * @return builder
     */
    def none(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleOverrideActionNoneArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleOverrideActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleOverrideActionNoneArgs.builder
      builder.none(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchCookiesMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchCookiesMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchArgs.Builder)
    /**
     * @param allQueryArguments Inspect all query arguments.
     * @return builder
     */
    def allQueryArguments(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchAllQueryArgumentsArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchAllQueryArgumentsArgs.builder
      builder.allQueryArguments(args(argsBuilder).build)

    /**
     * @param body Inspect the request body, which immediately follows the request headers.
     * @return builder
     */
    def body(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchBodyArgs.builder
      builder.body(args(argsBuilder).build)

    /**
     * @param cookies Inspect the cookies in the web request. See Cookies below for details.
     * @return builder
     */
    def cookies(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchCookiesArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchCookiesArgs.builder
      builder.cookies(args(argsBuilder).build)

    /**
     * @param headerOrders Inspect the request headers. See Header Order below for details.
     * @return builder
     */
    def headerOrders(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchHeaderOrderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchHeaderOrderArgs.builder
      builder.headerOrders(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Inspect the request headers. See Headers below for details.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param ja3Fingerprint Inspect the JA3 fingerprint. See `ja3Fingerprint` below for details.
     * @return builder
     */
    def ja3Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchJa3FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchJa3FingerprintArgs.builder
      builder.ja3Fingerprint(args(argsBuilder).build)

    /**
     * @param ja4Fingerprint Inspect the JA4 fingerprint. See `ja4Fingerprint` below for details.
     * @return builder
     */
    def ja4Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchJa4FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchJa4FingerprintArgs.builder
      builder.ja4Fingerprint(args(argsBuilder).build)

    /**
     * @param jsonBody Inspect the request body as JSON. See JSON Body for details.
     * @return builder
     */
    def jsonBody(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchJsonBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchJsonBodyArgs.builder
      builder.jsonBody(args(argsBuilder).build)

    /**
     * @param method Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * @return builder
     */
    def method(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchMethodArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchMethodArgs.builder
      builder.method(args(argsBuilder).build)

    /**
     * @param queryString Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * @return builder
     */
    def queryString(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchQueryStringArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchQueryStringArgs.builder
      builder.queryString(args(argsBuilder).build)

    /**
     * @param singleHeader Inspect a single header. See Single Header below for details.
     * @return builder
     */
    def singleHeader(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchSingleHeaderArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchSingleHeaderArgs.builder
      builder.singleHeader(args(argsBuilder).build)

    /**
     * @param singleQueryArgument Inspect a single query argument. See Single Query Argument below for details.
     * @return builder
     */
    def singleQueryArgument(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchSingleQueryArgumentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchSingleQueryArgumentArgs.builder
      builder.singleQueryArgument(args(argsBuilder).build)

    /**
     * @param uriFragment Inspect the part of a URL that follows the &#34;#&#34; symbol, providing additional information about the resource. See URI Fragment below for details.
     * @return builder
     */
    def uriFragment(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchUriFragmentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchUriFragmentArgs.builder
      builder.uriFragment(args(argsBuilder).build)

    /**
     * @param uriPath Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * @return builder
     */
    def uriPath(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchUriPathArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchUriPathArgs.builder
      builder.uriPath(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionAllowCustomRequestHandlingArgs.Builder)
    /**
     * @param insertHeaders The `insertHeader` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
     * @return builder
     */
    def insertHeaders(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionAllowCustomRequestHandlingInsertHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionAllowCustomRequestHandlingArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionAllowCustomRequestHandlingInsertHeaderArgs.builder
      builder.insertHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclDataProtectionConfigDataProtectionArgs.Builder)
    /**
     * @param field Specifies the field type and optional keys to apply the protection behavior to. See `field` block below for details.
     * @return builder
     */
    def field(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclDataProtectionConfigDataProtectionFieldArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclDataProtectionConfigDataProtectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclDataProtectionConfigDataProtectionFieldArgs.builder
      builder.field(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchHeaderArgs.Builder)
    /**
     * @param matchPattern The filter to use to identify the subset of headers to inspect in a web request. The `matchPattern` block supports only one of the following arguments:
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchHeaderArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchHeaderMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchArgs.Builder)
    /**
     * @param allQueryArguments Inspect all query arguments.
     * @return builder
     */
    def allQueryArguments(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs.builder
      builder.allQueryArguments(args(argsBuilder).build)

    /**
     * @param body Inspect the request body, which immediately follows the request headers. See `body` below for details.
     * @return builder
     */
    def body(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchBodyArgs.builder
      builder.body(args(argsBuilder).build)

    /**
     * @param cookies Inspect the cookies in the web request. See `cookies` below for details.
     * @return builder
     */
    def cookies(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchCookiesArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchCookiesArgs.builder
      builder.cookies(args(argsBuilder).build)

    /**
     * @param headerOrders Inspect a string containing the list of the request&#39;s header names, ordered as they appear in the web request that AWS WAF receives for inspection. See `headerOrder` below for details.
     * @return builder
     */
    def headerOrders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchHeaderOrderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchHeaderOrderArgs.builder
      builder.headerOrders(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Inspect the request headers. See `headers` below for details.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param ja3Fingerprint Inspect the JA3 fingerprint. See `ja3Fingerprint` below for details.
     * @return builder
     */
    def ja3Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchJa3FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchJa3FingerprintArgs.builder
      builder.ja3Fingerprint(args(argsBuilder).build)

    /**
     * @param ja4Fingerprint Inspect the JA3 fingerprint. See `ja4Fingerprint` below for details.
     * @return builder
     */
    def ja4Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchJa4FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchJa4FingerprintArgs.builder
      builder.ja4Fingerprint(args(argsBuilder).build)

    /**
     * @param jsonBody Inspect the request body as JSON. See `jsonBody` for details.
     * @return builder
     */
    def jsonBody(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchJsonBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchJsonBodyArgs.builder
      builder.jsonBody(args(argsBuilder).build)

    /**
     * @param method Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * @return builder
     */
    def method(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchMethodArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchMethodArgs.builder
      builder.method(args(argsBuilder).build)

    /**
     * @param queryString Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * @return builder
     */
    def queryString(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchQueryStringArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchQueryStringArgs.builder
      builder.queryString(args(argsBuilder).build)

    /**
     * @param singleHeader Inspect a single header. See `singleHeader` below for details.
     * @return builder
     */
    def singleHeader(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchSingleHeaderArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchSingleHeaderArgs.builder
      builder.singleHeader(args(argsBuilder).build)

    /**
     * @param singleQueryArgument Inspect a single query argument. See `singleQueryArgument` below for details.
     * @return builder
     */
    def singleQueryArgument(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs.builder
      builder.singleQueryArgument(args(argsBuilder).build)

    /**
     * @param uriFragment Inspect the part of a URL that follows the &#34;#&#34; symbol, providing additional information about the resource. See `uriFragment` below for details.
     * @return builder
     */
    def uriFragment(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchUriFragmentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchUriFragmentArgs.builder
      builder.uriFragment(args(argsBuilder).build)

    /**
     * @param uriPath Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * @return builder
     */
    def uriPath(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchUriPathArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchUriPathArgs.builder
      builder.uriPath(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchJsonBodyArgs.Builder)
    /**
     * @param matchPattern The patterns to look for in the JSON body. You must specify exactly one setting: either `all` or `includedPaths`. See [JsonMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_JsonMatchPattern.html) for details.
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchJsonBodyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideArgs.Builder)
    /**
     * @param actionToUse Action to use instead of the rule&#39;s original action. See below.
     * @return builder
     */
    def actionToUse(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseArgs.builder
      builder.actionToUse(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementArgs.Builder)
    /**
     * @param statements The statements to combine.
     * @return builder
     */
    def statements(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementArgs.builder
      builder.statements(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchHeaderArgs.Builder)
    /**
     * @param matchPattern The filter to use to identify the subset of headers to inspect in a web request. The `matchPattern` block supports only one of the following arguments:
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchHeaderArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideArgs.Builder)
    /**
     * @param actionToUse Action to use instead of the rule&#39;s original action. See below.
     * @return builder
     */
    def actionToUse(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseArgs.builder
      builder.actionToUse(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseCaptchaCustomRequestHandlingArgs.Builder)
    /**
     * @param insertHeaders The `insertHeader` blocks used to define HTTP headers added to the request. See `insertHeader` below for details.
     * @return builder
     */
    def insertHeaders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseCaptchaCustomRequestHandlingInsertHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseCaptchaCustomRequestHandlingArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseCaptchaCustomRequestHandlingInsertHeaderArgs.builder
      builder.insertHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementArgs.Builder)
    /**
     * @param fieldToMatch The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * @return builder
     */
    def fieldToMatch(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
     *  At least one required.
     *  See Text Transformation below for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementArgs.Builder)
    /**
     * @param fieldToMatch The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * @return builder
     */
    def fieldToMatch(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
     *  At least one required.
     *  See Text Transformation below for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseCountArgs.Builder)
    /**
     * @param customRequestHandling Custom handling for counted requests. See below.
     * @return builder
     */
    def customRequestHandling(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseCountCustomRequestHandlingArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseCountArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseCountCustomRequestHandlingArgs.builder
      builder.customRequestHandling(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclAssociationConfigArgs.Builder)
    /**
     * @param requestBodies Customizes the request body that your protected resource forward to AWS WAF for inspection. See `requestBody` below for details.
     * @return builder
     */
    def requestBodies(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclAssociationConfigRequestBodyArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclAssociationConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclAssociationConfigRequestBodyArgs.builder
      builder.requestBodies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchHeaderArgs.Builder)
    /**
     * @param matchPattern The filter to use to identify the subset of headers to inspect in a web request. The `matchPattern` block supports only one of the following arguments:
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchHeaderArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchHeaderMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementArgs.Builder)
    /**
     * @param fieldToMatch Part of a web request that you want AWS WAF to inspect. See `fieldToMatch` below for details.
     * @return builder
     */
    def fieldToMatch(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. At least one transformation is required. See `textTransformation` below for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseAllowArgs.Builder)
    /**
     * @param customRequestHandling Custom handling for allowed requests. See below.
     * @return builder
     */
    def customRequestHandling(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseAllowCustomRequestHandlingArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseAllowArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseAllowCustomRequestHandlingArgs.builder
      builder.customRequestHandling(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleChallengeConfigArgs.Builder)
    /**
     * @param immunityTimeProperty Defines custom immunity time. See `immunityTimeProperty` below for details.
     * @return builder
     */
    def immunityTimeProperty(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleChallengeConfigImmunityTimePropertyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleChallengeConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleChallengeConfigImmunityTimePropertyArgs.builder
      builder.immunityTimeProperty(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementArgs.Builder)
    /**
     * @param fieldToMatch Part of a web request that you want AWS WAF to inspect. See `fieldToMatch` below for details.
     * @return builder
     */
    def fieldToMatch(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. At least one transformation is required. See `textTransformation` below for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseCountCustomRequestHandlingArgs.Builder)
    /**
     * @param insertHeaders Headers to insert into the request. See below.
     * @return builder
     */
    def insertHeaders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseCountCustomRequestHandlingInsertHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseCountCustomRequestHandlingArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseCountCustomRequestHandlingInsertHeaderArgs.builder
      builder.insertHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchHeaderMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchHeaderMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchJsonBodyArgs.Builder)
    /**
     * @param matchPattern The patterns to look for in the JSON body. You must specify exactly one setting: either `all` or `includedPaths`. See [JsonMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_JsonMatchPattern.html) for details.
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchJsonBodyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchHeaderMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchHeaderMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchCookiesMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchCookiesMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder)
    /**
     * @param allQueryArguments Inspect all query arguments.
     * @return builder
     */
    def allQueryArguments(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchAllQueryArgumentsArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchAllQueryArgumentsArgs.builder
      builder.allQueryArguments(args(argsBuilder).build)

    /**
     * @param body Inspect the request body, which immediately follows the request headers. See `body` below for details.
     * @return builder
     */
    def body(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchBodyArgs.builder
      builder.body(args(argsBuilder).build)

    /**
     * @param cookies Inspect the cookies in the web request. See `cookies` below for details.
     * @return builder
     */
    def cookies(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesArgs.builder
      builder.cookies(args(argsBuilder).build)

    /**
     * @param headerOrders Inspect a string containing the list of the request&#39;s header names, ordered as they appear in the web request that AWS WAF receives for inspection. See `headerOrder` below for details.
     * @return builder
     */
    def headerOrders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchHeaderOrderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchHeaderOrderArgs.builder
      builder.headerOrders(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Inspect the request headers. See `headers` below for details.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param ja3Fingerprint Inspect the JA3 fingerprint. See `ja3Fingerprint` below for details.
     * @return builder
     */
    def ja3Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchJa3FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchJa3FingerprintArgs.builder
      builder.ja3Fingerprint(args(argsBuilder).build)

    /**
     * @param ja4Fingerprint Inspect the JA3 fingerprint. See `ja4Fingerprint` below for details.
     * @return builder
     */
    def ja4Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchJa4FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchJa4FingerprintArgs.builder
      builder.ja4Fingerprint(args(argsBuilder).build)

    /**
     * @param jsonBody Inspect the request body as JSON. See `jsonBody` for details.
     * @return builder
     */
    def jsonBody(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyArgs.builder
      builder.jsonBody(args(argsBuilder).build)

    /**
     * @param method Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * @return builder
     */
    def method(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchMethodArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchMethodArgs.builder
      builder.method(args(argsBuilder).build)

    /**
     * @param queryString Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * @return builder
     */
    def queryString(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchQueryStringArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchQueryStringArgs.builder
      builder.queryString(args(argsBuilder).build)

    /**
     * @param singleHeader Inspect a single header. See `singleHeader` below for details.
     * @return builder
     */
    def singleHeader(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchSingleHeaderArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchSingleHeaderArgs.builder
      builder.singleHeader(args(argsBuilder).build)

    /**
     * @param singleQueryArgument Inspect a single query argument. See `singleQueryArgument` below for details.
     * @return builder
     */
    def singleQueryArgument(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchSingleQueryArgumentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchSingleQueryArgumentArgs.builder
      builder.singleQueryArgument(args(argsBuilder).build)

    /**
     * @param uriFragment Inspect the part of a URL that follows the &#34;#&#34; symbol, providing additional information about the resource. See `uriFragment` below for details.
     * @return builder
     */
    def uriFragment(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchUriFragmentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchUriFragmentArgs.builder
      builder.uriFragment(args(argsBuilder).build)

    /**
     * @param uriPath Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * @return builder
     */
    def uriPath(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchUriPathArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchUriPathArgs.builder
      builder.uriPath(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchHeaderMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchHeaderMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchCookiesArgs.Builder)
    /**
     * @param matchPatterns The filter to use to identify the subset of cookies to inspect in a web request. You must specify exactly one setting: either `all`, `includedCookies` or `excludedCookies`. More details: [CookieMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_CookieMatchPattern.html)
     * @return builder
     */
    def matchPatterns(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchCookiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchCookiesMatchPatternArgs.builder
      builder.matchPatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchHeaderMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchHeaderMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyArgs.Builder)
    /**
     * @param matchPattern The patterns to look for in the JSON body. You must specify exactly one setting: either `all` or `includedPaths`. See [JsonMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_JsonMatchPattern.html) for details.
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchCookiesArgs.Builder)
    /**
     * @param matchPatterns The filter to use to identify the subset of cookies to inspect in a web request. You must specify exactly one setting: either `all`, `includedCookies` or `excludedCookies`. More details: [CookieMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_CookieMatchPattern.html)
     * @return builder
     */
    def matchPatterns(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchCookiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchCookiesMatchPatternArgs.builder
      builder.matchPatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementArgs.Builder)
    /**
     * @param fieldToMatch Part of a web request that you want AWS WAF to inspect. See `fieldToMatch` below for details.
     * @return builder
     */
    def fieldToMatch(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. At least one transformation is required. See `textTransformation` below for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyArgs.Builder)
    /**
     * @param matchPattern The patterns to look for in the JSON body. You must specify exactly one setting: either `all` or `includedPaths`. See [JsonMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_JsonMatchPattern.html) for details.
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchCookiesArgs.Builder)
    /**
     * @param matchPatterns The filter to use to identify the subset of cookies to inspect in a web request. You must specify exactly one setting: either `all`, `includedCookies` or `excludedCookies`. More details: [CookieMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_CookieMatchPattern.html)
     * @return builder
     */
    def matchPatterns(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchCookiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchCookiesMatchPatternArgs.builder
      builder.matchPatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchHeaderArgs.Builder)
    /**
     * @param matchPattern The filter to use to identify the subset of headers to inspect in a web request. The `matchPattern` block supports only one of the following arguments:
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchHeaderArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementFieldToMatchHeaderMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder)
    /**
     * @param allQueryArguments Inspect all query arguments.
     * @return builder
     */
    def allQueryArguments(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs.builder
      builder.allQueryArguments(args(argsBuilder).build)

    /**
     * @param body Inspect the request body, which immediately follows the request headers. See `body` below for details.
     * @return builder
     */
    def body(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchBodyArgs.builder
      builder.body(args(argsBuilder).build)

    /**
     * @param cookies Inspect the cookies in the web request. See `cookies` below for details.
     * @return builder
     */
    def cookies(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchCookiesArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchCookiesArgs.builder
      builder.cookies(args(argsBuilder).build)

    /**
     * @param headerOrders Inspect a string containing the list of the request&#39;s header names, ordered as they appear in the web request that AWS WAF receives for inspection. See `headerOrder` below for details.
     * @return builder
     */
    def headerOrders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchHeaderOrderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchHeaderOrderArgs.builder
      builder.headerOrders(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Inspect the request headers. See `headers` below for details.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param ja3Fingerprint Inspect the JA3 fingerprint. See `ja3Fingerprint` below for details.
     * @return builder
     */
    def ja3Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchJa3FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchJa3FingerprintArgs.builder
      builder.ja3Fingerprint(args(argsBuilder).build)

    /**
     * @param ja4Fingerprint Inspect the JA3 fingerprint. See `ja4Fingerprint` below for details.
     * @return builder
     */
    def ja4Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchJa4FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchJa4FingerprintArgs.builder
      builder.ja4Fingerprint(args(argsBuilder).build)

    /**
     * @param jsonBody Inspect the request body as JSON. See `jsonBody` for details.
     * @return builder
     */
    def jsonBody(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchJsonBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchJsonBodyArgs.builder
      builder.jsonBody(args(argsBuilder).build)

    /**
     * @param method Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * @return builder
     */
    def method(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchMethodArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchMethodArgs.builder
      builder.method(args(argsBuilder).build)

    /**
     * @param queryString Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * @return builder
     */
    def queryString(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchQueryStringArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchQueryStringArgs.builder
      builder.queryString(args(argsBuilder).build)

    /**
     * @param singleHeader Inspect a single header. See `singleHeader` below for details.
     * @return builder
     */
    def singleHeader(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs.builder
      builder.singleHeader(args(argsBuilder).build)

    /**
     * @param singleQueryArgument Inspect a single query argument. See `singleQueryArgument` below for details.
     * @return builder
     */
    def singleQueryArgument(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs.builder
      builder.singleQueryArgument(args(argsBuilder).build)

    /**
     * @param uriFragment Inspect the part of a URL that follows the &#34;#&#34; symbol, providing additional information about the resource. See `uriFragment` below for details.
     * @return builder
     */
    def uriFragment(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchUriFragmentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchUriFragmentArgs.builder
      builder.uriFragment(args(argsBuilder).build)

    /**
     * @param uriPath Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * @return builder
     */
    def uriPath(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchUriPathArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchUriPathArgs.builder
      builder.uriPath(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleActionChallengeArgs.Builder)
    /**
     * @param customRequestHandling Defines custom handling for the web request. See `customRequestHandling` below for details.
     * @return builder
     */
    def customRequestHandling(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleActionChallengeCustomRequestHandlingArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleActionChallengeArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleActionChallengeCustomRequestHandlingArgs.builder
      builder.customRequestHandling(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementGeoMatchStatementArgs.Builder)
    /**
     * @param forwardedIpConfig Configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that&#39;s reported by the web request origin. See `forwardedIpConfig` below for details.
     * @return builder
     */
    def forwardedIpConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementGeoMatchStatementForwardedIpConfigArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementGeoMatchStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementGeoMatchStatementForwardedIpConfigArgs.builder
      builder.forwardedIpConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchHeaderMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchHeaderMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementArgs.Builder)
    /**
     * @param managedRuleGroupConfigs Additional information that&#39;s used by a managed rule group. Only one rule attribute is allowed in each config. See `managedRuleGroupConfigs` for more details
     * @return builder
     */
    def managedRuleGroupConfigs(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementManagedRuleGroupConfigArgs.builder
      builder.managedRuleGroupConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param ruleActionOverrides Action settings to use in the place of the rule actions that are configured inside the rule group. You specify one override for each rule whose action you want to change. See `ruleActionOverride` below for details.
     * @return builder
     */
    def ruleActionOverrides(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideArgs.builder
      builder.ruleActionOverrides(args.map(_(argsBuilder).build)*)

    /**
     * @param scopeDownStatement Narrows the scope of the statement to matching web requests. This can be any nestable statement, and you can nest statements at any level below this scope-down statement. See `statement` above for details.
     * @return builder
     */
    def scopeDownStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementArgs.builder
      builder.scopeDownStatement(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchHeaderArgs.Builder)
    /**
     * @param matchPattern The filter to use to identify the subset of headers to inspect in a web request. The `matchPattern` block supports only one of the following arguments:
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchHeaderArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchHeaderMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder)
    /**
     * @param allQueryArguments Inspect all query arguments.
     * @return builder
     */
    def allQueryArguments(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs.builder
      builder.allQueryArguments(args(argsBuilder).build)

    /**
     * @param body Inspect the request body, which immediately follows the request headers. See `body` below for details.
     * @return builder
     */
    def body(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchBodyArgs.builder
      builder.body(args(argsBuilder).build)

    /**
     * @param cookies Inspect the cookies in the web request. See `cookies` below for details.
     * @return builder
     */
    def cookies(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchCookiesArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchCookiesArgs.builder
      builder.cookies(args(argsBuilder).build)

    /**
     * @param headerOrders Inspect a string containing the list of the request&#39;s header names, ordered as they appear in the web request that AWS WAF receives for inspection. See `headerOrder` below for details.
     * @return builder
     */
    def headerOrders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchHeaderOrderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchHeaderOrderArgs.builder
      builder.headerOrders(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Inspect the request headers. See `headers` below for details.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param ja3Fingerprint Inspect the JA3 fingerprint. See `ja3Fingerprint` below for details.
     * @return builder
     */
    def ja3Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchJa3FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchJa3FingerprintArgs.builder
      builder.ja3Fingerprint(args(argsBuilder).build)

    /**
     * @param ja4Fingerprint Inspect the JA3 fingerprint. See `ja4Fingerprint` below for details.
     * @return builder
     */
    def ja4Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchJa4FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchJa4FingerprintArgs.builder
      builder.ja4Fingerprint(args(argsBuilder).build)

    /**
     * @param jsonBody Inspect the request body as JSON. See `jsonBody` for details.
     * @return builder
     */
    def jsonBody(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchJsonBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchJsonBodyArgs.builder
      builder.jsonBody(args(argsBuilder).build)

    /**
     * @param method Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * @return builder
     */
    def method(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchMethodArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchMethodArgs.builder
      builder.method(args(argsBuilder).build)

    /**
     * @param queryString Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * @return builder
     */
    def queryString(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchQueryStringArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchQueryStringArgs.builder
      builder.queryString(args(argsBuilder).build)

    /**
     * @param singleHeader Inspect a single header. See `singleHeader` below for details.
     * @return builder
     */
    def singleHeader(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs.builder
      builder.singleHeader(args(argsBuilder).build)

    /**
     * @param singleQueryArgument Inspect a single query argument. See `singleQueryArgument` below for details.
     * @return builder
     */
    def singleQueryArgument(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs.builder
      builder.singleQueryArgument(args(argsBuilder).build)

    /**
     * @param uriFragment Inspect the part of a URL that follows the &#34;#&#34; symbol, providing additional information about the resource. See `uriFragment` below for details.
     * @return builder
     */
    def uriFragment(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchUriFragmentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchUriFragmentArgs.builder
      builder.uriFragment(args(argsBuilder).build)

    /**
     * @param uriPath Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * @return builder
     */
    def uriPath(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchUriPathArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchUriPathArgs.builder
      builder.uriPath(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchJsonBodyArgs.Builder)
    /**
     * @param matchPattern The patterns to look for in the JSON body. You must specify exactly one setting: either `all` or `includedPaths`. See [JsonMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_JsonMatchPattern.html) for details.
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchJsonBodyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementNotStatementArgs.Builder)
    /**
     * @param statements The statements to combine.
     * @return builder
     */
    def statements(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementNotStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementArgs.builder
      builder.statements(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder)
    /**
     * @param allQueryArguments Inspect all query arguments.
     * @return builder
     */
    def allQueryArguments(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsArgs.builder
      builder.allQueryArguments(args(argsBuilder).build)

    /**
     * @param body Inspect the request body, which immediately follows the request headers. See `body` below for details.
     * @return builder
     */
    def body(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchBodyArgs.builder
      builder.body(args(argsBuilder).build)

    /**
     * @param cookies Inspect the cookies in the web request. See `cookies` below for details.
     * @return builder
     */
    def cookies(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchCookiesArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchCookiesArgs.builder
      builder.cookies(args(argsBuilder).build)

    /**
     * @param headerOrders Inspect a string containing the list of the request&#39;s header names, ordered as they appear in the web request that AWS WAF receives for inspection. See `headerOrder` below for details.
     * @return builder
     */
    def headerOrders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchHeaderOrderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchHeaderOrderArgs.builder
      builder.headerOrders(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Inspect the request headers. See `headers` below for details.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param ja3Fingerprint Inspect the JA3 fingerprint. See `ja3Fingerprint` below for details.
     * @return builder
     */
    def ja3Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJa3FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJa3FingerprintArgs.builder
      builder.ja3Fingerprint(args(argsBuilder).build)

    /**
     * @param ja4Fingerprint Inspect the JA3 fingerprint. See `ja4Fingerprint` below for details.
     * @return builder
     */
    def ja4Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJa4FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJa4FingerprintArgs.builder
      builder.ja4Fingerprint(args(argsBuilder).build)

    /**
     * @param jsonBody Inspect the request body as JSON. See `jsonBody` for details.
     * @return builder
     */
    def jsonBody(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyArgs.builder
      builder.jsonBody(args(argsBuilder).build)

    /**
     * @param method Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * @return builder
     */
    def method(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchMethodArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchMethodArgs.builder
      builder.method(args(argsBuilder).build)

    /**
     * @param queryString Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * @return builder
     */
    def queryString(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringArgs.builder
      builder.queryString(args(argsBuilder).build)

    /**
     * @param singleHeader Inspect a single header. See `singleHeader` below for details.
     * @return builder
     */
    def singleHeader(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderArgs.builder
      builder.singleHeader(args(argsBuilder).build)

    /**
     * @param singleQueryArgument Inspect a single query argument. See `singleQueryArgument` below for details.
     * @return builder
     */
    def singleQueryArgument(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentArgs.builder
      builder.singleQueryArgument(args(argsBuilder).build)

    /**
     * @param uriFragment Inspect the part of a URL that follows the &#34;#&#34; symbol, providing additional information about the resource. See `uriFragment` below for details.
     * @return builder
     */
    def uriFragment(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchUriFragmentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchUriFragmentArgs.builder
      builder.uriFragment(args(argsBuilder).build)

    /**
     * @param uriPath Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * @return builder
     */
    def uriPath(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs.builder
      builder.uriPath(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchHeaderArgs.Builder)
    /**
     * @param matchPattern The filter to use to identify the subset of headers to inspect in a web request. The `matchPattern` block supports only one of the following arguments:
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchHeaderArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementAsnMatchStatementArgs.Builder)
    /**
     * @param forwardedIpConfig Configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that&#39;s reported by the web request origin. See Forwarded IP Config below for more details.
     * @return builder
     */
    def forwardedIpConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementAsnMatchStatementForwardedIpConfigArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementAsnMatchStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementAsnMatchStatementForwardedIpConfigArgs.builder
      builder.forwardedIpConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionBlockCustomResponseArgs.Builder)
    /**
     * @param responseHeaders The `responseHeader` blocks used to define the HTTP response headers added to the response. See Custom HTTP Header below for details.
     * @return builder
     */
    def responseHeaders(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionBlockCustomResponseResponseHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionBlockCustomResponseArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionBlockCustomResponseResponseHeaderArgs.builder
      builder.responseHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchHeaderArgs.Builder)
    /**
     * @param matchPattern The filter to use to identify the subset of headers to inspect in a web request. The `matchPattern` block supports only one of the following arguments:
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchHeaderArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder)
    /**
     * @param allQueryArguments Inspect all query arguments.
     * @return builder
     */
    def allQueryArguments(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs.builder
      builder.allQueryArguments(args(argsBuilder).build)

    /**
     * @param body Inspect the request body, which immediately follows the request headers. See `body` below for details.
     * @return builder
     */
    def body(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchBodyArgs.builder
      builder.body(args(argsBuilder).build)

    /**
     * @param cookies Inspect the cookies in the web request. See `cookies` below for details.
     * @return builder
     */
    def cookies(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchCookiesArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchCookiesArgs.builder
      builder.cookies(args(argsBuilder).build)

    /**
     * @param headerOrders Inspect a string containing the list of the request&#39;s header names, ordered as they appear in the web request that AWS WAF receives for inspection. See `headerOrder` below for details.
     * @return builder
     */
    def headerOrders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchHeaderOrderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchHeaderOrderArgs.builder
      builder.headerOrders(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Inspect the request headers. See `headers` below for details.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param ja3Fingerprint Inspect the JA3 fingerprint. See `ja3Fingerprint` below for details.
     * @return builder
     */
    def ja3Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchJa3FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchJa3FingerprintArgs.builder
      builder.ja3Fingerprint(args(argsBuilder).build)

    /**
     * @param ja4Fingerprint Inspect the JA3 fingerprint. See `ja4Fingerprint` below for details.
     * @return builder
     */
    def ja4Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchJa4FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchJa4FingerprintArgs.builder
      builder.ja4Fingerprint(args(argsBuilder).build)

    /**
     * @param jsonBody Inspect the request body as JSON. See `jsonBody` for details.
     * @return builder
     */
    def jsonBody(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchJsonBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchJsonBodyArgs.builder
      builder.jsonBody(args(argsBuilder).build)

    /**
     * @param method Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * @return builder
     */
    def method(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchMethodArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchMethodArgs.builder
      builder.method(args(argsBuilder).build)

    /**
     * @param queryString Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * @return builder
     */
    def queryString(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchQueryStringArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchQueryStringArgs.builder
      builder.queryString(args(argsBuilder).build)

    /**
     * @param singleHeader Inspect a single header. See `singleHeader` below for details.
     * @return builder
     */
    def singleHeader(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchSingleHeaderArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchSingleHeaderArgs.builder
      builder.singleHeader(args(argsBuilder).build)

    /**
     * @param singleQueryArgument Inspect a single query argument. See `singleQueryArgument` below for details.
     * @return builder
     */
    def singleQueryArgument(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs.builder
      builder.singleQueryArgument(args(argsBuilder).build)

    /**
     * @param uriFragment Inspect the part of a URL that follows the &#34;#&#34; symbol, providing additional information about the resource. See `uriFragment` below for details.
     * @return builder
     */
    def uriFragment(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchUriFragmentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchUriFragmentArgs.builder
      builder.uriFragment(args(argsBuilder).build)

    /**
     * @param uriPath Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * @return builder
     */
    def uriPath(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchUriPathArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementFieldToMatchUriPathArgs.builder
      builder.uriPath(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementArgs.Builder)
    /**
     * @param fieldToMatch The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * @return builder
     */
    def fieldToMatch(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
     *  At least one required.
     *  See Text Transformation below for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseCountArgs.Builder)
    /**
     * @param customRequestHandling Custom handling for counted requests. See below.
     * @return builder
     */
    def customRequestHandling(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseCountCustomRequestHandlingArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseCountArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseCountCustomRequestHandlingArgs.builder
      builder.customRequestHandling(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyHeaderArgs.Builder)
    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. They are used in rate-based rule statements, to transform request components before using them as custom aggregation keys. Atleast one transformation is required. See `textTransformation` above for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyHeaderTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyHeaderArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementCustomKeyHeaderTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchCookiesArgs.Builder)
    /**
     * @param matchPatterns The filter to use to identify the subset of cookies to inspect in a web request. You must specify exactly one setting: either `all`, `includedCookies` or `excludedCookies`. More details: [CookieMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_CookieMatchPattern.html)
     * @return builder
     */
    def matchPatterns(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchCookiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternArgs.builder
      builder.matchPatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchArgs.Builder)
    /**
     * @param allQueryArguments Inspect all query arguments.
     * @return builder
     */
    def allQueryArguments(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs.builder
      builder.allQueryArguments(args(argsBuilder).build)

    /**
     * @param body Inspect the request body, which immediately follows the request headers.
     * @return builder
     */
    def body(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchBodyArgs.builder
      builder.body(args(argsBuilder).build)

    /**
     * @param cookies Inspect the cookies in the web request. See Cookies below for details.
     * @return builder
     */
    def cookies(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchCookiesArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchCookiesArgs.builder
      builder.cookies(args(argsBuilder).build)

    /**
     * @param headerOrders Inspect the request headers. See Header Order below for details.
     * @return builder
     */
    def headerOrders(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchHeaderOrderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchHeaderOrderArgs.builder
      builder.headerOrders(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Inspect the request headers. See Headers below for details.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param ja3Fingerprint Inspect the JA3 fingerprint. See `ja3Fingerprint` below for details.
     * @return builder
     */
    def ja3Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchJa3FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchJa3FingerprintArgs.builder
      builder.ja3Fingerprint(args(argsBuilder).build)

    /**
     * @param ja4Fingerprint Inspect the JA4 fingerprint. See `ja4Fingerprint` below for details.
     * @return builder
     */
    def ja4Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchJa4FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchJa4FingerprintArgs.builder
      builder.ja4Fingerprint(args(argsBuilder).build)

    /**
     * @param jsonBody Inspect the request body as JSON. See JSON Body for details.
     * @return builder
     */
    def jsonBody(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchJsonBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchJsonBodyArgs.builder
      builder.jsonBody(args(argsBuilder).build)

    /**
     * @param method Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * @return builder
     */
    def method(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchMethodArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchMethodArgs.builder
      builder.method(args(argsBuilder).build)

    /**
     * @param queryString Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * @return builder
     */
    def queryString(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchQueryStringArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchQueryStringArgs.builder
      builder.queryString(args(argsBuilder).build)

    /**
     * @param singleHeader Inspect a single header. See Single Header below for details.
     * @return builder
     */
    def singleHeader(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchSingleHeaderArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchSingleHeaderArgs.builder
      builder.singleHeader(args(argsBuilder).build)

    /**
     * @param singleQueryArgument Inspect a single query argument. See Single Query Argument below for details.
     * @return builder
     */
    def singleQueryArgument(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs.builder
      builder.singleQueryArgument(args(argsBuilder).build)

    /**
     * @param uriFragment Inspect the part of a URL that follows the &#34;#&#34; symbol, providing additional information about the resource. See URI Fragment below for details.
     * @return builder
     */
    def uriFragment(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchUriFragmentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchUriFragmentArgs.builder
      builder.uriFragment(args(argsBuilder).build)

    /**
     * @param uriPath Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * @return builder
     */
    def uriPath(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchUriPathArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchUriPathArgs.builder
      builder.uriPath(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementArgs.Builder)
    /**
     * @param statements The statements to combine.
     * @return builder
     */
    def statements(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementArgs.builder
      builder.statements(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseAllowArgs.Builder)
    /**
     * @param customRequestHandling Defines custom handling for the web request. See `customRequestHandling` below for details.
     * @return builder
     */
    def customRequestHandling(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseAllowCustomRequestHandlingArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseAllowArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseAllowCustomRequestHandlingArgs.builder
      builder.customRequestHandling(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchCookiesMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementFieldToMatchCookiesMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementArgs.Builder)
    /**
     * @param statements The statements to combine.
     * @return builder
     */
    def statements(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementArgs.builder
      builder.statements(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationLoggingFilterFilterConditionArgs.Builder)
    /**
     * @param actionCondition Configuration for a single action condition. See Action Condition below for more details.
     * @return builder
     */
    def actionCondition(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationLoggingFilterFilterConditionActionConditionArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationLoggingFilterFilterConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationLoggingFilterFilterConditionActionConditionArgs.builder
      builder.actionCondition(args(argsBuilder).build)

    /**
     * @param labelNameCondition Condition for a single label name. See Label Name Condition below for more details.
     * @return builder
     */
    def labelNameCondition(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameConditionArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationLoggingFilterFilterConditionArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameConditionArgs.builder
      builder.labelNameCondition(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCountArgs.Builder)
    /**
     * @param customRequestHandling Defines custom handling for the web request. See `customRequestHandling` below for details.
     * @return builder
     */
    def customRequestHandling(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCountCustomRequestHandlingArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCountArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseCountCustomRequestHandlingArgs.builder
      builder.customRequestHandling(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchJsonBodyArgs.Builder)
    /**
     * @param matchPattern The patterns to look for in the JSON body. You must specify exactly one setting: either `all` or `includedPaths`. See [JsonMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_JsonMatchPattern.html) for details.
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchJsonBodyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchHeaderArgs.Builder)
    /**
     * @param matchPattern The filter to use to identify the subset of headers to inspect in a web request. The `matchPattern` block supports only one of the following arguments:
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchHeaderArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesArgs.Builder)
    /**
     * @param matchPatterns The filter to use to identify the subset of cookies to inspect in a web request. You must specify exactly one setting: either `all`, `includedCookies` or `excludedCookies`. More details: [CookieMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_CookieMatchPattern.html)
     * @return builder
     */
    def matchPatterns(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesMatchPatternArgs.builder
      builder.matchPatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder)
    /**
     * @param allQueryArguments Inspect all query arguments.
     * @return builder
     */
    def allQueryArguments(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsArgs.builder
      builder.allQueryArguments(args(argsBuilder).build)

    /**
     * @param body Inspect the request body, which immediately follows the request headers.
     * @return builder
     */
    def body(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchBodyArgs.builder
      builder.body(args(argsBuilder).build)

    /**
     * @param cookies Inspect the cookies in the web request. See Cookies below for details.
     * @return builder
     */
    def cookies(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchCookiesArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchCookiesArgs.builder
      builder.cookies(args(argsBuilder).build)

    /**
     * @param headerOrders Inspect the request headers. See Header Order below for details.
     * @return builder
     */
    def headerOrders(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchHeaderOrderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchHeaderOrderArgs.builder
      builder.headerOrders(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Inspect the request headers. See Headers below for details.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param ja3Fingerprint Inspect the JA3 fingerprint. See `ja3Fingerprint` below for details.
     * @return builder
     */
    def ja3Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJa3FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJa3FingerprintArgs.builder
      builder.ja3Fingerprint(args(argsBuilder).build)

    /**
     * @param ja4Fingerprint Inspect the JA4 fingerprint. See `ja4Fingerprint` below for details.
     * @return builder
     */
    def ja4Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJa4FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJa4FingerprintArgs.builder
      builder.ja4Fingerprint(args(argsBuilder).build)

    /**
     * @param jsonBody Inspect the request body as JSON. See JSON Body for details.
     * @return builder
     */
    def jsonBody(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyArgs.builder
      builder.jsonBody(args(argsBuilder).build)

    /**
     * @param method Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * @return builder
     */
    def method(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchMethodArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchMethodArgs.builder
      builder.method(args(argsBuilder).build)

    /**
     * @param queryString Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * @return builder
     */
    def queryString(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringArgs.builder
      builder.queryString(args(argsBuilder).build)

    /**
     * @param singleHeader Inspect a single header. See Single Header below for details.
     * @return builder
     */
    def singleHeader(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderArgs.builder
      builder.singleHeader(args(argsBuilder).build)

    /**
     * @param singleQueryArgument Inspect a single query argument. See Single Query Argument below for details.
     * @return builder
     */
    def singleQueryArgument(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentArgs.builder
      builder.singleQueryArgument(args(argsBuilder).build)

    /**
     * @param uriFragment Inspect the part of a URL that follows the &#34;#&#34; symbol, providing additional information about the resource. See URI Fragment below for details.
     * @return builder
     */
    def uriFragment(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchUriFragmentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchUriFragmentArgs.builder
      builder.uriFragment(args(argsBuilder).build)

    /**
     * @param uriPath Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * @return builder
     */
    def uriPath(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs.builder
      builder.uriPath(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyArgs.Builder)
    /**
     * @param matchPattern The patterns to look for in the JSON body. You must specify exactly one setting: either `all` or `includedPaths`. See [JsonMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_JsonMatchPattern.html) for details.
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseAllowArgs.Builder)
    /**
     * @param customRequestHandling Custom handling for allowed requests. See below.
     * @return builder
     */
    def customRequestHandling(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseAllowCustomRequestHandlingArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseAllowArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseAllowCustomRequestHandlingArgs.builder
      builder.customRequestHandling(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyUriPathArgs.Builder)
    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. They are used in rate-based rule statements, to transform request components before using them as custom aggregation keys. Atleast one transformation is required. See Text Transformation above for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyUriPathTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyUriPathArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementCustomKeyUriPathTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleActionArgs.Builder)
    /**
     * @param allow Instructs AWS WAF to allow the web request. See `allow` below for details.
     * @return builder
     */
    def allow(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleActionAllowArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleActionAllowArgs.builder
      builder.allow(args(argsBuilder).build)

    /**
     * @param block Instructs AWS WAF to block the web request. See `block` below for details.
     * @return builder
     */
    def block(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleActionBlockArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleActionBlockArgs.builder
      builder.block(args(argsBuilder).build)

    /**
     * @param captcha Instructs AWS WAF to run a Captcha check against the web request. See `captcha` below for details.
     * @return builder
     */
    def captcha(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleActionCaptchaArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleActionCaptchaArgs.builder
      builder.captcha(args(argsBuilder).build)

    /**
     * @param challenge Instructs AWS WAF to run a check against the request to verify that the request is coming from a legitimate client session. See `challenge` below for details.
     * @return builder
     */
    def challenge(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleActionChallengeArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleActionChallengeArgs.builder
      builder.challenge(args(argsBuilder).build)

    /**
     * @param count Instructs AWS WAF to count the web request and allow it. See `count` below for details.
     * @return builder
     */
    def count(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleActionCountArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleActionCountArgs.builder
      builder.count(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchCookiesArgs.Builder)
    /**
     * @param matchPatterns The filter to use to identify the subset of cookies to inspect in a web request. You must specify exactly one setting: either `all`, `includedCookies` or `excludedCookies`. More details: [CookieMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_CookieMatchPattern.html)
     * @return builder
     */
    def matchPatterns(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchCookiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternArgs.builder
      builder.matchPatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchCookiesMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchCookiesMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchCookiesMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchCookiesMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseChallengeArgs.Builder)
    /**
     * @param customRequestHandling Custom handling for challenge requests. See below.
     * @return builder
     */
    def customRequestHandling(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseChallengeCustomRequestHandlingArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseChallengeArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseChallengeCustomRequestHandlingArgs.builder
      builder.customRequestHandling(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder)
    /**
     * @param allQueryArguments Inspect all query arguments.
     * @return builder
     */
    def allQueryArguments(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs.builder
      builder.allQueryArguments(args(argsBuilder).build)

    /**
     * @param body Inspect the request body, which immediately follows the request headers. See `body` below for details.
     * @return builder
     */
    def body(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchBodyArgs.builder
      builder.body(args(argsBuilder).build)

    /**
     * @param cookies Inspect the cookies in the web request. See `cookies` below for details.
     * @return builder
     */
    def cookies(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchCookiesArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchCookiesArgs.builder
      builder.cookies(args(argsBuilder).build)

    /**
     * @param headerOrders Inspect a string containing the list of the request&#39;s header names, ordered as they appear in the web request that AWS WAF receives for inspection. See `headerOrder` below for details.
     * @return builder
     */
    def headerOrders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchHeaderOrderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchHeaderOrderArgs.builder
      builder.headerOrders(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Inspect the request headers. See `headers` below for details.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param ja3Fingerprint Inspect the JA3 fingerprint. See `ja3Fingerprint` below for details.
     * @return builder
     */
    def ja3Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchJa3FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchJa3FingerprintArgs.builder
      builder.ja3Fingerprint(args(argsBuilder).build)

    /**
     * @param ja4Fingerprint Inspect the JA3 fingerprint. See `ja4Fingerprint` below for details.
     * @return builder
     */
    def ja4Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchJa4FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchJa4FingerprintArgs.builder
      builder.ja4Fingerprint(args(argsBuilder).build)

    /**
     * @param jsonBody Inspect the request body as JSON. See `jsonBody` for details.
     * @return builder
     */
    def jsonBody(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchJsonBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchJsonBodyArgs.builder
      builder.jsonBody(args(argsBuilder).build)

    /**
     * @param method Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * @return builder
     */
    def method(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchMethodArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchMethodArgs.builder
      builder.method(args(argsBuilder).build)

    /**
     * @param queryString Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * @return builder
     */
    def queryString(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchQueryStringArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchQueryStringArgs.builder
      builder.queryString(args(argsBuilder).build)

    /**
     * @param singleHeader Inspect a single header. See `singleHeader` below for details.
     * @return builder
     */
    def singleHeader(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchSingleHeaderArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchSingleHeaderArgs.builder
      builder.singleHeader(args(argsBuilder).build)

    /**
     * @param singleQueryArgument Inspect a single query argument. See `singleQueryArgument` below for details.
     * @return builder
     */
    def singleQueryArgument(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs.builder
      builder.singleQueryArgument(args(argsBuilder).build)

    /**
     * @param uriFragment Inspect the part of a URL that follows the &#34;#&#34; symbol, providing additional information about the resource. See `uriFragment` below for details.
     * @return builder
     */
    def uriFragment(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchUriFragmentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchUriFragmentArgs.builder
      builder.uriFragment(args(argsBuilder).build)

    /**
     * @param uriPath Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * @return builder
     */
    def uriPath(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchUriPathArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchUriPathArgs.builder
      builder.uriPath(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchCookiesMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementFieldToMatchCookiesMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementArgs.Builder)
    /**
     * @param fieldToMatch The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * @return builder
     */
    def fieldToMatch(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
     *  At least one required.
     *  See Text Transformation below for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementArgs.Builder)
    /**
     * @param fieldToMatch Part of a web request that you want AWS WAF to inspect. See `fieldToMatch` below for details.
     * @return builder
     */
    def fieldToMatch(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. At least one transformation is required. See `textTransformation` below for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchCookiesMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchCookiesMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseAllowCustomRequestHandlingArgs.Builder)
    /**
     * @param insertHeaders The `insertHeader` blocks used to define HTTP headers added to the request. See `insertHeader` below for details.
     * @return builder
     */
    def insertHeaders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseAllowCustomRequestHandlingInsertHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseAllowCustomRequestHandlingArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementRuleActionOverrideActionToUseAllowCustomRequestHandlingInsertHeaderArgs.builder
      builder.insertHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchHeaderMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchHeaderMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseChallengeCustomRequestHandlingArgs.Builder)
    /**
     * @param insertHeaders The `insertHeader` blocks used to define HTTP headers added to the request. See `insertHeader` below for details.
     * @return builder
     */
    def insertHeaders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseChallengeCustomRequestHandlingInsertHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseChallengeCustomRequestHandlingArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseChallengeCustomRequestHandlingInsertHeaderArgs.builder
      builder.insertHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchJsonBodyArgs.Builder)
    /**
     * @param matchPattern The patterns to look for in the JSON body. You must specify exactly one setting: either `all` or `includedPaths`. See [JsonMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_JsonMatchPattern.html) for details.
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchJsonBodyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementArgs.Builder)
    /**
     * @param andStatement Logical rule statement used to combine other rule statements with AND logic. See `andStatement` below for details.
     * @return builder
     */
    def andStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementArgs.builder
      builder.andStatement(args(argsBuilder).build)

    /**
     * @param asnMatchStatement Rule statement that inspects web traffic based on the Autonomous System Number (ASN) associated with the request&#39;s IP address. See `asnMatchStatement` below for details.
     * @return builder
     */
    def asnMatchStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAsnMatchStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAsnMatchStatementArgs.builder
      builder.asnMatchStatement(args(argsBuilder).build)

    /**
     * @param byteMatchStatement Rule statement that defines a string match search for AWS WAF to apply to web requests. See `byteMatchStatement` below for details.
     * @return builder
     */
    def byteMatchStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementByteMatchStatementArgs.builder
      builder.byteMatchStatement(args(argsBuilder).build)

    /**
     * @param geoMatchStatement Rule statement used to identify web requests based on country of origin. See `geoMatchStatement` below for details.
     * @return builder
     */
    def geoMatchStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementGeoMatchStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementGeoMatchStatementArgs.builder
      builder.geoMatchStatement(args(argsBuilder).build)

    /**
     * @param ipSetReferenceStatement Rule statement used to detect web requests coming from particular IP addresses or address ranges. See `ipSetReferenceStatement` below for details.
     * @return builder
     */
    def ipSetReferenceStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementIpSetReferenceStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementIpSetReferenceStatementArgs.builder
      builder.ipSetReferenceStatement(args(argsBuilder).build)

    /**
     * @param labelMatchStatement Rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See `labelMatchStatement` below for details.
     * @return builder
     */
    def labelMatchStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementLabelMatchStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementLabelMatchStatementArgs.builder
      builder.labelMatchStatement(args(argsBuilder).build)

    /**
     * @param managedRuleGroupStatement Rule statement used to run the rules that are defined in a managed rule group.  This statement can not be nested. See `managedRuleGroupStatement` below for details.
     * @return builder
     */
    def managedRuleGroupStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementArgs.builder
      builder.managedRuleGroupStatement(args(argsBuilder).build)

    /**
     * @param notStatement Logical rule statement used to negate the results of another rule statement. See `notStatement` below for details.
     * @return builder
     */
    def notStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementArgs.builder
      builder.notStatement(args(argsBuilder).build)

    /**
     * @param orStatement Logical rule statement used to combine other rule statements with OR logic. See `orStatement` below for details.
     * @return builder
     */
    def orStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementArgs.builder
      builder.orStatement(args(argsBuilder).build)

    /**
     * @param rateBasedStatement Rate-based rule tracks the rate of requests for each originating `IP address`, and triggers the rule action when the rate exceeds a limit that you specify on the number of requests in any `5-minute` time span. This statement can not be nested. See `rateBasedStatement` below for details.
     * @return builder
     */
    def rateBasedStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementArgs.builder
      builder.rateBasedStatement(args(argsBuilder).build)

    /**
     * @param regexMatchStatement Rule statement used to search web request components for a match against a single regular expression. See `regexMatchStatement` below for details.
     * @return builder
     */
    def regexMatchStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementArgs.builder
      builder.regexMatchStatement(args(argsBuilder).build)

    /**
     * @param regexPatternSetReferenceStatement Rule statement used to search web request components for matches with regular expressions. See `regexPatternSetReferenceStatement` below for details.
     * @return builder
     */
    def regexPatternSetReferenceStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementArgs.builder
      builder.regexPatternSetReferenceStatement(args(argsBuilder).build)

    /**
     * @param ruleGroupReferenceStatement Rule statement used to run the rules that are defined in an WAFv2 Rule Group. See `ruleGroupReferenceStatement` below for details.
     * @return builder
     */
    def ruleGroupReferenceStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementArgs.builder
      builder.ruleGroupReferenceStatement(args(argsBuilder).build)

    /**
     * @param sizeConstraintStatement Rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See `sizeConstraintStatement` below for more details.
     * @return builder
     */
    def sizeConstraintStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementArgs.builder
      builder.sizeConstraintStatement(args(argsBuilder).build)

    /**
     * @param sqliMatchStatement An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See `sqliMatchStatement` below for details.
     * @return builder
     */
    def sqliMatchStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementArgs.builder
      builder.sqliMatchStatement(args(argsBuilder).build)

    /**
     * @param xssMatchStatement Rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See `xssMatchStatement` below for details.
     * @return builder
     */
    def xssMatchStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementArgs.builder
      builder.xssMatchStatement(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchHeaderArgs.Builder)
    /**
     * @param matchPattern The filter to use to identify the subset of headers to inspect in a web request. The `matchPattern` block supports only one of the following arguments:
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchHeaderArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchHeaderMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionChallengeCustomRequestHandlingArgs.Builder)
    /**
     * @param insertHeaders The `insertHeader` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
     * @return builder
     */
    def insertHeaders(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionChallengeCustomRequestHandlingInsertHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionChallengeCustomRequestHandlingArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionChallengeCustomRequestHandlingInsertHeaderArgs.builder
      builder.insertHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchCookiesMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchCookiesMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementArgs.Builder)
    /**
     * @param fieldToMatch The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * @return builder
     */
    def fieldToMatch(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
     *  At least one required.
     *  See Text Transformation below for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementArgs.Builder)
    /**
     * @param andStatement A logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
     * @return builder
     */
    def andStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementAndStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementAndStatementArgs.builder
      builder.andStatement(args(argsBuilder).build)

    /**
     * @param asnMatchStatement Rule statement that inspects web traffic based on the Autonomous System Number (ASN) associated with the request&#39;s IP address. See `asnMatchStatement` below for details.
     * @return builder
     */
    def asnMatchStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementAsnMatchStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementAsnMatchStatementArgs.builder
      builder.asnMatchStatement(args(argsBuilder).build)

    /**
     * @param byteMatchStatement A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * @return builder
     */
    def byteMatchStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementArgs.builder
      builder.byteMatchStatement(args(argsBuilder).build)

    /**
     * @param geoMatchStatement A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * @return builder
     */
    def geoMatchStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementGeoMatchStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementGeoMatchStatementArgs.builder
      builder.geoMatchStatement(args(argsBuilder).build)

    /**
     * @param ipSetReferenceStatement A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * @return builder
     */
    def ipSetReferenceStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementIpSetReferenceStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementIpSetReferenceStatementArgs.builder
      builder.ipSetReferenceStatement(args(argsBuilder).build)

    /**
     * @param labelMatchStatement A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * @return builder
     */
    def labelMatchStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementLabelMatchStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementLabelMatchStatementArgs.builder
      builder.labelMatchStatement(args(argsBuilder).build)

    /**
     * @param notStatement A logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
     * @return builder
     */
    def notStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementArgs.builder
      builder.notStatement(args(argsBuilder).build)

    /**
     * @param orStatement A logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
     * @return builder
     */
    def orStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementArgs.builder
      builder.orStatement(args(argsBuilder).build)

    /**
     * @param rateBasedStatement A rate-based rule tracks the rate of requests for each originating `IP address`, and triggers the rule action when the rate exceeds a limit that you specify on the number of requests in any `5-minute` time span. This statement can not be nested. See Rate Based Statement below for details.
     * @return builder
     */
    def rateBasedStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementArgs.builder
      builder.rateBasedStatement(args(argsBuilder).build)

    /**
     * @param regexMatchStatement A rule statement used to search web request components for a match against a single regular expression. See Regex Match Statement below for details.
     * @return builder
     */
    def regexMatchStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementArgs.builder
      builder.regexMatchStatement(args(argsBuilder).build)

    /**
     * @param regexPatternSetReferenceStatement A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * @return builder
     */
    def regexPatternSetReferenceStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementArgs.builder
      builder.regexPatternSetReferenceStatement(args(argsBuilder).build)

    /**
     * @param sizeConstraintStatement A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
     * @return builder
     */
    def sizeConstraintStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementArgs.builder
      builder.sizeConstraintStatement(args(argsBuilder).build)

    /**
     * @param sqliMatchStatement An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * @return builder
     */
    def sqliMatchStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSqliMatchStatementArgs.builder
      builder.sqliMatchStatement(args(argsBuilder).build)

    /**
     * @param xssMatchStatement A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * @return builder
     */
    def xssMatchStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementXssMatchStatementArgs.builder
      builder.xssMatchStatement(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementArgs.Builder)
    /**
     * @param fieldToMatch The part of a web request that you want AWS WAF to inspect. See `fieldToMatch` below for details.
     * @return builder
     */
    def fieldToMatch(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. At least one transformation is required. See `textTransformation` below for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseCountCustomRequestHandlingArgs.Builder)
    /**
     * @param insertHeaders Headers to insert into the request. See below.
     * @return builder
     */
    def insertHeaders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseCountCustomRequestHandlingInsertHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseCountCustomRequestHandlingArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseCountCustomRequestHandlingInsertHeaderArgs.builder
      builder.insertHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementArgs.Builder)
    /**
     * @param fieldToMatch The part of a web request that you want AWS WAF to inspect. See `fieldToMatch` below for details.
     * @return builder
     */
    def fieldToMatch(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. At least one transformation is required. See `textTransformation` below for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementArgs.Builder)
    /**
     * @param statements The statements to combine.
     * @return builder
     */
    def statements(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementArgs.builder
      builder.statements(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseChallengeArgs.Builder)
    /**
     * @param customRequestHandling Custom handling for challenge requests. See below.
     * @return builder
     */
    def customRequestHandling(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseChallengeCustomRequestHandlingArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseChallengeArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseChallengeCustomRequestHandlingArgs.builder
      builder.customRequestHandling(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleActionAllowArgs.Builder)
    /**
     * @param customRequestHandling Defines custom handling for the web request. See `customRequestHandling` below for details.
     * @return builder
     */
    def customRequestHandling(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleActionAllowCustomRequestHandlingArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleActionAllowArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleActionAllowCustomRequestHandlingArgs.builder
      builder.customRequestHandling(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseArgs.Builder)
    /**
     * @param allow Allow the request. See below.
     * @return builder
     */
    def allow(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseAllowArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseAllowArgs.builder
      builder.allow(args(argsBuilder).build)

    /**
     * @param block Block the request. See below.
     * @return builder
     */
    def block(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseBlockArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseBlockArgs.builder
      builder.block(args(argsBuilder).build)

    /**
     * @param captcha Require CAPTCHA verification. See below.
     * @return builder
     */
    def captcha(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseCaptchaArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseCaptchaArgs.builder
      builder.captcha(args(argsBuilder).build)

    /**
     * @param challenge Require challenge verification. See below.
     * @return builder
     */
    def challenge(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseChallengeArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseChallengeArgs.builder
      builder.challenge(args(argsBuilder).build)

    /**
     * @param count Count the request without taking action. See below.
     * @return builder
     */
    def count(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseCountArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationRuleGroupReferenceRuleActionOverrideActionToUseCountArgs.builder
      builder.count(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchHeaderArgs.Builder)
    /**
     * @param matchPattern The filter to use to identify the subset of headers to inspect in a web request. The `matchPattern` block supports only one of the following arguments:
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchHeaderArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchHeaderMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclDefaultActionAllowCustomRequestHandlingArgs.Builder)
    /**
     * @param insertHeaders The `insertHeader` blocks used to define HTTP headers added to the request. See `insertHeader` below for details.
     * @return builder
     */
    def insertHeaders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclDefaultActionAllowCustomRequestHandlingInsertHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclDefaultActionAllowCustomRequestHandlingArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclDefaultActionAllowCustomRequestHandlingInsertHeaderArgs.builder
      builder.insertHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder)
    /**
     * @param allQueryArguments Inspect all query arguments.
     * @return builder
     */
    def allQueryArguments(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs.builder
      builder.allQueryArguments(args(argsBuilder).build)

    /**
     * @param body Inspect the request body, which immediately follows the request headers.
     * @return builder
     */
    def body(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchBodyArgs.builder
      builder.body(args(argsBuilder).build)

    /**
     * @param cookies Inspect the cookies in the web request. See Cookies below for details.
     * @return builder
     */
    def cookies(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchCookiesArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchCookiesArgs.builder
      builder.cookies(args(argsBuilder).build)

    /**
     * @param headerOrders Inspect the request headers. See Header Order below for details.
     * @return builder
     */
    def headerOrders(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchHeaderOrderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchHeaderOrderArgs.builder
      builder.headerOrders(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Inspect the request headers. See Headers below for details.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param ja3Fingerprint Inspect the JA3 fingerprint. See `ja3Fingerprint` below for details.
     * @return builder
     */
    def ja3Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchJa3FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchJa3FingerprintArgs.builder
      builder.ja3Fingerprint(args(argsBuilder).build)

    /**
     * @param ja4Fingerprint Inspect the JA4 fingerprint. See `ja4Fingerprint` below for details.
     * @return builder
     */
    def ja4Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchJa4FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchJa4FingerprintArgs.builder
      builder.ja4Fingerprint(args(argsBuilder).build)

    /**
     * @param jsonBody Inspect the request body as JSON. See JSON Body for details.
     * @return builder
     */
    def jsonBody(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchJsonBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchJsonBodyArgs.builder
      builder.jsonBody(args(argsBuilder).build)

    /**
     * @param method Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * @return builder
     */
    def method(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchMethodArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchMethodArgs.builder
      builder.method(args(argsBuilder).build)

    /**
     * @param queryString Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * @return builder
     */
    def queryString(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchQueryStringArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchQueryStringArgs.builder
      builder.queryString(args(argsBuilder).build)

    /**
     * @param singleHeader Inspect a single header. See Single Header below for details.
     * @return builder
     */
    def singleHeader(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchSingleHeaderArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchSingleHeaderArgs.builder
      builder.singleHeader(args(argsBuilder).build)

    /**
     * @param singleQueryArgument Inspect a single query argument. See Single Query Argument below for details.
     * @return builder
     */
    def singleQueryArgument(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs.builder
      builder.singleQueryArgument(args(argsBuilder).build)

    /**
     * @param uriFragment Inspect the part of a URL that follows the &#34;#&#34; symbol, providing additional information about the resource. See URI Fragment below for details.
     * @return builder
     */
    def uriFragment(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchUriFragmentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchUriFragmentArgs.builder
      builder.uriFragment(args(argsBuilder).build)

    /**
     * @param uriPath Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * @return builder
     */
    def uriPath(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchUriPathArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchUriPathArgs.builder
      builder.uriPath(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionCaptchaCustomRequestHandlingArgs.Builder)
    /**
     * @param insertHeaders The `insertHeader` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
     * @return builder
     */
    def insertHeaders(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionCaptchaCustomRequestHandlingInsertHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionCaptchaCustomRequestHandlingArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionCaptchaCustomRequestHandlingInsertHeaderArgs.builder
      builder.insertHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchCookiesArgs.Builder)
    /**
     * @param matchPatterns The filter to use to identify the subset of cookies to inspect in a web request. You must specify exactly one setting: either `all`, `includedCookies` or `excludedCookies`. More details: [CookieMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_CookieMatchPattern.html)
     * @return builder
     */
    def matchPatterns(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchCookiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchCookiesMatchPatternArgs.builder
      builder.matchPatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder)
    /**
     * @param allQueryArguments Inspect all query arguments.
     * @return builder
     */
    def allQueryArguments(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs.builder
      builder.allQueryArguments(args(argsBuilder).build)

    /**
     * @param body Inspect the request body, which immediately follows the request headers.
     * @return builder
     */
    def body(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchBodyArgs.builder
      builder.body(args(argsBuilder).build)

    /**
     * @param cookies Inspect the cookies in the web request. See Cookies below for details.
     * @return builder
     */
    def cookies(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchCookiesArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchCookiesArgs.builder
      builder.cookies(args(argsBuilder).build)

    /**
     * @param headerOrders Inspect the request headers. See Header Order below for details.
     * @return builder
     */
    def headerOrders(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchHeaderOrderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchHeaderOrderArgs.builder
      builder.headerOrders(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Inspect the request headers. See Headers below for details.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param ja3Fingerprint Inspect the JA3 fingerprint. See `ja3Fingerprint` below for details.
     * @return builder
     */
    def ja3Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchJa3FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchJa3FingerprintArgs.builder
      builder.ja3Fingerprint(args(argsBuilder).build)

    /**
     * @param ja4Fingerprint Inspect the JA4 fingerprint. See `ja4Fingerprint` below for details.
     * @return builder
     */
    def ja4Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchJa4FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchJa4FingerprintArgs.builder
      builder.ja4Fingerprint(args(argsBuilder).build)

    /**
     * @param jsonBody Inspect the request body as JSON. See JSON Body for details.
     * @return builder
     */
    def jsonBody(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchJsonBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchJsonBodyArgs.builder
      builder.jsonBody(args(argsBuilder).build)

    /**
     * @param method Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * @return builder
     */
    def method(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchMethodArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchMethodArgs.builder
      builder.method(args(argsBuilder).build)

    /**
     * @param queryString Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * @return builder
     */
    def queryString(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchQueryStringArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchQueryStringArgs.builder
      builder.queryString(args(argsBuilder).build)

    /**
     * @param singleHeader Inspect a single header. See Single Header below for details.
     * @return builder
     */
    def singleHeader(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchSingleHeaderArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchSingleHeaderArgs.builder
      builder.singleHeader(args(argsBuilder).build)

    /**
     * @param singleQueryArgument Inspect a single query argument. See Single Query Argument below for details.
     * @return builder
     */
    def singleQueryArgument(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs.builder
      builder.singleQueryArgument(args(argsBuilder).build)

    /**
     * @param uriFragment Inspect the part of a URL that follows the &#34;#&#34; symbol, providing additional information about the resource. See URI Fragment below for details.
     * @return builder
     */
    def uriFragment(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchUriFragmentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchUriFragmentArgs.builder
      builder.uriFragment(args(argsBuilder).build)

    /**
     * @param uriPath Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * @return builder
     */
    def uriPath(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchUriPathArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchUriPathArgs.builder
      builder.uriPath(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclState.Builder)
    /**
     * @param associationConfig Specifies custom configurations for the associations between the web ACL and protected resources. See `associationConfig` below for details.
     * @return builder
     */
    def associationConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclAssociationConfigArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclState.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclAssociationConfigArgs.builder
      builder.associationConfig(args(argsBuilder).build)

    /**
     * @param captchaConfig Specifies how AWS WAF should handle CAPTCHA evaluations on the ACL level (used by [AWS Bot Control](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html)). See `captchaConfig` below for details.
     * @return builder
     */
    def captchaConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclCaptchaConfigArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclState.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclCaptchaConfigArgs.builder
      builder.captchaConfig(args(argsBuilder).build)

    /**
     * @param challengeConfig Specifies how AWS WAF should handle Challenge evaluations on the ACL level (used by [AWS Bot Control](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html)). See `challengeConfig` below for details.
     * @return builder
     */
    def challengeConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclChallengeConfigArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclState.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclChallengeConfigArgs.builder
      builder.challengeConfig(args(argsBuilder).build)

    /**
     * @param customResponseBodies Defines custom response bodies that can be referenced by `customResponse` actions. See `customResponseBody` below for details.
     * @return builder
     */
    def customResponseBodies(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclCustomResponseBodyArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclState.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclCustomResponseBodyArgs.builder
      builder.customResponseBodies(args.map(_(argsBuilder).build)*)

    /**
     * @param dataProtectionConfig Specifies data protection to apply to the web request data for the web ACL. This is a web ACL level data protection option. See `dataProtectionConfig` below for details.
     * @return builder
     */
    def dataProtectionConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclDataProtectionConfigArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclState.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclDataProtectionConfigArgs.builder
      builder.dataProtectionConfig(args(argsBuilder).build)

    /**
     * @param defaultAction Action to perform if none of the `rules` contained in the WebACL match. See `defaultAction` below for details.
     * @return builder
     */
    def defaultAction(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclDefaultActionArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclState.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclDefaultActionArgs.builder
      builder.defaultAction(args(argsBuilder).build)

    /**
     * @param rules Rule blocks used to identify the web requests that you want to `allow`, `block`, or `count`. See `rule` below for details.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclState.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

    /**
     * @param visibilityConfig Defines and enables Amazon CloudWatch metrics and web request sample collection. See `visibilityConfig` below for details.
     * @return builder
     */
    def visibilityConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclVisibilityConfigArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclState.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclVisibilityConfigArgs.builder
      builder.visibilityConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchHeaderArgs.Builder)
    /**
     * @param matchPattern The filter to use to identify the subset of headers to inspect in a web request. The `matchPattern` block supports only one of the following arguments:
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchHeaderArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchHeaderMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementArgs.Builder)
    /**
     * @param fieldToMatch The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * @return builder
     */
    def fieldToMatch(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
     *  At least one required.
     *  See Text Transformation below for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionCountCustomRequestHandlingArgs.Builder)
    /**
     * @param insertHeaders The `insertHeader` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
     * @return builder
     */
    def insertHeaders(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionCountCustomRequestHandlingInsertHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionCountCustomRequestHandlingArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionCountCustomRequestHandlingInsertHeaderArgs.builder
      builder.insertHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RegexPatternSetState.Builder)
    /**
     * @param regularExpressions One or more blocks of regular expression patterns that you want AWS WAF to search for, such as `B[a{@literal @}]dB[o0]t`. See Regular Expression below for details.
     * @return builder
     */
    def regularExpressions(args: Endofunction[com.pulumi.aws.wafv2.inputs.RegexPatternSetRegularExpressionArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RegexPatternSetState.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RegexPatternSetRegularExpressionArgs.builder
      builder.regularExpressions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementArgs.Builder)
    /**
     * @param fieldToMatch The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * @return builder
     */
    def fieldToMatch(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
     *  At least one required.
     *  See Text Transformation below for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementArgs.Builder)
    /**
     * @param statements The statements to combine.
     * @return builder
     */
    def statements(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementArgs.builder
      builder.statements(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementArgs.Builder)
    /**
     * @param fieldToMatch The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * @return builder
     */
    def fieldToMatch(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
     *  At least one required.
     *  See Text Transformation below for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchCookiesArgs.Builder)
    /**
     * @param matchPatterns The filter to use to identify the subset of cookies to inspect in a web request. You must specify exactly one setting: either `all`, `includedCookies` or `excludedCookies`. More details: [CookieMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_CookieMatchPattern.html)
     * @return builder
     */
    def matchPatterns(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchCookiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternArgs.builder
      builder.matchPatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchCookiesArgs.Builder)
    /**
     * @param matchPatterns The filter to use to identify the subset of cookies to inspect in a web request. You must specify exactly one setting: either `all`, `includedCookies` or `excludedCookies`. More details: [CookieMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_CookieMatchPattern.html)
     * @return builder
     */
    def matchPatterns(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchCookiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternArgs.builder
      builder.matchPatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchHeaderMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementArgs.Builder)
    /**
     * @param fieldToMatch Part of a web request that you want AWS WAF to inspect. See `fieldToMatch` below for details.
     * @return builder
     */
    def fieldToMatch(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

    /**
     * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. At least one transformation is required. See `textTransformation` below for details.
     * @return builder
     */
    def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseChallengeArgs.Builder)
    /**
     * @param customRequestHandling Defines custom handling for the web request. See `customRequestHandling` below for details.
     * @return builder
     */
    def customRequestHandling(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseChallengeCustomRequestHandlingArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseChallengeArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseChallengeCustomRequestHandlingArgs.builder
      builder.customRequestHandling(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementArgs.Builder)
    /**
     * @param andStatement Logical rule statement used to combine other rule statements with AND logic. See `andStatement` below for details.
     * @return builder
     */
    def andStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementArgs.builder
      builder.andStatement(args(argsBuilder).build)

    /**
     * @param asnMatchStatement Rule statement that inspects web traffic based on the Autonomous System Number (ASN) associated with the request&#39;s IP address. See `asnMatchStatement` below for details.
     * @return builder
     */
    def asnMatchStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAsnMatchStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAsnMatchStatementArgs.builder
      builder.asnMatchStatement(args(argsBuilder).build)

    /**
     * @param byteMatchStatement Rule statement that defines a string match search for AWS WAF to apply to web requests. See `byteMatchStatement` below for details.
     * @return builder
     */
    def byteMatchStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementByteMatchStatementArgs.builder
      builder.byteMatchStatement(args(argsBuilder).build)

    /**
     * @param geoMatchStatement Rule statement used to identify web requests based on country of origin. See `geoMatchStatement` below for details.
     * @return builder
     */
    def geoMatchStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementGeoMatchStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementGeoMatchStatementArgs.builder
      builder.geoMatchStatement(args(argsBuilder).build)

    /**
     * @param ipSetReferenceStatement Rule statement used to detect web requests coming from particular IP addresses or address ranges. See `ipSetReferenceStatement` below for details.
     * @return builder
     */
    def ipSetReferenceStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementIpSetReferenceStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementIpSetReferenceStatementArgs.builder
      builder.ipSetReferenceStatement(args(argsBuilder).build)

    /**
     * @param labelMatchStatement Rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See `labelMatchStatement` below for details.
     * @return builder
     */
    def labelMatchStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementLabelMatchStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementLabelMatchStatementArgs.builder
      builder.labelMatchStatement(args(argsBuilder).build)

    /**
     * @param notStatement Logical rule statement used to negate the results of another rule statement. See `notStatement` below for details.
     * @return builder
     */
    def notStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementArgs.builder
      builder.notStatement(args(argsBuilder).build)

    /**
     * @param orStatement Logical rule statement used to combine other rule statements with OR logic. See `orStatement` below for details.
     * @return builder
     */
    def orStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementArgs.builder
      builder.orStatement(args(argsBuilder).build)

    /**
     * @param regexMatchStatement Rule statement used to search web request components for a match against a single regular expression. See `regexMatchStatement` below for details.
     * @return builder
     */
    def regexMatchStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementArgs.builder
      builder.regexMatchStatement(args(argsBuilder).build)

    /**
     * @param regexPatternSetReferenceStatement Rule statement used to search web request components for matches with regular expressions. See `regexPatternSetReferenceStatement` below for details.
     * @return builder
     */
    def regexPatternSetReferenceStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexPatternSetReferenceStatementArgs.builder
      builder.regexPatternSetReferenceStatement(args(argsBuilder).build)

    /**
     * @param sizeConstraintStatement Rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See `sizeConstraintStatement` below for more details.
     * @return builder
     */
    def sizeConstraintStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSizeConstraintStatementArgs.builder
      builder.sizeConstraintStatement(args(argsBuilder).build)

    /**
     * @param sqliMatchStatement An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See `sqliMatchStatement` below for details.
     * @return builder
     */
    def sqliMatchStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementSqliMatchStatementArgs.builder
      builder.sqliMatchStatement(args(argsBuilder).build)

    /**
     * @param xssMatchStatement Rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See `xssMatchStatement` below for details.
     * @return builder
     */
    def xssMatchStatement(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementXssMatchStatementArgs.builder
      builder.xssMatchStatement(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseAllowCustomRequestHandlingArgs.Builder)
    /**
     * @param insertHeaders Headers to insert into the request. See below.
     * @return builder
     */
    def insertHeaders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseAllowCustomRequestHandlingInsertHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseAllowCustomRequestHandlingArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleGroupAssociationManagedRuleGroupRuleActionOverrideActionToUseAllowCustomRequestHandlingInsertHeaderArgs.builder
      builder.insertHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyArgs.Builder)
    /**
     * @param matchPattern The patterns to look for in the JSON body. You must specify exactly one setting: either `all` or `includedPaths`. See [JsonMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_JsonMatchPattern.html) for details.
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleActionCountArgs.Builder)
    /**
     * @param customRequestHandling Defines custom handling for the web request. See `customRequestHandling` below for details.
     * @return builder
     */
    def customRequestHandling(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleActionCountCustomRequestHandlingArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleActionCountArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleActionCountCustomRequestHandlingArgs.builder
      builder.customRequestHandling(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementArgs.Builder)
    /**
     * @param statements The statements to combine.
     * @return builder
     */
    def statements(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementOrStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementArgs.builder
      builder.statements(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementArgs.Builder)
    /**
     * @param statements The statements to combine.
     * @return builder
     */
    def statements(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementArgs.builder
      builder.statements(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchCookiesMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchCookiesMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementByteMatchStatementFieldToMatchCookiesMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder)
    /**
     * @param allQueryArguments Inspect all query arguments.
     * @return builder
     */
    def allQueryArguments(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs.builder
      builder.allQueryArguments(args(argsBuilder).build)

    /**
     * @param body Inspect the request body, which immediately follows the request headers.
     * @return builder
     */
    def body(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchBodyArgs.builder
      builder.body(args(argsBuilder).build)

    /**
     * @param cookies Inspect the cookies in the web request. See Cookies below for details.
     * @return builder
     */
    def cookies(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchCookiesArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchCookiesArgs.builder
      builder.cookies(args(argsBuilder).build)

    /**
     * @param headerOrders Inspect the request headers. See Header Order below for details.
     * @return builder
     */
    def headerOrders(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchHeaderOrderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchHeaderOrderArgs.builder
      builder.headerOrders(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Inspect the request headers. See Headers below for details.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param ja3Fingerprint Inspect the JA3 fingerprint. See `ja3Fingerprint` below for details.
     * @return builder
     */
    def ja3Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchJa3FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchJa3FingerprintArgs.builder
      builder.ja3Fingerprint(args(argsBuilder).build)

    /**
     * @param ja4Fingerprint Inspect the JA4 fingerprint. See `ja4Fingerprint` below for details.
     * @return builder
     */
    def ja4Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchJa4FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchJa4FingerprintArgs.builder
      builder.ja4Fingerprint(args(argsBuilder).build)

    /**
     * @param jsonBody Inspect the request body as JSON. See JSON Body for details.
     * @return builder
     */
    def jsonBody(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchJsonBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchJsonBodyArgs.builder
      builder.jsonBody(args(argsBuilder).build)

    /**
     * @param method Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * @return builder
     */
    def method(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchMethodArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchMethodArgs.builder
      builder.method(args(argsBuilder).build)

    /**
     * @param queryString Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * @return builder
     */
    def queryString(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchQueryStringArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchQueryStringArgs.builder
      builder.queryString(args(argsBuilder).build)

    /**
     * @param singleHeader Inspect a single header. See Single Header below for details.
     * @return builder
     */
    def singleHeader(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchSingleHeaderArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchSingleHeaderArgs.builder
      builder.singleHeader(args(argsBuilder).build)

    /**
     * @param singleQueryArgument Inspect a single query argument. See Single Query Argument below for details.
     * @return builder
     */
    def singleQueryArgument(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs.builder
      builder.singleQueryArgument(args(argsBuilder).build)

    /**
     * @param uriFragment Inspect the part of a URL that follows the &#34;#&#34; symbol, providing additional information about the resource. See URI Fragment below for details.
     * @return builder
     */
    def uriFragment(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchUriFragmentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchUriFragmentArgs.builder
      builder.uriFragment(args(argsBuilder).build)

    /**
     * @param uriPath Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * @return builder
     */
    def uriPath(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchUriPathArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchUriPathArgs.builder
      builder.uriPath(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementRegexMatchStatementFieldToMatchCookiesMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchCookiesArgs.Builder)
    /**
     * @param matchPatterns The filter to use to identify the subset of cookies to inspect in a web request. You must specify exactly one setting: either `all`, `includedCookies` or `excludedCookies`. More details: [CookieMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_CookieMatchPattern.html)
     * @return builder
     */
    def matchPatterns(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchCookiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRegexMatchStatementFieldToMatchCookiesMatchPatternArgs.builder
      builder.matchPatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementArgs.Builder)
    /**
     * @param statements The statements to combine.
     * @return builder
     */
    def statements(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementArgs.builder
      builder.statements(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchCookiesArgs.Builder)
    /**
     * @param matchPatterns The filter to use to identify the subset of cookies to inspect in a web request. You must specify exactly one setting: either `all`, `includedCookies` or `excludedCookies`. More details: [CookieMatchPattern](https://docs.aws.amazon.com/waf/latest/APIReference/API_CookieMatchPattern.html)
     * @return builder
     */
    def matchPatterns(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchCookiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternArgs.builder
      builder.matchPatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchHeaderArgs.Builder)
    /**
     * @param matchPattern The filter to use to identify the subset of headers to inspect in a web request. The `matchPattern` block supports only one of the following arguments:
     * @return builder
     */
    def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchHeaderArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementXssMatchStatementFieldToMatchHeaderMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder)
    /**
     * @param all An empty configuration block that is used for inspecting all headers.
     * @return builder
     */
    def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)
