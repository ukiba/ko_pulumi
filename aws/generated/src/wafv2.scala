package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object wafv2:
  /** Provides an AWS WAFv2 API Key resource. */
  def ApiKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.wafv2.ApiKeyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.wafv2.ApiKeyArgs.builder
    com.pulumi.aws.wafv2.ApiKey(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a WAFv2 IP Set Resource */
  def IpSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.wafv2.IpSetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.wafv2.IpSetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.wafv2.IpSet(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an AWS WAFv2 Regex Pattern Set Resource */
  def RegexPatternSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.wafv2.RegexPatternSetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.wafv2.RegexPatternSetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.wafv2.RegexPatternSet(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Creates a WAFv2 Rule Group resource. */
  def RuleGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.wafv2.RuleGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.wafv2.RuleGroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.wafv2.RuleGroup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object Wafv2Functions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Retrieves the summary of a WAFv2 IP Set. */
    inline def getIpSet(args: Endofunction[com.pulumi.aws.wafv2.inputs.GetIpSetArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.wafv2.outputs.GetIpSetResult] =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.GetIpSetArgs.builder
      com.pulumi.aws.wafv2.Wafv2Functions.getIpSet(args(argsBuilder).build)

    /** Retrieves the summary of a WAFv2 IP Set. */
    inline def getIpSetPlain(args: Endofunction[com.pulumi.aws.wafv2.inputs.GetIpSetPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.wafv2.outputs.GetIpSetResult] =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.GetIpSetPlainArgs.builder
      com.pulumi.aws.wafv2.Wafv2Functions.getIpSetPlain(args(argsBuilder).build)

    /** High-level information for a managed rule group. */
    inline def getManagedRuleGroup(args: Endofunction[com.pulumi.aws.wafv2.inputs.GetManagedRuleGroupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.wafv2.outputs.GetManagedRuleGroupResult] =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.GetManagedRuleGroupArgs.builder
      com.pulumi.aws.wafv2.Wafv2Functions.getManagedRuleGroup(args(argsBuilder).build)

    /** High-level information for a managed rule group. */
    inline def getManagedRuleGroupPlain(args: Endofunction[com.pulumi.aws.wafv2.inputs.GetManagedRuleGroupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.wafv2.outputs.GetManagedRuleGroupResult] =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.GetManagedRuleGroupPlainArgs.builder
      com.pulumi.aws.wafv2.Wafv2Functions.getManagedRuleGroupPlain(args(argsBuilder).build)

    /** Retrieves the summary of a WAFv2 Regex Pattern Set. */
    inline def getRegexPatternSet(args: Endofunction[com.pulumi.aws.wafv2.inputs.GetRegexPatternSetArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.wafv2.outputs.GetRegexPatternSetResult] =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.GetRegexPatternSetArgs.builder
      com.pulumi.aws.wafv2.Wafv2Functions.getRegexPatternSet(args(argsBuilder).build)

    /** Retrieves the summary of a WAFv2 Regex Pattern Set. */
    inline def getRegexPatternSetPlain(args: Endofunction[com.pulumi.aws.wafv2.inputs.GetRegexPatternSetPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.wafv2.outputs.GetRegexPatternSetResult] =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.GetRegexPatternSetPlainArgs.builder
      com.pulumi.aws.wafv2.Wafv2Functions.getRegexPatternSetPlain(args(argsBuilder).build)

    /** Retrieves the summary of a WAFv2 Rule Group. */
    inline def getRuleGroup(args: Endofunction[com.pulumi.aws.wafv2.inputs.GetRuleGroupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.wafv2.outputs.GetRuleGroupResult] =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.GetRuleGroupArgs.builder
      com.pulumi.aws.wafv2.Wafv2Functions.getRuleGroup(args(argsBuilder).build)

    /** Retrieves the summary of a WAFv2 Rule Group. */
    inline def getRuleGroupPlain(args: Endofunction[com.pulumi.aws.wafv2.inputs.GetRuleGroupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.wafv2.outputs.GetRuleGroupResult] =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.GetRuleGroupPlainArgs.builder
      com.pulumi.aws.wafv2.Wafv2Functions.getRuleGroupPlain(args(argsBuilder).build)

    /** Retrieves the summary of a WAFv2 Web ACL. */
    inline def getWebAcl(args: Endofunction[com.pulumi.aws.wafv2.inputs.GetWebAclArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.wafv2.outputs.GetWebAclResult] =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.GetWebAclArgs.builder
      com.pulumi.aws.wafv2.Wafv2Functions.getWebAcl(args(argsBuilder).build)

    /** Retrieves the summary of a WAFv2 Web ACL. */
    inline def getWebAclPlain(args: Endofunction[com.pulumi.aws.wafv2.inputs.GetWebAclPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.wafv2.outputs.GetWebAclResult] =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.GetWebAclPlainArgs.builder
      com.pulumi.aws.wafv2.Wafv2Functions.getWebAclPlain(args(argsBuilder).build)

  /**
   * Creates a WAFv2 Web ACL resource.
   * 
   * &gt; **Note:** Inline `rule` blocks in this resource have several known limitations. Consider using `aws.wafv2.WebAclRule` to manage rules as separate resources instead. Limitations include: **Deletion ordering errors:** When removing a rule that references an IP set or rule group, AWS requires the rule to be detached before the referenced resource is deleted. Terraform&#39;s dependency graph cannot model this correctly for inline rules, resulting in `WAFAssociatedItemException` errors. **Spurious diffs:** AWS returns rules in an unpredictable order, which can cause Terraform to detect changes even when the configuration has not changed. **Coupled updates:** Modifying one inline rule may cause all rules to be recreated, which can be disruptive.
   * 
   * &gt; **Warning:** If you use the `aws.wafv2.WebAclRule` or `aws.wafv2.WebAclRuleGroupAssociation` resources with this Web ACL, you must add `lifecycle { ignoreChanges = [rule] }` to this resource to prevent configuration drift. Those resources manage the Web ACL&#39;s rules outside of this resource&#39;s direct management.
   * 
   * ## Import
   * 
   * Using `pulumi import`, import WAFv2 Web ACLs using `ID/Name/Scope`. For example:
   * 
   * ```sh
   * \$ pulumi import aws:wafv2/webAcl:WebAcl example a1b2c3d4-d5f6-7777-8888-9999aaaabbbbcccc/example/REGIONAL
   * ```
   */
  def WebAcl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.wafv2.WebAclArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.wafv2.WebAclArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.wafv2.WebAcl(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Creates a WAFv2 Web ACL Association.
   * 
   * &gt; **NOTE on associating a WAFv2 Web ACL with a CloudFront distribution:** Do not use this resource to associate a WAFv2 Web ACL with a CloudFront Distribution. The [AWS API call backing this resource](https://docs.aws.amazon.com/waf/latest/APIReference/API_AssociateWebACL.html) notes that you should use the `webAclId` property on the `cloudfrontDistribution` instead.
   * 
   * ## Import
   * 
   * Using `pulumi import`, import WAFv2 Web ACL Association using `WEB_ACL_ARN,RESOURCE_ARN`. For example:
   * 
   * ```sh
   * \$ pulumi import aws:wafv2/webAclAssociation:WebAclAssociation example arn:aws:wafv2:...7ce849ea,arn:aws:apigateway:...ages/name
   * ```
   */
  def WebAclAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.wafv2.WebAclAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.wafv2.WebAclAssociationArgs.builder
    com.pulumi.aws.wafv2.WebAclAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * This resource creates a WAFv2 Web ACL Logging Configuration.
   * 
   * &gt; **WARNING:** When logging from a WAFv2 Web ACL to a CloudWatch Log Group, the WAFv2 service tries to create or update a generic Log Resource Policy named `AWSWAF-LOGS`. However, if there are a large number of Web ACLs or if the account frequently creates and deletes Web ACLs, this policy may exceed the maximum policy size. As a result, this resource type will fail to be created. More details about this issue can be found in this issue. To prevent this issue, you can manage a specific resource policy. Please refer to the example below for managing a CloudWatch Log Group with a managed CloudWatch Log Resource Policy.
   */
  def WebAclLoggingConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.wafv2.WebAclLoggingConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.wafv2.WebAclLoggingConfigurationArgs.builder
    com.pulumi.aws.wafv2.WebAclLoggingConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an individual rule within a WAFv2 Web ACL. This resource creates proper Terraform dependencies for safe deletion of referenced resources like IP sets, solving the `WAFAssociatedItemException` error that occurs when deleting IP sets that are still referenced by Web ACL rules.
   * 
   * &gt; **NOTE:** When using this resource, you must add `lifecycle { ignoreChanges = [rule] }` to your `aws.wafv2.WebAcl` resource to prevent conflicts. See the `aws.wafv2.WebAcl` documentation for a full description of the limitations of inline rules that this resource addresses.
   */
  def WebAclRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.wafv2.WebAclRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.wafv2.WebAclRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.wafv2.WebAclRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Associates a WAFv2 Rule Group (custom or managed) with a Web ACL by adding a rule that references the Rule Group. Use this resource to apply the rules defined in a Rule Group to a Web ACL without duplicating rule definitions.
   * 
   * This resource supports both:
   * 
   * - **Custom Rule Groups**: User-created rule groups that you manage within your AWS account
   * - **Managed Rule Groups**: Pre-configured rule groups provided by AWS or third-party vendors
   * 
   * &gt; **Warning:** Verify the rule names in your `ruleActionOverride`s carefully. With managed rule groups, WAF silently ignores any override that uses an invalid rule name. With customer-owned rule groups, invalid rule names in your overrides will cause web ACL updates to fail. An invalid rule name is any name that doesn&#39;t exactly match the case-sensitive name of an existing rule in the rule group.
   * 
   * &gt; **Warning:** Using this resource will cause the associated Web ACL resource to show configuration drift in the `rule` argument unless you add `lifecycle { ignoreChanges = [rule] }` to the Web ACL resource configuration. This is because this resource modifies the Web ACL&#39;s rules outside of the Web ACL resource&#39;s direct management.
   * 
   * &gt; **Note:** This resource creates a rule within the Web ACL that references the entire Rule Group. The rule group&#39;s individual rules are evaluated as a unit when requests are processed by the Web ACL.
   */
  def WebAclRuleGroupAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.wafv2.WebAclRuleGroupAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.wafv2.WebAclRuleGroupAssociationArgs.builder
    com.pulumi.aws.wafv2.WebAclRuleGroupAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
