package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object waf:
  /** Provides a WAF Byte Match Set Resource */
  def ByteMatchSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.waf.ByteMatchSetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.waf.ByteMatchSetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.waf.ByteMatchSet(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a WAF Geo Match Set Resource */
  def GeoMatchSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.waf.GeoMatchSetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.waf.GeoMatchSetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.waf.GeoMatchSet(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a WAF IPSet Resource */
  def IpSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.waf.IpSetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.waf.IpSetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.waf.IpSet(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a WAF Rate Based Rule Resource */
  def RateBasedRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.waf.RateBasedRuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.waf.RateBasedRuleArgs.builder
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
    com.pulumi.aws.waf.RateBasedRule(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a WAF Regex Match Set Resource */
  def RegexMatchSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.waf.RegexMatchSetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.waf.RegexMatchSetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.waf.RegexMatchSet(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a WAF Regex Pattern Set Resource */
  def RegexPatternSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.waf.RegexPatternSetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.waf.RegexPatternSetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.waf.RegexPatternSet(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a WAF Rule Resource */
  def Rule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.waf.RuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.waf.RuleArgs.builder
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
    com.pulumi.aws.waf.Rule(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a WAF Rule Group Resource */
  def RuleGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.waf.RuleGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.waf.RuleGroupArgs.builder
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
    com.pulumi.aws.waf.RuleGroup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Use the `aws.waf.SizeConstraintSet` resource to manage WAF size constraint sets. */
  def SizeConstraintSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.waf.SizeConstraintSetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.waf.SizeConstraintSetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.waf.SizeConstraintSet(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a WAF SQL Injection Match Set Resource */
  def SqlInjectionMatchSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.waf.SqlInjectionMatchSetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.waf.SqlInjectionMatchSetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.waf.SqlInjectionMatchSet(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object WafFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** `aws.waf.IpSet` Retrieves a WAF IP Set Resource ID. */
    inline def getIpset(args: Endofunction[com.pulumi.aws.waf.inputs.GetIpsetArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.waf.outputs.GetIpsetResult] =
      val argsBuilder = com.pulumi.aws.waf.inputs.GetIpsetArgs.builder
      com.pulumi.aws.waf.WafFunctions.getIpset(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** `aws.waf.IpSet` Retrieves a WAF IP Set Resource ID. */
    inline def getIpsetPlain(args: Endofunction[com.pulumi.aws.waf.inputs.GetIpsetPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.waf.outputs.GetIpsetResult] =
      val argsBuilder = com.pulumi.aws.waf.inputs.GetIpsetPlainArgs.builder
      com.pulumi.aws.waf.WafFunctions.getIpsetPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** `aws.waf.RateBasedRule` Retrieves a WAF Rate Based Rule Resource ID. */
    inline def getRateBasedRule(args: Endofunction[com.pulumi.aws.waf.inputs.GetRateBasedRuleArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.waf.outputs.GetRateBasedRuleResult] =
      val argsBuilder = com.pulumi.aws.waf.inputs.GetRateBasedRuleArgs.builder
      com.pulumi.aws.waf.WafFunctions.getRateBasedRule(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** `aws.waf.RateBasedRule` Retrieves a WAF Rate Based Rule Resource ID. */
    inline def getRateBasedRulePlain(args: Endofunction[com.pulumi.aws.waf.inputs.GetRateBasedRulePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.waf.outputs.GetRateBasedRuleResult] =
      val argsBuilder = com.pulumi.aws.waf.inputs.GetRateBasedRulePlainArgs.builder
      com.pulumi.aws.waf.WafFunctions.getRateBasedRulePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** `aws.waf.Rule` Retrieves a WAF Rule Resource ID. */
    inline def getRule(args: Endofunction[com.pulumi.aws.waf.inputs.GetRuleArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.waf.outputs.GetRuleResult] =
      val argsBuilder = com.pulumi.aws.waf.inputs.GetRuleArgs.builder
      com.pulumi.aws.waf.WafFunctions.getRule(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** `aws.waf.Rule` Retrieves a WAF Rule Resource ID. */
    inline def getRulePlain(args: Endofunction[com.pulumi.aws.waf.inputs.GetRulePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.waf.outputs.GetRuleResult] =
      val argsBuilder = com.pulumi.aws.waf.inputs.GetRulePlainArgs.builder
      com.pulumi.aws.waf.WafFunctions.getRulePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** `aws.waf.getSubscribedRuleGroup` retrieves information about a Managed WAF Rule Group from AWS Marketplace (needs to be subscribed to first). */
    inline def getSubscribedRuleGroup(args: Endofunction[com.pulumi.aws.waf.inputs.GetSubscribedRuleGroupArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.waf.outputs.GetSubscribedRuleGroupResult] =
      val argsBuilder = com.pulumi.aws.waf.inputs.GetSubscribedRuleGroupArgs.builder
      com.pulumi.aws.waf.WafFunctions.getSubscribedRuleGroup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** `aws.waf.getSubscribedRuleGroup` retrieves information about a Managed WAF Rule Group from AWS Marketplace (needs to be subscribed to first). */
    inline def getSubscribedRuleGroupPlain(args: Endofunction[com.pulumi.aws.waf.inputs.GetSubscribedRuleGroupPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.waf.outputs.GetSubscribedRuleGroupResult] =
      val argsBuilder = com.pulumi.aws.waf.inputs.GetSubscribedRuleGroupPlainArgs.builder
      com.pulumi.aws.waf.WafFunctions.getSubscribedRuleGroupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** `aws.waf.WebAcl` Retrieves a WAF Web ACL Resource ID. */
    inline def getWebAcl(args: Endofunction[com.pulumi.aws.waf.inputs.GetWebAclArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.waf.outputs.GetWebAclResult] =
      val argsBuilder = com.pulumi.aws.waf.inputs.GetWebAclArgs.builder
      com.pulumi.aws.waf.WafFunctions.getWebAcl(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** `aws.waf.WebAcl` Retrieves a WAF Web ACL Resource ID. */
    inline def getWebAclPlain(args: Endofunction[com.pulumi.aws.waf.inputs.GetWebAclPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.waf.outputs.GetWebAclResult] =
      val argsBuilder = com.pulumi.aws.waf.inputs.GetWebAclPlainArgs.builder
      com.pulumi.aws.waf.WafFunctions.getWebAclPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Provides a WAF Web ACL Resource */
  def WebAcl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.waf.WebAclArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.waf.WebAclArgs.builder
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
    com.pulumi.aws.waf.WebAcl(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a WAF XSS Match Set Resource */
  def XssMatchSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.waf.XssMatchSetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.waf.XssMatchSetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.waf.XssMatchSet(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
