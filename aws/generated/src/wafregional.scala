package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object wafregional:
  /** Provides a WAF Regional Byte Match Set Resource for use with Application Load Balancer. */
  def ByteMatchSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.wafregional.ByteMatchSetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.wafregional.ByteMatchSetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.wafregional.ByteMatchSet(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a WAF Regional Geo Match Set Resource */
  def GeoMatchSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.wafregional.GeoMatchSetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.wafregional.GeoMatchSetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.wafregional.GeoMatchSet(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a WAF Regional IPSet Resource for use with Application Load Balancer. */
  def IpSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.wafregional.IpSetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.wafregional.IpSetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.wafregional.IpSet(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a WAF Rate Based Rule Resource */
  def RateBasedRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.wafregional.RateBasedRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.wafregional.RateBasedRuleArgs.builder
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
    com.pulumi.aws.wafregional.RateBasedRule(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a WAF Regional Regex Match Set Resource */
  def RegexMatchSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.wafregional.RegexMatchSetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.wafregional.RegexMatchSetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.wafregional.RegexMatchSet(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a WAF Regional Regex Pattern Set Resource */
  def RegexPatternSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.wafregional.RegexPatternSetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.wafregional.RegexPatternSetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.wafregional.RegexPatternSet(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an WAF Regional Rule Resource for use with Application Load Balancer. */
  def Rule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.wafregional.RuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.wafregional.RuleArgs.builder
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
    com.pulumi.aws.wafregional.Rule(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a WAF Regional Rule Group Resource */
  def RuleGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.wafregional.RuleGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.wafregional.RuleGroupArgs.builder
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
    com.pulumi.aws.wafregional.RuleGroup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a WAF Regional Size Constraint Set Resource for use with Application Load Balancer. */
  def SizeConstraintSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.wafregional.SizeConstraintSetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.wafregional.SizeConstraintSetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.wafregional.SizeConstraintSet(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a WAF Regional SQL Injection Match Set Resource for use with Application Load Balancer. */
  def SqlInjectionMatchSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.wafregional.SqlInjectionMatchSetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.wafregional.SqlInjectionMatchSetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.wafregional.SqlInjectionMatchSet(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object WafregionalFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** `aws.wafregional.IpSet` Retrieves a WAF Regional IP Set Resource ID. */
    inline def getIpset(args: Endofunction[com.pulumi.aws.wafregional.inputs.GetIpsetArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.wafregional.outputs.GetIpsetResult] =
      val argsBuilder = com.pulumi.aws.wafregional.inputs.GetIpsetArgs.builder
      com.pulumi.aws.wafregional.WafregionalFunctions.getIpset(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** `aws.wafregional.IpSet` Retrieves a WAF Regional IP Set Resource ID. */
    inline def getIpsetPlain(args: Endofunction[com.pulumi.aws.wafregional.inputs.GetIpsetPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.wafregional.outputs.GetIpsetResult] =
      val argsBuilder = com.pulumi.aws.wafregional.inputs.GetIpsetPlainArgs.builder
      com.pulumi.aws.wafregional.WafregionalFunctions.getIpsetPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** `aws.wafregional.RateBasedRule` Retrieves a WAF Regional Rate Based Rule Resource ID. */
    inline def getRateBasedMod(args: Endofunction[com.pulumi.aws.wafregional.inputs.GetRateBasedModArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.wafregional.outputs.GetRateBasedModResult] =
      val argsBuilder = com.pulumi.aws.wafregional.inputs.GetRateBasedModArgs.builder
      com.pulumi.aws.wafregional.WafregionalFunctions.getRateBasedMod(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** `aws.wafregional.RateBasedRule` Retrieves a WAF Regional Rate Based Rule Resource ID. */
    inline def getRateBasedModPlain(args: Endofunction[com.pulumi.aws.wafregional.inputs.GetRateBasedModPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.wafregional.outputs.GetRateBasedModResult] =
      val argsBuilder = com.pulumi.aws.wafregional.inputs.GetRateBasedModPlainArgs.builder
      com.pulumi.aws.wafregional.WafregionalFunctions.getRateBasedModPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** `aws.wafregional.Rule` Retrieves a WAF Regional Rule Resource ID. */
    inline def getRule(args: Endofunction[com.pulumi.aws.wafregional.inputs.GetRuleArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.wafregional.outputs.GetRuleResult] =
      val argsBuilder = com.pulumi.aws.wafregional.inputs.GetRuleArgs.builder
      com.pulumi.aws.wafregional.WafregionalFunctions.getRule(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** `aws.wafregional.Rule` Retrieves a WAF Regional Rule Resource ID. */
    inline def getRulePlain(args: Endofunction[com.pulumi.aws.wafregional.inputs.GetRulePlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.wafregional.outputs.GetRuleResult] =
      val argsBuilder = com.pulumi.aws.wafregional.inputs.GetRulePlainArgs.builder
      com.pulumi.aws.wafregional.WafregionalFunctions.getRulePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** `aws.wafregional.getSubscribedRuleGroup` retrieves information about a Managed WAF Rule Group from AWS Marketplace for use in WAF Regional (needs to be subscribed to first). */
    inline def getSubscribedRuleGroup(args: Endofunction[com.pulumi.aws.wafregional.inputs.GetSubscribedRuleGroupArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.wafregional.outputs.GetSubscribedRuleGroupResult] =
      val argsBuilder = com.pulumi.aws.wafregional.inputs.GetSubscribedRuleGroupArgs.builder
      com.pulumi.aws.wafregional.WafregionalFunctions.getSubscribedRuleGroup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** `aws.wafregional.getSubscribedRuleGroup` retrieves information about a Managed WAF Rule Group from AWS Marketplace for use in WAF Regional (needs to be subscribed to first). */
    inline def getSubscribedRuleGroupPlain(args: Endofunction[com.pulumi.aws.wafregional.inputs.GetSubscribedRuleGroupPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.wafregional.outputs.GetSubscribedRuleGroupResult] =
      val argsBuilder = com.pulumi.aws.wafregional.inputs.GetSubscribedRuleGroupPlainArgs.builder
      com.pulumi.aws.wafregional.WafregionalFunctions.getSubscribedRuleGroupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** `aws.wafregional.WebAcl` Retrieves a WAF Regional Web ACL Resource ID. */
    inline def getWebAcl(args: Endofunction[com.pulumi.aws.wafregional.inputs.GetWebAclArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.wafregional.outputs.GetWebAclResult] =
      val argsBuilder = com.pulumi.aws.wafregional.inputs.GetWebAclArgs.builder
      com.pulumi.aws.wafregional.WafregionalFunctions.getWebAcl(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** `aws.wafregional.WebAcl` Retrieves a WAF Regional Web ACL Resource ID. */
    inline def getWebAclPlain(args: Endofunction[com.pulumi.aws.wafregional.inputs.GetWebAclPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.wafregional.outputs.GetWebAclResult] =
      val argsBuilder = com.pulumi.aws.wafregional.inputs.GetWebAclPlainArgs.builder
      com.pulumi.aws.wafregional.WafregionalFunctions.getWebAclPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Provides a WAF Regional Web ACL Resource for use with Application Load Balancer. */
  def WebAcl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.wafregional.WebAclArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.wafregional.WebAclArgs.builder
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
    com.pulumi.aws.wafregional.WebAcl(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an association with WAF Regional Web ACL.
   * 
   * &gt; **Note:** An Application Load Balancer can only be associated with one WAF Regional WebACL.
   */
  def WebAclAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.wafregional.WebAclAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.wafregional.WebAclAssociationArgs.builder
    com.pulumi.aws.wafregional.WebAclAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a WAF Regional XSS Match Set Resource for use with Application Load Balancer. */
  def XssMatchSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.wafregional.XssMatchSetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.wafregional.XssMatchSetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.wafregional.XssMatchSet(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
